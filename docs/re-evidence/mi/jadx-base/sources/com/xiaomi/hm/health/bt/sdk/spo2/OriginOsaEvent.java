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
@Entity(primaryKeys = {"userId", "utcTimestamp"}, tableName = "origin_osa_event")
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u0083\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00109\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\bHÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010#\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%¨\u0006="}, d2 = {"Lcom/xiaomi/hm/health/bt/sdk/spo2/OriginOsaEvent;", "", "userId", "", "utcTimestamp", "", "spo2", "", "", "hr", "spo2Decrease", "timeZoneId", "deviceSource", "deviceId", "sn", DialWidgetType.DATE, "uploaded", "", "(Ljava/lang/String;JLjava/util/List;Ljava/util/List;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "appName", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "getDate", "setDate", "getDeviceId", "getDeviceSource", "()I", "getHr", "()Ljava/util/List;", "getSn", "getSpo2", "getSpo2Decrease", "getTimeZoneId", "timestamp", "getTimestamp", "()J", "getUploaded", "()Z", "setUploaded", "(Z)V", "getUserId", "setUserId", "getUtcTimestamp", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "btData_wearRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OriginOsaEvent {

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

    @Expose
    @NotNull
    private final List<Integer> hr;

    @Expose
    @NotNull
    private final String sn;

    @Expose
    @NotNull
    private final List<Integer> spo2;

    @SerializedName("spo2_decrease")
    @Expose
    private final int spo2Decrease;

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

    public OriginOsaEvent() {
        this(null, 0L, null, null, 0, null, 0, null, null, null, false, 2047, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getUploaded() {
        return this.uploaded;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUtcTimestamp() {
        return this.utcTimestamp;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.spo2;
    }

    @NotNull
    public final List<Integer> component4() {
        return this.hr;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSpo2Decrease() {
        return this.spo2Decrease;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTimeZoneId() {
        return this.timeZoneId;
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
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final OriginOsaEvent copy(@NotNull String userId, long utcTimestamp, @NotNull List<Integer> spo2, @NotNull List<Integer> hr, int spo2Decrease, @NotNull String timeZoneId, int deviceSource, @NotNull String deviceId, @NotNull String sn, @NotNull String date, boolean uploaded) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(spo2, "spo2");
        Intrinsics.checkNotNullParameter(hr, "hr");
        Intrinsics.checkNotNullParameter(timeZoneId, "timeZoneId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(date, "date");
        return new OriginOsaEvent(userId, utcTimestamp, spo2, hr, spo2Decrease, timeZoneId, deviceSource, deviceId, sn, date, uploaded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OriginOsaEvent)) {
            return false;
        }
        OriginOsaEvent originOsaEvent = (OriginOsaEvent) other;
        return Intrinsics.areEqual(this.userId, originOsaEvent.userId) && this.utcTimestamp == originOsaEvent.utcTimestamp && Intrinsics.areEqual(this.spo2, originOsaEvent.spo2) && Intrinsics.areEqual(this.hr, originOsaEvent.hr) && this.spo2Decrease == originOsaEvent.spo2Decrease && Intrinsics.areEqual(this.timeZoneId, originOsaEvent.timeZoneId) && this.deviceSource == originOsaEvent.deviceSource && Intrinsics.areEqual(this.deviceId, originOsaEvent.deviceId) && Intrinsics.areEqual(this.sn, originOsaEvent.sn) && Intrinsics.areEqual(this.date, originOsaEvent.date) && this.uploaded == originOsaEvent.uploaded;
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
    public final List<Integer> getHr() {
        return this.hr;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final List<Integer> getSpo2() {
        return this.spo2;
    }

    public final int getSpo2Decrease() {
        return this.spo2Decrease;
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
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.userId.hashCode() * 31) + Long.hashCode(this.utcTimestamp)) * 31) + this.spo2.hashCode()) * 31) + this.hr.hashCode()) * 31) + Integer.hashCode(this.spo2Decrease)) * 31) + this.timeZoneId.hashCode()) * 31) + Integer.hashCode(this.deviceSource)) * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.date.hashCode()) * 31;
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
        return "OriginOsaEvent(userId=" + this.userId + ", utcTimestamp=" + this.utcTimestamp + ", spo2=" + this.spo2 + ", hr=" + this.hr + ", spo2Decrease=" + this.spo2Decrease + ", timeZoneId=" + this.timeZoneId + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", date=" + this.date + ", uploaded=" + this.uploaded + ')';
    }

    public OriginOsaEvent(@NotNull String userId, long j, @NotNull List<Integer> spo2, @NotNull List<Integer> hr, int i, @NotNull String timeZoneId, int i2, @NotNull String deviceId, @NotNull String sn, @NotNull String date, boolean z) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(spo2, "spo2");
        Intrinsics.checkNotNullParameter(hr, "hr");
        Intrinsics.checkNotNullParameter(timeZoneId, "timeZoneId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(date, "date");
        this.userId = userId;
        this.utcTimestamp = j;
        this.spo2 = spo2;
        this.hr = hr;
        this.spo2Decrease = i;
        this.timeZoneId = timeZoneId;
        this.deviceSource = i2;
        this.deviceId = deviceId;
        this.sn = sn;
        this.date = date;
        this.uploaded = z;
        this.appName = "";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OriginOsaEvent(String str, long j, List list, List list2, int i, String str2, int i2, String str3, String str4, String str5, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String id;
        String strB;
        String str6 = (i3 & 1) != 0 ? "" : str;
        long j2 = (i3 & 2) != 0 ? -1L : j;
        List listEmptyList = (i3 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i3 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2;
        int i4 = (i3 & 16) != 0 ? -1 : i;
        if ((i3 & 32) != 0) {
            id = TimeZone.getDefault().getID();
            Intrinsics.checkNotNullExpressionValue(id, "getDefault().id");
        } else {
            id = str2;
        }
        int i5 = (i3 & 64) == 0 ? i2 : -1;
        String str7 = (i3 & 128) != 0 ? "" : str3;
        String str8 = (i3 & 256) == 0 ? str4 : "";
        if ((i3 & 512) != 0) {
            TimeZone timeZone = TimeZone.getTimeZone(id);
            Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(timeZoneId)");
            strB = ln.b(j2, timeZone);
        } else {
            strB = str5;
        }
        this(str6, j2, listEmptyList, listEmptyList2, i4, id, i5, str7, str8, strB, (i3 & 1024) != 0 ? false : z);
    }
}
