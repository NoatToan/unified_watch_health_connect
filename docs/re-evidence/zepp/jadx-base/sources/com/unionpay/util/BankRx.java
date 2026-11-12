package com.unionpay.util;

import androidx.annotation.NonNull;
import com.huami.tools.log.HMLog;
import com.unionpay.util.BankRx;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/* JADX INFO: loaded from: classes18.dex */
public class BankRx {
    public static final String TAG = "Rx";
    private static final Consumer<Throwable> a = new Consumer() { // from class: an
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) throws Exception {
            BankRx.c((Throwable) obj);
        }
    };

    public static final class RxBuilder<T> {
        private Observable<T> a;

        private RxBuilder() {
        }

        public RxBuilder<T> io(@NonNull ObservableOnSubscribe<T> observableOnSubscribe) {
            this.a = Observable.create(observableOnSubscribe).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            return this;
        }

        public Observable<T> observable() {
            return this.a;
        }

        public final Disposable safeSubscribe(@NonNull Consumer<? super T> consumer) {
            return this.a.subscribe(consumer, BankRx.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Throwable th) throws Exception {
        HMLog.w("Rx", "OnError", th);
    }

    public static <T> RxBuilder<T> io(@NonNull ObservableOnSubscribe<T> observableOnSubscribe) {
        return new RxBuilder().io(observableOnSubscribe);
    }
}
