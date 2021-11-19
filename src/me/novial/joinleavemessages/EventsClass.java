package me.novial.joinleavemessages;

import org.bukkit.entity.Player;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import me.novial.joinleavemessages.*;

public class EventsClass implements Listener {
	public FileConfiguration config = main.plugin.getConfig();
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player p = event.getPlayer();
		event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', config.getString("joinMsg").replace("%PLAYER_NAME%", p.getDisplayName())));
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		Player p = event.getPlayer();
		event.setQuitMessage(ChatColor.translateAlternateColorCodes('&', config.getString("leaveMsg").replace("%PLAYER_NAME%", p.getDisplayName())));
	}
}
