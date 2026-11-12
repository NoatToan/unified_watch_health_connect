package com.xiaomi.smarthome.library.bluetooth.channel.packet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class SingleACKPacket extends Packet {
    private static final int BUFFER_SIZE = 4;
    public static final int RESP_DEVICE_BUSY = 2;
    public static final int RESP_SUCCESS = 0;
    private final byte[] BUFFER = new byte[4];
    private int mStatus;

    public SingleACKPacket(int i) {
        this.mStatus = i;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public String getName() {
        return Packet.SINGLE_ACK;
    }

    public int getStatus() {
        return this.mStatus;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public byte[] toBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(this.BUFFER).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 3);
        byteBufferOrder.put((byte) this.mStatus);
        return byteBufferOrder.array();
    }
}
