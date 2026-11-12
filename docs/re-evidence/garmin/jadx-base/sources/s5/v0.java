package s5;

import o4.q1;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    public static final void a(q4.h hVar, q0 q0Var) {
        if (q0Var.e()) {
            int i14 = q0Var.f157280a.f157270f;
            d6.p.f57793b.getClass();
            if (i14 == d6.p.f57796e) {
                return;
            }
            long j8 = q0Var.f157282c;
            q4.h.c(hVar, (int) (j8 >> 32), (int) (j8 & 4294967295L), 16);
        }
    }

    public static void b(q4.f fVar, q0 q0Var, long j8, long j14, int i14) {
        long jC;
        if ((i14 & 2) != 0) {
            o4.d0.f128823b.getClass();
            jC = o4.d0.f128832k;
        } else {
            jC = j8;
        }
        q4.f.f142555o0.getClass();
        int i15 = q4.f.a.f142557b;
        i0 i0Var = q0Var.f157280a.f157266b.f157322a;
        q1 q1Var = i0Var.shadow;
        d6.i iVar = i0Var.background;
        q4.g gVar = i0Var.drawStyle;
        q4.a.b f142543b = fVar.getF142543b();
        long jB = f142543b.b();
        f142543b.a().l();
        try {
            q4.b bVar = f142543b.f142550a;
            bVar.h(Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)));
            a(bVar, q0Var);
            x0 x0Var = q0Var.f157280a.f157266b;
            o4.w wVarB = x0Var.b();
            if (wVarB == null || jC != 16) {
                o oVar = q0Var.f157281b;
                o4.y yVarA = fVar.getF142543b().a();
                if (jC == 16) {
                    jC = x0Var.c();
                }
                oVar.i(yVarA, d6.k.a(Float.NaN, jC), q1Var, iVar, gVar, i15);
            } else {
                q0Var.f157281b.k(fVar.getF142543b().a(), wVarB, Float.isNaN(Float.NaN) ? x0Var.f157322a.f157211a.getF57706c() : Float.NaN, q1Var, iVar, gVar, i15);
            }
        } finally {
            tn.k.p(f142543b, jB);
        }
    }
}
