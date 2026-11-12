package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetRelativeDataResult;", "", "latestDataTime", "", "dataList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "nextKey", "", "<init>", "(JLjava/util/List;Ljava/lang/String;)V", "getLatestDataTime", "()J", "getDataList", "()Ljava/util/List;", "getNextKey", "()Ljava/lang/String;", "setNextKey", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetRelativeDataResult {

    @SerializedName("data_list")
    @NotNull
    private final List<RelativeDataModel> dataList;

    @SerializedName("latest_data_time")
    private final long latestDataTime;

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    @Nullable
    private String nextKey;

    public GetRelativeDataResult(long j, @NotNull List<RelativeDataModel> dataList, @Nullable String str) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.latestDataTime = j;
        this.dataList = dataList;
        this.nextKey = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetRelativeDataResult copy$default(GetRelativeDataResult getRelativeDataResult, long j, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = getRelativeDataResult.latestDataTime;
        }
        if ((i & 2) != 0) {
            list = getRelativeDataResult.dataList;
        }
        if ((i & 4) != 0) {
            str = getRelativeDataResult.nextKey;
        }
        return getRelativeDataResult.copy(j, list, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLatestDataTime() {
        return this.latestDataTime;
    }

    @NotNull
    public final List<RelativeDataModel> component2() {
        return this.dataList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNextKey() {
        return this.nextKey;
    }

    @NotNull
    public final GetRelativeDataResult copy(long latestDataTime, @NotNull List<RelativeDataModel> dataList, @Nullable String nextKey) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new GetRelativeDataResult(latestDataTime, dataList, nextKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetRelativeDataResult)) {
            return false;
        }
        GetRelativeDataResult getRelativeDataResult = (GetRelativeDataResult) other;
        return this.latestDataTime == getRelativeDataResult.latestDataTime && Intrinsics.areEqual(this.dataList, getRelativeDataResult.dataList) && Intrinsics.areEqual(this.nextKey, getRelativeDataResult.nextKey);
    }

    @NotNull
    public final List<RelativeDataModel> getDataList() {
        return this.dataList;
    }

    public final long getLatestDataTime() {
        return this.latestDataTime;
    }

    @Nullable
    public final String getNextKey() {
        return this.nextKey;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.latestDataTime) * 31) + this.dataList.hashCode()) * 31;
        String str = this.nextKey;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setNextKey(@Nullable String str) {
        this.nextKey = str;
    }

    @NotNull
    public String toString() {
        return "GetRelativeDataResult(latestDataTime=" + this.latestDataTime + ", dataList=" + this.dataList + ", nextKey=" + this.nextKey + ")";
    }

    public /* synthetic */ GetRelativeDataResult(long j, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? null : str);
    }
}
