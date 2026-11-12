package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.AIApiConstants;

/* JADX INFO: loaded from: classes7.dex */
public enum AlarmKeywordType {
    Default(0, "Default"),
    Alarm(1, AIApiConstants.Alarm.NAME),
    Reminder(2, "Reminder"),
    Timer(3, AIApiConstants.Timer.NAME),
    Getup(4, "Getup"),
    EXAM_SPECIAL(5, "EXAM_SPECIAL"),
    EXAM_ORDINARY(6, "EXAM_ORDINARY"),
    BIRTHDAY(7, "BIRTHDAY"),
    LOVEDAY(8, "LOVEDAY"),
    WEDDING(9, "WEDDING"),
    BIRTHDAY_REMINDER(10, "BIRTHDAY_REMINDER"),
    LOVEDAY_REMINDER(11, "LOVEDAY_REMINDER"),
    WEDDING_REMINDER(12, "WEDDING_REMINDER"),
    PERIOD(13, "PERIOD"),
    PERIOD_REMINDER(14, "PERIOD_REMINDER"),
    CLOCK(15, "CLOCK"),
    STOPWATCH(16, "STOPWATCH"),
    NUCLEIN(17, "NUCLEIN"),
    NUCLEIN_REMINDER(18, "NUCLEIN_REMINDER");

    private int id;
    private String name;

    AlarmKeywordType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static AlarmKeywordType find(String str) {
        for (AlarmKeywordType alarmKeywordType : values()) {
            if (alarmKeywordType.name.equals(str)) {
                return alarmKeywordType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static AlarmKeywordType read(String str) {
        return find(str);
    }

    public static String write(AlarmKeywordType alarmKeywordType) {
        return alarmKeywordType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
