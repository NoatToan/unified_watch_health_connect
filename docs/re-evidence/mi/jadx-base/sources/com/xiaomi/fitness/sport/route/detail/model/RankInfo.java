package com.xiaomi.fitness.sport.route.detail.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", "", "uid", "", "nickName", "", "icon", "rank", "", "score", Feature.CLOCK, "device", "<init>", "(JLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V", "getUid", "()J", "getNickName", "()Ljava/lang/String;", "getIcon", "getRank", "()I", "getScore", "getClock", "getDevice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RankInfo {

    @SerializedName(Feature.CLOCK)
    private final int clock;

    @SerializedName("device")
    @Nullable
    private final String device;

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

    public RankInfo(long j, @NotNull String nickName, @Nullable String str, int i, int i2, int i3, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        this.uid = j;
        this.nickName = nickName;
        this.icon = str;
        this.rank = i;
        this.score = i2;
        this.clock = i3;
        this.device = str2;
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

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getClock() {
        return this.clock;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    @NotNull
    public final RankInfo copy(long uid, @NotNull String nickName, @Nullable String icon, int rank, int score, int clock, @Nullable String device) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        return new RankInfo(uid, nickName, icon, rank, score, clock, device);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankInfo)) {
            return false;
        }
        RankInfo rankInfo = (RankInfo) other;
        return this.uid == rankInfo.uid && Intrinsics.areEqual(this.nickName, rankInfo.nickName) && Intrinsics.areEqual(this.icon, rankInfo.icon) && this.rank == rankInfo.rank && this.score == rankInfo.score && this.clock == rankInfo.clock && Intrinsics.areEqual(this.device, rankInfo.device);
    }

    public final int getClock() {
        return this.clock;
    }

    @Nullable
    public final String getDevice() {
        return this.device;
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
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.clock)) * 31;
        String str2 = this.device;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RankInfo(uid=" + this.uid + ", nickName=" + this.nickName + ", icon=" + this.icon + ", rank=" + this.rank + ", score=" + this.score + ", clock=" + this.clock + ", device=" + this.device + ")";
    }
}
