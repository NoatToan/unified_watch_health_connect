package tb2;

import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import ub2.b0;
import ub2.f1;
import ub2.g0;
import ub2.g1;
import ub2.j1;
import vh.a0;
import vh.o;
import vh.p;
import vh.q;
import vh.r;
import vh.s;
import vh.w;
import vh.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltb2/g;", "", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f163794a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<w> f163795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<w> f163796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<w> f163797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<w> f163798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<w> f163799f;

    static {
        g0.a aVar = g0.f169835a;
        aVar.getClass();
        a0 a0Var = g0.f169836b;
        q qVarC = new q.a("startTimestampLocal", a0Var).c();
        aVar.getClass();
        q qVarC2 = new q.a("startTimestampGmt", a0Var).c();
        aVar.getClass();
        q qVarC3 = new q.a("endTimestampLocal", a0Var).c();
        aVar.getClass();
        List<w> listK = x.k(qVarC, qVarC2, qVarC3, new q.a("endTimestampGmt", a0Var).c());
        f163795b = listK;
        b0.a aVar2 = b0.f169805a;
        aVar2.getClass();
        a0 a0Var2 = b0.f169806b;
        q qVarC4 = new q.a("__typename", s.b(a0Var2)).c();
        ub2.s.a aVar3 = ub2.s.f169889a;
        aVar3.getClass();
        a0 a0Var3 = ub2.s.f169890b;
        q qVarC5 = new q.a("calendarDate", a0Var3).c();
        j1.f169855a.getClass();
        q.a aVar4 = new q.a("wellnessChronology", j1.f169856b);
        listK.getClass();
        aVar4.f178381f = listK;
        q qVarC6 = aVar4.c();
        r.a aVar5 = new r.a("UserMetricsData", p13.w.c("UserMetricsData"));
        aVar5.f178388c = p13.w.c(new p("includeMovement", false));
        sb2.d.f158411a.getClass();
        List<w> list = sb2.d.f158417g;
        list.getClass();
        aVar5.f178389d = list;
        r rVarA = aVar5.a();
        r.a aVar6 = new r.a("UserMetricsData", p13.w.c("UserMetricsData"));
        aVar6.f178388c = p13.w.c(new p("includeHeartRate", false));
        sb2.c.f158407a.getClass();
        List<w> list2 = sb2.c.f158410d;
        list2.getClass();
        aVar6.f178389d = list2;
        r rVarA2 = aVar6.a();
        r.a aVar7 = new r.a("UserMetricsData", p13.w.c("UserMetricsData"));
        aVar7.f178388c = p13.w.c(new p("includeCalories", false));
        sb2.b.f158404a.getClass();
        List<w> list3 = sb2.b.f158406c;
        list3.getClass();
        aVar7.f178389d = list3;
        List<w> listK2 = x.k(qVarC4, qVarC5, qVarC6, rVarA, rVarA2, aVar7.a());
        f163796c = listK2;
        aVar2.getClass();
        q qVarC7 = new q.a("__typename", s.b(a0Var2)).c();
        aVar3.getClass();
        q qVarC8 = new q.a("date", a0Var3).c();
        g1.f169837a.getClass();
        q.a aVar8 = new q.a("userMetrics", g1.f169838b);
        listK2.getClass();
        aVar8.f178381f = listK2;
        q qVarC9 = aVar8.c();
        r.a aVar9 = new r.a("DailyWellnessData", p13.w.c("DailyWellnessData"));
        aVar9.f178388c = p13.w.c(new p("includeWeight", false));
        sb2.f.f158423a.getClass();
        List<w> list4 = sb2.f.f158427e;
        list4.getClass();
        aVar9.f178389d = list4;
        r rVarA3 = aVar9.a();
        r.a aVar10 = new r.a("DailyWellnessData", p13.w.c("DailyWellnessData"));
        aVar10.f178388c = p13.w.c(new p("includeSleep", false));
        sb2.e.f158418a.getClass();
        List<w> list5 = sb2.e.f158422e;
        list5.getClass();
        aVar10.f178389d = list5;
        List<w> listK3 = x.k(qVarC7, qVarC8, qVarC9, rVarA3, aVar10.a());
        f163797d = listK3;
        aVar2.getClass();
        q qVarC10 = new q.a("__typename", s.b(a0Var2)).c();
        r.a aVar11 = new r.a("UserActivities", p13.w.c("UserActivities"));
        aVar11.f178388c = p13.w.c(new p("includeActivity", false));
        sb2.a.f158396a.getClass();
        List<w> list6 = sb2.a.f158403h;
        list6.getClass();
        aVar11.f178389d = list6;
        List<w> listK4 = x.k(qVarC10, aVar11.a());
        f163798e = listK4;
        ub2.r.f169885a.getClass();
        q.a aVar12 = new q.a("dailyWellness", s.a(ub2.r.f169886b));
        List<o> listK5 = x.k(new o.a("endDate", new y("endDate")).a(), new o.a("startDate", new y("startDate")).a());
        listK5.getClass();
        aVar12.f178380e = listK5;
        listK3.getClass();
        aVar12.f178381f = listK3;
        q qVarC11 = aVar12.c();
        f1.f169831a.getClass();
        q.a aVar13 = new q.a("userActivities", f1.f169832b);
        List<o> listK6 = x.k(new o.a("displayName", new y("displayName")).a(), new o.a("endTimestampLocal", new y("activityEndTimeLocal")).a(), new o.a("startTimestampLocal", new y("activityStartTimeLocal")).a());
        listK6.getClass();
        aVar13.f178380e = listK6;
        listK4.getClass();
        aVar13.f178381f = listK4;
        f163799f = x.k(qVarC11, aVar13.c());
    }

    private g() {
    }
}
