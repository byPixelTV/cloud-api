package app.simplecloud.api.provider.paper

import org.bukkit.plugin.java.JavaPlugin

class PaperApiProvider : JavaPlugin() {
    override fun onEnable() {
        logger.info("SimpleCloud v3 API provider initialized!")
    }

    override fun onDisable() {
        logger.info("SimpleCloud v3 API provider uninitialized!")
    }

}