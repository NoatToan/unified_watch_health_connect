package com.xiaomi.fitness.device.model.api;

import com.xiaomi.fitness.device.manager.a;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/device/model/api/DeviceBinder;", "", "", "from", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "", "bind", "(ILcom/xiaomi/fitness/device/manager/a;)V", "rebind", "(Lcom/xiaomi/fitness/device/manager/a;)V", "unbind", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revokeAuthorization", BroadcastsKt.SILENT_PUSHING_CANCEL, "()V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface DeviceBinder {
    void bind(int from, @Nullable a callback);

    void cancel();

    void rebind(@Nullable a callback);

    @Nullable
    Object revokeAuthorization(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object unbind(@NotNull Continuation<? super Integer> continuation);
}
