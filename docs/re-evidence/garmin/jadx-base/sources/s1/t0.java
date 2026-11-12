package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls1/t0;", "S", "Ls1/a2;", "initialState", "<init>", "(Ljava/lang/Object;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t0<S> extends a2<S> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c2 f155742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.c2 f155743c;

    public t0(S s8) {
        super(null);
        this.f155742b = p3.p0.n(s8);
        this.f155743c = p3.p0.n(s8);
    }

    @Override // s1.a2
    public final S a() {
        return (S) this.f155742b.getF182175a();
    }

    @Override // s1.a2
    public final S b() {
        return (S) this.f155743c.getF182175a();
    }

    @Override // s1.a2
    public final void c(S s8) {
        this.f155742b.setValue(s8);
    }

    @Override // s1.a2
    public final void d(t1<S> t1Var) {
    }

    @Override // s1.a2
    public final void e() {
    }

    public final void f(S s8) {
        this.f155743c.setValue(s8);
    }
}
