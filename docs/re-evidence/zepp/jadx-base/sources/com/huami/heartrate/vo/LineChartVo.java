package com.huami.heartrate.vo;

import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.style.constant.GoalLineStyleConstant;
import com.huami.heartrate.constant.ConstantKt;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b:\u0010;J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011Jp\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0016\u001a\u00020\n2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\rHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R!\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0016\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u000fR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0011R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010\u0011¨\u0006<"}, d2 = {"Lcom/huami/heartrate/vo/LineChartVo;", "", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "component1", "Ljava/util/ArrayList;", "Lcom/huami/chart/data/RangeIndex;", "component2", "", "component3", "", "component4", "", "", "component5", "()[Ljava/lang/String;", "component6", "()Ljava/lang/Float;", "component7", "chartDatas", "abnormalHr", GoalLineStyleConstant.GOALS, "yStart", "xLabels", "containerWidth", "containerHeight", "copy", "(Landroid/util/SparseArray;Ljava/util/ArrayList;[FF[Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)Lcom/huami/heartrate/vo/LineChartVo;", "toString", "", "hashCode", "other", "", "equals", "a", "Landroid/util/SparseArray;", "getChartDatas", "()Landroid/util/SparseArray;", "b", "Ljava/util/ArrayList;", "getAbnormalHr", "()Ljava/util/ArrayList;", "c", "[F", "getGoals", "()[F", GoogleApiAvailabilityLight.a, "F", "getYStart", "()F", "e", "[Ljava/lang/String;", "getXLabels", "f", "Ljava/lang/Float;", "getContainerWidth", "g", "getContainerHeight", "<init>", "(Landroid/util/SparseArray;Ljava/util/ArrayList;[FF[Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LineChartVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<ChartData> chartDatas;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final ArrayList<RangeIndex> abnormalHr;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final float[] goals;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float yStart;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String[] xLabels;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float containerWidth;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float containerHeight;

    public LineChartVo(@NotNull SparseArray<ChartData> sparseArray, @Nullable ArrayList<RangeIndex> arrayList, @Nullable float[] fArr, float f, @NotNull String[] strArr, @Nullable Float f2, @Nullable Float f3) {
        this.chartDatas = sparseArray;
        this.abnormalHr = arrayList;
        this.goals = fArr;
        this.yStart = f;
        this.xLabels = strArr;
        this.containerWidth = f2;
        this.containerHeight = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LineChartVo copy$default(LineChartVo lineChartVo, SparseArray sparseArray, ArrayList arrayList, float[] fArr, float f, String[] strArr, Float f2, Float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            sparseArray = lineChartVo.chartDatas;
        }
        if ((i & 2) != 0) {
            arrayList = lineChartVo.abnormalHr;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            fArr = lineChartVo.goals;
        }
        float[] fArr2 = fArr;
        if ((i & 8) != 0) {
            f = lineChartVo.yStart;
        }
        float f4 = f;
        if ((i & 16) != 0) {
            strArr = lineChartVo.xLabels;
        }
        String[] strArr2 = strArr;
        if ((i & 32) != 0) {
            f2 = lineChartVo.containerWidth;
        }
        Float f5 = f2;
        if ((i & 64) != 0) {
            f3 = lineChartVo.containerHeight;
        }
        return lineChartVo.copy(sparseArray, arrayList2, fArr2, f4, strArr2, f5, f3);
    }

    @NotNull
    public final SparseArray<ChartData> component1() {
        return this.chartDatas;
    }

    @Nullable
    public final ArrayList<RangeIndex> component2() {
        return this.abnormalHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float[] getGoals() {
        return this.goals;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getYStart() {
        return this.yStart;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String[] getXLabels() {
        return this.xLabels;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Float getContainerWidth() {
        return this.containerWidth;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Float getContainerHeight() {
        return this.containerHeight;
    }

    @NotNull
    public final LineChartVo copy(@NotNull SparseArray<ChartData> chartDatas, @Nullable ArrayList<RangeIndex> abnormalHr, @Nullable float[] goals, float yStart, @NotNull String[] xLabels, @Nullable Float containerWidth, @Nullable Float containerHeight) {
        return new LineChartVo(chartDatas, abnormalHr, goals, yStart, xLabels, containerWidth, containerHeight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineChartVo)) {
            return false;
        }
        LineChartVo lineChartVo = (LineChartVo) other;
        return Intrinsics.areEqual(this.chartDatas, lineChartVo.chartDatas) && Intrinsics.areEqual(this.abnormalHr, lineChartVo.abnormalHr) && Intrinsics.areEqual(this.goals, lineChartVo.goals) && Intrinsics.areEqual((Object) Float.valueOf(this.yStart), (Object) Float.valueOf(lineChartVo.yStart)) && Intrinsics.areEqual(this.xLabels, lineChartVo.xLabels) && Intrinsics.areEqual((Object) this.containerWidth, (Object) lineChartVo.containerWidth) && Intrinsics.areEqual((Object) this.containerHeight, (Object) lineChartVo.containerHeight);
    }

    @Nullable
    public final ArrayList<RangeIndex> getAbnormalHr() {
        return this.abnormalHr;
    }

    @NotNull
    public final SparseArray<ChartData> getChartDatas() {
        return this.chartDatas;
    }

    @Nullable
    public final Float getContainerHeight() {
        return this.containerHeight;
    }

    @Nullable
    public final Float getContainerWidth() {
        return this.containerWidth;
    }

    @Nullable
    public final float[] getGoals() {
        return this.goals;
    }

    @NotNull
    public final String[] getXLabels() {
        return this.xLabels;
    }

    public final float getYStart() {
        return this.yStart;
    }

    public int hashCode() {
        int iHashCode = this.chartDatas.hashCode() * 31;
        ArrayList<RangeIndex> arrayList = this.abnormalHr;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        float[] fArr = this.goals;
        int iHashCode3 = (((((iHashCode2 + (fArr == null ? 0 : Arrays.hashCode(fArr))) * 31) + Float.floatToIntBits(this.yStart)) * 31) + Arrays.hashCode(this.xLabels)) * 31;
        Float f = this.containerWidth;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.containerHeight;
        return iHashCode4 + (f2 != null ? f2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LineChartVo(chartDatas=" + this.chartDatas + ", abnormalHr=" + this.abnormalHr + ", goals=" + Arrays.toString(this.goals) + ", yStart=" + this.yStart + ", xLabels=" + Arrays.toString(this.xLabels) + ", containerWidth=" + this.containerWidth + ", containerHeight=" + this.containerHeight + ")";
    }

    public /* synthetic */ LineChartVo(SparseArray sparseArray, ArrayList arrayList, float[] fArr, float f, String[] strArr, Float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sparseArray, arrayList, (i & 4) != 0 ? null : fArr, (i & 8) != 0 ? 0.0f : f, (i & 16) != 0 ? ConstantKt.getDAY_CHART_ARRAY() : strArr, (i & 32) != 0 ? null : f2, (i & 64) != 0 ? null : f3);
    }
}
