package com.xiaomi.fitness.health.sleep.rhythm.diary;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/MedicationBeforeSleep;", "", "medicationName", "", "medicationTime", "", "medicationCount", "", "<init>", "(Ljava/lang/String;JI)V", "getMedicationName", "()Ljava/lang/String;", "getMedicationTime", "()J", "getMedicationCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MedicationBeforeSleep {
    private final int medicationCount;

    @NotNull
    private final String medicationName;
    private final long medicationTime;

    public MedicationBeforeSleep(@NotNull String medicationName, long j, int i) {
        Intrinsics.checkNotNullParameter(medicationName, "medicationName");
        this.medicationName = medicationName;
        this.medicationTime = j;
        this.medicationCount = i;
    }

    public static /* synthetic */ MedicationBeforeSleep copy$default(MedicationBeforeSleep medicationBeforeSleep, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = medicationBeforeSleep.medicationName;
        }
        if ((i2 & 2) != 0) {
            j = medicationBeforeSleep.medicationTime;
        }
        if ((i2 & 4) != 0) {
            i = medicationBeforeSleep.medicationCount;
        }
        return medicationBeforeSleep.copy(str, j, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMedicationName() {
        return this.medicationName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMedicationTime() {
        return this.medicationTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMedicationCount() {
        return this.medicationCount;
    }

    @NotNull
    public final MedicationBeforeSleep copy(@NotNull String medicationName, long medicationTime, int medicationCount) {
        Intrinsics.checkNotNullParameter(medicationName, "medicationName");
        return new MedicationBeforeSleep(medicationName, medicationTime, medicationCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedicationBeforeSleep)) {
            return false;
        }
        MedicationBeforeSleep medicationBeforeSleep = (MedicationBeforeSleep) other;
        return Intrinsics.areEqual(this.medicationName, medicationBeforeSleep.medicationName) && this.medicationTime == medicationBeforeSleep.medicationTime && this.medicationCount == medicationBeforeSleep.medicationCount;
    }

    public final int getMedicationCount() {
        return this.medicationCount;
    }

    @NotNull
    public final String getMedicationName() {
        return this.medicationName;
    }

    public final long getMedicationTime() {
        return this.medicationTime;
    }

    public int hashCode() {
        return (((this.medicationName.hashCode() * 31) + Long.hashCode(this.medicationTime)) * 31) + Integer.hashCode(this.medicationCount);
    }

    @NotNull
    public String toString() {
        return "MedicationBeforeSleep(medicationName=" + this.medicationName + ", medicationTime=" + this.medicationTime + ", medicationCount=" + this.medicationCount + ")";
    }
}
