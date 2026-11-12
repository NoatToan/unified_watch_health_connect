package rb2;

import java.util.List;
import p005kotlin.Metadata;
import ub2.h0;
import vh.j0;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/c;", "Lvh/a;", "Lrb2/a$b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements vh.a<a.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f151711a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151712b = p13.x.k("activityDetailMetrics", "activityId", "measurementCount", "metricsCount", "metricDescriptors", "totalMetricsCount");

    private c() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, a.b bVar) {
        a.b bVar2 = bVar;
        gVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        gVar.v1("activityDetailMetrics");
        new k0(new j0(new k0(vh.c.b(b.f151693a, false)))).a(gVar, zVar, bVar2.f151651a);
        gVar.v1("activityId");
        h0.f169841a.getClass();
        new k0(zVar.d(h0.f169842b)).a(gVar, zVar, bVar2.f151652b);
        gVar.v1("measurementCount");
        k0<Integer> k0Var = vh.c.f178276k;
        k0Var.a(gVar, zVar, bVar2.f151653c);
        gVar.v1("metricsCount");
        k0Var.a(gVar, zVar, bVar2.f151654d);
        gVar.v1("metricDescriptors");
        new k0(new j0(new k0(vh.c.b(g.f151727a, false)))).a(gVar, zVar, bVar2.f151655e);
        gVar.v1("totalMetricsCount");
        k0Var.a(gVar, zVar, bVar2.f151656f);
    }

    @Override // vh.a
    public final a.b b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        List list = null;
        Long l14 = null;
        Integer numB = null;
        Integer numB2 = null;
        List list2 = null;
        Integer numB3 = null;
        while (true) {
            int iS1 = fVar.S1(f151712b);
            if (iS1 == 0) {
                list = (List) q6.f.n(new j0(new k0(vh.c.b(b.f151693a, false))), fVar, zVar);
            } else if (iS1 == 1) {
                h0.f169841a.getClass();
                vh.a aVarD = zVar.d(h0.f169842b);
                vh.c.g gVar = vh.c.f178266a;
                l14 = (Long) q6.f.m(aVarD, fVar, zVar);
            } else if (iS1 == 2) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else if (iS1 == 3) {
                numB2 = vh.c.f178276k.b(fVar, zVar);
            } else if (iS1 == 4) {
                list2 = (List) q6.f.n(new j0(new k0(vh.c.b(g.f151727a, false))), fVar, zVar);
            } else {
                if (iS1 != 5) {
                    return new a.b(list, l14, numB, numB2, list2, numB3);
                }
                numB3 = vh.c.f178276k.b(fVar, zVar);
            }
        }
    }
}
