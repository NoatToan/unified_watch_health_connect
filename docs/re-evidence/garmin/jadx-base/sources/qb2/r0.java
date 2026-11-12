package qb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/r0;", "Lvh/a;", "Lpb2/e;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r0 implements vh.a<pb2.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f144259a = new r0();

    private r0() {
    }

    public static void c(zh.g gVar, vh.z zVar, pb2.e eVar) {
        gVar.getClass();
        zVar.getClass();
        eVar.getClass();
        vh.p0<List<String>> p0Var = eVar.Y;
        vh.p0<List<String>> p0Var2 = eVar.Q;
        vh.p0<List<String>> p0Var3 = eVar.E;
        gVar.v1("sevenDaysAgo");
        ub2.s.f169889a.getClass();
        vh.a0 a0Var = ub2.s.f169890b;
        zVar.d(a0Var).a(gVar, zVar, eVar.f136936a);
        gVar.v1("fourWeeksAgo");
        zVar.d(a0Var).a(gVar, zVar, eVar.f136938b);
        gVar.v1("twelveWeeksAgo");
        zVar.d(a0Var).a(gVar, zVar, eVar.f136939c);
        gVar.v1("oneYearAgo");
        zVar.d(a0Var).a(gVar, zVar, eVar.f136940d);
        gVar.v1("endDate");
        zVar.d(a0Var).a(gVar, zVar, eVar.f136941e);
        vh.p0<DateTime> p0Var4 = eVar.f136942f;
        if (p0Var4 instanceof vh.p0.c) {
            gVar.v1("currentDate");
            vh.a aVarD = zVar.d(a0Var);
            vh.c.g gVar2 = vh.c.f178266a;
            new vh.r0(new vh.k0(aVarD)).a(gVar, zVar, (vh.p0.c) p0Var4);
        }
        gVar.v1("displayName");
        vh.c.g gVar3 = vh.c.f178266a;
        gVar3.a(gVar, zVar, eVar.f136943g);
        gVar.v1("userSummariesStartDate");
        zVar.d(a0Var).a(gVar, zVar, eVar.f136944h);
        gVar.v1("includeBloodPressure");
        vh.c.b bVar = vh.c.f178271f;
        q6.f.x(eVar.f136945i, bVar, gVar, zVar, "includeCriticalSwimSpeed");
        q6.f.x(eVar.f136946j, bVar, gVar, zVar, "aggregationCriticalSwimSpeed");
        gVar3.a(gVar, zVar, eVar.f136947k);
        gVar.v1("includeDailyNutritionSummary");
        q6.f.x(eVar.f136948l, bVar, gVar, zVar, "includeHeartRate");
        q6.f.x(eVar.f136949m, bVar, gVar, zVar, "includeHeartRateZone");
        q6.f.x(eVar.f136950n, bVar, gVar, zVar, "includeHeartRateVariability");
        q6.f.x(eVar.f136951o, bVar, gVar, zVar, "includeMenstrualCycle");
        q6.f.x(eVar.f136952p, bVar, gVar, zVar, "includeMenstrualLog");
        q6.f.x(eVar.f136953q, bVar, gVar, zVar, "includeSp02Acclimation");
        q6.f.x(eVar.f136954r, bVar, gVar, zVar, "includeSleep");
        q6.f.x(eVar.f136955s, bVar, gVar, zVar, "includeSleepSummaries");
        q6.f.x(eVar.f136956t, bVar, gVar, zVar, "sleepSummariesStartDate");
        zVar.d(a0Var).a(gVar, zVar, eVar.f136957u);
        gVar.v1("includeUserDailySummary");
        q6.f.x(eVar.f136958v, bVar, gVar, zVar, "includeWeight");
        q6.f.x(eVar.f136959w, bVar, gVar, zVar, "includeV02Max");
        q6.f.x(eVar.f136960x, bVar, gVar, zVar, "includeTrainingStatusDaily");
        q6.f.x(eVar.f136961y, bVar, gVar, zVar, "includeTrainingStatusWeekly");
        q6.f.x(eVar.f136962z, bVar, gVar, zVar, "includeRunningLactateThreshold");
        q6.f.x(eVar.A, bVar, gVar, zVar, "includeRunningTolerance");
        q6.f.x(eVar.B, bVar, gVar, zVar, "includeRunningEconomy");
        q6.f.x(eVar.C, bVar, gVar, zVar, "includePowerToWeight");
        bVar.a(gVar, zVar, Boolean.valueOf(eVar.D));
        if (p0Var3 instanceof vh.p0.c) {
            gVar.v1("powerToWeightSports");
            new vh.r0(new vh.k0(vh.c.a(vh.c.f178274i))).a(gVar, zVar, (vh.p0.c) p0Var3);
        }
        gVar.v1("includeHeatAltitudeAcclimation");
        q6.f.x(eVar.F, bVar, gVar, zVar, "includeFunctionalThresholdPower");
        q6.f.x(eVar.G, bVar, gVar, zVar, "includeTrainingReadiness");
        q6.f.x(eVar.H, bVar, gVar, zVar, "includeTrainingLoadBalance");
        q6.f.x(eVar.I, bVar, gVar, zVar, "includeEnduranceScore");
        q6.f.x(eVar.J, bVar, gVar, zVar, "aggregationEnduranceScore");
        gVar3.a(gVar, zVar, eVar.K);
        gVar.v1("includeHillScore");
        q6.f.x(eVar.L, bVar, gVar, zVar, "aggregationHillScore");
        gVar3.a(gVar, zVar, eVar.M);
        gVar.v1("includeCyclingAbility");
        q6.f.x(eVar.N, bVar, gVar, zVar, "includeUserGoals");
        q6.f.x(eVar.O, bVar, gVar, zVar, "includeEpochChart");
        bVar.a(gVar, zVar, Boolean.valueOf(eVar.P));
        if (p0Var2 instanceof vh.p0.c) {
            gVar.v1("epochCharts");
            new vh.r0(new vh.k0(vh.c.a(vh.c.f178274i))).a(gVar, zVar, (vh.p0.c) p0Var2);
        }
        gVar.v1("includeSearchActivities");
        q6.f.x(eVar.R, bVar, gVar, zVar, "includeLatestFitnessAge");
        q6.f.x(eVar.S, bVar, gVar, zVar, "includeDailyEvents");
        q6.f.x(eVar.T, bVar, gVar, zVar, "includePersonalRecords");
        q6.f.x(eVar.U, bVar, gVar, zVar, "includeJetLag");
        q6.f.x(eVar.V, bVar, gVar, zVar, "includeLifestyleLogging");
        q6.f.x(eVar.W, bVar, gVar, zVar, "includeHealthStatus");
        bVar.a(gVar, zVar, Boolean.valueOf(eVar.X));
        if (p0Var instanceof vh.p0.c) {
            gVar.v1("excludedActivitySubTypes");
            new vh.r0(new vh.k0(vh.c.a(vh.c.f178274i))).a(gVar, zVar, (vh.p0.c) p0Var);
        }
        gVar.v1("extendDateRange");
        q6.f.x(eVar.Z, bVar, gVar, zVar, "extendedDateRangeStart");
        zVar.d(a0Var).a(gVar, zVar, eVar.f136937a0);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, pb2.e eVar) {
        c(gVar, zVar, eVar);
    }

    @Override // vh.a
    public final pb2.e b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        throw new IllegalStateException("Input type used in output position");
    }
}
