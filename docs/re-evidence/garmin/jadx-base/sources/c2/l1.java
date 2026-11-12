package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc2/l1;", "Lc2/h2;", "Lc2/k3;", "insets", "Lg6/c;", "density", "<init>", "(Lc2/k3;Lg6/c;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3 f22734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6.c f22735b;

    public l1(k3 k3Var, g6.c cVar) {
        this.f22734a = k3Var;
        this.f22735b = cVar;
    }

    @Override // c2.h2
    public final float a() {
        k3 k3Var = this.f22734a;
        g6.c cVar = this.f22735b;
        return cVar.c1(k3Var.c(cVar));
    }

    @Override // c2.h2
    public final float b(g6.o oVar) {
        k3 k3Var = this.f22734a;
        g6.c cVar = this.f22735b;
        return cVar.c1(k3Var.b(cVar, oVar));
    }

    @Override // c2.h2
    public final float c(g6.o oVar) {
        k3 k3Var = this.f22734a;
        g6.c cVar = this.f22735b;
        return cVar.c1(k3Var.d(cVar, oVar));
    }

    @Override // c2.h2
    public final float d() {
        k3 k3Var = this.f22734a;
        g6.c cVar = this.f22735b;
        return cVar.c1(k3Var.a(cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return p005kotlin.jvm.internal.s.g(this.f22734a, l1Var.f22734a) && p005kotlin.jvm.internal.s.g(this.f22735b, l1Var.f22735b);
    }

    public final int hashCode() {
        return this.f22735b.hashCode() + (this.f22734a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f22734a + ", density=" + this.f22735b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
