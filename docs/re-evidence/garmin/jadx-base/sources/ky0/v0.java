package ky0;

import am.i2;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.p2;
import r1.q2;
import v62.z4;

/* JADX INFO: loaded from: classes9.dex */
public final class v0 {
    public static final void a(l22.b bVar, sy0.c cVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        Unit unit;
        p3.o0 o0VarE = mVar.E(-1187729395);
        int i15 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.B(cVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(aVar, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_activity_stats);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97930g), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            if (cVar == null) {
                o0Var.C(-1705475199);
                o0Var.g0(false);
                unit = null;
            } else {
                i53.d<String, i53.d<String, i2>> dVar = cVar.f161206a;
                Object objH = q2.h(o0Var, -1705475198, p3.m.f135153a);
                if (objH == p3.m.a.f135155b) {
                    d2.f107276a.getClass();
                    p13.n0 n0VarJ1 = p13.h0.j1(p13.x.k(am.x0.f4308n, am.x0.f4312o, am.x0.f4316p, am.x0.f4324r, am.x0.f4331t, am.x0.f4320q, am.x0.C, am.x0.D, am.x0.U1, am.x0.f4350y, am.x0.f4277d3, am.x0.f4323q3, am.x0.f4268a3, am.x0.f4346x));
                    int iA = p13.t0.a(p13.y.r(n0VarJ1, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    Iterator it = n0VarJ1.iterator();
                    while (true) {
                        p13.o0 o0Var2 = (p13.o0) it;
                        if (!o0Var2.f134956a.hasNext()) {
                            break;
                        }
                        p13.m0 m0Var = (p13.m0) o0Var2.next();
                        o13.p pVar = new o13.p(m0Var.f134952b, Integer.valueOf(m0Var.f134951a));
                        linkedHashMap.put(pVar.f128594a, pVar.f128595b);
                    }
                    o0Var.K(linkedHashMap);
                    objH = linkedHashMap;
                }
                Map map = (Map) objH;
                boolean zB = o0Var.B(dVar);
                Object objQ = o0Var.q();
                if (zB || objQ == p3.m.a.f135155b) {
                    objQ = p13.h0.N0(dVar.entrySet(), r13.a.a(new bh2.e(map, 1), new kn1.m(13)));
                    o0Var.K(objQ);
                }
                o0Var.C(1053382790);
                for (Map.Entry entry : (List) objQ) {
                    am.x0 x0VarM = am.z0.m((String) entry.getKey());
                    if (x0VarM == null) {
                        o0Var.C(-1434597365);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-1434597364);
                        e(bVar, x0VarM, (i53.d) entry.getValue(), o0Var, i15 & 14);
                        o0Var.g0(false);
                    }
                }
                o0Var.g0(false);
                o0Var.g0(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                o0Var.C(-1704520336);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                c2.l.f(x2.h(aVar2, eVar.f97920e), o0Var);
                bVar2.getClass();
                h4.r rVarC2 = c2.l.C(aVar2, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                c22.x0.f23314a.getClass();
                String strW = gl1.d.W(c22.x0.Ja);
                d92.b.f58624b.getClass();
                mh.c(strW, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0Var), o0Var, 0, 0, 131068);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(1053363440);
                o0Var.g0(false);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k41.e(bVar, cVar, i14, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    public static final void b(l22.b bVar, cy0.i iVar, p3.m mVar, int i14) {
        l22.b bVar2;
        p3.o0 o0Var;
        ?? r14;
        iVar.getClass();
        p3.o0 o0VarE = mVar.E(-25843071);
        int i15 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.B(iVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_health_stats);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97930g), o0VarE, 0, 0, 131068);
            h4.d.f81522a.getClass();
            h4.g.b bVar4 = h4.d.a.f81534l;
            h4.r rVarF = x2.f(aVar, 1.0f);
            bVar3.getClass();
            float f14 = eVar.f97920e;
            bVar3.getClass();
            h4.r rVarZ = c2.l.z(rVarF, f14, eVar.f97918c);
            c2.j.f22691a.getClass();
            s2 s2VarA = c2.q2.a(c2.j.f22692b, bVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar3.getClass();
            h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97903b);
            s62.a.f157643a.getClass();
            i7.b(z4.a(t62.b.f162798a), null, rVarQ, sn.a.y(o0VarE), o0VarE, 48, 0);
            bVar3.getClass();
            h4.r rVarC3 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
            c22.x0.f23314a.getClass();
            String strW = gl1.d.W(c22.x0.f23642ta);
            fVar.getClass();
            mh.c(strW, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
            p3.o0 o0Var2 = o0VarE;
            o0Var2.g0(true);
            if (iVar.f56724d == null && iVar.f56723c == null && iVar.f56725e == null) {
                o0Var2.C(-1089576959);
                r14 = 0;
                o0Var2.g0(false);
                bVar2 = bVar;
            } else {
                r14 = 0;
                o0Var2.C(-1090714783);
                bVar2 = bVar;
                l72.r1.b(gl1.y.Q(o0Var2, R.string.calories), z3.f.c(2114755447, new t0(iVar, bVar2, 0), o0Var2), o0Var2, 48, 0);
                o0Var2.g0(false);
            }
            if (iVar.f56722b == null && iVar.f56721a == null) {
                o0Var2.C(-1088743679);
                o0Var2.g0(r14);
            } else {
                o0Var2.C(-1089483649);
                l72.r1.b(gl1.y.Q(o0Var2, R.string.activity_details_heart_rate), z3.f.c(391049902, new t0(iVar, bVar2, 1), o0Var2), o0Var2, 48, r14);
                o0Var2.g0(r14);
            }
            if (o53.f0.D(iVar)) {
                o0Var2.C(-1088595158);
                l72.r1.b(gl1.y.Q(o0Var2, R.string.sleep_lbl_sleep), z3.f.c(-1304973457, new t0(iVar, bVar2, 2), o0Var2), o0Var2, 48, r14);
                o0Var2.g0(r14);
                o0Var = o0Var2;
            } else {
                o0Var2.C(-1085866879);
                o0Var2.g0(r14);
                o0Var = o0Var2;
            }
        } else {
            bVar2 = bVar;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(bVar2, iVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(sy0.c cVar, cy0.i iVar, boolean z14, yc.z0 z0Var, e23.a<Unit> aVar, p3.m mVar, int i14) {
        z0Var.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1237181618);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(iVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(z0Var) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            l22.a aVar2 = new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            boolean zB = o0VarE.B(z0Var);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = hb.a.n(z0Var instanceof yc.z0.b, o0VarE);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = hb.a.n(z0Var instanceof yc.z0.b, o0VarE);
                }
            }
            p3.p1 p1Var = (p3.p1) objQ;
            m3.s sVarE = m3.l.e(o0VarE);
            m3.l.b(((Boolean) p1Var.getF182175a()).booleanValue(), aVar, null, sVarE, null, z3.f.c(-1989573127, new a0(sVarE, p1Var, 1), o0VarE), z3.f.c(432180632, new h21.m(z14, iVar, aVar2, cVar, 4), o0VarE), o0VarE, ((i15 >> 9) & 112) | 1769472, 20);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(cVar, iVar, z0Var, aVar, z14, i14, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0100  */
    /* JADX WARN: Code duplicated, block: B:33:0x0107  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0126  */
    /* JADX WARN: Code duplicated, block: B:42:0x0144  */
    /* JADX WARN: Code duplicated, block: B:43:0x0147  */
    /* JADX WARN: Code duplicated, block: B:46:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x020a  */
    /* JADX WARN: Code duplicated, block: B:61:0x021a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0252  */
    /* JADX WARN: Code duplicated, block: B:65:0x0256  */
    public static final void d(String str, String str2, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        u2 u2Var;
        s2 s2VarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        String str3;
        j92.f fVar2;
        s5.x0 x0Var;
        p3.c<?> cVar2;
        s2 s2VarA2;
        int iHashCode2;
        p3.i2 i2VarA1;
        h4.r rVarC2;
        p3.o0 o0VarE = mVar.E(1621759984);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarE, eVar.f97920e, f14);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81533k;
            s2 s2VarA3 = c2.q2.a(c0343j, bVar2, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA3, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar3;
            } else {
                cVar = cVar3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                u2Var = u2.f22900a;
                bVar.getClass();
                h4.r rVarA = u2Var.a(c2.l.C(aVar, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11), 6.0f, true);
                s2VarA = c2.q2.a(c0343j, bVar2, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                h4.r rVarC4 = u2Var.c(c2.l.E(u2Var.a(aVar, 1.0f, false), c2.q1.Max), h4.d.a.f81534l);
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97932i;
                cVar2 = cVar;
                mh.c(str3, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE.g0(true);
                bVar.getClass();
                h4.r rVarA2 = u2Var.a(c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 4.0f, true);
                s2VarA2 = c2.q2.a(c2.j.f22693c, bVar2, o0VarE, 6);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA2, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                String str4 = str2 != null ? str2 : "";
                fVar2.getClass();
                mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            u2Var = u2.f22900a;
            bVar.getClass();
            h4.r rVarA3 = u2Var.a(c2.l.C(aVar, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11), 6.0f, true);
            s2VarA = c2.q2.a(c0343j, bVar2, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA3, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            h4.r rVarC5 = u2Var.c(c2.l.E(u2Var.a(aVar, 1.0f, false), c2.q1.Max), h4.d.a.f81534l);
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0Var = j92.f.f97932i;
            cVar2 = cVar;
            mh.c(str3, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE.g0(true);
            bVar.getClass();
            h4.r rVarA4 = u2Var.a(c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 4.0f, true);
            s2VarA2 = c2.q2.a(c2.j.f22693c, bVar2, o0VarE, 6);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarA4, o0VarE);
            if (cVar2 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            if (str2 != null) {
            }
            fVar2.getClass();
            mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.o(str, str2, i14, 18);
        }
    }

    public static final void e(l22.b bVar, am.x0 x0Var, i53.d<String, i2> dVar, p3.m mVar, int i14) {
        dVar.getClass();
        p3.o0 o0VarE = mVar.E(1640327601);
        int i15 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.k(x0Var.ordinal()) ? 32 : 16) | (o0VarE.B(dVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.r1.b(gl1.d.T(x0Var.f4360c, o0VarE, 0), z3.f.c(-987682804, new u0(bVar, dVar, x0Var), o0VarE), o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(bVar, x0Var, dVar, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    public static final void f(l22.b bVar, i53.d<String, i2> dVar, i53.c<? extends ls.e> cVar, int i14, am.x0 x0Var, p3.m mVar, int i15) {
        double dDoubleValue;
        String strT;
        String strB;
        boolean z14;
        dVar.getClass();
        cVar.getClass();
        p3.o0 o0VarE = mVar.E(-1692960445);
        int i16 = i15 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.k(x0Var.ordinal()) ? 16384 : 8192);
        boolean z15 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d(gl1.y.Q(o0VarE, R.string.annual_report_recap_sub_total_activities), String.valueOf(i14), o0VarE, 0);
            o0VarE.C(2043257669);
            Iterator<? extends ls.e> it = cVar.iterator();
            while (it.hasNext()) {
                ls.e next = it.next();
                d2.f107276a.getClass();
                i2 i2Var = dVar.get(d2.a(next));
                if (i2Var == null) {
                    o0VarE.C(440403950);
                    o0VarE.g0(z15);
                    z14 = z15;
                } else {
                    o0VarE.C(440403951);
                    Object objC = d2.c(next, i2Var);
                    ls.e eVar = ls.e.CALORIES;
                    if (next == eVar) {
                        dDoubleValue = 0.0d;
                        Double d14 = objC instanceof Double ? (Double) objC : null;
                        if ((d14 != null ? d14.doubleValue() : 0.0d) <= 0.0d) {
                            o0VarE.C(803111469);
                            o0VarE.g0(z15);
                            z14 = z15;
                        }
                        o0VarE.g0(z14);
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    o0VarE.C(802720342);
                    c3 c3Var = next.f114678a;
                    if (c3Var == null) {
                        o0VarE.C(802785906);
                        o0VarE.g0(z15);
                        strT = null;
                    } else {
                        o0VarE.C(802785907);
                        strT = gl1.d.T(c3Var, o0VarE, z15);
                        o0VarE.g0(z15);
                    }
                    Object objC2 = d2.c(next, i2Var);
                    if (next == ls.e.TOTAL_DISTANCE && x0Var == am.x0.f4324r) {
                        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                        Double d15 = objC2 instanceof Double ? (Double) objC2 : null;
                        if (d15 != null) {
                            dDoubleValue = d15.doubleValue();
                        }
                        strB = u00.b.c(new ns.q2(bVar, null, 2, null), new ls.g(zY, dDoubleValue), next == eVar ? 16 : 1, 4);
                    } else {
                        strB = ss.k.b(next, bVar, objC2, next == eVar ? 16 : 1);
                    }
                    z14 = 0;
                    d(strT, strB, o0VarE, 0);
                    o0VarE.g0(false);
                    o0VarE.g0(z14);
                }
                z15 = z14;
            }
            o0VarE.g0(z15);
            o0VarE.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g02.q0(bVar, dVar, cVar, i14, x0Var, i15);
        }
    }
}
