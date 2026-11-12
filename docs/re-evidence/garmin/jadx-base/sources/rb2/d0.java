package rb2;

import java.util.List;
import p005kotlin.Metadata;
import ub2.h0;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/d0;", "Lvh/a;", "Lrb2/b0$b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 implements vh.a<b0.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f151717a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151718b = p13.x.k("date", "weight");

    private d0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, b0.b bVar) {
        b0.b bVar2 = bVar;
        gVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        gVar.v1("date");
        h0.f169841a.getClass();
        vh.a aVarD = zVar.d(h0.f169842b);
        vh.c.g gVar2 = vh.c.f178266a;
        new k0(aVarD).a(gVar, zVar, bVar2.f151706a);
        gVar.v1("weight");
        vh.c.f178275j.a(gVar, zVar, bVar2.f151707b);
    }

    @Override // vh.a
    public final b0.b b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Long l14 = null;
        Double dB = null;
        while (true) {
            int iS1 = fVar.S1(f151718b);
            if (iS1 == 0) {
                h0.f169841a.getClass();
                vh.a aVarD = zVar.d(h0.f169842b);
                vh.c.g gVar = vh.c.f178266a;
                l14 = (Long) q6.f.m(aVarD, fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new b0.b(l14, dB);
                }
                dB = vh.c.f178275j.b(fVar, zVar);
            }
        }
    }
}
