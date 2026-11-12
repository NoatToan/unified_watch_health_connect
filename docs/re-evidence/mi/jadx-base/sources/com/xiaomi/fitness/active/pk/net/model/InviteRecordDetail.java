package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;", "", "inviterUserInfo", "Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "inviteeUserInfo", "pkType", "", "inviteStatus", "createTime", "", "<init>", "(Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;IIJ)V", "getInviterUserInfo", "()Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "getInviteeUserInfo", "getPkType", "()I", "getInviteStatus", "getCreateTime", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InviteRecordDetail {

    @SerializedName("c_time")
    private final long createTime;

    @SerializedName("i_status")
    private final int inviteStatus;

    @SerializedName("invitee_info")
    @Nullable
    private final UserInfo inviteeUserInfo;

    @SerializedName("inviter_info")
    @Nullable
    private final UserInfo inviterUserInfo;

    @SerializedName("pk_type")
    private final int pkType;

    public InviteRecordDetail(@Nullable UserInfo userInfo, @Nullable UserInfo userInfo2, int i, int i2, long j) {
        this.inviterUserInfo = userInfo;
        this.inviteeUserInfo = userInfo2;
        this.pkType = i;
        this.inviteStatus = i2;
        this.createTime = j;
    }

    public static /* synthetic */ InviteRecordDetail copy$default(InviteRecordDetail inviteRecordDetail, UserInfo userInfo, UserInfo userInfo2, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            userInfo = inviteRecordDetail.inviterUserInfo;
        }
        if ((i3 & 2) != 0) {
            userInfo2 = inviteRecordDetail.inviteeUserInfo;
        }
        UserInfo userInfo3 = userInfo2;
        if ((i3 & 4) != 0) {
            i = inviteRecordDetail.pkType;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = inviteRecordDetail.inviteStatus;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            j = inviteRecordDetail.createTime;
        }
        return inviteRecordDetail.copy(userInfo, userInfo3, i4, i5, j);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserInfo getInviterUserInfo() {
        return this.inviterUserInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserInfo getInviteeUserInfo() {
        return this.inviteeUserInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPkType() {
        return this.pkType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getInviteStatus() {
        return this.inviteStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final InviteRecordDetail copy(@Nullable UserInfo inviterUserInfo, @Nullable UserInfo inviteeUserInfo, int pkType, int inviteStatus, long createTime) {
        return new InviteRecordDetail(inviterUserInfo, inviteeUserInfo, pkType, inviteStatus, createTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteRecordDetail)) {
            return false;
        }
        InviteRecordDetail inviteRecordDetail = (InviteRecordDetail) other;
        return Intrinsics.areEqual(this.inviterUserInfo, inviteRecordDetail.inviterUserInfo) && Intrinsics.areEqual(this.inviteeUserInfo, inviteRecordDetail.inviteeUserInfo) && this.pkType == inviteRecordDetail.pkType && this.inviteStatus == inviteRecordDetail.inviteStatus && this.createTime == inviteRecordDetail.createTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getInviteStatus() {
        return this.inviteStatus;
    }

    @Nullable
    public final UserInfo getInviteeUserInfo() {
        return this.inviteeUserInfo;
    }

    @Nullable
    public final UserInfo getInviterUserInfo() {
        return this.inviterUserInfo;
    }

    public final int getPkType() {
        return this.pkType;
    }

    public int hashCode() {
        UserInfo userInfo = this.inviterUserInfo;
        int iHashCode = (userInfo == null ? 0 : userInfo.hashCode()) * 31;
        UserInfo userInfo2 = this.inviteeUserInfo;
        return ((((((iHashCode + (userInfo2 != null ? userInfo2.hashCode() : 0)) * 31) + Integer.hashCode(this.pkType)) * 31) + Integer.hashCode(this.inviteStatus)) * 31) + Long.hashCode(this.createTime);
    }

    @NotNull
    public String toString() {
        return "InviteRecordDetail(inviterUserInfo=" + this.inviterUserInfo + ", inviteeUserInfo=" + this.inviteeUserInfo + ", pkType=" + this.pkType + ", inviteStatus=" + this.inviteStatus + ", createTime=" + this.createTime + ")";
    }
}
