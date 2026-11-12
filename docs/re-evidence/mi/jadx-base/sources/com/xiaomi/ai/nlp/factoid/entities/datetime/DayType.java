package com.xiaomi.ai.nlp.factoid.entities.datetime;

/* JADX INFO: loaded from: classes7.dex */
public enum DayType {
    EARLY_MORNING("EM"),
    MORNING("MO"),
    FORENOON("FN"),
    AFTERNOON("AF"),
    NIGHT("NI"),
    EVENING("EV"),
    NOON("NO");

    private String name;

    DayType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
