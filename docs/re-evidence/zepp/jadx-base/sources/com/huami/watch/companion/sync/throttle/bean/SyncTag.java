package com.huami.watch.companion.sync.throttle.bean;

import com.huami.watch.util.TimeUtil;

/* JADX INFO: loaded from: classes16.dex */
public class SyncTag {
    private String a;
    private long b;
    private String c;

    public SyncTag(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public String getFrom() {
        return this.c;
    }

    public String getName() {
        return this.a;
    }

    public long getTime() {
        return this.b;
    }

    public void setFrom(String str) {
        this.c = str;
    }

    public void setName(String str) {
        this.a = str;
    }

    public void setTime(long j) {
        this.b = j;
    }

    public String toString() {
        return this.a + ", Time : " + TimeUtil.formatDateTime(this.b) + ", From : " + this.c;
    }
}
