package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/e;", "Lvh/a;", "Lpb2/b$a;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements vh.a<pb2.b.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f144208a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144209b = p13.x.k("activityListResults", "activityStreaks");

    private e() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.b.a aVar) {
        pb2.b.a aVar2 = aVar;
        gVar.getClass();
        zVar.getClass();
        aVar2.getClass();
        gVar.v1("activityListResults");
        new vh.k0(vh.c.b(g.f144216a, false)).a(gVar, zVar, aVar2.f136912a);
        gVar.v1("activityStreaks");
        new vh.k0(new vh.j0(new vh.k0(vh.c.b(h.f144220a, false)))).a(gVar, zVar, aVar2.f136913b);
    }

    @Override // vh.a
    public final pb2.b.a b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        pb2.b.c cVar = null;
        List list = null;
        while (true) {
            int iS1 = fVar.S1(f144209b);
            if (iS1 == 0) {
                cVar = (pb2.b.c) q6.f.o(vh.c.b(g.f144216a, false), fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new pb2.b.a(cVar, list);
                }
                list = (List) q6.f.n(new vh.j0(new vh.k0(vh.c.b(h.f144220a, false))), fVar, zVar);
            }
        }
    }
}
