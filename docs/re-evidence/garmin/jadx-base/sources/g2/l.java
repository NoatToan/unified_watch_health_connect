package g2;

import ch.qos.logback.core.CoreConstants;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lg2/l;", "Lh5/x0;", "Lg2/m;", "Ls1/f0;", "", "fadeInSpec", "Lg6/k;", "placementSpec", "fadeOutSpec", "<init>", "(Ls1/f0;Ls1/f0;Ls1/f0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class l extends h5.x0<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.f0<Float> f75149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1.f0<g6.k> f75150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.f0<Float> f75151c;

    public l(s1.f0<Float> f0Var, s1.f0<g6.k> f0Var2, s1.f0<Float> f0Var3) {
        this.f75149a = f0Var;
        this.f75150b = f0Var2;
        this.f75151c = f0Var3;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new m(this.f75149a, this.f75150b, this.f75151c);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f75149a, lVar.f75149a) && p005kotlin.jvm.internal.s.g(this.f75150b, lVar.f75150b) && p005kotlin.jvm.internal.s.g(this.f75151c, lVar.f75151c);
    }

    @Override // h5.x0
    public final int hashCode() {
        s1.f0<Float> f0Var = this.f75149a;
        int iHashCode = (f0Var == null ? 0 : f0Var.hashCode()) * 31;
        s1.f0<g6.k> f0Var2 = this.f75150b;
        int iHashCode2 = (iHashCode + (f0Var2 == null ? 0 : f0Var2.hashCode())) * 31;
        s1.f0<Float> f0Var3 = this.f75151c;
        return iHashCode2 + (f0Var3 != null ? f0Var3.hashCode() : 0);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "animateItem";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f75149a, "fadeInSpec");
        v3Var.c(this.f75150b, "placementSpec");
        v3Var.c(this.f75151c, "fadeOutSpec");
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f75149a + ", placementSpec=" + this.f75150b + ", fadeOutSpec=" + this.f75151c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        m mVar = (m) cVar;
        mVar.f75167a = this.f75149a;
        mVar.f75168b = this.f75150b;
        mVar.f75169c = this.f75151c;
    }
}
