package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/SleepSeverMedicationDetail;", "", "medicationName", "", "medicationSchedule", "", "medicationCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "getMedicationName", "()Ljava/lang/String;", "getMedicationSchedule", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMedicationCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isEmpty", "", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/persist/server/data/SleepSeverMedicationDetail;", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepSeverMedicationDetail {

    @SerializedName("medication_count")
    @Nullable
    private final Integer medicationCount;

    @SerializedName("medication_name")
    @Nullable
    private final String medicationName;

    @SerializedName("medication_schedule")
    @Nullable
    private final Long medicationSchedule;

    public SleepSeverMedicationDetail(@Nullable String str, @Nullable Long l, @Nullable Integer num) {
        this.medicationName = str;
        this.medicationSchedule = l;
        this.medicationCount = num;
    }

    public static /* synthetic */ SleepSeverMedicationDetail copy$default(SleepSeverMedicationDetail sleepSeverMedicationDetail, String str, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepSeverMedicationDetail.medicationName;
        }
        if ((i & 2) != 0) {
            l = sleepSeverMedicationDetail.medicationSchedule;
        }
        if ((i & 4) != 0) {
            num = sleepSeverMedicationDetail.medicationCount;
        }
        return sleepSeverMedicationDetail.copy(str, l, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMedicationName() {
        return this.medicationName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getMedicationSchedule() {
        return this.medicationSchedule;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMedicationCount() {
        return this.medicationCount;
    }

    @NotNull
    public final SleepSeverMedicationDetail copy(@Nullable String medicationName, @Nullable Long medicationSchedule, @Nullable Integer medicationCount) {
        return new SleepSeverMedicationDetail(medicationName, medicationSchedule, medicationCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepSeverMedicationDetail)) {
            return false;
        }
        SleepSeverMedicationDetail sleepSeverMedicationDetail = (SleepSeverMedicationDetail) other;
        return Intrinsics.areEqual(this.medicationName, sleepSeverMedicationDetail.medicationName) && Intrinsics.areEqual(this.medicationSchedule, sleepSeverMedicationDetail.medicationSchedule) && Intrinsics.areEqual(this.medicationCount, sleepSeverMedicationDetail.medicationCount);
    }

    @Nullable
    public final Integer getMedicationCount() {
        return this.medicationCount;
    }

    @Nullable
    public final String getMedicationName() {
        return this.medicationName;
    }

    @Nullable
    public final Long getMedicationSchedule() {
        return this.medicationSchedule;
    }

    public int hashCode() {
        String str = this.medicationName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.medicationSchedule;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.medicationCount;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.medicationName == null && this.medicationSchedule == null && this.medicationCount == null;
    }

    @NotNull
    public String toString() {
        return "SleepSeverMedicationDetail(medicationName=" + this.medicationName + ", medicationSchedule=" + this.medicationSchedule + ", medicationCount=" + this.medicationCount + ")";
    }
}
