package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003Jg\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0006HÖ\u0001J\t\u00102\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;", "", "ownUserInfo", "Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "oppUserInfo", "pkCount", "", "ownWinCount", "oppWinCount", "ownWinPercent", "", "rejectTimes", "", "drawCount", "inviteStatus", "<init>", "(Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;IIIFJII)V", "getOwnUserInfo", "()Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "getOppUserInfo", "getPkCount", "()I", "getOwnWinCount", "getOppWinCount", "getOwnWinPercent", "()F", "getRejectTimes", "()J", "getDrawCount", "getInviteStatus", "medalUrl", "", "getMedalUrl", "()Ljava/lang/String;", "setMedalUrl", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AggregatePkInfo {

    @SerializedName("draw_count")
    private final int drawCount;

    @SerializedName("i_status")
    private final int inviteStatus;

    @Nullable
    private String medalUrl;

    @SerializedName("opp_user_info")
    @Nullable
    private final UserInfo oppUserInfo;

    @SerializedName("opp_win_count")
    private final int oppWinCount;

    @SerializedName("own_user_info")
    @Nullable
    private final UserInfo ownUserInfo;

    @SerializedName("own_win_count")
    private final int ownWinCount;

    @SerializedName("own_winning_percent")
    private final float ownWinPercent;

    @SerializedName("pk_count")
    private final int pkCount;

    @SerializedName("invitation_rejected_times")
    private final long rejectTimes;

    public AggregatePkInfo(@Nullable UserInfo userInfo, @Nullable UserInfo userInfo2, int i, int i2, int i3, float f, long j, int i4, int i5) {
        this.ownUserInfo = userInfo;
        this.oppUserInfo = userInfo2;
        this.pkCount = i;
        this.ownWinCount = i2;
        this.oppWinCount = i3;
        this.ownWinPercent = f;
        this.rejectTimes = j;
        this.drawCount = i4;
        this.inviteStatus = i5;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserInfo getOwnUserInfo() {
        return this.ownUserInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserInfo getOppUserInfo() {
        return this.oppUserInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPkCount() {
        return this.pkCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOwnWinCount() {
        return this.ownWinCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOppWinCount() {
        return this.oppWinCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getOwnWinPercent() {
        return this.ownWinPercent;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getRejectTimes() {
        return this.rejectTimes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDrawCount() {
        return this.drawCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getInviteStatus() {
        return this.inviteStatus;
    }

    @NotNull
    public final AggregatePkInfo copy(@Nullable UserInfo ownUserInfo, @Nullable UserInfo oppUserInfo, int pkCount, int ownWinCount, int oppWinCount, float ownWinPercent, long rejectTimes, int drawCount, int inviteStatus) {
        return new AggregatePkInfo(ownUserInfo, oppUserInfo, pkCount, ownWinCount, oppWinCount, ownWinPercent, rejectTimes, drawCount, inviteStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AggregatePkInfo)) {
            return false;
        }
        AggregatePkInfo aggregatePkInfo = (AggregatePkInfo) other;
        return Intrinsics.areEqual(this.ownUserInfo, aggregatePkInfo.ownUserInfo) && Intrinsics.areEqual(this.oppUserInfo, aggregatePkInfo.oppUserInfo) && this.pkCount == aggregatePkInfo.pkCount && this.ownWinCount == aggregatePkInfo.ownWinCount && this.oppWinCount == aggregatePkInfo.oppWinCount && Float.compare(this.ownWinPercent, aggregatePkInfo.ownWinPercent) == 0 && this.rejectTimes == aggregatePkInfo.rejectTimes && this.drawCount == aggregatePkInfo.drawCount && this.inviteStatus == aggregatePkInfo.inviteStatus;
    }

    public final int getDrawCount() {
        return this.drawCount;
    }

    public final int getInviteStatus() {
        return this.inviteStatus;
    }

    @Nullable
    public final String getMedalUrl() {
        return this.medalUrl;
    }

    @Nullable
    public final UserInfo getOppUserInfo() {
        return this.oppUserInfo;
    }

    public final int getOppWinCount() {
        return this.oppWinCount;
    }

    @Nullable
    public final UserInfo getOwnUserInfo() {
        return this.ownUserInfo;
    }

    public final int getOwnWinCount() {
        return this.ownWinCount;
    }

    public final float getOwnWinPercent() {
        return this.ownWinPercent;
    }

    public final int getPkCount() {
        return this.pkCount;
    }

    public final long getRejectTimes() {
        return this.rejectTimes;
    }

    public int hashCode() {
        UserInfo userInfo = this.ownUserInfo;
        int iHashCode = (userInfo == null ? 0 : userInfo.hashCode()) * 31;
        UserInfo userInfo2 = this.oppUserInfo;
        return ((((((((((((((iHashCode + (userInfo2 != null ? userInfo2.hashCode() : 0)) * 31) + Integer.hashCode(this.pkCount)) * 31) + Integer.hashCode(this.ownWinCount)) * 31) + Integer.hashCode(this.oppWinCount)) * 31) + Float.hashCode(this.ownWinPercent)) * 31) + Long.hashCode(this.rejectTimes)) * 31) + Integer.hashCode(this.drawCount)) * 31) + Integer.hashCode(this.inviteStatus);
    }

    public final void setMedalUrl(@Nullable String str) {
        this.medalUrl = str;
    }

    @NotNull
    public String toString() {
        return "AggregatePkInfo(ownUserInfo=" + this.ownUserInfo + ", oppUserInfo=" + this.oppUserInfo + ", pkCount=" + this.pkCount + ", ownWinCount=" + this.ownWinCount + ", oppWinCount=" + this.oppWinCount + ", ownWinPercent=" + this.ownWinPercent + ", rejectTimes=" + this.rejectTimes + ", drawCount=" + this.drawCount + ", inviteStatus=" + this.inviteStatus + ")";
    }
}
