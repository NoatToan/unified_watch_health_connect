package rr0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import fb1.q0;
import h5.e0;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.y0;
import v62.e1;

/* JADX INFO: loaded from: classes8.dex */
public final class w {
    /* JADX WARN: Code duplicated, block: B:101:0x026d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0277  */
    /* JADX WARN: Code duplicated, block: B:104:0x027b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0281  */
    /* JADX WARN: Code duplicated, block: B:108:0x0288  */
    /* JADX WARN: Code duplicated, block: B:110:0x0292  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:114:0x0305  */
    /* JADX WARN: Code duplicated, block: B:116:0x0309  */
    /* JADX WARN: Code duplicated, block: B:118:0x030d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0317  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x0100  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:60:0x0109  */
    /* JADX WARN: Code duplicated, block: B:62:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:67:0x012a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:77:0x019e  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203  */
    /* JADX WARN: Code duplicated, block: B:90:0x020c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0210  */
    /* JADX WARN: Code duplicated, block: B:94:0x021f  */
    /* JADX WARN: Code duplicated, block: B:96:0x022d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0265  */
    public static final void a(Double d14, Double d15, boolean z14, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        p2 p2VarI0;
        boolean z18;
        Context context;
        final x00.a aVar;
        long jC;
        final boolean z19;
        i53.f fVarA;
        i53.f fVarA2;
        int iDoubleValue;
        final int iDoubleValue2;
        final String strB;
        h4.r.a aVar2;
        Object objQ;
        p3.m.a.C2565a c2565a;
        o0 o0Var;
        boolean zR;
        Object objQ2;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar3;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        boolean z24;
        h5.g.a.f fVar;
        b0 b0Var;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        boolean z25;
        Integer numValueOf;
        int iDoubleValue3;
        Integer numG;
        String strD;
        o0 o0VarE = mVar.E(902094478);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(d14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(d15) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 256 : 128;
            }
            if ((i16 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                x1 x1Var = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                aVar = new x00.a(context);
                f02.e.f67730a.getClass();
                jC = f02.e.c(o0VarE);
                gl.c.f77766a.getClass();
                long jB = gl.c.a(o0VarE).b();
                long jD = gl.c.a(o0VarE).d();
                if (!z18 || d14 == null || d15 == null || d14.doubleValue() < d15.doubleValue()) {
                    z19 = false;
                } else {
                    z19 = true;
                }
                if (d14 != null || d15 == null || z18) {
                    fVarA = i53.a.a(new z72.l(1.0f, jC, null));
                } else {
                    if (z19) {
                        fVarA2 = i53.a.a(new z72.l(1.0f, jD, null));
                        o0VarE = o0VarE;
                    } else {
                        float fDoubleValue = ((float) d14.doubleValue()) / ((float) d15.doubleValue());
                        fVarA = i53.a.a(new z72.l(fDoubleValue, jB, null), new z72.l(1.0f - fDoubleValue, jC, null));
                    }
                    if (d14 != null) {
                        iDoubleValue = (int) d14.doubleValue();
                    } else {
                        iDoubleValue = 0;
                    }
                    if (d15 != null) {
                        iDoubleValue2 = (int) d15.doubleValue();
                    } else {
                        iDoubleValue2 = 0;
                    }
                    if (iDoubleValue == 0 || !z18) {
                        strB = aVar.b(Integer.valueOf(iDoubleValue));
                    } else {
                        strB = aVar.d();
                    }
                    aVar2 = h4.r.S;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new rk0.n(18);
                        o0Var = o0VarE;
                        o0Var.K(objQ);
                    } else {
                        o0Var = o0VarE;
                    }
                    h4.r rVarC3 = p5.v.c((e23.l) objQ, aVar2, true);
                    zR = o0Var.r(context) | o0Var.k(iDoubleValue) | o0Var.k(iDoubleValue2);
                    objQ2 = o0Var.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new q0(context, iDoubleValue, iDoubleValue2, 2);
                        o0Var.K(objQ2);
                    }
                    h4.r rVarB = p5.v.b(rVarC3, (e23.l) objQ2);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0Var, 0);
                    iHashCode = Long.hashCode(o0Var.U);
                    i2VarA0 = o0Var.a0();
                    rVarC = h4.k.c(rVarB, o0Var);
                    h5.g.V.getClass();
                    aVar3 = h5.g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar3);
                    } else {
                        o0Var.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, o0Var);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0Var);
                    bVar = h5.g.a.f81813j;
                    if (o0Var.T) {
                        z24 = z18;
                    } else {
                        z24 = z18;
                        if (!p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, o0Var);
                        b0Var = b0.f22601a;
                        g6.f.a aVar4 = g6.f.f75994b;
                        h4.r rVarC4 = c2.l.C(aVar2, 0.0f, 16, 0.0f, 12, 5);
                        z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        iHashCode2 = Long.hashCode(o0Var.U);
                        i2VarA1 = o0Var.a0();
                        rVarC2 = h4.k.c(rVarC4, o0Var);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0Var.z();
                        i53.f fVar2 = fVarA2;
                        if (o0Var.T) {
                            o0Var.M(aVar3);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD, o0Var);
                        b4.c(c1623g, i2VarA1, o0Var);
                        if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, o0Var);
                        c2.u uVar = c2.u.f22885a;
                        o0VarE = o0Var;
                        z72.k.c(x2.q(aVar2, 192), fVar2, null, null, 0.0f, 0.0f, z3.f.c(233046252, new e23.q() { // from class: rr0.v
                            @Override // e23.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                h4.g.a aVar5;
                                c2.t tVar = (c2.t) obj;
                                p3.m mVar2 = (p3.m) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                tVar.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= mVar2.B(tVar) ? 4 : 2;
                                }
                                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    h4.r.a aVar6 = h4.r.S;
                                    h4.d.f81522a.getClass();
                                    h4.r rVarC5 = tVar.c(aVar6, h4.d.a.f81528f);
                                    c2.j.f22691a.getClass();
                                    c2.z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                                    int iHashCode3 = Long.hashCode(mVar2.getU());
                                    i2 i2VarX = mVar2.x();
                                    h4.r rVarC6 = h4.k.c(rVarC5, mVar2);
                                    h5.g.V.getClass();
                                    e0.a aVar7 = h5.g.a.f81805b;
                                    if (mVar2.F() == null) {
                                        p0.l();
                                        throw null;
                                    }
                                    mVar2.z();
                                    if (mVar2.getT()) {
                                        mVar2.M(aVar7);
                                    } else {
                                        mVar2.c();
                                    }
                                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                                    }
                                    b4.c(h5.g.a.f81807d, rVarC6, mVar2);
                                    b0 b0Var2 = b0.f22601a;
                                    boolean z26 = z19;
                                    if (z26) {
                                        mVar2.C(-1949656973);
                                        g6.f.a aVar8 = g6.f.f75994b;
                                        c2.l.f(x2.h(aVar6, 24), mVar2);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1949571444);
                                        mVar2.f();
                                    }
                                    h4.g.a aVar9 = h4.d.a.f81537o;
                                    h4.r rVarB2 = b0Var2.b(aVar6, aVar9);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    h4.r.a aVar10 = aVar6;
                                    mh.c(strB, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97928e), mVar2), mVar2, 0, 0, 131068);
                                    p3.m mVar3 = mVar2;
                                    int i18 = iDoubleValue2;
                                    if (i18 > 0) {
                                        mVar3.C(-1949264017);
                                        aVar5 = aVar9;
                                        mh.c(aVar.b(Integer.valueOf(i18)), b0Var2.b(aVar10, aVar9), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar3), mVar3, 0, 0, 131068);
                                        mVar3.f();
                                    } else {
                                        aVar5 = aVar9;
                                        mVar3.C(-1948959380);
                                        mVar3.f();
                                    }
                                    if (z26) {
                                        aVar10 = aVar10;
                                        mVar3 = mVar3;
                                        mVar3.C(-1948881973);
                                        s62.a.f157643a.getClass();
                                        u4.d dVarA = e1.a(t62.b.f162798a);
                                        o4.r rVarA = o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar3).f().e());
                                        g6.f.a aVar11 = g6.f.f75994b;
                                        y0.b(dVarA, "", b0Var2.b(x2.q(c2.l.C(aVar10, 0.0f, 16, 0.0f, 0.0f, 13), 24), aVar5), rVarA, mVar3, 48, 56);
                                        mVar3.f();
                                    } else {
                                        aVar10 = aVar10;
                                        mVar3 = mVar3;
                                        mVar3.C(-1948428660);
                                        mVar3.f();
                                    }
                                    mVar3.y();
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0Var), o0VarE, 12582918, 124);
                        o0VarE.g0(true);
                        if (z24) {
                            z25 = true;
                            o0VarE.C(2128202270);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(2127802494);
                            if (d14 != null) {
                                numValueOf = Integer.valueOf((int) d14.doubleValue());
                            } else {
                                numValueOf = null;
                            }
                            if (d15 != null) {
                                iDoubleValue3 = (int) d15.doubleValue();
                            } else {
                                iDoubleValue3 = 0;
                            }
                            numG = oe2.f.g(iDoubleValue3, numValueOf);
                            if (numG != null || (strD = String.valueOf(numG.intValue())) == null) {
                                strD = aVar.d();
                            }
                            String strA = aVar.f188233a.a(R.string.lbl_step_details_percent_of_goal, strD);
                            h4.r rVarB2 = b0Var.b(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, 8, 7), h4.d.a.f81537o);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            z25 = true;
                            mh.c(strA, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                            o0VarE = o0VarE;
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z25);
                        z17 = z24;
                    }
                    v.h.A(iHashCode, o0Var, iHashCode, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0Var);
                    b0Var = b0.f22601a;
                    g6.f.a aVar5 = g6.f.f75994b;
                    h4.r rVarC5 = c2.l.C(aVar2, 0.0f, 16, 0.0f, 12, 5);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode2 = Long.hashCode(o0Var.U);
                    i2VarA1 = o0Var.a0();
                    rVarC2 = h4.k.c(rVarC5, o0Var);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    i53.f fVar3 = fVarA2;
                    if (o0Var.T) {
                        o0Var.M(aVar3);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, z0VarD, o0Var);
                    b4.c(c1623g, i2VarA1, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0Var);
                    c2.u uVar2 = c2.u.f22885a;
                    o0VarE = o0Var;
                    z72.k.c(x2.q(aVar2, 192), fVar3, null, null, 0.0f, 0.0f, z3.f.c(233046252, new e23.q() { // from class: rr0.v
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            h4.g.a aVar6;
                            c2.t tVar = (c2.t) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            tVar.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(tVar) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                h4.r.a aVar7 = h4.r.S;
                                h4.d.f81522a.getClass();
                                h4.r rVarC6 = tVar.c(aVar7, h4.d.a.f81528f);
                                c2.j.f22691a.getClass();
                                c2.z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                                int iHashCode3 = Long.hashCode(mVar2.getU());
                                i2 i2VarX = mVar2.x();
                                h4.r rVarC7 = h4.k.c(rVarC6, mVar2);
                                h5.g.V.getClass();
                                e0.a aVar8 = h5.g.a.f81805b;
                                if (mVar2.F() == null) {
                                    p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar8);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                                    v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                                }
                                b4.c(h5.g.a.f81807d, rVarC7, mVar2);
                                b0 b0Var2 = b0.f22601a;
                                boolean z26 = z19;
                                if (z26) {
                                    mVar2.C(-1949656973);
                                    g6.f.a aVar9 = g6.f.f75994b;
                                    c2.l.f(x2.h(aVar7, 24), mVar2);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1949571444);
                                    mVar2.f();
                                }
                                h4.g.a aVar10 = h4.d.a.f81537o;
                                h4.r rVarB3 = b0Var2.b(aVar7, aVar10);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                h4.r.a aVar11 = aVar7;
                                mh.c(strB, rVarB3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97928e), mVar2), mVar2, 0, 0, 131068);
                                p3.m mVar3 = mVar2;
                                int i18 = iDoubleValue2;
                                if (i18 > 0) {
                                    mVar3.C(-1949264017);
                                    aVar6 = aVar10;
                                    mh.c(aVar.b(Integer.valueOf(i18)), b0Var2.b(aVar11, aVar10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar3), mVar3, 0, 0, 131068);
                                    mVar3.f();
                                } else {
                                    aVar6 = aVar10;
                                    mVar3.C(-1948959380);
                                    mVar3.f();
                                }
                                if (z26) {
                                    aVar11 = aVar11;
                                    mVar3 = mVar3;
                                    mVar3.C(-1948881973);
                                    s62.a.f157643a.getClass();
                                    u4.d dVarA = e1.a(t62.b.f162798a);
                                    o4.r rVarA = o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar3).f().e());
                                    g6.f.a aVar12 = g6.f.f75994b;
                                    y0.b(dVarA, "", b0Var2.b(x2.q(c2.l.C(aVar11, 0.0f, 16, 0.0f, 0.0f, 13), 24), aVar6), rVarA, mVar3, 48, 56);
                                    mVar3.f();
                                } else {
                                    aVar11 = aVar11;
                                    mVar3 = mVar3;
                                    mVar3.C(-1948428660);
                                    mVar3.f();
                                }
                                mVar3.y();
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0Var), o0VarE, 12582918, 124);
                    o0VarE.g0(true);
                    if (z24) {
                        o0VarE.C(2127802494);
                        if (d14 != null) {
                            numValueOf = Integer.valueOf((int) d14.doubleValue());
                        } else {
                            numValueOf = null;
                        }
                        if (d15 != null) {
                            iDoubleValue3 = (int) d15.doubleValue();
                        } else {
                            iDoubleValue3 = 0;
                        }
                        numG = oe2.f.g(iDoubleValue3, numValueOf);
                        if (numG != null) {
                            strD = aVar.d();
                        } else {
                            strD = aVar.d();
                        }
                        String strA2 = aVar.f188233a.a(R.string.lbl_step_details_percent_of_goal, strD);
                        h4.r rVarB3 = b0Var.b(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, 8, 7), h4.d.a.f81537o);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        z25 = true;
                        mh.c(strA2, rVarB3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        z25 = true;
                        o0VarE.C(2128202270);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z25);
                    z17 = z24;
                }
                fVarA2 = fVarA;
                if (d14 != null) {
                    iDoubleValue = (int) d14.doubleValue();
                } else {
                    iDoubleValue = 0;
                }
                if (d15 != null) {
                    iDoubleValue2 = (int) d15.doubleValue();
                } else {
                    iDoubleValue2 = 0;
                }
                if (iDoubleValue == 0) {
                    strB = aVar.b(Integer.valueOf(iDoubleValue));
                } else {
                    strB = aVar.b(Integer.valueOf(iDoubleValue));
                }
                aVar2 = h4.r.S;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new rk0.n(18);
                    o0Var = o0VarE;
                    o0Var.K(objQ);
                } else {
                    o0Var = o0VarE;
                }
                h4.r rVarC6 = p5.v.c((e23.l) objQ, aVar2, true);
                zR = o0Var.r(context) | o0Var.k(iDoubleValue) | o0Var.k(iDoubleValue2);
                objQ2 = o0Var.q();
                if (zR) {
                    objQ2 = new q0(context, iDoubleValue, iDoubleValue2, 2);
                    o0Var.K(objQ2);
                } else {
                    objQ2 = new q0(context, iDoubleValue, iDoubleValue2, 2);
                    o0Var.K(objQ2);
                }
                h4.r rVarB4 = p5.v.b(rVarC6, (e23.l) objQ2);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0Var, 0);
                iHashCode = Long.hashCode(o0Var.U);
                i2VarA0 = o0Var.a0();
                rVarC = h4.k.c(rVarB4, o0Var);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar3);
                } else {
                    o0Var.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0Var);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0Var);
                bVar = h5.g.a.f81813j;
                if (o0Var.T) {
                    z24 = z18;
                    if (!p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0Var);
                    b0Var = b0.f22601a;
                    g6.f.a aVar6 = g6.f.f75994b;
                    h4.r rVarC7 = c2.l.C(aVar2, 0.0f, 16, 0.0f, 12, 5);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode2 = Long.hashCode(o0Var.U);
                    i2VarA1 = o0Var.a0();
                    rVarC2 = h4.k.c(rVarC7, o0Var);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    i53.f fVar4 = fVarA2;
                    if (o0Var.T) {
                        o0Var.M(aVar3);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, z0VarD, o0Var);
                    b4.c(c1623g, i2VarA1, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0Var);
                    c2.u uVar3 = c2.u.f22885a;
                    o0VarE = o0Var;
                    z72.k.c(x2.q(aVar2, 192), fVar4, null, null, 0.0f, 0.0f, z3.f.c(233046252, new e23.q() { // from class: rr0.v
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            h4.g.a aVar7;
                            c2.t tVar = (c2.t) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            tVar.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(tVar) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                h4.r.a aVar8 = h4.r.S;
                                h4.d.f81522a.getClass();
                                h4.r rVarC8 = tVar.c(aVar8, h4.d.a.f81528f);
                                c2.j.f22691a.getClass();
                                c2.z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                                int iHashCode3 = Long.hashCode(mVar2.getU());
                                i2 i2VarX = mVar2.x();
                                h4.r rVarC9 = h4.k.c(rVarC8, mVar2);
                                h5.g.V.getClass();
                                e0.a aVar9 = h5.g.a.f81805b;
                                if (mVar2.F() == null) {
                                    p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar9);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                                    v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                                }
                                b4.c(h5.g.a.f81807d, rVarC9, mVar2);
                                b0 b0Var2 = b0.f22601a;
                                boolean z26 = z19;
                                if (z26) {
                                    mVar2.C(-1949656973);
                                    g6.f.a aVar10 = g6.f.f75994b;
                                    c2.l.f(x2.h(aVar8, 24), mVar2);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1949571444);
                                    mVar2.f();
                                }
                                h4.g.a aVar11 = h4.d.a.f81537o;
                                h4.r rVarB5 = b0Var2.b(aVar8, aVar11);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                h4.r.a aVar12 = aVar8;
                                mh.c(strB, rVarB5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97928e), mVar2), mVar2, 0, 0, 131068);
                                p3.m mVar3 = mVar2;
                                int i18 = iDoubleValue2;
                                if (i18 > 0) {
                                    mVar3.C(-1949264017);
                                    aVar7 = aVar11;
                                    mh.c(aVar.b(Integer.valueOf(i18)), b0Var2.b(aVar12, aVar11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar3), mVar3, 0, 0, 131068);
                                    mVar3.f();
                                } else {
                                    aVar7 = aVar11;
                                    mVar3.C(-1948959380);
                                    mVar3.f();
                                }
                                if (z26) {
                                    aVar12 = aVar12;
                                    mVar3 = mVar3;
                                    mVar3.C(-1948881973);
                                    s62.a.f157643a.getClass();
                                    u4.d dVarA = e1.a(t62.b.f162798a);
                                    o4.r rVarA = o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar3).f().e());
                                    g6.f.a aVar13 = g6.f.f75994b;
                                    y0.b(dVarA, "", b0Var2.b(x2.q(c2.l.C(aVar12, 0.0f, 16, 0.0f, 0.0f, 13), 24), aVar7), rVarA, mVar3, 48, 56);
                                    mVar3.f();
                                } else {
                                    aVar12 = aVar12;
                                    mVar3 = mVar3;
                                    mVar3.C(-1948428660);
                                    mVar3.f();
                                }
                                mVar3.y();
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0Var), o0VarE, 12582918, 124);
                    o0VarE.g0(true);
                    if (z24) {
                        o0VarE.C(2127802494);
                        if (d14 != null) {
                            numValueOf = Integer.valueOf((int) d14.doubleValue());
                        } else {
                            numValueOf = null;
                        }
                        if (d15 != null) {
                            iDoubleValue3 = (int) d15.doubleValue();
                        } else {
                            iDoubleValue3 = 0;
                        }
                        numG = oe2.f.g(iDoubleValue3, numValueOf);
                        if (numG != null) {
                            strD = aVar.d();
                        } else {
                            strD = aVar.d();
                        }
                        String strA3 = aVar.f188233a.a(R.string.lbl_step_details_percent_of_goal, strD);
                        h4.r rVarB5 = b0Var.b(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, 8, 7), h4.d.a.f81537o);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        z25 = true;
                        mh.c(strA3, rVarB5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        z25 = true;
                        o0VarE.C(2128202270);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z25);
                    z17 = z24;
                } else {
                    z24 = z18;
                }
                v.h.A(iHashCode, o0Var, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0Var);
                b0Var = b0.f22601a;
                g6.f.a aVar7 = g6.f.f75994b;
                h4.r rVarC8 = c2.l.C(aVar2, 0.0f, 16, 0.0f, 12, 5);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(rVarC8, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                i53.f fVar5 = fVarA2;
                if (o0Var.T) {
                    o0Var.M(aVar3);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, z0VarD, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0Var);
                c2.u uVar4 = c2.u.f22885a;
                o0VarE = o0Var;
                z72.k.c(x2.q(aVar2, 192), fVar5, null, null, 0.0f, 0.0f, z3.f.c(233046252, new e23.q() { // from class: rr0.v
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        h4.g.a aVar8;
                        c2.t tVar = (c2.t) obj;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        tVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(tVar) ? 4 : 2;
                        }
                        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            x1 x1Var2 = p3.n.f135158a;
                            h4.r.a aVar9 = h4.r.S;
                            h4.d.f81522a.getClass();
                            h4.r rVarC9 = tVar.c(aVar9, h4.d.a.f81528f);
                            c2.j.f22691a.getClass();
                            c2.z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                            int iHashCode3 = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC10 = h4.k.c(rVarC9, mVar2);
                            h5.g.V.getClass();
                            e0.a aVar10 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar10);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                            }
                            b4.c(h5.g.a.f81807d, rVarC10, mVar2);
                            b0 b0Var2 = b0.f22601a;
                            boolean z26 = z19;
                            if (z26) {
                                mVar2.C(-1949656973);
                                g6.f.a aVar11 = g6.f.f75994b;
                                c2.l.f(x2.h(aVar9, 24), mVar2);
                                mVar2.f();
                            } else {
                                mVar2.C(-1949571444);
                                mVar2.f();
                            }
                            h4.g.a aVar12 = h4.d.a.f81537o;
                            h4.r rVarB6 = b0Var2.b(aVar9, aVar12);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            h4.r.a aVar13 = aVar9;
                            mh.c(strB, rVarB6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97928e), mVar2), mVar2, 0, 0, 131068);
                            p3.m mVar3 = mVar2;
                            int i18 = iDoubleValue2;
                            if (i18 > 0) {
                                mVar3.C(-1949264017);
                                aVar8 = aVar12;
                                mh.c(aVar.b(Integer.valueOf(i18)), b0Var2.b(aVar13, aVar12), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar3), mVar3, 0, 0, 131068);
                                mVar3.f();
                            } else {
                                aVar8 = aVar12;
                                mVar3.C(-1948959380);
                                mVar3.f();
                            }
                            if (z26) {
                                aVar13 = aVar13;
                                mVar3 = mVar3;
                                mVar3.C(-1948881973);
                                s62.a.f157643a.getClass();
                                u4.d dVarA = e1.a(t62.b.f162798a);
                                o4.r rVarA = o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar3).f().e());
                                g6.f.a aVar14 = g6.f.f75994b;
                                y0.b(dVarA, "", b0Var2.b(x2.q(c2.l.C(aVar13, 0.0f, 16, 0.0f, 0.0f, 13), 24), aVar8), rVarA, mVar3, 48, 56);
                                mVar3.f();
                            } else {
                                aVar13 = aVar13;
                                mVar3 = mVar3;
                                mVar3.C(-1948428660);
                                mVar3.f();
                            }
                            mVar3.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0Var), o0VarE, 12582918, 124);
                o0VarE.g0(true);
                if (z24) {
                    o0VarE.C(2127802494);
                    if (d14 != null) {
                        numValueOf = Integer.valueOf((int) d14.doubleValue());
                    } else {
                        numValueOf = null;
                    }
                    if (d15 != null) {
                        iDoubleValue3 = (int) d15.doubleValue();
                    } else {
                        iDoubleValue3 = 0;
                    }
                    numG = oe2.f.g(iDoubleValue3, numValueOf);
                    if (numG != null) {
                        strD = aVar.d();
                    } else {
                        strD = aVar.d();
                    }
                    String strA4 = aVar.f188233a.a(R.string.lbl_step_details_percent_of_goal, strD);
                    h4.r rVarB6 = b0Var.b(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, 8, 7), h4.d.a.f81537o);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    z25 = true;
                    mh.c(strA4, rVarB6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    z25 = true;
                    o0VarE.C(2128202270);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z25);
                z17 = z24;
            } else {
                o0VarE.e();
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new cn1.a(d14, d15, z17, i14, i15, 7);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i16 & 147) != 146) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i17 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = p3.n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            aVar = new x00.a(context);
            f02.e.f67730a.getClass();
            jC = f02.e.c(o0VarE);
            gl.c.f77766a.getClass();
            long jB2 = gl.c.a(o0VarE).b();
            long jD2 = gl.c.a(o0VarE).d();
            if (z18) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (d14 != null) {
                fVarA = i53.a.a(new z72.l(1.0f, jC, null));
                fVarA2 = fVarA;
            } else {
                fVarA = i53.a.a(new z72.l(1.0f, jC, null));
                fVarA2 = fVarA;
            }
            if (d14 != null) {
                iDoubleValue = (int) d14.doubleValue();
            } else {
                iDoubleValue = 0;
            }
            if (d15 != null) {
                iDoubleValue2 = (int) d15.doubleValue();
            } else {
                iDoubleValue2 = 0;
            }
            if (iDoubleValue == 0) {
                strB = aVar.b(Integer.valueOf(iDoubleValue));
            } else {
                strB = aVar.b(Integer.valueOf(iDoubleValue));
            }
            aVar2 = h4.r.S;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new rk0.n(18);
                o0Var = o0VarE;
                o0Var.K(objQ);
            } else {
                o0Var = o0VarE;
            }
            h4.r rVarC9 = p5.v.c((e23.l) objQ, aVar2, true);
            zR = o0Var.r(context) | o0Var.k(iDoubleValue) | o0Var.k(iDoubleValue2);
            objQ2 = o0Var.q();
            if (zR) {
                objQ2 = new q0(context, iDoubleValue, iDoubleValue2, 2);
                o0Var.K(objQ2);
            } else {
                objQ2 = new q0(context, iDoubleValue, iDoubleValue2, 2);
                o0Var.K(objQ2);
            }
            h4.r rVarB7 = p5.v.b(rVarC9, (e23.l) objQ2);
            c2.j.f22691a.getClass();
            c2.j.k kVar3 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar3, h4.d.a.f81536n, o0Var, 0);
            iHashCode = Long.hashCode(o0Var.U);
            i2VarA0 = o0Var.a0();
            rVarC = h4.k.c(rVarB7, o0Var);
            h5.g.V.getClass();
            aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0Var);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0Var);
            bVar = h5.g.a.f81813j;
            if (o0Var.T) {
                z24 = z18;
                if (!p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0Var);
                b0Var = b0.f22601a;
                g6.f.a aVar8 = g6.f.f75994b;
                h4.r rVarC10 = c2.l.C(aVar2, 0.0f, 16, 0.0f, 12, 5);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(rVarC10, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                i53.f fVar6 = fVarA2;
                if (o0Var.T) {
                    o0Var.M(aVar3);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, z0VarD, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0Var);
                c2.u uVar5 = c2.u.f22885a;
                o0VarE = o0Var;
                z72.k.c(x2.q(aVar2, 192), fVar6, null, null, 0.0f, 0.0f, z3.f.c(233046252, new e23.q() { // from class: rr0.v
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        h4.g.a aVar9;
                        c2.t tVar = (c2.t) obj;
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        tVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(tVar) ? 4 : 2;
                        }
                        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            x1 x1Var3 = p3.n.f135158a;
                            h4.r.a aVar10 = h4.r.S;
                            h4.d.f81522a.getClass();
                            h4.r rVarC11 = tVar.c(aVar10, h4.d.a.f81528f);
                            c2.j.f22691a.getClass();
                            c2.z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                            int iHashCode3 = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC12 = h4.k.c(rVarC11, mVar2);
                            h5.g.V.getClass();
                            e0.a aVar11 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar11);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                            }
                            b4.c(h5.g.a.f81807d, rVarC12, mVar2);
                            b0 b0Var2 = b0.f22601a;
                            boolean z26 = z19;
                            if (z26) {
                                mVar2.C(-1949656973);
                                g6.f.a aVar12 = g6.f.f75994b;
                                c2.l.f(x2.h(aVar10, 24), mVar2);
                                mVar2.f();
                            } else {
                                mVar2.C(-1949571444);
                                mVar2.f();
                            }
                            h4.g.a aVar13 = h4.d.a.f81537o;
                            h4.r rVarB8 = b0Var2.b(aVar10, aVar13);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            h4.r.a aVar14 = aVar10;
                            mh.c(strB, rVarB8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97928e), mVar2), mVar2, 0, 0, 131068);
                            p3.m mVar3 = mVar2;
                            int i18 = iDoubleValue2;
                            if (i18 > 0) {
                                mVar3.C(-1949264017);
                                aVar9 = aVar13;
                                mh.c(aVar.b(Integer.valueOf(i18)), b0Var2.b(aVar14, aVar13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar3), mVar3, 0, 0, 131068);
                                mVar3.f();
                            } else {
                                aVar9 = aVar13;
                                mVar3.C(-1948959380);
                                mVar3.f();
                            }
                            if (z26) {
                                aVar14 = aVar14;
                                mVar3 = mVar3;
                                mVar3.C(-1948881973);
                                s62.a.f157643a.getClass();
                                u4.d dVarA = e1.a(t62.b.f162798a);
                                o4.r rVarA = o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar3).f().e());
                                g6.f.a aVar15 = g6.f.f75994b;
                                y0.b(dVarA, "", b0Var2.b(x2.q(c2.l.C(aVar14, 0.0f, 16, 0.0f, 0.0f, 13), 24), aVar9), rVarA, mVar3, 48, 56);
                                mVar3.f();
                            } else {
                                aVar14 = aVar14;
                                mVar3 = mVar3;
                                mVar3.C(-1948428660);
                                mVar3.f();
                            }
                            mVar3.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0Var), o0VarE, 12582918, 124);
                o0VarE.g0(true);
                if (z24) {
                    o0VarE.C(2127802494);
                    if (d14 != null) {
                        numValueOf = Integer.valueOf((int) d14.doubleValue());
                    } else {
                        numValueOf = null;
                    }
                    if (d15 != null) {
                        iDoubleValue3 = (int) d15.doubleValue();
                    } else {
                        iDoubleValue3 = 0;
                    }
                    numG = oe2.f.g(iDoubleValue3, numValueOf);
                    if (numG != null) {
                        strD = aVar.d();
                    } else {
                        strD = aVar.d();
                    }
                    String strA5 = aVar.f188233a.a(R.string.lbl_step_details_percent_of_goal, strD);
                    h4.r rVarB8 = b0Var.b(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, 8, 7), h4.d.a.f81537o);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    z25 = true;
                    mh.c(strA5, rVarB8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    z25 = true;
                    o0VarE.C(2128202270);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z25);
                z17 = z24;
            } else {
                z24 = z18;
            }
            v.h.A(iHashCode, o0Var, iHashCode, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0Var);
            b0Var = b0.f22601a;
            g6.f.a aVar9 = g6.f.f75994b;
            h4.r rVarC11 = c2.l.C(aVar2, 0.0f, 16, 0.0f, 12, 5);
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode2 = Long.hashCode(o0Var.U);
            i2VarA1 = o0Var.a0();
            rVarC2 = h4.k.c(rVarC11, o0Var);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            i53.f fVar7 = fVarA2;
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            b4.c(eVar, z0VarD, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0Var);
            c2.u uVar6 = c2.u.f22885a;
            o0VarE = o0Var;
            z72.k.c(x2.q(aVar2, 192), fVar7, null, null, 0.0f, 0.0f, z3.f.c(233046252, new e23.q() { // from class: rr0.v
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    h4.g.a aVar10;
                    c2.t tVar = (c2.t) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(tVar) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var3 = p3.n.f135158a;
                        h4.r.a aVar11 = h4.r.S;
                        h4.d.f81522a.getClass();
                        h4.r rVarC12 = tVar.c(aVar11, h4.d.a.f81528f);
                        c2.j.f22691a.getClass();
                        c2.z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode3 = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC13 = h4.k.c(rVarC12, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar12 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar12);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC13, mVar2);
                        b0 b0Var2 = b0.f22601a;
                        boolean z26 = z19;
                        if (z26) {
                            mVar2.C(-1949656973);
                            g6.f.a aVar13 = g6.f.f75994b;
                            c2.l.f(x2.h(aVar11, 24), mVar2);
                            mVar2.f();
                        } else {
                            mVar2.C(-1949571444);
                            mVar2.f();
                        }
                        h4.g.a aVar14 = h4.d.a.f81537o;
                        h4.r rVarB9 = b0Var2.b(aVar11, aVar14);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        h4.r.a aVar15 = aVar11;
                        mh.c(strB, rVarB9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97928e), mVar2), mVar2, 0, 0, 131068);
                        p3.m mVar3 = mVar2;
                        int i18 = iDoubleValue2;
                        if (i18 > 0) {
                            mVar3.C(-1949264017);
                            aVar10 = aVar14;
                            mh.c(aVar.b(Integer.valueOf(i18)), b0Var2.b(aVar15, aVar14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar3), mVar3, 0, 0, 131068);
                            mVar3.f();
                        } else {
                            aVar10 = aVar14;
                            mVar3.C(-1948959380);
                            mVar3.f();
                        }
                        if (z26) {
                            aVar15 = aVar15;
                            mVar3 = mVar3;
                            mVar3.C(-1948881973);
                            s62.a.f157643a.getClass();
                            u4.d dVarA = e1.a(t62.b.f162798a);
                            o4.r rVarA = o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar3).f().e());
                            g6.f.a aVar16 = g6.f.f75994b;
                            y0.b(dVarA, "", b0Var2.b(x2.q(c2.l.C(aVar15, 0.0f, 16, 0.0f, 0.0f, 13), 24), aVar10), rVarA, mVar3, 48, 56);
                            mVar3.f();
                        } else {
                            aVar15 = aVar15;
                            mVar3 = mVar3;
                            mVar3.C(-1948428660);
                            mVar3.f();
                        }
                        mVar3.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var), o0VarE, 12582918, 124);
            o0VarE.g0(true);
            if (z24) {
                o0VarE.C(2127802494);
                if (d14 != null) {
                    numValueOf = Integer.valueOf((int) d14.doubleValue());
                } else {
                    numValueOf = null;
                }
                if (d15 != null) {
                    iDoubleValue3 = (int) d15.doubleValue();
                } else {
                    iDoubleValue3 = 0;
                }
                numG = oe2.f.g(iDoubleValue3, numValueOf);
                if (numG != null) {
                    strD = aVar.d();
                } else {
                    strD = aVar.d();
                }
                String strA6 = aVar.f188233a.a(R.string.lbl_step_details_percent_of_goal, strD);
                h4.r rVarB9 = b0Var.b(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, 8, 7), h4.d.a.f81537o);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                z25 = true;
                mh.c(strA6, rVarB9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                z25 = true;
                o0VarE.C(2128202270);
                o0VarE.g0(false);
            }
            o0VarE.g0(z25);
            z17 = z24;
        } else {
            o0VarE.e();
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.a(d14, d15, z17, i14, i15, 7);
        }
    }
}
