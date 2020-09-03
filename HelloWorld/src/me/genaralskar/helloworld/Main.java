package me.genaralskar.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

import me.genaralskar.helloworld.commands.HelloCommand;

public class Main extends JavaPlugin{

	@Override
	public void onEnable()
	{
		new HelloCommand(this);
	}
}
