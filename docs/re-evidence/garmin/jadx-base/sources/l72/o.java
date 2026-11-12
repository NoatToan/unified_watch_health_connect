package l72;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import i3.mh;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import p3.y3;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:102:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:105:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:70:0x013a  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0178  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01be  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:95:0x020f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0259  */
    /* JADX WARN: Code duplicated, block: B:99:0x0296  */
    public static final void a(final h4.r rVar, String str, final String str2, boolean z14, boolean z15, boolean z16, final e23.a aVar, p3.m mVar, final int i14, final int i15) {
        boolean z17;
        int i16;
        final boolean z18;
        int i17;
        boolean z19;
        int i18;
        int i19;
        int i24;
        boolean z24;
        String str3;
        final boolean z25;
        final boolean z26;
        p3.p2 p2VarI0;
        boolean z27;
        String strQ;
        String strP;
        final float f14;
        f5.z0 z0VarD;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h5.g.a.e eVar;
        boolean z28;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        boolean z29;
        int i25;
        h5.g.a.f fVar;
        h4.r.a aVar3;
        boolean z34;
        Object objQ;
        p3.m.a aVar4;
        boolean zB;
        Object objQ2;
        c2.z zVarA;
        int iHashCode2;
        p3.i2 i2VarA1;
        h4.r rVarC2;
        final float f15;
        Object objQ3;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(644799660);
        p3.c<?> cVar = o0VarE.f135177b;
        int i26 = i15 & 8;
        if (i26 != 0) {
            i16 = i14 | 3072;
            z17 = z14;
        } else if ((i14 & 3072) == 0) {
            z17 = z14;
            i16 = (o0VarE.h(z17) ? 2048 : 1024) | i14;
        } else {
            z17 = z14;
            i16 = i14;
        }
        int i27 = i15 & 16;
        if (i27 == 0) {
            if ((i14 & 24576) == 0) {
                z18 = z15;
                i16 |= o0VarE.h(z18) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    z19 = z16;
                    if (o0VarE.h(z19)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                int i28 = i16 | 1572864;
                if (o0VarE.r(aVar)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i24 = i28 | i19;
                if ((4793491 & i24) != 4793490) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (o0VarE.n(i24 & 1, z24)) {
                    if (i26 != 0) {
                        z17 = true;
                    }
                    if (i27 != 0) {
                        z18 = false;
                    }
                    if (i17 != 0) {
                        z27 = false;
                    } else {
                        z27 = z19;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    strQ = gl1.y.Q(o0VarE, R.string.gak_lbl_new);
                    strP = gl1.y.P(R.string.gak_lbl_badge_name, new Object[]{str2}, o0VarE);
                    if (z27) {
                        strP = e5.g(strQ, StringUtils.SPACE, strP);
                    }
                    f14 = 84;
                    g6.f.a aVar5 = g6.f.f75994b;
                    h4.r rVarU = c2.x2.u(rVar, f14);
                    h4.d.f81522a.getClass();
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarU, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
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
                    eVar = h5.g.a.f81810g;
                    z28 = z27;
                    b4.c(eVar, z0VarD, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    z29 = z17;
                    if (o0VarE.T) {
                        i25 = i24;
                    } else {
                        i25 = i24;
                        if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, o0VarE);
                        c2.u uVar = c2.u.f22885a;
                        h4.g.a aVar6 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        c2.j.c cVar2 = c2.j.f22696f;
                        aVar3 = h4.r.S;
                        if ((i25 & 29360128) == 8388608) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        objQ = o0VarE.q();
                        aVar4 = p3.m.f135153a;
                        if (z34) {
                            objQ = new ku1.a(aVar, 25);
                            o0VarE.K(objQ);
                        } else {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ku1.a(aVar, 25);
                                o0VarE.K(objQ);
                            }
                        }
                        h4.r rVarA = c2.l.A(u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15), 6, 0.0f, 2);
                        zB = o0VarE.B(strP);
                        objQ2 = o0VarE.q();
                        if (zB) {
                            objQ2 = new jl0.e(strP, 19);
                            o0VarE.K(objQ2);
                        } else {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new jl0.e(strP, 19);
                                o0VarE.K(objQ2);
                            }
                        }
                        h4.r rVarC3 = p5.v.c((e23.l) objQ2, rVarA, true);
                        zVarA = c2.y.a(cVar2, aVar6, o0VarE, 54);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarC3, o0VarE);
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
                        b4.c(eVar, zVarA, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        c2.b0 b0Var = c2.b0.f22601a;
                        f15 = 72;
                        wf.f.a aVar7 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                        str3 = str;
                        aVar7.f184930c = str3;
                        wf.f fVarA = aVar7.a();
                        f5.k.f68985a.getClass();
                        jf.t.a(fVarA, null, null, h4.d.a.f81528f, f5.k.a.f68987b, z3.f.c(710542153, new e23.q() { // from class: l72.m
                            @Override // e23.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                jf.w wVar = (jf.w) obj;
                                p3.m mVar2 = (p3.m) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                wVar.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= mVar2.B(wVar) ? 4 : 2;
                                }
                                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    p3.x1 x1Var2 = p3.n.f135158a;
                                    boolean z35 = ((jf.d.c) s9.c.c(wVar.getF98679b().f98632q, mVar2).getF182175a()) instanceof jf.d.c.C1894d;
                                    float f16 = f14;
                                    if (z35) {
                                        mVar2.C(-2132369904);
                                        float f17 = z18 ? 1.0f : 0.0f;
                                        h4.r rVarU2 = c2.x2.u(c2.x2.h(h4.r.S, f16), f15);
                                        jf.d f98679b = wVar.getF98679b();
                                        o4.e0.a aVar8 = o4.e0.f128843b;
                                        float[] fArrA = o4.g0.a();
                                        o4.g0.b(f17, fArrA);
                                        aVar8.getClass();
                                        u1.y0.a(f98679b, null, rVarU2, null, null, 0.0f, new o4.h0(fArrA, (p005kotlin.jvm.internal.j) null), mVar2, 432, 56);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-2131890427);
                                        o.b(f16, mVar2, 6);
                                        mVar2.f();
                                    }
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 1769520, 1948);
                        if (z29) {
                            o0VarE.C(1100119526);
                            d6.p.f57793b.getClass();
                            int i29 = d6.p.f57795d;
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97935l, o0VarE);
                            d6.h.f57752b.getClass();
                            int i30 = d6.h.f57755e;
                            d92.b.f58625c.getClass();
                            h4.r rVarU2 = c2.x2.u(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), f15);
                            objQ3 = o0VarE.q();
                            aVar4.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new p006l2.w2(28);
                                o0VarE.K(objQ3);
                            }
                            mh.c(str2, p5.v.c((e23.l) objQ3, rVarU2, false), 0L, null, 0L, null, 0L, d6.h.a(i30), 0L, i29, false, 2, 0, null, x0VarB, o0VarE, 6, 24960, 109564);
                            o0VarE = o0VarE;
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(1100583162);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(true);
                        if (z28) {
                            o0VarE.C(99895842);
                            y3 y3Var = kotlin.t1.f91490h;
                            p3.v.a(y3Var.c(new g6.d(((g6.c) o0VarE.A(y3Var)).getF75991a(), 1.0f)), z3.f.c(1747606861, new fv1.b(strQ, 14), o0VarE), o0VarE, 56);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(100985616);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(true);
                        z25 = z29;
                        z26 = z28;
                    }
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.u uVar2 = c2.u.f22885a;
                    h4.g.a aVar8 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.j.c cVar3 = c2.j.f22696f;
                    aVar3 = h4.r.S;
                    if ((i25 & 29360128) == 8388608) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    objQ = o0VarE.q();
                    aVar4 = p3.m.f135153a;
                    if (z34) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ku1.a(aVar, 25);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new ku1.a(aVar, 25);
                        o0VarE.K(objQ);
                    }
                    h4.r rVarA2 = c2.l.A(u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15), 6, 0.0f, 2);
                    zB = o0VarE.B(strP);
                    objQ2 = o0VarE.q();
                    if (zB) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new jl0.e(strP, 19);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new jl0.e(strP, 19);
                        o0VarE.K(objQ2);
                    }
                    h4.r rVarC4 = p5.v.c((e23.l) objQ2, rVarA2, true);
                    zVarA = c2.y.a(cVar3, aVar8, o0VarE, 54);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC4, o0VarE);
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
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    f15 = 72;
                    wf.f.a aVar9 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                    str3 = str;
                    aVar9.f184930c = str3;
                    wf.f fVarA2 = aVar9.a();
                    f5.k.f68985a.getClass();
                    jf.t.a(fVarA2, null, null, h4.d.a.f81528f, f5.k.a.f68987b, z3.f.c(710542153, new e23.q() { // from class: l72.m
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            jf.w wVar = (jf.w) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            wVar.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(wVar) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                p3.x1 x1Var2 = p3.n.f135158a;
                                boolean z35 = ((jf.d.c) s9.c.c(wVar.getF98679b().f98632q, mVar2).getF182175a()) instanceof jf.d.c.C1894d;
                                float f16 = f14;
                                if (z35) {
                                    mVar2.C(-2132369904);
                                    float f17 = z18 ? 1.0f : 0.0f;
                                    h4.r rVarU3 = c2.x2.u(c2.x2.h(h4.r.S, f16), f15);
                                    jf.d f98679b = wVar.getF98679b();
                                    o4.e0.a aVar10 = o4.e0.f128843b;
                                    float[] fArrA = o4.g0.a();
                                    o4.g0.b(f17, fArrA);
                                    aVar10.getClass();
                                    u1.y0.a(f98679b, null, rVarU3, null, null, 0.0f, new o4.h0(fArrA, (p005kotlin.jvm.internal.j) null), mVar2, 432, 56);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-2131890427);
                                    o.b(f16, mVar2, 6);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 1769520, 1948);
                    if (z29) {
                        o0VarE.C(1100119526);
                        d6.p.f57793b.getClass();
                        int i210 = d6.p.f57795d;
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB2 = d92.c.b(j92.f.f97935l, o0VarE);
                        d6.h.f57752b.getClass();
                        int i34 = d6.h.f57755e;
                        d92.b.f58625c.getClass();
                        h4.r rVarU3 = c2.x2.u(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), f15);
                        objQ3 = o0VarE.q();
                        aVar4.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new p006l2.w2(28);
                            o0VarE.K(objQ3);
                        }
                        mh.c(str2, p5.v.c((e23.l) objQ3, rVarU3, false), 0L, null, 0L, null, 0L, d6.h.a(i34), 0L, i210, false, 2, 0, null, x0VarB2, o0VarE, 6, 24960, 109564);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1100583162);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    if (z28) {
                        o0VarE.C(99895842);
                        y3 y3Var2 = kotlin.t1.f91490h;
                        p3.v.a(y3Var2.c(new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f)), z3.f.c(1747606861, new fv1.b(strQ, 14), o0VarE), o0VarE, 56);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(100985616);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    z25 = z29;
                    z26 = z28;
                } else {
                    str3 = str;
                    o0VarE.e();
                    z25 = z17;
                    z26 = z19;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final String str4 = str3;
                    p2VarI0.f135219d = new e23.p() { // from class: l72.n
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o.a(rVar, str4, str2, z25, z18, z26, aVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i16 |= 196608;
            z19 = z16;
            int i211 = i16 | 1572864;
            if (o0VarE.r(aVar)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i24 = i211 | i19;
            if ((4793491 & i24) != 4793490) {
                z24 = true;
            } else {
                z24 = false;
            }
            if (o0VarE.n(i24 & 1, z24)) {
                if (i26 != 0) {
                    z17 = true;
                }
                if (i27 != 0) {
                    z18 = false;
                }
                if (i17 != 0) {
                    z27 = false;
                } else {
                    z27 = z19;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                strQ = gl1.y.Q(o0VarE, R.string.gak_lbl_new);
                strP = gl1.y.P(R.string.gak_lbl_badge_name, new Object[]{str2}, o0VarE);
                if (z27) {
                    strP = e5.g(strQ, StringUtils.SPACE, strP);
                }
                f14 = 84;
                g6.f.a aVar10 = g6.f.f75994b;
                h4.r rVarU4 = c2.x2.u(rVar, f14);
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarU4, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
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
                eVar = h5.g.a.f81810g;
                z28 = z27;
                b4.c(eVar, z0VarD, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                z29 = z17;
                if (o0VarE.T) {
                    i25 = i24;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.u uVar3 = c2.u.f22885a;
                    h4.g.a aVar11 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.j.c cVar4 = c2.j.f22696f;
                    aVar3 = h4.r.S;
                    if ((i25 & 29360128) == 8388608) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    objQ = o0VarE.q();
                    aVar4 = p3.m.f135153a;
                    if (z34) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ku1.a(aVar, 25);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new ku1.a(aVar, 25);
                        o0VarE.K(objQ);
                    }
                    h4.r rVarA3 = c2.l.A(u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15), 6, 0.0f, 2);
                    zB = o0VarE.B(strP);
                    objQ2 = o0VarE.q();
                    if (zB) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new jl0.e(strP, 19);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new jl0.e(strP, 19);
                        o0VarE.K(objQ2);
                    }
                    h4.r rVarC5 = p5.v.c((e23.l) objQ2, rVarA3, true);
                    zVarA = c2.y.a(cVar4, aVar11, o0VarE, 54);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC5, o0VarE);
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
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    f15 = 72;
                    wf.f.a aVar12 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                    str3 = str;
                    aVar12.f184930c = str3;
                    wf.f fVarA3 = aVar12.a();
                    f5.k.f68985a.getClass();
                    jf.t.a(fVarA3, null, null, h4.d.a.f81528f, f5.k.a.f68987b, z3.f.c(710542153, new e23.q() { // from class: l72.m
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            jf.w wVar = (jf.w) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            wVar.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(wVar) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                p3.x1 x1Var3 = p3.n.f135158a;
                                boolean z35 = ((jf.d.c) s9.c.c(wVar.getF98679b().f98632q, mVar2).getF182175a()) instanceof jf.d.c.C1894d;
                                float f16 = f14;
                                if (z35) {
                                    mVar2.C(-2132369904);
                                    float f17 = z18 ? 1.0f : 0.0f;
                                    h4.r rVarU5 = c2.x2.u(c2.x2.h(h4.r.S, f16), f15);
                                    jf.d f98679b = wVar.getF98679b();
                                    o4.e0.a aVar13 = o4.e0.f128843b;
                                    float[] fArrA = o4.g0.a();
                                    o4.g0.b(f17, fArrA);
                                    aVar13.getClass();
                                    u1.y0.a(f98679b, null, rVarU5, null, null, 0.0f, new o4.h0(fArrA, (p005kotlin.jvm.internal.j) null), mVar2, 432, 56);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-2131890427);
                                    o.b(f16, mVar2, 6);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 1769520, 1948);
                    if (z29) {
                        o0VarE.C(1100119526);
                        d6.p.f57793b.getClass();
                        int i212 = d6.p.f57795d;
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB3 = d92.c.b(j92.f.f97935l, o0VarE);
                        d6.h.f57752b.getClass();
                        int i35 = d6.h.f57755e;
                        d92.b.f58625c.getClass();
                        h4.r rVarU5 = c2.x2.u(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), f15);
                        objQ3 = o0VarE.q();
                        aVar4.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new p006l2.w2(28);
                            o0VarE.K(objQ3);
                        }
                        mh.c(str2, p5.v.c((e23.l) objQ3, rVarU5, false), 0L, null, 0L, null, 0L, d6.h.a(i35), 0L, i212, false, 2, 0, null, x0VarB3, o0VarE, 6, 24960, 109564);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1100583162);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    if (z28) {
                        o0VarE.C(99895842);
                        y3 y3Var3 = kotlin.t1.f91490h;
                        p3.v.a(y3Var3.c(new g6.d(((g6.c) o0VarE.A(y3Var3)).getF75991a(), 1.0f)), z3.f.c(1747606861, new fv1.b(strQ, 14), o0VarE), o0VarE, 56);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(100985616);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    z25 = z29;
                    z26 = z28;
                } else {
                    i25 = i24;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar4 = c2.u.f22885a;
                h4.g.a aVar13 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                c2.j.c cVar5 = c2.j.f22696f;
                aVar3 = h4.r.S;
                if ((i25 & 29360128) == 8388608) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                objQ = o0VarE.q();
                aVar4 = p3.m.f135153a;
                if (z34) {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ku1.a(aVar, 25);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new ku1.a(aVar, 25);
                    o0VarE.K(objQ);
                }
                h4.r rVarA4 = c2.l.A(u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15), 6, 0.0f, 2);
                zB = o0VarE.B(strP);
                objQ2 = o0VarE.q();
                if (zB) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new jl0.e(strP, 19);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new jl0.e(strP, 19);
                    o0VarE.K(objQ2);
                }
                h4.r rVarC6 = p5.v.c((e23.l) objQ2, rVarA4, true);
                zVarA = c2.y.a(cVar5, aVar13, o0VarE, 54);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC6, o0VarE);
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
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var4 = c2.b0.f22601a;
                f15 = 72;
                wf.f.a aVar14 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                str3 = str;
                aVar14.f184930c = str3;
                wf.f fVarA4 = aVar14.a();
                f5.k.f68985a.getClass();
                jf.t.a(fVarA4, null, null, h4.d.a.f81528f, f5.k.a.f68987b, z3.f.c(710542153, new e23.q() { // from class: l72.m
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        jf.w wVar = (jf.w) obj;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        wVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(wVar) ? 4 : 2;
                        }
                        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            boolean z35 = ((jf.d.c) s9.c.c(wVar.getF98679b().f98632q, mVar2).getF182175a()) instanceof jf.d.c.C1894d;
                            float f16 = f14;
                            if (z35) {
                                mVar2.C(-2132369904);
                                float f17 = z18 ? 1.0f : 0.0f;
                                h4.r rVarU6 = c2.x2.u(c2.x2.h(h4.r.S, f16), f15);
                                jf.d f98679b = wVar.getF98679b();
                                o4.e0.a aVar15 = o4.e0.f128843b;
                                float[] fArrA = o4.g0.a();
                                o4.g0.b(f17, fArrA);
                                aVar15.getClass();
                                u1.y0.a(f98679b, null, rVarU6, null, null, 0.0f, new o4.h0(fArrA, (p005kotlin.jvm.internal.j) null), mVar2, 432, 56);
                                mVar2.f();
                            } else {
                                mVar2.C(-2131890427);
                                o.b(f16, mVar2, 6);
                                mVar2.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 1769520, 1948);
                if (z29) {
                    o0VarE.C(1100119526);
                    d6.p.f57793b.getClass();
                    int i213 = d6.p.f57795d;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB4 = d92.c.b(j92.f.f97935l, o0VarE);
                    d6.h.f57752b.getClass();
                    int i36 = d6.h.f57755e;
                    d92.b.f58625c.getClass();
                    h4.r rVarU6 = c2.x2.u(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), f15);
                    objQ3 = o0VarE.q();
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new p006l2.w2(28);
                        o0VarE.K(objQ3);
                    }
                    mh.c(str2, p5.v.c((e23.l) objQ3, rVarU6, false), 0L, null, 0L, null, 0L, d6.h.a(i36), 0L, i213, false, 2, 0, null, x0VarB4, o0VarE, 6, 24960, 109564);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1100583162);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                if (z28) {
                    o0VarE.C(99895842);
                    y3 y3Var4 = kotlin.t1.f91490h;
                    p3.v.a(y3Var4.c(new g6.d(((g6.c) o0VarE.A(y3Var4)).getF75991a(), 1.0f)), z3.f.c(1747606861, new fv1.b(strQ, 14), o0VarE), o0VarE, 56);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(100985616);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                z25 = z29;
                z26 = z28;
            } else {
                str3 = str;
                o0VarE.e();
                z25 = z17;
                z26 = z19;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                final String str5 = str3;
                p2VarI0.f135219d = new e23.p() { // from class: l72.n
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o.a(rVar, str5, str2, z25, z18, z26, aVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 24576;
        z18 = z15;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                z19 = z16;
                if (o0VarE.h(z19)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            int i214 = i16 | 1572864;
            if (o0VarE.r(aVar)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i24 = i214 | i19;
            if ((4793491 & i24) != 4793490) {
                z24 = true;
            } else {
                z24 = false;
            }
            if (o0VarE.n(i24 & 1, z24)) {
                if (i26 != 0) {
                    z17 = true;
                }
                if (i27 != 0) {
                    z18 = false;
                }
                if (i17 != 0) {
                    z27 = false;
                } else {
                    z27 = z19;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                strQ = gl1.y.Q(o0VarE, R.string.gak_lbl_new);
                strP = gl1.y.P(R.string.gak_lbl_badge_name, new Object[]{str2}, o0VarE);
                if (z27) {
                    strP = e5.g(strQ, StringUtils.SPACE, strP);
                }
                f14 = 84;
                g6.f.a aVar15 = g6.f.f75994b;
                h4.r rVarU7 = c2.x2.u(rVar, f14);
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarU7, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
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
                eVar = h5.g.a.f81810g;
                z28 = z27;
                b4.c(eVar, z0VarD, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                z29 = z17;
                if (o0VarE.T) {
                    i25 = i24;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.u uVar5 = c2.u.f22885a;
                    h4.g.a aVar16 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.j.c cVar6 = c2.j.f22696f;
                    aVar3 = h4.r.S;
                    if ((i25 & 29360128) == 8388608) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    objQ = o0VarE.q();
                    aVar4 = p3.m.f135153a;
                    if (z34) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ku1.a(aVar, 25);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new ku1.a(aVar, 25);
                        o0VarE.K(objQ);
                    }
                    h4.r rVarA5 = c2.l.A(u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15), 6, 0.0f, 2);
                    zB = o0VarE.B(strP);
                    objQ2 = o0VarE.q();
                    if (zB) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new jl0.e(strP, 19);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new jl0.e(strP, 19);
                        o0VarE.K(objQ2);
                    }
                    h4.r rVarC7 = p5.v.c((e23.l) objQ2, rVarA5, true);
                    zVarA = c2.y.a(cVar6, aVar16, o0VarE, 54);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC7, o0VarE);
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
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    f15 = 72;
                    wf.f.a aVar17 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                    str3 = str;
                    aVar17.f184930c = str3;
                    wf.f fVarA5 = aVar17.a();
                    f5.k.f68985a.getClass();
                    jf.t.a(fVarA5, null, null, h4.d.a.f81528f, f5.k.a.f68987b, z3.f.c(710542153, new e23.q() { // from class: l72.m
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            jf.w wVar = (jf.w) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            wVar.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(wVar) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                p3.x1 x1Var4 = p3.n.f135158a;
                                boolean z35 = ((jf.d.c) s9.c.c(wVar.getF98679b().f98632q, mVar2).getF182175a()) instanceof jf.d.c.C1894d;
                                float f16 = f14;
                                if (z35) {
                                    mVar2.C(-2132369904);
                                    float f17 = z18 ? 1.0f : 0.0f;
                                    h4.r rVarU8 = c2.x2.u(c2.x2.h(h4.r.S, f16), f15);
                                    jf.d f98679b = wVar.getF98679b();
                                    o4.e0.a aVar18 = o4.e0.f128843b;
                                    float[] fArrA = o4.g0.a();
                                    o4.g0.b(f17, fArrA);
                                    aVar18.getClass();
                                    u1.y0.a(f98679b, null, rVarU8, null, null, 0.0f, new o4.h0(fArrA, (p005kotlin.jvm.internal.j) null), mVar2, 432, 56);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-2131890427);
                                    o.b(f16, mVar2, 6);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 1769520, 1948);
                    if (z29) {
                        o0VarE.C(1100119526);
                        d6.p.f57793b.getClass();
                        int i215 = d6.p.f57795d;
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB5 = d92.c.b(j92.f.f97935l, o0VarE);
                        d6.h.f57752b.getClass();
                        int i37 = d6.h.f57755e;
                        d92.b.f58625c.getClass();
                        h4.r rVarU8 = c2.x2.u(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), f15);
                        objQ3 = o0VarE.q();
                        aVar4.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new p006l2.w2(28);
                            o0VarE.K(objQ3);
                        }
                        mh.c(str2, p5.v.c((e23.l) objQ3, rVarU8, false), 0L, null, 0L, null, 0L, d6.h.a(i37), 0L, i215, false, 2, 0, null, x0VarB5, o0VarE, 6, 24960, 109564);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1100583162);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    if (z28) {
                        o0VarE.C(99895842);
                        y3 y3Var5 = kotlin.t1.f91490h;
                        p3.v.a(y3Var5.c(new g6.d(((g6.c) o0VarE.A(y3Var5)).getF75991a(), 1.0f)), z3.f.c(1747606861, new fv1.b(strQ, 14), o0VarE), o0VarE, 56);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(100985616);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    z25 = z29;
                    z26 = z28;
                } else {
                    i25 = i24;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar6 = c2.u.f22885a;
                h4.g.a aVar18 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                c2.j.c cVar7 = c2.j.f22696f;
                aVar3 = h4.r.S;
                if ((i25 & 29360128) == 8388608) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                objQ = o0VarE.q();
                aVar4 = p3.m.f135153a;
                if (z34) {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ku1.a(aVar, 25);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new ku1.a(aVar, 25);
                    o0VarE.K(objQ);
                }
                h4.r rVarA6 = c2.l.A(u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15), 6, 0.0f, 2);
                zB = o0VarE.B(strP);
                objQ2 = o0VarE.q();
                if (zB) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new jl0.e(strP, 19);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new jl0.e(strP, 19);
                    o0VarE.K(objQ2);
                }
                h4.r rVarC8 = p5.v.c((e23.l) objQ2, rVarA6, true);
                zVarA = c2.y.a(cVar7, aVar18, o0VarE, 54);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC8, o0VarE);
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
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var6 = c2.b0.f22601a;
                f15 = 72;
                wf.f.a aVar19 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                str3 = str;
                aVar19.f184930c = str3;
                wf.f fVarA6 = aVar19.a();
                f5.k.f68985a.getClass();
                jf.t.a(fVarA6, null, null, h4.d.a.f81528f, f5.k.a.f68987b, z3.f.c(710542153, new e23.q() { // from class: l72.m
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        jf.w wVar = (jf.w) obj;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        wVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(wVar) ? 4 : 2;
                        }
                        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            p3.x1 x1Var4 = p3.n.f135158a;
                            boolean z35 = ((jf.d.c) s9.c.c(wVar.getF98679b().f98632q, mVar2).getF182175a()) instanceof jf.d.c.C1894d;
                            float f16 = f14;
                            if (z35) {
                                mVar2.C(-2132369904);
                                float f17 = z18 ? 1.0f : 0.0f;
                                h4.r rVarU9 = c2.x2.u(c2.x2.h(h4.r.S, f16), f15);
                                jf.d f98679b = wVar.getF98679b();
                                o4.e0.a aVar110 = o4.e0.f128843b;
                                float[] fArrA = o4.g0.a();
                                o4.g0.b(f17, fArrA);
                                aVar110.getClass();
                                u1.y0.a(f98679b, null, rVarU9, null, null, 0.0f, new o4.h0(fArrA, (p005kotlin.jvm.internal.j) null), mVar2, 432, 56);
                                mVar2.f();
                            } else {
                                mVar2.C(-2131890427);
                                o.b(f16, mVar2, 6);
                                mVar2.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 1769520, 1948);
                if (z29) {
                    o0VarE.C(1100119526);
                    d6.p.f57793b.getClass();
                    int i216 = d6.p.f57795d;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB6 = d92.c.b(j92.f.f97935l, o0VarE);
                    d6.h.f57752b.getClass();
                    int i38 = d6.h.f57755e;
                    d92.b.f58625c.getClass();
                    h4.r rVarU9 = c2.x2.u(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), f15);
                    objQ3 = o0VarE.q();
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new p006l2.w2(28);
                        o0VarE.K(objQ3);
                    }
                    mh.c(str2, p5.v.c((e23.l) objQ3, rVarU9, false), 0L, null, 0L, null, 0L, d6.h.a(i38), 0L, i216, false, 2, 0, null, x0VarB6, o0VarE, 6, 24960, 109564);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1100583162);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                if (z28) {
                    o0VarE.C(99895842);
                    y3 y3Var6 = kotlin.t1.f91490h;
                    p3.v.a(y3Var6.c(new g6.d(((g6.c) o0VarE.A(y3Var6)).getF75991a(), 1.0f)), z3.f.c(1747606861, new fv1.b(strQ, 14), o0VarE), o0VarE, 56);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(100985616);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                z25 = z29;
                z26 = z28;
            } else {
                str3 = str;
                o0VarE.e();
                z25 = z17;
                z26 = z19;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                final String str6 = str3;
                p2VarI0.f135219d = new e23.p() { // from class: l72.n
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o.a(rVar, str6, str2, z25, z18, z26, aVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 196608;
        z19 = z16;
        int i217 = i16 | 1572864;
        if (o0VarE.r(aVar)) {
            i19 = 8388608;
        } else {
            i19 = 4194304;
        }
        i24 = i217 | i19;
        if ((4793491 & i24) != 4793490) {
            z24 = true;
        } else {
            z24 = false;
        }
        if (o0VarE.n(i24 & 1, z24)) {
            if (i26 != 0) {
                z17 = true;
            }
            if (i27 != 0) {
                z18 = false;
            }
            if (i17 != 0) {
                z27 = false;
            } else {
                z27 = z19;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            strQ = gl1.y.Q(o0VarE, R.string.gak_lbl_new);
            strP = gl1.y.P(R.string.gak_lbl_badge_name, new Object[]{str2}, o0VarE);
            if (z27) {
                strP = e5.g(strQ, StringUtils.SPACE, strP);
            }
            f14 = 84;
            g6.f.a aVar110 = g6.f.f75994b;
            h4.r rVarU10 = c2.x2.u(rVar, f14);
            h4.d.f81522a.getClass();
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarU10, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
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
            eVar = h5.g.a.f81810g;
            z28 = z27;
            b4.c(eVar, z0VarD, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            z29 = z17;
            if (o0VarE.T) {
                i25 = i24;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar7 = c2.u.f22885a;
                h4.g.a aVar111 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                c2.j.c cVar8 = c2.j.f22696f;
                aVar3 = h4.r.S;
                if ((i25 & 29360128) == 8388608) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                objQ = o0VarE.q();
                aVar4 = p3.m.f135153a;
                if (z34) {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ku1.a(aVar, 25);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new ku1.a(aVar, 25);
                    o0VarE.K(objQ);
                }
                h4.r rVarA7 = c2.l.A(u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15), 6, 0.0f, 2);
                zB = o0VarE.B(strP);
                objQ2 = o0VarE.q();
                if (zB) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new jl0.e(strP, 19);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new jl0.e(strP, 19);
                    o0VarE.K(objQ2);
                }
                h4.r rVarC9 = p5.v.c((e23.l) objQ2, rVarA7, true);
                zVarA = c2.y.a(cVar8, aVar111, o0VarE, 54);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC9, o0VarE);
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
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var7 = c2.b0.f22601a;
                f15 = 72;
                wf.f.a aVar112 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                str3 = str;
                aVar112.f184930c = str3;
                wf.f fVarA7 = aVar112.a();
                f5.k.f68985a.getClass();
                jf.t.a(fVarA7, null, null, h4.d.a.f81528f, f5.k.a.f68987b, z3.f.c(710542153, new e23.q() { // from class: l72.m
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        jf.w wVar = (jf.w) obj;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        wVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(wVar) ? 4 : 2;
                        }
                        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            p3.x1 x1Var5 = p3.n.f135158a;
                            boolean z35 = ((jf.d.c) s9.c.c(wVar.getF98679b().f98632q, mVar2).getF182175a()) instanceof jf.d.c.C1894d;
                            float f16 = f14;
                            if (z35) {
                                mVar2.C(-2132369904);
                                float f17 = z18 ? 1.0f : 0.0f;
                                h4.r rVarU11 = c2.x2.u(c2.x2.h(h4.r.S, f16), f15);
                                jf.d f98679b = wVar.getF98679b();
                                o4.e0.a aVar113 = o4.e0.f128843b;
                                float[] fArrA = o4.g0.a();
                                o4.g0.b(f17, fArrA);
                                aVar113.getClass();
                                u1.y0.a(f98679b, null, rVarU11, null, null, 0.0f, new o4.h0(fArrA, (p005kotlin.jvm.internal.j) null), mVar2, 432, 56);
                                mVar2.f();
                            } else {
                                mVar2.C(-2131890427);
                                o.b(f16, mVar2, 6);
                                mVar2.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 1769520, 1948);
                if (z29) {
                    o0VarE.C(1100119526);
                    d6.p.f57793b.getClass();
                    int i218 = d6.p.f57795d;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB7 = d92.c.b(j92.f.f97935l, o0VarE);
                    d6.h.f57752b.getClass();
                    int i39 = d6.h.f57755e;
                    d92.b.f58625c.getClass();
                    h4.r rVarU11 = c2.x2.u(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), f15);
                    objQ3 = o0VarE.q();
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new p006l2.w2(28);
                        o0VarE.K(objQ3);
                    }
                    mh.c(str2, p5.v.c((e23.l) objQ3, rVarU11, false), 0L, null, 0L, null, 0L, d6.h.a(i39), 0L, i218, false, 2, 0, null, x0VarB7, o0VarE, 6, 24960, 109564);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1100583162);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                if (z28) {
                    o0VarE.C(99895842);
                    y3 y3Var7 = kotlin.t1.f91490h;
                    p3.v.a(y3Var7.c(new g6.d(((g6.c) o0VarE.A(y3Var7)).getF75991a(), 1.0f)), z3.f.c(1747606861, new fv1.b(strQ, 14), o0VarE), o0VarE, 56);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(100985616);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                z25 = z29;
                z26 = z28;
            } else {
                i25 = i24;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar8 = c2.u.f22885a;
            h4.g.a aVar113 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.c cVar9 = c2.j.f22696f;
            aVar3 = h4.r.S;
            if ((i25 & 29360128) == 8388608) {
                z34 = true;
            } else {
                z34 = false;
            }
            objQ = o0VarE.q();
            aVar4 = p3.m.f135153a;
            if (z34) {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ku1.a(aVar, 25);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new ku1.a(aVar, 25);
                o0VarE.K(objQ);
            }
            h4.r rVarA8 = c2.l.A(u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15), 6, 0.0f, 2);
            zB = o0VarE.B(strP);
            objQ2 = o0VarE.q();
            if (zB) {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new jl0.e(strP, 19);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new jl0.e(strP, 19);
                o0VarE.K(objQ2);
            }
            h4.r rVarC10 = p5.v.c((e23.l) objQ2, rVarA8, true);
            zVarA = c2.y.a(cVar9, aVar113, o0VarE, 54);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarC10, o0VarE);
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
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var8 = c2.b0.f22601a;
            f15 = 72;
            wf.f.a aVar114 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            str3 = str;
            aVar114.f184930c = str3;
            wf.f fVarA8 = aVar114.a();
            f5.k.f68985a.getClass();
            jf.t.a(fVarA8, null, null, h4.d.a.f81528f, f5.k.a.f68987b, z3.f.c(710542153, new e23.q() { // from class: l72.m
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    jf.w wVar = (jf.w) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    wVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(wVar) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        p3.x1 x1Var5 = p3.n.f135158a;
                        boolean z35 = ((jf.d.c) s9.c.c(wVar.getF98679b().f98632q, mVar2).getF182175a()) instanceof jf.d.c.C1894d;
                        float f16 = f14;
                        if (z35) {
                            mVar2.C(-2132369904);
                            float f17 = z18 ? 1.0f : 0.0f;
                            h4.r rVarU12 = c2.x2.u(c2.x2.h(h4.r.S, f16), f15);
                            jf.d f98679b = wVar.getF98679b();
                            o4.e0.a aVar115 = o4.e0.f128843b;
                            float[] fArrA = o4.g0.a();
                            o4.g0.b(f17, fArrA);
                            aVar115.getClass();
                            u1.y0.a(f98679b, null, rVarU12, null, null, 0.0f, new o4.h0(fArrA, (p005kotlin.jvm.internal.j) null), mVar2, 432, 56);
                            mVar2.f();
                        } else {
                            mVar2.C(-2131890427);
                            o.b(f16, mVar2, 6);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 1769520, 1948);
            if (z29) {
                o0VarE.C(1100119526);
                d6.p.f57793b.getClass();
                int i219 = d6.p.f57795d;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarB8 = d92.c.b(j92.f.f97935l, o0VarE);
                d6.h.f57752b.getClass();
                int i310 = d6.h.f57755e;
                d92.b.f58625c.getClass();
                h4.r rVarU12 = c2.x2.u(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), f15);
                objQ3 = o0VarE.q();
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new p006l2.w2(28);
                    o0VarE.K(objQ3);
                }
                mh.c(str2, p5.v.c((e23.l) objQ3, rVarU12, false), 0L, null, 0L, null, 0L, d6.h.a(i310), 0L, i219, false, 2, 0, null, x0VarB8, o0VarE, 6, 24960, 109564);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1100583162);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            if (z28) {
                o0VarE.C(99895842);
                y3 y3Var8 = kotlin.t1.f91490h;
                p3.v.a(y3Var8.c(new g6.d(((g6.c) o0VarE.A(y3Var8)).getF75991a(), 1.0f)), z3.f.c(1747606861, new fv1.b(strQ, 14), o0VarE), o0VarE, 56);
                o0VarE.g0(false);
            } else {
                o0VarE.C(100985616);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            z25 = z29;
            z26 = z28;
        } else {
            str3 = str;
            o0VarE.e();
            z25 = z17;
            z26 = z19;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final String str7 = str3;
            p2VarI0.f135219d = new e23.p() { // from class: l72.n
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o.a(rVar, str7, str2, z25, z18, z26, aVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    public static final void b(float f14, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1800730439);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jF = d92.b.a(o0VarE).e().f();
            h4.r rVarQ = c2.x2.q(l4.k.g(h4.r.S, 90.0f), f14);
            boolean zL = o0VarE.l(jF);
            Object objQ = o0VarE.q();
            if (zL) {
                objQ = new j82.d(jF, 9);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j82.d(jF, 9);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarQ, (e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.o0(f14, i14, 3);
        }
    }
}
