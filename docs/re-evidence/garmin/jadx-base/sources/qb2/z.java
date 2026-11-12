package qb2;

import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/z;", "Lvh/a;", "Lpb2/e$l;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z implements vh.a<pb2.e.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f144287a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144288b = p13.x.k("calendarDate", "outliersCount", "createTimestampUTC", "updateTimestampUTC", "metrics");

    private z() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.l lVar) {
        pb2.e.l lVar2 = lVar;
        gVar.getClass();
        zVar.getClass();
        lVar2.getClass();
        gVar.v1("calendarDate");
        ub2.s.f169889a.getClass();
        vh.a aVarD = zVar.d(ub2.s.f169890b);
        vh.c.g gVar2 = vh.c.f178266a;
        new vh.k0(aVarD).a(gVar, zVar, lVar2.f137057a);
        gVar.v1("outliersCount");
        vh.c.f178276k.a(gVar, zVar, lVar2.f137058b);
        gVar.v1("createTimestampUTC");
        ub2.g0.f169835a.getClass();
        vh.a0 a0Var = ub2.g0.f169836b;
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, lVar2.f137059c);
        gVar.v1("updateTimestampUTC");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, lVar2.f137060d);
        gVar.v1("metrics");
        new vh.k0(new vh.j0(new vh.k0(vh.c.b(g0.f144218a, false)))).a(gVar, zVar, lVar2.f137061e);
    }

    @Override // vh.a
    public final pb2.e.l b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        DateTime dateTime = null;
        Integer numB = null;
        LocalDateTime localDateTime = null;
        LocalDateTime localDateTime2 = null;
        List list = null;
        while (true) {
            int iS1 = fVar.S1(f144288b);
            if (iS1 == 0) {
                ub2.s.f169889a.getClass();
                vh.a aVarD = zVar.d(ub2.s.f169890b);
                vh.c.g gVar = vh.c.f178266a;
                dateTime = (DateTime) q6.f.m(aVarD, fVar, zVar);
            } else if (iS1 == 1) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else if (iS1 == 2) {
                ub2.g0.f169835a.getClass();
                vh.a aVarD2 = zVar.d(ub2.g0.f169836b);
                vh.c.g gVar2 = vh.c.f178266a;
                localDateTime = (LocalDateTime) q6.f.m(aVarD2, fVar, zVar);
            } else if (iS1 == 3) {
                ub2.g0.f169835a.getClass();
                vh.a aVarD3 = zVar.d(ub2.g0.f169836b);
                vh.c.g gVar3 = vh.c.f178266a;
                localDateTime2 = (LocalDateTime) q6.f.m(aVarD3, fVar, zVar);
            } else {
                if (iS1 != 4) {
                    return new pb2.e.l(dateTime, numB, localDateTime, localDateTime2, list);
                }
                list = (List) q6.f.n(new vh.j0(new vh.k0(vh.c.b(g0.f144218a, false))), fVar, zVar);
            }
        }
    }
}
