package com.huawei.operation.h5pro.jsmodules;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ftw;

/* JADX INFO: loaded from: classes.dex */
public class BloodPressureService extends JsBaseModule {
    @JavascriptInterface
    public void getBloodPressureType(long j) {
        LogUtil.a(this.TAG, "Enter getBloodPressureType");
        String json = GsonUtil.toJson(ftw.d());
        onSuccessCallback(j, json);
        LogUtil.a(this.TAG, "getBloodPressureType complete, result: " + json);
    }
}
