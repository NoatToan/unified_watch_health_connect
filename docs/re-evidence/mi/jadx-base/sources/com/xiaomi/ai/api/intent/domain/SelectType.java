package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum SelectType {
    Once(1, "Once"),
    Always(2, "Always"),
    Index(3, "Index"),
    All(4, "All");

    private int id;
    private String name;

    SelectType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static SelectType find(String str) {
        for (SelectType selectType : values()) {
            if (selectType.name.equals(str)) {
                return selectType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static SelectType read(String str) {
        return find(str);
    }

    public static String write(SelectType selectType) {
        return selectType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
