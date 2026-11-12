package com.huami.sleep.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lcom/huami/sleep/model/BreathQualityScoreInfo;", "", "", "component1", "", "component2", "component3", "component4", "timeStamp", "score", HMFwOnlineAnalyticsKt.COST, "wearHintCode", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimeStamp", "()J", "b", LogUtil.I, "getScore", "()I", "c", "getCost", GoogleApiAvailabilityLight.a, "getWearHintCode", "<init>", "(JIII)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BreathQualityScoreInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int score;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int cost;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int wearHintCode;

    public BreathQualityScoreInfo(long j, int i, int i2, int i3) {
        this.timeStamp = j;
        this.score = i;
        this.cost = i2;
        this.wearHintCode = i3;
    }

    public static /* synthetic */ BreathQualityScoreInfo copy$default(BreathQualityScoreInfo breathQualityScoreInfo, long j, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = breathQualityScoreInfo.timeStamp;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = breathQualityScoreInfo.score;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = breathQualityScoreInfo.cost;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = breathQualityScoreInfo.wearHintCode;
        }
        return breathQualityScoreInfo.copy(j2, i5, i6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCost() {
        return this.cost;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWearHintCode() {
        return this.wearHintCode;
    }

    @NotNull
    public final BreathQualityScoreInfo copy(long timeStamp, int score, int cost, int wearHintCode) {
        return new BreathQualityScoreInfo(timeStamp, score, cost, wearHintCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreathQualityScoreInfo)) {
            return false;
        }
        BreathQualityScoreInfo breathQualityScoreInfo = (BreathQualityScoreInfo) other;
        return this.timeStamp == breathQualityScoreInfo.timeStamp && this.score == breathQualityScoreInfo.score && this.cost == breathQualityScoreInfo.cost && this.wearHintCode == breathQualityScoreInfo.wearHintCode;
    }

    public final int getCost() {
        return this.cost;
    }

    public final int getScore() {
        return this.score;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final int getWearHintCode() {
        return this.wearHintCode;
    }

    public int hashCode() {
        return (((((b.a(this.timeStamp) * 31) + this.score) * 31) + this.cost) * 31) + this.wearHintCode;
    }

    @NotNull
    public String toString() {
        return "BreathQualityScoreInfo(timeStamp=" + this.timeStamp + ", score=" + this.score + ", cost=" + this.cost + ", wearHintCode=" + this.wearHintCode + ")";
    }
}
