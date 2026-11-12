package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/o;", "Lvh/a;", "Lrb2/l;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o implements vh.a<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f151747a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151748b = p13.w.c("heartRate");

    private o() {
    }

    public static l c(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        l.a aVar = null;
        while (fVar.S1(f151748b) == 0) {
            aVar = (l.a) q6.f.o(vh.c.b(m.f151743a, false), fVar, zVar);
        }
        return new l(aVar);
    }

    public static void d(zh.g gVar, vh.z zVar, l lVar) {
        gVar.getClass();
        zVar.getClass();
        lVar.getClass();
        gVar.v1("heartRate");
        new k0(vh.c.b(m.f151743a, false)).a(gVar, zVar, lVar.f151738a);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, l lVar) {
        d(gVar, zVar, lVar);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ l b(zh.f fVar, vh.z zVar) {
        return c(fVar, zVar);
    }
}
