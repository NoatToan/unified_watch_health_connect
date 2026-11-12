package com.huawei.openalliance.ad;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.Tencent;

/* JADX INFO: loaded from: classes12.dex */
public class uj implements ug {
    @Override // com.huawei.openalliance.ad.ug
    public boolean a() {
        return un.a("com.tencent.tauth.Tencent");
    }

    @Override // com.huawei.openalliance.ad.ug
    public void a(Activity activity, uk ukVar, um umVar) {
        hw.b("QQSharer", "start QQ share");
        Tencent.createInstance(umVar.a(), activity).shareToQQ(activity, a(ukVar, umVar), new DefaultUiListener());
    }

    private static Bundle a(uk ukVar, um umVar) {
        Bundle bundle = new Bundle();
        if (ukVar != null && umVar != null) {
            boolean zBooleanValue = umVar.b().booleanValue();
            bundle.putString("title", un.a(ukVar.b(), zBooleanValue ? 30 : 40));
            bundle.putString("summary", un.a(ukVar.c(), umVar.b().booleanValue() ? 200 : 600));
            bundle.putString("targetUrl", ukVar.d());
            String strA = ukVar.a();
            bundle.putString(strA.startsWith("http") ? "imageUrl" : "imageLocalUrl", strA);
            bundle.putInt("req_type", 1);
            bundle.putInt("cflag", zBooleanValue ? 2 : 1);
        }
        return bundle;
    }
}
