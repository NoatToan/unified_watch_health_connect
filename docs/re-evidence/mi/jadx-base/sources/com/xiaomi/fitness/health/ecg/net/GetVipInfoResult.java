package com.xiaomi.fitness.health.ecg.net;

import com.google.gson.annotations.SerializedName;
import com.mi.health.course.api.CourseRequestV3;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/net/GetVipInfoResult;", "", "vipType", "", "balanceNum", Constants.KEY_EXPIRED_TIME, "", "<init>", "(IIJ)V", "getVipType", "()I", "getBalanceNum", "getExpireTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetVipInfoResult {

    @SerializedName("balance_num")
    private final int balanceNum;

    @SerializedName(MiuiCursorConstants.EXPIRE_TIME)
    private final long expireTime;

    @SerializedName(CourseRequestV3.KEY_VIP_TYPE)
    private final int vipType;

    public GetVipInfoResult(int i, int i2, long j) {
        this.vipType = i;
        this.balanceNum = i2;
        this.expireTime = j;
    }

    public static /* synthetic */ GetVipInfoResult copy$default(GetVipInfoResult getVipInfoResult, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = getVipInfoResult.vipType;
        }
        if ((i3 & 2) != 0) {
            i2 = getVipInfoResult.balanceNum;
        }
        if ((i3 & 4) != 0) {
            j = getVipInfoResult.expireTime;
        }
        return getVipInfoResult.copy(i, i2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVipType() {
        return this.vipType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBalanceNum() {
        return this.balanceNum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    @NotNull
    public final GetVipInfoResult copy(int vipType, int balanceNum, long expireTime) {
        return new GetVipInfoResult(vipType, balanceNum, expireTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetVipInfoResult)) {
            return false;
        }
        GetVipInfoResult getVipInfoResult = (GetVipInfoResult) other;
        return this.vipType == getVipInfoResult.vipType && this.balanceNum == getVipInfoResult.balanceNum && this.expireTime == getVipInfoResult.expireTime;
    }

    public final int getBalanceNum() {
        return this.balanceNum;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final int getVipType() {
        return this.vipType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.vipType) * 31) + Integer.hashCode(this.balanceNum)) * 31) + Long.hashCode(this.expireTime);
    }

    @NotNull
    public String toString() {
        return "GetVipInfoResult(vipType=" + this.vipType + ", balanceNum=" + this.balanceNum + ", expireTime=" + this.expireTime + ")";
    }
}
