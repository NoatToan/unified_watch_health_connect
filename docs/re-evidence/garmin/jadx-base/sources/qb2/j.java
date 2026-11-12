package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/j;", "Lvh/a;", "Lpb2/b$g;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements vh.a<pb2.b.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f144228a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144229b = p13.w.c("activities");

    private j() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.b.g gVar2) {
        pb2.b.g gVar3 = gVar2;
        gVar.getClass();
        zVar.getClass();
        gVar3.getClass();
        gVar.v1("activities");
        new vh.k0(vh.c.b(e.f144208a, false)).a(gVar, zVar, gVar3.f136923a);
    }

    @Override // vh.a
    public final pb2.b.g b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        pb2.b.a aVar = null;
        while (fVar.S1(f144229b) == 0) {
            aVar = (pb2.b.a) q6.f.o(vh.c.b(e.f144208a, false), fVar, zVar);
        }
        return new pb2.b.g(aVar);
    }
}
