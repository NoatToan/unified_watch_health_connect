package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class Push {
    private Long a;
    private Long b;

    public Push(Long l, Long l2) {
        this.b = 0L;
        this.a = l;
        this.b = l2;
    }

    public Long getId() {
        return this.a;
    }

    public Long getMessageId() {
        return this.b;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setMessageId(Long l) {
        this.b = l;
    }

    public Push() {
        this.b = 0L;
    }
}
