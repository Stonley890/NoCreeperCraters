package io.github.stonley890;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Creeper;
import org.jetbrains.annotations.NotNull;

public class App extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onCreeperExplosion (@NotNull EntityExplodeEvent event) {
        if(event.getEntity() instanceof Creeper) event.blockList().clear();
    }

    @EventHandler
    public void onEntityDamage (@NotNull HangingBreakByEntityEvent event) {
        if (event.getRemover() != null && event.getRemover().getType() == EntityType.CREEPER)
            event.setCancelled(true);
    }

}
