package com.huami.bodymeasurements.temperature.model.remote.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huami.bodymeasurements.common.utils.TimeUtils;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003JQ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u0011\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b#\u0010\u001e¨\u0006&"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/remote/bean/ManualTempBean;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "timestamp", "temp", "userId", "eventType", "subType", "appName", "timeZone", "copy", "toString", "", "hashCode", "other", "", "equals", "J", "getTimestamp", "()J", "Ljava/lang/String;", "getTemp", "()Ljava/lang/String;", "getUserId", "getEventType", "getSubType", "getAppName", "getTimeZone", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ManualTempBean {

    @Nullable
    private final String appName;

    @NotNull
    private final String eventType;

    @NotNull
    private final String subType;

    @SerializedName("rawValue")
    @NotNull
    private final String temp;

    @NotNull
    private final String timeZone;
    private final long timestamp;

    @NotNull
    private final String userId;

    public ManualTempBean(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @androidx.annotation.Nullable @Nullable String str5, @NotNull String str6) {
        this.timestamp = j;
        this.temp = str;
        this.userId = str2;
        this.eventType = str3;
        this.subType = str4;
        this.appName = str5;
        this.timeZone = str6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTemp() {
        return this.temp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    public final ManualTempBean copy(long timestamp, @NotNull String temp, @NotNull String userId, @NotNull String eventType, @NotNull String subType, @androidx.annotation.Nullable @Nullable String appName, @NotNull String timeZone) {
        return new ManualTempBean(timestamp, temp, userId, eventType, subType, appName, timeZone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualTempBean)) {
            return false;
        }
        ManualTempBean manualTempBean = (ManualTempBean) other;
        return this.timestamp == manualTempBean.timestamp && Intrinsics.areEqual(this.temp, manualTempBean.temp) && Intrinsics.areEqual(this.userId, manualTempBean.userId) && Intrinsics.areEqual(this.eventType, manualTempBean.eventType) && Intrinsics.areEqual(this.subType, manualTempBean.subType) && Intrinsics.areEqual(this.appName, manualTempBean.appName) && Intrinsics.areEqual(this.timeZone, manualTempBean.timeZone);
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
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
        int iA = ((((((((b.a(this.timestamp) * 31) + this.temp.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode()) * 31;
        String str = this.appName;
        return ((iA + (str == null ? 0 : str.hashCode())) * 31) + this.timeZone.hashCode();
    }

    @NotNull
    public String toString() {
        return "ManualTempBean(timestamp=" + this.timestamp + ", temp=" + this.temp + ", userId=" + this.userId + ", eventType=" + this.eventType + ", subType=" + this.subType + ", appName=" + ((Object) this.appName) + ", timeZone=" + this.timeZone + ')';
    }

    public /* synthetic */ ManualTempBean(long j, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? "health_data" : str3, (i & 16) != 0 ? "temperature" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? TimeUtils.INSTANCE.getLocalTimeZoneDisplayName() : str6);
    }
}
