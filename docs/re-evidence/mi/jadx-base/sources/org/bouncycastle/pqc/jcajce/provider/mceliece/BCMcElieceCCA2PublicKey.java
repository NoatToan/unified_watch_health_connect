package org.bouncycastle.pqc.jcajce.provider.mceliece;

import defpackage.cl1;
import defpackage.faf;
import defpackage.haf;
import defpackage.jmq;
import defpackage.lw3;
import defpackage.pgh;
import defpackage.t51;
import defpackage.wua;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCMcElieceCCA2PublicKey implements lw3, PublicKey {
    private static final long serialVersionUID = 1;
    private haf params;

    public BCMcElieceCCA2PublicKey(haf hafVar) {
        this.params = hafVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PublicKey)) {
            return false;
        }
        BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey = (BCMcElieceCCA2PublicKey) obj;
        return this.params.e() == bCMcElieceCCA2PublicKey.getN() && this.params.f() == bCMcElieceCCA2PublicKey.getT() && this.params.c().equals(bCMcElieceCCA2PublicKey.getG());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new SubjectPublicKeyInfo(new t51(pgh.n), new faf(this.params.e(), this.params.f(), this.params.c(), jmq.a(this.params.b()))).e();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public wua getG() {
        return this.params.c();
    }

    public int getK() {
        return this.params.d();
    }

    public cl1 getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.e();
    }

    public int getT() {
        return this.params.f();
    }

    public int hashCode() {
        return ((this.params.e() + (this.params.f() * 37)) * 37) + this.params.c().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.params.e() + "\n") + " error correction capability: " + this.params.f() + "\n") + " generator matrix           : " + this.params.c().toString();
    }
}
