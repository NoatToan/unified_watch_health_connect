package com.xiaomi.hm.health;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.multidex.MultiDex;
import cn.com.smartdevices.bracelet.rom.AliveUtils;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.datatheorem.android.trustkit.TrustKit;
import com.huami.account.HMLoginManager;
import com.huami.account.di.LifecycleModuleKt;
import com.huami.account.event.EventAgreeUserExperience;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.AccountService;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.ad.AdModule;
import com.huami.ad.AdRequestParamsDelegate;
import com.huami.afppg_ui_base.inject.PpgUiModuleKt;
import com.huami.ai.helper.SpeechKeeper;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.delegate.AssistantToolUtilsDelegate;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.dev.Logcat;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.devicex.DeviceXBuilder;
import com.huami.discovery.bridge.BridgeCallbackBinder;
import com.huami.discovery.bridge.WebUserAgenter;
import com.huami.ecg.core.EcgCore;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import com.huami.identity.auth.alexa.AlexaAuthKeeper;
import com.huami.lib.v2.ZeppPermissionManager;
import com.huami.medal.proxy.MedalProxy;
import com.huami.medal.proxy.adapter.MedalInfoAdapter;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.Config;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.function.Function;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.utils.LocationChecker;
import com.huami.module.darkmode.AppNightModeHelper;
import com.huami.moving.ui.utils.GpsUtilDelegate;
import com.huami.network.hmnetwork.httpdns.HMHttpDnsManager;
import com.huami.network.hmnetwork.model.account.LoginData;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.passport.Configs;
import com.huami.phone_call.sms.SmsService;
import com.huami.prelaunch.PreLaunchApi;
import com.huami.privacy.PrivacyProvider;
import com.huami.privacy.plugin.IsMainProcess;
import com.huami.sleepassistant.apilib.utils.MediaFileUtils;
import com.huami.tools.crashreport.HuamiCrashReport;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.LoganTree;
import com.huami.util.HmUtilModule;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.PlayFlavor;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.delegate.CompanionToolUtilsDelegate;
import com.huami.watch.companion.device.brand.BrandNameService;
import com.huami.watch.companion.ecg.pdf.EcgReportPrint;
import com.huami.watch.companion.ecg.util.EcgMedicalUtil;
import com.huami.watch.companion.usersettings.BackupUriCompat;
import com.huami.watch.companion.util.BindBaseLogicHelper;
import com.huami.watch.companion.util.IBindBaseLogicCallback;
import com.huami.watch.companion.util.ThirdPartUtil;
import com.huami.watch.dataflow.model.health.bean.AtrialFibrillationDataItem;
import com.huami.watch.dataflow.sync.AtriDbObserver;
import com.huami.watch.dataflow.sync.DataFlowSyncModule;
import com.huami.watch.util.RxBus;
import com.huami.watch.wififtp.WifiFtpModule;
import com.jakewharton.threetenabp.AndroidThreeTen;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreater;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreater;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.twitter.sdk.android.core.Twitter;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.apprate.AppRateButtonListener;
import com.xiaomi.hm.health.apprate.AppRateManager;
import com.xiaomi.hm.health.atrialfibrillation.AfUiConfigImpl;
import com.xiaomi.hm.health.atrialfibrillation.TransAtrialDataUtilKt;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.GlobalKeeper;
import com.xiaomi.hm.health.baseutil.GlobalUtil;
import com.xiaomi.hm.health.baseutil.MD5Util;
import com.xiaomi.hm.health.bodyfat.delegate.ScaleToolUtilsDelegate;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.HMBleModule;
import com.xiaomi.hm.health.bt.ISBEListener;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.proxy.BTNameCallback;
import com.xiaomi.hm.health.common.ProcessLifecycleObserver;
import com.xiaomi.hm.health.companion.CompanionCloudConfigCallback;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.HMDatabaseHelper;
import com.xiaomi.hm.health.databases.HMLocalPropertyUtil;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.WalletDataUtil;
import com.xiaomi.hm.health.device.DeviceFeatureImpl;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.amazfit_watch.HMWatchLogic;
import com.xiaomi.hm.health.device.assistant.BleAssistantModule;
import com.xiaomi.hm.health.device.brand.BrandNameServiceFactory;
import com.xiaomi.hm.health.device.callback.gps.filter.GpsFilterConfig;
import com.xiaomi.hm.health.device.classic_scan.ClassicScanCenter;
import com.xiaomi.hm.health.device.classic_scan.TreadmillClassicScanCenter;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.ecg.EcgInitDevices;
import com.xiaomi.hm.health.device.ecg.EcgInitSettings;
import com.xiaomi.hm.health.device.ecg.EcgMedicalServiceImpl;
import com.xiaomi.hm.health.device.esim.ESimInit;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.headset.MozartDeviceStateService;
import com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory;
import com.xiaomi.hm.health.device.health.init.AppResImpl;
import com.xiaomi.hm.health.device.health.init.DeviceAppApiImpl;
import com.xiaomi.hm.health.device.model.WeatherSettingClient;
import com.xiaomi.hm.health.device.prelaunch.PreLaunchImpl;
import com.xiaomi.hm.health.device.service.HMCoreService;
import com.xiaomi.hm.health.device.setting.OpenPageImpl;
import com.xiaomi.hm.health.device.setting.life.feature.OpenAppPageSubscriber;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.devicex.DeviceXConfig;
import com.xiaomi.hm.health.di.koin.KoinLifecycleManager;
import com.xiaomi.hm.health.discovery.WebActivityUtil;
import com.xiaomi.hm.health.discovery.jsbridge.function.JsBridgeApiImpl;
import com.xiaomi.hm.health.discovery.reactimpl.AppNativeImpl;
import com.xiaomi.hm.health.ednetwork.EdWhitePath;
import com.xiaomi.hm.health.fragment.BloodPressurePersonInfoFragment;
import com.xiaomi.hm.health.heartrate.HeartRateCenter;
import com.xiaomi.hm.health.homepage.status.card.ContentObserverToListener;
import com.xiaomi.hm.health.homepage.status.card.EventBusToListener;
import com.xiaomi.hm.health.httpkit.HttpKitHelper;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.locweather.ConfigurationHolder;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.manager.HMKeepAliveAnalyticsManager;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.modules.DataFlowSyncBleModule;
import com.xiaomi.hm.health.modules.WifiFtpBleModule;
import com.xiaomi.hm.health.navigation.delegate.AssistantModuleToolUtils;
import com.xiaomi.hm.health.navigation.delegate.ScaleModuleToolUtils;
import com.xiaomi.hm.health.navigation.delegate.WearCompanionModuleToolUtils;
import com.xiaomi.hm.health.nfc.KoinHelperKt;
import com.xiaomi.hm.health.nfc.door.DoorApiRepo;
import com.xiaomi.hm.health.notification.AppNotification;
import com.xiaomi.hm.health.play.card.EventBusListener;
import com.xiaomi.hm.health.remote.ActivityThreadHooker;
import com.xiaomi.hm.health.share.ShareKitManager;
import com.xiaomi.hm.health.sleep.eventbus.SleepEventBusToListener;
import com.xiaomi.hm.health.speech.utils.SpeechEventBusRegister;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Logger;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.TrainingLib;
import com.xiaomi.hm.health.traininglib.delegate.TrainingDelegate;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import com.xiaomi.hm.health.ui.smartplay.MyNotificationModule;
import com.xiaomi.hm.health.ui.smartplay.lab.LabInit;
import com.xiaomi.hm.health.utils.ApmHelper;
import com.xiaomi.hm.health.utils.AudioUtils;
import com.xiaomi.hm.health.utils.BTConnectionAnalyticStatusHelper;
import com.xiaomi.hm.health.utils.BleLogUploadHelper;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import com.xiaomi.hm.health.utils.EcgAnalyticsKt;
import com.xiaomi.hm.health.utils.ProductionUtil;
import com.xiaomi.hm.health.utils.ShareCommonConfig;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.utils.WatermarkLib;
import com.xiaomi.hm.health.watchfacestore.WFDeviceConnManager;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import com.xiaomi.hm.health.webapi.HMWebInit;
import com.xiaomi.hm.health.webapi.PassportApiInit;
import com.xiaomi.hm.health.webapi.ServerFaultHelper;
import com.xiaomi.hm.health.weight.BodyFatInit;
import de.greenrobot.event.EventBus;
import defpackage.r50;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;
import rx.functions.Action1;
import rx.plugins.RxJavaErrorHandler;
import timber.log.Timber;

