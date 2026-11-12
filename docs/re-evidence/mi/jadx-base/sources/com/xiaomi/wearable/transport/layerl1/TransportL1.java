package com.xiaomi.wearable.transport.layerl1;

import android.os.Handler;
import com.mi.health.course.export.data.CourseConfigModel;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.client.Logger;
import com.xiaomi.wearable.transport.Callback;
import com.xiaomi.wearable.transport.layerl0.TransportL0;
import com.xiaomi.wearable.transport.layerl1.TransportL1;
import com.xiaomi.wearable.transport.layerl2.L2Packet;
import com.xiaomi.wearable.transport.queue.CmdDataReceiver;
import com.xiaomi.wearable.transport.queue.TaskDataReceiver;
import com.xiaomi.wearable.utils.ByteUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 W2\u00020\u0001:\u0005STUVWB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u000e\u0010'\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010+\u001a\u00020*2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020*H\u0002J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010-\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010.\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u00100\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J\u0006\u00101\u001a\u00020\u0013J \u00102\u001a\u00020\u00132\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u001eH\u0002J\u0010\u00108\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u00109\u001a\u00020*2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010:\u001a\u00020*2\u0006\u0010$\u001a\u00020%H\u0002J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\b\u0010@\u001a\u00020\u0013H\u0002J\u0010\u0010A\u001a\u00020*2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020\u001eH\u0002J)\u0010D\u001a\u00020\u00132\u0006\u0010<\u001a\u00020=2\u0006\u0010E\u001a\u00020*2\b\b\u0002\u0010F\u001a\u00020*H\u0002¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0010\u0010J\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0006\u0010K\u001a\u00020*J\u0016\u0010L\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\u0011J\u0014\u0010O\u001a\u00020\u00132\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u0010Q\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u000fJ\u0006\u0010R\u001a\u00020\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/TransportL1;", "", "<init>", "()V", "txQueue", "Ljava/util/LinkedList;", "Lcom/xiaomi/wearable/transport/layerl1/TransportL1$SendItem;", "control", "Lcom/xiaomi/wearable/transport/layerl1/TransportL1$Control;", "layerL0", "Lcom/xiaomi/wearable/transport/layerl0/TransportL0;", "dataReceiver", "Lcom/xiaomi/wearable/transport/queue/TaskDataReceiver;", "Lcom/xiaomi/wearable/transport/layerl2/L2Packet;", "cmdDataReceiver", "Lcom/xiaomi/wearable/transport/queue/CmdDataReceiver;", "senderHandler", "Landroid/os/Handler;", "sendPacket", "", "l2packet", "callback", "Lcom/xiaomi/wearable/transport/Callback;", "enqueue", "sendItem", "sendCmd", "", "cmd", "Lcom/xiaomi/wearable/transport/layerl1/CMDPacket$CMD;", "data", "", "runNext", "setStatus", "status", "Lcom/xiaomi/wearable/transport/layerl1/TransportL1$TXState;", "onSendComplete", "packet", "Lcom/xiaomi/wearable/transport/layerl1/L1Packet;", "onSendTimeout", "onPacketReceive", "onNAKReceive", "needAck", "", "onACKReceive", "onCMDReceive", "onReceiveL1StartReq", "onReceiveL1StartRSP", "handleConfig", "onReceiveL1StopRSP", "sendStopRequest", "configTypeProcess", "configType", "", "configLength", "", "configData", "onDataReceive", "needSendAck", "isNetProxyData", "startCumAckTimer", "seqNum", "Lkotlin/UByte;", "startCumAckTimer-7apg3OU", "(B)V", "stopCumAckTimer", "ackImmediately", "deliverL2Packet", TSMAuthContants.PARAM_PAYLOAD, "sendAck", Packet.ACK, "force", "sendAck-d-jbwkw", "(BZZ)V", "sendTimerStart", "sendTimerStop", "isQueueIdle", CourseConfigModel.DevCmd.CMD_ACTION_SET, "transportL0", "handler", "setTaskDataReceiver", "receiver", "setCmdDataReceiver", "resetConfig", "TXState", "ConfigType", "Control", "SendItem", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransportL1.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransportL1.kt\ncom/xiaomi/wearable/transport/layerl1/TransportL1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,735:1\n1863#2,2:736\n1863#2,2:738\n1#3:740\n*S KotlinDebug\n*F\n+ 1 TransportL1.kt\ncom/xiaomi/wearable/transport/layerl1/TransportL1\n*L\n316#1:736,2\n362#1:738,2\n*E\n"})
public final class TransportL1 {
    public static final int L1_CMD_DATA_OFFSET = 1;
    public static final int L1_CMD_HEADER_OFFSET = 0;
    public static final short L1_HEADER_MAGIC = -23131;
    public static final int L1_HEADER_SIZE = 8;
    public static final int L1_MAGIC_SIZE = 2;
    public static final long SAR_CUM_ACK_TIMEOUT = 500;
    public static final int SAR_DEFAULT_MPS = 64512;
    public static final short SAR_DEFAULT_TX_WIN_LOCAL = 32;
    public static final short SAR_DEFAULT_TX_WIN_REMOTE = 4;
    public static final byte SAR_DEVICE_TYPE = 0;
    public static final short SAR_SEND_TIMEOUT = 10000;
    public static final byte SAR_VERSION_BUILD = 0;
    public static final byte SAR_VERSION_MAJOR = 1;
    public static final byte SAR_VERSION_MINOR = 0;
    public static final byte SAR_VERSION_REVISION = 0;

    @NotNull
    private static final String TAG = "TaskQueueV2";
    private CmdDataReceiver cmdDataReceiver;
    private TaskDataReceiver<L2Packet> dataReceiver;
    private TransportL0 layerL0;
    private Handler senderHandler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicInteger sendItemId = new AtomicInteger(1);

    @NotNull
    private final LinkedList<SendItem> txQueue = new LinkedList<>();

