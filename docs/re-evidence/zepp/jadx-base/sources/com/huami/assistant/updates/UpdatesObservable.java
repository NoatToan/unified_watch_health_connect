package com.huami.assistant.updates;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.sms.SmsHelper;
import com.huami.assistant.sms.SmsUpdatesUtil;
import com.huami.assistant.sms.bean.Sms;
import com.huami.assistant.updates.UpdatesObservable;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.data.NotificationData;
import com.huami.watch.util.Log;
import com.huami.watch.util.ThreadExecutors;
import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class UpdatesObservable {
    private static final String a = "Updates-Observable";
    private static Observable<Update> b;
    private static Emitter<Update> c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(NotificationData notificationData) throws Exception {
        if (notificationData.isSMS) {
            return (TextUtils.isEmpty(notificationData.smsText) || UpdatesManager.getManager().isSmsExist(notificationData.smsDate)) ? false : true;
        }
        return (TextUtils.isEmpty(notificationData.title) || TextUtils.isEmpty(notificationData.text)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Update h(NotificationData notificationData) throws Exception {
        Update update = null;
        try {
            Sms smsGenerateSms = notificationData.isSMS ? SmsHelper.generateSms(notificationData.smsDate, notificationData.smsText) : SmsHelper.generateSmsByNotification(notificationData.when, notificationData.title, notificationData.text);
            update = smsGenerateSms != null ? SmsUpdatesUtil.generateUpdateBySms(smsGenerateSms) : null;
            Log.d(a, "Map : " + notificationData + "\n--> " + update, new Object[0]);
        } catch (Exception e) {
            Log.w(a, "MapNotificationErr", e, new Object[0]);
        }
        if (update == null) {
            update = new Update();
        }
        if (!notificationData.isSMS) {
            update.title = notificationData.title;
        }
        return update;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Update update) throws Exception {
        if (TextUtils.isEmpty(update.data)) {
            return;
        }
        onNext(update);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Throwable th) throws Exception {
        HMLog.warn(a, th, new Function0() { // from class: n48
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpdatesObservable.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(ObservableEmitter observableEmitter) throws Exception {
        Log.d(a, "Subscribed!!", new Object[0]);
        c = observableEmitter;
    }

    @SuppressLint({"CheckResult"})
    private static void m() {
        NotificationObservable.observable().filter(new Predicate() { // from class: m48
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return UpdatesObservable.g((NotificationData) obj);
            }
        }).map(new Function() { // from class: l48
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UpdatesObservable.h((NotificationData) obj);
            }
        }).subscribe(new Consumer() { // from class: j48
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                UpdatesObservable.i((Update) obj);
            }
        }, new Consumer() { // from class: k48
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                UpdatesObservable.k((Throwable) obj);
            }
        });
    }

    public static synchronized Observable<Update> observable() {
        if (b == null) {
            m();
            b = Observable.create(new ObservableOnSubscribe() { // from class: i48
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                    UpdatesObservable.l(observableEmitter);
                }
            }).observeOn(Schedulers.from(ThreadExecutors.single("Updates")));
        }
        return b;
    }

    public static void onNext(Update update) {
        Emitter<Update> emitter = c;
        if (emitter != null) {
            emitter.onNext(update);
        }
    }
}
