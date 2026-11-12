package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/m;", "Lvh/a;", "Lrb2/l$a;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m implements vh.a<l.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f151743a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151744b = p13.x.k("restingValue", "heartRateEpochData");

    private m() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, l.a aVar) {
        l.a aVar2 = aVar;
        gVar.getClass();
        zVar.getClass();
        aVar2.getClass();
        gVar.v1("restingValue");
        vh.c.f178276k.a(gVar, zVar, aVar2.f151739a);
        gVar.v1("heartRateEpochData");
        new k0(vh.c.b(n.f151745a, false)).a(gVar, zVar, aVar2.f151740b);
    }

    @Override // vh.a
    public final l.a b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Integer numB = null;
        l.b bVar = null;
        while (true) {
            int iS1 = fVar.S1(f151744b);
            if (iS1 == 0) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new l.a(numB, bVar);
                }
                bVar = (l.b) q6.f.o(vh.c.b(n.f151745a, false), fVar, zVar);
            }
        }
    }
}
