package rx.internal.producers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.internal.operators.BackpressureUtils;

/* JADX INFO: loaded from: classes23.dex */
public final class ProducerObserverArbiter<T> implements Producer, Observer<T> {
    public static final Producer j = new a();
    public final Subscriber<? super T> a;
    public boolean b;
    public List<T> c;
    public Producer d;
    public long e;
    public long f;
    public Producer g;
    public Object h;
    public volatile boolean i;

    public static class a implements Producer {
        @Override // rx.Producer
        public void request(long j) {
        }
    }

    public ProducerObserverArbiter(Subscriber<? super T> subscriber) {
        this.a = subscriber;
    }

    public void a() {
        long j2;
        Producer producer;
        Object obj;
        List<T> list;
        boolean z;
        boolean z2;
        long size;
        Subscriber<? super T> subscriber = this.a;
        Producer producer2 = null;
        long jAddCap = 0;
        while (true) {
            synchronized (this) {
                j2 = this.f;
                producer = this.g;
                obj = this.h;
                list = this.c;
                z = true;
                if (j2 == 0 && producer == null && list == null && obj == null) {
                    this.b = false;
                    z2 = true;
                } else {
                    this.f = 0L;
                    this.g = null;
                    this.c = null;
                    this.h = null;
                    z2 = false;
                }
            }
            if (z2) {
                if (jAddCap == 0 || producer2 == null) {
                    return;
                }
                producer2.request(jAddCap);
                return;
            }
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (obj != null) {
                if (obj != Boolean.TRUE) {
                    subscriber.onError((Throwable) obj);
                    return;
                } else if (z) {
                    subscriber.onCompleted();
                    return;
                }
            }
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        T next = it2.next();
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        if (this.i) {
                            continue;
                        } else {
                            try {
                                subscriber.onNext(next);
                            } catch (Throwable th) {
                                Exceptions.throwOrReport(th, subscriber, next);
                                return;
                            }
                        }
                    } else {
                        size = ((long) list.size()) + 0;
                    }
                }
            } else {
                size = 0;
            }
            long j3 = this.e;
            if (j3 != Long.MAX_VALUE) {
                if (j2 != 0) {
                    j3 += j2;
                    if (j3 < 0) {
                        j3 = Long.MAX_VALUE;
                    }
                }
                if (size != 0 && j3 != Long.MAX_VALUE) {
                    j3 -= size;
                    if (j3 < 0) {
                        throw new IllegalStateException("More produced than requested");
                    }
                }
                this.e = j3;
            }
            if (producer == null) {
                producer = this.d;
                if (producer != null && j2 != 0) {
                    jAddCap = BackpressureUtils.addCap(jAddCap, j2);
                    producer2 = producer;
                }
            } else if (producer == j) {
                this.d = null;
            } else {
                this.d = producer;
                if (j3 != 0) {
                    jAddCap = BackpressureUtils.addCap(jAddCap, j3);
                    producer2 = producer;
                }
            }
        }
    }

    @Override // rx.Observer
    public void onCompleted() {
        synchronized (this) {
            if (this.b) {
                this.h = Boolean.TRUE;
            } else {
                this.b = true;
                this.a.onCompleted();
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        boolean z;
        synchronized (this) {
            if (this.b) {
                this.h = th;
                z = false;
            } else {
                this.b = true;
                z = true;
            }
        }
        if (z) {
            this.a.onError(th);
        } else {
            this.i = true;
        }
    }

    @Override // rx.Observer
    public void onNext(T t) {
        synchronized (this) {
            if (this.b) {
                List arrayList = this.c;
                if (arrayList == null) {
                    arrayList = new ArrayList(4);
                    this.c = arrayList;
                }
                arrayList.add(t);
                return;
            }
            this.b = true;
            try {
                this.a.onNext(t);
                long j2 = this.e;
                if (j2 != Long.MAX_VALUE) {
                    this.e = j2 - 1;
                }
                a();
            } catch (Throwable th) {
                synchronized (this) {
                    this.b = false;
                    throw th;
                }
            }
        }
    }

    @Override // rx.Producer
    public void request(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j2 == 0) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                this.f += j2;
                return;
            }
            this.b = true;
            Producer producer = this.d;
            try {
                long j3 = this.e + j2;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
                this.e = j3;
                a();
                if (producer != null) {
                    producer.request(j2);
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.b = false;
                    throw th;
                }
            }
        }
    }

    public void setProducer(Producer producer) {
        synchronized (this) {
            if (this.b) {
                if (producer == null) {
                    producer = j;
                }
                this.g = producer;
                return;
            }
            this.b = true;
            this.d = producer;
            long j2 = this.e;
            try {
                a();
                if (producer == null || j2 == 0) {
                    return;
                }
                producer.request(j2);
            } catch (Throwable th) {
                synchronized (this) {
                    this.b = false;
                    throw th;
                }
            }
        }
    }
}
