package com.xiaomi.smarthome.library.bluetooth.channel.packet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class CTRPacket extends Packet {
    private static final int BUFFER_SIZE = 6;
    public static final int CMD_BIND_KEY = 14;
    public static final int CMD_COMMON_DATA = 0;
    public static final int CMD_DEVICE_CERT = 1;
    public static final int CMD_DEVICE_LOGIN_INFO = 5;
    public static final int CMD_DEVICE_PUBLIC_KEY = 3;
    public static final int CMD_DEVICE_SIGNATURE = 4;
    public static final int CMD_LOCK_APP_CONFIRMATION = 10;
    public static final int CMD_LOCK_APP_RANDOM = 11;
    public static final int CMD_LOCK_DEV_CONFIRMATION = 12;
    public static final int CMD_LOCK_DEV_RANDOM = 13;
    public static final int CMD_MANUFACTURE_CERT = 2;
    public static final int CMD_MESH_CONFIG = 9;
    public static final int CMD_SERVER_CERT = 7;
    public static final int CMD_SERVER_SIGNATURE = 8;
    public static final int CMD_SHARE_LOGIN_INFO = 6;
    public static final int CMD_WIFI_CONFIG = 15;
    public static final int CM_DEVICE_LOG = 17;
    public static final int CM_WUGAN_GET_MSG = 19;
    public static final int CM_WUGAN_SEND_RANDOM = 18;
    private final byte[] BUFFER = new byte[6];
    private int frameCount;
    private int packageType;

    public CTRPacket(int i, int i2) {
        this.frameCount = i;
        this.packageType = i2;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public String getName() {
        return Packet.CTR;
    }

    public int getPackageType() {
        return this.packageType;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet
    public byte[] toBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(this.BUFFER).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) this.packageType);
        byteBufferOrder.putShort((short) this.frameCount);
        return byteBufferOrder.array();
    }

    public String toString() {
        return "FlowPacket{frameCount=" + this.frameCount + "packageType=" + this.packageType + AbstractJsonLexerKt.END_OBJ;
    }
}
