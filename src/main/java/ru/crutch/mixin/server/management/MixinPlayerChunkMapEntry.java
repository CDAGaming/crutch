package ru.crutch.mixin.server.management;

import net.minecraft.world.chunk.Chunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import ru.crutch.interfaces.server.management.IMixinPlayerChunkMapEntry;

@Mixin(net.minecraft.server.management.PlayerChunkMapEntry.class)
public class MixinPlayerChunkMapEntry implements IMixinPlayerChunkMapEntry {

    @Shadow
    Chunk chunk;

    @Override
    public void setChunk(Chunk chunk) {
        this.chunk = chunk;
    }
}
