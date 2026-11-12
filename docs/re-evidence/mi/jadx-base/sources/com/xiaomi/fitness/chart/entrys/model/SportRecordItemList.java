package com.xiaomi.fitness.chart.entrys.model;

import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/model/SportRecordItemList;", "", "sportRecordKey", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "sportLineColor", "", "<init>", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;I)V", "getSportRecordKey", "()Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "setSportRecordKey", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;)V", "getSportLineColor", "()I", "setSportLineColor", "(I)V", "listValue", "", "Lcom/xiaomi/fitness/chart/entrys/model/SportItemModel;", "getListValue", "()Ljava/util/List;", "setListValue", "(Ljava/util/List;)V", "endFillColor", "getEndFillColor", "setEndFillColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportRecordItemList {
    private int endFillColor;

    @NotNull
    private List<SportItemModel> listValue;
    private int sportLineColor;

    @NotNull
    private SportRecordKey sportRecordKey;

    public SportRecordItemList(@NotNull SportRecordKey sportRecordKey, int i) {
        Intrinsics.checkNotNullParameter(sportRecordKey, "sportRecordKey");
        this.sportRecordKey = sportRecordKey;
        this.sportLineColor = i;
        this.listValue = new ArrayList();
        this.endFillColor = -1;
    }

    public static /* synthetic */ SportRecordItemList copy$default(SportRecordItemList sportRecordItemList, SportRecordKey sportRecordKey, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sportRecordKey = sportRecordItemList.sportRecordKey;
        }
        if ((i2 & 2) != 0) {
            i = sportRecordItemList.sportLineColor;
        }
        return sportRecordItemList.copy(sportRecordKey, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SportRecordKey getSportRecordKey() {
        return this.sportRecordKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSportLineColor() {
        return this.sportLineColor;
    }

    @NotNull
    public final SportRecordItemList copy(@NotNull SportRecordKey sportRecordKey, int sportLineColor) {
        Intrinsics.checkNotNullParameter(sportRecordKey, "sportRecordKey");
        return new SportRecordItemList(sportRecordKey, sportLineColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRecordItemList)) {
            return false;
        }
        SportRecordItemList sportRecordItemList = (SportRecordItemList) other;
        return this.sportRecordKey == sportRecordItemList.sportRecordKey && this.sportLineColor == sportRecordItemList.sportLineColor;
    }

    public final int getEndFillColor() {
        return this.endFillColor;
    }

    @NotNull
    public final List<SportItemModel> getListValue() {
        return this.listValue;
    }

    public final int getSportLineColor() {
        return this.sportLineColor;
    }

    @NotNull
    public final SportRecordKey getSportRecordKey() {
        return this.sportRecordKey;
    }

    public int hashCode() {
        return (this.sportRecordKey.hashCode() * 31) + Integer.hashCode(this.sportLineColor);
    }

    public final void setEndFillColor(int i) {
        this.endFillColor = i;
    }

    public final void setListValue(@NotNull List<SportItemModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listValue = list;
    }

    public final void setSportLineColor(int i) {
        this.sportLineColor = i;
    }

    public final void setSportRecordKey(@NotNull SportRecordKey sportRecordKey) {
        Intrinsics.checkNotNullParameter(sportRecordKey, "<set-?>");
        this.sportRecordKey = sportRecordKey;
    }

    @NotNull
    public String toString() {
        return "SportRecordItemList(sportRecordKey=" + this.sportRecordKey + ", sportLineColor=" + this.sportLineColor + ")";
    }
}
