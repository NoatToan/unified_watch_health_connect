package com.huami.bloodoxygen.core.local.database.entity;

import androidx.annotation.Keep;
import androidx.room.Entity;
import androidx.room.Ignore;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import defpackage.b;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Entity(primaryKeys = {"userId", "utcTimestamp"}, tableName = "osa_process")
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\bR\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0014\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0014¢\u0006\u0004\bd\u0010eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rHÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\rHÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\rHÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\rHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0014HÆ\u0003JË\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u0014HÆ\u0001J\t\u0010*\u001a\u00020\u0002HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\u0013\u0010-\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u001b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00108\u001a\u0004\b=\u0010:\"\u0004\b>\u0010<R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010.\u001a\u0004\b?\u00100\"\u0004\b@\u00102R\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u00108\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010.\u001a\u0004\bC\u00100\"\u0004\bD\u00102R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010.\u001a\u0004\bE\u00100\"\u0004\bF\u00102R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010G\u001a\u0004\bL\u0010I\"\u0004\bM\u0010KR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010G\u001a\u0004\bP\u0010I\"\u0004\bQ\u0010KR\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010.\u001a\u0004\bR\u00100\"\u0004\bS\u00102R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010.\u001a\u0004\bT\u00100\"\u0004\bU\u00102R\"\u0010&\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010.\u001a\u0004\b[\u00100\"\u0004\b\\\u00102R\"\u0010(\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010V\u001a\u0004\b]\u0010X\"\u0004\b^\u0010ZR\"\u0010_\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010.\u001a\u0004\b`\u00100\"\u0004\ba\u00102R\u0013\u0010c\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\bb\u00105¨\u0006f"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/entity/OsaProcess;", "", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "", "component9", "component10", "component11", "component12", "component13", "component14", "", "component15", "component16", "component17", "userId", "utcTimestamp", "spo2", "duration", "timeZoneId", "deviceSource", "deviceId", "sn", "spo2High", "spo2Low", "signalQuality", "extended", "version", "date", "uploaded", "sleepDate", "toDelete", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "J", "getUtcTimestamp", "()J", "setUtcTimestamp", "(J)V", LogUtil.I, "getSpo2", "()I", "setSpo2", "(I)V", "getDuration", "setDuration", "getTimeZoneId", "setTimeZoneId", "getDeviceSource", "setDeviceSource", "getDeviceId", "setDeviceId", "getSn", "setSn", "Ljava/util/List;", "getSpo2High", "()Ljava/util/List;", "setSpo2High", "(Ljava/util/List;)V", "getSpo2Low", "setSpo2Low", "getSignalQuality", "setSignalQuality", "getExtended", "setExtended", "getVersion", "setVersion", "getDate", "setDate", "Z", "getUploaded", "()Z", "setUploaded", "(Z)V", "getSleepDate", "setSleepDate", "getToDelete", "setToDelete", "appName", "getAppName", "setAppName", "getTimestamp", "timestamp", "<init>", "(Ljava/lang/String;JIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OsaProcess {

    @Ignore
    @Expose
    @NotNull
    private String appName;

    @NotNull
    private String date;

    @Expose
    @NotNull
    private String deviceId;

    @Expose
    private int deviceSource;

    @SerializedName("validTime")
    @Expose
    private int duration;

    @Expose
    @NotNull
    private List<Integer> extended;

    @Expose
    @NotNull
    private List<Integer> signalQuality;

    @NotNull
    private String sleepDate;

    @Expose
    @NotNull
    private String sn;

    @Expose
    private int spo2;

    @Expose
    @NotNull
    private List<Integer> spo2High;

    @Expose
    @NotNull
    private List<Integer> spo2Low;

    @SerializedName("timezone")
    @Expose
    @NotNull
    private String timeZoneId;
    private boolean toDelete;
    private boolean uploaded;

    @NotNull
    private String userId;

    @SerializedName("timestamp")
    @Expose
    private long utcTimestamp;

    @Expose
    @NotNull
    private String version;

    public OsaProcess() {
        this(null, 0L, 0, 0, null, 0, null, null, null, null, null, null, null, null, false, null, false, 131071, null);
    }

    public OsaProcess(@NotNull String str, long j, int i, int i2, @NotNull String str2, int i3, @NotNull String str3, @NotNull String str4, @NotNull List<Integer> list, @NotNull List<Integer> list2, @NotNull List<Integer> list3, @NotNull List<Integer> list4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, boolean z2) {
        this.userId = str;
        this.utcTimestamp = j;
        this.spo2 = i;
        this.duration = i2;
        this.timeZoneId = str2;
        this.deviceSource = i3;
        this.deviceId = str3;
        this.sn = str4;
        this.spo2High = list;
        this.spo2Low = list2;
        this.signalQuality = list3;
        this.extended = list4;
        this.version = str5;
        this.date = str6;
        this.uploaded = z;
        this.sleepDate = str7;
        this.toDelete = z2;
        this.appName = "";
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final List<Integer> component10() {
        return this.spo2Low;
    }

    @NotNull
    public final List<Integer> component11() {
        return this.signalQuality;
    }

    @NotNull
    public final List<Integer> component12() {
        return this.extended;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getUploaded() {
        return this.uploaded;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSleepDate() {
        return this.sleepDate;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getToDelete() {
        return this.toDelete;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUtcTimestamp() {
        return this.utcTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSpo2() {
        return this.spo2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final List<Integer> component9() {
        return this.spo2High;
    }

    @NotNull
    public final OsaProcess copy(@NotNull String userId, long utcTimestamp, int spo2, int duration, @NotNull String timeZoneId, int deviceSource, @NotNull String deviceId, @NotNull String sn, @NotNull List<Integer> spo2High, @NotNull List<Integer> spo2Low, @NotNull List<Integer> signalQuality, @NotNull List<Integer> extended, @NotNull String version, @NotNull String date, boolean uploaded, @NotNull String sleepDate, boolean toDelete) {
        return new OsaProcess(userId, utcTimestamp, spo2, duration, timeZoneId, deviceSource, deviceId, sn, spo2High, spo2Low, signalQuality, extended, version, date, uploaded, sleepDate, toDelete);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OsaProcess)) {
            return false;
        }
        OsaProcess osaProcess = (OsaProcess) other;
        return Intrinsics.areEqual(this.userId, osaProcess.userId) && this.utcTimestamp == osaProcess.utcTimestamp && this.spo2 == osaProcess.spo2 && this.duration == osaProcess.duration && Intrinsics.areEqual(this.timeZoneId, osaProcess.timeZoneId) && this.deviceSource == osaProcess.deviceSource && Intrinsics.areEqual(this.deviceId, osaProcess.deviceId) && Intrinsics.areEqual(this.sn, osaProcess.sn) && Intrinsics.areEqual(this.spo2High, osaProcess.spo2High) && Intrinsics.areEqual(this.spo2Low, osaProcess.spo2Low) && Intrinsics.areEqual(this.signalQuality, osaProcess.signalQuality) && Intrinsics.areEqual(this.extended, osaProcess.extended) && Intrinsics.areEqual(this.version, osaProcess.version) && Intrinsics.areEqual(this.date, osaProcess.date) && this.uploaded == osaProcess.uploaded && Intrinsics.areEqual(this.sleepDate, osaProcess.sleepDate) && this.toDelete == osaProcess.toDelete;
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

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final List<Integer> getExtended() {
        return this.extended;
    }

    @NotNull
    public final List<Integer> getSignalQuality() {
        return this.signalQuality;
    }

    @NotNull
    public final String getSleepDate() {
        return this.sleepDate;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public final int getSpo2() {
        return this.spo2;
    }

    @NotNull
    public final List<Integer> getSpo2High() {
        return this.spo2High;
    }

    @NotNull
    public final List<Integer> getSpo2Low() {
        return this.spo2Low;
    }

    @NotNull
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    public final long getTimestamp() {
        return ExtensionKt.yMDHMSToTimestamp(this.date);
    }

    public final boolean getToDelete() {
        return this.toDelete;
    }

    public final boolean getUploaded() {
        return this.uploaded;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final long getUtcTimestamp() {
        return this.utcTimestamp;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24, types: [int] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.userId.hashCode() * 31) + b.a(this.utcTimestamp)) * 31) + this.spo2) * 31) + this.duration) * 31) + this.timeZoneId.hashCode()) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.spo2High.hashCode()) * 31) + this.spo2Low.hashCode()) * 31) + this.signalQuality.hashCode()) * 31) + this.extended.hashCode()) * 31) + this.version.hashCode()) * 31) + this.date.hashCode()) * 31;
        boolean z = this.uploaded;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + this.sleepDate.hashCode()) * 31;
        boolean z2 = this.toDelete;
        return iHashCode2 + (z2 ? 1 : z2);
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

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setExtended(@NotNull List<Integer> list) {
        this.extended = list;
    }

    public final void setSignalQuality(@NotNull List<Integer> list) {
        this.signalQuality = list;
    }

    public final void setSleepDate(@NotNull String str) {
        this.sleepDate = str;
    }

    public final void setSn(@NotNull String str) {
        this.sn = str;
    }

    public final void setSpo2(int i) {
        this.spo2 = i;
    }

    public final void setSpo2High(@NotNull List<Integer> list) {
        this.spo2High = list;
    }

    public final void setSpo2Low(@NotNull List<Integer> list) {
        this.spo2Low = list;
    }

    public final void setTimeZoneId(@NotNull String str) {
        this.timeZoneId = str;
    }

    public final void setToDelete(boolean z) {
        this.toDelete = z;
    }

    public final void setUploaded(boolean z) {
        this.uploaded = z;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void setUtcTimestamp(long j) {
        this.utcTimestamp = j;
    }

    public final void setVersion(@NotNull String str) {
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "OsaProcess(userId=" + this.userId + ", utcTimestamp=" + this.utcTimestamp + ", spo2=" + this.spo2 + ", duration=" + this.duration + ", timeZoneId=" + this.timeZoneId + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", spo2High=" + this.spo2High + ", spo2Low=" + this.spo2Low + ", signalQuality=" + this.signalQuality + ", extended=" + this.extended + ", version=" + this.version + ", date=" + this.date + ", uploaded=" + this.uploaded + ", sleepDate=" + this.sleepDate + ", toDelete=" + this.toDelete + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OsaProcess(String str, long j, int i, int i2, String str2, int i3, String str3, String str4, List list, List list2, List list3, List list4, String str5, String str6, boolean z, String str7, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        String str8 = (i4 & 1) != 0 ? "" : str;
        long j2 = (i4 & 2) != 0 ? -1L : j;
        int i5 = (i4 & 4) != 0 ? -1 : i;
        int i6 = (i4 & 8) != 0 ? -1 : i2;
        String id = (i4 & 16) != 0 ? TimeZone.getDefault().getID() : str2;
        this(str8, j2, i5, i6, id, (i4 & 32) == 0 ? i3 : -1, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? "" : str4, (i4 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i4 & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i4 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i4 & 4096) != 0 ? "" : str5, (i4 & 8192) != 0 ? ExtensionKt.toYMDHMS(j2, TimeZone.getTimeZone(id)) : str6, (i4 & 16384) != 0 ? false : z, (i4 & 32768) != 0 ? "" : str7, (i4 & 65536) == 0 ? z2 : false);
    }
}
