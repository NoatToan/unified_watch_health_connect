package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/k0;", "Lvh/a;", "Lpb2/e$w;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k0 implements vh.a<pb2.e.w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f144233a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144234b = p13.w.c("extendedWeight");

    private k0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.w wVar) {
        pb2.e.w wVar2 = wVar;
        gVar.getClass();
        zVar.getClass();
        wVar2.getClass();
        gVar.v1("extendedWeight");
        vh.c.f178278m.a(gVar, zVar, wVar2.f137111a);
    }

    @Override // vh.a
    public final pb2.e.w b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Object objB = null;
        while (fVar.S1(f144234b) == 0) {
            objB = vh.c.f178278m.b(fVar, zVar);
        }
        return new pb2.e.w(objB);
    }
}
