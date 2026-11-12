package sl2;

import pl2.l;

/* JADX INFO: loaded from: classes11.dex */
public class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f160012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f160013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f160014f;

    public c(String str, String str2, int i14, int i15, f fVar, cs2.a<l> aVar) {
        super(aVar);
        this.f160010b = str;
        this.f160011c = str2;
        this.f160012d = i14;
        this.f160013e = fVar;
    }

    @Override // ul2.d
    public final void c(ul2.c cVar) {
        cVar.k(g.f160042e, new b(this, 1));
    }

    public final void f(ul2.a aVar, int i14, boolean z14) {
        l lVar = new l();
        lVar.b(i14, z14);
        d(aVar, lVar);
    }
}
