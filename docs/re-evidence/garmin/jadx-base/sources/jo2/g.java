package jo2;

import aq2.h;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.AESDecrypter;
import com.nimbusds.jose.crypto.AESEncrypter;
import com.nimbusds.jose.crypto.ECDSAVerifier;
import com.nimbusds.jwt.SignedJWT;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import zn2.f1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljo2/g;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f99843a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f99844b;

    static {
        int i14 = gt2.c.f79010a;
        f99844b = gt2.b.f79005a.h("PAY#NEW_FITPAY#SecurityStringUtils");
    }

    private g() {
    }

    public static String a(b bVar, String str) {
        ECPublicKey eCPublicKey;
        bVar.getClass();
        try {
            JWEObject jWEObject = JWEObject.parse(str);
            jWEObject.getClass();
            JWEHeader header = jWEObject.getHeader();
            if (header.getKeyID() != null) {
                String keyID = header.getKeyID();
                f1.f205508a.getClass();
                a aVarC = f1.c(bVar);
                if (!s.g(keyID, aVarC != null ? aVarC.getKeyId() : null)) {
                    return null;
                }
            }
            f1.f205508a.getClass();
            jWEObject.decrypt(new AESDecrypter(f1.e(bVar)));
            if (!"JWT".equals(header.getContentType())) {
                return jWEObject.getPayload().toString();
            }
            SignedJWT signedJWT = jWEObject.getPayload().toSignedJWT();
            a aVarC2 = f1.c(bVar);
            if ("https://fit-pay.com".equals(signedJWT.getJWTClaimsSet().getIssuer())) {
                PublicKey publicKeyD = f1.d(h.b(aVarC2 != null ? aVarC2.getServerPublicKey() : null));
                publicKeyD.getClass();
                eCPublicKey = (ECPublicKey) publicKeyD;
            } else {
                PublicKey publicKeyD2 = f1.d(h.b(aVarC2 != null ? aVarC2.getClientPublicKey() : null));
                publicKeyD2.getClass();
                eCPublicKey = (ECPublicKey) publicKeyD2;
            }
            if (signedJWT.verify(new ECDSAVerifier(eCPublicKey))) {
                return signedJWT.getJWTClaimsSet().getStringClaim("data");
            }
            throw new IllegalStateException("jwt did not pass signature validation");
        } catch (Exception e4) {
            f99844b.error("getDecryptedString: error while decrypting encrypted string", (Throwable) e4);
            return null;
        }
    }

    public static String b(b bVar, String str) {
        bVar.getClass();
        JWEAlgorithm jWEAlgorithm = JWEAlgorithm.A256GCMKW;
        EncryptionMethod encryptionMethod = EncryptionMethod.A256GCM;
        f1.f205508a.getClass();
        a aVarC = f1.c(bVar);
        if (aVarC == null) {
            aVarC = f1.a(b.KEY_WV);
        }
        JWEObject jWEObject = new JWEObject(new JWEHeader.Builder(jWEAlgorithm, encryptionMethod).contentType("application/json").keyID(aVarC.getKeyId()).build(), new Payload(str));
        try {
            f.f99840a.getClass();
            f.a();
            AESEncrypter aESEncrypter = new AESEncrypter(f1.e(bVar));
            aESEncrypter.getJCAContext().setProvider(f.f99842c);
            jWEObject.encrypt(aESEncrypter);
        } catch (JOSEException e4) {
            f99844b.error("getEncryptedString: error while encrypting string", (Throwable) e4);
        }
        return jWEObject.serialize();
    }
}
