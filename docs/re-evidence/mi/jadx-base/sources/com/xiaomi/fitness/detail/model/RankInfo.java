package com.xiaomi.fitness.detail.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/detail/model/RankInfo;", "", "uid", "", "nickName", "", "icon", "rank", "", "score", "<init>", "(JLjava/lang/String;Ljava/lang/String;II)V", "getUid", "()J", "getNickName", "()Ljava/lang/String;", "getIcon", "getRank", "()I", "getScore", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RankInfo {

    @SerializedName("icon")
    @Nullable
    private final String icon;

    @SerializedName("nick_name")
    @NotNull
    private final String nickName;

    @SerializedName("rank")
    private final int rank;

    @SerializedName("score")
    private final int score;

    @SerializedName("uid")
    private final long uid;

    public RankInfo(long j, @NotNull String nickName, @Nullable String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        this.uid = j;
        this.nickName = nickName;
        this.icon = str;
        this.rank = i;
        this.score = i2;
    }

    public static /* synthetic */ RankInfo copy$default(RankInfo rankInfo, long j, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = rankInfo.uid;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            str = rankInfo.nickName;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = rankInfo.icon;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            i = rankInfo.rank;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = rankInfo.score;
        }
        return rankInfo.copy(j2, str3, str4, i4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    @NotNull
    public final RankInfo copy(long uid, @NotNull String nickName, @Nullable String icon, int rank, int score) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        return new RankInfo(uid, nickName, icon, rank, score);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankInfo)) {
            return false;
        }
        RankInfo rankInfo = (RankInfo) other;
        return this.uid == rankInfo.uid && Intrinsics.areEqual(this.nickName, rankInfo.nickName) && Intrinsics.areEqual(this.icon, rankInfo.icon) && this.rank == rankInfo.rank && this.score == rankInfo.score;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getScore() {
        return this.score;
    }

    public final long getUid() {
        return this.uid;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.uid) * 31) + this.nickName.hashCode()) * 31;
        String str = this.icon;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.score);
    }

    @NotNull
    public String toString() {
        return "RankInfo(uid=" + this.uid + ", nickName=" + this.nickName + ", icon=" + this.icon + ", rank=" + this.rank + ", score=" + this.score + ")";
    }
}
