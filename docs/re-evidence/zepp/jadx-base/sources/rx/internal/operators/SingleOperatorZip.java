package rx.internal.operators;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.Exceptions;
import rx.functions.FuncN;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleOperatorZip {

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class a<R> implements Single.OnSubscribe<R> {
        public final /* synthetic */ Single[] a;
        public final /* synthetic */ FuncN b;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: rx.internal.operators.SingleOperatorZip$a$a, reason: collision with other inner class name */
        public class C1256a<T> extends SingleSubscriber<T> {
            public final /* synthetic */ Object[] b;
            public final /* synthetic */ int c;
            public final /* synthetic */ AtomicInteger d;
            public final /* synthetic */ SingleSubscriber e;
            public final /* synthetic */ AtomicBoolean f;

            public C1256a(Object[] objArr, int i, AtomicInteger atomicInteger, SingleSubscriber singleSubscriber, AtomicBoolean atomicBoolean) {
                this.b = objArr;
                this.c = i;
                this.d = atomicInteger;
                this.e = singleSubscriber;
                this.f = atomicBoolean;
            }

            @Override // rx.SingleSubscriber
            public void onError(Throwable th) {
                if (this.f.compareAndSet(false, true)) {
                    this.e.onError(th);
                } else {
                    RxJavaHooks.onError(th);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.SingleSubscriber
            public void onSuccess(T t) {
                this.b[this.c] = t;
                if (this.d.decrementAndGet() == 0) {
                    try {
                        this.e.onSuccess(a.this.b.call(this.b));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        onError(th);
                    }
                }
            }
        }

        public a(Single[] singleArr, FuncN funcN) {
            this.a = singleArr;
            this.b = funcN;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SingleSubscriber<? super R> singleSubscriber) {
            if (this.a.length == 0) {
                singleSubscriber.onError(new NoSuchElementException("Can't zip 0 Singles."));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(this.a.length);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Object[] objArr = new Object[this.a.length];
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            singleSubscriber.add(compositeSubscription);
            for (int i = 0; i < this.a.length && !compositeSubscription.isUnsubscribed() && !atomicBoolean.get(); i++) {
                C1256a c1256a = new C1256a(objArr, i, atomicInteger, singleSubscriber, atomicBoolean);
                compositeSubscription.add(c1256a);
                if (compositeSubscription.isUnsubscribed() || atomicBoolean.get()) {
                    return;
                }
                this.a[i].subscribe(c1256a);
            }
        }
    }

    private SingleOperatorZip() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, R> Single<R> zip(Single<? extends T>[] singleArr, FuncN<? extends R> funcN) {
        return Single.create(new a(singleArr, funcN));
    }
}
