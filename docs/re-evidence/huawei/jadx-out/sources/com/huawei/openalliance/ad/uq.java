package com.huawei.openalliance.ad;

import android.app.Activity;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class uq implements ug {
    @Override // com.huawei.openalliance.ad.ug
    public boolean a() {
        return un.a("com.tencent.mm.opensdk.openapi.WXAPIFactory");
    }

    @Override // com.huawei.openalliance.ad.ug
    public void a(Activity activity, uk ukVar, um umVar) {
        hw.b("WeiXinShare", "start WeXin share");
        String strA = umVar.a();
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(uf.a(activity), strA, true);
        iwxapiCreateWXAPI.registerApp(strA);
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = ukVar.d();
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXWebpageObject);
        wXMediaMessage.title = un.a(ukVar.b(), 512);
        wXMediaMessage.description = un.a(ukVar.c(), 1024);
        wXMediaMessage.thumbData = un.a(activity, ukVar, 32768);
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = UUID.randomUUID().toString();
        req.message = wXMediaMessage;
        req.scene = a(umVar);
        iwxapiCreateWXAPI.sendReq(req);
    }

    private static int a(um umVar) {
        return !umVar.b().booleanValue() ? 1 : 0;
    }
}
