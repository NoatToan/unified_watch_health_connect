package com.huami.hmchartui.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016¨\u0006 "}, d2 = {"Lcom/huami/hmchartui/model/ConvertChartData;", "", "", "toString", "", "component1", "", "component2", "component3", "index", "time", "value", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "setIndex", "(I)V", "b", "J", "getTime", "()J", "c", "getValue", "setValue", "<init>", "(IJI)V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ConvertChartData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int value;

    public ConvertChartData(int i, long j, int i2) {
        this.index = i;
        this.time = j;
        this.value = i2;
    }

    public static /* synthetic */ ConvertChartData copy$default(ConvertChartData convertChartData, int i, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = convertChartData.index;
        }
        if ((i3 & 2) != 0) {
            j = convertChartData.time;
        }
        if ((i3 & 4) != 0) {
            i2 = convertChartData.value;
        }
        return convertChartData.copy(i, j, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final ConvertChartData copy(int index, long time, int value) {
        return new ConvertChartData(index, time, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConvertChartData)) {
            return false;
        }
        ConvertChartData convertChartData = (ConvertChartData) other;
        return this.index == convertChartData.index && this.time == convertChartData.time && this.value == convertChartData.value;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.index * 31) + b.a(this.time)) * 31) + this.value;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "index=" + this.index + ",time=" + this.time + ",value=" + this.value;
    }
}
