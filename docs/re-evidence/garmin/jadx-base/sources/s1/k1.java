package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls1/k1;", "T", "Ls1/k;", "animationSpec", "", "startDelayNanos", "<init>", "(Ls1/k;J)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k1<T> implements k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k<T> f155621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f155622b;

    public k1(k<T> kVar, long j8) {
        this.f155621a = kVar;
        this.f155622b = j8;
    }

    @Override // s1.k
    public final <V extends r> f2<V> a(c2<T, V> c2Var) {
        return new l1(this.f155621a.a(c2Var), this.f155622b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return k1Var.f155622b == this.f155622b && p005kotlin.jvm.internal.s.g(k1Var.f155621a, this.f155621a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f155622b) + (this.f155621a.hashCode() * 31);
    }
}
