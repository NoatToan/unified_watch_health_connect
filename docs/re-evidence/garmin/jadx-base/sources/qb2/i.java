package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/i;", "Lvh/a;", "Lpb2/b$e;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements vh.a<pb2.b.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f144224a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144225b = p13.x.k("typeKey", "parentTypeId");

    private i() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.b.e eVar) {
        pb2.b.e eVar2 = eVar;
        gVar.getClass();
        zVar.getClass();
        eVar2.getClass();
        gVar.v1("typeKey");
        vh.c.f178274i.a(gVar, zVar, eVar2.f136921a);
        gVar.v1("parentTypeId");
        ub2.h0.f169841a.getClass();
        new vh.k0(zVar.d(ub2.h0.f169842b)).a(gVar, zVar, eVar2.f136922b);
    }

    @Override // vh.a
    public final pb2.b.e b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        String strB = null;
        Long l14 = null;
        while (true) {
            int iS1 = fVar.S1(f144225b);
            if (iS1 == 0) {
                strB = vh.c.f178274i.b(fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new pb2.b.e(strB, l14);
                }
                ub2.h0.f169841a.getClass();
                vh.a aVarD = zVar.d(ub2.h0.f169842b);
                vh.c.g gVar = vh.c.f178266a;
                l14 = (Long) q6.f.m(aVarD, fVar, zVar);
            }
        }
    }
}
