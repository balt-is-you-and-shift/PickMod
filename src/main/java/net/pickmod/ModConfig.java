package net.pickmod;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Config(name = "pickmod")
public class ModConfig implements ConfigData {
    public boolean showLock = true;
    public boolean disableUnackedError = true;
}