package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum NoteFoodStorageType {
    NORMAL_TEMPERATURE(0, "NORMAL_TEMPERATURE"),
    REFRIGERATE(1, "REFRIGERATE"),
    FREEZE(2, "FREEZE"),
    DEFAULT(3, "DEFAULT");

    private int id;
    private String name;

    NoteFoodStorageType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static NoteFoodStorageType find(String str) {
        for (NoteFoodStorageType noteFoodStorageType : values()) {
            if (noteFoodStorageType.name.equals(str)) {
                return noteFoodStorageType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static NoteFoodStorageType read(String str) {
        return find(str);
    }

    public static String write(NoteFoodStorageType noteFoodStorageType) {
        return noteFoodStorageType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
