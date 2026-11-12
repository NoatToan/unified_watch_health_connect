package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h87 implements y77 {

    public static class b extends h87 {
        public BigInteger g;
        public BigInteger h;
        public BigInteger i;

        public b(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, t(bigInteger), bigInteger2);
        }

        public static BigInteger t(BigInteger bigInteger) {
            int iBitLength = bigInteger.bitLength();
            if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
                return null;
            }
            return y77.f39884b.shiftLeft(iBitLength).subtract(bigInteger);
        }

        public BigInteger A(BigInteger bigInteger, BigInteger bigInteger2) {
            return B(bigInteger.multiply(bigInteger2));
        }

        public BigInteger B(BigInteger bigInteger) {
            if (this.h == null) {
                return bigInteger.mod(this.g);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = this.g.bitLength();
            boolean zEquals = this.h.equals(y77.f39884b);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(this.h);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(this.g) >= 0) {
                bigInteger = bigInteger.subtract(this.g);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.g.subtract(bigInteger);
        }

        public BigInteger C(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            return bigIntegerSubtract.signum() < 0 ? bigIntegerSubtract.add(this.g) : bigIntegerSubtract;
        }

        @Override // defpackage.h87
        public h87 a(h87 h87Var) {
            return new b(this.g, this.h, w(this.i, h87Var.s()));
        }

        @Override // defpackage.h87
        public h87 b() {
            BigInteger bigIntegerAdd = this.i.add(y77.f39884b);
            if (bigIntegerAdd.compareTo(this.g) == 0) {
                bigIntegerAdd = y77.f39883a;
            }
            return new b(this.g, this.h, bigIntegerAdd);
        }

        @Override // defpackage.h87
        public h87 d(h87 h87Var) {
            return new b(this.g, this.h, A(this.i, z(h87Var.s())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.g.equals(bVar.g) && this.i.equals(bVar.i);
        }

        @Override // defpackage.h87
        public int f() {
            return this.g.bitLength();
        }

        @Override // defpackage.h87
        public h87 g() {
            return new b(this.g, this.h, z(this.i));
        }

        public int hashCode() {
            return this.g.hashCode() ^ this.i.hashCode();
        }

        @Override // defpackage.h87
        public h87 j(h87 h87Var) {
            return new b(this.g, this.h, A(this.i, h87Var.s()));
        }

        @Override // defpackage.h87
        public h87 k(h87 h87Var, h87 h87Var2, h87 h87Var3) {
            BigInteger bigInteger = this.i;
            BigInteger bigIntegerS = h87Var.s();
            BigInteger bigIntegerS2 = h87Var2.s();
            BigInteger bigIntegerS3 = h87Var3.s();
            return new b(this.g, this.h, B(bigInteger.multiply(bigIntegerS).subtract(bigIntegerS2.multiply(bigIntegerS3))));
        }

        @Override // defpackage.h87
        public h87 l(h87 h87Var, h87 h87Var2, h87 h87Var3) {
            BigInteger bigInteger = this.i;
            BigInteger bigIntegerS = h87Var.s();
            BigInteger bigIntegerS2 = h87Var2.s();
            BigInteger bigIntegerS3 = h87Var3.s();
            return new b(this.g, this.h, B(bigInteger.multiply(bigIntegerS).add(bigIntegerS2.multiply(bigIntegerS3))));
        }

        @Override // defpackage.h87
        public h87 m() {
            if (this.i.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.g;
            return new b(bigInteger, this.h, bigInteger.subtract(this.i));
        }

        @Override // defpackage.h87
        public h87 n() {
            if (i() || h()) {
                return this;
            }
            if (!this.g.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.g.testBit(1)) {
                BigInteger bigIntegerAdd = this.g.shiftRight(2).add(y77.f39884b);
                BigInteger bigInteger = this.g;
                return u(new b(bigInteger, this.h, this.i.modPow(bigIntegerAdd, bigInteger)));
            }
            if (this.g.testBit(2)) {
                BigInteger bigIntegerModPow = this.i.modPow(this.g.shiftRight(3), this.g);
                BigInteger bigIntegerA = A(bigIntegerModPow, this.i);
                if (A(bigIntegerA, bigIntegerModPow).equals(y77.f39884b)) {
                    return u(new b(this.g, this.h, bigIntegerA));
                }
                return u(new b(this.g, this.h, A(bigIntegerA, y77.c.modPow(this.g.shiftRight(2), this.g))));
            }
            BigInteger bigIntegerShiftRight = this.g.shiftRight(1);
            BigInteger bigIntegerModPow2 = this.i.modPow(bigIntegerShiftRight, this.g);
            BigInteger bigInteger2 = y77.f39884b;
            if (!bigIntegerModPow2.equals(bigInteger2)) {
                return null;
            }
            BigInteger bigInteger3 = this.i;
            BigInteger bigIntegerX = x(x(bigInteger3));
            BigInteger bigIntegerAdd2 = bigIntegerShiftRight.add(bigInteger2);
            BigInteger bigIntegerSubtract = this.g.subtract(bigInteger2);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger4 = new BigInteger(this.g.bitLength(), random);
                if (bigInteger4.compareTo(this.g) < 0 && B(bigInteger4.multiply(bigInteger4).subtract(bigIntegerX)).modPow(bigIntegerShiftRight, this.g).equals(bigIntegerSubtract)) {
                    BigInteger[] bigIntegerArrV = v(bigInteger4, bigInteger3, bigIntegerAdd2);
                    BigInteger bigInteger5 = bigIntegerArrV[0];
                    BigInteger bigInteger6 = bigIntegerArrV[1];
                    if (A(bigInteger6, bigInteger6).equals(bigIntegerX)) {
                        return new b(this.g, this.h, y(bigInteger6));
                    }
                    if (!bigInteger5.equals(y77.f39884b) && !bigInteger5.equals(bigIntegerSubtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // defpackage.h87
        public h87 o() {
            BigInteger bigInteger = this.g;
            BigInteger bigInteger2 = this.h;
            BigInteger bigInteger3 = this.i;
            return new b(bigInteger, bigInteger2, A(bigInteger3, bigInteger3));
        }

        @Override // defpackage.h87
        public h87 p(h87 h87Var, h87 h87Var2) {
            BigInteger bigInteger = this.i;
            BigInteger bigIntegerS = h87Var.s();
            BigInteger bigIntegerS2 = h87Var2.s();
            return new b(this.g, this.h, B(bigInteger.multiply(bigInteger).add(bigIntegerS.multiply(bigIntegerS2))));
        }

        @Override // defpackage.h87
        public h87 q(h87 h87Var) {
            return new b(this.g, this.h, C(this.i, h87Var.s()));
        }

        @Override // defpackage.h87
        public BigInteger s() {
            return this.i;
        }

        public final h87 u(h87 h87Var) {
            if (h87Var.o().equals(this)) {
                return h87Var;
            }
            return null;
        }

        public final BigInteger[] v(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int iBitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigIntegerA = y77.f39884b;
            BigInteger bigIntegerB = bigInteger;
            BigInteger bigIntegerA2 = bigIntegerA;
            BigInteger bigIntegerB2 = y77.c;
            BigInteger bigIntegerA3 = bigIntegerA2;
            for (int i = iBitLength - 1; i >= lowestSetBit + 1; i--) {
                bigIntegerA = A(bigIntegerA, bigIntegerA3);
                if (bigInteger3.testBit(i)) {
                    bigIntegerA3 = A(bigIntegerA, bigInteger2);
                    bigIntegerA2 = A(bigIntegerA2, bigIntegerB);
                    bigIntegerB2 = B(bigIntegerB.multiply(bigIntegerB2).subtract(bigInteger.multiply(bigIntegerA)));
                    bigIntegerB = B(bigIntegerB.multiply(bigIntegerB).subtract(bigIntegerA3.shiftLeft(1)));
                } else {
                    BigInteger bigIntegerB3 = B(bigIntegerA2.multiply(bigIntegerB2).subtract(bigIntegerA));
                    BigInteger bigIntegerB4 = B(bigIntegerB.multiply(bigIntegerB2).subtract(bigInteger.multiply(bigIntegerA)));
                    bigIntegerB2 = B(bigIntegerB2.multiply(bigIntegerB2).subtract(bigIntegerA.shiftLeft(1)));
                    bigIntegerB = bigIntegerB4;
                    bigIntegerA2 = bigIntegerB3;
                    bigIntegerA3 = bigIntegerA;
                }
            }
            BigInteger bigIntegerA4 = A(bigIntegerA, bigIntegerA3);
            BigInteger bigIntegerA5 = A(bigIntegerA4, bigInteger2);
            BigInteger bigIntegerB5 = B(bigIntegerA2.multiply(bigIntegerB2).subtract(bigIntegerA4));
            BigInteger bigIntegerB6 = B(bigIntegerB.multiply(bigIntegerB2).subtract(bigInteger.multiply(bigIntegerA4)));
            BigInteger bigIntegerA6 = A(bigIntegerA4, bigIntegerA5);
            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                bigIntegerB5 = A(bigIntegerB5, bigIntegerB6);
                bigIntegerB6 = B(bigIntegerB6.multiply(bigIntegerB6).subtract(bigIntegerA6.shiftLeft(1)));
                bigIntegerA6 = A(bigIntegerA6, bigIntegerA6);
            }
            return new BigInteger[]{bigIntegerB5, bigIntegerB6};
        }

        public BigInteger w(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
            return bigIntegerAdd.compareTo(this.g) >= 0 ? bigIntegerAdd.subtract(this.g) : bigIntegerAdd;
        }

        public BigInteger x(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            return bigIntegerShiftLeft.compareTo(this.g) >= 0 ? bigIntegerShiftLeft.subtract(this.g) : bigIntegerShiftLeft;
        }

        public BigInteger y(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.g.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger z(BigInteger bigInteger) {
            int iF = f();
            int i = (iF + 31) >> 5;
            int[] iArrN = xgg.n(iF, this.g);
            int[] iArrN2 = xgg.n(iF, bigInteger);
            int[] iArrI = xgg.i(i);
            v6g.d(iArrN, iArrN2, iArrI);
            return xgg.O(i, iArrI);
        }

        public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.g = bigInteger;
            this.h = bigInteger2;
            this.i = bigInteger3;
        }
    }

    public abstract h87 a(h87 h87Var);

    public abstract h87 b();

    public int c() {
        return s().bitLength();
    }

    public abstract h87 d(h87 h87Var);

    public byte[] e() {
        return xi2.a((f() + 7) / 8, s());
    }

    public abstract int f();

    public abstract h87 g();

    public boolean h() {
        return c() == 1;
    }

    public boolean i() {
        return s().signum() == 0;
    }

    public abstract h87 j(h87 h87Var);

    public h87 k(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        return j(h87Var).q(h87Var2.j(h87Var3));
    }

    public h87 l(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        return j(h87Var).a(h87Var2.j(h87Var3));
    }

    public abstract h87 m();

    public abstract h87 n();

    public abstract h87 o();

    public h87 p(h87 h87Var, h87 h87Var2) {
        return o().a(h87Var.j(h87Var2));
    }

    public abstract h87 q(h87 h87Var);

    public boolean r() {
        return s().testBit(0);
    }

    public abstract BigInteger s();

    public String toString() {
        return s().toString(16);
    }

    public static class a extends h87 {
        public int g;
        public int h;
        public int[] i;
        public tre j;

        public a(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.g = 2;
                this.i = new int[]{i2};
            } else {
                if (i3 >= i4) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i3 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.g = 3;
                this.i = new int[]{i2, i3, i4};
            }
            this.h = i;
            this.j = new tre(bigInteger);
        }

        public static void t(h87 h87Var, h87 h87Var2) {
            if (!(h87Var instanceof a) || !(h87Var2 instanceof a)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            a aVar = (a) h87Var;
            a aVar2 = (a) h87Var2;
            if (aVar.g != aVar2.g) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            if (aVar.h != aVar2.h || !wj1.c(aVar.i, aVar2.i)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // defpackage.h87
        public h87 a(h87 h87Var) {
            tre treVar = (tre) this.j.clone();
            treVar.f(((a) h87Var).j, 0);
            return new a(this.h, this.i, treVar);
        }

        @Override // defpackage.h87
        public h87 b() {
            return new a(this.h, this.i, this.j.d());
        }

        @Override // defpackage.h87
        public int c() {
            return this.j.j();
        }

        @Override // defpackage.h87
        public h87 d(h87 h87Var) {
            return j(h87Var.g());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.h == aVar.h && this.g == aVar.g && wj1.c(this.i, aVar.i) && this.j.equals(aVar.j);
        }

        @Override // defpackage.h87
        public int f() {
            return this.h;
        }

        @Override // defpackage.h87
        public h87 g() {
            int i = this.h;
            int[] iArr = this.i;
            return new a(i, iArr, this.j.v(i, iArr));
        }

        @Override // defpackage.h87
        public boolean h() {
            return this.j.t();
        }

        public int hashCode() {
            return (this.j.hashCode() ^ this.h) ^ wj1.m(this.i);
        }

        @Override // defpackage.h87
        public boolean i() {
            return this.j.u();
        }

        @Override // defpackage.h87
        public h87 j(h87 h87Var) {
            int i = this.h;
            int[] iArr = this.i;
            return new a(i, iArr, this.j.w(((a) h87Var).j, i, iArr));
        }

        @Override // defpackage.h87
        public h87 k(h87 h87Var, h87 h87Var2, h87 h87Var3) {
            return l(h87Var, h87Var2, h87Var3);
        }

        @Override // defpackage.h87
        public h87 l(h87 h87Var, h87 h87Var2, h87 h87Var3) {
            tre treVar = this.j;
            tre treVar2 = ((a) h87Var).j;
            tre treVar3 = ((a) h87Var2).j;
            tre treVar4 = ((a) h87Var3).j;
            tre treVarZ = treVar.z(treVar2, this.h, this.i);
            tre treVarZ2 = treVar3.z(treVar4, this.h, this.i);
            if (treVarZ == treVar || treVarZ == treVar2) {
                treVarZ = (tre) treVarZ.clone();
            }
            treVarZ.f(treVarZ2, 0);
            treVarZ.B(this.h, this.i);
            return new a(this.h, this.i, treVarZ);
        }

        @Override // defpackage.h87
        public h87 m() {
            return this;
        }

        @Override // defpackage.h87
        public h87 n() {
            return (this.j.u() || this.j.t()) ? this : u(this.h - 1);
        }

        @Override // defpackage.h87
        public h87 o() {
            int i = this.h;
            int[] iArr = this.i;
            return new a(i, iArr, this.j.x(i, iArr));
        }

        @Override // defpackage.h87
        public h87 p(h87 h87Var, h87 h87Var2) {
            tre treVar = this.j;
            tre treVar2 = ((a) h87Var).j;
            tre treVar3 = ((a) h87Var2).j;
            tre treVarM = treVar.M(this.h, this.i);
            tre treVarZ = treVar2.z(treVar3, this.h, this.i);
            if (treVarM == treVar) {
                treVarM = (tre) treVarM.clone();
            }
            treVarM.f(treVarZ, 0);
            treVarM.B(this.h, this.i);
            return new a(this.h, this.i, treVarM);
        }

        @Override // defpackage.h87
        public h87 q(h87 h87Var) {
            return a(h87Var);
        }

        @Override // defpackage.h87
        public boolean r() {
            return this.j.Q();
        }

        @Override // defpackage.h87
        public BigInteger s() {
            return this.j.R();
        }

        public h87 u(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.h;
            int[] iArr = this.i;
            return new a(i2, iArr, this.j.y(i, i2, iArr));
        }

        public a(int i, int[] iArr, tre treVar) {
            this.h = i;
            this.g = iArr.length == 1 ? 2 : 3;
            this.i = iArr;
            this.j = treVar;
        }
    }
}
