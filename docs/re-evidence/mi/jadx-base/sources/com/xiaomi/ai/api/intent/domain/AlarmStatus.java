package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum AlarmStatus {
    DEFAULT(0, "DEFAULT"),
    RECENT_SET(1, "RECENT_SET"),
    RECENT_CALL(2, "RECENT_CALL"),
    ON_STATUS(3, "ON_STATUS"),
    OFF_STATUS(4, "OFF_STATUS");

    private int id;
    private String name;

    AlarmStatus(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static AlarmStatus find(String str) {
        for (AlarmStatus alarmStatus : values()) {
            if (alarmStatus.name.equals(str)) {
                return alarmStatus;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static AlarmStatus read(String str) {
        return find(str);
    }

    public static String write(AlarmStatus alarmStatus) {
        return alarmStatus.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
