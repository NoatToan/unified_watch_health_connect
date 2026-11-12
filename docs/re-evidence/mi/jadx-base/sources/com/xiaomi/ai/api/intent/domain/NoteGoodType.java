package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum NoteGoodType {
    DEFAULT(0, "DEFAULT"),
    CAR(1, "CAR");

    private int id;
    private String name;

    NoteGoodType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static NoteGoodType find(String str) {
        for (NoteGoodType noteGoodType : values()) {
            if (noteGoodType.name.equals(str)) {
                return noteGoodType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static NoteGoodType read(String str) {
        return find(str);
    }

    public static String write(NoteGoodType noteGoodType) {
        return noteGoodType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
