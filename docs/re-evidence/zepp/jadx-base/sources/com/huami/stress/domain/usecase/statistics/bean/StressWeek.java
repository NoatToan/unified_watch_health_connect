package com.huami.stress.domain.usecase.statistics.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003JA\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006&"}, d2 = {"Lcom/huami/stress/domain/usecase/statistics/bean/StressWeek;", "", "", "Lcom/huami/stress/domain/usecase/statistics/bean/StressStatisticsPoint;", "component1", "", "component2", "component3", "component4", "component5", "data", "avgStress", "maxStress", "minStress", "singleStressCount", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", "b", LogUtil.I, "getAvgStress", "()I", "c", "getMaxStress", GoogleApiAvailabilityLight.a, "getMinStress", "e", "getSingleStressCount", "<init>", "(Ljava/util/List;IIII)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StressWeek {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<StressStatisticsPoint> data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int avgStress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int maxStress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int minStress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int singleStressCount;

    public StressWeek(@NotNull List<StressStatisticsPoint> list, int i, int i2, int i3, int i4) {
        this.data = list;
        this.avgStress = i;
        this.maxStress = i2;
        this.minStress = i3;
        this.singleStressCount = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StressWeek copy$default(StressWeek stressWeek, List list, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = stressWeek.data;
        }
        if ((i5 & 2) != 0) {
            i = stressWeek.avgStress;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = stressWeek.maxStress;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = stressWeek.minStress;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = stressWeek.singleStressCount;
        }
        return stressWeek.copy(list, i6, i7, i8, i4);
    }

    @NotNull
    public final List<StressStatisticsPoint> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvgStress() {
        return this.avgStress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxStress() {
        return this.maxStress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMinStress() {
        return this.minStress;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSingleStressCount() {
        return this.singleStressCount;
    }

    @NotNull
    public final StressWeek copy(@NotNull List<StressStatisticsPoint> data, int avgStress, int maxStress, int minStress, int singleStressCount) {
        return new StressWeek(data, avgStress, maxStress, minStress, singleStressCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressWeek)) {
            return false;
        }
        StressWeek stressWeek = (StressWeek) other;
        return Intrinsics.areEqual(this.data, stressWeek.data) && this.avgStress == stressWeek.avgStress && this.maxStress == stressWeek.maxStress && this.minStress == stressWeek.minStress && this.singleStressCount == stressWeek.singleStressCount;
    }

    public final int getAvgStress() {
        return this.avgStress;
    }

    @NotNull
    public final List<StressStatisticsPoint> getData() {
        return this.data;
    }

    public final int getMaxStress() {
        return this.maxStress;
    }

    public final int getMinStress() {
        return this.minStress;
    }

    public final int getSingleStressCount() {
        return this.singleStressCount;
    }

    public int hashCode() {
        return (((((((this.data.hashCode() * 31) + this.avgStress) * 31) + this.maxStress) * 31) + this.minStress) * 31) + this.singleStressCount;
    }

    @NotNull
    public String toString() {
        return "StressWeek(data=" + this.data + ", avgStress=" + this.avgStress + ", maxStress=" + this.maxStress + ", minStress=" + this.minStress + ", singleStressCount=" + this.singleStressCount + ')';
    }
}
