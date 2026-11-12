package com.huawei.agconnect.common.aaid;

import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* JADX INFO: loaded from: classes22.dex */
public class AAIDImplPreference {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AAIDImplPreference f4800c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPrefUtil f4801a = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CryptoUtil f4802b;

    public void d(AAIDImpl aAIDImpl) {
        if (aAIDImpl != null) {
            this.f4801a.put("com.huawei.agconnect", AaidUtils.f4803a, String.class, aAIDImpl.aaidString, AgcCrypto.class);
        }
    }

    public void c(AAIDImpl aAIDImpl) {
        d(aAIDImpl);
    }

    public void c() {
        this.f4801a.remove("com.huawei.agconnect", AaidUtils.f4803a);
    }

    public void b(AAIDImpl aAIDImpl) {
        a(aAIDImpl);
    }

    public void a(AAIDImpl aAIDImpl) {
        if (aAIDImpl != null) {
            aAIDImpl.aaidString = (String) this.f4801a.get("com.huawei.agconnect", AaidUtils.f4803a, String.class, aAIDImpl.aaidString, AgcCrypto.class);
        }
    }

    public void a() {
        c();
    }

    public static AAIDImplPreference b() {
        AAIDImplPreference aAIDImplPreference;
        synchronized (AAIDImplPreference.class) {
            if (f4800c == null) {
                f4800c = new AAIDImplPreference();
            }
            aAIDImplPreference = f4800c;
        }
        return aAIDImplPreference;
    }

    private AAIDImplPreference() {
    }
}