    @NotNull
    private final Control control = new Control();

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/TransportL1$Companion;", "", "<init>", "()V", "TAG", "", "sendItemId", "Ljava/util/concurrent/atomic/AtomicInteger;", "getSendItemId", "()Ljava/util/concurrent/atomic/AtomicInteger;", "L1_CMD_HEADER_OFFSET", "", "L1_CMD_DATA_OFFSET", "SAR_VERSION_MAJOR", "", "SAR_VERSION_MINOR", "SAR_VERSION_REVISION", "SAR_VERSION_BUILD", "SAR_DEVICE_TYPE", "SAR_DEFAULT_MPS", "SAR_DEFAULT_TX_WIN_LOCAL", "Lkotlin/UShort;", "S", "SAR_DEFAULT_TX_WIN_REMOTE", "", "SAR_SEND_TIMEOUT", "SAR_CUM_ACK_TIMEOUT", "", "L1_HEADER_SIZE", "L1_MAGIC_SIZE", "L1_HEADER_MAGIC", "TX_WIN_ACK_THR", "win", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int TX_WIN_ACK_THR(short win) {
            return (win * 2) / 3;
        }

        @NotNull
        public final AtomicInteger getSendItemId() {
            return TransportL1.sendItemId;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/TransportL1$ConfigType;", "", "value", "", "<init>", "(Ljava/lang/String;IB)V", "getValue", "()B", "CONFIG_TYPE_VERSION", "CONFIG_TYPE_MPS", "CONFIG_TYPE_TX_WIN", "CONFIG_TYPE_SEND_TIMEOUT", "CONFIG_TYPE_DEVICE_TYPE", "CONFIG_TYPE_DEVICE_NAME", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum ConfigType {
        CONFIG_TYPE_VERSION((byte) 1),
        CONFIG_TYPE_MPS((byte) 2),
        CONFIG_TYPE_TX_WIN((byte) 3),
        CONFIG_TYPE_SEND_TIMEOUT((byte) 4),
        CONFIG_TYPE_DEVICE_TYPE((byte) 5),
        CONFIG_TYPE_DEVICE_NAME((byte) 6);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final byte value;

        ConfigType(byte b2) {
            this.value = b2;
        }

        @NotNull
        public static EnumEntries<ConfigType> getEntries() {
            return $ENTRIES;
        }

        public final byte getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u00104\u001a\u000205J\b\u00106\u001a\u000207H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u00020\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0014\u001a\u00020\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001c\u0010&\u001a\u00020\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00101\"\u0004\b2\u00103¨\u00068"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/TransportL1$Control;", "", "<init>", "()V", "txState", "Lcom/xiaomi/wearable/transport/layerl1/TransportL1$TXState;", "getTxState", "()Lcom/xiaomi/wearable/transport/layerl1/TransportL1$TXState;", "setTxState", "(Lcom/xiaomi/wearable/transport/layerl1/TransportL1$TXState;)V", "txBase", "Lkotlin/UByte;", "getTxBase-w2LRezQ", "()B", "setTxBase-7apg3OU", "(B)V", c.f13755a, "txNextSeqNum", "getTxNextSeqNum-w2LRezQ", "setTxNextSeqNum-7apg3OU", "rxExpectSeqNum", "getRxExpectSeqNum-w2LRezQ", "setRxExpectSeqNum-7apg3OU", "remoteMPS", "", "getRemoteMPS", "()I", "setRemoteMPS", "(I)V", "remoteTXWindow", "", "getRemoteTXWindow", "()S", "setRemoteTXWindow", "(S)V", "rxCumAckIndex", "getRxCumAckIndex", "setRxCumAckIndex", "rxCumAckSeqNum", "getRxCumAckSeqNum-w2LRezQ", "setRxCumAckSeqNum-7apg3OU", "rxCumAckTimerRunnable", "Ljava/lang/Runnable;", "getRxCumAckTimerRunnable", "()Ljava/lang/Runnable;", "setRxCumAckTimerRunnable", "(Ljava/lang/Runnable;)V", "isCmdExchanged", "", "()Z", "setCmdExchanged", "(Z)V", "reset", "", "toString", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Control {
        private volatile boolean isCmdExchanged;
        private volatile short remoteTXWindow;
        private int rxCumAckIndex;
        private byte rxCumAckSeqNum;

        @Nullable
        private Runnable rxCumAckTimerRunnable;
        private byte rxExpectSeqNum;
        private volatile byte txBase;
        private byte txNextSeqNum;

        @NotNull
        private volatile TXState txState = TXState.TX_STATE_IDLE;
        private volatile int remoteMPS = TransportL1.SAR_DEFAULT_MPS;

        public final int getRemoteMPS() {
            return this.remoteMPS;
        }

        public final short getRemoteTXWindow() {
            return this.remoteTXWindow;
        }

        public final int getRxCumAckIndex() {
            return this.rxCumAckIndex;
        }

        /* JADX INFO: renamed from: getRxCumAckSeqNum-w2LRezQ, reason: not valid java name and from getter */
        public final byte getRxCumAckSeqNum() {
            return this.rxCumAckSeqNum;
        }

        @Nullable
        public final Runnable getRxCumAckTimerRunnable() {
            return this.rxCumAckTimerRunnable;
        }

        /* JADX INFO: renamed from: getRxExpectSeqNum-w2LRezQ, reason: not valid java name and from getter */
        public final byte getRxExpectSeqNum() {
            return this.rxExpectSeqNum;
        }

        /* JADX INFO: renamed from: getTxBase-w2LRezQ, reason: not valid java name and from getter */
        public final byte getTxBase() {
            return this.txBase;
        }

        /* JADX INFO: renamed from: getTxNextSeqNum-w2LRezQ, reason: not valid java name and from getter */
        public final byte getTxNextSeqNum() {
            return this.txNextSeqNum;
        }

        @NotNull
        public final TXState getTxState() {
            return this.txState;
        }

        /* JADX INFO: renamed from: isCmdExchanged, reason: from getter */
        public final boolean getIsCmdExchanged() {
            return this.isCmdExchanged;
        }

        public final void reset() {
            CoreExtKt.getLogger().i("TaskQueueV2", "reset transport");
            this.txState = TXState.TX_STATE_IDLE;
            this.txBase = (byte) 0;
            this.txNextSeqNum = (byte) 0;
            this.rxExpectSeqNum = (byte) 0;
            this.isCmdExchanged = false;
        }

        public final void setCmdExchanged(boolean z) {
            this.isCmdExchanged = z;
        }

        public final void setRemoteMPS(int i) {
            this.remoteMPS = i;
        }

        public final void setRemoteTXWindow(short s) {
            this.remoteTXWindow = s;
        }

        public final void setRxCumAckIndex(int i) {
            this.rxCumAckIndex = i;
        }

        /* JADX INFO: renamed from: setRxCumAckSeqNum-7apg3OU, reason: not valid java name */
        public final void m865setRxCumAckSeqNum7apg3OU(byte b2) {
            this.rxCumAckSeqNum = b2;
        }

        public final void setRxCumAckTimerRunnable(@Nullable Runnable runnable) {
            this.rxCumAckTimerRunnable = runnable;
        }

        /* JADX INFO: renamed from: setRxExpectSeqNum-7apg3OU, reason: not valid java name */
        public final void m866setRxExpectSeqNum7apg3OU(byte b2) {
            this.rxExpectSeqNum = b2;
        }

        /* JADX INFO: renamed from: setTxBase-7apg3OU, reason: not valid java name */
        public final void m867setTxBase7apg3OU(byte b2) {
            this.txBase = b2;
        }

        /* JADX INFO: renamed from: setTxNextSeqNum-7apg3OU, reason: not valid java name */
        public final void m868setTxNextSeqNum7apg3OU(byte b2) {
            this.txNextSeqNum = b2;
        }

        public final void setTxState(@NotNull TXState tXState) {
            Intrinsics.checkNotNullParameter(tXState, "<set-?>");
            this.txState = tXState;
        }

        @NotNull
        public String toString() {
            return "txState = " + this.txState + ",txBase = " + UByte.m948toStringimpl(this.txBase) + ",txNextSeq = " + UByte.m948toStringimpl(this.txNextSeqNum);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/TransportL1$TXState;", "", "<init>", "(Ljava/lang/String;I)V", "TX_STATE_BUSY", "TX_STATE_IDLE", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum TXState {
        TX_STATE_BUSY,
        TX_STATE_IDLE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<TXState> getEntries() {
            return $ENTRIES;
        }
    }

    private final boolean ackImmediately(L1Packet packet) {
        byte[] payload = packet.getPayload();
        Intrinsics.checkNotNull(payload);
        byte b2 = payload[0];
        return b2 == 1 || b2 == 8 || this.control.getRxCumAckIndex() >= INSTANCE.TX_WIN_ACK_THR(this.control.getRemoteTXWindow());
    }

    private final void configTypeProcess(byte configType, short configLength, byte[] configData) {
        if (configType == ConfigType.CONFIG_TYPE_VERSION.getValue()) {
            CoreExtKt.getLogger().i("TaskQueueV2", "configTypeProcess: CONFIG_TYPE_VERSION V1: " + ((int) configData[0]) + ",V2: " + ((int) configData[1]) + ",V3: " + ((int) configData[2]));
            return;
        }
        if (configType == ConfigType.CONFIG_TYPE_MPS.getValue()) {
            if (configLength != 2) {
                CoreExtKt.getLogger().i("TaskQueueV2", "configTypeProcess: CONFIG_TYPE_MPS data length " + ((int) configLength));
                return;
            }
            int iShortToUInt = ByteUtil.INSTANCE.shortToUInt(ByteUtil.toShort(configData, true));
            CoreExtKt.getLogger().i("TaskQueueV2", "configTypeProcess: CONFIG_TYPE_MPS " + iShortToUInt);
            this.control.setRemoteMPS(iShortToUInt);
            return;
        }
        if (configType == ConfigType.CONFIG_TYPE_TX_WIN.getValue()) {
            if (configLength != 2) {
                CoreExtKt.getLogger().i("TaskQueueV2", "configTypeProcess: CONFIG_TYPE_TX_WIN data length " + ((int) configLength));
                return;
            }
            short s = ByteBuffer.wrap(configData).order(ByteOrder.LITTLE_ENDIAN).getShort();
            CoreExtKt.getLogger().i("TaskQueueV2", "configTypeProcess: CONFIG_TYPE_TX_WIN " + ((int) s));
            this.control.setRemoteTXWindow(s);
            return;
        }
        if (configType != ConfigType.CONFIG_TYPE_SEND_TIMEOUT.getValue()) {
            CoreExtKt.getLogger().i("TaskQueueV2", "configTypeProcess: else " + ((int) configType));
            return;
        }
        if (configLength != 2) {
            CoreExtKt.getLogger().i("TaskQueueV2", "configTypeProcess: CONFIG_TYPE_SEND_TIMEOUT data length " + ((int) configLength));
            return;
        }
        short s2 = ByteBuffer.wrap(configData).order(ByteOrder.LITTLE_ENDIAN).getShort();
        CoreExtKt.getLogger().i("TaskQueueV2", "configTypeProcess: CONFIG_TYPE_SEND_TIMEOUT " + ((int) s2));
    }

    private final void deliverL2Packet(byte[] payload) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(payload).order(ByteOrder.LITTLE_ENDIAN);
        byte b2 = byteBufferOrder.get();
        byte b3 = byteBufferOrder.get();
        byte[] bArr = new byte[payload.length - 2];
        ArraysKt___ArraysJvmKt.copyInto$default(payload, bArr, 0, 2, 0, 10, (Object) null);
        TaskDataReceiver<L2Packet> taskDataReceiver = this.dataReceiver;
        if (taskDataReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataReceiver");
            taskDataReceiver = null;
        }
        taskDataReceiver.onReceiveData(new L2Packet(b2, b3, 0, bArr));
    }

    private final void enqueue(SendItem sendItem) {
        Logger logger = CoreExtKt.getLogger();
        byte type = sendItem.getPacket().getHeader().getType();
        logger.i("TaskQueueV2", "enqueue: type:" + ((int) type) + ", seqNumber:" + UByte.m948toStringimpl(sendItem.getPacket().getHeader().getSeqNum()));
        byte type2 = sendItem.getPacket().getHeader().getType();
        if (type2 == 3) {
            Iterator<SendItem> it = this.txQueue.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            int i = 0;
            while (it.hasNext()) {
                SendItem next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                SendItem sendItem2 = next;
                if (sendItem2.getPacket().getHeader().getType() == 1 || sendItem.getPriority() <= sendItem2.getPriority() || sendItem2.getWaitAck() || sendItem2.getNumberAssigned()) {
                    i++;
                } else {
                    this.txQueue.add(i, sendItem);
                }
            }
            this.txQueue.addLast(sendItem);
        } else if (type2 == 1) {
            Iterator<SendItem> it2 = this.txQueue.iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
            while (it2.hasNext()) {
                SendItem next2 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                SendItem sendItem3 = next2;
                if (sendItem3.getPacket().getHeader().getType() == 1 && Intrinsics.compare(sendItem3.getPacket().getHeader().getSeqNum() & 255, sendItem.getPacket().getHeader().getSeqNum() & 255) < 0) {
                    it2.remove();
                }
            }
            this.txQueue.addFirst(sendItem);
        } else if (type2 == 2 || type2 == 0) {
            this.txQueue.addFirst(sendItem);
        }
        runNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleConfig(L1Packet packet) {
        byte[] payload = packet.getPayload();
        if (payload == null) {
            CoreExtKt.getLogger().i("TaskQueueV2", "onReceiveL1StartRSP: ");
            return;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(payload).order(ByteOrder.LITTLE_ENDIAN);
        byte b2 = byteBufferOrder.get();
        CoreExtKt.getLogger().i("TaskQueueV2", "onReceiveL1StartRSP: cmd:" + ((int) b2));
        int i = 1;
        while (i < payload.length) {
            CoreExtKt.getLogger().i("TaskQueueV2", "onReceiveL1StartRSP: " + i + ", size = " + payload.length);
            byte b3 = byteBufferOrder.get();
            int i2 = byteBufferOrder.getShort();
            byte[] bArr = new byte[i2];
            i = i + 3 + i2;
            byteBufferOrder.get(bArr, 0, i2);
            configTypeProcess(b3, i2, bArr);
        }
    }

    private final boolean isNetProxyData(L1Packet packet) {
        byte[] payload = packet.getPayload();
        Intrinsics.checkNotNull(payload);
        return payload[0] == 7;
    }

    private final boolean needAck(L1Packet packet) {
        return packet.getHeader().getType() == 3;
    }

    private final boolean needSendAck(L1Packet packet) {
        if (!this.control.getIsCmdExchanged()) {
            return false;
        }
        byte[] payload = packet.getPayload();
        Intrinsics.checkNotNull(payload);
        return payload[0] != 7;
    }

    private final boolean onACKReceive(L1Packet packet, boolean runNext) {
        if (Integer.compareUnsigned(UInt.m981constructorimpl(UInt.m981constructorimpl(this.control.getTxNextSeqNum() & 255) - UInt.m981constructorimpl(this.control.getTxBase() & 255)), UInt.m981constructorimpl(UInt.m981constructorimpl(this.control.getTxNextSeqNum() & 255) - UInt.m981constructorimpl(packet.getHeader().getSeqNum() & 255))) < 0) {
            CoreExtKt.getLogger().i("TaskQueueV2", "onACKReceive: ack miss range , txNextSeqNumber:" + UByte.m948toStringimpl(this.control.getTxNextSeqNum()) + ", txBase:" + UByte.m948toStringimpl(this.control.getTxBase()) + ", seqNum: " + UByte.m948toStringimpl(packet.getHeader().getSeqNum()));
            return false;
        }
        Iterator<SendItem> it = this.txQueue.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext() && this.control.getTxBase() != UByte.m904constructorimpl((byte) UInt.m981constructorimpl(UInt.m981constructorimpl(packet.getHeader().getSeqNum() & 255) + 1))) {
            SendItem next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            SendItem sendItem = next;
            if (sendItem.getPacket().getHeader().getType() == 3) {
                if (Integer.compareUnsigned(UInt.m981constructorimpl(UInt.m981constructorimpl(packet.getHeader().getSeqNum() & 255) - UInt.m981constructorimpl(sendItem.getPacket().getHeader().getSeqNum() & 255)), 0) < 0) {
                    CoreExtKt.getLogger().i("TaskQueueV2", "base move over ");
                    break;
                }
                Callback callback = sendItem.getCallback();
                if (callback != null) {
                    Callback.DefaultImpls.onCallback$default(callback, sendItem.getId(), 1, null, 4, null);
                }
                it.remove();
                sendTimerStop(sendItem);
                Control control = this.control;
                control.m867setTxBase7apg3OU(UByte.m904constructorimpl((byte) (control.getTxBase() + 1)));
                CoreExtKt.getLogger().i("TaskQueueV2", "base move to " + UByte.m948toStringimpl(this.control.getTxBase()));
            }
        }
        if (runNext) {
            runNext();
        }
        return true;
    }

    private final void onCMDReceive(L1Packet packet) {
        byte[] payload = packet.getPayload();
        if (payload == null) {
            return;
        }
        byte b2 = payload[0];
        if (b2 == CMDPacket.CMD.CMD_L1START_REQ.getValue()) {
            onReceiveL1StartReq(packet);
            return;
        }
        if (b2 != CMDPacket.CMD.CMD_L1STOP_REQ.getValue()) {
            if (b2 == CMDPacket.CMD.CMD_L1START_RSP.getValue()) {
                onReceiveL1StartRSP(packet);
            } else if (b2 == CMDPacket.CMD.CMD_L1STOP_RSP.getValue()) {
                onReceiveL1StopRSP(packet);
            }
        }
    }

    private final void onDataReceive(L1Packet packet) {
        byte[] payload = packet.getPayload();
        if (payload == null) {
            CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: Data packet ignored: payload is null");
            return;
        }
        L1Packet.Header header = packet.getHeader();
        if (header.getFrx() == 1) {
            Control control = this.control;
            header.m857setSeqNum7apg3OU(UByte.m904constructorimpl((byte) (header.getSeqNum() + 1)));
            control.m866setRxExpectSeqNum7apg3OU(header.getSeqNum());
        } else if (needSendAck(packet)) {
            if (header.getSeqNum() != this.control.getRxExpectSeqNum()) {
                CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: Data package seqnum error: got: " + UByte.m948toStringimpl(header.getSeqNum()) + ", expected: " + UByte.m948toStringimpl(this.control.getRxExpectSeqNum()) + ", frx: " + ((int) header.getFrx()));
                if (Integer.compareUnsigned(UInt.m981constructorimpl(UInt.m981constructorimpl(header.getSeqNum() & 255) - UInt.m981constructorimpl(this.control.getRxExpectSeqNum() & 255)), 128) >= 0) {
                    CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: ignored nak, seq:" + UByte.m948toStringimpl(header.getSeqNum()) + ", expect:" + UByte.m948toStringimpl(this.control.getRxExpectSeqNum()));
                    return;
                }
                CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: send nak, seq:" + UByte.m948toStringimpl(header.getSeqNum()) + ", expect:" + UByte.m948toStringimpl(this.control.getRxExpectSeqNum()));
                m859sendAckdjbwkw$default(this, this.control.getRxExpectSeqNum(), false, false, 4, null);
                return;
            }
            if (ackImmediately(packet)) {
                CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: ack immediately");
                stopCumAckTimer();
                m859sendAckdjbwkw$default(this, header.getSeqNum(), true, false, 4, null);
            } else {
                CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: ack cum");
                m860startCumAckTimer7apg3OU(header.getSeqNum());
            }
            Control control2 = this.control;
            control2.m866setRxExpectSeqNum7apg3OU(UByte.m904constructorimpl((byte) (control2.getRxExpectSeqNum() + 1)));
        }
        deliverL2Packet(payload);
    }

    private final void onNAKReceive(L1Packet packet) {
        boolean zOnACKReceive = onACKReceive(new ACKPacket(true, UByte.m904constructorimpl((byte) UInt.m981constructorimpl(UInt.m981constructorimpl(packet.getHeader().getSeqNum() & 255) - 1)), false, 4, null), false);
        if (packet.getHeader().getSeqNum() == this.control.getTxBase() || zOnACKReceive) {
            for (SendItem sendItem : this.txQueue) {
                if (sendItem.getWaitAck()) {
                    sendItem.setNeedRetransmission(true);
                    sendTimerStop(sendItem);
                }
            }
            runNext();
        }
    }

    private final void onReceiveL1StartRSP(L1Packet packet) {
        handleConfig(packet);
        this.control.setCmdExchanged(true);
        CmdDataReceiver cmdDataReceiver = this.cmdDataReceiver;
        if (cmdDataReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cmdDataReceiver");
            cmdDataReceiver = null;
        }
        cmdDataReceiver.onCmdReceive();
        runNext();
    }

    private final void onReceiveL1StartReq(L1Packet packet) {
        handleConfig(packet);
        sendCmd(CMDPacket.CMD.CMD_L1START_RSP, CMDPacket.INSTANCE.createCmdData(), null);
    }

    private final void onReceiveL1StopRSP(L1Packet packet) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSendComplete$lambda$4(TransportL1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runNext();
    }

    private final void onSendTimeout(SendItem sendItem) {
        CoreExtKt.getLogger().i("TaskQueueV2", "onSendTimeout() called with: sendItem.seqNumber = " + UByte.m948toStringimpl(sendItem.getPacket().getHeader().getSeqNum()) + " , txbase = " + UByte.m948toStringimpl(this.control.getTxBase()));
        if (Intrinsics.compare(sendItem.getPacket().getHeader().getSeqNum() & 255, this.control.getTxBase() & 255) >= 0 && sendItem.getWaitAck()) {
            for (SendItem sendItem2 : this.txQueue) {
                if (sendItem2.getWaitAck() && Intrinsics.compare(sendItem2.getPacket().getHeader().getSeqNum() & 255, sendItem.getPacket().getHeader().getSeqNum() & 255) >= 0) {
                    CoreExtKt.getLogger().i("TaskQueueV2", "onSendTimeout: mark " + UByte.m948toStringimpl(sendItem2.getPacket().getHeader().getSeqNum()) + " retransmission");
                    sendItem2.setNeedRetransmission(true);
                    sendTimerStop(sendItem2);
                }
            }
        }
        runNext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetConfig$lambda$14(TransportL1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.control.reset();
        Iterator<SendItem> it = this$0.txQueue.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            SendItem next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            SendItem sendItem = next;
            Callback callback = sendItem.getCallback();
            if (callback != null) {
                Callback.DefaultImpls.onCallback$default(callback, sendItem.getId(), -1, null, 4, null);
            }
            Runnable timeoutRunnable = sendItem.getTimeoutRunnable();
            if (timeoutRunnable != null) {
                Handler handler = this$0.senderHandler;
                if (handler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("senderHandler");
                    handler = null;
                }
                handler.removeCallbacks(timeoutRunnable);
            }
        }
        this$0.txQueue.clear();
    }

    private final int runNext() {
        CoreExtKt.getLogger().i("TaskQueueV2", "runNext() called thread: " + Thread.currentThread().getName());
        if (this.txQueue.isEmpty()) {
            CoreExtKt.getLogger().i("TaskQueueV2", "sendNextPacket: queue is empty");
            return -1;
        }
        TXState txState = this.control.getTxState();
        TXState tXState = TXState.TX_STATE_BUSY;
        if (txState == tXState) {
            CoreExtKt.getLogger().i("TaskQueueV2", "sendNextPacket: busy");
            return -1;
        }
        setStatus(tXState);
        Iterator<SendItem> it = this.txQueue.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        TransportL0 transportL0 = null;
        SendItem sendItem = null;
        while (sendItem == null && it.hasNext()) {
            SendItem next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            SendItem sendItem2 = next;
            if (!this.control.getIsCmdExchanged() && sendItem2.getPacket().getHeader().getType() != 2) {
                CoreExtKt.getLogger().i("TaskQueueV2", "sendNextPacket: cmd not exchanged");
                break;
            }
            if (!needAck(sendItem2.getPacket()) || !sendItem2.getWaitAck() || sendItem2.getNeedRetransmission()) {
                sendItem = sendItem2;
            }
        }
        if (sendItem == null) {
            setStatus(TXState.TX_STATE_IDLE);
            return 0;
        }
        if (sendItem.getPacket().getHeader().getType() == 3 && !sendItem.getWaitAck() && !sendItem.getNumberAssigned()) {
            L1Packet.Header header = sendItem.getPacket().getHeader();
            Control control = this.control;
            byte txNextSeqNum = control.getTxNextSeqNum();
            control.m868setTxNextSeqNum7apg3OU(UByte.m904constructorimpl((byte) (txNextSeqNum + 1)));
            header.m857setSeqNum7apg3OU(txNextSeqNum);
            sendItem.setNumberAssigned(true);
        }
        CoreExtKt.getLogger().i("TaskQueueV2", "window " + this.txQueue + ", window size: " + UByte.m948toStringimpl(UByte.m904constructorimpl((byte) UInt.m981constructorimpl(UInt.m981constructorimpl(this.control.getTxNextSeqNum() & 255) - UInt.m981constructorimpl(this.control.getTxBase() & 255)))) + ", retransmission: " + sendItem.getNeedRetransmission());
        if (!sendItem.getNeedRetransmission() && sendItem.getPacket().getHeader().getType() == 3) {
            if (Intrinsics.compare(UByte.m904constructorimpl((byte) UInt.m981constructorimpl(UInt.m981constructorimpl(this.control.getTxNextSeqNum() & 255) - UInt.m981constructorimpl(this.control.getTxBase() & 255))) & 255, 32) > 0) {
                CoreExtKt.getLogger().i("TaskQueueV2", "sendNext: no window for send");
                setStatus(TXState.TX_STATE_IDLE);
                return -1;
            }
        }
        CoreExtKt.getLogger().i("TaskQueueV2", "-------------> SEND: " + L1Packet.Header.INSTANCE.getReadableType(sendItem.getPacket().getHeader().getType()) + " base: " + UByte.m948toStringimpl(this.control.getTxBase()) + ", nextseq: " + UByte.m948toStringimpl(this.control.getTxNextSeqNum()) + ", size: " + sendItem.getPacket().getHeader().getDataLength() + ", seq: " + UByte.m948toStringimpl(sendItem.getPacket().getHeader().getSeqNum()) + ", frx: " + ((int) sendItem.getPacket().getHeader().getFrx()));
        if (needAck(sendItem.getPacket())) {
            sendItem.setWaitAck(true);
            sendItem.setNeedRetransmission(false);
        }
        Callback callback = sendItem.getCallback();
        if (callback != null) {
            Callback.DefaultImpls.onCallback$default(callback, sendItem.getId(), -2, null, 4, null);
        }
        TransportL0 transportL1 = this.layerL0;
        if (transportL1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layerL0");
        } else {
            transportL0 = transportL1;
        }
        transportL0.sendPacket(sendItem.getPacket());
        return 0;
    }

    /* JADX INFO: renamed from: sendAck-d-jbwkw, reason: not valid java name */
    private final void m858sendAckdjbwkw(byte seqNum, boolean ack, boolean force) {
        CoreExtKt.getLogger().i("TaskQueueV2", "sendAck() called with: seqNum = " + UByte.m948toStringimpl(seqNum) + ", ack = " + ack);
        enqueue(new SendItem(new ACKPacket(ack, seqNum, force, null), 0, null, 6, null));
    }

    /* JADX INFO: renamed from: sendAck-d-jbwkw$default, reason: not valid java name */
    public static /* synthetic */ void m859sendAckdjbwkw$default(TransportL1 transportL1, byte b2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        transportL1.m858sendAckdjbwkw(b2, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendCmd$lambda$1(TransportL1 this$0, SendItem sendItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sendItem, "$sendItem");
        this$0.enqueue(sendItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendPacket$lambda$0(TransportL1 this$0, SendItem sendItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sendItem, "$sendItem");
        this$0.enqueue(sendItem);
    }

    private final void sendTimerStart(final SendItem sendItem) {
        CoreExtKt.getLogger().i("TaskQueueV2", "sendTimerStart: sendItem " + UByte.m948toStringimpl(sendItem.getPacket().getHeader().getSeqNum()));
        Runnable timeoutRunnable = sendItem.getTimeoutRunnable();
        Handler handler = null;
        if (timeoutRunnable != null) {
            Handler handler2 = this.senderHandler;
            if (handler2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("senderHandler");
                handler2 = null;
            }
            handler2.removeCallbacks(timeoutRunnable);
        }
        sendItem.setTimeoutRunnable(null);
        Runnable runnable = new Runnable() { // from class: d1q
            @Override // java.lang.Runnable
            public final void run() {
                TransportL1.sendTimerStart$lambda$11(this.f14976a, sendItem);
            }
        };
        Handler handler3 = this.senderHandler;
        if (handler3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("senderHandler");
        } else {
            handler = handler3;
        }
        handler.postDelayed(runnable, sendItem.getTimeout());
        sendItem.setTimeoutRunnable(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendTimerStart$lambda$11(final TransportL1 this$0, final SendItem sendItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sendItem, "$sendItem");
        Handler handler = this$0.senderHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("senderHandler");
            handler = null;
        }
        handler.post(new Runnable() { // from class: j1q
            @Override // java.lang.Runnable
            public final void run() {
                TransportL1.sendTimerStart$lambda$11$lambda$10(this.f22335a, sendItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendTimerStart$lambda$11$lambda$10(TransportL1 this$0, SendItem sendItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sendItem, "$sendItem");
        this$0.onSendTimeout(sendItem);
    }

    private final void sendTimerStop(SendItem sendItem) {
        CoreExtKt.getLogger().i("TaskQueueV2", "sendTimerStop() called with: sendItem = " + UByte.m948toStringimpl(sendItem.getPacket().getHeader().getSeqNum()));
        Runnable timeoutRunnable = sendItem.getTimeoutRunnable();
        if (timeoutRunnable != null) {
            Handler handler = this.senderHandler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("senderHandler");
                handler = null;
            }
            handler.removeCallbacks(timeoutRunnable);
        }
        sendItem.setTimeoutRunnable(null);
    }

    private final void setStatus(TXState status) {
        this.control.setTxState(status);
        CoreExtKt.getLogger().i("TaskQueueV2", "change tx status to " + status);
    }

    /* JADX INFO: renamed from: startCumAckTimer-7apg3OU, reason: not valid java name */
    private final void m860startCumAckTimer7apg3OU(byte seqNum) {
        CoreExtKt.getLogger().d("TaskQueueV2", "startCumAckTimer() called with: seqNum = " + UByte.m948toStringimpl(seqNum));
        Control control = this.control;
        control.setRxCumAckIndex(control.getRxCumAckIndex() + 1);
        this.control.m865setRxCumAckSeqNum7apg3OU(seqNum);
        if (this.control.getRxCumAckTimerRunnable() == null) {
            Runnable runnable = new Runnable() { // from class: h1q
                @Override // java.lang.Runnable
                public final void run() {
                    TransportL1.startCumAckTimer_7apg3OU$lambda$7(this.f19586a);
                }
            };
            Handler handler = this.senderHandler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("senderHandler");
                handler = null;
            }
            handler.postDelayed(runnable, 500L);
            this.control.setRxCumAckTimerRunnable(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCumAckTimer_7apg3OU$lambda$7(TransportL1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CoreExtKt.getLogger().i("TaskQueueV2", "reply ack timer");
        byte rxCumAckSeqNum = this$0.control.getRxCumAckSeqNum();
        this$0.stopCumAckTimer();
        m859sendAckdjbwkw$default(this$0, rxCumAckSeqNum, true, false, 4, null);
    }

    private final void stopCumAckTimer() {
        CoreExtKt.getLogger().d("TaskQueueV2", "stopCumAckTimer() called");
        this.control.setRxCumAckIndex(0);
        this.control.m865setRxCumAckSeqNum7apg3OU((byte) 0);
        Runnable rxCumAckTimerRunnable = this.control.getRxCumAckTimerRunnable();
        if (rxCumAckTimerRunnable != null) {
            Handler handler = this.senderHandler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("senderHandler");
                handler = null;
            }
            handler.removeCallbacks(rxCumAckTimerRunnable);
        }
        this.control.setRxCumAckTimerRunnable(null);
    }

    public final boolean isQueueIdle() {
        return this.txQueue.isEmpty();
    }

    public final void onPacketReceive(@NotNull L1Packet packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        Logger logger = CoreExtKt.getLogger();
        String readableType = L1Packet.Header.INSTANCE.getReadableType(packet.getHeader().getType());
        String strM948toStringimpl = UByte.m948toStringimpl(packet.getHeader().getSeqNum());
        byte[] payload = packet.getPayload();
        int length = payload != null ? payload.length : 0;
        logger.i("TaskQueueV2", "-------------> RECEIVE: " + readableType + ": seq-> " + strM948toStringimpl + ", size:" + length + ", frx:" + ((int) packet.getHeader().getFrx()));
        byte type = packet.getHeader().getType();
        if (type == 1) {
            onACKReceive(packet, true);
            return;
        }
        if (type == 0) {
            onNAKReceive(packet);
        } else if (type == 2) {
            onCMDReceive(packet);
        } else if (type == 3) {
            onDataReceive(packet);
        }
    }

    public final void onSendComplete(@NotNull L1Packet packet) {
        Handler handler;
        SendItem sendItem;
        Intrinsics.checkNotNullParameter(packet, "packet");
        CoreExtKt.getLogger().i("TaskQueueV2", "onSendComplete() called with: packet: " + packet + ", thread: " + Thread.currentThread().getName());
        Iterator<SendItem> it = this.txQueue.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        do {
            handler = null;
            if (!it.hasNext()) {
                sendItem = null;
                break;
            } else {
                SendItem next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                sendItem = next;
            }
        } while (!Intrinsics.areEqual(sendItem.getPacket(), packet));
        if (sendItem != null) {
            if (needAck(sendItem.getPacket())) {
                sendTimerStart(sendItem);
                Callback callback = sendItem.getCallback();
                if (callback != null) {
                    Callback.DefaultImpls.onCallback$default(callback, sendItem.getId(), 0, null, 4, null);
                }
            } else {
                CoreExtKt.getLogger().i("TaskQueueV2", "onSendComplete() don't wait remove " + sendItem.getPacket());
                sendTimerStop(sendItem);
                this.txQueue.remove(sendItem);
            }
        }
        setStatus(TXState.TX_STATE_IDLE);
        Handler handler2 = this.senderHandler;
        if (handler2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("senderHandler");
        } else {
            handler = handler2;
        }
        handler.post(new Runnable() { // from class: g1q
            @Override // java.lang.Runnable
            public final void run() {
                TransportL1.onSendComplete$lambda$4(this.f18479a);
            }
        });
    }

    public final void resetConfig() {
        Handler handler = this.senderHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("senderHandler");
            handler = null;
        }
        handler.post(new Runnable() { // from class: i1q
            @Override // java.lang.Runnable
            public final void run() {
                TransportL1.resetConfig$lambda$14(this.f20668a);
            }
        });
    }

    public final int sendCmd(@NotNull CMDPacket.CMD cmd, @NotNull byte[] data, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(data, "data");
        final SendItem sendItem = new SendItem(new CMDPacket(cmd, data), 0, callback, 2, null);
        this.control.reset();
        Handler handler = this.senderHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("senderHandler");
            handler = null;
        }
        handler.post(new Runnable() { // from class: e1q
            @Override // java.lang.Runnable
            public final void run() {
                TransportL1.sendCmd$lambda$1(this.f16173a, sendItem);
            }
        });
        return sendItem.getId();
    }

    public final void sendPacket(@NotNull L2Packet l2packet, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(l2packet, "l2packet");
        if (l2packet.getPayload().length == 0) {
            CoreExtKt.getLogger().i("TaskQueueV2", "enqueuePacket: data length is 0");
            return;
        }
        if (l2packet.getPriority() < 0 || l2packet.getPriority() > 10) {
            CoreExtKt.getLogger().i("TaskQueueV2", "enqueuePacket: packet priority error");
            if (callback != null) {
                Callback.DefaultImpls.onCallback$default(callback, 0, -3, null, 4, null);
                return;
            }
            return;
        }
        if (l2packet.getPayload().length + 2 <= this.control.getRemoteMPS()) {
            final SendItem sendItem = new SendItem(new DataPacket(l2packet.getBytes()), l2packet.getPriority(), callback);
            Handler handler = this.senderHandler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("senderHandler");
                handler = null;
            }
            handler.post(new Runnable() { // from class: f1q
                @Override // java.lang.Runnable
                public final void run() {
                    TransportL1.sendPacket$lambda$0(this.f17303a, sendItem);
                }
            });
            return;
        }
        CoreExtKt.getLogger().i("TaskQueueV2", "enqueuePacket: input data too large " + (l2packet.getPayload().length + 2) + " , mps = 64512");
        if (callback != null) {
            Callback.DefaultImpls.onCallback$default(callback, 0, -3, null, 4, null);
        }
    }

    public final void sendStopRequest() {
    }

    public final void set(@NotNull TransportL0 transportL0, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(transportL0, "transportL0");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.layerL0 = transportL0;
        this.senderHandler = handler;
    }

    public final void setCmdDataReceiver(@NotNull CmdDataReceiver receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.cmdDataReceiver = receiver;
    }

    public final void setTaskDataReceiver(@NotNull TaskDataReceiver<L2Packet> receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.dataReceiver = receiver;
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010(\u001a\u00020)H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u001fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/TransportL1$SendItem;", "", "packet", "Lcom/xiaomi/wearable/transport/layerl1/L1Packet;", "priority", "", "callback", "Lcom/xiaomi/wearable/transport/Callback;", "<init>", "(Lcom/xiaomi/wearable/transport/layerl1/L1Packet;ILcom/xiaomi/wearable/transport/Callback;)V", "getPacket", "()Lcom/xiaomi/wearable/transport/layerl1/L1Packet;", "getPriority", "()I", "getCallback", "()Lcom/xiaomi/wearable/transport/Callback;", "id", "getId", "waitAck", "", "getWaitAck", "()Z", "setWaitAck", "(Z)V", "needRetransmission", "getNeedRetransmission", "setNeedRetransmission", "numberAssigned", "getNumberAssigned", "setNumberAssigned", "timeout", "", "getTimeout", "()J", "timeoutRunnable", "Ljava/lang/Runnable;", "getTimeoutRunnable", "()Ljava/lang/Runnable;", "setTimeoutRunnable", "(Ljava/lang/Runnable;)V", "toString", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SendItem {

        @Nullable
        private final Callback callback;
        private final int id;
        private boolean needRetransmission;
        private boolean numberAssigned;

        @NotNull
        private final L1Packet packet;
        private final int priority;
        private final long timeout;

        @Nullable
        private Runnable timeoutRunnable;
        private boolean waitAck;

        public SendItem(@NotNull L1Packet packet, int i, @Nullable Callback callback) {
            Intrinsics.checkNotNullParameter(packet, "packet");
            this.packet = packet;
            this.priority = i;
            this.callback = callback;
            this.id = TransportL1.INSTANCE.getSendItemId().getAndIncrement();
            this.timeout = 10000L;
        }

        @Nullable
        public final Callback getCallback() {
            return this.callback;
        }

        public final int getId() {
            return this.id;
        }

        public final boolean getNeedRetransmission() {
            return this.needRetransmission;
        }

        public final boolean getNumberAssigned() {
            return this.numberAssigned;
        }

        @NotNull
        public final L1Packet getPacket() {
            return this.packet;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final long getTimeout() {
            return this.timeout;
        }

        @Nullable
        public final Runnable getTimeoutRunnable() {
            return this.timeoutRunnable;
        }

        public final boolean getWaitAck() {
            return this.waitAck;
        }

        public final void setNeedRetransmission(boolean z) {
            this.needRetransmission = z;
        }

        public final void setNumberAssigned(boolean z) {
            this.numberAssigned = z;
        }

        public final void setTimeoutRunnable(@Nullable Runnable runnable) {
            this.timeoutRunnable = runnable;
        }

        public final void setWaitAck(boolean z) {
            this.waitAck = z;
        }

        @NotNull
        public String toString() {
            byte type = this.packet.getHeader().getType();
            return "packet type: " + ((int) type) + ", seq: " + UByte.m948toStringimpl(this.packet.getHeader().getSeqNum());
        }

        public /* synthetic */ SendItem(L1Packet l1Packet, int i, Callback callback, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(l1Packet, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : callback);
        }
    }
}
