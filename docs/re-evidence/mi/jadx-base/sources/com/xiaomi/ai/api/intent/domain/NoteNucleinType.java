package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum NoteNucleinType {
    SAMPLE_TIME(0, "SAMPLE_TIME"),
    EXPIRED_TIME(1, "EXPIRED_TIME"),
    NUCLEIN_VALID_DURATION(2, "NUCLEIN_VALID_DURATION");

    private int id;
    private String name;

    NoteNucleinType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static NoteNucleinType find(String str) {
        for (NoteNucleinType noteNucleinType : values()) {
            if (noteNucleinType.name.equals(str)) {
                return noteNucleinType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static NoteNucleinType read(String str) {
        return find(str);
    }

    public static String write(NoteNucleinType noteNucleinType) {
        return noteNucleinType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
