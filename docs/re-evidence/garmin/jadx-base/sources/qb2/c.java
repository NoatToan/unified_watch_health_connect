package qb2;

import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/c;", "Lvh/a;", "Lpb2/a$d;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements vh.a<pb2.a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f144201a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144202b = p13.x.k("pendingActivityUUID", "calendarDate", "startTimeLocal", "endTimeLocal", "startTimeGMT", "endTimeGMT", "averageHR", "deviceId", "calories", "duration", "hasLocationData", "activityTypePredictionKeys");

    private c() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.a.d dVar) {
        pb2.a.d dVar2 = dVar;
        gVar.getClass();
        zVar.getClass();
        dVar2.getClass();
        gVar.v1("pendingActivityUUID");
        vh.c.f178266a.a(gVar, zVar, dVar2.f136893a);
        gVar.v1("calendarDate");
        ub2.s.f169889a.getClass();
        zVar.d(ub2.s.f169890b).a(gVar, zVar, dVar2.f136894b);
        gVar.v1("startTimeLocal");
        ub2.g0.f169835a.getClass();
        vh.a0 a0Var = ub2.g0.f169836b;
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, dVar2.f136895c);
        gVar.v1("endTimeLocal");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, dVar2.f136896d);
        gVar.v1("startTimeGMT");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, dVar2.f136897e);
        gVar.v1("endTimeGMT");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, dVar2.f136898f);
        gVar.v1("averageHR");
        vh.k0<Double> k0Var = vh.c.f178275j;
        k0Var.a(gVar, zVar, dVar2.f136899g);
        gVar.v1("deviceId");
        ub2.h0.f169841a.getClass();
        new vh.k0(zVar.d(ub2.h0.f169842b)).a(gVar, zVar, dVar2.f136900h);
        gVar.v1("calories");
        k0Var.a(gVar, zVar, dVar2.f136901i);
        gVar.v1("duration");
        k0Var.a(gVar, zVar, dVar2.f136902j);
        gVar.v1("hasLocationData");
        vh.c.f178277l.a(gVar, zVar, dVar2.f136903k);
        gVar.v1("activityTypePredictionKeys");
        new vh.k0(vh.c.a(vh.c.f178274i)).a(gVar, zVar, dVar2.f136904l);
    }

    @Override // vh.a
    public final pb2.a.d b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        String str = null;
        DateTime dateTime = null;
        LocalDateTime localDateTime = null;
        LocalDateTime localDateTime2 = null;
        LocalDateTime localDateTime3 = null;
        LocalDateTime localDateTime4 = null;
        Double dB = null;
        Long l14 = null;
        Double dB2 = null;
        Double dB3 = null;
        Boolean boolB = null;
        List list = null;
        while (true) {
            switch (fVar.S1(f144202b)) {
                case 0:
                    str = (String) vh.c.f178266a.b(fVar, zVar);
                    break;
                case 1:
                    ub2.s.f169889a.getClass();
                    dateTime = (DateTime) zVar.d(ub2.s.f169890b).b(fVar, zVar);
                    break;
                case 2:
                    ub2.g0.f169835a.getClass();
                    vh.a aVarD = zVar.d(ub2.g0.f169836b);
                    vh.c.g gVar = vh.c.f178266a;
                    localDateTime = (LocalDateTime) q6.f.m(aVarD, fVar, zVar);
                    break;
                case 3:
                    ub2.g0.f169835a.getClass();
                    vh.a aVarD2 = zVar.d(ub2.g0.f169836b);
                    vh.c.g gVar2 = vh.c.f178266a;
                    localDateTime2 = (LocalDateTime) q6.f.m(aVarD2, fVar, zVar);
                    break;
                case 4:
                    ub2.g0.f169835a.getClass();
                    vh.a aVarD3 = zVar.d(ub2.g0.f169836b);
                    vh.c.g gVar3 = vh.c.f178266a;
                    localDateTime3 = (LocalDateTime) q6.f.m(aVarD3, fVar, zVar);
                    break;
                case 5:
                    ub2.g0.f169835a.getClass();
                    vh.a aVarD4 = zVar.d(ub2.g0.f169836b);
                    vh.c.g gVar4 = vh.c.f178266a;
                    localDateTime4 = (LocalDateTime) q6.f.m(aVarD4, fVar, zVar);
                    break;
                case 6:
                    dB = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 7:
                    ub2.h0.f169841a.getClass();
                    vh.a aVarD5 = zVar.d(ub2.h0.f169842b);
                    vh.c.g gVar5 = vh.c.f178266a;
                    l14 = (Long) q6.f.m(aVarD5, fVar, zVar);
                    break;
                case 8:
                    dB2 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 9:
                    dB3 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 10:
                    boolB = vh.c.f178277l.b(fVar, zVar);
                    break;
                case 11:
                    list = (List) q6.f.n(vh.c.a(vh.c.f178274i), fVar, zVar);
                    break;
                default:
                    str.getClass();
                    dateTime.getClass();
                    return new pb2.a.d(str, dateTime, localDateTime, localDateTime2, localDateTime3, localDateTime4, dB, l14, dB2, dB3, boolB, list);
            }
        }
    }
}
