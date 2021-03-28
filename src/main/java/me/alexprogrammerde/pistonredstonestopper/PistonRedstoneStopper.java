package me.alexprogrammerde.pistonredstonestopper;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PistonRedstoneStopper extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

        getLogger().info("PistonRedstoneStopper enabled! :D");
        getLogger().info("Lagers ez mad! :D");
    }

    @Override
    public void onDisable() {
        getLogger().info("PistonRedstoneStopper disabled! :D");
        getLogger().info("Lagers ez mad! :D");
    }

    @EventHandler
    public void onRedstone(BlockRedstoneEvent event) {
        event.setNewCurrent(event.getOldCurrent());
    }

    @EventHandler
    public void onPiston2(BlockPistonExtendEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onPiston3(BlockPistonRetractEvent event) {
        event.setCancelled(true);
    }
}
