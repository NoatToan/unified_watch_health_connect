package sn0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q;
import c2.u;
import c2.x2;
import c2.z;
import cn1.j;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import in0.h;
import in0.l;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import v62.e1;
import yz1.i;
import yz1.k;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    public static final void a(r rVar, nn0.c cVar, m mVar, int i14) {
        int i15;
        r rVar2;
        i53.c<h> cVar2;
        o0 o0VarE = mVar.E(865723380);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            List list = cVar != null ? cVar.f126686b : null;
            if (list == null) {
                list = j0.f134944a;
            }
            yz1.d dVar = cVar != null ? cVar.f126685a : null;
            i iVar = (cVar != null && ge1.b.R(cVar) && ((cVar2 = cVar.f126686b) == null || !l.a(cVar2))) ? i.VALID_DATA : i.EMPTY;
            i iVar2 = iVar;
            u4.d dVarB = o70.i.b(o70.i.f130000h);
            String strQ = y.Q(o0VarE, R.string.lbl_health_status_no_data_info);
            z3.e eVarC = f.c(-1060027678, new a31.a(list, 12), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new s70.r(context, 10);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new s70.r(context, 10);
                    o0VarE.K(objQ);
                }
            }
            yz1.d dVar2 = dVar;
            rVar2 = rVar;
            k.b(rVar2, dVar2, dVarB, eVarC, (e23.a) objQ, strQ, iVar2, o0VarE, (i15 & 14) | 3072);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar2, cVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0164  */
    /* JADX WARN: Code duplicated, block: B:62:0x0168  */
    /* JADX WARN: Code duplicated, block: B:65:0x017b  */
    /* JADX WARN: Code duplicated, block: B:68:0x018c  */
    /* JADX WARN: Code duplicated, block: B:72:0x019a  */
    /* JADX WARN: Code duplicated, block: B:73:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x0228  */
    /* JADX WARN: Code duplicated, block: B:79:0x022f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0233  */
    /* JADX WARN: Code duplicated, block: B:83:0x0240  */
    /* JADX WARN: Code duplicated, block: B:85:0x024e  */
    /* JADX WARN: Code duplicated, block: B:87:0x029b  */
    /* JADX WARN: Code duplicated, block: B:89:0x029f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0300  */
    public static final void b(r rVar, List<h> list, m mVar, int i14) {
        String str;
        String strJ;
        String strQ;
        boolean zB;
        Object objQ;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar;
        g.a.e eVar;
        g.a.C1623g c1623g;
        g.a.b bVar;
        Throwable th3;
        g.a.f fVar;
        boolean z14;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        o0 o0VarE = mVar.E(-2080352927);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (i14 & 6) == 0 ? i14 | (o0VarE.B(rVar) ? 4 : 2) : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            boolean zB2 = l.b(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                h.a aVar2 = ((h) obj).f94447b;
                if (aVar2 != null && l.d(aVar2)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            String strJ2 = "";
            if (list.isEmpty()) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2059359769, R.string.no_data_label, o0VarE, false);
            } else if (zB2) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2059357914, R.string.lbl_in_range, o0VarE, false);
            } else if (size > 1) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2059355578, R.string.lbl_outliers, o0VarE, false);
            } else {
                if (size == 1) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2059353211, R.string.lbl_outlier, o0VarE, false);
                } else {
                    o0VarE.C(584611421);
                    o0VarE.g0(false);
                    str = "";
                }
                strQ = y.Q(o0VarE, R.string.lbl_health_status);
                if (list.isEmpty()) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2059346649, R.string.no_data_label, o0VarE, false);
                } else if (zB2) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2059344794, R.string.lbl_in_range, o0VarE, false);
                } else if (size > 1) {
                    o0VarE.C(-2059342435);
                    strJ2 = y.P(R.string.lbl_x_outliers, new Object[]{Integer.valueOf(size)}, o0VarE);
                    o0VarE.g0(false);
                } else if (size == 1) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2059339351, R.string.lbl_one_outlier, o0VarE, false);
                } else {
                    o0VarE.C(585044925);
                    o0VarE.g0(false);
                }
                zB = o0VarE.B(strQ) | o0VarE.B(strJ2);
                objQ = o0VarE.q();
                if (zB) {
                    objQ = new j(strQ, strJ2, 15);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new j(strQ, strJ2, 15);
                        o0VarE.K(objQ);
                    }
                }
                r rVarC3 = v.c((e23.l) objQ, rVar, false);
                c2.j.f22691a.getClass();
                c2.j.c cVar2 = c2.j.f22696f;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(cVar2, h4.d.a.f81537o, o0VarE, 54);
                x1 x1Var2 = n.f135158a;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC3, o0VarE);
                g.V.getClass();
                aVar = g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                eVar = g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = g.a.f81813j;
                if (o0VarE.T) {
                    th3 = null;
                } else {
                    th3 = null;
                    if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    if (zB2) {
                        o0VarE.C(1556052195);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = e1.a(t62.b.f162798a);
                        long jD = hb.a.d(d92.b.f58623a, o0VarE);
                        gl.c.f77766a.getClass();
                        long jC = gl.c.a(o0VarE).c();
                        j92.b bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        float f14 = j92.b.f97901d.f97906e;
                        bVar2.getClass();
                        g02.i.a(null, dVarA, jD, jC, f14, j92.b.f97899b.f97918c, null, o0VarE, 0, 193);
                        o0VarE.g0(false);
                        z14 = true;
                    } else if (arrayList.isEmpty()) {
                        z14 = true;
                        o0VarE.C(1556881879);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1556403301);
                        r.a aVar3 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarQ = x2.q(aVar3, j92.b.f97901d.f97906e);
                        gl.c.f77766a.getClass();
                        r rVarE = u1.n.e(rVarQ, gl.c.a(o0VarE).h(), k2.i.f102406a);
                        z0VarD = q.d(h4.d.a.f81528f, false);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarE, o0VarE);
                        if (cVar != null) {
                            p0.l();
                            throw th3;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, z0VarD, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        u uVar = u.f22885a;
                        String strValueOf = String.valueOf(size);
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                        d6.h.f57752b.getClass();
                        z14 = true;
                        mh.c(strValueOf, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130046);
                        o0VarE = o0VarE;
                        o0VarE.g0(true);
                        o0VarE.g0(false);
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                    r.a aVar4 = r.S;
                    d92.b.f58625c.getClass();
                    r rVarC4 = c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                    d6.h.f57752b.getClass();
                    o0 o0Var = o0VarE;
                    mh.c(str, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 130044);
                    o0VarE = o0Var;
                    o0VarE.g0(z14);
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var2 = b0.f22601a;
                if (zB2) {
                    o0VarE.C(1556052195);
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = e1.a(t62.b.f162798a);
                    long jD2 = hb.a.d(d92.b.f58623a, o0VarE);
                    gl.c.f77766a.getClass();
                    long jC2 = gl.c.a(o0VarE).c();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    float f15 = j92.b.f97901d.f97906e;
                    bVar3.getClass();
                    g02.i.a(null, dVarA2, jD2, jC2, f15, j92.b.f97899b.f97918c, null, o0VarE, 0, 193);
                    o0VarE.g0(false);
                    z14 = true;
                } else if (arrayList.isEmpty()) {
                    o0VarE.C(1556403301);
                    r.a aVar5 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ2 = x2.q(aVar5, j92.b.f97901d.f97906e);
                    gl.c.f77766a.getClass();
                    r rVarE2 = u1.n.e(rVarQ2, gl.c.a(o0VarE).h(), k2.i.f102406a);
                    z0VarD = q.d(h4.d.a.f81528f, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarE2, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw th3;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    u uVar2 = u.f22885a;
                    String strValueOf2 = String.valueOf(size);
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
                    d6.h.f57752b.getClass();
                    z14 = true;
                    mh.c(strValueOf2, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130046);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                } else {
                    z14 = true;
                    o0VarE.C(1556881879);
                    o0VarE.g0(false);
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF2 = d92.c.f(j92.f.f97935l, o0VarE);
                r.a aVar6 = r.S;
                d92.b.f58625c.getClass();
                r rVarC5 = c2.l.C(aVar6, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                d6.h.f57752b.getClass();
                o0 o0Var2 = o0VarE;
                mh.c(str, rVarC5, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF2, o0Var2, 0, 0, 130044);
                o0VarE = o0Var2;
                o0VarE.g0(z14);
            }
            str = strJ;
            strQ = y.Q(o0VarE, R.string.lbl_health_status);
            if (list.isEmpty()) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2059346649, R.string.no_data_label, o0VarE, false);
            } else if (zB2) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2059344794, R.string.lbl_in_range, o0VarE, false);
            } else if (size > 1) {
                o0VarE.C(-2059342435);
                strJ2 = y.P(R.string.lbl_x_outliers, new Object[]{Integer.valueOf(size)}, o0VarE);
                o0VarE.g0(false);
            } else if (size == 1) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2059339351, R.string.lbl_one_outlier, o0VarE, false);
            } else {
                o0VarE.C(585044925);
                o0VarE.g0(false);
            }
            zB = o0VarE.B(strQ) | o0VarE.B(strJ2);
            objQ = o0VarE.q();
            if (zB) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new j(strQ, strJ2, 15);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new j(strQ, strJ2, 15);
                o0VarE.K(objQ);
            }
            r rVarC6 = v.c((e23.l) objQ, rVar, false);
            c2.j.f22691a.getClass();
            c2.j.c cVar3 = c2.j.f22696f;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(cVar3, h4.d.a.f81537o, o0VarE, 54);
            x1 x1Var3 = n.f135158a;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC6, o0VarE);
            g.V.getClass();
            aVar = g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            eVar = g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = g.a.f81813j;
            if (o0VarE.T) {
                th3 = null;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var3 = b0.f22601a;
                if (zB2) {
                    o0VarE.C(1556052195);
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = e1.a(t62.b.f162798a);
                    long jD3 = hb.a.d(d92.b.f58623a, o0VarE);
                    gl.c.f77766a.getClass();
                    long jC3 = gl.c.a(o0VarE).c();
                    j92.b bVar4 = d92.b.f58625c;
                    bVar4.getClass();
                    float f16 = j92.b.f97901d.f97906e;
                    bVar4.getClass();
                    g02.i.a(null, dVarA3, jD3, jC3, f16, j92.b.f97899b.f97918c, null, o0VarE, 0, 193);
                    o0VarE.g0(false);
                    z14 = true;
                } else if (arrayList.isEmpty()) {
                    o0VarE.C(1556403301);
                    r.a aVar7 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ3 = x2.q(aVar7, j92.b.f97901d.f97906e);
                    gl.c.f77766a.getClass();
                    r rVarE3 = u1.n.e(rVarQ3, gl.c.a(o0VarE).h(), k2.i.f102406a);
                    z0VarD = q.d(h4.d.a.f81528f, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarE3, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw th3;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    u uVar3 = u.f22885a;
                    String strValueOf3 = String.valueOf(size);
                    d92.b.f58624b.getClass();
                    x0 x0VarB3 = d92.c.b(j92.f.f97931h, o0VarE);
                    d6.h.f57752b.getClass();
                    z14 = true;
                    mh.c(strValueOf3, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, o0VarE, 0, 0, 130046);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                } else {
                    z14 = true;
                    o0VarE.C(1556881879);
                    o0VarE.g0(false);
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF3 = d92.c.f(j92.f.f97935l, o0VarE);
                r.a aVar8 = r.S;
                d92.b.f58625c.getClass();
                r rVarC7 = c2.l.C(aVar8, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                d6.h.f57752b.getClass();
                o0 o0Var3 = o0VarE;
                mh.c(str, rVarC7, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF3, o0Var3, 0, 0, 130044);
                o0VarE = o0Var3;
                o0VarE.g0(z14);
            } else {
                th3 = null;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            fVar = g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var4 = b0.f22601a;
            if (zB2) {
                o0VarE.C(1556052195);
                s62.a.f157643a.getClass();
                u4.d dVarA4 = e1.a(t62.b.f162798a);
                long jD4 = hb.a.d(d92.b.f58623a, o0VarE);
                gl.c.f77766a.getClass();
                long jC4 = gl.c.a(o0VarE).c();
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                float f17 = j92.b.f97901d.f97906e;
                bVar5.getClass();
                g02.i.a(null, dVarA4, jD4, jC4, f17, j92.b.f97899b.f97918c, null, o0VarE, 0, 193);
                o0VarE.g0(false);
                z14 = true;
            } else if (arrayList.isEmpty()) {
                o0VarE.C(1556403301);
                r.a aVar9 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarQ4 = x2.q(aVar9, j92.b.f97901d.f97906e);
                gl.c.f77766a.getClass();
                r rVarE4 = u1.n.e(rVarQ4, gl.c.a(o0VarE).h(), k2.i.f102406a);
                z0VarD = q.d(h4.d.a.f81528f, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarE4, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u uVar4 = u.f22885a;
                String strValueOf4 = String.valueOf(size);
                d92.b.f58624b.getClass();
                x0 x0VarB4 = d92.c.b(j92.f.f97931h, o0VarE);
                d6.h.f57752b.getClass();
                z14 = true;
                mh.c(strValueOf4, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB4, o0VarE, 0, 0, 130046);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                z14 = true;
                o0VarE.C(1556881879);
                o0VarE.g0(false);
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF4 = d92.c.f(j92.f.f97935l, o0VarE);
            r.a aVar10 = r.S;
            d92.b.f58625c.getClass();
            r rVarC8 = c2.l.C(aVar10, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
            d6.h.f57752b.getClass();
            o0 o0Var4 = o0VarE;
            mh.c(str, rVarC8, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF4, o0Var4, 0, 0, 130044);
            o0VarE = o0Var4;
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c82.d(rVar, list, i14, 1, (byte) 0);
        }
    }
}
