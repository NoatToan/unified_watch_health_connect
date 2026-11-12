package com.huawei.hwidauth.wxapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import defpackage.noe;
import defpackage.nom;
import defpackage.nox;

/* JADX INFO: loaded from: classes38.dex */
public class AuthWXEntryActivity extends Activity implements IWXAPIEventHandler {
    private IWXAPI e;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        nox.b("AuthWXEntryActivity", "AuthWXEntryActivity onCreate", true);
        requestWindowFeature(1);
        nom.b((Activity) this);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        if (!(intent instanceof SafeIntent)) {
            SafeIntent safeIntent = new SafeIntent(intent);
            setIntent(safeIntent);
            intent = safeIntent;
        }
        try {
            b(this);
            extras = intent.getExtras();
        } catch (Exception e) {
            nox.e("AuthWXEntryActivity", e.getClass().getSimpleName(), true);
            extras = null;
        }
        if (extras == null || extras.isEmpty()) {
            nox.b("AuthWXEntryActivity", "not called by weixin app, finish myself", true);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        nox.b("AuthWXEntryActivity", "AuthWXEntryActivity onNewIntent", true);
        setIntent(intent);
        this.e.handleIntent(intent, this);
    }

    private void b(Context context) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(context, nom.k(), true);
        this.e = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp(nom.k());
        this.e.handleIntent(getIntent(), this);
        nom.c("");
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        nox.c("AuthWXEntryActivity", "enter onReq", true);
        finish();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        nox.b("AuthWXEntryActivity", "enter onResp", true);
        if (baseResp instanceof SendAuth.Resp) {
            SendAuth.Resp resp = (SendAuth.Resp) baseResp;
            int i = resp.errCode;
            Intent intent = new Intent();
            intent.setAction("com.huawei.hwid.third.ACTION_WEIXIN_LOGIN_RESP");
            if (i == -4 || i == -2) {
                nox.b("AuthWXEntryActivity", "user cancel or denied login with wechat", true);
                intent.putExtra("resultCode", 0);
            } else if (i == 0) {
                String str = resp.code;
                String str2 = resp.state;
                intent.putExtra("code", str);
                intent.putExtra("state", str2);
                intent.putExtra("resultCode", -1);
            }
            noe.a().c(intent);
        }
        finish();
    }
}
