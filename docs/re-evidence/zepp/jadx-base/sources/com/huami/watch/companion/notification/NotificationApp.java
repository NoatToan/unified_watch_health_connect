package com.huami.watch.companion.notification;

import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationApp {
    public boolean on;
    public String packageName;

    public String toString() {
        return SearchCriteria.LT + this.packageName + ", On : " + this.on + SearchCriteria.GT;
    }
}
