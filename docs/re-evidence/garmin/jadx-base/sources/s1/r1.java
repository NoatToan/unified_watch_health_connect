package s1;

import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\rBG\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls1/r1;", "T", "Ls1/r;", "V", "Ls1/g;", "Ls1/f2;", "animationSpec", "Ls1/c2;", "typeConverter", "initialValue", "targetValue", "initialVelocityVector", "<init>", "(Ls1/f2;Ls1/c2;Ljava/lang/Object;Ljava/lang/Object;Ls1/r;)V", "Ls1/k;", "(Ls1/k;Ls1/c2;Ljava/lang/Object;Ljava/lang/Object;Ls1/r;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r1<T, V extends r> implements g<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2<V> f155725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2<T, V> f155726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f155727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f155728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public V f155729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public V f155730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final V f155731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f155732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public V f155733i;

    public r1(f2<V> f2Var, c2<T, V> c2Var, T t7, T t14, V v14) {
        this.f155725a = f2Var;
        this.f155726b = c2Var;
        this.f155727c = t14;
        this.f155728d = t7;
        this.f155729e = c2Var.a().invoke(t7);
        this.f155730f = c2Var.a().invoke(t14);
        this.f155731g = v14 != null ? (V) v.c(v14) : (V) c2Var.a().invoke(t7).c();
        this.f155732h = -1L;
    }

    @Override // s1.g
    public final boolean a() {
        return this.f155725a.a();
    }

    @Override // s1.g
    public final long b() {
        if (this.f155732h < 0) {
            this.f155732h = this.f155725a.c(this.f155729e, this.f155730f, this.f155731g);
        }
        return this.f155732h;
    }

    @Override // s1.g
    public final c2<T, V> d() {
        return this.f155726b;
    }

    @Override // s1.g
    public final T e(long j8) {
        if (c(j8)) {
            return this.f155727c;
        }
        r rVarF = this.f155725a.f(j8, this.f155729e, this.f155730f, this.f155731g);
        int f155699e = rVarF.getF155699e();
        for (int i14 = 0; i14 < f155699e; i14++) {
            if (Float.isNaN(rVarF.a(i14))) {
                x0.b("AnimationVector cannot contain a NaN. " + rVarF + ". Animation: " + this + ", playTimeNanos: " + j8);
            }
        }
        return (T) this.f155726b.b().invoke(rVarF);
    }

    @Override // s1.g
    public final V f(long j8) {
        if (!c(j8)) {
            return (V) this.f155725a.d(j8, this.f155729e, this.f155730f, this.f155731g);
        }
        V v14 = this.f155733i;
        if (v14 != null) {
            return v14;
        }
        V v15 = (V) this.f155725a.e(this.f155729e, this.f155730f, this.f155731g);
        this.f155733i = v15;
        return v15;
    }

    public final void g(T t7) {
        if (p005kotlin.jvm.internal.s.g(t7, this.f155728d)) {
            return;
        }
        this.f155728d = t7;
        this.f155729e = this.f155726b.a().invoke(t7);
        this.f155733i = null;
        this.f155732h = -1L;
    }

    @Override // s1.g
    public final T getTargetValue() {
        return this.f155727c;
    }

    public final void h(T t7) {
        if (p005kotlin.jvm.internal.s.g(this.f155727c, t7)) {
            return;
        }
        this.f155727c = t7;
        this.f155730f = this.f155726b.a().invoke(t7);
        this.f155733i = null;
        this.f155732h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f155728d + " -> " + this.f155727c + ",initial velocity: " + this.f155731g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f155725a;
    }

    public /* synthetic */ r1(f2 f2Var, c2 c2Var, Object obj, Object obj2, r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((f2<r>) f2Var, (c2<Object, r>) c2Var, obj, obj2, (i14 & 16) != 0 ? null : rVar);
    }

    public /* synthetic */ r1(k kVar, c2 c2Var, Object obj, Object obj2, r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((k<Object>) kVar, (c2<Object, r>) c2Var, obj, obj2, (i14 & 16) != 0 ? null : rVar);
    }

    public r1(k<T> kVar, c2<T, V> c2Var, T t7, T t14, V v14) {
        this(kVar.a(c2Var), c2Var, t7, t14, v14);
    }
}
