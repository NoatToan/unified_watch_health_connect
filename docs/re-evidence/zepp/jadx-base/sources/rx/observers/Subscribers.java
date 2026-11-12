package rx.observers;

import rx.Observer;
import rx.Subscriber;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes23.dex */
public final class Subscribers {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> extends Subscriber<T> {
        public final /* synthetic */ Observer f;

        public a(Observer observer) {
            this.f = observer;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class b<T> extends Subscriber<T> {
        public final /* synthetic */ Action1 f;

        public b(Action1 action1) {
            this.f = action1;
        }

        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Observer
        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.f.call(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class c<T> extends Subscriber<T> {
        public final /* synthetic */ Action1 f;
        public final /* synthetic */ Action1 g;

        public c(Action1 action1, Action1 action2) {
            this.f = action1;
            this.g = action2;
        }

        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Observer
        public final void onError(Throwable th) {
            this.f.call(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.g.call(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class d<T> extends Subscriber<T> {
        public final /* synthetic */ Action0 f;
        public final /* synthetic */ Action1 g;
        public final /* synthetic */ Action1 h;

        public d(Action0 action0, Action1 action1, Action1 action2) {
            this.f = action0;
            this.g = action1;
            this.h = action2;
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.f.call();
        }

        @Override // rx.Observer
        public final void onError(Throwable th) {
            this.g.call(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.h.call(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class e<T> extends Subscriber<T> {
        public final /* synthetic */ Subscriber f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f = subscriber2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(t);
        }
    }

    private Subscribers() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Subscriber<T> create(Action1<? super T> action1) {
        if (action1 != null) {
            return new b(action1);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> Subscriber<T> empty() {
        return from(Observers.empty());
    }

    public static <T> Subscriber<T> from(Observer<? super T> observer) {
        return new a(observer);
    }

    public static <T> Subscriber<T> wrap(Subscriber<? super T> subscriber) {
        return new e(subscriber, subscriber);
    }

    public static <T> Subscriber<T> create(Action1<? super T> action1, Action1<Throwable> action2) {
        if (action1 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (action2 != null) {
            return new c(action2, action1);
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public static <T> Subscriber<T> create(Action1<? super T> action1, Action1<Throwable> action2, Action0 action0) {
        if (action1 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (action2 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        if (action0 != null) {
            return new d(action0, action2, action1);
        }
        throw new IllegalArgumentException("onComplete can not be null");
    }
}
