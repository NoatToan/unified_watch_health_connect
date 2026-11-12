package org.greenrobot.greendao.rx;

import java.util.concurrent.Callable;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.annotation.apihint.Experimental;
import rx.Observable;
import rx.Scheduler;

/* JADX INFO: loaded from: classes23.dex */
@Experimental
public class RxTransaction extends org.greenrobot.greendao.rx.a {
    private final AbstractDaoSession a;

    public class a implements Callable<Void> {
        public final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            RxTransaction.this.a.runInTx(this.a);
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements Callable<T> {
        public final /* synthetic */ Callable a;

        public b(Callable callable) {
            this.a = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            return (T) RxTransaction.this.a.callInTx(this.a);
        }
    }

    public RxTransaction(AbstractDaoSession abstractDaoSession) {
        this.a = abstractDaoSession;
    }

    @Experimental
    public <T> Observable<T> call(Callable<T> callable) {
        return wrap(new b(callable));
    }

    @Experimental
    public AbstractDaoSession getDaoSession() {
        return this.a;
    }

    @Override // org.greenrobot.greendao.rx.a
    @Experimental
    public /* bridge */ /* synthetic */ Scheduler getScheduler() {
        return super.getScheduler();
    }

    @Experimental
    public Observable<Void> run(Runnable runnable) {
        return wrap(new a(runnable));
    }

    public RxTransaction(AbstractDaoSession abstractDaoSession, Scheduler scheduler) {
        super(scheduler);
        this.a = abstractDaoSession;
    }
}
