package qb2;

import java.util.List;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/f;", "Lvh/a;", "Lpb2/b$b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements vh.a<pb2.b.C2596b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f144212a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144213b = p13.x.k("startTimeLocal", "activityType", "distance", "duration");

    private f() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.b.C2596b c2596b) {
        pb2.b.C2596b c2596b2 = c2596b;
        gVar.getClass();
        zVar.getClass();
        c2596b2.getClass();
        gVar.v1("startTimeLocal");
        ub2.g0.f169835a.getClass();
        vh.a aVarD = zVar.d(ub2.g0.f169836b);
        vh.c.g gVar2 = vh.c.f178266a;
        new vh.k0(aVarD).a(gVar, zVar, c2596b2.f136914a);
        gVar.v1("activityType");
        new vh.k0(vh.c.b(i.f144224a, false)).a(gVar, zVar, c2596b2.f136915b);
        gVar.v1("distance");
        vh.k0<Double> k0Var = vh.c.f178275j;
        k0Var.a(gVar, zVar, c2596b2.f136916c);
        gVar.v1("duration");
        k0Var.a(gVar, zVar, c2596b2.f136917d);
    }

    @Override // vh.a
    public final pb2.b.C2596b b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        LocalDateTime localDateTime = null;
        pb2.b.e eVar = null;
        Double dB = null;
        Double dB2 = null;
        while (true) {
            int iS1 = fVar.S1(f144213b);
            if (iS1 == 0) {
                ub2.g0.f169835a.getClass();
                vh.a aVarD = zVar.d(ub2.g0.f169836b);
                vh.c.g gVar = vh.c.f178266a;
                localDateTime = (LocalDateTime) q6.f.m(aVarD, fVar, zVar);
            } else if (iS1 == 1) {
                eVar = (pb2.b.e) q6.f.o(vh.c.b(i.f144224a, false), fVar, zVar);
            } else if (iS1 == 2) {
                dB = vh.c.f178275j.b(fVar, zVar);
            } else {
                if (iS1 != 3) {
                    return new pb2.b.C2596b(localDateTime, eVar, dB, dB2);
                }
                dB2 = vh.c.f178275j.b(fVar, zVar);
            }
        }
    }
}
