package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum NotePeriodType {
    BEGIN(0, "BEGIN"),
    END(1, "END"),
    CIRCLE(2, "CIRCLE");

    private int id;
    private String name;

    NotePeriodType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static NotePeriodType find(String str) {
        for (NotePeriodType notePeriodType : values()) {
            if (notePeriodType.name.equals(str)) {
                return notePeriodType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static NotePeriodType read(String str) {
        return find(str);
    }

    public static String write(NotePeriodType notePeriodType) {
        return notePeriodType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
