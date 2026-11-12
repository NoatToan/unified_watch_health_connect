package com.huami.treadmill.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J%\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/treadmill/data/TdRankingDailyTopList;", "", "", "Lcom/huami/treadmill/data/TdkingBean;", "component1", "", "component2", "topList", "nextKey", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getTopList", "()Ljava/util/List;", "setTopList", "(Ljava/util/List;)V", "Ljava/lang/String;", "getNextKey", "()Ljava/lang/String;", "setNextKey", "(Ljava/lang/String;)V", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TdRankingDailyTopList {

    @SerializedName("next")
    @Nullable
    private String nextKey;

    @SerializedName("rankingDailyTopList")
    @NotNull
    private List<TdkingBean> topList;

    public TdRankingDailyTopList(@NotNull List<TdkingBean> list, @Nullable String str) {
        this.topList = list;
        this.nextKey = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TdRankingDailyTopList copy$default(TdRankingDailyTopList tdRankingDailyTopList, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tdRankingDailyTopList.topList;
        }
        if ((i & 2) != 0) {
            str = tdRankingDailyTopList.nextKey;
        }
        return tdRankingDailyTopList.copy(list, str);
    }

    @NotNull
    public final List<TdkingBean> component1() {
        return this.topList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextKey() {
        return this.nextKey;
    }

    @NotNull
    public final TdRankingDailyTopList copy(@NotNull List<TdkingBean> topList, @Nullable String nextKey) {
        return new TdRankingDailyTopList(topList, nextKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TdRankingDailyTopList)) {
            return false;
        }
        TdRankingDailyTopList tdRankingDailyTopList = (TdRankingDailyTopList) other;
        return Intrinsics.areEqual(this.topList, tdRankingDailyTopList.topList) && Intrinsics.areEqual(this.nextKey, tdRankingDailyTopList.nextKey);
    }

    @Nullable
    public final String getNextKey() {
        return this.nextKey;
    }

    @NotNull
    public final List<TdkingBean> getTopList() {
        return this.topList;
    }

    public int hashCode() {
        int iHashCode = this.topList.hashCode() * 31;
        String str = this.nextKey;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setNextKey(@Nullable String str) {
        this.nextKey = str;
    }

    public final void setTopList(@NotNull List<TdkingBean> list) {
        this.topList = list;
    }

    @NotNull
    public String toString() {
        return "TdRankingDailyTopList(topList=" + this.topList + ", nextKey=" + ((Object) this.nextKey) + ')';
    }

    public /* synthetic */ TdRankingDailyTopList(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
