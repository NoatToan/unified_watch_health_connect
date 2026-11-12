package com.xiaomi.hm.health.wxapi;

import android.content.Intent;
import android.os.Bundle;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.passport.WXEntryProxyActivity;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.util.ThirdPartUtil;
import com.huami.widget.toast.CustomToast;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: loaded from: classes22.dex */
public class WXEntryActivity extends WXEntryProxyActivity implements IWXAPIEventHandler {
    public static final String b = "WXEntry";
    private IWXAPI a;

    @Override // com.huami.passport.WXEntryProxyActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, ThirdPartUtil.getWeixinId(), false);
        this.a = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.handleIntent(getIntent(), this);
    }

    @Override // com.huami.passport.WXEntryProxyActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.a.handleIntent(intent, this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq req) {
        req.getType();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp resp) {
        HMLog.i("WXEntry", resp.errStr + AESEncryptionHelper.SEPARATOR + resp.errCode, new Object[0]);
        int i = resp.errCode;
        if (i != 0 && i != -2) {
            CustomToast.makeText(this, resp.errStr + AESEncryptionHelper.SEPARATOR + resp.errCode, 1);
            HMLog.i("WXEntry", resp.errStr + AESEncryptionHelper.SEPARATOR + resp.errCode, new Object[0]);
        }
        if (resp.getType() == 19) {
            HMLog.i("WXEntry", "LAUNCH_WX_MINIPROGRAM extraData:" + ((WXLaunchMiniProgram.Resp) resp).extMsg, new Object[0]);
        }
        finish();
    }
}
