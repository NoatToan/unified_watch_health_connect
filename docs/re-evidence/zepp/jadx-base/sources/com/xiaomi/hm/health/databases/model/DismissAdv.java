package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
@Deprecated
public class DismissAdv {
    private long a;
    private String b;

    public DismissAdv(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public long getCreateTime() {
        return this.a;
    }

    public String getTitle() {
        return this.b;
    }

    public void setCreateTime(long j) {
        this.a = j;
    }

    public void setTitle(String str) {
        this.b = str;
    }

    public DismissAdv() {
    }
}
