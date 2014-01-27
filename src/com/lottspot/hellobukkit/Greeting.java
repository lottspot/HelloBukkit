/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lottspot.hellobukkit;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author james
 */
public class Greeting extends JavaPlugin
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmd_name, String args[]){
        if (cmd.getName().equalsIgnoreCase("hellobukkit")) {
            if (sender instanceof Player) {
                Player player = (Player)sender;
                String message = String.format("%s greets you all", player.getName());
                Bukkit.broadcastMessage(message);
            } else {
               Bukkit.broadcastMessage("Omnitient being greets you all.");
            }
            return true;
        } else {
            return false;
        }
    }
}
