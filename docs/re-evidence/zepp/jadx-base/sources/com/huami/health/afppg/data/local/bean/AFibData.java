package com.huami.health.afppg.data.local.bean;

import androidx.annotation.Keep;
import androidx.room.Entity;
import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Entity(primaryKeys = {"userId", "timestamp", "date"}, tableName = "afib")
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\bD\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0001LB\u0089\u0001\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0005¢\u0006\u0004\bJ\u0010KJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u0007HÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u008b\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u0005HÆ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001J\u0013\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00101\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\"\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010,\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\"\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010'\u001a\u0004\b<\u0010)\"\u0004\b=\u0010+R\"\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010'\u001a\u0004\b>\u0010)\"\u0004\b?\u0010+R\"\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010'\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+R\"\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010'\u001a\u0004\bB\u0010)\"\u0004\bC\u0010+R\"\u0010\u001f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010'\u001a\u0004\bD\u0010)\"\u0004\bE\u0010+R\"\u0010 \u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010'\u001a\u0004\bF\u0010)\"\u0004\bG\u0010+R\"\u0010!\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010'\u001a\u0004\bH\u0010)\"\u0004\bI\u0010+¨\u0006M"}, d2 = {"Lcom/huami/health/afppg/data/local/bean/AFibData;", "", "", "isEmpty", "isNeedNotifyEvent", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "type", "timestamp", "deviceSource", "value", "groupTime", "synced", "userId", "sn", "deviceId", "appName", "fwVer", "timeZone", "date", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", LogUtil.I, "getDeviceSource", "()I", "setDeviceSource", "(I)V", "getValue", "setValue", "getGroupTime", "setGroupTime", "getSynced", "setSynced", "getUserId", "setUserId", "getSn", "setSn", "getDeviceId", "setDeviceId", "getAppName", "setAppName", "getFwVer", "setFwVer", "getTimeZone", "setTimeZone", "getDate", "setDate", "<init>", "(Ljava/lang/String;JIIJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AFibData {
    public static final int AFIB_ATRIAL_FIBRILLATION = 1;
    public static final int AFIB_BAD_SIGNAL = 3;
    public static final int AFIB_INSUFFICIENT_DATA = 0;
    public static final int AFIB_JHM_HIGH_HR = 100;
    public static final int AFIB_JHM_LOW_HR = 101;
    public static final int AFIB_NORMAL = 2;
    public static final int AFIB_UNABLE_JUDGE = 8;

    @NotNull
    public static final String TABLE_NAME = "afib";
    public static final int VALUE_SYNCED = 1;
    public static final int VALUE_UNSYNCED = 0;

    @NotNull
    private String appName;

    @NotNull
    private String date;

    @NotNull
    private String deviceId;
    private int deviceSource;

    @NotNull
    private String fwVer;
    private long groupTime;

    @NotNull
    private String sn;
    private int synced;

    @NotNull
    private String timeZone;
    private long timestamp;

    @NotNull
    private String type;

    @NotNull
    private String userId;
    private int value;

    public AFibData() {
        this(null, 0L, 0, 0, 0L, 0, null, null, null, null, null, null, null, 8191, null);
    }

    public AFibData(@NotNull String str, long j, int i, int i2, long j2, int i3, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        this.type = str;
        this.timestamp = j;
        this.deviceSource = i;
        this.value = i2;
        this.groupTime = j2;
        this.synced = i3;
        this.userId = str2;
        this.sn = str3;
        this.deviceId = str4;
        this.appName = str5;
        this.fwVer = str6;
        this.timeZone = str7;
        this.date = str8;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFwVer() {
        return this.fwVer;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getGroupTime() {
        return this.groupTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSynced() {
        return this.synced;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final AFibData copy(@NotNull String type, long timestamp, int deviceSource, int value, long groupTime, int synced, @NotNull String userId, @NotNull String sn, @NotNull String deviceId, @NotNull String appName, @NotNull String fwVer, @NotNull String timeZone, @NotNull String date) {
        return new AFibData(type, timestamp, deviceSource, value, groupTime, synced, userId, sn, deviceId, appName, fwVer, timeZone, date);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFibData)) {
            return false;
        }
        AFibData aFibData = (AFibData) other;
        return Intrinsics.areEqual(this.type, aFibData.type) && this.timestamp == aFibData.timestamp && this.deviceSource == aFibData.deviceSource && this.value == aFibData.value && this.groupTime == aFibData.groupTime && this.synced == aFibData.synced && Intrinsics.areEqual(this.userId, aFibData.userId) && Intrinsics.areEqual(this.sn, aFibData.sn) && Intrinsics.areEqual(this.deviceId, aFibData.deviceId) && Intrinsics.areEqual(this.appName, aFibData.appName) && Intrinsics.areEqual(this.fwVer, aFibData.fwVer) && Intrinsics.areEqual(this.timeZone, aFibData.timeZone) && Intrinsics.areEqual(this.date, aFibData.date);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final String getFwVer() {
        return this.fwVer;
    }

    public final long getGroupTime() {
        return this.groupTime;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
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
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.type.hashCode() * 31) + b.a(this.timestamp)) * 31) + this.deviceSource) * 31) + this.value) * 31) + b.a(this.groupTime)) * 31) + this.synced) * 31) + this.userId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.fwVer.hashCode()) * 31) + this.timeZone.hashCode()) * 31) + this.date.hashCode();
    }

    public final boolean isEmpty() {
        return Intrinsics.areEqual(this.userId, "");
    }

    public final boolean isNeedNotifyEvent() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 100, 101}).contains(Integer.valueOf(this.value));
    }

    public final void setAppName(@NotNull String str) {
        this.appName = str;
    }

    public final void setDate(@NotNull String str) {
        this.date = str;
    }

    public final void setDeviceId(@NotNull String str) {
        this.deviceId = str;
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setFwVer(@NotNull String str) {
        this.fwVer = str;
    }

    public final void setGroupTime(long j) {
        this.groupTime = j;
    }

    public final void setSn(@NotNull String str) {
        this.sn = str;
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

    public final void setType(@NotNull String str) {
        this.type = str;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "AFibData(type=" + this.type + ", timestamp=" + this.timestamp + ", deviceSource=" + this.deviceSource + ", value=" + this.value + ", groupTime=" + this.groupTime + ", synced=" + this.synced + ", userId=" + this.userId + ", sn=" + this.sn + ", deviceId=" + this.deviceId + ", appName=" + this.appName + ", fwVer=" + this.fwVer + ", timeZone=" + this.timeZone + ", date=" + this.date + ')';
    }

    public /* synthetic */ AFibData(String str, long j, int i, int i2, long j2, int i3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0L : j, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) == 0 ? j2 : 0L, (i4 & 32) == 0 ? i3 : 0, (i4 & 64) != 0 ? "" : str2, (i4 & 128) != 0 ? "" : str3, (i4 & 256) != 0 ? "" : str4, (i4 & 512) != 0 ? "" : str5, (i4 & 1024) != 0 ? "" : str6, (i4 & 2048) != 0 ? TimeZone.getDefault().getID() : str7, (i4 & 4096) == 0 ? str8 : "");
    }
}
