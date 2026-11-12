package com.huami.bodymeasurements.temperature.model.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Entity(tableName = "AllDayTemp")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\f\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\bW\u0010XJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\bHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\bHÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J\t\u0010\u0011\u001a\u00020\fHÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\u009f\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\bHÆ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0016\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u0018\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u0019\u0010\u0019\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u001a\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u0019\u0010\u001b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0019\u0010\u001c\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u001d\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\bC\u00109R\u0019\u0010\u001e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\bD\u00107\u001a\u0004\bE\u00109R\u0019\u0010\u001f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u00109R\u0019\u0010 \u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010AR\u0019\u0010!\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\bJ\u00107\u001a\u0004\bK\u00109R\u0019\u0010\"\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\bL\u00107\u001a\u0004\bM\u00109R\u0019\u0010#\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\bN\u00107\u001a\u0004\bO\u00109R\"\u0010V\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006Y"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/entity/AllDayTempEntity;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "component7", "", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "timestamp", "maxTemp", "minTemp", "avgTemp", "data", "originalRawData", "userId", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "deviceType", "appName", "firmVersion", "phoneSource", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "F", "getMaxTemp", "()F", "c", "getMinTemp", GoogleApiAvailabilityLight.a, "getAvgTemp", "e", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "f", "getOriginalRawData", "g", "getUserId", "h", LogUtil.I, "getDeviceSource", "()I", "i", "getDeviceId", z.j, "getDeviceMac", hl.k, "getDeviceSn", "l", "getDeviceType", "m", "getAppName", GoogleApiAvailabilityLight.b, "getFirmVersion", "o", "getPhoneSource", b.r, "Z", "getSyncStatus", "()Z", "setSyncStatus", "(Z)V", "syncStatus", "<init>", "(JFFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AllDayTempEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float maxTemp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float minTemp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float avgTemp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String data;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String originalRawData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceMac;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final int deviceType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @NotNull
    private final String firmVersion;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @NotNull
    private final String phoneSource;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean syncStatus;

    public AllDayTempEntity(long j, float f, float f2, float f3, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        this.timestamp = j;
        this.maxTemp = f;
        this.minTemp = f2;
        this.avgTemp = f3;
        this.data = str;
        this.originalRawData = str2;
        this.userId = str3;
        this.deviceSource = i;
        this.deviceId = str4;
        this.deviceMac = str5;
        this.deviceSn = str6;
        this.deviceType = i2;
        this.appName = str7;
        this.firmVersion = str8;
        this.phoneSource = str9;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMaxTemp() {
        return this.maxTemp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMinTemp() {
        return this.minTemp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getAvgTemp() {
        return this.avgTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOriginalRawData() {
        return this.originalRawData;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final AllDayTempEntity copy(long timestamp, float maxTemp, float minTemp, float avgTemp, @NotNull String data, @NotNull String originalRawData, @NotNull String userId, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, int deviceType, @NotNull String appName, @NotNull String firmVersion, @NotNull String phoneSource) {
        return new AllDayTempEntity(timestamp, maxTemp, minTemp, avgTemp, data, originalRawData, userId, deviceSource, deviceId, deviceMac, deviceSn, deviceType, appName, firmVersion, phoneSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllDayTempEntity)) {
            return false;
        }
        AllDayTempEntity allDayTempEntity = (AllDayTempEntity) other;
        return this.timestamp == allDayTempEntity.timestamp && Intrinsics.areEqual((Object) Float.valueOf(this.maxTemp), (Object) Float.valueOf(allDayTempEntity.maxTemp)) && Intrinsics.areEqual((Object) Float.valueOf(this.minTemp), (Object) Float.valueOf(allDayTempEntity.minTemp)) && Intrinsics.areEqual((Object) Float.valueOf(this.avgTemp), (Object) Float.valueOf(allDayTempEntity.avgTemp)) && Intrinsics.areEqual(this.data, allDayTempEntity.data) && Intrinsics.areEqual(this.originalRawData, allDayTempEntity.originalRawData) && Intrinsics.areEqual(this.userId, allDayTempEntity.userId) && this.deviceSource == allDayTempEntity.deviceSource && Intrinsics.areEqual(this.deviceId, allDayTempEntity.deviceId) && Intrinsics.areEqual(this.deviceMac, allDayTempEntity.deviceMac) && Intrinsics.areEqual(this.deviceSn, allDayTempEntity.deviceSn) && this.deviceType == allDayTempEntity.deviceType && Intrinsics.areEqual(this.appName, allDayTempEntity.appName) && Intrinsics.areEqual(this.firmVersion, allDayTempEntity.firmVersion) && Intrinsics.areEqual(this.phoneSource, allDayTempEntity.phoneSource);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    public final float getAvgTemp() {
        return this.avgTemp;
    }

    @NotNull
    public final String getData() {
        return this.data;
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

    public final float getMaxTemp() {
        return this.maxTemp;
    }

    public final float getMinTemp() {
        return this.minTemp;
    }

    @NotNull
    public final String getOriginalRawData() {
        return this.originalRawData;
    }

    @NotNull
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((defpackage.b.a(this.timestamp) * 31) + Float.floatToIntBits(this.maxTemp)) * 31) + Float.floatToIntBits(this.minTemp)) * 31) + Float.floatToIntBits(this.avgTemp)) * 31) + this.data.hashCode()) * 31) + this.originalRawData.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.deviceType) * 31) + this.appName.hashCode()) * 31) + this.firmVersion.hashCode()) * 31) + this.phoneSource.hashCode();
    }

    public final void setSyncStatus(boolean z) {
        this.syncStatus = z;
    }

    @NotNull
    public String toString() {
        return "AllDayTempEntity(timestamp=" + this.timestamp + ", maxTemp=" + this.maxTemp + ", minTemp=" + this.minTemp + ", avgTemp=" + this.avgTemp + ", data=" + this.data + ", originalRawData=" + this.originalRawData + ", userId=" + this.userId + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ", deviceType=" + this.deviceType + ", appName=" + this.appName + ", firmVersion=" + this.firmVersion + ", phoneSource=" + this.phoneSource + ')';
    }
}
