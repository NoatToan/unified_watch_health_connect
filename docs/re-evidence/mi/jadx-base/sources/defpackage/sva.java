package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class sva implements pva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a87 f34021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uva f34022b;
    public final k97 c;

    public sva(a87 a87Var, uva uvaVar) {
        this.f34021a = a87Var;
        this.f34022b = uvaVar;
        this.c = new obl(a87Var.m(uvaVar.b()));
    }

    @Override // defpackage.pva
    public BigInteger[] a(BigInteger bigInteger) {
        int iC = this.f34022b.c();
        BigInteger bigIntegerD = d(bigInteger, this.f34022b.d(), iC);
        BigInteger bigIntegerD2 = d(bigInteger, this.f34022b.e(), iC);
        uva uvaVar = this.f34022b;
        return new BigInteger[]{bigInteger.subtract(bigIntegerD.multiply(uvaVar.f()).add(bigIntegerD2.multiply(uvaVar.h()))), bigIntegerD.multiply(uvaVar.g()).add(bigIntegerD2.multiply(uvaVar.i())).negate()};
    }

    @Override // defpackage.f87
    public boolean b() {
        return true;
    }

    @Override // defpackage.f87
    public k97 c() {
        return this.c;
    }

    public BigInteger d(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2.abs());
        boolean zTestBit = bigIntegerMultiply.testBit(i - 1);
        BigInteger bigIntegerShiftRight = bigIntegerMultiply.shiftRight(i);
        if (zTestBit) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(z77.f40976b);
        }
        return z ? bigIntegerShiftRight.negate() : bigIntegerShiftRight;
    }
}
