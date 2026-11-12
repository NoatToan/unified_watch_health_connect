package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf5/l;", "Lf5/y0;", "Lf5/w;", "measurable", "Lf5/y;", "minMax", "Lf5/z;", "widthHeight", "<init>", "(Lf5/w;Lf5/y;Lf5/z;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f69000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f69001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f69002c;

    public l(w wVar, y yVar, z zVar) {
        this.f69000a = wVar;
        this.f69001b = yVar;
        this.f69002c = zVar;
    }

    @Override // f5.w
    public final int O(int i14) {
        return this.f69000a.O(i14);
    }

    @Override // f5.y0
    public final v1 Q(long j8) {
        z zVar = z.Width;
        w wVar = this.f69000a;
        z zVar2 = this.f69002c;
        y yVar = this.f69001b;
        if (zVar2 == zVar) {
            return new o(yVar == y.Max ? wVar.l0(g6.a.i(j8)) : wVar.O(g6.a.i(j8)), g6.a.e(j8) ? g6.a.i(j8) : 32767);
        }
        return new o(g6.a.f(j8) ? g6.a.j(j8) : 32767, yVar == y.Max ? wVar.a0(g6.a.j(j8)) : wVar.e0(g6.a.j(j8)));
    }

    @Override // f5.w
    public final int a0(int i14) {
        return this.f69000a.a0(i14);
    }

    @Override // f5.w
    /* JADX INFO: renamed from: e */
    public final Object getF81969t() {
        return this.f69000a.getF81969t();
    }

    @Override // f5.w
    public final int e0(int i14) {
        return this.f69000a.e0(i14);
    }

    @Override // f5.w
    public final int l0(int i14) {
        return this.f69000a.l0(i14);
    }
}
