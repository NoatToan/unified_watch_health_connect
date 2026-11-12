package com.xiaomi.ai.api.intent;

import defpackage.gv5;

/* JADX INFO: loaded from: classes7.dex */
public enum ValueRelation {
    not(0, "!"),
    and(1, gv5.CONNECT_STR),
    or(2, "|");

    private int id;
    private String name;

    ValueRelation(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static ValueRelation find(String str) {
        for (ValueRelation valueRelation : values()) {
            if (valueRelation.name == str) {
                return valueRelation;
            }
        }
        return null;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
