package com.huami.watch.util;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

/* JADX INFO: loaded from: classes11.dex */
public final class RxBus {
    private static volatile RxBus b;
    private final Subject<Object> a = PublishSubject.create().toSerialized();

    public class a implements Runnable {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            RxBus.this.a.onNext(this.a);
        }
    }

    private RxBus() {
    }

    public static RxBus get() {
        RxBus rxBus = b;
        if (rxBus == null) {
            synchronized (RxBus.class) {
                rxBus = b;
                if (rxBus == null) {
                    rxBus = new RxBus();
                    b = rxBus;
                }
            }
        }
        return rxBus;
    }

    public boolean hasObservers() {
        return this.a.hasObservers();
    }

    public void post(Object obj) {
        if (this.a.hasObservers()) {
            this.a.onNext(obj);
        }
    }

    public void postMainThread(Object obj) {
        if (this.a.hasObservers()) {
            Rx.mainThread(new a(obj));
        }
    }

    public Observable<Object> toObservable() {
        return this.a;
    }
}
