package com.garmin.android.apps.connectmobile.navigation.more;

import c2.a0;
import c2.x2;
import com.garmin.android.apps.connectmobile.userprofile.model.g;
import e23.l;
import h4.r;
import i3.mh;
import j92.e;
import j92.f;
import java.util.Iterator;
import java.util.List;
import l72.r1;
import o4.d0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.x0;
import ty0.j;
import vy0.i;
import vy0.o;
import vy0.p;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:64:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:76:0x020d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0228  */
    /* JADX WARN: Code duplicated, block: B:80:0x0239  */
    /* JADX WARN: Code duplicated, block: B:82:0x0243  */
    /* JADX WARN: Code duplicated, block: B:84:0x0254  */
    /* JADX WARN: Code duplicated, block: B:85:0x025c  */
    /* JADX WARN: Code duplicated, block: B:88:0x027a  */
    /* JADX WARN: Code duplicated, block: B:89:0x027d  */
    /* JADX WARN: Code duplicated, block: B:92:0x028a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0294  */
    /* JADX WARN: Code duplicated, block: B:96:0x0296  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v4, types: [ty0.j] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r26v1, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r4v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r4v10, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v3, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v9, types: [p3.o0] */
    public static final void a(a0 a0Var, List list, boolean z14, l lVar, m mVar, int i14) {
        a0 a0Var2;
        int i15;
        ?? r14;
        int i16;
        String str;
        String str2;
        j f39397b;
        String strG;
        String str3;
        ?? f39397b2;
        d0 d0VarA;
        long jB;
        j f39397b3;
        boolean z15;
        boolean z16;
        boolean zR;
        Object objQ;
        boolean z17;
        Object obj;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        a0Var.getClass();
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-197686720);
        int i17 = 2;
        if ((i14 & 6) == 0) {
            a0Var2 = a0Var;
            i15 = (o0VarE.B(a0Var2) ? 4 : 2) | i14;
        } else {
            a0Var2 = a0Var;
            i15 = i14;
        }
        int i18 = i15 | (o0VarE.r(list) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i18 |= o0VarE.h(z14) ? 256 : 128;
        }
        int i19 = 2048;
        if ((i14 & 3072) == 0) {
            i18 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        int i24 = i18;
        ?? r110 = 0;
        if (o0VarE.n(i24 & 1, (i24 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Iterator it = list.iterator();
            ?? r24 = o0VarE;
            while (it.hasNext()) {
                b bVar = (b) it.next();
                String strD = null;
                if (bVar instanceof b.k) {
                    r24.C(1500637931);
                    b.k kVar = (b.k) bVar;
                    r1.b(kVar.f39418c, null, r24, r110, i17);
                    a(a0Var2, kVar.f39419d, z14, lVar, r24, i24 & 8078);
                    String str4 = kVar.f39420e;
                    if (str4 == null) {
                        r24.C(1500937328);
                        r24.g0(r110);
                        i16 = i17;
                        r19 = r110;
                        r18 = r24;
                    } else {
                        r24.C(1500937329);
                        r rVarF = x2.f(r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        j92.b bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        e eVar = j92.b.f97899b;
                        r rVarA = c2.l.A(rVarF, eVar.f97920e, 0.0f, i17);
                        bVar2.getClass();
                        r rVarC = c2.l.C(rVarA, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                        d92.b.f58624b.getClass();
                        x0 x0VarF = d92.c.f(f.f97933j, r24);
                        boolean z18 = r110 == true ? 1 : 0;
                        ?? r26 = r24;
                        i16 = i17;
                        mh.c(str4, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, r26, 0, 0, 131068);
                        ?? r25 = r26;
                        r25.g0(z18);
                        Unit unit = Unit.INSTANCE;
                        r19 = z18;
                        r18 = r25;
                    }
                    r18.g0(r19);
                    r16 = r19;
                    r17 = r18;
                } else {
                    i16 = i17;
                    i24 = i24;
                    ?? r27 = r110;
                    ?? r28 = r24;
                    int i25 = i19;
                    if (bVar instanceof b.f) {
                        r28.C(-90115167);
                        i.b(((b.f) bVar).f39410d, r28, g.f46856f);
                        r28.g0(r27);
                        r16 = r27;
                        r17 = r28;
                    } else {
                        r28.C(1501536249);
                        if ((bVar.getF39397b() instanceof ty0.b) && bVar.getF39397b() == ty0.b.f166889l) {
                            r28.C(1501538140);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            i.d(j92.b.f97899b.f97920e, r28, r27 == true ? 1 : 0);
                            r28.g0(r27);
                            r15 = r28;
                            r16 = r27;
                        } else {
                            r28.C(1501661706);
                            boolean z19 = bVar instanceof b.e;
                            if (z19) {
                                str2 = ((b.e) bVar).f39407e;
                            } else {
                                if (bVar instanceof b.k) {
                                    str2 = ((b.k) bVar).f39420e;
                                } else {
                                    str = null;
                                }
                                f39397b = bVar.getF39397b();
                                if (f39397b == null) {
                                    r28.C(1502144654);
                                    r28.g0(r27);
                                    strG = null;
                                } else {
                                    r28.C(-90091053);
                                    strG = f39397b.g(w2.a0.s(r28));
                                    r28.g0(r27);
                                }
                                if (strG != null || strG.equals(str)) {
                                    str3 = null;
                                } else {
                                    str3 = strG;
                                }
                                String strA = bVar.a(w2.a0.s(r28));
                                f39397b2 = bVar.getF39397b();
                                if (f39397b2 == 0) {
                                    r28.C(1502436922);
                                    r28.g0(r27);
                                    d0VarA = null;
                                } else {
                                    r28.C(-90081625);
                                    long jI = f39397b2.i(r28);
                                    r28.g0(r27);
                                    d0VarA = d0.a(jI);
                                }
                                if (d0VarA == null) {
                                    r28.C(-90080606);
                                    d92.b.f58623a.getClass();
                                    jB = d92.b.a(r28).k().b();
                                    r28.g0(r27);
                                } else {
                                    r28.C(-90082187);
                                    r28.g0(r27);
                                    jB = d0VarA.f128833a;
                                }
                                f39397b3 = bVar.getF39397b();
                                if (f39397b3 == null) {
                                    r28.C(1502590682);
                                } else {
                                    r28.C(-90076665);
                                    strD = f39397b3.d(w2.a0.s(r28));
                                }
                                r28.g0(r27);
                                if (z19) {
                                    z15 = ((b.e) bVar).f39408f;
                                } else {
                                    z15 = true;
                                }
                                z3.e eVarE = i.e(bVar.getF39397b(), z14, r28, (i24 >> 3) & 112);
                                z3.e eVarC = z3.f.c(-228353605, new o(bVar, r27 == true ? 1 : 0), r28);
                                if ((i24 & 7168) == i25) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                zR = z16 | r28.r(bVar);
                                objQ = r28.q();
                                if (zR) {
                                    z17 = false;
                                    p pVar = new p(lVar, bVar, 0);
                                    r28.K(pVar);
                                    obj = pVar;
                                } else {
                                    m.f135153a.getClass();
                                    if (objQ == m.a.f135155b) {
                                        z17 = false;
                                        p pVar2 = new p(lVar, bVar, 0);
                                        r28.K(pVar2);
                                        obj = pVar2;
                                    } else {
                                        z17 = false;
                                        obj = objQ;
                                    }
                                }
                                boolean z24 = z17;
                                i.c(a0Var, strA, jB, str, strD, str3, eVarE, eVarC, z15, (e23.a) obj, r28, (i24 & 14) | 100663296, 16);
                                ?? r29 = r28;
                                r29.g0(z24);
                                r16 = z24;
                                r15 = r29;
                            }
                            str = str2;
                            f39397b = bVar.getF39397b();
                            if (f39397b == null) {
                                r28.C(1502144654);
                                r28.g0(r27);
                                strG = null;
                            } else {
                                r28.C(-90091053);
                                strG = f39397b.g(w2.a0.s(r28));
                                r28.g0(r27);
                            }
                            if (strG != null) {
                                str3 = null;
                            } else {
                                str3 = null;
                            }
                            String strA2 = bVar.a(w2.a0.s(r28));
                            f39397b2 = bVar.getF39397b();
                            if (f39397b2 == 0) {
                                r28.C(1502436922);
                                r28.g0(r27);
                                d0VarA = null;
                            } else {
                                r28.C(-90081625);
                                long jI2 = f39397b2.i(r28);
                                r28.g0(r27);
                                d0VarA = d0.a(jI2);
                            }
                            if (d0VarA == null) {
                                r28.C(-90080606);
                                d92.b.f58623a.getClass();
                                jB = d92.b.a(r28).k().b();
                                r28.g0(r27);
                            } else {
                                r28.C(-90082187);
                                r28.g0(r27);
                                jB = d0VarA.f128833a;
                            }
                            f39397b3 = bVar.getF39397b();
                            if (f39397b3 == null) {
                                r28.C(1502590682);
                            } else {
                                r28.C(-90076665);
                                strD = f39397b3.d(w2.a0.s(r28));
                            }
                            r28.g0(r27);
                            if (z19) {
                                z15 = ((b.e) bVar).f39408f;
                            } else {
                                z15 = true;
                            }
                            z3.e eVarE2 = i.e(bVar.getF39397b(), z14, r28, (i24 >> 3) & 112);
                            z3.e eVarC2 = z3.f.c(-228353605, new o(bVar, r27 == true ? 1 : 0), r28);
                            if ((i24 & 7168) == i25) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zR = z16 | r28.r(bVar);
                            objQ = r28.q();
                            if (zR) {
                                m.f135153a.getClass();
                                if (objQ == m.a.f135155b) {
                                    z17 = false;
                                    p pVar3 = new p(lVar, bVar, 0);
                                    r28.K(pVar3);
                                    obj = pVar3;
                                } else {
                                    z17 = false;
                                    obj = objQ;
                                }
                            } else {
                                z17 = false;
                                p pVar4 = new p(lVar, bVar, 0);
                                r28.K(pVar4);
                                obj = pVar4;
                            }
                            boolean z25 = z17;
                            i.c(a0Var, strA2, jB, str, strD, str3, eVarE2, eVarC2, z15, (e23.a) obj, r28, (i24 & 14) | 100663296, 16);
                            ?? r210 = r28;
                            r210.g0(z25);
                            r16 = z25;
                            r15 = r210;
                        }
                        r15.g0(r16);
                    }
                    r110 = r16;
                    i24 = i24;
                    i17 = i16;
                    i19 = 2048;
                    a0Var2 = a0Var;
                    r24 = r15;
                }
                r15 = r17;
                r110 = r16;
                i24 = i24;
                i17 = i16;
                i19 = 2048;
                a0Var2 = a0Var;
                r24 = r15;
            }
            x1 x1Var2 = n.f135158a;
            r14 = r24;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(a0Var, list, z14, lVar, i14, 19);
        }
    }
}
