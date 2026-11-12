package com.xiaomi.hm.health.device.alarm;

import com.xiaomi.hm.health.databases.model.Alarm;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class AlarmTestUtils {
    private AlarmTestUtils() {
    }

    public static List<Alarm> a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Alarm alarm = new Alarm();
            alarm.setIndex(Integer.valueOf(i));
            Boolean bool = Boolean.FALSE;
            alarm.setEnabled(bool);
            alarm.setIsUpdate(bool);
            alarm.setMSmartWakeupDuration(0);
            Boolean bool2 = Boolean.TRUE;
            alarm.setIsSmartWakeup(bool2);
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 7);
            calendar.set(12, 0);
            calendar.set(14, 0);
            if (i == 0) {
                alarm.setVisible(bool2);
                alarm.setMDays(31);
                alarm.setCalendar(Long.valueOf(calendar.getTimeInMillis()));
            } else if (i == 1) {
                alarm.setVisible(bool2);
                alarm.setMDays(127);
                alarm.setCalendar(Long.valueOf(calendar.getTimeInMillis()));
            } else if (i == 2) {
                alarm.setVisible(bool2);
                alarm.setMDays(0);
                alarm.setCalendar(Long.valueOf(calendar.getTimeInMillis()));
            } else {
                alarm.setVisible(bool);
                alarm.setMDays(0);
                alarm.setCalendar(Long.valueOf(System.currentTimeMillis()));
            }
            arrayList.add(alarm);
        }
        return arrayList;
    }
}
