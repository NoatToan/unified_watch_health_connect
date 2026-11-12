package qb2;

import java.util.List;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/y0;", "Lvh/a;", "Lpb2/g$f;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y0 implements vh.a<pb2.g.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f144285a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144286b = p13.x.k("startTimestampLocal", "startTimestampGmt", "endTimestampLocal", "endTimestampGmt");

    private y0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.g.f fVar) {
        pb2.g.f fVar2 = fVar;
        gVar.getClass();
        zVar.getClass();
        fVar2.getClass();
        gVar.v1("startTimestampLocal");
        ub2.g0.f169835a.getClass();
        vh.a0 a0Var = ub2.g0.f169836b;
        vh.a aVarD = zVar.d(a0Var);
        vh.c.g gVar2 = vh.c.f178266a;
        new vh.k0(aVarD).a(gVar, zVar, fVar2.f137151a);
        gVar.v1("startTimestampGmt");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, fVar2.f137152b);
        gVar.v1("endTimestampLocal");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, fVar2.f137153c);
        gVar.v1("endTimestampGmt");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, fVar2.f137154d);
    }

    @Override // vh.a
    public final pb2.g.f b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        LocalDateTime localDateTime = null;
        LocalDateTime localDateTime2 = null;
        LocalDateTime localDateTime3 = null;
        LocalDateTime localDateTime4 = null;
        while (true) {
            int iS1 = fVar.S1(f144286b);
            if (iS1 == 0) {
                ub2.g0.f169835a.getClass();
                vh.a aVarD = zVar.d(ub2.g0.f169836b);
                vh.c.g gVar = vh.c.f178266a;
                localDateTime = (LocalDateTime) q6.f.m(aVarD, fVar, zVar);
            } else if (iS1 == 1) {
                ub2.g0.f169835a.getClass();
                vh.a aVarD2 = zVar.d(ub2.g0.f169836b);
                vh.c.g gVar2 = vh.c.f178266a;
                localDateTime2 = (LocalDateTime) q6.f.m(aVarD2, fVar, zVar);
            } else if (iS1 == 2) {
                ub2.g0.f169835a.getClass();
                vh.a aVarD3 = zVar.d(ub2.g0.f169836b);
                vh.c.g gVar3 = vh.c.f178266a;
                localDateTime3 = (LocalDateTime) q6.f.m(aVarD3, fVar, zVar);
            } else {
                if (iS1 != 3) {
                    return new pb2.g.f(localDateTime, localDateTime2, localDateTime3, localDateTime4);
                }
                ub2.g0.f169835a.getClass();
                vh.a aVarD4 = zVar.d(ub2.g0.f169836b);
                vh.c.g gVar4 = vh.c.f178266a;
                localDateTime4 = (LocalDateTime) q6.f.m(aVarD4, fVar, zVar);
            }
        }
    }
}
