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
@Entity(primaryKeys = {"userId", "utcTimestamp"}, tableName = "click_measured_spo2")
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\bH\u0010IJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003Js\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u000fHÆ\u0001J\t\u0010\u001c\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010 \u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010 \u001a\u0004\b:\u0010\"\"\u0004\b;\u0010$R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010 \u001a\u0004\b<\u0010\"\"\u0004\b=\u0010$R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010C\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010 \u001a\u0004\bD\u0010\"\"\u0004\bE\u0010$R\u0013\u0010G\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010'¨\u0006J"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "", "component7", "component8", "component9", "", "component10", "userId", "utcTimestamp", "spo2", "deviceSource", "deviceId", "sn", "spo2History", "timeZoneId", "date", "uploaded", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "J", "getUtcTimestamp", "()J", "setUtcTimestamp", "(J)V", LogUtil.I, "getSpo2", "()I", "setSpo2", "(I)V", "getDeviceSource", "setDeviceSource", "getDeviceId", "setDeviceId", "getSn", "setSn", "Ljava/util/List;", "getSpo2History", "()Ljava/util/List;", "setSpo2History", "(Ljava/util/List;)V", "getTimeZoneId", "setTimeZoneId", "getDate", "setDate", "Z", "getUploaded", "()Z", "setUploaded", "(Z)V", "appName", "getAppName", "setAppName", "getTimestamp", "timestamp", "<init>", "(Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ClickMeasuredSpo2 {

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
    private String sn;

    @Expose
    private int spo2;

    @Expose
    @NotNull
    private List<Integer> spo2History;

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

    public ClickMeasuredSpo2() {
        this(null, 0L, 0, 0, null, null, null, null, null, false, 1023, null);
    }

    public ClickMeasuredSpo2(@NotNull String str, long j, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull List<Integer> list, @NotNull String str4, @NotNull String str5, boolean z) {
        this.userId = str;
        this.utcTimestamp = j;
        this.spo2 = i;
        this.deviceSource = i2;
        this.deviceId = str2;
        this.sn = str3;
        this.spo2History = list;
        this.timeZoneId = str4;
        this.date = str5;
        this.uploaded = z;
        this.appName = "";
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
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
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final List<Integer> component7() {
        return this.spo2History;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final ClickMeasuredSpo2 copy(@NotNull String userId, long utcTimestamp, int spo2, int deviceSource, @NotNull String deviceId, @NotNull String sn, @NotNull List<Integer> spo2History, @NotNull String timeZoneId, @NotNull String date, boolean uploaded) {
        return new ClickMeasuredSpo2(userId, utcTimestamp, spo2, deviceSource, deviceId, sn, spo2History, timeZoneId, date, uploaded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickMeasuredSpo2)) {
            return false;
        }
        ClickMeasuredSpo2 clickMeasuredSpo2 = (ClickMeasuredSpo2) other;
        return Intrinsics.areEqual(this.userId, clickMeasuredSpo2.userId) && this.utcTimestamp == clickMeasuredSpo2.utcTimestamp && this.spo2 == clickMeasuredSpo2.spo2 && this.deviceSource == clickMeasuredSpo2.deviceSource && Intrinsics.areEqual(this.deviceId, clickMeasuredSpo2.deviceId) && Intrinsics.areEqual(this.sn, clickMeasuredSpo2.sn) && Intrinsics.areEqual(this.spo2History, clickMeasuredSpo2.spo2History) && Intrinsics.areEqual(this.timeZoneId, clickMeasuredSpo2.timeZoneId) && Intrinsics.areEqual(this.date, clickMeasuredSpo2.date) && this.uploaded == clickMeasuredSpo2.uploaded;
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
    public final String getSn() {
        return this.sn;
    }

    public final int getSpo2() {
        return this.spo2;
    }

    @NotNull
    public final List<Integer> getSpo2History() {
        return this.spo2History;
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
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((this.userId.hashCode() * 31) + b.a(this.utcTimestamp)) * 31) + this.spo2) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.spo2History.hashCode()) * 31) + this.timeZoneId.hashCode()) * 31) + this.date.hashCode()) * 31;
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

    public final void setSn(@NotNull String str) {
        this.sn = str;
    }

    public final void setSpo2(int i) {
        this.spo2 = i;
    }

    public final void setSpo2History(@NotNull List<Integer> list) {
        this.spo2History = list;
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
        return "ClickMeasuredSpo2(userId=" + this.userId + ", utcTimestamp=" + this.utcTimestamp + ", spo2=" + this.spo2 + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", spo2History=" + this.spo2History + ", timeZoneId=" + this.timeZoneId + ", date=" + this.date + ", uploaded=" + this.uploaded + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ClickMeasuredSpo2(String str, long j, int i, int i2, String str2, String str3, List list, String str4, String str5, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str6 = (i3 & 1) != 0 ? "" : str;
        long j2 = (i3 & 2) != 0 ? -1L : j;
        int i4 = (i3 & 4) != 0 ? -1 : i;
        int i5 = (i3 & 8) == 0 ? i2 : -1;
        String str7 = (i3 & 16) != 0 ? "" : str2;
        String str8 = (i3 & 32) == 0 ? str3 : "";
        List listEmptyList = (i3 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        String id = (i3 & 128) != 0 ? TimeZone.getDefault().getID() : str4;
        this(str6, j2, i4, i5, str7, str8, listEmptyList, id, (i3 & 256) != 0 ? ExtensionKt.toYMDHMS(j2, TimeZone.getTimeZone(id)) : str5, (i3 & 512) != 0 ? false : z);
    }
}
