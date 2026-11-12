package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.dataprocess.StepsInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/StrengthGroupInfo;", "", "time", "", "index", "", "avgHr", StepsInfo.KEY_CALORIES, "timeUsage", "type", "weight", "times", "unit", "lapType", "(JIIIIIIIII)V", "getAvgHr", "()I", "getCal", "getIndex", "getLapType", "getTime", "()J", "getTimeUsage", "getTimes", "getType", "getUnit", "getWeight", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class StrengthGroupInfo {
    private final int avgHr;
    private final int cal;
    private final int index;
    private final int lapType;
    private final long time;
    private final int timeUsage;
    private final int times;
    private final int type;
    private final int unit;
    private final int weight;

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
        return (((((((((((((((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.index)) * 31) + Integer.hashCode(this.avgHr)) * 31) + Integer.hashCode(this.cal)) * 31) + Integer.hashCode(this.timeUsage)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.weight)) * 31) + Integer.hashCode(this.times)) * 31) + Integer.hashCode(this.unit)) * 31) + Integer.hashCode(this.lapType);
    }

    @NotNull
    public String toString() {
        return "StrengthGroupInfo(time=" + this.time + ", index=" + this.index + ", avgHr=" + this.avgHr + ", cal=" + this.cal + ", timeUsage=" + this.timeUsage + ", type=" + this.type + ", weight=" + this.weight + ", times=" + this.times + ", unit=" + this.unit + ", lapType=" + this.lapType + ')';
    }
}
