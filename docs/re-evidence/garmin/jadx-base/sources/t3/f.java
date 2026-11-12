package t3;

import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import s3.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt3/f;", "Lt3/e;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f162131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f162132b;

    public f(e eVar, l lVar) {
        this.f162131a = eVar;
        this.f162132b = lVar;
    }

    @Override // t3.e
    public final boolean b() {
        return this.f162131a.b();
    }

    @Override // t3.e
    public final List<g4.d> d(Integer num) {
        List<g4.d> listD = this.f162131a.d(null);
        l lVar = this.f162132b;
        int i14 = lVar.f156384v;
        return i14 < 0 ? listD : h0.C0(g4.c.a(lVar, num, i14, Integer.valueOf(lVar.G(i14, lVar.f156364b))), listD);
    }
}
