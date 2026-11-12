package com.huami.bloodoxygen.core.remote.api.event;

import androidx.annotation.Keep;
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
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\bX\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\r\u0012\b\b\u0002\u0010#\u001a\u00020\u0006\u0012\b\b\u0002\u0010$\u001a\u00020\u0010\u0012\b\b\u0002\u0010%\u001a\u00020\r\u0012\b\b\u0002\u0010&\u001a\u00020\r\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\r\u0012\b\b\u0002\u0010,\u001a\u00020\r¢\u0006\u0004\bf\u0010gJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\rHÆ\u0003J\t\u0010\u0013\u001a\u00020\rHÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0018\u001a\u00020\rHÆ\u0003J\t\u0010\u0019\u001a\u00020\rHÆ\u0003JÉ\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020\rHÆ\u0001J\t\u0010.\u001a\u00020\u0002HÖ\u0001J\t\u0010/\u001a\u00020\rHÖ\u0001J\u0013\u00101\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00102\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u00102\u001a\u0004\b@\u00104\"\u0004\bA\u00106R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u00102\u001a\u0004\bB\u00104\"\u0004\bC\u00106R\"\u0010 \u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010D\u001a\u0004\b \u0010E\"\u0004\bF\u0010GR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\bH\u00104\"\u0004\bI\u00106R\"\u0010\"\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010;\u001a\u0004\bO\u0010=\"\u0004\bP\u0010?R\"\u0010$\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010%\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010J\u001a\u0004\bV\u0010L\"\u0004\bW\u0010NR\"\u0010&\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010J\u001a\u0004\bX\u0010L\"\u0004\bY\u0010NR\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00102\u001a\u0004\bZ\u00104\"\u0004\b[\u00106R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00102\u001a\u0004\b\\\u00104\"\u0004\b]\u00106R\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00102\u001a\u0004\b^\u00104\"\u0004\b_\u00106R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u00102\u001a\u0004\b`\u00104\"\u0004\ba\u00106R\"\u0010+\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010J\u001a\u0004\bb\u0010L\"\u0004\bc\u0010NR\"\u0010,\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010J\u001a\u0004\bd\u0010L\"\u0004\be\u0010N¨\u0006h"}, d2 = {"Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "", "component7", "component8", "", "component9", "component10", "", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "eventType", "subType", "userId", "utcTimestamp", "extra", "timeZoneId", "isNext", "date", "odTimes", HMFwOnlineAnalyticsKt.COST, "odi", "deviceSource", "valid", "deviceId", "sn", "appName", "version", "score", "dispCode", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "setEventType", "(Ljava/lang/String;)V", "getSubType", "setSubType", "getUserId", "setUserId", "J", "getUtcTimestamp", "()J", "setUtcTimestamp", "(J)V", "getExtra", "setExtra", "getTimeZoneId", "setTimeZoneId", "Z", "()Z", "setNext", "(Z)V", "getDate", "setDate", LogUtil.I, "getOdTimes", "()I", "setOdTimes", "(I)V", "getCost", "setCost", "F", "getOdi", "()F", "setOdi", "(F)V", "getDeviceSource", "setDeviceSource", "getValid", "setValid", "getDeviceId", "setDeviceId", "getSn", "setSn", "getAppName", "setAppName", "getVersion", "setVersion", "getScore", "setScore", "getDispCode", "setDispCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IJFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EventItem {

    @NotNull
    private String appName;
    private long cost;

    @NotNull
    private String date;

    @NotNull
    private String deviceId;
    private int deviceSource;
    private int dispCode;

    @Expose
    @NotNull
    private String eventType;

    @Expose
    @Nullable
    private String extra;
    private boolean isNext;

    @SerializedName("odiNum")
    private int odTimes;
    private float odi;
    private int score;

    @NotNull
    private String sn;

    @Expose
    @NotNull
    private String subType;

    @SerializedName("timezone")
    @Expose
    @NotNull
    private String timeZoneId;

    @Expose
    @NotNull
    private String userId;

    @SerializedName("timestamp")
    @Expose
    private long utcTimestamp;
    private int valid;

    @NotNull
    private String version;

    public EventItem() {
        this(null, null, null, 0L, null, null, false, null, 0, 0L, 0.0f, 0, 0, null, null, null, null, 0, 0, 524287, null);
    }

    public EventItem(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @Nullable String str4, @NotNull String str5, boolean z, @NotNull String str6, int i, long j2, float f, int i2, int i3, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i4, int i5) {
        this.eventType = str;
        this.subType = str2;
        this.userId = str3;
        this.utcTimestamp = j;
        this.extra = str4;
        this.timeZoneId = str5;
        this.isNext = z;
        this.date = str6;
        this.odTimes = i;
        this.cost = j2;
        this.odi = f;
        this.deviceSource = i2;
        this.valid = i3;
        this.deviceId = str7;
        this.sn = str8;
        this.appName = str9;
        this.version = str10;
        this.score = i4;
        this.dispCode = i5;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getCost() {
        return this.cost;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getOdi() {
        return this.odi;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getValid() {
        return this.valid;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getDispCode() {
        return this.dispCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getUtcTimestamp() {
        return this.utcTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsNext() {
        return this.isNext;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getOdTimes() {
        return this.odTimes;
    }

    @NotNull
    public final EventItem copy(@NotNull String eventType, @NotNull String subType, @NotNull String userId, long utcTimestamp, @Nullable String extra, @NotNull String timeZoneId, boolean isNext, @NotNull String date, int odTimes, long cost, float odi, int deviceSource, int valid, @NotNull String deviceId, @NotNull String sn, @NotNull String appName, @NotNull String version, int score, int dispCode) {
        return new EventItem(eventType, subType, userId, utcTimestamp, extra, timeZoneId, isNext, date, odTimes, cost, odi, deviceSource, valid, deviceId, sn, appName, version, score, dispCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventItem)) {
            return false;
        }
        EventItem eventItem = (EventItem) other;
        return Intrinsics.areEqual(this.eventType, eventItem.eventType) && Intrinsics.areEqual(this.subType, eventItem.subType) && Intrinsics.areEqual(this.userId, eventItem.userId) && this.utcTimestamp == eventItem.utcTimestamp && Intrinsics.areEqual(this.extra, eventItem.extra) && Intrinsics.areEqual(this.timeZoneId, eventItem.timeZoneId) && this.isNext == eventItem.isNext && Intrinsics.areEqual(this.date, eventItem.date) && this.odTimes == eventItem.odTimes && this.cost == eventItem.cost && Intrinsics.areEqual((Object) Float.valueOf(this.odi), (Object) Float.valueOf(eventItem.odi)) && this.deviceSource == eventItem.deviceSource && this.valid == eventItem.valid && Intrinsics.areEqual(this.deviceId, eventItem.deviceId) && Intrinsics.areEqual(this.sn, eventItem.sn) && Intrinsics.areEqual(this.appName, eventItem.appName) && Intrinsics.areEqual(this.version, eventItem.version) && this.score == eventItem.score && this.dispCode == eventItem.dispCode;
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

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
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
    public final String getSubType() {
        return this.subType;
    }

    @NotNull
    public final String getTimeZoneId() {
        return this.timeZoneId;
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
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v34 */
    public int hashCode() {
        int iHashCode = ((((((this.eventType.hashCode() * 31) + this.subType.hashCode()) * 31) + this.userId.hashCode()) * 31) + b.a(this.utcTimestamp)) * 31;
        String str = this.extra;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.timeZoneId.hashCode()) * 31;
        boolean z = this.isNext;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((((((((((((((iHashCode2 + r1) * 31) + this.date.hashCode()) * 31) + this.odTimes) * 31) + b.a(this.cost)) * 31) + Float.floatToIntBits(this.odi)) * 31) + this.deviceSource) * 31) + this.valid) * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.version.hashCode()) * 31) + this.score) * 31) + this.dispCode;
    }

    public final boolean isNext() {
        return this.isNext;
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

    public final void setEventType(@NotNull String str) {
        this.eventType = str;
    }

    public final void setExtra(@Nullable String str) {
        this.extra = str;
    }

    public final void setNext(boolean z) {
        this.isNext = z;
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

    public final void setSubType(@NotNull String str) {
        this.subType = str;
    }

    public final void setTimeZoneId(@NotNull String str) {
        this.timeZoneId = str;
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
        return "EventItem(eventType=" + this.eventType + ", subType=" + this.subType + ", userId=" + this.userId + ", utcTimestamp=" + this.utcTimestamp + ", extra=" + this.extra + ", timeZoneId=" + this.timeZoneId + ", isNext=" + this.isNext + ", date=" + this.date + ", odTimes=" + this.odTimes + ", cost=" + this.cost + ", odi=" + this.odi + ", deviceSource=" + this.deviceSource + ", valid=" + this.valid + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", appName=" + this.appName + ", version=" + this.version + ", score=" + this.score + ", dispCode=" + this.dispCode + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EventItem(String str, String str2, String str3, long j, String str4, String str5, boolean z, String str6, int i, long j2, float f, int i2, int i3, String str7, String str8, String str9, String str10, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        String str11 = (i6 & 1) != 0 ? "" : str;
        String str12 = (i6 & 2) != 0 ? "" : str2;
        String str13 = (i6 & 4) != 0 ? "" : str3;
        long j3 = (i6 & 8) != 0 ? 0L : j;
        String str14 = (i6 & 16) != 0 ? null : str4;
        String id = (i6 & 32) != 0 ? TimeZone.getDefault().getID() : str5;
        this(str11, str12, str13, j3, str14, id, (i6 & 64) != 0 ? false : z, (i6 & 128) != 0 ? ExtensionKt.toYMDHMS(j3, TimeZone.getTimeZone(id)) : str6, (i6 & 256) != 0 ? 0 : i, (i6 & 512) == 0 ? j2 : 0L, (i6 & 1024) != 0 ? 0.0f : f, (i6 & 2048) != 0 ? 0 : i2, (i6 & 4096) != 0 ? -1 : i3, (i6 & 8192) != 0 ? "" : str7, (i6 & 16384) != 0 ? "" : str8, (i6 & 32768) != 0 ? "" : str9, (i6 & 65536) != 0 ? "" : str10, (i6 & 131072) != 0 ? -1 : i4, (i6 & 262144) == 0 ? i5 : -1);
    }
}
