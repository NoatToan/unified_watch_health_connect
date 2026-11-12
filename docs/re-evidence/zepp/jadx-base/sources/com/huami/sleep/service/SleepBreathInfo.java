package com.huami.sleep.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/sleep/service/SleepBreathInfo;", "", "", "component1", "", "component2", "Lcom/huami/sleep/service/SleepBreathWearHintCode;", "component3", "score", "timestamp", "wearHintCode", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getScore", "()I", "b", "J", "getTimestamp", "()J", "c", "Lcom/huami/sleep/service/SleepBreathWearHintCode;", "getWearHintCode", "()Lcom/huami/sleep/service/SleepBreathWearHintCode;", "<init>", "(IJLcom/huami/sleep/service/SleepBreathWearHintCode;)V", "sleep-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepBreathInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int score;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final SleepBreathWearHintCode wearHintCode;

    public SleepBreathInfo(int i, long j, @NotNull SleepBreathWearHintCode sleepBreathWearHintCode) {
        this.score = i;
        this.timestamp = j;
        this.wearHintCode = sleepBreathWearHintCode;
    }

    public static /* synthetic */ SleepBreathInfo copy$default(SleepBreathInfo sleepBreathInfo, int i, long j, SleepBreathWearHintCode sleepBreathWearHintCode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sleepBreathInfo.score;
        }
        if ((i2 & 2) != 0) {
            j = sleepBreathInfo.timestamp;
        }
        if ((i2 & 4) != 0) {
            sleepBreathWearHintCode = sleepBreathInfo.wearHintCode;
        }
        return sleepBreathInfo.copy(i, j, sleepBreathWearHintCode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SleepBreathWearHintCode getWearHintCode() {
        return this.wearHintCode;
    }

    @NotNull
    public final SleepBreathInfo copy(int score, long timestamp, @NotNull SleepBreathWearHintCode wearHintCode) {
        return new SleepBreathInfo(score, timestamp, wearHintCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepBreathInfo)) {
            return false;
        }
        SleepBreathInfo sleepBreathInfo = (SleepBreathInfo) other;
        return this.score == sleepBreathInfo.score && this.timestamp == sleepBreathInfo.timestamp && this.wearHintCode == sleepBreathInfo.wearHintCode;
    }

    public final int getScore() {
        return this.score;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final SleepBreathWearHintCode getWearHintCode() {
        return this.wearHintCode;
    }

    public int hashCode() {
        return (((this.score * 31) + b.a(this.timestamp)) * 31) + this.wearHintCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepBreathInfo(score=" + this.score + ", timestamp=" + this.timestamp + ", wearHintCode=" + this.wearHintCode + ")";
    }
}
