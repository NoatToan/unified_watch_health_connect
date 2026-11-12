package com.huawei.agconnect.common.crypto;

import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* JADX INFO: loaded from: classes3.dex */
public class AesComponentPreference {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AesComponentPreference f4815c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPrefUtil f4816a = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.agconnect.datastore.core.CryptoUtil f4817b;

    public void f(AesComponent aesComponent) {
        if (aesComponent != null) {
            this.f4816a.put("com.huawei.agconnect.internal", "jerry", String.class, aesComponent.jerry, DefaultCrypto.class);
        }
    }

    public void e(AesComponent aesComponent) {
        if (aesComponent != null) {
            this.f4816a.put("com.huawei.appgallery.datastore", "fish", String.class, aesComponent.fish, DefaultCrypto.class);
        }
    }

    public void d(AesComponent aesComponent) {
        f(aesComponent);
        e(aesComponent);
    }

    public void d() {
        this.f4816a.remove("com.huawei.agconnect.internal", "jerry");
    }

    public void c(AesComponent aesComponent) {
        b(aesComponent);
        a(aesComponent);
    }

    public void c() {
        this.f4816a.remove("com.huawei.appgallery.datastore", "fish");
    }

    public void b(AesComponent aesComponent) {
        if (aesComponent != null) {
            aesComponent.jerry = (String) this.f4816a.get("com.huawei.agconnect.internal", "jerry", String.class, aesComponent.jerry, DefaultCrypto.class);
        }
    }

    public void a(AesComponent aesComponent) {
        if (aesComponent != null) {
            aesComponent.fish = (String) this.f4816a.get("com.huawei.appgallery.datastore", "fish", String.class, aesComponent.fish, DefaultCrypto.class);
        }
    }

    public void a() {
        d();
        c();
    }

    public static AesComponentPreference b() {
        AesComponentPreference aesComponentPreference;
        synchronized (AesComponentPreference.class) {
            if (f4815c == null) {
                f4815c = new AesComponentPreference();
            }
            aesComponentPreference = f4815c;
        }
        return aesComponentPreference;
    }

    private AesComponentPreference() {
    }
}
