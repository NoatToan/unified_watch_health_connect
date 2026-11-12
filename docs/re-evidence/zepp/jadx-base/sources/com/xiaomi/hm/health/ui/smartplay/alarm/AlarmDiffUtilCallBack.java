package com.xiaomi.hm.health.ui.smartplay.alarm;

import androidx.recyclerview.widget.DiffUtil;
import com.xiaomi.hm.health.databases.model.Alarm;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmDiffUtilCallBack;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmItem;", "a", "Ljava/util/List;", "getOldAlarmClocks", "()Ljava/util/List;", "oldAlarmClocks", "b", "getNewAlarmClocks", "newAlarmClocks", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AlarmDiffUtilCallBack extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<AlarmItem> oldAlarmClocks;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<AlarmItem> newAlarmClocks;

    public AlarmDiffUtilCallBack(@NotNull List<AlarmItem> list, @NotNull List<AlarmItem> list2) {
        this.oldAlarmClocks = list;
        this.newAlarmClocks = list2;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        AlarmItem alarmItem = this.oldAlarmClocks.get(oldItemPosition);
        AlarmItem alarmItem2 = this.newAlarmClocks.get(newItemPosition);
        if (alarmItem.type == alarmItem2.type) {
            Alarm alarm = alarmItem.alarm;
            Long id = alarm == null ? null : alarm.getId();
            Alarm alarm2 = alarmItem2.alarm;
            if (Intrinsics.areEqual(id, alarm2 == null ? null : alarm2.getId())) {
                Alarm alarm3 = alarmItem.alarm;
                Boolean enabled = alarm3 == null ? null : alarm3.getEnabled();
                Alarm alarm4 = alarmItem2.alarm;
                if (Intrinsics.areEqual(enabled, alarm4 == null ? null : alarm4.getEnabled())) {
                    Alarm alarm5 = alarmItem.alarm;
                    Boolean isSmart = alarm5 == null ? null : alarm5.getIsSmart();
                    Alarm alarm6 = alarmItem2.alarm;
                    if (Intrinsics.areEqual(isSmart, alarm6 == null ? null : alarm6.getIsSmart())) {
                        Alarm alarm7 = alarmItem.alarm;
                        Boolean isSmartWakeup = alarm7 == null ? null : alarm7.getIsSmartWakeup();
                        Alarm alarm8 = alarmItem2.alarm;
                        if (Intrinsics.areEqual(isSmartWakeup, alarm8 == null ? null : alarm8.getIsSmartWakeup())) {
                            Alarm alarm9 = alarmItem.alarm;
                            Boolean isUpdate = alarm9 == null ? null : alarm9.getIsUpdate();
                            Alarm alarm10 = alarmItem2.alarm;
                            if (Intrinsics.areEqual(isUpdate, alarm10 == null ? null : alarm10.getIsUpdate())) {
                                Alarm alarm11 = alarmItem.alarm;
                                Boolean visible = alarm11 == null ? null : alarm11.getVisible();
                                Alarm alarm12 = alarmItem2.alarm;
                                if (Intrinsics.areEqual(visible, alarm12 == null ? null : alarm12.getVisible())) {
                                    Alarm alarm13 = alarmItem.alarm;
                                    Long calendar = alarm13 == null ? null : alarm13.getCalendar();
                                    Alarm alarm14 = alarmItem2.alarm;
                                    if (Intrinsics.areEqual(calendar, alarm14 == null ? null : alarm14.getCalendar())) {
                                        Alarm alarm15 = alarmItem.alarm;
                                        Integer index = alarm15 == null ? null : alarm15.getIndex();
                                        Alarm alarm16 = alarmItem2.alarm;
                                        if (Intrinsics.areEqual(index, alarm16 == null ? null : alarm16.getIndex())) {
                                            Alarm alarm17 = alarmItem.alarm;
                                            Integer mDays = alarm17 == null ? null : alarm17.getMDays();
                                            Alarm alarm18 = alarmItem2.alarm;
                                            if (Intrinsics.areEqual(mDays, alarm18 == null ? null : alarm18.getMDays())) {
                                                Alarm alarm19 = alarmItem.alarm;
                                                Integer mSmartWakeupDuration = alarm19 == null ? null : alarm19.getMSmartWakeupDuration();
                                                Alarm alarm20 = alarmItem2.alarm;
                                                if (Intrinsics.areEqual(mSmartWakeupDuration, alarm20 != null ? alarm20.getMSmartWakeupDuration() : null)) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return true;
    }

    @NotNull
    public final List<AlarmItem> getNewAlarmClocks() {
        return this.newAlarmClocks;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.newAlarmClocks.size();
    }

    @NotNull
    public final List<AlarmItem> getOldAlarmClocks() {
        return this.oldAlarmClocks;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.oldAlarmClocks.size();
    }
}
