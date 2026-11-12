package com.xiaomi.wearable.transport.layerl2;

import com.miui.tsmclient.net.TSMAuthContants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0003\u0015\u0016\u0017B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl2/L2Packet;", "", "channel", "", "opCode", "priority", "", TSMAuthContants.PARAM_PAYLOAD, "", "<init>", "(BBI[B)V", "getChannel", "()B", "getOpCode", "getPriority", "()I", "getPayload", "()[B", "getBytes", "toString", "", "OpCode", "Channel", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class L2Packet {
    public static final int HEADER_SIZE = 2;
    public static final int L2_CHANNEL_OFFSET = 0;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGHEST = 10;
    private final byte channel;
    private final byte opCode;

    @NotNull
    private final byte[] payload;
    private final int priority;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl2/L2Packet$Channel;", "", "<init>", "()V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Channel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final byte TRANSPORT_CHANNEL_FILE_FITNESS = 5;
        public static final byte TRANSPORT_CHANNEL_FILE_SENSOR = 4;
        public static final byte TRANSPORT_CHANNEL_LYRA = 8;
        public static final byte TRANSPORT_CHANNEL_MASS = 2;
        public static final byte TRANSPORT_CHANNEL_MASS_VOICE = 3;
        public static final byte TRANSPORT_CHANNEL_NETWORK = 7;
        public static final byte TRANSPORT_CHANNEL_OTA = 6;
        public static final byte TRANSPORT_CHANNEL_PB = 1;
        public static final byte TRANSPORT_CHANNEL_RESEARCH = 9;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl2/L2Packet$Channel$Companion;", "", "<init>", "()V", "TRANSPORT_CHANNEL_PB", "", "TRANSPORT_CHANNEL_MASS", "TRANSPORT_CHANNEL_MASS_VOICE", "TRANSPORT_CHANNEL_FILE_SENSOR", "TRANSPORT_CHANNEL_FILE_FITNESS", "TRANSPORT_CHANNEL_OTA", "TRANSPORT_CHANNEL_NETWORK", "TRANSPORT_CHANNEL_LYRA", "TRANSPORT_CHANNEL_RESEARCH", "getReadableChannel", "", "channel", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final String getReadableChannel(byte channel) {
                if (channel == 1) {
                    return "TRANSPORT_CHANNEL_PB";
                }
                if (channel == 2) {
                    return "TRANSPORT_CHANNEL_MASS";
                }
                if (channel == 3) {
                    return "TRANSPORT_CHANNEL_MASS_VOICE";
                }
                if (channel == 4) {
                    return "TRANSPORT_CHANNEL_FILE_SENSOR";
                }
                if (channel == 5) {
                    return "TRANSPORT_CHANNEL_FILE_FITNESS";
                }
                if (channel == 6) {
                    return "TRANSPORT_CHANNEL_OTA";
                }
                if (channel == 7) {
                    return "TRANSPORT_CHANNEL_NETWORK";
                }
                if (channel == 9) {
                    return "TRANSPORT_CHANNEL_RESEARCH";
                }
                return channel == 8 ? "TRANSPORT_CHANNEL_LYRA" : "UNKNOWN CHANNEL";
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl2/L2Packet$OpCode;", "", "<init>", "()V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OpCode {
        public static final byte TRANSPORT_OPCODE_READ = 3;
        public static final byte TRANSPORT_OPCODE_WRITE = 1;
        public static final byte TRANSPORT_OPCODE_WRITE_ENC = 2;
    }

    public L2Packet(byte b2, byte b3, int i, @NotNull byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.channel = b2;
        this.opCode = b3;
        this.priority = i;
        this.payload = payload;
    }

    @NotNull
    public final byte[] getBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(this.payload.length + 2).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(this.channel);
        byteBufferOrder.put(this.opCode);
        byteBufferOrder.put(this.payload);
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    public final byte getChannel() {
        return this.channel;
    }

    public final byte getOpCode() {
        return this.opCode;
    }

    @NotNull
    public final byte[] getPayload() {
        return this.payload;
    }

    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public String toString() {
        byte b2 = this.channel;
        byte b3 = this.opCode;
        return "channel: " + ((int) b2) + ", opCode: " + ((int) b3) + ", priority: " + this.priority + ", payload: " + this.payload.length;
    }
}
