package rb2;

import java.util.List;
import p005kotlin.Metadata;
import ub2.h0;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/f;", "Lvh/a;", "Lrb2/a$d;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements vh.a<a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f151723a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151724b = p13.x.k("typeId", "parentTypeId");

    private f() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, a.d dVar) {
        a.d dVar2 = dVar;
        gVar.getClass();
        zVar.getClass();
        dVar2.getClass();
        gVar.v1("typeId");
        h0.f169841a.getClass();
        vh.a0 a0Var = h0.f169842b;
        vh.a aVarD = zVar.d(a0Var);
        vh.c.g gVar2 = vh.c.f178266a;
        new k0(aVarD).a(gVar, zVar, dVar2.f151683a);
        gVar.v1("parentTypeId");
        new k0(zVar.d(a0Var)).a(gVar, zVar, dVar2.f151684b);
    }

    @Override // vh.a
    public final a.d b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Long l14 = null;
        Long l15 = null;
        while (true) {
            int iS1 = fVar.S1(f151724b);
            if (iS1 == 0) {
                h0.f169841a.getClass();
                vh.a aVarD = zVar.d(h0.f169842b);
                vh.c.g gVar = vh.c.f178266a;
                l14 = (Long) q6.f.m(aVarD, fVar, zVar);
            } else {
                if (iS1 != 1) {
                    return new a.d(l14, l15);
                }
                h0.f169841a.getClass();
                vh.a aVarD2 = zVar.d(h0.f169842b);
                vh.c.g gVar2 = vh.c.f178266a;
                l15 = (Long) q6.f.m(aVarD2, fVar, zVar);
            }
        }
    }
}
