package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/q;", "Lvh/a;", "Lpb2/e$b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q implements vh.a<pb2.e.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f144253a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144254b = p13.x.k("movementType", "count", "duration");

    private q() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.b bVar) {
        pb2.e.b bVar2 = bVar;
        gVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        gVar.v1("movementType");
        vh.c.f178274i.a(gVar, zVar, bVar2.f136972a);
        gVar.v1("count");
        vh.k0<Integer> k0Var = vh.c.f178276k;
        k0Var.a(gVar, zVar, bVar2.f136973b);
        gVar.v1("duration");
        k0Var.a(gVar, zVar, bVar2.f136974c);
    }

    @Override // vh.a
    public final pb2.e.b b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        String strB = null;
        Integer numB = null;
        Integer numB2 = null;
        while (true) {
            int iS1 = fVar.S1(f144254b);
            if (iS1 == 0) {
                strB = vh.c.f178274i.b(fVar, zVar);
            } else if (iS1 == 1) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else {
                if (iS1 != 2) {
                    return new pb2.e.b(strB, numB, numB2);
                }
                numB2 = vh.c.f178276k.b(fVar, zVar);
            }
        }
    }
}
