package org.spongycastle.pqc.jcajce.provider.rainbow;

import defpackage.cbj;
import defpackage.ebj;
import defpackage.gbj;
import defpackage.kbj;
import defpackage.lg5;
import defpackage.ogh;
import defpackage.s51;
import defpackage.t0e;
import defpackage.uaj;
import defpackage.wj1;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCRainbowPublicKey implements PublicKey {
    private static final long serialVersionUID = 1;
    private short[][] coeffquadratic;
    private short[] coeffscalar;
    private short[][] coeffsingular;
    private int docLength;
    private uaj rainbowParams;

    public BCRainbowPublicKey(ebj ebjVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPublicKey)) {
            return false;
        }
        BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) obj;
        return this.docLength == bCRainbowPublicKey.getDocLength() && kbj.e(this.coeffquadratic, bCRainbowPublicKey.getCoeffQuadratic()) && kbj.e(this.coeffsingular, bCRainbowPublicKey.getCoeffSingular()) && kbj.d(this.coeffscalar, bCRainbowPublicKey.getCoeffScalar());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[][] getCoeffQuadratic() {
        return this.coeffquadratic;
    }

    public short[] getCoeffScalar() {
        return wj1.h(this.coeffscalar);
    }

    public short[][] getCoeffSingular() {
        short[][] sArr = new short[this.coeffsingular.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.coeffsingular;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = wj1.h(sArr2[i]);
            i++;
        }
    }

    public int getDocLength() {
        return this.docLength;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return t0e.a(new s51(ogh.f29143a, lg5.f25030a), new cbj(this.docLength, this.coeffquadratic, this.coeffsingular, this.coeffscalar));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.docLength * 37) + wj1.q(this.coeffquadratic)) * 37) + wj1.q(this.coeffsingular)) * 37) + wj1.p(this.coeffscalar);
    }

    public BCRainbowPublicKey(gbj gbjVar) {
        throw null;
    }

    public BCRainbowPublicKey(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.docLength = i;
        this.coeffquadratic = sArr;
        this.coeffsingular = sArr2;
        this.coeffscalar = sArr3;
    }
}
