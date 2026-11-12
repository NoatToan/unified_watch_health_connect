package s1;

import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fB;\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\u000eB;\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Ls1/x;", "T", "Ls1/r;", "V", "Ls1/g;", "Ls1/j2;", "animationSpec", "Ls1/c2;", "typeConverter", "initialValue", "initialVelocityVector", "<init>", "(Ls1/j2;Ls1/c2;Ljava/lang/Object;Ls1/r;)V", "Ls1/y;", "(Ls1/y;Ls1/c2;Ljava/lang/Object;Ls1/r;)V", "initialVelocity", "(Ls1/y;Ls1/c2;Ljava/lang/Object;Ljava/lang/Object;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x<T, V extends r> implements g<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2<V> f155840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2<T, V> f155841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f155842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f155843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V f155844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V f155845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T f155846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f155847h;

    public x(j2<V> j2Var, c2<T, V> c2Var, T t7, V v14) {
        this.f155840a = j2Var;
        this.f155841b = c2Var;
        this.f155842c = t7;
        V vInvoke = c2Var.a().invoke(t7);
        this.f155843d = vInvoke;
        this.f155844e = (V) v.c(v14);
        this.f155846g = (T) c2Var.b().invoke(j2Var.e(vInvoke, v14));
        long jC = j2Var.c(vInvoke, v14);
        this.f155847h = jC;
        V v15 = (V) v.c(j2Var.d(jC, vInvoke, v14));
        this.f155845f = v15;
        int f155674c = v15.getF155674c();
        for (int i14 = 0; i14 < f155674c; i14++) {
            V v16 = this.f155845f;
            v16.e(j23.t.d(v16.a(i14), -this.f155840a.getF155671e(), this.f155840a.getF155671e()), i14);
        }
    }

    @Override // s1.g
    public final boolean a() {
        return false;
    }

    @Override // s1.g
    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getF155847h() {
        return this.f155847h;
    }

    @Override // s1.g
    public final c2<T, V> d() {
        return this.f155841b;
    }

    @Override // s1.g
    public final T e(long j8) {
        if (c(j8)) {
            return this.f155846g;
        }
        return (T) this.f155841b.b().invoke(this.f155840a.b(j8, this.f155843d, this.f155844e));
    }

    @Override // s1.g
    public final V f(long j8) {
        if (c(j8)) {
            return this.f155845f;
        }
        return (V) this.f155840a.d(j8, this.f155843d, this.f155844e);
    }

    @Override // s1.g
    public final T getTargetValue() {
        return this.f155846g;
    }

    public x(y<T> yVar, c2<T, V> c2Var, T t7, V v14) {
        this(yVar.a(), c2Var, t7, v14);
    }

    public x(y<T> yVar, c2<T, V> c2Var, T t7, T t14) {
        this(yVar.a(), c2Var, t7, c2Var.a().invoke(t14));
    }
}
