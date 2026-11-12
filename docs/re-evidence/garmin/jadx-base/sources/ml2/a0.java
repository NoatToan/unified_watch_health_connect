package ml2;

import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lml2/a0;", "", "", "major", "minor", "micro", "<init>", "(III)V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class a0 implements Comparable<a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f119299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f119300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f119301c;

    public a0(int i14, int i15, int i16) {
        this.f119299a = i14;
        this.f119300b = i15;
        this.f119301c = i16;
    }

    @Override // java.lang.Comparable
    public final int compareTo(a0 a0Var) {
        a0 a0Var2 = a0Var;
        a0Var2.getClass();
        int i14 = a0Var2.f119299a;
        int i15 = this.f119299a;
        if (i15 != i14) {
            return p005kotlin.jvm.internal.s.h(i15, i14);
        }
        int i16 = a0Var2.f119300b;
        int i17 = this.f119300b;
        return i17 != i16 ? p005kotlin.jvm.internal.s.h(i17, i16) : p005kotlin.jvm.internal.s.h(this.f119301c, a0Var2.f119301c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f119299a == a0Var.f119299a && this.f119300b == a0Var.f119300b && this.f119301c == a0Var.f119301c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f119301c) + q2.d(this.f119300b, Integer.hashCode(this.f119299a) * 31, 31);
    }

    public final String toString() {
        return am.j.q(e5.j(this.f119299a, this.f119300b, "MultiLinkVersion(major=", ", minor=", ", micro="), this.f119301c, ")");
    }
}
