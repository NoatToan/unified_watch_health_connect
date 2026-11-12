package p003ji0;

import c2.j;
import c2.x2;
import c2.z;
import d62.n;
import e23.a;
import e23.p;
import g02.p1;
import g02.t;
import h2.j0;
import h2.u;
import h4.d;
import h4.k;
import h5.e0;
import h5.g;
import i53.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.m3;
import kotlin.t1;
import m4.q;
import o53.b0;
import p005kotlin.jvm.internal.s;
import p13.y;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import t13.h;
import wz1.i;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d A[PHI: r0 r4
      0x006d: PHI (r0v13 int) = (r0v7 int), (r0v7 int), (r0v15 int) binds: [B:39:0x0076, B:33:0x0069, B:34:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x006d: PHI (r4v17 int) = (r4v3 int), (r4v1 int), (r4v1 int) binds: [B:39:0x0076, B:33:0x0069, B:34:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0 A[LOOP:0: B:50:0x00da->B:52:0x00e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:63:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x017d  */
    /* JADX WARN: Code duplicated, block: B:68:0x018b  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void a(ArrayList arrayList, int i14, j0 j0Var, e eVar, m mVar, int i15, int i16) {
        int i17;
        int i18;
        j0 j0Var2;
        int i19;
        boolean z14;
        int i24;
        j0 j0Var3;
        p2 p2VarI0;
        int i25;
        m.a aVar;
        boolean zR;
        Object objQ;
        j0 j0VarB;
        int i26;
        int i27;
        q qVar;
        m3 m3Var;
        Object objQ2;
        b0 b0Var;
        ArrayList arrayList2;
        Iterator it;
        c cVarE;
        boolean zR2;
        Object objQ3;
        h4.r.a aVar2;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar3;
        g.a.b bVar;
        o0 o0VarE = mVar.E(1597890905);
        int i28 = i15 | (o0VarE.r(arrayList) ? 4 : 2);
        int i29 = i16 & 2;
        if (i29 != 0) {
            i18 = i28 | 48;
            i17 = i14;
        } else {
            i17 = i14;
            i18 = i28 | (o0VarE.k(i17) ? 32 : 16);
        }
        if ((i16 & 4) == 0) {
            j0Var2 = j0Var;
            int i30 = o0VarE.B(j0Var2) ? 256 : 128;
            i19 = i18 | i30;
            if ((i19 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                o0VarE.G0();
                i25 = i15 & 1;
                aVar = m.f135153a;
                if (i25 != 0 || o0VarE.o0()) {
                    if (i29 != 0) {
                        i17 = 0;
                    }
                    if ((i16 & 4) != 0) {
                        zR = o0VarE.r(arrayList);
                        objQ = o0VarE.q();
                        if (zR) {
                            objQ = new n(3, arrayList);
                            o0VarE.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new n(3, arrayList);
                                o0VarE.K(objQ);
                            }
                        }
                        j0VarB = h2.o0.b(i17, (a) objQ, o0VarE, (i19 >> 3) & 14, 2);
                        i26 = i19 & (-897);
                        i27 = i17;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    qVar = (q) o0VarE.A(t1.f91491i);
                    m3Var = (m3) o0VarE.A(t1.f91499q);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = l0.j(h.f161748a, o0VarE);
                        o0VarE.K(objQ2);
                    }
                    b0Var = (b0) objQ2;
                    arrayList2 = new ArrayList(y.r(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new p1((String) it.next(), null, null, 6, null));
                    }
                    cVarE = i53.a.e(arrayList2);
                    Integer numValueOf = Integer.valueOf(j0VarB.l());
                    zR2 = o0VarE.r(qVar) | o0VarE.B(m3Var);
                    objQ3 = o0VarE.q();
                    if (zR2 || objQ3 == m.a.f135155b) {
                        objQ3 = new q(qVar, m3Var, null);
                        o0VarE.K(objQ3);
                    }
                    l0.e((p) objQ3, numValueOf, o0VarE);
                    aVar2 = h4.r.S;
                    h4.r rVarD = x2.d(i.c(aVar2, o0VarE), 1.0f);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    d.f81522a.getClass();
                    zVarA = c2.y.a(kVar, d.a.f81536n, o0VarE, 0);
                    x1 x1Var2 = p3.n.f135158a;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarD, o0VarE);
                    g.V.getClass();
                    aVar3 = g.a.f81805b;
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
                    b4.c(g.a.f81810g, zVarA, o0VarE);
                    b4.c(g.a.f81809f, i2VarA0, o0VarE);
                    bVar = g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    int i34 = (i26 >> 6) & 14;
                    t.a(j0VarB, b0Var, cVarE, null, o0VarE, i34, 8);
                    u.a(j0VarB, x2.d(aVar2, 1.0f), null, null, 1, 0.0f, d.a.f81533k, null, false, null, null, null, null, f.c(973680848, new p(eVar, 0), o0VarE), o0VarE, i34 | 1597488, 24576, 16300);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    j0Var3 = j0VarB;
                    i24 = i27;
                } else {
                    o0VarE.e();
                    if ((i16 & 4) != 0) {
                        i19 &= -897;
                    }
                }
                i26 = i19;
                i27 = i17;
                j0VarB = j0Var2;
                o0VarE.h0();
                x1 x1Var3 = p3.n.f135158a;
                qVar = (q) o0VarE.A(t1.f91491i);
                m3Var = (m3) o0VarE.A(t1.f91499q);
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = l0.j(h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0Var = (b0) objQ2;
                arrayList2 = new ArrayList(y.r(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new p1((String) it.next(), null, null, 6, null));
                }
                cVarE = i53.a.e(arrayList2);
                Integer numValueOf2 = Integer.valueOf(j0VarB.l());
                zR2 = o0VarE.r(qVar) | o0VarE.B(m3Var);
                objQ3 = o0VarE.q();
                if (zR2) {
                    objQ3 = new q(qVar, m3Var, null);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new q(qVar, m3Var, null);
                    o0VarE.K(objQ3);
                }
                l0.e((p) objQ3, numValueOf2, o0VarE);
                aVar2 = h4.r.S;
                h4.r rVarD2 = x2.d(i.c(aVar2, o0VarE), 1.0f);
                j.f22691a.getClass();
                j.k kVar2 = j.f22694d;
                d.f81522a.getClass();
                zVarA = c2.y.a(kVar2, d.a.f81536n, o0VarE, 0);
                x1 x1Var4 = p3.n.f135158a;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarD2, o0VarE);
                g.V.getClass();
                aVar3 = g.a.f81805b;
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
                b4.c(g.a.f81810g, zVarA, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                bVar = g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                int i35 = (i26 >> 6) & 14;
                t.a(j0VarB, b0Var, cVarE, null, o0VarE, i35, 8);
                u.a(j0VarB, x2.d(aVar2, 1.0f), null, null, 1, 0.0f, d.a.f81533k, null, false, null, null, null, null, f.c(973680848, new p(eVar, 0), o0VarE), o0VarE, i35 | 1597488, 24576, 16300);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                j0Var3 = j0VarB;
                i24 = i27;
            } else {
                o0VarE.e();
                i24 = i17;
                j0Var3 = j0Var2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new an1.d(arrayList, i24, j0Var3, eVar, i15, i16);
            }
        }
        j0Var2 = j0Var;
        i19 = i18 | i30;
        if ((i19 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i19 & 1, z14)) {
            o0VarE.G0();
            i25 = i15 & 1;
            aVar = m.f135153a;
            if (i25 != 0) {
                if (i29 != 0) {
                    i17 = 0;
                }
                if ((i16 & 4) != 0) {
                    zR = o0VarE.r(arrayList);
                    objQ = o0VarE.q();
                    if (zR) {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new n(3, arrayList);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new n(3, arrayList);
                        o0VarE.K(objQ);
                    }
                    j0VarB = h2.o0.b(i17, (a) objQ, o0VarE, (i19 >> 3) & 14, 2);
                    i26 = i19 & (-897);
                    i27 = i17;
                } else {
                    i26 = i19;
                    i27 = i17;
                    j0VarB = j0Var2;
                }
            } else {
                if (i29 != 0) {
                    i17 = 0;
                }
                if ((i16 & 4) != 0) {
                    zR = o0VarE.r(arrayList);
                    objQ = o0VarE.q();
                    if (zR) {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new n(3, arrayList);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new n(3, arrayList);
                        o0VarE.K(objQ);
                    }
                    j0VarB = h2.o0.b(i17, (a) objQ, o0VarE, (i19 >> 3) & 14, 2);
                    i26 = i19 & (-897);
                    i27 = i17;
                } else {
                    i26 = i19;
                    i27 = i17;
                    j0VarB = j0Var2;
                }
            }
            o0VarE.h0();
            x1 x1Var5 = p3.n.f135158a;
            qVar = (q) o0VarE.A(t1.f91491i);
            m3Var = (m3) o0VarE.A(t1.f91499q);
            objQ2 = o0VarE.q();
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = l0.j(h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0Var = (b0) objQ2;
            arrayList2 = new ArrayList(y.r(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new p1((String) it.next(), null, null, 6, null));
            }
            cVarE = i53.a.e(arrayList2);
            Integer numValueOf3 = Integer.valueOf(j0VarB.l());
            zR2 = o0VarE.r(qVar) | o0VarE.B(m3Var);
            objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new q(qVar, m3Var, null);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new q(qVar, m3Var, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, numValueOf3, o0VarE);
            aVar2 = h4.r.S;
            h4.r rVarD3 = x2.d(i.c(aVar2, o0VarE), 1.0f);
            j.f22691a.getClass();
            j.k kVar3 = j.f22694d;
            d.f81522a.getClass();
            zVarA = c2.y.a(kVar3, d.a.f81536n, o0VarE, 0);
            x1 x1Var6 = p3.n.f135158a;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarD3, o0VarE);
            g.V.getClass();
            aVar3 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            bVar = g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var4 = c2.b0.f22601a;
            int i36 = (i26 >> 6) & 14;
            t.a(j0VarB, b0Var, cVarE, null, o0VarE, i36, 8);
            u.a(j0VarB, x2.d(aVar2, 1.0f), null, null, 1, 0.0f, d.a.f81533k, null, false, null, null, null, null, f.c(973680848, new p(eVar, 0), o0VarE), o0VarE, i36 | 1597488, 24576, 16300);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            j0Var3 = j0VarB;
            i24 = i27;
        } else {
            o0VarE.e();
            i24 = i17;
            j0Var3 = j0Var2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(arrayList, i24, j0Var3, eVar, i15, i16);
        }
    }
}
