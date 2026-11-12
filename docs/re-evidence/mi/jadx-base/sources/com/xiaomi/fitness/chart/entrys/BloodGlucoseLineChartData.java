package com.xiaomi.fitness.chart.entrys;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseLineChartData;", "", "value", "", "drawableType", "", "levelType", "levelStingRes", "", "time", "", "<init>", "(FIILjava/lang/String;J)V", "getValue", "()F", "getDrawableType", "()I", "getLevelType", "getLevelStingRes", "()Ljava/lang/String;", "getTime", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BloodGlucoseLineChartData {
    private final int drawableType;

    @NotNull
    private final String levelStingRes;
    private final int levelType;
    private final long time;
    private final float value;

    public BloodGlucoseLineChartData(float f, int i, int i2, @NotNull String levelStingRes, long j) {
        Intrinsics.checkNotNullParameter(levelStingRes, "levelStingRes");
        this.value = f;
        this.drawableType = i;
        this.levelType = i2;
        this.levelStingRes = levelStingRes;
        this.time = j;
    }

    public static /* synthetic */ BloodGlucoseLineChartData copy$default(BloodGlucoseLineChartData bloodGlucoseLineChartData, float f, int i, int i2, String str, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f = bloodGlucoseLineChartData.value;
        }
        if ((i3 & 2) != 0) {
            i = bloodGlucoseLineChartData.drawableType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = bloodGlucoseLineChartData.levelType;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = bloodGlucoseLineChartData.levelStingRes;
        }
        String str2 = str;
        if ((i3 & 16) != 0) {
            j = bloodGlucoseLineChartData.time;
        }
        return bloodGlucoseLineChartData.copy(f, i4, i5, str2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDrawableType() {
        return this.drawableType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLevelType() {
        return this.levelType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLevelStingRes() {
        return this.levelStingRes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final BloodGlucoseLineChartData copy(float value, int drawableType, int levelType, @NotNull String levelStingRes, long time) {
        Intrinsics.checkNotNullParameter(levelStingRes, "levelStingRes");
        return new BloodGlucoseLineChartData(value, drawableType, levelType, levelStingRes, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodGlucoseLineChartData)) {
            return false;
        }
        BloodGlucoseLineChartData bloodGlucoseLineChartData = (BloodGlucoseLineChartData) other;
        return Float.compare(this.value, bloodGlucoseLineChartData.value) == 0 && this.drawableType == bloodGlucoseLineChartData.drawableType && this.levelType == bloodGlucoseLineChartData.levelType && Intrinsics.areEqual(this.levelStingRes, bloodGlucoseLineChartData.levelStingRes) && this.time == bloodGlucoseLineChartData.time;
    }

    public final int getDrawableType() {
        return this.drawableType;
    }

    @NotNull
    public final String getLevelStingRes() {
        return this.levelStingRes;
    }

    public final int getLevelType() {
        return this.levelType;
    }

    public final long getTime() {
        return this.time;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.value) * 31) + Integer.hashCode(this.drawableType)) * 31) + Integer.hashCode(this.levelType)) * 31) + this.levelStingRes.hashCode()) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "BloodGlucoseLineChartData(value=" + this.value + ", drawableType=" + this.drawableType + ", levelType=" + this.levelType + ", levelStingRes=" + this.levelStingRes + ", time=" + this.time + ")";
    }
}
