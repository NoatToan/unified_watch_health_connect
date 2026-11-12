package com.huami.bodymeasurements.temperature.model.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Entity(tableName = "SingleTemp")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\bK\u0010LJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0007HÆ\u0003J\t\u0010\f\u001a\u00020\u0007HÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u0081\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u0007HÆ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u0015\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0016\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0017\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101R\u0019\u0010\u0018\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R\u0019\u0010\u0019\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101R\u0019\u0010\u001a\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u00105R\u0019\u0010\u001b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b?\u00101R\u0019\u0010\u001c\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010/\u001a\u0004\bA\u00101R\u0019\u0010\u001d\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bC\u00101R\"\u0010J\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/entity/SingleTempEntity;", "", "", "component1", "", "component2", "component3", "", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "timestamp", "temp", "envTemp", "userId", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "deviceType", "appName", "firmVersion", "phoneSource", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "F", "getTemp", "()F", "c", "getEnvTemp", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "e", LogUtil.I, "getDeviceSource", "()I", "f", "getDeviceId", "g", "getDeviceMac", "h", "getDeviceSn", "i", "getDeviceType", z.j, "getAppName", hl.k, "getFirmVersion", "l", "getPhoneSource", "m", "Z", "getSyncStatus", "()Z", "setSyncStatus", "(Z)V", "syncStatus", "<init>", "(JFFLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SingleTempEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float temp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float envTemp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceMac;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int deviceType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    private final String firmVersion;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @NotNull
    private final String phoneSource;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean syncStatus;

    public SingleTempEntity(long j, float f, float f2, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        this.timestamp = j;
        this.temp = f;
        this.envTemp = f2;
        this.userId = str;
        this.deviceSource = i;
        this.deviceId = str2;
        this.deviceMac = str3;
        this.deviceSn = str4;
        this.deviceType = i2;
        this.appName = str5;
        this.firmVersion = str6;
        this.phoneSource = str7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTemp() {
        return this.temp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getEnvTemp() {
        return this.envTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final SingleTempEntity copy(long timestamp, float temp, float envTemp, @NotNull String userId, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, int deviceType, @NotNull String appName, @NotNull String firmVersion, @NotNull String phoneSource) {
        return new SingleTempEntity(timestamp, temp, envTemp, userId, deviceSource, deviceId, deviceMac, deviceSn, deviceType, appName, firmVersion, phoneSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleTempEntity)) {
            return false;
        }
        SingleTempEntity singleTempEntity = (SingleTempEntity) other;
        return this.timestamp == singleTempEntity.timestamp && Intrinsics.areEqual((Object) Float.valueOf(this.temp), (Object) Float.valueOf(singleTempEntity.temp)) && Intrinsics.areEqual((Object) Float.valueOf(this.envTemp), (Object) Float.valueOf(singleTempEntity.envTemp)) && Intrinsics.areEqual(this.userId, singleTempEntity.userId) && this.deviceSource == singleTempEntity.deviceSource && Intrinsics.areEqual(this.deviceId, singleTempEntity.deviceId) && Intrinsics.areEqual(this.deviceMac, singleTempEntity.deviceMac) && Intrinsics.areEqual(this.deviceSn, singleTempEntity.deviceSn) && this.deviceType == singleTempEntity.deviceType && Intrinsics.areEqual(this.appName, singleTempEntity.appName) && Intrinsics.areEqual(this.firmVersion, singleTempEntity.firmVersion) && Intrinsics.areEqual(this.phoneSource, singleTempEntity.phoneSource);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
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

    public final float getEnvTemp() {
        return this.envTemp;
    }

    @NotNull
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @NotNull
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    public final boolean getSyncStatus() {
        return this.syncStatus;
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
        return (((((((((((((((((((((b.a(this.timestamp) * 31) + Float.floatToIntBits(this.temp)) * 31) + Float.floatToIntBits(this.envTemp)) * 31) + this.userId.hashCode()) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.deviceType) * 31) + this.appName.hashCode()) * 31) + this.firmVersion.hashCode()) * 31) + this.phoneSource.hashCode();
    }

    public final void setSyncStatus(boolean z) {
        this.syncStatus = z;
    }

    @NotNull
    public String toString() {
        return "SingleTempEntity(timestamp=" + this.timestamp + ", temp=" + this.temp + ", envTemp=" + this.envTemp + ", userId=" + this.userId + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ", deviceType=" + this.deviceType + ", appName=" + this.appName + ", firmVersion=" + this.firmVersion + ", phoneSource=" + this.phoneSource + ')';
    }
}
