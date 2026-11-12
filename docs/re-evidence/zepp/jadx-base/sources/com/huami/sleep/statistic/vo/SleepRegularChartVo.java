package com.huami.sleep.statistic.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u001aR\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/huami/sleep/statistic/vo/SleepRegularChartVo;", "", "", "component1", "component2", "component3", "", "component4", "index", "startIndex", "endIndex", "timeStamp", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "getStartIndex", "setStartIndex", "(I)V", "c", "getEndIndex", "setEndIndex", GoogleApiAvailabilityLight.a, "J", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "<init>", "(IIIJ)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepRegularChartVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int startIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int endIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private long timeStamp;

    public SleepRegularChartVo(int i, int i2, int i3, long j) {
        this.index = i;
        this.startIndex = i2;
        this.endIndex = i3;
        this.timeStamp = j;
    }

    public static /* synthetic */ SleepRegularChartVo copy$default(SleepRegularChartVo sleepRegularChartVo, int i, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sleepRegularChartVo.index;
        }
        if ((i4 & 2) != 0) {
            i2 = sleepRegularChartVo.startIndex;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = sleepRegularChartVo.endIndex;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            j = sleepRegularChartVo.timeStamp;
        }
        return sleepRegularChartVo.copy(i, i5, i6, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final SleepRegularChartVo copy(int index, int startIndex, int endIndex, long timeStamp) {
        return new SleepRegularChartVo(index, startIndex, endIndex, timeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepRegularChartVo)) {
            return false;
        }
        SleepRegularChartVo sleepRegularChartVo = (SleepRegularChartVo) other;
        return this.index == sleepRegularChartVo.index && this.startIndex == sleepRegularChartVo.startIndex && this.endIndex == sleepRegularChartVo.endIndex && this.timeStamp == sleepRegularChartVo.timeStamp;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (((((this.index * 31) + this.startIndex) * 31) + this.endIndex) * 31) + b.a(this.timeStamp);
    }

    public final void setEndIndex(int i) {
        this.endIndex = i;
    }

    public final void setStartIndex(int i) {
        this.startIndex = i;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    @NotNull
    public String toString() {
        return "SleepRegularChartVo(index=" + this.index + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", timeStamp=" + this.timeStamp + ")";
    }

    public /* synthetic */ SleepRegularChartVo(int i, int i2, int i3, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i4 & 8) != 0 ? 0L : j);
    }
}
