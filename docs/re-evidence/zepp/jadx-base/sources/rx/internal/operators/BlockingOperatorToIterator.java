package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import rx.Notification;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.internal.util.RxRingBuffer;

/* JADX INFO: loaded from: classes23.dex */
public final class BlockingOperatorToIterator {

    public static final class SubscriberIterator<T> extends Subscriber<Notification<? extends T>> implements Iterator<T> {
        public static final int i = (RxRingBuffer.SIZE * 3) / 4;
        private final BlockingQueue<Notification<? extends T>> f = new LinkedBlockingQueue();
        private Notification<? extends T> g;
        private int h;

        private Notification<? extends T> b() {
            try {
                Notification<? extends T> notificationPoll = this.f.poll();
                return notificationPoll != null ? notificationPoll : this.f.take();
            } catch (InterruptedException e) {
                unsubscribe();
                throw Exceptions.propagate(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.g == null) {
                this.g = b();
                int i2 = this.h + 1;
                this.h = i2;
                if (i2 >= i) {
                    request(i2);
                    this.h = 0;
                }
            }
            if (this.g.isOnError()) {
                throw Exceptions.propagate(this.g.getThrowable());
            }
            return !this.g.isOnCompleted();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T value = this.g.getValue();
            this.g = null;
            return value;
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.offer(Notification.createOnError(th));
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(RxRingBuffer.SIZE);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator");
        }

        @Override // rx.Observer
        public void onNext(Notification<? extends T> notification) {
            this.f.offer(notification);
        }
    }

    private BlockingOperatorToIterator() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterator<T> toIterator(Observable<? extends T> observable) {
        SubscriberIterator subscriberIterator = new SubscriberIterator();
        observable.materialize().subscribe((Subscriber<? super Notification<? extends T>>) subscriberIterator);
        return subscriberIterator;
    }
}
