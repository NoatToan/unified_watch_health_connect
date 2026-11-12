package defpackage;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class raj extends KeyFactorySpi implements al1 {
    @Override // defpackage.al1
    public PrivateKey a(PrivateKeyInfo privateKeyInfo) throws IOException {
        xaj xajVarI = xaj.i(privateKeyInfo.j());
        return new BCRainbowPrivateKey(xajVarI.j(), xajVarI.g(), xajVarI.k(), xajVarI.h(), xajVarI.m(), xajVarI.l());
    }

    @Override // defpackage.al1
    public PublicKey b(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        dbj dbjVarK = dbj.k(subjectPublicKeyInfo.k());
        return new BCRainbowPublicKey(dbjVarK.j(), dbjVarK.g(), dbjVarK.i(), dbjVarK.h());
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof bbj) {
            return new BCRainbowPrivateKey((bbj) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(PrivateKeyInfo.h(re.j(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof hbj) {
            return new BCRainbowPublicKey((hbj) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return b(SubjectPublicKeyInfo.i(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCRainbowPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (bbj.class.isAssignableFrom(cls)) {
                BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) key;
                return new bbj(bCRainbowPrivateKey.getInvA1(), bCRainbowPrivateKey.getB1(), bCRainbowPrivateKey.getInvA2(), bCRainbowPrivateKey.getB2(), bCRainbowPrivateKey.getVi(), bCRainbowPrivateKey.getLayers());
            }
        } else {
            if (!(key instanceof BCRainbowPublicKey)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (hbj.class.isAssignableFrom(cls)) {
                BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) key;
                return new hbj(bCRainbowPublicKey.getDocLength(), bCRainbowPublicKey.getCoeffQuadratic(), bCRainbowPublicKey.getCoeffSingular(), bCRainbowPublicKey.getCoeffScalar());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCRainbowPrivateKey) || (key instanceof BCRainbowPublicKey)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
