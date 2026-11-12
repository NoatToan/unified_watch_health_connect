package s1;

import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0017\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Ls1/o2;", "Ls1/r;", "V", "Ls1/f2;", "Ls1/k2;", "animation", "Ls1/y0;", "repeatMode", "<init>", "(Ls1/k2;Ls1/y0;)V", "Ls1/m1;", "initialStartOffset", "(Ls1/k2;Ls1/y0;JLkotlin/jvm/internal/j;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o2<V extends r> implements f2<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2<V> f155679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f155680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f155681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f155682d;

    private o2(k2<V> k2Var, y0 y0Var, long j8) {
        this.f155679a = k2Var;
        this.f155680b = y0Var;
        this.f155681c = ((long) (k2Var.b() + k2Var.getF155734a())) * 1000000;
        this.f155682d = j8 * 1000000;
    }

    @Override // s1.f2
    public final boolean a() {
        return true;
    }

    @Override // s1.f2
    public final long c(V v14, V v15, V v16) {
        return Long.MAX_VALUE;
    }

    @Override // s1.f2
    public final V d(long j8, V v14, V v15, V v16) {
        return this.f155679a.d(h(j8), v14, v15, i(j8, v14, v16, v15));
    }

    @Override // s1.f2
    public final V f(long j8, V v14, V v15, V v16) {
        return this.f155679a.f(h(j8), v14, v15, i(j8, v14, v16, v15));
    }

    public final long h(long j8) {
        long j14 = this.f155682d;
        if (j8 + j14 <= 0) {
            return 0L;
        }
        long j15 = j8 + j14;
        long j16 = this.f155681c;
        long j17 = j15 / j16;
        return (this.f155680b == y0.Restart || j17 % ((long) 2) == 0) ? j15 - (j17 * j16) : ((j17 + 1) * j16) - j15;
    }

    public final V i(long j8, V v14, V v15, V v16) {
        long j14 = this.f155682d;
        long j15 = j8 + j14;
        long j16 = this.f155681c;
        return j15 > j16 ? this.f155679a.d(j16 - j14, v14, v16, v15) : v15;
    }

    public /* synthetic */ o2(k2 k2Var, y0 y0Var, long j8, p005kotlin.jvm.internal.j jVar) {
        this(k2Var, y0Var, j8);
    }

    public /* synthetic */ o2(k2 k2Var, y0 y0Var, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        this(k2Var, (i14 & 2) != 0 ? y0.Restart : y0Var, (i14 & 4) != 0 ? m1.a(0) : j8, (p005kotlin.jvm.internal.j) null);
    }

    public /* synthetic */ o2(k2 k2Var, y0 y0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(k2Var, (i14 & 2) != 0 ? y0.Restart : y0Var);
    }

    @o13.e
    public /* synthetic */ o2(k2 k2Var, y0 y0Var) {
        this(k2Var, y0Var, m1.a(0), (p005kotlin.jvm.internal.j) null);
    }
}
