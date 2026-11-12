package wb1;

import c2.b0;
import c2.x2;
import c2.z;
import c80.y0;
import e23.p;
import h4.r;
import i3.ve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.y;
import o4.d0;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;
import zd0.e0;
import zd0.q0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static final void a(r rVar, e0 e0Var, p3.m mVar, int i14) {
        r rVar2;
        o0 o0VarE = mVar.E(1496013126);
        int i15 = i14 | 6 | (o0VarE.r(e0Var) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            rVar2 = r.S;
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            r rVarF = x2.f(u1.n.e(l4.k.b(rVar2, k2.i.a(j92.b.f97900c.f97911c)), v.h.t(o0VarE), m1.f128891a), 1.0f);
            bVar.getClass();
            r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
            d0.f128823b.getClass();
            ve.a(rVarY, null, d0.f128831j, 0L, 0.0f, 0.0f, null, z3.f.c(-1787943455, new vy0.e(e0Var, 7), o0VarE), o0VarE, 12583296, 122);
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a(rVar2, e0Var, i14, 29);
        }
    }

    public static final void b(r rVar, final y yVar, final a aVar, p3.m mVar, final int i14) {
        final r rVar2;
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar;
        Object next;
        yVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(230941332);
        int i15 = i14 | 6 | (o0VarE.r(yVar) ? 32 : 16) | (o0VarE.B(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            final r.a aVar2 = r.S;
            x1 x1Var = p3.n.f135158a;
            q0 q0Var = (q0) KoinJavaComponent.get$default(q0.class, null, null, 6, null);
            Iterator<T> it = q0Var.o().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((y0) next).f25637a.equals(aVar.f183870a));
            y0 y0Var = (y0) next;
            if (y0Var == null) {
                yVar.n();
                x1 x1Var2 = p3.n.f135158a;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new p(aVar2, yVar, aVar, i14, i16) { // from class: wb1.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f183872a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r f183873b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ y f183874c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ a f183875d;

                    {
                        this.f183872a = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = this.f183872a;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i17) {
                            case 0:
                                c.b(this.f183873b, this.f183874c, this.f183875d, mVar2, p0.t(1));
                                break;
                            default:
                                c.b(this.f183873b, this.f183874c, this.f183875d, mVar2, p0.t(1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                List<e0> listS = q0Var.s();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listS) {
                    if (h0.R(y0Var.f25646j.a(), ((e0) obj).a())) {
                        arrayList.add(obj);
                    }
                }
                r rVarE = u1.n.e(a2.b(aVar2, a2.a(o0VarE), true), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                r rVarA = c2.l.A(rVarE, 0.0f, eVar.f97920e, 1);
                bVar.getClass();
                r rVarA2 = c2.l.A(rVarA, eVar.f97920e, 0.0f, 2);
                c2.j jVar = c2.j.f22691a;
                bVar.getClass();
                float f14 = eVar.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f14);
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var3 = p3.n.f135158a;
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = h4.k.c(rVarA2, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                k.a(null, y0Var, null, o0VarE, 64, 5);
                o0VarE.C(1488745595);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    a(null, (e0) it3.next(), o0VarE, 0);
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                x1 x1Var4 = p3.n.f135158a;
                rVar2 = aVar2;
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        rVar2 = rVar;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new p(rVar2, yVar, aVar, i14, i17) { // from class: wb1.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f183872a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f183873b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ y f183874c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a f183875d;

                {
                    this.f183872a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    int i18 = this.f183872a;
                    p3.m mVar2 = (p3.m) obj2;
                    ((Integer) obj3).getClass();
                    switch (i18) {
                        case 0:
                            c.b(this.f183873b, this.f183874c, this.f183875d, mVar2, p0.t(1));
                            break;
                        default:
                            c.b(this.f183873b, this.f183874c, this.f183875d, mVar2, p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
