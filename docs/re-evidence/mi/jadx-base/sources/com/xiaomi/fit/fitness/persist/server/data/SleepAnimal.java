package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.annotation.SleepAnimalType;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/SleepAnimal;", "", "type", "", "sampleDates", "", "", "statTime", "<init>", "(ILjava/util/List;J)V", "getType", "()I", "getSampleDates", "()Ljava/util/List;", "getStatTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepAnimal {

    @SerializedName("sample_dates")
    @Nullable
    private final List<Long> sampleDates;

    @SerializedName("stat_time")
    private final long statTime;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_TYPE)
    private final int type;

    public SleepAnimal(@SleepAnimalType int i, @Nullable List<Long> list, long j) {
        this.type = i;
        this.sampleDates = list;
        this.statTime = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepAnimal copy$default(SleepAnimal sleepAnimal, int i, List list, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sleepAnimal.type;
        }
        if ((i2 & 2) != 0) {
            list = sleepAnimal.sampleDates;
        }
        if ((i2 & 4) != 0) {
            j = sleepAnimal.statTime;
        }
        return sleepAnimal.copy(i, list, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    public final List<Long> component2() {
        return this.sampleDates;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStatTime() {
        return this.statTime;
    }

    @NotNull
    public final SleepAnimal copy(@SleepAnimalType int type, @Nullable List<Long> sampleDates, long statTime) {
        return new SleepAnimal(type, sampleDates, statTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepAnimal)) {
            return false;
        }
        SleepAnimal sleepAnimal = (SleepAnimal) other;
        return this.type == sleepAnimal.type && Intrinsics.areEqual(this.sampleDates, sleepAnimal.sampleDates) && this.statTime == sleepAnimal.statTime;
    }

    @Nullable
    public final List<Long> getSampleDates() {
        return this.sampleDates;
    }

    public final long getStatTime() {
        return this.statTime;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        List<Long> list = this.sampleDates;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Long.hashCode(this.statTime);
    }

    @NotNull
    public String toString() {
        return "SleepAnimal(type=" + this.type + ", sampleDates=" + this.sampleDates + ", statTime=" + this.statTime + ")";
    }
}
