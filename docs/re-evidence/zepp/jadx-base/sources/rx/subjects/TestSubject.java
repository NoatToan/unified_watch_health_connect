package rx.subjects;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;
import rx.schedulers.TestScheduler;

/* JADX INFO: loaded from: classes23.dex */
public final class TestSubject<T> extends Subject<T, T> {
    private final SubjectSubscriptionManager<T> b;
    private final Scheduler.Worker c;

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

    public class b implements Action0 {
        public b() {
        }

        @Override // rx.functions.Action0
        public void call() {
            TestSubject.this.c();
        }
    }

    public class c implements Action0 {
        public final /* synthetic */ Throwable a;

        public c(Throwable th) {
            this.a = th;
        }

        @Override // rx.functions.Action0
        public void call() {
            TestSubject.this.d(this.a);
        }
    }

    public class d implements Action0 {
        public final /* synthetic */ Object a;

        public d(Object obj) {
            this.a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rx.functions.Action0
        public void call() {
            TestSubject.this.e(this.a);
        }
    }

    public TestSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager, TestScheduler testScheduler) {
        super(onSubscribe);
        this.b = subjectSubscriptionManager;
        this.c = testScheduler.createWorker();
    }

    public static <T> TestSubject<T> create(TestScheduler testScheduler) {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        a aVar = new a(subjectSubscriptionManager);
        subjectSubscriptionManager.d = aVar;
        subjectSubscriptionManager.e = aVar;
        return new TestSubject<>(subjectSubscriptionManager, subjectSubscriptionManager, testScheduler);
    }

    public void c() {
        SubjectSubscriptionManager<T> subjectSubscriptionManager = this.b;
        if (subjectSubscriptionManager.b) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : subjectSubscriptionManager.j(NotificationLite.completed())) {
                subjectObserver.onCompleted();
            }
        }
    }

    public void d(Throwable th) {
        SubjectSubscriptionManager<T> subjectSubscriptionManager = this.b;
        if (subjectSubscriptionManager.b) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : subjectSubscriptionManager.j(NotificationLite.error(th))) {
                subjectObserver.onError(th);
            }
        }
    }

    public void e(T t) {
        for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.b.g()) {
            subjectObserver.onNext(t);
        }
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.b.g().length > 0;
    }

    @Override // rx.Observer
    public void onCompleted() {
        onCompleted(0L);
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        onError(th, 0L);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        onNext(t, 0L);
    }

    public void onCompleted(long j) {
        this.c.schedule(new b(), j, TimeUnit.MILLISECONDS);
    }

    public void onError(Throwable th, long j) {
        this.c.schedule(new c(th), j, TimeUnit.MILLISECONDS);
    }

    public void onNext(T t, long j) {
        this.c.schedule(new d(t), j, TimeUnit.MILLISECONDS);
    }
}
