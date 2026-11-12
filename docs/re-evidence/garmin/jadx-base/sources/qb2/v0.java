package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/v0;", "Lvh/a;", "Lpb2/g$c;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v0 implements vh.a<pb2.g.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f144273a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144274b = p13.x.k("dailyWellness", "userActivities");

    private v0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.g.c cVar) {
        pb2.g.c cVar2 = cVar;
        gVar.getClass();
        zVar.getClass();
        cVar2.getClass();
        gVar.v1("dailyWellness");
        new vh.k0(new vh.j0(new vh.k0(vh.c.b(u0.f144269a, true)))).a(gVar, zVar, cVar2.f137141a);
        gVar.v1("userActivities");
        new vh.k0(vh.c.b(w0.f144277a, true)).a(gVar, zVar, cVar2.f137142b);
    }

    @Override // vh.a
    public final pb2.g.c b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        List list = null;
        pb2.g.d dVar = null;
        while (true) {
            int iS1 = fVar.S1(f144274b);
            if (iS1 == 0) {
                list = (List) q6.f.n(new vh.j0(new vh.k0(vh.c.b(u0.f144269a, true))), fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new pb2.g.c(list, dVar);
                }
                dVar = (pb2.g.d) q6.f.o(vh.c.b(w0.f144277a, true), fVar, zVar);
            }
        }
    }
}
