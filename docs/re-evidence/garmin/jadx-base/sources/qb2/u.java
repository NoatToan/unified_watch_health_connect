package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/u;", "Lvh/a;", "Lpb2/e$g;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u implements vh.a<pb2.e.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f144267a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144268b = p13.x.k("latest", "weeklyAggregates");

    private u() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.g gVar2) {
        pb2.e.g gVar3 = gVar2;
        gVar.getClass();
        zVar.getClass();
        gVar3.getClass();
        gVar.v1("latest");
        new vh.k0(vh.c.b(a0.f144192a, false)).a(gVar, zVar, gVar3.f136994a);
        gVar.v1("weeklyAggregates");
        new vh.k0(vh.c.b(p0.f144251a, false)).a(gVar, zVar, gVar3.f136995b);
    }

    @Override // vh.a
    public final pb2.e.g b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        pb2.e.m mVar = null;
        pb2.e.b0 b0Var = null;
        while (true) {
            int iS1 = fVar.S1(f144268b);
            if (iS1 == 0) {
                mVar = (pb2.e.m) q6.f.o(vh.c.b(a0.f144192a, false), fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new pb2.e.g(mVar, b0Var);
                }
                b0Var = (pb2.e.b0) q6.f.o(vh.c.b(p0.f144251a, false), fVar, zVar);
            }
        }
    }
}
