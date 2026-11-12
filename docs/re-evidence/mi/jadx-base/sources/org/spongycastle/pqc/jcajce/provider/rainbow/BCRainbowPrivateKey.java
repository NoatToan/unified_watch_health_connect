package org.spongycastle.pqc.jcajce.provider.rainbow;

import defpackage.abj;
import defpackage.eai;
import defpackage.kbj;
import defpackage.lg5;
import defpackage.ogh;
import defpackage.r6e;
import defpackage.s51;
import defpackage.waj;
import defpackage.wj1;
import defpackage.yaj;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class BCRainbowPrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;
    private short[][] A1inv;
    private short[][] A2inv;
    private short[] b1;
    private short[] b2;
    private r6e[] layers;
    private int[] vi;

    public BCRainbowPrivateKey(yaj yajVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPrivateKey)) {
            return false;
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) obj;
        boolean z = kbj.e(this.A1inv, bCRainbowPrivateKey.getInvA1()) && kbj.e(this.A2inv, bCRainbowPrivateKey.getInvA2()) && kbj.d(this.b1, bCRainbowPrivateKey.getB1()) && kbj.d(this.b2, bCRainbowPrivateKey.getB2()) && Arrays.equals(this.vi, bCRainbowPrivateKey.getVi());
        if (this.layers.length != bCRainbowPrivateKey.getLayers().length) {
            return false;
        }
        r6e[] r6eVarArr = this.layers;
        int length = r6eVarArr.length - 1;
        if (length < 0) {
            return z;
        }
        r6e r6eVar = r6eVarArr[length];
        r6e r6eVar2 = bCRainbowPrivateKey.getLayers()[length];
        throw null;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[] getB1() {
        return this.b1;
    }

    public short[] getB2() {
        return this.b2;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            try {
                return new eai(new s51(ogh.f29143a, lg5.f25030a), new waj(this.A1inv, this.b1, this.A2inv, this.b2, this.vi, this.layers)).e();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public short[][] getInvA1() {
        return this.A1inv;
    }

    public short[][] getInvA2() {
        return this.A2inv;
    }

    public r6e[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.vi;
    }

    public int hashCode() {
        int length = (((((((((this.layers.length * 37) + wj1.q(this.A1inv)) * 37) + wj1.p(this.b1)) * 37) + wj1.q(this.A2inv)) * 37) + wj1.p(this.b2)) * 37) + wj1.m(this.vi);
        r6e[] r6eVarArr = this.layers;
        int length2 = r6eVarArr.length - 1;
        if (length2 < 0) {
            return length;
        }
        r6e r6eVar = r6eVarArr[length2];
        throw null;
    }

    public BCRainbowPrivateKey(abj abjVar) {
        throw null;
    }

    public BCRainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, r6e[] r6eVarArr) {
        this.A1inv = sArr;
        this.b1 = sArr2;
        this.A2inv = sArr3;
        this.b2 = sArr4;
        this.vi = iArr;
        this.layers = r6eVarArr;
    }
}
