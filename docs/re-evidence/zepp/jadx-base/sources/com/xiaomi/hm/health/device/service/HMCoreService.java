package com.xiaomi.hm.health.device.service;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.account.HMLoginManager;
import com.huami.account.event.EventAccountStatus;
import com.huami.applet.CompanionStarterKt;
import com.huami.assistant.ui.v2.usecase.FetchRemoteScheduleUseCase;
import com.huami.bluetooth.device.MozartDevice;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.HealthUi;
import com.huami.device.feature.health.user.HealthConfig;
import com.huami.device.feature.notification.appnotify.LinkageNotificationCenter;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.jac.repo.repo.JacCardRepo;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.moving.ui.event.EventRemindDistanceVoice;
import com.huami.nfc.applet.BusCardExtensions;
import com.huami.phone_call.sms.PhoneCallReplyDelegate;
import com.huami.privacy.PrivacyProvider;
import com.huami.privacy.plugin.IsMainProcess;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.wallet.accessdoor.api.service.AccessDoorDataSource;
import com.huami.wallet.accessdoor.utils.AccessDoorUI;
import com.huami.wallet.lib.entity.NFCTransEntity;
import com.huami.wallet.ui.api.NfcNotificationApi;
import com.huami.wallet.ui.repository.BusCardRepo;
import com.huami.wallet.ui.utils.WalletUI;
import com.huami.watch.companion.sync.ble.SyncNfcTradeHelper;
import com.huami.watch.hmwatchmanager.R;
import com.huami.xiaopeng.repo.repo.XiaopengCardRepo;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.adapter.FemaleAppNoticeHelperAdapter;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bodyfat.manager.WeightGoalPersistent;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMPeytoSettings;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCTradeInfo;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechEvent;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportKind;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.DeviceGpsHelper;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceFreeTask;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.device.agps.HMAgpsUpgradeManager;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.event.EventWHTypeChanged;
import com.xiaomi.hm.health.device.event.HMDeviceAlarmEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceRealtimeStepEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSpeechEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.headset.MozartSchedule;
import com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.device.model.WeatherSettingClient;
import com.xiaomi.hm.health.device.service.HMCoreService;
import com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager;
import com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode;
import com.xiaomi.hm.health.device.service.residentnoti.notify.ResidentNotify;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.setting.appsort.utils.AppSortUtilKt;
import com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle;
import com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl;
import com.xiaomi.hm.health.device.settings.todo.TodoManager;
import com.xiaomi.hm.health.device.sport.DeviceSportManager;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.eventbus.EventAppInBackground;
import com.xiaomi.hm.health.jscompanion.CompanionHelper;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.locweather.LocWeatherKeeper;
import com.xiaomi.hm.health.locweather.WeatherTimer;
import com.xiaomi.hm.health.locweather.event.WeatherUpdateEvent;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import com.xiaomi.hm.health.manager.HMKeepAliveAnalyticsManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.nfc.KoinHelperKt;
import com.xiaomi.hm.health.notification.AppNotification;
import com.xiaomi.hm.health.receiver.HMPhoneUtil;
import com.xiaomi.hm.health.receiver.RingerModeChangedReceiver;
import com.xiaomi.hm.health.receiver.TimeChangedReceiver;
import com.xiaomi.hm.health.receiver.TimeUnitHelper;
import com.xiaomi.hm.health.sky.SkyServiceKt;
import com.xiaomi.hm.health.speech.utils.HMDispatchHandler;
import com.xiaomi.hm.health.traininglib.util.TrainingAlarmUtils;
import com.xiaomi.hm.health.ui.goal.GoalFunctionsKt;
import com.xiaomi.hm.health.ui.smartplay.AvoidSpiteBindingHelper;
import com.xiaomi.hm.health.ui.smartplay.NotificationHelper;
import com.xiaomi.hm.health.ui.smartplay.alarm.AlarmCompactDevice;
import com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager;
import com.xiaomi.hm.health.ui.smartplay.meidacontrol.MediaUtil;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.utils.RecordUtils;
import com.xiaomi.hm.health.utils.TelephonyUtil;
import com.xiaomi.hm.health.utils.UnitFunctionsKt;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import de.greenrobot.event.EventBus;
import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes18.dex */
public class HMCoreService extends Service {
    private static final int A = 4;
    public static final String ACTION_KEEP_ALIVE = "android.intent.action.HMCoreService.KEEP_ALIVE";
    private static final int B = 3;
    private static boolean C = false;
    public static final String EXTRA_NETWORK_ENABLE = "EXTRA_NETWORK_ENABLE";
    public static final String LOCAL_ACTION_NETWORK_CHANGED = "com.huami.watch.hmwatchmanager.networkchange";
    private static final String s = "HMCoreService";
    private static final String t = "android.intent.action.HMCoreService.SYNC_DATA";
    private static final String u = "yyyy-MM-dd HH:mm:ss";
    private static final String v = "android.net.conn.CONNECTIVITY_CHANGE";
    private static final String w = "android.media.VOLUME_CHANGED_ACTION";
    private static final int x = 255;
    private static final int y = 300000;
    private static final int z = 4;
    private DeviceLifeCycle o;
    private Context a = null;
    private HashMap<HMDeviceType, d> b = new HashMap<>();
    private BleServiceWrapper c = new BleServiceWrapper();
    private f d = new f();
    private BroadcastReceiver e = new RingerModeChangedReceiver();
    private TimeChangedReceiver f = new TimeChangedReceiver();
    public Lazy<BusCardRepo> g = KoinJavaComponent.inject(BusCardRepo.class);
    public Lazy<AccessDoorDataSource> h = KoinJavaComponent.inject(AccessDoorDataSource.class);
    public Lazy<NfcNotificationApi> i = KoinJavaComponent.inject(NfcNotificationApi.class);
    public Lazy<XiaopengCardRepo> j = KoinJavaComponent.inject(XiaopengCardRepo.class);
    public Lazy<JacCardRepo> k = KoinJavaComponent.inject(JacCardRepo.class);
    private final Lazy<DeviceManagerApi> l = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceTimeStoreApi> m = KoinJavaComponent.inject(DeviceTimeStoreApi.class);
    private FemaleAppNoticeHelperAdapter n = new FemaleAppNoticeHelperAdapter();
    private final e p = new e();
    private FetchRemoteScheduleUseCase q = null;
    private boolean r = false;

