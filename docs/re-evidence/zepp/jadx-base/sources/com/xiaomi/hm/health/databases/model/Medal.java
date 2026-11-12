package com.xiaomi.hm.health.databases.model;

import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class Medal {
    public static final String MEDAL_CATEGORY_ACTIVITY = "活动勋章";
    public static final String MEDAL_CATEGORY_CYCLING = "骑行勋章";
    public static final String MEDAL_CATEGORY_RUN = "跑步勋章";
    public static final String MEDAL_CATEGORY_SPORT_WALKING = "健走勋章";
    public static final String MEDAL_CATEGORY_WALK = "步数勋章";
    public static final int STATE_NOT_TAKEN = 0;
    public static final int STATE_TAKEN_AND_SYNCED = 2;
    public static final int STATE_TAKEN_BUT_NOT_SYNCED = 1;
    private long a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private List<String> j;
    private Integer k;

    public Medal(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list, Integer num) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = list;
        this.k = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Medal) && this.a == ((Medal) obj).a;
    }

    public String getCategory() {
        return this.d;
    }

    public long getId() {
        return this.a;
    }

    public String getNotObtainIcon() {
        return this.f;
    }

    public String getNotObtainText() {
        return this.h;
    }

    public String getObtainIcon() {
        return this.g;
    }

    public String getObtainText() {
        return this.i;
    }

    public Integer getState() {
        return this.k;
    }

    public String getSubTitle() {
        return this.c;
    }

    public List<String> getTags() {
        return this.j;
    }

    public String getTitle() {
        return this.b;
    }

    public String getTitleImg() {
        return this.e;
    }

    public void setCategory(String str) {
        this.d = str;
    }

    public void setId(long j) {
        this.a = j;
    }

    public void setNotObtainIcon(String str) {
        this.f = str;
    }

    public void setNotObtainText(String str) {
        this.h = str;
    }

    public void setObtainIcon(String str) {
        this.g = str;
    }

    public void setObtainText(String str) {
        this.i = str;
    }

    public void setState(Integer num) {
        this.k = num;
    }

    public void setSubTitle(String str) {
        this.c = str;
    }

    public void setTags(List<String> list) {
        this.j = list;
    }

    public void setTitle(String str) {
        this.b = str;
    }

    public void setTitleImg(String str) {
        this.e = str;
    }

    public String toString() {
        return "Medal{id=" + this.a + ", title='" + this.b + "', category='" + this.d + "'}";
    }

    public Medal() {
    }
}
