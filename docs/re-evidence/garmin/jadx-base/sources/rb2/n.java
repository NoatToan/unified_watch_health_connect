package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.j0;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/n;", "Lvh/a;", "Lrb2/l$b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n implements vh.a<l.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f151745a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151746b = p13.x.k("labels", "data");

    private n() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, l.b bVar) {
        l.b bVar2 = bVar;
        gVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        gVar.v1("labels");
        new k0(vh.c.a(vh.c.f178274i)).a(gVar, zVar, bVar2.f151741a);
        gVar.v1("data");
        new k0(new j0(new k0(vh.c.a(vh.c.f178278m)))).a(gVar, zVar, bVar2.f151742b);
    }

    @Override // vh.a
    public final l.b b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        List list = null;
        List list2 = null;
        while (true) {
            int iS1 = fVar.S1(f151746b);
            if (iS1 == 0) {
                list = (List) q6.f.n(vh.c.a(vh.c.f178274i), fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new l.b(list, list2);
                }
                list2 = (List) q6.f.n(new j0(new k0(vh.c.a(vh.c.f178278m))), fVar, zVar);
            }
        }
    }
}
