package org.bouncycastle.pqc.jcajce.provider.mceliece;

import defpackage.cl1;
import defpackage.pgh;
import defpackage.t51;
import defpackage.uaf;
import defpackage.waf;
import defpackage.wua;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCMcEliecePublicKey implements PublicKey {
    private static final long serialVersionUID = 1;
    private waf params;

    public BCMcEliecePublicKey(waf wafVar) {
        this.params = wafVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePublicKey)) {
            return false;
        }
        BCMcEliecePublicKey bCMcEliecePublicKey = (BCMcEliecePublicKey) obj;
        return this.params.d() == bCMcEliecePublicKey.getN() && this.params.e() == bCMcEliecePublicKey.getT() && this.params.b().equals(bCMcEliecePublicKey.getG());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new SubjectPublicKeyInfo(new t51(pgh.m), new uaf(this.params.d(), this.params.e(), this.params.b())).e();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public wua getG() {
        return this.params.b();
    }

    public int getK() {
        return this.params.c();
    }

    public cl1 getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.d();
    }

    public int getT() {
        return this.params.e();
    }

    public int hashCode() {
        return ((this.params.d() + (this.params.e() * 37)) * 37) + this.params.b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.params.d() + "\n") + " error correction capability: " + this.params.e() + "\n") + " generator matrix           : " + this.params.b();
    }
}
