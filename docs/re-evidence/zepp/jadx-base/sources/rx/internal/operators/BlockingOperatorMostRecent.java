package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes23.dex */
public final class BlockingOperatorMostRecent {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> implements Iterable<T> {
        public final /* synthetic */ Object a;
        public final /* synthetic */ Observable b;

        public a(Object obj, Observable observable) {
            this.a = obj;
            this.b = observable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            b bVar = new b(this.a);
            this.b.subscribe((Subscriber) bVar);
            return bVar.b();
        }
    }

    public static final class b<T> extends Subscriber<T> {
        public volatile Object f;

        public class a implements Iterator<T> {
            private Object a;

            public a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = b.this.f;
                this.a = obj;
                return !NotificationLite.isCompleted(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.a == null) {
                        this.a = b.this.f;
                    }
                    if (NotificationLite.isCompleted(this.a)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.a)) {
                        throw Exceptions.propagate(NotificationLite.getError(this.a));
                    }
                    T t = (T) NotificationLite.getValue(this.a);
                    this.a = null;
                    return t;
                } catch (Throwable th) {
                    this.a = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public b(T t) {
            this.f = NotificationLite.next(t);
        }

        public Iterator<T> b() {
            return new a();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f = NotificationLite.completed();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f = NotificationLite.error(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f = NotificationLite.next(t);
        }
    }

    private BlockingOperatorMostRecent() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> mostRecent(Observable<? extends T> observable, T t) {
        return new a(t, observable);
    }
}
