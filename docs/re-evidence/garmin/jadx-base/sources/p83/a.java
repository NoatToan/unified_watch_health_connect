package p83;

import j83.g;
import j83.n;
import java.util.concurrent.atomic.AtomicInteger;
import rx.exceptions.OnErrorThrowable;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class a<T> extends AtomicInteger implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<? super T> f136433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f136434b;

    public a(n<? super T> nVar) {
        this.f136433a = nVar;
    }

    @Override // j83.g
    public final void b(long j8) {
        if (j8 < 0) {
            h.s("n >= 0 required");
            return;
        }
        if (j8 == 0) {
            return;
        }
        do {
            int i14 = get();
            if (i14 != 0) {
                if (i14 == 1 && compareAndSet(1, 3)) {
                    n<? super T> nVar = this.f136433a;
                    T t7 = this.f136434b;
                    if (nVar.f97758a.f157986b) {
                        return;
                    }
                    try {
                        nVar.c(t7);
                        if (nVar.f97758a.f157986b) {
                            return;
                        }
                        nVar.a();
                        return;
                    } catch (Throwable th3) {
                        m83.a.b(th3);
                        nVar.onError(OnErrorThrowable.addValueAsLastCause(th3, t7));
                        return;
                    }
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }
}
