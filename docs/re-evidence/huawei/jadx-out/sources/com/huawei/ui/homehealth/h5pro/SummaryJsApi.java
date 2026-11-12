package com.huawei.ui.homehealth.h5pro;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.LogUtil;
import defpackage.qdh;

/* JADX INFO: loaded from: classes43.dex */
public class SummaryJsApi extends JsBaseModule {
    private static final String TAG = "SummaryJsApi";

    @JavascriptInterface
    public void getHealthDomains(long j) {
        LogUtil.i(TAG, "getHealthDomains");
        onSuccessCallback(j, qdh.e());
    }
}
