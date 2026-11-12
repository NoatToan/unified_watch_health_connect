package com.xiaomi.smarthome.library.bluetooth.channel.packet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class MNGAckPacket extends MNGPacket {
    public MNGAckPacket(int i, byte[] bArr) {
        super(i, bArr);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.MNGPacket, com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public String getName() {
        return Packet.MNG_ACK;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.MNGPacket, com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public byte[] toBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(this.mValues.length + 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 5);
        byteBufferOrder.put((byte) this.mCmdType);
        byteBufferOrder.put(this.mValues);
        return byteBufferOrder.array();
    }
}
