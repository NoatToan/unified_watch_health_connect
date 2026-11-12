package com.xiaomi.fitness.health.sleep.rhythm;

import com.xiaomi.fitness.common.DeviceResultCode;
import defpackage.ut9;
import defpackage.vt9;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/ISleepRhythmCallback;", "", "", "resultCode", "Lut9;", "sleepDisorder", "", "onSleepRhythmRemindResult", "(ILut9;)V", "Lvt9;", "sleepRegularity", "onSleepRhythmMonitorResult", "(ILvt9;)V", "", "boolean", "updateRhythmRemindResult", "(IZ)V", "cycleDays", "updateSleepRhythmMonitorResult", "(II)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface ISleepRhythmCallback {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onSleepRhythmMonitorResult(@NotNull ISleepRhythmCallback iSleepRhythmCallback, int i, @Nullable vt9 vt9Var) {
        }

        public static void onSleepRhythmRemindResult(@NotNull ISleepRhythmCallback iSleepRhythmCallback, int i, @Nullable ut9 ut9Var) {
        }

        public static void updateRhythmRemindResult(@NotNull ISleepRhythmCallback iSleepRhythmCallback, @DeviceResultCode int i, boolean z) {
        }

        public static void updateSleepRhythmMonitorResult(@NotNull ISleepRhythmCallback iSleepRhythmCallback, @DeviceResultCode int i, int i2) {
        }
    }

    void onSleepRhythmMonitorResult(int resultCode, @Nullable vt9 sleepRegularity);

    void onSleepRhythmRemindResult(int resultCode, @Nullable ut9 sleepDisorder);

    void updateRhythmRemindResult(@DeviceResultCode int resultCode, boolean z);

    void updateSleepRhythmMonitorResult(@DeviceResultCode int resultCode, int cycleDays);
}
