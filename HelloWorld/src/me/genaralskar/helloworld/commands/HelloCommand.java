package me.genaralskar.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.genaralskar.helloworld.Main;

public class HelloCommand implements CommandExecutor {
	
	private Main plugin;
	
	public HelloCommand(Main plugin)
	{
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player))
		{
			sender.sendMessage("Can't do that spud");
			return true;
		}
		
		Player p = (Player)sender;
		
		if(p.hasPermission("hellow.use"))
		{
			return true;
		}
		
		p.sendMessage("Hey, I don't mean to be rude but I'm kinda busy here and I can't just answer to every Tom, Dick, and Harry alright?");
		
		return false;
	}
	
	
}
