package com.xiaomi.fitness.health.bloodpressure.device;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/device/BloodPressureDeviceHelper;", "", "<init>", "()V", "getDeviceBloodPressureToLocal", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodPressureDeviceHelper {

    @NotNull
    public static final BloodPressureDeviceHelper INSTANCE = new BloodPressureDeviceHelper();

    private BloodPressureDeviceHelper() {
    }

    @Nullable
    public final Object getDeviceBloodPressureToLocal(@NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
