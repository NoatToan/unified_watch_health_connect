package com.huami.sky.lib.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sky.lib.constant.WebConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J-\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/sky/lib/entity/SleepReminderInfo;", "", "", "component1", "", "component2", "component3", WebConstant.QueryParam.SWITCH, "days", "time", "copy", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getSwitch", "()I", "Ljava/util/List;", "getDays", "()Ljava/util/List;", "getTime", "<init>", "(ILjava/util/List;I)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepReminderInfo {

    @NotNull
    private final List<Integer> days;
    private final int switch;
    private final int time;

    public SleepReminderInfo(int i, @NotNull List<Integer> list, int i2) {
        this.switch = i;
        this.days = list;
        this.time = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepReminderInfo copy$default(SleepReminderInfo sleepReminderInfo, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sleepReminderInfo.switch;
        }
        if ((i3 & 2) != 0) {
            list = sleepReminderInfo.days;
        }
        if ((i3 & 4) != 0) {
            i2 = sleepReminderInfo.time;
        }
        return sleepReminderInfo.copy(i, list, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSwitch() {
        return this.switch;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.days;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    @NotNull
    public final SleepReminderInfo copy(int i, @NotNull List<Integer> days, int time) {
        return new SleepReminderInfo(i, days, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepReminderInfo)) {
            return false;
        }
        SleepReminderInfo sleepReminderInfo = (SleepReminderInfo) other;
        return this.switch == sleepReminderInfo.switch && Intrinsics.areEqual(this.days, sleepReminderInfo.days) && this.time == sleepReminderInfo.time;
    }

    @NotNull
    public final List<Integer> getDays() {
        return this.days;
    }

    public final int getSwitch() {
        return this.switch;
    }

    public final int getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((this.switch * 31) + this.days.hashCode()) * 31) + this.time;
    }

    @NotNull
    public String toString() {
        return "SleepReminderInfo(switch=" + this.switch + ", days=" + this.days + ", time=" + this.time + ")";
    }
}
