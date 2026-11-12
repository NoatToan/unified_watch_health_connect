package com.xiaomi.hm.health.bt.sdk.spo2;

import androidx.annotation.Keep;
import androidx.room.Entity;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.ln;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Entity(primaryKeys = {"userId", "utcTimestamp"}, tableName = "origin_osa_process")
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eHÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eHÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0014HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eHÆ\u0003J\u00ad\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u0010B\u001a\u00020\u00142\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0007HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010)\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+¨\u0006F"}, d2 = {"Lcom/xiaomi/hm/health/bt/sdk/spo2/OriginOsaProcess;", "", "userId", "", "utcTimestamp", "", "spo2", "", "duration", "timeZoneId", "deviceSource", "deviceId", "sn", "spo2High", "", "spo2Low", "signalQuality", "extended", DialWidgetType.DATE, "uploaded", "", "(Ljava/lang/String;JIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "appName", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "getDate", "setDate", "getDeviceId", "getDeviceSource", "()I", "getDuration", "getExtended", "()Ljava/util/List;", "getSignalQuality", "getSn", "getSpo2", "getSpo2High", "getSpo2Low", "getTimeZoneId", "timestamp", "getTimestamp", "()J", "getUploaded", "()Z", "setUploaded", "(Z)V", "getUserId", "setUserId", "getUtcTimestamp", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "btData_wearRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OriginOsaProcess {

    @Expose
    @NotNull
    private String appName;

    @NotNull
    private String date;

    @Expose
    @NotNull
    private final String deviceId;

    @Expose
    private final int deviceSource;

    @SerializedName("validTime")
    @Expose
    private final int duration;

    @Expose
    @NotNull
    private final List<Integer> extended;

    @Expose
    @NotNull
    private final List<Integer> signalQuality;

    @Expose
    @NotNull
    private final String sn;

    @Expose
    private final int spo2;

    @Expose
    @NotNull
    private final List<Integer> spo2High;

    @Expose
    @NotNull
    private final List<Integer> spo2Low;

    @SerializedName("timezone")
    @Expose
    @NotNull
    private final String timeZoneId;
    private boolean uploaded;

    @NotNull
    private String userId;

    @SerializedName("timestamp")
    @Expose
    private final long utcTimestamp;

    public OriginOsaProcess() {
        this(null, 0L, 0, 0, null, 0, null, null, null, null, null, null, null, false, 16383, null);
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
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getUploaded() {
        return this.uploaded;
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
    public final OriginOsaProcess copy(@NotNull String userId, long utcTimestamp, int spo2, int duration, @NotNull String timeZoneId, int deviceSource, @NotNull String deviceId, @NotNull String sn, @NotNull List<Integer> spo2High, @NotNull List<Integer> spo2Low, @NotNull List<Integer> signalQuality, @NotNull List<Integer> extended, @NotNull String date, boolean uploaded) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(timeZoneId, "timeZoneId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(spo2High, "spo2High");
        Intrinsics.checkNotNullParameter(spo2Low, "spo2Low");
        Intrinsics.checkNotNullParameter(signalQuality, "signalQuality");
        Intrinsics.checkNotNullParameter(extended, "extended");
        Intrinsics.checkNotNullParameter(date, "date");
        return new OriginOsaProcess(userId, utcTimestamp, spo2, duration, timeZoneId, deviceSource, deviceId, sn, spo2High, spo2Low, signalQuality, extended, date, uploaded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OriginOsaProcess)) {
            return false;
        }
        OriginOsaProcess originOsaProcess = (OriginOsaProcess) other;
        return Intrinsics.areEqual(this.userId, originOsaProcess.userId) && this.utcTimestamp == originOsaProcess.utcTimestamp && this.spo2 == originOsaProcess.spo2 && this.duration == originOsaProcess.duration && Intrinsics.areEqual(this.timeZoneId, originOsaProcess.timeZoneId) && this.deviceSource == originOsaProcess.deviceSource && Intrinsics.areEqual(this.deviceId, originOsaProcess.deviceId) && Intrinsics.areEqual(this.sn, originOsaProcess.sn) && Intrinsics.areEqual(this.spo2High, originOsaProcess.spo2High) && Intrinsics.areEqual(this.spo2Low, originOsaProcess.spo2Low) && Intrinsics.areEqual(this.signalQuality, originOsaProcess.signalQuality) && Intrinsics.areEqual(this.extended, originOsaProcess.extended) && Intrinsics.areEqual(this.date, originOsaProcess.date) && this.uploaded == originOsaProcess.uploaded;
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
        return ln.a(this.date);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((this.userId.hashCode() * 31) + Long.hashCode(this.utcTimestamp)) * 31) + Integer.hashCode(this.spo2)) * 31) + Integer.hashCode(this.duration)) * 31) + this.timeZoneId.hashCode()) * 31) + Integer.hashCode(this.deviceSource)) * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.spo2High.hashCode()) * 31) + this.spo2Low.hashCode()) * 31) + this.signalQuality.hashCode()) * 31) + this.extended.hashCode()) * 31) + this.date.hashCode()) * 31;
        boolean z = this.uploaded;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final void setAppName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appName = str;
    }

    public final void setDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }

    public final void setUploaded(boolean z) {
        this.uploaded = z;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "OriginOsaProcess(userId=" + this.userId + ", utcTimestamp=" + this.utcTimestamp + ", spo2=" + this.spo2 + ", duration=" + this.duration + ", timeZoneId=" + this.timeZoneId + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", spo2High=" + this.spo2High + ", spo2Low=" + this.spo2Low + ", signalQuality=" + this.signalQuality + ", extended=" + this.extended + ", date=" + this.date + ", uploaded=" + this.uploaded + ')';
    }

    public OriginOsaProcess(@NotNull String userId, long j, int i, int i2, @NotNull String timeZoneId, int i3, @NotNull String deviceId, @NotNull String sn, @NotNull List<Integer> spo2High, @NotNull List<Integer> spo2Low, @NotNull List<Integer> signalQuality, @NotNull List<Integer> extended, @NotNull String date, boolean z) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(timeZoneId, "timeZoneId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(spo2High, "spo2High");
        Intrinsics.checkNotNullParameter(spo2Low, "spo2Low");
        Intrinsics.checkNotNullParameter(signalQuality, "signalQuality");
        Intrinsics.checkNotNullParameter(extended, "extended");
        Intrinsics.checkNotNullParameter(date, "date");
        this.userId = userId;
        this.utcTimestamp = j;
        this.spo2 = i;
        this.duration = i2;
        this.timeZoneId = timeZoneId;
        this.deviceSource = i3;
        this.deviceId = deviceId;
        this.sn = sn;
        this.spo2High = spo2High;
        this.spo2Low = spo2Low;
        this.signalQuality = signalQuality;
        this.extended = extended;
        this.date = date;
        this.uploaded = z;
        this.appName = "";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OriginOsaProcess(String str, long j, int i, int i2, String str2, int i3, String str3, String str4, List list, List list2, List list3, List list4, String str5, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        String id;
        String strB;
        String str6 = (i4 & 1) != 0 ? "" : str;
        long j2 = (i4 & 2) != 0 ? -1L : j;
        int i5 = (i4 & 4) != 0 ? -1 : i;
        int i6 = (i4 & 8) != 0 ? -1 : i2;
        if ((i4 & 16) != 0) {
            id = TimeZone.getDefault().getID();
            Intrinsics.checkNotNullExpressionValue(id, "getDefault().id");
        } else {
            id = str2;
        }
        int i7 = (i4 & 32) == 0 ? i3 : -1;
        String str7 = (i4 & 64) != 0 ? "" : str3;
        String str8 = (i4 & 128) == 0 ? str4 : "";
        List listEmptyList = (i4 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i4 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2;
        List listEmptyList3 = (i4 & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3;
        List listEmptyList4 = (i4 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4;
        if ((i4 & 4096) != 0) {
            TimeZone timeZone = TimeZone.getTimeZone(id);
            Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(timeZoneId)");
            strB = ln.b(j2, timeZone);
        } else {
            strB = str5;
        }
        this(str6, j2, i5, i6, id, i7, str7, str8, listEmptyList, listEmptyList2, listEmptyList3, listEmptyList4, strB, (i4 & 8192) != 0 ? false : z);
    }
}
