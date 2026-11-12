package com.huami.bloodpressure_ui.chart;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJD\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u000f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000b¨\u0006,"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureAvgDataStyleStatus;", "Lcom/huami/bloodpressure_ui/chart/BloodPressureStatus;", "", "component1", "Lcom/huami/bloodpressure_ui/chart/BloodPressureValueStyleVo;", "component2", "component3", "", "component4", "", "component5", "()Ljava/lang/Long;", "dateString", "firstValue", "secondValue", "showDetail", "dataTimeStamp", "copy", "(Ljava/lang/String;Lcom/huami/bloodpressure_ui/chart/BloodPressureValueStyleVo;Lcom/huami/bloodpressure_ui/chart/BloodPressureValueStyleVo;ZLjava/lang/Long;)Lcom/huami/bloodpressure_ui/chart/BloodPressureAvgDataStyleStatus;", "toString", "", "hashCode", "", "other", "equals", "b", "Ljava/lang/String;", "getDateString", "()Ljava/lang/String;", "c", "Lcom/huami/bloodpressure_ui/chart/BloodPressureValueStyleVo;", "getFirstValue", "()Lcom/huami/bloodpressure_ui/chart/BloodPressureValueStyleVo;", GoogleApiAvailabilityLight.a, "getSecondValue", "e", "Z", "getShowDetail", "()Z", "f", "Ljava/lang/Long;", "getDataTimeStamp", "<init>", "(Ljava/lang/String;Lcom/huami/bloodpressure_ui/chart/BloodPressureValueStyleVo;Lcom/huami/bloodpressure_ui/chart/BloodPressureValueStyleVo;ZLjava/lang/Long;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureAvgDataStyleStatus extends BloodPressureStatus {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String dateString;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final BloodPressureValueStyleVo firstValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final BloodPressureValueStyleVo secondValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean showDetail;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long dataTimeStamp;

    public /* synthetic */ BloodPressureAvgDataStyleStatus(String str, BloodPressureValueStyleVo bloodPressureValueStyleVo, BloodPressureValueStyleVo bloodPressureValueStyleVo2, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bloodPressureValueStyleVo, bloodPressureValueStyleVo2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : l);
    }

    public static /* synthetic */ BloodPressureAvgDataStyleStatus copy$default(BloodPressureAvgDataStyleStatus bloodPressureAvgDataStyleStatus, String str, BloodPressureValueStyleVo bloodPressureValueStyleVo, BloodPressureValueStyleVo bloodPressureValueStyleVo2, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bloodPressureAvgDataStyleStatus.dateString;
        }
        if ((i & 2) != 0) {
            bloodPressureValueStyleVo = bloodPressureAvgDataStyleStatus.firstValue;
        }
        BloodPressureValueStyleVo bloodPressureValueStyleVo3 = bloodPressureValueStyleVo;
        if ((i & 4) != 0) {
            bloodPressureValueStyleVo2 = bloodPressureAvgDataStyleStatus.secondValue;
        }
        BloodPressureValueStyleVo bloodPressureValueStyleVo4 = bloodPressureValueStyleVo2;
        if ((i & 8) != 0) {
            z = bloodPressureAvgDataStyleStatus.showDetail;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            l = bloodPressureAvgDataStyleStatus.dataTimeStamp;
        }
        return bloodPressureAvgDataStyleStatus.copy(str, bloodPressureValueStyleVo3, bloodPressureValueStyleVo4, z2, l);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDateString() {
        return this.dateString;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BloodPressureValueStyleVo getFirstValue() {
        return this.firstValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BloodPressureValueStyleVo getSecondValue() {
        return this.secondValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowDetail() {
        return this.showDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getDataTimeStamp() {
        return this.dataTimeStamp;
    }

    @NotNull
    public final BloodPressureAvgDataStyleStatus copy(@NotNull String dateString, @NotNull BloodPressureValueStyleVo firstValue, @NotNull BloodPressureValueStyleVo secondValue, boolean showDetail, @Nullable Long dataTimeStamp) {
        return new BloodPressureAvgDataStyleStatus(dateString, firstValue, secondValue, showDetail, dataTimeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureAvgDataStyleStatus)) {
            return false;
        }
        BloodPressureAvgDataStyleStatus bloodPressureAvgDataStyleStatus = (BloodPressureAvgDataStyleStatus) other;
        return Intrinsics.areEqual(this.dateString, bloodPressureAvgDataStyleStatus.dateString) && Intrinsics.areEqual(this.firstValue, bloodPressureAvgDataStyleStatus.firstValue) && Intrinsics.areEqual(this.secondValue, bloodPressureAvgDataStyleStatus.secondValue) && this.showDetail == bloodPressureAvgDataStyleStatus.showDetail && Intrinsics.areEqual(this.dataTimeStamp, bloodPressureAvgDataStyleStatus.dataTimeStamp);
    }

    @Nullable
    public final Long getDataTimeStamp() {
        return this.dataTimeStamp;
    }

    @NotNull
    public final String getDateString() {
        return this.dateString;
    }

    @NotNull
    public final BloodPressureValueStyleVo getFirstValue() {
        return this.firstValue;
    }

    @NotNull
    public final BloodPressureValueStyleVo getSecondValue() {
        return this.secondValue;
    }

    public final boolean getShowDetail() {
        return this.showDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.dateString.hashCode() * 31) + this.firstValue.hashCode()) * 31) + this.secondValue.hashCode()) * 31;
        boolean z = this.showDetail;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        Long l = this.dataTimeStamp;
        return i + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "BloodPressureAvgDataStyleStatus(dateString=" + this.dateString + ", firstValue=" + this.firstValue + ", secondValue=" + this.secondValue + ", showDetail=" + this.showDetail + ", dataTimeStamp=" + this.dataTimeStamp + ")";
    }

    public BloodPressureAvgDataStyleStatus(@NotNull String str, @NotNull BloodPressureValueStyleVo bloodPressureValueStyleVo, @NotNull BloodPressureValueStyleVo bloodPressureValueStyleVo2, boolean z, @Nullable Long l) {
        super(l, null);
        this.dateString = str;
        this.firstValue = bloodPressureValueStyleVo;
        this.secondValue = bloodPressureValueStyleVo2;
        this.showDetail = z;
        this.dataTimeStamp = l;
    }
}
