package rx.observers;

import rx.Observer;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes23.dex */
public final class Observers {
    private static final Observer<Object> a = new a();

    public static class a implements Observer<Object> {
        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Observer
        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        @Override // rx.Observer
        public final void onNext(Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class b<T> implements Observer<T> {
        public final /* synthetic */ Action1 a;

        public b(Action1 action1) {
            this.a = action1;
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
            this.a.call(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class c<T> implements Observer<T> {
        public final /* synthetic */ Action1 a;
        public final /* synthetic */ Action1 b;

        public c(Action1 action1, Action1 action2) {
            this.a = action1;
            this.b = action2;
        }

        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Observer
        public final void onError(Throwable th) {
            this.a.call(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.b.call(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class d<T> implements Observer<T> {
        public final /* synthetic */ Action0 a;
        public final /* synthetic */ Action1 b;
        public final /* synthetic */ Action1 c;

        public d(Action0 action0, Action1 action1, Action1 action2) {
            this.a = action0;
            this.b = action1;
            this.c = action2;
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.a.call();
        }

        @Override // rx.Observer
        public final void onError(Throwable th) {
            this.b.call(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.c.call(t);
        }
    }

    private Observers() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Observer<T> create(Action1<? super T> action1) {
        if (action1 != null) {
            return new b(action1);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> Observer<T> empty() {
        return (Observer<T>) a;
    }

    public static <T> Observer<T> create(Action1<? super T> action1, Action1<Throwable> action2) {
        if (action1 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (action2 != null) {
            return new c(action2, action1);
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public static <T> Observer<T> create(Action1<? super T> action1, Action1<Throwable> action2, Action0 action0) {
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
