package com.huami.pai.vo;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J9\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/pai/vo/ChartDataVo;", "", "", "Lcom/huami/pai/vo/ChartPointVo;", "component1", "Lcom/huami/pai/vo/RangeIndexVo;", "component2", "", "", "component3", "points", "subIndices", "joinerIndices", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "b", "getSubIndices", "c", "Ljava/util/Set;", "getJoinerIndices", "()Ljava/util/Set;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ChartDataVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<ChartPointVo> points;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<RangeIndexVo> subIndices;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Set<Integer> joinerIndices;

    public ChartDataVo(@NotNull List<ChartPointVo> list, @NotNull List<RangeIndexVo> list2, @NotNull Set<Integer> set) {
        this.points = list;
        this.subIndices = list2;
        this.joinerIndices = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartDataVo copy$default(ChartDataVo chartDataVo, List list, List list2, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chartDataVo.points;
        }
        if ((i & 2) != 0) {
            list2 = chartDataVo.subIndices;
        }
        if ((i & 4) != 0) {
            set = chartDataVo.joinerIndices;
        }
        return chartDataVo.copy(list, list2, set);
    }

    @NotNull
    public final List<ChartPointVo> component1() {
        return this.points;
    }

    @NotNull
    public final List<RangeIndexVo> component2() {
        return this.subIndices;
    }

    @NotNull
    public final Set<Integer> component3() {
        return this.joinerIndices;
    }

    @NotNull
    public final ChartDataVo copy(@NotNull List<ChartPointVo> points, @NotNull List<RangeIndexVo> subIndices, @NotNull Set<Integer> joinerIndices) {
        return new ChartDataVo(points, subIndices, joinerIndices);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDataVo)) {
            return false;
        }
        ChartDataVo chartDataVo = (ChartDataVo) other;
        return Intrinsics.areEqual(this.points, chartDataVo.points) && Intrinsics.areEqual(this.subIndices, chartDataVo.subIndices) && Intrinsics.areEqual(this.joinerIndices, chartDataVo.joinerIndices);
    }

    @NotNull
    public final Set<Integer> getJoinerIndices() {
        return this.joinerIndices;
    }

    @NotNull
    public final List<ChartPointVo> getPoints() {
        return this.points;
    }

    @NotNull
    public final List<RangeIndexVo> getSubIndices() {
        return this.subIndices;
    }

    public int hashCode() {
        return (((this.points.hashCode() * 31) + this.subIndices.hashCode()) * 31) + this.joinerIndices.hashCode();
    }

    @NotNull
    public String toString() {
        return "ChartDataVo(points=" + this.points + ", subIndices=" + this.subIndices + ", joinerIndices=" + this.joinerIndices + ")";
    }

    public /* synthetic */ ChartDataVo(List list, List list2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? y.emptySet() : set);
    }
}
