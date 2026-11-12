package com.xiaomi.hm.health.databases.model.circle;

/* JADX INFO: loaded from: classes20.dex */
public class RecomendedUser {
    private String a;
    private String b;
    private String c;
    private Integer d;
    private String e;
    private Boolean f;
    private String g;
    private Boolean h;
    private Boolean i;
    private Integer j;
    private Integer k;
    private String l;
    private String m;

    public RecomendedUser(String str, String str2, String str3, Integer num, String str4, Boolean bool, String str5, Boolean bool2, Boolean bool3, Integer num2, Integer num3, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
        this.f = bool;
        this.g = str5;
        this.h = bool2;
        this.i = bool3;
        this.j = num2;
        this.k = num3;
        this.l = str6;
        this.m = str7;
    }

    public String getAvatar() {
        return this.c;
    }

    public Boolean getChatWithStranger() {
        return this.f;
    }

    public String getFollowStatus() {
        return this.e;
    }

    public Integer getFolloweeNumber() {
        return this.k;
    }

    public Integer getFollowerNumber() {
        return this.j;
    }

    public Boolean getIsFamily() {
        return this.h;
    }

    public Boolean getIsNew() {
        return this.i;
    }

    public String getLink() {
        return this.m;
    }

    public String getPsotImage() {
        return this.l;
    }

    public String getSummary() {
        return this.g;
    }

    public Integer getType() {
        return this.d;
    }

    public String getUserID() {
        return this.a;
    }

    public String getUserName() {
        return this.b;
    }

    public void setAvatar(String str) {
        this.c = str;
    }

    public void setChatWithStranger(Boolean bool) {
        this.f = bool;
    }

    public void setFollowStatus(String str) {
        this.e = str;
    }

    public void setFolloweeNumber(Integer num) {
        this.k = num;
    }

    public void setFollowerNumber(Integer num) {
        this.j = num;
    }

    public void setIsFamily(Boolean bool) {
        this.h = bool;
    }

    public void setIsNew(Boolean bool) {
        this.i = bool;
    }

    public void setLink(String str) {
        this.m = str;
    }

    public void setPsotImage(String str) {
        this.l = str;
    }

    public void setSummary(String str) {
        this.g = str;
    }

    public void setType(Integer num) {
        this.d = num;
    }

    public void setUserID(String str) {
        this.a = str;
    }

    public void setUserName(String str) {
        this.b = str;
    }

    public RecomendedUser() {
    }
}
