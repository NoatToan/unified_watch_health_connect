package qb2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/z0;", "Lvh/a;", "Lpb2/g;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z0 implements vh.a<pb2.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f144289a = new z0();

    private z0() {
    }

    public static void c(zh.g gVar, vh.z zVar, pb2.g gVar2) {
        gVar.getClass();
        zVar.getClass();
        gVar2.getClass();
        gVar.v1("startDate");
        ub2.s.f169889a.getClass();
        vh.a0 a0Var = ub2.s.f169890b;
        zVar.d(a0Var).a(gVar, zVar, gVar2.f137125a);
        gVar.v1("endDate");
        zVar.d(a0Var).a(gVar, zVar, gVar2.f137126b);
        gVar.v1("activityStartTimeLocal");
        ub2.g0.f169835a.getClass();
        vh.a0 a0Var2 = ub2.g0.f169836b;
        zVar.d(a0Var2).a(gVar, zVar, gVar2.f137127c);
        gVar.v1("activityEndTimeLocal");
        zVar.d(a0Var2).a(gVar, zVar, gVar2.f137128d);
        gVar.v1("displayName");
        vh.c.f178266a.a(gVar, zVar, gVar2.f137129e);
        gVar.v1("includeMovement");
        vh.c.b bVar = vh.c.f178271f;
        q6.f.x(gVar2.f137130f, bVar, gVar, zVar, "includeWeight");
        q6.f.x(gVar2.f137131g, bVar, gVar, zVar, "includeSleep");
        q6.f.x(gVar2.f137132h, bVar, gVar, zVar, "includeActivity");
        q6.f.x(gVar2.f137133i, bVar, gVar, zVar, "includeHeartRate");
        q6.f.x(gVar2.f137134j, bVar, gVar, zVar, "includeCalories");
        bVar.a(gVar, zVar, Boolean.valueOf(gVar2.f137135k));
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, pb2.g gVar2) {
        c(gVar, zVar, gVar2);
    }

    @Override // vh.a
    public final pb2.g b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        throw new IllegalStateException("Input type used in output position");
    }
}
