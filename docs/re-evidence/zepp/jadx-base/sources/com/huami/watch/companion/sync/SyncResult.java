package com.huami.watch.companion.sync;

import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class SyncResult {
    public static final int FAIL_NETWORK_DISCONNECT = 1;
    public static final int FAIL_WATCH_DISCONNECT = 2;
    public int failCode;
    public boolean finish;
    public boolean success;
    public boolean synced;

    public String toString() {
        return "<Finish : " + this.finish + ", Success : " + this.success + ", Synced : " + this.synced + ", FailCode : " + this.failCode + SearchCriteria.GT;
    }
}
