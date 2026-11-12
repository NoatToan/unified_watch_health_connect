package com.xiaomi.fit.fitness.export.data.project;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/project/SleepMedicationDetail;", "Ljava/io/Serializable;", "medicationName", "", "medicationSchedule", "", "medicationCount", "", "<init>", "(Ljava/lang/String;JI)V", "getMedicationName", "()Ljava/lang/String;", "getMedicationSchedule", "()J", "getMedicationCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepMedicationDetail implements Serializable {
    private final int medicationCount;

    @NotNull
    private final String medicationName;
    private final long medicationSchedule;

    public SleepMedicationDetail(@NotNull String medicationName, long j, int i) {
        Intrinsics.checkNotNullParameter(medicationName, "medicationName");
        this.medicationName = medicationName;
        this.medicationSchedule = j;
        this.medicationCount = i;
    }

    public static /* synthetic */ SleepMedicationDetail copy$default(SleepMedicationDetail sleepMedicationDetail, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sleepMedicationDetail.medicationName;
        }
        if ((i2 & 2) != 0) {
            j = sleepMedicationDetail.medicationSchedule;
        }
        if ((i2 & 4) != 0) {
            i = sleepMedicationDetail.medicationCount;
        }
        return sleepMedicationDetail.copy(str, j, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMedicationName() {
        return this.medicationName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMedicationSchedule() {
        return this.medicationSchedule;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMedicationCount() {
        return this.medicationCount;
    }

    @NotNull
    public final SleepMedicationDetail copy(@NotNull String medicationName, long medicationSchedule, int medicationCount) {
        Intrinsics.checkNotNullParameter(medicationName, "medicationName");
        return new SleepMedicationDetail(medicationName, medicationSchedule, medicationCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepMedicationDetail)) {
            return false;
        }
        SleepMedicationDetail sleepMedicationDetail = (SleepMedicationDetail) other;
        return Intrinsics.areEqual(this.medicationName, sleepMedicationDetail.medicationName) && this.medicationSchedule == sleepMedicationDetail.medicationSchedule && this.medicationCount == sleepMedicationDetail.medicationCount;
    }

    public final int getMedicationCount() {
        return this.medicationCount;
    }

    @NotNull
    public final String getMedicationName() {
        return this.medicationName;
    }

    public final long getMedicationSchedule() {
        return this.medicationSchedule;
    }

    public int hashCode() {
        return (((this.medicationName.hashCode() * 31) + Long.hashCode(this.medicationSchedule)) * 31) + Integer.hashCode(this.medicationCount);
    }

    @NotNull
    public String toString() {
        return "SleepMedicationDetail(medicationName=" + this.medicationName + ", medicationSchedule=" + this.medicationSchedule + ", medicationCount=" + this.medicationCount + ")";
    }
}
