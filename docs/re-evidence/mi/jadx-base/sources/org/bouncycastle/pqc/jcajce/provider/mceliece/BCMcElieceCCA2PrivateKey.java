package org.bouncycastle.pqc.jcajce.provider.mceliece;

import defpackage.a3i;
import defpackage.aaf;
import defpackage.ava;
import defpackage.caf;
import defpackage.cl1;
import defpackage.jmq;
import defpackage.pgh;
import defpackage.t51;
import defpackage.tsh;
import defpackage.wua;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCMcElieceCCA2PrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;
    private caf params;

    public BCMcElieceCCA2PrivateKey(caf cafVar) {
        this.params = cafVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PrivateKey)) {
            return false;
        }
        BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey = (BCMcElieceCCA2PrivateKey) obj;
        return getN() == bCMcElieceCCA2PrivateKey.getN() && getK() == bCMcElieceCCA2PrivateKey.getK() && getField().equals(bCMcElieceCCA2PrivateKey.getField()) && getGoppaPoly().equals(bCMcElieceCCA2PrivateKey.getGoppaPoly()) && getP().equals(bCMcElieceCCA2PrivateKey.getP()) && getH().equals(bCMcElieceCCA2PrivateKey.getH());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new t51(pgh.n), new aaf(getN(), getK(), getField(), getGoppaPoly(), getP(), jmq.a(this.params.b()))).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public ava getField() {
        return this.params.c();
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public a3i getGoppaPoly() {
        return this.params.d();
    }

    public wua getH() {
        return this.params.e();
    }

    public int getK() {
        return this.params.f();
    }

    public cl1 getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.g();
    }

    public tsh getP() {
        return this.params.h();
    }

    public a3i[] getQInv() {
        return this.params.i();
    }

    public int getT() {
        return this.params.d().g();
    }

    public int hashCode() {
        return (((((((((this.params.f() * 37) + this.params.g()) * 37) + this.params.c().hashCode()) * 37) + this.params.d().hashCode()) * 37) + this.params.h().hashCode()) * 37) + this.params.e().hashCode();
    }
}
