package com.huami.bloodoxygen.core.local.database.entity;

import androidx.annotation.Keep;
import androidx.room.Entity;
import androidx.room.Ignore;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.mifit.sportlib.common.Constants;
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
@Entity(primaryKeys = {"userId", "utcTimestamp"}, tableName = "origin_osa_event")
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b>\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\bL\u0010MJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0007HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\u0083\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0010HÆ\u0001J\t\u0010\u001e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u001a\u0004\b8\u0010$\"\u0004\b9\u0010&R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u00103\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\"\u001a\u0004\b<\u0010$\"\u0004\b=\u0010&R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\"\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\"\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R\"\u0010\u001c\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010G\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010\"\u001a\u0004\bH\u0010$\"\u0004\bI\u0010&R\u0013\u0010K\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\bJ\u0010)¨\u0006N"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaEvent;", "", "", "component1", "", "component2", "", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "", "component11", "userId", "utcTimestamp", "spo2", Constants.DATA_KEY_HR, "spo2Decrease", "timeZoneId", "deviceSource", "deviceId", "sn", "date", "uploaded", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "J", "getUtcTimestamp", "()J", "setUtcTimestamp", "(J)V", "Ljava/util/List;", "getSpo2", "()Ljava/util/List;", "setSpo2", "(Ljava/util/List;)V", "getHr", "setHr", LogUtil.I, "getSpo2Decrease", "()I", "setSpo2Decrease", "(I)V", "getTimeZoneId", "setTimeZoneId", "getDeviceSource", "setDeviceSource", "getDeviceId", "setDeviceId", "getSn", "setSn", "getDate", "setDate", "Z", "getUploaded", "()Z", "setUploaded", "(Z)V", "appName", "getAppName", "setAppName", "getTimestamp", "timestamp", "<init>", "(Ljava/lang/String;JLjava/util/List;Ljava/util/List;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OriginOsaEvent {

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

    @Expose
    @NotNull
    private List<Integer> hr;

    @Expose
    @NotNull
    private String sn;

    @Expose
    @NotNull
    private List<Integer> spo2;

    @SerializedName("spo2_decrease")
    @Expose
    private int spo2Decrease;

    @SerializedName("timezone")
    @Expose
    @NotNull
    private String timeZoneId;
    private boolean uploaded;

    @NotNull
    private String userId;

    @SerializedName("timestamp")
    @Expose
    private long utcTimestamp;

    public OriginOsaEvent() {
        this(null, 0L, null, null, 0, null, 0, null, null, null, false, 2047, null);
    }

    public OriginOsaEvent(@NotNull String str, long j, @NotNull List<Integer> list, @NotNull List<Integer> list2, int i, @NotNull String str2, int i2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        this.userId = str;
        this.utcTimestamp = j;
        this.spo2 = list;
        this.hr = list2;
        this.spo2Decrease = i;
        this.timeZoneId = str2;
        this.deviceSource = i2;
        this.deviceId = str3;
        this.sn = str4;
        this.date = str5;
        this.uploaded = z;
        this.appName = "";
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
        return ExtensionKt.yMDHMSToTimestamp(this.date);
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
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.userId.hashCode() * 31) + b.a(this.utcTimestamp)) * 31) + this.spo2.hashCode()) * 31) + this.hr.hashCode()) * 31) + this.spo2Decrease) * 31) + this.timeZoneId.hashCode()) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.date.hashCode()) * 31;
        boolean z = this.uploaded;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
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

    public final void setHr(@NotNull List<Integer> list) {
        this.hr = list;
    }

    public final void setSn(@NotNull String str) {
        this.sn = str;
    }

    public final void setSpo2(@NotNull List<Integer> list) {
        this.spo2 = list;
    }

    public final void setSpo2Decrease(int i) {
        this.spo2Decrease = i;
    }

    public final void setTimeZoneId(@NotNull String str) {
        this.timeZoneId = str;
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

    @NotNull
    public String toString() {
        return "OriginOsaEvent(userId=" + this.userId + ", utcTimestamp=" + this.utcTimestamp + ", spo2=" + this.spo2 + ", hr=" + this.hr + ", spo2Decrease=" + this.spo2Decrease + ", timeZoneId=" + this.timeZoneId + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", date=" + this.date + ", uploaded=" + this.uploaded + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OriginOsaEvent(String str, long j, List list, List list2, int i, String str2, int i2, String str3, String str4, String str5, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str6 = (i3 & 1) != 0 ? "" : str;
        long j2 = (i3 & 2) != 0 ? -1L : j;
        List listEmptyList = (i3 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i3 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2;
        int i4 = (i3 & 16) != 0 ? -1 : i;
        String id = (i3 & 32) != 0 ? TimeZone.getDefault().getID() : str2;
        this(str6, j2, listEmptyList, listEmptyList2, i4, id, (i3 & 64) == 0 ? i2 : -1, (i3 & 128) != 0 ? "" : str3, (i3 & 256) == 0 ? str4 : "", (i3 & 512) != 0 ? ExtensionKt.toYMDHMS(j2, TimeZone.getTimeZone(id)) : str5, (i3 & 1024) != 0 ? false : z);
    }
}
