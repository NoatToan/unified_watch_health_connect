package com.xiaomi.hm.health.temperature.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Entity(tableName = "SingleTemp")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b4\u00105J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003JY\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0011\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0012\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u0019\u0010\u0013\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u0019\u0010\u0014\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u0019\u0010\u0015\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+¨\u00066"}, d2 = {"Lcom/xiaomi/hm/health/temperature/local/entity/SingleTempEntity;", "", "", "component1", "", "component2", "", "component3", "", "component4", "component5", "component6", "component7", "component8", "timestamp", "temp", "userId", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "deviceType", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "F", "getTemp", "()F", "c", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, LogUtil.I, "getDeviceSource", "()I", "e", "getDeviceId", "f", "getDeviceMac", "g", "getDeviceSn", "h", "getDeviceType", "<init>", "(JFLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SingleTempEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float temp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceMac;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int deviceType;

    public SingleTempEntity(long j, float f, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2) {
        this.timestamp = j;
        this.temp = f;
        this.userId = str;
        this.deviceSource = i;
        this.deviceId = str2;
        this.deviceMac = str3;
        this.deviceSn = str4;
        this.deviceType = i2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTemp() {
        return this.temp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final SingleTempEntity copy(long timestamp, float temp, @NotNull String userId, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, int deviceType) {
        return new SingleTempEntity(timestamp, temp, userId, deviceSource, deviceId, deviceMac, deviceSn, deviceType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleTempEntity)) {
            return false;
        }
        SingleTempEntity singleTempEntity = (SingleTempEntity) other;
        return this.timestamp == singleTempEntity.timestamp && Intrinsics.areEqual((Object) Float.valueOf(this.temp), (Object) Float.valueOf(singleTempEntity.temp)) && Intrinsics.areEqual(this.userId, singleTempEntity.userId) && this.deviceSource == singleTempEntity.deviceSource && Intrinsics.areEqual(this.deviceId, singleTempEntity.deviceId) && Intrinsics.areEqual(this.deviceMac, singleTempEntity.deviceMac) && Intrinsics.areEqual(this.deviceSn, singleTempEntity.deviceSn) && this.deviceType == singleTempEntity.deviceType;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final float getTemp() {
        return this.temp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((b.a(this.timestamp) * 31) + Float.floatToIntBits(this.temp)) * 31) + this.userId.hashCode()) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.deviceType;
    }

    @NotNull
    public String toString() {
        return "SingleTempEntity(timestamp=" + this.timestamp + ", temp=" + this.temp + ", userId=" + this.userId + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ", deviceType=" + this.deviceType + ")";
    }
}
