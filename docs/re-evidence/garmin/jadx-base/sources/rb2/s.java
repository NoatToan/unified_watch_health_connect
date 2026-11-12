package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/s;", "Lvh/a;", "Lrb2/p$c;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s implements vh.a<p.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f151764a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151765b = p13.x.k("steps", "floorsAscended");

    private s() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, p.c cVar) {
        p.c cVar2 = cVar;
        gVar.getClass();
        zVar.getClass();
        cVar2.getClass();
        gVar.v1("steps");
        new k0(vh.c.b(u.f151768a, false)).a(gVar, zVar, cVar2.f151753a);
        gVar.v1("floorsAscended");
        new k0(vh.c.b(r.f151762a, false)).a(gVar, zVar, cVar2.f151754b);
    }

    @Override // vh.a
    public final p.c b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        p.d dVar = null;
        p.b bVar = null;
        while (true) {
            int iS1 = fVar.S1(f151765b);
            if (iS1 == 0) {
                dVar = (p.d) q6.f.o(vh.c.b(u.f151768a, false), fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new p.c(dVar, bVar);
                }
                bVar = (p.b) q6.f.o(vh.c.b(r.f151762a, false), fVar, zVar);
            }
        }
    }
}
