package com.huami.bloodpressure_core.dc.local;

import androidx.annotation.Keep;
import androidx.room.Entity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Entity(primaryKeys = {"userId", BloodPressureConst.ParamKey.MEASURETIME})
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b<\u0010=J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\rHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\rHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\rHÆ\u0003J\u009a\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\t\u0010%\u001a\u00020\rHÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u0016\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0017\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0018\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b-\u0010,R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b/\u0010\u000bR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b0\u0010\u000bR\u0019\u0010\u001b\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u001c\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u00101\u001a\u0004\b4\u00103R\u0019\u0010\u001d\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b5\u00103R\u0019\u0010\u001e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u00106\u001a\u0004\b\u001e\u00107R\u0019\u0010\u001f\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u00101\u001a\u0004\b8\u00103R\u0019\u0010 \u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b9\u0010,R\u001b\u0010!\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b:\u00103R\u001b\u0010\"\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b;\u00103¨\u0006>"}, d2 = {"Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "", "other", "", "equals", "", "component1", "", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", BloodPressureConst.ParamKey.MEASURETIME, "sbp", "dbp", "bpm", "timeZone", "userId", "eventType", "subType", "isUpload", "dateStr", ParamKey.dataSource, "extra1", "extra2", "copy", "(JIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "toString", "hashCode", "J", "getMeasureTime", "()J", LogUtil.I, "getSbp", "()I", "getDbp", "Ljava/lang/Integer;", "getBpm", "getTimeZone", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getEventType", "getSubType", "Z", "()Z", "getDateStr", "getDataSource", "getExtra1", "getExtra2", "<init>", "(JIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureDbVo {

    @Nullable
    private final Integer bpm;
    private final int dataSource;

    @NotNull
    private final String dateStr;
    private final int dbp;

    @NotNull
    private final String eventType;

    @Nullable
    private final String extra1;

    @Nullable
    private final String extra2;
    private final boolean isUpload;
    private final long measureTime;
    private final int sbp;

    @NotNull
    private final String subType;

    @Nullable
    private final Integer timeZone;

    @NotNull
    private final String userId;

    public BloodPressureDbVo(long j, int i, int i2, @Nullable Integer num, @Nullable Integer num2, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, int i3, @Nullable String str5, @Nullable String str6) {
        this.measureTime = j;
        this.sbp = i;
        this.dbp = i2;
        this.bpm = num;
        this.timeZone = num2;
        this.userId = str;
        this.eventType = str2;
        this.subType = str3;
        this.isUpload = z;
        this.dateStr = str4;
        this.dataSource = i3;
        this.extra1 = str5;
        this.extra2 = str6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMeasureTime() {
        return this.measureTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDateStr() {
        return this.dateStr;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDataSource() {
        return this.dataSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getExtra1() {
        return this.extra1;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getExtra2() {
        return this.extra2;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSbp() {
        return this.sbp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDbp() {
        return this.dbp;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBpm() {
        return this.bpm;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsUpload() {
        return this.isUpload;
    }

    @NotNull
    public final BloodPressureDbVo copy(long measureTime, int sbp, int dbp, @Nullable Integer bpm, @Nullable Integer timeZone, @NotNull String userId, @NotNull String eventType, @NotNull String subType, boolean isUpload, @NotNull String dateStr, int dataSource, @Nullable String extra1, @Nullable String extra2) {
        return new BloodPressureDbVo(measureTime, sbp, dbp, bpm, timeZone, userId, eventType, subType, isUpload, dateStr, dataSource, extra1, extra2);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof BloodPressureDbVo)) {
            return false;
        }
        BloodPressureDbVo bloodPressureDbVo = (BloodPressureDbVo) other;
        return this.measureTime == bloodPressureDbVo.measureTime && this.sbp == bloodPressureDbVo.sbp && this.dbp == bloodPressureDbVo.dbp && Intrinsics.areEqual(this.bpm, bloodPressureDbVo.bpm) && Intrinsics.areEqual(this.timeZone, bloodPressureDbVo.timeZone) && Intrinsics.areEqual(this.userId, bloodPressureDbVo.userId) && this.dataSource == bloodPressureDbVo.dataSource;
    }

    @Nullable
    public final Integer getBpm() {
        return this.bpm;
    }

    public final int getDataSource() {
        return this.dataSource;
    }

    @NotNull
    public final String getDateStr() {
        return this.dateStr;
    }

    public final int getDbp() {
        return this.dbp;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getExtra1() {
        return this.extra1;
    }

    @Nullable
    public final String getExtra2() {
        return this.extra2;
    }

    public final long getMeasureTime() {
        return this.measureTime;
    }

    public final int getSbp() {
        return this.sbp;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    public final Integer getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    public int hashCode() {
        int iA = ((((b.a(this.measureTime) * 31) + this.sbp) * 31) + this.dbp) * 31;
        Integer num = this.bpm;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeZone;
        int iHashCode2 = (((((((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.userId.hashCode()) * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode()) * 31;
        boolean z = this.isUpload;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode3 = (((((iHashCode2 + r1) * 31) + this.dateStr.hashCode()) * 31) + this.dataSource) * 31;
        String str = this.extra1;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.extra2;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isUpload() {
        return this.isUpload;
    }

    @NotNull
    public String toString() {
        return "BloodPressureDbVo(measureTime=" + this.measureTime + ", sbp=" + this.sbp + ", dbp=" + this.dbp + ", bpm=" + this.bpm + ", timeZone=" + this.timeZone + ", userId=" + this.userId + ", eventType=" + this.eventType + ", subType=" + this.subType + ", isUpload=" + this.isUpload + ", dateStr=" + this.dateStr + ", dataSource=" + this.dataSource + ", extra1=" + this.extra1 + ", extra2=" + this.extra2 + ")";
    }

    public /* synthetic */ BloodPressureDbVo(long j, int i, int i2, Integer num, Integer num2, String str, String str2, String str3, boolean z, String str4, int i3, String str5, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? null : num2, str, str2, str3, z, str4, i3, (i4 & 2048) != 0 ? null : str5, (i4 & 4096) != 0 ? null : str6);
    }
}
