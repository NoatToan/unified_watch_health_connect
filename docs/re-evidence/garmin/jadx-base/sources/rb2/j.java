package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/j;", "Lvh/a;", "Lrb2/i$a;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements vh.a<i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f151734a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151735b = p13.x.k("burnedActive", "burnedTotal");

    private j() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, i.a aVar) {
        i.a aVar2 = aVar;
        gVar.getClass();
        zVar.getClass();
        aVar2.getClass();
        gVar.v1("burnedActive");
        k0<Integer> k0Var = vh.c.f178276k;
        k0Var.a(gVar, zVar, aVar2.f151732a);
        gVar.v1("burnedTotal");
        k0Var.a(gVar, zVar, aVar2.f151733b);
    }

    @Override // vh.a
    public final i.a b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Integer numB = null;
        Integer numB2 = null;
        while (true) {
            int iS1 = fVar.S1(f151735b);
            if (iS1 == 0) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new i.a(numB, numB2);
                }
                numB2 = vh.c.f178276k.b(fVar, zVar);
            }
        }
    }
}
