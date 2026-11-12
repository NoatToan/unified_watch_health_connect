package com.huawei.health.h5pro.jsbridge.system.intl;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.LogUtil;
import defpackage.exj;

/* JADX INFO: loaded from: classes7.dex */
public class IntlEntry extends JsBaseModule {
    private exj e;

    @JavascriptInterface
    public String formatDateRange(String str) {
        LogUtil.i(this.TAG, "formatDateRange");
        if (TextUtils.isEmpty(str)) {
            LogUtil.w(this.TAG, "formatDateRange: param is empty");
            return "";
        }
        if (this.e == null) {
            this.e = new exj();
        }
        return this.e.c(this.mContext, str).toString();
    }

    @JavascriptInterface
    public String formatDateTime(String str) {
        LogUtil.i(this.TAG, "formatDateTime");
        if (TextUtils.isEmpty(str)) {
            LogUtil.w(this.TAG, "formatDateTime: param is empty");
            return "";
        }
        if (this.e == null) {
            this.e = new exj();
        }
        return this.e.b(this.mContext, str).toString();
    }
}
