package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc2/u2;", "Lc2/t2;", "<init>", "()V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u2 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2 f22900a = new u2();

    private u2() {
    }

    @Override // c2.t2
    public final h4.r a(h4.r rVar, float f14, boolean z14) {
        if (f14 <= 0.0d) {
            d2.a.a("invalid weight; must be greater than zero");
        }
        if (f14 > Float.MAX_VALUE) {
            f14 = Float.MAX_VALUE;
        }
        return rVar.then(new v1(f14, z14));
    }

    @Override // c2.t2
    public final h4.r b(h4.r rVar) {
        return d(rVar, f5.b.f68892a);
    }

    @Override // c2.t2
    public final h4.r c(h4.r rVar, h4.d.c cVar) {
        return rVar.then(new i3(cVar));
    }

    public final h4.r d(h4.r rVar, f5.p pVar) {
        return rVar.then(new r3(pVar));
    }
}
