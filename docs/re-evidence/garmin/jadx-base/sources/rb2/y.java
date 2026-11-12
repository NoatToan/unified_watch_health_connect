package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.j0;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/y;", "Lvh/a;", "Lrb2/w$b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y implements vh.a<w.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f151794a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151795b = p13.x.k("dailySleepDTO", "sleepLevels");

    private y() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, w.b bVar) {
        w.b bVar2 = bVar;
        gVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        gVar.v1("dailySleepDTO");
        new k0(vh.c.b(x.f151792a, false)).a(gVar, zVar, bVar2.f151787a);
        gVar.v1("sleepLevels");
        new k0(new j0(new k0(vh.c.b(a0.f151691a, false)))).a(gVar, zVar, bVar2.f151788b);
    }

    @Override // vh.a
    public final w.b b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        w.a aVar = null;
        List list = null;
        while (true) {
            int iS1 = fVar.S1(f151795b);
            if (iS1 == 0) {
                aVar = (w.a) q6.f.o(vh.c.b(x.f151792a, false), fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new w.b(aVar, list);
                }
                list = (List) q6.f.n(new j0(new k0(vh.c.b(a0.f151691a, false))), fVar, zVar);
            }
        }
    }
}
