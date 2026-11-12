package com.huami.heartrate.vo;

import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\u001f\u0010$\u001a\u0004\u0018\u00010\t8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/heartrate/vo/BarChartBuilder;", "", "", "Lcom/huami/heartrate/vo/BarChartVo;", "component1", "bars", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getBars", "()Ljava/util/List;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "b", "Landroid/util/SparseArray;", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "c", "getYAxisData", "setYAxisData", "yAxisData", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getLastValidIndex", "()Ljava/lang/Integer;", "lastValidIndex", "<init>", "(Ljava/util/List;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BarChartBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<BarChartVo> bars;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private SparseArray<XAxisData> xAxisData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private SparseArray<YAxisData> yAxisData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy lastValidIndex;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            int size;
            List<BarChartVo> bars = BarChartBuilder.this.getBars();
            if ((bars == null || bars.isEmpty()) || (size = BarChartBuilder.this.getBars().size() - 1) < 0) {
                return null;
            }
            while (true) {
                int i = size - 1;
                if (BarChartBuilder.this.getBars().get(size).getHeartRateValue() != null) {
                    return Integer.valueOf(size);
                }
                if (i < 0) {
                    return null;
                }
                size = i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarChartBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public BarChartBuilder(@NotNull List<BarChartVo> list) {
        this.bars = list;
        this.xAxisData = new SparseArray<>();
        this.yAxisData = new SparseArray<>();
        this.lastValidIndex = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarChartBuilder copy$default(BarChartBuilder barChartBuilder, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = barChartBuilder.bars;
        }
        return barChartBuilder.copy(list);
    }

    @NotNull
    public final List<BarChartVo> component1() {
        return this.bars;
    }

    @NotNull
    public final BarChartBuilder copy(@NotNull List<BarChartVo> bars) {
        return new BarChartBuilder(bars);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BarChartBuilder) && Intrinsics.areEqual(this.bars, ((BarChartBuilder) other).bars);
    }

    @NotNull
    public final List<BarChartVo> getBars() {
        return this.bars;
    }

    @Nullable
    public final Integer getLastValidIndex() {
        return (Integer) this.lastValidIndex.getValue();
    }

    @NotNull
    public final SparseArray<XAxisData> getXAxisData() {
        return this.xAxisData;
    }

    @NotNull
    public final SparseArray<YAxisData> getYAxisData() {
        return this.yAxisData;
    }

    public int hashCode() {
        return this.bars.hashCode();
    }

    public final void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray) {
        this.xAxisData = sparseArray;
    }

    public final void setYAxisData(@NotNull SparseArray<YAxisData> sparseArray) {
        this.yAxisData = sparseArray;
    }

    @NotNull
    public String toString() {
        return "BarChartBuilder(bars=" + this.bars + ")";
    }

    public /* synthetic */ BarChartBuilder(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
