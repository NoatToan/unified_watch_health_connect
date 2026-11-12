package rv1;

import am.z0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.e3;
import com.google.firebase.messaging.Constants;
import gl1.y;
import i3.e5;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o13.u;
import o4.m1;
import o72.h3;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import rk0.a1;
import s5.x0;
import v.e0;
import v62.e9;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154734a;

        static {
            int[] iArr = new int[uv1.a.values().length];
            try {
                iArr[uv1.a.FITNESS_AGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uv1.a.HIGHEST_VIGOROUS_MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uv1.a.HIGHEST_CALORIES_BURN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[uv1.a.PERSONAL_RECORDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[uv1.a.VO2_MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[uv1.a.FASTEST_AVERAGE_PACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[uv1.a.LONGEST_RUN_IN_PLAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[uv1.a.LACTATE_THRESHOLD_PACE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[uv1.a.LACTATE_THRESHOLD_HR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[uv1.a.FUNCTIONAL_THRESHOLD_POWER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[uv1.a.HIGHEST_AVERAGE_POWER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[uv1.a.LONGEST_RIDE_IN_PLAN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[uv1.a.LONGEST_SWIM_IN_PLAN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[uv1.a.CRITICAL_SWIM_SPEED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[uv1.a.FURTHEST_WALKED_IN_A_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[uv1.a.LONGEST_STEP_GOAL_STREAK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[uv1.a.MOST_STEPS_IN_A_DAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f154734a = iArr;
        }
    }

    public static final void a(u<Integer, Integer, Integer> uVar, p3.m mVar, int i14) {
        String strF1;
        boolean z14;
        String strP;
        boolean z15;
        String strD;
        o0 o0VarE = mVar.E(-1335826106);
        int i15 = (o0VarE.B(uVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Integer num = uVar.f128605a;
            Integer num2 = uVar.f128606b;
            int iIntValue = uVar.f128607c.intValue();
            String strQ = y.Q(o0VarE, R.string.txt_empty_page_no_data);
            String strQ2 = y.Q(o0VarE, R.string.symbol_double_dash);
            if (num2 != null) {
                o0VarE.C(1571799128);
                oi0.h hVar = new oi0.h(a0.s(o0VarE));
                if (num != null) {
                    l3.a aVar = l3.f23124b;
                    long jIntValue = num.intValue();
                    aVar.getClass();
                    strF1 = l3.a.f1(jIntValue, strQ2);
                } else {
                    strF1 = strQ2;
                }
                l3.a aVar2 = l3.f23124b;
                long jIntValue2 = num2.intValue();
                aVar2.getClass();
                String strF2 = l3.a.f1(jIntValue2, strQ2);
                if (num != null) {
                    if (num.intValue() != 0) {
                        strD = hVar.d(num.intValue(), true);
                    }
                    if (strD != null) {
                        strD = strQ;
                        strQ2 = strD;
                    }
                }
                strD = strQ;
                String strD2 = hVar.d(num2.intValue(), true);
                if (mg0.b.c()) {
                    o0VarE.C(466366968);
                    strP = y.P(R.string.lbl_per_meters_value, new Object[]{100}, o0VarE);
                    z14 = false;
                } else {
                    z14 = false;
                    o0VarE.C(466368759);
                    strP = y.P(R.string.lbl_per_yards_value, new Object[]{100}, o0VarE);
                }
                o0VarE.g0(z14);
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                LinkedHashMap linkedHashMap = c0235a.f16962a;
                linkedHashMap.put("value", strQ2 + "," + strP);
                linkedHashMap.put("value_2", e0.h(new StringBuilder(), strD2, ",", strP));
                int iIntValue2 = num2.intValue();
                if (num != null && num.intValue() == iIntValue2) {
                    z15 = z14;
                    o0VarE.C(1573396124);
                    o0VarE.g0(z15);
                } else {
                    o0VarE.C(1572885833);
                    String strQ3 = y.Q(o0VarE, R.string.lbl_css);
                    String strG = e5.g(strF1, "\n", y.Q(o0VarE, iIntValue));
                    String strQ4 = y.Q(o0VarE, R.string.lbl_starting);
                    String strG2 = e5.g(strF2, "\n", y.Q(o0VarE, iIntValue));
                    String strQ5 = y.Q(o0VarE, R.string.lbl_stamina_ending_potential_abr);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC = c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                    b92.a aVarB = c0235a.b();
                    int i16 = b92.a.f16960b;
                    z15 = z14;
                    l72.l.e(strQ3, null, strG, strQ4, strG2, strQ5, rVarC, aVarB, false, null, o0VarE, 0, 770);
                    o0VarE.g0(z15);
                }
                o0VarE.g0(z15);
            } else {
                o0VarE.C(1573402076);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r12.a(uVar, i14, 22);
        }
    }

    public static final void b(String str, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(342798527);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.d dVar = c2.j.f22693c;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
            s2 s2VarA = q2.a(dVar, bVar, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i15 & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h3(str, i14, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:101:0x05df  */
    /* JADX WARN: Code duplicated, block: B:103:0x067c  */
    /* JADX WARN: Code duplicated, block: B:105:0x068b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0697  */
    /* JADX WARN: Code duplicated, block: B:108:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:110:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:112:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:114:0x076e  */
    /* JADX WARN: Code duplicated, block: B:120:0x078f  */
    /* JADX WARN: Code duplicated, block: B:122:0x079d  */
    /* JADX WARN: Code duplicated, block: B:123:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:125:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:127:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:128:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:130:0x0803  */
    /* JADX WARN: Code duplicated, block: B:133:0x080b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0816  */
    /* JADX WARN: Code duplicated, block: B:136:0x083c  */
    /* JADX WARN: Code duplicated, block: B:137:0x083f  */
    /* JADX WARN: Code duplicated, block: B:139:0x087b  */
    /* JADX WARN: Code duplicated, block: B:142:0x088f  */
    /* JADX WARN: Code duplicated, block: B:144:0x089d  */
    /* JADX WARN: Code duplicated, block: B:145:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:147:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:149:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:152:0x08de  */
    /* JADX WARN: Code duplicated, block: B:154:0x097c  */
    /* JADX WARN: Code duplicated, block: B:156:0x098f  */
    /* JADX WARN: Code duplicated, block: B:158:0x099b  */
    /* JADX WARN: Code duplicated, block: B:159:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:161:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:162:0x09db  */
    /* JADX WARN: Code duplicated, block: B:165:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0a8d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:180:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:182:0x0af5  */
    /* JADX WARN: Code duplicated, block: B:186:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0b3d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:195:0x0bd0  */
    /* JADX WARN: Code duplicated, block: B:197:0x0be9  */
    /* JADX WARN: Code duplicated, block: B:199:0x0bfe  */
    /* JADX WARN: Code duplicated, block: B:200:0x0c8c  */
    /* JADX WARN: Code duplicated, block: B:202:0x0c9e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0cb0  */
    /* JADX WARN: Code duplicated, block: B:205:0x0d08  */
    /* JADX WARN: Code duplicated, block: B:209:0x0d37  */
    /* JADX WARN: Code duplicated, block: B:39:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x01db  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0215  */
    /* JADX WARN: Code duplicated, block: B:55:0x0239  */
    /* JADX WARN: Code duplicated, block: B:57:0x0256  */
    /* JADX WARN: Code duplicated, block: B:59:0x0262  */
    /* JADX WARN: Code duplicated, block: B:60:0x026c  */
    /* JADX WARN: Code duplicated, block: B:64:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0337  */
    /* JADX WARN: Code duplicated, block: B:71:0x0343  */
    /* JADX WARN: Code duplicated, block: B:72:0x034f  */
    /* JADX WARN: Code duplicated, block: B:75:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0408  */
    /* JADX WARN: Code duplicated, block: B:78:0x0412  */
    /* JADX WARN: Code duplicated, block: B:80:0x0421  */
    /* JADX WARN: Code duplicated, block: B:82:0x0432  */
    /* JADX WARN: Code duplicated, block: B:84:0x043c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0447  */
    /* JADX WARN: Code duplicated, block: B:87:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0505  */
    /* JADX WARN: Code duplicated, block: B:93:0x050f  */
    /* JADX WARN: Code duplicated, block: B:94:0x051a  */
    /* JADX WARN: Code duplicated, block: B:96:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:98:0x05c7  */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x05df, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x07dd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:134:0x0816, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:152:0x08de, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:199:0x0bfe, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x034f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0447, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x051a, please report this as an issue */
    public static final void c(vt1.o oVar, List<? extends uv1.a> list, vv1.a aVar, p3.m mVar, int i14) {
        o0 o0Var;
        h5.e0.a aVar2;
        h5.g.a.f fVar;
        h5.e0.a aVar3;
        o13.p<Integer, Integer> pVar;
        Map<Long, yw1.i> map;
        o13.p<Integer, Integer> pVar2;
        boolean z14;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        Iterator<T> it;
        boolean z15;
        Map<Long, yw1.i> map2;
        Integer num;
        Integer num2;
        String strValueOf;
        String str;
        String strValueOf2;
        Context context;
        String strQ;
        u<Double, Integer, Integer> uVar;
        o13.p<Double, Double> pVar3;
        u<Integer, Integer, Integer> uVar2;
        Integer num3;
        Integer num4;
        int iIntValue;
        String str2;
        boolean z16;
        String str3;
        String str4;
        u<Integer, Integer, Integer> uVar3;
        Integer num5;
        Integer num6;
        int iIntValue2;
        o13.p<Integer, Integer> pVar4;
        vv1.a aVar4;
        boolean z17;
        u<Double, Integer, Integer> uVar4;
        u<Double, Integer, Integer> uVar5;
        u<Integer, Integer, Integer> uVar6;
        u<Double, Integer, Integer> uVar7;
        Integer num7;
        Integer num8;
        vv1.a aVar5 = aVar;
        list.getClass();
        aVar5.getClass();
        Integer num9 = aVar5.f180491c;
        Map<Long, yw1.i> map3 = aVar5.f180492d;
        o13.p<Integer, Integer> pVar5 = aVar5.f180493e;
        o13.p<Integer, Integer> pVar6 = aVar5.f180497i;
        o13.p<String, String> pVar7 = aVar5.f180489a;
        Integer num10 = aVar5.f180490b;
        o0 o0VarE = mVar.E(-1771073766);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.k(oVar == null ? -1 : oVar.ordinal()) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(aVar5) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ2 = y.Q(o0VarE, R.string.symbol_double_dash);
            h4.r.a aVar6 = h4.r.S;
            Context context3 = context2;
            h4.r rVarF = x2.f(aVar6, 1.0f);
            long jF = vb.h.f(d92.b.f58623a, o0VarE);
            m1.a aVar7 = m1.f128891a;
            h4.r rVarE = u1.n.e(rVarF, jF, aVar7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar8 = h4.d.a.f81536n;
            z zVarA2 = c2.y.a(kVar, aVar8, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.getU());
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar9 = h5.g.a.f81805b;
            o13.p<String, String> pVar8 = pVar7;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar9);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                aVar2 = aVar9;
            } else {
                aVar2 = aVar9;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                String strQ3 = y.Q(o0VarE, uv1.d.f172954r.f172956a);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                h4.r rVarB = b0Var.b(aVar6, aVar8);
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarA = c2.l.A(rVarB, eVar2.f97920e, 0.0f, 2);
                bVar2.getClass();
                aVar3 = aVar2;
                pVar = pVar6;
                map = map3;
                pVar2 = pVar5;
                z14 = false;
                mh.c(strQ3, c2.l.C(rVarA, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                h4.r rVarE2 = u1.n.e(x2.f(aVar6, 1.0f), d92.b.a(o0Var).c().b(), aVar7);
                bVar2.getClass();
                h4.r rVarY = c2.l.y(rVarE2, eVar2.f97920e);
                zVarA = c2.y.a(kVar, aVar8, o0Var, 0);
                iHashCode = Long.hashCode(o0Var.getU());
                i2VarA0 = o0Var.a0();
                rVarC = h4.k.c(rVarY, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar3);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, zVarA, o0Var);
                b4.c(c1623g, i2VarA0, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0Var, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0Var);
                o0Var.C(1275741887);
                it = list.iterator();
                while (it.hasNext()) {
                    switch (a.f154734a[((uv1.a) it.next()).ordinal()]) {
                        case 1:
                            context3 = context3;
                            pVar2 = pVar2;
                            pVar = pVar;
                            o0Var.C(-2137079124);
                            if (pVar8 != null) {
                                o0Var.C(-2137019263);
                                String strQ4 = y.Q(o0Var, R.string.lbl_fitness_age);
                                String strA = pVar8.a();
                                String strQ5 = y.Q(o0Var, R.string.lbl_starting);
                                pVar8 = pVar8;
                                String str5 = pVar8.f128595b;
                                String strQ6 = y.Q(o0Var, R.string.lbl_stamina_ending_potential_abr);
                                h4.r.a aVar10 = h4.r.S;
                                d92.b.f58623a.getClass();
                                o0 o0Var2 = o0Var;
                                l72.l.e(strQ4, null, strA, strQ5, str5, strQ6, c2.l.A(aVar10, 0.0f, d92.b.b().b().getF97918c(), 1), null, false, null, o0Var2, 48, 896);
                                o0Var = o0Var2;
                                o0Var.f();
                            } else {
                                pVar8 = pVar8;
                                o0Var.C(-2136383081);
                                o0Var.f();
                            }
                            o0Var.f();
                            Unit unit = Unit.INSTANCE;
                            break;
                        case 2:
                            context3 = context3;
                            Map<Long, yw1.i> map4 = map;
                            o0Var.C(-2136265312);
                            if (num10 != null) {
                                o0Var.C(-2136199685);
                                String str6 = num10 + StringUtils.SPACE + y.Q(o0Var, R.string.common_min_abbreviated_without_period);
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                c0235a.a("merge", y.Q(o0Var, R.string.highest_vigorous_minutes) + ", " + num10 + " , " + y.Q(o0Var, R.string.lbl_time_unit_minutes));
                                b92.a aVarB = c0235a.b();
                                String strQ7 = y.Q(o0Var, R.string.highest_vigorous_minutes);
                                h4.r.a aVar11 = h4.r.S;
                                d92.b.f58623a.getClass();
                                h4.r rVarA2 = c2.l.A(aVar11, 0.0f, d92.b.b().b().getF97918c(), 1);
                                int i16 = b92.a.f16960b;
                                o0 o0Var3 = o0Var;
                                l72.l.e(strQ7, null, str6, null, null, null, rVarA2, aVarB, false, null, o0Var3, 0, 826);
                                o0Var = o0Var3;
                                o0Var.f();
                            } else {
                                o0Var.C(-2135250217);
                                o0Var.f();
                            }
                            o0Var.f();
                            Unit unit2 = Unit.INSTANCE;
                            map = map4;
                            break;
                        case 3:
                            Context context4 = context3;
                            Map<Long, yw1.i> map5 = map;
                            pVar2 = pVar2;
                            pVar = pVar;
                            o0Var.C(-2135132851);
                            if (num9 != null) {
                                o0Var.C(-2135071068);
                                l3.f23124b.getClass();
                                String str7 = l3.f23131i.format(num9);
                                String lowerCase = y.Q(o0Var, R.string.calories_abbreviation).toLowerCase(Locale.ROOT);
                                String strC = zl.a.c(lowerCase, str7, StringUtils.SPACE, lowerCase);
                                b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                c0235a2.a("merge", androidx.room.a0.j("stringResource(R.string.highest_calorie_burn), ", str7, " ,", y.Q(o0Var, R.string.steps_steps_calories)));
                                b92.a aVarB2 = c0235a2.b();
                                String strQ8 = y.Q(o0Var, R.string.highest_calorie_burn);
                                h4.r.a aVar12 = h4.r.S;
                                d92.b.f58623a.getClass();
                                h4.r rVarA3 = c2.l.A(aVar12, 0.0f, d92.b.b().b().getF97918c(), 1);
                                int i17 = b92.a.f16960b;
                                o0 o0Var4 = o0Var;
                                z15 = false;
                                l72.l.e(strQ8, null, strC, null, null, null, rVarA3, aVarB2, false, null, o0Var4, 0, 826);
                                o0Var = o0Var4;
                                o0Var.f();
                            } else {
                                z15 = false;
                                o0Var.C(-2134037993);
                                o0Var.f();
                            }
                            o0Var.f();
                            Unit unit3 = Unit.INSTANCE;
                            map = map5;
                            context3 = context4;
                            break;
                        case 4:
                            Context context5 = context3;
                            o0Var.C(-1869952626);
                            if (map != null || map.isEmpty()) {
                                map2 = map;
                                o0Var.C(-2133799913);
                                o0Var.f();
                            } else {
                                o0Var.C(-2133902740);
                                map2 = map;
                                e(oVar, map2, o0Var, i15 & 14);
                                o0Var.f();
                            }
                            o0Var.f();
                            Unit unit4 = Unit.INSTANCE;
                            map = map2;
                            context3 = context5;
                            break;
                        case 5:
                            Context context6 = context3;
                            pVar = pVar;
                            o0Var.C(-2133730008);
                            if (pVar2 != null) {
                                o0Var.C(-2133673991);
                                pVar2 = pVar2;
                                num = pVar2.f128594a;
                                num2 = pVar2.f128595b;
                                String strQ9 = y.Q(o0Var, R.string.vo2_max_ftnscoach);
                                if (num != null || (strValueOf = String.valueOf(num.intValue())) == null) {
                                    strValueOf = strQ2;
                                }
                                String strQ10 = y.Q(o0Var, R.string.lbl_starting);
                                if (num2 != null || (strValueOf2 = String.valueOf(num2.intValue())) == null) {
                                    str = strQ2;
                                } else {
                                    str = strValueOf2;
                                }
                                String strQ11 = y.Q(o0Var, R.string.lbl_stamina_ending_potential_abr);
                                h4.r.a aVar13 = h4.r.S;
                                d92.b.f58623a.getClass();
                                o0 o0Var5 = o0Var;
                                l72.l.e(strQ9, null, strValueOf, strQ10, str, strQ11, c2.l.C(aVar13, 0.0f, d92.b.b().b().getF97918c(), 0.0f, 0.0f, 13), null, false, null, o0Var5, 0, 898);
                                o0Var = o0Var5;
                                o0Var.f();
                            } else {
                                pVar2 = pVar2;
                                o0Var.C(-2132999369);
                                o0Var.f();
                            }
                            o0Var.f();
                            Unit unit5 = Unit.INSTANCE;
                            context3 = context6;
                            break;
                        case 6:
                            pVar = pVar;
                            o0Var.C(-2132822824);
                            if (pVar == null) {
                                o0Var.C(-2132822825);
                                o0Var.f();
                                context = context3;
                            } else {
                                o0Var.C(-2132822824);
                                context = context3;
                                String strP0 = l3.f23124b.p0(pVar.a().intValue(), context);
                                b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                if (mg0.b.c()) {
                                    o0Var.C(-1787276019);
                                    strQ = y.Q(o0Var, R.string.lbl_minutes_per_kilometer);
                                    o0Var.f();
                                } else {
                                    o0Var.C(-1787138565);
                                    strQ = y.Q(o0Var, R.string.lbl_minutes_per_mile);
                                    o0Var.f();
                                }
                                c0235a3.a("merge", strP0 + "," + strQ);
                                b92.a aVarB3 = c0235a3.b();
                                String strQ12 = y.Q(o0Var, R.string.fastest_average_pace);
                                String strG = e5.g(strP0, StringUtils.SPACE, y.Q(o0Var, pVar.f128595b.intValue()));
                                h4.r.a aVar14 = h4.r.S;
                                d92.b.f58623a.getClass();
                                h4.r rVarC3 = c2.l.C(aVar14, 0.0f, d92.b.b().b().getF97918c(), 0.0f, 0.0f, 13);
                                int i18 = b92.a.f16960b;
                                o0 o0Var6 = o0Var;
                                l72.l.e(strQ12, null, strG, null, null, null, rVarC3, aVarB3, false, null, o0Var6, 0, 826);
                                o0Var = o0Var6;
                                Unit unit6 = Unit.INSTANCE;
                                o0Var.f();
                            }
                            o0Var.f();
                            context3 = context;
                            pVar2 = pVar2;
                            break;
                        case 7:
                            pVar = pVar;
                            o0Var.C(-2131572811);
                            if (og2.k.x(aVar, 7)) {
                                o0Var.C(-2130547145);
                                o0Var.f();
                            } else {
                                o0Var.C(-1869868463);
                                uVar = aVar.f180495g;
                                if (uVar == null) {
                                    o0Var.C(-2131347504);
                                    o0Var.g0(false);
                                } else {
                                    o0Var.C(-2131347503);
                                    double dDoubleValue = uVar.f128605a.doubleValue();
                                    int iIntValue3 = uVar.f128606b.intValue();
                                    int iIntValue4 = uVar.f128607c.intValue();
                                    b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                                    c0235a4.f16962a.put("merge", dDoubleValue + " , " + y.Q(o0Var, iIntValue4));
                                    b92.a aVarB4 = c0235a4.b();
                                    String strQ13 = y.Q(o0Var, R.string.personal_records_label_farthest_run);
                                    String str8 = dDoubleValue + StringUtils.SPACE + y.Q(o0Var, iIntValue3);
                                    h4.r.a aVar15 = h4.r.S;
                                    d92.b.f58623a.getClass();
                                    h4.r rVarC4 = c2.l.C(aVar15, 0.0f, d92.b.f58625c.b().getF97918c(), 0.0f, 0.0f, 13);
                                    int i19 = b92.a.f16960b;
                                    o0 o0Var7 = o0Var;
                                    l72.l.e(strQ13, null, str8, null, null, null, rVarC4, aVarB4, false, null, o0Var7, 0, 826);
                                    o0Var = o0Var7;
                                    Unit unit7 = Unit.INSTANCE;
                                    o0Var.f();
                                }
                                o0Var.f();
                            }
                            o0Var.f();
                            Unit unit8 = Unit.INSTANCE;
                            context3 = context3;
                            pVar2 = pVar2;
                            break;
                        case 8:
                            o0Var.C(-2130432693);
                            pVar3 = aVar.f180499k;
                            if (pVar3 == null) {
                                o0Var.C(-2130432694);
                                o0Var.g0(z14);
                            } else {
                                o0Var.C(-2130432693);
                                g(pVar3, o0Var, z14 ? 1 : 0);
                                Unit unit9 = Unit.INSTANCE;
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                            context3 = context3;
                            pVar = pVar;
                            pVar2 = pVar2;
                            break;
                        case 9:
                            o0Var.C(-2130220188);
                            uVar2 = aVar.f180500l;
                            if (uVar2 == null) {
                                o0Var.C(-2130220189);
                                o0Var.g0(z14);
                            } else {
                                o0Var.C(-2130220188);
                                num3 = uVar2.f128605a;
                                num4 = uVar2.f128606b;
                                iIntValue = uVar2.f128607c.intValue();
                                if (p005kotlin.jvm.internal.s.g(num3, num4)) {
                                    z14 = false;
                                    o0Var.C(-1268071698);
                                    o0Var.g0(false);
                                } else {
                                    o0Var.C(-1268767462);
                                    String strQ14 = y.Q(o0Var, R.string.lactate_threshold_hr);
                                    if (num3 == null) {
                                        o0Var.C(-1268607069);
                                        o0Var.g0(false);
                                        z16 = false;
                                        str2 = null;
                                    } else {
                                        o0Var.C(-1268607068);
                                        str2 = num3.intValue() + StringUtils.SPACE + y.Q(o0Var, iIntValue);
                                        z16 = false;
                                        o0Var.g0(false);
                                    }
                                    if (str2 == null) {
                                        str2 = strQ2;
                                    }
                                    String strQ15 = y.Q(o0Var, R.string.lbl_starting);
                                    if (num4 == null) {
                                        o0Var.C(-1268400733);
                                        o0Var.g0(z16);
                                        str3 = null;
                                    } else {
                                        o0Var.C(-1268400732);
                                        str3 = num4.intValue() + StringUtils.SPACE + y.Q(o0Var, iIntValue);
                                        o0Var.g0(false);
                                    }
                                    if (str3 == null) {
                                        str4 = strQ2;
                                    } else {
                                        str4 = str3;
                                    }
                                    String strQ16 = y.Q(o0Var, R.string.lbl_stamina_ending_potential_abr);
                                    h4.r.a aVar16 = h4.r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    o0 o0Var8 = o0Var;
                                    l72.l.e(strQ14, null, str2, strQ15, str4, strQ16, c2.l.C(aVar16, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), null, false, null, o0Var8, 0, 898);
                                    o0Var = o0Var8;
                                    z14 = false;
                                    o0Var.g0(false);
                                }
                                Unit unit10 = Unit.INSTANCE;
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                            context3 = context3;
                            pVar = pVar;
                            pVar2 = pVar2;
                            break;
                        case 10:
                            o0Var.C(-2129170962);
                            uVar3 = aVar.f180501m;
                            if (uVar3 == null) {
                                o0Var.C(-2129170963);
                                o0Var.g0(z14);
                            } else {
                                o0Var.C(-2129170962);
                                num5 = uVar3.f128605a;
                                num6 = uVar3.f128606b;
                                iIntValue2 = uVar3.f128607c.intValue();
                                if (p005kotlin.jvm.internal.s.g(num5, num6)) {
                                    o0Var.C(-1045439825);
                                    o0Var.g0(z14);
                                } else {
                                    o0Var.C(-1046821743);
                                    String strQ17 = y.Q(o0Var, iIntValue2);
                                    if (num5 == null) {
                                        num5 = strQ2;
                                    }
                                    if (num6 == null) {
                                        num6 = strQ2;
                                    }
                                    b92.a.C0235a c0235a5 = new b92.a.C0235a(null, 1, null);
                                    String str9 = num5 + "," + y.Q(o0Var, R.string.common_watts);
                                    LinkedHashMap linkedHashMap = c0235a5.f16962a;
                                    linkedHashMap.put("value", str9);
                                    linkedHashMap.put("value_2", num6 + "," + y.Q(o0Var, R.string.common_watts));
                                    String strQ18 = y.Q(o0Var, R.string.device_settings_functional_threshold_power);
                                    String str10 = num5 + StringUtils.SPACE + strQ17;
                                    String strQ19 = y.Q(o0Var, R.string.lbl_starting);
                                    String str11 = num6 + StringUtils.SPACE + strQ17;
                                    String strQ20 = y.Q(o0Var, R.string.lbl_stamina_ending_potential_abr);
                                    b92.a aVarB5 = c0235a5.b();
                                    h4.r.a aVar17 = h4.r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC5 = c2.l.C(aVar17, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                                    int i24 = b92.a.f16960b;
                                    o0 o0Var9 = o0Var;
                                    l72.l.e(strQ18, null, str10, strQ19, str11, strQ20, rVarC5, aVarB5, false, null, o0Var9, 0, 770);
                                    o0Var = o0Var9;
                                    z14 = false;
                                    o0Var.g0(false);
                                }
                                Unit unit11 = Unit.INSTANCE;
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                            context3 = context3;
                            pVar = pVar;
                            pVar2 = pVar2;
                            break;
                        case 11:
                            o0Var.C(-2127462738);
                            if (pVar == null) {
                                o0Var.C(-2127462739);
                                o0Var.g0(z14);
                                pVar4 = pVar;
                            } else {
                                pVar4 = pVar;
                                Integer num11 = pVar4.f128594a;
                                o0Var.C(-2127462738);
                                b92.a.C0235a c0235a6 = new b92.a.C0235a(null, 1, null);
                                c0235a6.f16962a.put("value", num11 + "," + y.Q(o0Var, R.string.common_watts));
                                String strQ21 = y.Q(o0Var, R.string.highest_average_power);
                                String str12 = num11 + StringUtils.SPACE + y.Q(o0Var, pVar4.f128595b.intValue());
                                b92.a aVarB6 = c0235a6.b();
                                h4.r.a aVar18 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC6 = c2.l.C(aVar18, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                                int i25 = b92.a.f16960b;
                                o0 o0Var10 = o0Var;
                                l72.l.e(strQ21, null, str12, null, null, null, rVarC6, aVarB6, false, null, o0Var10, 0, 826);
                                o0Var = o0Var10;
                                Unit unit12 = Unit.INSTANCE;
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                            context3 = context3;
                            pVar = pVar4;
                            pVar8 = pVar8;
                            pVar2 = pVar2;
                            break;
                        case 12:
                            aVar4 = aVar;
                            z17 = true;
                            o0Var.C(-2126694031);
                            if (og2.k.x(aVar4, 8)) {
                                o0Var.C(-2125664521);
                                o0Var.g0(z14);
                            } else {
                                o0Var.C(-1869711021);
                                uVar4 = aVar4.f180494f;
                                if (uVar4 == null) {
                                    o0Var.C(-2126466802);
                                    o0Var.g0(z14);
                                } else {
                                    o0Var.C(-2126466801);
                                    double dDoubleValue2 = uVar4.f128605a.doubleValue();
                                    int iIntValue5 = uVar4.f128606b.intValue();
                                    int iIntValue6 = uVar4.f128607c.intValue();
                                    b92.a.C0235a c0235a7 = new b92.a.C0235a(null, 1, null);
                                    c0235a7.f16962a.put("merge", dDoubleValue2 + " , " + y.Q(o0Var, iIntValue6));
                                    b92.a aVarB7 = c0235a7.b();
                                    String strQ22 = y.Q(o0Var, R.string.personal_records_label_farthest_cycle);
                                    String str13 = dDoubleValue2 + StringUtils.SPACE + y.Q(o0Var, iIntValue5);
                                    h4.r.a aVar19 = h4.r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC7 = c2.l.C(aVar19, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                                    int i26 = b92.a.f16960b;
                                    o0 o0Var11 = o0Var;
                                    l72.l.e(strQ22, null, str13, null, null, null, rVarC7, aVarB7, false, null, o0Var11, 0, 826);
                                    o0Var = o0Var11;
                                    Unit unit13 = Unit.INSTANCE;
                                    o0Var.g0(z14);
                                }
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                            Unit unit14 = Unit.INSTANCE;
                            pVar8 = pVar8;
                            pVar2 = pVar2;
                            pVar = pVar;
                            break;
                        case 13:
                            aVar4 = aVar;
                            z17 = true;
                            o0Var.C(-2125550162);
                            if (og2.k.x(aVar4, 17)) {
                                o0Var.C(-2124517769);
                                o0Var.g0(z14);
                            } else {
                                o0Var.C(-1869674122);
                                uVar5 = aVar4.f180496h;
                                if (uVar5 == null) {
                                    o0Var.C(-2125322933);
                                    o0Var.g0(z14);
                                } else {
                                    o0Var.C(-2125322932);
                                    double dDoubleValue3 = uVar5.f128605a.doubleValue();
                                    int iIntValue7 = uVar5.f128606b.intValue();
                                    int iIntValue8 = uVar5.f128607c.intValue();
                                    b92.a.C0235a c0235a8 = new b92.a.C0235a(null, 1, null);
                                    c0235a8.f16962a.put("merge", dDoubleValue3 + " , " + y.Q(o0Var, iIntValue8));
                                    b92.a aVarB8 = c0235a8.b();
                                    String strQ23 = y.Q(o0Var, R.string.personal_records_label_longest_poolswim);
                                    String str14 = dDoubleValue3 + StringUtils.SPACE + y.Q(o0Var, iIntValue7);
                                    h4.r.a aVar20 = h4.r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC8 = c2.l.C(aVar20, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                                    int i27 = b92.a.f16960b;
                                    o0 o0Var12 = o0Var;
                                    l72.l.e(strQ23, null, str14, null, null, null, rVarC8, aVarB8, false, null, o0Var12, 0, 826);
                                    o0Var = o0Var12;
                                    Unit unit15 = Unit.INSTANCE;
                                    o0Var.g0(z14);
                                }
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                            Unit unit16 = Unit.INSTANCE;
                            pVar8 = pVar8;
                            pVar2 = pVar2;
                            pVar = pVar;
                            break;
                        case 14:
                            aVar4 = aVar;
                            z17 = true;
                            o0Var.C(-2124404402);
                            uVar6 = aVar4.f180502n;
                            if (uVar6 == null) {
                                o0Var.C(-2124404403);
                                o0Var.g0(z14);
                            } else {
                                o0Var.C(-2124404402);
                                a(uVar6, o0Var, z14 ? 1 : 0);
                                Unit unit17 = Unit.INSTANCE;
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                            pVar8 = pVar8;
                            pVar2 = pVar2;
                            pVar = pVar;
                            break;
                        case 15:
                            aVar4 = aVar;
                            o0Var.C(-2124188952);
                            uVar7 = aVar4.f180503o;
                            if (uVar7 == null) {
                                o0Var.C(-2124188953);
                                o0Var.g0(z14);
                                z17 = true;
                            } else {
                                o0Var.C(-2124188952);
                                double dDoubleValue4 = uVar7.f128605a.doubleValue();
                                int iIntValue9 = uVar7.f128606b.intValue();
                                int iIntValue10 = uVar7.f128607c.intValue();
                                b92.a.C0235a c0235a9 = new b92.a.C0235a(null, 1, null);
                                c0235a9.f16962a.put("merge", dDoubleValue4 + " , " + y.Q(o0Var, iIntValue10));
                                b92.a aVarB9 = c0235a9.b();
                                c22.x0.f23314a.getClass();
                                String strW = gl1.d.W(c22.x0.Lb);
                                String str15 = dDoubleValue4 + StringUtils.SPACE + y.Q(o0Var, iIntValue9);
                                h4.r.a aVar21 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC9 = c2.l.C(aVar21, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                                int i28 = b92.a.f16960b;
                                o0 o0Var13 = o0Var;
                                z17 = true;
                                l72.l.e(strW, null, str15, null, null, null, rVarC9, aVarB9, false, null, o0Var13, 0, 826);
                                o0Var = o0Var13;
                                Unit unit18 = Unit.INSTANCE;
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                            pVar8 = pVar8;
                            pVar2 = pVar2;
                            pVar = pVar;
                            break;
                        case 16:
                            aVar4 = aVar;
                            o0Var.C(-2123306072);
                            num7 = aVar4.f180504p;
                            if (num7 == null) {
                                o0Var.C(-2123306073);
                                o0Var.g0(z14);
                            } else {
                                o0Var.C(-2123306072);
                                String strP = y.P(R.string.common_number_days_capital, new Object[]{Integer.valueOf(num7.intValue())}, o0Var);
                                String strQ24 = y.Q(o0Var, R.string.annual_report_achievement_personal_record_walk_longest_goal_streak);
                                h4.r.a aVar22 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                o0 o0Var14 = o0Var;
                                l72.l.e(strQ24, null, strP, null, null, null, c2.l.C(aVar22, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), null, false, null, o0Var14, 0, 954);
                                o0Var = o0Var14;
                                Unit unit19 = Unit.INSTANCE;
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                            pVar8 = pVar8;
                            pVar2 = pVar2;
                            pVar = pVar;
                            break;
                        case 17:
                            o0Var.C(-2122682228);
                            aVar4 = aVar;
                            num8 = aVar4.f180505q;
                            if (num8 == null) {
                                o0Var.C(-2122682229);
                                o0Var.g0(z14);
                            } else {
                                o0Var.C(-2122682228);
                                int iIntValue11 = num8.intValue();
                                l3.f23124b.getClass();
                                String str16 = l3.f23131i.format(Integer.valueOf(iIntValue11));
                                String strQ25 = y.Q(o0Var, R.string.personal_records_label_steps_best_day);
                                h4.r.a aVar23 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                o0 o0Var15 = o0Var;
                                l72.l.e(strQ25, null, str16, null, null, null, c2.l.C(aVar23, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), null, false, null, o0Var15, 0, 954);
                                o0Var = o0Var15;
                                Unit unit20 = Unit.INSTANCE;
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                            pVar8 = pVar8;
                            pVar2 = pVar2;
                            pVar = pVar;
                            break;
                        default:
                            o0Var.C(-2122189483);
                            o0Var.g0(z14);
                            Unit unit21 = Unit.INSTANCE;
                            context3 = context3;
                            pVar8 = pVar8;
                            pVar2 = pVar2;
                            pVar = pVar;
                            break;
                    }
                    pVar = pVar;
                    pVar2 = pVar2;
                    pVar8 = pVar8;
                    context3 = context3;
                    z14 = false;
                }
                aVar5 = aVar;
                o0Var.f();
                o0Var.y();
                o0Var.y();
                x1 x1Var2 = p3.n.f135158a;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            String strQ26 = y.Q(o0VarE, uv1.d.f172954r.f172956a);
            d92.b.f58624b.getClass();
            x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            h4.r rVarB2 = b0Var2.b(aVar6, aVar8);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar3 = j92.b.f97899b;
            h4.r rVarA4 = c2.l.A(rVarB2, eVar3.f97920e, 0.0f, 2);
            bVar3.getClass();
            aVar3 = aVar2;
            pVar = pVar6;
            map = map3;
            pVar2 = pVar5;
            z14 = false;
            mh.c(strQ26, c2.l.C(rVarA4, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            h4.r rVarE3 = u1.n.e(x2.f(aVar6, 1.0f), d92.b.a(o0Var).c().b(), aVar7);
            bVar3.getClass();
            h4.r rVarY2 = c2.l.y(rVarE3, eVar3.f97920e);
            zVarA = c2.y.a(kVar, aVar8, o0Var, 0);
            iHashCode = Long.hashCode(o0Var.getU());
            i2VarA0 = o0Var.a0();
            rVarC = h4.k.c(rVarY2, o0Var);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            b4.c(eVar, zVarA, o0Var);
            b4.c(c1623g, i2VarA0, o0Var);
            if (o0Var.T) {
                v.h.A(iHashCode, o0Var, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0Var, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0Var);
            o0Var.C(1275741887);
            it = list.iterator();
            while (it.hasNext()) {
                switch (a.f154734a[((uv1.a) it.next()).ordinal()]) {
                    case 1:
                        context3 = context3;
                        pVar2 = pVar2;
                        pVar = pVar;
                        o0Var.C(-2137079124);
                        if (pVar8 != null) {
                            o0Var.C(-2137019263);
                            String strQ27 = y.Q(o0Var, R.string.lbl_fitness_age);
                            String strA2 = pVar8.a();
                            String strQ28 = y.Q(o0Var, R.string.lbl_starting);
                            pVar8 = pVar8;
                            String str17 = pVar8.f128595b;
                            String strQ29 = y.Q(o0Var, R.string.lbl_stamina_ending_potential_abr);
                            h4.r.a aVar110 = h4.r.S;
                            d92.b.f58623a.getClass();
                            o0 o0Var16 = o0Var;
                            l72.l.e(strQ27, null, strA2, strQ28, str17, strQ29, c2.l.A(aVar110, 0.0f, d92.b.b().b().getF97918c(), 1), null, false, null, o0Var16, 48, 896);
                            o0Var = o0Var16;
                            o0Var.f();
                        } else {
                            pVar8 = pVar8;
                            o0Var.C(-2136383081);
                            o0Var.f();
                        }
                        o0Var.f();
                        Unit unit22 = Unit.INSTANCE;
                        break;
                    case 2:
                        context3 = context3;
                        Map<Long, yw1.i> map6 = map;
                        o0Var.C(-2136265312);
                        if (num10 != null) {
                            o0Var.C(-2136199685);
                            String str18 = num10 + StringUtils.SPACE + y.Q(o0Var, R.string.common_min_abbreviated_without_period);
                            b92.a.C0235a c0235a10 = new b92.a.C0235a(null, 1, null);
                            c0235a10.a("merge", y.Q(o0Var, R.string.highest_vigorous_minutes) + ", " + num10 + " , " + y.Q(o0Var, R.string.lbl_time_unit_minutes));
                            b92.a aVarB10 = c0235a10.b();
                            String strQ30 = y.Q(o0Var, R.string.highest_vigorous_minutes);
                            h4.r.a aVar111 = h4.r.S;
                            d92.b.f58623a.getClass();
                            h4.r rVarA5 = c2.l.A(aVar111, 0.0f, d92.b.b().b().getF97918c(), 1);
                            int i110 = b92.a.f16960b;
                            o0 o0Var17 = o0Var;
                            l72.l.e(strQ30, null, str18, null, null, null, rVarA5, aVarB10, false, null, o0Var17, 0, 826);
                            o0Var = o0Var17;
                            o0Var.f();
                        } else {
                            o0Var.C(-2135250217);
                            o0Var.f();
                        }
                        o0Var.f();
                        Unit unit23 = Unit.INSTANCE;
                        map = map6;
                        break;
                    case 3:
                        Context context7 = context3;
                        Map<Long, yw1.i> map7 = map;
                        pVar2 = pVar2;
                        pVar = pVar;
                        o0Var.C(-2135132851);
                        if (num9 != null) {
                            o0Var.C(-2135071068);
                            l3.f23124b.getClass();
                            String str19 = l3.f23131i.format(num9);
                            String lowerCase2 = y.Q(o0Var, R.string.calories_abbreviation).toLowerCase(Locale.ROOT);
                            String strC2 = zl.a.c(lowerCase2, str19, StringUtils.SPACE, lowerCase2);
                            b92.a.C0235a c0235a11 = new b92.a.C0235a(null, 1, null);
                            c0235a11.a("merge", androidx.room.a0.j("stringResource(R.string.highest_calorie_burn), ", str19, " ,", y.Q(o0Var, R.string.steps_steps_calories)));
                            b92.a aVarB11 = c0235a11.b();
                            String strQ31 = y.Q(o0Var, R.string.highest_calorie_burn);
                            h4.r.a aVar112 = h4.r.S;
                            d92.b.f58623a.getClass();
                            h4.r rVarA6 = c2.l.A(aVar112, 0.0f, d92.b.b().b().getF97918c(), 1);
                            int i111 = b92.a.f16960b;
                            o0 o0Var18 = o0Var;
                            z15 = false;
                            l72.l.e(strQ31, null, strC2, null, null, null, rVarA6, aVarB11, false, null, o0Var18, 0, 826);
                            o0Var = o0Var18;
                            o0Var.f();
                        } else {
                            z15 = false;
                            o0Var.C(-2134037993);
                            o0Var.f();
                        }
                        o0Var.f();
                        Unit unit24 = Unit.INSTANCE;
                        map = map7;
                        context3 = context7;
                        break;
                    case 4:
                        Context context8 = context3;
                        o0Var.C(-1869952626);
                        if (map != null) {
                            map2 = map;
                            o0Var.C(-2133799913);
                            o0Var.f();
                        } else {
                            map2 = map;
                            o0Var.C(-2133799913);
                            o0Var.f();
                        }
                        o0Var.f();
                        Unit unit25 = Unit.INSTANCE;
                        map = map2;
                        context3 = context8;
                        break;
                    case 5:
                        Context context9 = context3;
                        pVar = pVar;
                        o0Var.C(-2133730008);
                        if (pVar2 != null) {
                            o0Var.C(-2133673991);
                            pVar2 = pVar2;
                            num = pVar2.f128594a;
                            num2 = pVar2.f128595b;
                            String strQ32 = y.Q(o0Var, R.string.vo2_max_ftnscoach);
                            if (num != null) {
                                strValueOf = strQ2;
                            } else {
                                strValueOf = strQ2;
                            }
                            String strQ110 = y.Q(o0Var, R.string.lbl_starting);
                            if (num2 != null) {
                                str = strQ2;
                            } else {
                                str = strQ2;
                            }
                            String strQ111 = y.Q(o0Var, R.string.lbl_stamina_ending_potential_abr);
                            h4.r.a aVar113 = h4.r.S;
                            d92.b.f58623a.getClass();
                            o0 o0Var19 = o0Var;
                            l72.l.e(strQ32, null, strValueOf, strQ110, str, strQ111, c2.l.C(aVar113, 0.0f, d92.b.b().b().getF97918c(), 0.0f, 0.0f, 13), null, false, null, o0Var19, 0, 898);
                            o0Var = o0Var19;
                            o0Var.f();
                        } else {
                            pVar2 = pVar2;
                            o0Var.C(-2132999369);
                            o0Var.f();
                        }
                        o0Var.f();
                        Unit unit26 = Unit.INSTANCE;
                        context3 = context9;
                        break;
                    case 6:
                        pVar = pVar;
                        o0Var.C(-2132822824);
                        if (pVar == null) {
                            o0Var.C(-2132822825);
                            o0Var.f();
                            context = context3;
                        } else {
                            o0Var.C(-2132822824);
                            context = context3;
                            String strP1 = l3.f23124b.p0(pVar.a().intValue(), context);
                            b92.a.C0235a c0235a12 = new b92.a.C0235a(null, 1, null);
                            if (mg0.b.c()) {
                                o0Var.C(-1787276019);
                                strQ = y.Q(o0Var, R.string.lbl_minutes_per_kilometer);
                                o0Var.f();
                            } else {
                                o0Var.C(-1787138565);
                                strQ = y.Q(o0Var, R.string.lbl_minutes_per_mile);
                                o0Var.f();
                            }
                            c0235a12.a("merge", strP1 + "," + strQ);
                            b92.a aVarB12 = c0235a12.b();
                            String strQ112 = y.Q(o0Var, R.string.fastest_average_pace);
                            String strG2 = e5.g(strP1, StringUtils.SPACE, y.Q(o0Var, pVar.f128595b.intValue()));
                            h4.r.a aVar114 = h4.r.S;
                            d92.b.f58623a.getClass();
                            h4.r rVarC10 = c2.l.C(aVar114, 0.0f, d92.b.b().b().getF97918c(), 0.0f, 0.0f, 13);
                            int i112 = b92.a.f16960b;
                            o0 o0Var20 = o0Var;
                            l72.l.e(strQ112, null, strG2, null, null, null, rVarC10, aVarB12, false, null, o0Var20, 0, 826);
                            o0Var = o0Var20;
                            Unit unit27 = Unit.INSTANCE;
                            o0Var.f();
                        }
                        o0Var.f();
                        context3 = context;
                        pVar2 = pVar2;
                        break;
                    case 7:
                        pVar = pVar;
                        o0Var.C(-2131572811);
                        if (og2.k.x(aVar, 7)) {
                            o0Var.C(-1869868463);
                            uVar = aVar.f180495g;
                            if (uVar == null) {
                                o0Var.C(-2131347504);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(-2131347503);
                                double dDoubleValue5 = uVar.f128605a.doubleValue();
                                int iIntValue12 = uVar.f128606b.intValue();
                                int iIntValue13 = uVar.f128607c.intValue();
                                b92.a.C0235a c0235a13 = new b92.a.C0235a(null, 1, null);
                                c0235a13.f16962a.put("merge", dDoubleValue5 + " , " + y.Q(o0Var, iIntValue13));
                                b92.a aVarB13 = c0235a13.b();
                                String strQ113 = y.Q(o0Var, R.string.personal_records_label_farthest_run);
                                String str20 = dDoubleValue5 + StringUtils.SPACE + y.Q(o0Var, iIntValue12);
                                h4.r.a aVar115 = h4.r.S;
                                d92.b.f58623a.getClass();
                                h4.r rVarC11 = c2.l.C(aVar115, 0.0f, d92.b.f58625c.b().getF97918c(), 0.0f, 0.0f, 13);
                                int i113 = b92.a.f16960b;
                                o0 o0Var21 = o0Var;
                                l72.l.e(strQ113, null, str20, null, null, null, rVarC11, aVarB13, false, null, o0Var21, 0, 826);
                                o0Var = o0Var21;
                                Unit unit28 = Unit.INSTANCE;
                                o0Var.f();
                            }
                            o0Var.f();
                        } else {
                            o0Var.C(-2130547145);
                            o0Var.f();
                        }
                        o0Var.f();
                        Unit unit29 = Unit.INSTANCE;
                        context3 = context3;
                        pVar2 = pVar2;
                        break;
                    case 8:
                        o0Var.C(-2130432693);
                        pVar3 = aVar.f180499k;
                        if (pVar3 == null) {
                            o0Var.C(-2130432694);
                            o0Var.g0(z14);
                        } else {
                            o0Var.C(-2130432693);
                            g(pVar3, o0Var, z14 ? 1 : 0);
                            Unit unit30 = Unit.INSTANCE;
                            o0Var.g0(z14);
                        }
                        o0Var.g0(z14);
                        context3 = context3;
                        pVar = pVar;
                        pVar2 = pVar2;
                        break;
                    case 9:
                        o0Var.C(-2130220188);
                        uVar2 = aVar.f180500l;
                        if (uVar2 == null) {
                            o0Var.C(-2130220189);
                            o0Var.g0(z14);
                        } else {
                            o0Var.C(-2130220188);
                            num3 = uVar2.f128605a;
                            num4 = uVar2.f128606b;
                            iIntValue = uVar2.f128607c.intValue();
                            if (p005kotlin.jvm.internal.s.g(num3, num4)) {
                                o0Var.C(-1268767462);
                                String strQ114 = y.Q(o0Var, R.string.lactate_threshold_hr);
                                if (num3 == null) {
                                    o0Var.C(-1268607069);
                                    o0Var.g0(false);
                                    z16 = false;
                                    str2 = null;
                                } else {
                                    o0Var.C(-1268607068);
                                    str2 = num3.intValue() + StringUtils.SPACE + y.Q(o0Var, iIntValue);
                                    z16 = false;
                                    o0Var.g0(false);
                                }
                                if (str2 == null) {
                                    str2 = strQ2;
                                }
                                String strQ115 = y.Q(o0Var, R.string.lbl_starting);
                                if (num4 == null) {
                                    o0Var.C(-1268400733);
                                    o0Var.g0(z16);
                                    str3 = null;
                                } else {
                                    o0Var.C(-1268400732);
                                    str3 = num4.intValue() + StringUtils.SPACE + y.Q(o0Var, iIntValue);
                                    o0Var.g0(false);
                                }
                                if (str3 == null) {
                                    str4 = strQ2;
                                } else {
                                    str4 = str3;
                                }
                                String strQ116 = y.Q(o0Var, R.string.lbl_stamina_ending_potential_abr);
                                h4.r.a aVar116 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                o0 o0Var22 = o0Var;
                                l72.l.e(strQ114, null, str2, strQ115, str4, strQ116, c2.l.C(aVar116, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), null, false, null, o0Var22, 0, 898);
                                o0Var = o0Var22;
                                z14 = false;
                                o0Var.g0(false);
                            } else {
                                z14 = false;
                                o0Var.C(-1268071698);
                                o0Var.g0(false);
                            }
                            Unit unit110 = Unit.INSTANCE;
                            o0Var.g0(z14);
                        }
                        o0Var.g0(z14);
                        context3 = context3;
                        pVar = pVar;
                        pVar2 = pVar2;
                        break;
                    case 10:
                        o0Var.C(-2129170962);
                        uVar3 = aVar.f180501m;
                        if (uVar3 == null) {
                            o0Var.C(-2129170963);
                            o0Var.g0(z14);
                        } else {
                            o0Var.C(-2129170962);
                            num5 = uVar3.f128605a;
                            num6 = uVar3.f128606b;
                            iIntValue2 = uVar3.f128607c.intValue();
                            if (p005kotlin.jvm.internal.s.g(num5, num6)) {
                                o0Var.C(-1046821743);
                                String strQ117 = y.Q(o0Var, iIntValue2);
                                if (num5 == null) {
                                    num5 = strQ2;
                                }
                                if (num6 == null) {
                                    num6 = strQ2;
                                }
                                b92.a.C0235a c0235a14 = new b92.a.C0235a(null, 1, null);
                                String str21 = num5 + "," + y.Q(o0Var, R.string.common_watts);
                                LinkedHashMap linkedHashMap2 = c0235a14.f16962a;
                                linkedHashMap2.put("value", str21);
                                linkedHashMap2.put("value_2", num6 + "," + y.Q(o0Var, R.string.common_watts));
                                String strQ118 = y.Q(o0Var, R.string.device_settings_functional_threshold_power);
                                String str110 = num5 + StringUtils.SPACE + strQ117;
                                String strQ119 = y.Q(o0Var, R.string.lbl_starting);
                                String str111 = num6 + StringUtils.SPACE + strQ117;
                                String strQ210 = y.Q(o0Var, R.string.lbl_stamina_ending_potential_abr);
                                b92.a aVarB14 = c0235a14.b();
                                h4.r.a aVar117 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC12 = c2.l.C(aVar117, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                                int i29 = b92.a.f16960b;
                                o0 o0Var23 = o0Var;
                                l72.l.e(strQ118, null, str110, strQ119, str111, strQ210, rVarC12, aVarB14, false, null, o0Var23, 0, 770);
                                o0Var = o0Var23;
                                z14 = false;
                                o0Var.g0(false);
                            } else {
                                o0Var.C(-1045439825);
                                o0Var.g0(z14);
                            }
                            Unit unit111 = Unit.INSTANCE;
                            o0Var.g0(z14);
                        }
                        o0Var.g0(z14);
                        context3 = context3;
                        pVar = pVar;
                        pVar2 = pVar2;
                        break;
                    case 11:
                        o0Var.C(-2127462738);
                        if (pVar == null) {
                            o0Var.C(-2127462739);
                            o0Var.g0(z14);
                            pVar4 = pVar;
                        } else {
                            pVar4 = pVar;
                            Integer num12 = pVar4.f128594a;
                            o0Var.C(-2127462738);
                            b92.a.C0235a c0235a15 = new b92.a.C0235a(null, 1, null);
                            c0235a15.f16962a.put("value", num12 + "," + y.Q(o0Var, R.string.common_watts));
                            String strQ211 = y.Q(o0Var, R.string.highest_average_power);
                            String str112 = num12 + StringUtils.SPACE + y.Q(o0Var, pVar4.f128595b.intValue());
                            b92.a aVarB15 = c0235a15.b();
                            h4.r.a aVar118 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarC13 = c2.l.C(aVar118, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                            int i210 = b92.a.f16960b;
                            o0 o0Var110 = o0Var;
                            l72.l.e(strQ211, null, str112, null, null, null, rVarC13, aVarB15, false, null, o0Var110, 0, 826);
                            o0Var = o0Var110;
                            Unit unit112 = Unit.INSTANCE;
                            o0Var.g0(z14);
                        }
                        o0Var.g0(z14);
                        context3 = context3;
                        pVar = pVar4;
                        pVar8 = pVar8;
                        pVar2 = pVar2;
                        break;
                    case 12:
                        aVar4 = aVar;
                        z17 = true;
                        o0Var.C(-2126694031);
                        if (og2.k.x(aVar4, 8)) {
                            o0Var.C(-1869711021);
                            uVar4 = aVar4.f180494f;
                            if (uVar4 == null) {
                                o0Var.C(-2126466802);
                                o0Var.g0(z14);
                            } else {
                                o0Var.C(-2126466801);
                                double dDoubleValue6 = uVar4.f128605a.doubleValue();
                                int iIntValue14 = uVar4.f128606b.intValue();
                                int iIntValue15 = uVar4.f128607c.intValue();
                                b92.a.C0235a c0235a16 = new b92.a.C0235a(null, 1, null);
                                c0235a16.f16962a.put("merge", dDoubleValue6 + " , " + y.Q(o0Var, iIntValue15));
                                b92.a aVarB16 = c0235a16.b();
                                String strQ212 = y.Q(o0Var, R.string.personal_records_label_farthest_cycle);
                                String str113 = dDoubleValue6 + StringUtils.SPACE + y.Q(o0Var, iIntValue14);
                                h4.r.a aVar119 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC14 = c2.l.C(aVar119, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                                int i211 = b92.a.f16960b;
                                o0 o0Var111 = o0Var;
                                l72.l.e(strQ212, null, str113, null, null, null, rVarC14, aVarB16, false, null, o0Var111, 0, 826);
                                o0Var = o0Var111;
                                Unit unit113 = Unit.INSTANCE;
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                        } else {
                            o0Var.C(-2125664521);
                            o0Var.g0(z14);
                        }
                        o0Var.g0(z14);
                        Unit unit114 = Unit.INSTANCE;
                        pVar8 = pVar8;
                        pVar2 = pVar2;
                        pVar = pVar;
                        break;
                    case 13:
                        aVar4 = aVar;
                        z17 = true;
                        o0Var.C(-2125550162);
                        if (og2.k.x(aVar4, 17)) {
                            o0Var.C(-1869674122);
                            uVar5 = aVar4.f180496h;
                            if (uVar5 == null) {
                                o0Var.C(-2125322933);
                                o0Var.g0(z14);
                            } else {
                                o0Var.C(-2125322932);
                                double dDoubleValue7 = uVar5.f128605a.doubleValue();
                                int iIntValue16 = uVar5.f128606b.intValue();
                                int iIntValue17 = uVar5.f128607c.intValue();
                                b92.a.C0235a c0235a17 = new b92.a.C0235a(null, 1, null);
                                c0235a17.f16962a.put("merge", dDoubleValue7 + " , " + y.Q(o0Var, iIntValue17));
                                b92.a aVarB17 = c0235a17.b();
                                String strQ213 = y.Q(o0Var, R.string.personal_records_label_longest_poolswim);
                                String str114 = dDoubleValue7 + StringUtils.SPACE + y.Q(o0Var, iIntValue16);
                                h4.r.a aVar24 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC15 = c2.l.C(aVar24, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                                int i212 = b92.a.f16960b;
                                o0 o0Var112 = o0Var;
                                l72.l.e(strQ213, null, str114, null, null, null, rVarC15, aVarB17, false, null, o0Var112, 0, 826);
                                o0Var = o0Var112;
                                Unit unit115 = Unit.INSTANCE;
                                o0Var.g0(z14);
                            }
                            o0Var.g0(z14);
                        } else {
                            o0Var.C(-2124517769);
                            o0Var.g0(z14);
                        }
                        o0Var.g0(z14);
                        Unit unit116 = Unit.INSTANCE;
                        pVar8 = pVar8;
                        pVar2 = pVar2;
                        pVar = pVar;
                        break;
                    case 14:
                        aVar4 = aVar;
                        z17 = true;
                        o0Var.C(-2124404402);
                        uVar6 = aVar4.f180502n;
                        if (uVar6 == null) {
                            o0Var.C(-2124404403);
                            o0Var.g0(z14);
                        } else {
                            o0Var.C(-2124404402);
                            a(uVar6, o0Var, z14 ? 1 : 0);
                            Unit unit117 = Unit.INSTANCE;
                            o0Var.g0(z14);
                        }
                        o0Var.g0(z14);
                        pVar8 = pVar8;
                        pVar2 = pVar2;
                        pVar = pVar;
                        break;
                    case 15:
                        aVar4 = aVar;
                        o0Var.C(-2124188952);
                        uVar7 = aVar4.f180503o;
                        if (uVar7 == null) {
                            o0Var.C(-2124188953);
                            o0Var.g0(z14);
                            z17 = true;
                        } else {
                            o0Var.C(-2124188952);
                            double dDoubleValue8 = uVar7.f128605a.doubleValue();
                            int iIntValue18 = uVar7.f128606b.intValue();
                            int iIntValue19 = uVar7.f128607c.intValue();
                            b92.a.C0235a c0235a18 = new b92.a.C0235a(null, 1, null);
                            c0235a18.f16962a.put("merge", dDoubleValue8 + " , " + y.Q(o0Var, iIntValue19));
                            b92.a aVarB18 = c0235a18.b();
                            c22.x0.f23314a.getClass();
                            String strW2 = gl1.d.W(c22.x0.Lb);
                            String str115 = dDoubleValue8 + StringUtils.SPACE + y.Q(o0Var, iIntValue18);
                            h4.r.a aVar25 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarC16 = c2.l.C(aVar25, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                            int i213 = b92.a.f16960b;
                            o0 o0Var113 = o0Var;
                            z17 = true;
                            l72.l.e(strW2, null, str115, null, null, null, rVarC16, aVarB18, false, null, o0Var113, 0, 826);
                            o0Var = o0Var113;
                            Unit unit118 = Unit.INSTANCE;
                            o0Var.g0(z14);
                        }
                        o0Var.g0(z14);
                        pVar8 = pVar8;
                        pVar2 = pVar2;
                        pVar = pVar;
                        break;
                    case 16:
                        aVar4 = aVar;
                        o0Var.C(-2123306072);
                        num7 = aVar4.f180504p;
                        if (num7 == null) {
                            o0Var.C(-2123306073);
                            o0Var.g0(z14);
                        } else {
                            o0Var.C(-2123306072);
                            String strP2 = y.P(R.string.common_number_days_capital, new Object[]{Integer.valueOf(num7.intValue())}, o0Var);
                            String strQ214 = y.Q(o0Var, R.string.annual_report_achievement_personal_record_walk_longest_goal_streak);
                            h4.r.a aVar26 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            o0 o0Var114 = o0Var;
                            l72.l.e(strQ214, null, strP2, null, null, null, c2.l.C(aVar26, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), null, false, null, o0Var114, 0, 954);
                            o0Var = o0Var114;
                            Unit unit119 = Unit.INSTANCE;
                            o0Var.g0(z14);
                        }
                        o0Var.g0(z14);
                        pVar8 = pVar8;
                        pVar2 = pVar2;
                        pVar = pVar;
                        break;
                    case 17:
                        o0Var.C(-2122682228);
                        aVar4 = aVar;
                        num8 = aVar4.f180505q;
                        if (num8 == null) {
                            o0Var.C(-2122682229);
                            o0Var.g0(z14);
                        } else {
                            o0Var.C(-2122682228);
                            int iIntValue110 = num8.intValue();
                            l3.f23124b.getClass();
                            String str116 = l3.f23131i.format(Integer.valueOf(iIntValue110));
                            String strQ215 = y.Q(o0Var, R.string.personal_records_label_steps_best_day);
                            h4.r.a aVar27 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            o0 o0Var115 = o0Var;
                            l72.l.e(strQ215, null, str116, null, null, null, c2.l.C(aVar27, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), null, false, null, o0Var115, 0, 954);
                            o0Var = o0Var115;
                            Unit unit210 = Unit.INSTANCE;
                            o0Var.g0(z14);
                        }
                        o0Var.g0(z14);
                        pVar8 = pVar8;
                        pVar2 = pVar2;
                        pVar = pVar;
                        break;
                    default:
                        o0Var.C(-2122189483);
                        o0Var.g0(z14);
                        Unit unit211 = Unit.INSTANCE;
                        context3 = context3;
                        pVar8 = pVar8;
                        pVar2 = pVar2;
                        pVar = pVar;
                        break;
                }
                pVar = pVar;
                pVar2 = pVar2;
                pVar8 = pVar8;
                context3 = context3;
                z14 = false;
            }
            aVar5 = aVar;
            o0Var.f();
            o0Var.y();
            o0Var.y();
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f(new pp.g(oVar, list, aVar5, i14, 24));
        }
    }

    public static final void d(String str, String str2, String str3, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-155967746);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            l72.l.c(z3.f.c(-249463440, new c40.i(str, str2, 10), o0VarE), z3.f.c(-1945486799, new j21.p(str3, 19), o0VarE), null, null, false, null, o0VarE, 54, 60);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c81.i(i14, 4, str, str2, str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v22 */
    public static final void e(vt1.o oVar, Map<Long, yw1.i> map, p3.m mVar, int i14) {
        double dDoubleValue;
        yw1.i iVar;
        ?? r14;
        o13.p<String, String> pVarB;
        map.getClass();
        o0 o0VarE = mVar.E(679725002);
        int i15 = (o0VarE.k(oVar == null ? -1 : oVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(map) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            ?? r15 = 0;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(-674730255);
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<Long, yw1.i> entry : map.entrySet()) {
                yw1.i value = entry.getValue();
                if (entry.getKey().longValue() == 15) {
                    o0VarE.C(1269738607);
                    e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, r15, r15, 6, r15);
                    long jLongValue = entry.getKey().longValue();
                    Double d14 = value.f199936e;
                    dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                    iVar = value;
                    r14 = r15;
                    pVarB = new o13.p<>(y.Q(o0VarE, R.string.annual_report_achievement_personal_record_walk_longest_goal_streak), e3Var.b(context, jLongValue, dDoubleValue).f128595b);
                    o0VarE.g0(false);
                } else {
                    ?? r16 = r15;
                    o0VarE.C(1270098765);
                    o0VarE.g0(false);
                    e3 e3Var2 = (e3) KoinJavaComponent.get$default(e3.class, r16, r16, 6, r16);
                    long jLongValue2 = entry.getKey().longValue();
                    Double d15 = value.f199936e;
                    dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                    iVar = value;
                    r14 = r16;
                    pVarB = e3Var2.b(context, jLongValue2, dDoubleValue);
                }
                String str = pVarB.f128594a;
                String str2 = pVarB.f128595b;
                if (str == null) {
                    str = "";
                }
                String str3 = iVar.f199935d;
                context.getClass();
                int i16 = oVar == null ? -1 : yw1.i.c.f199942a[oVar.ordinal()];
                int i17 = R.string.personal_records_lbl_single;
                if (i16 == 1) {
                    z0 z0Var = z0.f4390a;
                    if (z0.b(am.x0.f4324r, str3)) {
                        i17 = R.string.swimming_personal_record;
                    } else if (z0.b(am.x0.f4312o, str3)) {
                        i17 = R.string.cycling_personal_record;
                    } else if (z0.b(am.x0.f4308n, str3)) {
                        i17 = R.string.running_personal_record;
                    }
                }
                String string = context.getString(i17);
                string.getClass();
                if (str2 == null) {
                    str2 = "";
                }
                d(str, string, str2, o0VarE, 0);
                arrayList.add(Unit.INSTANCE);
                r15 = r14;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a1(oVar, map, i14, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(String str, String str2, p3.m mVar, int i14) {
        String str3;
        boolean z14;
        o0 o0VarE = mVar.E(-1092684869);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarF, eVar.f97920e);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            bVar.getClass();
            h4.r rVarC3 = c2.l.C(aVar, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC4, o0VarE);
            u2 u2Var = u2.f22900a;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                z14 = true;
                rVarC3 = u2Var.a(rVarC3, 1.0f, true);
            } else {
                z14 = true;
            }
            h4.r rVar = rVarC3;
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57757g;
            d6.h hVarA = d6.h.a(i16);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new pp.b(p1Var, 16);
                o0VarE.K(objQ2);
            }
            mh.c(str, rVar, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, (e23.l) objQ2, null, o0VarE, i15 & 14, 1572864, 195580);
            s62.a.f157643a.getClass();
            u4.d dVarA = e9.a(t62.b.f162798a);
            bVar.getClass();
            h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97903b);
            gl.c.f77766a.getClass();
            i7.b(dVarA, null, rVarQ, gl.c.a(o0VarE).r(), o0VarE, 48, 0);
            o0VarE.g0(true);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            bVar.getClass();
            float f14 = eVar.f97920e;
            bVar.getClass();
            str3 = str2;
            mh.c(str3, c2.l.C(aVar, 0.0f, eVar.f97917b, f14, 0.0f, 9), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, (i15 >> 3) & 14, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            str3 = str2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.o(str, str3, i14, 29);
        }
    }

    public static final void g(o13.p<Double, Double> pVar, p3.m mVar, int i14) {
        String strD;
        o0 o0VarE = mVar.E(-1729721868);
        int i15 = (o0VarE.B(pVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.txt_empty_page_no_data);
            String strQ2 = y.Q(o0VarE, R.string.symbol_double_dash);
            Double d14 = pVar.f128594a;
            Double d15 = pVar.f128595b;
            l3.a aVar = l3.f23124b;
            double dDoubleValue = d14 != null ? d14.doubleValue() : Double.NaN;
            boolean zC = mg0.b.c();
            String strQ3 = y.Q(o0VarE, R.string.no_value);
            aVar.getClass();
            context.getClass();
            strQ3.getClass();
            String strJ1 = aVar.J1(context, dDoubleValue, false, zC, true, strQ3);
            String strJ2 = aVar.J1(context, d15 != null ? d15.doubleValue() : Double.NaN, false, mg0.b.c(), true, y.Q(o0VarE, R.string.no_value));
            Integer numValueOf = d14 != null ? Integer.valueOf(l3.a.p(d14.doubleValue(), mg0.b.c())) : null;
            Integer numValueOf2 = d15 != null ? Integer.valueOf(l3.a.p(d15.doubleValue(), mg0.b.c())) : null;
            if (strJ1.equals(strQ2)) {
                strD = strQ;
                strJ2 = strJ2;
            } else {
                strD = new oi0.h(context).d(numValueOf != null ? numValueOf.intValue() : 0L, true);
            }
            if (!strJ2.equals(strQ2)) {
                strQ = new oi0.h(context).d(numValueOf2 != null ? numValueOf2.intValue() : 0L, true);
            }
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            String strQ4 = y.Q(o0VarE, R.string.lactate_threshold_pace);
            LinkedHashMap linkedHashMap = c0235a.f16962a;
            linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, strQ4);
            linkedHashMap.put("value", strD);
            linkedHashMap.put("value_secondary", y.Q(o0VarE, R.string.lbl_starting));
            linkedHashMap.put("value_2", strQ);
            linkedHashMap.put("value_2_secondary", y.Q(o0VarE, R.string.lbl_stamina_ending_potential_abr));
            if (p005kotlin.jvm.internal.s.d(d14, d15)) {
                o0VarE.C(875790926);
                o0VarE.g0(false);
            } else {
                o0VarE.C(875368086);
                String strQ5 = y.Q(o0VarE, R.string.lactate_threshold_pace);
                String strQ6 = y.Q(o0VarE, R.string.lbl_starting);
                String strQ7 = y.Q(o0VarE, R.string.lbl_stamina_ending_potential_abr);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                b92.a aVarB = c0235a.b();
                int i16 = b92.a.f16960b;
                l72.l.e(strQ5, null, strJ1, strQ6, strJ2, strQ7, rVarC, aVarB, false, null, o0VarE, 0, 770);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kj2.g(i14, pVar);
        }
    }
}
