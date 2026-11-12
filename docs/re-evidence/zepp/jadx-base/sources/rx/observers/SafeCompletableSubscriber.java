package rx.observers;

import rx.CompletableSubscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class SafeCompletableSubscriber implements CompletableSubscriber, Subscription {
    public final CompletableSubscriber a;
    public Subscription b;
    public boolean c;

    public SafeCompletableSubscriber(CompletableSubscriber completableSubscriber) {
        this.a = completableSubscriber;
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.c || this.b.isUnsubscribed();
    }

    @Override // rx.CompletableSubscriber
    public void onCompleted() {
        if (this.c) {
            return;
        }
        this.c = true;
        try {
            this.a.onCompleted();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw new OnCompletedFailedException(th);
        }
    }

    @Override // rx.CompletableSubscriber
    public void onError(Throwable th) {
        RxJavaHooks.onError(th);
        if (this.c) {
            return;
        }
        this.c = true;
        try {
            this.a.onError(th);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw new OnErrorFailedException(new CompositeException(th, th2));
        }
    }

    @Override // rx.CompletableSubscriber
    public void onSubscribe(Subscription subscription) {
        this.b = subscription;
        try {
            this.a.onSubscribe(this);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscription.unsubscribe();
            onError(th);
        }
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.b.unsubscribe();
    }
}
