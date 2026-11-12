package com.huawei.agconnect.common.crypto;

import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;

/* JADX INFO: loaded from: classes3.dex */
public class AgcCryptoV1Preference {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AgcCryptoV1Preference f4820c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPrefUtil f4821a = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.agconnect.datastore.core.CryptoUtil f4822b;

    public void d(AgcCryptoV1 agcCryptoV1) {
        if (agcCryptoV1 != null) {
            this.f4821a.put("com.huawei.appgallery.datastore", MedalConstants.EVENT_KEY, String.class, agcCryptoV1.randomKey, DefaultCrypto.class);
        }
    }

    public void c(AgcCryptoV1 agcCryptoV1) {
        d(agcCryptoV1);
    }

    public void c() {
        this.f4821a.remove("com.huawei.appgallery.datastore", MedalConstants.EVENT_KEY);
    }

    public void b(AgcCryptoV1 agcCryptoV1) {
        a(agcCryptoV1);
    }

    public void a(AgcCryptoV1 agcCryptoV1) {
        if (agcCryptoV1 != null) {
            agcCryptoV1.randomKey = (String) this.f4821a.get("com.huawei.appgallery.datastore", MedalConstants.EVENT_KEY, String.class, agcCryptoV1.randomKey, DefaultCrypto.class);
        }
    }

    public void a() {
        c();
    }

    public static AgcCryptoV1Preference b() {
        AgcCryptoV1Preference agcCryptoV1Preference;
        synchronized (AgcCryptoV1Preference.class) {
            if (f4820c == null) {
                f4820c = new AgcCryptoV1Preference();
            }
            agcCryptoV1Preference = f4820c;
        }
        return agcCryptoV1Preference;
    }

    private AgcCryptoV1Preference() {
    }
}
