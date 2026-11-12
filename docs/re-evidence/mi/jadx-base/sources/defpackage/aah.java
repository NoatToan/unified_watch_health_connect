package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class aah<T> implements p4h.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable<? extends T> f832a;

    public static final class a<T> extends AtomicLong implements cbi {
        private static final long serialVersionUID = -8730475647105475802L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xno<? super T> f833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<? extends T> f834b;

        public a(xno<? super T> xnoVar, Iterator<? extends T> it) {
            this.f833a = xnoVar;
            this.f834b = it;
        }

        public void a() {
            xno<? super T> xnoVar = this.f833a;
            Iterator<? extends T> it = this.f834b;
            while (!xnoVar.isUnsubscribed()) {
                try {
                    xnoVar.onNext(it.next());
                    if (xnoVar.isUnsubscribed()) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (xnoVar.isUnsubscribed()) {
                                return;
                            }
                            xnoVar.onCompleted();
                            return;
                        }
                    } catch (Throwable th) {
                        pf8.e(th, xnoVar);
                        return;
                    }
                } catch (Throwable th2) {
                    pf8.e(th2, xnoVar);
                    return;
                }
            }
        }

        public void b(long j) {
            xno<? super T> xnoVar = this.f833a;
            Iterator<? extends T> it = this.f834b;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (xnoVar.isUnsubscribed()) {
                            return;
                        }
                        try {
                            xnoVar.onNext(it.next());
                            if (xnoVar.isUnsubscribed()) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (xnoVar.isUnsubscribed()) {
                                        return;
                                    }
                                    xnoVar.onCompleted();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                pf8.e(th, xnoVar);
                                return;
                            }
                        } catch (Throwable th2) {
                            pf8.e(th2, xnoVar);
                            return;
                        }
                    }
                }
                j = hx1.c(this, j2);
            } while (j != 0);
        }

        @Override // defpackage.cbi
        public void request(long j) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                a();
            } else {
                if (j <= 0 || hx1.b(this, j) != 0) {
                    return;
                }
                b(j);
            }
        }
    }

    public aah(Iterable<? extends T> iterable) {
        if (iterable == null) {
            throw new NullPointerException("iterable must not be null");
        }
        this.f832a = iterable;
    }

    @Override // defpackage.tc0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(xno<? super T> xnoVar) {
        try {
            Iterator<? extends T> it = this.f832a.iterator();
            boolean zHasNext = it.hasNext();
            if (xnoVar.isUnsubscribed()) {
                return;
            }
            if (zHasNext) {
                xnoVar.setProducer(new a(xnoVar, it));
            } else {
                xnoVar.onCompleted();
            }
        } catch (Throwable th) {
            pf8.e(th, xnoVar);
        }
    }
}
