package rx.singles;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.Exceptions;
import rx.internal.operators.BlockingOperatorToFuture;
import rx.internal.util.BlockingUtils;

/* JADX INFO: loaded from: classes23.dex */
public final class BlockingSingle<T> {
    private final Single<? extends T> a;

    public class a extends SingleSubscriber<T> {
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ CountDownLatch c;
        public final /* synthetic */ AtomicReference d;

        public a(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.b = atomicReference;
            this.c = countDownLatch;
            this.d = atomicReference2;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            this.d.set(th);
            this.c.countDown();
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            this.b.set(t);
            this.c.countDown();
        }
    }

    private BlockingSingle(Single<? extends T> single) {
        this.a = single;
    }

    public static <T> BlockingSingle<T> from(Single<? extends T> single) {
        return new BlockingSingle<>(single);
    }

    public Future<T> toFuture() {
        return BlockingOperatorToFuture.toFuture(this.a.toObservable());
    }

    public T value() {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        BlockingUtils.awaitForComplete(countDownLatch, this.a.subscribe(new a(atomicReference, countDownLatch, atomicReference2)));
        Throwable th = (Throwable) atomicReference2.get();
        if (th == null) {
            return (T) atomicReference.get();
        }
        throw Exceptions.propagate(th);
    }
}
