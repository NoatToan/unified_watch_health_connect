package com.huawei.datatype;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lst;
import defpackage.ltb;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class SmartAlarmInfo {
    private static final String TAG = "SmartAlarmInfo";
    private int smartAlarmIndex = 1;
    private int smartAlarmEnable = 0;

    @SerializedName("smartAlarmStartTime_hour")
    private int smartAlarmStartTimeHour = 7;

    @SerializedName("smartAlarmStartTime_mins")
    private int smartAlarmStartTimeMins = 0;
    private long smartAlarmTime = 0;
    private int smartAlarmRepeat = 31;
    private int smartAlarmAheadTime = 5;

    public int getSmartAlarmIndex() {
        return ((Integer) lst.d(Integer.valueOf(this.smartAlarmIndex))).intValue();
    }

    public void setSmartAlarmIndex(int i) {
        this.smartAlarmIndex = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSmartAlarmEnable() {
        return ((Integer) lst.d(Integer.valueOf(this.smartAlarmEnable))).intValue();
    }

    public void setSmartAlarmEnable(int i) {
        this.smartAlarmEnable = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSmartAlarmStartTimeHour() {
        return ((Integer) lst.d(Integer.valueOf(this.smartAlarmStartTimeHour))).intValue();
    }

    public void setSmartAlarmStartTimeHour(int i) {
        this.smartAlarmStartTimeHour = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSmartAlarmStartTimeMins() {
        return ((Integer) lst.d(Integer.valueOf(this.smartAlarmStartTimeMins))).intValue();
    }

    public void setSmartAlarmStartTimeMins(int i) {
        this.smartAlarmStartTimeMins = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSmartAlarmRepeat() {
        return ((Integer) lst.d(Integer.valueOf(this.smartAlarmRepeat))).intValue();
    }

    public void setSmartAlarmRepeat(int i) {
        this.smartAlarmRepeat = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSmartAlarmAheadTime() {
        return ((Integer) lst.d(Integer.valueOf(this.smartAlarmAheadTime))).intValue();
    }

    public void setSmartAlarmAheadTime(int i) {
        this.smartAlarmAheadTime = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getSmartAlarmTime() {
        return ((Long) lst.d(Long.valueOf(this.smartAlarmTime))).longValue();
    }

    public void setSmartAlarmTime(long j) {
        this.smartAlarmTime = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public SmartAlarmInfo resetSmartAlarm(SmartAlarmInfo smartAlarmInfo, int i) {
        Date dateB = ltb.b();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateB);
        LogUtil.a(TAG, "once saveOnceSmartAlarm StartTime_hour ", Integer.valueOf(smartAlarmInfo.getSmartAlarmStartTimeHour()), ", StartTime_mins ", Integer.valueOf(smartAlarmInfo.getSmartAlarmStartTimeMins()));
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), smartAlarmInfo.getSmartAlarmStartTimeHour(), smartAlarmInfo.getSmartAlarmStartTimeMins(), 0);
        Date time = calendar.getTime();
        LogUtil.a(TAG, "once today alarm ", ltb.v(calendar.getTime()), ", today long ", Long.valueOf(calendar.getTime().getTime()));
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        LogUtil.a(TAG, "once curTime ", Long.valueOf(jCurrentTimeMillis));
        if (jCurrentTimeMillis > ltb.l(calendar.getTime())) {
            time = ltb.q(calendar.getTime());
        }
        LogUtil.a(TAG, "once alarmDate ", ltb.v(time));
        LogUtil.a(TAG, "once alarmDate long ", Long.valueOf(ltb.l(time)));
        smartAlarmInfo.setSmartAlarmTime(ltb.l(time));
        smartAlarmInfo.setSmartAlarmIndex(i + 1);
        return smartAlarmInfo;
    }

    public String toString() {
        return "SmartAlarmInfo{smartAlarmIndex=" + this.smartAlarmIndex + ", smartAlarmEnable=" + this.smartAlarmEnable + ", smartAlarmStartTimeHour=" + this.smartAlarmStartTimeHour + ", smartAlarmStartTimeMins=" + this.smartAlarmStartTimeMins + ", smartAlarmTime=" + this.smartAlarmTime + ", smartAlarmRepeat=" + this.smartAlarmRepeat + ", smartAlarmAheadTime=" + this.smartAlarmAheadTime + '}';
    }
}
