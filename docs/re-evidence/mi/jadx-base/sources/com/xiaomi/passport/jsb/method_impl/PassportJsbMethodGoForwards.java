package com.xiaomi.passport.jsb.method_impl;

import com.xiaomi.passport.jsb.PassportJsbMethod;
import com.xiaomi.passport.jsb.PassportJsbMethodException;
import com.xiaomi.passport.jsb.PassportJsbMethodResult;
import com.xiaomi.passport.webview.PassportJsbWebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class PassportJsbMethodGoForwards extends PassportJsbMethod {
    @Override // com.xiaomi.passport.jsb.PassportJsbMethod
    public String getName() {
        return "goForwards";
    }

    @Override // com.xiaomi.passport.jsb.PassportJsbMethod
    public PassportJsbMethodResult invoke(PassportJsbWebView passportJsbWebView, JSONObject jSONObject) throws PassportJsbMethodException {
        int iOptInt = jSONObject.optInt("steps");
        if (!passportJsbWebView.canGoBackOrForward(iOptInt)) {
            return new PassportJsbMethodResult(false);
        }
        passportJsbWebView.goBackOrForward(iOptInt);
        return new PassportJsbMethodResult(true);
    }
}
