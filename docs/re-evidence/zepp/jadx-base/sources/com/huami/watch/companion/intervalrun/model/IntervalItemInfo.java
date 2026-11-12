package com.huami.watch.companion.intervalrun.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public class IntervalItemInfo implements Serializable {
    public static final int TYPE_CLICK = 2;
    public static final int TYPE_HR_REMINDER = 4;
    public static final int TYPE_MILEAGE = 0;
    public static final int TYPE_NO_REMINDER = 5;
    public static final int TYPE_PACE_REMINDER = 3;
    public static final int TYPE_TIME = 1;
    public static final int TYPE_UNKNOWN = -1;
    private long groupId;
    private double[] reminderValue;
    private int type = -1;
    private int lengthType = -1;
    private int reminderType = 5;
    private int lengthValue = -1;

    public IntervalItemInfo copy() {
        IntervalItemInfo intervalItemInfo = new IntervalItemInfo();
        intervalItemInfo.setType(this.type);
        intervalItemInfo.setGroupId(this.groupId);
        intervalItemInfo.setLengthType(this.lengthType);
        intervalItemInfo.setLengthValue(this.lengthValue);
        intervalItemInfo.setReminderType(this.reminderType);
        intervalItemInfo.setReminderValue(this.reminderValue);
        return intervalItemInfo;
    }

    public long getGroupId() {
        return this.groupId;
    }

    public int getLengthType() {
        return this.lengthType;
    }

    public int getLengthValue() {
        return this.lengthValue;
    }

    public int getReminderType() {
        return this.reminderType;
    }

    public double[] getReminderValue() {
        return this.reminderValue;
    }

    public int getType() {
        return this.type;
    }

    public boolean isValid() {
        return (this.lengthType == -1 || this.reminderType == -1 || this.type <= -1) ? false : true;
    }

    public void setGroupId(long j) {
        this.groupId = j;
    }

    public void setLengthType(int i) {
        this.lengthType = i;
    }

    public void setLengthValue(int i) {
        this.lengthValue = i;
    }

    public void setReminderType(int i) {
        this.reminderType = i;
    }

    public void setReminderValue(double[] dArr) {
        this.reminderValue = dArr;
    }

    public void setType(int i) {
        this.type = i;
    }
}
