package com.huawei.agconnect.credential.internal;

import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* JADX INFO: loaded from: classes22.dex */
public class CredentialInfoPreference {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static CredentialInfoPreference f4979c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPrefUtil f4980a = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CryptoUtil f4981b;

    public void a() {
    }

    public void a(CredentialInfo credentialInfo) {
    }

    public void b(CredentialInfo credentialInfo) {
    }

    public void f(CredentialInfo credentialInfo, String str) {
        if (credentialInfo == null || str == null) {
            return;
        }
        this.f4980a.put("com.huawei.agconnect", "validTime_" + str, Long.class, Long.valueOf(credentialInfo.validTime), AgcCrypto.class);
    }

    public void e(CredentialInfo credentialInfo, String str) {
        if (credentialInfo == null || str == null) {
            return;
        }
        this.f4980a.put("com.huawei.agconnect", "tokenString_" + str, String.class, credentialInfo.tokenString, AgcCrypto.class);
    }

    public void d(CredentialInfo credentialInfo, String str) {
        if (credentialInfo == null || str == null) {
            return;
        }
        this.f4980a.put("com.huawei.agconnect", "expires_" + str, Long.class, Long.valueOf(credentialInfo.expires), AgcCrypto.class);
    }

    public void c(String str) {
        this.f4980a.remove("com.huawei.agconnect", "validTime_" + str);
    }

    public void c(CredentialInfo credentialInfo, String str) {
        if (credentialInfo == null || str == null) {
            return;
        }
        credentialInfo.validTime = ((Long) this.f4980a.get("com.huawei.agconnect", "validTime_" + str, Long.class, null, AgcCrypto.class)).longValue();
    }

    public void b(String str) {
        this.f4980a.remove("com.huawei.agconnect", "tokenString_" + str);
    }

    public void b(CredentialInfo credentialInfo, String str) {
        if (credentialInfo == null || str == null) {
            return;
        }
        credentialInfo.tokenString = (String) this.f4980a.get("com.huawei.agconnect", "tokenString_" + str, String.class, null, AgcCrypto.class);
    }

    public void a(String str) {
        this.f4980a.remove("com.huawei.agconnect", "expires_" + str);
    }

    public void a(CredentialInfo credentialInfo, String str) {
        if (credentialInfo == null || str == null) {
            return;
        }
        credentialInfo.expires = ((Long) this.f4980a.get("com.huawei.agconnect", "expires_" + str, Long.class, null, AgcCrypto.class)).longValue();
    }

    public static CredentialInfoPreference b() {
        CredentialInfoPreference credentialInfoPreference;
        synchronized (CredentialInfoPreference.class) {
            if (f4979c == null) {
                f4979c = new CredentialInfoPreference();
            }
            credentialInfoPreference = f4979c;
        }
        return credentialInfoPreference;
    }

    private CredentialInfoPreference() {
    }
}
