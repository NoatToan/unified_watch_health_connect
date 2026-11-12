package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/w0;", "Lvh/a;", "Lpb2/g$d;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w0 implements vh.a<pb2.g.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f144277a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144278b = p13.w.c("__typename");

    private w0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.g.d dVar) {
        pb2.g.d dVar2 = dVar;
        gVar.getClass();
        zVar.getClass();
        dVar2.getClass();
        gVar.v1("__typename");
        vh.c.f178266a.a(gVar, zVar, dVar2.f137143a);
        rb2.a aVar = dVar2.f137144b;
        if (aVar != null) {
            rb2.d.f151715a.getClass();
            rb2.d.d(gVar, zVar, aVar);
        }
    }

    @Override // vh.a
    public final pb2.g.d b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        vh.b bVar = zVar.f178398b;
        rb2.a aVarC = null;
        String str = null;
        while (fVar.S1(f144278b) == 0) {
            str = (String) vh.c.f178266a.b(fVar, zVar);
        }
        if (vh.m.a(vh.m.c("includeActivity"), bVar.b(), bVar)) {
            fVar.rewind();
            rb2.d.f151715a.getClass();
            aVarC = rb2.d.c(fVar, zVar);
        }
        str.getClass();
        return new pb2.g.d(str, aVarC);
    }
}
