package com.huami.pay.lib.wechat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.huami.android.tools.pay.wechat.WeChatPay;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\u000b\u001a\u00020\nH&J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/pay/lib/wechat/BaseWeChatPayActivity;", "Landroid/app/Activity;", "Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "", "provideAppId", "Lcom/tencent/mm/opensdk/modelbase/BaseReq;", "req", "onReq", "Lcom/tencent/mm/opensdk/modelbase/BaseResp;", "resp", "onResp", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "a", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "api", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseWeChatPayActivity extends Activity implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private IWXAPI api;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, provideAppId(), false);
        this.api = iwxapiCreateWXAPI;
        if (iwxapiCreateWXAPI == null) {
            iwxapiCreateWXAPI = null;
        }
        iwxapiCreateWXAPI.handleIntent(getIntent(), this);
    }

    @Override // android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        IWXAPI iwxapi = this.api;
        if (iwxapi == null) {
            iwxapi = null;
        }
        iwxapi.handleIntent(intent, this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(@Nullable BaseReq req) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(@NotNull BaseResp resp) {
        if (resp.getType() == 5) {
            WeChatPay.handleWechatRes(resp);
            finish();
        }
    }

    @NotNull
    public abstract String provideAppId();
}
