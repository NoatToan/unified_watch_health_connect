package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.metadata.Om;
import com.iab.omid.library.huawei.adsession.VerificationScriptResource;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class mt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19645a = mi.a("com.iab.omid.library.huawei.adsession.VerificationScriptResource");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<VerificationScriptResource> f19646b = new ArrayList();

    public List<VerificationScriptResource> b() {
        return this.f19646b;
    }

    public void a(Om om) {
        if (om == null || !f19645a) {
            hw.b("VerficationScriptResourceWrapper", "om is not avalible");
            return;
        }
        String strA = om.a();
        URL urlA = a(om.b());
        String strC = om.c();
        if (strA == null || urlA == null || strC == null) {
            hw.b("VerficationScriptResourceWrapper", "Parameters is null");
            return;
        }
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(strA, urlA, strC);
        if (verificationScriptResourceCreateVerificationScriptResourceWithParameters == null) {
            hw.b("VerficationScriptResourceWrapper", "Create verificationScriptResource failed");
        } else {
            this.f19646b.add(verificationScriptResourceCreateVerificationScriptResourceWithParameters);
        }
    }

    public static boolean a() {
        return f19645a;
    }

    private URL a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            hw.c("VerficationScriptResourceWrapper", "parseURL: " + com.huawei.openalliance.ad.utils.ds.a(e.getMessage()));
            return null;
        }
    }
}
