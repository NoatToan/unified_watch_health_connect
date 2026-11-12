package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataResultByTime;", "", "dataList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataModel;", "nextKey", "", "hasMore", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "getDataList", "()Ljava/util/List;", "getNextKey", "()Ljava/lang/String;", "getHasMore", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FitnessDataResultByTime {

    @SerializedName("data_list")
    @NotNull
    private final List<FitnessDataModel> dataList;

    @SerializedName("has_more")
    private final boolean hasMore;

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    @Nullable
    private final String nextKey;

    public FitnessDataResultByTime(@NotNull List<FitnessDataModel> dataList, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
        this.nextKey = str;
        this.hasMore = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FitnessDataResultByTime copy$default(FitnessDataResultByTime fitnessDataResultByTime, List list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fitnessDataResultByTime.dataList;
        }
        if ((i & 2) != 0) {
            str = fitnessDataResultByTime.nextKey;
        }
        if ((i & 4) != 0) {
            z = fitnessDataResultByTime.hasMore;
        }
        return fitnessDataResultByTime.copy(list, str, z);
    }

    @NotNull
    public final List<FitnessDataModel> component1() {
        return this.dataList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextKey() {
        return this.nextKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final FitnessDataResultByTime copy(@NotNull List<FitnessDataModel> dataList, @Nullable String nextKey, boolean hasMore) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new FitnessDataResultByTime(dataList, nextKey, hasMore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitnessDataResultByTime)) {
            return false;
        }
        FitnessDataResultByTime fitnessDataResultByTime = (FitnessDataResultByTime) other;
        return Intrinsics.areEqual(this.dataList, fitnessDataResultByTime.dataList) && Intrinsics.areEqual(this.nextKey, fitnessDataResultByTime.nextKey) && this.hasMore == fitnessDataResultByTime.hasMore;
    }

    @NotNull
    public final List<FitnessDataModel> getDataList() {
        return this.dataList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final String getNextKey() {
        return this.nextKey;
    }

    public int hashCode() {
        int iHashCode = this.dataList.hashCode() * 31;
        String str = this.nextKey;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hasMore);
    }

    @NotNull
    public String toString() {
        return "FitnessDataResultByTime(dataList=" + this.dataList + ", nextKey=" + this.nextKey + ", hasMore=" + this.hasMore + ")";
    }
}
