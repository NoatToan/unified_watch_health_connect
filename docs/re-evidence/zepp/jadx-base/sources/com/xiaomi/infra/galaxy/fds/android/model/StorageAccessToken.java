package com.xiaomi.infra.galaxy.fds.android.model;

/* JADX INFO: loaded from: classes22.dex */
public class StorageAccessToken {
    private String a;
    private long b;

    public StorageAccessToken() {
    }

    public long getExpireTime() {
        return this.b;
    }

    public String getToken() {
        return this.a;
    }

    public void setExpireTime(long j) {
        this.b = j;
    }

    public void setToken(String str) {
        this.a = str;
    }

    public StorageAccessToken(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
