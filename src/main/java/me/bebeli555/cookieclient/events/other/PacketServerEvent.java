package me.bebeli555.cookieclient.events.other;

import me.zero.alpine.type.Cancellable;
import net.minecraft.network.Packet;

@SuppressWarnings("rawtypes") 
public class PacketServerEvent extends Cancellable {
	public Packet packet;
	
	public PacketServerEvent(Packet packet) {
		this.packet = packet;
	}
}