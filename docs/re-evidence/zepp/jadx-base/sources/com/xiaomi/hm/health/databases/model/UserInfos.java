package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class UserInfos {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Float i;
    private Float j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private Boolean p;
    private String q;
    private String r;

    @Deprecated
    private int s;

    @Deprecated
    private int t;
    private String u;

    public UserInfos(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Float f, Float f2, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, int i, int i2, String str13) {
        this.f = -1;
        this.g = -1;
        this.i = Float.valueOf(-1.0f);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = num2;
        this.h = num3;
        this.i = f;
        this.j = f2;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        this.p = bool;
        this.q = str11;
        this.r = str12;
        this.s = i;
        this.t = i2;
        this.u = str13;
    }

    @Deprecated
    public int getAvatarIdOfScale() {
        return this.s;
    }

    public String getAvatarPath() {
        return this.e;
    }

    public String getAvatarUrl() {
        return this.d;
    }

    public String getBirthday() {
        return this.c;
    }

    public String getCity() {
        return this.k;
    }

    public String getCreat_time() {
        return this.n;
    }

    public String getDefaultFields() {
        return this.u;
    }

    public Boolean getDownloaded() {
        return this.p;
    }

    public Integer getGender() {
        return this.f;
    }

    public Integer getHeight() {
        return this.g;
    }

    public String getLast_login_time() {
        return this.o;
    }

    public String getLatitude() {
        return this.m;
    }

    public String getLocation() {
        return this.q;
    }

    public String getLongitude() {
        return this.l;
    }

    @Deprecated
    public int getMeasureMode() {
        return this.t;
    }

    public String getName() {
        return this.b;
    }

    public Integer getSynced() {
        return this.h;
    }

    public Float getTargetWeight() {
        return this.j;
    }

    public String getUserId() {
        return this.a;
    }

    public String getUserIntroduction() {
        return this.r;
    }

    public Float getWeight() {
        return this.i;
    }

    @Deprecated
    public void setAvatarIdOfScale(int i) {
        this.s = i;
    }

    public void setAvatarPath(String str) {
        this.e = str;
    }

    public void setAvatarUrl(String str) {
        this.d = str;
    }

    public void setBirthday(String str) {
        this.c = str;
    }

    public void setCity(String str) {
        this.k = str;
    }

    public void setCreat_time(String str) {
        this.n = str;
    }

    public void setDefaultFields(String str) {
        this.u = str;
    }

    public void setDownloaded(Boolean bool) {
        this.p = bool;
    }

    public void setGender(Integer num) {
        this.f = num;
    }

    public void setHeight(Integer num) {
        this.g = num;
    }

    public void setLast_login_time(String str) {
        this.o = str;
    }

    public void setLatitude(String str) {
        this.m = str;
    }

    public void setLocation(String str) {
        this.q = str;
    }

    public void setLongitude(String str) {
        this.l = str;
    }

    @Deprecated
    public void setMeasureMode(int i) {
        this.t = i;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setSynced(Integer num) {
        this.h = num;
    }

    public void setTargetWeight(Float f) {
        this.j = f;
    }

    public void setUserId(String str) {
        this.a = str;
    }

    public void setUserIntroduction(String str) {
        this.r = str;
    }

    public void setWeight(Float f) {
        this.i = f;
    }

    public UserInfos() {
        this.f = -1;
        this.g = -1;
        this.i = Float.valueOf(-1.0f);
    }
}
