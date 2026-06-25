package me.xxastaspastaxx.dimensions.addons.portalsounds;

import me.xxastaspastaxx.dimensions.addons.DimensionsAddon;
import me.xxastaspastaxx.dimensions.addons.DimensionsAddonPriority;
import me.xxastaspastaxx.dimensions.customportal.CustomPortal;
import org.bukkit.configuration.file.YamlConfiguration;

public class DimensionsPortalSounds extends DimensionsAddon {

  public DimensionsPortalSounds() {
    super(
        "DimensionsPortalSoundsAddon",
        "4.0.0",
        "Customize portal sounds",
        DimensionsAddonPriority.NORMAL);
  }

  @Override
  public void registerPortal(YamlConfiguration portalConfig, CustomPortal portal) {
    String ignite = portalConfig.getString("Addon.PortalSounds.Ignite");
    if (ignite != null) {
      setOption(portal, "igniteSound", ignite);
    }

    String travel = portalConfig.getString("Addon.PortalSounds.Travel");
    if (travel != null) {
      setOption(portal, "travelSound", travel);
    }

    String ambient = portalConfig.getString("Addon.PortalSounds.Ambient");
    if (ambient != null) {
      setOption(portal, "ambientSound", ambient);
    }

    String breakSound = portalConfig.getString("Addon.PortalSounds.Break");
    if (breakSound != null) {
      setOption(portal, "breakSound", breakSound);
    }
  }
}
