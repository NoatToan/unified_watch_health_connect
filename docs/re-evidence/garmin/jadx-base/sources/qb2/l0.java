package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/l0;", "Lvh/a;", "Lpb2/e$x;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l0 implements vh.a<pb2.e.x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f144237a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144238b = p13.w.c("periodLength");

    private l0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.x xVar) {
        pb2.e.x xVar2 = xVar;
        gVar.getClass();
        zVar.getClass();
        xVar2.getClass();
        gVar.v1("periodLength");
        vh.c.f178276k.a(gVar, zVar, xVar2.f137112a);
    }

    @Override // vh.a
    public final pb2.e.x b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Integer numB = null;
        while (fVar.S1(f144238b) == 0) {
            numB = vh.c.f178276k.b(fVar, zVar);
        }
        return new pb2.e.x(numB);
    }
}
