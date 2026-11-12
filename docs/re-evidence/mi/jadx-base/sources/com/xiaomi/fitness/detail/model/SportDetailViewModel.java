package com.xiaomi.fitness.detail.model;

import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.chart.entrys.SportRecordLandEntry;
import com.xiaomi.fitness.chart.view.SportRecordChartRecyclerView;
import defpackage.sf2;
import defpackage.zon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0007¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportDetailViewModel;", "", "Lzon;", "Lsf2;", "mAdapter", "", "setAdapter", "(Lzon;)V", "Lcom/xiaomi/fitness/chart/view/SportRecordChartRecyclerView;", "lineRecyclerView", "Lcom/xiaomi/fitness/chart/view/SportRecordChartRecyclerView;", "getLineRecyclerView", "()Lcom/xiaomi/fitness/chart/view/SportRecordChartRecyclerView;", "setLineRecyclerView", "(Lcom/xiaomi/fitness/chart/view/SportRecordChartRecyclerView;)V", "", "Lcom/xiaomi/fitness/chart/entrys/SportRecordLandEntry;", "mEntries", "Ljava/util/List;", "getMEntries", "()Ljava/util/List;", "setMEntries", "(Ljava/util/List;)V", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "sportKey", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "getSportKey", "()Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "Lzon;", "getMAdapter", "()Lzon;", "setMAdapter", "<init>", "(Lcom/xiaomi/fitness/chart/view/SportRecordChartRecyclerView;Ljava/util/List;Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailViewModel {

    @NotNull
    private SportRecordChartRecyclerView lineRecyclerView;

    @Nullable
    private zon<sf2> mAdapter;

    @NotNull
    private List<SportRecordLandEntry> mEntries;

    @NotNull
    private final SportRecordKey sportKey;

    public SportDetailViewModel(@NotNull SportRecordChartRecyclerView lineRecyclerView, @NotNull List<SportRecordLandEntry> mEntries, @NotNull SportRecordKey sportKey) {
        Intrinsics.checkNotNullParameter(lineRecyclerView, "lineRecyclerView");
        Intrinsics.checkNotNullParameter(mEntries, "mEntries");
        Intrinsics.checkNotNullParameter(sportKey, "sportKey");
        this.lineRecyclerView = lineRecyclerView;
        this.mEntries = mEntries;
        this.sportKey = sportKey;
    }

    @NotNull
    public final SportRecordChartRecyclerView getLineRecyclerView() {
        return this.lineRecyclerView;
    }

    @Nullable
    public final zon<sf2> getMAdapter() {
        return this.mAdapter;
    }

    @NotNull
    public final List<SportRecordLandEntry> getMEntries() {
        return this.mEntries;
    }

    @NotNull
    public final SportRecordKey getSportKey() {
        return this.sportKey;
    }

    public final void setAdapter(@NotNull zon<sf2> mAdapter) {
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        this.mAdapter = mAdapter;
    }

    public final void setLineRecyclerView(@NotNull SportRecordChartRecyclerView sportRecordChartRecyclerView) {
        Intrinsics.checkNotNullParameter(sportRecordChartRecyclerView, "<set-?>");
        this.lineRecyclerView = sportRecordChartRecyclerView;
    }

    public final void setMAdapter(@Nullable zon<sf2> zonVar) {
        this.mAdapter = zonVar;
    }

    public final void setMEntries(@NotNull List<SportRecordLandEntry> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mEntries = list;
    }
}
