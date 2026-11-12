package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/z;", "Lvh/a;", "Lrb2/w;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z implements vh.a<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f151796a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151797b = p13.w.c("sleep");

    private z() {
    }

    public static w c(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        w.b bVar = null;
        while (fVar.S1(f151797b) == 0) {
            bVar = (w.b) q6.f.o(vh.c.b(y.f151794a, false), fVar, zVar);
        }
        return new w(bVar);
    }

    public static void d(zh.g gVar, vh.z zVar, w wVar) {
        gVar.getClass();
        zVar.getClass();
        wVar.getClass();
        gVar.v1("sleep");
        new k0(vh.c.b(y.f151794a, false)).a(gVar, zVar, wVar.f151772a);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, w wVar) {
        d(gVar, zVar, wVar);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ w b(zh.f fVar, vh.z zVar) {
        return c(fVar, zVar);
    }
}
