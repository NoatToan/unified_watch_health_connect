package tb2;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import ub2.a1;
import ub2.b0;
import ub2.g0;
import ub2.h0;
import ub2.z;
import vh.a0;
import vh.o;
import vh.p;
import vh.q;
import vh.s;
import vh.w;
import vh.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltb2/b;", "", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f163755a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<w> f163756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<w> f163757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<w> f163758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<w> f163759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<w> f163760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List<w> f163761g;

    static {
        b0.a aVar = b0.f169805a;
        aVar.getClass();
        a0 a0Var = b0.f169806b;
        q qVarC = new q.a("typeKey", a0Var).c();
        h0.f169841a.getClass();
        List<w> listK = x.k(qVarC, new q.a("parentTypeId", h0.f169842b).c());
        f163756b = listK;
        g0.f169835a.getClass();
        q qVarC2 = new q.a("startTimeLocal", g0.f169836b).c();
        ub2.g.f169833a.getClass();
        q.a aVar2 = new q.a("activityType", ub2.g.f169834b);
        listK.getClass();
        aVar2.f178381f = listK;
        q qVarC3 = aVar2.c();
        z.a aVar3 = z.f169917a;
        aVar3.getClass();
        a0 a0Var2 = z.f169918b;
        q qVarC4 = new q.a("distance", a0Var2).c();
        aVar3.getClass();
        List<w> listK2 = x.k(qVarC2, qVarC3, qVarC4, new q.a("duration", a0Var2).c());
        f163757c = listK2;
        a1.f169801a.getClass();
        q.a aVar4 = new q.a("activityList", s.a(a1.f169802b));
        listK2.getClass();
        aVar4.f178381f = listK2;
        List<w> listC = p13.w.c(aVar4.c());
        f163758d = listC;
        aVar.getClass();
        q qVarC5 = new q.a("activityType", s.b(a0Var)).c();
        ub2.s.f169889a.getClass();
        List<w> listK3 = x.k(qVarC5, new q.a("streakStartLocalDate", ub2.s.f169890b).c());
        f163759e = listK3;
        ub2.e.f169821a.getClass();
        q.a aVar5 = new q.a("activityListResults", ub2.e.f169822b);
        aVar5.f178381f = listC;
        q qVarC6 = aVar5.c();
        ub2.f.f169827a.getClass();
        q.a aVar6 = new q.a("activityStreaks", s.a(ub2.f.f169828b));
        aVar6.f178379d = p13.w.c(new p("includeStreaks", false));
        aVar6.f178380e = p13.w.c(new o.a("activityTypes", new y("streakActivityTypes")).a());
        listK3.getClass();
        aVar6.f178381f = listK3;
        List<w> listK4 = x.k(qVarC6, aVar6.c());
        f163760f = listK4;
        ub2.a.f169797a.getClass();
        q.a aVar7 = new q.a("activities", ub2.a.f169798b);
        List<o> listK5 = x.k(new o.a("displayName", new y("displayName")).a(), new o.a("endTimestampLocal", new y("endLocalDateTime")).a(), new o.a(MapboxMap.QFE_LIMIT, new y(MapboxMap.QFE_LIMIT)).a(), new o.a("startTimestampLocal", new y("startLocalDateTime")).a());
        listK5.getClass();
        aVar7.f178380e = listK5;
        listK4.getClass();
        aVar7.f178381f = listK4;
        f163761g = p13.w.c(aVar7.c());
    }

    private b() {
    }
}
