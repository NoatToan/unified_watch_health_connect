package com.huawei.agconnect.common.crypto;

import com.huawei.agconnect.datastore.annotation.ICrypto;
import com.huawei.secure.android.common.encrypt.aes.AesCbc;
import com.huawei.secure.android.common.util.HexUtil;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
public class AgcCryptoV2 implements ICrypto {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4823b = "PBKDF2WithHmacSHA1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f4824c = 5000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SecretKey f4825a;

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto, com.huawei.agconnect.common.datastore.ICrypto
    public String encrypt(String str) {
        return AesCbc.encrypt(str, a());
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto, com.huawei.agconnect.common.datastore.ICrypto
    public String decrypt(String str) {
        return AesCbc.decrypt(str, a());
    }

    public String a() {
        SecretKey secretKeyB = b();
        if (secretKeyB == null) {
            return null;
        }
        return HexUtil.byteArray2HexStr(secretKeyB.getEncoded());
    }

    private SecretKey b() {
        if (this.f4825a == null) {
            this.f4825a = AesComponent.a().a(f4823b, 5000);
        }
        return this.f4825a;
    }
}
