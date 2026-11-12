package com.huawei.openalliance.ad;

import android.app.Activity;
import com.huawei.works.share.WeApi;
import com.huawei.works.share.modelmsg.WeCardObject;
import com.huawei.works.share.modelmsg.WeMediaMessage;

/* JADX INFO: loaded from: classes12.dex */
public class uo implements ug {
    @Override // com.huawei.openalliance.ad.ug
    public boolean a() {
        return un.a("com.huawei.works.share.WeApi");
    }

    @Override // com.huawei.openalliance.ad.ug
    public void a(Activity activity, uk ukVar, um umVar) {
        try {
            hw.b("WeLinkShare", "start WeLink share");
            WeCardObject weCardObject = new WeCardObject();
            weCardObject.title = ukVar.b();
            weCardObject.desc = ukVar.c();
            weCardObject.uri = ukVar.a();
            weCardObject.sourceURL = ukVar.d();
            weCardObject.shareType = "image-txt";
            weCardObject.isPCDisplay = umVar.c().booleanValue() ? "1" : "0";
            WeApi.getInstance(activity).share(new WeMediaMessage(weCardObject));
        } catch (Throwable th) {
            hw.c("WeLinkShare", "WeLink share occurs a exception, caused: %s", th.getClass().getSimpleName());
        }
    }
}
