package org.greenrobot.greendao.rx;

import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.annotation.apihint.Experimental;
import org.greenrobot.greendao.query.LazyList;
import org.greenrobot.greendao.query.Query;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes23.dex */
@Experimental
public class RxQuery<T> extends org.greenrobot.greendao.rx.a {
    private final Query<T> a;

    public class a implements Callable<List<T>> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> call() throws Exception {
            return RxQuery.this.a.forCurrentThread().list();
        }
    }

    public class b implements Callable<T> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            return RxQuery.this.a.forCurrentThread().unique();
        }
    }

    public class c implements Observable.OnSubscribe<T> {
        public c() {
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            try {
                LazyList<T> lazyListListLazyUncached = RxQuery.this.a.forCurrentThread().listLazyUncached();
                try {
                    for (T t : lazyListListLazyUncached) {
                        if (subscriber.isUnsubscribed()) {
                            break;
                        } else {
                            subscriber.onNext(t);
                        }
                    }
                    lazyListListLazyUncached.close();
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    subscriber.onCompleted();
                } catch (Throwable th) {
                    lazyListListLazyUncached.close();
                    throw th;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                subscriber.onError(th2);
            }
        }
    }

    public RxQuery(Query<T> query) {
        this.a = query;
    }

    @Override // org.greenrobot.greendao.rx.a
    @Experimental
    public /* bridge */ /* synthetic */ Scheduler getScheduler() {
        return super.getScheduler();
    }

    @Experimental
    public Observable<List<T>> list() {
        return (Observable<List<T>>) wrap(new a());
    }

    public Observable<T> oneByOne() {
        return (Observable<T>) wrap(Observable.create(new c()));
    }

    @Experimental
    public Observable<T> unique() {
        return (Observable<T>) wrap(new b());
    }

    public RxQuery(Query<T> query, Scheduler scheduler) {
        super(scheduler);
        this.a = query;
    }
}
