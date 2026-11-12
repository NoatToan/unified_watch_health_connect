package com.xiaomi.fitness.devicesettings.export.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003JA\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/model/DeviceBPRemind;", "", "isEnable", "", "category", "", "repeat", "dayRemindCount", "remindTimes", "", "<init>", "(ZIIILjava/util/List;)V", "()Z", "setEnable", "(Z)V", "getCategory", "()I", "setCategory", "(I)V", "getRepeat", "setRepeat", "getDayRemindCount", "setDayRemindCount", "getRemindTimes", "()Ljava/util/List;", "setRemindTimes", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceBPRemind {
    private int category;
    private int dayRemindCount;
    private boolean isEnable;

    @NotNull
    private List<Integer> remindTimes;
    private int repeat;

    public DeviceBPRemind(boolean z, int i, int i2, int i3, @NotNull List<Integer> remindTimes) {
        Intrinsics.checkNotNullParameter(remindTimes, "remindTimes");
        this.isEnable = z;
        this.category = i;
        this.repeat = i2;
        this.dayRemindCount = i3;
        this.remindTimes = remindTimes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceBPRemind copy$default(DeviceBPRemind deviceBPRemind, boolean z, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = deviceBPRemind.isEnable;
        }
        if ((i4 & 2) != 0) {
            i = deviceBPRemind.category;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = deviceBPRemind.repeat;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = deviceBPRemind.dayRemindCount;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            list = deviceBPRemind.remindTimes;
        }
        return deviceBPRemind.copy(z, i5, i6, i7, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRepeat() {
        return this.repeat;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDayRemindCount() {
        return this.dayRemindCount;
    }

    @NotNull
    public final List<Integer> component5() {
        return this.remindTimes;
    }

    @NotNull
    public final DeviceBPRemind copy(boolean isEnable, int category, int repeat, int dayRemindCount, @NotNull List<Integer> remindTimes) {
        Intrinsics.checkNotNullParameter(remindTimes, "remindTimes");
        return new DeviceBPRemind(isEnable, category, repeat, dayRemindCount, remindTimes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceBPRemind)) {
            return false;
        }
        DeviceBPRemind deviceBPRemind = (DeviceBPRemind) other;
        return this.isEnable == deviceBPRemind.isEnable && this.category == deviceBPRemind.category && this.repeat == deviceBPRemind.repeat && this.dayRemindCount == deviceBPRemind.dayRemindCount && Intrinsics.areEqual(this.remindTimes, deviceBPRemind.remindTimes);
    }

    public final int getCategory() {
        return this.category;
    }

    public final int getDayRemindCount() {
        return this.dayRemindCount;
    }

    @NotNull
    public final List<Integer> getRemindTimes() {
        return this.remindTimes;
    }

    public final int getRepeat() {
        return this.repeat;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isEnable) * 31) + Integer.hashCode(this.category)) * 31) + Integer.hashCode(this.repeat)) * 31) + Integer.hashCode(this.dayRemindCount)) * 31) + this.remindTimes.hashCode();
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final void setCategory(int i) {
        this.category = i;
    }

    public final void setDayRemindCount(int i) {
        this.dayRemindCount = i;
    }

    public final void setEnable(boolean z) {
        this.isEnable = z;
    }

    public final void setRemindTimes(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.remindTimes = list;
    }

    public final void setRepeat(int i) {
        this.repeat = i;
    }

    @NotNull
    public String toString() {
        return "DeviceBPRemind(isEnable=" + this.isEnable + ", category=" + this.category + ", repeat=" + this.repeat + ", dayRemindCount=" + this.dayRemindCount + ", remindTimes=" + this.remindTimes + ")";
    }
}
