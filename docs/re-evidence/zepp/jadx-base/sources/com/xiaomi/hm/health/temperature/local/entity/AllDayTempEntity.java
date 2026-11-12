package com.xiaomi.hm.health.temperature.local.entity;

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

/* JADX INFO: loaded from: classes21.dex */
@Entity(tableName = "AllDayTemp")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b@\u0010AJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\bHÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003Jw\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\u0015\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0016\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0018\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R\u0019\u0010\u0019\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101R\u0019\u0010\u001a\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b=\u00101R\u0019\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u00107¨\u0006B"}, d2 = {"Lcom/xiaomi/hm/health/temperature/local/entity/AllDayTempEntity;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "", "component7", "component8", "component9", "component10", "component11", "timestamp", "maxTemp", "minTemp", "avgTemp", "data", "userId", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "deviceType", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "F", "getMaxTemp", "()F", "c", "getMinTemp", GoogleApiAvailabilityLight.a, "getAvgTemp", "e", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "f", "getUserId", "g", LogUtil.I, "getDeviceSource", "()I", "h", "getDeviceId", "i", "getDeviceMac", z.j, "getDeviceSn", hl.k, "getDeviceType", "<init>", "(JFFFLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
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

    public AllDayTempEntity(long j, float f, float f2, float f3, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i2) {
        this.timestamp = j;
        this.maxTemp = f;
        this.minTemp = f2;
        this.avgTemp = f3;
        this.data = str;
        this.userId = str2;
        this.deviceSource = i;
        this.deviceId = str3;
        this.deviceMac = str4;
        this.deviceSn = str5;
        this.deviceType = i2;
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
    public final AllDayTempEntity copy(long timestamp, float maxTemp, float minTemp, float avgTemp, @NotNull String data, @NotNull String userId, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, int deviceType) {
        return new AllDayTempEntity(timestamp, maxTemp, minTemp, avgTemp, data, userId, deviceSource, deviceId, deviceMac, deviceSn, deviceType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllDayTempEntity)) {
            return false;
        }
        AllDayTempEntity allDayTempEntity = (AllDayTempEntity) other;
        return this.timestamp == allDayTempEntity.timestamp && Intrinsics.areEqual((Object) Float.valueOf(this.maxTemp), (Object) Float.valueOf(allDayTempEntity.maxTemp)) && Intrinsics.areEqual((Object) Float.valueOf(this.minTemp), (Object) Float.valueOf(allDayTempEntity.minTemp)) && Intrinsics.areEqual((Object) Float.valueOf(this.avgTemp), (Object) Float.valueOf(allDayTempEntity.avgTemp)) && Intrinsics.areEqual(this.data, allDayTempEntity.data) && Intrinsics.areEqual(this.userId, allDayTempEntity.userId) && this.deviceSource == allDayTempEntity.deviceSource && Intrinsics.areEqual(this.deviceId, allDayTempEntity.deviceId) && Intrinsics.areEqual(this.deviceMac, allDayTempEntity.deviceMac) && Intrinsics.areEqual(this.deviceSn, allDayTempEntity.deviceSn) && this.deviceType == allDayTempEntity.deviceType;
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

    public final float getMaxTemp() {
        return this.maxTemp;
    }

    public final float getMinTemp() {
        return this.minTemp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((((((((b.a(this.timestamp) * 31) + Float.floatToIntBits(this.maxTemp)) * 31) + Float.floatToIntBits(this.minTemp)) * 31) + Float.floatToIntBits(this.avgTemp)) * 31) + this.data.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.deviceType;
    }

    @NotNull
    public String toString() {
        return "AllDayTempEntity(timestamp=" + this.timestamp + ", maxTemp=" + this.maxTemp + ", minTemp=" + this.minTemp + ", avgTemp=" + this.avgTemp + ", data=" + this.data + ", userId=" + this.userId + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ", deviceType=" + this.deviceType + ")";
    }
}
