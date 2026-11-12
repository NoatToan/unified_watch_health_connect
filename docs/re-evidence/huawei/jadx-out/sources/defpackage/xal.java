package defpackage;

import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes20.dex */
public class xal extends JsBaseModule {
    @JavascriptInterface
    public void onAuthCodeResponse(String str) {
        if (!CommonUtil.bu()) {
            LogUtil.d(this.TAG, "onAuthCodeResponse serverAuthCode = " + str);
        }
        Intent intent = new Intent("com.huawei.ui.thirdpartservice.SILENT_LOGIN_JS_RESPONSE");
        intent.putExtra("serverAuthCode", str);
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        LogUtil.d(this.TAG, "onDestroy");
    }
}
