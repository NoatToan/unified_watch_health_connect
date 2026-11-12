package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum NoteCircle {
    Unknown(0, "Unknown"),
    Once(1, "Once"),
    Everyday(2, "Everyday"),
    Workday(3, "Workday"),
    Holiday(4, "Holiday"),
    MonToFri(5, "MonToFri"),
    Weekend(6, "Weekend"),
    Weekly(7, "Weekly"),
    Monthly(8, "Monthly"),
    Yearly(9, "Yearly");

    private int id;
    private String name;

    NoteCircle(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static NoteCircle find(String str) {
        for (NoteCircle noteCircle : values()) {
            if (noteCircle.name.equals(str)) {
                return noteCircle;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static NoteCircle read(String str) {
        return find(str);
    }

    public static String write(NoteCircle noteCircle) {
        return noteCircle.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
