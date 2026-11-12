package com.xiaomi.hm.health.training.api.bean;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0003J\u001b\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0003JA\u0010\n\u001a\u00020\u00002\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R+\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/training/api/bean/RankingList;", "", "", "", "", "Lcom/xiaomi/hm/health/training/api/bean/RankingItem;", "component1", "component2", "topRanks", "userRanks", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/Map;", "getTopRanks", "()Ljava/util/Map;", "b", "getUserRanks", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "training-cloud-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RankingList {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Map<String, List<RankingItem>> topRanks;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Map<String, List<RankingItem>> userRanks;

    /* JADX WARN: Multi-variable type inference failed */
    public RankingList(@NotNull Map<String, ? extends List<RankingItem>> map, @NotNull Map<String, ? extends List<RankingItem>> map2) {
        this.topRanks = map;
        this.userRanks = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankingList copy$default(RankingList rankingList, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = rankingList.topRanks;
        }
        if ((i & 2) != 0) {
            map2 = rankingList.userRanks;
        }
        return rankingList.copy(map, map2);
    }

    @NotNull
    public final Map<String, List<RankingItem>> component1() {
        return this.topRanks;
    }

    @NotNull
    public final Map<String, List<RankingItem>> component2() {
        return this.userRanks;
    }

    @NotNull
    public final RankingList copy(@NotNull Map<String, ? extends List<RankingItem>> topRanks, @NotNull Map<String, ? extends List<RankingItem>> userRanks) {
        return new RankingList(topRanks, userRanks);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankingList)) {
            return false;
        }
        RankingList rankingList = (RankingList) other;
        return Intrinsics.areEqual(this.topRanks, rankingList.topRanks) && Intrinsics.areEqual(this.userRanks, rankingList.userRanks);
    }

    @NotNull
    public final Map<String, List<RankingItem>> getTopRanks() {
        return this.topRanks;
    }

    @NotNull
    public final Map<String, List<RankingItem>> getUserRanks() {
        return this.userRanks;
    }

    public int hashCode() {
        return (this.topRanks.hashCode() * 31) + this.userRanks.hashCode();
    }

    @NotNull
    public String toString() {
        return "RankingList(topRanks=" + this.topRanks + ", userRanks=" + this.userRanks + ')';
    }
}
