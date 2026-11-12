package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import com.google.gson.annotations.SerializedName;
import defpackage.lst;

/* JADX INFO: loaded from: classes38.dex */
public class RunPlanReminder {

    @SerializedName("run_plan_reminder_switch")
    private int mRunPlanReminderSwitch;

    @SerializedName("run_plan_reminder_time_hour")
    private int mRunPlanReminderTimeHour;

    @SerializedName("run_plan_reminder_time_minute")
    private int mRunPlanReminderTimeMinute;

    public int getRunPlanReminderSwitch() {
        return ((Integer) lst.d(Integer.valueOf(this.mRunPlanReminderSwitch))).intValue();
    }

    public void setRunPlanReminderSwitch(int i) {
        this.mRunPlanReminderSwitch = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanReminderTimeHour() {
        return ((Integer) lst.d(Integer.valueOf(this.mRunPlanReminderTimeHour))).intValue();
    }

    public void setRunPlanReminderTimeHour(int i) {
        this.mRunPlanReminderTimeHour = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPlanReminderTimeMinute() {
        return ((Integer) lst.d(Integer.valueOf(this.mRunPlanReminderTimeMinute))).intValue();
    }

    public void setRunPlanReminderTimeMinute(int i) {
        this.mRunPlanReminderTimeMinute = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
