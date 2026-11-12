package com.xiaomi.hm.health.databases.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class Reminder implements Serializable {
    private static final long serialVersionUID = 1;
    private Long a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;

    public Reminder(Long l, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5) {
        this.d = 1;
        this.a = l;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.f = num5;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
    }

    public String getBody() {
        return this.k;
    }

    public Integer getEventId() {
        return this.b;
    }

    public Integer getFr() {
        return this.c;
    }

    public Integer getIconId() {
        return this.e;
    }

    public String getLoop() {
        return this.g;
    }

    public Integer getOp() {
        return this.d;
    }

    public String getStartDate() {
        return this.h;
    }

    public Integer getStatus() {
        return this.f;
    }

    public String getStopDate() {
        return this.i;
    }

    public Long getTime() {
        return this.a;
    }

    public String getTitle() {
        return this.j;
    }

    public void setBody(String str) {
        this.k = str;
    }

    public void setEventId(Integer num) {
        this.b = num;
    }

    public void setFr(Integer num) {
        this.c = num;
    }

    public void setIconId(Integer num) {
        this.e = num;
    }

    public void setLoop(String str) {
        this.g = str;
    }

    public void setOp(Integer num) {
        this.d = num;
    }

    public void setStartDate(String str) {
        this.h = str;
    }

    public void setStatus(Integer num) {
        this.f = num;
    }

    public void setStopDate(String str) {
        this.i = str;
    }

    public void setTime(Long l) {
        this.a = l;
    }

    public void setTitle(String str) {
        this.j = str;
    }

    public Reminder() {
        this.d = 1;
    }
}
