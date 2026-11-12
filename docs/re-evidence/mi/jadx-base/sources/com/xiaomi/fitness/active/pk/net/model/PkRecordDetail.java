package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.active.pk.PkConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J]\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "", PkConstants.PARAM_PK_ID, "", "pkType", "", "pkStatus", "pkStartTimeInZeroTz", "pkEndTimeInZeroTz", "ownPkDetail", "Lcom/xiaomi/fitness/active/pk/net/model/UserPkDetail;", "oppPkDetail", "pkSettleTime", "<init>", "(JIIJJLcom/xiaomi/fitness/active/pk/net/model/UserPkDetail;Lcom/xiaomi/fitness/active/pk/net/model/UserPkDetail;J)V", "getPkId", "()J", "getPkType", "()I", "getPkStatus", "getPkStartTimeInZeroTz", "getPkEndTimeInZeroTz", "getOwnPkDetail", "()Lcom/xiaomi/fitness/active/pk/net/model/UserPkDetail;", "getOppPkDetail", "getPkSettleTime", "pkStartTime", "getPkStartTime", "pkEndTime", "getPkEndTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PkRecordDetail {

    @SerializedName("opp_pk_detail")
    @Nullable
    private final UserPkDetail oppPkDetail;

    @SerializedName("own_pk_detail")
    @Nullable
    private final UserPkDetail ownPkDetail;

    @SerializedName("pk_end_time")
    private final long pkEndTimeInZeroTz;

    @SerializedName("pk_id")
    private final long pkId;

    @SerializedName("pk_settle_time")
    private final long pkSettleTime;

    @SerializedName("pk_start_time")
    private final long pkStartTimeInZeroTz;

    @SerializedName("pk_status")
    private final int pkStatus;

    @SerializedName("pk_type")
    private final int pkType;

    public PkRecordDetail(long j, int i, int i2, long j2, long j3, @Nullable UserPkDetail userPkDetail, @Nullable UserPkDetail userPkDetail2, long j4) {
        this.pkId = j;
        this.pkType = i;
        this.pkStatus = i2;
        this.pkStartTimeInZeroTz = j2;
        this.pkEndTimeInZeroTz = j3;
        this.ownPkDetail = userPkDetail;
        this.oppPkDetail = userPkDetail2;
        this.pkSettleTime = j4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPkId() {
        return this.pkId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPkType() {
        return this.pkType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPkStatus() {
        return this.pkStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPkStartTimeInZeroTz() {
        return this.pkStartTimeInZeroTz;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPkEndTimeInZeroTz() {
        return this.pkEndTimeInZeroTz;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserPkDetail getOwnPkDetail() {
        return this.ownPkDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final UserPkDetail getOppPkDetail() {
        return this.oppPkDetail;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getPkSettleTime() {
        return this.pkSettleTime;
    }

    @NotNull
    public final PkRecordDetail copy(long pkId, int pkType, int pkStatus, long pkStartTimeInZeroTz, long pkEndTimeInZeroTz, @Nullable UserPkDetail ownPkDetail, @Nullable UserPkDetail oppPkDetail, long pkSettleTime) {
        return new PkRecordDetail(pkId, pkType, pkStatus, pkStartTimeInZeroTz, pkEndTimeInZeroTz, ownPkDetail, oppPkDetail, pkSettleTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PkRecordDetail)) {
            return false;
        }
        PkRecordDetail pkRecordDetail = (PkRecordDetail) other;
        return this.pkId == pkRecordDetail.pkId && this.pkType == pkRecordDetail.pkType && this.pkStatus == pkRecordDetail.pkStatus && this.pkStartTimeInZeroTz == pkRecordDetail.pkStartTimeInZeroTz && this.pkEndTimeInZeroTz == pkRecordDetail.pkEndTimeInZeroTz && Intrinsics.areEqual(this.ownPkDetail, pkRecordDetail.ownPkDetail) && Intrinsics.areEqual(this.oppPkDetail, pkRecordDetail.oppPkDetail) && this.pkSettleTime == pkRecordDetail.pkSettleTime;
    }

    @Nullable
    public final UserPkDetail getOppPkDetail() {
        return this.oppPkDetail;
    }

    @Nullable
    public final UserPkDetail getOwnPkDetail() {
        return this.ownPkDetail;
    }

    public final long getPkEndTime() {
        return FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(this.pkEndTimeInZeroTz, 0);
    }

    public final long getPkEndTimeInZeroTz() {
        return this.pkEndTimeInZeroTz;
    }

    public final long getPkId() {
        return this.pkId;
    }

    public final long getPkSettleTime() {
        return this.pkSettleTime;
    }

    public final long getPkStartTime() {
        return FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(this.pkStartTimeInZeroTz, 0);
    }

    public final long getPkStartTimeInZeroTz() {
        return this.pkStartTimeInZeroTz;
    }

    public final int getPkStatus() {
        return this.pkStatus;
    }

    public final int getPkType() {
        return this.pkType;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.pkId) * 31) + Integer.hashCode(this.pkType)) * 31) + Integer.hashCode(this.pkStatus)) * 31) + Long.hashCode(this.pkStartTimeInZeroTz)) * 31) + Long.hashCode(this.pkEndTimeInZeroTz)) * 31;
        UserPkDetail userPkDetail = this.ownPkDetail;
        int iHashCode2 = (iHashCode + (userPkDetail == null ? 0 : userPkDetail.hashCode())) * 31;
        UserPkDetail userPkDetail2 = this.oppPkDetail;
        return ((iHashCode2 + (userPkDetail2 != null ? userPkDetail2.hashCode() : 0)) * 31) + Long.hashCode(this.pkSettleTime);
    }

    @NotNull
    public String toString() {
        return "PkRecordDetail(pkId=" + this.pkId + ", pkType=" + this.pkType + ", pkStatus=" + this.pkStatus + ", pkStartTimeInZeroTz=" + this.pkStartTimeInZeroTz + ", pkEndTimeInZeroTz=" + this.pkEndTimeInZeroTz + ", ownPkDetail=" + this.ownPkDetail + ", oppPkDetail=" + this.oppPkDetail + ", pkSettleTime=" + this.pkSettleTime + ")";
    }
}
