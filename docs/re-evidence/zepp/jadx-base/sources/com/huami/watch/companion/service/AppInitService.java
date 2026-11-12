package com.huami.watch.companion.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.activeandroid.Model;
import com.google.gson.Gson;
import com.huami.assistant.dataexchange.Actions;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.dataexchange.WatchExchange;
import com.huami.assistant.dataexchange.sync.AlarmSync;
import com.huami.assistant.dataexchange.sync.EventUpdatesSync;
import com.huami.assistant.dataexchange.sync.PinSync;
import com.huami.assistant.dataexchange.sync.UpdateSync;
import com.huami.assistant.event.UpdateRefreshEvent;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.model.bean.UpdateType;
import com.huami.assistant.pin.PinNotificationReceiver;
import com.huami.assistant.sms.SmsObserver;
import com.huami.assistant.updates.UpdatesObservable;
import com.huami.assistant.util.PinBuilder;
import com.huami.identity.auth.alexa.AlexaAuthKtxKt;
import com.huami.identity.auth.alexa.AuthApi;
import com.huami.midong.webview.JsBridgeDelegate;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.IME.IMEservice;
import com.huami.watch.companion.R;
import com.huami.watch.companion.agps.AGpsSyncHelper;
import com.huami.watch.companion.agps.AGpsSyncService;
import com.huami.watch.companion.agreement.util.AgreementUtil;
import com.huami.watch.companion.assistant.EventObserver;
import com.huami.watch.companion.bind.BindHelper;
import com.huami.watch.companion.ble.lostwarning.BleLostWarningManager;
import com.huami.watch.companion.cloud.CloudUtil;
import com.huami.watch.companion.cloud.httpsupport.WearHttpSupportInterface;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.file.FileDownloadHelper;
import com.huami.watch.companion.jsbridge.JsBridgeCallback;
import com.huami.watch.companion.mediac.CommandHandler;
import com.huami.watch.companion.miot.SmartHomeServer;
import com.huami.watch.companion.notification.NotificationManager;
import com.huami.watch.companion.notification.NotificationUtil;
import com.huami.watch.companion.otaphone.service.OtaService;
import com.huami.watch.companion.service.AppInitService;
import com.huami.watch.companion.sport.SportNotificationUtil;
import com.huami.watch.companion.sync.SyncDeviceInfoHelper;
import com.huami.watch.companion.sync.SyncWatchFaceBgHelper;
import com.huami.watch.companion.sync.SyncWatchHealthHelper;
import com.huami.watch.companion.sync.SyncWatchSportHelper;
import com.huami.watch.companion.sync.ble.SyncBleFindPhoneHelper;
import com.huami.watch.companion.sync.throttle.SyncThrottler;
import com.huami.watch.companion.sync.throttle.bean.SyncSystemTimeTag;
import com.huami.watch.companion.sync.throttle.bean.SyncTag;
import com.huami.watch.companion.util.AppAnalyticsEvents;
import com.huami.watch.companion.weather.WeatherService;
import com.huami.watch.dataflow.event.HealthDataUpdatedEvent;
import com.huami.watch.dataflow.event.SportHistoryUpdatedEvent;
import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.dataflow.exchange.BaseExchange;
import com.huami.watch.dataflow.sync.SyncWatchDataHelper;
import com.huami.watch.hmwatchmanager.bt_connect.BGService_msg;
import com.huami.watch.transport.httpsupport.global.ConnectionReceiver;
import com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.NetworkUtil;
import com.huami.watch.util.NotificationBuilder;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.huami.watch.util.StorageUtil;
import com.huami.watch.util.TimeUtil;
import com.huami.watch.wififtp.WatchWifiFtpUtil;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes16.dex */
public class AppInitService extends IntentService {
    private static final String c = "AppInit";
    private static boolean d;
    private BroadcastReceiver a;
    private BroadcastReceiver b;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncTag syncTag;
            String action = intent.getAction();
            Log.d(AppInitService.c, "OnTimeChanged : " + action, new Object[0]);
            if ("android.intent.action.TIME_SET".equals(action) || "android.intent.action.TIMEZONE_CHANGED".equals(action)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if ("android.intent.action.TIMEZONE_CHANGED".equals(action)) {
                    Log.d(AppInitService.c, "OnTimeZoneChanged!!", new Object[0]);
                    syncTag = new SyncSystemTimeTag(SyncThrottler.SYNC_SYSTEM_TIME, jCurrentTimeMillis, SyncThrottler.FROM_TIME_CHANGED, intent.getStringExtra("time-zone"));
                    TimeUtil.resetFormatTimeZone();
                    ((Log.FileLogPrinter) Log.f()).resetFormatTimeZone();
                } else {
                    syncTag = new SyncTag(SyncThrottler.SYNC_SYSTEM_TIME, jCurrentTimeMillis, SyncThrottler.FROM_TIME_CHANGED);
                }
                if (SyncThrottler.isThrough(syncTag)) {
                    CompanionApplication.get().syncSystemTimeWithRetry(syncTag);
                }
                CloudUtil.forceRefreshTokenAsync(context);
                AlexaAuthKtxKt.forceRefreshTokenAsync((AuthApi) KoinJavaComponent.inject(AuthApi.class).getValue());
            }
        }
    }

    public class b extends BroadcastReceiver {
        private boolean a;

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (NetworkUtil.isOnline(context) && !this.a) {
                Log.d(AppInitService.c, "Network Conn State Changed, isOnline Now!!", new Object[0]);
                this.a = true;
                CompanionApplication.get().onNetworkOrChannelChanged(true);
            } else {
                if (NetworkUtil.isOnline(context) || !this.a) {
                    return;
                }
                Log.d(AppInitService.c, "Network Conn State Changed, isOffline Now!!", new Object[0]);
                this.a = false;
            }
        }
    }

    public AppInitService() {
        super(c);
        this.a = new a();
        this.b = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(Throwable th) throws Exception {
        HMLog.warn(c, th, new Function0() { // from class: ug
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return AppInitService.z();
            }
        });
    }

    private static void B(HealthDataUpdatedEvent healthDataUpdatedEvent) {
        Log.d(c, "OnHealthDataUpdated: " + healthDataUpdatedEvent, new Object[0]);
        if (healthDataUpdatedEvent.onlyUpdateHR) {
            HealthData.clearCacheHR();
        } else {
            HealthData.removeCache(healthDataUpdatedEvent.date);
        }
    }

    @TargetApi(26)
    public static void createNotificationDefaultChannel(Context context) {
        NotificationBuilder.createChannel(context, NotificationBuilder.CHANNEL_ID_DEFAULT, context.getString(R.string.app_name));
    }

    @SuppressLint({"CheckResult"})
    private void n() {
        if (d) {
            Log.d(c, "AppInitService Already Started, Abort!!", new Object[0]);
            return;
        }
        d = true;
        Log.i(c, "========== AppInitService Do Init... ==========", new Object[0]);
        final Context applicationContext = getApplicationContext();
        boolean zIsDebug = Config.isDebug();
        if (!zIsDebug) {
            FilesUtil.delete(StorageUtil.getSDCardLogFile(applicationContext));
        }
        NotificationManager.init(applicationContext);
        Config.configAnalytics(applicationContext, AgreementUtil.isExperienceAgree(applicationContext), zIsDebug);
        SyncWatchHealthHelper.getHelper().init(applicationContext);
        SyncWatchSportHelper.getHelper().init(applicationContext);
        SyncWatchDataHelper.getHelper().init(applicationContext);
        WearHttpSupportInterface.doInit(applicationContext);
        ConnectionReceiver connectionReceiver = new ConnectionReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BltTransporter.ACTION_WATCH_CONNECT_WITH_COMPANION);
        intentFilter.addAction("com.huami.watch.companion.action.UnbindDeviceStart");
        intentFilter.addAction(ConnectionReceiver.ACTION_CALL_OF_DUTY);
        intentFilter.addAction(ConnectionReceiver.ACTION_ASSISTANT_SYNC_DATA);
        applicationContext.registerReceiver(connectionReceiver, intentFilter);
        if (getResources().getBoolean(R.bool.remote_music_controller_service_enabled)) {
            CommandHandler.getInstance(applicationContext);
        }
        SmartHomeServer.init(getApplicationContext());
        WatchWifiFtpUtil.init(getApplicationContext());
        BleLostWarningManager.init(getApplicationContext());
        WatchExchange watchExchange = WatchExchange.get();
        watchExchange.init(applicationContext, new BaseExchange.Callback() { // from class: rg
            @Override // com.huami.watch.dataflow.exchange.BaseExchange.Callback
            public final void accept(Object obj, Object obj2) throws Exception {
                AppInitService.o((Action) obj, (ActionResult) obj2);
            }
        });
        watchExchange.addSync(Actions.EVENT, new EventUpdatesSync(applicationContext));
        watchExchange.addSync(Actions.ALARM, new AlarmSync());
        watchExchange.addSync(Actions.UPDATE, new UpdateSync());
        watchExchange.addSync(Actions.PIN, new PinSync());
        JsBridgeDelegate.init(new JsBridgeCallback(applicationContext));
        IntentFilter intentFilter2 = new IntentFilter("android.intent.action.TIME_SET");
        intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
        applicationContext.registerReceiver(this.a, intentFilter2);
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter3.addAction(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        applicationContext.registerReceiver(this.b, intentFilter3);
        NotificationUtil.NLS.delayRefreshNLS(applicationContext);
        RxBus.get().toObservable().subscribe(new Consumer() { // from class: yg
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                AppInitService.p(applicationContext, obj);
            }
        }, new Consumer() { // from class: dh
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                AppInitService.u((Throwable) obj);
            }
        });
        SmsObserver.registerObserver(applicationContext);
        EventObserver.registerObserver(applicationContext);
        PinNotificationReceiver.register(applicationContext);
        UpdatesObservable.observable().doOnNext(new Consumer() { // from class: xg
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                AppInitService.v(applicationContext, (Update) obj);
            }
        }).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: wg
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                AppInitService.y(applicationContext, (Update) obj);
            }
        }, new Consumer() { // from class: bh
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                AppInitService.A((Throwable) obj);
            }
        });
        Observable.timer(500L, TimeUnit.MILLISECONDS, Schedulers.trampoline()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ah
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.q(applicationContext, (Long) obj);
            }
        }, new Consumer() { // from class: ch
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                AppInitService.s((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(Action action, ActionResult actionResult) throws Exception {
        if (actionResult.isSuccess()) {
            RxBus.get().post(new UpdateRefreshEvent(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Context context, Object obj) throws Exception {
        if ((obj instanceof SportHistoryUpdatedEvent) && ((SportHistoryUpdatedEvent) obj).isFromWatch()) {
            SportNotificationUtil.onSportSyncSuccess(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Context context, Long l) throws Exception {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        BindHelper.getHelper().releaseUnfinished(context);
        if (currentDevice != null && DeviceUtil.hasEmptyInfo(currentDevice) && !DeviceSource.isSeriesEverest2(currentDevice)) {
            SyncDeviceInfoHelper.getHelper(context).startAsync();
        }
        SyncBleFindPhoneHelper.getHelper().init();
        try {
            startService(new Intent(context, (Class<?>) BGService_msg.class));
            startService(new Intent(context, (Class<?>) OtaService.class));
            startService(new Intent(context, (Class<?>) IMEservice.class));
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        SyncWatchFaceBgHelper.getHelper().startFileTransporter(context);
        AGpsSyncHelper.getHelper().startFileTransporter(context);
        FileDownloadHelper.getHelper().startFileTransporter(context);
        if (DeviceManager.getManager(context).hasBoundDevice()) {
            AGpsSyncService.scheduleSync(context, "AppOnCreate");
            WeatherService.start(context);
        }
        Log.i(c, "========== AppInitService Finish Init ==========", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Throwable th) throws Exception {
        HMLog.warn(c, th, new Function0() { // from class: tg
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return AppInitService.r();
            }
        });
    }

    public static void start(Context context) {
        if (d) {
            Log.d(c, "AppInitService Already Started, Abort!!", new Object[0]);
            return;
        }
        Log.d(c, "Start AppInitService...", new Object[0]);
        try {
            context.startService(new Intent(context, (Class<?>) AppInitService.class));
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(c, "StartAppInitServiceErr", e, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(Throwable th) throws Exception {
        HMLog.warn(c, th, new Function0() { // from class: sg
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return AppInitService.t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(Context context, Update update) throws Exception {
        UpdatesManager.getManager().save((Model) update);
        Analytics.event(context, AppAnalyticsEvents.getEventIdByTypeId(update.type));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Context context, Update update, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(ExchangeCenter.addUpdate(update, new Gson().toJson(PinBuilder.buildDynamicMsg(context, update))).isSuccess()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Update update, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            update.syncState = 2;
            UpdatesManager.getManager().save((Model) update);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(final Context context, final Update update) throws Exception {
        RxBus.get().post(new UpdateRefreshEvent(update.type));
        if (update.syncState == 1 && UpdateType.valueOf(update.type).isDeviceSupport(context)) {
            Rx.io(new ObservableOnSubscribe() { // from class: vg
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                    AppInitService.w(context, update, observableEmitter);
                }
            }).safeSubscribe(new Consumer() { // from class: zg
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    AppInitService.x(update, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z() {
        return "";
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (DeviceCompatibility.isO()) {
            createNotificationDefaultChannel(this);
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        Log.d(c, "OnDestroy!!", new Object[0]);
        if (DeviceCompatibility.isO()) {
            stopForeground(true);
        }
        super.onDestroy();
    }

    @Override // android.app.IntentService
    @WorkerThread
    public void onHandleIntent(@Nullable Intent intent) {
        n();
    }
}
