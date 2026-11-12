package com.xiaomi.fitness.sport.route.detail.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/GetRouteRankingResult;", "", "userRankInfo", "Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", "rankingList", "", "<init>", "(Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;Ljava/util/List;)V", "getUserRankInfo", "()Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", "getRankingList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetRouteRankingResult {

    @SerializedName("top_list")
    @NotNull
    private final List<RankInfo> rankingList;

    @SerializedName("user_rank")
    @NotNull
    private final RankInfo userRankInfo;

    public GetRouteRankingResult(@NotNull RankInfo userRankInfo, @NotNull List<RankInfo> rankingList) {
        Intrinsics.checkNotNullParameter(userRankInfo, "userRankInfo");
        Intrinsics.checkNotNullParameter(rankingList, "rankingList");
        this.userRankInfo = userRankInfo;
        this.rankingList = rankingList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetRouteRankingResult copy$default(GetRouteRankingResult getRouteRankingResult, RankInfo rankInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            rankInfo = getRouteRankingResult.userRankInfo;
        }
        if ((i & 2) != 0) {
            list = getRouteRankingResult.rankingList;
        }
        return getRouteRankingResult.copy(rankInfo, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RankInfo getUserRankInfo() {
        return this.userRankInfo;
    }

    @NotNull
    public final List<RankInfo> component2() {
        return this.rankingList;
    }

    @NotNull
    public final GetRouteRankingResult copy(@NotNull RankInfo userRankInfo, @NotNull List<RankInfo> rankingList) {
        Intrinsics.checkNotNullParameter(userRankInfo, "userRankInfo");
        Intrinsics.checkNotNullParameter(rankingList, "rankingList");
        return new GetRouteRankingResult(userRankInfo, rankingList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetRouteRankingResult)) {
            return false;
        }
        GetRouteRankingResult getRouteRankingResult = (GetRouteRankingResult) other;
        return Intrinsics.areEqual(this.userRankInfo, getRouteRankingResult.userRankInfo) && Intrinsics.areEqual(this.rankingList, getRouteRankingResult.rankingList);
    }

    @NotNull
    public final List<RankInfo> getRankingList() {
        return this.rankingList;
    }

    @NotNull
    public final RankInfo getUserRankInfo() {
        return this.userRankInfo;
    }

    public int hashCode() {
        return (this.userRankInfo.hashCode() * 31) + this.rankingList.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetRouteRankingResult(userRankInfo=" + this.userRankInfo + ", rankingList=" + this.rankingList + ")";
    }
}
