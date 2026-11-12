package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/LatestFitnessData;", "", "dataList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataModel;", "<init>", "(Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LatestFitnessData {

    @SerializedName("data_list")
    @NotNull
    private final List<FitnessDataModel> dataList;

    public LatestFitnessData(@NotNull List<FitnessDataModel> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LatestFitnessData copy$default(LatestFitnessData latestFitnessData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = latestFitnessData.dataList;
        }
        return latestFitnessData.copy(list);
    }

    @NotNull
    public final List<FitnessDataModel> component1() {
        return this.dataList;
    }

    @NotNull
    public final LatestFitnessData copy(@NotNull List<FitnessDataModel> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new LatestFitnessData(dataList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LatestFitnessData) && Intrinsics.areEqual(this.dataList, ((LatestFitnessData) other).dataList);
    }

    @NotNull
    public final List<FitnessDataModel> getDataList() {
        return this.dataList;
    }

    public int hashCode() {
        return this.dataList.hashCode();
    }

    @NotNull
    public String toString() {
        return "LatestFitnessData(dataList=" + this.dataList + ")";
    }
}
