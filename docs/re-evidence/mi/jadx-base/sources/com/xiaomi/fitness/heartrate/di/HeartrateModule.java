package com.xiaomi.fitness.heartrate.di;

import com.xiaomi.fitness.heartrate.HeartrateMeasurerImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/heartrate/di/HeartrateModule;", "", "<init>", "()V", "bindHeartrateMeasurer", "heartrateMeasurer", "Lcom/xiaomi/fitness/heartrate/HeartrateMeasurerImpl;", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HeartrateModule {
    @NotNull
    public abstract Object bindHeartrateMeasurer(@NotNull HeartrateMeasurerImpl heartrateMeasurer);
}
