package com.huami.heartrate.service;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.style.constant.GoalLineStyleConstant;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003JN\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0007R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\tR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\tR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/huami/heartrate/service/ChartVo;", "", "", "component1", "", "", "component2", "()[Ljava/lang/String;", "component3", "()Ljava/lang/Float;", "component4", "", "component5", "startY", "xLabels", "containerWidth", "containerHeight", GoalLineStyleConstant.GOALS, "copy", "(F[Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;[F)Lcom/huami/heartrate/service/ChartVo;", "toString", "", "hashCode", "other", "", "equals", "a", "F", "getStartY", "()F", "b", "[Ljava/lang/String;", "getXLabels", "c", "Ljava/lang/Float;", "getContainerWidth", GoogleApiAvailabilityLight.a, "getContainerHeight", "e", "[F", "getGoals", "()[F", "<init>", "(F[Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;[F)V", "heartrate-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ChartVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float startY;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String[] xLabels;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float containerWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float containerHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final float[] goals;

    public ChartVo(float f, @NotNull String[] strArr, @Nullable Float f2, @Nullable Float f3, @Nullable float[] fArr) {
        this.startY = f;
        this.xLabels = strArr;
        this.containerWidth = f2;
        this.containerHeight = f3;
        this.goals = fArr;
    }

    public static /* synthetic */ ChartVo copy$default(ChartVo chartVo, float f, String[] strArr, Float f2, Float f3, float[] fArr, int i, Object obj) {
        if ((i & 1) != 0) {
            f = chartVo.startY;
        }
        if ((i & 2) != 0) {
            strArr = chartVo.xLabels;
        }
        String[] strArr2 = strArr;
        if ((i & 4) != 0) {
            f2 = chartVo.containerWidth;
        }
        Float f4 = f2;
        if ((i & 8) != 0) {
            f3 = chartVo.containerHeight;
        }
        Float f5 = f3;
        if ((i & 16) != 0) {
            fArr = chartVo.goals;
        }
        return chartVo.copy(f, strArr2, f4, f5, fArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStartY() {
        return this.startY;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String[] getXLabels() {
        return this.xLabels;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getContainerWidth() {
        return this.containerWidth;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getContainerHeight() {
        return this.containerHeight;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float[] getGoals() {
        return this.goals;
    }

    @NotNull
    public final ChartVo copy(float startY, @NotNull String[] xLabels, @Nullable Float containerWidth, @Nullable Float containerHeight, @Nullable float[] goals) {
        return new ChartVo(startY, xLabels, containerWidth, containerHeight, goals);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartVo)) {
            return false;
        }
        ChartVo chartVo = (ChartVo) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.startY), (Object) Float.valueOf(chartVo.startY)) && Intrinsics.areEqual(this.xLabels, chartVo.xLabels) && Intrinsics.areEqual((Object) this.containerWidth, (Object) chartVo.containerWidth) && Intrinsics.areEqual((Object) this.containerHeight, (Object) chartVo.containerHeight) && Intrinsics.areEqual(this.goals, chartVo.goals);
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

    public final float getStartY() {
        return this.startY;
    }

    @NotNull
    public final String[] getXLabels() {
        return this.xLabels;
    }

    public int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.startY) * 31) + Arrays.hashCode(this.xLabels)) * 31;
        Float f = this.containerWidth;
        int iHashCode = (iFloatToIntBits + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.containerHeight;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        float[] fArr = this.goals;
        return iHashCode2 + (fArr != null ? Arrays.hashCode(fArr) : 0);
    }

    @NotNull
    public String toString() {
        return "ChartVo(startY=" + this.startY + ", xLabels=" + Arrays.toString(this.xLabels) + ", containerWidth=" + this.containerWidth + ", containerHeight=" + this.containerHeight + ", goals=" + Arrays.toString(this.goals) + ")";
    }
}
