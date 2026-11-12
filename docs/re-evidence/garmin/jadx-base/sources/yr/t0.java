package yr;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.a1;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.w1;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.k6;
import v62.l3;
import v62.m3;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 {
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1  */
    public static final void a(t2 t2Var, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        u4.d dVarA;
        p3.o0 o0VarE = mVar.E(-831520567);
        int i15 = i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            l72.f0.a aVar3 = l72.f0.a.f111000a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_like);
            s62.a aVar4 = s62.a.f157643a;
            if (z14) {
                aVar4.getClass();
                dVarA = l3.a(t62.b.f162798a);
            } else {
                aVar4.getClass();
                dVarA = m3.a(t62.b.f162798a);
            }
            u4.d dVar = dVarA;
            h4.r.a aVar5 = h4.r.S;
            h4.r rVarA = t2Var.a(aVar5, 0.5f, true);
            boolean z15 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            p3.m.a aVar6 = p3.m.f135153a;
            if (z15) {
                objQ = new ya0.l(aVar, 22);
                o0VarE.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ya0.l(aVar, 22);
                    o0VarE.K(objQ);
                }
            }
            aVar3.h(0, 8, (e23.a) objQ, rVarA, strQ, o0VarE, dVar, false);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_comment);
            s62.a.f157643a.getClass();
            u4.d dVarA2 = v62.x1.a(t62.b.f162798a);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA2 = t2Var.a(c2.l.C(aVar5, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), 0.5f, true);
            boolean z16 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new ya0.l(aVar2, 23);
                o0VarE.K(objQ2);
            } else {
                aVar6.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ya0.l(aVar2, 23);
                    o0VarE.K(objQ2);
                }
            }
            aVar3.h(0, 8, (e23.a) objQ2, rVarA2, strQ2, o0VarE, dVarA2, false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x72.m(t2Var, z14, aVar, aVar2, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(t2 t2Var, ArrayList arrayList, String str, e23.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0Var2;
        p3.o0 o0VarE = mVar.E(-317145340);
        int i15 = 16;
        int i16 = i14 | (o0VarE.r(arrayList) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        int i17 = 0;
        int i18 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            int size = arrayList.size();
            h4.r rVarA = t2Var.a(h4.r.S, 0.5f, true);
            boolean z14 = (i16 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new ya0.l(aVar, 18);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ya0.l(aVar, 18);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarA, false, null, null, (e23.a) objQ, 15);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(-1717401156);
            int i19 = 0;
            for (Object obj : p13.h0.G0(arrayList)) {
                int i24 = i19 + 1;
                if (i19 < 0) {
                    p13.x.q();
                    throw null;
                }
                wf.f.a aVar3 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                aVar3.f184930c = (String) obj;
                wf.g.a(aVar3);
                wf.f fVarA = aVar3.a();
                t4.d dVarA = n5.c.a(R.drawable.avatar_default, o0VarE, i17);
                t4.d dVarA2 = n5.c.a(R.drawable.avatar_default, o0VarE, i17);
                h4.r.a aVar4 = h4.r.S;
                g6.f.a aVar5 = g6.f.f75994b;
                float f14 = i19;
                h4.r rVarV = c2.l.v(aVar4, (-2) * f14, 0.0f, 2);
                k2.h hVar = k2.i.f102406a;
                h4.r rVarB = h4.p.b(x2.q(l4.k.b(rVarV, hVar), i15), size - f14);
                float f15 = i18;
                d92.b.f58623a.getClass();
                jf.r.b(fVarA, null, c2.l.y(u1.q.b(f15, d92.b.a(o0VarE).c().b(), rVarB, hVar), f15), dVarA, dVarA2, null, null, null, null, null, null, null, o0VarE, 48, 0, 32736);
                i18 = 1;
                i17 = 0;
                i19 = i24;
                size = size;
                i15 = i15;
            }
            boolean z15 = i17;
            o0VarE.g0(z15);
            if (str == null) {
                o0VarE.C(-1698920417);
                o0VarE.g0(z15);
                o0Var2 = o0VarE;
            } else {
                o0VarE.C(-1698920416);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0Var = j92.f.f97935l;
                long jE = hb.a.e(o0VarE);
                h4.r.a aVar6 = h4.r.S;
                d92.b.f58625c.getClass();
                mh.c(str, c2.l.C(aVar6, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), jE, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
                p3.o0 o0Var3 = o0VarE;
                o0Var3.g0(false);
                o0Var2 = o0Var3;
            }
            o0Var2.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(t2Var, arrayList, str, aVar, i14, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d7  */
    public static final void c(wg0.m mVar, xg0.a aVar, wg0.a aVar2, p3.m mVar2, int i14) {
        int i15;
        boolean z14;
        boolean z15;
        boolean z16;
        p3.o0 o0VarE = mVar2.E(284856782);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(mVar) : o0VarE.r(mVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar2) : o0VarE.r(aVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            do1.o oVar = new do1.o(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)));
            String strC = oVar.c(mVar.f185109b, mVar.f185113f, false);
            String strA = oVar.a(mVar.f185108a);
            if (strC == null && strA == null) {
                o0VarE.C(-685483436);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-686431943);
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
                h4.d.f81522a.getClass();
                h4.g.b bVar = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar4 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                List listS0 = p13.h0.S0(mVar.f185115h, 3);
                ArrayList arrayList = new ArrayList();
                Iterator it = listS0.iterator();
                while (it.hasNext()) {
                    String str = ((wg0.n) it.next()).f185118c;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                int i16 = i15 & 896;
                boolean zR = o0VarE.r(aVar) | (i16 == 256 || ((i15 & 512) != 0 && o0VarE.r(aVar2)));
                Object objQ = o0VarE.q();
                p3.m.a aVar5 = p3.m.f135153a;
                if (zR) {
                    objQ = new s0(aVar, aVar2, 0);
                    o0VarE.K(objQ);
                } else {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new s0(aVar, aVar2, 0);
                        o0VarE.K(objQ);
                    }
                }
                b(u2Var, arrayList, strC, (e23.a) objQ, o0VarE, 6);
                if (strA == null) {
                    o0VarE.C(-1218021609);
                    o0VarE.g0(false);
                    z16 = false;
                    z15 = true;
                } else {
                    o0VarE.C(-1218021608);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97935l;
                    long jE = hb.a.e(o0VarE);
                    d6.h.f57752b.getClass();
                    int i17 = d6.h.f57758h;
                    h4.r rVarA = u2Var.a(h4.r.S, 0.5f, true);
                    boolean zR2 = o0VarE.r(aVar) | (i16 == 256 || ((i15 & 512) != 0 && o0VarE.r(aVar2)));
                    Object objQ2 = o0VarE.q();
                    if (zR2) {
                        z14 = true;
                        objQ2 = new s0(aVar, aVar2, 1);
                        o0VarE.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            z14 = true;
                            objQ2 = new s0(aVar, aVar2, 1);
                            o0VarE.K(objQ2);
                        } else {
                            z14 = true;
                        }
                    }
                    z15 = z14;
                    z16 = false;
                    mh.c(strA, u1.w.d(rVarA, false, null, null, (e23.a) objQ2, 15), jE, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 130040);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z15);
                o0VarE.g0(z16);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.k0(mVar, aVar, aVar2, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0152  */
    public static final void d(t2 t2Var, e23.a aVar, e23.a aVar2, boolean z14, e23.a aVar3, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1284703079);
        int i15 = i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            l72.f0.a aVar4 = l72.f0.a.f111000a;
            String strQ = gl1.y.Q(o0VarE, R.string.social_photo);
            s62.a.f157643a.getClass();
            u4.d dVarA = k6.a(t62.b.f162798a);
            h4.r.a aVar5 = h4.r.S;
            h4.r rVarA = t2Var.a(aVar5, 0.5f, true);
            boolean z15 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar6 = p3.m.f135153a;
            if (z15) {
                objQ = new ya0.l(aVar, 16);
                o0VarE.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ya0.l(aVar, 16);
                    o0VarE.K(objQ);
                }
            }
            aVar4.h(0, 8, (e23.a) objQ, rVarA, strQ, o0VarE, dVarA, false);
            if (aVar2 == null) {
                o0VarE.C(-135440245);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-135440244);
                h4.r rVarA2 = t2Var.a(aVar5, 0.5f, true);
                h4.d.f81522a.getClass();
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarA2, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar7 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_see_new_sharing_options);
                w1 w1Var = w1.TopStart;
                l72.x1 x1Var2 = l72.x1.EndSmall;
                long j8 = (((long) 0) << 32) | (((long) (-10)) & 4294967295L);
                g6.k.a aVar8 = g6.k.f76003b;
                boolean z16 = (i15 & 57344) == 16384;
                Object objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new ya0.l(aVar3, 17);
                    o0VarE.K(objQ2);
                } else {
                    aVar6.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ya0.l(aVar3, 17);
                        o0VarE.K(objQ2);
                    }
                }
                a1.a(strQ2, w1Var, x1Var2, null, j8, z14, (e23.a) objQ2, z3.f.c(-909487397, new y22.p(aVar2, 3), o0VarE), o0VarE, ((i15 << 9) & 3670016) | 100863360, 18);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug2.p(t2Var, aVar, aVar2, z14, aVar3, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0142  */
    /* JADX WARN: Code duplicated, block: B:45:0x0172  */
    /* JADX WARN: Code duplicated, block: B:47:0x017b  */
    /* JADX WARN: Code duplicated, block: B:48:0x017f  */
    /* JADX WARN: Code duplicated, block: B:53:0x019a  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0209  */
    /* JADX WARN: Code duplicated, block: B:75:0x0227  */
    /* JADX WARN: Code duplicated, block: B:77:0x022f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0246  */
    /* JADX WARN: Code duplicated, block: B:84:0x0260  */
    /* JADX WARN: Code duplicated, block: B:88:0x027d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0292  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final nr.g.s sVar, p3.m mVar, final int i14) {
        final int i15;
        wg0.a aVar;
        h5.g.a.f fVar;
        wg0.a aVar2;
        int i16;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        u2 u2Var;
        boolean z14;
        boolean zR;
        Object objQ;
        e23.a aVar3;
        boolean zB;
        Object objQ2;
        boolean zR2;
        Object objQ3;
        e23.a<Unit> aVar4;
        boolean zB2;
        Object objQ4;
        boolean zR3;
        Object objQ5;
        boolean zR4;
        Object objQ6;
        p3.o0 o0VarE = mVar.E(124462895);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = (o0VarE.r(sVar) ? 4 : 2) | i14;
        final int i18 = 0;
        if (o0VarE.n(i17 & 1, (i17 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            wg0.m mVar2 = sVar.f127127d;
            Long lValueOf = Long.valueOf(sVar.f127126c);
            mVar2.getClass();
            wg0.a aVar5 = new wg0.a(lValueOf, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, null, mVar2, null, null, false, null, null, false, null, null, null, null, 536608766, null);
            wg0.m mVar3 = aVar5.f185060t;
            if (mVar3 == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p(sVar, i14, i18) { // from class: yr.r0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f198896a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ nr.g.s f198897b;

                        {
                            this.f198896a = i18;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i19 = this.f198896a;
                            p3.m mVar4 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i19) {
                                case 0:
                                    t0.e(this.f198897b, mVar4, p3.p0.t(1));
                                    break;
                                default:
                                    t0.e(this.f198897b, mVar4, p3.p0.t(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            xg0.a aVar6 = sVar.f127128e;
            Object objQ7 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ7 == c2565a) {
                objQ7 = hb.a.n(sVar.f127125b, o0VarE);
            }
            p1 p1Var = (p1) objQ7;
            boolean zB3 = s3.b();
            h4.r.a aVar7 = h4.r.S;
            h4.r rVarE = u1.n.e(aVar7, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarE, j92.b.f97899b.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar8 = h5.g.a.f81805b;
            e23.a aVar9 = null;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                aVar = aVar5;
            } else {
                aVar = aVar5;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                if (zB3 || mVar3.f185109b > 0 || mVar3.f185108a > 0) {
                    o0VarE.C(-1027978915);
                    aVar2 = aVar;
                    c(mVar3, aVar6, aVar2, o0VarE, wg0.m.f185107i | (wg0.a.I << 6));
                    i16 = 0;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1027875127);
                    i16 = 0;
                    o0VarE.g0(false);
                    aVar2 = aVar;
                }
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, i16);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar7, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2Var = u2.f22900a;
                if (sVar.f127124a) {
                    o0VarE.C(-298513040);
                    aVar4 = sVar.f127132i;
                    if (aVar4 == null) {
                        o0VarE.C(-298455908);
                    } else {
                        o0VarE.C(-298455907);
                        zB2 = o0VarE.B(aVar4);
                        objQ4 = o0VarE.q();
                        if (zB2 || objQ4 == c2565a) {
                            objQ4 = new ya0.l(aVar4, 19);
                            o0VarE.K(objQ4);
                        }
                        aVar9 = (e23.a) objQ4;
                    }
                    o0VarE.g0(false);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    zR3 = o0VarE.r(sVar);
                    objQ5 = o0VarE.q();
                    if (zR3 || objQ5 == c2565a) {
                        objQ5 = new o0(sVar, 1);
                        o0VarE.K(objQ5);
                    }
                    e23.a aVar10 = (e23.a) objQ5;
                    zR4 = o0VarE.r(sVar);
                    objQ6 = o0VarE.q();
                    if (zR4 || objQ6 == c2565a) {
                        objQ6 = new xr.a(27, sVar, p1Var);
                        o0VarE.K(objQ6);
                    }
                    d(u2Var, aVar10, aVar9, zBooleanValue, (e23.a) objQ6, o0VarE, 6);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-298095749);
                    if (zB3) {
                        z14 = false;
                        o0VarE.C(-297139027);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-298055821);
                        zR = o0VarE.r(aVar2) | o0VarE.r(aVar6);
                        objQ = o0VarE.q();
                        if (zR || objQ == c2565a) {
                            objQ = new s0(aVar2, aVar6);
                            o0VarE.K(objQ);
                        }
                        aVar3 = (e23.a) objQ;
                        boolean z15 = mVar3.f185113f;
                        zB = o0VarE.B(aVar3);
                        objQ2 = o0VarE.q();
                        if (zB || objQ2 == c2565a) {
                            objQ2 = new ya0.l(aVar3, 21);
                            o0VarE.K(objQ2);
                        }
                        e23.a aVar11 = (e23.a) objQ2;
                        zR2 = o0VarE.r(aVar6) | o0VarE.r(aVar2);
                        objQ3 = o0VarE.q();
                        if (zR2 || objQ3 == c2565a) {
                            objQ3 = new s0(aVar6, aVar2, 3);
                            o0VarE.K(objQ3);
                        }
                        a(u2Var, z15, aVar11, (e23.a) objQ3, o0VarE, 6);
                        z14 = false;
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z14);
                }
                i15 = 1;
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            if (zB3) {
                o0VarE.C(-1027978915);
                aVar2 = aVar;
                c(mVar3, aVar6, aVar2, o0VarE, wg0.m.f185107i | (wg0.a.I << 6));
                i16 = 0;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1027978915);
                aVar2 = aVar;
                c(mVar3, aVar6, aVar2, o0VarE, wg0.m.f185107i | (wg0.a.I << 6));
                i16 = 0;
                o0VarE.g0(false);
            }
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, i16);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar7, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2Var = u2.f22900a;
            if (sVar.f127124a) {
                o0VarE.C(-298513040);
                aVar4 = sVar.f127132i;
                if (aVar4 == null) {
                    o0VarE.C(-298455908);
                } else {
                    o0VarE.C(-298455907);
                    zB2 = o0VarE.B(aVar4);
                    objQ4 = o0VarE.q();
                    if (zB2) {
                        objQ4 = new ya0.l(aVar4, 19);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new ya0.l(aVar4, 19);
                        o0VarE.K(objQ4);
                    }
                    aVar9 = (e23.a) objQ4;
                }
                o0VarE.g0(false);
                boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                zR3 = o0VarE.r(sVar);
                objQ5 = o0VarE.q();
                if (zR3) {
                    objQ5 = new o0(sVar, 1);
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new o0(sVar, 1);
                    o0VarE.K(objQ5);
                }
                e23.a aVar12 = (e23.a) objQ5;
                zR4 = o0VarE.r(sVar);
                objQ6 = o0VarE.q();
                if (zR4) {
                    objQ6 = new xr.a(27, sVar, p1Var);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new xr.a(27, sVar, p1Var);
                    o0VarE.K(objQ6);
                }
                d(u2Var, aVar12, aVar9, zBooleanValue2, (e23.a) objQ6, o0VarE, 6);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-298095749);
                if (zB3) {
                    o0VarE.C(-298055821);
                    zR = o0VarE.r(aVar2) | o0VarE.r(aVar6);
                    objQ = o0VarE.q();
                    if (zR) {
                        objQ = new s0(aVar2, aVar6);
                        o0VarE.K(objQ);
                    } else {
                        objQ = new s0(aVar2, aVar6);
                        o0VarE.K(objQ);
                    }
                    aVar3 = (e23.a) objQ;
                    boolean z16 = mVar3.f185113f;
                    zB = o0VarE.B(aVar3);
                    objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new ya0.l(aVar3, 21);
                        o0VarE.K(objQ2);
                    } else {
                        objQ2 = new ya0.l(aVar3, 21);
                        o0VarE.K(objQ2);
                    }
                    e23.a aVar13 = (e23.a) objQ2;
                    zR2 = o0VarE.r(aVar6) | o0VarE.r(aVar2);
                    objQ3 = o0VarE.q();
                    if (zR2) {
                        objQ3 = new s0(aVar6, aVar2, 3);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new s0(aVar6, aVar2, 3);
                        o0VarE.K(objQ3);
                    }
                    a(u2Var, z16, aVar13, (e23.a) objQ3, o0VarE, 6);
                    z14 = false;
                    o0VarE.g0(false);
                } else {
                    z14 = false;
                    o0VarE.C(-297139027);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
            }
            i15 = 1;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new e23.p(sVar, i14, i15) { // from class: yr.r0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f198896a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ nr.g.s f198897b;

                {
                    this.f198896a = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = this.f198896a;
                    p3.m mVar4 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i19) {
                        case 0:
                            t0.e(this.f198897b, mVar4, p3.p0.t(1));
                            break;
                        default:
                            t0.e(this.f198897b, mVar4, p3.p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
