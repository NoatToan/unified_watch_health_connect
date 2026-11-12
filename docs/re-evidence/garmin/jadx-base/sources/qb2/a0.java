package qb2;

import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/a0;", "Lvh/a;", "Lpb2/e$m;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 implements vh.a<pb2.e.m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f144192a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144193b = p13.x.k("userProfilePk", "deviceId", "calendarDate", "timestamp", "primaryTrainingDevice", "aerobicEndurance", "aerobicCapacity", "anaerobicCapacity", "profileType", "profileTypeFeedback", "aerobicEnduranceFeedback", "aerobicCapacityFeedback", "anaerobicCapacityFeedback");

    private a0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.m mVar) {
        pb2.e.m mVar2 = mVar;
        gVar.getClass();
        zVar.getClass();
        mVar2.getClass();
        gVar.v1("userProfilePk");
        ub2.h0.f169841a.getClass();
        vh.a0 a0Var = ub2.h0.f169842b;
        zVar.d(a0Var).a(gVar, zVar, Long.valueOf(mVar2.f137062a));
        gVar.v1("deviceId");
        zVar.d(a0Var).a(gVar, zVar, Long.valueOf(mVar2.f137063b));
        gVar.v1("calendarDate");
        ub2.s.f169889a.getClass();
        zVar.d(ub2.s.f169890b).a(gVar, zVar, mVar2.f137064c);
        gVar.v1("timestamp");
        ub2.g0.f169835a.getClass();
        zVar.d(ub2.g0.f169836b).a(gVar, zVar, mVar2.f137065d);
        gVar.v1("primaryTrainingDevice");
        vh.c.f178277l.a(gVar, zVar, mVar2.f137066e);
        gVar.v1("aerobicEndurance");
        vh.k0<Integer> k0Var = vh.c.f178276k;
        k0Var.a(gVar, zVar, mVar2.f137067f);
        gVar.v1("aerobicCapacity");
        k0Var.a(gVar, zVar, mVar2.f137068g);
        gVar.v1("anaerobicCapacity");
        k0Var.a(gVar, zVar, mVar2.f137069h);
        gVar.v1("profileType");
        vh.k0<String> k0Var2 = vh.c.f178274i;
        k0Var2.a(gVar, zVar, mVar2.f137070i);
        gVar.v1("profileTypeFeedback");
        k0Var2.a(gVar, zVar, mVar2.f137071j);
        gVar.v1("aerobicEnduranceFeedback");
        k0Var2.a(gVar, zVar, mVar2.f137072k);
        gVar.v1("aerobicCapacityFeedback");
        k0Var2.a(gVar, zVar, mVar2.f137073l);
        gVar.v1("anaerobicCapacityFeedback");
        k0Var2.a(gVar, zVar, mVar2.f137074m);
    }

    @Override // vh.a
    public final pb2.e.m b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Long l14 = null;
        Long l15 = null;
        DateTime dateTime = null;
        LocalDateTime localDateTime = null;
        Boolean boolB = null;
        Integer numB = null;
        Integer numB2 = null;
        Integer numB3 = null;
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        String strB4 = null;
        String strB5 = null;
        while (true) {
            switch (fVar.S1(f144193b)) {
                case 0:
                    ub2.h0.f169841a.getClass();
                    l14 = (Long) zVar.d(ub2.h0.f169842b).b(fVar, zVar);
                    break;
                case 1:
                    ub2.h0.f169841a.getClass();
                    l15 = (Long) zVar.d(ub2.h0.f169842b).b(fVar, zVar);
                    break;
                case 2:
                    ub2.s.f169889a.getClass();
                    dateTime = (DateTime) zVar.d(ub2.s.f169890b).b(fVar, zVar);
                    break;
                case 3:
                    ub2.g0.f169835a.getClass();
                    localDateTime = (LocalDateTime) zVar.d(ub2.g0.f169836b).b(fVar, zVar);
                    break;
                case 4:
                    boolB = vh.c.f178277l.b(fVar, zVar);
                    break;
                case 5:
                    numB = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 6:
                    numB2 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 7:
                    numB3 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 8:
                    strB = vh.c.f178274i.b(fVar, zVar);
                    break;
                case 9:
                    strB2 = vh.c.f178274i.b(fVar, zVar);
                    break;
                case 10:
                    strB3 = vh.c.f178274i.b(fVar, zVar);
                    break;
                case 11:
                    strB4 = vh.c.f178274i.b(fVar, zVar);
                    break;
                case 12:
                    strB5 = vh.c.f178274i.b(fVar, zVar);
                    break;
                default:
                    l14.getClass();
                    long jLongValue = l14.longValue();
                    l15.getClass();
                    long jLongValue2 = l15.longValue();
                    dateTime.getClass();
                    localDateTime.getClass();
                    return new pb2.e.m(jLongValue, jLongValue2, dateTime, localDateTime, boolB, numB, numB2, numB3, strB, strB2, strB3, strB4, strB5);
            }
        }
    }
}
