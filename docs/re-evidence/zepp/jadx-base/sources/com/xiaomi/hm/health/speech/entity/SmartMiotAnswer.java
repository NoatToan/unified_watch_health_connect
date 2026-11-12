package com.xiaomi.hm.health.speech.entity;

/* JADX INFO: loaded from: classes21.dex */
public class SmartMiotAnswer {
    private String a;
    private String b;
    private String c;
    private SmartMiotAnswerIntention d;

    public String getAction() {
        return this.b;
    }

    public String getDomain() {
        return this.a;
    }

    public SmartMiotAnswerIntention getSmartMiotAnswerIntention() {
        return this.d;
    }

    public String getText() {
        return this.c;
    }

    public void setAction(String action) {
        this.b = action;
    }

    public void setDomain(String domain) {
        this.a = domain;
    }

    public void setSmartMiotAnswerIntention(SmartMiotAnswerIntention smartMiotAnswerIntention) {
        this.d = smartMiotAnswerIntention;
    }

    public void setText(String text) {
        this.c = text;
    }
}
