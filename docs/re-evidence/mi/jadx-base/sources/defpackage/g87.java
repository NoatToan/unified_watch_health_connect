package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g87 implements z77 {

    public static class a extends g87 {
        public int g;
        public int h;
        public int[] i;
        public sre j;

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
            this.j = new sre(bigInteger);
        }

        public static void u(g87 g87Var, g87 g87Var2) {
            if (!(g87Var instanceof a) || !(g87Var2 instanceof a)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            a aVar = (a) g87Var;
            a aVar2 = (a) g87Var2;
            if (aVar.g != aVar2.g) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            if (aVar.h != aVar2.h || !vj1.c(aVar.i, aVar2.i)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // defpackage.g87
        public g87 a(g87 g87Var) {
            sre sreVar = (sre) this.j.clone();
            sreVar.f(((a) g87Var).j, 0);
            return new a(this.h, this.i, sreVar);
        }

        @Override // defpackage.g87
        public g87 b() {
            return new a(this.h, this.i, this.j.d());
        }

        @Override // defpackage.g87
        public int c() {
            return this.j.j();
        }

        @Override // defpackage.g87
        public g87 d(g87 g87Var) {
            return j(g87Var.g());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.h == aVar.h && this.g == aVar.g && vj1.c(this.i, aVar.i) && this.j.equals(aVar.j);
        }

        @Override // defpackage.g87
        public int f() {
            return this.h;
        }

        @Override // defpackage.g87
        public g87 g() {
            int i = this.h;
            int[] iArr = this.i;
            return new a(i, iArr, this.j.v(i, iArr));
        }

        @Override // defpackage.g87
        public boolean h() {
            return this.j.t();
        }

        public int hashCode() {
            return (this.j.hashCode() ^ this.h) ^ vj1.s(this.i);
        }

        @Override // defpackage.g87
        public boolean i() {
            return this.j.u();
        }

        @Override // defpackage.g87
        public g87 j(g87 g87Var) {
            int i = this.h;
            int[] iArr = this.i;
            return new a(i, iArr, this.j.w(((a) g87Var).j, i, iArr));
        }

        @Override // defpackage.g87
        public g87 k(g87 g87Var, g87 g87Var2, g87 g87Var3) {
            return l(g87Var, g87Var2, g87Var3);
        }

        @Override // defpackage.g87
        public g87 l(g87 g87Var, g87 g87Var2, g87 g87Var3) {
            sre sreVar = this.j;
            sre sreVar2 = ((a) g87Var).j;
            sre sreVar3 = ((a) g87Var2).j;
            sre sreVar4 = ((a) g87Var3).j;
            sre sreVarZ = sreVar.z(sreVar2, this.h, this.i);
            sre sreVarZ2 = sreVar3.z(sreVar4, this.h, this.i);
            if (sreVarZ == sreVar || sreVarZ == sreVar2) {
                sreVarZ = (sre) sreVarZ.clone();
            }
            sreVarZ.f(sreVarZ2, 0);
            sreVarZ.B(this.h, this.i);
            return new a(this.h, this.i, sreVarZ);
        }

        @Override // defpackage.g87
        public g87 m() {
            return this;
        }

        @Override // defpackage.g87
        public g87 n() {
            return (this.j.u() || this.j.t()) ? this : q(this.h - 1);
        }

        @Override // defpackage.g87
        public g87 o() {
            int i = this.h;
            int[] iArr = this.i;
            return new a(i, iArr, this.j.x(i, iArr));
        }

        @Override // defpackage.g87
        public g87 p(g87 g87Var, g87 g87Var2) {
            sre sreVar = this.j;
            sre sreVar2 = ((a) g87Var).j;
            sre sreVar3 = ((a) g87Var2).j;
            sre sreVarM = sreVar.M(this.h, this.i);
            sre sreVarZ = sreVar2.z(sreVar3, this.h, this.i);
            if (sreVarM == sreVar) {
                sreVarM = (sre) sreVarM.clone();
            }
            sreVarM.f(sreVarZ, 0);
            sreVarM.B(this.h, this.i);
            return new a(this.h, this.i, sreVarM);
        }

        @Override // defpackage.g87
        public g87 q(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.h;
            int[] iArr = this.i;
            return new a(i2, iArr, this.j.y(i, i2, iArr));
        }

        @Override // defpackage.g87
        public g87 r(g87 g87Var) {
            return a(g87Var);
        }

        @Override // defpackage.g87
        public boolean s() {
            return this.j.Q();
        }

        @Override // defpackage.g87
        public BigInteger t() {
            return this.j.R();
        }

        public a(int i, int[] iArr, sre sreVar) {
            this.h = i;
            this.g = iArr.length == 1 ? 2 : 3;
            this.i = iArr;
            this.j = sreVar;
        }
    }

    public static class b extends g87 {
        public BigInteger g;
        public BigInteger h;
        public BigInteger i;

        public b(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, u(bigInteger), bigInteger2);
        }

        public static BigInteger u(BigInteger bigInteger) {
            int iBitLength = bigInteger.bitLength();
            if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
                return null;
            }
            return z77.f40976b.shiftLeft(iBitLength).subtract(bigInteger);
        }

        public BigInteger A(BigInteger bigInteger) {
            int iF = f();
            int i = (iF + 31) >> 5;
            int[] iArrN = mhg.n(iF, this.g);
            int[] iArrN2 = mhg.n(iF, bigInteger);
            int[] iArrI = mhg.i(i);
            w6g.d(iArrN, iArrN2, iArrI);
            return mhg.O(i, iArrI);
        }

        public BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
            return C(bigInteger.multiply(bigInteger2));
        }

        public BigInteger C(BigInteger bigInteger) {
            if (this.h == null) {
                return bigInteger.mod(this.g);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = this.g.bitLength();
            boolean zEquals = this.h.equals(z77.f40976b);
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

        public BigInteger D(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            return bigIntegerSubtract.signum() < 0 ? bigIntegerSubtract.add(this.g) : bigIntegerSubtract;
        }

        @Override // defpackage.g87
        public g87 a(g87 g87Var) {
            return new b(this.g, this.h, x(this.i, g87Var.t()));
        }

        @Override // defpackage.g87
        public g87 b() {
            BigInteger bigIntegerAdd = this.i.add(z77.f40976b);
            if (bigIntegerAdd.compareTo(this.g) == 0) {
                bigIntegerAdd = z77.f40975a;
            }
            return new b(this.g, this.h, bigIntegerAdd);
        }

        @Override // defpackage.g87
        public g87 d(g87 g87Var) {
            return new b(this.g, this.h, B(this.i, A(g87Var.t())));
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

        @Override // defpackage.g87
        public int f() {
            return this.g.bitLength();
        }

        @Override // defpackage.g87
        public g87 g() {
            return new b(this.g, this.h, A(this.i));
        }

        public int hashCode() {
            return this.g.hashCode() ^ this.i.hashCode();
        }

        @Override // defpackage.g87
        public g87 j(g87 g87Var) {
            return new b(this.g, this.h, B(this.i, g87Var.t()));
        }

        @Override // defpackage.g87
        public g87 k(g87 g87Var, g87 g87Var2, g87 g87Var3) {
            BigInteger bigInteger = this.i;
            BigInteger bigIntegerT = g87Var.t();
            BigInteger bigIntegerT2 = g87Var2.t();
            BigInteger bigIntegerT3 = g87Var3.t();
            return new b(this.g, this.h, C(bigInteger.multiply(bigIntegerT).subtract(bigIntegerT2.multiply(bigIntegerT3))));
        }

        @Override // defpackage.g87
        public g87 l(g87 g87Var, g87 g87Var2, g87 g87Var3) {
            BigInteger bigInteger = this.i;
            BigInteger bigIntegerT = g87Var.t();
            BigInteger bigIntegerT2 = g87Var2.t();
            BigInteger bigIntegerT3 = g87Var3.t();
            return new b(this.g, this.h, C(bigInteger.multiply(bigIntegerT).add(bigIntegerT2.multiply(bigIntegerT3))));
        }

        @Override // defpackage.g87
        public g87 m() {
            if (this.i.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.g;
            return new b(bigInteger, this.h, bigInteger.subtract(this.i));
        }

        @Override // defpackage.g87
        public g87 n() {
            if (i() || h()) {
                return this;
            }
            if (!this.g.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.g.testBit(1)) {
                BigInteger bigIntegerAdd = this.g.shiftRight(2).add(z77.f40976b);
                BigInteger bigInteger = this.g;
                return v(new b(bigInteger, this.h, this.i.modPow(bigIntegerAdd, bigInteger)));
            }
            if (this.g.testBit(2)) {
                BigInteger bigIntegerModPow = this.i.modPow(this.g.shiftRight(3), this.g);
                BigInteger bigIntegerB = B(bigIntegerModPow, this.i);
                if (B(bigIntegerB, bigIntegerModPow).equals(z77.f40976b)) {
                    return v(new b(this.g, this.h, bigIntegerB));
                }
                return v(new b(this.g, this.h, B(bigIntegerB, z77.c.modPow(this.g.shiftRight(2), this.g))));
            }
            BigInteger bigIntegerShiftRight = this.g.shiftRight(1);
            BigInteger bigIntegerModPow2 = this.i.modPow(bigIntegerShiftRight, this.g);
            BigInteger bigInteger2 = z77.f40976b;
            if (!bigIntegerModPow2.equals(bigInteger2)) {
                return null;
            }
            BigInteger bigInteger3 = this.i;
            BigInteger bigIntegerY = y(y(bigInteger3));
            BigInteger bigIntegerAdd2 = bigIntegerShiftRight.add(bigInteger2);
            BigInteger bigIntegerSubtract = this.g.subtract(bigInteger2);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger4 = new BigInteger(this.g.bitLength(), random);
                if (bigInteger4.compareTo(this.g) < 0 && C(bigInteger4.multiply(bigInteger4).subtract(bigIntegerY)).modPow(bigIntegerShiftRight, this.g).equals(bigIntegerSubtract)) {
                    BigInteger[] bigIntegerArrW = w(bigInteger4, bigInteger3, bigIntegerAdd2);
                    BigInteger bigInteger5 = bigIntegerArrW[0];
                    BigInteger bigInteger6 = bigIntegerArrW[1];
                    if (B(bigInteger6, bigInteger6).equals(bigIntegerY)) {
                        return new b(this.g, this.h, z(bigInteger6));
                    }
                    if (!bigInteger5.equals(z77.f40976b) && !bigInteger5.equals(bigIntegerSubtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // defpackage.g87
        public g87 o() {
            BigInteger bigInteger = this.g;
            BigInteger bigInteger2 = this.h;
            BigInteger bigInteger3 = this.i;
            return new b(bigInteger, bigInteger2, B(bigInteger3, bigInteger3));
        }

        @Override // defpackage.g87
        public g87 p(g87 g87Var, g87 g87Var2) {
            BigInteger bigInteger = this.i;
            BigInteger bigIntegerT = g87Var.t();
            BigInteger bigIntegerT2 = g87Var2.t();
            return new b(this.g, this.h, C(bigInteger.multiply(bigInteger).add(bigIntegerT.multiply(bigIntegerT2))));
        }

        @Override // defpackage.g87
        public g87 r(g87 g87Var) {
            return new b(this.g, this.h, D(this.i, g87Var.t()));
        }

        @Override // defpackage.g87
        public BigInteger t() {
            return this.i;
        }

        public final g87 v(g87 g87Var) {
            if (g87Var.o().equals(this)) {
                return g87Var;
            }
            return null;
        }

        public final BigInteger[] w(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int iBitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigIntegerB = z77.f40976b;
            BigInteger bigIntegerC = bigInteger;
            BigInteger bigIntegerB2 = bigIntegerB;
            BigInteger bigIntegerC2 = z77.c;
            BigInteger bigIntegerB3 = bigIntegerB2;
            for (int i = iBitLength - 1; i >= lowestSetBit + 1; i--) {
                bigIntegerB = B(bigIntegerB, bigIntegerB3);
                if (bigInteger3.testBit(i)) {
                    bigIntegerB3 = B(bigIntegerB, bigInteger2);
                    bigIntegerB2 = B(bigIntegerB2, bigIntegerC);
                    bigIntegerC2 = C(bigIntegerC.multiply(bigIntegerC2).subtract(bigInteger.multiply(bigIntegerB)));
                    bigIntegerC = C(bigIntegerC.multiply(bigIntegerC).subtract(bigIntegerB3.shiftLeft(1)));
                } else {
                    BigInteger bigIntegerC3 = C(bigIntegerB2.multiply(bigIntegerC2).subtract(bigIntegerB));
                    BigInteger bigIntegerC4 = C(bigIntegerC.multiply(bigIntegerC2).subtract(bigInteger.multiply(bigIntegerB)));
                    bigIntegerC2 = C(bigIntegerC2.multiply(bigIntegerC2).subtract(bigIntegerB.shiftLeft(1)));
                    bigIntegerC = bigIntegerC4;
                    bigIntegerB2 = bigIntegerC3;
                    bigIntegerB3 = bigIntegerB;
                }
            }
            BigInteger bigIntegerB4 = B(bigIntegerB, bigIntegerB3);
            BigInteger bigIntegerB5 = B(bigIntegerB4, bigInteger2);
            BigInteger bigIntegerC5 = C(bigIntegerB2.multiply(bigIntegerC2).subtract(bigIntegerB4));
            BigInteger bigIntegerC6 = C(bigIntegerC.multiply(bigIntegerC2).subtract(bigInteger.multiply(bigIntegerB4)));
            BigInteger bigIntegerB6 = B(bigIntegerB4, bigIntegerB5);
            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                bigIntegerC5 = B(bigIntegerC5, bigIntegerC6);
                bigIntegerC6 = C(bigIntegerC6.multiply(bigIntegerC6).subtract(bigIntegerB6.shiftLeft(1)));
                bigIntegerB6 = B(bigIntegerB6, bigIntegerB6);
            }
            return new BigInteger[]{bigIntegerC5, bigIntegerC6};
        }

        public BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
            return bigIntegerAdd.compareTo(this.g) >= 0 ? bigIntegerAdd.subtract(this.g) : bigIntegerAdd;
        }

        public BigInteger y(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            return bigIntegerShiftLeft.compareTo(this.g) >= 0 ? bigIntegerShiftLeft.subtract(this.g) : bigIntegerShiftLeft;
        }

        public BigInteger z(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.g.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
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

    public abstract g87 a(g87 g87Var);

    public abstract g87 b();

    public int c() {
        return t().bitLength();
    }

    public abstract g87 d(g87 g87Var);

    public byte[] e() {
        return yi2.a((f() + 7) / 8, t());
    }

    public abstract int f();

    public abstract g87 g();

    public boolean h() {
        return c() == 1;
    }

    public boolean i() {
        return t().signum() == 0;
    }

    public abstract g87 j(g87 g87Var);

    public g87 k(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        return j(g87Var).r(g87Var2.j(g87Var3));
    }

    public g87 l(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        return j(g87Var).a(g87Var2.j(g87Var3));
    }

    public abstract g87 m();

    public abstract g87 n();

    public abstract g87 o();

    public g87 p(g87 g87Var, g87 g87Var2) {
        return o().a(g87Var.j(g87Var2));
    }

    public g87 q(int i) {
        g87 g87VarO = this;
        for (int i2 = 0; i2 < i; i2++) {
            g87VarO = g87VarO.o();
        }
        return g87VarO;
    }

    public abstract g87 r(g87 g87Var);

    public boolean s() {
        return t().testBit(0);
    }

    public abstract BigInteger t();

    public String toString() {
        return t().toString(16);
    }
}