/* JADX INFO: loaded from: classes19.dex */
public class BraceletApp extends CompanionApplication {
    private static Context A = null;
    private static final int B = 1200000;
    private static final String z = "BraceletApp";

    public class a implements BTNameCallback {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.proxy.BTNameCallback
        @NotNull
        public HashMap<String, HMDeviceSource> getAmazfitNames() {
            HashMap<String, HMDeviceSource> map = new HashMap<>();
            Iterator<String> it2 = ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_AMAZFIT).getBtNames().iterator();
            while (it2.hasNext()) {
                map.put(it2.next(), HMDeviceSource.MILI_AMAZFIT);
            }
            return map;
        }

        @Override // com.xiaomi.hm.health.bt.proxy.BTNameCallback
        @NotNull
        public HashMap<String, HMDeviceSource> getBMNames() {
            HashMap<String, HMDeviceSource> map = new HashMap<>();
            Iterator<String> it2 = ConfigHelperKt.getDeviceConfig(HMDeviceSource.OTHER_BM).getBtNames().iterator();
            while (it2.hasNext()) {
                map.put(it2.next(), HMDeviceSource.OTHER_BM);
            }
            return map;
        }

        @Override // com.xiaomi.hm.health.bt.proxy.BTNameCallback
        @NotNull
        public HashMap<String, HMDeviceSource> getEarbudNames() {
            HashMap<String, HMDeviceSource> map = new HashMap<>();
            Iterator<String> it2 = ConfigHelperKt.getDeviceConfig(HMDeviceSource.EARBUD_CHOPIN).getBtNames().iterator();
            while (it2.hasNext()) {
                map.put(it2.next(), HMDeviceSource.EARBUD_CHOPIN);
            }
            return map;
        }

        @Override // com.xiaomi.hm.health.bt.proxy.BTNameCallback
        @NotNull
        public HashMap<String, HMDeviceSource> getMiliNames() {
            HMDeviceSource[] hMDeviceSourceArr = {HMDeviceSource.MILI, HMDeviceSource.MILI_1A, HMDeviceSource.MILI_1S};
            HashMap<String, HMDeviceSource> map = new HashMap<>();
            for (int i = 0; i < 3; i++) {
                HMDeviceSource hMDeviceSource = hMDeviceSourceArr[i];
                Iterator<String> it2 = ConfigHelperKt.getDeviceConfig(hMDeviceSource).getBtNames().iterator();
                while (it2.hasNext()) {
                    map.put(it2.next(), hMDeviceSource);
                }
            }
            return map;
        }

        @Override // com.xiaomi.hm.health.bt.proxy.BTNameCallback
        @NotNull
        public HashMap<String, HMDeviceSource> getMiliProNames() {
            HashMap<String, HMDeviceSource> map = new HashMap<>();
            for (HMDeviceSource hMDeviceSource : ConfigHelperKt.getRepresentSources()) {
                Iterator<String> it2 = ConfigHelperKt.getDeviceConfig(hMDeviceSource).getBtNames().iterator();
                while (it2.hasNext()) {
                    map.put(it2.next(), hMDeviceSource);
                }
            }
            return map;
        }

        @Override // com.xiaomi.hm.health.bt.proxy.BTNameCallback
        @NotNull
        public ArrayList<String> getNormandyNames() {
            return ConfigHelperKt.getDeviceConfig(HMDeviceSource.SHOES_MARS).getBtNames();
        }

