package com.xiaomi.fit.fitness.device.cgm.thirdparty;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.util.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmStatus;", "", Constants.PARAM_STATUS_CODE, "", "activeTime", "", "activeExpireTime", "<init>", "(ILjava/lang/Long;Ljava/lang/Long;)V", "getStatusCode", "()I", "getActiveTime", "()Ljava/lang/Long;", "setActiveTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getActiveExpireTime", "setActiveExpireTime", "component1", "component2", "component3", "copy", "(ILjava/lang/Long;Ljava/lang/Long;)Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmStatus;", "equals", "", "other", "hashCode", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ThirdPartyCgmStatus {

    @SerializedName("active_expire_time")
    @Nullable
    private Long activeExpireTime;

    @SerializedName("active_time")
    @Nullable
    private Long activeTime;

    @SerializedName("status_code")
    private final int statusCode;

    public ThirdPartyCgmStatus(@ThirdPartyCgmStatusCode int i, @Nullable Long l, @Nullable Long l2) {
        this.statusCode = i;
        this.activeTime = l;
        this.activeExpireTime = l2;
    }

    public static /* synthetic */ ThirdPartyCgmStatus copy$default(ThirdPartyCgmStatus thirdPartyCgmStatus, int i, Long l, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = thirdPartyCgmStatus.statusCode;
        }
        if ((i2 & 2) != 0) {
            l = thirdPartyCgmStatus.activeTime;
        }
        if ((i2 & 4) != 0) {
            l2 = thirdPartyCgmStatus.activeExpireTime;
        }
        return thirdPartyCgmStatus.copy(i, l, l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getActiveTime() {
        return this.activeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getActiveExpireTime() {
        return this.activeExpireTime;
    }

    @NotNull
    public final ThirdPartyCgmStatus copy(@ThirdPartyCgmStatusCode int statusCode, @Nullable Long activeTime, @Nullable Long activeExpireTime) {
        return new ThirdPartyCgmStatus(statusCode, activeTime, activeExpireTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdPartyCgmStatus)) {
            return false;
        }
        ThirdPartyCgmStatus thirdPartyCgmStatus = (ThirdPartyCgmStatus) other;
        return this.statusCode == thirdPartyCgmStatus.statusCode && Intrinsics.areEqual(this.activeTime, thirdPartyCgmStatus.activeTime) && Intrinsics.areEqual(this.activeExpireTime, thirdPartyCgmStatus.activeExpireTime);
    }

    @Nullable
    public final Long getActiveExpireTime() {
        return this.activeExpireTime;
    }

    @Nullable
    public final Long getActiveTime() {
        return this.activeTime;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.statusCode) * 31;
        Long l = this.activeTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.activeExpireTime;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final void setActiveExpireTime(@Nullable Long l) {
        this.activeExpireTime = l;
    }

    public final void setActiveTime(@Nullable Long l) {
        this.activeTime = l;
    }

    @NotNull
    public String toString() {
        return "ThirdPartyCgmStatus(statusCode=" + this.statusCode + ", activeTime=" + this.activeTime + ", activeExpireTime=" + this.activeExpireTime + ")";
    }

    public /* synthetic */ ThirdPartyCgmStatus(int i, Long l, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : l2);
    }
}
