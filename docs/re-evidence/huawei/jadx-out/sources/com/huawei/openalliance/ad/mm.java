package com.huawei.openalliance.ad;

import com.iab.omid.library.huawei.adsession.AdSessionConfiguration;

/* JADX INFO: loaded from: classes12.dex */
public class mm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19625a = mi.a("com.iab.omid.library.huawei.adsession.AdSessionConfiguration");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdSessionConfiguration f19626b;

    public AdSessionConfiguration b() {
        return this.f19626b;
    }

    public static boolean a() {
        return f19625a;
    }

    public static mm a(mo moVar, mr mrVar, ms msVar, ms msVar2, boolean z) {
        if (f19625a) {
            return new mm(moVar, mrVar, msVar, msVar2, z);
        }
        return null;
    }

    private mm(mo moVar, mr mrVar, ms msVar, ms msVar2, boolean z) {
        this.f19626b = null;
        if (mo.a() && mr.a() && ms.a()) {
            this.f19626b = AdSessionConfiguration.createAdSessionConfiguration(mo.a(moVar), mr.a(mrVar), ms.a(msVar), ms.a(msVar2), z);
        }
    }
}
