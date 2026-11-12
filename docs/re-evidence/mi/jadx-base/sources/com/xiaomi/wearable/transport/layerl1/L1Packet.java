package com.xiaomi.wearable.transport.layerl1;

import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.onetrack.api.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0003\u000f\u0010\u0011B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/L1Packet;", "", "header", "Lcom/xiaomi/wearable/transport/layerl1/L1Packet$Header;", TSMAuthContants.PARAM_PAYLOAD, "", "<init>", "(Lcom/xiaomi/wearable/transport/layerl1/L1Packet$Header;[B)V", "getHeader", "()Lcom/xiaomi/wearable/transport/layerl1/L1Packet$Header;", "getPayload", "()[B", "getBytes", "toString", "", "DataType", "Header", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nL1Packet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L1Packet.kt\ncom/xiaomi/wearable/transport/layerl1/L1Packet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
public class L1Packet {

    @NotNull
    public static final String TAG = "TaskQueueV2";

    @NotNull
    private final Header header;

    @Nullable
    private final byte[] payload;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/L1Packet$DataType;", "", "<init>", "()V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {
        public static final byte TYPE_ACK = 1;
        public static final byte TYPE_CMD = 2;
        public static final byte TYPE_DATA = 3;
        public static final byte TYPE_NAK = 0;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eBM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/L1Packet$Header;", "", "magic", "", "type", "", "frx", "rfu", "seqNum", "Lkotlin/UByte;", "dataLength", "", "crc", "<init>", "(SBBBBISLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMagic", "()S", "getType", "()B", "getFrx", "getRfu", "getSeqNum-w2LRezQ", "setSeqNum-7apg3OU", "(B)V", c.f13755a, "getDataLength", "()I", "getCrc", "toString", "", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Header {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final byte HEADER_FRX = 1;
        public static final byte HEADER_NRX = 0;
        private final short crc;
        private final int dataLength;
        private final byte frx;
        private final short magic;
        private final byte rfu;
        private byte seqNum;
        private final byte type;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/L1Packet$Header$Companion;", "", "<init>", "()V", "get", "Lcom/xiaomi/wearable/transport/layerl1/L1Packet$Header;", "bytes", "", "getReadableType", "", "type", "", "HEADER_NRX", "HEADER_FRX", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Header get(@NotNull byte[] bytes) {
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
                short s = byteBufferOrder.getShort();
                byte b2 = byteBufferOrder.get();
                byte b3 = (byte) (b2 & 15);
                byte b4 = (byte) ((b2 >> 4) & 1);
                byte b5 = byteBufferOrder.get();
                return new Header(s, b3, b4, (byte) 0, UByte.m904constructorimpl(b5), byteBufferOrder.getShort() & UShort.MAX_VALUE, byteBufferOrder.getShort(), null);
            }

            @NotNull
            public final String getReadableType(byte type) {
                if (type == 0) {
                    return "NAK";
                }
                if (type == 1) {
                    return "ACK";
                }
                if (type == 2) {
                    return "CMD";
                }
                if (type == 3) {
                    return "DATA";
                }
                return "error type " + ((int) type);
            }
        }

        public /* synthetic */ Header(short s, byte b2, byte b3, byte b4, byte b5, int i, short s2, DefaultConstructorMarker defaultConstructorMarker) {
            this(s, b2, b3, b4, b5, i, s2);
        }

        public final short getCrc() {
            return this.crc;
        }

        public final int getDataLength() {
            return this.dataLength;
        }

        public final byte getFrx() {
            return this.frx;
        }

        public final short getMagic() {
            return this.magic;
        }

        public final byte getRfu() {
            return this.rfu;
        }

        /* JADX INFO: renamed from: getSeqNum-w2LRezQ, reason: not valid java name and from getter */
        public final byte getSeqNum() {
            return this.seqNum;
        }

        public final byte getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: setSeqNum-7apg3OU, reason: not valid java name */
        public final void m857setSeqNum7apg3OU(byte b2) {
            this.seqNum = b2;
        }

        @NotNull
        public String toString() {
            return "Header (type: " + INSTANCE.getReadableType(this.type) + ", seqNumber: " + UByte.m948toStringimpl(this.seqNum) + ", dataLength: " + this.dataLength + ", frx: " + ((int) this.frx) + ", crc: " + ((int) this.crc) + ")";
        }

        private Header(short s, byte b2, byte b3, byte b4, byte b5, int i, short s2) {
            this.magic = s;
            this.type = b2;
            this.frx = b3;
            this.rfu = b4;
            this.seqNum = b5;
            this.dataLength = i;
            this.crc = s2;
        }

        public /* synthetic */ Header(short s, byte b2, byte b3, byte b4, byte b5, int i, short s2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? TransportL1.L1_HEADER_MAGIC : s, (i2 & 2) != 0 ? (byte) 0 : b2, (i2 & 4) != 0 ? (byte) 0 : b3, (i2 & 8) != 0 ? (byte) 0 : b4, (i2 & 16) != 0 ? (byte) 0 : b5, (i2 & 32) != 0 ? 0 : i, (i2 & 64) == 0 ? s2 : (short) 0, null);
        }
    }

    public L1Packet(@NotNull Header header, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.header = header;
        this.payload = bArr;
    }

    @NotNull
    public final byte[] getBytes() {
        byte[] bArr = this.payload;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate((bArr != null ? bArr.length : 0) + 8).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort(this.header.getMagic());
        byteBufferOrder.put((byte) (((byte) (this.header.getFrx() << 4)) | this.header.getType()));
        byteBufferOrder.put(this.header.getSeqNum());
        byteBufferOrder.putShort((short) (this.header.getDataLength() & 65535));
        byteBufferOrder.putShort(this.header.getCrc());
        byte[] bArr2 = this.payload;
        if (bArr2 != null) {
            byteBufferOrder.put(bArr2);
        }
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    @Nullable
    public final byte[] getPayload() {
        return this.payload;
    }

    @NotNull
    public String toString() {
        return "L1Packet (header: " + this.header + ")";
    }
}
