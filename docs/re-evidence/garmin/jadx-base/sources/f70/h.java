package f70;

import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import g6.o;
import h4.k;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import kotlin.t1;
import n92.l;
import o4.m1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.s0;
import w5.q;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static final void a(o82.g gVar, k61.b bVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1461131554);
        int i15 = (i14 & 6) == 0 ? (o0VarE.k(gVar.ordinal()) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(bVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            i53.c<DateTime> cVar = bVar.f103165c;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            for (DateTime dateTime : cVar) {
                j0.f23099a.getClass();
                arrayList.add(j0.k(dateTime, 'S'));
            }
            s0 s0Var = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (o) o0VarE.A(t1.f91496n), 0, 8, null);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            l lVar = new l(arrayList, s0Var, d92.c.f(j92.f.f97935l, o0VarE));
            r.a aVar3 = r.S;
            r rVarF = x2.f(aVar3, 1.0f);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            r rVarH = x2.h(rVarF, f14);
            long jB = d92.b.a(o0VarE).c().b();
            m1.a aVar4 = m1.f128891a;
            c2.l.f(u1.n.e(rVarH, jB, aVar4), o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.activities_training_effect_anaerobic_capacity);
            gl.c.f77766a.getClass();
            d70.b bVar4 = new d70.b(strQ, gl.c.a(o0VarE).k(), bVar.f103163a, bVar.f103168f, arrayList.size(), lVar, null);
            bVar3.getClass();
            float f16 = eVar.f97920e;
            bVar3.getClass();
            float f17 = eVar.f97920e;
            bVar3.getClass();
            int i16 = (i15 << 6) & 896;
            d70.j.b(c2.l.C(aVar3, f16, 0.0f, f17, eVar.f97920e, 2), bVar4, gVar, o0VarE, i16);
            r rVarF2 = x2.f(aVar3, 1.0f);
            bVar3.getClass();
            c2.l.f(u1.n.e(x2.h(rVarF2, f15), d92.b.a(o0VarE).c().b(), aVar4), o0VarE);
            d70.b bVar5 = new d70.b(gl1.y.Q(o0VarE, R.string.lbl_aerobic_capacity), gl.c.a(o0VarE).i(), bVar.f103163a, bVar.f103169g, arrayList.size(), lVar, null);
            bVar3.getClass();
            float f18 = eVar.f97920e;
            bVar3.getClass();
            float f19 = eVar.f97920e;
            bVar3.getClass();
            d70.j.b(c2.l.C(aVar3, f18, 0.0f, f19, eVar.f97920e, 2), bVar5, gVar, o0VarE, i16);
            r rVarF3 = x2.f(aVar3, 1.0f);
            bVar3.getClass();
            c2.l.f(u1.n.e(x2.h(rVarF3, f15), d92.b.a(o0VarE).c().b(), aVar4), o0VarE);
            d70.b bVar6 = new d70.b(gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance), gl.c.a(o0VarE).o(), bVar.f103163a, bVar.f103170h, arrayList.size(), lVar, null);
            bVar3.getClass();
            float f22 = eVar.f97920e;
            bVar3.getClass();
            float f24 = eVar.f97920e;
            bVar3.getClass();
            d70.j.b(c2.l.C(aVar3, f22, 0.0f, f24, eVar.f97920e, 2), bVar6, gVar, o0VarE, i16);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(gVar, bVar, i14, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(o82.g gVar, u82.f<k61.b> fVar, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        gVar.getClass();
        fVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1041481093);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(gVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (fVar instanceof u82.f.c) {
                o0VarE.C(80723851);
                k61.b bVar = (k61.b) ((u82.f.c) fVar).f169497b;
                if (bVar != null) {
                    o0VarE.C(80785851);
                    if (bVar.f103168f.isEmpty() && bVar.f103169g.isEmpty() && bVar.f103170h.isEmpty()) {
                        o0VarE.C(80934434);
                        r20.e.c(o0VarE, 0);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(81009330);
                        a(gVar, bVar, o0VarE, i15 & 14);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(81112746);
                    r20.e.c(o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else if (fVar instanceof u82.f.a) {
                o0VarE.C(81224718);
                r20.f.a(aVar, (i15 >> 6) & 14, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                if (!(fVar instanceof u82.f.b)) {
                    throw kg.f.h(o0VarE, -135944922, false);
                }
                o0VarE.C(-135924065);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(gVar, fVar, aVar, i14, 2);
        }
    }
}
