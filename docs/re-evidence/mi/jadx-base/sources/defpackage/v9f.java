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
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class v9f extends KeyFactorySpi implements al1 {
    @Override // defpackage.al1
    public PrivateKey a(PrivateKeyInfo privateKeyInfo) throws IOException {
        aaf aafVarJ = aaf.j(privateKeyInfo.j().toASN1Primitive());
        return new BCMcElieceCCA2PrivateKey(new caf(aafVarJ.l(), aafVarJ.k(), aafVarJ.h(), aafVarJ.i(), aafVarJ.m(), null));
    }

    @Override // defpackage.al1
    public PublicKey b(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        faf fafVarI = faf.i(subjectPublicKeyInfo.k());
        return new BCMcElieceCCA2PublicKey(new haf(fafVarI.j(), fafVarI.k(), fafVarI.h(), jmq.b(fafVarI.g()).getAlgorithmName()));
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            PrivateKeyInfo privateKeyInfoH = PrivateKeyInfo.h(re.j(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!pgh.n.equals(privateKeyInfoH.i().g())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                aaf aafVarJ = aaf.j(privateKeyInfoH.j());
                return new BCMcElieceCCA2PrivateKey(new caf(aafVarJ.l(), aafVarJ.k(), aafVarJ.h(), aafVarJ.i(), aafVarJ.m(), jmq.b(aafVarJ.g()).getAlgorithmName()));
            } catch (IOException unused) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        } catch (IOException e) {
            throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e);
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfoI = SubjectPublicKeyInfo.i(re.j(((X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!pgh.n.equals(subjectPublicKeyInfoI.g().g())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                faf fafVarI = faf.i(subjectPublicKeyInfoI.k());
                return new BCMcElieceCCA2PublicKey(new haf(fafVarI.j(), fafVarI.k(), fafVarI.h(), jmq.b(fafVarI.g()).getAlgorithmName()));
            } catch (IOException e) {
                throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e.getMessage());
            }
        } catch (IOException e2) {
            throw new InvalidKeySpecException(e2.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }
}
