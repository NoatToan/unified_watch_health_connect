package com.huami.bloodpressure.service;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/huami/bloodpressure/service/BloodPressureExpireVo;", "", "", "component1", "", "component2", "deviceId", "expire", "copy", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "Z", "getExpire", "()Z", "<init>", "(Ljava/lang/String;Z)V", "bloodpressure-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureExpireVo {

    @NotNull
    private final String deviceId;
    private final boolean expire;

    public BloodPressureExpireVo(@NotNull String str, boolean z) {
        this.deviceId = str;
        this.expire = z;
    }

    public static /* synthetic */ BloodPressureExpireVo copy$default(BloodPressureExpireVo bloodPressureExpireVo, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bloodPressureExpireVo.deviceId;
        }
        if ((i & 2) != 0) {
            z = bloodPressureExpireVo.expire;
        }
        return bloodPressureExpireVo.copy(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getExpire() {
        return this.expire;
    }

    @NotNull
    public final BloodPressureExpireVo copy(@NotNull String deviceId, boolean expire) {
        return new BloodPressureExpireVo(deviceId, expire);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureExpireVo)) {
            return false;
        }
        BloodPressureExpireVo bloodPressureExpireVo = (BloodPressureExpireVo) other;
        return Intrinsics.areEqual(this.deviceId, bloodPressureExpireVo.deviceId) && this.expire == bloodPressureExpireVo.expire;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final boolean getExpire() {
        return this.expire;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.deviceId.hashCode() * 31;
        boolean z = this.expire;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "BloodPressureExpireVo(deviceId=" + this.deviceId + ", expire=" + this.expire + ")";
    }
}
