package defpackage;

import android.text.TextUtils;
import com.miuipub.internal.hybrid.SignUtils;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObjectType;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.Payload;
import com.service.mi.common.util.a;
import com.tsmclient.smartcard.Coder;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class dzd {
    public static String a(String str, String str2, String str3) throws Exception {
        try {
            String str4 = str3.substring(0, 4) + str3.substring(24, 36) + str3.substring(78, 84);
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            byte[] bArr = new byte[bytes.length + 1];
            bArr[0] = 21;
            System.arraycopy(bytes, 0, bArr, 1, bytes.length);
            return c(b(bArr, str4, str), str4);
        } catch (Exception e) {
            j7i.d(a.a().getApplicationContext(), qvf.j);
            fpe.d("JWE加密发生异常:" + e);
            return null;
        }
    }

    public static String b(byte[] bArr, String str, String str2) throws Exception {
        JWEHeader.a aVar = new JWEHeader.a(JWEAlgorithm.RSA1_5, EncryptionMethod.A128GCM);
        aVar.q(JOSEObjectType.JOSE);
        aVar.m(str);
        aVar.h("channelSecurityContext", "RSA_PKI");
        aVar.h("iat", Long.valueOf(System.currentTimeMillis() / 1000));
        JWEHeader jWEHeaderD = aVar.d();
        dmr dmrVar = new dmr((RSAPublicKey) e(str2));
        JWEObject jWEObject = new JWEObject(jWEHeaderD, new Payload(bArr));
        jWEObject.encrypt(dmrVar);
        return jWEObject.serialize();
    }

    public static String c(String str, String str2) throws InvalidKeySpecException, NoSuchAlgorithmException, JOSEException {
        PrivateKey privateKeyF = f(j7i.a(a.a().getApplicationContext(), qvf.i));
        JWSObject jWSObject = new JWSObject(new JWSHeader.a(JWSAlgorithm.RS256).j(JOSEObjectType.JOSE).h(str2).c("JWE").b(), new Payload(str));
        jWSObject.sign(new r9j(privateKeyF));
        return jWSObject.serialize();
    }

    public static String d() {
        String strA = j7i.a(a.a().getApplicationContext(), qvf.h);
        String strA2 = j7i.a(a.a().getApplicationContext(), qvf.i);
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2)) {
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(SignUtils.KEY_RSA);
                keyPairGenerator.initialize(2048, SecureRandom.getInstance("SHA1PRNG"));
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
                PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
                o12.b(publicKey.getEncoded());
                o12.b(privateKey.getEncoded());
                String strB = o12.b(publicKey.getEncoded());
                String strB2 = o12.b(privateKey.getEncoded());
                j7i.c(a.a().getApplicationContext(), qvf.h, strB);
                j7i.c(a.a().getApplicationContext(), qvf.i, strB2);
                return strB;
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return strA;
    }

    public static PublicKey e(String str) throws Exception {
        byte[] bArrA = o12.a(str);
        fpe.d("keyBytes1:" + Coder.bytesToHexString(bArrA));
        return KeyFactory.getInstance(SignUtils.KEY_RSA).generatePublic(new X509EncodedKeySpec(bArrA));
    }

    public static PrivateKey f(String str) throws InvalidKeySpecException, NoSuchAlgorithmException {
        byte[] bArrA = o12.a(str);
        fpe.d("keyBytes2:" + str);
        return KeyFactory.getInstance(SignUtils.KEY_RSA).generatePrivate(new PKCS8EncodedKeySpec(bArrA));
    }
}
