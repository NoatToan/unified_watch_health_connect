package com.xiaomi.smarthome.library.bluetooth.channel.packet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class MNGPacket extends Packet {
    public static final int TYPE_ASK_SUPPORT = 0;
    public static final int TYPE_SEND_TEST_PACKAGE = 1;
    protected int mCmdType;
    protected byte[] mValues;
    protected int maxDMTU;
    protected int maxPackgeNum;
    protected byte[] testBytes;

    public MNGPacket(int i, byte[] bArr) {
        this.mCmdType = i;
        this.mValues = bArr;
    }

    public int getMaxDMTU() {
        return this.maxDMTU;
    }

    public int getMaxPackgeNum() {
        return this.maxPackgeNum;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public String getName() {
        return Packet.MNG_CMD;
    }

    public int getPackageType() {
        return this.mCmdType;
    }

    public byte[] getTestBytes() {
        return this.testBytes;
    }

    public void parse() {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(this.mValues).order(ByteOrder.LITTLE_ENDIAN);
        if (this.mCmdType != 0) {
            this.testBytes = byteBufferOrder.array();
        } else {
            this.maxPackgeNum = byteBufferOrder.get();
            this.maxDMTU = byteBufferOrder.get() & 255;
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public byte[] toBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(this.mValues.length + 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 4);
        byteBufferOrder.put((byte) this.mCmdType);
        byteBufferOrder.put(this.mValues);
        return byteBufferOrder.array();
    }
}
