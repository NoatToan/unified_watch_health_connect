package org.spongycastle.pqc.jcajce.provider.mceliece;

import defpackage.eaf;
import defpackage.fe;
import defpackage.gaf;
import defpackage.iaf;
import defpackage.lg5;
import defpackage.mw3;
import defpackage.pe;
import defpackage.rno;
import defpackage.s51;
import defpackage.vua;
import defpackage.y9f;
import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCMcElieceCCA2PublicKey implements mw3, PublicKey {
    private static final long serialVersionUID = 1;
    private y9f McElieceCCA2Params;
    private vua g;
    private int n;
    private String oid;
    private int t;

    public BCMcElieceCCA2PublicKey(gaf gafVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof BCMcElieceCCA2PublicKey)) {
            BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey = (BCMcElieceCCA2PublicKey) obj;
            if (this.n == bCMcElieceCCA2PublicKey.n && this.t == bCMcElieceCCA2PublicKey.t) {
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
            return new rno(new s51(getOID(), lg5.f25030a), new eaf(new fe(this.oid), this.n, this.t, null)).e();
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

    public BCMcElieceCCA2PublicKey(iaf iafVar) {
        throw null;
    }

    public BCMcElieceCCA2PublicKey(String str, int i, int i2, vua vuaVar) {
        this.oid = str;
        this.n = i;
        this.t = i2;
    }
}
