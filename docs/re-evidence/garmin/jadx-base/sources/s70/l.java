package s70;

import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class l {
    public static final void a(final float f14, final long j8, final float f15, final h4.r rVar, int i14, p3.m mVar, final int i15) {
        p3.o0 o0Var;
        final int i16;
        p3.o0 o0VarE = mVar.E(467857570);
        int i17 = i15 | (o0VarE.i(f14) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | 24576;
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Float.valueOf(0.0f));
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            int i18 = i17 & 14;
            a3.b1.a(((Number) s1.f.b(f14, s1.l.d(500, 0, s1.e0.f155560a, 2), "", o0VarE, i18 | 3072, 20).getF182175a()).floatValue(), rVar, j8, f15, 0L, o0VarE, ((i17 << 3) & 896) | 3120);
            o0Var = o0VarE;
            Float fValueOf = Float.valueOf(f14);
            boolean z14 = i18 == 4;
            Object objQ2 = o0Var.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new k(f14, p1Var, null);
                o0Var.K(objQ2);
            }
            p3.l0.e((e23.p) objQ2, fValueOf, o0Var);
            i16 = 500;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            i16 = i14;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(f14, j8, f15, rVar, i16, i15) { // from class: s70.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f157707a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f157708b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f157709c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ h4.r f157710d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f157711e;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(3457);
                    l.a(this.f157707a, this.f157708b, this.f157709c, this.f157710d, this.f157711e, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
