package com.huawei.ui.homehealth.backlog;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.FactoryRestCallback;
import com.huawei.health.device.callback.JumpToPageCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.constants.PendingSettingTag;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionConstant;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.backlog.BackLogManagerJump;
import com.huawei.ui.homehealth.util.FeedBackLogHelper;
import com.huawei.ui.homewear21.R;
import defpackage.dmz;
import defpackage.eei;
import defpackage.eel;
import defpackage.eey;
import defpackage.iov;
import defpackage.lmf;
import defpackage.lvl;
import defpackage.lwo;
import defpackage.maq;
import defpackage.mgg;
import defpackage.njy;
import defpackage.pvh;
import defpackage.pxi;
import defpackage.qpx;
import defpackage.rdt;
import defpackage.rtk;
import defpackage.tfn;
import defpackage.tpp;
import defpackage.tqp;
import defpackage.tqy;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public enum BackLogManagerJump {
    NOTIFICATION_BAR(PendingSettingTag.NOTIFICATION_BAR, AnalyticsValue.DEVICE_POP_TIP_EVENT_VALUE.value(), new IBackLogJump() { // from class: rig
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.notificationBar(str, jumpToPageCallback);
        }
    }),
    LAW_INFO_PAGE("law_info_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rim
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.legalInfoPage(str, jumpToPageCallback);
        }
    }),
    OTA_UPDATE_PAGE("ota_update_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rhm
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.otaUpdate(str, jumpToPageCallback);
        }
    }),
    LOG_FEEDBACK_PAGE("log_feedback_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rhr
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.logFeedBack(str, jumpToPageCallback);
        }
    }),
    BETA_FEEDBACK_PAGE("betaFeedback", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rhs
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.betaFeedBack(str, jumpToPageCallback);
        }
    }),
    ESIM("esim", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rhu
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.esim(str, jumpToPageCallback);
        }
    }),
    SERVICE_HOTLINE_PAGE("service_hotline_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rhq
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.serviceHotlinePage(str, jumpToPageCallback);
        }
    }),
    MY_HUAWEI_PAGE("my_huawei_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rhy
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.myHuaWeiPage(str, jumpToPageCallback);
        }
    }),
    NO_DISTURB_PAGE("no_disturb_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rhz
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.disturbPage(str, jumpToPageCallback);
        }
    }),
    CUSTOM_BAND_PAGE("custom_band_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rhx
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.customBandPage(str, jumpToPageCallback);
        }
    }),
    DOUBLE_PHONE_PAGE("double_phone_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rif
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.doublePhonePage(str, jumpToPageCallback);
        }
    }),
    LIVE_WINDOW_PAGE("live_window_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rhn
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.liveWindowPage(str, jumpToPageCallback);
        }
    }),
    DIAGNOSTIC_ANALYSIS_PAGE("diagnostic_analysis_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rhw
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.diagnosticAnalysisPage(str, jumpToPageCallback);
        }
    }),
    PERSONAL_EMERGENCY_INFO_PAGE("personal_emergency_info_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rii
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.personalEmergencyInfoPage(str, jumpToPageCallback);
        }
    }),
    EMERGENCY_CONTACT_PAGE("emergency_contact_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rij
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.emergencyContactPage(str, jumpToPageCallback);
        }
    }),
    SUPPORT_HELP_PAGE("support_help_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rik
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.supportHelpPage(str, jumpToPageCallback);
        }
    }),
    HONOR_PRIVACY_PAGE("honor_privacy_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rin
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.honorPrivacyPage(str, jumpToPageCallback);
        }
    }),
    RESTORE_FACTORY_SETTINGS_PAGE("restore_factory_settings_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: rio
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.restoreFactorySettingsPage(str, jumpToPageCallback);
        }
    }),
    RESTORE_FACTORY_SETTINGS_ESIM_PAGE("restore_factory_settings_esim_page", AnalyticsValue.DEVICE_HOME_ITEM_CLICK_EVENT_VALUE.value(), new IBackLogJump() { // from class: ril
        @Override // com.huawei.ui.homehealth.backlog.IBackLogJump
        public final void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
            BackLogManagerJump.restoreFactorySettingsEsimPage(str, jumpToPageCallback);
        }
    });

    private static final String BI_TYPE_KEY = "type";
    private static final String HONOR_HOTLINE = "95030";
    private static final String TAG = "BackLogManagerJump";
    private static final String TAG_RELEASE = "DEVMGR_BackLogManagerJump";
    private String biKey;
    private IBackLogJump jumpCall;
    private String tag;
    private static HashMap<String, String> sHuaFenUrlMaps = new HashMap<>();
    private static HashMap<String, Integer> biMap = new HashMap<String, Integer>() { // from class: com.huawei.ui.homehealth.backlog.BackLogManagerJump.2
        {
            put(PendingSettingTag.NOTIFICATION_BAR, 12);
            put(PendingSettingTag.MESSAGE_NOTIFICATION, 13);
            put(PendingSettingTag.ERAR_PHONE_MATCHING, 14);
            put(PendingSettingTag.ACCOUNT_SYNC, 15);
            put(PendingSettingTag.NERAR_DEVICE_PERMISSION, 16);
            put(PendingSettingTag.LOCATION_PERMISSION, 2);
            put(PendingSettingTag.SECRET_MESSAGE_PERMISSION, 8);
            put(PendingSettingTag.ENABLE_NOTIFICATION, 10);
            put(PendingSettingTag.CONNECT_PROTECT, 5);
            put(PendingSettingTag.WECHAT_BINDING, 7);
            put(PendingSettingTag.AUTO_UPGRADE_ON_WLAN, 17);
            put(PendingSettingTag.VERSION_UPGRADE, 18);
            put(PendingSettingTag.BEIDOU_MESSAGE, 19);
        }
    };

    private void jumpToPage(String str, JumpToPageCallback jumpToPageCallback) {
        this.jumpCall.jumpToPage(str, jumpToPageCallback);
    }

    public static void jumpToPage(String str, String str2, JumpToPageCallback jumpToPageCallback) {
        for (BackLogManagerJump backLogManagerJump : values()) {
            if (backLogManagerJump.tag.equalsIgnoreCase(str)) {
                setClickEvent(str, backLogManagerJump.biKey, str2);
                backLogManagerJump.jumpToPage(str2, jumpToPageCallback);
            }
        }
    }

    BackLogManagerJump(String str, String str2, IBackLogJump iBackLogJump) {
        this.tag = str;
        this.biKey = str2;
        this.jumpCall = iBackLogJump;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notificationBar(String str, JumpToPageCallback jumpToPageCallback) {
        ResolveInfo resolveInfoResolveActivity;
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            jumpToPageCallback.onFail("Activity is null ");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", activityJ.getPackageName());
            LogUtil.a(TAG, "CommonAutoTestToast onResponse.");
            PackageManager packageManager = activityJ.getPackageManager();
            if (packageManager != null && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) != null) {
                intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
                activityJ.startActivity(intent);
            }
            jumpToPageCallback.onSuccess();
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "initNotificationOpenToastView ActivityNotFoundException");
            jumpToPageCallback.onFail("NotificationSettingActivity ActivityNotFoundException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void otaUpdate(String str, JumpToPageCallback jumpToPageCallback) {
        rdt.c(2);
        tqp.c(str, jumpToPageCallback);
        jumpToPageCallback.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void legalInfoPage(String str, JumpToPageCallback jumpToPageCallback) {
        DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            jumpToPageCallback.onFail("device info is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(dmz.y, "com.huawei.ui.homewear21.home.legal.WearHomeLegalInformationActivity");
        intent.putExtra("device_id", deviceInfoById.getDeviceIdentify());
        intent.putExtra("device_name", deviceInfoById.getDeviceName());
        intent.putExtra("product_type", deviceInfoById.getProductType());
        intent.putExtra("wear_legal_come_from", "ARKUIX");
        iov.d(BaseApplication.b(), intent);
        jumpToPageCallback.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void esim(String str, JumpToPageCallback jumpToPageCallback) {
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            jumpToPageCallback.onFail("Activity is null");
            return;
        }
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HOME_1010021.value(), new HashMap(16), 0);
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.b()).e(str);
        pvh pvhVarB = pvh.b(BaseApplication.b());
        pxi.e();
        if (pvhVarB != null) {
            if (deviceCapabilityE != null && deviceCapabilityE.isSupportNewEsim()) {
                LogUtil.a(TAG, "openEsimCard isSupportNewEsim : true");
                boolean zD = eey.d(mgg.c(TAG), 148);
                LogUtil.a(TAG, "openEsimCard isSupportStandaloneNum = ", Boolean.valueOf(zD));
                if (zD) {
                    pvhVarB.c(activityJ);
                    return;
                } else {
                    pvhVarB.d(activityJ);
                    return;
                }
            }
            pvhVarB.a(activityJ);
            return;
        }
        jumpToPageCallback.onFail("PluginSim is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void serviceHotlinePage(String str, JumpToPageCallback jumpToPageCallback) {
        String string;
        ResolveInfo resolveInfoResolveActivity;
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            jumpToPageCallback.onFail("Activity is null");
            return;
        }
        DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            jumpToPageCallback.onFail("device info is null");
            return;
        }
        boolean zD = eei.d(deviceInfoById);
        try {
            lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HOME_1010046.value(), new HashMap(16), 0);
            if (zD) {
                string = HONOR_HOTLINE;
            } else {
                string = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_main_sns_member_service_call_number_item_3);
            }
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(KakaConstants.SCHEME_TEL + string));
            PackageManager packageManager = activityJ.getPackageManager();
            if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
                return;
            }
            ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
            intent.setComponent(componentName);
            showLaunchAgreeDialog(activityJ, intent, componentName);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "callHotline() ActivityNotFoundException");
        }
    }

    private static void showLaunchAgreeDialog(final Activity activity, final Intent intent, final ComponentName componentName) {
        activity.runOnUiThread(new Runnable() { // from class: rhv
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2 = intent;
                ComponentName componentName2 = componentName;
                Activity activity2 = activity;
                qrs.c(intent2, componentName2.getPackageName(), activity2, activity2.getString(R.string.IDS_hwh_phone));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void myHuaWeiPage(final String str, final JumpToPageCallback jumpToPageCallback) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            jumpToPageCallback.onFail("Activity is null");
        } else if (sHuaFenUrlMaps.containsKey(str)) {
            openHuaFenClub(sHuaFenUrlMaps.get(str), jumpToPageCallback);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ric
                @Override // java.lang.Runnable
                public final void run() {
                    BackLogManagerJump.lambda$myHuaWeiPage$1(str, activityJ, jumpToPageCallback);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$myHuaWeiPage$1(String str, Activity activity, final JumpToPageCallback jumpToPageCallback) {
        LogUtil.a(TAG, "openHuaFenClubActivity enter");
        final String strD = GRSManager.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUrl("domainClubHuawei") + "/forum.php?mod=forumdisplay&fid=4301";
        DeviceInfo deviceInfoA = tfn.a().a(str);
        if (deviceInfoA != null) {
            int productType = deviceInfoA.getProductType();
            LogUtil.a(TAG, "openHuaFenClubActivity() productType ", Integer.valueOf(productType));
            if (!eel.d(productType)) {
                strD = tqy.b().d(deviceInfoA);
            }
        }
        LogUtil.a(TAG, "startWebViewActivity() url is ", strD, ", jumpModeKey is ", 1);
        sHuaFenUrlMaps.put(str, strD);
        activity.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.backlog.BackLogManagerJump.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a(BackLogManagerJump.TAG, "Handler");
                BackLogManagerJump.openHuaFenClub(strD, jumpToPageCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void disturbPage(String str, JumpToPageCallback jumpToPageCallback) {
        if (BaseApplication.j() == null) {
            jumpToPageCallback.onFail("Activity is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("device_id", str);
        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.donotdisturb.NoDisturbSettingActivity");
        iov.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), intent);
        jumpToPageCallback.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void customBandPage(String str, JumpToPageCallback jumpToPageCallback) {
        if (BaseApplication.j() == null) {
            jumpToPageCallback.onFail("Activity is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("device_id", str);
        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity");
        iov.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), intent);
        jumpToPageCallback.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doublePhonePage(String str, JumpToPageCallback jumpToPageCallback) {
        if (BaseApplication.j() == null) {
            jumpToPageCallback.onFail("Activity is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("device_id", str);
        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.doublephone.DoublePhoneActivity");
        iov.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), intent);
        jumpToPageCallback.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void liveWindowPage(String str, JumpToPageCallback jumpToPageCallback) {
        if (BaseApplication.j() == null) {
            jumpToPageCallback.onFail("Activity is null");
            return;
        }
        DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            jumpToPageCallback.onFail("device info is null");
            return;
        }
        rdt.d("live_notifications");
        boolean zD = eey.d(deviceInfoById, FitnessSleepType.HW_FITNESS_NOON);
        LogUtil.a(TAG, "isSupportLiveView", Boolean.valueOf(zD));
        Intent intent = new Intent();
        intent.putExtra("device_id", str);
        intent.putExtra("LiveViewType", zD);
        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.notificationlive.NotificationLiveActivity");
        iov.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), intent);
        jumpToPageCallback.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void diagnosticAnalysisPage(String str, final JumpToPageCallback jumpToPageCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "diagnosticAnalysisPage");
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            jumpToPageCallback.onFail("diagnosticAnalysisPage Activity is null");
            return;
        }
        final DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            jumpToPageCallback.onFail("diagnosticAnalysisPage device info is null");
        } else {
            activityJ.runOnUiThread(new Runnable() { // from class: rht
                @Override // java.lang.Runnable
                public final void run() {
                    BackLogManagerJump.lambda$diagnosticAnalysisPage$2(deviceInfoById, jumpToPageCallback);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$diagnosticAnalysisPage$2(DeviceInfo deviceInfo, JumpToPageCallback jumpToPageCallback) {
        lwo.c().e(deviceInfo, 2);
        jumpToPageCallback.onSuccess();
    }

    private static DeviceInfo getDeviceInfoById(String str) {
        List<DeviceInfo> listD = lvl.d();
        if (njy.e(listD)) {
            return null;
        }
        for (DeviceInfo deviceInfo : listD) {
            if (str.equals(deviceInfo.getDeviceIdentify())) {
                LogUtil.a(TAG, "deviceInfo is local DeviceInfo");
                return deviceInfo;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void openHuaFenClub(String str, JumpToPageCallback jumpToPageCallback) {
        try {
            Intent intent = new Intent();
            intent.putExtra("url", str);
            intent.putExtra(Constants.JUMP_MODE_KEY, 1);
            intent.setClassName(dmz.y, "com.huawei.operation.activity.WebViewActivity");
            iov.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), intent);
            jumpToPageCallback.onSuccess();
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "initNotificationOpenToastView ActivityNotFoundException");
            jumpToPageCallback.onFail("NotificationSettingActivity ActivityNotFoundException");
        }
    }

    private static boolean isOtaUpdate(String str) {
        if (maq.b().c(str) != 6) {
            return false;
        }
        qpx.e(BaseApplication.b(), com.huawei.ui.homehealth.R.string.IDS_device_ota_later_note);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logFeedBack(final String str, final JumpToPageCallback jumpToPageCallback) {
        final DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            jumpToPageCallback.onFail("device info is null");
            return;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            jumpToPageCallback.onFail("activity  is null");
        } else {
            activityJ.runOnUiThread(new Runnable() { // from class: ria
                @Override // java.lang.Runnable
                public final void run() {
                    BackLogManagerJump.lambda$logFeedBack$3(str, jumpToPageCallback, deviceInfoById);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$logFeedBack$3(String str, JumpToPageCallback jumpToPageCallback, DeviceInfo deviceInfo) {
        if (isOtaUpdate(str)) {
            Log.w(TAG, "logFeedBack OtaTransfering");
            jumpToPageCallback.onFail("device  is OtaTransfering");
        } else {
            FeedBackLogHelper feedBackLogHelper = new FeedBackLogHelper();
            feedBackLogHelper.b(deviceInfo);
            feedBackLogHelper.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void betaFeedBack(final String str, final JumpToPageCallback jumpToPageCallback) {
        final DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            jumpToPageCallback.onFail("device info is null");
            return;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            jumpToPageCallback.onFail("activity  is null");
        } else {
            activityJ.runOnUiThread(new Runnable() { // from class: rib
                @Override // java.lang.Runnable
                public final void run() {
                    BackLogManagerJump.lambda$betaFeedBack$4(str, jumpToPageCallback, deviceInfoById);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$betaFeedBack$4(String str, JumpToPageCallback jumpToPageCallback, DeviceInfo deviceInfo) {
        if (isOtaUpdate(str)) {
            Log.w(TAG, "betaFeedBack OtaTransfering");
            jumpToPageCallback.onFail("device  is OtaTransfering");
        } else {
            FeedBackLogHelper feedBackLogHelper = new FeedBackLogHelper();
            feedBackLogHelper.b(deviceInfo);
            feedBackLogHelper.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void personalEmergencyInfoPage(String str, final JumpToPageCallback jumpToPageCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: rie
            @Override // java.lang.Runnable
            public final void run() {
                BackLogManagerJump.lambda$personalEmergencyInfoPage$5(jumpToPageCallback);
            }
        });
    }

    public static /* synthetic */ void lambda$personalEmergencyInfoPage$5(JumpToPageCallback jumpToPageCallback) {
        boolean zHasEmergencyInfoProvider = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).hasEmergencyInfoProvider();
        LogUtil.a(TAG, "enter emergencyInfo isHasEmergencyInfo: ", Boolean.valueOf(zHasEmergencyInfoProvider));
        if (zHasEmergencyInfoProvider) {
            try {
                Intent intent = new Intent();
                intent.setClassName(FallDetectionConstant.PACKAGE_NAME, FallDetectionConstant.CLASS_NAME);
                iov.d(BaseApplication.b(), intent);
                jumpToPageCallback.onSuccess();
                return;
            } catch (ActivityNotFoundException unused) {
                jumpToPageCallback.onFail("Emui110 activityNotFoundException SOS");
                LogUtil.e(TAG, "Emui110 activityNotFoundException SOS");
                return;
            }
        }
        AppRouter.c("/HWUserProfileMgr/EditInfoActivity").b(BaseApplication.b());
        jumpToPageCallback.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void emergencyContactPage(String str, final JumpToPageCallback jumpToPageCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: rid
            @Override // java.lang.Runnable
            public final void run() {
                BackLogManagerJump.lambda$emergencyContactPage$6(jumpToPageCallback);
            }
        });
    }

    public static /* synthetic */ void lambda$emergencyContactPage$6(JumpToPageCallback jumpToPageCallback) {
        if (((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).hasEmergencyInfoProvider()) {
            if (new BigDecimal(getMetaDataFromApp()).compareTo(BigDecimal.ZERO) == 0) {
                Intent intent = new Intent();
                intent.setClassName(FallDetectionConstant.PACKAGE_NAME, FallDetectionConstant.CLASS_NAME);
                iov.d(BaseApplication.b(), intent);
            } else {
                iov.d(BaseApplication.b(), new Intent(FallDetectionConstant.EMRGENCY_CONTACTS));
            }
        } else {
            AppRouter.c("/HWUserProfileMgr/EditContactActivity").b(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        }
        jumpToPageCallback.onSuccess();
    }

    private static float getMetaDataFromApp() {
        float f = 0.0f;
        try {
            f = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getPackageManager().getApplicationInfo(FallDetectionConstant.PACKAGE_NAME, 128).metaData.getFloat(FallDetectionConstant.EMERGENCY_METADATA);
            LogUtil.a(TAG, "getMetaDataFromApp value ", Float.valueOf(f));
            return f;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e(TAG, "getMetaDataFromApp NameNotFoundException");
            return f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void supportHelpPage(String str, JumpToPageCallback jumpToPageCallback) {
        DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            jumpToPageCallback.onFail("device info is null");
        } else {
            tqp.b(BaseApplication.b(), deviceInfoById);
            jumpToPageCallback.onSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void honorPrivacyPage(String str, JumpToPageCallback jumpToPageCallback) {
        Intent intent = new Intent();
        intent.setClassName(dmz.y, "com.huawei.health.device.ui.privacy.HonorDevicePrivacyActivity");
        intent.putExtra("device_id", str);
        intent.putExtra("wear_legal_come_from", "ARKUIX");
        iov.d(BaseApplication.b(), intent);
        jumpToPageCallback.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void restoreFactorySettingsPage(final String str, final JumpToPageCallback jumpToPageCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter restoreFactorySettingsPage");
        final DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            jumpToPageCallback.onFail("device info is null");
            return;
        }
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            jumpToPageCallback.onFail("activity is null");
        } else {
            activityJ.runOnUiThread(new Runnable() { // from class: rho
                @Override // java.lang.Runnable
                public final void run() {
                    BackLogManagerJump.lambda$restoreFactorySettingsPage$7(activityJ, jumpToPageCallback, str, deviceInfoById);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$restoreFactorySettingsPage$7(Activity activity, final JumpToPageCallback jumpToPageCallback, String str, DeviceInfo deviceInfo) {
        if (rtk.a()) {
            rtk.e(activity, com.huawei.ui.homehealth.R.string.IDS_device_ota_later_note);
            jumpToPageCallback.onFail("ota is updating");
            return;
        }
        tpp tppVarC = tpp.c();
        tppVarC.b();
        tppVarC.e(new FactoryRestCallback() { // from class: com.huawei.ui.homehealth.backlog.BackLogManagerJump.4
            @Override // com.huawei.health.device.callback.FactoryRestCallback
            public void onSuccess(int i) {
                ReleaseLogUtil.d(BackLogManagerJump.TAG_RELEASE, "restoreFactorySettingsPage onSuccess");
                jumpToPageCallback.onSuccess();
            }

            @Override // com.huawei.health.device.callback.FactoryRestCallback
            public void onFail(String str2) {
                ReleaseLogUtil.d(BackLogManagerJump.TAG_RELEASE, "restoreFactorySettingsPage onFail");
                jumpToPageCallback.onFail(str2);
            }
        });
        tppVarC.a(true);
        tppVarC.e(str, deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void restoreFactorySettingsEsimPage(String str, JumpToPageCallback jumpToPageCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter restoreFactorySettingsEsimPage");
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            jumpToPageCallback.onFail("activity is null");
        } else {
            activityJ.runOnUiThread(new Runnable() { // from class: rih
                @Override // java.lang.Runnable
                public final void run() {
                    tpp.c().n();
                }
            });
        }
    }

    public static void setClickEvent(String str, String str2, String str3) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("type", str);
        if (AnalyticsValue.DEVICE_POP_TIP_EVENT_VALUE.value().equals(str2)) {
            map.put("tipType", "2");
            int biContentByTag = getBiContentByTag(str);
            if (biContentByTag == 0) {
                LogUtil.j(TAG, "Please add this tag to the map. tag is:", str);
                return;
            }
            map.put("Content", Integer.valueOf(biContentByTag));
            DeviceInfo deviceInfoById = getDeviceInfoById(str3);
            if (deviceInfoById != null) {
                map.put("device_name", deviceInfoById.getDeviceName());
                map.put(DeviceCategoryFragment.DEVICE_TYPE, Integer.valueOf(deviceInfoById.getProductType()));
                map.put("HiLinkDeviceId", deviceInfoById.getHiLinkDeviceId());
            }
            map.put("Page", "To-Do Page");
        }
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), str2, map, 0);
    }

    public static int getBiContentByTag(String str) {
        if (biMap.containsKey(str)) {
            return biMap.get(str).intValue();
        }
        return 0;
    }
}
