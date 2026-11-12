package tb2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.MapboxMap;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import ub2.a0;
import ub2.b0;
import ub2.b1;
import ub2.c0;
import ub2.c1;
import ub2.d0;
import ub2.d1;
import ub2.e1;
import ub2.f0;
import ub2.g0;
import ub2.h0;
import ub2.i;
import ub2.i0;
import ub2.i1;
import ub2.j0;
import ub2.k;
import ub2.k0;
import ub2.l;
import ub2.m;
import ub2.n;
import ub2.n0;
import ub2.p0;
import ub2.t0;
import ub2.u0;
import ub2.v0;
import ub2.w0;
import ub2.y;
import ub2.z;
import ub2.z0;
import vh.m0;
import vh.o;
import vh.p;
import vh.q;
import vh.r;
import vh.s;
import vh.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltb2/e;", "", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final List<w> A;
    public static final List<w> B;
    public static final List<w> C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f163766a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<w> f163767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<w> f163768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<w> f163769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<w> f163770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<w> f163771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List<w> f163772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List<w> f163773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List<w> f163774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List<w> f163775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final List<w> f163776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List<w> f163777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List<w> f163778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List<w> f163779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final List<w> f163780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List<w> f163781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final List<w> f163782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final List<w> f163783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final List<w> f163784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final List<w> f163785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final List<w> f163786u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final List<w> f163787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List<w> f163788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List<w> f163789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List<w> f163790y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final List<w> f163791z;

    static {
        z.f169917a.getClass();
        List<w> listK = x.k(new q.a("totalCalories", z.a.a()).c(), new q.a("activeCalories", z.a.a()).c(), new q.a("restingCalories", z.a.a()).c());
        f163767b = listK;
        h0.f169841a.getClass();
        q qVarC = new q.a("mealId", h0.a.a()).c();
        b0.f169805a.getClass();
        List<w> listK2 = x.k(qVarC, new q.a("mealName", s.b(b0.a.a())).c());
        f163768c = listK2;
        a0.f169799a.getClass();
        List<w> listK3 = x.k(new q.a("calories", a0.a.a()).c(), new q.a("carbs", z.a.a()).c(), new q.a("fat", z.a.a()).c(), new q.a("protein", z.a.a()).c(), new q.a("caloriesPercentage", z.a.a()).c());
        f163769d = listK3;
        c1.f169813a.getClass();
        q.a aVar = new q.a("meal", c1.a.a());
        aVar.e(listK2);
        q qVarC2 = aVar.c();
        e1.f169825a.getClass();
        m0 m0Var = e1.f169826b;
        q.a aVar2 = new q.a("nutritionContent", m0Var);
        aVar2.e(listK3);
        List<w> listK4 = x.k(qVarC2, aVar2.c());
        f163770e = listK4;
        List<w> listK5 = x.k(new q.a("calories", a0.a.a()).c(), new q.a("carbs", z.a.a()).c(), new q.a("fat", z.a.a()).c(), new q.a("protein", z.a.a()).c(), new q.a("caloriesPercentage", z.a.a()).c());
        f163771f = listK5;
        List<w> listK6 = x.k(new q.a("calories", a0.a.a()).c(), new q.a("adjustedCalories", a0.a.a()).c(), new q.a("carbs", z.a.a()).c(), new q.a("adjustedCarbs", z.a.a()).c(), new q.a("fat", z.a.a()).c(), new q.a("adjustedFat", z.a.a()).c(), new q.a("protein", z.a.a()).c(), new q.a("adjustedProtein", z.a.a()).c());
        f163772g = listK6;
        ub2.s.f169889a.getClass();
        q qVarC3 = new q.a("mealDate", s.b(ub2.s.a.a())).c();
        q.a aVar3 = new q.a("nutritionContent", m0Var);
        aVar3.e(listK5);
        q qVarC4 = aVar3.c();
        n0.f169871a.getClass();
        q.a aVar4 = new q.a("nutritionGoals", n0.a.a());
        aVar4.e(listK6);
        List<w> listK7 = x.k(qVarC3, qVarC4, aVar4.c());
        f163773h = listK7;
        List<w> listK8 = x.k(new q.a("calories", a0.a.a()).c(), new q.a("carbs", z.a.a()).c(), new q.a("fat", z.a.a()).c(), new q.a("protein", z.a.a()).c(), new q.a("caloriesPercentage", z.a.a()).c());
        f163774i = listK8;
        q qVarC5 = new q.a("startDate", s.b(ub2.s.a.a())).c();
        q qVarC6 = new q.a("endDate", s.b(ub2.s.a.a())).c();
        k.f169857a.getClass();
        q.a aVar5 = new q.a("caloriesBurned", k.a.a());
        aVar5.e(listK);
        q qVarC7 = aVar5.c();
        d1.f169819a.getClass();
        q.a aVar6 = new q.a("mealNutritionContents", s.a(s.b(d1.a.a())));
        aVar6.e(listK4);
        q qVarC8 = aVar6.c();
        b1.f169807a.getClass();
        q.a aVar7 = new q.a("dailyNutritionContents", s.a(s.b(b1.a.a())));
        aVar7.e(listK7);
        q qVarC9 = aVar7.c();
        q.a aVar8 = new q.a("averageNutritionContents", m0Var);
        aVar8.e(listK8);
        List<w> listK9 = x.k(qVarC5, qVarC6, qVarC7, qVarC8, qVarC9, aVar8.c());
        f163775j = listK9;
        List<w> listC = p13.w.c(new q.a("periodLength", a0.a.a()).c());
        f163776k = listC;
        q qVarC10 = new q.a("startDate", ub2.s.a.a()).c();
        q qVarC11 = new q.a("dayInCycle", a0.a.a()).c();
        q qVarC12 = new q.a("periodLength", a0.a.a()).c();
        q qVarC13 = new q.a("currentPhase", a0.a.a()).c();
        q qVarC14 = new q.a("lengthOfCurrentPhase", a0.a.a()).c();
        q qVarC15 = new q.a("daysUntilNextPhase", a0.a.a()).c();
        q qVarC16 = new q.a("fertileWindowStart", a0.a.a()).c();
        q qVarC17 = new q.a("lengthOfFertileWindow", a0.a.a()).c();
        q qVarC18 = new q.a("predictedCycleLength", a0.a.a()).c();
        q qVarC19 = new q.a("educationContentMod", a0.a.a()).c();
        q qVarC20 = new q.a("lutealPhaseStart", a0.a.a()).c();
        y.f169913a.getClass();
        q qVarC21 = new q.a("pregnancyCycle", y.a.a()).c();
        q qVarC22 = new q.a("numberOfWeek", a0.a.a()).c();
        q qVarC23 = new q.a("dueDate", ub2.s.a.a()).c();
        q qVarC24 = new q.a("deliveryDate", ub2.s.a.a()).c();
        q qVarC25 = new q.a("endDate", ub2.s.a.a()).c();
        p0.f169879a.getClass();
        q.a aVar9 = new q.a("overlapCycles", s.a(p0.a.a()));
        aVar9.e(listC);
        List<w> listK10 = x.k(qVarC10, qVarC11, qVarC12, qVarC13, qVarC14, qVarC15, qVarC16, qVarC17, qVarC18, qVarC19, qVarC20, qVarC21, qVarC22, qVarC23, qVarC24, qVarC25, aVar9.c(), new q.a("isPredictedCycle", y.a.a()).c());
        f163777l = listK10;
        List<w> listK11 = x.k(new q.a("movementType", b0.a.a()).c(), new q.a("count", a0.a.a()).c(), new q.a("duration", a0.a.a()).c());
        f163778m = listK11;
        q qVarC26 = new q.a("userProfilePk", h0.a.a()).c();
        q qVarC27 = new q.a("calendarDate", ub2.s.a.a()).c();
        q qVarC28 = new q.a("symptoms", s.a(b0.a.a())).c();
        q qVarC29 = new q.a("moods", s.a(b0.a.a())).c();
        q qVarC30 = new q.a("discharge", s.a(b0.a.a())).c();
        q qVarC31 = new q.a("flow", b0.a.a()).c();
        q qVarC32 = new q.a("sexDrive", b0.a.a()).c();
        q qVarC33 = new q.a("sexualActivity", b0.a.a()).c();
        q qVarC34 = new q.a("notes", b0.a.a()).c();
        g0.f169835a.getClass();
        vh.a0 a0Var = g0.f169836b;
        q qVarC35 = new q.a("reportTimestamp", a0Var).c();
        ub2.h.f169839a.getClass();
        q.a aVar10 = new q.a("babyMovements", s.a(ub2.h.a.a()));
        aVar10.e(listK11);
        List<w> listK12 = x.k(qVarC26, qVarC27, qVarC28, qVarC29, qVarC30, qVarC31, qVarC32, qVarC33, qVarC34, qVarC35, aVar10.c(), new q.a("hasGlucoseLog", y.a.a()).c(), new q.a("hasBabyMovement", y.a.a()).c(), new q.a("ovulationDay", y.a.a()).c());
        f163779n = listK12;
        List<w> listK13 = x.k(new q.a("weekNum", a0.a.a()).c(), new q.a("lowWeightGoalInGrams", z.a.a()).c(), new q.a("highWeightGoalInGrams", z.a.a()).c());
        f163780o = listK13;
        k0.f169859a.getClass();
        q.a aVar11 = new q.a("daySummary", k0.a.a());
        aVar11.e(listK10);
        q qVarC36 = aVar11.c();
        j0.f169853a.getClass();
        q.a aVar12 = new q.a("dayLog", j0.a.a());
        aVar12.e(listK12);
        q qVarC37 = aVar12.c();
        i1.f169849a.getClass();
        q.a aVar13 = new q.a("weightGoals", i1.a.a());
        aVar13.e(listK13);
        List<w> listK14 = x.k(qVarC36, qVarC37, aVar13.c());
        f163781p = listK14;
        List<w> listK15 = x.k(new q.a("userProfilePK", s.b(h0.a.a())).c(), new q.a("calendarDate", s.b(ub2.s.a.a())).c(), new q.a("acuteImpactLoad", h0.a.a()).c(), new q.a("acuteDistance", h0.a.a()).c(), new q.a("acuteTolerance", h0.a.a()).c());
        f163782q = listK15;
        List<w> listK16 = x.k(new q.a("calendarDate", s.b(ub2.s.a.a())).c(), new q.a(FirebaseAnalytics.Param.SCORE, s.b(a0.a.a())).c(), new q.a("classification", s.b(b0.a.a())).c());
        f163783r = listK16;
        List<w> listK17 = x.k(new q.a("startDate", s.b(ub2.s.a.a())).c(), new q.a("endDate", s.b(ub2.s.a.a())).c(), new q.a(FirebaseAnalytics.Param.SCORE, a0.a.a()).c(), new q.a("classification", b0.a.a()).c());
        f163784s = listK17;
        t0.f169895a.getClass();
        q.a aVar14 = new q.a("latest", t0.a.a());
        aVar14.e(listK16);
        q qVarC38 = aVar14.c();
        u0.f169899a.getClass();
        q.a aVar15 = new q.a("weeklyAggregates", s.b(s.a(s.b(u0.a.a()))));
        aVar15.e(listK17);
        List<w> listK18 = x.k(qVarC38, aVar15.c());
        f163785t = listK18;
        List<w> listK19 = x.k(new q.a("userProfilePk", s.b(h0.a.a())).c(), new q.a("deviceId", s.b(h0.a.a())).c(), new q.a("calendarDate", s.b(ub2.s.a.a())).c(), new q.a("timestamp", s.b(a0Var)).c(), new q.a("primaryTrainingDevice", y.a.a()).c(), new q.a("aerobicEndurance", a0.a.a()).c(), new q.a("aerobicCapacity", a0.a.a()).c(), new q.a("anaerobicCapacity", a0.a.a()).c(), new q.a("profileType", b0.a.a()).c(), new q.a("profileTypeFeedback", b0.a.a()).c(), new q.a("aerobicEnduranceFeedback", b0.a.a()).c(), new q.a("aerobicCapacityFeedback", b0.a.a()).c(), new q.a("anaerobicCapacityFeedback", b0.a.a()).c());
        f163786u = listK19;
        q qVarC39 = new q.a("startDate", s.b(ub2.s.a.a())).c();
        q qVarC40 = new q.a("endDate", s.b(ub2.s.a.a())).c();
        q qVarC41 = new q.a("userProfilePk", a0.a.a()).c();
        f0.f169829a.getClass();
        List<w> listK20 = x.k(qVarC39, qVarC40, qVarC41, new q.a("cyclingAbilitiesMap", f0.a.a()).c());
        f163787v = listK20;
        l.f169861a.getClass();
        q.a aVar16 = new q.a("latest", l.a.a());
        aVar16.e(listK19);
        q qVarC42 = aVar16.c();
        m.f169865a.getClass();
        q.a aVar17 = new q.a("weeklyAggregates", m.a.a());
        aVar17.e(listK20);
        List<w> listK21 = x.k(qVarC42, aVar17.c());
        f163788w = listK21;
        List<w> listK22 = x.k(new q.a("calendarDate", ub2.s.a.a()).c(), new q.a("totalTracking", a0.a.a()).c(), new q.a("completedTracking", a0.a.a()).c());
        f163789x = listK22;
        i.f169845a.getClass();
        q.a aVar18 = new q.a("completionStats", s.a(i.a.a()));
        aVar18.e(listK22);
        List<w> listC2 = p13.w.c(aVar18.c());
        f163790y = listC2;
        List<w> listK23 = x.k(new q.a("value", z.a.a()).c(), new q.a("baselineUpperLimit", z.a.a()).c(), new q.a("baselineLowerLimit", z.a.a()).c(), new q.a("status", b0.a.a()).c(), new q.a("percentage", z.a.a()).c(), new q.a("feedbackKey", b0.a.a()).c(), new q.a(NotificationConstants.KEY_DATA_MIME_TYPE, b0.a.a()).c());
        f163791z = listK23;
        q qVarC43 = new q.a("calendarDate", ub2.s.a.a()).c();
        q qVarC44 = new q.a("outliersCount", a0.a.a()).c();
        q qVarC45 = new q.a("createTimestampUTC", a0Var).c();
        q qVarC46 = new q.a("updateTimestampUTC", a0Var).c();
        c0.f169811a.getClass();
        q.a aVar19 = new q.a("metrics", s.a(c0.a.a()));
        aVar19.e(listK23);
        List<w> listK24 = x.k(qVarC43, qVarC44, qVarC45, qVarC46, aVar19.c());
        A = listK24;
        q.a aVar20 = new q.a("weightScalar", f0.a.a());
        aVar20.a();
        aVar20.d(p13.w.c(new p("includeWeight", false)));
        aVar20.b(x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("extendedDateRangeStart")).a()));
        List<w> listC3 = p13.w.c(aVar20.c());
        B = listC3;
        q qVarC47 = new q.a("__typename", s.b(b0.a.a())).c();
        q.a aVar21 = new q.a("bloodPressureScalar", f0.a.a());
        aVar21.d(p13.w.c(new p("includeBloodPressure", false)));
        aVar21.b(x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("sevenDaysAgo")).a()));
        q qVarC48 = aVar21.c();
        q.a aVar22 = new q.a("criticalSwimSpeedScalar", f0.a.a());
        aVar22.d(p13.w.c(new p("includeCriticalSwimSpeed", false)));
        aVar22.b(x.k(new o.a("aggregation", new vh.y("aggregationCriticalSwimSpeed")).a(), new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("oneYearAgo")).a()));
        q qVarC49 = aVar22.c();
        ub2.p.f169877a.getClass();
        q.a aVar23 = new q.a("calorieSummaryDailyStats", ub2.p.a.a());
        aVar23.d(p13.w.c(new p("includeDailyNutritionSummary", false)));
        aVar23.b(x.k(new o.a("currentDate", new vh.y("currentDate")).a(), new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("fourWeeksAgo")).a()));
        aVar23.e(listK9);
        q qVarC50 = aVar23.c();
        q.a aVar24 = new q.a("heartRateScalar", f0.a.a());
        aVar24.d(p13.w.c(new p("includeHeartRate", false)));
        aVar24.b(p13.w.c(new o.a("date", new vh.y("endDate")).a()));
        q qVarC51 = aVar24.c();
        q.a aVar25 = new q.a("heartRateZoneScalar", f0.a.a());
        aVar25.d(p13.w.c(new p("includeHeartRateZone", false)));
        q qVarC52 = aVar25.c();
        q.a aVar26 = new q.a("heartRateVariabilityScalar", f0.a.a());
        aVar26.d(p13.w.c(new p("includeHeartRateVariability", false)));
        aVar26.b(x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("fourWeeksAgo")).a()));
        q qVarC53 = aVar26.c();
        q.a aVar27 = new q.a("menstrualCycleScalar", f0.a.a());
        aVar27.d(p13.w.c(new p("includeMenstrualCycle", false)));
        aVar27.b(p13.w.c(new o.a("date", new vh.y("endDate")).a()));
        q qVarC54 = aVar27.c();
        i0.f169847a.getClass();
        q.a aVar28 = new q.a("menstrualCycleDetail", i0.a.a());
        aVar28.d(p13.w.c(new p("includeMenstrualLog", false)));
        aVar28.b(x.k(new o.a("date", new vh.y("endDate")).a(), new o.a("todayDate", new vh.y("endDate")).a()));
        aVar28.e(listK14);
        q qVarC55 = aVar28.c();
        q.a aVar29 = new q.a("spO2AcclimationScalar", f0.a.a());
        aVar29.d(p13.w.c(new p("includeSp02Acclimation", false)));
        aVar29.b(p13.w.c(new o.a("date", new vh.y("endDate")).a()));
        q qVarC56 = aVar29.c();
        q.a aVar30 = new q.a("sleepScalar", f0.a.a());
        aVar30.d(p13.w.c(new p("includeSleep", false)));
        aVar30.b(x.k(new o.a("date", new vh.y("endDate")).a(), new o.a("sleepOnly", Boolean.TRUE).a()));
        q qVarC57 = aVar30.c();
        q.a aVar31 = new q.a("sleepSummariesScalar", f0.a.a());
        aVar31.d(p13.w.c(new p("includeSleepSummaries", false)));
        aVar31.b(x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("sleepSummariesStartDate")).a()));
        q qVarC58 = aVar31.c();
        q.a aVar32 = new q.a("userDailySummaryV2Scalar", f0.a.a());
        aVar32.d(p13.w.c(new p("includeUserDailySummary", false)));
        aVar32.b(x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("userSummariesStartDate")).a()));
        q qVarC59 = aVar32.c();
        q.a aVar33 = new q.a("userDailySummaryV2AverageScalar", f0.a.a());
        aVar33.d(p13.w.c(new p("includeUserDailySummary", false)));
        aVar33.b(x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("sevenDaysAgo")).a()));
        q qVarC60 = aVar33.c();
        q.a aVar34 = new q.a("latestWeightScalar", f0.a.a());
        aVar34.d(p13.w.c(new p("includeWeight", false)));
        aVar34.b(p13.w.c(new o.a("asOfDate", new vh.y("endDate")).a()));
        q qVarC61 = aVar34.c();
        q.a aVar35 = new q.a("latestVo2MaxScalar", f0.a.a());
        aVar35.d(p13.w.c(new p("includeV02Max", false)));
        aVar35.b(p13.w.c(new o.a("asOfDate", new vh.y("endDate")).a()));
        q qVarC62 = aVar35.c();
        q.a aVar36 = new q.a("trainingStatusDailyScalar", f0.a.a());
        aVar36.d(p13.w.c(new p("includeTrainingStatusDaily", false)));
        aVar36.b(p13.w.c(new o.a("calendarDate", new vh.y("endDate")).a()));
        q qVarC63 = aVar36.c();
        q.a aVar37 = new q.a("trainingStatusWeeklyScalar", f0.a.a());
        aVar37.d(p13.w.c(new p("includeTrainingStatusWeekly", false)));
        aVar37.b(x.k(new o.a("displayName", new vh.y("displayName")).a(), new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("fourWeeksAgo")).a()));
        q qVarC64 = aVar37.c();
        q.a aVar38 = new q.a("runningLactateThresholdScalar", f0.a.a());
        aVar38.d(p13.w.c(new p("includeRunningLactateThreshold", false)));
        q qVarC65 = aVar38.c();
        w0.f169907a.getClass();
        q.a aVar39 = new q.a("runningToleranceStats", s.a(w0.a.a()));
        aVar39.d(p13.w.c(new p("includeRunningTolerance", false)));
        aVar39.b(x.k(new o.a("aggregation", "daily").a(), new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("endDate")).a()));
        aVar39.e(listK15);
        q qVarC66 = aVar39.c();
        v0.f169903a.getClass();
        q.a aVar40 = new q.a("runningEconomy", v0.a.a());
        aVar40.d(p13.w.c(new p("includeRunningEconomy", false)));
        aVar40.b(x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("fourWeeksAgo")).a()));
        aVar40.e(listK18);
        q qVarC67 = aVar40.c();
        q.a aVar41 = new q.a("powerToWeightScalar", f0.a.a());
        aVar41.d(p13.w.c(new p("includePowerToWeight", false)));
        aVar41.b(x.k(new o.a("date", new vh.y("endDate")).a(), new o.a("sports", new vh.y("powerToWeightSports")).a()));
        q qVarC68 = aVar41.c();
        q.a aVar42 = new q.a("heatAltitudeAcclimationScalar", f0.a.a());
        aVar42.d(p13.w.c(new p("includeHeatAltitudeAcclimation", false)));
        aVar42.b(p13.w.c(new o.a("date", new vh.y("endDate")).a()));
        q qVarC69 = aVar42.c();
        q.a aVar43 = new q.a("functionalThresholdPowerScalar", f0.a.a());
        aVar43.d(p13.w.c(new p("includeFunctionalThresholdPower", false)));
        aVar43.b(x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("fourWeeksAgo")).a()));
        q qVarC70 = aVar43.c();
        q.a aVar44 = new q.a("trainingReadinessRangeScalar", f0.a.a());
        aVar44.d(p13.w.c(new p("includeTrainingReadiness", false)));
        aVar44.b(x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("fourWeeksAgo")).a()));
        q qVarC71 = aVar44.c();
        q.a aVar45 = new q.a("trainingLoadBalanceScalar", f0.a.a());
        aVar45.d(p13.w.c(new p("includeTrainingLoadBalance", false)));
        aVar45.b(p13.w.c(new o.a("calendarDate", new vh.y("endDate")).a()));
        q qVarC72 = aVar45.c();
        q.a aVar46 = new q.a("enduranceScoreScalar", f0.a.a());
        aVar46.d(p13.w.c(new p("includeEnduranceScore", false)));
        aVar46.b(x.k(new o.a("aggregation", new vh.y("aggregationEnduranceScore")).a(), new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("twelveWeeksAgo")).a()));
        q qVarC73 = aVar46.c();
        q.a aVar47 = new q.a("hillScoreScalar", f0.a.a());
        aVar47.d(p13.w.c(new p("includeHillScore", false)));
        aVar47.b(x.k(new o.a("aggregation", new vh.y("aggregationHillScore")).a(), new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("fourWeeksAgo")).a()));
        q qVarC74 = aVar47.c();
        n.f169869a.getClass();
        q.a aVar48 = new q.a("cyclingAbility", n.a.a());
        aVar48.d(p13.w.c(new p("includeCyclingAbility", false)));
        aVar48.b(x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("fourWeeksAgo")).a()));
        aVar48.e(listK21);
        q qVarC75 = aVar48.c();
        q.a aVar49 = new q.a("userGoalsScalar", f0.a.a());
        aVar49.d(p13.w.c(new p("includeUserGoals", false)));
        q qVarC76 = aVar49.c();
        q.a aVar50 = new q.a("epochChartScalar", f0.a.a());
        aVar50.d(p13.w.c(new p("includeEpochChart", false)));
        aVar50.b(x.k(new o.a("date", new vh.y("endDate")).a(), new o.a("include", new vh.y("epochCharts")).a()));
        q qVarC77 = aVar50.c();
        q.a aVar51 = new q.a("searchActivitiesScalar", f0.a.a());
        aVar51.d(p13.w.c(new p("includeSearchActivities", false)));
        aVar51.b(x.k(new o.a("excludedActivitySubTypes", new vh.y("excludedActivitySubTypes")).a(), new o.a(MapboxMap.QFE_LIMIT, 1).a(), new o.a(TtmlNode.START, 0).a()));
        q qVarC78 = aVar51.c();
        q.a aVar52 = new q.a("latestFitnessAgeScalar", f0.a.a());
        aVar52.d(p13.w.c(new p("includeLatestFitnessAge", false)));
        aVar52.b(p13.w.c(new o.a("asOfDate", new vh.y("endDate")).a()));
        q qVarC79 = aVar52.c();
        q.a aVar53 = new q.a("dailyEventsScalar", f0.a.a());
        aVar53.d(p13.w.c(new p("includeDailyEvents", false)));
        aVar53.b(p13.w.c(new o.a("date", new vh.y("endDate")).a()));
        q qVarC80 = aVar53.c();
        q.a aVar54 = new q.a("personalRecordsScalar", f0.a.a());
        aVar54.d(p13.w.c(new p("includePersonalRecords", false)));
        q qVarC81 = aVar54.c();
        q.a aVar55 = new q.a("jetLagScalar", f0.a.a());
        aVar55.d(p13.w.c(new p("includeJetLag", false)));
        aVar55.b(p13.w.c(new o.a("date", new vh.y("endDate")).a()));
        q qVarC82 = aVar55.c();
        z0.f169919a.getClass();
        q.a aVar56 = new q.a("lifestyleLoggingStats", z0.a.a());
        aVar56.d(p13.w.c(new p("includeLifestyleLogging", false)));
        aVar56.b(x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("sevenDaysAgo")).a()));
        aVar56.e(listC2);
        q qVarC83 = aVar56.c();
        d0.f169817a.getClass();
        q.a aVar57 = new q.a("healthStatusSummary", d0.a.a());
        aVar57.d(p13.w.c(new p("includeHealthStatus", false)));
        aVar57.b(p13.w.c(new o.a("calendarDate", new vh.y("endDate")).a()));
        aVar57.e(listK24);
        q qVarC84 = aVar57.c();
        r.a aVar58 = new r.a("Query", p13.w.c("Query"));
        aVar58.b(p13.w.c(new p("extendDateRange", false)));
        aVar58.c(listC3);
        C = x.k(qVarC47, qVarC48, qVarC49, qVarC50, qVarC51, qVarC52, qVarC53, qVarC54, qVarC55, qVarC56, qVarC57, qVarC58, qVarC59, qVarC60, qVarC61, qVarC62, qVarC63, qVarC64, qVarC65, qVarC66, qVarC67, qVarC68, qVarC69, qVarC70, qVarC71, qVarC72, qVarC73, qVarC74, qVarC75, qVarC76, qVarC77, qVarC78, qVarC79, qVarC80, qVarC81, qVarC82, qVarC83, qVarC84, aVar58.a());
    }

    private e() {
    }
}
