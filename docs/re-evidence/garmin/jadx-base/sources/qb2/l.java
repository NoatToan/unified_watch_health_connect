package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/l;", "Lvh/a;", "Lpb2/c$b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements vh.a<pb2.c.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f144235a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144236b = p13.w.c("activityPolylineScalar");

    private l() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.c.b bVar) {
        pb2.c.b bVar2 = bVar;
        gVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        gVar.v1("activityPolylineScalar");
        vh.c.f178278m.a(gVar, zVar, bVar2.f136928a);
    }

    @Override // vh.a
    public final pb2.c.b b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Object objB = null;
        while (fVar.S1(f144236b) == 0) {
            objB = vh.c.f178278m.b(fVar, zVar);
        }
        return new pb2.c.b(objB);
    }
}
