package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum AutoStatus {
    Unknown(0, "Unknown"),
    Trigger(1, "Trigger"),
    ItemList(2, "ItemList"),
    ListChoice(3, "ListChoice"),
    Finish(4, "Finish");

    private int id;
    private String name;

    AutoStatus(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static AutoStatus find(String str) {
        for (AutoStatus autoStatus : values()) {
            if (autoStatus.name.equals(str)) {
                return autoStatus;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static AutoStatus read(String str) {
        return find(str);
    }

    public static String write(AutoStatus autoStatus) {
        return autoStatus.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
