package com.huami.bodymeasurements.temperature.model.remote.bean;

import android.util.TimeUtils;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J¶\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010#\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001J\u0013\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0016\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b/\u00100R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\u0018\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b2\u00100R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u00103\u001a\u0004\b4\u0010\nR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b5\u00100R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b6\u00100R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b7\u00100R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00103\u001a\u0004\b8\u0010\nR\u0019\u0010\u001e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b9\u00100R\u0019\u0010\u001f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b:\u00100R\u0019\u0010 \u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b;\u00100R\u001b\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b<\u00100R\u001b\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b=\u00100R\u0019\u0010#\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b>\u00100¨\u0006A"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/remote/bean/SingleTempBean;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "timestamp", "temp", "envTemp", "userId", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "deviceType", "eventType", "subType", "appName", "firmVersion", "phoneSource", "timeZone", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/bodymeasurements/temperature/model/remote/bean/SingleTempBean;", "toString", "hashCode", "other", "", "equals", "J", "getTimestamp", "()J", "Ljava/lang/String;", "getTemp", "()Ljava/lang/String;", "getEnvTemp", "getUserId", "Ljava/lang/Integer;", "getDeviceSource", "getDeviceId", "getDeviceMac", "getDeviceSn", "getDeviceType", "getEventType", "getSubType", "getAppName", "getFirmVersion", "getPhoneSource", "getTimeZone", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SingleTempBean {

    @NotNull
    private final String appName;

    @Nullable
    private final String deviceId;

    @Nullable
    private final String deviceMac;

    @Nullable
    private final String deviceSn;

    @Nullable
    private final Integer deviceSource;

    @Nullable
    private final Integer deviceType;

    @SerializedName("envCalculateVal")
    @Nullable
    private final String envTemp;

    @NotNull
    private final String eventType;

    @Nullable
    private final String firmVersion;

    @Nullable
    private final String phoneSource;

    @NotNull
    private final String subType;

    @SerializedName("tempCalculateVal")
    @NotNull
    private final String temp;

    @NotNull
    private final String timeZone;
    private final long timestamp;

    @NotNull
    private final String userId;

    public SingleTempBean(long j, @NotNull String str, @Nullable String str2, @NotNull String str3, @androidx.annotation.Nullable @Nullable Integer num, @androidx.annotation.Nullable @Nullable String str4, @androidx.annotation.Nullable @Nullable String str5, @androidx.annotation.Nullable @Nullable String str6, @androidx.annotation.Nullable @Nullable Integer num2, @NotNull String str7, @NotNull String str8, @NotNull String str9, @androidx.annotation.Nullable @Nullable String str10, @androidx.annotation.Nullable @Nullable String str11, @NotNull String str12) {
        this.timestamp = j;
        this.temp = str;
        this.envTemp = str2;
        this.userId = str3;
        this.deviceSource = num;
        this.deviceId = str4;
        this.deviceMac = str5;
        this.deviceSn = str6;
        this.deviceType = num2;
        this.eventType = str7;
        this.subType = str8;
        this.appName = str9;
        this.firmVersion = str10;
        this.phoneSource = str11;
        this.timeZone = str12;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTemp() {
        return this.temp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEnvTemp() {
        return this.envTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final SingleTempBean copy(long timestamp, @NotNull String temp, @Nullable String envTemp, @NotNull String userId, @androidx.annotation.Nullable @Nullable Integer deviceSource, @androidx.annotation.Nullable @Nullable String deviceId, @androidx.annotation.Nullable @Nullable String deviceMac, @androidx.annotation.Nullable @Nullable String deviceSn, @androidx.annotation.Nullable @Nullable Integer deviceType, @NotNull String eventType, @NotNull String subType, @NotNull String appName, @androidx.annotation.Nullable @Nullable String firmVersion, @androidx.annotation.Nullable @Nullable String phoneSource, @NotNull String timeZone) {
        return new SingleTempBean(timestamp, temp, envTemp, userId, deviceSource, deviceId, deviceMac, deviceSn, deviceType, eventType, subType, appName, firmVersion, phoneSource, timeZone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleTempBean)) {
            return false;
        }
        SingleTempBean singleTempBean = (SingleTempBean) other;
        return this.timestamp == singleTempBean.timestamp && Intrinsics.areEqual(this.temp, singleTempBean.temp) && Intrinsics.areEqual(this.envTemp, singleTempBean.envTemp) && Intrinsics.areEqual(this.userId, singleTempBean.userId) && Intrinsics.areEqual(this.deviceSource, singleTempBean.deviceSource) && Intrinsics.areEqual(this.deviceId, singleTempBean.deviceId) && Intrinsics.areEqual(this.deviceMac, singleTempBean.deviceMac) && Intrinsics.areEqual(this.deviceSn, singleTempBean.deviceSn) && Intrinsics.areEqual(this.deviceType, singleTempBean.deviceType) && Intrinsics.areEqual(this.eventType, singleTempBean.eventType) && Intrinsics.areEqual(this.subType, singleTempBean.subType) && Intrinsics.areEqual(this.appName, singleTempBean.appName) && Intrinsics.areEqual(this.firmVersion, singleTempBean.firmVersion) && Intrinsics.areEqual(this.phoneSource, singleTempBean.phoneSource) && Intrinsics.areEqual(this.timeZone, singleTempBean.timeZone);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
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
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    @Nullable
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    public final Integer getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getEnvTemp() {
        return this.envTemp;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @Nullable
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    @NotNull
    public final String getTemp() {
        return this.temp;
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
        int iA = ((b.a(this.timestamp) * 31) + this.temp.hashCode()) * 31;
        String str = this.envTemp;
        int iHashCode = (((iA + (str == null ? 0 : str.hashCode())) * 31) + this.userId.hashCode()) * 31;
        Integer num = this.deviceSource;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.deviceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceMac;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceSn;
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
        return "SingleTempBean(timestamp=" + this.timestamp + ", temp=" + this.temp + ", envTemp=" + ((Object) this.envTemp) + ", userId=" + this.userId + ", deviceSource=" + this.deviceSource + ", deviceId=" + ((Object) this.deviceId) + ", deviceMac=" + ((Object) this.deviceMac) + ", deviceSn=" + ((Object) this.deviceSn) + ", deviceType=" + this.deviceType + ", eventType=" + this.eventType + ", subType=" + this.subType + ", appName=" + this.appName + ", firmVersion=" + ((Object) this.firmVersion) + ", phoneSource=" + ((Object) this.phoneSource) + ", timeZone=" + this.timeZone + ')';
    }

    public /* synthetic */ SingleTempBean(long j, String str, String str2, String str3, Integer num, String str4, String str5, String str6, Integer num2, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i & 4) != 0 ? null : str2, str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? "singleTemperature" : str7, (i & 1024) != 0 ? "singleTemperature" : str8, str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? TimeUtils.getTimeZoneDatabaseVersion() : str12);
    }
}
