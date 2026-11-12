package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum SweepType {
    Add(0, "Add"),
    Skip(1, "Skip"),
    Final(2, "Final");

    private int id;
    private String name;

    SweepType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static SweepType find(String str) {
        for (SweepType sweepType : values()) {
            if (sweepType.name.equals(str)) {
                return sweepType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static SweepType read(String str) {
        return find(str);
    }

    public static String write(SweepType sweepType) {
        return sweepType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
