package me.bebeli555.cookieclient.events.other;

import me.zero.alpine.type.Cancellable;
import net.minecraft.network.Packet;

@SuppressWarnings("rawtypes") 
public class PacketEvent extends Cancellable {
	public Packet packet;
	
	public PacketEvent(Packet packet) {
		this.packet = packet;
	}
}