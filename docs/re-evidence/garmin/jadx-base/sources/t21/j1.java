package t21;

import android.content.Context;
import android.icu.text.DecimalFormatSymbols;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.o9;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import l72.p2;
import o72.a3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l1;
import p3.n1;
import p3.p1;
import p3.x1;
import p3.y1;

/* JADX INFO: loaded from: classes9.dex */
public final class j1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(s21.b0 b0Var, Boolean bool, e23.l lVar, e23.l lVar2, e23.l lVar3, v21.e eVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        s21.b0 b0Var2;
        boolean z14;
        int i15;
        int i16;
        String strJ;
        int i17;
        int i18;
        e23.l lVar4;
        String strJ2;
        boolean z15;
        p3.o0 o0Var2;
        b0Var.getClass();
        Double d14 = b0Var.f156067b;
        Double d15 = b0Var.f156066a;
        boolean z16 = b0Var.f156076k;
        lVar.getClass();
        lVar2.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(1817836992);
        int i19 = i14 | (o0VarE.B(b0Var) ? 4 : 2) | (o0VarE.B(bool) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(lVar3) ? 16384 : 8192) | (o0VarE.r(eVar) ? 131072 : 65536);
        if (o0VarE.n(i19 & 1, (74899 & i19) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            k42.b.f102880a.getClass();
            int iL = k42.b.l();
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            h4.r rVarB = c2.b0.f22601a.b(x2.f(aVar, 1.0f), h4.d.a.f81537o);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(rVarB, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13);
            bVar2.getClass();
            h4.r rVarA = c2.l.A(rVarC2, eVar2.f97920e, 0.0f, 2);
            if (z16) {
                i15 = 284352356;
                i16 = R.string.set_weight_goal;
                z14 = false;
            } else {
                z14 = false;
                i15 = 284429856;
                i16 = R.string.confirm_your_weight;
            }
            String strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, z14);
            d6.h.f57752b.getClass();
            int i24 = d6.h.f57755e;
            d92.b.f58624b.getClass();
            mh.c(strJ3, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
            p2 p2Var = p2.f111205a;
            Boolean bool2 = Boolean.TRUE;
            String strQ = gl1.y.Q(o0VarE, p005kotlin.jvm.internal.s.g(bool, bool2) ? R.string.lbl_starting_weight : R.string.lbl_current_weight);
            if (d15 != null) {
                o0VarE.C(284804770);
                o0VarE.g0(false);
                strJ = k42.b.i(context, d15);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 284945727, R.string.enter_current_weight, o0VarE, false);
            }
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(aVar, 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new sg0.l(p1Var, 19);
                o0VarE.K(objQ3);
            }
            p2Var.h(strQ, strJ, null, rVarC3, null, false, false, null, null, null, (e23.a) objQ3, o0VarE, 0, 6, 1012);
            o0Var = o0VarE;
            if (z16) {
                o0Var.C(285238243);
                String strQ2 = gl1.y.Q(o0Var, R.string.lbl_goal_weight);
                if (d14 != null) {
                    o0Var.C(285366614);
                    o0Var.g0(false);
                    strJ2 = k42.b.i(context, d14);
                } else {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0Var, 285519258, R.string.enter_goal_weight, o0Var, false);
                }
                Object objQ4 = o0Var.q();
                if (objQ4 == c2565a) {
                    objQ4 = new sg0.l(p1Var2, 20);
                    o0Var.K(objQ4);
                }
                p2Var.h(strQ2, strJ2, null, null, null, false, false, null, null, null, (e23.a) objQ4, o0Var, 0, 6, 1020);
                o0Var = o0Var;
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0Var.C(285740536);
                    String strQ3 = gl1.y.Q(o0Var, R.string.lbl_goal_weight);
                    b0Var2 = b0Var;
                    double d16 = b0Var2.f156069d;
                    double d17 = b0Var2.f156070e;
                    double d18 = b0Var2.f156071f;
                    double d19 = b0Var2.f156072g;
                    double d24 = b0Var2.f156073h;
                    double d25 = b0Var2.f156074i;
                    double d26 = b0Var2.f156075j;
                    Object objQ5 = o0Var.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new sg0.l(p1Var2, 21);
                        o0Var2 = o0Var;
                        o0Var2.K(objQ5);
                    } else {
                        o0Var2 = o0Var;
                    }
                    e23.a aVar3 = (e23.a) objQ5;
                    i18 = i19;
                    boolean z17 = (i18 & 896) == 256;
                    Object objQ6 = o0Var2.q();
                    if (z17 || objQ6 == c2565a) {
                        objQ6 = new oy0.c(lVar, p1Var2, 5);
                        o0Var2.K(objQ6);
                    }
                    p3.o0 o0Var3 = o0Var2;
                    i17 = iL;
                    b(strQ3, d16, i17, d17, d18, d19, d24, d25, d26, aVar3, (e23.l) objQ6, o0Var3, C.ENCODING_PCM_32BIT, 0);
                    o0Var = o0Var3;
                    z15 = false;
                    o0Var.g0(false);
                } else {
                    b0Var2 = b0Var;
                    z15 = false;
                    i17 = iL;
                    i18 = i19;
                    o0Var.C(286620812);
                    o0Var.g0(false);
                }
                o0Var.g0(z15);
            } else {
                b0Var2 = b0Var;
                i17 = iL;
                i18 = i19;
                o0Var.C(286630732);
                o0Var.g0(false);
            }
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(286677356);
                String strQ4 = gl1.y.Q(o0Var, p005kotlin.jvm.internal.s.g(bool, bool2) ? R.string.lbl_starting_weight : R.string.lbl_current_weight);
                double d27 = b0Var2.f156068c;
                Object objQ7 = o0Var.q();
                if (objQ7 == c2565a) {
                    objQ7 = new sg0.l(p1Var, 22);
                    o0Var.K(objQ7);
                }
                e23.a aVar4 = (e23.a) objQ7;
                boolean z18 = (i18 & 7168) == 2048;
                Object objQ8 = o0Var.q();
                if (z18 || objQ8 == c2565a) {
                    objQ8 = new oy0.c(lVar2, p1Var, 6);
                    o0Var.K(objQ8);
                }
                p3.o0 o0Var4 = o0Var;
                b(strQ4, d27, i17, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, aVar4, (e23.l) objQ8, o0Var4, C.ENCODING_PCM_32BIT, 504);
                o0Var = o0Var4;
                o0Var.g0(false);
            } else {
                o0Var.C(287138636);
                o0Var.g0(false);
            }
            if (b0Var2.f156077l) {
                o0Var.C(287224971);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ5 = gl1.y.Q(o0Var, R.string.selected_weight_warning);
                String strQ6 = gl1.y.Q(o0Var, R.string.selected_weight_warning_message);
                String strQ7 = gl1.y.Q(o0Var, R.string.lbl_common_continue);
                String strQ8 = gl1.y.Q(o0Var, R.string.lbl_cancel);
                int i25 = i18 & 57344;
                boolean z19 = i25 == 16384;
                Object objQ9 = o0Var.q();
                if (z19 || objQ9 == c2565a) {
                    lVar4 = lVar3;
                    objQ9 = new sq1.e(lVar4, 18);
                    o0Var.K(objQ9);
                } else {
                    lVar4 = lVar3;
                }
                e23.a<Unit> aVar5 = (e23.a) objQ9;
                boolean z24 = i25 == 16384;
                Object objQ10 = o0Var.q();
                if (z24 || objQ10 == c2565a) {
                    objQ10 = new sq1.e(lVar4, 19);
                    o0Var.K(objQ10);
                }
                p3.o0 o0Var5 = o0Var;
                c1Var.a(false, strQ5, strQ6, null, null, strQ7, false, false, aVar5, strQ8, (e23.a) objQ10, o0Var5, 0, 0, 217);
                o0Var = o0Var5;
                o0Var.g0(false);
            } else {
                o0Var.C(287758636);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            b0Var2 = b0Var;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(b0Var2, bool, lVar, lVar2, lVar3, eVar, i14, 27);
        }
    }

    public static final void b(final String str, final double d14, final int i14, double d15, double d16, double d17, double d18, double d19, double d24, e23.a aVar, final e23.l lVar, p3.m mVar, final int i15, final int i16) {
        int i17;
        double d25;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        e23.a aVar2;
        final double d26;
        final double d27;
        final double d28;
        final double d29;
        p3.o0 o0Var;
        final double d34;
        final double d35;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1570873848);
        int i27 = i15 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.m(d14) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128);
        int i28 = i16 & 8;
        if (i28 != 0) {
            i17 = i27 | 3072;
        } else {
            i17 = i27 | (o0VarE.m(d15) ? 2048 : 1024);
        }
        int i29 = i16 & 16;
        if (i29 != 0) {
            i18 = i17 | 24576;
            d25 = d16;
        } else {
            d25 = d16;
            i18 = i17 | (o0VarE.m(d25) ? 16384 : 8192);
        }
        int i30 = i16 & 32;
        if (i30 != 0) {
            i19 = i18 | 196608;
        } else {
            i19 = i18 | (o0VarE.m(d17) ? 131072 : 65536);
        }
        int i34 = i16 & 64;
        if (i34 != 0) {
            i24 = i19 | 1572864;
        } else {
            i24 = i19 | (o0VarE.m(d18) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i35 = i16 & 128;
        if (i35 != 0) {
            i25 = i24 | 12582912;
        } else {
            i25 = i24 | (o0VarE.m(d19) ? 8388608 : 4194304);
        }
        int i36 = i16 & 256;
        if (i36 != 0) {
            i26 = i25 | 100663296;
        } else {
            i26 = i25 | (o0VarE.m(d24) ? 67108864 : 33554432);
        }
        char c14 = o0VarE.r(lVar) ? (char) 4 : (char) 2;
        if (o0VarE.n(i26 & 1, ((i26 & 306783379) == 306783378 && (c14 & 3) == 2) ? false : true)) {
            double d36 = i28 != 0 ? 453.5d : d15;
            final double d37 = i29 != 0 ? 999.9d : d25;
            final double d38 = i30 != 0 ? 71.0d : d17;
            final double d39 = i34 != 0 ? 1.0d : d18;
            final double d44 = i35 != 0 ? 2.0d : d19;
            final double d45 = i36 != 0 ? 0.14d : d24;
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new f(15);
                o0VarE.K(objQ);
            }
            final n1 n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            final boolean z14 = i14 == 2;
            final boolean z15 = i14 == 0;
            Object[] objArr2 = new Object[0];
            boolean zH = o0VarE.h(z15) | o0VarE.h(z14) | ((i26 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (zH || objQ2 == c2565a) {
                objQ2 = new e23.a() { // from class: t21.g1
                    @Override // e23.a
                    public final Object invoke() {
                        return new y1(j1.c(z15, z14, true, d14));
                    }
                };
                o0VarE.K(objQ2);
            }
            final l1 l1Var = (l1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 0);
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_done);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            final boolean z16 = z14;
            final double d46 = d36;
            final boolean z17 = z15;
            double d47 = d37;
            double d48 = d38;
            double d49 = d39;
            double d54 = d44;
            double d55 = d45;
            z3.e eVarC = z3.f.c(1390572388, new e23.p() { // from class: t21.h1
                /* JADX WARN: Code duplicated, block: B:26:0x00cc  */
                /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar3 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar2, 48);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarF, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar4 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        c2.b0 b0Var = c2.b0.f22601a;
                        l1 l1Var2 = l1Var;
                        double doubleValue = l1Var2.getDoubleValue();
                        boolean z18 = i14 == 0;
                        String decimalSeparatorString = DecimalFormatSymbols.getInstance().getDecimalSeparatorString();
                        decimalSeparatorString.getClass();
                        boolean zB = mVar2.B(l1Var2);
                        boolean z19 = z16;
                        boolean zH2 = zB | mVar2.h(z19);
                        boolean z24 = z17;
                        boolean zH3 = zH2 | mVar2.h(z24);
                        Object objQ3 = mVar2.q();
                        p3.m.a aVar5 = p3.m.f135153a;
                        if (zH3) {
                            objQ3 = new lo.o(z19, z24, l1Var2);
                            mVar2.K(objQ3);
                        } else {
                            aVar5.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new lo.o(z19, z24, l1Var2);
                                mVar2.K(objQ3);
                            }
                        }
                        e23.l lVar2 = (e23.l) objQ3;
                        n1 n1Var2 = n1Var;
                        boolean zB2 = mVar2.B(n1Var2);
                        Object objQ4 = mVar2.q();
                        if (zB2) {
                            objQ4 = new a3(n1Var2, 9);
                            mVar2.K(objQ4);
                        } else {
                            aVar5.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new a3(n1Var2, 9);
                                mVar2.K(objQ4);
                            }
                        }
                        r21.r.a(null, z18, z19, null, null, null, decimalSeparatorString, doubleValue, d46, d37, d38, d39, d44, d45, 0.0d, lVar2, (e23.l) objQ4, null, true, null, mVar2, 0);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            boolean zH2 = ((c14 & 14) == 4) | o0VarE.h(z16) | o0VarE.B(n1Var) | o0VarE.B(l1Var);
            Object objQ3 = o0VarE.q();
            if (zH2 || objQ3 == c2565a) {
                objQ3 = new o9(lVar, z16, aVar, n1Var, l1Var);
                o0VarE.K(objQ3);
            }
            e23.a<Unit> aVar3 = (e23.a) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                aVar2 = aVar;
                objQ4 = new a(aVar2, 20);
                o0VarE.K(objQ4);
            } else {
                aVar2 = aVar;
            }
            c1Var.a(true, str, null, eVarC, null, strQ, false, false, aVar3, strQ2, (e23.a) objQ4, o0VarE, ((i26 << 3) & 112) | 3078, 0, 212);
            o0Var = o0VarE;
            d26 = d46;
            d29 = d47;
            d27 = d48;
            d28 = d49;
            d34 = d54;
            d35 = d55;
        } else {
            aVar2 = aVar;
            o0VarE.e();
            d26 = d15;
            d27 = d17;
            d28 = d18;
            d29 = d25;
            o0Var = o0VarE;
            d34 = d19;
            d35 = d24;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final e23.a aVar4 = aVar2;
            p2VarI0.f135219d = new e23.p(str, d14, i14, d26, d29, d27, d28, d34, d35, aVar4, lVar, i15, i16) { // from class: t21.i1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f161893a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ double f161894b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f161895c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ double f161896d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ double f161897e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ double f161898f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ double f161899g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ double f161900h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ double f161901i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ e23.a f161902j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ e23.l f161903k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ int f161904l;

                {
                    this.f161904l = i16;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(805306369);
                    j1.b(this.f161893a, this.f161894b, this.f161895c, this.f161896d, this.f161897e, this.f161898f, this.f161899g, this.f161900h, this.f161901i, this.f161902j, this.f161903k, (p3.m) obj, iT, this.f161904l);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final double c(boolean z14, boolean z15, boolean z16, double d14) {
        if (z15 && !z14 && z16) {
            l3.f23124b.getClass();
            return (d14 / 6350.0d) * ((double) 1000);
        }
        if (!z15 && !z14 && z16) {
            l3.f23124b.getClass();
            return d14 * 2.20462d;
        }
        if (!z14 || z16) {
            return d14;
        }
        l3.f23124b.getClass();
        return d14 / 2.20462d;
    }
}
