package o83;

import java.util.concurrent.Callable;
import rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes11.dex */
public final class f<T> implements j83.e.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends T> f130876a;

    public f(Callable<? extends T> callable) {
        this.f130876a = callable;
    }

    @Override // n83.b
    public final void call(Object obj) {
        j83.n nVar = (j83.n) obj;
        p83.a aVar = new p83.a(nVar);
        nVar.i(aVar);
        try {
            T tCall = this.f130876a.call();
            do {
                int i14 = aVar.get();
                if (i14 != 0) {
                    if (i14 == 2 && aVar.compareAndSet(2, 3)) {
                        j83.n<? super T> nVar2 = aVar.f136433a;
                        if (nVar2.f97758a.f157986b) {
                            return;
                        }
                        try {
                            nVar2.c(tCall);
                            if (nVar2.f97758a.f157986b) {
                                return;
                            }
                            nVar2.a();
                            return;
                        } catch (Throwable th3) {
                            m83.a.b(th3);
                            nVar2.onError(OnErrorThrowable.addValueAsLastCause(th3, tCall));
                            return;
                        }
                    }
                    return;
                }
                aVar.f136434b = tCall;
            } while (!aVar.compareAndSet(0, 1));
        } catch (Throwable th4) {
            m83.a.c(th4, nVar);
        }
    }
}
