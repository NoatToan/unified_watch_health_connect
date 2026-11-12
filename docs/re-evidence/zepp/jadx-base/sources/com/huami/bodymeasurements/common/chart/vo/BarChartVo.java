package com.huami.bodymeasurements.common.chart.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0017\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0017\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003Jy\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR'\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R%\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R'\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R%\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u0019\u0010\u0011\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/huami/bodymeasurements/common/chart/vo/BarChartVo;", "", "", "component1", "Lkotlin/Pair;", "", "component2", "component3", "component4", "component5", "", "component6", "index", "highValue", "highOffset", "lowValue", "lowOffset", "timeStamp", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "Lkotlin/Pair;", "getHighValue", "()Lkotlin/Pair;", "c", "getHighOffset", GoogleApiAvailabilityLight.a, "getLowValue", "e", "getLowOffset", "f", "J", "getTimeStamp", "()J", "<init>", "(ILkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;J)V", "common_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BarChartVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<Float, Float> highValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<Float, Float> highOffset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Pair<Float, Float> lowValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final Pair<Float, Float> lowOffset;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    public BarChartVo(int i, @Nullable Pair<Float, Float> pair, @NotNull Pair<Float, Float> pair2, @Nullable Pair<Float, Float> pair3, @NotNull Pair<Float, Float> pair4, long j) {
        this.index = i;
        this.highValue = pair;
        this.highOffset = pair2;
        this.lowValue = pair3;
        this.lowOffset = pair4;
        this.timeStamp = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarChartVo copy$default(BarChartVo barChartVo, int i, Pair pair, Pair pair2, Pair pair3, Pair pair4, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = barChartVo.index;
        }
        if ((i2 & 2) != 0) {
            pair = barChartVo.highValue;
        }
        Pair pair5 = pair;
        if ((i2 & 4) != 0) {
            pair2 = barChartVo.highOffset;
        }
        Pair pair6 = pair2;
        if ((i2 & 8) != 0) {
            pair3 = barChartVo.lowValue;
        }
        Pair pair7 = pair3;
        if ((i2 & 16) != 0) {
            pair4 = barChartVo.lowOffset;
        }
        Pair pair8 = pair4;
        if ((i2 & 32) != 0) {
            j = barChartVo.timeStamp;
        }
        return barChartVo.copy(i, pair5, pair6, pair7, pair8, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final Pair<Float, Float> component2() {
        return this.highValue;
    }

    @NotNull
    public final Pair<Float, Float> component3() {
        return this.highOffset;
    }

    @Nullable
    public final Pair<Float, Float> component4() {
        return this.lowValue;
    }

    @NotNull
    public final Pair<Float, Float> component5() {
        return this.lowOffset;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final BarChartVo copy(int index, @Nullable Pair<Float, Float> highValue, @NotNull Pair<Float, Float> highOffset, @Nullable Pair<Float, Float> lowValue, @NotNull Pair<Float, Float> lowOffset, long timeStamp) {
        return new BarChartVo(index, highValue, highOffset, lowValue, lowOffset, timeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarChartVo)) {
            return false;
        }
        BarChartVo barChartVo = (BarChartVo) other;
        return this.index == barChartVo.index && Intrinsics.areEqual(this.highValue, barChartVo.highValue) && Intrinsics.areEqual(this.highOffset, barChartVo.highOffset) && Intrinsics.areEqual(this.lowValue, barChartVo.lowValue) && Intrinsics.areEqual(this.lowOffset, barChartVo.lowOffset) && this.timeStamp == barChartVo.timeStamp;
    }

    @NotNull
    public final Pair<Float, Float> getHighOffset() {
        return this.highOffset;
    }

    @Nullable
    public final Pair<Float, Float> getHighValue() {
        return this.highValue;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Pair<Float, Float> getLowOffset() {
        return this.lowOffset;
    }

    @Nullable
    public final Pair<Float, Float> getLowValue() {
        return this.lowValue;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        int i = this.index * 31;
        Pair<Float, Float> pair = this.highValue;
        int iHashCode = (((i + (pair == null ? 0 : pair.hashCode())) * 31) + this.highOffset.hashCode()) * 31;
        Pair<Float, Float> pair2 = this.lowValue;
        return ((((iHashCode + (pair2 != null ? pair2.hashCode() : 0)) * 31) + this.lowOffset.hashCode()) * 31) + b.a(this.timeStamp);
    }

    @NotNull
    public String toString() {
        return "BarChartVo(index=" + this.index + ", highValue=" + this.highValue + ", highOffset=" + this.highOffset + ", lowValue=" + this.lowValue + ", lowOffset=" + this.lowOffset + ", timeStamp=" + this.timeStamp + ')';
    }
}
