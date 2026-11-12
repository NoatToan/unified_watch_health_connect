package org.bouncycastle.pqc.jcajce.provider.mceliece;

import defpackage.a3i;
import defpackage.ava;
import defpackage.cl1;
import defpackage.lw3;
import defpackage.paf;
import defpackage.pgh;
import defpackage.raf;
import defpackage.t51;
import defpackage.tsh;
import defpackage.wua;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCMcEliecePrivateKey implements lw3, PrivateKey {
    private static final long serialVersionUID = 1;
    private raf params;

    public BCMcEliecePrivateKey(raf rafVar) {
        this.params = rafVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePrivateKey)) {
            return false;
        }
        BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) obj;
        return getN() == bCMcEliecePrivateKey.getN() && getK() == bCMcEliecePrivateKey.getK() && getField().equals(bCMcEliecePrivateKey.getField()) && getGoppaPoly().equals(bCMcEliecePrivateKey.getGoppaPoly()) && getSInv().equals(bCMcEliecePrivateKey.getSInv()) && getP1().equals(bCMcEliecePrivateKey.getP1()) && getP2().equals(bCMcEliecePrivateKey.getP2());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new t51(pgh.m), new paf(this.params.f(), this.params.e(), this.params.b(), this.params.c(), this.params.g(), this.params.h(), this.params.j())).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public ava getField() {
        return this.params.b();
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public a3i getGoppaPoly() {
        return this.params.c();
    }

    public wua getH() {
        return this.params.d();
    }

    public int getK() {
        return this.params.e();
    }

    public cl1 getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.f();
    }

    public tsh getP1() {
        return this.params.g();
    }

    public tsh getP2() {
        return this.params.h();
    }

    public a3i[] getQInv() {
        return this.params.i();
    }

    public wua getSInv() {
        return this.params.j();
    }

    public int hashCode() {
        return (((((((((((this.params.e() * 37) + this.params.f()) * 37) + this.params.b().hashCode()) * 37) + this.params.c().hashCode()) * 37) + this.params.g().hashCode()) * 37) + this.params.h().hashCode()) * 37) + this.params.j().hashCode();
    }
}
