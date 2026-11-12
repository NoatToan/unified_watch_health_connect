package org.bouncycastle.pqc.jcajce.provider.rainbow;

import defpackage.bbj;
import defpackage.lbj;
import defpackage.mg5;
import defpackage.pgh;
import defpackage.s6e;
import defpackage.t51;
import defpackage.vj1;
import defpackage.xaj;
import defpackage.zaj;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCRainbowPrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;
    private short[][] A1inv;
    private short[][] A2inv;
    private short[] b1;
    private short[] b2;
    private s6e[] layers;
    private int[] vi;

    public BCRainbowPrivateKey(zaj zajVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPrivateKey)) {
            return false;
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) obj;
        boolean zEquals = lbj.j(this.A1inv, bCRainbowPrivateKey.getInvA1()) && lbj.j(this.A2inv, bCRainbowPrivateKey.getInvA2()) && lbj.i(this.b1, bCRainbowPrivateKey.getB1()) && lbj.i(this.b2, bCRainbowPrivateKey.getB2()) && Arrays.equals(this.vi, bCRainbowPrivateKey.getVi());
        if (this.layers.length != bCRainbowPrivateKey.getLayers().length) {
            return false;
        }
        for (int length = this.layers.length - 1; length >= 0; length--) {
            zEquals &= this.layers[length].equals(bCRainbowPrivateKey.getLayers()[length]);
        }
        return zEquals;
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
            return new PrivateKeyInfo(new t51(pgh.f30373a, mg5.f26130a), new xaj(this.A1inv, this.b1, this.A2inv, this.b2, this.vi, this.layers)).e();
        } catch (IOException unused) {
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

    public s6e[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.vi;
    }

    public int hashCode() {
        int length = (((((((((this.layers.length * 37) + vj1.w(this.A1inv)) * 37) + vj1.v(this.b1)) * 37) + vj1.w(this.A2inv)) * 37) + vj1.v(this.b2)) * 37) + vj1.s(this.vi);
        for (int length2 = this.layers.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.layers[length2].hashCode();
        }
        return length;
    }

    public BCRainbowPrivateKey(bbj bbjVar) {
        this(bbjVar.c(), bbjVar.a(), bbjVar.d(), bbjVar.b(), bbjVar.f(), bbjVar.e());
    }

    public BCRainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, s6e[] s6eVarArr) {
        this.A1inv = sArr;
        this.b1 = sArr2;
        this.A2inv = sArr3;
        this.b2 = sArr4;
        this.vi = iArr;
        this.layers = s6eVarArr;
    }
}
