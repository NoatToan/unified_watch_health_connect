package com.xiaomi.ai.nlp.factoid.entities.datetime;

/* JADX INFO: loaded from: classes7.dex */
public enum TimeSubType {
    CONCRETE("concrete"),
    OFFSET("offset");

    private String subType;

    TimeSubType(String str) {
        this.subType = str;
    }

    public String getSubType() {
        return this.subType;
    }
}
