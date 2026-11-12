package com.xiaomi.passport.jsb.method_impl;

import android.app.Activity;
import android.content.Context;
import com.xiaomi.passport.jsb.PassportJsbMethod;
import com.xiaomi.passport.jsb.PassportJsbMethodException;
import com.xiaomi.passport.jsb.PassportJsbMethodResult;
import com.xiaomi.passport.webview.PassportJsbWebView;
import com.xiaomi.wearable.hm.BroadcastsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class PassportJsbMethodClosePage extends PassportJsbMethod {
    @Override // com.xiaomi.passport.jsb.PassportJsbMethod
    public String getName() {
        return "closePage";
    }

    @Override // com.xiaomi.passport.jsb.PassportJsbMethod
    public PassportJsbMethodResult invoke(PassportJsbWebView passportJsbWebView, JSONObject jSONObject) throws PassportJsbMethodException {
        Context context = passportJsbWebView.getContext();
        if (!(context instanceof Activity)) {
            throw new PassportJsbMethodException(105, "WebView is not attached to valid page");
        }
        Activity activity = (Activity) context;
        String strOptString = jSONObject.optString("reason");
        if ("success".equals(strOptString)) {
            activity.setResult(-1);
        } else if (BroadcastsKt.SILENT_PUSHING_CANCEL.equals(strOptString)) {
            activity.setResult(0);
        }
        activity.finish();
        return new PassportJsbMethodResult(true);
    }
}
