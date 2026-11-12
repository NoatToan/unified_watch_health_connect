package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class Alarm {
    private Long a;
    private Long b;
    private Boolean c;
    private Boolean d;
    private Integer e;
    private Integer f;
    private Boolean g;
    private Boolean h;
    private Integer i;
    private Boolean j;

    public Alarm(Long l) {
        this.h = Boolean.TRUE;
        this.j = Boolean.FALSE;
        this.a = l;
    }

    public Long getCalendar() {
        return this.b;
    }

    public Boolean getEnabled() {
        return this.c;
    }

    public Long getId() {
        return this.a;
    }

    public Integer getIndex() {
        return this.i;
    }

    public Boolean getIsSmart() {
        return this.j;
    }

    public Boolean getIsSmartWakeup() {
        return this.h;
    }

    public Boolean getIsUpdate() {
        return this.d;
    }

    public Integer getMDays() {
        return this.e;
    }

    public Integer getMSmartWakeupDuration() {
        return this.f;
    }

    public Boolean getVisible() {
        return this.g;
    }

    public void setCalendar(Long l) {
        this.b = l;
    }

    public void setEnabled(Boolean bool) {
        this.c = bool;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setIndex(Integer num) {
        this.i = num;
    }

    public void setIsSmart(Boolean bool) {
        this.j = bool;
    }

    public void setIsSmartWakeup(Boolean bool) {
        this.h = bool;
    }

    public void setIsUpdate(Boolean bool) {
        this.d = bool;
    }

    public void setMDays(Integer num) {
        this.e = num;
    }

    public void setMSmartWakeupDuration(Integer num) {
        this.f = num;
    }

    public void setVisible(Boolean bool) {
        this.g = bool;
    }

    public String toString() {
        return "Alarm{id=" + this.a + ", calendar=" + this.b + ", enabled=" + this.c + ", mDays=" + this.e + ", visible=" + this.g + ", index=" + this.i + ", isSmart=" + this.j + '}';
    }

    public Alarm(Long l, Long l2, Boolean bool, Boolean bool2, Integer num, Integer num2, Boolean bool3, Boolean bool4, Integer num3, Boolean bool5) {
        this.h = Boolean.TRUE;
        this.j = Boolean.FALSE;
        this.a = l;
        this.b = l2;
        this.c = bool;
        this.d = bool2;
        this.e = num;
        this.f = num2;
        this.g = bool3;
        this.h = bool4;
        this.i = num3;
        this.j = bool5;
    }

    public Alarm() {
        this.h = Boolean.TRUE;
        this.j = Boolean.FALSE;
    }
}
