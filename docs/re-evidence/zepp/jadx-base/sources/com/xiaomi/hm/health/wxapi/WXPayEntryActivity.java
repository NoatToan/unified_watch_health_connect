package com.xiaomi.hm.health.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.huami.android.tools.pay.wechat.WeChatPay;
import com.huami.tools.log.HMLog;
import com.huami.web.container.event.EventWeChatResp;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.xiaomi.hm.health.Constant;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {
    private IWXAPI a;

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, Constant.WEIXIN_PAY_APP_ID, false);
        this.a = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.handleIntent(getIntent(), this);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.a.handleIntent(intent, this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq req) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp resp) {
        if (resp.getType() == 5) {
            WeChatPay.handleWechatRes(resp);
            EventBus.getDefault().post(new EventWeChatResp(resp.errCode));
            HMLog.i("WXPayEntryActivity", "resp:" + resp.errCode, new Object[0]);
            finish();
        }
    }
}
