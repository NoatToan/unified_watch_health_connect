package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/n0;", "Lc2/k3;", "", "leftVal", "topVal", "rightVal", "bottomVal", "<init>", "(IIII)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22783e;

    public n0(int i14, int i15, int i16, int i17) {
        this.f22780b = i14;
        this.f22781c = i15;
        this.f22782d = i16;
        this.f22783e = i17;
    }

    @Override // c2.k3
    public final int a(g6.c cVar) {
        return this.f22781c;
    }

    @Override // c2.k3
    public final int b(g6.c cVar, g6.o oVar) {
        return this.f22780b;
    }

    @Override // c2.k3
    public final int c(g6.c cVar) {
        return this.f22783e;
    }

    @Override // c2.k3
    public final int d(g6.c cVar, g6.o oVar) {
        return this.f22782d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f22780b == n0Var.f22780b && this.f22781c == n0Var.f22781c && this.f22782d == n0Var.f22782d && this.f22783e == n0Var.f22783e;
    }

    public final int hashCode() {
        return (((((this.f22780b * 31) + this.f22781c) * 31) + this.f22782d) * 31) + this.f22783e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Insets(left=");
        sb3.append(this.f22780b);
        sb3.append(", top=");
        sb3.append(this.f22781c);
        sb3.append(", right=");
        sb3.append(this.f22782d);
        sb3.append(", bottom=");
        return ds.e0.j(sb3, this.f22783e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
