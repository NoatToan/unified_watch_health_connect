package r40;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.exoplayer2.C;
import f12.l;
import h4.r;
import h5.e0;
import i3.h1;
import i3.mh;
import i3.tb;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import qw0.y;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:56:0x01ed  */
    public static final void a(r rVar, List list, boolean z14, y yVar, m mVar, int i14) {
        boolean z15;
        int i15;
        rVar.getClass();
        list.getClass();
        o0 o0VarE = mVar.E(332017995);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(list) ? 32 : 16) | 128 | (o0VarE.r(yVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                z15 = am.j.z(l.f68084a);
                i15 = i16 & (-897);
            } else {
                o0VarE.e();
                i15 = i16 & (-897);
                z15 = z14;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.course_planner_multiple_points_at_location);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            r rVarE = u1.n.e(r.S, d92.b.a(o0VarE).c().b(), m1.f128891a);
            d92.b.f58625c.getClass();
            mh.c(strQ, c2.l.y(rVarE, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.C(-1993681826);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GeoPointDTO geoPointDTO = (GeoPointDTO) it.next();
                r.a aVar2 = r.S;
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                x1 x1Var2 = n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC2 = h4.k.c(aVar2, o0VarE);
                h5.g.V.getClass();
                e0.a aVar3 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                r rVarE2 = u1.n.e(x2.f(aVar2, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                boolean zR = ((i15 & 7168) == 2048) | o0VarE.r(geoPointDTO);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new qn0.f(22, yVar, geoPointDTO);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new qn0.f(22, yVar, geoPointDTO);
                        o0VarE.K(objQ);
                    }
                }
                h1.c((e23.a) objQ, rVarE2, false, null, null, null, null, null, z3.f.c(734484075, new tb(geoPointDTO, z15, 2), o0VarE), o0VarE, C.ENCODING_PCM_32BIT, 508);
                o0VarE.g0(true);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            o0VarE.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(rVar, list, z15, yVar, i14, 7);
        }
    }
}
