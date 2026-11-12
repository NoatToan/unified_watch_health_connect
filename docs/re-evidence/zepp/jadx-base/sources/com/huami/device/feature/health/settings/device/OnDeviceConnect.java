package com.huami.device.feature.health.settings.device;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lcom/huami/device/feature/health/settings/device/OnDeviceConnect;", "", "", "onDeviceBound", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDeviceConnect", "health-base_release"}, k = 1, mv = {1, 5, 1})
public interface OnDeviceConnect {
    @Nullable
    Object onDeviceBound(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object onDeviceConnect(@NotNull Continuation<? super Unit> continuation);
}
