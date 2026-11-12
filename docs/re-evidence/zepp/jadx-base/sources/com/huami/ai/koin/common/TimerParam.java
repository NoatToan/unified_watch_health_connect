package com.huami.ai.koin.common;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/ai/koin/common/TimerParam;", "", "", "component1", "component2", "component3", "hour", "minute", "second", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getHour", "()I", "b", "getMinute", "c", "getSecond", "<init>", "(III)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TimerParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int hour;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int minute;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int second;

    public TimerParam(int i, int i2, int i3) {
        this.hour = i;
        this.minute = i2;
        this.second = i3;
    }

    public static /* synthetic */ TimerParam copy$default(TimerParam timerParam, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = timerParam.hour;
        }
        if ((i4 & 2) != 0) {
            i2 = timerParam.minute;
        }
        if ((i4 & 4) != 0) {
            i3 = timerParam.second;
        }
        return timerParam.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSecond() {
        return this.second;
    }

    @NotNull
    public final TimerParam copy(int hour, int minute, int second) {
        return new TimerParam(hour, minute, second);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerParam)) {
            return false;
        }
        TimerParam timerParam = (TimerParam) other;
        return this.hour == timerParam.hour && this.minute == timerParam.minute && this.second == timerParam.second;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final int getSecond() {
        return this.second;
    }

    public int hashCode() {
        return (((this.hour * 31) + this.minute) * 31) + this.second;
    }

    @NotNull
    public String toString() {
        return "TimerParam(hour=" + this.hour + ", minute=" + this.minute + ", second=" + this.second + ')';
    }
}
