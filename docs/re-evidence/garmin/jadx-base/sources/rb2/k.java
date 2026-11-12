package rb2;

import java.util.List;
import p005kotlin.Metadata;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/k;", "Lvh/a;", "Lrb2/i;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k implements vh.a<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f151736a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151737b = p13.w.c("calories");

    private k() {
    }

    public static i c(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        i.a aVar = null;
        while (fVar.S1(f151737b) == 0) {
            aVar = (i.a) q6.f.o(vh.c.b(j.f151734a, false), fVar, zVar);
        }
        return new i(aVar);
    }

    public static void d(zh.g gVar, vh.z zVar, i iVar) {
        gVar.getClass();
        zVar.getClass();
        iVar.getClass();
        gVar.v1("calories");
        new k0(vh.c.b(j.f151734a, false)).a(gVar, zVar, iVar.f151731a);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, i iVar) {
        d(gVar, zVar, iVar);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ i b(zh.f fVar, vh.z zVar) {
        return c(fVar, zVar);
    }
}
