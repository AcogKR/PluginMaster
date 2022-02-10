package cloud.acog.pluginhelper;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginMaster extends JavaPlugin {
    @Override
    public void onDisable() {
        getLogger().info("플러그인이 비활성화 되었습니다.");
    }

    @Override
    public void onEnable() {
        getLogger().info("플러그인이 활성화 되었습니다.");
    }
}