    public class a extends HMCallback<HMTarget> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(HMTarget target) {
            if (target == null) {
                return;
            }
            Long stepTarget = target.getStepTarget();
            int goalStepsCount = HMPersonInfo.getInstance().getMiliConfig().getGoalStepsCount();
            if (stepTarget != null && stepTarget.longValue() != goalStepsCount) {
                GoalFunctionsKt.postStepGoal(stepTarget.intValue());
            }
            Long calorieTarget = target.getCalorieTarget();
            if (calorieTarget != null && calorieTarget.longValue() != GoalFunctionsKt.getGoalCalorieValue()) {
                GoalFunctionsKt.postCalorieGoal(calorieTarget.intValue(), true);
            }
            Long weightTarget = target.getWeightTarget();
            Long lValueOf = Long.valueOf(UnitFunctionsKt.convertKgToBleUnit(HMPersonInfo.getInstance().getUserInfo().getTargetWeight()));
            if (weightTarget != null && !weightTarget.equals(lValueOf)) {
                new WeightGoalPersistent().saveToDbAndServer(UnitFunctionsKt.convertBleUnitToKg(weightTarget.intValue()));
            }
            Long sleepTarget = target.getSleepTarget();
            if (sleepTarget == null || sleepTarget.longValue() == GoalFunctionsKt.getGoalSleepValue()) {
                return;
            }
            GoalFunctionsKt.postSleepGoal(sleepTarget.intValue());
        }
    }

    public class b extends HMCallback<HMPeytoSettings> {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(HMPeytoSettings settings) {
            super.onData(settings);
            HMLog.i(HMCoreService.s, "HMPeytoSettings:" + settings, new Object[0]);
            if (settings != null) {
                HMDeviceUtils.writePeytoAlarmSettingToPersonInfo(settings.getAlarmSwitches());
            }
        }
    }

    public class c extends HMCallback<ArrayList<HMReminderInfo>> {
        public c() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(ArrayList<HMReminderInfo> reminderInfos) {
            super.onFinish(reminderInfos);
            StringBuilder sb = new StringBuilder();
            sb.append("remindersCoreService: ");
            sb.append(reminderInfos != null ? Arrays.toString(reminderInfos.toArray()) : "null");
            HMLog.i(HMCoreService.s, sb.toString(), new Object[0]);
            EventRemindManager.updateEventFromDevice(reminderInfos);
        }
    }

    public static class d {
        public static final int d = 4097;
        private long a = System.currentTimeMillis();
        private HMDeviceType b;
        private int c;

        public d(HMDeviceType type, int evt) {
            this.b = type;
            this.c = evt;
        }

        public HMDeviceType a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public long c() {
            return this.a;
        }
    }

    public class e extends BroadcastReceiver {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(boolean z) {
            return "notification on: " + z;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), ResidentNotificationManager.ACTION)) {
                NotificationMode highestNotifyMode = ResidentNotificationManager.getHighestNotifyMode();
                final boolean zIsNotificationOn = NotificationHelper.INSTANCE.isNotificationOn();
                HMLog.info(HMCoreService.s, new Function0() { // from class: com.xiaomi.hm.health.device.service.g
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMCoreService.e.b(zIsNotificationOn);
                    }
                });
                if (highestNotifyMode == null || !zIsNotificationOn) {
                    HMCoreService.this.A0();
                } else {
                    HMCoreService.this.y0(highestNotifyMode);
                }
            }
        }
    }

    public class f extends BroadcastReceiver {
        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e(boolean z) {
            return "network enable: " + z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void f(String[] strArr) throws Exception {
            HMDeviceWebAPI.uploadFailedDeviceInfo(strArr);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void g(Void r0) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void h(Throwable th) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            HMKeepAliveAnalyticsManager.recordPerDay();
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                FindPhoneWrapper.INSTANCE.stopFindPhone(HMCoreService.this.a, false);
                return;
            }
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                boolean zIsInMainland = HMLoginManager.isInMainland();
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (intExtra == 10) {
                    Analytics.recordEvent(new CountEventBuilder(StatEvent.APP_BT_STATE_CHANGED).setValue("2").setIdentified(zIsInMainland).setAnonymous(!zIsInMainland));
                    return;
                } else {
                    if (intExtra != 12) {
                        return;
                    }
                    Analytics.recordEvent(new CountEventBuilder(StatEvent.APP_BT_STATE_CHANGED).setValue("3").setIdentified(zIsInMainland).setAnonymous(!zIsInMainland));
                    return;
                }
            }
            if (TextUtils.equals(action, "android.net.conn.CONNECTIVITY_CHANGE")) {
                NetUtil netUtil = NetUtil.INSTANCE;
                final boolean zIsNetworkConnect = netUtil.networkInfo().isNetworkConnect();
                if (zIsNetworkConnect != HMCoreService.this.r) {
                    HMCoreService.this.r = zIsNetworkConnect;
                    HMLog.info(HMCoreService.s, new Function0() { // from class: com.xiaomi.hm.health.device.service.i
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return HMCoreService.f.e(zIsNetworkConnect);
                        }
                    });
                    Intent intent2 = new Intent("com.huami.watch.hmwatchmanager.networkchange");
                    intent2.putExtra("EXTRA_NETWORK_ENABLE", HMCoreService.this.r);
                    LocalBroadcastManager.getInstance(context).sendBroadcast(intent2);
                }
                if (netUtil.networkInfo().isNetworkConnect()) {
                    final String[] strArrSplit = HMKeeper.getUploadDeviceIds().split(",");
                    if (TextUtils.isEmpty(strArrSplit[0])) {
                        return;
                    }
                    Observable.fromCallable(new Callable() { // from class: com.xiaomi.hm.health.device.service.h
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return HMCoreService.f.f(strArrSplit);
                        }
                    }).subscribeOn(Schedulers.io()).subscribe(new Action1() { // from class: com.xiaomi.hm.health.device.service.k
                        @Override // rx.functions.Action1
                        public final void call(Object obj) {
                            HMCoreService.f.g((Void) obj);
                        }
                    }, new Action1() { // from class: com.xiaomi.hm.health.device.service.j
                        @Override // rx.functions.Action1
                        public final void call(Object obj) {
                            HMCoreService.f.h((Throwable) obj);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        try {
            stopForeground(true);
        } catch (Exception e2) {
            HMLog.i(s, "stopForeground Exception:" + e2.getMessage(), new Object[0]);
        }
    }

    private void B0() {
        try {
            this.n.getFemaleAppNoticeHelper().unregister(this);
        } catch (Exception e2) {
            HMLog.error(s, new Function0() { // from class: bq2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMCoreService.d0(e2);
                }
            });
        }
    }

    private void C0(final List<HMNFCTradeInfo> tradeInfos) {
        Flowable.timer(2000L, TimeUnit.MILLISECONDS).doOnNext(new Consumer() { // from class: lq2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.e0(tradeInfos, (Long) obj);
            }
        }).subscribeOn(io.reactivex.schedulers.Schedulers.io()).subscribe(new Consumer() { // from class: tq2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                HMCoreService.f0((Long) obj);
            }
        }, new Consumer() { // from class: uq2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                HMCoreService.g0((Throwable) obj);
            }
        });
    }

    private static Notification D(NotificationMode mode) {
        Notification notificationCreateNotification = AppNotification.createNotification(mode.getTitle(), mode.getMsg(), R.drawable.app_icon, false, PendingIntent.getActivity(BraceletApp.getContext(), 4, mode.getIntent(), Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456));
        notificationCreateNotification.flags = 2;
        return notificationCreateNotification;
    }

    private void D0(HMDeviceConnectionEvent event) {
        HMDeviceType deviceType = event.getDeviceType();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (deviceType == hMDeviceType && event.isConnected()) {
            if (AppSortUtilKt.SUPPORT_PAI_FW_VERSION_MAP.get(this.l.getValue().getBoundDeviceSource(hMDeviceType)) != null) {
                HMAppSortDataManager.getInstance().checkGt();
            }
            HMAppSortDataManager.getInstance().checkOc();
            HMAppSortDataManager.getInstance().checkWorldClock();
            HMAppSortDataManager.getInstance().checkLN();
            HMAppSortDataManager.getInstance().checkBlanc();
        }
    }

    private RealtimeStep E() {
        return this.l.getValue().getRealtimeStep(this.l.getValue().getMajorDeviceType());
    }

    private void E0(HMDeviceConnectionEvent event) {
        boolean z2 = event.isConnected() && event.getDeviceType() == HMDeviceType.MILI && HMDeviceConfig.hasFeatureWeatherDevice();
        HMLog.i(s, "bleConditionMatch; " + z2, new Object[0]);
        if (z2) {
            Observable.timer(15L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: mq2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    HMCoreService.h0((Long) obj);
                }
            }, new Action1() { // from class: oq2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    HMCoreService.i0((Throwable) obj);
                }
            });
        }
    }

    private void F(HMBaseDevice device) {
        if (HMDeviceFeature.hasFeatureAlarmSync(device.getMDeviceSource())) {
            HMPeytoSettings peytoSettings = ((HMMiLiProDevice) device).getPeytoSettings();
            HMLog.d(s, "HMPeytoSettings:" + peytoSettings, new Object[0]);
            if (peytoSettings != null) {
                HMDeviceUtils.writePeytoSettingToPersonInfo(peytoSettings);
            }
        }
    }

    private void G(HMDeviceType deviceType) {
        d dVarRemove = this.b.remove(deviceType);
        if ((dVarRemove == null || dVarRemove.b() != 4097) && deviceType != HMDeviceType.EARBUD) {
            return;
        }
        this.l.getValue().startSyncData(deviceType);
    }

    private boolean H() {
        return NfcDeviceConfigKt.hasFeatureNfcBusDevice();
    }

    private void I() {
        if (!C) {
            ResidentNotificationManager.updateNotification(true);
        } else {
            J();
            C = false;
        }
    }

    private void J() {
        NotificationMode notificationModeUpdateNotification = ResidentNotificationManager.updateNotification(false);
        if (notificationModeUpdateNotification != null) {
            y0(notificationModeUpdateNotification);
        } else {
            y0(ResidentNotify.INSTANCE);
            A0();
        }
    }

    private boolean K(@NonNull HMBaseDevice device, int feature) {
        Feature deviceFeature;
        DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo == null || (deviceFeature = deviceInfo.getDeviceFeature()) == null) {
            return false;
        }
        return deviceFeature.hasSw(feature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(List list, Long l) throws Exception {
        if (list == null || list.size() <= 0) {
            return;
        }
        HMLog.d(s, "notifySiteInfo:" + list.toString(), new Object[0]);
        HMNFCTradeInfo hMNFCTradeInfo = (HMNFCTradeInfo) list.get(list.size() + (-1));
        if (hMNFCTradeInfo.getConsumption() <= 0 || hMNFCTradeInfo.getHci() == null || hMNFCTradeInfo.getHci().isEmpty()) {
            return;
        }
        HMLog.d(s, "notifySiteInfo:" + hMNFCTradeInfo.toString(), new Object[0]);
        this.i.getValue().notifySiteInfo(hMNFCTradeInfo.getHci(), SyncNfcTradeHelper.INSTANCE.getCityCode().getA(), hMNFCTradeInfo.getConsumption(), hMNFCTradeInfo.getBalance(), hMNFCTradeInfo.getAid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(Long l) throws Exception {
        HMLog.e(s, "notifySiteInfo成功", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(Throwable th) throws Exception {
        HMLog.e(s, String.format("notifySiteInfo发生异常：%s", th.getMessage()), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(List list) {
        if (list == null) {
            HMLog.i(s, "query alarms is null", new Object[0]);
        } else {
            AlarmClockManager.updateAlarmsFromDevice(list);
            EventBus.getDefault().post(new HMDeviceAlarmEvent(HMDeviceType.MILI));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(HealthConfig healthConfig) throws Exception {
        EventBus.getDefault().post(new EventWHTypeChanged());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void Q(HMDeviceType hMDeviceType) throws Exception {
        HMDeviceType hMDeviceType2 = HMDeviceType.MILI;
        if (hMDeviceType == hMDeviceType2) {
            FwUnZipStatusHolder.initOtaModule();
        }
        v0(hMDeviceType);
        HMDeviceType majorDeviceType = this.l.getValue().getMajorDeviceType();
        if (majorDeviceType == hMDeviceType) {
            XiaomiAssistantWarpper.postToXiaomiAssistant(this, this.l.getValue().getRealtimeStep(majorDeviceType));
        }
        KoinHelperKt.onDeviceDestroy();
        boolean zHasFeature = ConfigHelperKt.hasFeature(com.xiaomi.hm.health.device.deviceconfig.Feature.IS_VIRTUAL_DEVICE, this.l.getValue().getBoundDeviceSource(hMDeviceType));
        if (zHasFeature) {
            ResidentNotificationManager.updateNotification(true);
        }
        if (hMDeviceType == hMDeviceType2 && !zHasFeature) {
            ResidentNotificationManager.updateNotification(true);
            HMDeviceSource boundDeviceSource = this.l.getValue().getBoundDeviceSource(hMDeviceType2);
            DeviceGpsHelper.Companion.INSTANCE.clearLastLocSendToDevice();
            if (ConfigHelperKt.hasFeature(com.xiaomi.hm.health.device.deviceconfig.Feature.WEATHER_SOURCE_S, boundDeviceSource)) {
                ((IZeppOSWeatherHandler) KoinJavaComponent.get(IZeppOSWeatherHandler.class)).clearCache();
                HMDeviceFreeTask.DeviceConfig deviceConfig = HMDeviceFreeTask.getDeviceConfig();
                deviceConfig.resetLastLocationKey();
                HMDeviceFreeTask.saveDeviceConfig(deviceConfig);
                DeviceXFunctionsKt.getWeatherApi().requestLocation();
            }
            if (AppSortUtilKt.SUPPORT_PAI_FW_VERSION_MAP.get(boundDeviceSource) != null) {
                HMAppSortDataManager.getInstance().checkGt();
            }
            HMAppSortDataManager.getInstance().checkOc();
            HMAppSortDataManager.getInstance().checkWorldClock();
            HMAppSortDataManager.getInstance().checkLN();
            HMAppSortDataManager.getInstance().checkBlanc();
            if ((boundDeviceSource == HMDeviceSource.MILI_BEATS || boundDeviceSource == HMDeviceSource.MILI_BEATS_W) && !HMKeeper.isBeatsBound()) {
                HMKeeper.bindBeats();
            }
        }
        if (hMDeviceType == hMDeviceType2 || hMDeviceType == HMDeviceType.WATCH) {
            TimeUnitHelper.setWhenBand();
        }
        if (hMDeviceType2 == hMDeviceType || HMDeviceType.TREADMILL == hMDeviceType) {
            HMFwUpgradeManager.getInstance().setAllowUpgrade(false);
            HMFwOnlineUpgradeManager.getInstance().setAllowUpgrade(false);
        }
        if (hMDeviceType == HMDeviceType.WATCH) {
            DeviceGpsHelper.Companion.INSTANCE.clearLastLocSendToDevice();
        }
        if (hMDeviceType == HMDeviceType.TREADMILL) {
            this.l.getValue().onTreadmillConnected(true);
        }
        HMBaseDevice device = this.l.getValue().getDevice(hMDeviceType);
        if (device != null) {
            this.o.onDeviceBind(device);
        }
        if (!(device instanceof HMMiLiProDevice)) {
            return null;
        }
        PhoneCallReplyDelegate.init((HMMiLiProDevice) device);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(Void r3) {
        if (GlobalConfig.get().isBuildAmazfit()) {
            return;
        }
        try {
            if (NfcDeviceConfigKt.hasFeatureNfcDoorDevice()) {
                this.h.getValue().bindDeviceDeleteCard();
            }
            if (NfcDeviceConfigKt.hasFeatureXpCarDevice()) {
                this.j.getValue().getVCardInfo();
            }
            if (NfcDeviceConfigKt.hasFeatureNfc()) {
                this.k.getValue().getVCardInfo();
            }
        } catch (Exception e2) {
            HMLog.i(s, "bindDeviceDeleteCard error:" + e2.getLocalizedMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(Throwable th) {
        HMLog.error("", "", th, new Function0() { // from class: gq2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMCoreService.T();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String V() {
        return "return for HuamiOS";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String W() {
        return "notification switch is on, update notification.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X() {
        return "notification switch is off, stop foreground.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Y() {
        return "error of agps upgrade";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit Z(HMLFEvent hMLFEvent) {
        if (System.currentTimeMillis() - this.m.getValue().getBoundDeviceSyncTime(hMLFEvent.getDeviceType()).getTimeInMillis() <= 120000 || GPSDataController.getInstance().isRunning() || WalletUI.getInstance().isInWallet() || AccessDoorUI.getInstance().isInAccessDoor()) {
            return null;
        }
        this.l.getValue().startSyncData(hMLFEvent.getDeviceType());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a0(String str) {
        return "女性健康通知:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit b0(final String str) {
        HMLog.info(s, new Function0() { // from class: dq2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMCoreService.a0(str);
            }
        });
        AppNotification.showFemaleAlarmNotification(BraceletApp.getContext().getString(R.string.fh_period_notice), str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c0(Exception exc) {
        return "error:" + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d0(Exception exc) {
        return "error msg:" + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(List list, Long l) throws Exception {
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            HMNFCTradeInfo hMNFCTradeInfo = (HMNFCTradeInfo) it2.next();
            long jTimeStamp2Date = timeStamp2Date(hMNFCTradeInfo.getDate());
            arrayList.add(new NFCTransEntity("", hMNFCTradeInfo.getAid(), "", jTimeStamp2Date < 0 ? 0L : jTimeStamp2Date, hMNFCTradeInfo.getConsumption(), hMNFCTradeInfo.getType(), hMNFCTradeInfo.getClientId(), 0));
        }
        this.g.getValue().upLoadNfcTradeInfo(BusCardExtensions.fromAid(((HMNFCTradeInfo) list.get(0)).getAid().toUpperCase(Locale.getDefault())).getAppCode(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f0(Long l) throws Exception {
        HMLog.e(s, "上传交易事件成功", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g0(Throwable th) throws Exception {
        HMLog.e(s, String.format("上传交易事件发生异常：%s", th.getMessage()), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h0(Long l) {
        DeviceXFunctionsKt.getWeatherApi().requestLocationLimited();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i0(Throwable th) {
    }

    public static boolean isKeepAlive() {
        return ResidentNotificationManager.updateNotification(false) != null;
    }

    public static boolean isUseClassicWatch() {
        return GlobalConfig.get().isBuildMidong() && HMDeviceConfig.hasBoundClassicWatch();
    }

    @SuppressLint({"CheckResult"})
    private void j0(final List<HMNFCTradeInfo> tradeInfos) {
        Flowable.timer(100L, TimeUnit.MILLISECONDS).doOnNext(new Consumer() { // from class: qq2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.L(tradeInfos, (Long) obj);
            }
        }).subscribeOn(io.reactivex.schedulers.Schedulers.io()).subscribe(new Consumer() { // from class: sq2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                HMCoreService.M((Long) obj);
            }
        }, new Consumer() { // from class: vq2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                HMCoreService.N((Throwable) obj);
            }
        });
    }

    private void k0(HMLFEvent event) {
        HMBaseDevice device = this.l.getValue().getDevice(event.getDeviceType());
        if (device != null && device.isConnected() && (device instanceof HMMiLiProDevice)) {
            new AlarmCompactDevice((HMMiLiProDevice) device).queryAlarmAsync(new IAlarmCallback() { // from class: aq2
                @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback
                public final void onResult(Object obj) {
                    HMCoreService.O((List) obj);
                }
            });
        }
    }

    private void l0(final HMDeviceType type) {
        Observable.fromCallable(new Callable() { // from class: wq2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.Q(type);
            }
        }).subscribeOn(AndroidSchedulers.mainThread()).observeOn(Schedulers.io()).doOnNext(new Action1() { // from class: kq2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.R((Void) obj);
            }
        }).subscribe(new Action1() { // from class: pq2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMCoreService.S((Void) obj);
            }
        }, new Action1() { // from class: nq2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMCoreService.U((Throwable) obj);
            }
        });
    }

    private void m0(HMDeviceType type) {
        ResidentNotificationManager.updateNotification(true);
    }

    private void n0(HMLFEvent event) {
        try {
            byte[] extra = event.getExtra();
            if (extra != null && extra.length == 1) {
                AvoidSpiteBindingHelper.INSTANCE.recordSpiteBind(extra[0]);
            }
        } catch (Exception e2) {
            HMLog.i(s, "ILLEGAL_BIND: " + e2.getMessage(), new Object[0]);
        }
    }

    private void o0(HMLFEvent event) {
        byte[] extra = event.getExtra();
        if (extra == null || extra.length != 4) {
            return;
        }
        int i = ((extra[3] & 255) << 24) | (extra[0] & 255) | ((extra[1] & 255) << 8) | ((extra[2] & 255) << 16);
        HMLog.d(s, "deleteId:" + i, new Object[0]);
        if (LinkageNotificationCenter.supportLinkageNotification()) {
            LinkageNotificationCenter.deleteAlertOnPhone(i);
        }
    }

    private void p0() {
        ((HMMiLiProDevice) this.l.getValue().getDevice(HMDeviceType.MILI)).getTargets(new a());
    }

    private void q0(HMLFEvent event) {
        try {
            byte[] extra = event.getExtra();
            if (extra != null && extra.length == 1) {
                if (extra[0] == 1) {
                    RecordUtils.getInstance(getApplicationContext()).enableAudioData(true);
                } else if (extra[0] == 0) {
                    RecordUtils.getInstance(getApplicationContext()).enableAudioData(false);
                }
            }
        } catch (Exception unused) {
        }
    }

    private void r0(HMLFEvent event) {
        HMBaseDevice device = this.l.getValue().getDevice(event.getDeviceType());
        if (device != null && device.isConnected() && (device instanceof HMMiLiProDevice)) {
            ((HMMiLiProDevice) device).getReminders(new c());
        }
    }

    private void s0() {
        HMBaseDevice device = this.l.getValue().getDevice(HMDeviceType.MILI);
        if (device != null && device.isConnected() && (device instanceof HMMiLiProDevice)) {
            ((HMMiLiProDevice) device).getPeytoSettings(new b());
        }
    }

    public static boolean shouldUpdateWeatherSetting(WeatherSetting weatherSetting, CityInfo cityInfo) {
        return (TextUtils.equals(weatherSetting.getLocationKey(), cityInfo.getLocationKey()) ^ true) || (TextUtils.equals(weatherSetting.getCity(), cityInfo.getName()) ^ true) || (TextUtils.equals(weatherSetting.getAffiliation(), cityInfo.getAffiliation()) ^ true);
    }

    public static void startKeepLiveService(Context context) {
        try {
            if (context == null) {
                HMLog.i(s, "startKeepLiveService application context is null!!!", new Object[0]);
                return;
            }
            Intent intent = new Intent(context, (Class<?>) HMCoreService.class);
            if (Build.VERSION.SDK_INT < 26 || !isKeepAlive()) {
                context.startService(intent);
                return;
            }
            C = true;
            intent.setAction(ACTION_KEEP_ALIVE);
            context.startForegroundService(intent);
        } catch (Exception e2) {
            HMLog.i(s, "start service exception:" + e2.getMessage(), new Object[0]);
        }
    }

    private void t0(HMLFEvent event) {
        byte[] extra = event.getExtra();
        if (extra == null || extra.length < 1) {
            return;
        }
        if ((extra[0] & 255) == 0) {
            if (extra.length == 1) {
                DeviceSportManager.get().init(this, event.getDeviceType());
            } else if (extra.length == 3) {
                DeviceSportManager.get().init(this, event.getDeviceType(), new SportConfig(SportKind.from(extra[2]), 1, (extra[1] & 255) == 1));
            }
        }
    }

    public static long timeStamp2Date(String timeString) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(timeString);
            Objects.requireNonNull(date);
            return date.getTime();
        } catch (ParseException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    private void u0(final HMLFEvent event) {
        TimeChangedReceiver.setDeviceDateTime(event.getDeviceType(), Calendar.getInstance());
        WakeUpSyncDataInterceptor.INSTANCE.runWithSyncStrategy(new Function0() { // from class: xq2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.Z(event);
            }
        });
    }

    private void v0(HMDeviceType type) {
        HMDeviceSource boundDeviceSource = this.l.getValue().getBoundDeviceSource(type);
        HMBaseDevice device = this.l.getValue().getDevice(type);
        if (device == null || device.getDeviceInfo() == null) {
            return;
        }
        HMDevicePropertyCache.getInstance().putFeature(device.getDeviceInfo().getDeviceFeature(), boundDeviceSource);
    }

    private void w0() {
        try {
            this.n.getFemaleAppNoticeHelper().register(getApplicationContext(), new Function1() { // from class: jq2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HMCoreService.b0((String) obj);
                }
            });
        } catch (Exception e2) {
            HMLog.error(s, new Function0() { // from class: cq2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMCoreService.c0(e2);
                }
            });
        }
    }

    private Boolean x0() {
        return ((IsMainProcess) PrivacyProvider.get("非主进程启动服务时直接停止，因 Application#onCreate 中初始化没有进行，之后所有操作都有崩溃风险", IsMainProcess.class)).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(NotificationMode mode) {
        try {
            startForeground(4, D(mode));
        } catch (Exception e2) {
            HMLog.i(s, "startForeground Exception:" + e2.getMessage(), new Object[0]);
        }
    }

    private boolean z0(HMDeviceType type) {
        if (type == HMDeviceType.VDevice || !this.l.getValue().hasBound(type)) {
            HMLog.i(s, "return as no bound device:" + type, new Object[0]);
            return false;
        }
        if (System.currentTimeMillis() - this.m.getValue().getBoundDeviceSyncTime(type).getTimeInMillis() < 300000) {
            HMLog.i(s, "return as time interval less than 300 seconds", new Object[0]);
            return false;
        }
        HMBaseDevice device = this.l.getValue().getDevice(type);
        if (device == null || !device.isConnected()) {
            this.b.put(type, new d(type, 4097));
            HMLog.i(s, "device is disconnected now,trigger when connected", new Object[0]);
            return false;
        }
        HMLog.i(s, "start sync data in service", new Object[0]);
        this.l.getValue().startSyncData(type);
        return true;
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(fd, writer, args);
        HMLog.d(s, "dump", new Object[0]);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        HMLog.d(s, "onBind", new Object[0]);
        return this.c;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        HMLog.d(s, "onConfigurationChanged", new Object[0]);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (x0().booleanValue()) {
            HMLog.i(s, "onCreate", new Object[0]);
            this.a = this;
            I();
            EventBus.getDefault().registerSticky(this);
            if (!HistoryRecordManager.getInstance().isOverSea()) {
                TrainingAlarmUtils.setAlarmByCourse(getApplicationContext());
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction(w);
            registerReceiver(this.d, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(ResidentNotificationManager.ACTION);
            LocalBroadcastManager.getInstance(this).registerReceiver(this.p, intentFilter2);
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("android.media.RINGER_MODE_CHANGED");
            registerReceiver(this.e, intentFilter3);
            this.o = DeviceLifeCycleImpl.getInstance(getApplicationContext());
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction("android.intent.action.TIME_SET");
            intentFilter4.addAction("android.intent.action.DATE_CHANGED");
            intentFilter4.addAction("android.intent.action.TIMEZONE_CHANGED");
            registerReceiver(this.f, intentFilter4);
            HealthDetect.INSTANCE.observeHealthConfig(new Consumer() { // from class: rq2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    HMCoreService.P((HealthConfig) obj);
                }
            });
            this.r = NetUtil.INSTANCE.networkInfo().isNetworkConnect();
            SkyServiceKt.getSkyNotification().registerReminderReceiver(this);
            SkyServiceKt.getSkyNotification().startSleepReminderAlarm();
            w0();
            CompanionStarterKt.appletCompanionInitJsAppLogConfig(this);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        HMLog.i(s, "onDestroy", new Object[0]);
        EventBus.getDefault().unregister(this);
        A0();
        unregisterReceiver(this.d);
        unregisterReceiver(this.e);
        unregisterReceiver(this.f);
        B0();
        startKeepLiveService(getApplicationContext());
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.p);
        SkyServiceKt.getSkyNotification().unRegisterReminderReceiver(this);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void onEvent(HMDeviceConnectionEvent event) {
        HMLog.i(s, "onEvent:" + event, new Object[0]);
        HMDeviceType deviceType = event.getDeviceType();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (deviceType == hMDeviceType || deviceType == HMDeviceType.WATCH) {
            if (NotificationHelper.INSTANCE.isNotificationOn()) {
                HMLog.info(s, new Function0() { // from class: fq2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMCoreService.W();
                    }
                });
                ResidentNotificationManager.updateNotification(true);
            } else {
                HMLog.info(s, new Function0() { // from class: eq2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMCoreService.X();
                    }
                });
                A0();
                HMKeeper.setClosedNotificationState(true);
            }
        }
        if (ConfigHelperKt.hasFeature(com.xiaomi.hm.health.device.deviceconfig.Feature.IS_VIRTUAL_DEVICE, this.l.getValue().getBoundDeviceSource(deviceType))) {
            G(deviceType);
            return;
        }
        try {
            Device bindInfo = this.l.getValue().getBindInfo(deviceType);
            this.o.onDeviceStatusChange(bindInfo, event.getConnectionType());
            if (event.isConnected()) {
                G(deviceType);
                NotificationManager.getInstance().getAppsRepo().asyncAppsInfo(deviceType);
                if (deviceType == hMDeviceType || deviceType == HMDeviceType.WATCH) {
                    TimeUnitHelper.setWhenConnect();
                    DeviceGpsHelper.Companion.INSTANCE.retrySendLocToDevice(LocWeatherKeeper.getLastLocation(), (HMBaseBleDevice) this.l.getValue().getDevice());
                }
                HMBaseDevice device = this.l.getValue().getDevice(deviceType);
                if (device != 0) {
                    this.o.onBoundedDeviceConnected(device);
                    v0(deviceType);
                    DeviceGpsHelper.Companion.INSTANCE.clearLastLocSendToDevice();
                    E0(event);
                    TelephonyUtil.INSTANCE.preReadContacts(this, s);
                    if (deviceType == hMDeviceType) {
                        D0(event);
                        PhoneCallReplyDelegate.init((HMMiLiProDevice) device);
                        F(device);
                    } else if (deviceType == HMDeviceType.HEADSET) {
                        MozartSchedule.onConnected((MozartDevice) device);
                    }
                }
            } else if (event.isDisconnected()) {
                this.o.onBoundedDeviceDisconnect(bindInfo.getDevice_id());
            }
            if (deviceType == hMDeviceType || deviceType == HMDeviceType.WATCH) {
                CompanionHelper.startAppletService();
            }
        } catch (Exception e2) {
            HMLog.i(s, "HMDeviceConnectionEvent exception: " + e2.getLocalizedMessage(), new Object[0]);
        }
        this.c.onEvent(event);
    }

    public void onEventMainThread(EventAppInBackground event) {
        if (event.isInBackground) {
            return;
        }
        FindPhoneWrapper.INSTANCE.stopFindPhone(this, false);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        HMLog.i(s, "onLowMemory", new Object[0]);
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        HMLog.d(s, "onRebind", new Object[0]);
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        HMLog.d(s, "onStartCommand:" + intent, new Object[0]);
        if (!x0().booleanValue()) {
            stopSelf();
            return 2;
        }
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            ResidentNotificationManager.updateNotification(true);
            return 1;
        }
        String action = intent.getAction();
        if (t.equals(action)) {
            z0(this.l.getValue().getMajorDeviceType());
            HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
            HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
            if (hMDeviceManager.hasBound(hMDeviceType)) {
                z0(hMDeviceType);
            }
            XiaomiAssistantWarpper.postToXiaomiAssistant(this, E());
        } else if (ACTION_KEEP_ALIVE.equals(action)) {
            if (Build.VERSION.SDK_INT >= 26) {
                y0(ResidentNotify.INSTANCE);
            }
            try {
                HMAgpsUpgradeManager.checkAutoAgpsUpgrade(this, HMDeviceType.MILI);
            } catch (Exception unused) {
                HMLog.debug(new Function0() { // from class: iq2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMCoreService.Y();
                    }
                });
            }
        } else {
            ResidentNotificationManager.updateNotification(true);
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        HMLog.i(s, "onTaskRemoved:" + rootIntent, new Object[0]);
        super.onTaskRemoved(rootIntent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        HMLog.i(s, "onTrimMemory:" + level, new Object[0]);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        HMLog.d(s, "onUnbind", new Object[0]);
        return super.onUnbind(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(BroadcastReceiver receiver) {
        try {
            super.unregisterReceiver(receiver);
        } catch (Exception unused) {
        }
    }

    public void onEvent(HMDeviceRealtimeStepEvent event) {
        HMLog.i(s, "onEvent " + event.getRealtimeStep(), new Object[0]);
        HMDeviceType deviceType = event.getDeviceType();
        HMDeviceType majorDeviceType = this.l.getValue().getMajorDeviceType();
        HMLog.i(s, "eventDeviceType:" + deviceType + ",majorType:" + majorDeviceType, new Object[0]);
        if (deviceType == majorDeviceType) {
            XiaomiAssistantWarpper.postToXiaomiAssistant(this, event.getRealtimeStep());
        }
        this.c.onEvent(event);
    }

    public void onEvent(HMDeviceBatteryEvent event) {
        this.c.onEvent(event);
    }

    public void onEvent(EventAccountStatus event) {
        int status = event.getStatus();
        if (status == 1 || status == 2) {
            ResidentNotificationManager.updateNotification(true);
            XiaomiAssistantWarpper.postToXiaomiAssistant(this, new RealtimeStep(0));
            TodoManager.onUserLogin();
            if (this.q == null) {
                this.q = new FetchRemoteScheduleUseCase(getApplicationContext());
            }
            this.q.execute();
        }
    }

    public void onEvent(HMDeviceSpeechEvent event) {
        if (event != null && event.getEvent() != null) {
            HMSpeechEvent event2 = event.getEvent();
            int type = event2.getType();
            if (type == 1) {
                int ctrl = event2.getCtrl();
                if (ctrl == 1) {
                    RecordUtils.getInstance(getApplicationContext()).enableAudioData(true);
                    return;
                } else if (ctrl == 0) {
                    RecordUtils.getInstance(getApplicationContext()).enableAudioData(false);
                    return;
                } else {
                    if (ctrl == 2) {
                        RecordUtils.getInstance(getApplicationContext()).exitSpeechEngine();
                        return;
                    }
                    return;
                }
            }
            if (type == 2) {
                int id = event2.getId();
                int result = event2.getResult();
                HMDispatchHandler.getInstance().dealContent(id, result);
                HMLog.d(s, "id:" + id + ",result:" + result, new Object[0]);
                return;
            }
            return;
        }
        HMLog.i(s, "speech event is null!!!", new Object[0]);
    }

    public void onEvent(HMLFEvent event) {
        HMLog.i(s, "onEvent:" + event, new Object[0]);
        LfType lfType = event.getLfType();
        if (lfType == LfType.END_CALL) {
            HMPhoneUtil.endCall(this);
            return;
        }
        if (lfType == LfType.IGNORE_CALL) {
            HMKeeper.setDisturbShowStatusEnable(false);
            TelephonyUtil.INSTANCE.mute(true);
            return;
        }
        if (lfType == LfType.SETTINGS_CHANGED) {
            s0();
            return;
        }
        if (lfType == LfType.LONG_KEY) {
            HMLog.d(s, "LONG_KEY", new Object[0]);
            return;
        }
        if (lfType == LfType.WAKE_UP) {
            u0(event);
            return;
        }
        if (lfType == LfType.MUSIC_CONTROL) {
            MediaUtil.handleDeviceCommand(event);
            return;
        }
        if (lfType == LfType.MUTE_PHONE) {
            HMKeeper.setDisturbShowStatusEnable(false);
            TelephonyUtil.INSTANCE.mute(event.getExtra());
            return;
        }
        if (lfType == LfType.RECORD) {
            q0(event);
            return;
        }
        if (lfType == LfType.NFC_TRADE) {
            return;
        }
        if (lfType == LfType.ILLEGAL_BIND) {
            n0(event);
            return;
        }
        if (lfType == LfType.DELETE_MSG) {
            o0(event);
            return;
        }
        if (lfType == LfType.SPORT) {
            t0(event);
            return;
        }
        if (lfType == LfType.ALARM_CHANGED) {
            k0(event);
            return;
        }
        if (lfType == LfType.REMINDER_CHANGED) {
            r0(event);
            return;
        }
        if (lfType == LfType.GOAL_CHANGE) {
            p0();
            return;
        }
        if (lfType == LfType.HEART_RATE_ALL_DAY) {
            HealthUi.INSTANCE.onLfEvent(event);
            return;
        }
        if (lfType == LfType.ALL_DAY_PRESSURE_CHANGE) {
            HealthUi.INSTANCE.onLfEvent(event);
            return;
        }
        if (lfType == LfType.HEART_RATE_DETECTION_INTERVAL) {
            HealthUi.INSTANCE.onLfEvent(event);
            return;
        }
        if (lfType == LfType.ATRIAL_FIB_CHANGED) {
            HealthUi.INSTANCE.onLfEvent(event);
        } else {
            if (lfType != LfType.HEADSET_REQUEST_APP_OPERATION || GPSDataController.getInstance().getState() == 2) {
                return;
            }
            EventBus.getDefault().post(new EventRemindDistanceVoice());
        }
    }

    public void onEvent(List<HMNFCTradeInfo> tradeInfos) {
        C0(tradeInfos);
        j0(tradeInfos);
    }

    public void onEvent(HMDeviceBindEvent event) {
        HMLog.i(s, "bindEvent:" + event, new Object[0]);
        if (event.isBound()) {
            l0(event.getDeviceType());
        } else {
            m0(event.getDeviceType());
        }
        CompanionHelper.startAppletService();
    }

    public void onEvent(WeatherUpdateEvent event) {
        CityInfo cityInfo = event.weatherInfos.getCityInfo();
        if (cityInfo != null && !TextUtils.isEmpty(cityInfo.getName())) {
            WeatherSetting weatherSettingFromJsonString = WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting());
            if (!weatherSettingFromJsonString.getAutoLocate() && shouldUpdateWeatherSetting(weatherSettingFromJsonString, cityInfo)) {
                weatherSettingFromJsonString.setCity(cityInfo.getName());
                weatherSettingFromJsonString.setAffiliation(cityInfo.getAffiliation());
                weatherSettingFromJsonString.setLocationKey(cityInfo.getLocationKey());
                HMPersonInfo.getInstance().getMiliConfig().setWeatherSetting(weatherSettingFromJsonString.toJsonString());
                HMPersonInfo.getInstance().saveInfo(2);
                HMAccountWebExtAPI.updateProfile();
            }
            if (UpdateWeatherWrapper.updateWeatherToDevice(event.weatherInfos)) {
                return;
            }
            WeatherTimer.getInstance().releaseWakeLock();
            return;
        }
        WeatherTimer.getInstance().releaseWakeLock();
    }

    public void onEvent(WeatherInfos infos) {
        if (new WeatherSettingClient().supportHuamiOSWeather()) {
            HMLog.info(s, new Function0() { // from class: hq2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMCoreService.V();
                }
            });
            return;
        }
        UpdateWeatherWrapper.syncSunriseSunsetInfo2Device(infos);
        CityInfo cityInfo = infos.getCityInfo();
        if (cityInfo == null || TextUtils.isEmpty(cityInfo.getName()) || HMPersonInfo.getInstance().getUserInfo() == null) {
            return;
        }
        WeatherSetting weatherSettingFromJsonString = WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting());
        if (weatherSettingFromJsonString.getAutoLocate() && shouldUpdateWeatherSetting(weatherSettingFromJsonString, cityInfo)) {
            weatherSettingFromJsonString.setCity(cityInfo.getName());
            weatherSettingFromJsonString.setAffiliation(cityInfo.getAffiliation());
            weatherSettingFromJsonString.setLocationKey(cityInfo.getLocationKey());
            HMPersonInfo.getInstance().getMiliConfig().setWeatherSetting(weatherSettingFromJsonString.toJsonString());
            HMPersonInfo.getInstance().saveInfo(2);
        }
    }
}
