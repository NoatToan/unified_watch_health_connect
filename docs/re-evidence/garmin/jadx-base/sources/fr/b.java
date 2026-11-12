package fr;

import am.r1;
import am.v1;
import am.x0;
import am.z0;
import android.content.Context;
import android.text.TextUtils;
import c22.j0;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.h;
import f12.l;
import gg1.o0;
import java.util.Arrays;
import ls.e;
import ms.b0;
import ns.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import ps.a1;
import ss.k;
import to.i;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final double a(Double d14, Double d15) {
        if (d14 != null && !s.c(d14, 0.0d) && !Double.isNaN(d14.doubleValue())) {
            return d14.doubleValue();
        }
        if (d15 == null || Double.isNaN(d15.doubleValue())) {
            return 0.0d;
        }
        return d15.doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0198  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    public static final String b(Context context, gs1.b bVar) {
        int i14;
        int i15;
        bVar.getClass();
        gs1.c activityType = bVar.getActivityType();
        String typeKey = activityType != null ? activityType.getTypeKey() : null;
        if (z0.R(typeKey)) {
            return j0.r(context, j0.K(bVar.getStartTimeLocal(), "yyyy-MM-dd'T'HH:mm:ss.SSS"));
        }
        x0 x0Var = x0.D;
        if (z0.b(x0Var, typeKey) && !z0.b(x0.f4296k0, typeKey)) {
            i14 = 7;
        } else if (z0.O(typeKey)) {
            i14 = 8;
        } else if (z0.b(x0.f4352y2, typeKey) || z0.b(x0.f4356z2, typeKey)) {
            i14 = 16;
        } else if (z0.X(typeKey)) {
            i14 = 20;
        } else if (z0.a0(typeKey)) {
            i14 = 28;
        } else if (z0.b(x0.f4297k1, typeKey) || z0.b(x0.f4301l1, typeKey)) {
            i14 = 33;
        } else {
            i14 = z0.b(x0.O1, typeKey) ? 34 : 3;
        }
        String strD = d(context, i14, bVar);
        gs1.c activityType2 = bVar.getActivityType();
        String typeKey2 = activityType2 != null ? activityType2.getTypeKey() : null;
        if (z0.z(typeKey2)) {
            i15 = 24;
        } else if (z0.b(x0.f4297k1, typeKey2) || z0.b(x0.f4301l1, typeKey2)) {
            i15 = 1;
        } else if (z0.b(x0Var, typeKey2)) {
            if (z0.b(x0.f4296k0, typeKey2)) {
                i15 = 31;
            } else {
                i15 = z0.M(typeKey2) ? 5 : 6;
            }
        } else if (z0.b(x0.f4344w2, typeKey2)) {
            i15 = 13;
        } else if (z0.b(x0.f4348x2, typeKey2)) {
            i15 = 26;
        } else if (z0.b(x0.C2, typeKey2) || z0.b(x0.f4357z3, typeKey2) || z0.b(x0.A3, typeKey2)) {
            i15 = 2;
        } else if (z0.f0(typeKey2) && !z0.t(typeKey2) && !z0.G(typeKey2)) {
            i15 = 14;
        } else if (z0.b(x0.f4352y2, typeKey2)) {
            if (s.g(i.SIMPLE.f165805a, bVar.getSplitSummaryMode())) {
                i15 = 25;
            } else {
                i15 = 17;
            }
        } else if (z0.b(x0.f4356z2, typeKey2)) {
            i15 = 17;
        } else if (z0.J(typeKey2)) {
            i15 = 11;
        } else if (z0.L(typeKey2) || z0.b(x0.E2, typeKey2) || z0.b(x0.X2, typeKey2) || z0.b(x0.F3, typeKey2) || z0.G(typeKey2)) {
            i15 = 9;
        } else if (z0.X(typeKey2)) {
            i15 = 21;
        } else if (z0.a0(typeKey2)) {
            i15 = 27;
        } else {
            x0 x0VarM = z0.m(typeKey2);
            if ((x0VarM != null ? z0.g(x0VarM) : null) == x0.f4316p) {
                i15 = 2;
            } else if (z0.P(typeKey2)) {
                i15 = 29;
            } else if (z0.b(x0.E3, typeKey2)) {
                i15 = 30;
            } else if (z0.V(typeKey2)) {
                i15 = 2;
            } else {
                i15 = 1;
            }
        }
        String strD2 = d(context, i15, bVar);
        Integer num = z0.b(x0.C2, typeKey) ? 9 : null;
        String string = context.getString(R.string.string_space_bullet_string_pattern, strD, strD2);
        string.getClass();
        if (num == null) {
            return string;
        }
        String string2 = context.getString(R.string.string_space_bullet_string_pattern, string, d(context, num.intValue(), bVar));
        string2.getClass();
        return string2;
    }

    public static final int c(h hVar, boolean z14) {
        hVar.getClass();
        String str = hVar.C().f4358a;
        if (z14 && z0.f(str)) {
            return 4;
        }
        a1 a1Var = hVar.f29459l;
        return ((a1Var == null || a1Var.getHasHeatmap() == null || !a1Var.getHasHeatmap().booleanValue()) && !z0.O(str)) ? -1 : 4;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    public static final String d(Context context, int i14, gs1.b bVar) {
        Double duration;
        int iIntValue;
        Double bottomTime;
        q3 q3Var;
        String typeKey;
        String string;
        Double duration2;
        bVar.getClass();
        String string2 = context.getString(R.string.no_value);
        string2.getClass();
        l22.a aVar = new l22.a(context);
        String str = "";
        double dDoubleValue = 0.0d;
        switch (i14) {
            case 0:
                return "";
            case 1:
                x0 x0VarA = fs1.b.a(bVar);
                Double distance = bVar.getDistance();
                return ar.b.e(context, x0VarA, distance != null ? distance.doubleValue() : 0.0d, bVar.P, string2);
            case 2:
                l3.a aVar2 = l3.f23124b;
                Double calories = bVar.getCalories();
                dDoubleValue = calories != null ? calories.doubleValue() : 0.0d;
                aVar2.getClass();
                return l3.a.G(aVar, dDoubleValue, true);
            case 3:
                Double duration3 = bVar.getDuration();
                if ((duration3 == null || !Double.isNaN(duration3.doubleValue())) && (duration = bVar.getDuration()) != null) {
                    dDoubleValue = duration.doubleValue();
                }
                l3.a aVar3 = l3.f23124b;
                long jD = MathKt.d(dDoubleValue);
                String string3 = context.getString(R.string.no_duration_value);
                string3.getClass();
                aVar3.getClass();
                return l3.a.f1(jD, string3);
            case 4:
                new mn.a(new l22.a(context));
                Double strokes = bVar.getStrokes();
                return mn.a.c(context, strokes != null ? strokes.doubleValue() : 0.0d, string2);
            case 5:
                Integer diveCount = bVar.getDiveCount();
                iIntValue = diveCount != null ? diveCount.intValue() : 0;
                if (iIntValue == 1) {
                    return context.getString(R.string.lbl_dive);
                }
                return iIntValue > 1 ? context.getString(R.string.lbl_dives, String.valueOf(iIntValue)) : string2;
            case 6:
            case 32:
                l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
                l3.a aVar4 = l3.f23124b;
                Double maxDepth = bVar.getMaxDepth();
                dDoubleValue = maxDepth != null ? maxDepth.doubleValue() : 0.0d;
                aVar4.getClass();
                return l3.a.M(context, Double.isNaN(dDoubleValue) ? Double.NaN : dDoubleValue / 100.0d, lVar.y(), true);
            case 7:
                Double bottomTime2 = bVar.getBottomTime();
                if ((bottomTime2 == null || !Double.isNaN(bottomTime2.doubleValue())) && (bottomTime = bVar.getBottomTime()) != null) {
                    dDoubleValue = bottomTime.doubleValue();
                }
                l3.a aVar5 = l3.f23124b;
                long jD2 = MathKt.d(dDoubleValue);
                aVar5.getClass();
                return l3.a.e1(jD2);
            case 8:
                l3.a aVar6 = l3.f23124b;
                Double duration4 = bVar.getDuration();
                dDoubleValue = duration4 != null ? duration4.doubleValue() : 0.0d;
                aVar6.getClass();
                return new mn.a(new l22.a(context)).d((long) (((double) 1000) * dDoubleValue));
            case 9:
                return k.b(e.AVERAGE_HEART_RATE, aVar, bVar.getAverageHeartRate(), 73);
            case 10:
            case 12:
            case 15:
            case 18:
            case 19:
            case 22:
            case 23:
            default:
                x0 x0VarA2 = fs1.b.a(bVar);
                Double distance2 = bVar.getDistance();
                return ar.b.e(context, x0VarA2, distance2 != null ? distance2.doubleValue() : 0.0d, bVar.P, string2);
            case 11:
                gs1.c activityType = bVar.getActivityType();
                if (z0.J(activityType != null ? activityType.getTypeKey() : null)) {
                    p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                    str = String.format(" %s", Arrays.copyOf(new Object[]{context.getString(R.string.lbl_max_nautical_sog_shortened)}, 1));
                }
                String str2 = str;
                l3.a aVar7 = l3.f23124b;
                Double maxSpeed = bVar.getMaxSpeed();
                dDoubleValue = maxSpeed != null ? maxSpeed.doubleValue() : 0.0d;
                gs1.c activityType2 = bVar.getActivityType();
                if (z0.I(activityType2 != null ? activityType2.getTypeKey() : null)) {
                    q3Var = q3.NAUTICAL_MILES_PER_HOUR;
                } else {
                    q3Var = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                }
                q3 q3Var2 = q3Var;
                aVar7.getClass();
                String strN0 = l3.a.N0(context, dDoubleValue, q3Var2, l3.f23130h, true, string2);
                p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                return String.format("%s%s", Arrays.copyOf(new Object[]{strN0, str2}, 2));
            case 13:
                Double averageRespirationRate = bVar.getAverageRespirationRate();
                return r1.h(context, Double.valueOf(averageRespirationRate != null ? averageRespirationRate.doubleValue() : 0.0d), string2);
            case 14:
                new mn.a(new l22.a(context));
                Integer activeSets = bVar.getActiveSets();
                iIntValue = activeSets != null ? activeSets.intValue() : 0;
                x0 x0VarA3 = fs1.b.a(bVar);
                if (x0VarA3 == null) {
                    x0VarA3 = x0.f4346x;
                }
                return mn.a.b(iIntValue, x0VarA3, context);
            case 16:
                Long numberOfSplits = bVar.getNumberOfSplits();
                return r1.k(context, numberOfSplits != null ? numberOfSplits.longValue() : 0L, string2);
            case 17:
                gs1.c activityType3 = bVar.getActivityType();
                if (activityType3 != null && (typeKey = activityType3.getTypeKey()) != null) {
                    str = typeKey;
                }
                return e(context, v1.e(str, bVar.getMaxGradeValue()), string2);
            case 20:
                Long numberOfSplits2 = bVar.getNumberOfSplits();
                return r1.m(context, numberOfSplits2 != null ? numberOfSplits2.longValue() : 0L, string2);
            case 21:
                Double maxDistanceWithPrecision = bVar.getMaxDistanceWithPrecision();
                if (maxDistanceWithPrecision == null) {
                    maxDistanceWithPrecision = bVar.getMaxSplitDistance();
                }
                return r1.g(context, maxDistanceWithPrecision, ar.b.b(fs1.b.a(bVar), null), string2, R.string.activities_thumbnail_map_legend_longest_wave);
            case 24:
                Integer floorsClimbed = bVar.getFloorsClimbed();
                if (floorsClimbed == null) {
                    return string2;
                }
                int iIntValue2 = floorsClimbed.intValue();
                if (iIntValue2 == 1) {
                    string = context.getString(R.string.lbl_one_floor);
                } else {
                    string = (iIntValue2 == 0 || iIntValue2 > 1) ? context.getString(R.string.lbl_floors_plural, String.valueOf(iIntValue2)) : string2;
                }
                return string == null ? string2 : string;
            case 25:
                Double totalAscent = bVar.getTotalAscent();
                if (totalAscent == null) {
                    return string2;
                }
                double dDoubleValue2 = totalAscent.doubleValue();
                l3.a aVar8 = l3.f23124b;
                o0 o0VarG = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
                aVar8.getClass();
                return l3.a.a0(context, dDoubleValue2, o0VarG, true, false);
            case 26:
                return r1.j(context, bVar.getDifferenceStress(), string2);
            case 27:
                Double maxDistanceWithPrecision2 = bVar.getMaxDistanceWithPrecision();
                if (maxDistanceWithPrecision2 == null) {
                    maxDistanceWithPrecision2 = bVar.getMaxSplitDistance();
                }
                return r1.g(context, maxDistanceWithPrecision2, ar.b.b(fs1.b.a(bVar), null), string2, R.string.activity_wakesports_run_distance_longest_run);
            case 28:
                Long numberOfSplits3 = bVar.getNumberOfSplits();
                return r1.l(context, numberOfSplits3 != null ? numberOfSplits3.longValue() : 0L, string2);
            case 29:
                Double activeSplitSummaryDistance = bVar.getActiveSplitSummaryDistance();
                if (!zf.b.D(activeSplitSummaryDistance)) {
                    activeSplitSummaryDistance = null;
                }
                if (activeSplitSummaryDistance != null) {
                    dDoubleValue = activeSplitSummaryDistance.doubleValue();
                } else {
                    Double distance3 = bVar.getDistance();
                    Double d14 = zf.b.D(distance3) ? distance3 : null;
                    if (d14 != null) {
                        dDoubleValue = d14.doubleValue();
                    }
                }
                return ar.b.e(context, fs1.b.a(bVar), dDoubleValue, bVar.P, string2);
            case 30:
                Double maxPackWeight = bVar.getMaxPackWeight();
                if (maxPackWeight == null) {
                    maxPackWeight = bVar.getPackWeight();
                } else {
                    if (Double.isNaN(maxPackWeight.doubleValue())) {
                        maxPackWeight = null;
                    }
                    if (maxPackWeight == null) {
                        maxPackWeight = bVar.getPackWeight();
                    }
                }
                if (maxPackWeight != null) {
                    String strC1 = l3.a.C1(l3.f23124b, context, maxPackWeight.doubleValue() / 1000.0d, ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y(), false, null, 24);
                    if (strC1.length() != 0) {
                        return strC1;
                    }
                }
                return string2;
            case 31:
                return k.b(e.INTERVALS, aVar, bVar.getDiveCount(), 72);
            case 33:
                Double duration5 = bVar.getDuration();
                if ((duration5 == null || !Double.isNaN(duration5.doubleValue())) && (duration2 = bVar.getDuration()) != null) {
                    dDoubleValue = duration2.doubleValue();
                }
                l3.a aVar9 = l3.f23124b;
                long jD3 = MathKt.d(dDoubleValue * 1000.0d);
                String string4 = context.getString(R.string.no_duration_value);
                aVar9.getClass();
                return l3.a.w1(jD3, string4, false);
            case 34:
                return u00.b.c(new f0(aVar, new b0()), bVar.getDuration(), 0, 2);
        }
    }

    public static final String e(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        String string = context.getString(R.string.lbl_max_difficulty_abreviated);
        string.getClass();
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        return String.format("%s %s", Arrays.copyOf(new Object[]{str, string}, 2));
    }
}
