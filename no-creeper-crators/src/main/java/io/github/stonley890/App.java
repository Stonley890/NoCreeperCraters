package io.github.stonley890;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        getLogger()
                .info("Designed for u/Lupich by u/Stonley890");
        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onCreeperExplosion (EntityExplodeEvent event) {
        event.blockList().clear();
    }

}
