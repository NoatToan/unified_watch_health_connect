package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/x;", "Lc2/w;", "Lc2/t;", "Lg6/c;", "density", "Lg6/a;", "constraints", "<init>", "(Lg6/c;JLkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class x implements w, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f22925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6.c f22926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22927c;

    private x(g6.c cVar, long j8) {
        this.f22925a = u.f22885a;
        this.f22926b = cVar;
        this.f22927c = j8;
    }

    @Override // c2.t
    public final h4.r c(h4.r rVar, h4.d dVar) {
        return this.f22925a.c(rVar, dVar);
    }

    @Override // c2.t
    public final h4.r d(h4.r rVar) {
        return this.f22925a.d(rVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p005kotlin.jvm.internal.s.g(this.f22926b, xVar.f22926b) && g6.a.d(this.f22927c, xVar.f22927c);
    }

    @Override // c2.w
    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getF22927c() {
        return this.f22927c;
    }

    @Override // c2.w
    public final float g() {
        long j8 = this.f22927c;
        if (g6.a.e(j8)) {
            return this.f22926b.c1(g6.a.i(j8));
        }
        g6.f.f75994b.getClass();
        return g6.f.f75995c;
    }

    @Override // c2.w
    public final float h() {
        return this.f22926b.c1(g6.a.l(this.f22927c));
    }

    public final int hashCode() {
        int iHashCode = this.f22926b.hashCode() * 31;
        g6.a.C1525a c1525a = g6.a.f75987b;
        return Long.hashCode(this.f22927c) + iHashCode;
    }

    @Override // c2.w
    public final float i() {
        return this.f22926b.c1(g6.a.k(this.f22927c));
    }

    @Override // c2.w
    public final float j() {
        long j8 = this.f22927c;
        if (g6.a.f(j8)) {
            return this.f22926b.c1(g6.a.j(j8));
        }
        g6.f.f75994b.getClass();
        return g6.f.f75995c;
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f22926b + ", constraints=" + ((Object) g6.a.n(this.f22927c)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ x(g6.c cVar, long j8, p005kotlin.jvm.internal.j jVar) {
        this(cVar, j8);
    }
}
