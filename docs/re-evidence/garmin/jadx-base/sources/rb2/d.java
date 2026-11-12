package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.j0;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/d;", "Lvh/a;", "Lrb2/a;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements vh.a<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f151715a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151716b = p13.w.c("activityList");

    private d() {
    }

    public static a c(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        List list = null;
        while (fVar.S1(f151716b) == 0) {
            list = (List) q6.f.n(new j0(new k0(vh.c.b(e.f151719a, false))), fVar, zVar);
        }
        return new a(list);
    }

    public static void d(zh.g gVar, vh.z zVar, a aVar) {
        gVar.getClass();
        zVar.getClass();
        aVar.getClass();
        gVar.v1("activityList");
        new k0(new j0(new k0(vh.c.b(e.f151719a, false)))).a(gVar, zVar, aVar.f151649a);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, a aVar) {
        d(gVar, zVar, aVar);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ a b(zh.f fVar, vh.z zVar) {
        return c(fVar, zVar);
    }
}
