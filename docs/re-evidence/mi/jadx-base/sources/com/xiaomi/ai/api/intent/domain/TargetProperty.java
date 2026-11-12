package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum TargetProperty {
    LeftTime(0, "LeftTime");

    private int id;
    private String name;

    TargetProperty(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static TargetProperty find(String str) {
        for (TargetProperty targetProperty : values()) {
            if (targetProperty.name.equals(str)) {
                return targetProperty;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static TargetProperty read(String str) {
        return find(str);
    }

    public static String write(TargetProperty targetProperty) {
        return targetProperty.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
