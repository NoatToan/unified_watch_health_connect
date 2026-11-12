package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class qva extends o00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a87 f31879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pva f31880b;

    public qva(a87 a87Var, pva pvaVar) {
        if (a87Var == null || a87Var.v() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.f31879a = a87Var;
        this.f31880b = pvaVar;
    }

    @Override // defpackage.o00
    public h97 b(h97 h97Var, BigInteger bigInteger) {
        if (!this.f31879a.l(h97Var.i())) {
            throw new IllegalStateException();
        }
        BigInteger[] bigIntegerArrA = this.f31880b.a(bigInteger.mod(h97Var.i().v()));
        BigInteger bigInteger2 = bigIntegerArrA[0];
        BigInteger bigInteger3 = bigIntegerArrA[1];
        k97 k97VarC = this.f31880b.c();
        return this.f31880b.b() ? v77.b(h97Var, bigInteger2, k97VarC, bigInteger3) : v77.a(h97Var, bigInteger2, k97VarC.a(h97Var), bigInteger3);
    }
}
