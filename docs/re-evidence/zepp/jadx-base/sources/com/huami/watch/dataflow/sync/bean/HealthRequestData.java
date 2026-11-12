package com.huami.watch.dataflow.sync.bean;

import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class HealthRequestData {
    public String lastSyncTime;
    public long lastSyncTimeMillis;

    public String toString() {
        return "<LastSyncTime : " + this.lastSyncTime + SearchCriteria.GT;
    }
}
