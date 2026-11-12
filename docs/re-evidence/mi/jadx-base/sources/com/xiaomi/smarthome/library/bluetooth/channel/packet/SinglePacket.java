package com.xiaomi.smarthome.library.bluetooth.channel.packet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class SinglePacket extends Packet {
    public static final int SIG_CMD_APP_CONFIRMMATION = 10;
    public static final int SIG_CMD_APP_RANDOM = 11;
    public static final int SIG_CMD_BIND_KEY = 14;
    public static final int SIG_CMD_COMMON_DATA = 0;
    public static final int SIG_CMD_DEVICE_LOGIN_INFO = 5;
    public static final int SIG_CMD_DEVICE_SIGATURE = 4;
    public static final int SIG_CMD_DEV_CONFIRMATION = 12;
    public static final int SIG_CMD_DEV_RANDOM = 13;
    public static final int SIG_CMD_MESH_CONFIG = 9;
    public static final int SIG_CMD_PUBLIC_KEY = 3;
    public static final int SIG_CMD_SERVER_SIGNATURE = 8;
    public static final int SIG_CMD_SHARE_INFO = 6;
    int mPackageType;
    byte[] params;

    public SinglePacket(int i, byte[] bArr) {
        this.params = bArr;
        this.mPackageType = i;
    }

    public byte[] getData() {
        return this.params;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public String getName() {
        return Packet.SINGLE_CMD;
    }

    public int getPackageType() {
        return this.mPackageType;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public byte[] toBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(this.params.length + 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) this.mPackageType);
        byteBufferOrder.put(this.params);
        return byteBufferOrder.array();
    }
}
