package com.xiaomi.fitness.devicesettings.utils;

import androidx.work.WorkInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSetting;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u0016\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000fJ\u001e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bJ\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0010\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/HuamiDeviceTool;", "", "<init>", "()V", "SUPPORT_MAX_ALARM_COUNT", "", "getNextID", "alarmClockList", "", "Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;", "completeAlarmSetting", "Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSetting;", "alarmClockBeanList", "getDefaultAlarmClocks", "getAlarmClockExt", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "alarmClocks", "clockBeanToClockExt", "alarmClockItem", "index", "clockExtToClockBean", "clockExt", "getVisibleAlarmClock", "completeAlarmClocks", "indexList", "getIndexList", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiDeviceTool {

    @NotNull
    public static final HuamiDeviceTool INSTANCE = new HuamiDeviceTool();
    public static final int SUPPORT_MAX_ALARM_COUNT = 10;

    private HuamiDeviceTool() {
    }

    @NotNull
    public final AlarmClockExt clockBeanToClockExt(@NotNull AlarmSettingItem alarmClockItem, int index) {
        Intrinsics.checkNotNullParameter(alarmClockItem, "alarmClockItem");
        AlarmClockExt alarmClockExt = new AlarmClockExt();
        Calendar calendar = Calendar.getInstance();
        if (alarmClockItem.getAlarmType() == 0) {
            if (!alarmClockItem.isEnable() || System.currentTimeMillis() - alarmClockItem.getNextAlarmTimeLong() >= 0) {
                alarmClockItem.setEnable(false);
            } else if (alarmClockItem.isOverDue()) {
                calendar.add(5, 1);
            }
        }
        alarmClockExt.setEnable(alarmClockItem.isEnable());
        alarmClockExt.setSmart(alarmClockItem.isIsSmart());
        alarmClockExt.setIndex((byte) index);
        int time = alarmClockItem.getTime() / 3600;
        int time2 = (alarmClockItem.getTime() - (time * 3600)) / 60;
        calendar.set(11, time);
        calendar.set(12, time2);
        alarmClockExt.setCalendar(calendar);
        int alarmType = alarmClockItem.getAlarmType();
        if (alarmType == 0) {
            alarmClockExt.setRepeat(WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
        } else if (alarmType == 1) {
            alarmClockExt.setRepeat(127);
        } else if (alarmType == 5) {
            alarmClockExt.setRepeat(alarmClockItem.getDays());
        }
        alarmClockExt.setVisible(alarmClockItem.isVisible());
        return alarmClockExt;
    }

    @NotNull
    public final AlarmSettingItem clockExtToClockBean(@NotNull AlarmClockExt clockExt) {
        Intrinsics.checkNotNullParameter(clockExt, "clockExt");
        AlarmSettingItem alarmSettingItem = new AlarmSettingItem();
        boolean z = clockExt.isEnable() && clockExt.isVisible();
        alarmSettingItem.setEnable(z);
        alarmSettingItem.setVisible(clockExt.isVisible());
        alarmSettingItem.setId(clockExt.getIndex());
        alarmSettingItem.setIsSmart(clockExt.isSmart());
        Calendar calendar = clockExt.getCalendar();
        alarmSettingItem.setTime(calendar.get(11), calendar.get(12));
        if (clockExt.getRepeat() == -128) {
            alarmSettingItem.setAlarmType(0);
            alarmSettingItem.setNextAlarmTimeNow();
        } else if (clockExt.getRepeat() == 127) {
            alarmSettingItem.setAlarmType(1);
        } else {
            alarmSettingItem.setAlarmType(5);
            alarmSettingItem.setWeekdays(clockExt.getRepeat());
        }
        if (z) {
            alarmSettingItem.setNextAlarmTimeIfReOpen();
        } else {
            alarmSettingItem.setNextAlarmTimeLong(0L);
        }
        return alarmSettingItem;
    }

    @NotNull
    public final AlarmSetting completeAlarmClocks(@NotNull AlarmSetting alarmClocks, @NotNull List<Integer> indexList) {
        Intrinsics.checkNotNullParameter(alarmClocks, "alarmClocks");
        Intrinsics.checkNotNullParameter(indexList, "indexList");
        Iterator<Integer> it = indexList.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            AlarmSettingItem alarmSettingItem = new AlarmSettingItem();
            alarmSettingItem.setVisible(false);
            alarmSettingItem.setEnable(false);
            alarmSettingItem.setId(iIntValue);
            Logger.i("HuamiDeviceTool", "complete AlarmClocks index:" + iIntValue);
            alarmClocks.getAlarmItems().add(alarmSettingItem);
        }
        return alarmClocks;
    }

    @NotNull
    public final AlarmSetting completeAlarmSetting(@NotNull List<? extends AlarmSettingItem> alarmClockBeanList) {
        Intrinsics.checkNotNullParameter(alarmClockBeanList, "alarmClockBeanList");
        AlarmSetting defaultAlarmClocks = getDefaultAlarmClocks();
        Iterator<? extends AlarmSettingItem> it = alarmClockBeanList.iterator();
        while (it.hasNext()) {
            defaultAlarmClocks.replaceItem(it.next());
        }
        return defaultAlarmClocks;
    }

    @NotNull
    public final List<AlarmClockExt> getAlarmClockExt(@Nullable AlarmSetting alarmClocks) {
        ArrayList arrayList = new ArrayList();
        if (alarmClocks != null && alarmClocks.getAlarmItems() != null && alarmClocks.getAlarmItems().size() != 0) {
            int size = alarmClocks.getAlarmItems().size();
            for (int i = 0; i < size; i++) {
                AlarmSettingItem alarmSettingItem = alarmClocks.getAlarmItems().get(i);
                Intrinsics.checkNotNull(alarmSettingItem);
                arrayList.add(clockBeanToClockExt(alarmSettingItem, i));
            }
        }
        return arrayList;
    }

    @NotNull
    public final AlarmSetting getDefaultAlarmClocks() {
        AlarmSetting alarmSetting = new AlarmSetting();
        alarmSetting.setSupportMaxClocks(10);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            AlarmSettingItem alarmSettingItem = new AlarmSettingItem();
            alarmSettingItem.setVisible(false);
            alarmSettingItem.setEnable(false);
            alarmSettingItem.setId(i);
            arrayList.add(alarmSettingItem);
        }
        alarmSetting.setAlarmItems(arrayList);
        return alarmSetting;
    }

    @NotNull
    public final List<Integer> getIndexList(@NotNull AlarmSetting alarmClocks) {
        Intrinsics.checkNotNullParameter(alarmClocks, "alarmClocks");
        List<AlarmSettingItem> alarmItems = alarmClocks.getAlarmItems();
        if (alarmItems.size() == 10) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 10)));
        Iterator<AlarmSettingItem> it = alarmItems.iterator();
        while (it.hasNext()) {
            try {
                arrayList.remove(Integer.valueOf(it.next().getId()));
            } catch (Exception e) {
                e.printStackTrace();
                Unit unit = Unit.INSTANCE;
            }
        }
        return arrayList;
    }

    public final int getNextID(@NotNull List<? extends AlarmSettingItem> alarmClockList) {
        Intrinsics.checkNotNullParameter(alarmClockList, "alarmClockList");
        for (AlarmSettingItem alarmSettingItem : alarmClockList) {
            if (!alarmSettingItem.isVisible()) {
                return alarmSettingItem.getId();
            }
        }
        return -1;
    }

    @NotNull
    public final List<AlarmSettingItem> getVisibleAlarmClock(@NotNull List<? extends AlarmSettingItem> alarmClockBeanList) {
        Intrinsics.checkNotNullParameter(alarmClockBeanList, "alarmClockBeanList");
        ArrayList arrayList = new ArrayList();
        for (AlarmSettingItem alarmSettingItem : alarmClockBeanList) {
            if (alarmSettingItem != null && alarmSettingItem.getAlarmType() == 0) {
                alarmSettingItem.setEnable(System.currentTimeMillis() - alarmSettingItem.getNextAlarmTimeLong() < 0);
            }
            if (alarmSettingItem != null && alarmSettingItem.isVisible()) {
                arrayList.add(alarmSettingItem);
            }
        }
        return arrayList;
    }
}
