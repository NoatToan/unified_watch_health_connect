package k91;

import b82.o;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import g8.i;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import i53.g;
import j92.e;
import j92.f;
import java.util.Map;
import l72.p2;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.x1;
import u1.a2;
import u1.b1;
import u1.z0;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:42:0x0170  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:53:0x01da  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x023b  */
    /* JADX WARN: Code duplicated, block: B:62:0x023d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0249  */
    /* JADX WARN: Code duplicated, block: B:68:0x0253  */
    /* JADX WARN: Code duplicated, block: B:69:0x0256  */
    /* JADX WARN: Code duplicated, block: B:72:0x0292  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r6v24, types: [l72.p2] */
    public static final void a(r rVar, g gVar, String str, String str2, l lVar, m mVar, int i14) {
        String str3;
        r rVar2;
        int i15;
        h5.g.a.f fVar;
        r.a aVar;
        h5.g.a.b bVar;
        e0.a aVar2;
        h4.g.a aVar3;
        h5.g.a.C1623g c1623g;
        ?? r14;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        String str4;
        ?? r15;
        ?? r16;
        Object objQ;
        o0 o0VarE = mVar.E(352866137);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | 6 | (o0VarE.B(gVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            r.a aVar4 = r.S;
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(a2.b(aVar4, a2.a(o0VarE), true), 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81536n;
            z zVarA2 = y.a(kVar, aVar5, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarF, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i15 = i16;
            } else {
                i15 = i16;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                if (!gVar.isEmpty() || gVar.containsKey(str2)) {
                    aVar = aVar4;
                    bVar = bVar2;
                    aVar2 = aVar6;
                    aVar3 = aVar5;
                    c1623g = c1623g2;
                    r14 = 0;
                    o0VarE.C(-1483627501);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1483966734);
                    String strQ = gl1.y.Q(o0VarE, R.string.insights_does_not_support_your_language);
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    e eVar2 = j92.b.f97899b;
                    r rVarA = c2.l.A(aVar4, eVar2.f97920e, 0.0f, 2);
                    bVar3.getClass();
                    r rVarC3 = c2.l.C(rVarA, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    aVar = aVar4;
                    bVar = bVar2;
                    aVar2 = aVar6;
                    aVar3 = aVar5;
                    c1623g = c1623g2;
                    r14 = 0;
                    mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                r rVarZ = i.Z(aVar);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC4 = c2.l.C(rVarZ, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                zVarA = y.a(kVar, aVar3, o0VarE, r14);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC4, o0VarE);
                if (cVar != null) {
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
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                o0VarE.C(1484633375);
                for (Map.Entry entry : gVar.entrySet()) {
                    str4 = (String) entry.getKey();
                    String str5 = (String) entry.getValue();
                    ?? r17 = p2.f111205a;
                    r rVarF2 = x2.f(r.S, 1.0f);
                    boolean zG = s.g(str4, str);
                    z0 z0Var = (z0) o0VarE.A(b1.f167410a);
                    p5.l.f136032b.getClass();
                    p5.l lVarA = p5.l.a(p5.l.f136035e);
                    if ((i15 & 57344) == 16384) {
                        r15 = 1;
                    } else {
                        r15 = r14;
                    }
                    r16 = r15 | (o0VarE.B(str4) ? 1 : 0);
                    objQ = o0VarE.q();
                    if (r16 == 0) {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new bb1.d(lVar, str4, 4);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new bb1.d(lVar, str4, 4);
                        o0VarE.K(objQ);
                    }
                    r17.g(str5, j2.b.a(rVarF2, zG, null, z0Var, true, lVarA, (e23.a) objQ), null, null, z3.f.c(1112850220, new o(str4, str, 15), o0VarE), false, false, null, o0VarE, 24576, 492);
                }
                str3 = str;
                e5.u(o0VarE, r14, true, true);
                x1 x1Var2 = n.f135158a;
                rVar2 = aVar;
            }
            h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            if (gVar.isEmpty()) {
                aVar = aVar4;
                bVar = bVar2;
                aVar2 = aVar6;
                aVar3 = aVar5;
                c1623g = c1623g2;
                r14 = 0;
                o0VarE.C(-1483627501);
                o0VarE.g0(false);
            } else {
                aVar = aVar4;
                bVar = bVar2;
                aVar2 = aVar6;
                aVar3 = aVar5;
                c1623g = c1623g2;
                r14 = 0;
                o0VarE.C(-1483627501);
                o0VarE.g0(false);
            }
            r rVarZ2 = i.Z(aVar);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC5 = c2.l.C(rVarZ2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            zVarA = y.a(kVar, aVar3, o0VarE, r14);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC5, o0VarE);
            if (cVar != null) {
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
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            o0VarE.C(1484633375);
            while (r0.hasNext()) {
                str4 = (String) entry.getKey();
                String str6 = (String) entry.getValue();
                ?? r18 = p2.f111205a;
                r rVarF3 = x2.f(r.S, 1.0f);
                boolean zG2 = s.g(str4, str);
                z0 z0Var2 = (z0) o0VarE.A(b1.f167410a);
                p5.l.f136032b.getClass();
                p5.l lVarA2 = p5.l.a(p5.l.f136035e);
                if ((i15 & 57344) == 16384) {
                    r15 = 1;
                } else {
                    r15 = r14;
                }
                r16 = r15 | (o0VarE.B(str4) ? 1 : 0);
                objQ = o0VarE.q();
                if (r16 == 0) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new bb1.d(lVar, str4, 4);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new bb1.d(lVar, str4, 4);
                    o0VarE.K(objQ);
                }
                r18.g(str6, j2.b.a(rVarF3, zG2, null, z0Var2, true, lVarA2, (e23.a) objQ), null, null, z3.f.c(1112850220, new o(str4, str, 15), o0VarE), false, false, null, o0VarE, 24576, 492);
            }
            str3 = str;
            e5.u(o0VarE, r14, true, true);
            x1 x1Var3 = n.f135158a;
            rVar2 = aVar;
        } else {
            str3 = str;
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(rVar2, gVar, str3, str2, lVar, i14, 8);
        }
    }
}
