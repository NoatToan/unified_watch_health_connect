package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/r;", "Lvh/a;", "Lrb2/p$b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r implements vh.a<p.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f151762a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151763b = p13.w.c("wholeFloorsEpochData");

    private r() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, p.b bVar) {
        p.b bVar2 = bVar;
        gVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        gVar.v1("wholeFloorsEpochData");
        new k0(vh.c.b(v.f151770a, false)).a(gVar, zVar, bVar2.f151752a);
    }

    @Override // vh.a
    public final p.b b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        p.e eVar = null;
        while (fVar.S1(f151763b) == 0) {
            eVar = (p.e) q6.f.o(vh.c.b(v.f151770a, false), fVar, zVar);
        }
        return new p.b(eVar);
    }
}
