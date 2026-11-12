package rx.internal.util;

import rx.Scheduler;
import rx.Single;
import rx.SingleSubscriber;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.schedulers.EventLoopsScheduler;

/* JADX INFO: loaded from: classes23.dex */
public final class ScalarSynchronousSingle<T> extends Single<T> {
    public final T b;

    public class a implements Single.OnSubscribe<T> {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            singleSubscriber.onSuccess((Object) this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public class b<R> implements Single.OnSubscribe<R> {
        public final /* synthetic */ Func1 a;

        public class a extends SingleSubscriber<R> {
            public final /* synthetic */ SingleSubscriber b;

            public a(SingleSubscriber singleSubscriber) {
                this.b = singleSubscriber;
            }

            @Override // rx.SingleSubscriber
            public void onError(Throwable th) {
                this.b.onError(th);
            }

            @Override // rx.SingleSubscriber
            public void onSuccess(R r) {
                this.b.onSuccess(r);
            }
        }

        public b(Func1 func1) {
            this.a = func1;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SingleSubscriber<? super R> singleSubscriber) {
            Single single = (Single) this.a.call(ScalarSynchronousSingle.this.b);
            if (single instanceof ScalarSynchronousSingle) {
                singleSubscriber.onSuccess(((ScalarSynchronousSingle) single).b);
                return;
            }
            a aVar = new a(singleSubscriber);
            singleSubscriber.add(aVar);
            single.subscribe(aVar);
        }
    }

    public static final class c<T> implements Single.OnSubscribe<T> {
        private final EventLoopsScheduler a;
        private final T b;

        public c(EventLoopsScheduler eventLoopsScheduler, T t) {
            this.a = eventLoopsScheduler;
            this.b = t;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            singleSubscriber.add(this.a.scheduleDirect(new e(singleSubscriber, this.b)));
        }
    }

    public static final class d<T> implements Single.OnSubscribe<T> {
        private final Scheduler a;
        private final T b;

        public d(Scheduler scheduler, T t) {
            this.a = scheduler;
            this.b = t;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            Scheduler.Worker workerCreateWorker = this.a.createWorker();
            singleSubscriber.add(workerCreateWorker);
            workerCreateWorker.schedule(new e(singleSubscriber, this.b));
        }
    }

    public static final class e<T> implements Action0 {
        private final SingleSubscriber<? super T> a;
        private final T b;

        public e(SingleSubscriber<? super T> singleSubscriber, T t) {
            this.a = singleSubscriber;
            this.b = t;
        }

        @Override // rx.functions.Action0
        public void call() {
            try {
                this.a.onSuccess(this.b);
            } catch (Throwable th) {
                this.a.onError(th);
            }
        }
    }

    public ScalarSynchronousSingle(T t) {
        super(new a(t));
        this.b = t;
    }

    public static <T> ScalarSynchronousSingle<T> create(T t) {
        return new ScalarSynchronousSingle<>(t);
    }

    public T get() {
        return this.b;
    }

    public <R> Single<R> scalarFlatMap(Func1<? super T, ? extends Single<? extends R>> func1) {
        return Single.create(new b(func1));
    }

    public Single<T> scalarScheduleOn(Scheduler scheduler) {
        return scheduler instanceof EventLoopsScheduler ? Single.create(new c((EventLoopsScheduler) scheduler, this.b)) : Single.create(new d(scheduler, this.b));
    }
}
