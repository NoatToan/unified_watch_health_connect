package yr;

import c2.x2;
import i3.mh;
import i3.ve;
import java.util.Iterator;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    public static final void a(nr.g.i iVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1740686972);
        int i15 = (o0VarE.B(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarF, f14, eVar.f97917b);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new xn.r(iVar, 26);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xn.r(iVar, 26);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarZ, false, null, null, (e23.a) objQ, 15);
            long jA = d92.b.a(o0VarE).c().a();
            bVar.getClass();
            ve.a(rVarD, k2.i.a(j92.b.f97900c.f97912d), jA, 0L, 0.0f, 0.0f, null, z3.f.c(-1880700905, new z(iVar), o0VarE), o0VarE, 12582912, 120);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z(iVar, i14);
        }
    }

    public static final void b(final nr.g.j jVar, p3.m mVar, final int i14) {
        p3.o0 o0Var;
        final int i15;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        String str;
        i53.c<nr.g.i> cVar = jVar.f127079a;
        p3.o0 o0VarE = mVar.E(-1567095488);
        int i16 = (o0VarE.B(jVar) ? 4 : 2) | i14;
        final int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (cVar.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar = new e23.p(jVar, i14, i17) { // from class: yr.y

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f198918a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ nr.g.j f198919b;

                        {
                            this.f198918a = i17;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = this.f198918a;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i18) {
                                case 0:
                                    a0.b(this.f198919b, mVar2, p3.p0.t(1));
                                    break;
                                default:
                                    a0.b(this.f198919b, mVar2, p3.p0.t(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                h4.r.a aVar = h4.r.S;
                h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarC = c2.l.C(rVarE, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                if (cVar.size() > 1) {
                    c22.x0.f23314a.getClass();
                    str = c22.x0.f23492ka;
                } else {
                    c22.x0.f23314a.getClass();
                    str = c22.x0.f23377da;
                }
                String strW = gl1.d.W(str);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
                bVar.getClass();
                float f14 = eVar.f97920e;
                bVar.getClass();
                float f15 = eVar.f97920e;
                bVar.getClass();
                mh.c(strW, c2.l.C(aVar, f14, f15, 0.0f, eVar.f97918c, 4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                o0Var.C(-345867648);
                Iterator<nr.g.i> it = cVar.iterator();
                while (it.hasNext()) {
                    a(it.next(), o0Var, 0);
                }
                o0Var.g0(false);
                i15 = 1;
                o0Var.g0(true);
                x1 x1Var2 = p3.n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        i15 = 1;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            pVar = new e23.p(jVar, i14, i15) { // from class: yr.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f198918a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ nr.g.j f198919b;

                {
                    this.f198918a = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f198918a;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            a0.b(this.f198919b, mVar2, p3.p0.t(1));
                            break;
                        default:
                            a0.b(this.f198919b, mVar2, p3.p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
