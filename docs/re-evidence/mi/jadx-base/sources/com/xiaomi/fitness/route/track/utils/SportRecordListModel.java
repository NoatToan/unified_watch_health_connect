package com.xiaomi.fitness.route.track.utils;

import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/route/track/utils/SportRecordListModel;", "", "sportRecordList", "", "Lcom/xiaomi/fitness/chart/entrys/SportRecordEntry;", "minIndex", "", "maxIndex", "<init>", "(Ljava/util/List;II)V", "getSportRecordList", "()Ljava/util/List;", "getMinIndex", "()I", "getMaxIndex", "getValueRange", "", "getMinValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportRecordListModel {
    private final int maxIndex;
    private final int minIndex;

    @NotNull
    private final List<SportRecordEntry> sportRecordList;

    /* JADX WARN: Multi-variable type inference failed */
    public SportRecordListModel(@NotNull List<? extends SportRecordEntry> sportRecordList, int i, int i2) {
        Intrinsics.checkNotNullParameter(sportRecordList, "sportRecordList");
        this.sportRecordList = sportRecordList;
        this.minIndex = i;
        this.maxIndex = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportRecordListModel copy$default(SportRecordListModel sportRecordListModel, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = sportRecordListModel.sportRecordList;
        }
        if ((i3 & 2) != 0) {
            i = sportRecordListModel.minIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = sportRecordListModel.maxIndex;
        }
        return sportRecordListModel.copy(list, i, i2);
    }

    @NotNull
    public final List<SportRecordEntry> component1() {
        return this.sportRecordList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinIndex() {
        return this.minIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxIndex() {
        return this.maxIndex;
    }

    @NotNull
    public final SportRecordListModel copy(@NotNull List<? extends SportRecordEntry> sportRecordList, int minIndex, int maxIndex) {
        Intrinsics.checkNotNullParameter(sportRecordList, "sportRecordList");
        return new SportRecordListModel(sportRecordList, minIndex, maxIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRecordListModel)) {
            return false;
        }
        SportRecordListModel sportRecordListModel = (SportRecordListModel) other;
        return Intrinsics.areEqual(this.sportRecordList, sportRecordListModel.sportRecordList) && this.minIndex == sportRecordListModel.minIndex && this.maxIndex == sportRecordListModel.maxIndex;
    }

    public final int getMaxIndex() {
        return this.maxIndex;
    }

    public final int getMinIndex() {
        return this.minIndex;
    }

    public final float getMinValue() {
        if (!this.sportRecordList.isEmpty()) {
            return this.sportRecordList.get(this.minIndex).getY();
        }
        return 0.0f;
    }

    @NotNull
    public final List<SportRecordEntry> getSportRecordList() {
        return this.sportRecordList;
    }

    public final float getValueRange() {
        if (!this.sportRecordList.isEmpty()) {
            return this.sportRecordList.get(this.maxIndex).getY() - this.sportRecordList.get(this.minIndex).getY();
        }
        return 1.0f;
    }

    public int hashCode() {
        return (((this.sportRecordList.hashCode() * 31) + Integer.hashCode(this.minIndex)) * 31) + Integer.hashCode(this.maxIndex);
    }

    @NotNull
    public String toString() {
        return "SportRecordListModel(sportRecordList=" + this.sportRecordList + ", minIndex=" + this.minIndex + ", maxIndex=" + this.maxIndex + ")";
    }
}
