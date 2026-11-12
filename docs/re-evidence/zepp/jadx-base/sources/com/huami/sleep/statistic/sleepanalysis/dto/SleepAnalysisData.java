package com.huami.sleep.statistic.sleepanalysis.dto;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR\"\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\nR\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\"\u00103\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010\nR\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\b\"\u0004\b6\u0010\nR\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\b\"\u0004\bB\u0010\nR\"\u0010G\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010:\u001a\u0004\bE\u0010<\"\u0004\bF\u0010>R\"\u0010K\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\b\"\u0004\bJ\u0010\n¨\u0006N"}, d2 = {"Lcom/huami/sleep/statistic/sleepanalysis/dto/SleepAnalysisData;", "", "", "toString", "", "a", LogUtil.I, "getInvalidDay", "()I", "setInvalidDay", "(I)V", "invalidDay", "b", "getAvgNightSleepScore", "setAvgNightSleepScore", "avgNightSleepScore", "c", "getLastAvgNightSleepScore", "setLastAvgNightSleepScore", "lastAvgNightSleepScore", GoogleApiAvailabilityLight.a, "getAvgDpRatio", "setAvgDpRatio", "avgDpRatio", "e", "getAvgLightRatio", "setAvgLightRatio", "avgLightRatio", "f", "getAvgRemRatio", "setAvgRemRatio", "avgRemRatio", "g", "getAvgAwakeCount", "setAvgAwakeCount", "avgAwakeCount", "h", "getAvgIntoSleepTime", "setAvgIntoSleepTime", "avgIntoSleepTime", "i", "getAvgNightSleepTime", "setAvgNightSleepTime", "avgNightSleepTime", z.j, "getLastAvgNightSleepTime", "setLastAvgNightSleepTime", "lastAvgNightSleepTime", hl.k, "getLongestNightSleepTime", "setLongestNightSleepTime", "longestNightSleepTime", "l", "getShortestNightSleepTime", "setShortestNightSleepTime", "shortestNightSleepTime", "", "m", "J", "getBestDayTime", "()J", "setBestDayTime", "(J)V", "bestDayTime", GoogleApiAvailabilityLight.b, "getBestScore", "setBestScore", "bestScore", "o", "getWorstDayTime", "setWorstDayTime", "worstDayTime", b.r, "getWorstScore", "setWorstScore", "worstScore", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepAnalysisData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int invalidDay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int avgNightSleepScore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int lastAvgNightSleepScore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int avgDpRatio;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int avgLightRatio;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int avgRemRatio;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int avgAwakeCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int avgIntoSleepTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int avgNightSleepTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int lastAvgNightSleepTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int longestNightSleepTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private long bestDayTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int bestScore;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private long worstDayTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int shortestNightSleepTime = 2880;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int worstScore = 100;

    public final int getAvgAwakeCount() {
        return this.avgAwakeCount;
    }

    public final int getAvgDpRatio() {
        return this.avgDpRatio;
    }

    public final int getAvgIntoSleepTime() {
        return this.avgIntoSleepTime;
    }

    public final int getAvgLightRatio() {
        return this.avgLightRatio;
    }

    public final int getAvgNightSleepScore() {
        return this.avgNightSleepScore;
    }

    public final int getAvgNightSleepTime() {
        return this.avgNightSleepTime;
    }

    public final int getAvgRemRatio() {
        return this.avgRemRatio;
    }

    public final long getBestDayTime() {
        return this.bestDayTime;
    }

    public final int getBestScore() {
        return this.bestScore;
    }

    public final int getInvalidDay() {
        return this.invalidDay;
    }

    public final int getLastAvgNightSleepScore() {
        return this.lastAvgNightSleepScore;
    }

    public final int getLastAvgNightSleepTime() {
        return this.lastAvgNightSleepTime;
    }

    public final int getLongestNightSleepTime() {
        return this.longestNightSleepTime;
    }

    public final int getShortestNightSleepTime() {
        return this.shortestNightSleepTime;
    }

    public final long getWorstDayTime() {
        return this.worstDayTime;
    }

    public final int getWorstScore() {
        return this.worstScore;
    }

    public final void setAvgAwakeCount(int i) {
        this.avgAwakeCount = i;
    }

    public final void setAvgDpRatio(int i) {
        this.avgDpRatio = i;
    }

    public final void setAvgIntoSleepTime(int i) {
        this.avgIntoSleepTime = i;
    }

    public final void setAvgLightRatio(int i) {
        this.avgLightRatio = i;
    }

    public final void setAvgNightSleepScore(int i) {
        this.avgNightSleepScore = i;
    }

    public final void setAvgNightSleepTime(int i) {
        this.avgNightSleepTime = i;
    }

    public final void setAvgRemRatio(int i) {
        this.avgRemRatio = i;
    }

    public final void setBestDayTime(long j) {
        this.bestDayTime = j;
    }

    public final void setBestScore(int i) {
        this.bestScore = i;
    }

    public final void setInvalidDay(int i) {
        this.invalidDay = i;
    }

    public final void setLastAvgNightSleepScore(int i) {
        this.lastAvgNightSleepScore = i;
    }

    public final void setLastAvgNightSleepTime(int i) {
        this.lastAvgNightSleepTime = i;
    }

    public final void setLongestNightSleepTime(int i) {
        this.longestNightSleepTime = i;
    }

    public final void setShortestNightSleepTime(int i) {
        this.shortestNightSleepTime = i;
    }

    public final void setWorstDayTime(long j) {
        this.worstDayTime = j;
    }

    public final void setWorstScore(int i) {
        this.worstScore = i;
    }

    @NotNull
    public String toString() {
        return "invalidDay: " + this.invalidDay + " \navgNightSleepScore:  " + this.avgNightSleepScore + "\nlastAvgNightSleepScore:  " + this.lastAvgNightSleepScore + "\navgDpRatio:  " + this.avgDpRatio + "\navgLightRatio:  " + this.avgLightRatio + "\navgRemRatio:  " + this.avgRemRatio + "\navgAwakeCount:  " + this.avgAwakeCount + "\navgIntoSleepTime:  " + this.avgIntoSleepTime + "\navgNightSleepTime:  " + this.avgNightSleepTime + "\nlastAvgNightSleepTime:  " + this.lastAvgNightSleepTime + "\nlongestNightSleepTime:  " + this.longestNightSleepTime + "\nshortestNightSleepTime:  " + this.shortestNightSleepTime;
    }
}
