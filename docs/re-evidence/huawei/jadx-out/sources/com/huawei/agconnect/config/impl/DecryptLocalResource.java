package com.huawei.agconnect.config.impl;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.IDecrypt;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
public class DecryptLocalResource implements IDecrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SecretKey f4939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AesParam f4940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4941c = false;

    @Override // com.huawei.agconnect.config.IDecrypt
    public String decrypt(String str, String str2) {
        StringBuilder sb;
        if (!this.f4941c) {
            a();
        }
        if (this.f4939a == null || TextUtils.isEmpty(str)) {
            sb = new StringBuilder("decrypt exception: secretKey = ");
            sb.append(this.f4939a);
            sb.append("raw = ");
        } else {
            try {
                return new String(Keys.a(this.f4939a, Hex.decodeHexString(str)), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e) {
                sb = new StringBuilder("decrypt exception:");
                str = e.getMessage();
            }
        }
        sb.append(str);
        Log.e("AGC_LocalResource", sb.toString());
        return str2;
    }

    private void a() {
        try {
            this.f4939a = Keys.a(this.f4940b);
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.e("AGC_LocalResource", "Exception when reading the 'K&I' for 'Config'. error is " + e.getMessage());
            this.f4939a = null;
        }
        this.f4941c = true;
    }

    public DecryptLocalResource(AesParam aesParam) {
        this.f4940b = aesParam;
    }
}
