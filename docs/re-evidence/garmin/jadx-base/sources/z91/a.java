package z91;

import am.x0;
import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import gg1.o0;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.p;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz91/a;", "", "<init>", "()V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f203130a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<q91.d> f203131b = x.k(q91.d.f143571q, q91.d.f143572r, q91.d.f143570p, q91.d.f143569o);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<q91.d> f203132c = x.k(q91.d.A, q91.d.B, q91.d.C, q91.d.D, q91.d.E, q91.d.F, q91.d.I, q91.d.P, q91.d.T, q91.d.f143578z);

    /* JADX INFO: renamed from: z91.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3789a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f203134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f203135c;

        static {
            int[] iArr = new int[q91.g.values().length];
            try {
                iArr[q91.g.CYCLING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q91.g.SWIMMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q91.g.PUSHES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q91.g.STEPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q91.g.RUNNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q91.g.TRAINING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q91.g.PARASPORTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f203133a = iArr;
            int[] iArr2 = new int[q91.d.values().length];
            try {
                iArr2[q91.d.f143568n.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[q91.d.T0.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[q91.d.f143569o.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[q91.d.f143570p.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[q91.d.f143571q.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[q91.d.f143578z.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[q91.d.f143561h.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[q91.d.f143562i.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[q91.d.f143563j.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[q91.d.f143564k.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[q91.d.f143566l.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[q91.d.f143567m.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[q91.d.N0.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[q91.d.O0.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[q91.d.P0.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[q91.d.Q0.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[q91.d.R0.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[q91.d.S0.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[q91.d.f143572r.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[q91.d.A.ordinal()] = 20;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[q91.d.B.ordinal()] = 21;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[q91.d.C.ordinal()] = 22;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[q91.d.D.ordinal()] = 23;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[q91.d.E.ordinal()] = 24;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[q91.d.F.ordinal()] = 25;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[q91.d.I.ordinal()] = 26;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[q91.d.P.ordinal()] = 27;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[q91.d.T.ordinal()] = 28;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[q91.d.X.ordinal()] = 29;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[q91.d.Y.ordinal()] = 30;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[q91.d.Z.ordinal()] = 31;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[q91.d.f143565k0.ordinal()] = 32;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[q91.d.H0.ordinal()] = 33;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[q91.d.U0.ordinal()] = 34;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[q91.d.X0.ordinal()] = 35;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[q91.d.W0.ordinal()] = 36;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[q91.d.V0.ordinal()] = 37;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[q91.d.Z0.ordinal()] = 38;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[q91.d.f143555a1.ordinal()] = 39;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[q91.d.Y0.ordinal()] = 40;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[q91.d.f143573t.ordinal()] = 41;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr2[q91.d.f143574v.ordinal()] = 42;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr2[q91.d.f143575w.ordinal()] = 43;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr2[q91.d.f143577y.ordinal()] = 44;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr2[q91.d.f143576x.ordinal()] = 45;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr2[q91.d.I0.ordinal()] = 46;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr2[q91.d.J0.ordinal()] = 47;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr2[q91.d.K0.ordinal()] = 48;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr2[q91.d.M0.ordinal()] = 49;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr2[q91.d.L0.ordinal()] = 50;
            } catch (NoSuchFieldError unused57) {
            }
            f203134b = iArr2;
            int[] iArr3 = new int[q91.a.values().length];
            try {
                iArr3[q91.a.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr3[q91.a.ASCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr3[q91.a.POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr3[q91.a.SWIMMING_DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr3[q91.a.TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr3[q91.a.WEIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused63) {
            }
            f203135c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            n91.a aVar = (n91.a) t14;
            Long prStartTimeGmt = aVar.getPrStartTimeGmt();
            if (prStartTimeGmt == null) {
                prStartTimeGmt = aVar.getActivityStartDateTimeInGMT();
            }
            n91.a aVar2 = (n91.a) t7;
            Long prStartTimeGmt2 = aVar2.getPrStartTimeGmt();
            if (prStartTimeGmt2 == null) {
                prStartTimeGmt2 = aVar2.getActivityStartDateTimeInGMT();
            }
            return r13.a.b(prStartTimeGmt, prStartTimeGmt2);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Boolean.valueOf(((n91.a) t14).s()), Boolean.valueOf(((n91.a) t7).s()));
        }
    }

    private a() {
    }

    public static String a(pi0.e eVar, long j8, DateTimeZone dateTimeZone) {
        LocalDateTime localDateTime = new LocalDateTime(j8, dateTimeZone);
        qi0.a aVar = qi0.a.YEAR_ABBREV_MONTH_DAY;
        aVar.getClass();
        return eVar.a(g22.k.r(localDateTime), aVar);
    }

    public static String b(Context context, n91.a aVar) {
        Long activityStartDateTimeLocal = aVar != null ? aVar.getActivityStartDateTimeLocal() : null;
        Long activityStartDateTimeInGMT = aVar != null ? aVar.getActivityStartDateTimeInGMT() : null;
        Long prStartTimeLocal = aVar != null ? aVar.getPrStartTimeLocal() : null;
        Long prStartTimeGmt = aVar != null ? aVar.getPrStartTimeGmt() : null;
        pi0.e eVar = new pi0.e(context);
        if (aVar != null) {
            if (prStartTimeLocal != null && prStartTimeLocal.longValue() != 0) {
                long jLongValue = prStartTimeLocal.longValue();
                DateTimeZone dateTimeZone = DateTimeZone.UTC;
                dateTimeZone.getClass();
                return a(eVar, jLongValue, dateTimeZone);
            }
            if (activityStartDateTimeLocal != null && activityStartDateTimeLocal.longValue() != 0) {
                long jLongValue2 = activityStartDateTimeLocal.longValue();
                DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                dateTimeZone2.getClass();
                return a(eVar, jLongValue2, dateTimeZone2);
            }
            if (prStartTimeGmt != null && prStartTimeGmt.longValue() != 0) {
                long jLongValue3 = prStartTimeGmt.longValue();
                DateTimeZone dateTimeZone3 = DateTimeZone.getDefault();
                dateTimeZone3.getClass();
                return a(eVar, jLongValue3, dateTimeZone3);
            }
            if (activityStartDateTimeInGMT != null && activityStartDateTimeInGMT.longValue() != 0) {
                long jLongValue4 = activityStartDateTimeInGMT.longValue();
                DateTimeZone dateTimeZone4 = DateTimeZone.getDefault();
                dateTimeZone4.getClass();
                return a(eVar, jLongValue4, dateTimeZone4);
            }
        }
        return null;
    }

    public static String c(Context context, long j8, com.garmin.android.apps.connectmobile.repcounting.model.f fVar) {
        context.getClass();
        return d(new l22.a(context), j8, fVar);
    }

    public static String d(l22.b bVar, long j8, com.garmin.android.apps.connectmobile.repcounting.model.f fVar) {
        q91.f fVar2 = q91.f.f143585a;
        q91.d.a aVar = q91.d.f143558e;
        Long lValueOf = Long.valueOf(j8);
        fVar2.getClass();
        q91.d dVarA = q91.f.a(aVar, lValueOf);
        if (dVarA == null) {
            return null;
        }
        switch (C3789a.f203134b[dVarA.ordinal()]) {
            case 1:
                return bVar.getString(R.string.personal_records_label_farthest_run);
            case 2:
                return bVar.getString(R.string.lbl_personal_records_longest_push);
            case 3:
                return bVar.getString(R.string.personal_records_label_farthest_cycle);
            case 4:
                return bVar.getString(R.string.lbl_total_ascent);
            case 5:
                return bVar.getString(R.string.personal_records_label_max_power_abv);
            case 6:
                return bVar.getString(R.string.personal_records_label_longest_poolswim);
            case 7:
            case 13:
                return bVar.getString(R.string.personal_records_label_1k_run);
            case 8:
            case 14:
                return bVar.getString(R.string.personal_records_label_1mile_run);
            case 9:
            case 15:
                return bVar.getString(R.string.personal_records_label_5k_run);
            case 10:
            case 16:
                return bVar.getString(R.string.personal_records_label_10k_run);
            case 11:
            case 17:
                return bVar.getString(R.string.personal_records_label_half_marathon);
            case 12:
            case 18:
                return bVar.getString(R.string.personal_records_label_full_marathon);
            case 19:
                return bVar.getString(R.string.personal_records_label_40k_cycle);
            case 20:
            case 22:
            case 24:
            case 25:
            case 27:
                l3.a aVar2 = l3.f23124b;
                double d14 = dVarA.f143582d;
                m3 m3Var = m3.METER;
                aVar2.getClass();
                return l3.a.R(bVar, d14, m3Var, l3.f23131i, true, null);
            case 21:
            case 23:
            case 26:
            case 28:
                l3.a aVar3 = l3.f23124b;
                double d15 = dVarA.f143582d;
                m3 m3Var2 = m3.YARD;
                aVar3.getClass();
                return l3.a.R(bVar, d15, m3Var2, l3.f23131i, true, null);
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                return q91.e.a(dVarA, fVar);
            case 41:
                return bVar.getString(R.string.personal_records_label_steps_best_day);
            case 42:
                return bVar.getString(R.string.personal_records_label_steps_best_week);
            case 43:
                return bVar.getString(R.string.personal_records_label_steps_best_month);
            case 44:
            case 49:
                return bVar.getString(R.string.personal_records_label_steps_current_streak);
            case 45:
            case 50:
                return bVar.getString(R.string.personal_records_label_steps_longest_streak);
            case 46:
                return bVar.getString(R.string.lbl_most_pushes_day);
            case 47:
                return bVar.getString(R.string.lbl_most_pushes_week);
            case 48:
                return bVar.getString(R.string.lbl_most_pushes_month);
            default:
                u0.r();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    public static String e(Context context, q91.d dVar, String str) {
        context.getClass();
        dVar.getClass();
        oi0.b bVar = new oi0.b(new l22.a(context), str);
        int i14 = C3789a.f203134b[dVar.ordinal()];
        if (i14 == 5) {
            oi0.c.A(context, new z81.b(1), context.getString(R.string.personal_records_max_avg_power_accessibility));
        } else if (i14 == 7) {
            bVar.r();
        } else if (i14 == 8) {
            bVar.A();
        } else if (i14 == 13) {
            bVar.r();
        } else if (i14 != 14) {
            switch (i14) {
                case 19:
                    bVar.s();
                    break;
                case 20:
                case 22:
                case 24:
                case 25:
                case 27:
                    bVar.y();
                    break;
                case 21:
                case 23:
                case 26:
                case 28:
                    bVar.b0();
                    break;
                default:
                    Unit unit = Unit.INSTANCE;
                    break;
            }
        } else {
            bVar.A();
        }
        return bVar.f132238b;
    }

    public static final String f(Context context, q91.d dVar, double d14, boolean z14, boolean z15, o0 o0Var) {
        context.getClass();
        o0Var.getClass();
        if (dVar == null) {
            return null;
        }
        switch (C3789a.f203134b[dVar.ordinal()]) {
            case 1:
            case 2:
                l3.a aVar = l3.f23124b;
                m3 m3Var = z15 ? m3.KILOMETER : m3.MILE;
                DecimalFormat decimalFormat = l3.f23125c;
                aVar.getClass();
                return l3.a.O(context, d14, m3Var, decimalFormat, z14);
            case 3:
                l3.a aVar2 = l3.f23124b;
                m3 m3Var2 = z15 ? m3.KILOMETER : m3.MILE;
                DecimalFormat decimalFormat2 = l3.f23125c;
                aVar2.getClass();
                return l3.a.O(context, d14, m3Var2, decimalFormat2, z14);
            case 4:
                l3.f23124b.getClass();
                return l3.a.a0(context, d14, o0Var, z14, false);
            case 5:
                return l3.a.F0(l3.f23124b, context, d14, z14);
            case 6:
                l3.a aVar3 = l3.f23124b;
                m3 m3Var3 = z15 ? m3.METER : m3.YARD;
                aVar3.getClass();
                return l3.a.O(context, d14, m3Var3, l3.f23131i, z14);
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                l3.a aVar4 = l3.f23124b;
                long jD = MathKt.d(d14);
                aVar4.getClass();
                return l3.a.e1(jD);
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                l3.f23124b.getClass();
                double dP1 = z15 ? l3.a.P1(d14) : d14 / 453.592d;
                k52.e eVar = new k52.e(new l22.a(context));
                if (z14) {
                    return k52.e.b(eVar, Double.valueOf(dP1), z15);
                }
                Double dValueOf = Double.valueOf(dP1);
                l3.f23124b.getClass();
                return eVar.a(dValueOf, l3.f23130h);
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                l3.a aVar5 = l3.f23124b;
                int iB = MathKt.b(d14);
                aVar5.getClass();
                return l3.a.Z0(iB);
            default:
                u0.r();
                return null;
        }
    }

    public static /* synthetic */ String g(Context context, q91.d dVar, double d14, boolean z14) {
        f12.l.a aVar = f12.l.f68084a;
        aVar.getClass();
        boolean zY = f12.l.a.a().y();
        aVar.getClass();
        return f(context, dVar, d14, z14, zY, f12.l.a.a().g());
    }

    public static final String h(Context context, q91.d dVar, Double d14, String str) {
        context.getClass();
        dVar.getClass();
        oi0.b bVar = new oi0.b(new l22.a(context), str);
        if (d14 != null) {
            switch (C3789a.f203135c[dVar.f143581c.ordinal()]) {
                case 1:
                    if (!s.c(d14, 1.0d)) {
                        bVar.s();
                        bVar.B();
                    } else {
                        bVar.r();
                        bVar.A();
                    }
                    break;
                case 2:
                    if (!s.c(d14, 1.0d)) {
                        bVar.y();
                        bVar.g();
                    } else {
                        bVar.x();
                        bVar.i();
                    }
                    break;
                case 3:
                    bVar.X();
                    break;
                case 4:
                    if (!s.c(d14, 1.0d)) {
                        bVar.y();
                        bVar.b0();
                    } else {
                        bVar.x();
                        bVar.a0();
                    }
                    break;
                case 5:
                    return new oi0.h(context).d(MathKt.d(d14.doubleValue()), true);
                case 6:
                    bVar.q();
                    bVar.R();
                    break;
                default:
                    Unit unit = Unit.INSTANCE;
                    break;
            }
        } else {
            bVar.M();
        }
        return bVar.f132238b;
    }

    public static aa1.e i(Context context, q91.d dVar, com.garmin.android.apps.connectmobile.repcounting.model.f fVar, List list, n91.a aVar) {
        a aVar2;
        String strB;
        dVar.getClass();
        list.getClass();
        List listN0 = h0.N0(h0.N0(list, new b()), new c());
        ArrayList arrayList = new ArrayList(y.r(listN0, 10));
        Iterator it = listN0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            aVar2 = f203130a;
            if (!zHasNext) {
                break;
            }
            n91.a aVar3 = (n91.a) it.next();
            aVar2.getClass();
            arrayList.add(k(aVar3, context, fVar));
        }
        i53.c cVarE = i53.a.e(arrayList);
        n91.a aVar4 = (n91.a) h0.d0(listN0);
        aa1.d dVar2 = (aa1.d) h0.d0(cVarE);
        String strC = c(context, dVar.f143579a, fVar);
        if (strC == null) {
            strC = "";
        }
        String str = strC;
        aa1.d dVarK = null;
        Long l14 = aVar4 != null ? aVar4.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null;
        String str2 = dVar2 != null ? dVar2.f2253e : null;
        String str3 = dVar2 != null ? dVar2.f2254f : null;
        if (aVar4 != null) {
            aVar2.getClass();
            strB = b(context, aVar4);
        } else {
            strB = null;
        }
        if (aVar != null) {
            aVar2.getClass();
            dVarK = k(aVar, context, fVar);
        }
        return new aa1.e(false, false, false, dVar, str, l14, str2, str3, strB, dVarK, cVarE, 6, null);
    }

    public static Integer j(q91.g gVar, String str) {
        Integer numValueOf;
        if (gVar != null) {
            switch (C3789a.f203133a[gVar.ordinal()]) {
                case 1:
                    numValueOf = Integer.valueOf(R.drawable.bike);
                    break;
                case 2:
                    numValueOf = Integer.valueOf(R.drawable.swim_pool);
                    break;
                case 3:
                    numValueOf = Integer.valueOf(R.drawable.push_walk);
                    break;
                case 4:
                    numValueOf = Integer.valueOf(R.drawable.steps);
                    break;
                case 5:
                    numValueOf = Integer.valueOf(R.drawable.run);
                    break;
                case 6:
                    numValueOf = Integer.valueOf(R.drawable.strength);
                    break;
                case 7:
                    numValueOf = Integer.valueOf(R.drawable.push_run);
                    break;
                default:
                    u0.r();
                    return null;
            }
        } else {
            numValueOf = null;
        }
        boolean z14 = true;
        if (!u.q(x0.Y2.f4358a, str, true) && !u.q(x0.Z2.f4358a, str, true)) {
            z14 = false;
        }
        return (gVar == q91.g.CYCLING && z14) ? Integer.valueOf(R.drawable.handcycling_outdoor) : numValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:44:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:52:0x018e  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x01af  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b8 A[PHI: r0
      0x01b8: PHI (r0v22 java.lang.Long) = (r0v17 java.lang.Long), (r0v18 java.lang.Long) binds: [B:65:0x01b6, B:69:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static aa1.d k(n91.a aVar, Context context, com.garmin.android.apps.connectmobile.repcounting.model.f fVar) {
        Long lValueOf;
        String activityName;
        String string;
        String strE;
        String strG;
        Long activityStartDateTimeLocal;
        Long activityStartDateTimeInGMT;
        Long prStartTimeLocal;
        Long prStartTimeGmt;
        p pVar;
        String str;
        String str2;
        Long prStartTimeGmt2;
        long jLongValue;
        String activityName2;
        aVar.getClass();
        context.getClass();
        Long activityId = aVar.getActivityId();
        String strG2 = null;
        if (activityId != null) {
            long jLongValue2 = activityId.longValue();
            lValueOf = jLongValue2 > 0 ? Long.valueOf(jLongValue2) : null;
        } else {
            lValueOf = null;
        }
        q91.d.a aVar2 = q91.d.f143558e;
        Long lValueOf2 = Long.valueOf(aVar.getTypeId());
        aVar2.getClass();
        q91.d dVarA = q91.d.a.a(lValueOf2);
        if (dVarA == null) {
            dVarA = q91.d.f143561h;
        }
        if (lValueOf == null || !((activityName2 = aVar.getActivityName()) == null || activityName2.length() == 0)) {
            if (lValueOf == null) {
                activityName = c(context, dVarA.f143579a, fVar);
                if (activityName == null) {
                    string = context.getString(R.string.txt_untitle);
                    string.getClass();
                }
            } else {
                activityName = aVar.getActivityName();
                if (activityName == null) {
                    string = context.getString(R.string.txt_untitle);
                    string.getClass();
                }
            }
            activityName.getClass();
            if (lValueOf == null) {
                strE = e(context, dVarA, activityName);
            } else {
                strE = activityName;
            }
            strG = g(context, dVarA, aVar.getValue(), true);
            if (strG == null) {
                strG = context.getString(R.string.no_value);
                strG.getClass();
            }
            String str3 = strG;
            String strH = h(context, dVarA, Double.valueOf(aVar.getValue()), str3);
            activityStartDateTimeLocal = aVar.getActivityStartDateTimeLocal();
            activityStartDateTimeInGMT = aVar.getActivityStartDateTimeInGMT();
            prStartTimeLocal = aVar.getPrStartTimeLocal();
            prStartTimeGmt = aVar.getPrStartTimeGmt();
            pi0.e eVar = new pi0.e(context);
            if (prStartTimeLocal == null && prStartTimeLocal.longValue() != 0) {
                long jLongValue3 = prStartTimeLocal.longValue();
                DateTimeZone dateTimeZone = DateTimeZone.UTC;
                dateTimeZone.getClass();
                String strA = a(eVar, jLongValue3, dateTimeZone);
                LocalDateTime localDateTime = new LocalDateTime(prStartTimeLocal.longValue(), dateTimeZone);
                qi0.f fVar2 = qi0.f.RELATIVE_24H_AM_PM_TIME;
                fVar2.getClass();
                pVar = new p(strA, eVar.c(g22.k.r(localDateTime), fVar2));
            } else if (activityStartDateTimeLocal == null && activityStartDateTimeLocal.longValue() != 0) {
                long jLongValue4 = activityStartDateTimeLocal.longValue();
                DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                dateTimeZone2.getClass();
                String strA2 = a(eVar, jLongValue4, dateTimeZone2);
                LocalDateTime localDateTime2 = new LocalDateTime(activityStartDateTimeLocal.longValue(), dateTimeZone2);
                qi0.f fVar3 = qi0.f.RELATIVE_24H_AM_PM_TIME;
                fVar3.getClass();
                pVar = new p(strA2, eVar.c(g22.k.r(localDateTime2), fVar3));
            } else if (prStartTimeGmt == null && prStartTimeGmt.longValue() != 0) {
                long jLongValue5 = prStartTimeGmt.longValue();
                DateTimeZone dateTimeZone3 = DateTimeZone.getDefault();
                dateTimeZone3.getClass();
                String strA3 = a(eVar, jLongValue5, dateTimeZone3);
                LocalDateTime localDateTime3 = new LocalDateTime(prStartTimeGmt.longValue(), DateTimeZone.getDefault());
                qi0.f fVar4 = qi0.f.RELATIVE_24H_AM_PM_TIME;
                fVar4.getClass();
                pVar = new p(strA3, eVar.c(g22.k.r(localDateTime3), fVar4));
            } else if (activityStartDateTimeInGMT != null || activityStartDateTimeInGMT.longValue() == 0) {
                pVar = new p(null, null);
            } else {
                long jLongValue6 = activityStartDateTimeInGMT.longValue();
                DateTimeZone dateTimeZone4 = DateTimeZone.getDefault();
                dateTimeZone4.getClass();
                String strA4 = a(eVar, jLongValue6, dateTimeZone4);
                LocalDateTime localDateTime4 = new LocalDateTime(activityStartDateTimeInGMT.longValue(), DateTimeZone.getDefault());
                qi0.f fVar5 = qi0.f.RELATIVE_24H_AM_PM_TIME;
                fVar5.getClass();
                pVar = new p(strA4, eVar.c(g22.k.r(localDateTime4), fVar5));
            }
            str = (String) pVar.f128594a;
            str2 = (String) pVar.f128595b;
            if (str != null || str2 == null) {
                if (str == null) {
                    str = str2;
                }
                if (str != null) {
                    strG2 = str;
                }
            } else {
                strG2 = e5.g(str, ", ", str2);
            }
            if (strG2 == null) {
                strG2 = "";
            }
            String str4 = strG2;
            prStartTimeGmt2 = aVar.getPrStartTimeGmt();
            if (prStartTimeGmt2 != null && (prStartTimeGmt2 = aVar.getActivityStartDateTimeInGMT()) == null) {
                jLongValue = -1;
            } else {
                jLongValue = prStartTimeGmt2.longValue();
            }
            return new aa1.d(activityName, strE, str4, jLongValue, str3, strH, lValueOf, aVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String(), aVar.getActivityType(), aVar.getValue() / 1000.0d);
        }
        string = context.getString(R.string.txt_untitle);
        activityName = string;
        activityName.getClass();
        if (lValueOf == null) {
            strE = e(context, dVarA, activityName);
        } else {
            strE = activityName;
        }
        strG = g(context, dVarA, aVar.getValue(), true);
        if (strG == null) {
            strG = context.getString(R.string.no_value);
            strG.getClass();
        }
        String str5 = strG;
        String strH2 = h(context, dVarA, Double.valueOf(aVar.getValue()), str5);
        activityStartDateTimeLocal = aVar.getActivityStartDateTimeLocal();
        activityStartDateTimeInGMT = aVar.getActivityStartDateTimeInGMT();
        prStartTimeLocal = aVar.getPrStartTimeLocal();
        prStartTimeGmt = aVar.getPrStartTimeGmt();
        pi0.e eVar2 = new pi0.e(context);
        if (prStartTimeLocal == null) {
            if (activityStartDateTimeLocal == null) {
                if (prStartTimeGmt == null) {
                    if (activityStartDateTimeInGMT != null) {
                        pVar = new p(null, null);
                    } else {
                        pVar = new p(null, null);
                    }
                } else if (activityStartDateTimeInGMT != null) {
                    pVar = new p(null, null);
                } else {
                    pVar = new p(null, null);
                }
            } else if (prStartTimeGmt == null) {
                if (activityStartDateTimeInGMT != null) {
                    pVar = new p(null, null);
                } else {
                    pVar = new p(null, null);
                }
            } else if (activityStartDateTimeInGMT != null) {
                pVar = new p(null, null);
            } else {
                pVar = new p(null, null);
            }
        } else if (activityStartDateTimeLocal == null) {
            if (prStartTimeGmt == null) {
                if (activityStartDateTimeInGMT != null) {
                    pVar = new p(null, null);
                } else {
                    pVar = new p(null, null);
                }
            } else if (activityStartDateTimeInGMT != null) {
                pVar = new p(null, null);
            } else {
                pVar = new p(null, null);
            }
        } else if (prStartTimeGmt == null) {
            if (activityStartDateTimeInGMT != null) {
                pVar = new p(null, null);
            } else {
                pVar = new p(null, null);
            }
        } else if (activityStartDateTimeInGMT != null) {
            pVar = new p(null, null);
        } else {
            pVar = new p(null, null);
        }
        str = (String) pVar.f128594a;
        str2 = (String) pVar.f128595b;
        if (str != null) {
            if (str == null) {
                str = str2;
            }
            if (str != null) {
                strG2 = str;
            }
        } else {
            if (str == null) {
                str = str2;
            }
            if (str != null) {
                strG2 = str;
            }
        }
        if (strG2 == null) {
            strG2 = "";
        }
        String str6 = strG2;
        prStartTimeGmt2 = aVar.getPrStartTimeGmt();
        if (prStartTimeGmt2 != null) {
            jLongValue = prStartTimeGmt2.longValue();
        } else {
            jLongValue = -1;
        }
        return new aa1.d(activityName, strE, str6, jLongValue, str5, strH2, lValueOf, aVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String(), aVar.getActivityType(), aVar.getValue() / 1000.0d);
    }
}
