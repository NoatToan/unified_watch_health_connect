package com.xiaomi.smarthome.library.bluetooth.channel.packet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class DataPacket extends Packet {
    private static final int BUFFER_SIZE = 20;
    private final byte[] BUFFER;
    private Packet.Bytes bytes;
    private int seq;

    public DataPacket(int i, Packet.Bytes bytes) {
        this.BUFFER = new byte[20];
        this.seq = i;
        this.bytes = bytes;
    }

    public void fillByteBuffer(ByteBuffer byteBuffer) {
        Packet.Bytes bytes = this.bytes;
        byteBuffer.put(bytes.value, bytes.start, getDataLength());
    }

    public int getDataLength() {
        return this.bytes.getSize();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public String getName() {
        return "data";
    }

    public int getSeq() {
        return this.seq;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public byte[] toBytes() {
        ByteBuffer byteBufferOrder;
        int dataLength = getDataLength() + 2;
        if (dataLength == 20) {
            Arrays.fill(this.BUFFER, (byte) 0);
            byteBufferOrder = ByteBuffer.wrap(this.BUFFER).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            byteBufferOrder = ByteBuffer.allocate(dataLength).order(ByteOrder.LITTLE_ENDIAN);
        }
        byteBufferOrder.putShort((short) this.seq);
        fillByteBuffer(byteBufferOrder);
        return byteBufferOrder.array();
    }

    public String toString() {
        return "DataPacket{seq=" + this.seq + ", size=" + this.bytes.getSize() + AbstractJsonLexerKt.END_OBJ;
    }

    public DataPacket(int i, byte[] bArr, int i2, int i3) {
        this(i, new Packet.Bytes(bArr, i2, i3));
    }
}
