package com.huami.sky.lib.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J9\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/sky/lib/entity/SleepReminderSettingInfo;", "", "", "component1", "", "", "component2", "Lcom/huami/sky/lib/entity/DaysType;", "component3", "", "component4", "isOpen", "days", "daysType", "formatTimeStr", "copy", "toString", "hashCode", "other", "equals", "Z", "()Z", "Ljava/util/List;", "getDays", "()Ljava/util/List;", "Lcom/huami/sky/lib/entity/DaysType;", "getDaysType", "()Lcom/huami/sky/lib/entity/DaysType;", "Ljava/lang/String;", "getFormatTimeStr", "()Ljava/lang/String;", "<init>", "(ZLjava/util/List;Lcom/huami/sky/lib/entity/DaysType;Ljava/lang/String;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepReminderSettingInfo {

    @NotNull
    private final List<Integer> days;

    @Nullable
    private final DaysType daysType;

    @NotNull
    private final String formatTimeStr;
    private final boolean isOpen;

    public SleepReminderSettingInfo(boolean z, @NotNull List<Integer> list, @Nullable DaysType daysType, @NotNull String str) {
        this.isOpen = z;
        this.days = list;
        this.daysType = daysType;
        this.formatTimeStr = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepReminderSettingInfo copy$default(SleepReminderSettingInfo sleepReminderSettingInfo, boolean z, List list, DaysType daysType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sleepReminderSettingInfo.isOpen;
        }
        if ((i & 2) != 0) {
            list = sleepReminderSettingInfo.days;
        }
        if ((i & 4) != 0) {
            daysType = sleepReminderSettingInfo.daysType;
        }
        if ((i & 8) != 0) {
            str = sleepReminderSettingInfo.formatTimeStr;
        }
        return sleepReminderSettingInfo.copy(z, list, daysType, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.days;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DaysType getDaysType() {
        return this.daysType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFormatTimeStr() {
        return this.formatTimeStr;
    }

    @NotNull
    public final SleepReminderSettingInfo copy(boolean isOpen, @NotNull List<Integer> days, @Nullable DaysType daysType, @NotNull String formatTimeStr) {
        return new SleepReminderSettingInfo(isOpen, days, daysType, formatTimeStr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepReminderSettingInfo)) {
            return false;
        }
        SleepReminderSettingInfo sleepReminderSettingInfo = (SleepReminderSettingInfo) other;
        return this.isOpen == sleepReminderSettingInfo.isOpen && Intrinsics.areEqual(this.days, sleepReminderSettingInfo.days) && this.daysType == sleepReminderSettingInfo.daysType && Intrinsics.areEqual(this.formatTimeStr, sleepReminderSettingInfo.formatTimeStr);
    }

    @NotNull
    public final List<Integer> getDays() {
        return this.days;
    }

    @Nullable
    public final DaysType getDaysType() {
        return this.daysType;
    }

    @NotNull
    public final String getFormatTimeStr() {
        return this.formatTimeStr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.isOpen;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((r0 * 31) + this.days.hashCode()) * 31;
        DaysType daysType = this.daysType;
        return ((iHashCode + (daysType == null ? 0 : daysType.hashCode())) * 31) + this.formatTimeStr.hashCode();
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    @NotNull
    public String toString() {
        return "SleepReminderSettingInfo(isOpen=" + this.isOpen + ", days=" + this.days + ", daysType=" + this.daysType + ", formatTimeStr=" + this.formatTimeStr + ")";
    }
}
