package com.xiaomi.fitness.eco.device.model.api;

import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.sh7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceBinder;", "", "Lsh7;", "callback", "", "bind", "(Lsh7;)V", "rebind", "", "unbind", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revokeAuthorization", BroadcastsKt.SILENT_PUSHING_CANCEL, "()V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface EcoDeviceBinder {
    void bind(@Nullable sh7 callback);

    void cancel();

    void rebind(@Nullable sh7 callback);

    @Nullable
    Object revokeAuthorization(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object unbind(@NotNull Continuation<? super Integer> continuation);
}
