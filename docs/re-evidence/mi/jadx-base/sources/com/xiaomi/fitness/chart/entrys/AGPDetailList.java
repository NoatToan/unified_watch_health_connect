package com.xiaomi.fitness.chart.entrys;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/AGPDetailList;", "", "typeValue", "", "listValueTop", "", "", "listValueBottom", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "getTypeValue", "()I", "getListValueTop", "()Ljava/util/List;", "getListValueBottom", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AGPDetailList {

    @NotNull
    private final List<Float> listValueBottom;

    @NotNull
    private final List<Float> listValueTop;
    private final int typeValue;

    public AGPDetailList(int i, @NotNull List<Float> listValueTop, @NotNull List<Float> listValueBottom) {
        Intrinsics.checkNotNullParameter(listValueTop, "listValueTop");
        Intrinsics.checkNotNullParameter(listValueBottom, "listValueBottom");
        this.typeValue = i;
        this.listValueTop = listValueTop;
        this.listValueBottom = listValueBottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AGPDetailList copy$default(AGPDetailList aGPDetailList, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aGPDetailList.typeValue;
        }
        if ((i2 & 2) != 0) {
            list = aGPDetailList.listValueTop;
        }
        if ((i2 & 4) != 0) {
            list2 = aGPDetailList.listValueBottom;
        }
        return aGPDetailList.copy(i, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTypeValue() {
        return this.typeValue;
    }

    @NotNull
    public final List<Float> component2() {
        return this.listValueTop;
    }

    @NotNull
    public final List<Float> component3() {
        return this.listValueBottom;
    }

    @NotNull
    public final AGPDetailList copy(int typeValue, @NotNull List<Float> listValueTop, @NotNull List<Float> listValueBottom) {
        Intrinsics.checkNotNullParameter(listValueTop, "listValueTop");
        Intrinsics.checkNotNullParameter(listValueBottom, "listValueBottom");
        return new AGPDetailList(typeValue, listValueTop, listValueBottom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AGPDetailList)) {
            return false;
        }
        AGPDetailList aGPDetailList = (AGPDetailList) other;
        return this.typeValue == aGPDetailList.typeValue && Intrinsics.areEqual(this.listValueTop, aGPDetailList.listValueTop) && Intrinsics.areEqual(this.listValueBottom, aGPDetailList.listValueBottom);
    }

    @NotNull
    public final List<Float> getListValueBottom() {
        return this.listValueBottom;
    }

    @NotNull
    public final List<Float> getListValueTop() {
        return this.listValueTop;
    }

    public final int getTypeValue() {
        return this.typeValue;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.typeValue) * 31) + this.listValueTop.hashCode()) * 31) + this.listValueBottom.hashCode();
    }

    @NotNull
    public String toString() {
        return "AGPDetailList(typeValue=" + this.typeValue + ", listValueTop=" + this.listValueTop + ", listValueBottom=" + this.listValueBottom + ")";
    }
}
