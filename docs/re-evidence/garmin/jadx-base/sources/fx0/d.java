package fx0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.maps.android.compose.u;
import e23.p;
import ew1.c2;
import ew1.r1;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import o4.d0;
import o70.t;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.w;
import p13.x;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:102:0x0239  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f0  */
    public static final void a(r rVar, String str, u4.d dVar, final bx0.d.b bVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        Integer numValueOf;
        String strP;
        String string;
        long jH;
        str.getClass();
        Integer num = bVar.f21666f;
        Integer num2 = bVar.f21665e;
        o0 o0VarE = mVar.E(-9841631);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 2048 : 1024;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.mct_log_symptoms);
            if (num2 != null && num2.intValue() == 1) {
                numValueOf = Integer.valueOf(R.string.mct_lbl_period);
            } else if (num2 != null && num2.intValue() == 2) {
                numValueOf = Integer.valueOf(R.string.mct_phase_follicular);
            } else if (num2 != null && num2.intValue() == 3) {
                numValueOf = Integer.valueOf(R.string.mct_fertile_window);
            } else {
                numValueOf = (num2 != null && num2.intValue() == 4) ? Integer.valueOf(R.string.mct_phase_luteal) : null;
            }
            if (numValueOf == null) {
                o0VarE.C(-1133830586);
                o0VarE.g0(false);
                strP = null;
            } else {
                o0VarE.C(-1133830585);
                strP = y.P(R.string.string_space_string_pattern, new Object[]{y.Q(o0VarE, R.string.mct_phase), y.Q(o0VarE, numValueOf.intValue())}, o0VarE);
                o0VarE.g0(false);
            }
            if (strP == null) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -867851251, R.string.common_no_data, o0VarE, false);
            } else {
                o0VarE.C(-867860365);
                o0VarE.g0(false);
            }
            Integer num3 = bVar.f21662b;
            context.getClass();
            if (num2 == null || num3 == null) {
                string = null;
            } else {
                int iIntValue = num3.intValue();
                int iIntValue2 = num2.intValue();
                if (iIntValue2 == 1) {
                    string = context.getString(R.string.mct_period_day_number, String.valueOf(iIntValue));
                } else {
                    string = iIntValue2 <= 4 ? context.getString(R.string.mct_cycle_day_number, String.valueOf(iIntValue)) : context.getString(R.string.pregnancy_title);
                }
            }
            if (string == null) {
                string = "";
            }
            final String strP2 = oi0.c.P(x.k(strQ, strP, string, g8.i.J(context, num2, num)));
            String strK0 = h0.k0(w.c(g8.i.J(context, num2, num)), ". ", null, null, null, 62);
            gl.c.f77766a.getClass();
            final long jP = gl.c.a(o0VarE).p();
            final long jD = gl.c.a(o0VarE).d();
            final long jG = gl.c.a(o0VarE).g();
            yz1.d dVar2 = bVar.f21661a;
            d0 d0VarE = t.P0.e(null, o0VarE, 1);
            if (d0VarE == null) {
                o0VarE.C(-867823032);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(-867825047);
                o0VarE.g0(false);
                jH = d0VarE.f128833a;
            }
            d0 d0VarA = d0.a(jH);
            boolean zR = o0VarE.r(context) | ((i16 & 7168) == 2048 || ((i16 & 4096) != 0 && o0VarE.r(bVar)));
            Object objQ = o0VarE.q();
            int i17 = 20;
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new c2(i17, context, bVar);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c2(i17, context, bVar);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            z3.e eVarC = z3.f.c(1303369797, new p() { // from class: fx0.c
                /* JADX WARN: Code duplicated, block: B:12:0x003e  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18;
                    z72.l lVar;
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue3 = ((Integer) obj2).intValue();
                    int i19 = 1;
                    int i24 = 0;
                    if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                        x1 x1Var2 = n.f135158a;
                        r rVarD = x2.d(r.S, 1.0f);
                        String str2 = strP2;
                        boolean zB = mVar2.B(str2);
                        Object objQ2 = mVar2.q();
                        if (zB) {
                            objQ2 = new fp0.c(str2, 7);
                            mVar2.K(objQ2);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new fp0.c(str2, 7);
                                mVar2.K(objQ2);
                            }
                        }
                        r rVarC = v.c((e23.l) objQ2, rVarD, false);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC2 = h4.k.c(rVarC, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar3 = h5.g.a.f81805b;
                        Object objQ3 = null;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar3);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                        b0 b0Var = b0.f22601a;
                        bx0.d.b bVar3 = bVar;
                        if (bVar3.f21662b == null) {
                            mVar2.C(279888125);
                            mVar2.f();
                            i18 = R.string.common_no_data;
                        } else {
                            mVar2.C(279888126);
                            ArrayList arrayList = new ArrayList();
                            for (Float f14 : bVar3.f21668h) {
                                int i25 = i24 + 1;
                                if (i24 < 0) {
                                    x.q();
                                    throw null;
                                }
                                float fFloatValue = f14.floatValue();
                                if (i24 != 0) {
                                    long j8 = jG;
                                    if (i24 == i19) {
                                        lVar = new z72.l(fFloatValue, j8, null);
                                    } else if (i24 != 2) {
                                        lVar = i24 != 3 ? new z72.l(0.0f, j8, null) : new z72.l(fFloatValue, j8, null);
                                    } else {
                                        lVar = new z72.l(fFloatValue, jD, null);
                                    }
                                } else {
                                    lVar = new z72.l(fFloatValue, jP, null);
                                }
                                arrayList.add(lVar);
                                i24 = i25;
                                i19 = 1;
                            }
                            r.a aVar4 = r.S;
                            z72.k.c(x2.h(aVar4, yz1.y.k(mVar2)), i53.a.j(arrayList), bVar3.f21664d, null, yz1.y.g(mVar2), 3.0f, z3.f.c(-1322042638, new et1.v(bVar3, 11), mVar2), mVar2, 14155776, 24);
                            Integer num4 = bVar3.f21663c;
                            if (num4 == null) {
                                mVar2.C(754854962);
                            } else {
                                mVar2.C(754854963);
                                objQ3 = y.Q(mVar2, num4.intValue());
                            }
                            mVar2.f();
                            if (objQ3 == null) {
                                objQ3 = sn.a.h(mVar2, -1084027364, R.string.common_no_data, mVar2);
                            } else {
                                mVar2.C(-1084029379);
                                mVar2.f();
                            }
                            String str3 = objQ3;
                            h4.d.f81522a.getClass();
                            r rVarB = b0Var.b(aVar4, h4.d.a.f81537o);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            r rVarC3 = c2.l.C(rVarB, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                            d92.b.f58624b.getClass();
                            x0 x0VarB = d92.c.b(j92.f.f97932i, mVar2);
                            i18 = R.string.common_no_data;
                            mh.c(str3, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                            mVar2 = mVar2;
                            mVar2.f();
                            objQ3 = Unit.INSTANCE;
                        }
                        if (objQ3 == null) {
                            mVar2.C(-1237833763);
                            String strQ2 = y.Q(mVar2, i18);
                            r rVarF = x2.f(r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            r rVarC4 = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                            d92.b.f58624b.getClass();
                            p3.m mVar3 = mVar2;
                            mh.c(strQ2, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar2), mVar3, 0, 0, 131068);
                            mVar2 = mVar3;
                            mVar2.f();
                        } else {
                            mVar2.C(-1237897778);
                            mVar2.f();
                        }
                        mVar2.y();
                        x1 x1Var3 = n.f135158a;
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            z3.e eVarC2 = z3.f.c(1426273734, new r1(i17, strK0, bVar), o0VarE);
            boolean zR2 = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new cy1.a(context, 14);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new cy1.a(context, 14);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            yz1.y.d(rVar, dVar2, str, null, dVar, d0VarA, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strQ, aVar2, false, 0L, null, eVarC, eVarC2, null, null, (e23.a) objQ2, null, null, null, null, o0Var, (i16 & 14) | ((i16 << 3) & 896) | (57344 & (i16 << 6)), 1769856, 0, 16147272);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(rVar, str, dVar, bVar, i14, 25);
        }
    }
}
