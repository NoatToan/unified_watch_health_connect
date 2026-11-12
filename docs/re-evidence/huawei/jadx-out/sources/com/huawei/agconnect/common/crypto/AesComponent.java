package com.huawei.agconnect.common.crypto;

import android.text.TextUtils;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.credential.internal.BaseContext;
import com.huawei.agconnect.datastore.annotation.SharedPreference;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
public class AesComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4812a = "AesComponent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f4813b = 32;

    @SharedPreference(fileName = "com.huawei.appgallery.datastore", key = "fish")
    String fish;

    @SharedPreference(fileName = "com.huawei.agconnect.internal", key = "jerry")
    String jerry;

    public SecretKey a(String str, int i) {
        if (TextUtils.isEmpty(this.jerry) || TextUtils.isEmpty(this.fish)) {
            AesComponentPreference.b().a(this);
            AesComponentPreference.b().b(this);
            if (a(this.jerry) || a(this.fish)) {
                this.jerry = CryptoUtil.a(32);
                this.fish = CryptoUtil.a(32);
                AesComponentPreference.b().f(this);
                AesComponentPreference.b().e(this);
            }
        }
        try {
            return CryptoUtil.a(a(BaseContext.d(), this.jerry, "767d9b01105c2acd25fb7955a5394f78"), this.fish, str, i);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Logger.e(f4812a, "Exception when reading the 'T&J&C&F' for 'KeyManager'.");
            return null;
        }
    }

    private boolean a(String str) {
        return TextUtils.isEmpty(str) || str.length() != 32;
    }

    static class SingletonHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static AesComponent f4814a = new AesComponent();

        private SingletonHolder() {
        }
    }

    private static String a(String str, String str2, String str3) {
        return CryptoUtil.a(CryptoUtil.a(CryptoUtil.a(CryptoUtil.a(str, -4), str2), 6), str3);
    }

    public static AesComponent a() {
        return SingletonHolder.f4814a;
    }
}
