package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc2/m2;", "Lc2/k3;", "Lc2/h2;", "paddingValues", "<init>", "(Lc2/h2;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m2 implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2 f22752b;

    public m2(h2 h2Var) {
        this.f22752b = h2Var;
    }

    @Override // c2.k3
    public final int a(g6.c cVar) {
        return cVar.f0(this.f22752b.d());
    }

    @Override // c2.k3
    public final int b(g6.c cVar, g6.o oVar) {
        return cVar.f0(this.f22752b.b(oVar));
    }

    @Override // c2.k3
    public final int c(g6.c cVar) {
        return cVar.f0(this.f22752b.a());
    }

    @Override // c2.k3
    public final int d(g6.c cVar, g6.o oVar) {
        return cVar.f0(this.f22752b.c(oVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m2) {
            return p005kotlin.jvm.internal.s.g(((m2) obj).f22752b, this.f22752b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22752b.hashCode();
    }

    public final String toString() {
        g6.o oVar = g6.o.Ltr;
        h2 h2Var = this.f22752b;
        return "PaddingValues(" + ((Object) g6.f.d(h2Var.b(oVar))) + ", " + ((Object) g6.f.d(h2Var.d())) + ", " + ((Object) g6.f.d(h2Var.c(oVar))) + ", " + ((Object) g6.f.d(h2Var.a())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
