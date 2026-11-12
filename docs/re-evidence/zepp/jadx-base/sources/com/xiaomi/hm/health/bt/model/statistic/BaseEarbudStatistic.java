package com.xiaomi.hm.health.bt.model.statistic;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b6\u00107J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0091\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00042\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00042\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00022\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010\u001d\u001a\u00020\u000fHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b,\u0010%R\u0019\u0010\u0015\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b-\u0010(R\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b.\u0010+R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b/\u0010(R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b0\u0010+R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b1\u0010%R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b2\u0010+R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/statistic/BaseEarbudStatistic;", "Lcom/xiaomi/hm/health/bt/model/statistic/Statistic;", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "", "component11", "restDate", "restCount", "restInfo", "tomatoDate", "tomatoCount", "tomatoInfo", "playDuration", "audioInfo", "audioDate", "audioPlayInfo", "rightBatteryInfo", "copy", "toString", "hashCode", "", "other", "", "equals", "J", "getRestDate", "()J", LogUtil.I, "getRestCount", "()I", "Ljava/util/List;", "getRestInfo", "()Ljava/util/List;", "getTomatoDate", "getTomatoCount", "getTomatoInfo", "getPlayDuration", "getAudioInfo", "getAudioDate", "getAudioPlayInfo", "Ljava/lang/String;", "getRightBatteryInfo", "()Ljava/lang/String;", "<init>", "(JILjava/util/List;JILjava/util/List;ILjava/util/List;JLjava/util/List;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BaseEarbudStatistic extends Statistic {
    private final long audioDate;

    @NotNull
    private final List<Long> audioInfo;

    @NotNull
    private final List<Long> audioPlayInfo;
    private final int playDuration;
    private final int restCount;
    private final long restDate;

    @NotNull
    private final List<Integer> restInfo;

    @Nullable
    private final String rightBatteryInfo;
    private final int tomatoCount;
    private final long tomatoDate;

    @NotNull
    private final List<Integer> tomatoInfo;

    public BaseEarbudStatistic(long j, int i, @NotNull List<Integer> list, long j2, int i2, @NotNull List<Integer> list2, int i3, @NotNull List<Long> list3, long j3, @NotNull List<Long> list4, @Nullable String str) {
        this.restDate = j;
        this.restCount = i;
        this.restInfo = list;
        this.tomatoDate = j2;
        this.tomatoCount = i2;
        this.tomatoInfo = list2;
        this.playDuration = i3;
        this.audioInfo = list3;
        this.audioDate = j3;
        this.audioPlayInfo = list4;
        this.rightBatteryInfo = str;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRestDate() {
        return this.restDate;
    }

    @NotNull
    public final List<Long> component10() {
        return this.audioPlayInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRightBatteryInfo() {
        return this.rightBatteryInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRestCount() {
        return this.restCount;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.restInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTomatoDate() {
        return this.tomatoDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTomatoCount() {
        return this.tomatoCount;
    }

    @NotNull
    public final List<Integer> component6() {
        return this.tomatoInfo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPlayDuration() {
        return this.playDuration;
    }

    @NotNull
    public final List<Long> component8() {
        return this.audioInfo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getAudioDate() {
        return this.audioDate;
    }

    @NotNull
    public final BaseEarbudStatistic copy(long restDate, int restCount, @NotNull List<Integer> restInfo, long tomatoDate, int tomatoCount, @NotNull List<Integer> tomatoInfo, int playDuration, @NotNull List<Long> audioInfo, long audioDate, @NotNull List<Long> audioPlayInfo, @Nullable String rightBatteryInfo) {
        return new BaseEarbudStatistic(restDate, restCount, restInfo, tomatoDate, tomatoCount, tomatoInfo, playDuration, audioInfo, audioDate, audioPlayInfo, rightBatteryInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseEarbudStatistic)) {
            return false;
        }
        BaseEarbudStatistic baseEarbudStatistic = (BaseEarbudStatistic) other;
        return this.restDate == baseEarbudStatistic.restDate && this.restCount == baseEarbudStatistic.restCount && Intrinsics.areEqual(this.restInfo, baseEarbudStatistic.restInfo) && this.tomatoDate == baseEarbudStatistic.tomatoDate && this.tomatoCount == baseEarbudStatistic.tomatoCount && Intrinsics.areEqual(this.tomatoInfo, baseEarbudStatistic.tomatoInfo) && this.playDuration == baseEarbudStatistic.playDuration && Intrinsics.areEqual(this.audioInfo, baseEarbudStatistic.audioInfo) && this.audioDate == baseEarbudStatistic.audioDate && Intrinsics.areEqual(this.audioPlayInfo, baseEarbudStatistic.audioPlayInfo) && Intrinsics.areEqual(this.rightBatteryInfo, baseEarbudStatistic.rightBatteryInfo);
    }

    public final long getAudioDate() {
        return this.audioDate;
    }

    @NotNull
    public final List<Long> getAudioInfo() {
        return this.audioInfo;
    }

    @NotNull
    public final List<Long> getAudioPlayInfo() {
        return this.audioPlayInfo;
    }

    public final int getPlayDuration() {
        return this.playDuration;
    }

    public final int getRestCount() {
        return this.restCount;
    }

    public final long getRestDate() {
        return this.restDate;
    }

    @NotNull
    public final List<Integer> getRestInfo() {
        return this.restInfo;
    }

    @Nullable
    public final String getRightBatteryInfo() {
        return this.rightBatteryInfo;
    }

    public final int getTomatoCount() {
        return this.tomatoCount;
    }

    public final long getTomatoDate() {
        return this.tomatoDate;
    }

    @NotNull
    public final List<Integer> getTomatoInfo() {
        return this.tomatoInfo;
    }

    public int hashCode() {
        int iA = ((((((((((((((((((b.a(this.restDate) * 31) + this.restCount) * 31) + this.restInfo.hashCode()) * 31) + b.a(this.tomatoDate)) * 31) + this.tomatoCount) * 31) + this.tomatoInfo.hashCode()) * 31) + this.playDuration) * 31) + this.audioInfo.hashCode()) * 31) + b.a(this.audioDate)) * 31) + this.audioPlayInfo.hashCode()) * 31;
        String str = this.rightBatteryInfo;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @Override // com.xiaomi.hm.health.bt.model.statistic.Statistic
    @NotNull
    public String toString() {
        return "BaseEarbudStatistic(restDate=" + this.restDate + ", restCount=" + this.restCount + ", restInfo=" + this.restInfo + ", tomatoDate=" + this.tomatoDate + ", tomatoCount=" + this.tomatoCount + ", tomatoInfo=" + this.tomatoInfo + ", playDuration=" + this.playDuration + ", audioInfo=" + this.audioInfo + ", audioDate=" + this.audioDate + ", audioPlayInfo=" + this.audioPlayInfo + ", rightBatteryInfo=" + ((Object) this.rightBatteryInfo) + ')';
    }
}
