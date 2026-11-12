package com.miuipub.internal.hybrid;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import defpackage.u5d;
import miuipub.hybrid.HybridFeature;
import miuipub.hybrid.Response;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class MiuiJsInterface {
    public static final String INTERFACE_NAME = "MiuiJsBridge";
    private HybridManager mManager;

    public MiuiJsInterface(HybridManager hybridManager) {
        this.mManager = hybridManager;
    }

    private HybridFeature lookupFeature(String str) {
        if (TextUtils.equals(str, "com.mipay.hybrid.feature.ImageSelector")) {
            return new u5d();
        }
        return null;
    }

    @JavascriptInterface
    public String invoke(String str, String str2, String str3, String str4) {
        if (lookupFeature(str) == null) {
            return new Response(204).toString();
        }
        String strInvoke = this.mManager.invoke(str, str2, str3, str4);
        if (Log.isLoggable(HybridManager.TAG, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("blocking response is ");
            sb.append(strInvoke);
        }
        return strInvoke;
    }
}
