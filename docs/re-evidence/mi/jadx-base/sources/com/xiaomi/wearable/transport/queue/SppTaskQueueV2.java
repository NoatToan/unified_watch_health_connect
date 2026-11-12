package com.xiaomi.wearable.transport.queue;

import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.WearApiTask;
import com.xiaomi.wearable.transport.Callback;
import com.xiaomi.wearable.transport.Channel;
import com.xiaomi.wearable.transport.layerl0.SppChannel;
import com.xiaomi.wearable.transport.queue.SppTaskQueueV2;
import defpackage.izc;
import defpackage.x6o;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u001b\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/wearable/transport/queue/SppTaskQueueV2;", "Lcom/xiaomi/wearable/transport/queue/TaskQueueV2;", "Lcom/xiaomi/wearable/core/WearApiTask;", "apiTask", "", "enqueue", "(Lcom/xiaomi/wearable/core/WearApiTask;)V", "open", "()V", "", "data", "handleVersion", "([B)V", "Lcom/xiaomi/wearable/transport/Channel;", "initTaskChannel", "()Lcom/xiaomi/wearable/transport/Channel;", "Lx6o;", "sppApiCall", "Lx6o;", "getSppApiCall", "()Lx6o;", "Lizc;", "kotlin.jvm.PlatformType", "sppClient$delegate", "Lkotlin/Lazy;", "getSppClient", "()Lizc;", "sppClient", "<init>", "(Lx6o;)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class SppTaskQueueV2 extends TaskQueueV2 {

    @NotNull
    private final x6o sppApiCall;

    /* JADX INFO: renamed from: sppClient$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sppClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SppTaskQueueV2(@NotNull x6o sppApiCall) {
        super(sppApiCall);
        Intrinsics.checkNotNullParameter(sppApiCall, "sppApiCall");
        this.sppApiCall = sppApiCall;
        this.sppClient = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l7o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SppTaskQueueV2.sppClient_delegate$lambda$0(this.f24748a);
            }
        });
    }

    private final izc getSppClient() {
        return (izc) this.sppClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final izc sppClient_delegate$lambda$0(SppTaskQueueV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.sppApiCall.d();
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV2, com.xiaomi.wearable.transport.queue.ITaskQueue
    public void enqueue(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        super.enqueue(apiTask);
    }

    @NotNull
    public final x6o getSppApiCall() {
        return this.sppApiCall;
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV2
    public void handleVersion(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV2
    @NotNull
    public Channel initTaskChannel() {
        izc sppClient = getSppClient();
        Intrinsics.checkNotNullExpressionValue(sppClient, "<get-sppClient>(...)");
        return new SppChannel(sppClient);
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV2, com.xiaomi.wearable.transport.queue.ITaskQueue
    public void open() {
        super.open();
        sendStartRequest(new Callback() { // from class: com.xiaomi.wearable.transport.queue.SppTaskQueueV2.open.1
            @Override // com.xiaomi.wearable.transport.Callback
            public void onCallback(int packetId, int code, String message) {
                CoreExtKt.getLogger().d("TaskQueueV2", "onCallback() called with: packetId = " + packetId + ", code = " + code + ", message = " + message);
                if (code == -4) {
                    SppTaskQueueV2.this.close(-13);
                }
            }
        });
    }
}
