package rx.subjects;

import rx.Observable;
import rx.Subscriber;
import rx.observers.SerializedObserver;

/* JADX INFO: loaded from: classes23.dex */
public class SerializedSubject<T, R> extends Subject<T, R> {
    private final SerializedObserver<T> b;
    private final Subject<T, R> c;

    public class a implements Observable.OnSubscribe<R> {
        public final /* synthetic */ Subject a;

        public a(Subject subject) {
            this.a = subject;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super R> subscriber) {
            this.a.unsafeSubscribe(subscriber);
        }
    }

    public SerializedSubject(Subject<T, R> subject) {
        super(new a(subject));
        this.c = subject;
        this.b = new SerializedObserver<>(subject);
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.c.hasObservers();
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.b.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.b.onError(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.b.onNext(t);
    }
}
