package qb2;

import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/x;", "Lvh/a;", "Lpb2/e$j;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x implements vh.a<pb2.e.j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f144279a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144280b = p13.x.k("userProfilePk", "calendarDate", "symptoms", "moods", "discharge", "flow", "sexDrive", "sexualActivity", "notes", "reportTimestamp", "babyMovements", "hasGlucoseLog", "hasBabyMovement", "ovulationDay");

    private x() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.j jVar) {
        pb2.e.j jVar2 = jVar;
        gVar.getClass();
        zVar.getClass();
        jVar2.getClass();
        gVar.v1("userProfilePk");
        ub2.h0.f169841a.getClass();
        vh.a aVarD = zVar.d(ub2.h0.f169842b);
        vh.c.g gVar2 = vh.c.f178266a;
        new vh.k0(aVarD).a(gVar, zVar, jVar2.f137025a);
        gVar.v1("calendarDate");
        ub2.s.f169889a.getClass();
        new vh.k0(zVar.d(ub2.s.f169890b)).a(gVar, zVar, jVar2.f137026b);
        gVar.v1("symptoms");
        vh.k0<String> k0Var = vh.c.f178274i;
        new vh.k0(vh.c.a(k0Var)).a(gVar, zVar, jVar2.f137027c);
        gVar.v1("moods");
        new vh.k0(new vh.j0(k0Var)).a(gVar, zVar, jVar2.f137028d);
        gVar.v1("discharge");
        new vh.k0(new vh.j0(k0Var)).a(gVar, zVar, jVar2.f137029e);
        gVar.v1("flow");
        k0Var.a(gVar, zVar, jVar2.f137030f);
        gVar.v1("sexDrive");
        k0Var.a(gVar, zVar, jVar2.f137031g);
        gVar.v1("sexualActivity");
        k0Var.a(gVar, zVar, jVar2.f137032h);
        gVar.v1("notes");
        k0Var.a(gVar, zVar, jVar2.f137033i);
        gVar.v1("reportTimestamp");
        ub2.g0.f169835a.getClass();
        new vh.k0(zVar.d(ub2.g0.f169836b)).a(gVar, zVar, jVar2.f137034j);
        gVar.v1("babyMovements");
        new vh.k0(new vh.j0(new vh.k0(vh.c.b(q.f144253a, false)))).a(gVar, zVar, jVar2.f137035k);
        gVar.v1("hasGlucoseLog");
        vh.k0<Boolean> k0Var2 = vh.c.f178277l;
        k0Var2.a(gVar, zVar, jVar2.f137036l);
        gVar.v1("hasBabyMovement");
        k0Var2.a(gVar, zVar, jVar2.f137037m);
        gVar.v1("ovulationDay");
        k0Var2.a(gVar, zVar, jVar2.f137038n);
    }

    @Override // vh.a
    public final pb2.e.j b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Long l14 = null;
        DateTime dateTime = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        String strB4 = null;
        LocalDateTime localDateTime = null;
        List list4 = null;
        Boolean boolB = null;
        Boolean boolB2 = null;
        Boolean boolB3 = null;
        while (true) {
            switch (fVar.S1(f144280b)) {
                case 0:
                    ub2.h0.f169841a.getClass();
                    vh.a aVarD = zVar.d(ub2.h0.f169842b);
                    vh.c.g gVar = vh.c.f178266a;
                    l14 = (Long) q6.f.m(aVarD, fVar, zVar);
                    break;
                case 1:
                    ub2.s.f169889a.getClass();
                    vh.a aVarD2 = zVar.d(ub2.s.f169890b);
                    vh.c.g gVar2 = vh.c.f178266a;
                    dateTime = (DateTime) q6.f.m(aVarD2, fVar, zVar);
                    break;
                case 2:
                    list = (List) q6.f.n(vh.c.a(vh.c.f178274i), fVar, zVar);
                    break;
                case 3:
                    list2 = (List) q6.f.n(vh.c.a(vh.c.f178274i), fVar, zVar);
                    break;
                case 4:
                    list3 = (List) q6.f.n(vh.c.a(vh.c.f178274i), fVar, zVar);
                    break;
                case 5:
                    strB = vh.c.f178274i.b(fVar, zVar);
                    break;
                case 6:
                    strB2 = vh.c.f178274i.b(fVar, zVar);
                    break;
                case 7:
                    strB3 = vh.c.f178274i.b(fVar, zVar);
                    break;
                case 8:
                    strB4 = vh.c.f178274i.b(fVar, zVar);
                    break;
                case 9:
                    ub2.g0.f169835a.getClass();
                    vh.a aVarD3 = zVar.d(ub2.g0.f169836b);
                    vh.c.g gVar3 = vh.c.f178266a;
                    localDateTime = (LocalDateTime) q6.f.m(aVarD3, fVar, zVar);
                    break;
                case 10:
                    list4 = (List) q6.f.n(new vh.j0(new vh.k0(vh.c.b(q.f144253a, false))), fVar, zVar);
                    break;
                case 11:
                    boolB = vh.c.f178277l.b(fVar, zVar);
                    break;
                case 12:
                    boolB2 = vh.c.f178277l.b(fVar, zVar);
                    break;
                case 13:
                    boolB3 = vh.c.f178277l.b(fVar, zVar);
                    break;
                default:
                    return new pb2.e.j(l14, dateTime, list, list2, list3, strB, strB2, strB3, strB4, localDateTime, list4, boolB, boolB2, boolB3);
            }
        }
    }
}
