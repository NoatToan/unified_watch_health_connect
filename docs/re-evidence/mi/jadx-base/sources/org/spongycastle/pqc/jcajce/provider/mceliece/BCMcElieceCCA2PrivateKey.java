package org.spongycastle.pqc.jcajce.provider.mceliece;

import defpackage.baf;
import defpackage.daf;
import defpackage.eai;
import defpackage.fe;
import defpackage.lg5;
import defpackage.mw3;
import defpackage.pe;
import defpackage.s51;
import defpackage.ssh;
import defpackage.vua;
import defpackage.y9f;
import defpackage.z2i;
import defpackage.z9f;
import defpackage.zua;
import java.io.IOException;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCMcElieceCCA2PrivateKey implements mw3, PrivateKey {
    private static final long serialVersionUID = 1;
    private zua field;
    private z2i goppaPoly;
    private vua h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f29573k;
    private y9f mcElieceCCA2Params;
    private int n;
    private String oid;
    private ssh p;
    private z2i[] qInv;

    public BCMcElieceCCA2PrivateKey(baf bafVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof BCMcElieceCCA2PrivateKey)) {
            BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey = (BCMcElieceCCA2PrivateKey) obj;
            if (this.n == bCMcElieceCCA2PrivateKey.n && this.f29573k == bCMcElieceCCA2PrivateKey.f29573k) {
                throw null;
            }
        }
        return false;
    }

    public pe getAlgParams() {
        return null;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            try {
                return new eai(new s51(getOID(), lg5.f25030a), new z9f(new fe(this.oid), this.n, this.f29573k, null, null, null, null, this.qInv)).e();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public zua getField() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    public z2i getGoppaPoly() {
        return null;
    }

    public vua getH() {
        return null;
    }

    public int getK() {
        return this.f29573k;
    }

    public y9f getMcElieceCCA2Parameters() {
        return null;
    }

    public int getN() {
        return this.n;
    }

    public fe getOID() {
        return new fe("1.3.6.1.4.1.8301.3.1.3.4.2");
    }

    public String getOIDString() {
        return this.oid;
    }

    public ssh getP() {
        return null;
    }

    public z2i[] getQInv() {
        return this.qInv;
    }

    public int getT() {
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return ((" extension degree of the field      : " + this.n + "\n") + " dimension of the code              : " + this.f29573k + "\n") + " irreducible Goppa polynomial       : " + ((Object) null) + "\n";
    }

    public BCMcElieceCCA2PrivateKey(daf dafVar) {
        throw null;
    }

    public BCMcElieceCCA2PrivateKey(String str, int i, int i2, zua zuaVar, z2i z2iVar, ssh sshVar, vua vuaVar, z2i[] z2iVarArr) {
        this.oid = str;
        this.n = i;
        this.f29573k = i2;
        this.qInv = z2iVarArr;
    }
}
