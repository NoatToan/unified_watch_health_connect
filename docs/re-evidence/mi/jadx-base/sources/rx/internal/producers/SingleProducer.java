package rx.internal.producers;

import defpackage.cbi;
import defpackage.pf8;
import defpackage.xno;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleProducer<T> extends AtomicBoolean implements cbi {
    private static final long serialVersionUID = -3353584923995471404L;
    final xno<? super T> child;
    final T value;

    public SingleProducer(xno<? super T> xnoVar, T t) {
        this.child = xnoVar;
        this.value = t;
    }

    @Override // defpackage.cbi
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j != 0 && compareAndSet(false, true)) {
            xno<? super T> xnoVar = this.child;
            if (xnoVar.isUnsubscribed()) {
                return;
            }
            T t = this.value;
            try {
                xnoVar.onNext(t);
                if (xnoVar.isUnsubscribed()) {
                    return;
                }
                xnoVar.onCompleted();
            } catch (Throwable th) {
                pf8.f(th, xnoVar, t);
            }
        }
    }
}
