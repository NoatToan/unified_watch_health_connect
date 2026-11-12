package com.xiaomi.wearable.transport.queue;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.wearable.ChannelInfo;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.WearApiTask;
import com.xiaomi.wearable.spp.b;
import com.xiaomi.wearable.transport.Callback;
import com.xiaomi.wearable.transport.TransportV1;
import com.xiaomi.wearable.transport.layerl0.SppChannel;
import defpackage.izc;
import defpackage.m7o;
import defpackage.x6o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001-B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u0010,J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/xiaomi/wearable/transport/queue/SppTaskQueueV1;", "Lcom/xiaomi/wearable/transport/queue/TaskQueueV1;", "Lcom/xiaomi/wearable/transport/queue/TaskDataReceiver;", "Lcom/xiaomi/wearable/spp/b;", "Lcom/xiaomi/wearable/core/WearApiTask;", "apiTask", "buildSppPacket", "(Lcom/xiaomi/wearable/core/WearApiTask;)Lcom/xiaomi/wearable/spp/b;", "", "getDataType", "(Lcom/xiaomi/wearable/core/WearApiTask;)B", "", "channelType", "dataType", "", "data", "", "dispatchMessage", "(II[B)V", "run", "(Lcom/xiaomi/wearable/core/WearApiTask;)V", "getData", "(Lcom/xiaomi/wearable/core/WearApiTask;)[B", "onReceiveData", "(Lcom/xiaomi/wearable/spp/b;)V", "open", "()V", "Lcom/xiaomi/wearable/ChannelInfo;", "channelInfo", "writeToChannel", "(Lcom/xiaomi/wearable/ChannelInfo;[B)V", "reason", Constants.EXTRA_CLOSE_TAI, "(I)V", "Lx6o;", "sppApiCall", "Lx6o;", "Lcom/xiaomi/wearable/transport/TransportV1;", "transportV1", "Lcom/xiaomi/wearable/transport/TransportV1;", "Lcom/xiaomi/wearable/transport/layerl0/SppChannel;", "channel", "Lcom/xiaomi/wearable/transport/layerl0/SppChannel;", "<init>", "(Lx6o;)V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class SppTaskQueueV1 extends TaskQueueV1 implements TaskDataReceiver<b> {

    @NotNull
    private static final String TAG = "SppTaskQueue";

    @NotNull
    private SppChannel channel;

    @NotNull
    private final x6o sppApiCall;

    @NotNull
    private TransportV1 transportV1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SppTaskQueueV1(@NotNull x6o sppApiCall) {
        super(sppApiCall);
        Intrinsics.checkNotNullParameter(sppApiCall, "sppApiCall");
        this.sppApiCall = sppApiCall;
        this.transportV1 = new TransportV1();
        izc izcVarD = sppApiCall.d();
        Intrinsics.checkNotNullExpressionValue(izcVarD, "getSppClient(...)");
        this.channel = new SppChannel(izcVarD);
        this.transportV1.setTaskDataReceiver(this);
        this.transportV1.setChannel(this.channel);
        enableParallel();
    }

    private final b buildSppPacket(WearApiTask apiTask) {
        byte dataType = getDataType(apiTask);
        byte[] data = getData(apiTask);
        if (data != null && dataType == 1) {
            data = this.sppApiCall.encryptData(apiTask.getType(), data);
        }
        if (data == null) {
            apiTask.onSendResult(-2);
            return null;
        }
        int iF = m7o.f(apiTask.getType());
        return new b.a().b(iF).e(false).g(m7o.b()).c(dataType).d(1).f(iF == 0 ? 0 : 2).h(data).a();
    }

    private final void dispatchMessage(int channelType, int dataType, byte[] data) {
        CoreExtKt.getLogger().i(TAG, "dispatchMessage:channelType:" + channelType + " dataType:" + dataType + ", data size " + (data != null ? Integer.valueOf(data.length) : null));
        if (data != null && dataType == 1) {
            data = this.sppApiCall.decryptData(channelType, data);
        }
        if (data == null) {
            CoreExtKt.getLogger().i(TAG, "dispatchMessage:data is null");
        } else if (dataType == 2 && channelType == 101) {
            dispatchMessage(100, data);
        } else {
            this.sppApiCall.handleData(channelType, data);
        }
    }

    private final byte getDataType(WearApiTask apiTask) {
        switch (apiTask.getType()) {
            case 100:
                return (byte) 2;
            case 101:
            case 104:
            case 105:
            case 106:
                return (byte) 1;
            case 102:
            case 103:
            default:
                return (byte) 0;
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV1, com.xiaomi.wearable.transport.queue.ITaskQueue
    public void close(int reason) {
        super.close(reason);
        this.transportV1.reset();
        this.channel.close();
    }

    @Nullable
    public final byte[] getData(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        return apiTask.getData();
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV1, com.xiaomi.wearable.transport.queue.ITaskQueue
    public void open() {
        super.open();
        this.channel.open();
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV1, com.xiaomi.wearable.transport.queue.TaskRunnable
    public void run(@NotNull final WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        CoreExtKt.getLogger().d(TAG, "run() called with: apiTask = [" + apiTask + "]");
        super.run(apiTask);
        b bVarBuildSppPacket = buildSppPacket(apiTask);
        if (bVarBuildSppPacket == null) {
            return;
        }
        this.transportV1.sendPacket(bVarBuildSppPacket, new Callback() { // from class: com.xiaomi.wearable.transport.queue.SppTaskQueueV1.run.1
            @Override // com.xiaomi.wearable.transport.Callback
            public void onCallback(int packetId, int code, String message) {
                if (apiTask.isCanceled()) {
                    return;
                }
                CoreExtKt.getLogger().d(SppTaskQueueV1.TAG, "send data,code:" + code + " message:" + message);
                if (code == -3) {
                    apiTask.onSendResult(-4);
                    return;
                }
                if (code == -2) {
                    apiTask.onSendResult(-1);
                } else if (code != 0) {
                    apiTask.onSendResult(-2);
                } else {
                    apiTask.onSendResult(0);
                }
            }
        });
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV1, com.xiaomi.wearable.ChannelWriter
    public void writeToChannel(@Nullable ChannelInfo channelInfo, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.channel.onDataReceived(data);
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskDataReceiver
    public void onReceiveData(@NotNull b data) {
        Intrinsics.checkNotNullParameter(data, "data");
        dispatchMessage(m7o.e(data.j()), data.k(), data.n());
    }
}
