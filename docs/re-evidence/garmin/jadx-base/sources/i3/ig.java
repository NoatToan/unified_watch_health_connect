package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Li3/ig;", "Li3/lf;", "", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ig implements lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.c2 f88457a = p3.p0.n(p13.j0.f134944a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.f0<g6.f> f88458b;

    public ig(s1.f0<g6.f> f0Var) {
        this.f88458b = f0Var;
    }

    @Override // i3.lf
    public final h4.r a(h4.r rVar, int i14) {
        return rVar.then(new jf(this.f88457a, i14, false, this.f88458b));
    }
}
