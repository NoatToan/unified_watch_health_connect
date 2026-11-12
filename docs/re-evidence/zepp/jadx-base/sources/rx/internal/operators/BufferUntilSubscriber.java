package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subjects.Subject;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class BufferUntilSubscriber<T> extends Subject<T, T> {
    public static final Observer d = new a();
    public final c<T> b;
    private boolean c;

    public static class a implements Observer {
        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }

        @Override // rx.Observer
        public void onNext(Object obj) {
        }
    }

    public static final class b<T> implements Observable.OnSubscribe<T> {
        public final c<T> a;

        public class a implements Action0 {
            public a() {
            }

            @Override // rx.functions.Action0
            public void call() {
                b.this.a.set(BufferUntilSubscriber.d);
            }
        }

        public b(c<T> cVar) {
            this.a = cVar;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            boolean z;
            if (!this.a.a(null, subscriber)) {
                subscriber.onError(new IllegalStateException("Only one subscriber allowed!"));
                return;
            }
            subscriber.add(Subscriptions.create(new a()));
            synchronized (this.a.a) {
                c<T> cVar = this.a;
                z = true;
                if (cVar.b) {
                    z = false;
                } else {
                    cVar.b = true;
                }
            }
            if (!z) {
                return;
            }
            while (true) {
                Object objPoll = this.a.c.poll();
                if (objPoll != null) {
                    NotificationLite.accept(this.a.get(), objPoll);
                } else {
                    synchronized (this.a.a) {
                        if (this.a.c.isEmpty()) {
                            this.a.b = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    public static final class c<T> extends AtomicReference<Observer<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        public boolean b;
        public final Object a = new Object();
        public final ConcurrentLinkedQueue<Object> c = new ConcurrentLinkedQueue<>();

        public boolean a(Observer<? super T> observer, Observer<? super T> observer2) {
            return compareAndSet(observer, observer2);
        }
    }

    private BufferUntilSubscriber(c<T> cVar) {
        super(new b(cVar));
        this.b = cVar;
    }

    private void c(Object obj) {
        synchronized (this.b.a) {
            this.b.c.add(obj);
            if (this.b.get() != null) {
                c<T> cVar = this.b;
                if (!cVar.b) {
                    this.c = true;
                    cVar.b = true;
                }
            }
        }
        if (!this.c) {
            return;
        }
        while (true) {
            Object objPoll = this.b.c.poll();
            if (objPoll == null) {
                return;
            } else {
                NotificationLite.accept(this.b.get(), objPoll);
            }
        }
    }

    public static <T> BufferUntilSubscriber<T> create() {
        return new BufferUntilSubscriber<>(new c());
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        boolean z;
        synchronized (this.b.a) {
            z = this.b.get() != null;
        }
        return z;
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.c) {
            this.b.get().onCompleted();
        } else {
            c(NotificationLite.completed());
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        if (this.c) {
            this.b.get().onError(th);
        } else {
            c(NotificationLite.error(th));
        }
    }

    @Override // rx.Observer
    public void onNext(T t) {
        if (this.c) {
            this.b.get().onNext(t);
        } else {
            c(NotificationLite.next(t));
        }
    }
}
