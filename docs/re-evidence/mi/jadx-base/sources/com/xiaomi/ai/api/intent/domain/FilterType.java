package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum FilterType {
    Default(0, "Default"),
    RecentSet(1, "RecentSet"),
    RecentCall(2, "RecentCall"),
    OnStatus(3, "OnStatus"),
    OffStatus(4, "OffStatus");

    private int id;
    private String name;

    FilterType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static FilterType find(String str) {
        for (FilterType filterType : values()) {
            if (filterType.name.equals(str)) {
                return filterType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static FilterType read(String str) {
        return find(str);
    }

    public static String write(FilterType filterType) {
        return filterType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
