package com.xiaomi.wearable.transport;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.transport.layerl0.TransportL0;
import com.xiaomi.wearable.transport.layerl1.CMDPacket;
import com.xiaomi.wearable.transport.layerl1.TransportL1;
import com.xiaomi.wearable.transport.layerl2.L2Packet;
import com.xiaomi.wearable.transport.queue.CmdDataReceiver;
import com.xiaomi.wearable.transport.queue.TaskDataReceiver;
import defpackage.snr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000f\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u001a\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\u0016\u0010\u001a\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\""}, d2 = {"Lcom/xiaomi/wearable/transport/TransportV2;", "Lcom/xiaomi/wearable/transport/ITransport;", "Lcom/xiaomi/wearable/transport/layerl2/L2Packet;", "Lcom/xiaomi/wearable/transport/queue/CmdDataReceiver;", "<init>", "()V", "layerL1", "Lcom/xiaomi/wearable/transport/layerl1/TransportL1;", "layerL0", "Lcom/xiaomi/wearable/transport/layerl0/TransportL0;", "cmdCallback", "Lcom/xiaomi/wearable/transport/Callback;", "transportHandler", "Landroid/os/Handler;", "mainHandler", "com/xiaomi/wearable/transport/TransportV2$mainHandler$1", "Lcom/xiaomi/wearable/transport/TransportV2$mainHandler$1;", "init", "", "prepare", "callback", "sendCmd", "onCmdTimeout", "sendPacket", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "onCmdReceive", "setTaskDataReceiver", "receiver", "Lcom/xiaomi/wearable/transport/queue/TaskDataReceiver;", "setChannel", "channel", "Lcom/xiaomi/wearable/transport/Channel;", "reset", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransportV2 implements ITransport<L2Packet>, CmdDataReceiver {
    public static final int CMD_TIMEOUT = 200;

    @NotNull
    private static final String TAG = "TransportV2";

    @Nullable
    private Callback cmdCallback;

    @NotNull
    private final TransportV2$mainHandler$1 mainHandler;

    @NotNull
    private final TransportL1 layerL1 = new TransportL1();

    @NotNull
    private final TransportL0 layerL0 = new TransportL0();

    @NotNull
    private final Handler transportHandler = new Handler(snr.a());

    /* JADX WARN: Type inference failed for: r1v1, types: [com.xiaomi.wearable.transport.TransportV2$mainHandler$1] */
    public TransportV2() {
        final Looper mainLooper = Looper.getMainLooper();
        this.mainHandler = new Handler(mainLooper) { // from class: com.xiaomi.wearable.transport.TransportV2$mainHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.this$0.onCmdTimeout();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCmdTimeout() {
        CoreExtKt.getLogger().i(TAG, "onCmdTimeout() called, callback " + this.cmdCallback);
        Callback callback = this.cmdCallback;
        if (callback != null) {
            callback.onCallback(0, -4, "cmd timeout");
        }
    }

    private final void sendCmd() {
        this.layerL1.sendCmd(CMDPacket.CMD.CMD_L1START_REQ, CMDPacket.INSTANCE.createCmdData(), this.cmdCallback);
        TransportV2$mainHandler$1 transportV2$mainHandler$1 = this.mainHandler;
        transportV2$mainHandler$1.sendMessageDelayed(transportV2$mainHandler$1.obtainMessage(200), 10000L);
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void init() {
        this.layerL1.set(this.layerL0, this.transportHandler);
        this.layerL1.setCmdDataReceiver(this);
        this.layerL0.set(this.layerL1, this.transportHandler);
    }

    @Override // com.xiaomi.wearable.transport.queue.CmdDataReceiver
    public void onCmdReceive() {
        removeMessages(200);
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void prepare(@Nullable Callback callback) {
        this.cmdCallback = callback;
        sendCmd();
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void reset() {
        this.layerL1.resetConfig();
        this.layerL0.resetConfig();
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void setChannel(@NotNull Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.layerL0.setChannel(channel);
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void setTaskDataReceiver(@NotNull TaskDataReceiver<L2Packet> receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.layerL1.setTaskDataReceiver(receiver);
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void sendPacket(@NotNull L2Packet p, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(p, "p");
        this.layerL1.sendPacket(p, callback);
    }
}
