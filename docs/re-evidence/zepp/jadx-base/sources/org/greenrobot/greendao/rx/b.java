package org.greenrobot.greendao.rx;

import java.util.concurrent.Callable;
import org.greenrobot.greendao.annotation.apihint.Internal;
import rx.Observable;
import rx.functions.Func0;

/* JADX INFO: loaded from: classes23.dex */
@Internal
class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> implements Func0<Observable<T>> {
        public final /* synthetic */ Callable a;

        public a(Callable callable) {
            this.a = callable;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<T> call() {
            try {
                return Observable.just(this.a.call());
            } catch (Exception e) {
                return Observable.error(e);
            }
        }
    }

    @Internal
    public static <T> Observable<T> a(Callable<T> callable) {
        return Observable.defer(new a(callable));
    }
}
