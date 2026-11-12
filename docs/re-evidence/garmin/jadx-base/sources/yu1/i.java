package yu1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.k;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import fb1.g0;
import fg0.j;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jv1.w;
import l72.x0;
import o13.p;
import o13.u;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import r1.q2;
import w52.q;
import xn.t;
import yg2.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199792a;

        static {
            int[] iArr = new int[m52.c.values().length];
            try {
                iArr[m52.c.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.c.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f199792a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z14, k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar, m52.c cVar2, m mVar, int i14) {
        int i15;
        String strJ;
        String strJ2;
        o0 o0VarE = mVar.E(155992129);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(cVar2.ordinal()) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Double value = kVar.getValue();
            double dDoubleValue = value != null ? value.doubleValue() : 0.0d;
            gg0.i unit = kVar.getUnit();
            double dA = k52.g.a(dDoubleValue, unit != null ? unit.d() : null);
            og0.a aVar = og0.a.f131967a;
            Double value2 = cVar.getValue();
            double dDoubleValue2 = value2 != null ? value2.doubleValue() : 0.0d;
            gg0.i unit2 = cVar.getUnit();
            if (unit2 == null) {
                unit2 = gg0.i.SECOND;
            }
            aVar.getClass();
            double dJ = og0.a.j(dDoubleValue2, unit2);
            int[] iArr = a.f199792a;
            int i16 = iArr[cVar2.ordinal()];
            if (i16 != 1) {
                strJ = i16 != 2 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -415398013, R.string.swim_time, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -415399769, R.string.lbl_bike_time, o0VarE, false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -415402886, R.string.run_mode_alerts_setting_run_time, o0VarE, false);
            }
            String str = strJ;
            int i17 = iArr[cVar2.ordinal()];
            if (i17 != 1) {
                strJ2 = i17 != 2 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -415388957, R.string.swim_pace, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -415391054, R.string.device_screen_bike_speed, o0VarE, false);
            } else {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -415393562, R.string.lbl_run_pace, o0VarE, false);
            }
            String str2 = strJ2;
            tu1.i.f166483a.getClass();
            p pVarD = tu1.i.a.d(context, (long) dJ);
            String str3 = (String) pVarD.f128594a;
            String str4 = (String) pVarD.f128595b;
            u uVarG = tu1.i.a.g(context, z14, dA, dJ, cVar2);
            String str5 = (String) uVarG.f128605a;
            String str6 = (String) uVarG.f128606b;
            String str7 = (String) uVarG.f128607c;
            x0 x0Var = x0.f111346a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(l.A(aVar2, j92.b.f97899b.f97920e, 0.0f, 2), z3.f.c(633238472, new bv0.e(str3, str, str4, str7, str5, str2, str6, 10), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(z14, kVar, cVar, cVar2, i14);
        }
    }

    public static final void b(boolean z14, k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar, k kVar2, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar2, k kVar3, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar3, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(129459242);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(kVar2) : o0VarE.r(kVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (32768 & i14) == 0 ? o0VarE.B(cVar2) : o0VarE.r(cVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= (262144 & i14) == 0 ? o0VarE.B(kVar3) : o0VarE.r(kVar3) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= (2097152 & i14) == 0 ? o0VarE.B(cVar3) : o0VarE.r(cVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            x1 x1Var = n.f135158a;
            o0VarE.C(-143710713);
            if (kVar != null && cVar != null) {
                a(z14, kVar, cVar, m52.c.SWIMMING, o0VarE, (i16 & 14) | 3072 | (k.f48247g << 3) | (com.garmin.android.apps.connectmobile.workouts.data.model.c.f48127f << 6));
                Unit unit = Unit.INSTANCE;
            }
            o0VarE.g0(false);
            o0VarE.C(-143704314);
            if (kVar2 != null && cVar2 != null) {
                a(z14, kVar2, cVar2, m52.c.CYCLING, o0VarE, (i16 & 14) | 3072 | (k.f48247g << 3) | (com.garmin.android.apps.connectmobile.workouts.data.model.c.f48127f << 6));
                Unit unit2 = Unit.INSTANCE;
            }
            o0VarE.g0(false);
            if (kVar3 != null && cVar3 != null) {
                a(z14, kVar3, cVar3, m52.c.RUNNING, o0VarE, (i16 & 14) | 3072 | (k.f48247g << 3) | (com.garmin.android.apps.connectmobile.workouts.data.model.c.f48127f << 6));
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(z14, kVar, cVar, kVar2, cVar2, kVar3, cVar3, i14, 2);
        }
    }

    public static final void c(String str, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1512640862);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            r rVarC = l.C(aVar, f15, f14, eVar.f97920e, 0.0f, 8);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0Var, i15 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vd0.b(str, i14, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(boolean z14, k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar, w wVar, m52.c cVar2, m mVar, int i14) {
        int i15;
        p pVarD;
        u uVar;
        String strP;
        String strP2;
        o0 o0VarE = mVar.E(364467240);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(wVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.k(cVar2.ordinal()) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Double value = kVar.getValue();
            double dDoubleValue = value != null ? value.doubleValue() : 0.0d;
            gg0.i unit = kVar.getUnit();
            double dA = k52.g.a(dDoubleValue, unit != null ? unit.d() : null);
            og0.a aVar = og0.a.f131967a;
            Double value2 = cVar.getValue();
            double dDoubleValue2 = value2 != null ? value2.doubleValue() : 0.0d;
            gg0.i unit2 = cVar.getUnit();
            if (unit2 == null) {
                unit2 = gg0.i.SECOND;
            }
            aVar.getClass();
            double dJ = og0.a.j(dDoubleValue2, unit2);
            tu1.i.f166483a.getClass();
            p pVarD2 = tu1.i.a.d(context, (long) dJ);
            String str = (String) pVarD2.f128594a;
            String str2 = (String) pVarD2.f128595b;
            u uVarG = tu1.i.a.g(context, z14, dA, dJ, cVar2);
            int i16 = cVar2.f116677c;
            String str3 = (String) uVarG.f128605a;
            String str4 = (String) uVarG.f128606b;
            String str5 = (String) uVarG.f128607c;
            Double d14 = wVar != null ? wVar.f101167a : null;
            Double d15 = wVar != null ? wVar.f101168b : null;
            if (d15 != null) {
                o0VarE.C(167417449);
                o0VarE.g0(false);
                pVarD = tu1.i.a.d(context, (long) d15.doubleValue());
            } else {
                o0VarE.C(167503970);
                p pVar = new p("--", y.Q(o0VarE, R.string.common_not_available));
                o0VarE.g0(false);
                pVarD = pVar;
            }
            String str6 = (String) pVarD.f128594a;
            String str7 = (String) pVarD.f128595b;
            if (d14 == null || d15 == null) {
                o0VarE.C(167918936);
                uVar = new u("--", "", y.Q(o0VarE, R.string.common_not_available));
                o0VarE.g0(false);
            } else {
                o0VarE.C(167766757);
                o0VarE.g0(false);
                uVar = tu1.i.a.g(context, z14, d14.doubleValue(), d15.doubleValue(), cVar2);
            }
            String str8 = (String) uVar.f128605a;
            String str9 = (String) uVar.f128606b;
            String str10 = (String) uVar.f128607c;
            c(y.Q(o0VarE, i16), o0VarE, 0);
            String strP3 = y.P(R.string.event_leg_goal_time, new Object[]{y.Q(o0VarE, i16)}, o0VarE);
            String strP4 = y.P(R.string.actual_leg_time, new Object[]{y.Q(o0VarE, i16)}, o0VarE);
            x0 x0Var = x0.f111346a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = l.A(aVar2, eVar.f97920e, 0.0f, 2);
            z3.e eVarC = z3.f.c(-788847953, new f21.b(str, 11, strP3, str2, str6, strP4, str7), o0VarE);
            int i17 = (x0.f111348c << 6) | 48;
            x0Var.e(rVarA, eVarC, o0VarE, i17, 0);
            int[] iArr = a.f199792a;
            if (iArr[cVar2.ordinal()] == 2) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1934210768, R.string.goal_bike_speed, o0VarE, false);
            } else {
                o0VarE.C(-1934208897);
                strP = y.P(R.string.goal_leg_pace, new Object[]{y.Q(o0VarE, i16)}, o0VarE);
                o0VarE.g0(false);
            }
            if (iArr[cVar2.ordinal()] == 2) {
                strP2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1934202606, R.string.actual_bike_speed, o0VarE, false);
            } else {
                o0VarE.C(-1934200671);
                strP2 = y.P(R.string.actual_leg_pace, new Object[]{y.Q(o0VarE, i16)}, o0VarE);
                o0VarE.g0(false);
            }
            String str11 = strP2;
            bVar.getClass();
            x0Var.e(l.A(aVar2, eVar.f97920e, 0.0f, 2), z3.f.c(1519554648, new ak0.g(str5, str3, strP, str4, str10, str8, str11, str9, 13), o0VarE), o0VarE, i17, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(z14, kVar, cVar, wVar, cVar2, i14, 26);
        }
    }

    public static final void e(boolean z14, k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar, k kVar2, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar2, k kVar3, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar3, Integer num, Integer num2, List<w> list, m mVar, int i14) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        boolean z15;
        int i15;
        Object next6;
        am.x0 x0Var;
        Object next7;
        am.x0 x0Var2;
        o0 o0VarE = mVar.E(1206276189);
        int i16 = (i14 & 6) == 0 ? (o0VarE.h(z14) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? o0VarE.B(kVar2) : o0VarE.r(kVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= (32768 & i14) == 0 ? o0VarE.B(cVar2) : o0VarE.r(cVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= (262144 & i14) == 0 ? o0VarE.B(kVar3) : o0VarE.r(kVar3) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= (2097152 & i14) == 0 ? o0VarE.B(cVar3) : o0VarE.r(cVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.B(num) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i16 |= o0VarE.B(num2) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i16 |= o0VarE.r(list) ? 536870912 : 268435456;
        }
        int i17 = i16;
        if (o0VarE.n(i17 & 1, (i17 & 306783379) != 306783378)) {
            x1 x1Var = n.f135158a;
            list.getClass();
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                x0Var2 = ((w) next).f101169c;
                if (x0Var2 == am.x0.f4313o1 || x0Var2 == am.x0.f4317p1) {
                    break;
                }
            } while (x0Var2 != am.x0.f4324r);
            w wVar = (w) next;
            Iterator<T> it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((w) next2).f101169c != am.x0.f4312o);
            w wVar2 = (w) next2;
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
                Iterator it5 = it4;
                if (((w) next3).f101169c == am.x0.f4308n) {
                    break;
                } else {
                    it4 = it5;
                }
            }
            w wVar3 = (w) next3;
            Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it6.next();
                am.x0 x0Var3 = ((w) next4).f101169c;
                Iterator it7 = it6;
                if (x0Var3 == am.x0.f4328s1 || x0Var3 == am.x0.f4332t1) {
                    break;
                } else {
                    it6 = it7;
                }
            }
            w wVar4 = (w) next4;
            if (wVar4 == null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next7 = null;
                        break;
                    }
                    next7 = it8.next();
                    am.x0 x0Var4 = ((w) next7).f101169c;
                    Iterator it9 = it8;
                    if (x0Var4 == am.x0.f4338v || x0Var4 == am.x0.f4342w) {
                        break;
                    } else {
                        it8 = it9;
                    }
                }
                wVar4 = (w) next7;
            }
            Double d14 = wVar4 != null ? wVar4.f101168b : null;
            Iterator it10 = list.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it10.next();
                am.x0 x0Var5 = ((w) next5).f101169c;
                Iterator it11 = it10;
                if (x0Var5 == am.x0.f4335u1 || x0Var5 == am.x0.f4339v1) {
                    break;
                } else {
                    it10 = it11;
                }
            }
            w wVar5 = (w) next5;
            if (wVar5 == null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    am.x0 x0Var6 = ((w) obj).f101169c;
                    if (x0Var6 == am.x0.f4338v || x0Var6 == am.x0.f4342w) {
                        arrayList.add(obj);
                    }
                }
                Iterator<T> it12 = list.iterator();
                do {
                    if (!it12.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it12.next();
                    x0Var = ((w) next6).f101169c;
                    if (x0Var == am.x0.f4328s1) {
                        break;
                    }
                } while (x0Var != am.x0.f4332t1);
                w wVar6 = (w) next6;
                wVar5 = (wVar6 == null || arrayList.isEmpty()) ? (wVar6 != null || arrayList.size() <= 1) ? null : (w) arrayList.get(1) : (w) h0.d0(arrayList);
            }
            Double d15 = wVar5 != null ? wVar5.f101168b : null;
            o0VarE.C(-409723212);
            if (kVar == null || cVar == null) {
                z15 = false;
            } else {
                z15 = false;
                d(z14, kVar, cVar, wVar, m52.c.SWIMMING, o0VarE, (i17 & 14) | 24576 | (k.f48247g << 3) | (com.garmin.android.apps.connectmobile.workouts.data.model.c.f48127f << 6));
                Unit unit = Unit.INSTANCE;
            }
            o0VarE.g0(z15);
            if (num == null) {
                o0VarE.C(183874250);
                o0VarE.g0(z15);
                i15 = 6;
            } else {
                o0VarE.C(183874251);
                i15 = 6;
                f(1, num.intValue(), 6, d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null, o0VarE);
                o0VarE.g0(z15);
            }
            o0VarE.C(-409702893);
            if (kVar2 != null && cVar2 != null) {
                d(z14, kVar2, cVar2, wVar2, m52.c.CYCLING, o0VarE, (i17 & 14) | 24576 | (k.f48247g << 3) | (com.garmin.android.apps.connectmobile.workouts.data.model.c.f48127f << i15));
                Unit unit2 = Unit.INSTANCE;
            }
            o0VarE.g0(z15);
            if (num2 == null) {
                o0VarE.C(184502155);
                o0VarE.g0(z15);
            } else {
                o0VarE.C(184502156);
                f(2, num2.intValue(), i15, d15 != null ? Integer.valueOf((int) d15.doubleValue()) : null, o0VarE);
                o0VarE.g0(z15);
            }
            if (kVar3 != null && cVar3 != null) {
                d(z14, kVar3, cVar3, wVar3, m52.c.RUNNING, o0VarE, (i17 & 14) | 24576 | (k.f48247g << 3) | (com.garmin.android.apps.connectmobile.workouts.data.model.c.f48127f << i15));
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.k(z14, kVar, cVar, kVar2, cVar2, kVar3, cVar3, num, num2, list, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(int i14, int i15, int i16, Integer num, m mVar) {
        p pVarD;
        o0 o0VarE = mVar.E(1014850674);
        int i17 = (o0VarE.k(i15) ? 32 : 16) | i16 | (o0VarE.B(num) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            c(y.P(R.string.activity_transition_name_label, new Object[]{Integer.valueOf(i14)}, o0VarE), o0VarE, 0);
            tu1.i.f166483a.getClass();
            p pVarD2 = tu1.i.a.d(context, i15);
            String str = (String) pVarD2.f128594a;
            String str2 = (String) pVarD2.f128595b;
            if (num != null) {
                o0VarE.C(1142158104);
                o0VarE.g0(false);
                pVarD = tu1.i.a.d(context, num.intValue());
            } else {
                o0VarE.C(1142251352);
                p pVar = new p("--", y.Q(o0VarE, R.string.common_not_available));
                o0VarE.g0(false);
                pVarD = pVar;
            }
            String str3 = (String) pVarD.f128594a;
            String str4 = (String) pVarD.f128595b;
            x0 x0Var = x0.f111346a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2), z3.f.c(48554169, new g0(3, str, str2, str3, str4), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rr0.f(i14, i15, num, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(jv1.n nVar, vu1.w wVar, m mVar, int i14) {
        int i15;
        e23.a aVar;
        j eventCustomization;
        nVar.getClass();
        o0 o0VarE = mVar.E(-564353544);
        int i16 = (o0VarE.r(nVar) ? 4 : 2) | i14 | (o0VarE.B(wVar) ? 32 : 16);
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH = null;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            boolean z14 = nVar.f101094p;
            m.a aVar4 = m.f135153a;
            if (z14) {
                o0VarE.C(1926427344);
                o0VarE.g0(false);
                aVar = null;
            } else {
                o0VarE.C(1926470930);
                boolean zR = ((i16 & 112) == 32) | o0VarE.r(nVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new d(nVar, wVar, 1);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new d(nVar, wVar, 1);
                        o0VarE.K(objQ);
                    }
                }
                aVar = (e23.a) objQ;
                o0VarE.g0(false);
            }
            c.a(aVar, o0VarE, 0);
            x0 x0Var = x0.f111346a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = l.A(aVar2, eVar.f97920e, 0.0f, 2);
            bVar2.getClass();
            x0Var.e(l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), z3.f.c(-1561859129, new h(i17, nVar, context), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
            fg0.k kVar2 = nVar.f101088j;
            if (kVar2 != null && (eventCustomization = kVar2.getEventCustomization()) != null) {
                listH = eventCustomization.h();
            }
            if (listH == null || listH.isEmpty()) {
                o0VarE.C(1932413940);
                o0VarE.g0(false);
            } else {
                Object objH = q2.h(o0VarE, 1928677572, aVar4);
                m.a.C2565a c2565a = m.a.f135155b;
                if (objH == c2565a) {
                    objH = p0.n(Boolean.FALSE);
                    o0VarE.K(objH);
                }
                p1 p1Var = (p1) objH;
                l72.p2 p2Var = l72.p2.f111205a;
                bVar2.getClass();
                r rVarC2 = l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                String strQ = y.Q(o0VarE, R.string.lbl_leg_goals);
                z3.e eVarC = z3.f.c(-655909228, new sk0.c(p1Var, 16), o0VarE);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new l0(p1Var, 7);
                    o0VarE.K(objQ2);
                }
                p2Var.g(strQ, rVarC2, null, null, eVarC, false, false, (e23.a) objQ2, o0VarE, 100687872, 236);
                c0.c(b0Var, ((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(-611896799, new t(nVar, 15), o0VarE), o0VarE, 1572870, 30);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            i15 = 1;
            o0VarE.g0(true);
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(nVar, wVar, i14, i15);
        }
    }
}
