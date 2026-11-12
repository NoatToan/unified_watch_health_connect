package com.huawei.agconnect.common.crypto;

import android.text.TextUtils;
import com.huawei.agconnect.datastore.annotation.ICrypto;
import com.huawei.secure.android.common.encrypt.aes.AesCbc;
import com.huawei.secure.android.common.util.HexUtil;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
public class AgcCryptoV3 implements ICrypto {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4826b = "PBKDF2WithHmacSHA256";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f4827c = 1;
    private static final String d = "AGC_V3_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SecretKey f4828a;

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto, com.huawei.agconnect.common.datastore.ICrypto
    public String encrypt(String str) {
        return d + AesCbc.encrypt(str, a());
    }

    @Override // com.huawei.agconnect.datastore.annotation.ICrypto, com.huawei.agconnect.common.datastore.ICrypto
    public String decrypt(String str) {
        return (TextUtils.isEmpty(str) || !str.startsWith(d)) ? "" : AesCbc.decrypt(str.substring(7), a());
    }

    public String a() {
        SecretKey secretKeyB = b();
        if (secretKeyB == null) {
            return null;
        }
        return HexUtil.byteArray2HexStr(secretKeyB.getEncoded());
    }

    private SecretKey b() {
        if (this.f4828a == null) {
            this.f4828a = AesComponent.a().a(f4826b, 1);
        }
        return this.f4828a;
    }
}
