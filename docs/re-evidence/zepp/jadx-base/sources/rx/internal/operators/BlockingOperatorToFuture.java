package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;

/* JADX INFO: loaded from: classes23.dex */
public final class BlockingOperatorToFuture {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> extends Subscriber<T> {
        public final /* synthetic */ CountDownLatch f;
        public final /* synthetic */ AtomicReference g;
        public final /* synthetic */ AtomicReference h;

        public a(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f = countDownLatch;
            this.g = atomicReference;
            this.h = atomicReference2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.countDown();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.compareAndSet(null, th);
            this.f.countDown();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.h.set(t);
        }
    }

    private BlockingOperatorToFuture() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Future<T> toFuture(Observable<? extends T> observable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        return new b(countDownLatch, observable.single().subscribe((Subscriber<? super Object>) new a(countDownLatch, atomicReference2, atomicReference)), atomicReference2, atomicReference);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class b<T> implements Future<T> {
        private volatile boolean a;
        public final /* synthetic */ CountDownLatch b;
        public final /* synthetic */ Subscription c;
        public final /* synthetic */ AtomicReference d;
        public final /* synthetic */ AtomicReference e;

        public b(CountDownLatch countDownLatch, Subscription subscription, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.b = countDownLatch;
            this.c = subscription;
            this.d = atomicReference;
            this.e = atomicReference2;
        }

        private T a() throws ExecutionException {
            Throwable th = (Throwable) this.d.get();
            if (th != null) {
                throw new ExecutionException("Observable onError", th);
            }
            if (this.a) {
                throw new CancellationException("Subscription unsubscribed");
            }
            return (T) this.e.get();
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (this.b.getCount() <= 0) {
                return false;
            }
            this.a = true;
            this.c.unsubscribe();
            this.b.countDown();
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            this.b.await();
            return a();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.a;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.b.getCount() == 0;
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            if (this.b.await(j, timeUnit)) {
                return a();
            }
            throw new TimeoutException("Timed out after " + timeUnit.toMillis(j) + "ms waiting for underlying Observable.");
        }
    }
}
