package rb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import ub2.h0;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/x;", "Lvh/a;", "Lrb2/w$a;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x implements vh.a<w.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f151792a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151793b = p13.x.k("awakeCount", "awakeSleepSeconds", "calendarDate", "deviceRemCapable", "lightSleepSeconds", "deepSleepSeconds", "remSleepSeconds", "sleepTimeSeconds", "sleepStartTimestampGMT", "sleepEndTimestampGMT", "sleepStartTimestampLocal", "sleepEndTimestampLocal", "sleepFromDevice", "sleepWindowConfirmationType");

    private x() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, w.a aVar) {
        w.a aVar2 = aVar;
        gVar.getClass();
        zVar.getClass();
        aVar2.getClass();
        gVar.v1("awakeCount");
        k0<Integer> k0Var = vh.c.f178276k;
        k0Var.a(gVar, zVar, aVar2.f151773a);
        gVar.v1("awakeSleepSeconds");
        k0Var.a(gVar, zVar, aVar2.f151774b);
        gVar.v1("calendarDate");
        ub2.s.f169889a.getClass();
        new k0(zVar.d(ub2.s.f169890b)).a(gVar, zVar, aVar2.f151775c);
        gVar.v1("deviceRemCapable");
        k0<Boolean> k0Var2 = vh.c.f178277l;
        k0Var2.a(gVar, zVar, aVar2.f151776d);
        gVar.v1("lightSleepSeconds");
        k0Var.a(gVar, zVar, aVar2.f151777e);
        gVar.v1("deepSleepSeconds");
        k0Var.a(gVar, zVar, aVar2.f151778f);
        gVar.v1("remSleepSeconds");
        k0Var.a(gVar, zVar, aVar2.f151779g);
        gVar.v1("sleepTimeSeconds");
        k0Var.a(gVar, zVar, aVar2.f151780h);
        gVar.v1("sleepStartTimestampGMT");
        h0.f169841a.getClass();
        vh.a0 a0Var = h0.f169842b;
        new k0(zVar.d(a0Var)).a(gVar, zVar, aVar2.f151781i);
        gVar.v1("sleepEndTimestampGMT");
        new k0(zVar.d(a0Var)).a(gVar, zVar, aVar2.f151782j);
        gVar.v1("sleepStartTimestampLocal");
        new k0(zVar.d(a0Var)).a(gVar, zVar, aVar2.f151783k);
        gVar.v1("sleepEndTimestampLocal");
        new k0(zVar.d(a0Var)).a(gVar, zVar, aVar2.f151784l);
        gVar.v1("sleepFromDevice");
        k0Var2.a(gVar, zVar, aVar2.f151785m);
        gVar.v1("sleepWindowConfirmationType");
        vh.c.f178274i.a(gVar, zVar, aVar2.f151786n);
    }

    @Override // vh.a
    public final w.a b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Integer numB = null;
        Integer numB2 = null;
        DateTime dateTime = null;
        Boolean boolB = null;
        Integer numB3 = null;
        Integer numB4 = null;
        Integer numB5 = null;
        Integer numB6 = null;
        Long l14 = null;
        Long l15 = null;
        Long l16 = null;
        Long l17 = null;
        Boolean boolB2 = null;
        String strB = null;
        while (true) {
            switch (fVar.S1(f151793b)) {
                case 0:
                    numB = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 1:
                    numB2 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 2:
                    ub2.s.f169889a.getClass();
                    vh.a aVarD = zVar.d(ub2.s.f169890b);
                    vh.c.g gVar = vh.c.f178266a;
                    dateTime = (DateTime) q6.f.m(aVarD, fVar, zVar);
                    break;
                case 3:
                    boolB = vh.c.f178277l.b(fVar, zVar);
                    break;
                case 4:
                    numB3 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 5:
                    numB4 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 6:
                    numB5 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 7:
                    numB6 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 8:
                    h0.f169841a.getClass();
                    vh.a aVarD2 = zVar.d(h0.f169842b);
                    vh.c.g gVar2 = vh.c.f178266a;
                    l14 = (Long) q6.f.m(aVarD2, fVar, zVar);
                    break;
                case 9:
                    h0.f169841a.getClass();
                    vh.a aVarD3 = zVar.d(h0.f169842b);
                    vh.c.g gVar3 = vh.c.f178266a;
                    l15 = (Long) q6.f.m(aVarD3, fVar, zVar);
                    break;
                case 10:
                    h0.f169841a.getClass();
                    vh.a aVarD4 = zVar.d(h0.f169842b);
                    vh.c.g gVar4 = vh.c.f178266a;
                    l16 = (Long) q6.f.m(aVarD4, fVar, zVar);
                    break;
                case 11:
                    h0.f169841a.getClass();
                    vh.a aVarD5 = zVar.d(h0.f169842b);
                    vh.c.g gVar5 = vh.c.f178266a;
                    l17 = (Long) q6.f.m(aVarD5, fVar, zVar);
                    break;
                case 12:
                    boolB2 = vh.c.f178277l.b(fVar, zVar);
                    break;
                case 13:
                    strB = vh.c.f178274i.b(fVar, zVar);
                    break;
                default:
                    return new w.a(numB, numB2, dateTime, boolB, numB3, numB4, numB5, numB6, l14, l15, l16, l17, boolB2, strB);
            }
        }
    }
}
