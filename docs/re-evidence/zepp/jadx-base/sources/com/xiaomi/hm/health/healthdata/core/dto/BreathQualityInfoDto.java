package com.xiaomi.hm.health.healthdata.core.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dto/BreathQualityInfoDto;", "", "", "component1", "", "component2", "component3", "timeStamp", "score", HMFwOnlineAnalyticsKt.COST, "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimeStamp", "()J", "b", LogUtil.I, "getScore", "()I", "c", "getCost", "<init>", "(JII)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BreathQualityInfoDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int score;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int cost;

    public BreathQualityInfoDto(long j, int i, int i2) {
        this.timeStamp = j;
        this.score = i;
        this.cost = i2;
    }

    public static /* synthetic */ BreathQualityInfoDto copy$default(BreathQualityInfoDto breathQualityInfoDto, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = breathQualityInfoDto.timeStamp;
        }
        if ((i3 & 2) != 0) {
            i = breathQualityInfoDto.score;
        }
        if ((i3 & 4) != 0) {
            i2 = breathQualityInfoDto.cost;
        }
        return breathQualityInfoDto.copy(j, i, i2);
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

    @NotNull
    public final BreathQualityInfoDto copy(long timeStamp, int score, int cost) {
        return new BreathQualityInfoDto(timeStamp, score, cost);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreathQualityInfoDto)) {
            return false;
        }
        BreathQualityInfoDto breathQualityInfoDto = (BreathQualityInfoDto) other;
        return this.timeStamp == breathQualityInfoDto.timeStamp && this.score == breathQualityInfoDto.score && this.cost == breathQualityInfoDto.cost;
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

    public int hashCode() {
        return (((b.a(this.timeStamp) * 31) + this.score) * 31) + this.cost;
    }

    @NotNull
    public String toString() {
        return "BreathQualityInfoDto(timeStamp=" + this.timeStamp + ", score=" + this.score + ", cost=" + this.cost + ")";
    }
}
