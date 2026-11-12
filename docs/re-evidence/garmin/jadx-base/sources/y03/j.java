package y03;

import java.util.concurrent.atomic.AtomicReference;
import q03.t;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T> implements t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<s03.b> f193071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t<? super T> f193072b;

    public j(AtomicReference<s03.b> atomicReference, t<? super T> tVar) {
        this.f193071a = atomicReference;
        this.f193072b = tVar;
    }

    @Override // q03.t
    public final void a(s03.b bVar) {
        v03.c.d(this.f193071a, bVar);
    }

    @Override // q03.t
    public final void onError(Throwable th3) {
        this.f193072b.onError(th3);
    }

    @Override // q03.t
    public final void onSuccess(T t7) {
        this.f193072b.onSuccess(t7);
    }
}
