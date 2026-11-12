package com.xiaomi.hm.health.ui.smartplay.eventremind;

import com.xiaomi.hm.health.ui.smartplay.eventremind.RxUtil;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class RxUtil {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observable c(Observable observable) {
        return observable.subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread());
    }

    public static <T> Observable.Transformer<T, T> computationToMain() {
        return new Observable.Transformer() { // from class: ng6
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return RxUtil.c((Observable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observable d(Observable observable) {
        return observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public static <T> Observable.Transformer<T, T> ioToMain() {
        return new Observable.Transformer() { // from class: mg6
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return RxUtil.d((Observable) obj);
            }
        };
    }
}
