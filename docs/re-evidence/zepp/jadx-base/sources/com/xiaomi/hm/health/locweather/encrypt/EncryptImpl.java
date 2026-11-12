package com.xiaomi.hm.health.locweather.encrypt;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.locweather.encrypt.EncryptImpl;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class EncryptImpl implements EncryptApi {
    private static final String a = "EncryptImpl";
    private static final String b = "RSA";
    private static final String c = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC5zk0Tvhb09okB9wef/bXTAkcQz9fYwRAlErqvtkgY+GcON5oZpiUt4hT5cqsWkMb0n+udA3vogL9JjDlnJrKPmNzPkJ1Sp5cKrY0QM2sAflXK3AAKkPzFP8dZRnW+2W/c74UQjiGBAWE5u10KE7TYOssTQXTUxE4RGjR4J+kMvwIDAQAB";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(Exception exc) {
        return "decrypt error: " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(Exception exc) {
        return "encrypt error: " + exc;
    }

    @Override // com.xiaomi.hm.health.locweather.encrypt.EncryptApi
    @Nullable
    public String decrypt(@Nullable String str, @NonNull String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.getBytes(StandardCharsets.UTF_8), 2);
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 2)));
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(2, rSAPrivateKey);
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception e) {
            HMLog.error(a, new Function0() { // from class: cl1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EncryptImpl.c(e);
                }
            });
            return null;
        }
    }

    @Override // com.xiaomi.hm.health.locweather.encrypt.EncryptApi
    @Nullable
    public String encrypt(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(c, 2)));
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(1, rSAPublicKey);
            return Base64.encodeToString(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 2);
        } catch (Exception e) {
            HMLog.error(a, new Function0() { // from class: bl1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EncryptImpl.d(e);
                }
            });
            return null;
        }
    }
}
