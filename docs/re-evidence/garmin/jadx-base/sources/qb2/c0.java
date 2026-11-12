package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/c0;", "Lvh/a;", "Lpb2/e$o;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0 implements vh.a<pb2.e.o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f144203a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144204b = p13.w.c("completionStats");

    private c0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.o oVar) {
        pb2.e.o oVar2 = oVar;
        gVar.getClass();
        zVar.getClass();
        oVar2.getClass();
        gVar.v1("completionStats");
        new vh.k0(new vh.j0(new vh.k0(vh.c.b(t.f144264a, false)))).a(gVar, zVar, oVar2.f137078a);
    }

    @Override // vh.a
    public final pb2.e.o b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        List list = null;
        while (fVar.S1(f144204b) == 0) {
            list = (List) q6.f.n(new vh.j0(new vh.k0(vh.c.b(t.f144264a, false))), fVar, zVar);
        }
        return new pb2.e.o(list);
    }
}
