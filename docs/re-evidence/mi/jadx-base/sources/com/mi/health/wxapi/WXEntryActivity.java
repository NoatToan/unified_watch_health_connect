package com.mi.health.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.google.android.gms.common.Scopes;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.aje;
import defpackage.o3r;
import defpackage.z0j;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class WXEntryActivity extends Activity implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IWXAPI f10068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f10069b;

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<WXEntryActivity> f10070a;

        public a(WXEntryActivity wXEntryActivity) {
            this.f10070a = new WeakReference<>(wXEntryActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(message.getData().getString("result"));
                jSONObject.getString(Scopes.OPEN_ID);
                jSONObject.getString(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
                jSONObject.getString("refresh_token");
                jSONObject.getString("scope");
            } catch (JSONException e) {
                e.getMessage();
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10068a = o3r.i().l();
        this.f10069b = new a(this);
        try {
            this.f10068a.handleIntent(getIntent(), this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.f10068a.handleIntent(intent, this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        baseReq.getType();
        finish();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        int i;
        int i2 = baseResp.errCode;
        if (i2 == -5) {
            i = z0j.e;
        } else if (i2 == -4) {
            i = z0j.f40754b;
        } else if (i2 != -2) {
            i = i2 != 0 ? z0j.d : z0j.c;
        } else {
            i = z0j.f40753a;
        }
        Logger.i("MicroMsg.WXEntryActivity", getString(i));
        if (baseResp.getType() == 18) {
            SubscribeMessage.Resp resp = (SubscribeMessage.Resp) baseResp;
            Toast.makeText(this, String.format("openid=%s\ntemplate_id=%s\nscene=%d\naction=%s\nreserved=%s", resp.openId, resp.templateID, Integer.valueOf(resp.scene), resp.action, resp.reserved), 0).show();
        }
        if (baseResp.getType() == 19) {
            WXLaunchMiniProgram.Resp resp2 = (WXLaunchMiniProgram.Resp) baseResp;
            Logger.i("MicroMsg.WXEntryActivity", "result is " + String.format("openid=%s\nextMsg=%s\nerrStr=%s", resp2.openId, resp2.extMsg, resp2.errStr));
        }
        if (baseResp.getType() == 26) {
            WXOpenBusinessView.Resp resp3 = (WXOpenBusinessView.Resp) baseResp;
            Toast.makeText(this, String.format("openid=%s\nextMsg=%s\nerrStr=%s\nbusinessType=%s", resp3.openId, resp3.extMsg, resp3.errStr, resp3.businessType), 0).show();
        }
        if (baseResp.getType() == 25) {
            WXOpenBusinessWebview.Resp resp4 = (WXOpenBusinessWebview.Resp) baseResp;
            Toast.makeText(this, String.format("businessType=%d\nresultInfo=%s\nret=%d", Integer.valueOf(resp4.businessType), resp4.resultInfo, Integer.valueOf(resp4.errCode)), 0).show();
        }
        if (baseResp.getType() == 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPayFinish, errCode = ");
            sb.append(baseResp.errCode);
            Intent intent = new Intent("com.xiaomi.wearable.action.pay_result_wechat");
            intent.putExtra("pay_result_code", baseResp.errCode);
            intent.putExtra("pay_result_msg", baseResp.errStr);
            aje.b(this).d(intent);
        }
        finish();
    }
}
