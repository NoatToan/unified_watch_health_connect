package qb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/r;", "Lvh/a;", "Lpb2/e$c;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r implements vh.a<pb2.e.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f144257a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144258b = p13.x.k("startDate", "endDate", "caloriesBurned", "mealNutritionContents", "dailyNutritionContents", "averageNutritionContents");

    private r() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.c cVar) {
        pb2.e.c cVar2 = cVar;
        gVar.getClass();
        zVar.getClass();
        cVar2.getClass();
        gVar.v1("startDate");
        ub2.s.f169889a.getClass();
        vh.a0 a0Var = ub2.s.f169890b;
        zVar.d(a0Var).a(gVar, zVar, cVar2.f136979a);
        gVar.v1("endDate");
        zVar.d(a0Var).a(gVar, zVar, cVar2.f136980b);
        gVar.v1("caloriesBurned");
        new vh.k0(vh.c.b(s.f144260a, false)).a(gVar, zVar, cVar2.f136981c);
        gVar.v1("mealNutritionContents");
        new vh.k0(new vh.j0(vh.c.b(e0.f144210a, false))).a(gVar, zVar, cVar2.f136982d);
        gVar.v1("dailyNutritionContents");
        new vh.k0(new vh.j0(vh.c.b(v.f144271a, false))).a(gVar, zVar, cVar2.f136983e);
        gVar.v1("averageNutritionContents");
        new vh.k0(vh.c.b(p.f144249a, false)).a(gVar, zVar, cVar2.f136984f);
    }

    @Override // vh.a
    public final pb2.e.c b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        DateTime dateTime = null;
        DateTime dateTime2 = null;
        pb2.e.d dVar = null;
        List list = null;
        List list2 = null;
        pb2.e.a aVar = null;
        while (true) {
            int iS1 = fVar.S1(f144258b);
            if (iS1 == 0) {
                ub2.s.f169889a.getClass();
                dateTime = (DateTime) zVar.d(ub2.s.f169890b).b(fVar, zVar);
            } else if (iS1 == 1) {
                ub2.s.f169889a.getClass();
                dateTime2 = (DateTime) zVar.d(ub2.s.f169890b).b(fVar, zVar);
            } else if (iS1 == 2) {
                dVar = (pb2.e.d) q6.f.o(vh.c.b(s.f144260a, false), fVar, zVar);
            } else if (iS1 == 3) {
                list = (List) q6.f.n(new vh.j0(vh.c.b(e0.f144210a, false)), fVar, zVar);
            } else if (iS1 == 4) {
                list2 = (List) q6.f.n(new vh.j0(vh.c.b(v.f144271a, false)), fVar, zVar);
            } else {
                if (iS1 != 5) {
                    dateTime.getClass();
                    dateTime2.getClass();
                    return new pb2.e.c(dateTime, dateTime2, dVar, list, list2, aVar);
                }
                aVar = (pb2.e.a) q6.f.o(vh.c.b(p.f144249a, false), fVar, zVar);
            }
        }
    }
}
