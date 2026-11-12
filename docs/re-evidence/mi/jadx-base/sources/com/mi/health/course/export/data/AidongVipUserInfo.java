package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import com.mi.health.course.api.CourseRequestV3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/mi/health/course/export/data/AidongVipUserInfo;", "", "productCode", "", "isVip", "", "dueTime", "", "serverTime", "<init>", "(Ljava/lang/String;ZJJ)V", "getProductCode", "()Ljava/lang/String;", "()Z", "getDueTime", "()J", "getServerTime", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AidongVipUserInfo {

    @SerializedName("due_time")
    private final long dueTime;

    @SerializedName("is_vip")
    private final boolean isVip;

    @SerializedName(CourseRequestV3.KEY_PRODUCT_CODE)
    @NotNull
    private final String productCode;

    @SerializedName("server_time")
    private final long serverTime;

    public AidongVipUserInfo(@NotNull String productCode, boolean z, long j, long j2) {
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        this.productCode = productCode;
        this.isVip = z;
        this.dueTime = j;
        this.serverTime = j2;
    }

    public static /* synthetic */ AidongVipUserInfo copy$default(AidongVipUserInfo aidongVipUserInfo, String str, boolean z, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aidongVipUserInfo.productCode;
        }
        if ((i & 2) != 0) {
            z = aidongVipUserInfo.isVip;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            j = aidongVipUserInfo.dueTime;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = aidongVipUserInfo.serverTime;
        }
        return aidongVipUserInfo.copy(str, z2, j3, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsVip() {
        return this.isVip;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDueTime() {
        return this.dueTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getServerTime() {
        return this.serverTime;
    }

    @NotNull
    public final AidongVipUserInfo copy(@NotNull String productCode, boolean isVip, long dueTime, long serverTime) {
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        return new AidongVipUserInfo(productCode, isVip, dueTime, serverTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AidongVipUserInfo)) {
            return false;
        }
        AidongVipUserInfo aidongVipUserInfo = (AidongVipUserInfo) other;
        return Intrinsics.areEqual(this.productCode, aidongVipUserInfo.productCode) && this.isVip == aidongVipUserInfo.isVip && this.dueTime == aidongVipUserInfo.dueTime && this.serverTime == aidongVipUserInfo.serverTime;
    }

    public final long getDueTime() {
        return this.dueTime;
    }

    @NotNull
    public final String getProductCode() {
        return this.productCode;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public int hashCode() {
        return (((((this.productCode.hashCode() * 31) + Boolean.hashCode(this.isVip)) * 31) + Long.hashCode(this.dueTime)) * 31) + Long.hashCode(this.serverTime);
    }

    public final boolean isVip() {
        return this.isVip;
    }

    @NotNull
    public String toString() {
        return "AidongVipUserInfo(productCode=" + this.productCode + ", isVip=" + this.isVip + ", dueTime=" + this.dueTime + ", serverTime=" + this.serverTime + ")";
    }
}
