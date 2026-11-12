package com.xiaomi.fitness.chart.entrys;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/FingerBSList;", "", "time", "", "value", "", "levelType", "", "levelStingRes", "", "mealTime", "<init>", "(JFILjava/lang/String;Ljava/lang/String;)V", "getTime", "()J", "getValue", "()F", "getLevelType", "()I", "getLevelStingRes", "()Ljava/lang/String;", "getMealTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FingerBSList {

    @NotNull
    private final String levelStingRes;
    private final int levelType;

    @NotNull
    private final String mealTime;
    private final long time;
    private final float value;

    public FingerBSList(long j, float f, int i, @NotNull String levelStingRes, @NotNull String mealTime) {
        Intrinsics.checkNotNullParameter(levelStingRes, "levelStingRes");
        Intrinsics.checkNotNullParameter(mealTime, "mealTime");
        this.time = j;
        this.value = f;
        this.levelType = i;
        this.levelStingRes = levelStingRes;
        this.mealTime = mealTime;
    }

    public static /* synthetic */ FingerBSList copy$default(FingerBSList fingerBSList, long j, float f, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = fingerBSList.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            f = fingerBSList.value;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            i = fingerBSList.levelType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str = fingerBSList.levelStingRes;
        }
        String str3 = str;
        if ((i2 & 16) != 0) {
            str2 = fingerBSList.mealTime;
        }
        return fingerBSList.copy(j2, f2, i3, str3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
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

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMealTime() {
        return this.mealTime;
    }

    @NotNull
    public final FingerBSList copy(long time, float value, int levelType, @NotNull String levelStingRes, @NotNull String mealTime) {
        Intrinsics.checkNotNullParameter(levelStingRes, "levelStingRes");
        Intrinsics.checkNotNullParameter(mealTime, "mealTime");
        return new FingerBSList(time, value, levelType, levelStingRes, mealTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FingerBSList)) {
            return false;
        }
        FingerBSList fingerBSList = (FingerBSList) other;
        return this.time == fingerBSList.time && Float.compare(this.value, fingerBSList.value) == 0 && this.levelType == fingerBSList.levelType && Intrinsics.areEqual(this.levelStingRes, fingerBSList.levelStingRes) && Intrinsics.areEqual(this.mealTime, fingerBSList.mealTime);
    }

    @NotNull
    public final String getLevelStingRes() {
        return this.levelStingRes;
    }

    public final int getLevelType() {
        return this.levelType;
    }

    @NotNull
    public final String getMealTime() {
        return this.mealTime;
    }

    public final long getTime() {
        return this.time;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.time) * 31) + Float.hashCode(this.value)) * 31) + Integer.hashCode(this.levelType)) * 31) + this.levelStingRes.hashCode()) * 31) + this.mealTime.hashCode();
    }

    @NotNull
    public String toString() {
        return "FingerBSList(time=" + this.time + ", value=" + this.value + ", levelType=" + this.levelType + ", levelStingRes=" + this.levelStingRes + ", mealTime=" + this.mealTime + ")";
    }
}
