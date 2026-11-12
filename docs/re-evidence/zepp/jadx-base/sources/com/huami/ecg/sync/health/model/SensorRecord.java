package com.huami.ecg.sync.health.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b3\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\bJ\u0010KB\u0019\b\u0016\u0012\u0006\u0010L\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010MJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003Js\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00022\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010!\u001a\u0004\bB\u0010#\"\u0004\bC\u0010%R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010<\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R\"\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010<\u001a\u0004\bH\u0010>\"\u0004\bI\u0010@¨\u0006N"}, d2 = {"Lcom/huami/ecg/sync/health/model/SensorRecord;", "", "", "component1", "", "component2", "component3", "component4", "component5", "", "component6", "", "component7", "component8", "component9", "component10", "mType", "cmdResult", "lostPackage", "online", "afibNums", "afibResult", "sensorTimeInMills", "sensorDataLength", "appTimeInMills", "appDataLength", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getMType", "()I", "setMType", "(I)V", "b", "Z", "getCmdResult", "()Z", "setCmdResult", "(Z)V", "c", "getLostPackage", "setLostPackage", GoogleApiAvailabilityLight.a, "getOnline", "setOnline", "e", "getAfibNums", "setAfibNums", "f", "Ljava/util/List;", "getAfibResult", "()Ljava/util/List;", "setAfibResult", "(Ljava/util/List;)V", "g", "J", "getSensorTimeInMills", "()J", "setSensorTimeInMills", "(J)V", "h", "getSensorDataLength", "setSensorDataLength", "i", "getAppTimeInMills", "setAppTimeInMills", z.j, "getAppDataLength", "setAppDataLength", "<init>", "(IZIZILjava/util/List;JIJJ)V", "type", "(IZ)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SensorRecord {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int mType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean cmdResult;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int lostPackage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean online;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int afibNums;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private List<Integer> afibResult;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private long sensorTimeInMills;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private int sensorDataLength;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private long appTimeInMills;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private long appDataLength;

    public SensorRecord() {
        this(0, false, 0, false, 0, null, 0L, 0, 0L, 0L, 1023, null);
    }

    public SensorRecord(int i, boolean z, int i2, boolean z2, int i3, @NotNull List<Integer> list, long j, int i4, long j2, long j3) {
        this.mType = i;
        this.cmdResult = z;
        this.lostPackage = i2;
        this.online = z2;
        this.afibNums = i3;
        this.afibResult = list;
        this.sensorTimeInMills = j;
        this.sensorDataLength = i4;
        this.appTimeInMills = j2;
        this.appDataLength = j3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMType() {
        return this.mType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getAppDataLength() {
        return this.appDataLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCmdResult() {
        return this.cmdResult;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLostPackage() {
        return this.lostPackage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getOnline() {
        return this.online;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAfibNums() {
        return this.afibNums;
    }

    @NotNull
    public final List<Integer> component6() {
        return this.afibResult;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getSensorTimeInMills() {
        return this.sensorTimeInMills;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSensorDataLength() {
        return this.sensorDataLength;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getAppTimeInMills() {
        return this.appTimeInMills;
    }

    @NotNull
    public final SensorRecord copy(int mType, boolean cmdResult, int lostPackage, boolean online, int afibNums, @NotNull List<Integer> afibResult, long sensorTimeInMills, int sensorDataLength, long appTimeInMills, long appDataLength) {
        return new SensorRecord(mType, cmdResult, lostPackage, online, afibNums, afibResult, sensorTimeInMills, sensorDataLength, appTimeInMills, appDataLength);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorRecord)) {
            return false;
        }
        SensorRecord sensorRecord = (SensorRecord) other;
        return this.mType == sensorRecord.mType && this.cmdResult == sensorRecord.cmdResult && this.lostPackage == sensorRecord.lostPackage && this.online == sensorRecord.online && this.afibNums == sensorRecord.afibNums && Intrinsics.areEqual(this.afibResult, sensorRecord.afibResult) && this.sensorTimeInMills == sensorRecord.sensorTimeInMills && this.sensorDataLength == sensorRecord.sensorDataLength && this.appTimeInMills == sensorRecord.appTimeInMills && this.appDataLength == sensorRecord.appDataLength;
    }

    public final int getAfibNums() {
        return this.afibNums;
    }

    @NotNull
    public final List<Integer> getAfibResult() {
        return this.afibResult;
    }

    public final long getAppDataLength() {
        return this.appDataLength;
    }

    public final long getAppTimeInMills() {
        return this.appTimeInMills;
    }

    public final boolean getCmdResult() {
        return this.cmdResult;
    }

    public final int getLostPackage() {
        return this.lostPackage;
    }

    public final int getMType() {
        return this.mType;
    }

    public final boolean getOnline() {
        return this.online;
    }

    public final int getSensorDataLength() {
        return this.sensorDataLength;
    }

    public final long getSensorTimeInMills() {
        return this.sensorTimeInMills;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public int hashCode() {
        int i = this.mType * 31;
        boolean z = this.cmdResult;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (((i + r1) * 31) + this.lostPackage) * 31;
        boolean z2 = this.online;
        int i3 = (((i2 + (z2 ? 1 : z2)) * 31) + this.afibNums) * 31;
        List<Integer> list = this.afibResult;
        int iHashCode = (i3 + (list != null ? list.hashCode() : 0)) * 31;
        long j = this.sensorTimeInMills;
        int i4 = (((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.sensorDataLength) * 31;
        long j2 = this.appTimeInMills;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.appDataLength;
        return i5 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final void setAfibNums(int i) {
        this.afibNums = i;
    }

    public final void setAfibResult(@NotNull List<Integer> list) {
        this.afibResult = list;
    }

    public final void setAppDataLength(long j) {
        this.appDataLength = j;
    }

    public final void setAppTimeInMills(long j) {
        this.appTimeInMills = j;
    }

    public final void setCmdResult(boolean z) {
        this.cmdResult = z;
    }

    public final void setLostPackage(int i) {
        this.lostPackage = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setOnline(boolean z) {
        this.online = z;
    }

    public final void setSensorDataLength(int i) {
        this.sensorDataLength = i;
    }

    public final void setSensorTimeInMills(long j) {
        this.sensorTimeInMills = j;
    }

    @NotNull
    public String toString() {
        return "SensorRecord(mType=" + this.mType + ", cmdResult=" + this.cmdResult + ", lostPackage=" + this.lostPackage + ", online=" + this.online + ", afibNums=" + this.afibNums + ", afibResult=" + this.afibResult + ", sensorTimeInMills=" + this.sensorTimeInMills + ", sensorDataLength=" + this.sensorDataLength + ", appTimeInMills=" + this.appTimeInMills + ", appDataLength=" + this.appDataLength + ")";
    }

    public /* synthetic */ SensorRecord(int i, boolean z, int i2, boolean z2, int i3, List list, long j, int i4, long j2, long j3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? -1 : i, (i5 & 2) != 0 ? true : z, (i5 & 4) != 0 ? -1 : i2, (i5 & 8) != 0 ? false : z2, (i5 & 16) == 0 ? i3 : -1, (i5 & 32) != 0 ? new ArrayList() : list, (i5 & 64) != 0 ? -1L : j, (i5 & 128) == 0 ? i4 : 0, (i5 & 256) != 0 ? -1L : j2, (i5 & 512) == 0 ? j3 : -1L);
    }

    public SensorRecord(int i, boolean z) {
        this(i, z, 0, false, 0, null, 0L, 0, 0L, 0L, 1020, null);
    }
}
