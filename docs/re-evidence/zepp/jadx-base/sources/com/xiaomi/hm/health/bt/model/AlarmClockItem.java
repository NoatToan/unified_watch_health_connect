package com.xiaomi.hm.health.bt.model;

import java.util.Calendar;

/* JADX INFO: loaded from: classes19.dex */
public class AlarmClockItem {
    public static final int ALARM_CUSTOM = -1;
    public static final int ALARM_EVERY_DAY = 127;
    public static final int ALARM_FRI = 16;
    public static final int ALARM_MON = 1;
    public static final int ALARM_MON_2_FRI = 31;
    public static final int ALARM_MON_2_SAT = 63;
    public static final int ALARM_ONCE = 0;
    public static final byte ALARM_ONCE_DEVICE = -128;
    public static final int ALARM_SAT = 32;
    public static final int ALARM_SUN = 64;
    public static final int ALARM_THU = 8;
    public static final int ALARM_TUE = 2;
    public static final int ALARM_WED = 4;
    public static final int ALARM_WEEKEND = 96;
    public static final int ALARM_WORKDAY = 128;
    public static final int MAX_COUNT = 3;
    private Calendar calendar;
    private long index;
    private boolean lazySleepEnable;
    private boolean visible;
    public static final int[] WEEK_MASK = {1, 2, 4, 8, 16, 32, 64};
    public static final String[] WEEKS = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    private boolean isSmart = false;
    private int mDays = 0;
    private int mDaysForSupportCalendar = 0;
    private boolean enabled = true;
    private boolean isUpdate = false;
    private int mSmartWakeupDuration = 0;

    public AlarmClockItem() {
        setCalendar(Calendar.getInstance());
        set(31, 8, 0, false);
    }

    private void set(int day, int h, int m, boolean enabled) {
        this.mDays = day;
        getCalendar().set(11, h);
        getCalendar().set(12, m);
        this.enabled = enabled;
    }

    public Calendar getCalendar() {
        if (this.calendar == null) {
            Calendar calendar = Calendar.getInstance();
            this.calendar = calendar;
            calendar.set(11, 8);
            this.calendar.set(12, 0);
            setDuration(0);
            setDays(0);
            setUpdate(false);
        }
        return this.calendar;
    }

    public int getCoded() {
        return this.mDays;
    }

    public int getDays() {
        return this.mDays;
    }

    public int getDaysForSupportCalendar() {
        return this.mDaysForSupportCalendar;
    }

    public int getDuration() {
        return this.mSmartWakeupDuration;
    }

    public int getHour() {
        return getCalendar().get(11);
    }

    public long getIndex() {
        return this.index;
    }

    public int getMinute() {
        return getCalendar().get(12);
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isLazySleepEnable() {
        return this.lazySleepEnable;
    }

    public boolean isSmart() {
        return this.isSmart;
    }

    public boolean isSmartWakeup() {
        return getDuration() > 0;
    }

    public boolean isUpdate() {
        return this.isUpdate;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public void setDays(int day) {
        this.mDays = day;
    }

    public void setDaysForSupportCalendar(int daysForSupportCalendar) {
        this.mDaysForSupportCalendar = daysForSupportCalendar;
    }

    public void setDuration(int duration) {
        this.mSmartWakeupDuration = duration;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public void setLazySleepEnable(boolean lazySleepEnable) {
        this.lazySleepEnable = lazySleepEnable;
    }

    public void setSmart(boolean smart) {
        this.isSmart = smart;
    }

    public void setUpdate(boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void set(int h, int m, boolean enabled) {
        set(this.mDays, h, m, enabled);
    }
}
