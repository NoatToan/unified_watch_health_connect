package com.xiaomi.hm.health.speech.entity;

/* JADX INFO: loaded from: classes21.dex */
public class SmartMiotAnswerIntention {
    private String a;
    private String b;
    private boolean c;

    public String getEntity() {
        return this.b;
    }

    public String getQuery() {
        return this.a;
    }

    public boolean isDeviceListEmpty() {
        return this.c;
    }

    public void setDeviceListEmpty(boolean deviceListEmpty) {
        this.c = deviceListEmpty;
    }

    public void setEntity(String entity) {
        this.b = entity;
    }

    public void setQuery(String query) {
        this.a = query;
    }
}
