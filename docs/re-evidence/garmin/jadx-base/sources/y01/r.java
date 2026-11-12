package y01;

import c2.b0;
import c2.t2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import g21.f0;
import h5.e0;
import java.util.Iterator;
import java.util.List;
import l72.x0;
import l72.x2;
import o4.d0;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3 A[PHI: r16
      0x00c3: PHI (r16v2 float) = (r16v0 float), (r16v3 float) binds: [B:74:0x00db, B:67:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0110  */
    /* JADX WARN: Code duplicated, block: B:80:0x0117  */
    /* JADX WARN: Code duplicated, block: B:81:0x011b  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:0x013c  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dc A[LOOP:0: B:88:0x01d6->B:90:0x01dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0224  */
    /* JADX WARN: Code duplicated, block: B:94:0x0229  */
    /* JADX WARN: Code duplicated, block: B:97:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, v21.e eVar, final f0 f0Var, float f14, boolean z14, i53.c<b11.o> cVar, p3.m mVar, int i14, int i15) {
        int i16;
        float f15;
        boolean z15;
        final int i17;
        final int i18;
        boolean z16;
        float f16;
        boolean z17;
        p2 p2VarI0;
        float f17;
        float f18;
        final boolean z18;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        boolean z19;
        List listK;
        l22.a aVarS;
        Iterator it;
        boolean zR;
        int i19;
        final v21.e eVar2 = eVar;
        i53.c<b11.o> cVar2 = cVar;
        f0Var.getClass();
        cVar2.getClass();
        o0 o0VarE = mVar.E(-867663523);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(eVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(f0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                f15 = f14;
                int i24 = o0VarE.i(f15) ? 2048 : 1024;
                i16 |= i24;
            } else {
                f15 = f14;
            }
            i16 |= i24;
        } else {
            f15 = f14;
        }
        int i25 = i15 & 16;
        if (i25 == 0) {
            if ((i14 & 24576) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 16384 : 8192;
            }
            if ((196608 & i14) == 0) {
                if ((262144 & i14) == 0) {
                    zR = o0VarE.B(cVar2);
                } else {
                    zR = o0VarE.r(cVar2);
                }
                if (zR) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            i17 = 0;
            i18 = 1;
            if ((74899 & i16) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if ((i15 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f17 = j92.b.f97899b.f97920e;
                    } else {
                        f17 = f15;
                    }
                    f18 = f17;
                    if (i25 != 0) {
                        z18 = false;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    c2.j.i iVarI = c2.j.i(f18);
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (o0VarE.f135177b == null) {
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
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    x0 x0Var = x0.f111346a;
                    h4.r.a aVar2 = h4.r.S;
                    z3.e eVarC = z3.f.c(-1947153620, new e23.q() { // from class: y01.q
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i26 = i17;
                            boolean z24 = z18;
                            f0 f0Var2 = f0Var;
                            v21.e eVar3 = eVar2;
                            switch (i26) {
                                case 0:
                                    t2 t2Var = (t2) obj;
                                    p3.m mVar2 = (p3.m) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    t2Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                                    }
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        x1 x1Var2 = p3.n.f135158a;
                                        String strC = eVar3.c(f0Var2.f75417a);
                                        String strH = eVar3.H(gl1.y.Q(mVar2, R.string.lbl_calories), strC, false);
                                        x0 x0Var2 = x0.f111346a;
                                        String strQ = gl1.y.Q(mVar2, R.string.lbl_calories);
                                        f02.u.f67749a.getClass();
                                        x0.a aVar3 = new x0.a(f02.u.b(mVar2), null);
                                        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                        c0235a.f16962a.put("merge", strH);
                                        b92.a aVarB = c0235a.b();
                                        int i27 = iIntValue & 14;
                                        int i28 = b92.a.f16960b;
                                        int i29 = i27 | (x0.f111348c << 24);
                                        x0Var2.a(i29, 56, aVarB, t2Var, null, null, strC, strQ, null, aVar3, mVar2);
                                        String strW = eVar3.w(f0Var2.f75420d, z24);
                                        String strH2 = eVar3.H(gl1.y.Q(mVar2, R.string.protein), strW, true);
                                        String strQ2 = gl1.y.Q(mVar2, R.string.unit_g);
                                        String strQ3 = gl1.y.Q(mVar2, R.string.protein);
                                        x0.a aVar4 = new x0.a(f02.u.g(mVar2), null);
                                        b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                        c0235a2.f16962a.put("merge", strH2);
                                        x0Var2.a(i29, 48, c0235a2.b(), t2Var, null, null, strW, strQ3, strQ2, aVar4, mVar2);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                default:
                                    t2 t2Var2 = (t2) obj;
                                    p3.m mVar3 = (p3.m) obj2;
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    t2Var2.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                                    }
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        String strW2 = eVar3.w(f0Var2.f75419c, z24);
                                        String strH3 = eVar3.H(gl1.y.Q(mVar3, R.string.fat), strW2, true);
                                        x0 x0Var3 = x0.f111346a;
                                        String strQ4 = gl1.y.Q(mVar3, R.string.unit_g);
                                        String strQ5 = gl1.y.Q(mVar3, R.string.fat);
                                        f02.u.f67749a.getClass();
                                        x0.a aVar5 = new x0.a(f02.u.f(mVar3), null);
                                        b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                        c0235a3.f16962a.put("merge", strH3);
                                        b92.a aVarB2 = c0235a3.b();
                                        int i30 = b92.a.f16960b;
                                        int i34 = (iIntValue2 & 14) | (x0.f111348c << 24);
                                        x0Var3.a(i34, 48, aVarB2, t2Var2, null, null, strW2, strQ5, strQ4, aVar5, mVar3);
                                        String strW3 = eVar3.w(f0Var2.f75418b, z24);
                                        String strH4 = eVar3.H(gl1.y.Q(mVar3, R.string.carbs), strW3, true);
                                        String strQ6 = gl1.y.Q(mVar3, R.string.unit_g);
                                        String strQ7 = gl1.y.Q(mVar3, R.string.carbs);
                                        x0.a aVar6 = new x0.a(f02.u.e(mVar3), null);
                                        b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                                        c0235a4.f16962a.put("merge", strH4);
                                        x0Var3.a(i34, 48, c0235a4.b(), t2Var2, null, null, strW3, strQ7, strQ6, aVar6, mVar3);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE);
                    int i26 = (x0.f111348c << 6) | 54;
                    z19 = false;
                    x0Var.e(aVar2, eVarC, o0VarE, i26, 0);
                    x0Var.e(aVar2, z3.f.c(1906839459, new e23.q() { // from class: y01.q
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i27 = i18;
                            boolean z24 = z18;
                            f0 f0Var2 = f0Var;
                            v21.e eVar3 = eVar2;
                            switch (i27) {
                                case 0:
                                    t2 t2Var = (t2) obj;
                                    p3.m mVar2 = (p3.m) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    t2Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                                    }
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        x1 x1Var2 = p3.n.f135158a;
                                        String strC = eVar3.c(f0Var2.f75417a);
                                        String strH = eVar3.H(gl1.y.Q(mVar2, R.string.lbl_calories), strC, false);
                                        x0 x0Var2 = x0.f111346a;
                                        String strQ = gl1.y.Q(mVar2, R.string.lbl_calories);
                                        f02.u.f67749a.getClass();
                                        x0.a aVar3 = new x0.a(f02.u.b(mVar2), null);
                                        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                        c0235a.f16962a.put("merge", strH);
                                        b92.a aVarB = c0235a.b();
                                        int i28 = iIntValue & 14;
                                        int i29 = b92.a.f16960b;
                                        int i210 = i28 | (x0.f111348c << 24);
                                        x0Var2.a(i210, 56, aVarB, t2Var, null, null, strC, strQ, null, aVar3, mVar2);
                                        String strW = eVar3.w(f0Var2.f75420d, z24);
                                        String strH2 = eVar3.H(gl1.y.Q(mVar2, R.string.protein), strW, true);
                                        String strQ2 = gl1.y.Q(mVar2, R.string.unit_g);
                                        String strQ3 = gl1.y.Q(mVar2, R.string.protein);
                                        x0.a aVar4 = new x0.a(f02.u.g(mVar2), null);
                                        b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                        c0235a2.f16962a.put("merge", strH2);
                                        x0Var2.a(i210, 48, c0235a2.b(), t2Var, null, null, strW, strQ3, strQ2, aVar4, mVar2);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                default:
                                    t2 t2Var2 = (t2) obj;
                                    p3.m mVar3 = (p3.m) obj2;
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    t2Var2.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                                    }
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        String strW2 = eVar3.w(f0Var2.f75419c, z24);
                                        String strH3 = eVar3.H(gl1.y.Q(mVar3, R.string.fat), strW2, true);
                                        x0 x0Var3 = x0.f111346a;
                                        String strQ4 = gl1.y.Q(mVar3, R.string.unit_g);
                                        String strQ5 = gl1.y.Q(mVar3, R.string.fat);
                                        f02.u.f67749a.getClass();
                                        x0.a aVar5 = new x0.a(f02.u.f(mVar3), null);
                                        b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                        c0235a3.f16962a.put("merge", strH3);
                                        b92.a aVarB2 = c0235a3.b();
                                        int i30 = b92.a.f16960b;
                                        int i34 = (iIntValue2 & 14) | (x0.f111348c << 24);
                                        x0Var3.a(i34, 48, aVarB2, t2Var2, null, null, strW2, strQ5, strQ4, aVar5, mVar3);
                                        String strW3 = eVar3.w(f0Var2.f75418b, z24);
                                        String strH4 = eVar3.H(gl1.y.Q(mVar3, R.string.carbs), strW3, true);
                                        String strQ6 = gl1.y.Q(mVar3, R.string.unit_g);
                                        String strQ7 = gl1.y.Q(mVar3, R.string.carbs);
                                        x0.a aVar6 = new x0.a(f02.u.e(mVar3), null);
                                        b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                                        c0235a4.f16962a.put("merge", strH4);
                                        x0Var3.a(i34, 48, c0235a4.b(), t2Var2, null, null, strW3, strQ7, strQ6, aVar6, mVar3);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, i26, 0);
                    f02.u.f67749a.getClass();
                    gl.c cVar3 = gl.c.f77766a;
                    cVar3.getClass();
                    d0 d0VarA = d0.a(gl.c.a(o0VarE).q());
                    cVar3.getClass();
                    d0 d0VarA2 = d0.a(((d0) gl.c.a(o0VarE).f77764r.getF182175a()).f128833a);
                    cVar3.getClass();
                    listK = p13.x.k(d0VarA, d0VarA2, d0.a(gl.c.a(o0VarE).e()));
                    aVarS = a0.s(o0VarE);
                    o0VarE.C(626511126);
                    it = h0.Q(h0.S0(cVar2, listK.size()), 2).iterator();
                    while (it.hasNext()) {
                        boolean z24 = z19;
                        List list = listK;
                        x0.f111346a.e(h4.r.S, z3.f.c(-2086347401, new x91.n((List) it.next(), cVar2, list, aVarS, eVar2, 4), o0VarE), o0VarE, (x0.f111348c << 6) | 54, 0);
                        eVar2 = eVar;
                        cVar2 = cVar;
                        listK = list;
                        z19 = z24;
                        z18 = z18;
                        aVarS = aVarS;
                    }
                    boolean z25 = z18;
                    o0VarE.g0(z19);
                    o0VarE.g0(true);
                    x1 x1Var2 = p3.n.f135158a;
                    z17 = z25;
                    f16 = f18;
                } else {
                    o0VarE.e();
                    f18 = f15;
                }
                z18 = z15;
                o0VarE.h0();
                x1 x1Var3 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                c2.j.i iVarI2 = c2.j.i(f18);
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(iVarI2, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var2 = b0.f22601a;
                x0 x0Var2 = x0.f111346a;
                h4.r.a aVar3 = h4.r.S;
                z3.e eVarC2 = z3.f.c(-1947153620, new e23.q() { // from class: y01.q
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i27 = i17;
                        boolean z26 = z18;
                        f0 f0Var2 = f0Var;
                        v21.e eVar3 = eVar2;
                        switch (i27) {
                            case 0:
                                t2 t2Var = (t2) obj;
                                p3.m mVar2 = (p3.m) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                t2Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                                }
                                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    x1 x1Var4 = p3.n.f135158a;
                                    String strC = eVar3.c(f0Var2.f75417a);
                                    String strH = eVar3.H(gl1.y.Q(mVar2, R.string.lbl_calories), strC, false);
                                    x0 x0Var3 = x0.f111346a;
                                    String strQ = gl1.y.Q(mVar2, R.string.lbl_calories);
                                    f02.u.f67749a.getClass();
                                    x0.a aVar4 = new x0.a(f02.u.b(mVar2), null);
                                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                    c0235a.f16962a.put("merge", strH);
                                    b92.a aVarB = c0235a.b();
                                    int i28 = iIntValue & 14;
                                    int i29 = b92.a.f16960b;
                                    int i210 = i28 | (x0.f111348c << 24);
                                    x0Var3.a(i210, 56, aVarB, t2Var, null, null, strC, strQ, null, aVar4, mVar2);
                                    String strW = eVar3.w(f0Var2.f75420d, z26);
                                    String strH2 = eVar3.H(gl1.y.Q(mVar2, R.string.protein), strW, true);
                                    String strQ2 = gl1.y.Q(mVar2, R.string.unit_g);
                                    String strQ3 = gl1.y.Q(mVar2, R.string.protein);
                                    x0.a aVar5 = new x0.a(f02.u.g(mVar2), null);
                                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                    c0235a2.f16962a.put("merge", strH2);
                                    x0Var3.a(i210, 48, c0235a2.b(), t2Var, null, null, strW, strQ3, strQ2, aVar5, mVar2);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                t2 t2Var2 = (t2) obj;
                                p3.m mVar3 = (p3.m) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                t2Var2.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                                }
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    x1 x1Var5 = p3.n.f135158a;
                                    String strW2 = eVar3.w(f0Var2.f75419c, z26);
                                    String strH3 = eVar3.H(gl1.y.Q(mVar3, R.string.fat), strW2, true);
                                    x0 x0Var4 = x0.f111346a;
                                    String strQ4 = gl1.y.Q(mVar3, R.string.unit_g);
                                    String strQ5 = gl1.y.Q(mVar3, R.string.fat);
                                    f02.u.f67749a.getClass();
                                    x0.a aVar6 = new x0.a(f02.u.f(mVar3), null);
                                    b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                    c0235a3.f16962a.put("merge", strH3);
                                    b92.a aVarB2 = c0235a3.b();
                                    int i30 = b92.a.f16960b;
                                    int i34 = (iIntValue2 & 14) | (x0.f111348c << 24);
                                    x0Var4.a(i34, 48, aVarB2, t2Var2, null, null, strW2, strQ5, strQ4, aVar6, mVar3);
                                    String strW3 = eVar3.w(f0Var2.f75418b, z26);
                                    String strH4 = eVar3.H(gl1.y.Q(mVar3, R.string.carbs), strW3, true);
                                    String strQ6 = gl1.y.Q(mVar3, R.string.unit_g);
                                    String strQ7 = gl1.y.Q(mVar3, R.string.carbs);
                                    x0.a aVar7 = new x0.a(f02.u.e(mVar3), null);
                                    b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                                    c0235a4.f16962a.put("merge", strH4);
                                    x0Var4.a(i34, 48, c0235a4.b(), t2Var2, null, null, strW3, strQ7, strQ6, aVar7, mVar3);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE);
                int i27 = (x0.f111348c << 6) | 54;
                z19 = false;
                x0Var2.e(aVar3, eVarC2, o0VarE, i27, 0);
                x0Var2.e(aVar3, z3.f.c(1906839459, new e23.q() { // from class: y01.q
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i28 = i18;
                        boolean z26 = z18;
                        f0 f0Var2 = f0Var;
                        v21.e eVar3 = eVar2;
                        switch (i28) {
                            case 0:
                                t2 t2Var = (t2) obj;
                                p3.m mVar2 = (p3.m) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                t2Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                                }
                                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    x1 x1Var4 = p3.n.f135158a;
                                    String strC = eVar3.c(f0Var2.f75417a);
                                    String strH = eVar3.H(gl1.y.Q(mVar2, R.string.lbl_calories), strC, false);
                                    x0 x0Var3 = x0.f111346a;
                                    String strQ = gl1.y.Q(mVar2, R.string.lbl_calories);
                                    f02.u.f67749a.getClass();
                                    x0.a aVar4 = new x0.a(f02.u.b(mVar2), null);
                                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                    c0235a.f16962a.put("merge", strH);
                                    b92.a aVarB = c0235a.b();
                                    int i29 = iIntValue & 14;
                                    int i210 = b92.a.f16960b;
                                    int i211 = i29 | (x0.f111348c << 24);
                                    x0Var3.a(i211, 56, aVarB, t2Var, null, null, strC, strQ, null, aVar4, mVar2);
                                    String strW = eVar3.w(f0Var2.f75420d, z26);
                                    String strH2 = eVar3.H(gl1.y.Q(mVar2, R.string.protein), strW, true);
                                    String strQ2 = gl1.y.Q(mVar2, R.string.unit_g);
                                    String strQ3 = gl1.y.Q(mVar2, R.string.protein);
                                    x0.a aVar5 = new x0.a(f02.u.g(mVar2), null);
                                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                    c0235a2.f16962a.put("merge", strH2);
                                    x0Var3.a(i211, 48, c0235a2.b(), t2Var, null, null, strW, strQ3, strQ2, aVar5, mVar2);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                t2 t2Var2 = (t2) obj;
                                p3.m mVar3 = (p3.m) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                t2Var2.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                                }
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    x1 x1Var5 = p3.n.f135158a;
                                    String strW2 = eVar3.w(f0Var2.f75419c, z26);
                                    String strH3 = eVar3.H(gl1.y.Q(mVar3, R.string.fat), strW2, true);
                                    x0 x0Var4 = x0.f111346a;
                                    String strQ4 = gl1.y.Q(mVar3, R.string.unit_g);
                                    String strQ5 = gl1.y.Q(mVar3, R.string.fat);
                                    f02.u.f67749a.getClass();
                                    x0.a aVar6 = new x0.a(f02.u.f(mVar3), null);
                                    b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                    c0235a3.f16962a.put("merge", strH3);
                                    b92.a aVarB2 = c0235a3.b();
                                    int i30 = b92.a.f16960b;
                                    int i34 = (iIntValue2 & 14) | (x0.f111348c << 24);
                                    x0Var4.a(i34, 48, aVarB2, t2Var2, null, null, strW2, strQ5, strQ4, aVar6, mVar3);
                                    String strW3 = eVar3.w(f0Var2.f75418b, z26);
                                    String strH4 = eVar3.H(gl1.y.Q(mVar3, R.string.carbs), strW3, true);
                                    String strQ6 = gl1.y.Q(mVar3, R.string.unit_g);
                                    String strQ7 = gl1.y.Q(mVar3, R.string.carbs);
                                    x0.a aVar7 = new x0.a(f02.u.e(mVar3), null);
                                    b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                                    c0235a4.f16962a.put("merge", strH4);
                                    x0Var4.a(i34, 48, c0235a4.b(), t2Var2, null, null, strW3, strQ7, strQ6, aVar7, mVar3);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, i27, 0);
                f02.u.f67749a.getClass();
                gl.c cVar4 = gl.c.f77766a;
                cVar4.getClass();
                d0 d0VarA3 = d0.a(gl.c.a(o0VarE).q());
                cVar4.getClass();
                d0 d0VarA4 = d0.a(((d0) gl.c.a(o0VarE).f77764r.getF182175a()).f128833a);
                cVar4.getClass();
                listK = p13.x.k(d0VarA3, d0VarA4, d0.a(gl.c.a(o0VarE).e()));
                aVarS = a0.s(o0VarE);
                o0VarE.C(626511126);
                it = h0.Q(h0.S0(cVar2, listK.size()), 2).iterator();
                while (it.hasNext()) {
                    boolean z26 = z19;
                    List list2 = listK;
                    x0.f111346a.e(h4.r.S, z3.f.c(-2086347401, new x91.n((List) it.next(), cVar2, list2, aVarS, eVar2, 4), o0VarE), o0VarE, (x0.f111348c << 6) | 54, 0);
                    eVar2 = eVar;
                    cVar2 = cVar;
                    listK = list2;
                    z19 = z26;
                    z18 = z18;
                    aVarS = aVarS;
                }
                boolean z27 = z18;
                o0VarE.g0(z19);
                o0VarE.g0(true);
                x1 x1Var4 = p3.n.f135158a;
                z17 = z27;
                f16 = f18;
            } else {
                o0VarE.e();
                f16 = f15;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new x2(rVar, eVar, f0Var, f16, z17, cVar, i14, i15);
            }
        }
        i16 |= 24576;
        z15 = z14;
        if ((196608 & i14) == 0) {
            if ((262144 & i14) == 0) {
                zR = o0VarE.B(cVar2);
            } else {
                zR = o0VarE.r(cVar2);
            }
            if (zR) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i16 |= i19;
        }
        i17 = 0;
        i18 = 1;
        if ((74899 & i16) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f17 = j92.b.f97899b.f97920e;
                } else {
                    f17 = f15;
                }
                f18 = f17;
                if (i25 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
            } else {
                if ((i15 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f17 = j92.b.f97899b.f97920e;
                } else {
                    f17 = f15;
                }
                f18 = f17;
                if (i25 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
            }
            o0VarE.h0();
            x1 x1Var5 = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.i iVarI3 = c2.j.i(f18);
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(iVarI3, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var3 = b0.f22601a;
            x0 x0Var3 = x0.f111346a;
            h4.r.a aVar4 = h4.r.S;
            z3.e eVarC3 = z3.f.c(-1947153620, new e23.q() { // from class: y01.q
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i28 = i17;
                    boolean z28 = z18;
                    f0 f0Var2 = f0Var;
                    v21.e eVar3 = eVar2;
                    switch (i28) {
                        case 0:
                            t2 t2Var = (t2) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var6 = p3.n.f135158a;
                                String strC = eVar3.c(f0Var2.f75417a);
                                String strH = eVar3.H(gl1.y.Q(mVar2, R.string.lbl_calories), strC, false);
                                x0 x0Var4 = x0.f111346a;
                                String strQ = gl1.y.Q(mVar2, R.string.lbl_calories);
                                f02.u.f67749a.getClass();
                                x0.a aVar5 = new x0.a(f02.u.b(mVar2), null);
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                c0235a.f16962a.put("merge", strH);
                                b92.a aVarB = c0235a.b();
                                int i29 = iIntValue & 14;
                                int i210 = b92.a.f16960b;
                                int i211 = i29 | (x0.f111348c << 24);
                                x0Var4.a(i211, 56, aVarB, t2Var, null, null, strC, strQ, null, aVar5, mVar2);
                                String strW = eVar3.w(f0Var2.f75420d, z28);
                                String strH2 = eVar3.H(gl1.y.Q(mVar2, R.string.protein), strW, true);
                                String strQ2 = gl1.y.Q(mVar2, R.string.unit_g);
                                String strQ3 = gl1.y.Q(mVar2, R.string.protein);
                                x0.a aVar6 = new x0.a(f02.u.g(mVar2), null);
                                b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                c0235a2.f16962a.put("merge", strH2);
                                x0Var4.a(i211, 48, c0235a2.b(), t2Var, null, null, strW, strQ3, strQ2, aVar6, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2 t2Var2 = (t2) obj;
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var7 = p3.n.f135158a;
                                String strW2 = eVar3.w(f0Var2.f75419c, z28);
                                String strH3 = eVar3.H(gl1.y.Q(mVar3, R.string.fat), strW2, true);
                                x0 x0Var5 = x0.f111346a;
                                String strQ4 = gl1.y.Q(mVar3, R.string.unit_g);
                                String strQ5 = gl1.y.Q(mVar3, R.string.fat);
                                f02.u.f67749a.getClass();
                                x0.a aVar7 = new x0.a(f02.u.f(mVar3), null);
                                b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                c0235a3.f16962a.put("merge", strH3);
                                b92.a aVarB2 = c0235a3.b();
                                int i30 = b92.a.f16960b;
                                int i34 = (iIntValue2 & 14) | (x0.f111348c << 24);
                                x0Var5.a(i34, 48, aVarB2, t2Var2, null, null, strW2, strQ5, strQ4, aVar7, mVar3);
                                String strW3 = eVar3.w(f0Var2.f75418b, z28);
                                String strH4 = eVar3.H(gl1.y.Q(mVar3, R.string.carbs), strW3, true);
                                String strQ6 = gl1.y.Q(mVar3, R.string.unit_g);
                                String strQ7 = gl1.y.Q(mVar3, R.string.carbs);
                                x0.a aVar8 = new x0.a(f02.u.e(mVar3), null);
                                b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                                c0235a4.f16962a.put("merge", strH4);
                                x0Var5.a(i34, 48, c0235a4.b(), t2Var2, null, null, strW3, strQ7, strQ6, aVar8, mVar3);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            int i28 = (x0.f111348c << 6) | 54;
            z19 = false;
            x0Var3.e(aVar4, eVarC3, o0VarE, i28, 0);
            x0Var3.e(aVar4, z3.f.c(1906839459, new e23.q() { // from class: y01.q
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i29 = i18;
                    boolean z28 = z18;
                    f0 f0Var2 = f0Var;
                    v21.e eVar3 = eVar2;
                    switch (i29) {
                        case 0:
                            t2 t2Var = (t2) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var6 = p3.n.f135158a;
                                String strC = eVar3.c(f0Var2.f75417a);
                                String strH = eVar3.H(gl1.y.Q(mVar2, R.string.lbl_calories), strC, false);
                                x0 x0Var4 = x0.f111346a;
                                String strQ = gl1.y.Q(mVar2, R.string.lbl_calories);
                                f02.u.f67749a.getClass();
                                x0.a aVar5 = new x0.a(f02.u.b(mVar2), null);
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                c0235a.f16962a.put("merge", strH);
                                b92.a aVarB = c0235a.b();
                                int i210 = iIntValue & 14;
                                int i211 = b92.a.f16960b;
                                int i212 = i210 | (x0.f111348c << 24);
                                x0Var4.a(i212, 56, aVarB, t2Var, null, null, strC, strQ, null, aVar5, mVar2);
                                String strW = eVar3.w(f0Var2.f75420d, z28);
                                String strH2 = eVar3.H(gl1.y.Q(mVar2, R.string.protein), strW, true);
                                String strQ2 = gl1.y.Q(mVar2, R.string.unit_g);
                                String strQ3 = gl1.y.Q(mVar2, R.string.protein);
                                x0.a aVar6 = new x0.a(f02.u.g(mVar2), null);
                                b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                c0235a2.f16962a.put("merge", strH2);
                                x0Var4.a(i212, 48, c0235a2.b(), t2Var, null, null, strW, strQ3, strQ2, aVar6, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2 t2Var2 = (t2) obj;
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var7 = p3.n.f135158a;
                                String strW2 = eVar3.w(f0Var2.f75419c, z28);
                                String strH3 = eVar3.H(gl1.y.Q(mVar3, R.string.fat), strW2, true);
                                x0 x0Var5 = x0.f111346a;
                                String strQ4 = gl1.y.Q(mVar3, R.string.unit_g);
                                String strQ5 = gl1.y.Q(mVar3, R.string.fat);
                                f02.u.f67749a.getClass();
                                x0.a aVar7 = new x0.a(f02.u.f(mVar3), null);
                                b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                c0235a3.f16962a.put("merge", strH3);
                                b92.a aVarB2 = c0235a3.b();
                                int i30 = b92.a.f16960b;
                                int i34 = (iIntValue2 & 14) | (x0.f111348c << 24);
                                x0Var5.a(i34, 48, aVarB2, t2Var2, null, null, strW2, strQ5, strQ4, aVar7, mVar3);
                                String strW3 = eVar3.w(f0Var2.f75418b, z28);
                                String strH4 = eVar3.H(gl1.y.Q(mVar3, R.string.carbs), strW3, true);
                                String strQ6 = gl1.y.Q(mVar3, R.string.unit_g);
                                String strQ7 = gl1.y.Q(mVar3, R.string.carbs);
                                x0.a aVar8 = new x0.a(f02.u.e(mVar3), null);
                                b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                                c0235a4.f16962a.put("merge", strH4);
                                x0Var5.a(i34, 48, c0235a4.b(), t2Var2, null, null, strW3, strQ7, strQ6, aVar8, mVar3);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, i28, 0);
            f02.u.f67749a.getClass();
            gl.c cVar5 = gl.c.f77766a;
            cVar5.getClass();
            d0 d0VarA5 = d0.a(gl.c.a(o0VarE).q());
            cVar5.getClass();
            d0 d0VarA6 = d0.a(((d0) gl.c.a(o0VarE).f77764r.getF182175a()).f128833a);
            cVar5.getClass();
            listK = p13.x.k(d0VarA5, d0VarA6, d0.a(gl.c.a(o0VarE).e()));
            aVarS = a0.s(o0VarE);
            o0VarE.C(626511126);
            it = h0.Q(h0.S0(cVar2, listK.size()), 2).iterator();
            while (it.hasNext()) {
                boolean z28 = z19;
                List list3 = listK;
                x0.f111346a.e(h4.r.S, z3.f.c(-2086347401, new x91.n((List) it.next(), cVar2, list3, aVarS, eVar2, 4), o0VarE), o0VarE, (x0.f111348c << 6) | 54, 0);
                eVar2 = eVar;
                cVar2 = cVar;
                listK = list3;
                z19 = z28;
                z18 = z18;
                aVarS = aVarS;
            }
            boolean z29 = z18;
            o0VarE.g0(z19);
            o0VarE.g0(true);
            x1 x1Var6 = p3.n.f135158a;
            z17 = z29;
            f16 = f18;
        } else {
            o0VarE.e();
            f16 = f15;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x2(rVar, eVar, f0Var, f16, z17, cVar, i14, i15);
        }
    }
}
