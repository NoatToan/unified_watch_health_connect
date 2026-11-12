package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum NoteTargetApp {
    MI(0, "MI"),
    JOTTER(1, "JOTTER"),
    TASK(2, "TASK");

    private int id;
    private String name;

    NoteTargetApp(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static NoteTargetApp find(String str) {
        for (NoteTargetApp noteTargetApp : values()) {
            if (noteTargetApp.name.equals(str)) {
                return noteTargetApp;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static NoteTargetApp read(String str) {
        return find(str);
    }

    public static String write(NoteTargetApp noteTargetApp) {
        return noteTargetApp.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
