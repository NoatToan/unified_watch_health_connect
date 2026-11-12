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
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: loaded from: classes5.dex */
public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {
    public final String a() {
        return WXUtils.getString(this, "appid");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String wxAppId;
        MibiLog.d("WXPayEntryActivity", "onCreate");
        super.onCreate(bundle);
        if (WxResultHelper.getInterceptor() == null) {
            MibiLog.d("WXPayEntryActivity", "interceptor is null");
            wxAppId = a();
        } else {
            MibiLog.d("WXPayEntryActivity", "interceptor not null");
            wxAppId = WxResultHelper.getWxAppId();
        }
        if (!TextUtils.isEmpty(wxAppId)) {
            WXAPIFactory.createWXAPI(getApplicationContext(), wxAppId, false).handleIntent(getIntent(), this);
        } else {
            MibiLog.d("WXPayEntryActivity", "appId is null");
            finish();
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        MibiLog.d("WXPayEntryActivity", "onReq");
        UiUtil.moveToFront(this, UiUtil.getTaskId());
        finish();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        MibiLog.d("WXPayEntryActivity", "onResp resp.errCode : " + baseResp.errCode + " ; type : " + baseResp.getType());
        if (WxResultHelper.intercept(baseResp)) {
            MibiLog.d("WXPayEntryActivity", "wxpay result intercepted");
            finish();
            return;
        }
        if (baseResp.getType() == 5) {
            Intent intent = new Intent(Constants.ACTION_RECEIVE_WX_RESULT);
            intent.putExtra(CommonConstants.KEY_ERR_CODE, baseResp.errCode);
            intent.putExtra("errDesc", baseResp.errStr);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
        UiUtil.moveToFront(this, UiUtil.getTaskId());
        finish();
    }
}
