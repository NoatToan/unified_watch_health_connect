package i13;

import java.util.concurrent.atomic.AtomicInteger;
import q03.p;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private e() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(p<?> pVar, AtomicInteger atomicInteger, b bVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thB = bVar.b();
            if (thB != null) {
                pVar.onError(thB);
            } else {
                pVar.onComplete();
            }
        }
    }
}
