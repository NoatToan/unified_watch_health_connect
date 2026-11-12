package qb2;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/m0;", "Lvh/a;", "Lpb2/e$y;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m0 implements vh.a<pb2.e.y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f144240a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144241b = p13.x.k("latest", "weeklyAggregates");

    private m0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.y yVar) {
        pb2.e.y yVar2 = yVar;
        gVar.getClass();
        zVar.getClass();
        yVar2.getClass();
        gVar.v1("latest");
        new vh.k0(vh.c.b(b0.f144198a, false)).a(gVar, zVar, yVar2.f137113a);
        gVar.v1("weeklyAggregates");
        new vh.j0(vh.c.b(o0.f144247a, false)).a(gVar, zVar, yVar2.f137114b);
    }

    @Override // vh.a
    public final pb2.e.y b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        pb2.e.n nVar = null;
        ArrayList arrayListB = null;
        while (true) {
            int iS1 = fVar.S1(f144241b);
            if (iS1 == 0) {
                nVar = (pb2.e.n) q6.f.o(vh.c.b(b0.f144198a, false), fVar, zVar);
            } else {
                if (iS1 != 1) {
                    arrayListB.getClass();
                    return new pb2.e.y(nVar, arrayListB);
                }
                arrayListB = new vh.j0(vh.c.b(o0.f144247a, false)).b(fVar, zVar);
            }
        }
    }
}
