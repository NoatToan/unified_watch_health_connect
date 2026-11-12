package com.huawei.health.h5pro.jsbridge.system.logger;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.LogPrintOperate;
import com.huawei.health.h5pro.utils.LogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class LoggerEntry extends JsBaseModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6800b;
    private String e;

    private String c(String str) {
        return String.format(Locale.ROOT, "%1$s[%2$s]", this.e, str);
    }

    @JavascriptInterface
    public void debug(String str, String str2) {
        LogUtil.d(c(str), this.f6800b, str2);
    }

    @JavascriptInterface
    public void error(String str, String str2) {
        LogUtil.e(c(str), this.f6800b, (Throwable) null, str2);
    }

    @JavascriptInterface
    public void info(String str, String str2) {
        LogUtil.i(c(str), this.f6800b, str2);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        this.e = LogUtil.getTag(this.mH5ProInstance, "AppLog");
        this.f6800b = LogPrintOperate.isDecodePrint(this.mH5ProInstance);
    }
}
