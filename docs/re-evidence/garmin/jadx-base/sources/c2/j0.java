package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc2/j0;", "Lc2/k3;", "included", "excluded", "<init>", "(Lc2/k3;Lc2/k3;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0 implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f22712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k3 f22713c;

    public j0(k3 k3Var, k3 k3Var2) {
        this.f22712b = k3Var;
        this.f22713c = k3Var2;
    }

    @Override // c2.k3
    public final int a(g6.c cVar) {
        int iA = this.f22712b.a(cVar) - this.f22713c.a(cVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // c2.k3
    public final int b(g6.c cVar, g6.o oVar) {
        int iB = this.f22712b.b(cVar, oVar) - this.f22713c.b(cVar, oVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // c2.k3
    public final int c(g6.c cVar) {
        int iC = this.f22712b.c(cVar) - this.f22713c.c(cVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // c2.k3
    public final int d(g6.c cVar, g6.o oVar) {
        int iD = this.f22712b.d(cVar, oVar) - this.f22713c.d(cVar, oVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return p005kotlin.jvm.internal.s.g(j0Var.f22712b, this.f22712b) && p005kotlin.jvm.internal.s.g(j0Var.f22713c, this.f22713c);
    }

    public final int hashCode() {
        return this.f22713c.hashCode() + (this.f22712b.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f22712b + " - " + this.f22713c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
