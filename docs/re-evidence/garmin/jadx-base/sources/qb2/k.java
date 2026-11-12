package qb2;

import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/k;", "Lvh/a;", "Lpb2/b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k implements vh.a<pb2.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f144232a = new k();

    private k() {
    }

    public static void c(zh.g gVar, vh.z zVar, pb2.b bVar) {
        gVar.getClass();
        zVar.getClass();
        bVar.getClass();
        gVar.v1("startLocalDateTime");
        ub2.g0.f169835a.getClass();
        vh.a0 a0Var = ub2.g0.f169836b;
        zVar.d(a0Var).a(gVar, zVar, bVar.f136906a);
        gVar.v1("endLocalDateTime");
        zVar.d(a0Var).a(gVar, zVar, bVar.f136907b);
        gVar.v1("displayName");
        vh.c.f178266a.a(gVar, zVar, bVar.f136908c);
        vh.p0<Integer> p0Var = bVar.f136909d;
        if (p0Var instanceof vh.p0.c) {
            gVar.v1(MapboxMap.QFE_LIMIT);
            vh.c.e eVar = vh.c.f178267b;
            eVar.getClass();
            new vh.r0(eVar).a(gVar, zVar, (vh.p0.c) p0Var);
        }
        gVar.v1("includeStreaks");
        q6.f.x(bVar.f136910e, vh.c.f178271f, gVar, zVar, "streakActivityTypes");
        vh.c.a(vh.c.f178274i).a(gVar, zVar, bVar.f136911f);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, pb2.b bVar) {
        c(gVar, zVar, bVar);
    }

    @Override // vh.a
    public final pb2.b b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        throw new IllegalStateException("Input type used in output position");
    }
}
