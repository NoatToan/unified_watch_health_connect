package com.huami.bodymeasurements.common.chart.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/bodymeasurements/common/chart/vo/ChartDataVo;", "", "", "component1", "", "component2", "", "component3", "index", "value", "timeStamp", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "c", "J", "getTimeStamp", "()J", "<init>", "(ILjava/lang/String;J)V", "common_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ChartDataVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    public ChartDataVo(int i, @NotNull String str, long j) {
        this.index = i;
        this.value = str;
        this.timeStamp = j;
    }

    public static /* synthetic */ ChartDataVo copy$default(ChartDataVo chartDataVo, int i, String str, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chartDataVo.index;
        }
        if ((i2 & 2) != 0) {
            str = chartDataVo.value;
        }
        if ((i2 & 4) != 0) {
            j = chartDataVo.timeStamp;
        }
        return chartDataVo.copy(i, str, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final ChartDataVo copy(int index, @NotNull String value, long timeStamp) {
        return new ChartDataVo(index, value, timeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDataVo)) {
            return false;
        }
        ChartDataVo chartDataVo = (ChartDataVo) other;
        return this.index == chartDataVo.index && Intrinsics.areEqual(this.value, chartDataVo.value) && this.timeStamp == chartDataVo.timeStamp;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.index * 31) + this.value.hashCode()) * 31) + b.a(this.timeStamp);
    }

    @NotNull
    public String toString() {
        return "ChartDataVo(index=" + this.index + ", value=" + this.value + ", timeStamp=" + this.timeStamp + ')';
    }
}
