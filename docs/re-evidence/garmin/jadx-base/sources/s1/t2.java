package s1;

import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls1/t2;", "Ls1/r;", "V", "Ls1/k2;", "", "durationMillis", "delayMillis", "Ls1/b0;", "easing", "<init>", "(IILs1/b0;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t2<V extends r> implements k2<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f155787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m2<V> f155788d;

    public t2(int i14, int i15, b0 b0Var) {
        this.f155785a = i14;
        this.f155786b = i15;
        this.f155787c = b0Var;
        this.f155788d = new m2<>(new k0(i14, i15, b0Var));
    }

    @Override // s1.k2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF155785a() {
        return this.f155785a;
    }

    @Override // s1.f2
    public final V d(long j8, V v14, V v15, V v16) {
        return (V) this.f155788d.d(j8, v14, v15, v16);
    }

    @Override // s1.f2
    public final V f(long j8, V v14, V v15, V v16) {
        return (V) this.f155788d.f(j8, v14, v15, v16);
    }

    @Override // s1.k2
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF155734a() {
        return this.f155786b;
    }

    public t2(int i14, int i15, b0 b0Var, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 300 : i14, (i16 & 2) != 0 ? 0 : i15, (i16 & 4) != 0 ? e0.f155560a : b0Var);
    }

    public t2() {
        this(0, 0, null, 7, null);
    }
}
