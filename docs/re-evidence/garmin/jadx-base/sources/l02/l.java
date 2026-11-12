package l02;

import java.util.List;
import m92.h0;
import m92.o0;
import m92.u;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.w;
import p3.b2;
import p3.m1;
import r1.l0;
import r1.n;
import s1.t1;
import s5.q0;
import yz1.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f108010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f108011c;

    public /* synthetic */ l(Object obj, float f14, int i14) {
        this.f108009a = i14;
        this.f108011c = obj;
        this.f108010b = f14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f108009a) {
            case 0:
                m1 m1Var = (m1) this.f108011c;
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                m1Var.i(((int) (q0Var.f157282c >> 32)) / this.f108010b);
                return Unit.INSTANCE;
            case 1:
                i53.c cVar = (i53.c) this.f108011c;
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                return u.f(fVar, cVar, null, false, null, null, this.f108010b);
            case 2:
                h0.e.C2226e c2226e = (h0.e.C2226e) this.f108011c;
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                if (c2226e != null) {
                    return o0.a(fVar2, w.c(c2226e), Float.valueOf(1441.0f), s.g(), Float.valueOf(0.0f), Float.valueOf(this.f108010b), 24);
                }
                return i53.a.c();
            case 3:
                List list = (List) this.f108011c;
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                return o0.a(fVar3, list, Float.valueOf(1441.0f), s.g(), Float.valueOf(0.0f), Float.valueOf(this.f108010b), 24);
            case 4:
                t1 t1Var = (t1) this.f108011c;
                long jLongValue = ((Long) obj).longValue();
                boolean zI = t1Var.i();
                b2 b2Var = t1Var.f155750g;
                if (!zI) {
                    if (b2Var.j() == Long.MIN_VALUE) {
                        b2Var.k(jLongValue);
                        t1Var.f155744a.f155486a.setValue(Boolean.TRUE);
                    }
                    long j8 = jLongValue - b2Var.j();
                    float f14 = this.f108010b;
                    if (f14 != 0.0f) {
                        j8 = MathKt.d(j8 / ((double) f14));
                    }
                    t1Var.p(j8);
                    t1Var.j(j8, f14 == 0.0f);
                }
                return Unit.INSTANCE;
            default:
                e23.l lVar = (e23.l) this.f108011c;
                n nVar = (n) obj;
                return new l0(((l0) lVar.invoke(nVar)).f149138a, ((l0) lVar.invoke(nVar)).f149139b, this.f108010b, null);
        }
    }
}
