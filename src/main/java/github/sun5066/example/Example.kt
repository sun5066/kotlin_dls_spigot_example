package github.sun5066.example

import github.sun5066.example.commands.AdminCommands
import github.sun5066.example.events.InventoryOpen
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Example : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(InventoryOpen(), this)
        getCommand("example").setExecutor(AdminCommands())
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}