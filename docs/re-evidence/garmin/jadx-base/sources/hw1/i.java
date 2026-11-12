package hw1;

import c2.b0;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import i3.v5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<f> f85971a;

    static {
        s62.a aVar = s62.a.f157643a;
        aVar.getClass();
        t62.a aVar2 = t62.a.f162797a;
        u4.d dVarA = u62.a.a(aVar2);
        gl.c cVar = gl.c.f77766a;
        cVar.getClass();
        gl.e eVar = gl.c.f77767b;
        f fVar = new f(dVarA, eVar.f77772b0, "_Pre-run activation", "_01:15:00", "_Scheduled Workout", null, null, null, null, null, 992, null);
        aVar.getClass();
        u4.d dVarA2 = u62.a.a(aVar2);
        cVar.getClass();
        f85971a = x.k(fVar, new f(dVarA2, eVar.f77772b0, "_Tempo", "_01:30:00", null, null, null, null, null, null, 1008, null));
    }

    public static final void a(r rVar, ArrayList arrayList, m mVar, int i14) {
        o0 o0VarE = mVar.E(1424262557);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.r(arrayList) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            long jA = am.j.A(d92.b.f58623a, o0VarE);
            g6.f.a aVar = g6.f.f75994b;
            r rVarA = l.A(u1.n.e(rVar, jA, k2.i.a(8)), 0.0f, 0.0f, 3);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            r.a aVar3 = r.S;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(aVar3, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar2.getClass();
            float f15 = eVar2.f97920e;
            bVar2.getClass();
            es1.c.a(l.C(aVar3, f15, f14, eVar2.f97920e, 0.0f, 8), sn.a.g(gl1.y.Q(o0VarE, R.string.grouped_workouts)), 0L, 0L, o0VarE, 0, 12);
            o0VarE.C(-1903277436);
            Iterator it = arrayList.iterator();
            int i16 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    x.q();
                    throw null;
                }
                f fVar2 = (f) next;
                int i18 = i16;
                o0 o0Var = o0VarE;
                Iterator it3 = it;
                c(fVar2.f85946a, fVar2.f85947b, fVar2.f85948c, fVar2.f85949d, fVar2.f85950e, fVar2.f85951f, fVar2.f85952g, fVar2.f85953h, null, fVar2.f85955j, o0Var, 0, 256);
                o0VarE = o0Var;
                if (i18 < arrayList.size() - 1) {
                    o0VarE.C(-920591904);
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f16 = eVar3.f97920e;
                    bVar3.getClass();
                    v5.a(0.0f, 0, 2, sn.a.c(o0VarE), l.C(rVarF, f16, 0.0f, 0.0f, eVar3.f97918c, 6), o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-920237295);
                    o0VarE.g0(false);
                }
                i16 = i17;
                it = it3;
            }
            e5.u(o0VarE, false, true, true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(rVar, arrayList, i14, 0);
        }
    }

    public static final void b(r rVar, f fVar, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        r rVar3;
        o0 o0VarE = mVar.E(1374369352);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        int i18 = i16 | (o0VarE.B(fVar) ? 32 : 16);
        if (o0VarE.n(i18 & 1, (i18 & 19) != 18)) {
            rVar3 = i17 != 0 ? r.S : rVar2;
            x1 x1Var = n.f135158a;
            long jA = am.j.A(d92.b.f58623a, o0VarE);
            g6.f.a aVar = g6.f.f75994b;
            r rVarE = u1.n.e(rVar3, jA, k2.i.a(8));
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            u uVar = u.f22885a;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVar3, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar3 = r.S;
            d92.b.f58625c.getClass();
            l.f(x2.h(aVar3, j92.b.f97899b.f97918c), o0VarE);
            c(fVar.f85946a, fVar.f85947b, fVar.f85948c, fVar.f85949d, fVar.f85950e, fVar.f85951f, fVar.f85952g, fVar.f85953h, fVar.f85954i, fVar.f85955j, o0VarE, 0, 0);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f((Object) rVar3, (Object) fVar, false, i14, i15, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0289  */
    /* JADX WARN: Code duplicated, block: B:67:0x0113  */
    public static final void c(u4.d dVar, long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        String str8;
        int i16;
        o0 o0Var;
        String str9;
        o0 o0Var2;
        e0.a aVar2;
        r.a aVar3;
        o0 o0VarE = mVar.E(-724085065);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.B(str3) ? 16384 : 8192) | (o0VarE.B(str4) ? 131072 : 65536) | (o0VarE.B(str5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(str6) ? 8388608 : 4194304);
        int i18 = i15 & 256;
        if (i18 != 0) {
            i16 = i17 | 100663296;
            str8 = str7;
        } else {
            str8 = str7;
            i16 = i17 | (o0VarE.B(str8) ? 67108864 : 33554432);
        }
        int i19 = i16 | (o0VarE.r(aVar) ? 536870912 : 268435456);
        if (o0VarE.n(i19 & 1, (i19 & 306783379) != 306783378)) {
            String str10 = i18 != 0 ? null : str8;
            x1 x1Var = n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            r.a aVar4 = r.S;
            r rVarF = x2.f(aVar4, 1.0f);
            bVar.getClass();
            float f16 = eVar.f97918c;
            org.apache.commons.lang3.e.j(bVar);
            r rVarB = l.B(rVarF, f15, f16, f15, f15);
            boolean z14 = aVar != null;
            boolean z15 = (i19 & 1879048192) == 536870912;
            Object objQ = o0VarE.q();
            m.a aVar5 = m.f135153a;
            if (z15) {
                objQ = new gt1.s(aVar, 17);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new gt1.s(aVar, 17);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarB, z14, null, null, (e23.a) objQ, 14);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (str10 == null) {
                o0VarE.C(-980340118);
                o0VarE.g0(false);
                aVar2 = aVar6;
                o0Var2 = o0VarE;
                aVar3 = aVar4;
            } else {
                o0VarE.C(-980340117);
                o0Var2 = o0VarE;
                aVar2 = aVar6;
                aVar3 = aVar4;
                es1.c.a(null, str10, 0L, 0L, o0Var2, 0, 13);
                Unit unit = Unit.INSTANCE;
                o0Var2.g0(false);
            }
            s2 s2VarA = q2.a(c2.j.f22692b, ((double) ((g6.c) o0Var2.A(t1.f91490h)).getF94882b()) > 1.5d ? h4.d.a.f81533k : h4.d.a.f81534l, o0Var2, 0);
            int iHashCode2 = Long.hashCode(o0Var2.U);
            i2 i2VarA1 = o0Var2.a0();
            r rVarC2 = k.c(aVar3, o0Var2);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar2);
            } else {
                o0Var2.c();
            }
            b4.c(eVar2, s2VarA, o0Var2);
            b4.c(c1623g, i2VarA1, o0Var2);
            if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0Var2);
            u2 u2Var = u2.f22900a;
            g6.f.a aVar7 = g6.f.f75994b;
            r rVarC3 = l.C(aVar3, 0.0f, 0.0f, 12, 0.0f, 11);
            long jG = d92.b.a(o0Var2).c().g();
            bVar.getClass();
            int i24 = i19 << 3;
            o0 o0Var3 = o0Var2;
            g02.i.a(rVarC3, dVar, j8, jG, j92.b.f97901d.f97906e, 0.0f, null, o0Var3, (i24 & 112) | 6 | (i24 & 896), 224);
            if (d53.w.J(str2) && (str3 == null || d53.w.J(str3))) {
                o0Var3.C(-1876308138);
                boolean z16 = (i19 & 458752) == 131072;
                Object objQ2 = o0Var3.q();
                if (z16) {
                    objQ2 = new gp.j(str4, 26);
                    o0Var3.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new gp.j(str4, 26);
                        o0Var3.K(objQ2);
                    }
                }
                r rVarC4 = v.c((e23.l) objQ2, aVar3, false);
                d92.b.f58624b.getClass();
                mh.c(str, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0Var3), o0Var3, (i19 >> 6) & 14, 0, 131068);
                o0Var = o0Var3;
                o0Var.g0(false);
            } else {
                o0Var3.C(-1875889421);
                d92.b.f58624b.getClass();
                int i25 = i19 >> 6;
                int i26 = i19 << 6;
                g02.e0.a(str, str2, str3, null, false, false, true, str4, str5, str6, null, d92.c.b(d92.c.e(j92.f.f97930g), o0Var3), o0Var3, (i25 & 896) | (i25 & 14) | 1597440 | (i25 & 112) | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), 0, 1064);
                o0Var = o0Var3;
                o0Var.g0(false);
            }
            o0Var.g0(true);
            o0Var.g0(true);
            str9 = str10;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str9 = str8;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(dVar, j8, str, str2, str3, str4, str5, str6, str9, aVar, i14, i15);
        }
    }
}
