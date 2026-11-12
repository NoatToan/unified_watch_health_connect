package qb2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/d;", "Lvh/a;", "Lpb2/a;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements vh.a<pb2.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f144205a = new d();

    private d() {
    }

    public static void c(zh.g gVar, vh.z zVar, pb2.a aVar) {
        gVar.getClass();
        zVar.getClass();
        aVar.getClass();
        gVar.v1("startDate");
        ub2.s.f169889a.getClass();
        vh.a0 a0Var = ub2.s.f169890b;
        zVar.d(a0Var).a(gVar, zVar, aVar.f136881a);
        gVar.v1("endDate");
        zVar.d(a0Var).a(gVar, zVar, aVar.f136882b);
        gVar.v1("startDateLocal");
        ub2.g0.f169835a.getClass();
        vh.a0 a0Var2 = ub2.g0.f169836b;
        zVar.d(a0Var2).a(gVar, zVar, aVar.f136883c);
        gVar.v1("endDateLocal");
        zVar.d(a0Var2).a(gVar, zVar, aVar.f136884d);
        gVar.v1("displayName");
        vh.c.f178266a.a(gVar, zVar, aVar.f136885e);
        vh.p0<Integer> p0Var = aVar.f136886f;
        if (p0Var instanceof vh.p0.c) {
            gVar.v1("activityLimit");
            vh.c.e eVar = vh.c.f178267b;
            eVar.getClass();
            new vh.r0(eVar).a(gVar, zVar, (vh.p0.c) p0Var);
        }
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, pb2.a aVar) {
        c(gVar, zVar, aVar);
    }

    @Override // vh.a
    public final pb2.a b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        throw new IllegalStateException("Input type used in output position");
    }
}
