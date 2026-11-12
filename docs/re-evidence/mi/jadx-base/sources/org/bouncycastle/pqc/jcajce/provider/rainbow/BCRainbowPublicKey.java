package org.bouncycastle.pqc.jcajce.provider.rainbow;

import defpackage.dbj;
import defpackage.fbj;
import defpackage.hbj;
import defpackage.lbj;
import defpackage.mg5;
import defpackage.pgh;
import defpackage.r0e;
import defpackage.t51;
import defpackage.vaj;
import defpackage.vj1;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCRainbowPublicKey implements PublicKey {
    private static final long serialVersionUID = 1;
    private short[][] coeffquadratic;
    private short[] coeffscalar;
    private short[][] coeffsingular;
    private int docLength;
    private vaj rainbowParams;

    public BCRainbowPublicKey(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.docLength = i;
        this.coeffquadratic = sArr;
        this.coeffsingular = sArr2;
        this.coeffscalar = sArr3;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPublicKey)) {
            return false;
        }
        BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) obj;
        return this.docLength == bCRainbowPublicKey.getDocLength() && lbj.j(this.coeffquadratic, bCRainbowPublicKey.getCoeffQuadratic()) && lbj.j(this.coeffsingular, bCRainbowPublicKey.getCoeffSingular()) && lbj.i(this.coeffscalar, bCRainbowPublicKey.getCoeffScalar());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[][] getCoeffQuadratic() {
        return this.coeffquadratic;
    }

    public short[] getCoeffScalar() {
        return vj1.i(this.coeffscalar);
    }

    public short[][] getCoeffSingular() {
        short[][] sArr = new short[this.coeffsingular.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.coeffsingular;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = vj1.i(sArr2[i]);
            i++;
        }
    }

    public int getDocLength() {
        return this.docLength;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return r0e.a(new t51(pgh.f30373a, mg5.f26130a), new dbj(this.docLength, this.coeffquadratic, this.coeffsingular, this.coeffscalar));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.docLength * 37) + vj1.w(this.coeffquadratic)) * 37) + vj1.w(this.coeffsingular)) * 37) + vj1.v(this.coeffscalar);
    }

    public BCRainbowPublicKey(fbj fbjVar) {
        throw null;
    }

    public BCRainbowPublicKey(hbj hbjVar) {
        this(hbjVar.d(), hbjVar.a(), hbjVar.c(), hbjVar.b());
    }
}
