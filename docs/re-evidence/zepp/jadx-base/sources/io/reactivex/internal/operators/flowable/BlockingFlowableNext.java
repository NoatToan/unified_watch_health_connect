package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes22.dex */
public final class BlockingFlowableNext<T> implements Iterable<T> {
    public final Publisher<? extends T> a;

    public static final class a<T> implements Iterator<T> {
        private final b<T> a;
        private final Publisher<? extends T> b;
        private T c;
        private boolean d = true;
        private boolean e = true;
        private Throwable f;
        private boolean g;

        public a(Publisher<? extends T> publisher, b<T> bVar) {
            this.b = publisher;
            this.a = bVar;
        }

        private boolean a() {
            try {
                if (!this.g) {
                    this.g = true;
                    this.a.b();
                    Flowable.fromPublisher(this.b).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) this.a);
                }
                Notification<T> notificationC = this.a.c();
                if (notificationC.isOnNext()) {
                    this.e = false;
                    this.c = notificationC.getValue();
                    return true;
                }
                this.d = false;
                if (notificationC.isOnComplete()) {
                    return false;
                }
                if (!notificationC.isOnError()) {
                    throw new IllegalStateException("Should not reach here");
                }
                Throwable error = notificationC.getError();
                this.f = error;
                throw ExceptionHelper.wrapOrThrow(error);
            } catch (InterruptedException e) {
                this.a.dispose();
                this.f = e;
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th = this.f;
            if (th != null) {
                throw ExceptionHelper.wrapOrThrow(th);
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
                throw ExceptionHelper.wrapOrThrow(th);
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

    public static final class b<T> extends DisposableSubscriber<Notification<T>> {
        private final BlockingQueue<Notification<T>> b = new ArrayBlockingQueue(1);
        public final AtomicInteger c = new AtomicInteger();

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Notification<T> notification) {
            if (this.c.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.b.offer(notification)) {
                    Notification<T> notificationPoll = this.b.poll();
                    if (notificationPoll != null && !notificationPoll.isOnNext()) {
                        notification = notificationPoll;
                    }
                }
            }
        }

        public void b() {
            this.c.set(1);
        }

        public Notification<T> c() throws InterruptedException {
            b();
            BlockingHelper.verifyNonBlocking();
            return this.b.take();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            RxJavaPlugins.onError(th);
        }
    }

    public BlockingFlowableNext(Publisher<? extends T> publisher) {
        this.a = publisher;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.a, new b());
    }
}
