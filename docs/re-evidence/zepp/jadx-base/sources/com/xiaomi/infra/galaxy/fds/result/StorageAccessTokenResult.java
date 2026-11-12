package com.xiaomi.infra.galaxy.fds.result;

import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class StorageAccessTokenResult {
    private String a;
    private long b;

    public StorageAccessTokenResult() {
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

    public StorageAccessTokenResult(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
