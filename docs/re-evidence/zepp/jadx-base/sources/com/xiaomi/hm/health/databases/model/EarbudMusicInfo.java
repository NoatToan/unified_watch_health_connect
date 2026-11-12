package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class EarbudMusicInfo {
    private Long a;
    private String b;
    private String c;
    private Boolean d;
    private Boolean e;
    private Float f;
    private String g;
    private Boolean h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private Integer o;
    private Long p;

    public EarbudMusicInfo(Long l, String str, String str2, Boolean bool, Boolean bool2, Float f, String str3, Boolean bool3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Long l2) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = bool;
        this.e = bool2;
        this.f = f;
        this.g = str3;
        this.h = bool3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = num;
        this.p = l2;
    }

    public String getAudio() {
        return this.l;
    }

    public String getBanner() {
        return this.k;
    }

    public String getDescription() {
        return this.c;
    }

    public Boolean getDownloadAble() {
        return this.h;
    }

    public Long getId() {
        return this.a;
    }

    public String getImage() {
        return this.j;
    }

    public Boolean getIsFree() {
        return this.e;
    }

    public String getLeftChannel() {
        return this.m;
    }

    public Integer getLocalStatus() {
        return this.o;
    }

    public Long getLocalUpdateTime() {
        return this.p;
    }

    public String getName() {
        return this.b;
    }

    public Boolean getOfficialBuiltin() {
        return this.d;
    }

    public Float getPrice() {
        return this.f;
    }

    public String getRightChannel() {
        return this.n;
    }

    public String getSkuId() {
        return this.g;
    }

    public String getThumb() {
        return this.i;
    }

    public void setAudio(String str) {
        this.l = str;
    }

    public void setBanner(String str) {
        this.k = str;
    }

    public void setDescription(String str) {
        this.c = str;
    }

    public void setDownloadAble(Boolean bool) {
        this.h = bool;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setImage(String str) {
        this.j = str;
    }

    public void setIsFree(Boolean bool) {
        this.e = bool;
    }

    public void setLeftChannel(String str) {
        this.m = str;
    }

    public void setLocalStatus(Integer num) {
        this.o = num;
    }

    public void setLocalUpdateTime(Long l) {
        this.p = l;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setOfficialBuiltin(Boolean bool) {
        this.d = bool;
    }

    public void setPrice(Float f) {
        this.f = f;
    }

    public void setRightChannel(String str) {
        this.n = str;
    }

    public void setSkuId(String str) {
        this.g = str;
    }

    public void setThumb(String str) {
        this.i = str;
    }

    public EarbudMusicInfo() {
    }
}
