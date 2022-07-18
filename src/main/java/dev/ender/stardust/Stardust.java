package dev.ender.stardust;

import dev.ender.stardust.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;

public class Stardust implements ModInitializer {

    public static String MOD_ID = "stardust";

    @Override
    public void onInitialize() {
        BlockRegistry.register();
    }
}
