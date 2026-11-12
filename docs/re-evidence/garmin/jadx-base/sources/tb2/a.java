package tb2;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import ub2.b0;
import ub2.f0;
import ub2.g0;
import ub2.h0;
import ub2.q0;
import ub2.r0;
import ub2.y;
import ub2.z;
import vh.a0;
import vh.o;
import vh.q;
import vh.s;
import vh.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltb2/a;", "", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f163751a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<w> f163752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<w> f163753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<w> f163754d;

    static {
        b0.a aVar = b0.f169805a;
        aVar.getClass();
        a0 a0Var = b0.f169806b;
        q qVarC = new q.a("pendingActivityUUID", s.b(a0Var)).c();
        ub2.s.f169889a.getClass();
        q qVarC2 = new q.a("calendarDate", s.b(ub2.s.f169890b)).c();
        g0.a aVar2 = g0.f169835a;
        aVar2.getClass();
        a0 a0Var2 = g0.f169836b;
        q qVarC3 = new q.a("startTimeLocal", a0Var2).c();
        aVar2.getClass();
        q qVarC4 = new q.a("endTimeLocal", a0Var2).c();
        aVar2.getClass();
        q qVarC5 = new q.a("startTimeGMT", a0Var2).c();
        aVar2.getClass();
        q qVarC6 = new q.a("endTimeGMT", a0Var2).c();
        z.a aVar3 = z.f169917a;
        aVar3.getClass();
        a0 a0Var3 = z.f169918b;
        q qVarC7 = new q.a("averageHR", a0Var3).c();
        h0.f169841a.getClass();
        q qVarC8 = new q.a("deviceId", h0.f169842b).c();
        aVar3.getClass();
        q qVarC9 = new q.a("calories", a0Var3).c();
        aVar3.getClass();
        q qVarC10 = new q.a("duration", a0Var3).c();
        y.f169913a.getClass();
        q qVarC11 = new q.a("hasLocationData", y.f169914b).c();
        aVar.getClass();
        List<w> listK = x.k(qVarC, qVarC2, qVarC3, qVarC4, qVarC5, qVarC6, qVarC7, qVarC8, qVarC9, qVarC10, qVarC11, new q.a("activityTypePredictionKeys", s.a(a0Var)).c());
        f163752b = listK;
        r0.f169887a.getClass();
        q.a aVar4 = new q.a("pendingActivities", s.a(r0.f169888b));
        listK.getClass();
        aVar4.f178381f = listK;
        List<w> listC = p13.w.c(aVar4.c());
        f163753c = listC;
        f0.a aVar5 = f0.f169829a;
        aVar5.getClass();
        a0 a0Var4 = f0.f169830b;
        q.a aVar6 = new q.a("activitiesScalar", a0Var4);
        List<o> listK2 = x.k(new o.a("displayName", new vh.y("displayName")).a(), new o.a("endTimestampLocal", new vh.y("endDateLocal")).a(), new o.a(MapboxMap.QFE_LIMIT, new vh.y("activityLimit")).a(), new o.a("startTimestampLocal", new vh.y("startDateLocal")).a());
        listK2.getClass();
        aVar6.f178380e = listK2;
        q qVarC12 = aVar6.c();
        aVar5.getClass();
        q.a aVar7 = new q.a("workoutScheduleSummariesScalar", a0Var4);
        List<o> listK3 = x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("startDate")).a());
        listK3.getClass();
        aVar7.f178380e = listK3;
        q qVarC13 = aVar7.c();
        aVar5.getClass();
        q.a aVar8 = new q.a("healthSnapshotScalar", a0Var4);
        List<o> listK4 = x.k(new o.a("endDate", new vh.y("endDate")).a(), new o.a("startDate", new vh.y("startDate")).a());
        listK4.getClass();
        aVar8.f178380e = listK4;
        q qVarC14 = aVar8.c();
        aVar5.getClass();
        q.a aVar9 = new q.a("golfScorecardScalar", a0Var4);
        List<o> listK5 = x.k(new o.a("endTimestampLocal", new vh.y("endDateLocal")).a(), new o.a("startTimestampLocal", new vh.y("startDateLocal")).a());
        listK5.getClass();
        aVar9.f178380e = listK5;
        q qVarC15 = aVar9.c();
        q0.f169883a.getClass();
        q.a aVar10 = new q.a("pendingActivities", q0.f169884b);
        aVar10.f178381f = listC;
        f163754d = x.k(qVarC12, qVarC13, qVarC14, qVarC15, aVar10.c());
    }

    private a() {
    }
}
