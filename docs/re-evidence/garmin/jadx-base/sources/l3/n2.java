package l3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll3/n2;", "Ll3/g1$b;", "Lh4/d$c;", "alignment", "", "margin", "<init>", "(Lh4/d$c;I)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class n2 implements g1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.d.c f109369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109370b;

    public n2(h4.d.c cVar, int i14) {
        this.f109369a = cVar;
        this.f109370b = i14;
    }

    @Override // l3.g1.b
    public final int a(g6.l lVar, long j8, int i14) {
        int i15 = (int) (j8 & 4294967295L);
        int i16 = this.f109370b;
        if (i14 < i15 - (i16 * 2)) {
            return j23.t.e(this.f109369a.a(i14, i15), i16, (i15 - i16) - i14);
        }
        h4.d.f81522a.getClass();
        return h4.d.a.f81534l.a(i14, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return p005kotlin.jvm.internal.s.g(this.f109369a, n2Var.f109369a) && this.f109370b == n2Var.f109370b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109370b) + (this.f109369a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Vertical(alignment=");
        sb3.append(this.f109369a);
        sb3.append(", margin=");
        return ds.e0.j(sb3, this.f109370b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
