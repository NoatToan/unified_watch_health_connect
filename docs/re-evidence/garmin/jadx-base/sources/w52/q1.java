package w52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import i3.i7;
import i3.mh;
import i3.ve;
import java.util.List;
import java.util.Locale;
import l72.v2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.y3;
import v62.c6;
import v62.h7;

/* JADX INFO: loaded from: classes9.dex */
public final class q1 {
    public static final void a(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int i14, o13.p<Boolean, Double> pVar, p3.m mVar, int i15) {
        int i16;
        String strB;
        p3.o0 o0VarE = mVar.E(1720545290);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.B(pVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) o0VarE.A(y3Var);
            context.getClass();
            kVar.getClass();
            j0Var.getClass();
            String strG = j0Var.g();
            if (strG != null) {
                String lowerCase = strG.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                Locale locale = Locale.getDefault();
                locale.getClass();
                strB = d53.u.k(lowerCase, locale);
            } else {
                strB = null;
            }
            if (strB == null) {
                m52.d dVar = j0Var.f48217c;
                x52.e.f189070c.getClass();
                strB = x52.e.a.a(dVar).b(context, kVar);
            }
            b(0, 0, 2, strB, o0VarE);
            String strJ = v52.f.j(kVar, null, j0Var, (Context) o0VarE.A(y3Var), false, pVar);
            if (g22.n.d(strJ)) {
                o0VarE.C(625580688);
                e(0, 0, strJ, v52.f.i(kVar, null, j0Var, (Context) o0VarE.A(y3Var), false, pVar), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(625926648);
                o0VarE.g0(false);
            }
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), o0VarE);
            String strL = v52.f.l(kVar, j0Var, null, i14, (Context) o0VarE.A(y3Var), pVar, false);
            if (g22.n.d(strL)) {
                o0VarE.C(626276390);
                e(0, 0, strL, v52.f.m(kVar, j0Var, null, i14, (Context) o0VarE.A(y3Var), pVar, false), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(626601208);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(kVar, j0Var, i14, pVar, i15, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public static final void b(int i14, int i15, int i16, String str, p3.m mVar) {
        int i17;
        boolean z14;
        p3.o0 o0Var;
        int i18;
        p2 p2VarI0;
        int i19;
        p3.o0 o0VarE = mVar.E(-40538377);
        int i24 = i15 | (o0VarE.B(str) ? 4 : 2);
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                i17 = i14;
                i24 |= o0VarE.k(i17) ? 32 : 16;
            }
            if ((i24 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i24 & 1, z14)) {
                if (i25 != 0) {
                    i19 = 1;
                } else {
                    i19 = i17;
                }
                p3.x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                o0Var = o0VarE;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, i19, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0Var, i24 & 14, (i24 << 9) & 57344, 114686);
                i18 = i19;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                i18 = i17;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ct1.g(str, i18, i15, i16, 3);
            }
        }
        i24 |= 48;
        i17 = i14;
        if ((i24 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i24 & 1, z14)) {
            if (i25 != 0) {
                i19 = 1;
            } else {
                i19 = i17;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, i19, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0Var, i24 & 14, (i24 << 9) & 57344, 114686);
            i18 = i19;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            i18 = i17;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ct1.g(str, i18, i15, i16, 3);
        }
    }

