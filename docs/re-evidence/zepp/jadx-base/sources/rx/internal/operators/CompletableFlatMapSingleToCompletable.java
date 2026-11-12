package rx.internal.operators;

import rx.Completable;
import rx.CompletableSubscriber;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes23.dex */
public final class CompletableFlatMapSingleToCompletable<T> implements Completable.OnSubscribe {
    public final Single<T> a;
    public final Func1<? super T, ? extends Completable> b;

    public static final class a<T> extends SingleSubscriber<T> implements CompletableSubscriber {
        public final CompletableSubscriber b;
        public final Func1<? super T, ? extends Completable> c;

        public a(CompletableSubscriber completableSubscriber, Func1<? super T, ? extends Completable> func1) {
            this.b = completableSubscriber;
            this.c = func1;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            this.b.onCompleted();
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            add(subscription);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            try {
                Completable completableCall = this.c.call(t);
                if (completableCall == null) {
                    onError(new NullPointerException("The mapper returned a null Completable"));
                } else {
                    completableCall.subscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                onError(th);
            }
        }
    }

    public CompletableFlatMapSingleToCompletable(Single<T> single, Func1<? super T, ? extends Completable> func1) {
        this.a = single;
        this.b = func1;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        a aVar = new a(completableSubscriber, this.b);
        completableSubscriber.onSubscribe(aVar);
        this.a.subscribe(aVar);
    }
}
