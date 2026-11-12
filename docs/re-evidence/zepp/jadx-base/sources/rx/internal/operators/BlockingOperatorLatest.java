package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import rx.Notification;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes23.dex */
public final class BlockingOperatorLatest {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> implements Iterable<T> {
        public final /* synthetic */ Observable a;

        public a(Observable observable) {
            this.a = observable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            b bVar = new b();
            this.a.materialize().subscribe((Subscriber<? super Notification<T>>) bVar);
            return bVar;
        }
    }

    public static final class b<T> extends Subscriber<Notification<? extends T>> implements Iterator<T> {
        public final Semaphore f = new Semaphore(0);
        public final AtomicReference<Notification<? extends T>> g = new AtomicReference<>();
        public Notification<? extends T> h;

        @Override // java.util.Iterator
        public boolean hasNext() {
            Notification<? extends T> notification = this.h;
            if (notification != null && notification.isOnError()) {
                throw Exceptions.propagate(this.h.getThrowable());
            }
            Notification<? extends T> notification2 = this.h;
            if ((notification2 == null || !notification2.isOnCompleted()) && this.h == null) {
                try {
                    this.f.acquire();
                    Notification<? extends T> andSet = this.g.getAndSet(null);
                    this.h = andSet;
                    if (andSet.isOnError()) {
                        throw Exceptions.propagate(this.h.getThrowable());
                    }
                } catch (InterruptedException e) {
                    unsubscribe();
                    Thread.currentThread().interrupt();
                    this.h = Notification.createOnError(e);
                    throw Exceptions.propagate(e);
                }
            }
            return !this.h.isOnCompleted();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext() || !this.h.isOnNext()) {
                throw new NoSuchElementException();
            }
            T value = this.h.getValue();
            this.h = null;
            return value;
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // rx.Observer
        public void onNext(Notification<? extends T> notification) {
            if (this.g.getAndSet(notification) == null) {
                this.f.release();
            }
        }
    }

    private BlockingOperatorLatest() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> latest(Observable<? extends T> observable) {
        return new a(observable);
    }
}
