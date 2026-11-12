package org.spongycastle.pqc.jcajce.provider.mceliece;

import defpackage.eai;
import defpackage.fe;
import defpackage.lg5;
import defpackage.maf;
import defpackage.mw3;
import defpackage.oaf;
import defpackage.pe;
import defpackage.qaf;
import defpackage.s51;
import defpackage.saf;
import defpackage.ssh;
import defpackage.vua;
import defpackage.z2i;
import defpackage.zua;
import java.io.IOException;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCMcEliecePrivateKey implements mw3, PrivateKey {
    private static final long serialVersionUID = 1;
    private zua field;
    private z2i goppaPoly;
    private vua h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f29574k;
    private maf mcElieceParams;
    private int n;
    private String oid;
    private ssh p1;
    private ssh p2;
    private z2i[] qInv;
    private vua sInv;

    public BCMcEliecePrivateKey(qaf qafVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePrivateKey)) {
            return false;
        }
        BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) obj;
        if (this.n == bCMcEliecePrivateKey.n && this.f29574k == bCMcEliecePrivateKey.f29574k) {
            throw null;
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
                return new eai(new s51(getOID(), lg5.f25030a), new oaf(new fe(this.oid), this.n, this.f29574k, null, null, null, null, null, null, this.qInv)).e();
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
        return this.f29574k;
    }

    public maf getMcElieceParameters() {
        return null;
    }

    public int getN() {
        return this.n;
    }

    public fe getOID() {
        return new fe("1.3.6.1.4.1.8301.3.1.3.4.1");
    }

    public String getOIDString() {
        return this.oid;
    }

    public ssh getP1() {
        return null;
    }

    public ssh getP2() {
        return null;
    }

    public z2i[] getQInv() {
        return this.qInv;
    }

    public vua getSInv() {
        return null;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return (((((" length of the code          : " + this.n + "\n") + " dimension of the code       : " + this.f29574k + "\n") + " irreducible Goppa polynomial: " + ((Object) null) + "\n") + " (k x k)-matrix S^-1         : " + ((Object) null) + "\n") + " permutation P1              : " + ((Object) null) + "\n") + " permutation P2              : " + ((Object) null);
    }

    public BCMcEliecePrivateKey(saf safVar) {
        throw null;
    }

    public BCMcEliecePrivateKey(String str, int i, int i2, zua zuaVar, z2i z2iVar, vua vuaVar, ssh sshVar, ssh sshVar2, vua vuaVar2, z2i[] z2iVarArr) {
        this.oid = str;
        this.n = i;
        this.f29574k = i2;
        this.qInv = z2iVarArr;
    }
}
