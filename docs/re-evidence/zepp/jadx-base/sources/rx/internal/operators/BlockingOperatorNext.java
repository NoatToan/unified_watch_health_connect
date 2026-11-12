package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Notification;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes23.dex */
public final class BlockingOperatorNext {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> implements Iterable<T> {
        public final /* synthetic */ Observable a;

        public a(Observable observable) {
            this.a = observable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new b(this.a, new c());
        }
    }

    public static final class b<T> implements Iterator<T> {
        private final c<T> a;
        private final Observable<? extends T> b;
        private T c;
        private boolean d = true;
        private boolean e = true;
        private Throwable f;
        private boolean g;

        public b(Observable<? extends T> observable, c<T> cVar) {
            this.b = observable;
            this.a = cVar;
        }

        private boolean a() {
            try {
                if (!this.g) {
                    this.g = true;
                    this.a.b(1);
                    this.b.materialize().subscribe((Subscriber<? super Notification<? extends T>>) this.a);
                }
                Notification<? extends T> notificationC = this.a.c();
                if (notificationC.isOnNext()) {
                    this.e = false;
                    this.c = notificationC.getValue();
                    return true;
                }
                this.d = false;
                if (notificationC.isOnCompleted()) {
                    return false;
                }
                if (!notificationC.isOnError()) {
                    throw new IllegalStateException("Should not reach here");
                }
                Throwable throwable = notificationC.getThrowable();
                this.f = throwable;
                throw Exceptions.propagate(throwable);
            } catch (InterruptedException e) {
                this.a.unsubscribe();
                Thread.currentThread().interrupt();
                this.f = e;
                throw Exceptions.propagate(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th = this.f;
            if (th != null) {
                throw Exceptions.propagate(th);
            }
            if (this.d) {
                return !this.e || a();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f;
            if (th != null) {
                throw Exceptions.propagate(th);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.e = true;
            return this.c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    public static final class c<T> extends Subscriber<Notification<? extends T>> {
        private final BlockingQueue<Notification<? extends T>> f = new ArrayBlockingQueue(1);
        public final AtomicInteger g = new AtomicInteger();

        public void b(int i) {
            this.g.set(i);
        }

        public Notification<? extends T> c() throws InterruptedException {
            b(1);
            return this.f.take();
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }

        @Override // rx.Observer
        public void onNext(Notification<? extends T> notification) {
            if (this.g.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.f.offer(notification)) {
                    Notification<? extends T> notificationPoll = this.f.poll();
                    if (notificationPoll != null && !notificationPoll.isOnNext()) {
                        notification = notificationPoll;
                    }
                }
            }
        }
    }

    private BlockingOperatorNext() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> next(Observable<? extends T> observable) {
        return new a(observable);
    }
}
