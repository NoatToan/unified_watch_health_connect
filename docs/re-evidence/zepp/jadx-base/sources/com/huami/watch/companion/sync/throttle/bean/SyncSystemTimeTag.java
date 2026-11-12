package com.huami.watch.companion.sync.throttle.bean;

/* JADX INFO: loaded from: classes16.dex */
public class SyncSystemTimeTag extends SyncTag {
    private String d;

    public SyncSystemTimeTag(String str, long j, String str2, String str3) {
        super(str, j, str2);
        this.d = str3;
    }

    public String getTimeZoneID() {
        return this.d;
    }

    public void setTimeZoneID(String str) {
        this.d = str;
    }

    @Override // com.huami.watch.companion.sync.throttle.bean.SyncTag
    public String toString() {
        return super.toString() + ", TimeZoneID : " + this.d;
    }
}
