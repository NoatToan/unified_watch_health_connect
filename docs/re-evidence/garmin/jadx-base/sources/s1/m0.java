package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Ls1/m0;", "T", "Ls1/k;", "Ls1/a0;", "animation", "Ls1/y0;", "repeatMode", "<init>", "(Ls1/a0;Ls1/y0;)V", "Ls1/m1;", "initialStartOffset", "(Ls1/a0;Ls1/y0;JLkotlin/jvm/internal/j;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m0<T> implements k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0<T> f155633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f155634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f155635c;

    public /* synthetic */ m0(a0 a0Var, y0 y0Var, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        this(a0Var, (i14 & 2) != 0 ? y0.Restart : y0Var, (i14 & 4) != 0 ? m1.a(0) : j8, (p005kotlin.jvm.internal.j) null);
    }

    @Override // s1.k
    public final <V extends r> f2<V> a(c2<T, V> c2Var) {
        return new o2(this.f155633a.a((c2) c2Var), this.f155634b, this.f155635c, (p005kotlin.jvm.internal.j) null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (p005kotlin.jvm.internal.s.g(m0Var.f155633a, this.f155633a) && m0Var.f155634b == this.f155634b && m0Var.f155635c == this.f155635c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f155635c) + ((this.f155634b.hashCode() + (this.f155633a.hashCode() * 31)) * 31);
    }

    private m0(a0<T> a0Var, y0 y0Var, long j8) {
        this.f155633a = a0Var;
        this.f155634b = y0Var;
        this.f155635c = j8;
    }

    public /* synthetic */ m0(a0 a0Var, y0 y0Var, long j8, p005kotlin.jvm.internal.j jVar) {
        this(a0Var, y0Var, j8);
    }

    public /* synthetic */ m0(a0 a0Var, y0 y0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(a0Var, (i14 & 2) != 0 ? y0.Restart : y0Var);
    }

    @o13.e
    public /* synthetic */ m0(a0 a0Var, y0 y0Var) {
        this(a0Var, y0Var, m1.a(0), (p005kotlin.jvm.internal.j) null);
    }
}
