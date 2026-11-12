package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.annotation.SleepRhythmType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/SleepRhythm;", "", "cycleDay", "", "type", "<init>", "(II)V", "getCycleDay", "()I", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepRhythm {

    @SerializedName("cycle_day")
    private final int cycleDay;

    @SerializedName("status")
    private final int type;

    public SleepRhythm(int i, @SleepRhythmType int i2) {
        this.cycleDay = i;
        this.type = i2;
    }

    public static /* synthetic */ SleepRhythm copy$default(SleepRhythm sleepRhythm, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sleepRhythm.cycleDay;
        }
        if ((i3 & 2) != 0) {
            i2 = sleepRhythm.type;
        }
        return sleepRhythm.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCycleDay() {
        return this.cycleDay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final SleepRhythm copy(int cycleDay, @SleepRhythmType int type) {
        return new SleepRhythm(cycleDay, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepRhythm)) {
            return false;
        }
        SleepRhythm sleepRhythm = (SleepRhythm) other;
        return this.cycleDay == sleepRhythm.cycleDay && this.type == sleepRhythm.type;
    }

    public final int getCycleDay() {
        return this.cycleDay;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.cycleDay) * 31) + Integer.hashCode(this.type);
    }

    @NotNull
    public String toString() {
        return "SleepRhythm(cycleDay=" + this.cycleDay + ", type=" + this.type + ")";
    }
}
