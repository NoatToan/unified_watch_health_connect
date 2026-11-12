package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/f0;", "Lvh/a;", "Lrb2/b0;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f0 implements vh.a<b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f151725a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151726b = p13.w.c("weight");

    private f0() {
    }

    public static b0 c(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        b0.c cVar = null;
        while (fVar.S1(f151726b) == 0) {
            cVar = (b0.c) q6.f.o(vh.c.b(e0.f151721a, false), fVar, zVar);
        }
        return new b0(cVar);
    }

    public static void d(zh.g gVar, vh.z zVar, b0 b0Var) {
        gVar.getClass();
        zVar.getClass();
        b0Var.getClass();
        gVar.v1("weight");
        new k0(vh.c.b(e0.f151721a, false)).a(gVar, zVar, b0Var.f151695a);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, b0 b0Var) {
        d(gVar, zVar, b0Var);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ b0 b(zh.f fVar, vh.z zVar) {
        return c(fVar, zVar);
    }
}
