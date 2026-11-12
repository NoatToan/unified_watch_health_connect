package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc2/x1;", "Lc2/k3;", "insets", "Lc2/p3;", "sides", "<init>", "(Lc2/k3;ILkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x1 implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f22928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22929c;

    private x1(k3 k3Var, int i14) {
        this.f22928b = k3Var;
        this.f22929c = i14;
    }

    @Override // c2.k3
    public final int a(g6.c cVar) {
        p3.f22815b.getClass();
        if ((p3.f22822i & this.f22929c) != 0) {
            return this.f22928b.a(cVar);
        }
        return 0;
    }

    @Override // c2.k3
    public final int b(g6.c cVar, g6.o oVar) {
        int i14;
        if (oVar == g6.o.Ltr) {
            p3.f22815b.getClass();
            i14 = p3.f22816c;
        } else {
            p3.f22815b.getClass();
            i14 = p3.f22818e;
        }
        if ((i14 & this.f22929c) != 0) {
            return this.f22928b.b(cVar, oVar);
        }
        return 0;
    }

    @Override // c2.k3
    public final int c(g6.c cVar) {
        p3.f22815b.getClass();
        if ((p3.f22823j & this.f22929c) != 0) {
            return this.f22928b.c(cVar);
        }
        return 0;
    }

    @Override // c2.k3
    public final int d(g6.c cVar, g6.o oVar) {
        int i14;
        if (oVar == g6.o.Ltr) {
            p3.f22815b.getClass();
            i14 = p3.f22817d;
        } else {
            p3.f22815b.getClass();
            i14 = p3.f22819f;
        }
        if ((i14 & this.f22929c) != 0) {
            return this.f22928b.d(cVar, oVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        if (p005kotlin.jvm.internal.s.g(this.f22928b, x1Var.f22928b)) {
            int i14 = x1Var.f22929c;
            p3.a aVar = p3.f22815b;
            if (this.f22929c == i14) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f22928b.hashCode() * 31;
        p3.a aVar = p3.f22815b;
        return Integer.hashCode(this.f22929c) + iHashCode;
    }

    public final String toString() {
        return "(" + this.f22928b + " only " + ((Object) p3.a(this.f22929c)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ x1(k3 k3Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(k3Var, i14);
    }
}
