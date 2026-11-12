package com.huawei.agconnect.config.impl;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.agconnect.config.IDecrypt;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
public class DecryptExclamationMark implements IDecrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConfigReader f4936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SecretKey f4937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4938c = false;

    @Override // com.huawei.agconnect.config.IDecrypt
    public String decrypt(String str, String str2) {
        String str3;
        if (!this.f4938c) {
            a();
        }
        if (this.f4937b != null) {
            if (b(str)) {
                try {
                    return new String(Keys.a(this.f4937b, Hex.decodeHexString(a(str))), "UTF-8");
                } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused) {
                    str3 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
                }
            }
            return str2;
        }
        str3 = "mKey is null, return default value";
        Log.e("AGC_Mark", str3);
        return str2;
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str);
    }

    private void a() {
        try {
            this.f4937b = Keys.a(new AesParam(this.f4936a.getString("/code/code1", null), this.f4936a.getString("/code/code2", null), this.f4936a.getString("/code/code3", null), this.f4936a.getString("/code/code4", null), "PBKDF2WithHmacSHA1", 10000));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("AGC_Mark", "Exception when reading the 'K&I' for 'Config'.");
            this.f4937b = null;
        }
        this.f4938c = true;
    }

    private String a(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("AGC_Mark", "getRawString exception");
            return "";
        }
    }

    public DecryptExclamationMark(ConfigReader configReader) {
        this.f4936a = configReader;
    }
}
