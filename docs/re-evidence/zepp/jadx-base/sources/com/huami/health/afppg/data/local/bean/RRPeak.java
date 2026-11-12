package com.huami.health.afppg.data.local.bean;

import androidx.annotation.Keep;
import androidx.room.Entity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.health.afppg.utils.PPGExtensionsKt;
import defpackage.b;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Entity(primaryKeys = {"generatedTime", "userId", "date", "dataType"}, tableName = RRPeak.TABLE_NAME)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\bM\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0001]B±\u0001\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\n\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0011\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020\u0004¢\u0006\u0004\b[\u0010\\J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\nHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J³\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u0004HÆ\u0001J\t\u0010)\u001a\u00020\u0004HÖ\u0001J\t\u0010*\u001a\u00020\u0002HÖ\u0001J\u0013\u0010,\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00102\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010-\u001a\u0004\b=\u0010/\"\u0004\b>\u00101R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010?\u001a\u0004\bD\u0010A\"\u0004\bE\u0010CR\"\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010?\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010-\u001a\u0004\bH\u0010/\"\u0004\bI\u00101R\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u00102\u001a\u0004\bL\u00104\"\u0004\bM\u00106R\"\u0010#\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00102\u001a\u0004\bS\u00104\"\u0004\bT\u00106R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010-\u001a\u0004\bU\u0010/\"\u0004\bV\u00101R\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00102\u001a\u0004\bW\u00104\"\u0004\bX\u00106R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00102\u001a\u0004\bY\u00104\"\u0004\bZ\u00106¨\u0006^"}, d2 = {"Lcom/huami/health/afppg/data/local/bean/RRPeak;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "component9", "component10", "component11", "component12", "", "component13", "component14", "component15", "component16", "component17", "deviceSource", "deviceId", "sn", "fwVer", "userId", "dataType", SessionDescription.p, "generatedTime", "lastRrPackageTime", "rrRecordSize", EcgData.LOCAL_ECG_RAW_FILE_PATH, EcgData.SERVER_RAW_FILE_PATH, "synced", "afData", "afResult", "timeZone", "date", "copy", "toString", "hashCode", "other", "equals", LogUtil.I, "getDeviceSource", "()I", "setDeviceSource", "(I)V", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "getSn", "setSn", "getFwVer", "setFwVer", "getUserId", "setUserId", "getDataType", "setDataType", "J", "getLength", "()J", "setLength", "(J)V", "getGeneratedTime", "setGeneratedTime", "getLastRrPackageTime", "setLastRrPackageTime", "getRrRecordSize", "setRrRecordSize", "getRawLocalPath", "setRawLocalPath", "getRawDataURI", "setRawDataURI", "Z", "getSynced", "()Z", "setSynced", "(Z)V", "getAfData", "setAfData", "getAfResult", "setAfResult", "getTimeZone", "setTimeZone", "getDate", "setDate", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJJILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RRPeak {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_VALUE_NUM = -1;

    @NotNull
    public static final String DEFAULT_VALUE_STRING = "0";

    @NotNull
    public static final String TABLE_NAME = "rrpeak";
    private static final long UNIT_SECOND_TO_MILLS = 1000;

    @NotNull
    private String afData;
    private int afResult;
    private int dataType;

    @NotNull
    private String date;

    @NotNull
    private String deviceId;
    private int deviceSource;

    @NotNull
    private String fwVer;
    private long generatedTime;
    private long lastRrPackageTime;
    private long length;

    @NotNull
    private String rawDataURI;

    @NotNull
    private String rawLocalPath;
    private int rrRecordSize;

    @NotNull
    private String sn;
    private boolean synced;

    @NotNull
    private String timeZone;

    @NotNull
    private String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/health/afppg/data/local/bean/RRPeak$Companion;", "", "Ljava/util/Calendar;", "calendar", "", "setTime", "", "DEFAULT_VALUE_NUM", LogUtil.I, "", "DEFAULT_VALUE_STRING", "Ljava/lang/String;", "TABLE_NAME", "UNIT_SECOND_TO_MILLS", "J", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long setTime(@NotNull Calendar calendar) {
            return calendar.getTimeInMillis() / 1000;
        }
    }

    public RRPeak() {
        this(0, null, null, null, null, 0, 0L, 0L, 0L, 0, null, null, false, null, 0, null, null, 131071, null);
    }

    public RRPeak(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, long j, long j2, long j3, int i3, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, int i4, @NotNull String str8, @NotNull String str9) {
        this.deviceSource = i;
        this.deviceId = str;
        this.sn = str2;
        this.fwVer = str3;
        this.userId = str4;
        this.dataType = i2;
        this.length = j;
        this.generatedTime = j2;
        this.lastRrPackageTime = j3;
        this.rrRecordSize = i3;
        this.rawLocalPath = str5;
        this.rawDataURI = str6;
        this.synced = z;
        this.afData = str7;
        this.afResult = i4;
        this.timeZone = str8;
        this.date = str9;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getRrRecordSize() {
        return this.rrRecordSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRawLocalPath() {
        return this.rawLocalPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRawDataURI() {
        return this.rawDataURI;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getSynced() {
        return this.synced;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAfData() {
        return this.afData;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getAfResult() {
        return this.afResult;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFwVer() {
        return this.fwVer;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getGeneratedTime() {
        return this.generatedTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getLastRrPackageTime() {
        return this.lastRrPackageTime;
    }

    @NotNull
    public final RRPeak copy(int deviceSource, @NotNull String deviceId, @NotNull String sn, @NotNull String fwVer, @NotNull String userId, int dataType, long length, long generatedTime, long lastRrPackageTime, int rrRecordSize, @NotNull String rawLocalPath, @NotNull String rawDataURI, boolean synced, @NotNull String afData, int afResult, @NotNull String timeZone, @NotNull String date) {
        return new RRPeak(deviceSource, deviceId, sn, fwVer, userId, dataType, length, generatedTime, lastRrPackageTime, rrRecordSize, rawLocalPath, rawDataURI, synced, afData, afResult, timeZone, date);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RRPeak)) {
            return false;
        }
        RRPeak rRPeak = (RRPeak) other;
        return this.deviceSource == rRPeak.deviceSource && Intrinsics.areEqual(this.deviceId, rRPeak.deviceId) && Intrinsics.areEqual(this.sn, rRPeak.sn) && Intrinsics.areEqual(this.fwVer, rRPeak.fwVer) && Intrinsics.areEqual(this.userId, rRPeak.userId) && this.dataType == rRPeak.dataType && this.length == rRPeak.length && this.generatedTime == rRPeak.generatedTime && this.lastRrPackageTime == rRPeak.lastRrPackageTime && this.rrRecordSize == rRPeak.rrRecordSize && Intrinsics.areEqual(this.rawLocalPath, rRPeak.rawLocalPath) && Intrinsics.areEqual(this.rawDataURI, rRPeak.rawDataURI) && this.synced == rRPeak.synced && Intrinsics.areEqual(this.afData, rRPeak.afData) && this.afResult == rRPeak.afResult && Intrinsics.areEqual(this.timeZone, rRPeak.timeZone) && Intrinsics.areEqual(this.date, rRPeak.date);
    }

    @NotNull
    public final String getAfData() {
        return this.afData;
    }

    public final int getAfResult() {
        return this.afResult;
    }

    public final int getDataType() {
        return this.dataType;
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

    public final long getGeneratedTime() {
        return this.generatedTime;
    }

    public final long getLastRrPackageTime() {
        return this.lastRrPackageTime;
    }

    public final long getLength() {
        return this.length;
    }

    @NotNull
    public final String getRawDataURI() {
        return this.rawDataURI;
    }

    @NotNull
    public final String getRawLocalPath() {
        return this.rawLocalPath;
    }

    public final int getRrRecordSize() {
        return this.rrRecordSize;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public final boolean getSynced() {
        return this.synced;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.deviceSource * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.fwVer.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataType) * 31) + b.a(this.length)) * 31) + b.a(this.generatedTime)) * 31) + b.a(this.lastRrPackageTime)) * 31) + this.rrRecordSize) * 31) + this.rawLocalPath.hashCode()) * 31) + this.rawDataURI.hashCode()) * 31;
        boolean z = this.synced;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + this.afData.hashCode()) * 31) + this.afResult) * 31) + this.timeZone.hashCode()) * 31) + this.date.hashCode();
    }

    public final void setAfData(@NotNull String str) {
        this.afData = str;
    }

    public final void setAfResult(int i) {
        this.afResult = i;
    }

    public final void setDataType(int i) {
        this.dataType = i;
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

    public final void setGeneratedTime(long j) {
        this.generatedTime = j;
    }

    public final void setLastRrPackageTime(long j) {
        this.lastRrPackageTime = j;
    }

    public final void setLength(long j) {
        this.length = j;
    }

    public final void setRawDataURI(@NotNull String str) {
        this.rawDataURI = str;
    }

    public final void setRawLocalPath(@NotNull String str) {
        this.rawLocalPath = str;
    }

    public final void setRrRecordSize(int i) {
        this.rrRecordSize = i;
    }

    public final void setSn(@NotNull String str) {
        this.sn = str;
    }

    public final void setSynced(boolean z) {
        this.synced = z;
    }

    public final void setTimeZone(@NotNull String str) {
        this.timeZone = str;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "RRPeak(deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", fwVer=" + this.fwVer + ", userId=" + this.userId + ", dataType=" + this.dataType + ", length=" + this.length + ", generatedTime=" + this.generatedTime + ", lastRrPackageTime=" + this.lastRrPackageTime + ", rrRecordSize=" + this.rrRecordSize + ", rawLocalPath=" + this.rawLocalPath + ", rawDataURI=" + this.rawDataURI + ", synced=" + this.synced + ", afData=" + this.afData + ", afResult=" + this.afResult + ", timeZone=" + this.timeZone + ", date=" + this.date + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RRPeak(int i, String str, String str2, String str3, String str4, int i2, long j, long j2, long j3, int i3, String str5, String str6, boolean z, String str7, int i4, String str8, String str9, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int i6 = (i5 & 1) != 0 ? -1 : i;
        String str10 = (i5 & 2) != 0 ? "0" : str;
        String str11 = (i5 & 4) != 0 ? "0" : str2;
        String str12 = (i5 & 8) != 0 ? "0" : str3;
        String str13 = (i5 & 16) != 0 ? "0" : str4;
        int i7 = (i5 & 32) != 0 ? -1 : i2;
        long j4 = (i5 & 64) != 0 ? -1L : j;
        long j5 = (i5 & 128) != 0 ? -1L : j2;
        long j6 = (i5 & 256) == 0 ? j3 : -1L;
        int i8 = (i5 & 512) != 0 ? -1 : i3;
        String str14 = (i5 & 1024) != 0 ? "0" : str5;
        String str15 = (i5 & 2048) != 0 ? "0" : str6;
        boolean z2 = (i5 & 4096) != 0 ? false : z;
        String str16 = (i5 & 8192) != 0 ? "0" : str7;
        int i9 = (i5 & 16384) != 0 ? -1 : i4;
        String id = (i5 & 32768) != 0 ? TimeZone.getDefault().getID() : str8;
        this(i6, str10, str11, str12, str13, i7, j4, j5, j6, i8, str14, str15, z2, str16, i9, id, (i5 & 65536) != 0 ? PPGExtensionsKt.toYMDHMS(j5, TimeZone.getTimeZone(id)) : str9);
    }
}
