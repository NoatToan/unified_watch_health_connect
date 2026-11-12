package z2;

/* JADX INFO: loaded from: classes.dex */
public final class v2 {
    public static final long a(s5.q0 q0Var, int i14, boolean z14, boolean z15) {
        s5.o oVar = q0Var.f157281b;
        long j8 = q0Var.f157282c;
        int iD = oVar.d(i14);
        if (iD >= oVar.f157257f) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(j23.t.d(q0Var.f(i14, q0Var.a(((!z14 || z15) && (z14 || !z15)) ? Math.max(i14 + (-1), 0) : i14) == q0Var.j(i14)), 0.0f, (int) (j8 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(j23.t.d(oVar.b(iD), 0.0f, (int) (j8 & 4294967295L)))) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }
}
