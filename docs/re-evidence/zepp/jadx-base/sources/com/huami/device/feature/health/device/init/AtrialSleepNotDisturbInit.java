package com.huami.device.feature.health.device.init;

import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/huami/device/feature/health/device/init/AtrialSleepNotDisturbInit;", "Lcom/huami/device/feature/health/device/init/BaseHealthInit;", "", "isEnable", WatchFaceArrivingEvent.CMD_SET, "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/device/feature/health/model/HealthSettingData;", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class AtrialSleepNotDisturbInit extends BaseHealthInit {
    @Nullable
    public abstract Object get(@NotNull Continuation<? super HealthSettingData<Boolean>> continuation);

    @Nullable
    public abstract Object set(boolean z, @NotNull Continuation<? super Boolean> continuation);
}
