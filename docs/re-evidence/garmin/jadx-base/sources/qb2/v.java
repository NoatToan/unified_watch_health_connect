package qb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/v;", "Lvh/a;", "Lpb2/e$h;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v implements vh.a<pb2.e.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f144271a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144272b = p13.x.k("mealDate", "nutritionContent", "nutritionGoals");

    private v() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.h hVar) {
        pb2.e.h hVar2 = hVar;
        gVar.getClass();
        zVar.getClass();
        hVar2.getClass();
        gVar.v1("mealDate");
        ub2.s.f169889a.getClass();
        zVar.d(ub2.s.f169890b).a(gVar, zVar, hVar2.f136996a);
        gVar.v1("nutritionContent");
        new vh.k0(vh.c.b(h0.f144222a, false)).a(gVar, zVar, hVar2.f136997b);
        gVar.v1("nutritionGoals");
        new vh.k0(vh.c.b(j0.f144230a, false)).a(gVar, zVar, hVar2.f136998c);
    }

    @Override // vh.a
    public final pb2.e.h b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        DateTime dateTime = null;
        pb2.e.t tVar = null;
        pb2.e.v vVar = null;
        while (true) {
            int iS1 = fVar.S1(f144272b);
            if (iS1 == 0) {
                ub2.s.f169889a.getClass();
                dateTime = (DateTime) zVar.d(ub2.s.f169890b).b(fVar, zVar);
            } else if (iS1 == 1) {
                tVar = (pb2.e.t) q6.f.o(vh.c.b(h0.f144222a, false), fVar, zVar);
            } else {
                if (iS1 != 2) {
                    dateTime.getClass();
                    return new pb2.e.h(dateTime, tVar, vVar);
                }
                vVar = (pb2.e.v) q6.f.o(vh.c.b(j0.f144230a, false), fVar, zVar);
            }
        }
    }
}
