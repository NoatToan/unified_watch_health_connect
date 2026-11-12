package com.huami.health.afppg.data.local.bean;

import androidx.annotation.Keep;
import androidx.room.Entity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.huami.ecg.core.db.entity.EcgData;
import defpackage.b;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Entity(primaryKeys = {SDKConstants.PARAM_USER_ID, "timestamp", "date"}, tableName = HREventData.TABLE_NAME)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0001RB\u009d\u0001\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\t\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\bP\u0010QJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\u009f\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u0002HÆ\u0001J\t\u0010$\u001a\u00020\u0002HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010)\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010)\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b7\u0010+\"\u0004\b8\u0010-R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00109\u001a\u0004\b>\u0010;\"\u0004\b?\u0010=R\"\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00109\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00109\u001a\u0004\bB\u0010;\"\u0004\bC\u0010=R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010)\u001a\u0004\bD\u0010+\"\u0004\bE\u0010-R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010)\u001a\u0004\bF\u0010+\"\u0004\bG\u0010-R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010)\u001a\u0004\bH\u0010+\"\u0004\bI\u0010-R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010)\u001a\u0004\bJ\u0010+\"\u0004\bK\u0010-R\"\u0010!\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00109\u001a\u0004\bL\u0010;\"\u0004\bM\u0010=R\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010)\u001a\u0004\bN\u0010+\"\u0004\bO\u0010-¨\u0006S"}, d2 = {"Lcom/huami/health/afppg/data/local/bean/HREventData;", "", "", "component1", "component2", "component3", "", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", SDKConstants.PARAM_USER_ID, "eventType", "subType", "timestamp", "timeZone", "duration", "highHR", "lowHR", "deviceSource", EcgData.DIAGNOSIS, "deviceID", "sn", "fwVer", "synced", "date", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserID", "()Ljava/lang/String;", "setUserID", "(Ljava/lang/String;)V", "getEventType", "setEventType", "getSubType", "setSubType", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "getTimeZone", "setTimeZone", LogUtil.I, "getDuration", "()I", "setDuration", "(I)V", "getHighHR", "setHighHR", "getLowHR", "setLowHR", "getDeviceSource", "setDeviceSource", "getDiagnosis", "setDiagnosis", "getDeviceID", "setDeviceID", "getSn", "setSn", "getFwVer", "setFwVer", "getSynced", "setSynced", "getDate", "setDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HREventData {

    @NotNull
    public static final String TABLE_NAME = "hr_events";

    @NotNull
    private String date;

    @NotNull
    private String deviceID;
    private int deviceSource;

    @NotNull
    private String diagnosis;
    private int duration;

    @NotNull
    private String eventType;

    @NotNull
    private String fwVer;
    private int highHR;
    private int lowHR;

    @NotNull
    private String sn;

    @NotNull
    private String subType;
    private int synced;

    @NotNull
    private String timeZone;
    private long timestamp;

    @NotNull
    private String userID;

    public HREventData() {
        this(null, null, null, 0L, null, 0, 0, 0, 0, null, null, null, null, 0, null, 32767, null);
    }

    public HREventData(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, int i, int i2, int i3, int i4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i5, @NotNull String str9) {
        this.userID = str;
        this.eventType = str2;
        this.subType = str3;
        this.timestamp = j;
        this.timeZone = str4;
        this.duration = i;
        this.highHR = i2;
        this.lowHR = i3;
        this.deviceSource = i4;
        this.diagnosis = str5;
        this.deviceID = str6;
        this.sn = str7;
        this.fwVer = str8;
        this.synced = i5;
        this.date = str9;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDiagnosis() {
        return this.diagnosis;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDeviceID() {
        return this.deviceID;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFwVer() {
        return this.fwVer;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSynced() {
        return this.synced;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHighHR() {
        return this.highHR;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getLowHR() {
        return this.lowHR;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final HREventData copy(@NotNull String userID, @NotNull String eventType, @NotNull String subType, long timestamp, @NotNull String timeZone, int duration, int highHR, int lowHR, int deviceSource, @NotNull String diagnosis, @NotNull String deviceID, @NotNull String sn, @NotNull String fwVer, int synced, @NotNull String date) {
        return new HREventData(userID, eventType, subType, timestamp, timeZone, duration, highHR, lowHR, deviceSource, diagnosis, deviceID, sn, fwVer, synced, date);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HREventData)) {
            return false;
        }
        HREventData hREventData = (HREventData) other;
        return Intrinsics.areEqual(this.userID, hREventData.userID) && Intrinsics.areEqual(this.eventType, hREventData.eventType) && Intrinsics.areEqual(this.subType, hREventData.subType) && this.timestamp == hREventData.timestamp && Intrinsics.areEqual(this.timeZone, hREventData.timeZone) && this.duration == hREventData.duration && this.highHR == hREventData.highHR && this.lowHR == hREventData.lowHR && this.deviceSource == hREventData.deviceSource && Intrinsics.areEqual(this.diagnosis, hREventData.diagnosis) && Intrinsics.areEqual(this.deviceID, hREventData.deviceID) && Intrinsics.areEqual(this.sn, hREventData.sn) && Intrinsics.areEqual(this.fwVer, hREventData.fwVer) && this.synced == hREventData.synced && Intrinsics.areEqual(this.date, hREventData.date);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getDeviceID() {
        return this.deviceID;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final String getDiagnosis() {
        return this.diagnosis;
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getFwVer() {
        return this.fwVer;
    }

    public final int getHighHR() {
        return this.highHR;
    }

    public final int getLowHR() {
        return this.lowHR;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    public final int getSynced() {
        return this.synced;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.userID.hashCode() * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode()) * 31) + b.a(this.timestamp)) * 31) + this.timeZone.hashCode()) * 31) + this.duration) * 31) + this.highHR) * 31) + this.lowHR) * 31) + this.deviceSource) * 31) + this.diagnosis.hashCode()) * 31) + this.deviceID.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.fwVer.hashCode()) * 31) + this.synced) * 31) + this.date.hashCode();
    }

    public final void setDate(@NotNull String str) {
        this.date = str;
    }

    public final void setDeviceID(@NotNull String str) {
        this.deviceID = str;
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setDiagnosis(@NotNull String str) {
        this.diagnosis = str;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setEventType(@NotNull String str) {
        this.eventType = str;
    }

    public final void setFwVer(@NotNull String str) {
        this.fwVer = str;
    }

    public final void setHighHR(int i) {
        this.highHR = i;
    }

    public final void setLowHR(int i) {
        this.lowHR = i;
    }

    public final void setSn(@NotNull String str) {
        this.sn = str;
    }

    public final void setSubType(@NotNull String str) {
        this.subType = str;
    }

    public final void setSynced(int i) {
        this.synced = i;
    }

    public final void setTimeZone(@NotNull String str) {
        this.timeZone = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setUserID(@NotNull String str) {
        this.userID = str;
    }

    @NotNull
    public String toString() {
        return "HREventData(userID=" + this.userID + ", eventType=" + this.eventType + ", subType=" + this.subType + ", timestamp=" + this.timestamp + ", timeZone=" + this.timeZone + ", duration=" + this.duration + ", highHR=" + this.highHR + ", lowHR=" + this.lowHR + ", deviceSource=" + this.deviceSource + ", diagnosis=" + this.diagnosis + ", deviceID=" + this.deviceID + ", sn=" + this.sn + ", fwVer=" + this.fwVer + ", synced=" + this.synced + ", date=" + this.date + ')';
    }

    public /* synthetic */ HREventData(String str, String str2, String str3, long j, String str4, int i, int i2, int i3, int i4, String str5, String str6, String str7, String str8, int i5, String str9, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? 0L : j, (i6 & 16) != 0 ? TimeZone.getDefault().getID() : str4, (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? 0 : i3, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) != 0 ? "" : str5, (i6 & 1024) != 0 ? "" : str6, (i6 & 2048) != 0 ? "" : str7, (i6 & 4096) != 0 ? "" : str8, (i6 & 8192) != 0 ? 0 : i5, (i6 & 16384) != 0 ? "" : str9);
    }
}
