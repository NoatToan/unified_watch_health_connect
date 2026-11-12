package cw1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.b2;
import i3.e5;
import java.util.Iterator;
import org.joda.time.LocalDate;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 {
    /* JADX WARN: Code duplicated, block: B:151:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:154:0x040d A[LOOP:3: B:149:0x03f8->B:154:0x040d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0412 A[EDGE_INSN: B:199:0x0412->B:156:0x0412 BREAK  A[LOOP:3: B:149:0x03f8->B:154:0x040d], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [p3.n1] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r16v10, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r17v6, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, p3.n1] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [int] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r8v8, types: [p3.m, p3.o0] */
    public static final void a(h4.r rVar, String str, String str2, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, i53.c cVar, int i14, e23.l lVar, e23.l lVar2, e23.a aVar, boolean z14, int i15, int i16, p3.m mVar, int i17) {
        LocalDate localDate5;
        LocalDate localDate6;
        h4.r rVar2;
        ?? r14;
        h4.r rVar3;
        boolean z15;
        boolean z16;
        i53.c cVar2;
        boolean z17;
        ?? r15;
        ?? r16;
        Iterator it;
        ?? r17;
        String strJ;
        p3.n1 n1Var;
        localDate.getClass();
        localDate2.getClass();
        localDate3.getClass();
        localDate4.getClass();
        p3.o0 o0VarE = mVar.E(-92126065);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i18 = i17 | 6 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.r(localDate) ? 2048 : 1024) | (o0VarE.r(localDate2) ? 16384 : 8192) | (o0VarE.r(localDate3) ? 131072 : 65536) | (o0VarE.r(localDate4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(cVar) ? 8388608 : 4194304) | (o0VarE.k(i14) ? 67108864 : 33554432) | (o0VarE.r(lVar) ? 536870912 : 268435456);
        int i19 = (o0VarE.r(aVar) ? 32 : 16) | 6 | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.k(i15) ? 2048 : 1024) | (o0VarE.k(i16) ? 16384 : 8192);
        if (o0VarE.n(i18 & 1, ((i18 & 306783379) == 306783378 && (i19 & 9363) == 9362) ? false : true)) {
            o0VarE.G0();
            if ((i17 & 1) == 0 || o0VarE.o0()) {
                rVar3 = h4.r.S;
            } else {
                o0VarE.e();
                rVar3 = rVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                Iterator it3 = cVar.iterator();
                int i24 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i24 = -1;
                        break;
                    }
                    Iterator it4 = it3;
                    if (((jv1.q) it3.next()).f101113a.equals(localDate3)) {
                        break;
                    }
                    i24++;
                    it3 = it4;
                }
                objQ = e5.o(i24, o0VarE);
            }
            p3.n1 n1Var2 = (p3.n1) objQ;
            Object objQ2 = o0VarE.q();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var2 = (p3.p1) objQ3;
            h4.r rVarF = x2.f(rVar3, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.r rVar4 = rVar3;
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarB = a2.b(x2.f(b0Var.a(aVar4, 1.0f, true), 1.0f), a2.a(o0VarE), true);
            c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
            if (cVar3 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            int i25 = i18 << 9;
            b2.a(c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, eVar2.f97921f, 7), z14, i15, i16, str, str2, null, null, null, o0VarE, ((i19 >> 3) & 8176) | (57344 & i25) | (i25 & 458752), 448);
            if (cVar.isEmpty()) {
                z15 = true;
                z16 = false;
                o0VarE.C(-1342450067);
                o0VarE.g0(false);
                p1Var.setValue(Boolean.FALSE);
                p1Var2.setValue(Boolean.TRUE);
            } else {
                o0VarE.C(-1343438812);
                if (i14 != 0) {
                    z15 = true;
                    if (i14 == 1) {
                        p1Var.setValue(Boolean.FALSE);
                        p1Var2.setValue(Boolean.TRUE);
                    }
                } else {
                    z15 = true;
                    p1Var.setValue(Boolean.TRUE);
                    p1Var2.setValue(Boolean.FALSE);
                }
                i53.c cVarE = i53.a.e(p13.x.k(new b82.g1(gl1.y.Q(o0VarE, R.string.lbl_duration), null, null, null, 14, null), new b82.g1(gl1.y.Q(o0VarE, R.string.power_curve_list_date_item_label), null, null, null, 14, null)));
                h4.r rVarF2 = x2.f(aVar4, 1.0f);
                bVar2.getClass();
                h4.r rVarA = c2.l.A(rVarF2, eVar2.f97920e, 0.0f, 2);
                boolean z18 = (i18 & 1879048192) == 536870912 ? z15 : false;
                Object objQ4 = o0VarE.q();
                if (z18 || objQ4 == c2565a) {
                    objQ4 = new ci0.f(lVar, 3);
                    o0VarE.K(objQ4);
                }
                b82.k1.a(cVarE, i14, rVarA, null, 0.0f, (e23.l) objQ4, o0VarE, (i18 >> 21) & 112, 24);
                z16 = false;
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-1342280838);
                bVar2.getClass();
                h4.r rVarC3 = c2.l.C(aVar4, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13);
                cVar2 = cVar;
                boolean zR = o0VarE.r(cVar2);
                Object objQ5 = o0VarE.q();
                if (zR || objQ5 == c2565a) {
                    n1Var = n1Var2;
                    objQ5 = new j0(lVar2, cVar2, n1Var);
                    o0VarE.K(objQ5);
                } else {
                    n1Var = n1Var2;
                }
                z17 = z16;
                r15 = n1Var;
                j.b(rVarC3, null, localDate, localDate2, localDate3, localDate4, (e23.l) objQ5, o0VarE, (i18 >> 3) & 524160);
                localDate5 = localDate3;
                p3.o0 o0Var = o0VarE;
                localDate6 = localDate4;
                o0Var.g0(z17);
                r16 = o0Var;
            } else {
                localDate5 = localDate3;
                cVar2 = cVar;
                z17 = z16;
                r15 = n1Var2;
                p3.o0 o0Var2 = o0VarE;
                localDate6 = localDate4;
                o0Var2.C(-1341660993);
                o0Var2.g0(z17);
                r16 = o0Var2;
            }
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                r16.C(-1341583152);
                if (cVar2.isEmpty()) {
                    lVar2.invoke(localDate5);
                    it = cVar2.iterator();
                    r17 = z17;
                    while (true) {
                        if (it.hasNext()) {
                            r17 = -1;
                            break;
                        } else if (((jv1.q) it.next()).f101113a.equals(localDate5)) {
                            break;
                        } else {
                            r17 = (r17 == true ? 1 : 0) + 1;
                        }
                    }
                    r15.t(r17);
                } else {
                    Iterator it5 = cVar2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            lVar2.invoke(localDate5);
                            it = cVar2.iterator();
                            r17 = z17;
                            while (true) {
                                if (it.hasNext()) {
                                    r17 = -1;
                                    break;
                                } else {
                                    if (((jv1.q) it.next()).f101113a.equals(localDate5)) {
                                        break;
                                        break;
                                    }
                                    r17 = (r17 == true ? 1 : 0) + 1;
                                }
                            }
                            r15.t(r17);
                        } else if (((jv1.q) it5.next()).f101113a.equals(localDate6)) {
                        }
                    }
                }
                h4.r.a aVar5 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar5, j92.b.f97899b.f97918c), r16);
                ?? r18 = z17;
                ?? r19 = r15;
                for (Object obj : cVar2) {
                    int i26 = r18 + 1;
                    if (r18 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    jv1.q qVar = (jv1.q) obj;
                    String str3 = qVar.f101114b;
                    ?? r24 = r19;
                    String str4 = qVar.f101115c;
                    boolean z19 = r18 == r24.getIntValue() ? z15 : z17;
                    if (z19) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(r16, -854935267, R.string.selected, r16, z17);
                    } else {
                        r16.C(-733101802);
                        r16.g0(z17);
                        strJ = "";
                    }
                    b92.a aVarA = wz1.a.a(str3 + ". " + str4 + ". " + strJ);
                    boolean zK = r16.k(r18) | r16.r(qVar);
                    Object objQ6 = r16.q();
                    if (zK || objQ6 == p3.m.a.f135155b) {
                        k0 k0Var = new k0((int) r18, lVar2, qVar, (Object) r24, 0);
                        r24 = r24;
                        r16.K(k0Var);
                        objQ6 = k0Var;
                    }
                    int i27 = b92.a.f16960b;
                    r.b(null, str3, str4, aVarA, z19, false, (e23.l) objQ6, r16, 0, 33);
                    r19 = r24;
                    r18 = i26;
                }
                r16.g0(z17);
            } else {
                r16.C(-1340277153);
                r16.g0(z17);
            }
            r16.g0(z15);
            b82.c.b(null, null, z3.f.c(-1590715356, new cq0.p(aVar, 5), r16), null, 0L, r16, 384, 27);
            r16.g0(z15);
            x1 x1Var3 = p3.n.f135158a;
            rVar2 = rVar4;
            r14 = r16;
        } else {
            localDate5 = localDate3;
            p3.o0 o0Var3 = o0VarE;
            localDate6 = localDate4;
            o0Var3.e();
            rVar2 = rVar;
            r14 = o0Var3;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(rVar2, str, str2, localDate, localDate2, localDate5, localDate6, cVar, i14, lVar, lVar2, aVar, z14, i15, i16, i17);
        }
    }
}
