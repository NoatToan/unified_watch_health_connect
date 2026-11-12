package com.xiaomi.hm.health.device.setting.vo;

import com.xiaomi.hm.health.databases.model.Reminder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/ReminderItemVo;", "", "", "component1", "component2", "", "Lcom/xiaomi/hm/health/databases/model/Reminder;", "component3", "isSupport", "hasReminder", "reminders", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "getHasReminder", "c", "Ljava/util/List;", "getReminders", "()Ljava/util/List;", "<init>", "(ZZLjava/util/List;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ReminderItemVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean hasReminder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Reminder> reminders;

    /* JADX WARN: Multi-variable type inference failed */
    public ReminderItemVo(boolean z, boolean z2, @NotNull List<? extends Reminder> list) {
        this.isSupport = z;
        this.hasReminder = z2;
        this.reminders = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReminderItemVo copy$default(ReminderItemVo reminderItemVo, boolean z, boolean z2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = reminderItemVo.isSupport;
        }
        if ((i & 2) != 0) {
            z2 = reminderItemVo.hasReminder;
        }
        if ((i & 4) != 0) {
            list = reminderItemVo.reminders;
        }
        return reminderItemVo.copy(z, z2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasReminder() {
        return this.hasReminder;
    }

    @NotNull
    public final List<Reminder> component3() {
        return this.reminders;
    }

    @NotNull
    public final ReminderItemVo copy(boolean isSupport, boolean hasReminder, @NotNull List<? extends Reminder> reminders) {
        return new ReminderItemVo(isSupport, hasReminder, reminders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReminderItemVo)) {
            return false;
        }
        ReminderItemVo reminderItemVo = (ReminderItemVo) other;
        return this.isSupport == reminderItemVo.isSupport && this.hasReminder == reminderItemVo.hasReminder && Intrinsics.areEqual(this.reminders, reminderItemVo.reminders);
    }

    public final boolean getHasReminder() {
        return this.hasReminder;
    }

    @NotNull
    public final List<Reminder> getReminders() {
        return this.reminders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.hasReminder;
        return ((i + (z2 ? 1 : z2)) * 31) + this.reminders.hashCode();
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "ReminderItemVo(isSupport=" + this.isSupport + ", hasReminder=" + this.hasReminder + ", reminders=" + this.reminders + ")";
    }
}
