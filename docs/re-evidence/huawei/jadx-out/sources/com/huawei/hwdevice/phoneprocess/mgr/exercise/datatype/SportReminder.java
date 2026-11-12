package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import com.google.gson.annotations.SerializedName;
import defpackage.lst;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SportReminder {

    @SerializedName("distance_info")
    private long distanceInfo;

    @SerializedName("hr_status_info")
    private int hrStatusInfo;

    @SerializedName("hr_value_info")
    private int hrValueInfo;

    @SerializedName("reminder_type")
    private int reminderType;

    @SerializedName("run_phrase_number")
    private int runPhraseNumber;

    @SerializedName("run_phrase_variable")
    private List<Integer> runPhraseVariable;

    @SerializedName("sport_type")
    private int sportType;

    @SerializedName("time_info")
    private long timeInfo;

    public int getSportType() {
        return ((Integer) lst.d(Integer.valueOf(this.sportType))).intValue();
    }

    public void setSportType(int i) {
        this.sportType = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getReminderType() {
        return ((Integer) lst.d(Integer.valueOf(this.reminderType))).intValue();
    }

    public void setReminderType(int i) {
        this.reminderType = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRunPhraseNumber() {
        return ((Integer) lst.d(Integer.valueOf(this.runPhraseNumber))).intValue();
    }

    public void setRunPhraseNumber(int i) {
        this.runPhraseNumber = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public List<Integer> getRunPhraseVariable() {
        return (List) lst.d(this.runPhraseVariable);
    }

    public void setRunPhraseVariable(List<Integer> list) {
        this.runPhraseVariable = (List) lst.d(list);
    }

    public long getDistanceInfo() {
        return ((Long) lst.d(Long.valueOf(this.distanceInfo))).longValue();
    }

    public void setDistanceInfo(long j) {
        this.distanceInfo = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public long getTimeInfo() {
        return ((Long) lst.d(Long.valueOf(this.timeInfo))).longValue();
    }

    public void setTimeInfo(long j) {
        this.timeInfo = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int getHrValueInfo() {
        return ((Integer) lst.d(Integer.valueOf(this.hrValueInfo))).intValue();
    }

    public void setHrValueInfo(int i) {
        this.hrValueInfo = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getHrStatusInfo() {
        return ((Integer) lst.d(Integer.valueOf(this.hrStatusInfo))).intValue();
    }

    public void setHrStatusInfo(int i) {
        this.hrStatusInfo = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
