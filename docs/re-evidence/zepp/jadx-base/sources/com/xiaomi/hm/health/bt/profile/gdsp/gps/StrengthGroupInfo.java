package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b7\u00108J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003Jm\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0004HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u0011\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&R\u0019\u0010\u0015\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&R\u0019\u0010\u0016\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u0010&R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b6\u0010&¨\u00069"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/StrengthGroupInfo;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "time", "index", "avgHr", "cal", "timeUsage", "type", "weight", "times", "unit", "lapType", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", LogUtil.I, "getIndex", "()I", "c", "getAvgHr", GoogleApiAvailabilityLight.a, "getCal", "e", "getTimeUsage", "f", "getType", "g", "getWeight", "h", "getTimes", "i", "getUnit", z.j, "getLapType", "<init>", "(JIIIIIIIII)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StrengthGroupInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int avgHr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int cal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int timeUsage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int weight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int times;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int unit;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final int lapType;

    public StrengthGroupInfo(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.time = j;
        this.index = i;
        this.avgHr = i2;
        this.cal = i3;
        this.timeUsage = i4;
        this.type = i5;
        this.weight = i6;
        this.times = i7;
        this.unit = i8;
        this.lapType = i9;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getLapType() {
        return this.lapType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAvgHr() {
        return this.avgHr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCal() {
        return this.cal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTimeUsage() {
        return this.timeUsage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getTimes() {
        return this.times;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getUnit() {
        return this.unit;
    }

    @NotNull
    public final StrengthGroupInfo copy(long time, int index, int avgHr, int cal, int timeUsage, int type, int weight, int times, int unit, int lapType) {
        return new StrengthGroupInfo(time, index, avgHr, cal, timeUsage, type, weight, times, unit, lapType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrengthGroupInfo)) {
            return false;
        }
        StrengthGroupInfo strengthGroupInfo = (StrengthGroupInfo) other;
        return this.time == strengthGroupInfo.time && this.index == strengthGroupInfo.index && this.avgHr == strengthGroupInfo.avgHr && this.cal == strengthGroupInfo.cal && this.timeUsage == strengthGroupInfo.timeUsage && this.type == strengthGroupInfo.type && this.weight == strengthGroupInfo.weight && this.times == strengthGroupInfo.times && this.unit == strengthGroupInfo.unit && this.lapType == strengthGroupInfo.lapType;
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    public final int getCal() {
        return this.cal;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getLapType() {
        return this.lapType;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTimeUsage() {
        return this.timeUsage;
    }

    public final int getTimes() {
        return this.times;
    }

    public final int getType() {
        return this.type;
    }

    public final int getUnit() {
        return this.unit;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((((((((((((defpackage.b.a(this.time) * 31) + this.index) * 31) + this.avgHr) * 31) + this.cal) * 31) + this.timeUsage) * 31) + this.type) * 31) + this.weight) * 31) + this.times) * 31) + this.unit) * 31) + this.lapType;
    }

    @NotNull
    public String toString() {
        return "StrengthGroupInfo(time=" + this.time + ", index=" + this.index + ", avgHr=" + this.avgHr + ", cal=" + this.cal + ", timeUsage=" + this.timeUsage + ", type=" + this.type + ", weight=" + this.weight + ", times=" + this.times + ", unit=" + this.unit + ", lapType=" + this.lapType + ')';
    }
}
