package qb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/n0;", "Lvh/a;", "Lpb2/e$z;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n0 implements vh.a<pb2.e.z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f144244a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144245b = p13.x.k("userProfilePK", "calendarDate", "acuteImpactLoad", "acuteDistance", "acuteTolerance");

    private n0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.z zVar2) {
        pb2.e.z zVar3 = zVar2;
        gVar.getClass();
        zVar.getClass();
        zVar3.getClass();
        gVar.v1("userProfilePK");
        ub2.h0.f169841a.getClass();
        vh.a0 a0Var = ub2.h0.f169842b;
        zVar.d(a0Var).a(gVar, zVar, Long.valueOf(zVar3.f137115a));
        gVar.v1("calendarDate");
        ub2.s.f169889a.getClass();
        zVar.d(ub2.s.f169890b).a(gVar, zVar, zVar3.f137116b);
        gVar.v1("acuteImpactLoad");
        vh.a aVarD = zVar.d(a0Var);
        vh.c.g gVar2 = vh.c.f178266a;
        new vh.k0(aVarD).a(gVar, zVar, zVar3.f137117c);
        gVar.v1("acuteDistance");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, zVar3.f137118d);
        gVar.v1("acuteTolerance");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, zVar3.f137119e);
    }

    @Override // vh.a
    public final pb2.e.z b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Long l14 = null;
        DateTime dateTime = null;
        Long l15 = null;
        Long l16 = null;
        Long l17 = null;
        while (true) {
            int iS1 = fVar.S1(f144245b);
            if (iS1 == 0) {
                ub2.h0.f169841a.getClass();
                l14 = (Long) zVar.d(ub2.h0.f169842b).b(fVar, zVar);
            } else if (iS1 == 1) {
                ub2.s.f169889a.getClass();
                dateTime = (DateTime) zVar.d(ub2.s.f169890b).b(fVar, zVar);
            } else if (iS1 == 2) {
                ub2.h0.f169841a.getClass();
                vh.a aVarD = zVar.d(ub2.h0.f169842b);
                vh.c.g gVar = vh.c.f178266a;
                l15 = (Long) q6.f.m(aVarD, fVar, zVar);
            } else if (iS1 == 3) {
                ub2.h0.f169841a.getClass();
                vh.a aVarD2 = zVar.d(ub2.h0.f169842b);
                vh.c.g gVar2 = vh.c.f178266a;
                l16 = (Long) q6.f.m(aVarD2, fVar, zVar);
            } else {
                if (iS1 != 4) {
                    l14.getClass();
                    long jLongValue = l14.longValue();
                    dateTime.getClass();
                    return new pb2.e.z(jLongValue, dateTime, l15, l16, l17);
                }
                ub2.h0.f169841a.getClass();
                vh.a aVarD3 = zVar.d(ub2.h0.f169842b);
                vh.c.g gVar3 = vh.c.f178266a;
                l17 = (Long) q6.f.m(aVarD3, fVar, zVar);
            }
        }
    }
}
