package y03;

import java.util.concurrent.CountDownLatch;
import q03.t;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends CountDownLatch implements t<T>, q03.d, q03.j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f193053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f193054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s03.b f193055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f193056d;

    public c() {
        super(1);
    }

    @Override // q03.t
    public final void a(s03.b bVar) {
        this.f193055c = bVar;
        if (this.f193056d) {
            bVar.dispose();
        }
    }

    public final T b() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e4) {
                this.f193056d = true;
                s03.b bVar = this.f193055c;
                if (bVar != null) {
                    bVar.dispose();
                }
                throw i13.d.b(e4);
            }
        }
        Throwable th3 = this.f193054b;
        if (th3 == null) {
            return this.f193053a;
        }
        throw i13.d.b(th3);
    }

    @Override // q03.d
    public final void onComplete() {
        countDown();
    }

    @Override // q03.t
    public final void onError(Throwable th3) {
        this.f193054b = th3;
        countDown();
    }

    @Override // q03.t
    public final void onSuccess(T t7) {
        this.f193053a = t7;
        countDown();
    }
}
