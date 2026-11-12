package com.xiaomi.wearable.transport.queue;

import com.xiaomi.wearable.core.WearApiResult;
import com.xiaomi.wearable.core.WearApiTask;
import com.xiaomi.wearable.wear.api.Callback;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import com.xiaomi.wearable.wear.api.ThirdPartyApiCall;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/wearable/transport/queue/ThirdPartyTaskQueue;", "Lcom/xiaomi/wearable/transport/queue/TaskQueueV1;", "Lcom/xiaomi/wearable/transport/queue/Messenger$DataReceiver;", "thirdPartyApiCall", "Lcom/xiaomi/wearable/wear/api/ThirdPartyApiCall;", "thirdPartyApi", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "<init>", "(Lcom/xiaomi/wearable/wear/api/ThirdPartyApiCall;Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;)V", "run", "", "apiTask", "Lcom/xiaomi/wearable/core/WearApiTask;", "onDataReceive", "type", "", "data", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdPartyTaskQueue extends TaskQueueV1 implements Messenger.DataReceiver {

    @NotNull
    private final IDeviceApiCall thirdPartyApi;

    @NotNull
    private final ThirdPartyApiCall thirdPartyApiCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdPartyTaskQueue(@NotNull ThirdPartyApiCall thirdPartyApiCall, @NotNull IDeviceApiCall thirdPartyApi) {
        super(thirdPartyApiCall);
        Intrinsics.checkNotNullParameter(thirdPartyApiCall, "thirdPartyApiCall");
        Intrinsics.checkNotNullParameter(thirdPartyApi, "thirdPartyApi");
        this.thirdPartyApiCall = thirdPartyApiCall;
        this.thirdPartyApi = thirdPartyApi;
        enableParallel();
        Messenger messenger = thirdPartyApi.getMessenger();
        if (messenger != null) {
            messenger.setDataReceiver(this);
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.Messenger.DataReceiver
    public void onDataReceive(int type, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.thirdPartyApiCall.handleData(type, data);
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV1, com.xiaomi.wearable.transport.queue.TaskRunnable
    public void run(@NotNull final WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        super.run(apiTask);
        Messenger messenger = this.thirdPartyApi.getMessenger();
        if (messenger != null) {
            int type = apiTask.getType();
            byte[] data = apiTask.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            messenger.call(type, data, new Callback() { // from class: com.xiaomi.wearable.transport.queue.ThirdPartyTaskQueue.run.1
                @Override // com.xiaomi.wearable.wear.api.Callback
                public void onCallback(WearApiResult result) {
                    apiTask.onSendResult(result != null ? result.a() : -2);
                }
            }, apiTask.getTimeout());
        }
    }
}
