package defpackage;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.util.Base64URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class dep {
    public static Base64URL a(String str, JWK jwk) throws JOSEException {
        return b(str, jwk.getRequiredParams());
    }

    public static Base64URL b(String str, LinkedHashMap<String, ?> linkedHashMap) throws JOSEException {
        String strN = npd.n(linkedHashMap);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(strN.getBytes(mbo.f25981a));
            return Base64URL.encode(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new JOSEException("Couldn't compute JWK thumbprint: Unsupported hash algorithm: " + e.getMessage(), e);
        }
    }
}
