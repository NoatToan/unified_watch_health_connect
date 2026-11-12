package com.huami.watch.companion.bind;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.bind.BindBleHelper;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.sync.SyncResult;
import com.huami.watch.companion.sync.ble.SyncBleAGpsHelper;
import com.huami.watch.companion.sync.ble.SyncBleDeviceInfoHelper;
import com.huami.watch.companion.sync.ble.SyncBleNotificationHelper;
import com.huami.watch.companion.sync.ble.SyncBleUtil;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class BindBleHelper extends BindHelper {
    private static final String o = "BindBleHelper";

    private BindBleHelper() {
        this.b = 120000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(Object obj) throws Exception {
        int i;
        Log.d(o, "Event : " + obj, new Object[0]);
        if (!(obj instanceof ConnectedEvent) || 1 > (i = this.mState) || i >= 9) {
            return;
        }
        notifyStateChanged(9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String H0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I0(Throwable th) throws Exception {
        HMLog.warn(o, th, new Function0() { // from class: qv
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BindBleHelper.H0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(Context context, Integer num) throws Exception {
        try {
            onStateChanged(context, num.intValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            notifyStateChanged(8);
        } else {
            notifyStateChanged(-2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(Context context, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(v0(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(SyncResult syncResult) throws Exception {
        if (syncResult.success) {
            notifyStateChanged(11);
        } else {
            this.f.d(syncResult.failCode);
            notifyStateChanged(-4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Context context, ObservableEmitter observableEmitter) throws Exception {
        BindUtil.f(context);
        observableEmitter.onNext(Boolean.valueOf(BindUtil.b(context, this.f.a, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N0(Context context) {
        SyncBleUtil.syncSystemTimeToWatch();
        SyncBleUtil.syncUserInfoToWatch(context);
        SyncBleUtil.sendUserHeartRateAllDay(context);
        SyncBleUtil.sendUserStepGoal(context);
        SyncBleUtil.sendUserCalorieGoal(context);
        SyncBleNotificationHelper.sendEnableMusicControl(context);
        SyncBleUtil.sendLoginToken(context);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SyncBleAGpsHelper.getHelper(context).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0() throws Exception {
        notifyStateChanged(-6);
    }

    public static BindHelper newHelper() {
        Log.d(o, "New Helper!!", new Object[0]);
        BindBleHelper bindBleHelper = new BindBleHelper();
        BindHelper.sHelper = bindBleHelper;
        return bindBleHelper;
    }

    @Override // com.huami.watch.companion.bind.BindHelper
    public void init(final Context context, Consumer<Integer> consumer) {
        if (this.c) {
            Log.w(o, "Already Initialled, Abort!!", new Object[0]);
            return;
        }
        Log.d(tag(), "Init Helper..." + context + ", Callback: " + consumer, new Object[0]);
        if (context instanceof Activity) {
            H((Activity) context, consumer);
        }
        this.mHandler = new Handler();
        this.mSubscription = RxBus.get().toObservable().subscribe(new Consumer() { // from class: mv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.G0(obj);
            }
        }, new Consumer() { // from class: ov
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BindBleHelper.I0((Throwable) obj);
            }
        });
        addCallback(new Consumer() { // from class: nv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.J0(context, (Integer) obj);
            }
        });
        this.c = true;
    }

    @Override // com.huami.watch.companion.bind.BindHelper
    public void onBTRequestPairing(final Context context) {
        Log.i(o, "OnBT Pairing...", new Object[0]);
        postCheckBindResultDelay();
        Rx.io(new ObservableOnSubscribe() { // from class: iv
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.N(context, observableEmitter);
            }
        }).subscribe(Rx.safeObserver(new Consumer() { // from class: lv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.K0((Boolean) obj);
            }
        }));
    }

    @Override // com.huami.watch.companion.bind.BindHelper
    @SuppressLint({"CheckResult"})
    public void onConnected(final Context context) {
        Log.i(o, "OnConnected!!", new Object[0]);
        removeCheckBindResult();
        Rx.io(new ObservableOnSubscribe() { // from class: hv
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.L0(context, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: kv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.M0((SyncResult) obj);
            }
        });
        Analytics.event(context, AnalyticsEvents.EVENT_PAIR_SUCCESSFUL, 1);
    }

    @Override // com.huami.watch.companion.bind.BindHelper
    public void onRestore(final Context context) {
        Log.i(o, "OnRestore Start...", new Object[0]);
        Rx.io(new Runnable() { // from class: pv
            @Override // java.lang.Runnable
            public final void run() {
                BindBleHelper.N0(context);
            }
        }).subscribe(new Action() { // from class: jv
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.O0();
            }
        });
    }

    @Override // com.huami.watch.companion.bind.BindHelper
    public boolean syncDeviceInfoFromWatch(Context context, String str) {
        return SyncBleDeviceInfoHelper.getHelper(context).address(str).start();
    }

    @Override // com.huami.watch.companion.bind.BindHelper, com.huami.watch.companion.common.ASyncHelper
    public String tag() {
        return o;
    }
}
