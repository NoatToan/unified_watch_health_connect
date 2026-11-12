package com.huami.assistant.updates;

import androidx.annotation.NonNull;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.assistant.updates.NotificationObservable;
import com.huami.watch.notification.data.NotificationData;
import com.huami.watch.util.Log;
import com.huami.watch.util.ThreadExecutors;
import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

/* JADX INFO: loaded from: classes5.dex */
public class NotificationObservable {
    private static final String a = "Noti-Observable";
    private static Observable<NotificationData> b;
    private static Emitter<NotificationData> c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(ObservableEmitter observableEmitter) throws Exception {
        Log.d(a, "Subscribed!!", new Object[0]);
        c = observableEmitter;
    }

    public static synchronized Observable<NotificationData> observable() {
        if (b == null) {
            b = Observable.create(new ObservableOnSubscribe() { // from class: hh5
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                    NotificationObservable.b(observableEmitter);
                }
            }).observeOn(Schedulers.from(ThreadExecutors.single("Notification")));
        }
        return b;
    }

    public static void onNext(@NonNull NotificationData notiData) {
        if (!SettingRepo.INSTANCE.loadAutoDetect() || c == null) {
            return;
        }
        Log.d(a, "OnNext : " + notiData, new Object[0]);
        c.onNext(notiData);
    }
}
