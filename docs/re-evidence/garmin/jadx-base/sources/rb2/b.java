package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/b;", "Lvh/a;", "Lrb2/a$a;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements vh.a<a.C2855a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f151693a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151694b = p13.w.c("metrics");

    private b() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, a.C2855a c2855a) {
        a.C2855a c2855a2 = c2855a;
        gVar.getClass();
        zVar.getClass();
        c2855a2.getClass();
        gVar.v1("metrics");
        new k0(vh.c.a(vh.c.f178275j)).a(gVar, zVar, c2855a2.f151650a);
    }

    @Override // vh.a
    public final a.C2855a b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        List list = null;
        while (fVar.S1(f151694b) == 0) {
            list = (List) q6.f.n(vh.c.a(vh.c.f178275j), fVar, zVar);
        }
        return new a.C2855a(list);
    }
}
