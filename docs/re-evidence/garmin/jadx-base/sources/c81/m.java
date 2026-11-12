package c81;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.o;
import c2.b0;
import c2.q;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import g81.g0;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import o4.d0;
import o4.m1;
import o4.w;
import o4.z0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import r1.q2;
import s5.s0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class m {
    public static final void a(String str, String str2, p3.m mVar, int i14) {
        String str3;
        o0 o0Var;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, 1744477918);
        p3.c<?> cVar = o0VarK.f135177b;
        int i15 = i14 | (o0VarK.B(str) ? 4 : 2) | (o0VarK.B(str2) ? 32 : 16);
        if (o0VarK.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            o0VarK.C(1406037154);
            w13.c cVar2 = zp1.a.f206594h;
            ArrayList arrayList = new ArrayList(y.r(cVar2, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                arrayList.add(d0.a(n5.a.a(o0VarK, ((zp1.a) bVar.next()).f206597c)));
            }
            o0VarK.g0(false);
            List listG0 = h0.G0(arrayList);
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97920e;
            float f16 = eVar.f97918c;
            r rVarY = c2.l.y(rVarF, f14);
            c2.j.i iVarG = q2.g(bVar2, c2.j.f22691a, f16);
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(iVarG, h4.d.a.f81536n, o0VarK, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            r rVarC = h4.k.c(rVarY, o0VarK);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarK);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarK);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarK);
            b0 b0Var = b0.f22601a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97935l;
            x0 x0VarF = d92.c.f(x0Var, o0VarK);
            h4.g.a aVar3 = h4.d.a.f81537o;
            r rVarB = b0Var.b(aVar, aVar3);
            bVar2.getClass();
            mh.c(str, c2.l.C(rVarB, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarK, i15 & 14, 0, 131068);
            r rVarB2 = b0Var.b(x2.z(aVar, null, 3), aVar3);
            bVar2.getClass();
            s2 s2VarA = c2.q2.a(c2.j.i(f16), h4.d.a.f81533k, o0VarK, 0);
            int iHashCode2 = Long.hashCode(o0VarK.U);
            i2 i2VarA1 = o0VarK.a0();
            r rVarC2 = h4.k.c(rVarB2, o0VarK);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            b4.c(eVar2, s2VarA, o0VarK);
            b4.c(c1623g, i2VarA1, o0VarK);
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarK, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarK);
            u2 u2Var = u2.f22900a;
            z0 z0VarB = w.a.b(w.f129023a, listG0, 0.0f, 0.0f, 14);
            bVar2.getClass();
            bVar2.getClass();
            r rVarD = u1.n.d(x2.r(aVar, f15, eVar.f97917b), z0VarB, null, 6);
            h4.g.b bVar4 = h4.d.a.f81534l;
            q.a(u2Var.c(rVarD, bVar4), o0VarK, 0);
            String strQ = gl1.y.Q(o0VarK, R.string.lbl_stamina_zones);
            r rVarC3 = u2Var.c(aVar, bVar4);
            fVar2.getClass();
            mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarK), o0VarK, 0, 0, 131068);
            bVar2.getClass();
            q.a(u2Var.c(u1.n.e(x2.q(aVar, f15), d92.b.a(o0VarK).e().f(), m1.f128891a), bVar4), o0VarK, 0);
            r rVarC4 = u2Var.c(aVar, bVar4);
            fVar2.getClass();
            str3 = str2;
            mh.c(str3, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarK), o0VarK, (i15 >> 3) & 14, 0, 131068);
            o0Var = o0VarK;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            str3 = str2;
            o0Var = o0VarK;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(str, str3, i14, 3);
        }
    }

    public static final void b(r rVar, g81.e eVar, m92.p0 p0Var, p3.m mVar, int i14) {
        int i15;
        m92.p0 p0Var2;
        e23.l lVar;
        Object objB;
        rVar.getClass();
        eVar.getClass();
        o0 o0VarE = mVar.E(-305275172);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            p0Var2 = p0Var;
            i15 |= o0VarE.r(p0Var2) ? 256 : 128;
        } else {
            p0Var2 = p0Var;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            long jB = tn.k.b(d92.b.f58623a, o0VarE);
            long jF = ds.e0.f(o0VarE);
            ArrayList arrayList = new ArrayList();
            e23.l lVarD = d.d(eVar.f76312j, eVar.f76308f, eVar.f76306d, eVar.f76307e, eVar.f76305c, o0VarE);
            e23.l lVarB = d.b(eVar.f76309g, eVar.f76308f, eVar.f76306d, eVar.f76307e, eVar.f76305c, eVar.f76311i, context, o0VarE, 0);
            e23.l lVarC = d.c(context, eVar.f76310h, eVar.f76308f, eVar.f76306d, eVar.f76307e, eVar.f76305c, jB, o0VarE);
            i53.c<i53.c<g0>> cVar = eVar.f76313k;
            if (cVar == null) {
                o0VarE.C(-2005548404);
                o0VarE.g0(false);
                objB = null;
                lVar = lVarC;
            } else {
                o0VarE.C(-2005548403);
                ArrayList arrayList2 = new ArrayList(y.r(cVar, 10));
                Iterator<i53.c<g0>> it = cVar.iterator();
                while (it.hasNext()) {
                    arrayList2.add(d.a(it.next(), eVar.f76308f, eVar.f76306d, eVar.f76307e, eVar.f76305c, jF, o0VarE));
                    lVarC = lVarC;
                }
                lVar = lVarC;
                o0VarE.g0(false);
                objB = arrayList2;
            }
            if (objB == null) {
                objB = j53.l.b();
            }
            arrayList.add(lVarD);
            arrayList.addAll(objB);
            arrayList.add(lVarB);
            arrayList.add(lVar);
            i53.c cVarE = i53.a.e(arrayList);
            String strQ = gl1.y.Q(o0VarE, R.string.no_data_label);
            g6.f.a aVar = g6.f.f75994b;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float fG = w02.b0.g(j92.b.f97899b.f97919d, o0VarE);
            n92.j jVar = new n92.j(p0Var2, Float.valueOf(eVar.f76306d), Float.valueOf(eVar.f76305c), 0, 8, null);
            y3 y3Var = t1.f91493k;
            w5.q.b bVar = (w5.q.b) o0VarE.A(y3Var);
            y3 y3Var2 = t1.f91490h;
            g6.d dVar = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
            y3 y3Var3 = t1.f91496n;
            s0 s0Var = new s0(bVar, dVar, (g6.o) o0VarE.A(y3Var3), 0, 8, null);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97935l;
            n92.g gVar = new n92.g(sn.a.c(o0VarE), s0Var, d92.c.f(x0Var, o0VarE), null, 8, null);
            i53.c<String> cVar2 = eVar.f76314l;
            s0 s0Var2 = new s0((w5.q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
            n92.c cVar3 = n92.c.NON_EMPTY_LABEL_LARGE_DOT_PATTERN;
            fVar.getClass();
            n92.a aVar2 = new n92.a(jVar, null, gVar, new n92.b(cVar2, null, cVar3, false, 0, null, s0Var2, d92.c.f(x0Var, o0VarE), 58, null), 2, null);
            f.f25693a.getClass();
            m92.r.a(rVar, cVarE, f.f25694b, g6.f.a(220), false, strQ, fG, 0.0f, aVar2, z3.f.c(1491196151, new c62.m1(eVar, 6), o0VarE), z3.f.c(1820739115, new a71.n(eVar, 12), o0VarE), o0VarE, (i15 & 14) | 805309824, 6, SyslogConstants.LOG_LOCAL2);
            o0VarE = o0VarE;
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(rVar, (Object) eVar, (Object) p0Var, i14, 24);
        }
    }
}
