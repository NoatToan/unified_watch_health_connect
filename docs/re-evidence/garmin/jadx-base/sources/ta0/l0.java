package ta0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 {
    public static final void a(d90.c cVar, o90.a aVar, h4.r rVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1609488333);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (cVar instanceof d90.c.d) {
                o0VarE.C(-530054447);
                da0.f.b(aVar, rVar, o0VarE, (i15 >> 3) & 126);
                o0VarE.g0(false);
            } else if (cVar instanceof d90.c.C1246c) {
                o0VarE.C(-530049488);
                da0.f.b(o90.a.b(aVar, null, ((d90.c.C1246c) cVar).f58431b, null, null, null, null, null, null, 253), rVar, o0VarE, (i15 >> 3) & 112);
                o0VarE.g0(false);
            } else {
                if (!p005kotlin.jvm.internal.s.g(cVar, d90.c.b.INSTANCE)) {
                    throw kg.f.h(o0VarE, -530056396, false);
                }
                o0VarE.C(-530043785);
                d(rVar, o0VarE, (i15 >> 6) & 14);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rx1.u(cVar, aVar, rVar, i14, 27);
        }
    }

    public static final void b(l90.b bVar, d90.b bVar2, e23.a<Unit> aVar, e23.l<? super Float, Unit> lVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        e23.a<Unit> aVar3;
        e23.l<? super Float, Unit> lVar2;
        e23.a<Unit> aVar4;
        d90.b bVar3;
        bVar.getClass();
        bVar2.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-1794849296);
        int i15 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.B(bVar2) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            c(bVar.f111521f, bVar.f111526k, bVar2, aVar, lVar, aVar2, o0VarE, (i15 << 3) & 524160);
            bVar3 = bVar2;
            aVar4 = aVar;
            lVar2 = lVar;
            aVar3 = aVar2;
        } else {
            aVar3 = aVar2;
            lVar2 = lVar;
            aVar4 = aVar;
            bVar3 = bVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg2.g(bVar, bVar3, (e23.a) aVar4, (e23.l) lVar2, (e23.a) aVar3, i14);
        }
    }

    public static final void c(String str, o90.a aVar, d90.b bVar, e23.a<Unit> aVar2, e23.l<? super Float, Unit> lVar, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        int i15;
        Object obj;
        p3.o0 o0VarE = mVar.E(975524043);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            obj = lVar;
            i15 |= o0VarE.r(obj) ? 16384 : 8192;
        } else {
            obj = lVar;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            da0.p.d("device_discovery_scan_instructions_screen", false, aVar3, null, null, null, z3.f.c(1834756962, new sg2.g(bVar, aVar, obj, aVar2, str, 11), o0VarE), o0VarE, ((i16 >> 9) & 896) | 12582918, 122);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(str, aVar, bVar, aVar2, lVar, aVar3, i14);
        }
    }

    public static final void d(h4.r rVar, p3.m mVar, int i14) {
        int i15;
        byte b14;
        p3.o0 o0VarE = mVar.E(-1826186136);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarF, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            t4.d dVarA = n5.c.a(2131231803, o0VarE, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.default_image_view_content_description);
            f5.k.f68985a.getClass();
            f5.k.a.e eVar2 = f5.k.a.f68988c;
            h4.g gVar = h4.d.a.f81532j;
            h4.r.a aVar2 = h4.r.S;
            u1.y0.a(dVarA, strQ, uVar.c(x2.f(aVar2, 0.7f), h4.d.a.f81526d), gVar, eVar2, 0.0f, null, o0VarE, 27648, 96);
            h4.r rVarD = uVar.d(aVar2);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarD, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            c2.l.f(b0Var.a(aVar2, 0.4f, true), o0VarE);
            h4.r rVarA = b0Var.a(x2.f(aVar2, 0.7f), 0.3f, true);
            f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC4, o0VarE);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_device_setup_press_until_pair);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            d92.b.f58624b.getClass();
            b14 = 0;
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 3, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 196608, 97278);
            o0VarE = o0VarE;
            e5.u(o0VarE, true, true, true);
        } else {
            b14 = 0;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c2.p(rVar, i14, 3, b14);
        }
    }
}
