package de.maxhenkel.soundlimit;

import de.maxhenkel.configbuilder.ConfigBuilder;
import de.maxhenkel.soundlimit.config.ClientConfig;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Environment(EnvType.CLIENT)
public class SoundLimit implements ClientModInitializer {

    public static final String MODID = "soundlimit";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static ClientConfig CLIENT_CONFIG;

    @Override
    public void onInitializeClient() {
        CLIENT_CONFIG = ConfigBuilder.build(Minecraft.getInstance().gameDirectory.toPath().resolve("config").resolve(MODID).resolve("soundlimit.properties"), ClientConfig::new);
    }
}
