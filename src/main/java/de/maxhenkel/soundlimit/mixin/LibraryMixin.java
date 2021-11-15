package de.maxhenkel.soundlimit.mixin;

import com.mojang.blaze3d.audio.Library;
import de.maxhenkel.soundlimit.SoundLimit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(Library.class)
public class LibraryMixin {

    @ModifyVariable(method = "init", at = @At("STORE"), ordinal = 1)
    private int streamChannels(int x) {
        return SoundLimit.CLIENT_CONFIG.streamingSoundLimit.get();
    }

    @ModifyVariable(method = "init", at = @At("STORE"), ordinal = 2)
    private int staticChannels(int x) {
        return SoundLimit.CLIENT_CONFIG.staticSoundLimit.get();
    }

}
