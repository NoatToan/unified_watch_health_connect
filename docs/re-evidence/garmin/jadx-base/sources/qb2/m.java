package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/m;", "Lvh/a;", "Lpb2/c;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m implements vh.a<pb2.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f144239a = new m();

    private m() {
    }

    public static void c(zh.g gVar, vh.z zVar, pb2.c cVar) {
        gVar.getClass();
        zVar.getClass();
        cVar.getClass();
        gVar.v1("activityId");
        ub2.h0.f169841a.getClass();
        zVar.d(ub2.h0.f169842b).a(gVar, zVar, Long.valueOf(cVar.f136925a));
        gVar.v1("maxPolylineSize");
        vh.c.f178267b.a(gVar, zVar, Integer.valueOf(cVar.f136926b));
        vh.p0<List<String>> p0Var = cVar.f136927c;
        if (p0Var instanceof vh.p0.c) {
            gVar.v1("splitType");
            new vh.r0(new vh.k0(vh.c.a(vh.c.f178274i))).a(gVar, zVar, (vh.p0.c) p0Var);
        }
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, pb2.c cVar) {
        c(gVar, zVar, cVar);
    }

    @Override // vh.a
    public final pb2.c b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        throw new IllegalStateException("Input type used in output position");
    }
}
