package com.huawei.ui.homehealth;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.media3.common.C;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.InputBoxTemplate;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.plan.association.SportEventAssociator;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.api.SyncApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.util.HealthSyncUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.util.DownloadUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.operation.js.JsInteractAddition;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.SecurityManagerSettingSwitchDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.activity.adddevice.OneKeyScanActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.achievementcard.AchievementCardData;
import com.huawei.ui.homehealth.adapter.HomeCardAdapter;
import com.huawei.ui.homehealth.functionsetcard.FunctionSetCardData;
import com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardData;
import com.huawei.ui.homehealth.healthtrend.HealthInsightsCardData;
import com.huawei.ui.homehealth.operamsgcard.OperaMsgCardData;
import com.huawei.ui.homehealth.operationcard.OperationCardData;
import com.huawei.ui.homehealth.threecirclecard.ThreeCircleCardData;
import com.huawei.ui.homehealth.threecirclecard.model.StepsViewModel;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import com.huawei.ui.main.stories.nps.component.NpsConstantValue;
import com.huawei.ui.main.stories.nps.harid.HagridNpsManager;
import com.huawei.ui.main.stories.nps.interactors.mode.WeightDeviceParamProvider;
import com.huawei.ui.main.stories.nps.interactors.util.DeviceWebNpsUtil;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudCallBack;
import defpackage.dor;
import defpackage.drl;
import defpackage.ean;
import defpackage.eas;
import defpackage.ece;
import defpackage.ecu;
import defpackage.ezi;
import defpackage.fua;
import defpackage.fwx;
import defpackage.imx;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.lsy;
import defpackage.mhs;
import defpackage.nio;
import defpackage.njy;
import defpackage.qhu;
import defpackage.qkz;
import defpackage.qqv;
import defpackage.qre;
import defpackage.qrs;
import defpackage.rcz;
import defpackage.rhd;
import defpackage.rhe;
import defpackage.sho;
import defpackage.swi;
import defpackage.tcw;
import defpackage.tfk;
import defpackage.tfn;
import defpackage.tfp;
import defpackage.tge;
import defpackage.tqp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.GRSManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HomeFragmentUtil {
    static void d(Context context) {
        LogUtil.a("HomeFragmentUtil", "Process Cloud Sync by Pullrefresh");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(context).synCloud(hiSyncOption, null);
        SharedPreferenceManager.e(context, Integer.toString(10000), "last_sync_time", String.valueOf(System.currentTimeMillis()), new StorageParams());
    }

    static void e(AbstractBaseCardData abstractBaseCardData) {
        if (abstractBaseCardData != null) {
            abstractBaseCardData.onDestroy();
        }
    }

    static void d(AbstractBaseCardData abstractBaseCardData) {
        if (abstractBaseCardData != null) {
            abstractBaseCardData.onResume();
        }
    }

    static boolean d() {
        long j2;
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "showFamilyHealthDialogTime");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        try {
            j2 = Long.parseLong(strE);
        } catch (NumberFormatException unused) {
            LogUtil.e("HomeFragmentUtil", "HomeFragmentUtil NumberFormatException");
            j2 = 0;
        }
        return jCurrentTimeMillis - j2 > 604800000;
    }

    public static void c(Context context, BroadcastReceiver broadcastReceiver) {
        LogUtil.a("HomeFragmentUtil", "enter registerAw70SyncFinishBroadcast");
        BroadcastManagerUtil.d(context, broadcastReceiver, new IntentFilter("com.huawei.health.action.AW70_FITNESS_DETAIL_SYNC_SUCCESS_ACTION"), LocalBroadcast.f36595c, null);
    }

    public static void i(Context context, BroadcastReceiver broadcastReceiver) {
        LogUtil.a("HomeFragmentUtil", "enter registerWifiUserInfoBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.health.action.ACTION_WIFI_USERINFO_ACTION");
        intentFilter.addAction("com.huawei.health.action.ACTION_WIFI_USERINFO_ACTION");
        intentFilter.addAction("com.huawei.health.action.ACTION_WIFI_DEVICE_UNIT_ACTION");
        intentFilter.addAction("com.huawei.health.action.ACTION_WIFI_OTA_UPDATE_ACTION");
        if (context != null) {
            BroadcastManagerUtil.c(context, broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
        }
    }

    public static void c() {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME", NpsConstantValue.QUERY_SYSTEM_BUSY, null);
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", "weight_notify_key", "true", null);
        }
    }

    public static void c(Handler handler, final Context context) {
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("HomeFragmentUtil", "downloadIntensityResource");
                    Intent intent = new Intent();
                    intent.setAction("DOWNLOAD_INTENSITY_FILE");
                    BroadcastManagerUtil.e(context, intent);
                }
            }, 3500L);
        }
    }

    public static void b(rhd.c cVar, AchievementCardData achievementCardData, FunctionSetCardData functionSetCardData, FunctionMenuCardData functionMenuCardData, sho shoVar, OperationCardData operationCardData, ArrayList<AbstractBaseCardData> arrayList, ArrayList<AbstractBaseCardData> arrayList2, OperaMsgCardData operaMsgCardData, boolean z, HealthInsightsCardData healthInsightsCardData, HealthHeadLinesCardData healthHeadLinesCardData) {
        cVar.b(achievementCardData);
        cVar.c(functionSetCardData);
        cVar.d(shoVar);
        cVar.h(operationCardData);
        cVar.e(arrayList);
        cVar.a(arrayList2);
        cVar.i(operaMsgCardData);
        if (fua.o()) {
            cVar.a(functionMenuCardData);
        }
        if (!z) {
            cVar.e(healthHeadLinesCardData);
        }
        if (!fua.k() || healthInsightsCardData == null) {
            return;
        }
        cVar.d(healthInsightsCardData);
    }

    public static void j(Context context, BroadcastReceiver broadcastReceiver) {
        if (context == null) {
            LogUtil.e("HomeFragmentUtil", "setWearBroadcast failed, cause context is null!");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        intentFilter.addAction("com.huawei.haf.intent.action.UPDATE_LANGUAGE_READY");
        intentFilter.addAction("com.huawei.bone.action.open_gps");
        intentFilter.setPriority(500);
        intentFilter.addAction("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS");
        intentFilter.addAction("com.huawei.bone.action_band_psi_activated");
        intentFilter.addAction("com.huawei.health.fitness_detail_sync_success");
        intentFilter.addAction("com.huawei.health.weight_detail_sync_success");
        BroadcastManagerUtil.c(context, broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
    }

    public static void f(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            LogUtil.a("HomeFragmentUtil", "unregisterWearBroadcast");
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HomeFragmentUtil", "unregisterWearBroadcast exception");
        } catch (RuntimeException unused2) {
            LogUtil.e("HomeFragmentUtil", "unregisterWearBroadcast exception");
        }
    }

    public static void e(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HomeFragmentUtil", "unregisterBatteryBroadcast exception");
        } catch (RuntimeException unused2) {
            LogUtil.e("HomeFragmentUtil", "unregisterBatteryBroadcast exception");
        }
    }

    public static void b(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HomeFragmentUtil", "unregisterUpgradeBroadcast");
        } catch (RuntimeException unused2) {
            LogUtil.e("HomeFragmentUtil", "unregisterUpgradeBroadcast");
        }
    }

    public static void e(Intent intent) {
        if (intent == null || !"com.huawei.bone.action.BATTERY_LEVEL".equals(intent.getAction()) || intent.getExtras() == null) {
            return;
        }
        int i = intent.getExtras().getInt("BATTERY_LEVEL");
        DeviceInfo deviceInfoJ = tfn.a().j();
        if (deviceInfoJ == null || deviceInfoJ.getDeviceConnectState() != 2) {
            return;
        }
        LogUtil.a("HomeFragmentUtil", "has connected device battery:", Integer.valueOf(i));
    }

    public static void c(Context context, final CommonUiBaseResponse commonUiBaseResponse) {
        HiHealthManager.d(context).fetchUserData(new HiCommonListener() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.6
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.d("HomeFragmentUtil", "fetchUserData onSuccess,data = ", obj);
                if (obj == null || !njy.b(obj, HiUserInfo.class)) {
                    return;
                }
                List list = (List) obj;
                if (list.size() > 0) {
                    LogUtil.a("HomeFragmentUtil", "fetchUserData onSuccess");
                    HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                    LogUtil.d("HomeFragmentUtil", "height==", Integer.valueOf(hiUserInfo.getHeight()), "weight==", Float.valueOf(hiUserInfo.getWeight()));
                    commonUiBaseResponse.onResponse(0, hiUserInfo);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.e("HomeFragmentUtil", "fetchUserData onFailure");
            }
        });
    }

    public static void e(Context context, Object obj) {
        if (obj instanceof HiUserInfo) {
            HiUserInfo hiUserInfo = (HiUserInfo) obj;
            HashMap map = new HashMap(16);
            map.put("id", LoginInit.getInstance(context).getUsetId());
            map.put("uid", String.valueOf(0));
            map.put(CommonConstant.KEY_GENDER, String.valueOf(hiUserInfo.getGender() == 2 ? 1 : hiUserInfo.getGender()));
            map.put("age", String.valueOf(dor.a(hiUserInfo.getBirthday(), hiUserInfo.getAge())));
            map.put("height", String.valueOf(hiUserInfo.getHeight()));
            map.put("isDelete", String.valueOf(0));
            map.put("currentWeight", String.valueOf(hiUserInfo.getWeight()));
            map.put("month", String.valueOf(dor.e(hiUserInfo.getBirthday())));
            ean.a(map, ece.f32732a, context);
            return;
        }
        LogUtil.j("HomeFragmentUtil", "wifiUserInfoAction objectData error");
    }

    public static void j(Context context) {
        LogUtil.a("HomeFragmentUtil", "onReceive WifiUnitBroadcast.");
        String strE = SharedPreferenceManager.e(context, String.valueOf(10000), "wifi_scale_unit_change");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("HomeFragmentUtil", "default unit");
            strE = "false";
        }
        String strValueOf = String.valueOf(UnitUtil.f());
        LogUtil.a("HomeFragmentUtil", "lastUnit = ", strE, "currentUnit = ", strValueOf);
        if (strE.equals(strValueOf)) {
            return;
        }
        SharedPreferenceManager.e(context, String.valueOf(10000), "wifi_scale_unit_change", strValueOf, null);
        ean.d(context);
    }

    public static class j implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<HomeFragment> f25147a;

        j(HomeFragment homeFragment) {
            this.f25147a = new WeakReference<>(homeFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            Handler handler;
            LogUtil.a("HomeFragmentUtil", "notifyWearSDKRefreshData, errCode=", Integer.valueOf(i));
            LogUtil.d("HomeFragmentUtil", "notifyWearSDKRefreshData, objData", obj);
            HomeFragment homeFragment = this.f25147a.get();
            if (homeFragment == null || (handler = homeFragment.h) == null) {
                return;
            }
            if (i != -1 && i != 1) {
                if (i != 5) {
                    return;
                }
                handler.removeMessages(1005);
                LogUtil.a("HomeFragmentUtil", "Pull Refresh Run Card by errCode=", Integer.valueOf(i));
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.what = 1005;
                handler.sendMessage(messageObtainMessage);
                return;
            }
            if (!homeFragment.b()) {
                LogUtil.j("HomeFragmentUtil", "InterfaceBaseResponseCallbackImpl card not initialized, return");
                return;
            }
            if (BaseApplication.isRunningForeground() || HomeFragment.d) {
                LogUtil.a("HomeFragmentUtil", "Refresh Cards by detail data, errCode=", Integer.valueOf(i));
                handler.removeMessages(1004);
                Message messageObtainMessage2 = handler.obtainMessage();
                messageObtainMessage2.what = 1004;
                handler.sendMessage(messageObtainMessage2);
            }
        }
    }

    public static void d(HealthTextView healthTextView, ImageView imageView, String str, Context context) {
        int i;
        String string;
        imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.pic_family_health, BaseApplication.getContext().getTheme()));
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i == 1) {
            string = context.getString(R.string.IDS_plugin_healthZone_dialog_second_message);
        } else if (i == 2) {
            string = context.getString(R.string.IDS_plugin_healthZone_dialog_third_message);
        } else {
            string = context.getString(R.string.IDS_plugin_healthZone_dialog_first_message);
        }
        healthTextView.setText(string);
    }

    public static void e(Context context, String str) {
        int i;
        SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "showFamilyHealthDialogTime", String.valueOf(System.currentTimeMillis()), null);
        if (TextUtils.isEmpty(str)) {
            SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "familyHealthDialogFrequency", "1", null);
            return;
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            LogUtil.e("HomeFragmentUtil", "updateFamilyHealthDialogTimeAndFrequency number format exception");
            i = 0;
        }
        SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "familyHealthDialogFrequency", String.valueOf(i + 1), null);
    }

    public static void h(Context context) {
        LogUtil.a("HomeFragmentUtil", "outsideOpenActivityOrAddDevice the device is not leo");
        Intent intent = new Intent(context, (Class<?>) OneKeyScanActivity.class);
        intent.setAction("com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("HomeFragmentUtil", "ActivityNotFoundException", e2.getMessage());
        }
        LogUtil.e("HomeFragmentUtil", "cheange istoEsimOrWallet false");
    }

    public static boolean e() {
        LogUtil.a("HomeFragmentUtil", "outsideOpenActivityOrAddDevice enter");
        String strC = new GuideInteractors(BaseApplication.getContext()).c();
        LogUtil.a("HomeFragmentUtil", "outsideOpenActivityOrAddDevice openSim:", strC);
        return !TextUtils.isEmpty(strC);
    }

    public static void d(final Context context, final GuideInteractors guideInteractors, final String str, final boolean z) {
        final DeviceInfo deviceInfoJ = tfn.a().j();
        DeviceCapability deviceCapabilityD = DeviceSettingsInteractors.e(context).d();
        if (deviceCapabilityD != null) {
            LogUtil.a("HomeFragmentUtil", "outsideOpenActivity isSuppport ESim: ", Boolean.valueOf(deviceCapabilityD.isSupportEsim()));
            LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0) {
                        if (z) {
                            HomeFragmentUtil.c(str, deviceInfoJ.getDeviceIdentify(), context);
                        }
                        guideInteractors.a((String) null);
                        return;
                    }
                    LogUtil.j("HomeFragmentUtil", "browsingToLogin errorCode is not success", Integer.valueOf(i));
                }
            }, "");
        } else {
            LogUtil.e("HomeFragmentUtil", "outsideOpenActivity null ==mDeviceCapability ");
        }
    }

    public static void c(String str, String str2, Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, str);
        if ("com.huawei.sim.multisim.MultiSimAuth".equals(str)) {
            intent.setAction("com.huawei.sim.multisim.MultiSimAuth");
            LogUtil.a("HomeFragmentUtil", "gotoEsim:", intent.getAction());
        }
        LogUtil.a("HomeFragmentUtil", "gotoActivity:", str);
        if (ComponentInfo.PluginPay_A_31.equals(str)) {
            tqp.d(context, str2);
            return;
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("HomeFragmentUtil", "ActivityNotFoundException", e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public static boolean b(boolean z, String str, DeviceCapability deviceCapability) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 262455616) {
            if (iHashCode != 288622784) {
                if (iHashCode == 1426352741 && str.equals("com.huawei.sim.multisim.MultiSimAuth")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(ComponentInfo.PluginPay_A_31)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("com.huawei.sim.esim.view.WirelessManagerActivity")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    return false;
                }
                if (deviceCapability.isSupportMultiSim()) {
                    return true;
                }
            } else if (deviceCapability.isSupportPay() || deviceCapability.isSupportWalletOpenCard()) {
                return true;
            }
        } else if (deviceCapability.isSupportEsim()) {
            return true;
        }
        return z;
    }

    public static boolean d(int i) {
        boolean z = i == 3 || i == 10;
        LogUtil.d("HomeFragmentUtil", "Enter isWatch type:", Integer.valueOf(i), " isWatch:", Boolean.valueOf(z));
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Context context, Intent intent, LinearLayout linearLayout, HealthTextView healthTextView, sho shoVar, tcw tcwVar, View view) {
        ThreeCircleCardData threeCircleCardDataA;
        LogUtil.a("HomeFragmentUtil", "SyncCloudDataReceiver onReceive to enter, action = ", intent.getAction());
        String stringExtra = intent.getStringExtra("sync_cloud_data_status");
        double doubleExtra = intent.getDoubleExtra("sync_cloud_data_process", 0.0d);
        if ("start_sync_cloud_data".equals(stringExtra) || "ongoing_sync_cloud_data".equals(stringExtra)) {
            ((StepsViewModel) new ViewModelProvider((ViewModelStoreOwner) context).get(StepsViewModel.class)).d(true);
            linearLayout.setVisibility(0);
            healthTextView.setText(UnitUtil.e(doubleExtra, 2, 0));
            if (shoVar != null) {
                shoVar.c();
            }
            SharedPreferenceManager.c(Integer.toString(10000), "last_cold_start_sync_time", System.currentTimeMillis());
            return;
        }
        if ("sync_cloud_data_finish".equals(stringExtra) || "sync_cloud_data_fail".equals(stringExtra)) {
            linearLayout.setVisibility(8);
            ((StepsViewModel) new ViewModelProvider((ViewModelStoreOwner) context).get(StepsViewModel.class)).d(false);
            if (tcwVar != null && (threeCircleCardDataA = tcwVar.a()) != null) {
                threeCircleCardDataA.c();
            }
            a(context, new int[]{258, 264});
            return;
        }
        if ("sync_cloud_data_setting_flag".equals(stringExtra)) {
            linearLayout.setVisibility(8);
            tfk.c(false);
            SharedPreferenceManager.e(context, Integer.toString(10000), "sync_cloud_data_show_process_flag", "false", null);
        } else if ("sync_cloud_data_backstage".equals(stringExtra)) {
            linearLayout.setVisibility(8);
            tfk.c(false);
        } else {
            LogUtil.a("HomeFragmentUtil", "SyncCloudDataReceiver onReceive is other status");
        }
    }

    public static class d implements RecommendCloudCallBack {
        @Override // com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudCallBack
        public void onResponce(String str, int i) {
            LogUtil.a("HomeFragmentUtil", "RecommendCloud doRefreshBatch ", str, " resCode = ", Integer.valueOf(i));
            if (RecommendConstants.HEALTH_SLEEP_RECOMMEND.equals(str)) {
                if (i == 0) {
                    SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), RecommendConstants.SERVICE_RECOMMEND_FILE, "1", new StorageParams());
                } else {
                    SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), RecommendConstants.SERVICE_RECOMMEND_FILE, "0", new StorageParams());
                }
            }
        }
    }

    public static MessageObject d(String str, String str2, String str3) {
        MessageObject messageObject = new MessageObject();
        messageObject.setFlag(0);
        messageObject.setExpireTime(lsl.d(System.currentTimeMillis(), 1));
        messageObject.setPosition(2);
        messageObject.setNotified(0);
        messageObject.setCreateTime(System.currentTimeMillis());
        messageObject.setMsgId("9145");
        messageObject.setModule("WIFI_NOTIFICATION_MODULE_AUTH");
        messageObject.setMsgContent(str);
        messageObject.setDetailUri(str2);
        messageObject.setMsgTitle(str3);
        messageObject.setWeight(1);
        return messageObject;
    }

    public static void c(MarketingApi marketingApi, MarketingOption.Builder builder) {
        builder.setTypeId(51);
        marketingApi.triggerMarketingResourceEvent(builder.build());
        builder.setTypeId(52);
        marketingApi.triggerMarketingResourceEvent(builder.build());
    }

    public static class c extends BaseHandler<HomeFragment> {
        c(HomeFragment homeFragment) {
            super(homeFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(HomeFragment homeFragment, Message message) {
            int i = message.what;
            if (i == 6) {
                LogUtil.a("HomeFragmentUtil", "MSG_CHECK_USER_LEVEL");
                return;
            }
            if (i == 9) {
                LogUtil.a("HomeFragmentUtil", "MSG_CHECK_HUAWEI_WEAR_DEVICE_STATUS");
                if (CommonUtil.ck()) {
                    tfp.e().d();
                    return;
                }
                return;
            }
            if (i == 42) {
                Object obj = message.obj;
                if (obj instanceof InputBoxTemplate) {
                    homeFragment.i = (InputBoxTemplate) obj;
                    return;
                }
                return;
            }
            if (i == 234) {
                if (homeFragment.getUserVisibleHint()) {
                    LogUtil.a("HomeFragmentUtil", "MSG_CHECK_SET_MARKETING_RESOURCE");
                    homeFragment.e();
                    return;
                }
                return;
            }
            if (i == 10007) {
                e(homeFragment);
                return;
            }
            if (i == 103) {
                LogUtil.a("HomeFragmentUtil", "show todo list");
                homeFragment.f25110a.f();
                return;
            }
            if (i == 104) {
                LogUtil.a("HomeFragmentUtil", "SEND_NOTIFY_STEP_BROADCAST");
                ObserverManagerUtil.e("NOTIFY_STEP_CARD_CHANGED", String.valueOf(message.obj));
                return;
            }
            if (i == 1004) {
                if (!hasMessages(1006)) {
                    ReleaseLogUtil.c("Dfx_HomeFragmentUtil", "CHECK_DUPLICATE_CARD_RESUME");
                    sendMessageDelayed(obtainMessage(1006), 120000L);
                    a(homeFragment);
                    return;
                }
                LogUtil.a("HomeFragmentUtil", "card data refresh not finished");
                return;
            }
            if (i != 1005) {
                return;
            }
            LogUtil.a("HomeFragmentUtil", "Pull Refresh Run Card");
            swi.c(2);
            homeFragment.d();
            swi.c(4);
            homeFragment.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(HomeFragment homeFragment) {
            if (HomeFragment.d) {
                LogUtil.a("HomeFragmentUtil", "sHasPullRefresh");
                HomeFragment.d = false;
                b(homeFragment);
                d(homeFragment);
                LogUtil.a("HomeFragmentUtil", "delay 2s send message");
                h(homeFragment);
            }
        }

        private void h(HomeFragment homeFragment) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.c.2
                @Override // java.lang.Runnable
                public void run() {
                    String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME");
                    LogUtil.a("HomeFragmentUtil", "dialog status", strE);
                    if (NpsConstantValue.QUERY_SYSTEM_BUSY.equals(strE)) {
                        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME", JsInteractAddition.BI_ERROR_CODE_INVALID_AT, null);
                        LogUtil.a("HomeFragmentUtil", "dialog  build status", SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME"));
                        c.this.sendEmptyMessageDelayed(10007, 2000L);
                    }
                }
            });
        }

        private void b(final HomeFragment homeFragment) {
            if (homeFragment.f == null) {
                return;
            }
            if (homeFragment.c()) {
                HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.c.3
                    @Override // java.lang.Runnable
                    public void run() {
                        LogUtil.a("HomeFragmentUtil", "isRecycleViewDraggingOrComputing");
                        HomeFragment homeFragment2 = homeFragment;
                        if (homeFragment2 == null || homeFragment2.f == null) {
                            return;
                        }
                        homeFragment.f.a();
                    }
                }, 100L);
            } else {
                homeFragment.f.a();
            }
        }

        private void e(HomeFragment homeFragment) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "KEY_CONNECTION_TO_WEAR");
            LogUtil.a("HomeFragmentUtil", "app and device", strE);
            if (CommonUtil.bg()) {
                return;
            }
            LogUtil.a("HomeFragmentUtil", "this phone is not huawei");
            if (CommonUtil.d(homeFragment.f25112c, "com.huawei.bone") && "1".equals(strE)) {
                LogUtil.a("HomeFragmentUtil", "app and device is not connect");
                HomeFragment.ah(homeFragment);
            }
        }

        private void a(final HomeFragment homeFragment) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.c.4
                @Override // java.lang.Runnable
                public void run() {
                    ReleaseLogUtil.c("Dfx_HomeFragmentUtil", "Pull Refresh Cards");
                    c.this.c(homeFragment);
                    swi.c(-1);
                    homeFragment.d();
                    if (homeFragment.h != null) {
                        homeFragment.h.removeMessages(1006);
                    }
                }
            }, 200L);
        }

        private void d(HomeFragment homeFragment) {
            if (Utils.o()) {
                if (Utils.h()) {
                    HomeFragmentUtil.d(homeFragment.f25112c);
                }
                rhe.b(homeFragment.f25112c);
                return;
            }
            HomeFragmentUtil.d(homeFragment.f25112c);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bundle f25145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f25146c;
        private String d;
        private String e;

        e(Bundle bundle, Context context, String str, String str2, String str3) {
            this.f25145b = bundle;
            this.f25146c = context;
            this.e = str;
            this.d = str2;
            this.f25144a = str3;
        }

        e(Context context, String str, String str2, String str3) {
            this.f25146c = context;
            this.e = str;
            this.d = str2;
            this.f25144a = str3;
        }

        public String c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public String b() {
            return this.f25144a;
        }

        public e a() {
            Bundle bundle = this.f25145b;
            if (bundle != null) {
                String string = bundle.getString("deviceId");
                String string2 = this.f25145b.getString("pushContent");
                if (!TextUtils.isEmpty(string)) {
                    this.e = this.f25146c.getString(R.string.IDS_device_wifi_subuser_auth_success_push_msg, string2);
                    this.d = "messagecenter://wifi_device?deviceId=" + string;
                    this.f25144a = this.f25146c.getString(R.string.IDS_messagecenter_device_scale);
                    return this;
                }
                LogUtil.e("HomeFragmentUtil", "wifiMultiUserNotify productid is null");
            }
            return this;
        }

        public e e() {
            this.e = this.f25146c.getString(R.string.IDS_device_wifi_release_auth_msg);
            this.d = "messagecenter://wifi_device_auth_release";
            this.f25144a = this.f25146c.getString(R.string.IDS_wifi_device_mult_user_release_auth_notifi_title);
            return this;
        }
    }

    public static class b implements EventBus.ICallback {
        private WeakReference<Context> d;

        b(Context context) {
            this.d = new WeakReference<>(context);
        }

        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            WeakReference<Context> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.e("HomeFragmentUtil", "mContext is null");
                return;
            }
            if (dVar.c() != null && "evebus_weight_measure_notification".equals(dVar.e())) {
                c(dVar);
            } else if ("multi_user_auto_cancle_dialog".equals(dVar.e())) {
                d(dVar.b());
            }
        }

        private void c(EventBus.d dVar) {
            boolean z = BaseApplication.getContext().getSharedPreferences(Integer.toString(10000), 0).getBoolean(MessageConstant.KEY_PUSH_CONFLICT_FLAG, false);
            boolean booleanExtra = dVar.c().getBooleanExtra("isDelUser", false);
            LogUtil.a("HomeFragmentUtil", "EventBusCallback isDelUser:", Boolean.valueOf(booleanExtra), " isConflict:", Boolean.valueOf(z), " Size:", Integer.valueOf(ClaimWeightDataManager.INSTANCE.getClaimDataCatch().size()));
            if (ClaimWeightDataManager.INSTANCE.getClaimDataCatch().size() == 0) {
                LogUtil.e("HomeFragmentUtil", "Size == 0");
                return;
            }
            if ((!z || booleanExtra) && (!booleanExtra || z)) {
                return;
            }
            LogUtil.a("HomeFragmentUtil", "EventBusCallback cancle Notification");
            ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).cancelNotification(CommonUtil.n(this.d.get(), "111"));
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0088  */
        /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
        public void d(Bundle bundle) {
            String str;
            String strC;
            String strD;
            WeakReference<Context> weakReference = this.d;
            if (weakReference == null) {
                LogUtil.e("HomeFragmentUtil", "wifiMultiUserNotify mContext is null");
                return;
            }
            Context context = weakReference.get();
            if (context == null) {
                LogUtil.e("HomeFragmentUtil", "wifiMultiUserNotify context is null");
                return;
            }
            if (bundle != null) {
                String string = bundle.getString("pushType");
                if (!TextUtils.isEmpty(string)) {
                    String strB = "";
                    String str2 = null;
                    if ("release_auth".equals(string)) {
                        e eVarE = new e(context, null, null, "").e();
                        strC = eVarE.c();
                        strD = eVarE.d();
                        strB = eVarE.b();
                    } else {
                        if ("auth_success".equals(string)) {
                            e eVarA = new e(bundle, context, null, null, "").a();
                            strC = eVarA.c();
                            strD = eVarA.d();
                            strB = eVarA.b();
                        } else {
                            LogUtil.e("HomeFragmentUtil", "wifiMultiUserNotify pushType is error ", string);
                            str = null;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        d(str, str2, strB);
                        return;
                    }
                    str = strC;
                    str2 = strD;
                    if (TextUtils.isEmpty(str2)) {
                        d(str, str2, strB);
                        return;
                    }
                    return;
                }
                LogUtil.e("HomeFragmentUtil", "wifiMultiUserNotify msg is null");
                return;
            }
            LogUtil.e("HomeFragmentUtil", "wifiMultiUserNotify bundle is null");
        }

        private void d(String str, String str2, String str3) {
            LogUtil.a("HomeFragmentUtil", "showAuthNotify detailUri", str2);
            MessageObject messageObjectD = HomeFragmentUtil.d(str, str2, str3);
            MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
            LogUtil.a("HomeFragmentUtil", "start data notification");
            messageCenterApi.showNotification(this.d.get(), messageObjectD);
            messageCenterApi.insertMessage(messageObjectD);
        }
    }

    public static class a implements DownloadUtil.DownloadListener {
        @Override // com.huawei.indoorequip.util.DownloadUtil.DownloadListener
        public void onDownloadFinish(boolean z) {
            LogUtil.a("HomeFragmentUtil", "down is Succeed", Boolean.valueOf(z));
        }
    }

    public static class InnerAw70BroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("HomeFragmentUtil", "before onReceive AW70SyncFinshBrodcast");
            if (intent == null || !"com.huawei.health.action.AW70_FITNESS_DETAIL_SYNC_SUCCESS_ACTION".equals(intent.getAction())) {
                return;
            }
            LogUtil.a("HomeFragmentUtil", "onReceive AW70SyncFinshBrodcast");
        }
    }

    public static void d(DeviceCapability deviceCapability, Context context) {
        if (deviceCapability != null) {
            LogUtil.a("HomeFragmentUtil", "isSupportAtmosphere : ", Boolean.valueOf(deviceCapability.isSupportAtmosphere()));
            if (!deviceCapability.isSupportAtmosphere()) {
                LogUtil.a("HomeFragmentUtil", "This device do not support 5.15.3");
                return;
            } else {
                DeviceSettingsInteractors.e(context).b();
                return;
            }
        }
        LogUtil.a("HomeFragmentUtil", "pushLocalPressInfo can not get mDeviceCapability.");
    }

    public static void b(DeviceCapability deviceCapability, final Context context) {
        if (deviceCapability == null || !deviceCapability.isWeatherPush()) {
            LogUtil.j("HomeFragmentUtil", "pushWeatherData can not get mDeviceCapability.");
        } else {
            LogUtil.a("HomeFragmentUtil", "isSupportWeatherPush : ", Boolean.valueOf(deviceCapability.isWeatherPush()));
            mhs.a().getSwitchSetting("weather_switch_status", new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.9
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HomeFragmentUtil", "pushWeatherInfo errorCode = ", Integer.valueOf(i));
                    boolean z = (i == 0 && (obj instanceof String) && "false".equals((String) obj)) ? false : true;
                    LogUtil.a("HomeFragmentUtil", "WEATHER_SWITCH_STATUS isWeatherSwitchOpen = ", Boolean.valueOf(z));
                    if (z) {
                        DeviceSettingsInteractors.e(context).a();
                    }
                }
            });
        }
    }

    public static void c(Context context) {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.triggerMarketingResourceEvent(new MarketingOption.Builder().setContext(context).setPageId(18).setTypeId(2).build());
        }
    }

    public static boolean e(Context context) {
        if (context == null) {
            LogUtil.e("HomeFragmentUtil", "setInitMarketing context is null");
            return false;
        }
        qkz.e(fwx.f34658b);
        qkz.a(3001);
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            return false;
        }
        LogUtil.a("HomeFragmentUtil", "setInitMarketing");
        MarketingOption.Builder builder = new MarketingOption.Builder();
        builder.setContext(context);
        builder.setPageId(18);
        marketingApi.requestMarketingResource(builder.build());
        HashMap map = new HashMap();
        map.put("open_specific_page", "Health");
        builder.setTypeId(49);
        builder.setTriggerEventParams(map);
        marketingApi.triggerMarketingResourceEvent(builder.build());
        b(marketingApi, builder);
        return true;
    }

    public static void b(MarketingApi marketingApi, MarketingOption.Builder builder) {
        c(marketingApi, builder);
    }

    public static void b(Context context) {
        if (context == null) {
            LogUtil.e("HomeFragmentUtil", "initHiHealth error: context is null");
            return;
        }
        final SharedPreferences sharedPreferences = context.getSharedPreferences("HiHealth_UUID", 0);
        if (sharedPreferences.getString("PHONE_UUID", null) != null) {
            return;
        }
        HiHealthManager.d(context).fetchPhoneDataClient(new HiDataClientListener() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.7
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public void onResult(List<HiHealthClient> list) {
                if (njy.e(list)) {
                    return;
                }
                sharedPreferences.edit().putString("PHONE_UUID", list.get(0).getDeviceUuid()).commit();
            }
        });
    }

    public static void f(Context context) {
        if (swi.d() == -2) {
            swi.c(CardFlowInteractors.d(context, "HomeCardRefreshIndex", -2));
            CardFlowInteractors.b(context, "HomeCardRefreshIndex", -2);
        }
    }

    public static void a(Context context) {
        swi.c(-2);
        CardFlowInteractors.b(context, "HomeCardRefreshIndex", -2);
    }

    public static void c(final HomeFragment homeFragment) {
        if (homeFragment == null) {
            LogUtil.j("HomeFragmentUtil", "showSecurityManagerSettingSwitchDialog fragment is null");
        } else {
            GRSManager.c(BaseApplication.getContext()).d("domainHealthVmall", new GrsQueryCallback() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.11
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(final String str) {
                    homeFragment.h.post(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.11.3
                        @Override // java.lang.Runnable
                        public void run() {
                            HomeFragmentUtil.b(str, homeFragment);
                        }
                    });
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    LogUtil.j("HomeFragmentUtil", "showSecurityManagerSettingSwitchDialog onCallBackFail");
                }
            });
        }
    }

    public static void b(String str, HomeFragment homeFragment) {
        if (TextUtils.isEmpty(str) || homeFragment == null) {
            LogUtil.j("HomeFragmentUtil", "showSecurityManagerSettingSwitchDialogOnMainThread url or homeFragment is null");
            return;
        }
        SecurityManagerSettingSwitchDialog.Builder builder = new SecurityManagerSettingSwitchDialog.Builder(homeFragment.f25112c);
        builder.a(str);
        builder.a().show();
    }

    public static void c(CustomTitleBar customTitleBar, Context context) {
        customTitleBar.setLeftButtonVisibility(8);
        customTitleBar.setTitleText(context.getString(R.string.IDS_hw_show_main_home_page_health));
        if (qqv.a(context)) {
            customTitleBar.setTitleSize(context.getResources().getDimension(R.dimen.emui_master_title_2));
        } else {
            customTitleBar.setTitleSize(context.getResources().getDimension(R.dimen.textSizeHeadline8));
        }
        if (qrs.ac()) {
            customTitleBar.setTitleSize(context.getResources().getDimension(R.dimen.health_common_42dp));
        }
        customTitleBar.setTitleBarBackgroundColor(context.getResources().getColor(R.color.colorSubBackground));
        customTitleBar.setTitleTextColor(context.getResources().getColor(R.color.textColorPrimary));
        customTitleBar.setRightButtonVisibility(0);
        customTitleBar.setRightButtonDrawable(context.getResources().getDrawable(R.drawable.ic_appbar_more), qre.f(R.string.accessibility_more_item));
    }

    public static void d(Context context, BroadcastReceiver broadcastReceiver) {
        LogUtil.a("HomeFragmentUtil", "enter registerBattery");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.BATTERY_LEVEL");
        intentFilter.addAction("com.huawei.bone.action.BATTERY_LEVEL");
        if (context == null) {
            LogUtil.a("HomeFragmentUtil", "registerBattery mContext is null.Activity is finished");
        } else {
            BroadcastManagerUtil.c(context, broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
        }
    }

    public static void h(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HomeFragmentUtil", "unregisterWifiUserInfoBroadcast exception");
        } catch (RuntimeException unused2) {
            LogUtil.e("HomeFragmentUtil", "unregisterWifiUserInfoBroadcast exception");
        }
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        LogUtil.a("HomeFragmentUtil", "enter unregisterAw70SyncFinishBroadcast");
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HomeFragmentUtil", "unregisterAw70SyncFinishBroadcast ");
        } catch (RuntimeException unused2) {
            LogUtil.e("HomeFragmentUtil", "unregisterAw70SyncFinishBroadcast ");
        }
    }

    public static void a(Context context, CommonUiBaseResponse commonUiBaseResponse) {
        c(context, commonUiBaseResponse);
    }

    public static CustomViewDialog.Builder a(View view, final Context context, final Context context2) {
        return new CustomViewDialog.Builder(context).b(false).d(view).d(R.string.IDS_home_health_in_watch, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                LogUtil.a("HomeFragmentUtil", "show family healty dialog click");
                HashMap map = new HashMap(1);
                map.put("click", 2);
                lmf.d().c(context, AnalyticsValue.HEALTH_FAMILY_ZONE_2040078.value(), map, 0);
                ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).gotoFamilyHealth(context2, nio.a("sIsFirstHealth"));
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
            }
        });
    }

    public static void c(FragmentActivity fragmentActivity, Intent intent, int i, final Context context) {
        if (i == 0) {
            a(context, new CommonUiBaseResponse() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.14
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i2, Object obj) {
                    HomeFragmentUtil.e(context, obj);
                }
            });
            return;
        }
        if (i == 1) {
            j(context);
        } else if (i == 2) {
            eas.b().a(fragmentActivity, intent.getExtras());
        } else {
            LogUtil.e("HomeFragmentUtil", "type is error.");
        }
    }

    public static void d(final Context context, final PermissionsResultAction permissionsResultAction) {
        LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    PermissionUtil.d(context, PermissionUtil.PermissionType.CAMERA, permissionsResultAction);
                }
            }
        }, "");
    }

    public static void a(final Context context, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HomeFragmentUtil", "deviceInfo is null.");
            return;
        }
        final PayApi payApi = (PayApi) Services.b("TradeService", PayApi.class);
        final DeviceBenefitQueryParam deviceBenefitQueryParamD = qhu.d(deviceInfo, DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL, true);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.2
            @Override // java.lang.Runnable
            public void run() {
                if (!TextUtils.isEmpty(SharedPreferenceManager.e(context, Integer.toString(10000), "DEVICE_BIND_INBOX_KEY"))) {
                    LogUtil.a("HomeFragmentUtil", "device benefit is triggered.");
                } else {
                    payApi.activateDeviceBenefitPage(deviceBenefitQueryParamD);
                }
            }
        });
    }

    public static void d(Context context, Handler handler, AchievementCardData achievementCardData) {
        if (CommonUtil.ck()) {
            handler.removeMessages(9);
            handler.sendEmptyMessageDelayed(9, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            achievementCardData.e();
        }
    }

    public static void a(Context context, FragmentActivity fragmentActivity, DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(context).e(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityE == null || !deviceCapabilityE.isSupportSosTransmission()) {
            return;
        }
        LogUtil.a("HomeFragmentUtil", "showEmergencyContactChangeDialog capability is support");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "emergency_info", "false", null);
        if (fragmentActivity == null || fragmentActivity.isFinishing()) {
            return;
        }
        imx.d(context);
    }

    public static void b(Handler handler) {
        handler.postDelayed(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.4
            @Override // java.lang.Runnable
            public void run() {
                if (!tge.e()) {
                    LogUtil.a("HomeFragmentUtil", "scrollToSmartDeviceCard return WearHomeActivity.isFromWearDetail():", Boolean.valueOf(tge.e()));
                } else {
                    tge.c(false);
                }
            }
        }, 10L);
    }

    public static void c(Intent intent, Context context, boolean z) {
        if (Utils.o() || intent == null) {
            return;
        }
        if (z) {
            LogUtil.a("HomeFragmentUtil", "managerWeightNps isWearDeviceBind true, return!");
            return;
        }
        if (!HagridNpsManager.getInstance().isBindWifiDevice()) {
            LogUtil.a("HomeFragmentUtil", "managerWeightNps isBindHagridDevice false");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            LogUtil.a("HomeFragmentUtil", "setWeightNps bundle is null");
            return;
        }
        rcz.c().b(extras);
        DeviceWebNpsUtil.saveRecentConnectWeightDevice(extras.getString(MatterDataContans.KEY_MAC_ADDRESS));
        boolean zCurDeviceIsSupportWebNps = DeviceWebNpsUtil.curDeviceIsSupportWebNps(extras.getString("deviceModel"));
        LogUtil.a("HomeFragmentUtil", "setWeightNps isSupportWebNps:", Boolean.valueOf(zCurDeviceIsSupportWebNps));
        if (!zCurDeviceIsSupportWebNps) {
            tfn.a().c(context);
        } else {
            DeviceWebNpsUtil.getWebSurvey(BaseApplication.getActivity(), new WeightDeviceParamProvider(extras.getString("deviceVersion"), extras.getString(HealthEngineRequestManager.PARAMS_DEVICE_SN), extras.getString(MatterDataContans.KEY_MAC_ADDRESS), extras.getString("deviceModel")), extras.getString(MatterDataContans.KEY_MAC_ADDRESS));
        }
    }

    public static void c(Context context, AchievementCardData achievementCardData, sho shoVar, tcw tcwVar, FunctionSetCardData functionSetCardData, FunctionMenuCardData functionMenuCardData, OperationCardData operationCardData, OperaMsgCardData operaMsgCardData, boolean z, HealthInsightsCardData healthInsightsCardData, HealthHeadLinesCardData healthHeadLinesCardData, HomeCardAdapter homeCardAdapter) {
        e(achievementCardData);
        e(shoVar);
        e(tcwVar);
        e(functionSetCardData);
        e(operationCardData);
        e(operaMsgCardData);
        if (fua.o()) {
            e(functionMenuCardData);
        }
        if (!z) {
            e(healthHeadLinesCardData);
        }
        if (fua.k() && healthInsightsCardData != null) {
            e(healthInsightsCardData);
        }
        if (homeCardAdapter != null) {
            homeCardAdapter.a();
        }
    }

    public static String a() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "UIHLH_HomeFragment");
        if (deviceInfo != null) {
            return deviceInfo.getDeviceIdentify();
        }
        return "";
    }

    public static boolean d(int i, int i2, int i3) {
        if ((d(i2) && d(i3)) || i2 == i3 || i3 == -1 || i == 2) {
            return false;
        }
        LogUtil.a("HomeFragmentUtil", "get a connect change report,but it is not belong to current device,so return");
        return true;
    }

    public static void a(Handler handler) {
        LogUtil.a("HomeFragmentUtil", "PullRefresh start");
        try {
            HealthSyncUtil.b(SyncApi.FITNESS);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HomeFragmentUtil", "FitnessAdvice syncData failed");
        }
        try {
            HealthSyncUtil.b(SyncApi.HEALTH_LIFE);
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("HomeFragmentUtil", "HealthLifeModel syncData failed");
        }
        if (ezi.d()) {
            ezi.c(handler, 4036);
        }
    }

    public static void d(Observer observer) {
        try {
            ObserverManagerUtil.d(observer, "ALLOW_VISIBLE_HINT_LOAD");
        } catch (IllegalArgumentException | IllegalStateException unused) {
            LogUtil.e("HomeFragmentUtil", "registerAllowVisibleHintObserver exception");
        }
    }

    public static void a(Observer observer) {
        try {
            ObserverManagerUtil.a(observer, "ALLOW_VISIBLE_HINT_LOAD");
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HomeFragmentUtil", "unregisterAllowVisibleHintLoadObserver IllegalArgumentException");
        }
    }

    public static void g(final Context context) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.5
            @Override // java.lang.Runnable
            public void run() {
                drl.a(context).c();
            }
        });
    }

    public static void d(Context context, String str) {
        lmf.d().c(context, AnalyticsValue.HEALTH_FAMILY_ZONE_2040079.value(), new HashMap(), 0);
        LogUtil.a("HomeFragmentUtil", "Family health Dialog show showFamilyHealthDialogFrequency", str);
    }

    public static void a(Context context, int[] iArr) {
        long jC = lsl.c(System.currentTimeMillis(), -6);
        long jA = lsl.a(System.currentTimeMillis(), 23, 59);
        LogUtil.a("HomeFragmentUtil", "queryAssociateSportEvents startTime:", Long.valueOf(jC), "  endTime:", Long.valueOf(jA));
        final SportEventAssociator sportEventAssociator = new SportEventAssociator(context);
        sportEventAssociator.e("marathon_race", jC, jA, iArr, new SportEventAssociator.AssociationCallback() { // from class: com.huawei.ui.homehealth.HomeFragmentUtil.8
            @Override // com.huawei.health.plan.association.SportEventAssociator.AssociationCallback
            public void onSuccess(List<SportEventAssociator.c> list) {
                if (njy.e(list)) {
                    return;
                }
                LogUtil.a("HomeFragmentUtil", "queryAssociateSportEvents results size=", Integer.valueOf(list.size()));
                sportEventAssociator.d(HwExerciseConstants.MATCHED_COMPETITION, list);
            }
        });
    }
}
