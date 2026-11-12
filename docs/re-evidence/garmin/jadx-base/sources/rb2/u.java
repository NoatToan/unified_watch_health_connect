package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/u;", "Lvh/a;", "Lrb2/p$d;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u implements vh.a<p.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f151768a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151769b = p13.x.k("distanceInMeters", "value", "epochData");

    private u() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, p.d dVar) {
        p.d dVar2 = dVar;
        gVar.getClass();
        zVar.getClass();
        dVar2.getClass();
        gVar.v1("distanceInMeters");
        vh.c.f178275j.a(gVar, zVar, dVar2.f151755a);
        gVar.v1("value");
        vh.c.f178276k.a(gVar, zVar, dVar2.f151756b);
        gVar.v1("epochData");
        new k0(vh.c.b(q.f151760a, false)).a(gVar, zVar, dVar2.f151757c);
    }

    @Override // vh.a
    public final p.d b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Double dB = null;
        Integer numB = null;
        p.a aVar = null;
        while (true) {
            int iS1 = fVar.S1(f151769b);
            if (iS1 == 0) {
                dB = vh.c.f178275j.b(fVar, zVar);
            } else if (iS1 == 1) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else {
                if (iS1 != 2) {
                    return new p.d(dB, numB, aVar);
                }
                aVar = (p.a) q6.f.o(vh.c.b(q.f151760a, false), fVar, zVar);
            }
        }
    }
}
