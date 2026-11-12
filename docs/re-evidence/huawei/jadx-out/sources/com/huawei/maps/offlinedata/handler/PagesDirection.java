package com.huawei.maps.offlinedata.handler;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.maps.offlinedata.utils.a;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class PagesDirection extends JsBaseModule {
    private static final String HEALTH_RECONNECT_SCHEME = "huaweischeme://healthapp/devicemanagement";
    private static final String TAG = "PagesDirection";

    @JavascriptInterface
    public void toReconnectPage() {
        g.c(TAG, "call toReconnectPage start");
        try {
            SafeIntent safeIntent = new SafeIntent(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(HEALTH_RECONNECT_SCHEME)));
            safeIntent.setFlags(268435456);
            a.b().startActivity(safeIntent);
        } catch (Exception e) {
            g.b(TAG, "call toReconnectPage Exception:" + e.getMessage());
        }
    }

    @JavascriptInterface
    public void toWlanAccessPage() {
        g.c(TAG, "call toWlanAccessPage start");
        try {
            SafeIntent safeIntent = new SafeIntent(new Intent("android.settings.WIFI_SETTINGS"));
            safeIntent.setFlags(268435456);
            a.b().startActivity(safeIntent);
        } catch (ActivityNotFoundException e) {
            g.b(TAG, "call toWlanAccessPage Exception:" + e.getMessage());
        }
    }
}
