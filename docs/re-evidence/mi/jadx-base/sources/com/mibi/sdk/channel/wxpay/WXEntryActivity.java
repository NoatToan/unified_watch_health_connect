package com.mibi.sdk.channel.wxpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.WXUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.LocalBroadcastManager;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.common.utils.UiUtil;
import com.mibi.sdk.component.Constants;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: loaded from: classes5.dex */
public class WXEntryActivity extends Activity implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10117b = "WXEntryActivity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IWXAPI f10118a;

    public final void a() {
        boolean zHandleIntent = this.f10118a.handleIntent(getIntent(), this);
        MibiLog.d(f10117b, "wx handle intent success : " + zHandleIntent);
        if (zHandleIntent) {
            return;
        }
        finish();
    }

    public final String b() {
        return WXUtils.getString(this, "appid");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String wxAppId;
        String str = f10117b;
        MibiLog.d(str, "onCreate");
        super.onCreate(bundle);
        if (WxResultHelper.getInterceptor() == null) {
            MibiLog.d(str, "interceptor is null");
            wxAppId = b();
        } else {
            MibiLog.d(str, "interceptor not null");
            wxAppId = WxResultHelper.getWxAppId();
        }
        if (TextUtils.isEmpty(wxAppId)) {
            MibiLog.d(str, "appId is null");
            finish();
        } else {
            this.f10118a = WXAPIFactory.createWXAPI(getApplicationContext(), wxAppId);
            a();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        MibiLog.d(f10117b, "onNewIntent");
        setIntent(intent);
        a();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        MibiLog.d(f10117b, "onReq");
        UiUtil.moveToFront(this, UiUtil.getTaskId());
        finish();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        String str = f10117b;
        MibiLog.d(str, "onResp resp.errCode : " + baseResp.errCode + " ; type : " + baseResp.getType());
        if (WxResultHelper.intercept(baseResp)) {
            MibiLog.d(str, "wxpay result intercepted");
            finish();
            return;
        }
        if (baseResp.getType() == 19) {
            Intent intent = new Intent(Constants.ACTION_RECEIVE_WX_RESULT);
            intent.putExtra(CommonConstants.KEY_ERR_CODE, baseResp.errCode);
            intent.putExtra("errDesc", baseResp.errStr);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
        UiUtil.moveToFront(this, UiUtil.getTaskId());
        finish();
    }
}
