package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum NoteType {
    DEFAULT(0, "DEFAULT"),
    REMINDER(1, "REMINDER"),
    COUNTDOWN(2, "COUNTDOWN");

    private int id;
    private String name;

    NoteType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static NoteType find(String str) {
        for (NoteType noteType : values()) {
            if (noteType.name.equals(str)) {
                return noteType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static NoteType read(String str) {
        return find(str);
    }

    public static String write(NoteType noteType) {
        return noteType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
