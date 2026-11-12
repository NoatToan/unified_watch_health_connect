package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc2/c3;", "Lc2/k3;", "first", "second", "<init>", "(Lc2/k3;Lc2/k3;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c3 implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f22613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k3 f22614c;

    public c3(k3 k3Var, k3 k3Var2) {
        this.f22613b = k3Var;
        this.f22614c = k3Var2;
    }

    @Override // c2.k3
    public final int a(g6.c cVar) {
        return Math.max(this.f22613b.a(cVar), this.f22614c.a(cVar));
    }

    @Override // c2.k3
    public final int b(g6.c cVar, g6.o oVar) {
        return Math.max(this.f22613b.b(cVar, oVar), this.f22614c.b(cVar, oVar));
    }

    @Override // c2.k3
    public final int c(g6.c cVar) {
        return Math.max(this.f22613b.c(cVar), this.f22614c.c(cVar));
    }

    @Override // c2.k3
    public final int d(g6.c cVar, g6.o oVar) {
        return Math.max(this.f22613b.d(cVar, oVar), this.f22614c.d(cVar, oVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return p005kotlin.jvm.internal.s.g(c3Var.f22613b, this.f22613b) && p005kotlin.jvm.internal.s.g(c3Var.f22614c, this.f22614c);
    }

    public final int hashCode() {
        return (this.f22614c.hashCode() * 31) + this.f22613b.hashCode();
    }

    public final String toString() {
        return "(" + this.f22613b + " ∪ " + this.f22614c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
