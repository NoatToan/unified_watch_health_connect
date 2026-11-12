package com.huami.watch.companion.notification.bean;

/* JADX INFO: loaded from: classes16.dex */
public class LvMiNoticeBean {
    public static final int TYPE_XING = 1;
    private String detail;
    private int icon;
    private String name;
    private int type;

    public LvMiNoticeBean() {
    }

    public String getDetail() {
        return this.detail;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public void setDetail(String str) {
        this.detail = str;
    }

    public void setIcon(int i) {
        this.icon = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "SupportNoticeBean{name='" + this.name + "', icon=" + this.icon + ", type=" + this.type + ", detail='" + this.detail + "'}";
    }

    public LvMiNoticeBean(String str, int i, String str2) {
        this(str, i, 0, str2);
    }

    public LvMiNoticeBean(String str, int i, int i2, String str2) {
        this.name = str;
        this.icon = i;
        this.type = i2;
        this.detail = str2;
    }
}
