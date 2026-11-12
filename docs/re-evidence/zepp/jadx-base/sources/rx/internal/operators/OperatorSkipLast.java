package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public class OperatorSkipLast<T> implements Observable.Operator<T, T> {
    public final int a;

    public class a extends Subscriber<T> {
        private final Deque<Object> f;
        public final /* synthetic */ Subscriber g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.g = subscriber2;
            this.f = new ArrayDeque();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.g.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rx.Observer
        public void onNext(T t) {
            if (OperatorSkipLast.this.a == 0) {
                this.g.onNext(t);
                return;
            }
            if (this.f.size() == OperatorSkipLast.this.a) {
                this.g.onNext(NotificationLite.getValue(this.f.removeFirst()));
            } else {
                request(1L);
            }
            this.f.offerLast(NotificationLite.next(t));
        }
    }

    public OperatorSkipLast(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("count could not be negative");
        }
        this.a = i;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new a(subscriber, subscriber);
    }
}
