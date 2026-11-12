package com.huawei.agconnect.common.crypto;

import android.text.TextUtils;
import com.huawei.agconnect.credential.internal.BaseContext;
import com.huawei.agconnect.datastore.annotation.ICrypto;
import com.huawei.agconnect.datastore.annotation.SharedPreference;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.secure.android.common.encrypt.aes.AesCbc;

/* JADX INFO: loaded from: classes3.dex */
public class AgcCryptoV1 implements ICrypto {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f4818b = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4819a = null;

    @SharedPreference(fileName = "com.huawei.appgallery.datastore", key = MedalConstants.EVENT_KEY)
    String randomKey;

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto, com.huawei.agconnect.common.datastore.ICrypto
    public String encrypt(String str) {
        return AesCbc.encrypt(str, a());
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto, com.huawei.agconnect.common.datastore.ICrypto
    public String decrypt(String str) {
        return AesCbc.decrypt(str, a());
    }

    private String b() {
        AgcCryptoV1Preference.b().a(this);
        if (TextUtils.isEmpty(this.randomKey) || this.randomKey.length() != 16) {
            this.randomKey = CryptoUtil.a(16);
            AgcCryptoV1Preference.b().d(this);
        }
        return this.randomKey;
    }

    private String a() {
        if (TextUtils.isEmpty(this.f4819a)) {
            this.f4819a = CryptoUtil.a(CryptoUtil.a(BaseContext.c(), 6), Constants.a()) + CryptoUtil.a(CryptoUtil.a("AE6D8285", -4), BaseContext.f4974b) + b();
        }
        return this.f4819a;
    }
}
