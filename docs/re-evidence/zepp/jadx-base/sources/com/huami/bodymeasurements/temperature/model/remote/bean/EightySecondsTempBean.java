package com.huami.bodymeasurements.temperature.model.remote.bean;

import android.util.TimeUtils;
import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.huami.bodymeasurements.temperature.model.remote.TempWebConstants;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010$\u001a\u00020\t\u0012\u0006\u0010%\u001a\u00020\t\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010(\u001a\u00020\t¢\u0006\u0004\bJ\u0010KJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JÈ\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010(\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b)\u0010*J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u0004HÖ\u0001J\u0013\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0019\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u001a\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00103\u001a\u0004\b6\u00105R\u001c\u0010\u001b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u001c\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u001d\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010:\u001a\u0004\b=\u0010<R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010>\u001a\u0004\b?\u0010\rR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b@\u0010<R\u001b\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\bA\u0010<R\u001b\u0010!\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010:\u001a\u0004\bB\u0010<R\u001b\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010>\u001a\u0004\bC\u0010\rR\u0019\u0010#\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010:\u001a\u0004\bD\u0010<R\u0019\u0010$\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010:\u001a\u0004\bE\u0010<R\u0019\u0010%\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010:\u001a\u0004\bF\u0010<R\u001b\u0010&\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010:\u001a\u0004\bG\u0010<R\u001b\u0010'\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010:\u001a\u0004\bH\u0010<R\u0019\u0010(\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010:\u001a\u0004\bI\u0010<¨\u0006L"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/remote/bean/EightySecondsTempBean;", "", "", "component1", "", "component2", "component3", "", "component4", "", "component5", "component6", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "timestamp", "flag", "wearDuration", "temp", "rawData", "userId", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "deviceType", "eventType", "subType", "appName", "firmVersion", "phoneSource", "timeZone", "copy", "(JIIFLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/bodymeasurements/temperature/model/remote/bean/EightySecondsTempBean;", "toString", "hashCode", "other", "", "equals", "J", "getTimestamp", "()J", LogUtil.I, "getFlag", "()I", "getWearDuration", "F", "getTemp", "()F", "Ljava/lang/String;", "getRawData", "()Ljava/lang/String;", "getUserId", "Ljava/lang/Integer;", "getDeviceSource", "getDeviceId", "getDeviceMac", "getDeviceSn", "getDeviceType", "getEventType", "getSubType", "getAppName", "getFirmVersion", "getPhoneSource", "getTimeZone", "<init>", "(JIIFLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EightySecondsTempBean {

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

    @NotNull
    private final String eventType;

    @Nullable
    private final String firmVersion;
    private final int flag;

    @Nullable
    private final String phoneSource;

    @NotNull
    private final String rawData;

    @NotNull
    private final String subType;

    @SerializedName("lastTempCalculateVal")
    private final float temp;

    @NotNull
    private final String timeZone;
    private final long timestamp;

    @NotNull
    private final String userId;

    @SerializedName("wearTime")
    private final int wearDuration;

    public EightySecondsTempBean(long j, int i, int i2, float f, @NotNull String str, @NotNull String str2, @androidx.annotation.Nullable @Nullable Integer num, @androidx.annotation.Nullable @Nullable String str3, @androidx.annotation.Nullable @Nullable String str4, @androidx.annotation.Nullable @Nullable String str5, @androidx.annotation.Nullable @Nullable Integer num2, @NotNull String str6, @NotNull String str7, @NotNull String str8, @androidx.annotation.Nullable @Nullable String str9, @androidx.annotation.Nullable @Nullable String str10, @NotNull String str11) {
        this.timestamp = j;
        this.flag = i;
        this.wearDuration = i2;
        this.temp = f;
        this.rawData = str;
        this.userId = str2;
        this.deviceSource = num;
        this.deviceId = str3;
        this.deviceMac = str4;
        this.deviceSn = str5;
        this.deviceType = num2;
        this.eventType = str6;
        this.subType = str7;
        this.appName = str8;
        this.firmVersion = str9;
        this.phoneSource = str10;
        this.timeZone = str11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
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

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    public final EightySecondsTempBean copy(long timestamp, int flag, int wearDuration, float temp, @NotNull String rawData, @NotNull String userId, @androidx.annotation.Nullable @Nullable Integer deviceSource, @androidx.annotation.Nullable @Nullable String deviceId, @androidx.annotation.Nullable @Nullable String deviceMac, @androidx.annotation.Nullable @Nullable String deviceSn, @androidx.annotation.Nullable @Nullable Integer deviceType, @NotNull String eventType, @NotNull String subType, @NotNull String appName, @androidx.annotation.Nullable @Nullable String firmVersion, @androidx.annotation.Nullable @Nullable String phoneSource, @NotNull String timeZone) {
        return new EightySecondsTempBean(timestamp, flag, wearDuration, temp, rawData, userId, deviceSource, deviceId, deviceMac, deviceSn, deviceType, eventType, subType, appName, firmVersion, phoneSource, timeZone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EightySecondsTempBean)) {
            return false;
        }
        EightySecondsTempBean eightySecondsTempBean = (EightySecondsTempBean) other;
        return this.timestamp == eightySecondsTempBean.timestamp && this.flag == eightySecondsTempBean.flag && this.wearDuration == eightySecondsTempBean.wearDuration && Intrinsics.areEqual((Object) Float.valueOf(this.temp), (Object) Float.valueOf(eightySecondsTempBean.temp)) && Intrinsics.areEqual(this.rawData, eightySecondsTempBean.rawData) && Intrinsics.areEqual(this.userId, eightySecondsTempBean.userId) && Intrinsics.areEqual(this.deviceSource, eightySecondsTempBean.deviceSource) && Intrinsics.areEqual(this.deviceId, eightySecondsTempBean.deviceId) && Intrinsics.areEqual(this.deviceMac, eightySecondsTempBean.deviceMac) && Intrinsics.areEqual(this.deviceSn, eightySecondsTempBean.deviceSn) && Intrinsics.areEqual(this.deviceType, eightySecondsTempBean.deviceType) && Intrinsics.areEqual(this.eventType, eightySecondsTempBean.eventType) && Intrinsics.areEqual(this.subType, eightySecondsTempBean.subType) && Intrinsics.areEqual(this.appName, eightySecondsTempBean.appName) && Intrinsics.areEqual(this.firmVersion, eightySecondsTempBean.firmVersion) && Intrinsics.areEqual(this.phoneSource, eightySecondsTempBean.phoneSource) && Intrinsics.areEqual(this.timeZone, eightySecondsTempBean.timeZone);
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

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    public final int getFlag() {
        return this.flag;
    }

    @Nullable
    public final String getPhoneSource() {
        return this.phoneSource;
    }

    @NotNull
    public final String getRawData() {
        return this.rawData;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    public final float getTemp() {
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

    public final int getWearDuration() {
        return this.wearDuration;
    }

    public int hashCode() {
        int iA = ((((((((((b.a(this.timestamp) * 31) + this.flag) * 31) + this.wearDuration) * 31) + Float.floatToIntBits(this.temp)) * 31) + this.rawData.hashCode()) * 31) + this.userId.hashCode()) * 31;
        Integer num = this.deviceSource;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.deviceId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceMac;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceSn;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.deviceType;
        int iHashCode5 = (((((((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode()) * 31) + this.appName.hashCode()) * 31;
        String str4 = this.firmVersion;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneSource;
        return ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.timeZone.hashCode();
    }

    @NotNull
    public String toString() {
        return "EightySecondsTempBean(timestamp=" + this.timestamp + ", flag=" + this.flag + ", wearDuration=" + this.wearDuration + ", temp=" + this.temp + ", rawData=" + this.rawData + ", userId=" + this.userId + ", deviceSource=" + this.deviceSource + ", deviceId=" + ((Object) this.deviceId) + ", deviceMac=" + ((Object) this.deviceMac) + ", deviceSn=" + ((Object) this.deviceSn) + ", deviceType=" + this.deviceType + ", eventType=" + this.eventType + ", subType=" + this.subType + ", appName=" + this.appName + ", firmVersion=" + ((Object) this.firmVersion) + ", phoneSource=" + ((Object) this.phoneSource) + ", timeZone=" + this.timeZone + ')';
    }

    public /* synthetic */ EightySecondsTempBean(long j, int i, int i2, float f, String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, f, str, str2, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : str3, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : str5, (i3 & 1024) != 0 ? null : num2, (i3 & 2048) != 0 ? TempWebConstants.EventType.EIGHTY_SECONDS_TEMPS : str6, (i3 & 4096) != 0 ? TempWebConstants.EventType.EIGHTY_SECONDS_TEMPS : str7, str8, (i3 & 16384) != 0 ? null : str9, (32768 & i3) != 0 ? null : str10, (i3 & 65536) != 0 ? TimeUtils.getTimeZoneDatabaseVersion() : str11);
    }
}
