package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/d0;", "Lvh/a;", "Lpb2/e$p;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 implements vh.a<pb2.e.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f144206a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144207b = p13.x.k("mealId", "mealName");

    private d0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.p pVar) {
        pb2.e.p pVar2 = pVar;
        gVar.getClass();
        zVar.getClass();
        pVar2.getClass();
        gVar.v1("mealId");
        ub2.h0.f169841a.getClass();
        vh.a aVarD = zVar.d(ub2.h0.f169842b);
        vh.c.g gVar2 = vh.c.f178266a;
        new vh.k0(aVarD).a(gVar, zVar, pVar2.f137079a);
        gVar.v1("mealName");
        vh.c.f178266a.a(gVar, zVar, pVar2.f137080b);
    }

    @Override // vh.a
    public final pb2.e.p b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Long l14 = null;
        String str = null;
        while (true) {
            int iS1 = fVar.S1(f144207b);
            if (iS1 == 0) {
                ub2.h0.f169841a.getClass();
                vh.a aVarD = zVar.d(ub2.h0.f169842b);
                vh.c.g gVar = vh.c.f178266a;
                l14 = (Long) q6.f.m(aVarD, fVar, zVar);
            } else {
                if (iS1 != 1) {
                    str.getClass();
                    return new pb2.e.p(l14, str);
                }
                str = (String) vh.c.f178266a.b(fVar, zVar);
            }
        }
    }
}
