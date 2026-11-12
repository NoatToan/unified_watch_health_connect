package com.huami.account.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.account.ui.WXEntryActivity;
import com.huami.passport.WXEntryProxyActivity;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class WXEntryActivity extends WXEntryProxyActivity implements IWXAPIEventHandler {
    public static final String b = "WXEntry";
    private IWXAPI a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(BaseResp baseResp) {
        return baseResp.errStr + AESEncryptionHelper.SEPARATOR + baseResp.errCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(WXLaunchMiniProgram.Resp resp) {
        return "LAUNCH_WX_MINIPROGRAM extraData:" + resp.extMsg;
    }

    @Override // com.huami.passport.WXEntryProxyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, provideAppId(), false);
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
    public void onReq(BaseReq baseReq) {
        baseReq.getType();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(final BaseResp baseResp) {
        int i = baseResp.errCode;
        if (i != 0 && i != -2) {
            Toast.makeText(this, baseResp.errStr + AESEncryptionHelper.SEPARATOR + baseResp.errCode, 1).show();
            HMLog.info("WXEntry", new Function0() { // from class: cc8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WXEntryActivity.q(baseResp);
                }
            });
        }
        baseResp.getType();
        if (baseResp.getType() == 19) {
            final WXLaunchMiniProgram.Resp resp = (WXLaunchMiniProgram.Resp) baseResp;
            HMLog.info("WXEntry", new Function0() { // from class: dc8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WXEntryActivity.r(resp);
                }
            });
        }
        finish();
    }

    public String provideAppId() {
        try {
            TpaConfig tpaConfig = Utils.getTpaConfigs(this).get("wechat");
            return tpaConfig != null ? tpaConfig.getAppId() : "";
        } catch (IOException unused) {
            return "";
        }
    }
}
