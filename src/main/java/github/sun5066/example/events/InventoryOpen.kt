package github.sun5066.example.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryOpenEvent

class InventoryOpen: Listener {

    @EventHandler
    fun inventoryOpenEvent(event: InventoryOpenEvent?) {
        val player = event?.player
        player?.sendMessage("inventory Open!")
    }
}