package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorBufferWithSize<T> implements Observable.Operator<List<T>, T> {
    public final int a;
    public final int b;

    public static final class a<T> extends Subscriber<T> {
        public final Subscriber<? super List<T>> f;
        public final int g;
        public List<T> h;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorBufferWithSize$a$a, reason: collision with other inner class name */
        public class C1239a implements Producer {
            public C1239a() {
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= required but it was " + j);
                }
                if (j != 0) {
                    a.this.request(BackpressureUtils.multiplyCap(j, a.this.g));
                }
            }
        }

        public a(Subscriber<? super List<T>> subscriber, int i) {
            this.f = subscriber;
            this.g = i;
            request(0L);
        }

        public Producer c() {
            return new C1239a();
        }

        @Override // rx.Observer
        public void onCompleted() {
            List<T> list = this.h;
            if (list != null) {
                this.f.onNext(list);
            }
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.h = null;
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            List arrayList = this.h;
            if (arrayList == null) {
                arrayList = new ArrayList(this.g);
                this.h = arrayList;
            }
            arrayList.add(t);
            if (arrayList.size() == this.g) {
                this.h = null;
                this.f.onNext(arrayList);
            }
        }
    }

    public static final class b<T> extends Subscriber<T> {
        public final Subscriber<? super List<T>> f;
        public final int g;
        public final int h;
        public long i;
        public final ArrayDeque<List<T>> j = new ArrayDeque<>();
        public final AtomicLong k = new AtomicLong();
        public long l;

        public final class a extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = -4015894850868853147L;

            public a() {
            }

            @Override // rx.Producer
            public void request(long j) {
                b bVar = b.this;
                if (!BackpressureUtils.postCompleteRequest(bVar.k, j, bVar.j, bVar.f) || j == 0) {
                    return;
                }
                if (get() || !compareAndSet(false, true)) {
                    bVar.request(BackpressureUtils.multiplyCap(bVar.h, j));
                } else {
                    bVar.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(bVar.h, j - 1), bVar.g));
                }
            }
        }

        public b(Subscriber<? super List<T>> subscriber, int i, int i2) {
            this.f = subscriber;
            this.g = i;
            this.h = i2;
            request(0L);
        }

        public Producer d() {
            return new a();
        }

        @Override // rx.Observer
        public void onCompleted() {
            long j = this.l;
            if (j != 0) {
                if (j > this.k.get()) {
                    this.f.onError(new MissingBackpressureException("More produced than requested? " + j));
                    return;
                }
                this.k.addAndGet(-j);
            }
            BackpressureUtils.postCompleteDone(this.k, this.j, this.f);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.j.clear();
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long j = this.i;
            if (j == 0) {
                this.j.offer(new ArrayList(this.g));
            }
            long j2 = j + 1;
            if (j2 == this.h) {
                this.i = 0L;
            } else {
                this.i = j2;
            }
            Iterator<List<T>> it2 = this.j.iterator();
            while (it2.hasNext()) {
                it2.next().add(t);
            }
            List<T> listPeek = this.j.peek();
            if (listPeek == null || listPeek.size() != this.g) {
                return;
            }
            this.j.poll();
            this.l++;
            this.f.onNext(listPeek);
        }
    }

    public static final class c<T> extends Subscriber<T> {
        public final Subscriber<? super List<T>> f;
        public final int g;
        public final int h;
        public long i;
        public List<T> j;

        public final class a extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 3428177408082367154L;

            public a() {
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                }
                if (j != 0) {
                    c cVar = c.this;
                    if (get() || !compareAndSet(false, true)) {
                        cVar.request(BackpressureUtils.multiplyCap(j, cVar.h));
                    } else {
                        cVar.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j, cVar.g), BackpressureUtils.multiplyCap(cVar.h - cVar.g, j - 1)));
                    }
                }
            }
        }

        public c(Subscriber<? super List<T>> subscriber, int i, int i2) {
            this.f = subscriber;
            this.g = i;
            this.h = i2;
            request(0L);
        }

        public Producer d() {
            return new a();
        }

        @Override // rx.Observer
        public void onCompleted() {
            List<T> list = this.j;
            if (list != null) {
                this.j = null;
                this.f.onNext(list);
            }
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.j = null;
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long j = this.i;
            List arrayList = this.j;
            if (j == 0) {
                arrayList = new ArrayList(this.g);
                this.j = arrayList;
            }
            long j2 = j + 1;
            if (j2 == this.h) {
                this.i = 0L;
            } else {
                this.i = j2;
            }
            if (arrayList != null) {
                arrayList.add(t);
                if (arrayList.size() == this.g) {
                    this.j = null;
                    this.f.onNext(arrayList);
                }
            }
        }
    }

    public OperatorBufferWithSize(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException("count must be greater than 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("skip must be greater than 0");
        }
        this.a = i;
        this.b = i2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        int i = this.b;
        int i2 = this.a;
        if (i == i2) {
            a aVar = new a(subscriber, i2);
            subscriber.add(aVar);
            subscriber.setProducer(aVar.c());
            return aVar;
        }
        if (i > i2) {
            c cVar = new c(subscriber, i2, i);
            subscriber.add(cVar);
            subscriber.setProducer(cVar.d());
            return cVar;
        }
        b bVar = new b(subscriber, i2, i);
        subscriber.add(bVar);
        subscriber.setProducer(bVar.d());
        return bVar;
    }
}
