package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum NoteCalendarType {
    DEFAULT(0, "DEFAULT"),
    EXAM_SPECIAL(1, "EXAM_SPECIAL"),
    EXAM_ORDINARY(2, "EXAM_ORDINARY"),
    BIRTHDAY(3, "BIRTHDAY"),
    LOVEDAY(4, "LOVEDAY"),
    WEDDINGDAY(5, "WEDDINGDAY"),
    PERIOD(6, "PERIOD"),
    NUCLEIN(7, "NUCLEIN");

    private int id;
    private String name;

    NoteCalendarType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static NoteCalendarType find(String str) {
        for (NoteCalendarType noteCalendarType : values()) {
            if (noteCalendarType.name.equals(str)) {
                return noteCalendarType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static NoteCalendarType read(String str) {
        return find(str);
    }

    public static String write(NoteCalendarType noteCalendarType) {
        return noteCalendarType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
