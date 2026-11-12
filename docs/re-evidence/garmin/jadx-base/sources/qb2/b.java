package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/b;", "Lvh/a;", "Lpb2/a$c;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements vh.a<pb2.a.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f144196a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144197b = p13.w.c("pendingActivities");

    private b() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.a.c cVar) {
        pb2.a.c cVar2 = cVar;
        gVar.getClass();
        zVar.getClass();
        cVar2.getClass();
        gVar.v1("pendingActivities");
        new vh.k0(new vh.j0(new vh.k0(vh.c.b(c.f144201a, false)))).a(gVar, zVar, cVar2.f136892a);
    }

    @Override // vh.a
    public final pb2.a.c b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        List list = null;
        while (fVar.S1(f144197b) == 0) {
            list = (List) q6.f.n(new vh.j0(new vh.k0(vh.c.b(c.f144201a, false))), fVar, zVar);
        }
        return new pb2.a.c(list);
    }
}
