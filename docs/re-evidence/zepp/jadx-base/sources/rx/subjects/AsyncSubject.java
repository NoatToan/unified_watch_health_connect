package rx.subjects;

import java.util.ArrayList;
import rx.Observable;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;
import rx.internal.producers.SingleProducer;

/* JADX INFO: loaded from: classes23.dex */
public final class AsyncSubject<T> extends Subject<T, T> {
    public final SubjectSubscriptionManager<T> b;
    public volatile Object c;

    public static class a implements Action1<SubjectSubscriptionManager.SubjectObserver<T>> {
        public final /* synthetic */ SubjectSubscriptionManager a;

        public a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.a = subjectSubscriptionManager;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SubjectSubscriptionManager.SubjectObserver<T> subjectObserver) {
            Object objE = this.a.e();
            if (objE == null || NotificationLite.isCompleted(objE)) {
                subjectObserver.onCompleted();
            } else if (NotificationLite.isError(objE)) {
                subjectObserver.onError(NotificationLite.getError(objE));
            } else {
                subjectObserver.a.setProducer(new SingleProducer(subjectObserver.a, NotificationLite.getValue(objE)));
            }
        }
    }

    public AsyncSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(onSubscribe);
        this.b = subjectSubscriptionManager;
    }

    public static <T> AsyncSubject<T> create() {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        subjectSubscriptionManager.e = new a(subjectSubscriptionManager);
        return new AsyncSubject<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    public Throwable getThrowable() {
        Object objE = this.b.e();
        if (NotificationLite.isError(objE)) {
            return NotificationLite.getError(objE);
        }
        return null;
    }

    public T getValue() {
        Object obj = this.c;
        if (NotificationLite.isError(this.b.e()) || !NotificationLite.isNext(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    public boolean hasCompleted() {
        Object objE = this.b.e();
        return (objE == null || NotificationLite.isError(objE)) ? false : true;
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.b.g().length > 0;
    }

    public boolean hasThrowable() {
        return NotificationLite.isError(this.b.e());
    }

    public boolean hasValue() {
        return !NotificationLite.isError(this.b.e()) && NotificationLite.isNext(this.c);
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.b.b) {
            Object objCompleted = this.c;
            if (objCompleted == null) {
                objCompleted = NotificationLite.completed();
            }
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.b.j(objCompleted)) {
                if (objCompleted == NotificationLite.completed()) {
                    subjectObserver.onCompleted();
                } else {
                    subjectObserver.a.setProducer(new SingleProducer(subjectObserver.a, NotificationLite.getValue(objCompleted)));
                }
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        if (this.b.b) {
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.b.j(NotificationLite.error(th))) {
                try {
                    subjectObserver.onError(th);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.c = NotificationLite.next(t);
    }
}
