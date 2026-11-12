package com.huawei.maps.offlinedata.handler;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.maps.offlinedata.service.a;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class H5StateHandler extends JsBaseModule {
    private static final String TAG = "H5StateHandler";

    @JavascriptInterface
    public void h5AvailableToStateInAvailable() {
        g.c(TAG, "h5AvailableToStateInAvailable");
        a.a().a(false);
        a.a().h();
    }

    @JavascriptInterface
    public void h5InAvailableToStateAvailable() {
        g.c(TAG, "h5InAvailableToStateAvailable");
        a.a().a(true);
        a.a().e();
    }
}
