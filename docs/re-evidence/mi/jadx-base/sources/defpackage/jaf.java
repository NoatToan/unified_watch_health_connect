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
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class jaf extends KeyFactorySpi implements al1 {
    @Override // defpackage.al1
    public PrivateKey a(PrivateKeyInfo privateKeyInfo) throws IOException {
        paf pafVarI = paf.i(privateKeyInfo.j().toASN1Primitive());
        return new BCMcEliecePrivateKey(new raf(pafVarI.k(), pafVarI.j(), pafVarI.g(), pafVarI.h(), pafVarI.l(), pafVarI.m(), pafVarI.o()));
    }

    @Override // defpackage.al1
    public PublicKey b(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        uaf uafVarH = uaf.h(subjectPublicKeyInfo.k());
        return new BCMcEliecePublicKey(new waf(uafVarH.i(), uafVarH.j(), uafVarH.g()));
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            PrivateKeyInfo privateKeyInfoH = PrivateKeyInfo.h(re.j(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!pgh.m.equals(privateKeyInfoH.i().g())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                paf pafVarI = paf.i(privateKeyInfoH.j());
                return new BCMcEliecePrivateKey(new raf(pafVarI.k(), pafVarI.j(), pafVarI.g(), pafVarI.h(), pafVarI.l(), pafVarI.m(), pafVarI.o()));
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
                if (!pgh.m.equals(subjectPublicKeyInfoI.g().g())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                uaf uafVarH = uaf.h(subjectPublicKeyInfoI.k());
                return new BCMcEliecePublicKey(new waf(uafVarH.i(), uafVarH.j(), uafVarH.g()));
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
