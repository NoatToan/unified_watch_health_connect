package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class Runconfig {
    private Long a;
    private Integer b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Integer g;
    private Boolean h;
    private Integer i;
    private Integer j;
    private Boolean k;
    private String l;
    private String m;
    private Boolean n;
    private Integer o;
    private String p;
    private Integer q;
    private String r;
    private Integer s;
    private Boolean t;
    private Integer u;

    public Runconfig(Long l, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Boolean bool5, Integer num3, Integer num4, Boolean bool6, String str, String str2, Boolean bool7, Integer num5, String str3, Integer num6, String str4, Integer num7, Boolean bool8, Integer num8) {
        this.a = l;
        this.b = num;
        this.c = bool;
        this.d = bool2;
        this.e = bool3;
        this.f = bool4;
        this.g = num2;
        this.h = bool5;
        this.i = num3;
        this.j = num4;
        this.k = bool6;
        this.l = str;
        this.m = str2;
        this.n = bool7;
        this.o = num5;
        this.p = str3;
        this.q = num6;
        this.r = str4;
        this.s = num7;
        this.t = bool8;
        this.u = num8;
    }

    public Boolean getAutoPauseEnable() {
        return this.c;
    }

    public Integer getAutoPausePace() {
        return this.s;
    }

    public Boolean getBeatEnable() {
        return this.t;
    }

    public Integer getBeatValue() {
        return this.u;
    }

    public String getChooseDevices() {
        return this.p;
    }

    public Integer getChooseMap() {
        return this.o;
    }

    public String getDataItems() {
        return this.r;
    }

    public Integer getDevicesCount() {
        return this.q;
    }

    public Long getId() {
        return this.a;
    }

    public String getIndoorModelArray() {
        return this.l;
    }

    public Boolean getKeepScreenOn() {
        return this.n;
    }

    public Boolean getLockScreenDisplay() {
        return this.k;
    }

    public Boolean getMeasureHREnable() {
        return this.e;
    }

    public Boolean getRemindHREnable() {
        return this.f;
    }

    public Integer getRemindHeartRate() {
        return this.g;
    }

    public Integer getRemindPace() {
        return this.i;
    }

    public Boolean getRemindPaceEnable() {
        return this.h;
    }

    public String getStepLengthArray() {
        return this.m;
    }

    public Integer getSynced() {
        return this.j;
    }

    public Integer getType() {
        return this.b;
    }

    public Boolean getVoicePlayEnable() {
        return this.d;
    }

    public void setAutoPauseEnable(Boolean bool) {
        this.c = bool;
    }

    public void setAutoPausePace(Integer num) {
        this.s = num;
    }

    public void setBeatEnable(Boolean bool) {
        this.t = bool;
    }

    public void setBeatValue(Integer num) {
        this.u = num;
    }

    public void setChooseDevices(String str) {
        this.p = str;
    }

    public void setChooseMap(Integer num) {
        this.o = num;
    }

    public void setDataItems(String str) {
        this.r = str;
    }

    public void setDevicesCount(Integer num) {
        this.q = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setIndoorModelArray(String str) {
        this.l = str;
    }

    public void setKeepScreenOn(Boolean bool) {
        this.n = bool;
    }

    public void setLockScreenDisplay(Boolean bool) {
        this.k = bool;
    }

    public void setMeasureHREnable(Boolean bool) {
        this.e = bool;
    }

    public void setRemindHREnable(Boolean bool) {
        this.f = bool;
    }

    public void setRemindHeartRate(Integer num) {
        this.g = num;
    }

    public void setRemindPace(Integer num) {
        this.i = num;
    }

    public void setRemindPaceEnable(Boolean bool) {
        this.h = bool;
    }

    public void setStepLengthArray(String str) {
        this.m = str;
    }

    public void setSynced(Integer num) {
        this.j = num;
    }

    public void setType(Integer num) {
        this.b = num;
    }

    public void setVoicePlayEnable(Boolean bool) {
        this.d = bool;
    }

    public Runconfig() {
    }
}
