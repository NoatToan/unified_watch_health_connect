package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import rx.Observable;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes23.dex */
public final class BehaviorSubject<T> extends Subject<T, T> {
    private static final Object[] c = new Object[0];
    private final SubjectSubscriptionManager<T> b;

    public static class a implements Action1<SubjectSubscriptionManager.SubjectObserver<T>> {
        public final /* synthetic */ SubjectSubscriptionManager a;

        public a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.a = subjectSubscriptionManager;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SubjectSubscriptionManager.SubjectObserver<T> subjectObserver) throws Throwable {
            subjectObserver.b(this.a.e());
        }
    }

    public BehaviorSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(onSubscribe);
        this.b = subjectSubscriptionManager;
    }

    private static <T> BehaviorSubject<T> c(T t, boolean z) {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        if (z) {
            subjectSubscriptionManager.i(NotificationLite.next(t));
        }
        a aVar = new a(subjectSubscriptionManager);
        subjectSubscriptionManager.d = aVar;
        subjectSubscriptionManager.e = aVar;
        return new BehaviorSubject<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    public static <T> BehaviorSubject<T> create() {
        return c(null, false);
    }

    public int d() {
        return this.b.g().length;
    }

    public Throwable getThrowable() {
        Object objE = this.b.e();
        if (NotificationLite.isError(objE)) {
            return NotificationLite.getError(objE);
        }
        return null;
    }

    public T getValue() {
        Object objE = this.b.e();
        if (NotificationLite.isNext(objE)) {
            return (T) NotificationLite.getValue(objE);
        }
        return null;
    }

    public T[] getValues(T[] tArr) {
        Object objE = this.b.e();
        if (NotificationLite.isNext(objE)) {
            if (tArr.length == 0) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
            }
            tArr[0] = NotificationLite.getValue(objE);
            if (tArr.length > 1) {
                tArr[1] = null;
            }
        } else if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    public boolean hasCompleted() {
        return NotificationLite.isCompleted(this.b.e());
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.b.g().length > 0;
    }

    public boolean hasThrowable() {
        return NotificationLite.isError(this.b.e());
    }

    public boolean hasValue() {
        return NotificationLite.isNext(this.b.e());
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.b.e() == null || this.b.b) {
            Object objCompleted = NotificationLite.completed();
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.b.j(objCompleted)) {
                subjectObserver.d(objCompleted);
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        if (this.b.e() == null || this.b.b) {
            Object objError = NotificationLite.error(th);
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.b.j(objError)) {
                try {
                    subjectObserver.d(objError);
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
        if (this.b.e() == null || this.b.b) {
            Object next = NotificationLite.next(t);
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.b.f(next)) {
                subjectObserver.d(next);
            }
        }
    }

    public static <T> BehaviorSubject<T> create(T t) {
        return c(t, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = c;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }
}
