package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/f0;", "Lvh/a;", "Lpb2/e$r;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f0 implements vh.a<pb2.e.r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f144214a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144215b = p13.x.k("daySummary", "dayLog", "weightGoals");

    private f0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.r rVar) {
        pb2.e.r rVar2 = rVar;
        gVar.getClass();
        zVar.getClass();
        rVar2.getClass();
        gVar.v1("daySummary");
        new vh.k0(vh.c.b(y.f144283a, false)).a(gVar, zVar, rVar2.f137083a);
        gVar.v1("dayLog");
        new vh.k0(vh.c.b(x.f144279a, false)).a(gVar, zVar, rVar2.f137084b);
        gVar.v1("weightGoals");
        new vh.k0(vh.c.b(q0.f144255a, false)).a(gVar, zVar, rVar2.f137085c);
    }

    @Override // vh.a
    public final pb2.e.r b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        pb2.e.k kVar = null;
        pb2.e.j jVar = null;
        pb2.e.c0 c0Var = null;
        while (true) {
            int iS1 = fVar.S1(f144215b);
            if (iS1 == 0) {
                kVar = (pb2.e.k) q6.f.o(vh.c.b(y.f144283a, false), fVar, zVar);
            } else if (iS1 == 1) {
                jVar = (pb2.e.j) q6.f.o(vh.c.b(x.f144279a, false), fVar, zVar);
            } else {
                if (iS1 != 2) {
                    return new pb2.e.r(kVar, jVar, c0Var);
                }
                c0Var = (pb2.e.c0) q6.f.o(vh.c.b(q0.f144255a, false), fVar, zVar);
            }
        }
    }
}
