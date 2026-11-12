package com.huami.bloodoxygen.service.odi;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016¨\u0006!"}, d2 = {"Lcom/huami/bloodoxygen/service/odi/SleepBreathScore;", "", "", "component1", "", "component2", "component3", "component4", "score", "watchTime", "timestamp", "wearHintCode", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getScore", "()I", "b", "J", "getWatchTime", "()J", "c", "getTimestamp", GoogleApiAvailabilityLight.a, "getWearHintCode", "<init>", "(IJJI)V", "service_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class SleepBreathScore {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int score;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long watchTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int wearHintCode;

    public SleepBreathScore(int i, long j, long j2, int i2) {
        this.score = i;
        this.watchTime = j;
        this.timestamp = j2;
        this.wearHintCode = i2;
    }

    public static /* synthetic */ SleepBreathScore copy$default(SleepBreathScore sleepBreathScore, int i, long j, long j2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sleepBreathScore.score;
        }
        if ((i3 & 2) != 0) {
            j = sleepBreathScore.watchTime;
        }
        long j3 = j;
        if ((i3 & 4) != 0) {
            j2 = sleepBreathScore.timestamp;
        }
        long j4 = j2;
        if ((i3 & 8) != 0) {
            i2 = sleepBreathScore.wearHintCode;
        }
        return sleepBreathScore.copy(i, j3, j4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getWatchTime() {
        return this.watchTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWearHintCode() {
        return this.wearHintCode;
    }

    @NotNull
    public final SleepBreathScore copy(int score, long watchTime, long timestamp, int wearHintCode) {
        return new SleepBreathScore(score, watchTime, timestamp, wearHintCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepBreathScore)) {
            return false;
        }
        SleepBreathScore sleepBreathScore = (SleepBreathScore) other;
        return this.score == sleepBreathScore.score && this.watchTime == sleepBreathScore.watchTime && this.timestamp == sleepBreathScore.timestamp && this.wearHintCode == sleepBreathScore.wearHintCode;
    }

    public final int getScore() {
        return this.score;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long getWatchTime() {
        return this.watchTime;
    }

    public final int getWearHintCode() {
        return this.wearHintCode;
    }

    public int hashCode() {
        return (((((this.score * 31) + b.a(this.watchTime)) * 31) + b.a(this.timestamp)) * 31) + this.wearHintCode;
    }

    @NotNull
    public String toString() {
        return "SleepBreathScore(score=" + this.score + ", watchTime=" + this.watchTime + ", timestamp=" + this.timestamp + ", wearHintCode=" + this.wearHintCode + ")";
    }
}
