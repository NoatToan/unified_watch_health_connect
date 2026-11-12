package com.huawei.ui.main.stories.me.js;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.me.views.privacy.PrivacyStatementActivity;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes19.dex */
public class JsInteraction {
    private Context d;

    public JsInteraction(Context context) {
        this.d = context;
    }

    @JavascriptInterface
    public String isSupportPrivacyCenter() {
        if (CommonUtil.cd() && CommonUtil.y(this.d)) {
            return "true";
        }
        return "false";
    }

    @JavascriptInterface
    public boolean needDisplay() {
        return CommonUtil.cd() && CommonUtil.y(this.d);
    }

    @JavascriptInterface
    public void enterPrivacyCenter() {
        Context context = this.d;
        if (context == null) {
            LogUtil.j("JsInteraction", "enterPrivacyCenter mContext is null");
            return;
        }
        if ((context instanceof PrivacyStatementActivity) && CommonUtil.y(context)) {
            LogUtil.a("JsInteraction", "enterPrivacyCenter PrivacyStatementActivity finish");
            ((PrivacyStatementActivity) this.d).finish();
        } else {
            Intent intent = new Intent();
            intent.setClassName("com.huawei.systemmanager", "com.huawei.dataprivacycenter.MainActivity");
            intent.setFlags(67108864);
            this.d.startActivity(intent);
        }
    }

    @JavascriptInterface
    public void agreementCheckMore() {
        enterPrivacyCenter();
    }
}
