package com.xiaomi.fitness.sport.route.detail.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J_\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001a¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/RankingListItem;", "", "uid", "", "ranking", "", "userIcon", "", "username", "deviceName", "clockInTimes", "score", "isMyself", "", "<init>", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getUid", "()J", "getRanking", "()I", "getUserIcon", "()Ljava/lang/String;", "getUsername", "getDeviceName", "getClockInTimes", "getScore", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RankingListItem {
    private final int clockInTimes;

    @Nullable
    private final String deviceName;
    private final boolean isMyself;
    private final int ranking;
    private final int score;
    private final long uid;

    @Nullable
    private final String userIcon;

    @Nullable
    private final String username;

    public RankingListItem(long j, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, int i2, int i3, boolean z) {
        this.uid = j;
        this.ranking = i;
        this.userIcon = str;
        this.username = str2;
        this.deviceName = str3;
        this.clockInTimes = i2;
        this.score = i3;
        this.isMyself = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRanking() {
        return this.ranking;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserIcon() {
        return this.userIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getClockInTimes() {
        return this.clockInTimes;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsMyself() {
        return this.isMyself;
    }

    @NotNull
    public final RankingListItem copy(long uid, int ranking, @Nullable String userIcon, @Nullable String username, @Nullable String deviceName, int clockInTimes, int score, boolean isMyself) {
        return new RankingListItem(uid, ranking, userIcon, username, deviceName, clockInTimes, score, isMyself);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankingListItem)) {
            return false;
        }
        RankingListItem rankingListItem = (RankingListItem) other;
        return this.uid == rankingListItem.uid && this.ranking == rankingListItem.ranking && Intrinsics.areEqual(this.userIcon, rankingListItem.userIcon) && Intrinsics.areEqual(this.username, rankingListItem.username) && Intrinsics.areEqual(this.deviceName, rankingListItem.deviceName) && this.clockInTimes == rankingListItem.clockInTimes && this.score == rankingListItem.score && this.isMyself == rankingListItem.isMyself;
    }

    public final int getClockInTimes() {
        return this.clockInTimes;
    }

    @Nullable
    public final String getDeviceName() {
        return this.deviceName;
    }

    public final int getRanking() {
        return this.ranking;
    }

    public final int getScore() {
        return this.score;
    }

    public final long getUid() {
        return this.uid;
    }

    @Nullable
    public final String getUserIcon() {
        return this.userIcon;
    }

    @Nullable
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.uid) * 31) + Integer.hashCode(this.ranking)) * 31;
        String str = this.userIcon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.username;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceName;
        return ((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.clockInTimes)) * 31) + Integer.hashCode(this.score)) * 31) + Boolean.hashCode(this.isMyself);
    }

    public final boolean isMyself() {
        return this.isMyself;
    }

    @NotNull
    public String toString() {
        return "RankingListItem(uid=" + this.uid + ", ranking=" + this.ranking + ", userIcon=" + this.userIcon + ", username=" + this.username + ", deviceName=" + this.deviceName + ", clockInTimes=" + this.clockInTimes + ", score=" + this.score + ", isMyself=" + this.isMyself + ")";
    }

    public /* synthetic */ RankingListItem(long j, int i, String str, String str2, String str3, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, str, str2, str3, i2, i3, (i4 & 128) != 0 ? false : z);
    }
}