    public static final void c(final m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, final List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list, final int i14, final double d14, final boolean z14, final com.garmin.android.apps.connectmobile.repcounting.model.c cVar, p3.m mVar, final int i15) {
        int i16;
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = j0Var;
        p3.o0 o0VarE = mVar.E(-801714366);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? o0VarE.B(j0Var2) : o0VarE.r(j0Var2) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(list) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.k(i14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.m(d14) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i16 |= (2097152 & i15) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b(0, 0, 2, q((Context) o0VarE.A(y3Var), kVar, j0Var2, cVar), o0VarE);
            Context context = (Context) o0VarE.A(y3Var);
            f62.g.f69240a.getClass();
            o13.p<Boolean, Double> pVar = f62.g.f69241b;
            String strJ = v52.f.j(kVar, null, j0Var, context, false, pVar);
            if (strJ != null) {
                o0VarE.C(441145674);
                e(0, 0, strJ, v52.f.i(kVar, null, j0Var, (Context) o0VarE.A(y3Var), false, pVar), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(441505088);
                o0VarE.g0(false);
            }
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), o0VarE);
            String strL = v52.f.l(kVar, j0Var, list, i14, (Context) o0VarE.A(y3Var), pVar, z14);
            if (g22.n.d(strL)) {
                o0VarE.C(442007381);
                e(0, 0, strL, v52.f.m(kVar, j0Var, list, i14, (Context) o0VarE.A(y3Var), pVar, z14), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(442386976);
                o0VarE.g0(false);
            }
            String strN = v52.f.n(kVar, j0Var, list, i14, (Context) o0VarE.A(y3Var), null, pVar);
            if (g22.n.d(strN)) {
                o0VarE.C(442700107);
                j0Var2 = j0Var;
                e(0, 0, strN, v52.f.o(kVar, j0Var2, list, i14, (Context) o0VarE.A(y3Var), null, pVar), o0VarE);
                o0VarE.g0(false);
            } else {
                j0Var2 = j0Var;
                o0VarE.C(443058560);
                o0VarE.g0(false);
            }
            String strB = v52.e.b((Context) o0VarE.A(y3Var), v52.e.g(j0Var2, Double.valueOf(d14)), j0Var2.f48227l, j0Var2.f48231p, false, false);
            if (g22.n.d(strB)) {
                o0VarE.C(443421880);
                e(0, 0, strB, v52.e.b((Context) o0VarE.A(y3Var), v52.e.g(j0Var2, Double.valueOf(d14)), j0Var2.f48227l, j0Var2.f48231p, true, false), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(443798592);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = j0Var2;
            p2VarI0.f135219d = new e23.p() { // from class: w52.i1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    q1.c(kVar, j0Var3, list, i14, d14, z14, cVar, (p3.m) obj, p3.p0.t(i15 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, boolean z14, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        boolean z16;
        p3.o0 o0VarE = mVar.E(-1704555675);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 256 : 128;
        } else {
            z15 = z14;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            String str = null;
            if (j0Var.f48217c != m52.d.REST) {
                o0VarE.C(-1019552719);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                m52.d dVar = j0Var.f48217c;
                x52.e.f189070c.getClass();
                e(0, 2, x52.e.a.a(dVar).b(context, kVar), null, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1019448931);
                o0VarE.g0(false);
            }
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b(Integer.MAX_VALUE, 48, 0, r((Context) o0VarE.A(y3Var), kVar, j0Var, cVar), o0VarE);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), o0VarE);
            Context context2 = (Context) o0VarE.A(y3Var);
            f62.g.f69240a.getClass();
            o13.p<Boolean, Double> pVar = f62.g.f69241b;
            String strJ = v52.f.j(kVar, null, j0Var, context2, z15, pVar);
            String strL = v52.f.l(kVar, j0Var, null, 0, (Context) o0VarE.A(y3Var), pVar, false);
            if (strJ != null) {
                o0VarE.C(-1695427914);
                z16 = !strJ.equals(gl1.y.Q(o0VarE, R.string.lbl_none));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1018656545);
                o0VarE.g0(false);
                z16 = false;
            }
            boolean zD = g22.n.d(strL);
            if (z16 && zD) {
                strJ = e5.g(strJ, "\n", strL);
            } else if (!z16) {
                strJ = null;
            }
            if (g22.n.d(strJ)) {
                o0VarE.C(-1018290554);
                String strI = v52.f.i(kVar, null, j0Var, (Context) o0VarE.A(y3Var), z14, pVar);
                if (strI == null) {
                    o0VarE.C(-1017921283);
                } else {
                    o0VarE.C(-1017921282);
                    str = strI.equals(gl1.y.Q(o0VarE, R.string.lbl_none)) ? "" : strI;
                }
                o0VarE.g0(false);
                e(0, 0, strJ, str != null ? str : "", o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1017837923);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(kVar, j0Var, z14, cVar, i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    public static final void e(int i14, int i15, String str, String str2, p3.m mVar) {
        String str3;
        int i16;
        p3.o0 o0Var;
        String str4;
        p3.o0 o0VarE = mVar.E(1379897064);
        int i17 = i14 | (o0VarE.B(str) ? 4 : 2);
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 = i17 | 48;
            str3 = str2;
        } else {
            str3 = str2;
            i16 = i17 | (o0VarE.B(str3) ? 32 : 16);
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            h4.r rVarC = null;
            String str5 = i18 != 0 ? null : str3;
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
            o0VarE.C(-1063810178);
            h4.r rVar = h4.r.S;
            if (str5 == null) {
                o0VarE.C(-1004923785);
            } else {
                o0VarE.C(-1004923784);
                boolean zB = o0VarE.B(str5);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new u91.c(str5, 16);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new u91.c(str5, 16);
                        o0VarE.K(objQ);
                    }
                }
                rVarC = p5.v.c((e23.l) objQ, rVar, false);
            }
            o0VarE.g0(false);
            if (rVarC != null) {
                rVar = rVarC;
            }
            o0VarE.g0(false);
            o0Var = o0VarE;
            mh.c(str, rVar, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, i16 & 14, 0, 131068);
            str4 = str5;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str4 = str3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l71.e(str, str4, i14, i15, 3);
        }
    }

    public static final void f(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, o13.p<Boolean, Double> pVar, p3.m mVar, int i14) {
        int i15;
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2;
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3;
        p3.o0 o0VarE = mVar.E(31884818);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(pVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) o0VarE.A(y3Var);
            context.getClass();
            j0Var.getClass();
            m52.k kVar2 = m52.k.f116758r;
            m52.d dVar2 = j0Var.f48217c;
            x52.e.f189070c.getClass();
            b(0, 0, 2, x52.e.a.a(dVar2).b(context, kVar2), o0VarE);
            String strJ = v52.f.j(kVar, dVar.getF48948c(), j0Var, (Context) o0VarE.A(y3Var), false, pVar);
            if (g22.n.d(strJ)) {
                o0VarE.C(693422215);
                j0Var3 = j0Var;
                e(0, 0, strJ, v52.f.i(kVar, dVar.getF48948c(), j0Var3, (Context) o0VarE.A(y3Var), false, pVar), o0VarE);
                o0VarE.g0(false);
            } else {
                j0Var3 = j0Var;
                o0VarE.C(693799888);
                o0VarE.g0(false);
            }
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), o0VarE);
            if (j0Var3.f48217c != m52.d.REST) {
                o0VarE.C(693934273);
                m52.f fVar = j0Var3.X;
                if (fVar == null) {
                    o0VarE.C(693956716);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(693956717);
                    e(0, 2, gl1.y.Q(o0VarE, fVar.f116712b), null, o0VarE);
                    o0VarE.g0(false);
                }
                qs.f fVar2 = j0Var3.f48226k0;
                if (fVar2 == null) {
                    o0VarE.C(694061899);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(694061900);
                    e(0, 2, gl1.y.P(R.string.string_space_bullet_string_pattern, new Object[]{gl1.y.Q(o0VarE, R.string.activity_details_drill_type), gl1.y.Q(o0VarE, fVar2.f147069b)}, o0VarE), null, o0VarE);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(694348464);
                o0VarE.g0(false);
            }
            m52.e eVar = j0Var3.Z;
            if (eVar == null) {
                o0VarE.C(694385663);
                o0VarE.g0(false);
            } else {
                o0VarE.C(694385664);
                if (eVar != m52.e.NONE) {
                    o0VarE.C(-1400279781);
                    e(0, 2, o62.u0.f(eVar, (Context) o0VarE.A(y3Var)), null, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1400193291);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
            String strN = v52.f.n(kVar, j0Var, null, 0, (Context) o0VarE.A(y3Var), dVar.getF48948c(), pVar);
            if (g22.n.d(strN)) {
                o0VarE.C(694893568);
                j0Var2 = j0Var;
                e(0, 0, strN, v52.f.o(kVar, j0Var2, null, 0, (Context) o0VarE.A(y3Var), dVar.getF48948c(), pVar), o0VarE);
                o0VarE.g0(false);
            } else {
                j0Var2 = j0Var;
                o0VarE.C(695308720);
                o0VarE.g0(false);
            }
            if (j0Var2.f48227l == m52.a.f116649e) {
                o0VarE.C(695404107);
                double dF = v52.e.f(j0Var2, Double.valueOf(dVar.getF48947b()));
                m52.j f48948c = dVar.getF48948c();
                String strB = v52.e.b((Context) o0VarE.A(y3Var), dF, j0Var2.f48227l, f48948c, false, f48948c == null);
                if (g22.n.d(strB)) {
                    o0VarE.C(695959379);
                    e(0, 0, strB, v52.e.b((Context) o0VarE.A(y3Var), dF, j0Var2.f48227l, f48948c, true, f48948c == null), o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(696356272);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(696362224);
                o0VarE.g0(false);
            }
        } else {
            j0Var2 = j0Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(kVar, j0Var2, dVar, pVar, i14, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void g(String str, p3.m mVar, int i14) {
        p3.o0 o0Var;
        boolean z14;
        p3.o0 o0Var2;
        h4.r.a aVar;
        ?? r14;
        p3.o0 o0Var3;
        p3.o0 o0VarE = mVar.E(1641688691);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == obj) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) objQ2;
            h4.r.a aVar2 = h4.r.S;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ3 = o0VarE.q();
            if (objQ3 == obj) {
                objQ3 = new w51.j0(p1Var2, 9);
                o0VarE.K(objQ3);
            }
            h4.r rVarD = u1.w.d(aVar2, zBooleanValue, null, null, (e23.a) objQ3, 14);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            float f15 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarD, 0.0f, f14, f15, eVar.f97917b, 1);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0Var = j92.f.f97935l;
            s5.x0 x0VarF = d92.c.f(x0Var, o0VarE);
            d6.p.f57793b.getClass();
            int i16 = d6.p.f57795d;
            int i17 = ((Boolean) p1Var2.getF182175a()).booleanValue() ? Integer.MAX_VALUE : 2;
            Object objQ4 = o0VarE.q();
            if (objQ4 == obj) {
                objQ4 = new sk0.l(p1Var2, p1Var, 4);
                o0VarE.K(objQ4);
            }
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i16, false, i17, 0, (e23.l) objQ4, x0VarF, o0VarE, i15 & 14, 1573248, 45054);
            p3.o0 o0Var4 = o0VarE;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var4.C(-760749667);
                bVar.getClass();
                h4.r rVarA = c2.l.A(aVar2, eVar.f97920e, 0.0f, 2);
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(rVarA, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
                s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0Var4, 0);
                int iHashCode2 = Long.hashCode(o0Var4.U);
                i2 i2VarA1 = o0Var4.a0();
                h4.r rVarC4 = h4.k.c(rVarC3, o0Var4);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var4.z();
                if (o0Var4.T) {
                    o0Var4.M(aVar4);
                } else {
                    o0Var4.c();
                }
                b4.c(eVar2, s2VarA, o0Var4);
                b4.c(c1623g, i2VarA1, o0Var4);
                if (o0Var4.T || !p005kotlin.jvm.internal.s.g(o0Var4.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var4, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC4, o0Var4);
                u2 u2Var = u2.f22900a;
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    aVar = aVar2;
                    r14 = 0;
                    o0Var4.C(-1205771740);
                    o0Var4.g0(false);
                    o0Var3 = o0Var4;
                } else {
                    o0Var4.C(-1205964901);
                    String strQ = gl1.y.Q(o0Var4, R.string.tabbar_more);
                    fVar2.getClass();
                    aVar = aVar2;
                    r14 = 0;
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0Var4), o0Var4, 0, 0, 131070);
                    p3.o0 o0Var5 = o0Var4;
                    o0Var5.g0(false);
                    o0Var3 = o0Var5;
                }
                bVar.getClass();
                h4.r rVarC5 = c2.l.C(aVar, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14);
                bVar.getClass();
                i7.a(n5.c.a(((Boolean) p1Var2.getF182175a()).booleanValue() ? R.drawable.chevron_up : R.drawable.chevron_down, o0Var3, r14), null, x2.q(rVarC5, j92.b.f97901d.f97903b), sn.a.y(o0Var3), o0Var3, 48, 0);
                z14 = true;
                o0Var3.g0(true);
                o0Var3.g0(r14);
                o0Var2 = o0Var3;
            } else {
                z14 = true;
                o0Var4.C(-759911675);
                o0Var4.g0(false);
                o0Var2 = o0Var4;
            }
            o0Var2.g0(z14);
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vd0.b(str, i14, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(870523182);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            h4.r.a aVar3 = h4.r.S;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new w51.j0(p1Var, 7);
                o0VarE.K(objQ3);
            }
            h4.r rVarB = u1.w.b(aVar3, jVar, null, false, null, null, (e23.a) objQ3, 28);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            s62.a.f157643a.getClass();
            u4.d dVarA = c6.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_menu);
            d92.b.f58623a.getClass();
            long jD = d92.b.a(o0VarE).f().d();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            h4.r rVarY = c2.l.y(aVar3, j92.b.f97899b.f97920e);
            bVar2.getClass();
            i7.b(dVarA, strQ, x2.q(rVarY, j92.b.f97901d.f97904c), jD, o0VarE, 0, 0);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new w51.j0(p1Var, 8);
                o0VarE.K(objQ4);
            }
            i3.u.a(zBooleanValue, (e23.a) objQ4, u1.n.e(aVar3, v.h.t(o0VarE), o4.m1.f128891a), 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-426234087, new dk0.b(aVar, aVar2, p1Var, 3), o0VarE), o0VarE, 48, 48, 2040);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, 21);
        }
    }

    public static final void i(String str, u4.d dVar, e23.a aVar, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        i3.u.b(z3.f.c(-381734415, new vd0.b(str, 12), mVar), aVar, null, z3.f.c(-798090636, new b82.k(dVar, 17), mVar), null, false, null, null, mVar, 3078, 500);
    }

    public static final void j(boolean z14, boolean z15, boolean z16, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1400716039);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.h(z16) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (z14) {
                o0VarE.C(-443621417);
                s62.a.f157643a.getClass();
                t62.b bVar2 = t62.b.f162798a;
                u4.d dVarA = v62.q.a(bVar2);
                String strQ = gl1.y.Q(o0VarE, R.string.move_up);
                d92.b.f58623a.getClass();
                long jD = d92.b.a(o0VarE).f().d();
                h4.r rVarA = l4.k.a(u1.w.d(aVar3, z15, null, null, aVar, 14), z15 ? 1.0f : 0.5f);
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarY = c2.l.y(rVarA, eVar.f97920e);
                bVar3.getClass();
                j92.c cVar = j92.b.f97901d;
                i7.b(dVarA, strQ, x2.q(rVarY, cVar.f97904c), jD, o0VarE, 0, 0);
                u4.d dVarA2 = v62.n.a(bVar2);
                String strQ2 = gl1.y.Q(o0VarE, R.string.move_down);
                long jY = sn.a.y(o0VarE);
                h4.r rVarA2 = l4.k.a(u1.w.d(aVar3, z16, null, null, aVar2, 14), z16 ? 1.0f : 0.5f);
                bVar3.getClass();
                h4.r rVarY2 = c2.l.y(rVarA2, eVar.f97920e);
                bVar3.getClass();
                i7.b(dVarA2, strQ2, x2.q(rVarY2, cVar.f97904c), jY, o0VarE, 0, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-442691169);
                o0VarE.g0(false);
            }
            s62.a.f157643a.getClass();
            u4.d dVarA3 = h7.a(t62.b.f162798a);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_reorder);
            d92.b.f58623a.getClass();
            long jD2 = d92.b.a(o0VarE).f().d();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            h4.r rVarY3 = c2.l.y(aVar3, j92.b.f97899b.f97920e);
            bVar4.getClass();
            i7.b(dVarA3, strQ3, x2.q(rVarY3, j92.b.f97901d.f97904c), jD2, o0VarE, 0, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ij1.e(z14, z15, z16, aVar, aVar2, i14);
        }
    }

    public static final void k(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, String str, e23.q<? super String, ? super String, ? super e23.a<Unit>, Unit> qVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1798192991);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(qVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            g6.f.a aVar3 = g6.f.f75994b;
            c2.q.a(u1.n.e(x2.h(x2.f(aVar, 1.0f), 1), n5.a.a(o0VarE, R.color.gcm3_workout_note_divider), o4.m1.f128891a), o0VarE, 0);
            String str2 = j0Var.f48225k;
            if (str2 == null) {
                o0VarE.C(2080090691);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2080090692);
                if (str2.length() > 0) {
                    o0VarE.C(-1121099843);
                    g(str2, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1121055637);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
            if (g22.n.d(j0Var.O0)) {
                o0VarE.C(2080259983);
                b.a(j0Var.f(), str, qVar, null, false, o0VarE, com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d | 27648 | (i15 & 112) | (i15 & 896));
                o0VarE.g0(false);
            } else {
                o0VarE.C(2080534829);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(j0Var, str, qVar, i14, 3);
        }
    }

    public static final void l(final c62.h1 h1Var, final m52.k kVar, final com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, final List list, final int i14, final double d14, final com.garmin.android.apps.connectmobile.repcounting.model.c cVar, final boolean z14, final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, final boolean z15, final boolean z16, final o13.p pVar, final e23.a aVar, final String str, final e23.q qVar, p3.m mVar, final int i15) {
        int i16;
        int i17;
        p3.o0 o0Var;
        kVar.getClass();
        j0Var.getClass();
        dVar.getClass();
        pVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(1064907392);
        if ((i15 & 48) == 0) {
            i16 = (o0VarE.k(kVar.ordinal()) ? 32 : 16) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 384) == 0) {
            i16 |= (i15 & 512) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.r(list) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 = i14;
            i16 |= o0VarE.k(i17) ? 16384 : 8192;
        } else {
            i17 = i14;
        }
        if ((i15 & 196608) == 0) {
            i16 |= o0VarE.m(d14) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i16 |= (i15 & 2097152) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i16 |= o0VarE.h(z14) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i16 |= (i15 & 134217728) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.h(z15) ? 536870912 : 268435456;
        }
        int i18 = (o0VarE.h(z16) ? 4 : 2) | (o0VarE.B(pVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024) | (o0VarE.r(qVar) ? 16384 : 8192);
        int i19 = i16;
        if (o0VarE.n(i19 & 1, ((i16 & 306783377) == 306783376 && (i18 & 9363) == 9362) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i24 = i19 >> 3;
            int i25 = i19 >> 15;
            int i26 = i19 << 15;
            int i27 = (i24 & 112) | (i24 & 14) | 14380032 | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 3) | (i25 & 896) | (i26 & 234881024) | (i26 & 1879048192);
            int i28 = 918552576 | (i25 & 14) | ((i19 >> 21) & 112) | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 6) | ((i19 >> 12) & 896) | ((i19 >> 18) & 7168);
            int i29 = i18 << 12;
            o0Var = o0VarE;
            m(kVar, j0Var, z14, false, false, false, false, false, list, i17, d14, dVar, cVar, z15, z16, pVar, aVar, null, null, false, false, null, null, str, qVar, o0Var, i27, i28 | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016), (i18 & 7168) | 438 | (i18 & 57344));
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: w52.n1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i15 | 1);
                    q1.l(h1Var, kVar, j0Var, list, i14, d14, cVar, z14, dVar, z15, z16, pVar, aVar, str, qVar, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:212:0x02ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v44 */
    public static final void m(final m52.k kVar, final com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list, final int i14, final double d14, final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, final com.garmin.android.apps.connectmobile.repcounting.model.c cVar, final boolean z24, final boolean z25, final o13.p<Boolean, Double> pVar, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, final e23.a<Unit> aVar3, final boolean z26, final boolean z27, final e23.a<Unit> aVar4, final e23.a<Unit> aVar5, final String str, final e23.q<? super String, ? super String, ? super e23.a<Unit>, Unit> qVar, p3.m mVar, final int i15, final int i16, final int i17) {
        int i18;
        boolean z28;
        boolean z29;
        int i19;
        int i24;
        p3.o0 o0Var;
        ?? r14;
        long jF;
        p3.o0 o0VarE = mVar.E(1873352825);
        if ((i15 & 6) == 0) {
            i18 = (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= (i15 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            z28 = z15;
            i18 |= o0VarE.h(z28) ? 2048 : 1024;
        } else {
            z28 = z15;
        }
        if ((i15 & 24576) == 0) {
            z29 = z16;
            i18 |= o0VarE.h(z29) ? 16384 : 8192;
        } else {
            z29 = z16;
        }
        if ((i15 & 196608) == 0) {
            i18 |= o0VarE.h(z17) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i18 |= o0VarE.h(z18) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i18 |= o0VarE.h(z19) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i18 |= o0VarE.r(list) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i18 |= o0VarE.k(i14) ? 536870912 : 268435456;
        }
        if ((i16 & 6) == 0) {
            i19 = i16 | (o0VarE.m(d14) ? 4 : 2);
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= (i16 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i19 |= (i16 & 512) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i19 |= o0VarE.h(z24) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i19 |= o0VarE.h(z25) ? 16384 : 8192;
        }
        if ((i16 & 196608) == 0) {
            i19 |= o0VarE.B(pVar) ? 131072 : 65536;
        }
        if ((i16 & 1572864) == 0) {
            i19 |= o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i16 & 12582912) == 0) {
            i19 |= o0VarE.r(aVar2) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i19 |= o0VarE.r(aVar3) ? 67108864 : 33554432;
        }
        if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
            i19 |= o0VarE.h(z26) ? 536870912 : 268435456;
        }
        if ((i17 & 6) == 0) {
            i24 = i17 | (o0VarE.h(z27) ? 4 : 2);
        } else {
            i24 = i17;
        }
        if ((i17 & 48) == 0) {
            i24 |= o0VarE.r(aVar4) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i24 |= o0VarE.r(aVar5) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i24 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i17 & 24576) == 0) {
            i24 |= o0VarE.r(qVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i18 & 1, ((i18 & 306783379) == 306783378 && (i19 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            final float f14 = j92.b.f97900c.f97910b;
            h4.r rVarA = v2.a(x2.f(h4.r.S, 1.0f), !z14, new s(2), o0VarE, 6);
            bVar.getClass();
            h4.r rVarA2 = v2.a(c2.l.A(rVarA, j92.b.f97899b.f97918c, 0.0f, 2), z18, new s(3), o0VarE, (i18 >> 15) & 112);
            boolean z34 = aVar != null;
            boolean z35 = (i19 & 3670016) == 1048576;
            Object objQ = o0VarE.q();
            if (z35) {
                objQ = new w51.j(aVar, 7);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w51.j(aVar, 7);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarA2, z34, null, null, (e23.a) objQ, 14);
            k2.h hVarA = k2.i.a(f14);
            if (z18) {
                o0VarE.C(700812389);
                jF = n5.a.a(o0VarE, R.color.gcm_surface_1_pressed);
                r14 = 0;
            } else {
                r14 = 0;
                o0VarE.C(700814689);
                jF = d92.b.a(o0VarE).c().f();
            }
            o0VarE.g0(r14);
            long j8 = jF;
            float f15 = z18 ? 2 : (float) r14;
            g6.f.a aVar6 = g6.f.f75994b;
            final boolean z36 = z29;
            final boolean z37 = z28;
            p3.o0 o0Var2 = o0VarE;
            ve.a(rVarD, hVarA, j8, 0L, f15, 0.0f, null, z3.f.c(-1654410988, new e23.p() { // from class: w52.l1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    e23.a aVar7;
                    e23.a aVar8;
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        x52.e.a aVar9 = x52.e.f189070c;
                        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = j0Var;
                        m52.d dVar2 = j0Var2.f48217c;
                        aVar9.getClass();
                        long jA = n5.a.a(mVar2, x52.e.a.a(dVar2).f189076b);
                        h4.r.a aVar10 = h4.r.S;
                        h4.r rVarA3 = v2.a(aVar10, !z18, new b82.p1(jA, f14, 2), mVar2, 6);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar2 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarA3, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar11 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar11);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar = h5.g.a.f81810g;
                        b4.c(eVar, zVarA, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, mVar2);
                        c2.b0 b0Var = c2.b0.f22601a;
                        s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar2, 48);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC2 = h4.k.c(aVar10, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar11);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, s2VarA, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                        }
                        b4.c(fVar, rVarC2, mVar2);
                        h4.r rVarA4 = u2.f22900a.a(aVar10, 1.0f, true);
                        int i25 = com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0;
                        int i26 = (i25 << 6) | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 21);
                        m52.k kVar3 = kVar;
                        boolean z38 = z37;
                        q1.p(rVarA4, kVar3, j0Var2, z38, list, i14, dVar, cVar, z24, d14, z25, pVar, mVar2, i26);
                        if (z38 && z19) {
                            mVar2.C(-46102120);
                            q1.h(aVar2, aVar3, mVar2, 0);
                            mVar2.f();
                        } else if (!z36 || (aVar7 = aVar4) == null || (aVar8 = aVar5) == null) {
                            mVar2.C(-45825848);
                            mVar2.f();
                        } else {
                            mVar2.C(-45952700);
                            q1.j(z17, z26, z27, aVar7, aVar8, mVar2, 0);
                            mVar2.f();
                        }
                        mVar2.y();
                        if (g22.n.d(j0Var2.f48225k) || g22.n.d(j0Var2.O0)) {
                            mVar2.C(-1318630968);
                            q1.k(j0Var2, str, qVar, mVar2, i25);
                            mVar2.f();
                        } else {
                            mVar2.C(-1318542556);
                            mVar2.f();
                        }
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var2), o0Var2, 12582912, 104);
            o0Var = o0Var2;
        } else {
            p3.o0 o0Var3 = o0VarE;
            o0Var3.e();
            o0Var = o0Var3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: w52.m1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i15 | 1);
                    int iT2 = p3.p0.t(i16);
                    int iT3 = p3.p0.t(i17);
                    q1.m(kVar, j0Var, z14, z15, z16, z17, z18, z19, list, i14, d14, dVar, cVar, z24, z25, pVar, aVar, aVar2, aVar3, z26, z27, aVar4, aVar5, str, qVar, (p3.m) obj, iT, iT2, iT3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void n(final x0 x0Var, final m52.k kVar, final com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, final boolean z14, final boolean z15, final List list, final int i14, final double d14, final com.garmin.android.apps.connectmobile.repcounting.model.c cVar, final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, final boolean z16, final boolean z17, final o13.p pVar, final e23.a aVar, final e23.a aVar2, final e23.a aVar3, final String str, final e23.q qVar, p3.m mVar, final int i15) {
        int i16;
        boolean z18;
        List list2;
        p3.o0 o0Var;
        x0Var.getClass();
        kVar.getClass();
        j0Var.getClass();
        dVar.getClass();
        pVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-191720430);
        if ((i15 & 48) == 0) {
            i16 = (o0VarE.k(kVar.ordinal()) ? 32 : 16) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 384) == 0) {
            i16 |= (i15 & 512) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            z18 = z15;
            i16 |= o0VarE.h(z18) ? 16384 : 8192;
        } else {
            z18 = z15;
        }
        if ((196608 & i15) == 0) {
            list2 = list;
            i16 |= o0VarE.r(list2) ? 131072 : 65536;
        } else {
            list2 = list;
        }
        if ((i15 & 1572864) == 0) {
            i16 |= o0VarE.k(i14) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i16 |= o0VarE.m(d14) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i16 |= (i15 & 134217728) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= (i15 & 1073741824) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 536870912 : 268435456;
        }
        int i17 = 384 | (o0VarE.h(z16) ? 4 : 2) | (o0VarE.h(z17) ? 32 : 16) | (o0VarE.B(pVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? 1048576 : 524288) | (o0VarE.B(str) ? 8388608 : 4194304) | (o0VarE.r(qVar) ? 67108864 : 33554432);
        if (o0VarE.n(i16 & 1, ((i16 & 306783377) == 306783376 && (i17 & 38347923) == 38347922) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i18 = i16 >> 3;
            int i19 = (i18 & 112) | (i18 & 14) | 224256 | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 3);
            int i24 = i17 << 6;
            int i25 = i16 << 9;
            int i26 = i17 >> 12;
            o0Var = o0VarE;
            m(kVar, j0Var, z16, true, false, false, z14, z18, list2, i14, d14, dVar, cVar, z17, false, pVar, aVar, aVar2, aVar3, false, false, null, null, str, qVar, o0Var, i19 | (i24 & 896) | (i25 & 3670016) | (i25 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), ((i16 >> 21) & 14) | C.ENCODING_PCM_32BIT | ((i16 >> 24) & 112) | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 6) | ((i16 >> 18) & 896) | (i24 & 7168) | 24576 | (458752 & i24) | (i24 & 3670016) | (i24 & 29360128) | (i24 & 234881024), (i26 & 7168) | 438 | (i26 & 57344));
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: w52.k1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i15 | 1);
                    q1.n(x0Var, kVar, j0Var, z14, z15, list, i14, d14, cVar, dVar, z16, z17, pVar, aVar, aVar2, aVar3, str, qVar, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void o(final g1 g1Var, final m52.k kVar, final com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, final boolean z14, final boolean z15, final List list, final int i14, final double d14, final com.garmin.android.apps.connectmobile.repcounting.model.c cVar, final boolean z16, final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, final boolean z17, final o13.p pVar, final boolean z18, final boolean z19, final e23.a aVar, final e23.a aVar2, p3.m mVar, final int i15) {
        int i16;
        boolean z24;
        p3.o0 o0Var;
        g1Var.getClass();
        kVar.getClass();
        j0Var.getClass();
        dVar.getClass();
        pVar.getClass();
        p3.o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1400687441);
        if ((i15 & 48) == 0) {
            i16 = (o0VarP.k(kVar.ordinal()) ? 32 : 16) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 384) == 0) {
            i16 |= (i15 & 512) == 0 ? o0VarP.B(j0Var) : o0VarP.r(j0Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarP.h(z14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            z24 = z15;
            i16 |= o0VarP.h(z24) ? 16384 : 8192;
        } else {
            z24 = z15;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarP.r(list) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i16 |= o0VarP.k(i14) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i16 |= o0VarP.m(d14) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i16 |= (i15 & 134217728) == 0 ? o0VarP.B(cVar) : o0VarP.r(cVar) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarP.h(z16) ? 536870912 : 268435456;
        }
        int i17 = 8192;
        int i18 = 384 | (o0VarP.B(dVar) ? 4 : 2) | (o0VarP.h(z17) ? 32 : 16) | (o0VarP.B(pVar) ? 2048 : 1024);
        if (o0VarP.h(z18)) {
            i17 = 16384;
        }
        int i19 = i18 | i17 | (o0VarP.h(z19) ? 131072 : 65536) | (o0VarP.r(aVar) ? 1048576 : 524288) | (o0VarP.r(aVar2) ? 8388608 : 4194304);
        if (o0VarP.n(i16 & 1, ((i16 & 306783377) == 306783376 && (i19 & 4793491) == 4793490) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i24 = i16 >> 3;
            int i25 = i16 >> 21;
            int i26 = i16 << 9;
            int i27 = (i24 & 112) | (i24 & 14) | 12610560 | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 3) | (i25 & 896) | ((i16 << 3) & 458752) | (i26 & 3670016) | (i26 & 234881024) | (i26 & 1879048192);
            int i28 = 114819072 | (i25 & 14) | ((i19 << 3) & 112) | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 6) | ((i16 >> 18) & 896);
            int i29 = i19 << 6;
            int i30 = i28 | (i29 & 7168) | 24576 | (i29 & 458752) | ((i19 << 15) & 1879048192);
            int i34 = i19 >> 15;
            o0Var = o0VarP;
            m(kVar, j0Var, z16, false, true, z24, z14, false, list, i14, d14, dVar, cVar, z17, false, pVar, null, null, null, z18, z19, aVar, aVar2, "", null, o0Var, i27, i30, (i34 & 14) | 27648 | (i34 & 112) | (i34 & 896));
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: w52.j1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i15 | 1);
                    q1.o(g1Var, kVar, j0Var, z14, z15, list, i14, d14, cVar, z16, dVar, z17, pVar, z18, z19, aVar, aVar2, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void p(final h4.r rVar, final m52.k kVar, final com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, final boolean z14, final List list, final int i14, final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, final com.garmin.android.apps.connectmobile.repcounting.model.c cVar, final boolean z15, final double d14, final boolean z16, final o13.p pVar, p3.m mVar, final int i15) {
        int i16;
        int i17;
        p3.o0 o0VarE = mVar.E(400581584);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(kVar.ordinal()) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= (i15 & 512) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.r(list) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i17 = i14;
            i16 |= o0VarE.k(i17) ? 131072 : 65536;
        } else {
            i17 = i14;
        }
        if ((1572864 & i15) == 0) {
            i16 |= (2097152 & i15) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i15) == 0) {
            i16 |= (16777216 & i15) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i16 |= o0VarE.h(z15) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i16 |= o0VarE.m(d14) ? 536870912 : 268435456;
        }
        int i18 = (o0VarE.h(z16) ? 4 : 2) | (o0VarE.B(pVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, ((306783379 & i16) == 306783378 && (i18 & 19) == 18) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            int i19 = i16;
            h4.r rVarC = c2.l.C(rVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
            bVar.getClass();
            h4.r rVarY = c2.l.y(rVarC, eVar.f97918c);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (z15 && !z14) {
                o0VarE.C(1870562238);
                int i24 = i19 >> 3;
                a(kVar, j0Var, i17, pVar, o0VarE, (i24 & 112) | (i24 & 14) | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 3) | ((i19 >> 9) & 896) | ((i18 << 6) & 7168));
                o0VarE.g0(false);
            } else if (kVar == m52.k.f116758r) {
                o0VarE.C(1870729142);
                int i25 = i19 >> 3;
                f(kVar, j0Var, dVar, pVar, o0VarE, (i25 & 112) | (i25 & 14) | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 3) | ((i19 >> 12) & 896) | ((i18 << 6) & 7168));
                o0VarE.g0(false);
            } else if (k52.g.f(kVar)) {
                o0VarE.C(1870894899);
                int i26 = i19 >> 3;
                d(kVar, j0Var, z14, cVar, o0VarE, (i26 & 896) | (i26 & 14) | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 3) | (i26 & 112) | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 9) | ((i19 >> 12) & 7168));
                o0VarE.g0(false);
            } else {
                o0VarE.C(1871033376);
                int i27 = i19 >> 3;
                int i28 = i19 >> 6;
                c(kVar, j0Var, list, i14, d14, z16, cVar, o0VarE, (i27 & 3670016) | (i27 & 14) | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 3) | (i27 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & (i19 >> 15)) | (458752 & (i18 << 15)) | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 18));
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: w52.o1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i15 | 1);
                    q1.p(rVar, kVar, j0Var, z14, list, i14, dVar, cVar, z15, d14, z16, pVar, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final String q(Context context, m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar) {
        context.getClass();
        kVar.getClass();
        j0Var.getClass();
        String strG = cVar != null ? cVar.G(j0Var.H0, j0Var.g()) : "";
        if (strG.length() != 0) {
            return strG;
        }
        m52.d dVar = j0Var.f48217c;
        x52.e.f189070c.getClass();
        return x52.e.a.a(dVar).b(context, kVar);
    }

    public static final String r(Context context, m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar) {
        context.getClass();
        kVar.getClass();
        j0Var.getClass();
        m52.d dVar = j0Var.f48217c;
        if (dVar == m52.d.REST) {
            x52.e.f189070c.getClass();
            return x52.e.a.a(dVar).b(context, kVar);
        }
        String strG = cVar != null ? cVar.G(j0Var.H0, j0Var.g()) : "";
        if (strG.length() != 0) {
            return strG;
        }
        String string = context.getString(R.string.no_value);
        string.getClass();
        return string;
    }
}
