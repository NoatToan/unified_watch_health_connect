package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum ControlCircle {
    ONCE(0, "ONCE"),
    EVERYDAY(1, "EVERYDAY"),
    WEEKLY(2, "WEEKLY"),
    MONTHLY(3, "MONTHLY"),
    YEARLY(4, "YEARLY"),
    WORKDAY(5, "WORKDAY"),
    HOLIDAY(6, "HOLIDAY");

    private int id;
    private String name;

    ControlCircle(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static ControlCircle find(String str) {
        for (ControlCircle controlCircle : values()) {
            if (controlCircle.name.equals(str)) {
                return controlCircle;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static ControlCircle read(String str) {
        return find(str);
    }

    public static String write(ControlCircle controlCircle) {
        return controlCircle.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
