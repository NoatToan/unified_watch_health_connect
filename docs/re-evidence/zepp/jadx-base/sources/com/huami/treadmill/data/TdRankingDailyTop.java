package com.huami.treadmill.data;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/huami/treadmill/data/TdRankingDailyTop;", "", "", "", "Lcom/huami/treadmill/data/TdRankingDailyTopList;", "component1", "topRanks", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", "getTopRanks", "()Ljava/util/Map;", "setTopRanks", "(Ljava/util/Map;)V", "<init>", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TdRankingDailyTop {

    @SerializedName("topRanks")
    @NotNull
    private Map<String, TdRankingDailyTopList> topRanks;

    public TdRankingDailyTop(@NotNull Map<String, TdRankingDailyTopList> map) {
        this.topRanks = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TdRankingDailyTop copy$default(TdRankingDailyTop tdRankingDailyTop, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = tdRankingDailyTop.topRanks;
        }
        return tdRankingDailyTop.copy(map);
    }

    @NotNull
    public final Map<String, TdRankingDailyTopList> component1() {
        return this.topRanks;
    }

    @NotNull
    public final TdRankingDailyTop copy(@NotNull Map<String, TdRankingDailyTopList> topRanks) {
        return new TdRankingDailyTop(topRanks);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TdRankingDailyTop) && Intrinsics.areEqual(this.topRanks, ((TdRankingDailyTop) other).topRanks);
    }

    @NotNull
    public final Map<String, TdRankingDailyTopList> getTopRanks() {
        return this.topRanks;
    }

    public int hashCode() {
        return this.topRanks.hashCode();
    }

    public final void setTopRanks(@NotNull Map<String, TdRankingDailyTopList> map) {
        this.topRanks = map;
    }

    @NotNull
    public String toString() {
        return "TdRankingDailyTop(topRanks=" + this.topRanks + ')';
    }
}
