package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc2/h3;", "Lc2/k3;", "Lc2/m1;", "insets", "", "name", "<init>", "(Lc2/m1;Ljava/lang/String;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h3 implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.c2 f22677c;

    public h3(m1 m1Var, String str) {
        this.f22676b = str;
        this.f22677c = p3.p0.n(m1Var);
    }

    @Override // c2.k3
    public final int a(g6.c cVar) {
        return e().f22749b;
    }

    @Override // c2.k3
    public final int b(g6.c cVar, g6.o oVar) {
        return e().f22748a;
    }

    @Override // c2.k3
    public final int c(g6.c cVar) {
        return e().f22751d;
    }

    @Override // c2.k3
    public final int d(g6.c cVar, g6.o oVar) {
        return e().f22750c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m1 e() {
        return (m1) this.f22677c.getF182175a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h3) {
            return p005kotlin.jvm.internal.s.g(e(), ((h3) obj).e());
        }
        return false;
    }

    public final void f(m1 m1Var) {
        this.f22677c.setValue(m1Var);
    }

    public final int hashCode() {
        return this.f22676b.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f22676b);
        sb3.append("(left=");
        sb3.append(e().f22748a);
        sb3.append(", top=");
        sb3.append(e().f22749b);
        sb3.append(", right=");
        sb3.append(e().f22750c);
        sb3.append(", bottom=");
        return ds.e0.j(sb3, e().f22751d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
