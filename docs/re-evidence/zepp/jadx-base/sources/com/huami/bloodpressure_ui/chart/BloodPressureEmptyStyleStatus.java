package com.huami.bloodpressure_ui.chart;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureEmptyStyleStatus;", "Lcom/huami/bloodpressure_ui/chart/BloodPressureStatus;", "", "component1", "", "component2", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;", "component3", "dateString", "showDetail", "textSizeStyle", "copy", "toString", "", "hashCode", "", "other", "equals", "b", "Ljava/lang/String;", "getDateString", "()Ljava/lang/String;", "c", "Z", "getShowDetail", "()Z", GoogleApiAvailabilityLight.a, "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;", "getTextSizeStyle", "()Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;", "setTextSizeStyle", "(Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;)V", "<init>", "(Ljava/lang/String;ZLcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureEmptyStyleStatus extends BloodPressureStatus {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String dateString;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean showDetail;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private BloodPressureChartTextSizeStyle textSizeStyle;

    public /* synthetic */ BloodPressureEmptyStyleStatus(String str, boolean z, BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE() : bloodPressureChartTextSizeStyle);
    }

    public static /* synthetic */ BloodPressureEmptyStyleStatus copy$default(BloodPressureEmptyStyleStatus bloodPressureEmptyStyleStatus, String str, boolean z, BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bloodPressureEmptyStyleStatus.dateString;
        }
        if ((i & 2) != 0) {
            z = bloodPressureEmptyStyleStatus.showDetail;
        }
        if ((i & 4) != 0) {
            bloodPressureChartTextSizeStyle = bloodPressureEmptyStyleStatus.textSizeStyle;
        }
        return bloodPressureEmptyStyleStatus.copy(str, z, bloodPressureChartTextSizeStyle);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDateString() {
        return this.dateString;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowDetail() {
        return this.showDetail;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BloodPressureChartTextSizeStyle getTextSizeStyle() {
        return this.textSizeStyle;
    }

    @NotNull
    public final BloodPressureEmptyStyleStatus copy(@NotNull String dateString, boolean showDetail, @NotNull BloodPressureChartTextSizeStyle textSizeStyle) {
        return new BloodPressureEmptyStyleStatus(dateString, showDetail, textSizeStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureEmptyStyleStatus)) {
            return false;
        }
        BloodPressureEmptyStyleStatus bloodPressureEmptyStyleStatus = (BloodPressureEmptyStyleStatus) other;
        return Intrinsics.areEqual(this.dateString, bloodPressureEmptyStyleStatus.dateString) && this.showDetail == bloodPressureEmptyStyleStatus.showDetail && Intrinsics.areEqual(this.textSizeStyle, bloodPressureEmptyStyleStatus.textSizeStyle);
    }

    @NotNull
    public final String getDateString() {
        return this.dateString;
    }

    public final boolean getShowDetail() {
        return this.showDetail;
    }

    @NotNull
    public final BloodPressureChartTextSizeStyle getTextSizeStyle() {
        return this.textSizeStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = this.dateString.hashCode() * 31;
        boolean z = this.showDetail;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.textSizeStyle.hashCode();
    }

    public final void setTextSizeStyle(@NotNull BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle) {
        this.textSizeStyle = bloodPressureChartTextSizeStyle;
    }

    @NotNull
    public String toString() {
        return "BloodPressureEmptyStyleStatus(dateString=" + this.dateString + ", showDetail=" + this.showDetail + ", textSizeStyle=" + this.textSizeStyle + ")";
    }

    public BloodPressureEmptyStyleStatus(@NotNull String str, boolean z, @NotNull BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle) {
        super(null, 1, null);
        this.dateString = str;
        this.showDetail = z;
        this.textSizeStyle = bloodPressureChartTextSizeStyle;
    }
}