        @Override // com.xiaomi.hm.health.bt.proxy.BTNameCallback
        @NotNull
        public HashMap<String, HMDeviceSource> getSmartWatchNames() {
            HashMap<String, HMDeviceSource> map = new HashMap<>();
            Iterator<String> it2 = ConfigHelperKt.getDeviceConfig(HMDeviceSource.SMART_WATCH_EVEREST_2).getBtNames().iterator();
            while (it2.hasNext()) {
                map.put(it2.next(), HMDeviceSource.SMART_WATCH_EVEREST_2);
            }
            return map;
        }
    }

    public class b extends RxJavaErrorHandler {
        public b() {
        }

        @Override // rx.plugins.RxJavaErrorHandler
        public void handleError(Throwable e) {
            super.handleError(e);
        }
    }

    public class c implements AdRequestParamsDelegate {
        public c() {
        }

        @Override // com.huami.ad.AdRequestParamsDelegate
        public String addressCode() {
            return LocWeatherManager.getInstance().getLocationAddressCode();
        }

        @Override // com.huami.ad.AdRequestParamsDelegate
        public String userCountryCode() {
            return SelectAreaHelper.getArea().getValue();
        }

        @Override // com.huami.ad.AdRequestParamsDelegate
        public String userRegionCode() {
            return HMLoginManager.getRegion();
        }
    }

    public class d implements IBindBaseLogicCallback {
        public d() {
        }

        @Override // com.huami.watch.companion.util.IBindBaseLogicCallback
        public HashMap<String, HMDeviceType> getBoundDevices(@NotNull HMDeviceType deviceType) {
            return HMDeviceManager.getInstance().getBoundDevices(deviceType);
        }

        @Override // com.huami.watch.companion.util.IBindBaseLogicCallback
        @NotNull
        public String getOfficialName(@Nullable HMDeviceSource source) {
            return HMDeviceUtils.getDeviceDescription(source);
        }

        @Override // com.huami.watch.companion.util.IBindBaseLogicCallback
        public boolean isWatch(@Nullable HMDeviceSource deviceSource) {
            return HMDeviceConfig.isWatch(deviceSource);
        }
    }

    public class e implements MedalInfoAdapter {
        public e() {
        }

        @Override // com.huami.medal.proxy.adapter.MedalInfoAdapter
        public String getUserId() {
            return String.valueOf(HMLoginManager.getValidUid());
        }

        @Override // com.huami.medal.proxy.adapter.MedalInfoAdapter
        public String getWebApiHost() {
            return HMServerDef.getHost();
        }
    }

    public class f implements DeviceCenter.IDeviceManagerListener {
        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c() {
            return "onDeInit";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d() {
            return "onInit";
        }

        @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IDeviceManagerListener
        public void onDeInit() {
            HMLog.info(BraceletApp.z, new Function0() { // from class: com.xiaomi.hm.health.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BraceletApp.f.c();
                }
            });
        }

        @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IDeviceManagerListener
        public void onInit() {
            HMLog.info(BraceletApp.z, new Function0() { // from class: com.xiaomi.hm.health.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BraceletApp.f.d();
                }
            });
        }
    }

    public class g extends Timber.Tree {
        public g() {
        }

        @Override // timber.log.Timber.Tree
        public void log(int priority, @androidx.annotation.Nullable String tag, @NotNull String message, @androidx.annotation.Nullable Throwable t) {
            HMLog.log("NFC-" + tag, priority, t, message, new Object[0]);
        }
    }

    static {
        SmartRefreshLayout.setDefaultRefreshHeaderCreater(new DefaultRefreshHeaderCreater() { // from class: x60
            @Override // com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreater
            public final RefreshHeader createRefreshHeader(Context context, RefreshLayout refreshLayout) {
                return BraceletApp.Y1(context, refreshLayout);
            }
        });
        SmartRefreshLayout.setDefaultRefreshFooterCreater(new DefaultRefreshFooterCreater() { // from class: w60
            @Override // com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreater
            public final RefreshFooter createRefreshFooter(Context context, RefreshLayout refreshLayout) {
                return BraceletApp.Z1(context, refreshLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A1() {
        return "last commit        : 37de3761d7";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B1() {
        return "version name       : 6.10.1-play";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C1() {
        return "version code       : 100770";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D1() {
        return "access version     : 2.7.5";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E1() {
        return "bus version        : 3.4.6";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String F1() {
        return "target sdk version : " + getApplicationInfo().targetSdkVersion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G1() {
        return "==============================";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H1(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I1(Context context, DialogInterface dialogInterface, int i) {
        try {
            context.startActivity(LocationChecker.getGPSIntent());
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AlertDialogFragment J1(final Context context) {
        return new AlertDialogFragment.Builder(context).setCancelable(false).setMessage(getString(com.huami.watch.hmwatchmanager.R.string.running_no_gps, new Object[]{"Zepp"})).setNegativeButton(getString(com.huami.watch.hmwatchmanager.R.string.cancel), new DialogInterface.OnClickListener() { // from class: i50
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BraceletApp.H1(dialogInterface, i);
            }
        }).setPositiveButton(getString(com.huami.watch.hmwatchmanager.R.string.open), new DialogInterface.OnClickListener() { // from class: x40
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BraceletApp.I1(context, dialogInterface, i);
            }
        }).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K1() {
        return "initService";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L1(Exception exc) {
        return "initService exception:" + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean M1() {
        return !GPSDataController.getInstance().isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N1(Throwable th) throws Exception {
        HMLog.warn(z, th, new Function0() { // from class: k60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.T1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O1(AtrialFibrillationDataItem atrialFibrillationDataItem) throws Exception {
        com.xiaomi.hm.health.databases.model.AtrialFibrillationDataItem atrialFibrillationDataItem2 = new com.xiaomi.hm.health.databases.model.AtrialFibrillationDataItem();
        atrialFibrillationDataItem2.setTimestamp(Long.valueOf(atrialFibrillationDataItem.timestamp));
        atrialFibrillationDataItem2.setActive(Integer.valueOf(atrialFibrillationDataItem.active));
        atrialFibrillationDataItem2.setSync(1);
        atrialFibrillationDataItem2.setEventType(atrialFibrillationDataItem.eventType);
        atrialFibrillationDataItem2.setUserId(HMPersonInfo.getInstance().getUserInfo().getUserid());
        TransAtrialDataUtilKt.saveWatchAtrial(atrialFibrillationDataItem2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String P1() {
        return "onCreate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q1(Throwable th) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String R1() {
        return "security patch:" + Build.VERSION.SECURITY_PATCH;
    }

    private void S0() {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences("google_bug_154855417", 0);
            if (sharedPreferences.contains("fixed")) {
                return;
            }
            File file = new File(getFilesDir(), "ZoomTables.data");
            File file2 = new File(getFilesDir(), "SavedClientParameters.data.cs");
            File file3 = new File(getFilesDir(), "DATA_ServerControlledParametersManager.data." + getBaseContext().getPackageName());
            File file4 = new File(getFilesDir(), "DATA_ServerControlledParametersManager.data.v1." + getBaseContext().getPackageName());
            file.delete();
            file2.delete();
            file3.delete();
            file4.delete();
            sharedPreferences.edit().putBoolean("fixed", true).apply();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S1() {
        startActivity(new Intent(this, (Class<?>) FeedbackActivity.class).addFlags(268435456));
    }

    private void T0() {
        String metaDataChannel = Analytics.readMetaDataChannel(this);
        Analytics.init(new Config.Builder(this).setChannel(metaDataChannel).setDebug(GlobalConfig.get().isBuildInner()).setHmStatAnonymousTrackerUploadHostMapper(new Function() { // from class: p60
            @Override // com.huami.mifit.analytics.function.Function
            public final Object apply(Object obj) {
                return HMHttpDnsManager.getHttpDnsUrlBySrc((String) obj);
            }
        }).setHmStatIdentifiedTrackerUploadHostMapper(new Function() { // from class: p60
            @Override // com.huami.mifit.analytics.function.Function
            public final Object apply(Object obj) {
                return HMHttpDnsManager.getHttpDnsUrlBySrc((String) obj);
            }
        }).setHmStatRealTimeTrackUploadHostMapper(new Function() { // from class: p60
            @Override // com.huami.mifit.analytics.function.Function
            public final Object apply(Object obj) {
                return HMHttpDnsManager.getHttpDnsUrlBySrc((String) obj);
            }
        }).setHuamiAnonymousAppIdForStaging("2B7459B9B7603C138849E0B9").setHuamiAnonymousAppIdForProduction("39372B947945988B2F751F1C").setHuamiIdentifiedAppIdForStaging("015B579EFEF14C0AE7DE9CA4").setHuamiIdentifiedAppIdForProduction("1FACCDD018CAB6B5673203F7").setHuamiRealTimeAppIdForStaging("8a2786f5d6fd921fa16a007419f880d7").setHuamiRealTimeAppIdForProduction("8a2786f5d6fd921fa16a007419f880d7").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T1() {
        return "";
    }

    private static void U0() {
        PpgUiModuleKt.initConfig(new AfUiConfigImpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String U1(EventAgreeUserExperience eventAgreeUserExperience, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(eventAgreeUserExperience.agree ? "同意了" : "拒绝了");
        sb.append("“用户体验改善计划”, 用户");
        sb.append(z2 ? "已登录" : "未登录");
        return sb.toString();
    }

    private void V0() {
        BindBaseLogicHelper.setBindBaseLogicProxy(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String V1() {
        return "华米统计匿名id: " + Analytics.getHmStatAnonymousId(A);
    }

    private void W0() {
        HMBleConfig.SUPPORT_RE_CONNECT_WITH_SCAN = true;
        HMBleConfig.SUPPORT_SAVE_DEVICE_INFO_READ = false;
        ClassicScanCenter.init(this);
        TreadmillClassicScanCenter.init(this);
        HMBleModule.init(this, HMConfig.Log.isLogTerminal(), FileUtils.getLogRootDir(this), new a());
        HMBleModule.setServerSign(true);
        HMBleModule.setSBEListener(new ISBEListener() { // from class: y40
            @Override // com.xiaomi.hm.health.bt.ISBEListener
            public final void onException(int i) {
                BraceletApp.j1(i);
            }
        });
        HMBleModule.setAppId((byte) 0);
        MozartDeviceStateService.init(this);
        SmsService.init(this);
        BleLogUploadHelper.addToFeedback();
        HMBleModule.setDeviceFeature(new DeviceFeatureImpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W1() {
        RunningManager.areaUpdate();
        ShareKitManager.setShareChannel();
    }

    private void X0() {
        EdWhitePath.addWhitePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X1(Exception exc) {
        return "startAlarm: " + exc;
    }

    private void Y0() {
        X0();
        HMWebInit.initHttp();
        HttpKitHelper.initHttp();
        PassportApiInit.init(this);
        ServerFaultHelper.init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RefreshHeader Y1(Context context, RefreshLayout refreshLayout) {
        ClassicsHeader.REFRESH_HEADER_PULLDOWN = context.getString(com.huami.watch.hmwatchmanager.R.string.label_pull_to_refresh);
        ClassicsHeader.REFRESH_HEADER_REFRESHING = context.getString(com.huami.watch.hmwatchmanager.R.string.label_refreshing);
        ClassicsHeader.REFRESH_HEADER_LOADING = context.getString(com.huami.watch.hmwatchmanager.R.string.label_refresh_success);
        ClassicsHeader.REFRESH_HEADER_RELEASE = context.getString(com.huami.watch.hmwatchmanager.R.string.label_release_to_refresh);
        ClassicsHeader.REFRESH_HEADER_FINISH = context.getString(com.huami.watch.hmwatchmanager.R.string.label_refresh_success);
        ClassicsHeader.REFRESH_HEADER_FAILED = context.getString(com.huami.watch.hmwatchmanager.R.string.label_refresh_fail);
        Drawable drawable = ContextCompat.getDrawable(context, com.huami.watch.hmwatchmanager.R.drawable.arrow_refresh);
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(context, com.huami.watch.hmwatchmanager.R.color.s2));
        }
        return new ClassicsHeader(context).setSpinnerStyle(SpinnerStyle.Translate).setEnableLastTime(false).setArrowDrawable(drawable).setPrimaryColorId(com.huami.watch.hmwatchmanager.R.color.s4).setAccentColorId(com.huami.watch.hmwatchmanager.R.color.s2);
    }

    private void Z0() {
        Logcat.setup();
        Logcat.plant(new g());
        if (HMConfig.Log.isLogFile()) {
            HMLog.plant(new LoganTree(HMConfig.Log.isLogData() ? 3 : 4, getFilesDir().getAbsolutePath(), FileUtils.getLogRootDir(this), "sCVR2miVJwi9QPdD".getBytes(), "pSWPKvl2ND74ZwJI".getBytes(), 30L));
        }
        Loggers.setLogger(new Logger() { // from class: c50
            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void d(String str, Supplier supplier) {
                vr4.a(this, str, supplier);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void e(String str, Supplier supplier) {
                vr4.b(this, str, supplier);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void e(String str, Throwable th) {
                vr4.c(this, str, th);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void e(String str, Throwable th, Supplier supplier) {
                vr4.d(this, str, th, supplier);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void i(String str, Supplier supplier) {
                vr4.e(this, str, supplier);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public final void log(int i, String str, Throwable th, Supplier supplier) {
                BraceletApp.u1(i, str, th, supplier);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void v(String str, Supplier supplier) {
                vr4.f(this, str, supplier);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void w(String str, Supplier supplier) {
                vr4.g(this, str, supplier);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void w(String str, Throwable th) {
                vr4.h(this, str, th);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void w(String str, Throwable th, Supplier supplier) {
                vr4.i(this, str, th, supplier);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void wtf(String str, Supplier supplier) {
                vr4.j(this, str, supplier);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void wtf(String str, Throwable th) {
                vr4.k(this, str, th);
            }

            @Override // com.xiaomi.hm.health.training.api.util.Logger
            public /* synthetic */ void wtf(String str, Throwable th, Supplier supplier) {
                vr4.l(this, str, th, supplier);
            }
        });
        Analytics.setLogger(new com.huami.mifit.analytics.log.Logger() { // from class: u60
            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void d(String str, com.huami.mifit.analytics.function.Supplier supplier) {
                wr4.a(this, str, supplier);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void e(String str, com.huami.mifit.analytics.function.Supplier supplier) {
                wr4.b(this, str, supplier);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void e(String str, Throwable th) {
                wr4.c(this, str, th);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void e(String str, Throwable th, com.huami.mifit.analytics.function.Supplier supplier) {
                wr4.d(this, str, th, supplier);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void i(String str, com.huami.mifit.analytics.function.Supplier supplier) {
                wr4.e(this, str, supplier);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public final void log(int i, String str, Throwable th, com.huami.mifit.analytics.function.Supplier supplier) {
                BraceletApp.v1(i, str, th, supplier);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void v(String str, com.huami.mifit.analytics.function.Supplier supplier) {
                wr4.f(this, str, supplier);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void w(String str, com.huami.mifit.analytics.function.Supplier supplier) {
                wr4.g(this, str, supplier);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void w(String str, Throwable th) {
                wr4.h(this, str, th);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void w(String str, Throwable th, com.huami.mifit.analytics.function.Supplier supplier) {
                wr4.i(this, str, th, supplier);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void wtf(String str, com.huami.mifit.analytics.function.Supplier supplier) {
                wr4.j(this, str, supplier);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void wtf(String str, Throwable th) {
                wr4.k(this, str, th);
            }

            @Override // com.huami.mifit.analytics.log.Logger
            public /* synthetic */ void wtf(String str, Throwable th, com.huami.mifit.analytics.function.Supplier supplier) {
                wr4.l(this, str, th, supplier);
            }
        });
        HMLog.info(z, new Function0() { // from class: y50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.w1();
            }
        });
        HMLog.info(z, new Function0() { // from class: n60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.x1();
            }
        });
        HMLog.info(z, new Function0() { // from class: q60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.y1();
            }
        });
        HMLog.info(z, new Function0() { // from class: o60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.z1();
            }
        });
        HMLog.info(z, new Function0() { // from class: i60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.A1();
            }
        });
        HMLog.info(z, new Function0() { // from class: z50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.B1();
            }
        });
        HMLog.info(z, new Function0() { // from class: h60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.C1();
            }
        });
        HMLog.info(z, new Function0() { // from class: l60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.D1();
            }
        });
        HMLog.info(z, new Function0() { // from class: b60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.E1();
            }
        });
        HMLog.info(z, new Function0() { // from class: l50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.F1();
            }
        });
        HMLog.info(z, new Function0() { // from class: a60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.G1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RefreshFooter Z1(Context context, RefreshLayout refreshLayout) {
        ClassicsFooter.REFRESH_FOOTER_PULLUP = context.getString(com.huami.watch.hmwatchmanager.R.string.label_pull_to_load);
        ClassicsFooter.REFRESH_FOOTER_RELEASE = context.getString(com.huami.watch.hmwatchmanager.R.string.label_release_to_load);
        ClassicsFooter.REFRESH_FOOTER_LOADING = context.getString(com.huami.watch.hmwatchmanager.R.string.label_refresh_success);
        ClassicsFooter.REFRESH_FOOTER_REFRESHING = context.getString(com.huami.watch.hmwatchmanager.R.string.label_refreshing);
        ClassicsFooter.REFRESH_FOOTER_FINISH = context.getString(com.huami.watch.hmwatchmanager.R.string.load_success);
        ClassicsFooter.REFRESH_FOOTER_FAILED = context.getString(com.huami.watch.hmwatchmanager.R.string.load_fail);
        ClassicsFooter.REFRESH_FOOTER_ALLLOADED = context.getString(com.huami.watch.hmwatchmanager.R.string.label_all_data_loaded);
        return new ClassicsFooter(context).setSpinnerStyle(SpinnerStyle.Translate);
    }

    private void a1() {
        MedalProxy.setAdapter(new e());
    }

    private static void a2() {
        boolean z2 = HMAccountKeeper.INSTANCE.readAgreeUserExperience() && HMLoginManager.isInChina() && !GlobalConfig.get().isBuildPlay();
        HuamiCrashReport huamiCrashReport = HuamiCrashReport.INSTANCE;
        huamiCrashReport.setEnable(z2);
        if (z2) {
            String huamiId = HMLoginManager.getHuamiId();
            if (TextUtils.isEmpty(huamiId)) {
                huamiCrashReport.setId(Analytics.getHmStatAnonymousId(A));
            } else {
                huamiCrashReport.setHuamiId(huamiId);
            }
        }
    }

    public static void analyticBluetoothState() {
        String str;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            str = "1";
        } else {
            str = defaultAdapter.isEnabled() ? "3" : "2";
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.APP_LAUNCH_BT_STATE).setValue(str));
    }

    private void b1() {
        GpsUtilDelegate.init(new GpsUtilDelegate.GpsUtils() { // from class: v60
            @Override // com.huami.moving.ui.utils.GpsUtilDelegate.GpsUtils
            public final AlertDialogFragment genOpenGpsDialog(Context context) {
                return this.a.J1(context);
            }
        });
    }

    private static void b2() {
        if (!HMAccountKeeper.INSTANCE.readAgreeUserExperience()) {
            Analytics.disable();
            return;
        }
        Analytics.enable();
        if (A != null) {
            HMLog.verbose(z, new Function0() { // from class: d60
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BraceletApp.V1();
                }
            });
        }
    }

    private void c1() {
        AssistantToolUtilsDelegate.getInstance().setToolUtil(AssistantModuleToolUtils.getInstance());
        ScaleToolUtilsDelegate.getInstance().setToolUtil(ScaleModuleToolUtils.getInstance());
        CompanionToolUtilsDelegate.getInstance().setToolUtil(WearCompanionModuleToolUtils.getInstance());
    }

    private void c2() {
        HMLoginManager.setAreaUpdateListener(new HMLoginManager.AreaUpdateListener() { // from class: t50
            @Override // com.huami.account.HMLoginManager.AreaUpdateListener
            public final void onAreaUpdate() {
                BraceletApp.W1();
            }
        });
    }

    private void d1() {
        TrainingLib.init(getApplicationContext());
        TrainingLib.setTrainingDelegate(new TrainingDelegate() { // from class: d50
            @Override // com.xiaomi.hm.health.traininglib.delegate.TrainingDelegate
            public final boolean allowToJumpToCoursePageWhenRemindCourse() {
                return BraceletApp.M1();
            }
        });
        TrainingInjection.get().init(this);
    }

    private void d2() {
        try {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            Intent intent = new Intent(this, (Class<?>) HMCoreService.class);
            intent.setAction(HMCoreService.ACTION_KEEP_ALIVE);
            int i = AMapEngineUtils.HALF_MAX_P20_WIDTH;
            if (Build.VERSION.SDK_INT >= 23) {
                i = 201326592;
            }
            PendingIntent service = PendingIntent.getService(this, 1024, intent, i);
            alarmManager.cancel(service);
            alarmManager.setInexactRepeating(2, SystemClock.elapsedRealtime() + 1200000, 1200000L, service);
        } catch (Exception e2) {
            HMLog.info(z, new Function0() { // from class: s50
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BraceletApp.X1(e2);
                }
            });
        }
    }

    private void e1() {
        com.huami.watch.companion.config.Config.sIsDebug = GlobalConfig.get().isBuildDebug();
        com.huami.watch.companion.config.Config.sIsOversea = GlobalConfig.get().isBuildPlay();
        com.huami.watch.companion.config.Config.sFlavor = BuildConfig.FLAVOR;
        GpsFilterConfig.INSTANCE.setEnable(false);
        AssistantModule.setBleModule(new BleAssistantModule());
        SettingRepo.INSTANCE.setContext(this);
    }

    private void e2() {
        Analytics.enable();
    }

    public static void exitApp() {
        HMDataCacheCenter hMDataCacheCenter = HMDataCacheCenter.getInstance();
        if (hMDataCacheCenter != null) {
            hMDataCacheCenter.exitApp();
        }
        final LoginData loginData = HMAccountKeeper.INSTANCE.readLoginData();
        HMLog.info(z, new Function0() { // from class: k50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.h1(loginData);
            }
        });
        try {
            HMDaoManager.getInstance().closeDataBases(TextUtils.isEmpty(loginData.getHuamiUid()) ? loginData.getThirdUid() : loginData.getHuamiUid());
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.info(z, new r50(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean f1() {
        try {
            return Boolean.valueOf(((AccountService) KoinJavaComponent.get(AccountService.class)).isStartUpAgreementAgree());
        } catch (Exception e2) {
            e2.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public static Context getContext() {
        return A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h1(LoginData loginData) {
        StringBuilder sb = new StringBuilder();
        sb.append("exitApp:");
        sb.append(TextUtils.isEmpty(loginData.getHuamiUid()) ? loginData.getThirdUid() : loginData.getHuamiUid());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i1() {
        return "initBaseUtil start";
    }

    public static void initBaseUtil() {
        HMLog.info(z, new Function0() { // from class: c60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.i1();
            }
        });
        GlobalUtil.init(HMConfig.Channel.production(), HMConfig.Channel.name(), false);
    }

    public static void initCacheList() {
        HMLog.info(z, new Function0() { // from class: j60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.k1();
            }
        });
        HMDataCacheCenter.getInstance().preLoadDatas();
    }

    public static void initDB(Context context, final String thirdName, final String huamiId) {
        HMLog.info(z, new Function0() { // from class: v50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.m1(thirdName, huamiId);
            }
        });
        if (TextUtils.isEmpty(huamiId)) {
            final File databasePath = context.getDatabasePath(HMDatabaseHelper.parseOldDbName(thirdName));
            final File databasePath2 = context.getDatabasePath(HMDatabaseHelper.parseNewMD5DbName(thirdName));
            if (databasePath.exists()) {
                HMLog.info(z, new Function0() { // from class: o50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BraceletApp.n1(databasePath);
                    }
                });
                if (databasePath.renameTo(databasePath2)) {
                    thirdName = MD5Util.getMD5String(thirdName);
                    HMLog.info(z, new Function0() { // from class: q50
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BraceletApp.o1(databasePath2);
                        }
                    });
                }
            } else {
                HMLog.info(z, new Function0() { // from class: m60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BraceletApp.p1();
                    }
                });
                thirdName = MD5Util.getMD5String(thirdName);
            }
        } else {
            File databasePath3 = context.getDatabasePath(HMDatabaseHelper.parseOldDbName(thirdName));
            final File databasePath4 = context.getDatabasePath(HMDatabaseHelper.parseNewMD5DbName(thirdName));
            final File databasePath5 = context.getDatabasePath(HMDatabaseHelper.parseNewMD5DbName(huamiId));
            if (databasePath4.exists()) {
                HMLog.info(z, new Function0() { // from class: n50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BraceletApp.q1(databasePath4);
                    }
                });
                if (databasePath4.renameTo(databasePath5)) {
                    thirdName = MD5Util.getMD5String(huamiId);
                    HMLog.info(z, new Function0() { // from class: p50
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BraceletApp.r1(databasePath5);
                        }
                    });
                } else {
                    thirdName = MD5Util.getMD5String(thirdName);
                }
            } else if (!databasePath3.exists()) {
                thirdName = MD5Util.getMD5String(huamiId);
            } else if (databasePath3.renameTo(databasePath5)) {
                thirdName = MD5Util.getMD5String(huamiId);
                HMLog.info(z, new Function0() { // from class: m50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BraceletApp.s1(databasePath5);
                    }
                });
            }
        }
        HMDaoManager.init(context.getApplicationContext(), thirdName);
        if (!HMLoginManager.isUnknown()) {
            HMLocalPropertyUtil.setLocalProperty(HMLocalPropertyUtil.LOCAL_PROPERTY_IS_IN_MAINLAND, String.valueOf(HMLoginManager.isInMainland()));
        }
        HMLog.info(z, new Function0() { // from class: w50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.t1();
            }
        });
        ShareKitManager.setShareChannel();
    }

    public static void initData() {
        initCacheList();
        if (CompanionApplication.isOverSea) {
            return;
        }
        PlayFlavor.initApp(A);
    }

    public static void initService() {
        HMLog.info(z, new Function0() { // from class: g60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.K1();
            }
        });
        HMCoreService.startKeepLiveService(A);
        try {
            DeviceCenter.getInstance().init(A, new f());
            if (HMLoginManager.isOldUser()) {
                DeviceCenter.getInstance().setUserData(HMDeviceUtils.getThirdPartyUserData());
            }
        } catch (Exception e2) {
            HMLog.info(z, new Function0() { // from class: u50
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BraceletApp.L1(e2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j1(int i) {
        if (i == 0) {
            AppNotification.cancelSBENotification();
        } else {
            AppNotification.showSBENotification();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k1() {
        return "initCacheList start";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l1(final HMPersonInfo.SyncUserInfoCallback syncUserInfoCallback) {
        Objects.requireNonNull(syncUserInfoCallback);
        HMAccountWebExtAPI.safeUpdateProfile(new Action1() { // from class: t60
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                syncUserInfoCallback.onResult(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m1(String str, String str2) {
        return "thirdName: " + str + ", huamiId: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n1(File file) {
        return " old file exists : " + file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o1(File file) {
        return " renameTo " + file.getAbsolutePath() + " is ok";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p1() {
        return " not exists";
    }

    public static void processOldUser() {
        if (HMLoginManager.isExistingUser()) {
            b2();
            Analytics.onLogin(HMLoginManager.getHuamiId());
            a2();
            HMDeviceManager.getInstance().initDevices();
            KoinLifecycleManager.INSTANCE.startUserLifecycle();
            ApmHelper.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q1(File file) {
        return "huami case new file exists : " + file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r1(File file) {
        return "huami case renameTo " + file.getAbsolutePath() + " is ok";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s1(File file) {
        return " renameTo " + file.getAbsolutePath() + " is ok";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t1() {
        return "initDB ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u1(int i, String str, Throwable th, Supplier supplier) {
        if (supplier != null) {
            HMLog.log(str, i, th, supplier.get(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v1(int i, String str, Throwable th, com.huami.mifit.analytics.function.Supplier supplier) {
        HMLog.log(str, i, th, supplier != null ? String.valueOf(supplier.get()) : "", new Object[0]);
    }

    private void w() {
        HMKeeper.init(this);
        GlobalConfig.config(new HMConfig());
        initBaseUtil();
        HmUtilModule.INSTANCE.init(this);
        ThirdPartUtil.init(this);
        ThirdPartUtil.checkConfigs();
        HMPersonInfo.initUserIdProvider(new HMPersonInfo.Callback() { // from class: a50
            @Override // com.xiaomi.hm.health.model.account.HMPersonInfo.Callback
            public final long getValidUid() {
                return HMLoginManager.getValidUid();
            }
        });
        HMPersonInfo.initUserInfoUpdater(new HMPersonInfo.SyncUserInfoUpdater() { // from class: b50
            @Override // com.xiaomi.hm.health.model.account.HMPersonInfo.SyncUserInfoUpdater
            public final void syncToServer(HMPersonInfo.SyncUserInfoCallback syncUserInfoCallback) {
                BraceletApp.l1(syncUserInfoCallback);
            }
        });
        Configs.debugTimeConsuming = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w1() {
        return "========= build info =========";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x1() {
        return "build date         : 2022-06-30 17:11:59.227";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String y1() {
        return "build branch       : midong/6.10.0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z1() {
        return "build flavor       : midongPlay";
    }

    @Override // com.huami.watch.companion.CompanionApplication, android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
        ActivityThreadHooker.INSTANCE.hook();
        PrivacyProvider.init(this, new Function0() { // from class: x50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.f1();
            }
        });
        Z0();
        boolean zIsBuildInner = GlobalConfig.get().isBuildInner();
        HuamiCrashReport huamiCrashReport = HuamiCrashReport.INSTANCE;
        huamiCrashReport.init(new HuamiCrashReport.Config(this, zIsBuildInner ? "2B7459B9B7603C138849E0B9" : "39372B947945988B2F751F1C", BuildConfig.class, zIsBuildInner, Analytics.getHmStatAnonymousId(this), null));
        CrashHandler.init();
        if (GlobalConfig.get().isBuildPlay()) {
            return;
        }
        huamiCrashReport.setEnable(false);
    }

    @Override // com.huami.watch.companion.CompanionApplication
    public BrandNameService getBrandNameService() {
        return BrandNameServiceFactory.INSTANCE.create();
    }

    @Override // com.huami.watch.companion.CompanionApplication
    public void initCompanionCloudCallback() {
        CompanionCloudConfigCallback companionCloudConfigCallback = new CompanionCloudConfigCallback();
        Cloud.config(companionCloudConfigCallback);
        CloudClient.config(companionCloudConfigCallback);
    }

    @Override // com.huami.watch.companion.CompanionApplication, android.app.Application
    public void onCreate() {
        TrustKit.initializeWithNetworkSecurityConfiguration(this);
        A = this;
        AndroidThreeTen.init((Application) this);
        NotificationManager.getInstance().setListener(new MyNotificationModule());
        CompanionApplication.isOverSea = "play".toLowerCase().contains("play");
        HMLog.info(z, new Function0() { // from class: r60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.P1();
            }
        });
        if (((IsMainProcess) PrivacyProvider.get("Application内判断只有主进程进行初始化操作", IsMainProcess.class)).getValue().booleanValue()) {
            S0();
            ConfigurationHolder.setContext(this);
            ProcessLifecycleObserver.observeProcessLifecycle();
            HMDisplaySetting.SUPPORT_PYH_PAI = true;
            KoinHelperKt.startMiFitKoin(this);
            BackupUriCompat.updateUriConfig(this);
            w();
            super.onCreate();
            RxJavaPlugins.setErrorHandler(new Consumer() { // from class: g50
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    BraceletApp.Q1((Throwable) obj);
                }
            });
            rx.plugins.RxJavaPlugins.getInstance().registerErrorHandler(new b());
            FileUtils.initAppContext(A);
            GlobalKeeper.init(this);
            HMKeeper.setChooseUserShowing(false);
            HMKeeper.setActiveHistory(2);
            HMKeeper.setEnterAppState(2);
            HMKeeper.setUpgradeDialogShowing(false);
            if (HMKeeper.isNeedCleanAllCookies()) {
                WebActivityUtil.removeCookies(getContext());
                HMKeeper.setCleanAllCookies(false);
            }
            HMWebUtil.setRequester(Utils.handleUUID());
            DeviceXConfig.INSTANCE.setup(this);
            W0();
            c1();
            SpeechKeeper.INSTANCE.init(this);
            AlexaAuthKeeper.INSTANCE.migrateOldAlexaAuthSp(this);
            new SpeechEventBusRegister(this).registerEventBus();
            ProductionUtil.initPackageName(this);
            Y0();
            HMLoginManager.init(this);
            UnitManager.init(this, new UnitManager.OnUnitChangeCallback() { // from class: z40
                @Override // com.xiaomi.hm.health.manager.UnitManager.OnUnitChangeCallback
                public final void onChange() {
                    HMAccountWebExtAPI.updateProfile();
                }
            });
            EcgCore.INSTANCE.initEcg(this, new EcgInitSettings(this), new EcgInitDevices());
            EcgReportPrint.IS_EXPORT_RAW_DATA = false;
            EcgMedicalUtil.ecgMedicalService = new EcgMedicalServiceImpl();
            if (!EventBus.getDefault().isRegistered(this)) {
                EventBus.getDefault().register(this);
            }
            T0();
            e2();
            HMDeviceManager.init(this);
            HMDataCacheCenter.init(this);
            e1();
            com.huami.widget.share.Constant.WX_APP_ID = ThirdPartUtil.getWeixinId();
            com.huami.widget.share.Constant.QQ_APP_ID = ThirdPartUtil.getQqAppId("midong");
            registerActivityLifecycleCallbacks(BraceletForegroundCallBack.getInstance());
            RunningManager.init(this, false);
            if (HMLoginManager.isUserValid()) {
                initDB(this, HMLoginManager.getThirdId(), HMLoginManager.getHuamiId());
                processOldUser();
                initData();
                HMLoginManager.initAccountManager();
                HMLoginManager.initCountryCode();
                HMLoginManager.refreshHttpDns();
            }
            LifecycleModuleKt.dispatchAccountStateOnBoot();
            HealthDetectInitFactory.appApi = new DeviceAppApiImpl();
            HealthDetectInitFactory.appRes = new AppResImpl();
            HealthDetectInitFactory.getPersonInfoFragment = new Function0() { // from class: s60
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new BloodPressurePersonInfoFragment();
                }
            };
            LocWeatherManager.init(this, new WeatherSettingClient(), GlobalConfig.get().isBuildPlay());
            if (MiuiAPI.isMiui(this)) {
                MiuiAPI.getInstance().init();
                MiuiUnlockAPI.getInstance(this).init();
            }
            initService();
            d2();
            Twitter.initialize(this);
            AdModule.initialize(this, new c());
            WatermarkLib.init(this);
            a1();
            d1();
            LabInit.init();
            AudioUtils.init();
            AliveUtils.init(this);
            BodyFatInit.init();
            ESimInit.INSTANCE.init();
            com.huami.reddot.ConfigurationHolder.initContext(this);
            WalletDataUtil.getInstance().init();
            HMKeepAliveAnalyticsManager.start();
            DoorApiRepo.get();
            BridgeCallbackBinder.getInstance().setAppNativeFunctionCallback(new AppNativeImpl());
            if (BridgeCallbackBinder.getInstance().getUserAgenter() == null) {
                BridgeCallbackBinder.getInstance().setWebUserAgenter(new WebUserAgenter() { // from class: e60
                    @Override // com.huami.discovery.bridge.WebUserAgenter
                    public final String getUAString() {
                        return WebActivityUtil.getExtraUAString();
                    }

                    @Override // com.huami.discovery.bridge.WebUserAgenter
                    public /* synthetic */ String handleOriginUAString(String str) {
                        return fq8.a(this, str);
                    }
                });
            }
            if (BridgeCallbackBinder.getInstance().getmJsBridgeApi() == null) {
                BridgeCallbackBinder.getInstance().setJsBridgeApi(new JsBridgeApiImpl(getApplicationContext()));
            }
            BridgeCallbackBinder.getInstance().setAppNativeFunctionCallback(new AppNativeImpl());
            if (Build.VERSION.SDK_INT >= 23) {
                HMLog.info(z, new Function0() { // from class: f60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BraceletApp.R1();
                    }
                });
            }
            b1();
            Analytics.recordEvent(new CountEventBuilder(StatEvent.APP_LAUNCH));
            analyticBluetoothState();
            BTConnectionAnalyticStatusHelper.registerEventBus();
            AppRateManager.INSTANCE.setButtonListener(new AppRateButtonListener() { // from class: y60
                @Override // com.xiaomi.hm.health.apprate.AppRateButtonListener
                public final void onGiveShitButtonClicked() {
                    this.a.S1();
                }
            });
            c2();
            RxBus.get().toObservable().subscribe(new Consumer() { // from class: h50
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    HMWatchLogic.onWatchEvent(obj);
                }
            }, new Consumer() { // from class: f50
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    BraceletApp.N1((Throwable) obj);
                }
            });
            EcgAnalyticsKt.init();
            EventBusToListener.INSTANCE.registerEventBus();
            EventBusListener.INSTANCE.registerEventBus();
            SleepEventBusToListener.INSTANCE.registerEventBus();
            ContentObserverToListener.INSTANCE.registerContentObserver(this);
            PreLaunchApi.INSTANCE.init(PreLaunchImpl.INSTANCE, this);
            AtriDbObserver.INSTANCE.getInstance().safeObserve(new Consumer() { // from class: e50
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    BraceletApp.O1((AtrialFibrillationDataItem) obj);
                }
            });
            WifiFtpModule.setBleModule(new WifiFtpBleModule(this));
            DataFlowSyncModule.setModule(new DataFlowSyncBleModule());
            WFDeviceConnManager.INSTANCE.init();
            V0();
            ShareCommonConfig.INSTANCE.init();
            U0();
            ZeppPermissionManager.init(this);
            HeartRateCenter heartRateCenter = HeartRateCenter.INSTANCE;
            MediaFileUtils.INSTANCE.initUtils(this);
            OpenAppPageSubscriber.INSTANCE.initListener(new OpenPageImpl());
            AppNightModeHelper.loadLaunchNightMode();
            HealthDetectInitFactory.INSTANCE.initHealth();
            DeviceXBuilder.INSTANCE.setDebug(false);
        }
    }

    public void onEventMainThread(final EventAgreeUserExperience event) {
        final boolean zIsUserValid = HMLoginManager.isUserValid();
        HMLog.info(z, new Function0() { // from class: j50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BraceletApp.U1(event, zIsUserValid);
            }
        });
        if (zIsUserValid) {
            b2();
            a2();
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        HMImageLoader.onLowMemory(this);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        HMImageLoader.onTrimMemory(this, level);
    }
}
