package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.inter.listeners.IPPSWebEventCallback;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class nt implements IPPSWebEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, IPPSWebEventCallback> f19776a;

    @Override // com.huawei.openalliance.ad.inter.listeners.IPPSWebEventCallback
    public void onWebloadFinish() {
        for (IPPSWebEventCallback iPPSWebEventCallback : this.f19776a.values()) {
            if (iPPSWebEventCallback != null) {
                iPPSWebEventCallback.onWebloadFinish();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.IPPSWebEventCallback
    public void onWebOpen() {
        for (IPPSWebEventCallback iPPSWebEventCallback : this.f19776a.values()) {
            if (iPPSWebEventCallback != null) {
                iPPSWebEventCallback.onWebOpen();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.IPPSWebEventCallback
    public void onWebClose(int i) {
        for (IPPSWebEventCallback iPPSWebEventCallback : this.f19776a.values()) {
            if (iPPSWebEventCallback != null) {
                iPPSWebEventCallback.onWebClose(i);
            }
        }
    }

    public void b(IPPSWebEventCallback iPPSWebEventCallback) {
        if (iPPSWebEventCallback == null) {
            this.f19776a.remove("jsb_listener_key");
        } else {
            this.f19776a.put("jsb_listener_key", iPPSWebEventCallback);
        }
    }

    public void a(IPPSWebEventCallback iPPSWebEventCallback) {
        if (iPPSWebEventCallback == null) {
            this.f19776a.remove("outer_listener_key");
        } else {
            this.f19776a.put("outer_listener_key", iPPSWebEventCallback);
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final nt f19777a = new nt();
    }

    public static nt a() {
        return a.f19777a;
    }

    private nt() {
        this.f19776a = new ConcurrentHashMap();
    }
}
