package com.example.habit.export;

import androidx.room.Entity;

/* JADX INFO: loaded from: classes4.dex */
@Entity(primaryKeys = {"type"}, tableName = "habit")
public class Habit {
    public String appBref;
    public String bigIcon;
    public int clockMode;
    public String deviceBref;
    public boolean isEnable = true;
    public boolean isSyncWatch;
    public String middleIcon;
    public String name;
    public String smallIcon;
    public boolean syncCalendar;
    public String times;
    public int type;
    public long typeId;
    public long updateTime;
    public int weekDays;
}
