package s1;

import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls1/l1;", "Ls1/r;", "V", "Ls1/f2;", "vectorizedAnimationSpec", "", "startDelayNanos", "<init>", "(Ls1/f2;J)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l1<V extends r> implements f2<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2<V> f155625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f155626b;

    public l1(f2<V> f2Var, long j8) {
        this.f155625a = f2Var;
        this.f155626b = j8;
    }

    @Override // s1.f2
    public final boolean a() {
        return this.f155625a.a();
    }

    @Override // s1.f2
    public final long c(V v14, V v15, V v16) {
        return this.f155625a.c(v14, v15, v16) + this.f155626b;
    }

    @Override // s1.f2
    public final V d(long j8, V v14, V v15, V v16) {
        long j14 = this.f155626b;
        return j8 < j14 ? v16 : (V) this.f155625a.d(j8 - j14, v14, v15, v16);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return l1Var.f155626b == this.f155626b && p005kotlin.jvm.internal.s.g(l1Var.f155625a, this.f155625a);
    }

    @Override // s1.f2
    public final V f(long j8, V v14, V v15, V v16) {
        long j14 = this.f155626b;
        return j8 < j14 ? v14 : (V) this.f155625a.f(j8 - j14, v14, v15, v16);
    }

    public final int hashCode() {
        return Long.hashCode(this.f155626b) + (this.f155625a.hashCode() * 31);
    }
}
