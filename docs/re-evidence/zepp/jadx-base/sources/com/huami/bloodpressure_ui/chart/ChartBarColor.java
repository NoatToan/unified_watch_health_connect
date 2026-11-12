package com.huami.bloodpressure_ui.chart;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.chart.util.HMColor;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J4\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0005R\u0019\u0010\n\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/ChartBarColor;", "", "", "Lcom/huami/chart/util/HMColor;", "component1", "()[Lcom/huami/chart/util/HMColor;", "component2", "", "component3", "barColor", "interColor", "alpha", "copy", "([Lcom/huami/chart/util/HMColor;Lcom/huami/chart/util/HMColor;I)Lcom/huami/bloodpressure_ui/chart/ChartBarColor;", "", "toString", "hashCode", "other", "", "equals", "[Lcom/huami/chart/util/HMColor;", "getBarColor", "Lcom/huami/chart/util/HMColor;", "getInterColor", "()Lcom/huami/chart/util/HMColor;", LogUtil.I, "getAlpha", "()I", "<init>", "([Lcom/huami/chart/util/HMColor;Lcom/huami/chart/util/HMColor;I)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ChartBarColor {
    private final int alpha;

    @NotNull
    private final HMColor[] barColor;

    @NotNull
    private final HMColor interColor;

    public ChartBarColor(@NotNull HMColor[] hMColorArr, @NotNull HMColor hMColor, int i) {
        this.barColor = hMColorArr;
        this.interColor = hMColor;
        this.alpha = i;
    }

    public static /* synthetic */ ChartBarColor copy$default(ChartBarColor chartBarColor, HMColor[] hMColorArr, HMColor hMColor, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hMColorArr = chartBarColor.barColor;
        }
        if ((i2 & 2) != 0) {
            hMColor = chartBarColor.interColor;
        }
        if ((i2 & 4) != 0) {
            i = chartBarColor.alpha;
        }
        return chartBarColor.copy(hMColorArr, hMColor, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMColor[] getBarColor() {
        return this.barColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMColor getInterColor() {
        return this.interColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAlpha() {
        return this.alpha;
    }

    @NotNull
    public final ChartBarColor copy(@NotNull HMColor[] barColor, @NotNull HMColor interColor, int alpha) {
        return new ChartBarColor(barColor, interColor, alpha);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartBarColor)) {
            return false;
        }
        ChartBarColor chartBarColor = (ChartBarColor) other;
        return Intrinsics.areEqual(this.barColor, chartBarColor.barColor) && Intrinsics.areEqual(this.interColor, chartBarColor.interColor) && this.alpha == chartBarColor.alpha;
    }

    public final int getAlpha() {
        return this.alpha;
    }

    @NotNull
    public final HMColor[] getBarColor() {
        return this.barColor;
    }

    @NotNull
    public final HMColor getInterColor() {
        return this.interColor;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.barColor) * 31) + this.interColor.hashCode()) * 31) + this.alpha;
    }

    @NotNull
    public String toString() {
        return "ChartBarColor(barColor=" + Arrays.toString(this.barColor) + ", interColor=" + this.interColor + ", alpha=" + this.alpha + ")";
    }
}
