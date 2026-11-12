package com.xiaomi.fitness.health.sleep.rhythm.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmRemindConfig;", "", "isEnable", "", "dayRemindCount", "", "remindTimes", "", "<init>", "(ZILjava/util/List;)V", "()Z", "setEnable", "(Z)V", "getDayRemindCount", "()I", "setDayRemindCount", "(I)V", "getRemindTimes", "()Ljava/util/List;", "setRemindTimes", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepRhythmRemindConfig {
    private int dayRemindCount;
    private boolean isEnable;

    @NotNull
    private List<Integer> remindTimes;

    public SleepRhythmRemindConfig(boolean z, int i, @NotNull List<Integer> remindTimes) {
        Intrinsics.checkNotNullParameter(remindTimes, "remindTimes");
        this.isEnable = z;
        this.dayRemindCount = i;
        this.remindTimes = remindTimes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepRhythmRemindConfig copy$default(SleepRhythmRemindConfig sleepRhythmRemindConfig, boolean z, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = sleepRhythmRemindConfig.isEnable;
        }
        if ((i2 & 2) != 0) {
            i = sleepRhythmRemindConfig.dayRemindCount;
        }
        if ((i2 & 4) != 0) {
            list = sleepRhythmRemindConfig.remindTimes;
        }
        return sleepRhythmRemindConfig.copy(z, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDayRemindCount() {
        return this.dayRemindCount;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.remindTimes;
    }

    @NotNull
    public final SleepRhythmRemindConfig copy(boolean isEnable, int dayRemindCount, @NotNull List<Integer> remindTimes) {
        Intrinsics.checkNotNullParameter(remindTimes, "remindTimes");
        return new SleepRhythmRemindConfig(isEnable, dayRemindCount, remindTimes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepRhythmRemindConfig)) {
            return false;
        }
        SleepRhythmRemindConfig sleepRhythmRemindConfig = (SleepRhythmRemindConfig) other;
        return this.isEnable == sleepRhythmRemindConfig.isEnable && this.dayRemindCount == sleepRhythmRemindConfig.dayRemindCount && Intrinsics.areEqual(this.remindTimes, sleepRhythmRemindConfig.remindTimes);
    }

    public final int getDayRemindCount() {
        return this.dayRemindCount;
    }

    @NotNull
    public final List<Integer> getRemindTimes() {
        return this.remindTimes;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isEnable) * 31) + Integer.hashCode(this.dayRemindCount)) * 31) + this.remindTimes.hashCode();
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final void setDayRemindCount(int i) {
        this.dayRemindCount = i;
    }

    public final void setEnable(boolean z) {
        this.isEnable = z;
    }

    public final void setRemindTimes(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.remindTimes = list;
    }

    @NotNull
    public String toString() {
        return "SleepRhythmRemindConfig(isEnable=" + this.isEnable + ", dayRemindCount=" + this.dayRemindCount + ", remindTimes=" + this.remindTimes + ")";
    }
}
