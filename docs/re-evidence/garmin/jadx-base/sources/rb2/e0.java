package rb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import vh.j0;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/e0;", "Lvh/a;", "Lrb2/b0$c;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e0 implements vh.a<b0.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f151721a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151722b = p13.x.k("summaryDate", "allWeightMetrics", "latestWeight");

    private e0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, b0.c cVar) {
        b0.c cVar2 = cVar;
        gVar.getClass();
        zVar.getClass();
        cVar2.getClass();
        gVar.v1("summaryDate");
        ub2.s.f169889a.getClass();
        vh.a aVarD = zVar.d(ub2.s.f169890b);
        vh.c.g gVar2 = vh.c.f178266a;
        new k0(aVarD).a(gVar, zVar, cVar2.f151708a);
        gVar.v1("allWeightMetrics");
        new k0(new j0(new k0(vh.c.b(c0.f151713a, false)))).a(gVar, zVar, cVar2.f151709b);
        gVar.v1("latestWeight");
        new k0(vh.c.b(d0.f151717a, false)).a(gVar, zVar, cVar2.f151710c);
    }

    @Override // vh.a
    public final b0.c b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        DateTime dateTime = null;
        List list = null;
        b0.b bVar = null;
        while (true) {
            int iS1 = fVar.S1(f151722b);
            if (iS1 == 0) {
                ub2.s.f169889a.getClass();
                vh.a aVarD = zVar.d(ub2.s.f169890b);
                vh.c.g gVar = vh.c.f178266a;
                dateTime = (DateTime) q6.f.m(aVarD, fVar, zVar);
            } else if (iS1 == 1) {
                list = (List) q6.f.n(new j0(new k0(vh.c.b(c0.f151713a, false))), fVar, zVar);
            } else {
                if (iS1 != 2) {
                    return new b0.c(dateTime, list, bVar);
                }
                bVar = (b0.b) q6.f.o(vh.c.b(d0.f151717a, false), fVar, zVar);
            }
        }
    }
}
