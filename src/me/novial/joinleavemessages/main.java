package me.novial.joinleavemessages;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	public FileConfiguration config = this.getConfig();
	public static main plugin;
	@Override
	public void onEnable() {
		plugin = this;
		if(!(Bukkit.getServer().getPluginManager().getPlugin("JoinLeaveMessages").getDataFolder()).exists()) {
			config.addDefault("joinMsg", "&8[&a+&8] &f%PLAYER_NAME%");
			config.addDefault("leaveMsg", "&8[&c-&8] &f%PLAYER_NAME%");
			config.options().copyDefaults(true);
			saveConfig();
		}
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
	}
	@Override
	public void onDisable() {
		
	}
} 
