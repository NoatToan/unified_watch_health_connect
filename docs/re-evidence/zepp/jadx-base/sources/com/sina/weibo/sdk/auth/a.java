package com.sina.weibo.sdk.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.identity.auth.device.authorization.AuthorizationResponseParser;
import com.facebook.internal.ServerProtocol;
import com.sina.weibo.sdk.b.c;
import com.sina.weibo.sdk.b.e;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.net.h;
import com.sina.weibo.sdk.web.WebActivity;

/* JADX INFO: loaded from: classes18.dex */
public final class a {
    public WbAuthListener d;

    public final void a(Activity activity) {
        c.a("WBSsoTag", "startClientAuth()");
        try {
            com.sina.weibo.sdk.b.a.C0744a c0744aE = com.sina.weibo.sdk.b.a.e(activity);
            Intent intent = new Intent();
            if (c0744aE == null) {
                intent.setClassName("com.sina.weibo", "com.sina.weibo.SSOActivity");
            } else {
                intent.setClassName(c0744aE.packageName, c0744aE.ae);
            }
            AuthInfo authInfoB = com.sina.weibo.sdk.a.b();
            intent.putExtra("appKey", authInfoB.getAppKey());
            intent.putExtra(AuthorizationResponseParser.REDIRECT_URI_STATE, authInfoB.getRedirectUrl());
            intent.putExtra("scope", authInfoB.getScope());
            intent.putExtra("packagename", authInfoB.getPackageName());
            intent.putExtra("key_hash", authInfoB.getHash());
            intent.putExtra("_weibo_command_type", 3);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            intent.putExtra("_weibo_transaction", sb.toString());
            if (activity == null) {
                this.d.onError(new UiError(-1, "activity is null", ""));
                return;
            }
            if (!com.sina.weibo.sdk.b.a.a(activity, intent)) {
                this.d.onError(new UiError(-2, "your app is illegal", ""));
                return;
            }
            authInfoB.getAppKey();
            intent.putExtra("aid", e.r());
            activity.startActivityForResult(intent, 32973);
            c.a("WBSsoTag", "start SsoActivity ");
        } catch (Exception e) {
            e.printStackTrace();
            c.b("WBSsoTag", e.getMessage());
            this.d.onError(new UiError(-3, "occur exception", e.getMessage()));
        }
    }

    public final void b(Activity activity) {
        h hVar = new h();
        AuthInfo authInfoB = com.sina.weibo.sdk.a.b();
        if (authInfoB == null) {
            return;
        }
        hVar.put("client_id", authInfoB.getAppKey());
        hVar.put("redirect_uri", authInfoB.getRedirectUrl());
        hVar.put("scope", authInfoB.getScope());
        hVar.put("packagename", authInfoB.getPackageName());
        hVar.put("key_hash", authInfoB.getHash());
        hVar.put(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, "code");
        hVar.put("version", "0041005000");
        hVar.put("luicode", "10000360");
        hVar.put("lfid", "OP_" + authInfoB.getAppKey());
        Oauth2AccessToken accessToken = AccessTokenHelper.readAccessToken(activity);
        if (accessToken != null) {
            String accessToken2 = accessToken.getAccessToken();
            if (!TextUtils.isEmpty(accessToken.getAccessToken())) {
                hVar.put("trans_token", accessToken2);
                hVar.put("trans_access_token", accessToken2);
            }
        }
        authInfoB.getAppKey();
        String strR = e.r();
        if (!TextUtils.isEmpty(strR)) {
            hVar.put("aid", strR);
        }
        String str = "https://open.weibo.cn/oauth2/authorize?" + hVar.j();
        if (this.d != null) {
            b bVarD = b.d();
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            String string = sb.toString();
            bVarD.a(string, this.d);
            Intent intent = new Intent(activity, (Class<?>) WebActivity.class);
            com.sina.weibo.sdk.web.b.a aVar = new com.sina.weibo.sdk.web.b.a(authInfoB, str, string);
            Bundle bundle = new Bundle();
            aVar.writeToBundle(bundle);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }
}
