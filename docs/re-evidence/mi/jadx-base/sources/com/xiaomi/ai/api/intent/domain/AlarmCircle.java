package com.xiaomi.ai.api.intent.domain;

import androidx.health.connect.client.records.metadata.DeviceTypes;

/* JADX INFO: loaded from: classes7.dex */
public enum AlarmCircle {
    UNKNOWN(0, DeviceTypes.UNKNOWN),
    ONCE(1, "ONCE"),
    EVERYDAY(2, "EVERYDAY"),
    WORKDAY(3, "WORKDAY"),
    HOLIDAY(4, "HOLIDAY"),
    MONTOFRI(5, "MONTOFRI"),
    WEEKEND(6, "WEEKEND"),
    WEEKLY(7, "WEEKLY"),
    MONTHLY(8, "MONTHLY"),
    YEARLY(9, "YEARLY"),
    ALWAYS(10, "ALWAYS");

    private int id;
    private String name;

    AlarmCircle(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static AlarmCircle find(String str) {
        for (AlarmCircle alarmCircle : values()) {
            if (alarmCircle.name.equals(str)) {
                return alarmCircle;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static AlarmCircle read(String str) {
        return find(str);
    }

    public static String write(AlarmCircle alarmCircle) {
        return alarmCircle.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
