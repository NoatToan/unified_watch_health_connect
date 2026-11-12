package com.huami.bodymeasurements.temperature.model.remote.bean;

import androidx.annotation.Keep;
import com.huami.bodymeasurements.common.utils.TimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010)\u001a\u00020\u0004¢\u0006\u0004\bH\u0010IJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003JÔ\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010)\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b*\u0010+J\t\u0010,\u001a\u00020\u0004HÖ\u0001J\t\u0010-\u001a\u00020\u000bHÖ\u0001J\u0013\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0019\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u001a\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b7\u00106R\u0019\u0010\u001b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00104\u001a\u0004\b8\u00106R\u0019\u0010\u001c\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b9\u00106R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00104\u001a\u0004\b:\u00106R\u0019\u0010\u001e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u00104\u001a\u0004\b;\u00106R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b=\u0010\rR\u001b\u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u00104\u001a\u0004\b>\u00106R\u001b\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u00104\u001a\u0004\b?\u00106R\u001b\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u00104\u001a\u0004\b@\u00106R\u001b\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\bA\u0010\rR\u0019\u0010$\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\bB\u00106R\u0019\u0010%\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\bC\u00106R\u0019\u0010&\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\bD\u00106R\u001b\u0010'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b'\u00104\u001a\u0004\bE\u00106R\u001b\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\bF\u00106R\u0019\u0010)\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\bG\u00106¨\u0006J"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/remote/bean/AllDayTempBean;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "()Ljava/lang/Integer;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "timestamp", "maxTemp", "minTemp", "avgTemp", "rawData", "originalRawData", "userId", "deviceSource", "deviceId", ParamKey.deviceMac, "sn", "deviceType", "eventType", "subType", "appName", "firmVersion", "phoneSource", "timeZone", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/bodymeasurements/temperature/model/remote/bean/AllDayTempBean;", "toString", "hashCode", "other", "", "equals", "J", "getTimestamp", "()J", "Ljava/lang/String;", "getMaxTemp", "()Ljava/lang/String;", "getMinTemp", "getAvgTemp", "getRawData", "getOriginalRawData", "getUserId", "Ljava/lang/Integer;", "getDeviceSource", "getDeviceId", "getDeviceMac", "getSn", "getDeviceType", "getEventType", "getSubType", "getAppName", "getFirmVersion", "getPhoneSource", "getTimeZone", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AllDayTempBean {

    @NotNull
    private final String appName;

    @NotNull
    private final String avgTemp;

    @Nullable
    private final String deviceId;

    @Nullable
    private final String deviceMac;

    @Nullable
    private final Integer deviceSource;

    @Nullable
    private final Integer deviceType;

    @NotNull
    private final String eventType;

    @Nullable
    private final String firmVersion;

    @NotNull
    private final String maxTemp;

    @NotNull
    private final String minTemp;

    @Nullable
    private final String originalRawData;

    @Nullable
    private final String phoneSource;

    @NotNull
    private final String rawData;

    @Nullable
    private final String sn;

    @NotNull
    private final String subType;

    @NotNull
    private final String timeZone;
    private final long timestamp;

    @NotNull
    private final String userId;

    public AllDayTempBean(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @androidx.annotation.Nullable @Nullable String str5, @NotNull String str6, @androidx.annotation.Nullable @Nullable Integer num, @androidx.annotation.Nullable @Nullable String str7, @androidx.annotation.Nullable @Nullable String str8, @androidx.annotation.Nullable @Nullable String str9, @androidx.annotation.Nullable @Nullable Integer num2, @NotNull String str10, @NotNull String str11, @NotNull String str12, @androidx.annotation.Nullable @Nullable String str13, @androidx.annotation.Nullable @Nullable String str14, @NotNull String str15) {
        this.timestamp = j;
        this.maxTemp = str;
        this.minTemp = str2;
        this.avgTemp = str3;
        this.rawData = str4;
        this.originalRawData = str5;
        this.userId = str6;
        this.deviceSource = num;
        this.deviceId = str7;
        this.deviceMac = str8;
        this.sn = str9;
        this.deviceType = num2;
        this.eventType = str10;
        this.subType = str11;
        this.appName = str12;
        this.firmVersion = str13;
        this.phoneSource = str14;
        this.timeZone = str15;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMaxTemp() {
        return this.maxTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMinTemp() {
        return this.minTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvgTemp() {
        return this.avgTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRawData() {
        return this.rawData;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOriginalRawData() {
        return this.originalRawData;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final AllDayTempBean copy(long timestamp, @NotNull String maxTemp, @NotNull String minTemp, @NotNull String avgTemp, @NotNull String rawData, @androidx.annotation.Nullable @Nullable String originalRawData, @NotNull String userId, @androidx.annotation.Nullable @Nullable Integer deviceSource, @androidx.annotation.Nullable @Nullable String deviceId, @androidx.annotation.Nullable @Nullable String deviceMac, @androidx.annotation.Nullable @Nullable String sn, @androidx.annotation.Nullable @Nullable Integer deviceType, @NotNull String eventType, @NotNull String subType, @NotNull String appName, @androidx.annotation.Nullable @Nullable String firmVersion, @androidx.annotation.Nullable @Nullable String phoneSource, @NotNull String timeZone) {
        return new AllDayTempBean(timestamp, maxTemp, minTemp, avgTemp, rawData, originalRawData, userId, deviceSource, deviceId, deviceMac, sn, deviceType, eventType, subType, appName, firmVersion, phoneSource, timeZone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllDayTempBean)) {
            return false;
        }
        AllDayTempBean allDayTempBean = (AllDayTempBean) other;
        return this.timestamp == allDayTempBean.timestamp && Intrinsics.areEqual(this.maxTemp, allDayTempBean.maxTemp) && Intrinsics.areEqual(this.minTemp, allDayTempBean.minTemp) && Intrinsics.areEqual(this.avgTemp, allDayTempBean.avgTemp) && Intrinsics.areEqual(this.rawData, allDayTempBean.rawData) && Intrinsics.areEqual(this.originalRawData, allDayTempBean.originalRawData) && Intrinsics.areEqual(this.userId, allDayTempBean.userId) && Intrinsics.areEqual(this.deviceSource, allDayTempBean.deviceSource) && Intrinsics.areEqual(this.deviceId, allDayTempBean.deviceId) && Intrinsics.areEqual(this.deviceMac, allDayTempBean.deviceMac) && Intrinsics.areEqual(this.sn, allDayTempBean.sn) && Intrinsics.areEqual(this.deviceType, allDayTempBean.deviceType) && Intrinsics.areEqual(this.eventType, allDayTempBean.eventType) && Intrinsics.areEqual(this.subType, allDayTempBean.subType) && Intrinsics.areEqual(this.appName, allDayTempBean.appName) && Intrinsics.areEqual(this.firmVersion, allDayTempBean.firmVersion) && Intrinsics.areEqual(this.phoneSource, allDayTempBean.phoneSource) && Intrinsics.areEqual(this.timeZone, allDayTempBean.timeZone);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getAvgTemp() {
        return this.avgTemp;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @Nullable
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    public final Integer getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @NotNull
    public final String getMaxTemp() {
        return this.maxTemp;
    }

    @NotNull
    public final String getMinTemp() {
        return this.minTemp;
    }

    @Nullable
    public final String getOriginalRawData() {
        return this.originalRawData;
    }

    @Nullable
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    @NotNull
    public final String getRawData() {
        return this.rawData;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = ((((((((b.a(this.timestamp) * 31) + this.maxTemp.hashCode()) * 31) + this.minTemp.hashCode()) * 31) + this.avgTemp.hashCode()) * 31) + this.rawData.hashCode()) * 31;
        String str = this.originalRawData;
        int iHashCode = (((iA + (str == null ? 0 : str.hashCode())) * 31) + this.userId.hashCode()) * 31;
        Integer num = this.deviceSource;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.deviceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceMac;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sn;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.deviceType;
        int iHashCode6 = (((((((iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode()) * 31) + this.appName.hashCode()) * 31;
        String str5 = this.firmVersion;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phoneSource;
        return ((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.timeZone.hashCode();
    }

    @NotNull
    public String toString() {
        return "AllDayTempBean(timestamp=" + this.timestamp + ", maxTemp=" + this.maxTemp + ", minTemp=" + this.minTemp + ", avgTemp=" + this.avgTemp + ", rawData=" + this.rawData + ", originalRawData=" + ((Object) this.originalRawData) + ", userId=" + this.userId + ", deviceSource=" + this.deviceSource + ", deviceId=" + ((Object) this.deviceId) + ", deviceMac=" + ((Object) this.deviceMac) + ", sn=" + ((Object) this.sn) + ", deviceType=" + this.deviceType + ", eventType=" + this.eventType + ", subType=" + this.subType + ", appName=" + this.appName + ", firmVersion=" + ((Object) this.firmVersion) + ", phoneSource=" + ((Object) this.phoneSource) + ", timeZone=" + this.timeZone + ')';
    }

    public /* synthetic */ AllDayTempBean(long j, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, Integer num2, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, (i & 32) != 0 ? null : str5, str6, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? "allDayTemperature" : str10, (i & 8192) != 0 ? "allDayTemperature" : str11, str12, (32768 & i) != 0 ? null : str13, (65536 & i) != 0 ? null : str14, (i & 131072) != 0 ? TimeUtils.INSTANCE.getLocalTimeZoneDisplayName() : str15);
    }
}
