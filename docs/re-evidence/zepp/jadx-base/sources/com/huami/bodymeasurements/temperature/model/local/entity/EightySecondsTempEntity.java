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
@Entity(tableName = "EightySecondsTemp")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\t¢\u0006\u0004\bS\u0010TJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J\u0095\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\tHÆ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\u0013\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0014\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0015\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0016\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0019\u0010\u0017\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0018\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0019\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u0019\u0010\u001a\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R\u0019\u0010\u001b\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b?\u00109R\u0019\u0010\u001c\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u00109R\u0019\u0010\u001d\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\bC\u00109R\u0019\u0010\u001e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010-\u001a\u0004\bE\u0010/R\u0019\u0010\u001f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u00109R\u0019\u0010 \u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\bH\u00107\u001a\u0004\bI\u00109R\u0019\u0010!\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\bJ\u00107\u001a\u0004\bK\u00109R\"\u0010R\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/entity/EightySecondsTempEntity;", "", "", "component1", "", "component2", "component3", "", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "timestamp", "flag", "wearDuration", "temp", "rawData", "userId", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "deviceType", "appName", "firmVersion", "phoneSource", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", LogUtil.I, "getFlag", "()I", "c", "getWearDuration", GoogleApiAvailabilityLight.a, "F", "getTemp", "()F", "e", "Ljava/lang/String;", "getRawData", "()Ljava/lang/String;", "f", "getUserId", "g", "getDeviceSource", "h", "getDeviceId", "i", "getDeviceMac", z.j, "getDeviceSn", hl.k, "getDeviceType", "l", "getAppName", "m", "getFirmVersion", GoogleApiAvailabilityLight.b, "getPhoneSource", "o", "Z", "getSyncStatus", "()Z", "setSyncStatus", "(Z)V", "syncStatus", "<init>", "(JIIFLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EightySecondsTempEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int flag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int wearDuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float temp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String rawData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceMac;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final int deviceType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @NotNull
    private final String firmVersion;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @NotNull
    private final String phoneSource;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean syncStatus;

    public EightySecondsTempEntity(long j, int i, int i2, float f, @NotNull String str, @NotNull String str2, int i3, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i4, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        this.timestamp = j;
        this.flag = i;
        this.wearDuration = i2;
        this.temp = f;
        this.rawData = str;
        this.userId = str2;
        this.deviceSource = i3;
        this.deviceId = str3;
        this.deviceMac = str4;
        this.deviceSn = str5;
        this.deviceType = i4;
        this.appName = str6;
        this.firmVersion = str7;
        this.phoneSource = str8;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWearDuration() {
        return this.wearDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getTemp() {
        return this.temp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRawData() {
        return this.rawData;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    public final EightySecondsTempEntity copy(long timestamp, int flag, int wearDuration, float temp, @NotNull String rawData, @NotNull String userId, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, int deviceType, @NotNull String appName, @NotNull String firmVersion, @NotNull String phoneSource) {
        return new EightySecondsTempEntity(timestamp, flag, wearDuration, temp, rawData, userId, deviceSource, deviceId, deviceMac, deviceSn, deviceType, appName, firmVersion, phoneSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EightySecondsTempEntity)) {
            return false;
        }
        EightySecondsTempEntity eightySecondsTempEntity = (EightySecondsTempEntity) other;
        return this.timestamp == eightySecondsTempEntity.timestamp && this.flag == eightySecondsTempEntity.flag && this.wearDuration == eightySecondsTempEntity.wearDuration && Intrinsics.areEqual((Object) Float.valueOf(this.temp), (Object) Float.valueOf(eightySecondsTempEntity.temp)) && Intrinsics.areEqual(this.rawData, eightySecondsTempEntity.rawData) && Intrinsics.areEqual(this.userId, eightySecondsTempEntity.userId) && this.deviceSource == eightySecondsTempEntity.deviceSource && Intrinsics.areEqual(this.deviceId, eightySecondsTempEntity.deviceId) && Intrinsics.areEqual(this.deviceMac, eightySecondsTempEntity.deviceMac) && Intrinsics.areEqual(this.deviceSn, eightySecondsTempEntity.deviceSn) && this.deviceType == eightySecondsTempEntity.deviceType && Intrinsics.areEqual(this.appName, eightySecondsTempEntity.appName) && Intrinsics.areEqual(this.firmVersion, eightySecondsTempEntity.firmVersion) && Intrinsics.areEqual(this.phoneSource, eightySecondsTempEntity.phoneSource);
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

    @NotNull
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    public final int getFlag() {
        return this.flag;
    }

    @NotNull
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    @NotNull
    public final String getRawData() {
        return this.rawData;
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

    public final int getWearDuration() {
        return this.wearDuration;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((b.a(this.timestamp) * 31) + this.flag) * 31) + this.wearDuration) * 31) + Float.floatToIntBits(this.temp)) * 31) + this.rawData.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.deviceType) * 31) + this.appName.hashCode()) * 31) + this.firmVersion.hashCode()) * 31) + this.phoneSource.hashCode();
    }

    public final void setSyncStatus(boolean z) {
        this.syncStatus = z;
    }

    @NotNull
    public String toString() {
        return "EightySecondsTempEntity(timestamp=" + this.timestamp + ", flag=" + this.flag + ", wearDuration=" + this.wearDuration + ", temp=" + this.temp + ", rawData=" + this.rawData + ", userId=" + this.userId + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ", deviceType=" + this.deviceType + ", appName=" + this.appName + ", firmVersion=" + this.firmVersion + ", phoneSource=" + this.phoneSource + ')';
    }
}
