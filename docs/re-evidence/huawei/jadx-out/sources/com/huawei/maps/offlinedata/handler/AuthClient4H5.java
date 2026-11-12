package com.huawei.maps.offlinedata.handler;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.maps.offlinedata.service.cloud.a;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class AuthClient4H5 extends JsBaseModule {
    private static final String TAG = "AuthClient4H5";

    static /* synthetic */ void lambda$authenticate$0(long j) {
        try {
            if (a.c().a()) {
                com.huawei.maps.offlinedata.jsbridge.a.a().a(a.c().d(), j);
                return;
            }
        } catch (Exception e) {
            g.b(TAG, "AuthClient4H5 exception:" + e.getMessage());
        }
        com.huawei.maps.offlinedata.jsbridge.a.a().a(-1, "auth failed", j);
    }

    @JavascriptInterface
    public void authenticate(final long j) {
        g.c(TAG, "H5 call authenticate start");
        new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.handler.AuthClient4H5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AuthClient4H5.lambda$authenticate$0(j);
            }
        }).start();
    }
}
