package com.huami.treadmill.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0003J\u001b\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0003JA\u0010\n\u001a\u00020\u00002\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R.\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R.\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/treadmill/data/TdRankingList;", "", "", "", "", "Lcom/huami/treadmill/data/TdRankingItem;", "component1", "component2", "topRanks", "userRanks", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", "getTopRanks", "()Ljava/util/Map;", "getUserRanks", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TdRankingList {

    @SerializedName("topRanks")
    @NotNull
    private final Map<String, List<TdRankingItem>> topRanks;

    @SerializedName("userRanks")
    @NotNull
    private final Map<String, List<TdRankingItem>> userRanks;

    /* JADX WARN: Multi-variable type inference failed */
    public TdRankingList(@NotNull Map<String, ? extends List<TdRankingItem>> map, @NotNull Map<String, ? extends List<TdRankingItem>> map2) {
        this.topRanks = map;
        this.userRanks = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TdRankingList copy$default(TdRankingList tdRankingList, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = tdRankingList.topRanks;
        }
        if ((i & 2) != 0) {
            map2 = tdRankingList.userRanks;
        }
        return tdRankingList.copy(map, map2);
    }

    @NotNull
    public final Map<String, List<TdRankingItem>> component1() {
        return this.topRanks;
    }

    @NotNull
    public final Map<String, List<TdRankingItem>> component2() {
        return this.userRanks;
    }

    @NotNull
    public final TdRankingList copy(@NotNull Map<String, ? extends List<TdRankingItem>> topRanks, @NotNull Map<String, ? extends List<TdRankingItem>> userRanks) {
        return new TdRankingList(topRanks, userRanks);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TdRankingList)) {
            return false;
        }
        TdRankingList tdRankingList = (TdRankingList) other;
        return Intrinsics.areEqual(this.topRanks, tdRankingList.topRanks) && Intrinsics.areEqual(this.userRanks, tdRankingList.userRanks);
    }

    @NotNull
    public final Map<String, List<TdRankingItem>> getTopRanks() {
        return this.topRanks;
    }

    @NotNull
    public final Map<String, List<TdRankingItem>> getUserRanks() {
        return this.userRanks;
    }

    public int hashCode() {
        return (this.topRanks.hashCode() * 31) + this.userRanks.hashCode();
    }

    @NotNull
    public String toString() {
        return "TdRankingList(topRanks=" + this.topRanks + ", userRanks=" + this.userRanks + ')';
    }
}
