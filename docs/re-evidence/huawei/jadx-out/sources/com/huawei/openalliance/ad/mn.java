package com.huawei.openalliance.ad;

import android.content.Context;
import com.iab.omid.library.huawei.adsession.AdSessionContext;
import com.iab.omid.library.huawei.adsession.Partner;
import com.iab.omid.library.huawei.adsession.VerificationScriptResource;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19627a = mi.a("com.iab.omid.library.huawei.adsession.AdSessionContext");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f19628b;

    public AdSessionContext a(mt mtVar, String str) throws Throwable {
        String strA;
        if (!mi.a("com.iab.omid.library.huawei.adsession.Partner") || !mi.a("com.iab.omid.library.huawei.adsession.VerificationScriptResource") || !mi.a("com.iab.omid.library.huawei.adsession.AdSessionContext")) {
            hw.c("AdSessionContextWrapper", "createNativeAdSessionContext, not available ");
            return null;
        }
        List<VerificationScriptResource> listB = mtVar.b();
        if (listB.isEmpty()) {
            return null;
        }
        try {
            strA = com.huawei.openalliance.ad.utils.dg.a("openmeasure/omsdk-v1.js", this.f19628b);
        } catch (IOException e) {
            hw.c("AdSessionContextWrapper", "getNativeAdSession: " + com.huawei.openalliance.ad.utils.ds.a(e.getMessage()));
            strA = null;
        }
        if (strA == null) {
            return null;
        }
        return AdSessionContext.createNativeAdSessionContext(Partner.createPartner("Huawei", "3.4.84.300"), strA, listB, str, (String) null);
    }

    public static boolean a() {
        return f19627a;
    }

    public mn(Context context) {
        this.f19628b = context;
    }
}
