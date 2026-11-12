package i13;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AtomicReference<Throwable> {
    public final boolean a(Throwable th3) {
        d.a aVar = d.f87106a;
        while (true) {
            Throwable th4 = get();
            if (th4 == d.f87106a) {
                return false;
            }
            Throwable compositeException = th4 == null ? th3 : new CompositeException(th4, th3);
            while (!compareAndSet(th4, compositeException)) {
                if (get() != th4) {
                }
            }
            return true;
        }
    }

    public final Throwable b() {
        d.a aVar = d.f87106a;
        Throwable th3 = get();
        d.a aVar2 = d.f87106a;
        return th3 != aVar2 ? getAndSet(aVar2) : th3;
    }
}
