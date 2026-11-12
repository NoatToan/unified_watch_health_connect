package rb2;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/g;", "Lvh/a;", "Lrb2/a$e;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements vh.a<a.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f151727a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151728b = p13.x.k(Action.KEY_ATTRIBUTE, "metricsIndex", "unit");

    private g() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, a.e eVar) {
        a.e eVar2 = eVar;
        gVar.getClass();
        zVar.getClass();
        eVar2.getClass();
        gVar.v1(Action.KEY_ATTRIBUTE);
        vh.c.f178274i.a(gVar, zVar, eVar2.f151685a);
        gVar.v1("metricsIndex");
        vh.c.f178276k.a(gVar, zVar, eVar2.f151686b);
        gVar.v1("unit");
        new k0(vh.c.b(h.f151729a, false)).a(gVar, zVar, eVar2.f151687c);
    }

    @Override // vh.a
    public final a.e b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        String strB = null;
        Integer numB = null;
        a.f fVar2 = null;
        while (true) {
            int iS1 = fVar.S1(f151728b);
            if (iS1 == 0) {
                strB = vh.c.f178274i.b(fVar, zVar);
            } else if (iS1 == 1) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else {
                if (iS1 != 2) {
                    return new a.e(strB, numB, fVar2);
                }
                fVar2 = (a.f) q6.f.o(vh.c.b(h.f151729a, false), fVar, zVar);
            }
        }
    }
}
