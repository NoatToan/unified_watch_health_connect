package com.huawei.maps.offlinedata.service.network;

import android.content.IntentFilter;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f17987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f17988c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile a f17989a = null;

    public static b a() {
        if (f17987b == null) {
            synchronized (b.class) {
                if (f17987b == null) {
                    f17987b = new b();
                }
            }
        }
        return f17987b;
    }

    public boolean b() {
        if (this.f17989a != null) {
            return false;
        }
        g.c("NetWorkService", "netTypeReceiver is null and register");
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        synchronized (f17988c) {
            this.f17989a = new a();
            com.huawei.maps.offlinedata.utils.a.b().registerReceiver(this.f17989a, intentFilter);
        }
        return true;
    }

    public void c() {
        g.c("NetWorkService", "unRegisterNetworkCallback");
        if (this.f17989a == null || com.huawei.maps.offlinedata.utils.a.b() == null) {
            return;
        }
        g.c("NetWorkService", "netTypeReceiver unregister");
        synchronized (f17988c) {
            com.huawei.maps.offlinedata.utils.a.b().unregisterReceiver(this.f17989a);
            this.f17989a = null;
        }
    }
}
