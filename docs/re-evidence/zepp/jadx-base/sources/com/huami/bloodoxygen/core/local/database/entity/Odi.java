package com.huami.bloodoxygen.core.local.database.entity;

import androidx.annotation.Keep;
import androidx.room.Entity;
import androidx.room.Ignore;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import defpackage.b;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Entity(primaryKeys = {"userId", "utcTimestamp"}, tableName = "odi")
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\bJ\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u0006\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0014¢\u0006\u0004\b\\\u0010]J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\u009f\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u0014HÆ\u0001J\t\u0010&\u001a\u00020\u0002HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\u0013\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010/\u001a\u0004\b9\u00101\"\u0004\b:\u00103R\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u001b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00104\u001a\u0004\b@\u00106\"\u0004\bA\u00108R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010*\u001a\u0004\bB\u0010,\"\u0004\bC\u0010.R\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u00104\u001a\u0004\bD\u00106\"\u0004\bE\u00108R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010*\u001a\u0004\bF\u0010,\"\u0004\bG\u0010.R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010*\u001a\u0004\bH\u0010,\"\u0004\bI\u0010.R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010*\u001a\u0004\bJ\u0010,\"\u0004\bK\u0010.R\"\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u00104\u001a\u0004\bL\u00106\"\u0004\bM\u00108R\"\u0010\"\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u00104\u001a\u0004\bN\u00106\"\u0004\bO\u00108R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010*\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010.R\"\u0010$\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010W\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010*\u001a\u0004\bX\u0010,\"\u0004\bY\u0010.R\u0013\u0010[\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\bZ\u00101¨\u0006^"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "", "", "component1", "", "component2", "", "component3", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "", "component15", "userId", "utcTimestamp", "odTimes", HMFwOnlineAnalyticsKt.COST, "odi", "deviceSource", "timeZoneId", "valid", "deviceId", "sn", "version", "score", "dispCode", "date", "uploaded", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "J", "getUtcTimestamp", "()J", "setUtcTimestamp", "(J)V", LogUtil.I, "getOdTimes", "()I", "setOdTimes", "(I)V", "getCost", "setCost", "F", "getOdi", "()F", "setOdi", "(F)V", "getDeviceSource", "setDeviceSource", "getTimeZoneId", "setTimeZoneId", "getValid", "setValid", "getDeviceId", "setDeviceId", "getSn", "setSn", "getVersion", "setVersion", "getScore", "setScore", "getDispCode", "setDispCode", "getDate", "setDate", "Z", "getUploaded", "()Z", "setUploaded", "(Z)V", "appName", "getAppName", "setAppName", "getTimestamp", "timestamp", "<init>", "(Ljava/lang/String;JIJFILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Z)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Odi {

    @Ignore
    @Expose
    @NotNull
    private String appName;

    @Expose
    private long cost;

    @NotNull
    private String date;

    @Expose
    @NotNull
    private String deviceId;

    @Expose
    private int deviceSource;

    @Expose
    private int dispCode;

    @SerializedName("odiNum")
    @Expose
    private int odTimes;

    @Expose
    private float odi;

    @Expose
    private int score;

    @Expose
    @NotNull
    private String sn;

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

    @Expose
    private int valid;

    @Expose
    @NotNull
    private String version;

    public Odi() {
        this(null, 0L, 0, 0L, 0.0f, 0, null, 0, null, null, null, 0, 0, null, false, 32767, null);
    }

    public Odi(@NotNull String str, long j, int i, long j2, float f, int i2, @NotNull String str2, int i3, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i4, int i5, @NotNull String str6, boolean z) {
        this.userId = str;
        this.utcTimestamp = j;
        this.odTimes = i;
        this.cost = j2;
        this.odi = f;
        this.deviceSource = i2;
        this.timeZoneId = str2;
        this.valid = i3;
        this.deviceId = str3;
        this.sn = str4;
        this.version = str5;
        this.score = i4;
        this.dispCode = i5;
        this.date = str6;
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
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getDispCode() {
        return this.dispCode;
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

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUtcTimestamp() {
        return this.utcTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOdTimes() {
        return this.odTimes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCost() {
        return this.cost;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getOdi() {
        return this.odi;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getValid() {
        return this.valid;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final Odi copy(@NotNull String userId, long utcTimestamp, int odTimes, long cost, float odi, int deviceSource, @NotNull String timeZoneId, int valid, @NotNull String deviceId, @NotNull String sn, @NotNull String version, int score, int dispCode, @NotNull String date, boolean uploaded) {
        return new Odi(userId, utcTimestamp, odTimes, cost, odi, deviceSource, timeZoneId, valid, deviceId, sn, version, score, dispCode, date, uploaded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Odi)) {
            return false;
        }
        Odi odi = (Odi) other;
        return Intrinsics.areEqual(this.userId, odi.userId) && this.utcTimestamp == odi.utcTimestamp && this.odTimes == odi.odTimes && this.cost == odi.cost && Intrinsics.areEqual((Object) Float.valueOf(this.odi), (Object) Float.valueOf(odi.odi)) && this.deviceSource == odi.deviceSource && Intrinsics.areEqual(this.timeZoneId, odi.timeZoneId) && this.valid == odi.valid && Intrinsics.areEqual(this.deviceId, odi.deviceId) && Intrinsics.areEqual(this.sn, odi.sn) && Intrinsics.areEqual(this.version, odi.version) && this.score == odi.score && this.dispCode == odi.dispCode && Intrinsics.areEqual(this.date, odi.date) && this.uploaded == odi.uploaded;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    public final long getCost() {
        return this.cost;
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

    public final int getDispCode() {
        return this.dispCode;
    }

    public final int getOdTimes() {
        return this.odTimes;
    }

    public final float getOdi() {
        return this.odi;
    }

    public final int getScore() {
        return this.score;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
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

    public final int getValid() {
        return this.valid;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.userId.hashCode() * 31) + b.a(this.utcTimestamp)) * 31) + this.odTimes) * 31) + b.a(this.cost)) * 31) + Float.floatToIntBits(this.odi)) * 31) + this.deviceSource) * 31) + this.timeZoneId.hashCode()) * 31) + this.valid) * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.version.hashCode()) * 31) + this.score) * 31) + this.dispCode) * 31) + this.date.hashCode()) * 31;
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

    public final void setCost(long j) {
        this.cost = j;
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

    public final void setDispCode(int i) {
        this.dispCode = i;
    }

    public final void setOdTimes(int i) {
        this.odTimes = i;
    }

    public final void setOdi(float f) {
        this.odi = f;
    }

    public final void setScore(int i) {
        this.score = i;
    }

    public final void setSn(@NotNull String str) {
        this.sn = str;
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

    public final void setValid(int i) {
        this.valid = i;
    }

    public final void setVersion(@NotNull String str) {
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "Odi(userId=" + this.userId + ", utcTimestamp=" + this.utcTimestamp + ", odTimes=" + this.odTimes + ", cost=" + this.cost + ", odi=" + this.odi + ", deviceSource=" + this.deviceSource + ", timeZoneId=" + this.timeZoneId + ", valid=" + this.valid + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", version=" + this.version + ", score=" + this.score + ", dispCode=" + this.dispCode + ", date=" + this.date + ", uploaded=" + this.uploaded + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Odi(String str, long j, int i, long j2, float f, int i2, String str2, int i3, String str3, String str4, String str5, int i4, int i5, String str6, boolean z, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        String str7 = (i6 & 1) != 0 ? "" : str;
        long j3 = (i6 & 2) != 0 ? -1L : j;
        int i7 = (i6 & 4) != 0 ? -1 : i;
        long j4 = (i6 & 8) == 0 ? j2 : -1L;
        float f2 = (i6 & 16) != 0 ? -1.0f : f;
        int i8 = (i6 & 32) != 0 ? -1 : i2;
        String id = (i6 & 64) != 0 ? TimeZone.getDefault().getID() : str2;
        this(str7, j3, i7, j4, f2, i8, id, (i6 & 128) != 0 ? -1 : i3, (i6 & 256) != 0 ? "" : str3, (i6 & 512) != 0 ? "" : str4, (i6 & 1024) == 0 ? str5 : "", (i6 & 2048) != 0 ? -1 : i4, (i6 & 4096) != 0 ? -1 : i5, (i6 & 8192) != 0 ? ExtensionKt.toYMDHMS(j3, TimeZone.getTimeZone(id)) : str6, (i6 & 16384) != 0 ? false : z);
    }
}
