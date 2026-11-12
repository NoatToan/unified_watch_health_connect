package com.xiaomi.wearable.transport.layerl1;

import com.xiaomi.wearable.utils.CRCUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/CMDPacket;", "Lcom/xiaomi/wearable/transport/layerl1/L1Packet;", "cmd", "Lcom/xiaomi/wearable/transport/layerl1/CMDPacket$CMD;", "data", "", "<init>", "(Lcom/xiaomi/wearable/transport/layerl1/CMDPacket$CMD;[B)V", "getCmd", "()Lcom/xiaomi/wearable/transport/layerl1/CMDPacket$CMD;", "getData", "()[B", "CMD", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CMDPacket extends L1Packet {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CMD cmd;

    @NotNull
    private final byte[] data;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/CMDPacket$CMD;", "", "value", "", "<init>", "(Ljava/lang/String;IB)V", "getValue", "()B", "CMD_L1START_REQ", "CMD_L1START_RSP", "CMD_L1STOP_REQ", "CMD_L1STOP_RSP", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum CMD {
        CMD_L1START_REQ((byte) 1),
        CMD_L1START_RSP((byte) 2),
        CMD_L1STOP_REQ((byte) 3),
        CMD_L1STOP_RSP((byte) 4);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final byte value;

        CMD(byte b2) {
            this.value = b2;
        }

        @NotNull
        public static EnumEntries<CMD> getEntries() {
            return $ENTRIES;
        }

        public final byte getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/CMDPacket$Companion;", "", "<init>", "()V", "createCmdHeader", "Lcom/xiaomi/wearable/transport/layerl1/L1Packet$Header;", "cmd", "Lcom/xiaomi/wearable/transport/layerl1/CMDPacket$CMD;", "data", "", "createCmdPayload", "createCmdData", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final byte[] createCmdData() {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(21).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(TransportL1.ConfigType.CONFIG_TYPE_VERSION.getValue());
            byteBufferOrder.putShort((short) 3);
            byteBufferOrder.put((byte) 1);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.put(TransportL1.ConfigType.CONFIG_TYPE_MPS.getValue());
            byteBufferOrder.putShort((short) 2);
            byteBufferOrder.putShort((short) TransportL1.SAR_DEFAULT_MPS);
            byteBufferOrder.put(TransportL1.ConfigType.CONFIG_TYPE_TX_WIN.getValue());
            byteBufferOrder.putShort((short) 2);
            byteBufferOrder.putShort((short) 32);
            byteBufferOrder.put(TransportL1.ConfigType.CONFIG_TYPE_SEND_TIMEOUT.getValue());
            byteBufferOrder.putShort((short) 2);
            byteBufferOrder.putShort(TransportL1.SAR_SEND_TIMEOUT);
            byte[] bArrArray = byteBufferOrder.array();
            Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
            return bArrArray;
        }

        @NotNull
        public final L1Packet.Header createCmdHeader(@NotNull CMD cmd, @NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(cmd, "cmd");
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] bArrCreateCmdPayload = createCmdPayload(cmd, data);
            return new L1Packet.Header((short) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, bArrCreateCmdPayload.length, (short) CRCUtil.CRC16(bArrCreateCmdPayload.length, bArrCreateCmdPayload), 29, null);
        }

        @NotNull
        public final byte[] createCmdPayload(@NotNull CMD cmd, @NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(cmd, "cmd");
            Intrinsics.checkNotNullParameter(data, "data");
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(data.length + 1).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(cmd.getValue());
            byteBufferOrder.put(data);
            byte[] bArrArray = byteBufferOrder.array();
            Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
            return bArrArray;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CMDPacket(@NotNull CMD cmd, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(data, "data");
        Companion companion = INSTANCE;
        super(companion.createCmdHeader(cmd, data), companion.createCmdPayload(cmd, data));
        this.cmd = cmd;
        this.data = data;
    }

    @NotNull
    public final CMD getCmd() {
        return this.cmd;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }
}
