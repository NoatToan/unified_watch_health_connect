package o62;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import kotlin.l2;
import l72.p2;
import l72.r1;
import mt0.s1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class q0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129753a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.MANUAL_WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.SCALED_FROM_BENCHMARK_WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.VERBAL_WEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f129753a = iArr;
        }
    }

    public static final void a(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        p3.o0 o0VarE = mVar.E(785223275);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p2.f111205a.g(str, null, null, null, z3.f.c(1162432768, new j30.d(z14, 22, b14), o0VarE), false, z14, aVar, o0VarE, (i15 & 14) | 24576 | ((i15 << 15) & 3670016) | ((i15 << 18) & 234881024), 174);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.g(str, z14, aVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d7  */
    public static final void b(j jVar, e23.l<? super String, Unit> lVar, e23.l<? super String, Boolean> lVar2, p3.m mVar, int i14) {
        boolean z14;
        Double d14;
        String str;
        String strJ;
        v52.h hVar;
        String str2;
        String string;
        p3.o0 o0VarE = mVar.E(1460177631);
        int i15 = (o0VarE.B(jVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r1.b(gl1.y.Q(o0VarE, R.string.lbl_percentage_of_benchmark), null, o0VarE, 0, 2);
            v0 v0Var = jVar.f129687a;
            String str3 = v0Var.f129792d;
            Double d15 = v0Var.f129795g;
            String str4 = v0Var.f129793e;
            if (str3 != null) {
                o0VarE.C(723357913);
                x xVar = x.f129810a;
                String str5 = str4 == null ? "" : str4;
                String str6 = jVar.f129690d;
                x5.v.f188954b.getClass();
                int i16 = ((i15 << 9) & 458752) | ((i15 << 6) & 7168) | 817913856;
                z14 = false;
                d14 = d15;
                str = str4;
                xVar.a(null, str5, str6, lVar, "100", lVar2, fb1.c.n(StringUtils.SPACE, gl1.y.Q(o0VarE, R.string.percent_sign)), x5.v.f188957e, 0, o0VarE, i16, TsExtractor.TS_STREAM_TYPE_AIT);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                z14 = false;
                d14 = d15;
                str = str4;
                o0VarE.C(723720241);
                p2.f111205a.g(gl1.y.Q(o0VarE, R.string.lbl_no_benchmark), null, null, null, null, false, false, null, o0VarE, 0, 510);
                o0VarE.g0(false);
            }
            String str7 = v0Var.f129792d;
            if (str7 == null || str7.length() <= 0 || d14 == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 724470937, R.string.msg_set_benchmark_for_scaling, o0VarE, z14);
            } else {
                double d16 = 0.0d;
                if (d14.doubleValue() < 0.0d || str == null || str.length() <= 0) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 724470937, R.string.msg_set_benchmark_for_scaling, o0VarE, z14);
                } else {
                    o0VarE.C(724066697);
                    Double d17 = v0Var.f129794f;
                    if (((Boolean) o0VarE.A(l2.f91259a)).booleanValue()) {
                        o0VarE.C(724190480);
                        hVar = new v52.h((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), true);
                        o0VarE.g0(z14);
                        str2 = null;
                    } else {
                        o0VarE.C(724278241);
                        str2 = null;
                        hVar = new v52.h((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), z14, 2, null);
                        o0VarE.g0(z14);
                    }
                    if (d17 == null || Double.isNaN(d17.doubleValue()) || d17.doubleValue() < 0.0d || d14 == null || Double.isNaN(d14.doubleValue()) || d14.doubleValue() < 0.0d) {
                        string = str2;
                    } else {
                        String strB = v52.h.b(hVar, d17);
                        String strD = hVar.d(d14, l3.f23126d);
                        if (strB == null || strB.length() <= 0 || strD == null || strD.length() <= 0) {
                            string = str2;
                        } else {
                            double dDoubleValue = d17.doubleValue();
                            double dDoubleValue2 = d14.doubleValue();
                            if (dDoubleValue >= 0.0d && dDoubleValue2 >= 0.0d) {
                                d16 = (dDoubleValue * dDoubleValue2) / 100.0d;
                            }
                            String strD2 = hVar.d(Double.valueOf(d16), l3.f23126d);
                            if (strD2 == null || strD2.length() <= 0) {
                                string = str2;
                            } else {
                                Context context = hVar.f175775a;
                                string = context.getString(R.string.string_equals_string_pattern, context.getString(R.string.lbl_value1_of_value2, strB, strD), strD2);
                            }
                        }
                    }
                    strJ = string != null ? string : "";
                    o0VarE.g0(z14);
                }
            }
            String str8 = strJ;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            p3.o0 o0Var = o0VarE;
            mh.c(str8, c2.l.z(aVar, f14, eVar.f97918c), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
            o0VarE = o0Var;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p0(jVar, lVar, lVar2, i14, 1);
        }
    }

    public static final void c(j jVar, e23.l<? super String, Unit> lVar, e23.l<? super String, Boolean> lVar2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(722314527);
        int i15 = (o0VarE.B(jVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r1.b(gl1.y.Q(o0VarE, R.string.workout_manual_weight), null, o0VarE, 0, 2);
            int i16 = v52.f.s() ? R.string.lbl_kg : R.string.lbl_lbs;
            x xVar = x.f129810a;
            String strQ = gl1.y.Q(o0VarE, R.string.label_set_weight);
            String str = jVar.f129689c;
            String strN = fb1.c.n(StringUtils.SPACE, gl1.y.Q(o0VarE, i16));
            x5.v.f188954b.getClass();
            xVar.a(null, strQ, str, lVar, null, lVar2, strN, x5.v.f188957e, 0, o0VarE, ((i15 << 6) & 7168) | 817889280 | ((i15 << 9) & 458752), 273);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p0(jVar, lVar, lVar2, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    public static final void d(j jVar, e23.l<? super com.garmin.android.apps.connectmobile.workouts.data.model.j0.c, Unit> lVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-202576042);
        int i15 = (o0VarE.B(jVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r1.b(gl1.y.Q(o0VarE, R.string.lbl_perceived_effort), null, o0VarE, 0, 2);
            for (com.garmin.android.apps.connectmobile.workouts.data.model.j0.c cVar : p13.x.k(com.garmin.android.apps.connectmobile.workouts.data.model.j0.c.LIGHT, com.garmin.android.apps.connectmobile.workouts.data.model.j0.c.MODERATE, com.garmin.android.apps.connectmobile.workouts.data.model.j0.c.HEAVY, com.garmin.android.apps.connectmobile.workouts.data.model.j0.c.VERY_HEAVY)) {
                String strK = v52.f.k((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), cVar);
                boolean z14 = jVar.f129687a.f129797i == cVar;
                boolean zK = ((i15 & 112) == 32) | o0VarE.k(cVar.ordinal());
                Object objQ = o0VarE.q();
                if (zK) {
                    objQ = new s1(20, lVar, cVar);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new s1(20, lVar, cVar);
                        o0VarE.K(objQ);
                    }
                }
                a(0, (e23.a) objQ, strK, o0VarE, z14);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(jVar, lVar, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    public static final void e(i iVar, e23.l<? super i, Unit> lVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1930124570);
        int i15 = (o0VarE.k(iVar.ordinal()) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            b.f129645a.getClass();
            String strB = g22.n.b(gl1.y.Q(o0VarE, R.string.lbl_set_manual_weight));
            boolean z14 = iVar == i.MANUAL_WEIGHT;
            int i16 = i15 & 112;
            boolean z15 = i16 == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z15) {
                objQ = new me2.d(lVar, 3);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new me2.d(lVar, 3);
                    o0VarE.K(objQ);
                }
            }
            a(0, (e23.a) objQ, strB, o0VarE, z14);
            String strB2 = g22.n.b(gl1.y.Q(o0VarE, R.string.lbl_scale_from_benchmark));
            boolean z16 = iVar == i.SCALED_FROM_BENCHMARK_WEIGHT;
            boolean z17 = i16 == 32;
            Object objQ2 = o0VarE.q();
            if (z17) {
                objQ2 = new me2.d(lVar, 4);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new me2.d(lVar, 4);
                    o0VarE.K(objQ2);
                }
            }
            a(0, (e23.a) objQ2, strB2, o0VarE, z16);
            String strB3 = g22.n.b(gl1.y.Q(o0VarE, R.string.lbl_use_verbal_description));
            boolean z18 = iVar == i.VERBAL_WEIGHT;
            boolean z19 = i16 == 32;
            Object objQ3 = o0VarE.q();
            if (z19) {
                objQ3 = new me2.d(lVar, 5);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new me2.d(lVar, 5);
                    o0VarE.K(objQ3);
                }
            }
            a(0, (e23.a) objQ3, strB3, o0VarE, z18);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(iVar, lVar, i14, 8);
        }
    }

    public static final void f(j jVar, e23.l<? super i, Unit> lVar, e23.l<? super String, Unit> lVar2, e23.l<? super String, Boolean> lVar3, e23.l<? super String, Unit> lVar4, e23.l<? super String, Boolean> lVar5, e23.l<? super com.garmin.android.apps.connectmobile.workouts.data.model.j0.c, Unit> lVar6, p3.m mVar, int i14) {
        jVar.getClass();
        i iVar = jVar.f129688b;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        lVar6.getClass();
        p3.o0 o0VarE = mVar.E(-1236085639);
        int i15 = (o0VarE.B(jVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar4) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar5) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            e(iVar, lVar, o0VarE, i15 & 112);
            int i16 = a.f129753a[iVar.ordinal()];
            if (i16 == 1) {
                o0VarE.C(983435853);
                int i17 = i15 >> 3;
                c(jVar, lVar2, lVar3, o0VarE, (i15 & 14) | (i17 & 112) | (i17 & 896));
                o0VarE.g0(false);
            } else if (i16 == 2) {
                o0VarE.C(983596898);
                int i18 = i15 >> 9;
                b(jVar, lVar4, lVar5, o0VarE, (i15 & 14) | (i18 & 112) | (i18 & 896));
                o0VarE.g0(false);
            } else {
                if (i16 != 3) {
                    throw kg.f.h(o0VarE, -106825456, false);
                }
                o0VarE.C(983752642);
                d(jVar, lVar6, o0VarE, (i15 & 14) | ((i15 >> 15) & 112));
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(jVar, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, i14, 12);
        }
    }
}
