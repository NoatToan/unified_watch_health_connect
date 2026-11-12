package com.huawei.datatype;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lst;
import defpackage.ltb;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class EventAlarmInfo {
    private static final String TAG = "EventAlarmInfo";
    private int eventAlarmIndex = 1;
    private int eventAlarmEnable = 0;

    @SerializedName("eventAlarmStartTime_hour")
    private int eventAlarmStartTimeHour = 7;

    @SerializedName("eventAlarmStartTime_mins")
    private int eventAlarmStartTimeMins = 0;
    private int eventAlarmRepeat = 0;
    private String eventAlarmName = "";
    private long eventAlarmTime = 0;
    private long createTimestamp = 0;
    private long modifiedTimestamp = 0;
    private int eventAlarmLegalHolidayEnable = 0;

    public long getCreateTimestamp() {
        return ((Long) lst.d(Long.valueOf(this.createTimestamp))).longValue();
    }

    public void setCreateTimestamp(long j) {
        this.createTimestamp = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public long getModifiedTimestamp() {
        return ((Long) lst.d(Long.valueOf(this.modifiedTimestamp))).longValue();
    }

    public void setModifiedTimestamp(long j) {
        this.modifiedTimestamp = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int getEventAlarmIndex() {
        return ((Integer) lst.d(Integer.valueOf(this.eventAlarmIndex))).intValue();
    }

    public void setEventAlarmIndex(int i) {
        this.eventAlarmIndex = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getEventAlarmEnable() {
        return ((Integer) lst.d(Integer.valueOf(this.eventAlarmEnable))).intValue();
    }

    public void setEventAlarmEnable(int i) {
        this.eventAlarmEnable = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getEventAlarmStartTimeHour() {
        return ((Integer) lst.d(Integer.valueOf(this.eventAlarmStartTimeHour))).intValue();
    }

    public void setEventAlarmStartTimeHour(int i) {
        this.eventAlarmStartTimeHour = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getEventAlarmStartTimeMin() {
        return ((Integer) lst.d(Integer.valueOf(this.eventAlarmStartTimeMins))).intValue();
    }

    public void setEventAlarmStartTimeMins(int i) {
        this.eventAlarmStartTimeMins = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getEventAlarmRepeat() {
        return ((Integer) lst.d(Integer.valueOf(this.eventAlarmRepeat))).intValue();
    }

    public void setEventAlarmRepeat(int i) {
        this.eventAlarmRepeat = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String getEventAlarmName() {
        return (String) lst.d(this.eventAlarmName);
    }

    public void setEventAlarmName(String str) {
        this.eventAlarmName = (String) lst.d(str);
    }

    public long getEventAlarmTime() {
        return ((Long) lst.d(Long.valueOf(this.eventAlarmTime))).longValue();
    }

    public void setEventAlarmTime(long j) {
        this.eventAlarmTime = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int getEventAlarmLegalHolidayEnable() {
        return ((Integer) lst.d(Integer.valueOf(this.eventAlarmLegalHolidayEnable))).intValue();
    }

    public void setEventAlarmLegalHolidayEnable(int i) {
        this.eventAlarmLegalHolidayEnable = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public EventAlarmInfo resetAlarm(EventAlarmInfo eventAlarmInfo, int i) {
        Date dateB = ltb.b();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateB);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), eventAlarmInfo.getEventAlarmStartTimeHour(), eventAlarmInfo.getEventAlarmStartTimeMin(), 0);
        Date time = calendar.getTime();
        LogUtil.a(TAG, "once today alarm ", ltb.v(calendar.getTime()) + ", today long = " + calendar.getTime().getTime());
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        LogUtil.a(TAG, ",once curTime ", Long.valueOf(jCurrentTimeMillis));
        if (jCurrentTimeMillis > ltb.l(calendar.getTime())) {
            time = ltb.q(calendar.getTime());
        }
        LogUtil.a(TAG, "once alarmDate ", ltb.v(time));
        LogUtil.a(TAG, "once alarmDate long ", Long.valueOf(ltb.l(time)));
        eventAlarmInfo.setEventAlarmTime(ltb.l(time));
        eventAlarmInfo.setEventAlarmIndex(i + 1);
        return eventAlarmInfo;
    }

    public String toString() {
        return "EventAlarmInfo{eventAlarmIndex=" + this.eventAlarmIndex + ", eventAlarmEnable=" + this.eventAlarmEnable + ", eventAlarmStartTimeHour=" + this.eventAlarmStartTimeHour + ", eventAlarmStartTimeMins=" + this.eventAlarmStartTimeMins + ", eventAlarmRepeat=" + this.eventAlarmRepeat + ", eventAlarmName='" + this.eventAlarmName + "', eventAlarmTime=" + this.eventAlarmTime + "', eventAlarmHolidayEnable=" + this.eventAlarmLegalHolidayEnable + ", createTimestamp=" + this.createTimestamp + ", modifiedTimestamp=" + this.modifiedTimestamp + '}';
    }
}
