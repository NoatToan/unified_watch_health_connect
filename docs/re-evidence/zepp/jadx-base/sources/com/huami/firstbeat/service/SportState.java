package com.huami.firstbeat.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/firstbeat/service/SportState;", "", "", "component1", "", "component2", "", "component3", "date", "value", "chartRange", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "b", LogUtil.I, "getValue", "()I", "c", "Ljava/util/List;", "getChartRange", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "firstbeat-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Integer> chartRange;

    public SportState(@NotNull String str, int i, @NotNull List<Integer> list) {
        this.date = str;
        this.value = i;
        this.chartRange = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportState copy$default(SportState sportState, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sportState.date;
        }
        if ((i2 & 2) != 0) {
            i = sportState.value;
        }
        if ((i2 & 4) != 0) {
            list = sportState.chartRange;
        }
        return sportState.copy(str, i, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.chartRange;
    }

    @NotNull
    public final SportState copy(@NotNull String date, int value, @NotNull List<Integer> chartRange) {
        return new SportState(date, value, chartRange);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportState)) {
            return false;
        }
        SportState sportState = (SportState) other;
        return Intrinsics.areEqual(this.date, sportState.date) && this.value == sportState.value && Intrinsics.areEqual(this.chartRange, sportState.chartRange);
    }

    @NotNull
    public final List<Integer> getChartRange() {
        return this.chartRange;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.date.hashCode() * 31) + this.value) * 31) + this.chartRange.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportState(date=" + this.date + ", value=" + this.value + ", chartRange=" + this.chartRange + ')';
    }
}
