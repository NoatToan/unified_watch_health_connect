package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/g;", "Lvh/a;", "Lpb2/b$c;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements vh.a<pb2.b.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f144216a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144217b = p13.w.c("activityList");

    private g() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.b.c cVar) {
        pb2.b.c cVar2 = cVar;
        gVar.getClass();
        zVar.getClass();
        cVar2.getClass();
        gVar.v1("activityList");
        new vh.k0(new vh.j0(new vh.k0(vh.c.b(f.f144212a, false)))).a(gVar, zVar, cVar2.f136918a);
    }

    @Override // vh.a
    public final pb2.b.c b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        List list = null;
        while (fVar.S1(f144217b) == 0) {
            list = (List) q6.f.n(new vh.j0(new vh.k0(vh.c.b(f.f144212a, false))), fVar, zVar);
        }
        return new pb2.b.c(list);
    }
}
