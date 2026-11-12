package com.huawei.ui.thirdpartservice.syncdata.wechatdevice;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.thirdpartservice.R;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import defpackage.qrs;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class SdkManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IWXAPI f29180b = WXAPIFactory.createWXAPI(BaseApplication.b(), "wx36bda3d35fbcfd06");

    public interface launchWechatCallBack {
        void onLaunchFailed();
    }

    public static boolean e() {
        return Utils.b(BaseApplication.b(), "com.tencent.mm");
    }

    public void c(Context context, String str, launchWechatCallBack launchwechatcallback) {
        LogUtil.a("WechatSdkManager", "bind thread:", Thread.currentThread().getName());
        if (!e()) {
            launchwechatcallback.onLaunchFailed();
            return;
        }
        this.f29180b.registerApp("wx36bda3d35fbcfd06");
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = "gh_471f5f7b25a9";
        req.path = "pages/discover-new/discover-new?from=wxsport&&ticket=" + str;
        req.miniprogramType = 0;
        c(context, launchwechatcallback, req);
    }

    public void c(Context context, List<String> list, launchWechatCallBack launchwechatcallback) {
        LogUtil.a("WechatSdkManager", "bind thread:", Thread.currentThread().getName());
        if (!e()) {
            launchwechatcallback.onLaunchFailed();
            return;
        }
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = "gh_471f5f7b25a9";
        req.path = "pages/delete-devices/delete-devices?from=wxsport&&sdkIdList=" + new Gson().toJson(list);
        req.miniprogramType = 0;
        c(context, launchwechatcallback, req);
    }

    private void c() {
        LocalBroadcastManager.getInstance().sendBroadcast(new Intent("com.huawei.ui.thirdpartservice.WX_MINIPTOGRAM_LAUNCH"));
    }

    private void c(Context context, final launchWechatCallBack launchwechatcallback, final WXLaunchMiniProgram.Req req) {
        qrs.e("com.tencent.mm", context, context.getString(R.string.IDS_wechat_pay), new View.OnClickListener() { // from class: xcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52706a.e(req, view);
            }
        }, new View.OnClickListener() { // from class: xcs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                launchwechatcallback.onLaunchFailed();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(WXLaunchMiniProgram.Req req, View view) {
        this.f29180b.sendReq(req);
        c();
    }
}
