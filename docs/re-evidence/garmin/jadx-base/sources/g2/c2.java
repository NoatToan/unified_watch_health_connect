package g2;

import ch.qos.logback.core.CoreConstants;
import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg2/c2;", "Lh5/x0;", "Lg2/d2;", "Lg2/z0;", "prefetchState", "<init>", "(Lg2/z0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class c2 extends h5.x0<d2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f75069a;

    public c2(z0 z0Var) {
        this.f75069a = z0Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new d2(this.f75069a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2) && p005kotlin.jvm.internal.s.g(this.f75069a, ((c2) obj).f75069a);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f75069a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "traversablePrefetchState";
        m2Var.f91342b = this.f75069a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f75069a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((d2) cVar).f75074a = this.f75069a;
    }
}
