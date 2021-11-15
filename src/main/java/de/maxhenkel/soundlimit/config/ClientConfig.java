package de.maxhenkel.soundlimit.config;

import de.maxhenkel.configbuilder.ConfigBuilder;
import de.maxhenkel.configbuilder.ConfigEntry;

public class ClientConfig {

    public final ConfigEntry<Integer> staticSoundLimit;
    public final ConfigEntry<Integer> streamingSoundLimit;

    public ClientConfig(ConfigBuilder builder) {
        staticSoundLimit = builder.integerEntry("static_sound_limit", 512, 1, Integer.MAX_VALUE);
        streamingSoundLimit = builder.integerEntry("streaming_sound_limit", 32, 1, Integer.MAX_VALUE);
    }

}
