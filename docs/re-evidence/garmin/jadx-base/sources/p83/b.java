package p83;

import j83.g;
import j83.n;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.exceptions.OnErrorThrowable;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class b<T> extends AtomicBoolean implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<? super T> f136435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f136436b;

    public b(n<? super T> nVar, T t7) {
        this.f136435a = nVar;
        this.f136436b = t7;
    }

    @Override // j83.g
    public final void b(long j8) {
        if (j8 < 0) {
            h.s("n >= 0 required");
            return;
        }
        if (j8 != 0 && compareAndSet(false, true)) {
            n<? super T> nVar = this.f136435a;
            if (nVar.f97758a.f157986b) {
                return;
            }
            T t7 = this.f136436b;
            try {
                nVar.c(t7);
                if (nVar.f97758a.f157986b) {
                    return;
                }
                nVar.a();
            } catch (Throwable th3) {
                m83.a.b(th3);
                nVar.onError(OnErrorThrowable.addValueAsLastCause(th3, t7));
            }
        }
    }
}
