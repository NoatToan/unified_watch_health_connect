package com.xiaomi.hm.health.databases.model.circle;

/* JADX INFO: loaded from: classes20.dex */
public class CirclePost {
    private String a;
    private Long b;
    private Integer c;
    private Boolean d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private Integer k;
    private Integer l;
    private String m;

    public CirclePost(String str, Long l, Integer num, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, String str8) {
        this.a = str;
        this.b = l;
        this.c = num;
        this.d = bool;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = num2;
        this.l = num3;
        this.m = str8;
    }

    public String getAvatar() {
        return this.h;
    }

    public String getContent() {
        return this.e;
    }

    public Boolean getHasPraise() {
        return this.d;
    }

    public String getImage() {
        return this.f;
    }

    public Integer getImageHeight() {
        return this.l;
    }

    public Integer getImageWidth() {
        return this.k;
    }

    public String getLink() {
        return this.g;
    }

    public String getNext() {
        return this.m;
    }

    public String getPostID() {
        return this.a;
    }

    public Long getPostTime() {
        return this.b;
    }

    public Integer getPraiseNumber() {
        return this.c;
    }

    public String getUserID() {
        return this.i;
    }

    public String getUserName() {
        return this.j;
    }

    public void setAvatar(String str) {
        this.h = str;
    }

    public void setContent(String str) {
        this.e = str;
    }

    public void setHasPraise(Boolean bool) {
        this.d = bool;
    }

    public void setImage(String str) {
        this.f = str;
    }

    public void setImageHeight(Integer num) {
        this.l = num;
    }

    public void setImageWidth(Integer num) {
        this.k = num;
    }

    public void setLink(String str) {
        this.g = str;
    }

    public void setNext(String str) {
        this.m = str;
    }

    public void setPostID(String str) {
        this.a = str;
    }

    public void setPostTime(Long l) {
        this.b = l;
    }

    public void setPraiseNumber(Integer num) {
        this.c = num;
    }

    public void setUserID(String str) {
        this.i = str;
    }

    public void setUserName(String str) {
        this.j = str;
    }

    public CirclePost() {
    }
}
