package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/t;", "Lvh/a;", "Lrb2/p;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t implements vh.a<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f151766a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151767b = p13.w.c("movement");

    private t() {
    }

    public static p c(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        p.c cVar = null;
        while (fVar.S1(f151767b) == 0) {
            cVar = (p.c) q6.f.o(vh.c.b(s.f151764a, false), fVar, zVar);
        }
        return new p(cVar);
    }

    public static void d(zh.g gVar, vh.z zVar, p pVar) {
        gVar.getClass();
        zVar.getClass();
        pVar.getClass();
        gVar.v1("movement");
        new k0(vh.c.b(s.f151764a, false)).a(gVar, zVar, pVar.f151749a);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, p pVar) {
        d(gVar, zVar, pVar);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ p b(zh.f fVar, vh.z zVar) {
        return c(fVar, zVar);
    }
}
