package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/e0;", "Lvh/a;", "Lpb2/e$q;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e0 implements vh.a<pb2.e.q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f144210a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144211b = p13.x.k("meal", "nutritionContent");

    private e0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.q qVar) {
        pb2.e.q qVar2 = qVar;
        gVar.getClass();
        zVar.getClass();
        qVar2.getClass();
        gVar.v1("meal");
        new vh.k0(vh.c.b(d0.f144206a, false)).a(gVar, zVar, qVar2.f137081a);
        gVar.v1("nutritionContent");
        new vh.k0(vh.c.b(i0.f144226a, false)).a(gVar, zVar, qVar2.f137082b);
    }

    @Override // vh.a
    public final pb2.e.q b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        pb2.e.p pVar = null;
        pb2.e.u uVar = null;
        while (true) {
            int iS1 = fVar.S1(f144211b);
            if (iS1 == 0) {
                pVar = (pb2.e.p) q6.f.o(vh.c.b(d0.f144206a, false), fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new pb2.e.q(pVar, uVar);
                }
                uVar = (pb2.e.u) q6.f.o(vh.c.b(i0.f144226a, false), fVar, zVar);
            }
        }
    }
}
