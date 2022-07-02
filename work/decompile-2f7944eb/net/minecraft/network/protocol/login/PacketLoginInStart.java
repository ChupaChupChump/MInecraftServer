package net.minecraft.network.protocol.login;

import java.util.Optional;
import net.minecraft.network.PacketDataSerializer;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.player.ProfilePublicKey;

public record PacketLoginInStart(String name, Optional<ProfilePublicKey.a> publicKey) implements Packet<PacketLoginInListener> {

    public PacketLoginInStart(PacketDataSerializer packetdataserializer) {
        this(packetdataserializer.readUtf(16), packetdataserializer.readOptional(ProfilePublicKey.a::new));
    }

    @Override
    public void write(PacketDataSerializer packetdataserializer) {
        packetdataserializer.writeUtf(this.name, 16);
        packetdataserializer.writeOptional(this.publicKey, (packetdataserializer1, profilepublickey_a) -> {
            profilepublickey_a.write(packetdataserializer);
        });
    }

    public void handle(PacketLoginInListener packetlogininlistener) {
        packetlogininlistener.handleHello(this);
    }
}
