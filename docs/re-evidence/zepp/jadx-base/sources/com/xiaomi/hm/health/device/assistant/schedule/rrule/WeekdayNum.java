package com.xiaomi.hm.health.device.assistant.schedule.rrule;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/WeekdayNum;", "", "", "toICalString", "", "component1", "Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;", "component2", "number", DTransferConstants.WEEKDAY, "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getNumber", "()I", "b", "Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;", "getWeekday", "()Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;", "<init>", "(ILcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeekdayNum {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int number;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Weekday weekday;

    /* JADX WARN: Multi-variable type inference failed */
    public WeekdayNum() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public WeekdayNum(int i, @NotNull Weekday weekday) {
        this.number = i;
        this.weekday = weekday;
    }

    public static /* synthetic */ WeekdayNum copy$default(WeekdayNum weekdayNum, int i, Weekday weekday, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = weekdayNum.number;
        }
        if ((i2 & 2) != 0) {
            weekday = weekdayNum.weekday;
        }
        return weekdayNum.copy(i, weekday);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Weekday getWeekday() {
        return this.weekday;
    }

    @NotNull
    public final WeekdayNum copy(int number, @NotNull Weekday weekday) {
        return new WeekdayNum(number, weekday);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeekdayNum)) {
            return false;
        }
        WeekdayNum weekdayNum = (WeekdayNum) other;
        return this.number == weekdayNum.number && this.weekday == weekdayNum.weekday;
    }

    public final int getNumber() {
        return this.number;
    }

    @NotNull
    public final Weekday getWeekday() {
        return this.weekday;
    }

    public int hashCode() {
        return (this.number * 31) + this.weekday.hashCode();
    }

    @NotNull
    public final String toICalString() {
        int i = this.number;
        if (i == 0) {
            return this.weekday.getInitials();
        }
        return i + this.weekday.getInitials();
    }

    @NotNull
    public String toString() {
        return "WeekdayNum(number=" + this.number + ", weekday=" + this.weekday + ")";
    }

    public /* synthetic */ WeekdayNum(int i, Weekday weekday, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? Weekday.Monday : weekday);
    }
}
