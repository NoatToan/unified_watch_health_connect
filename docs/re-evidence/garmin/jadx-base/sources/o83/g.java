package o83;

import j20.x;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class g<T> implements j83.e.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable<? extends T> f130877a;

    public static final class a<T> extends AtomicLong implements j83.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j83.n<? super T> f130878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<? extends T> f130879b;

        public a(j83.n<? super T> nVar, Iterator<? extends T> it) {
            this.f130878a = nVar;
            this.f130879b = it;
        }

        @Override // j83.g
        public final void b(long j8) {
            long j14;
            long j15;
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j8 == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                j83.n<? super T> nVar = this.f130878a;
                Iterator<? extends T> it = this.f130879b;
                while (!nVar.f97758a.f157986b) {
                    try {
                        nVar.c(it.next());
                        if (nVar.f97758a.f157986b) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                if (nVar.f97758a.f157986b) {
                                    return;
                                }
                                nVar.a();
                                return;
                            }
                        } catch (Throwable th3) {
                            m83.a.c(th3, nVar);
                            return;
                        }
                    } catch (Throwable th4) {
                        m83.a.c(th4, nVar);
                        return;
                    }
                }
                return;
            }
            if (j8 > 0) {
                do {
                    j14 = get();
                    j15 = j14 + j8;
                    if (j15 < 0) {
                        j15 = Long.MAX_VALUE;
                    }
                } while (!compareAndSet(j14, j15));
                if (j14 == 0) {
                    j83.n<? super T> nVar2 = this.f130878a;
                    Iterator<? extends T> it3 = this.f130879b;
                    do {
                        long j16 = 0;
                        while (true) {
                            if (j16 == j8) {
                                j8 = get();
                                if (j16 == j8) {
                                    break;
                                }
                            } else {
                                if (nVar2.f97758a.f157986b) {
                                    return;
                                }
                                try {
                                    nVar2.c(it3.next());
                                    if (nVar2.f97758a.f157986b) {
                                        return;
                                    }
                                    try {
                                        if (!it3.hasNext()) {
                                            if (nVar2.f97758a.f157986b) {
                                                return;
                                            }
                                            nVar2.a();
                                            return;
                                        }
                                        j16++;
                                    } catch (Throwable th5) {
                                        m83.a.c(th5, nVar2);
                                        return;
                                    }
                                } catch (Throwable th6) {
                                    m83.a.c(th6, nVar2);
                                    return;
                                }
                            }
                        }
                        j8 = o83.a.a(this, j16);
                    } while (j8 != 0);
                }
            }
        }
    }

    public g(Iterable<? extends T> iterable) {
        if (iterable != null) {
            this.f130877a = iterable;
        } else {
            x.l("iterable must not be null");
            throw null;
        }
    }

    @Override // n83.b
    public final void call(Object obj) {
        j83.n nVar = (j83.n) obj;
        try {
            Iterator<? extends T> it = this.f130877a.iterator();
            boolean zHasNext = it.hasNext();
            if (nVar.f97758a.f157986b) {
                return;
            }
            if (zHasNext) {
                nVar.i(new a(nVar, it));
            } else {
                nVar.a();
            }
        } catch (Throwable th3) {
            m83.a.c(th3, nVar);
        }
    }
}
