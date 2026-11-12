package rx.internal.producers;

import defpackage.cbi;
import defpackage.pf8;
import defpackage.xno;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleDelayedProducer<T> extends AtomicInteger implements cbi {
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2873467947112093874L;
    final xno<? super T> child;
    T value;

    public SingleDelayedProducer(xno<? super T> xnoVar) {
        this.child = xnoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void emit(xno<? super T> xnoVar, T t) {
        if (xnoVar.isUnsubscribed()) {
            return;
        }
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

    @Override // defpackage.cbi
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j == 0) {
            return;
        }
        do {
            int i = get();
            if (i != 0) {
                if (i == 1 && compareAndSet(1, 3)) {
                    emit(this.child, this.value);
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    public void setValue(T t) {
        do {
            int i = get();
            if (i != 0) {
                if (i == 2 && compareAndSet(2, 3)) {
                    emit(this.child, t);
                    return;
                }
                return;
            }
            this.value = t;
        } while (!compareAndSet(0, 1));
    }
}
