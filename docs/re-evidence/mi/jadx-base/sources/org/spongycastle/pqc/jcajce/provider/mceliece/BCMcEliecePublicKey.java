package org.spongycastle.pqc.jcajce.provider.mceliece;

import defpackage.fe;
import defpackage.lg5;
import defpackage.maf;
import defpackage.mw3;
import defpackage.pe;
import defpackage.rno;
import defpackage.s51;
import defpackage.taf;
import defpackage.vaf;
import defpackage.vua;
import defpackage.xaf;
import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCMcEliecePublicKey implements mw3, PublicKey {
    private static final long serialVersionUID = 1;
    private maf McElieceParams;
    private vua g;
    private int n;
    private String oid;
    private int t;

    public BCMcEliecePublicKey(vaf vafVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePublicKey)) {
            return false;
        }
        BCMcEliecePublicKey bCMcEliecePublicKey = (BCMcEliecePublicKey) obj;
        if (this.n == bCMcEliecePublicKey.n && this.t == bCMcEliecePublicKey.t) {
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
            return new rno(new s51(getOID(), lg5.f25030a), new taf(new fe(this.oid), this.n, this.t, null)).e();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    public vua getG() {
        return null;
    }

    public int getK() {
        throw null;
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

    public int getT() {
        return this.t;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        String str = ("McEliecePublicKey:\n length of the code         : " + this.n + "\n") + " error correction capability: " + this.t + "\n";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" generator matrix           : ");
        throw null;
    }

    public BCMcEliecePublicKey(xaf xafVar) {
        throw null;
    }

    public BCMcEliecePublicKey(String str, int i, int i2, vua vuaVar) {
        this.oid = str;
        this.n = i;
        this.t = i2;
    }
}
