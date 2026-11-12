package l3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll3/m2;", "Ll3/g1$a;", "Lh4/d$b;", "alignment", "", "margin", "<init>", "(Lh4/d$b;I)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class m2 implements g1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.d.b f109361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109362b;

    public m2(h4.d.b bVar, int i14) {
        this.f109361a = bVar;
        this.f109362b = i14;
    }

    @Override // l3.g1.a
    public final int a(g6.l lVar, long j8, int i14, g6.o oVar) {
        int i15 = (int) (j8 >> 32);
        int i16 = this.f109362b;
        if (i14 < i15 - (i16 * 2)) {
            return j23.t.e(this.f109361a.a(i14, i15, oVar), i16, (i15 - i16) - i14);
        }
        h4.d.f81522a.getClass();
        return h4.d.a.f81537o.a(i14, i15, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return p005kotlin.jvm.internal.s.g(this.f109361a, m2Var.f109361a) && this.f109362b == m2Var.f109362b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109362b) + (this.f109361a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Horizontal(alignment=");
        sb3.append(this.f109361a);
        sb3.append(", margin=");
        return ds.e0.j(sb3, this.f109362b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
