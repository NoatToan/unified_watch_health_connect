package com.xiaomi.infra.galaxy.fds.bean;

/* JADX INFO: loaded from: classes22.dex */
public class ThirdPartyObjectBean {
    private String a;
    private long b;
    private long c;

    public ThirdPartyObjectBean() {
    }

    public long getStartPos() {
        return this.b;
    }

    public long getStopPos() {
        return this.c;
    }

    public String getUrl() {
        return this.a;
    }

    public void setStartPos(long j) {
        this.b = j;
    }

    public void setStopPos(long j) {
        this.c = j;
    }

    public void setUrl(String str) {
        this.a = str;
    }

    public ThirdPartyObjectBean(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
