package com.xiaomi.smarthome.library.bluetooth.channel.packet;

import com.xiaomi.smarthome.library.common.util.ByteUtils;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Packet {
    public static final String ACK = "ack";
    public static final String CTR = "ctr";
    public static final String DATA = "data";
    public static final String MNG_ACK = "mng_ack";
    public static final String MNG_CMD = "mng";
    public static final String SINGLE_ACK = "single_ack";
    public static final String SINGLE_CMD = "single_ctr";
    static final int SN_CTR = 0;
    public static final int TYPE_ACK = 1;
    public static final int TYPE_CMD = 0;
    public static final int TYPE_MNG = 4;
    public static final int TYPE_MNG_ACK = 5;
    public static final int TYPE_SINGLE_ACK = 3;
    public static final int TYPE_SINGLE_CMD = 2;

    public static class Bytes {
        int end;
        int start;
        byte[] value;

        public Bytes(byte[] bArr, int i) {
            this(bArr, i, bArr.length);
        }

        public int getSize() {
            return this.end - this.start;
        }

        public Bytes(byte[] bArr, int i, int i2) {
            this.value = bArr;
            this.start = i;
            this.end = i2;
        }
    }

    public static class Header {
        int command;
        List<Short> parameters;
        int sn;
        int type;
        byte[] value;

        private Header() {
            this.parameters = new ArrayList();
        }
    }

    private static Packet getDataPacket(Header header) {
        return new DataPacket(header.sn, new Bytes(header.value, 2));
    }

    private static Packet getFlowPacket(Header header) {
        List<Short> list = header.parameters;
        int i = header.type;
        if (i == 0) {
            return new CTRPacket(list.get(0).shortValue(), header.command);
        }
        if (i == 1) {
            return new ACKPacket(header.command, list);
        }
        if (i == 2) {
            return new SinglePacket(header.command, ByteUtils.get(header.value, 4));
        }
        if (i == 3) {
            return new SingleACKPacket(header.command);
        }
        if (i != 4) {
            return i != 5 ? new InvalidPacket() : new MNGAckPacket(header.command, ByteUtils.get(header.value, 4));
        }
        return new MNGPacket(header.command, ByteUtils.get(header.value, 4));
    }

    public static Packet getPacket(byte[] bArr) {
        Header header;
        try {
            header = parse(bArr);
        } catch (BufferUnderflowException e) {
            e.printStackTrace();
            header = null;
        }
        if (header != null) {
            return header.sn != 0 ? getDataPacket(header) : getFlowPacket(header);
        }
        return new InvalidPacket();
    }

    private static Header parse(byte[] bArr) throws BufferUnderflowException {
        Header header = new Header();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        short s = byteBufferOrder.getShort();
        header.sn = s;
        header.value = bArr;
        if (s == 0) {
            header.type = byteBufferOrder.get();
            header.command = byteBufferOrder.get();
            while (byteBufferOrder.hasRemaining()) {
                try {
                    header.parameters.add(Short.valueOf(byteBufferOrder.getShort()));
                } catch (BufferUnderflowException unused) {
                }
            }
        }
        return header;
    }

    public abstract String getName();

    public abstract byte[] toBytes();
}
