package com.huawei.ui.homehealth.achievementcard;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.bean.WatchFaceListBean;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.device.activity.notification.NotificationSettingActivity;
import com.huawei.ui.device.activity.update.BandUpdateDialogActivity;
import com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.R;
import defpackage.dmp;
import defpackage.drw;
import defpackage.dxw;
import defpackage.eby;
import defpackage.ecu;
import defpackage.eel;
import defpackage.lmf;
import defpackage.lvi;
import defpackage.lzi;
import defpackage.lzl;
import defpackage.maq;
import defpackage.mgg;
import defpackage.mgi;
import defpackage.mhs;
import defpackage.mio;
import defpackage.mjh;
import defpackage.niz;
import defpackage.nty;
import defpackage.nvd;
import defpackage.qqf;
import defpackage.rcz;
import defpackage.tfn;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class AchievementCardData extends EmptyAchievementCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f25153a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f25154c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AchievementCardViewHolder f25155b;
    private final BroadcastReceiver d;
    private String e;
    private String f;
    private ExecutorService g;
    private final BroadcastReceiver h;
    private Context i;
    private Handler j;
    private String k;
    private boolean l;
    private boolean m;
    private String n;
    private boolean o;
    private CustomTextAlertDialog p;
    private String q;
    private int r;
    private final BroadcastReceiver s;
    private final BroadcastReceiver t;

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent) {
        String stringExtra = intent.getStringExtra("uniqueId");
        String stringExtra2 = intent.getStringExtra("productId");
        MeasurableDevice measurableDeviceB = dmp.d().b(stringExtra, false);
        if (measurableDeviceB == null) {
            LogUtil.e("UIHLH_AchievementCardData", "switchToSubUserWifiPage, no bond device");
        } else if (measurableDeviceB instanceof eby) {
            if (((eby) measurableDeviceB).a().m() != 1) {
                LogUtil.b("UIHLH_AchievementCardData", "is WiFiDevice but not main user.");
                return;
            }
        } else if (TextUtils.isEmpty(stringExtra2) || !"8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4".equals(stringExtra2)) {
            LogUtil.e("UIHLH_AchievementCardData", "device not instanceof WiFiDevice");
        } else {
            LogUtil.b("UIHLH_AchievementCardData", "hagrid device unconfigured network");
            return;
        }
        rcz.c().d(intent.getStringExtra("uniqueId"));
        d(intent);
    }

    public AchievementCardData(Context context) {
        super(context);
        this.q = "";
        this.e = "";
        this.r = 0;
        this.k = "";
        this.m = false;
        this.f = "";
        this.l = false;
        this.o = false;
        this.n = null;
        this.p = null;
        this.s = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                LogUtil.b("UIHLH_AchievementCardData", "receive notify Bi broadcast");
                if (intent == null) {
                    LogUtil.e("UIHLH_AchievementCardData", "mNotifyBiReportReceiver intent is null");
                    return;
                }
                String action = intent.getAction();
                LogUtil.b("UIHLH_AchievementCardData", "mNotifyBiReportReceiver(): intent: ", action);
                if ("com.huawei.health.nitification_service_bi_change".equals(action)) {
                    int intExtra = intent.getIntExtra("BIStatus", -1);
                    if (intExtra == -1) {
                        LogUtil.e("UIHLH_AchievementCardData", "BIStatus is -1");
                        return;
                    }
                    String str = Build.BRAND;
                    HashMap map = new HashMap(16);
                    map.put("brand", str);
                    map.put("code", Integer.valueOf(intExtra));
                    lmf.d().c(AchievementCardData.this.mContext, AnalyticsValue.NOTIFY_SERVICE_ENABLE_1090027.value(), map, 0);
                }
            }
        };
        this.t = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.7
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                LogUtil.b("UIHLH_AchievementCardData", "receive weather BI broadcast");
                if (intent == null) {
                    LogUtil.e("UIHLH_AchievementCardData", "mWeatherBiReportReceiver onReceive intent is null");
                    return;
                }
                if (intent.getAction() == null || !intent.getAction().equals("com.huawei.health.action.ACTION_HWWEATHER_BI_CHANGE")) {
                    return;
                }
                LogUtil.b("UIHLH_AchievementCardData", "mWeatherBiReportReceiver() intent: ", intent.getAction());
                int intExtra = intent.getIntExtra("BIStatus", 0);
                if (intExtra != 0) {
                    AchievementCardData.this.c(intExtra);
                } else {
                    LogUtil.e("UIHLH_AchievementCardData", "status is 0");
                }
            }
        };
        this.h = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.6
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Handler handler = AchievementCardData.this.j;
                if (intent == null || handler == null) {
                    LogUtil.e("UIHLH_AchievementCardData", "mDeviceStatusReceiver onReceive param is null");
                    return;
                }
                LogUtil.b("UIHLH_AchievementCardData", "Achievement device broadcast intent: ", intent.getAction());
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    try {
                        Message messageObtainMessage = handler.obtainMessage();
                        if (!(intent.getParcelableExtra("deviceinfo") instanceof DeviceInfo)) {
                            LogUtil.e("UIHLH_AchievementCardData", "ParcelableExtra Data is not DeviceInfo");
                            return;
                        }
                        DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                        if (deviceInfo == null) {
                            LogUtil.e("UIHLH_AchievementCardData", "deviceInfo is null");
                            return;
                        }
                        if (deviceInfo.getDeviceConnectState() != 2 || Utils.o()) {
                            LogUtil.e("UIHLH_AchievementCardData", "connect failed because status: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                            messageObtainMessage.what = 6;
                        } else {
                            LogUtil.b("UIHLH_AchievementCardData", "connected");
                            messageObtainMessage.what = 5;
                            messageObtainMessage.obj = deviceInfo;
                        }
                        handler.sendMessage(messageObtainMessage);
                    } catch (ClassCastException unused) {
                        LogUtil.d("UIHLH_AchievementCardData", "DeviceInfo deviceInfo ClassCastException");
                    }
                }
            }
        };
        this.d = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.10
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent != null) {
                    Handler handler = AchievementCardData.this.j;
                    if (handler == null) {
                        LogUtil.e("UIHLH_AchievementCardData", "mAutoCheckNewVersionReceiver onReceive handler is null");
                        return;
                    }
                    String action = intent.getAction();
                    LogUtil.b("UIHLH_AchievementCardData", "mAutoCheckNewVersionReceiver onReceive: content: ", intent.getStringExtra("content"));
                    if ("action_band_auto_check_new_version_result".equals(action)) {
                        int intExtra = intent.getIntExtra("result", 8);
                        LogUtil.b("UIHLH_AchievementCardData", "mAutoCheckNewVersionReceiver result: ", Integer.valueOf(intExtra));
                        if (intExtra == 14) {
                            LogUtil.b("UIHLH_AchievementCardData", "AUTO_CHECK_AW70_BAND_SUCCESS");
                            AchievementCardData.this.e(intent, handler);
                            return;
                        } else if (intExtra == 15) {
                            AchievementCardData.this.e(intent);
                            return;
                        } else {
                            LogUtil.e("UIHLH_AchievementCardData", "default result", Integer.valueOf(intExtra));
                            return;
                        }
                    }
                    return;
                }
                LogUtil.e("UIHLH_AchievementCardData", "mAutoCheckNewVersionReceiver onReceive intent is null");
            }
        };
        this.mPositionTag = 10;
        this.i = context;
        this.j = new b(this);
        k();
        n();
        q();
        this.j.sendEmptyMessage(9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent, Handler handler) {
        if (f25154c) {
            LogUtil.e("UIHLH_AchievementCardData", "sIsHandleCheckSuccessAw70, do nothing");
            return;
        }
        f25154c = true;
        handler.sendEmptyMessageDelayed(200, 5000L);
        this.o = true;
        String stringExtra = intent.getStringExtra("name");
        int intExtra = intent.getIntExtra("size", -1);
        String stringExtra2 = intent.getStringExtra("changelog");
        DeviceInfo deviceInfoC = mgi.c("UIHLH_AchievementCardData");
        if (deviceInfoC == null) {
            LogUtil.e("UIHLH_AchievementCardData", "AUTO_CHECK_AW70_BAND_SUCCESS AW70 deviceInfo is null");
            return;
        }
        String deviceName = deviceInfoC.getDeviceName();
        this.n = deviceInfoC.getDeviceIdentify();
        LogUtil.b("UIHLH_AchievementCardData", "AUTO_CHECK_AW70_BAND_SUCCESS checkBandNewVersionName: ", stringExtra, " checkBandNewVersionSize: ", Integer.valueOf(intExtra), " bandChangelog: ", stringExtra2, " aw70DeviceName: ", deviceName);
        e(stringExtra, intExtra, stringExtra2, deviceName, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ThreadPoolManager.c().a("cacheImage", new Runnable() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.11
            @Override // java.lang.Runnable
            public void run() {
                DeviceInfo deviceInfoJ;
                DeviceSettingsInteractors deviceSettingsInteractorsE;
                if (!CommonUtil.ck() || (deviceInfoJ = tfn.a().j()) == null || deviceInfoJ.getDeviceConnectState() != 2 || (deviceSettingsInteractorsE = DeviceSettingsInteractors.e(BaseApplication.getContext())) == null || deviceSettingsInteractorsE.d() == null) {
                    return;
                }
                AchievementCardData.this.a(deviceSettingsInteractorsE, deviceInfoJ);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceSettingsInteractors deviceSettingsInteractors, DeviceInfo deviceInfo) {
        WatchFaceListBean watchFaceListBean;
        if (deviceSettingsInteractors.d().isSupportWatchFace() && SharedPreferenceManager.g(this.i).equals(deviceInfo.getDeviceIdentify()) && SharedPreferenceManager.j(BaseApplication.getContext())) {
            try {
                watchFaceListBean = (WatchFaceListBean) new Gson().fromJson(SharedPreferenceManager.f(BaseApplication.getContext()), WatchFaceListBean.class);
            } catch (JsonSyntaxException unused) {
                LogUtil.d("UIHLH_AchievementCardData", "judgeCacheImageCondition JsonSyntaxException");
                watchFaceListBean = null;
            }
            if (watchFaceListBean == null) {
                return;
            }
            List<WatchFaceListBean.WatchFaceBean> watchFaceBeanList = watchFaceListBean.getWatchFaceBeanList();
            if (watchFaceBeanList == null || watchFaceBeanList.size() == 0) {
                LogUtil.e("UIHLH_AchievementCardData", "data is not suitable");
                return;
            }
            String fileHost = watchFaceListBean.getFileHost();
            for (WatchFaceListBean.WatchFaceBean watchFaceBean : watchFaceBeanList) {
                StringBuilder sb = new StringBuilder(16);
                sb.append(fileHost);
                sb.append(watchFaceBean.getId());
                sb.append("/");
                sb.append(watchFaceBean.getLogo());
                qqf.d(this.mContext, sb.toString());
            }
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        if (CommonUtil.ck()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.13
                @Override // java.lang.Runnable
                public void run() {
                    DeviceInfo deviceInfoJ = tfn.a().j();
                    if (deviceInfoJ == null || deviceInfoJ.getDeviceConnectState() != 2) {
                        return;
                    }
                    tfn.a().h();
                    if (AchievementCardData.this.j == null) {
                        return;
                    }
                    Handler handler = AchievementCardData.this.j;
                    Message messageObtainMessage = handler.obtainMessage();
                    messageObtainMessage.obj = deviceInfoJ;
                    messageObtainMessage.what = 10;
                    handler.sendMessage(messageObtainMessage);
                    if (CommonUtil.x(AchievementCardData.this.mContext)) {
                        return;
                    }
                    if (!nty.d()) {
                        AchievementCardData.this.a(deviceInfoJ.getDeviceIdentify());
                        AchievementCardData.this.c(deviceInfoJ.getDeviceIdentify());
                    } else {
                        com.huawei.hwlogsmodel.LogUtil.a("UIHLH_AchievementCardData", "resume is Sporting");
                    }
                }
            });
        }
        ReleaseLogUtil.d("UIHLH_AchievementCardData", "main card onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.q = KeyValDbManager.d(this.mContext).c("new_band_version");
        this.e = KeyValDbManager.d(this.mContext).c("new_band_version_type");
        String strC = KeyValDbManager.d(this.mContext).c("new_band_size");
        this.k = KeyValDbManager.d(this.mContext).c("new_band_change_log");
        String strC2 = KeyValDbManager.d(this.mContext).c("is_need_show_dialog");
        String strC3 = KeyValDbManager.d(this.mContext).c("need_show_dialog_time");
        LogUtil.b("UIHLH_AchievementCardData", "isNeedShowDialog ", strC2, "needShowDialogTime", strC3);
        if (Boolean.parseBoolean(strC2) && nvd.a(strC3)) {
            this.r = CommonUtil.b(strC, 10);
            this.m = Boolean.parseBoolean(KeyValDbManager.d(this.mContext).c("is_new_checkbox"));
            this.f = KeyValDbManager.d(this.mContext).c("need_show_dialog_device_name");
            String strC4 = KeyValDbManager.d(this.mContext).c("need_show_dialog_mac");
            this.n = strC4;
            if (strC4 == null || !strC4.equals(str)) {
                return;
            }
            this.l = true;
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        super.onDestroy();
        x();
        y();
        w();
        if (CommonUtil.ck()) {
            t();
        }
        ExecutorService executorService = this.g;
        if (executorService != null) {
            executorService.shutdown();
            this.g = null;
        }
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.j = null;
        }
        AchievementCardViewHolder achievementCardViewHolder = this.f25155b;
        if (achievementCardViewHolder != null) {
            achievementCardViewHolder.a();
            this.f25155b = null;
        }
    }

    @Override // com.huawei.ui.homehealth.achievementcard.EmptyAchievementCardData, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        if (super.getCardViewHolder(viewGroup, layoutInflater) instanceof AchievementCardViewHolder) {
            this.f25155b = (AchievementCardViewHolder) super.getCardViewHolder(viewGroup, layoutInflater);
        }
        AchievementCardViewHolder achievementCardViewHolder = this.f25155b;
        if (achievementCardViewHolder == null) {
            LogUtil.e("UIHLH_AchievementCardData", "getCardViewHolder, mAchievementCardViewHolder is null.");
            return this.f25155b;
        }
        achievementCardViewHolder.d();
        return this.f25155b;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "UIHLH_AchievementCardData";
    }

    @Override // com.huawei.ui.homehealth.achievementcard.EmptyAchievementCardData, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
        LogUtil.b("UIHLH_AchievementCardData", "refreshCardData()");
    }

    private void n() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.DEVICE_THIRD_DELETE");
        BroadcastManagerUtil.c(this.mContext, this.h, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void x() {
        try {
            this.mContext.unregisterReceiver(this.h);
        } catch (IllegalArgumentException e) {
            LogUtil.d("UIHLH_AchievementCardData", "unregisterGetDeviceStatusBroadcast IllegalArgumentException: ", e.getMessage());
        } catch (RuntimeException e2) {
            LogUtil.d("UIHLH_AchievementCardData", "unregisterGetDeviceStatusBroadcast RuntimeException: ", e2.getMessage());
        }
    }

    private void k() {
        LogUtil.b("UIHLH_AchievementCardData", "register weather report Bi broadcast");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.ACTION_HWWEATHER_BI_CHANGE");
        BroadcastManagerUtil.d(this.mContext, this.t, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void y() {
        LogUtil.b("UIHLH_AchievementCardData", "unregister weather report Bi broadcast");
        try {
            this.mContext.unregisterReceiver(this.t);
        } catch (IllegalArgumentException e) {
            LogUtil.d("UIHLH_AchievementCardData", "unregisterHwWeatherBiBroadcast IllegalArgumentException: ", e.getMessage());
        } catch (RuntimeException e2) {
            LogUtil.d("UIHLH_AchievementCardData", "unregisterHwWeatherBiBroadcast RuntimeException: ", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, "UIHLH_AchievementCardData");
        if (deviceList != null && !deviceList.isEmpty()) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if ("main_relationship".equals(deviceInfo2.getRelationship()) || eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("isEMUI", String.valueOf(CommonUtil.bg() ? 1 : 0));
        if (deviceInfo != null) {
            linkedHashMap.put("deviceName", lvi.e(deviceInfo.getProductType(), deviceInfo.getDeviceName(), false));
        }
        linkedHashMap.put("error_type", String.valueOf(i));
        OpAnalyticsUtil.getInstance().setEvent2nd(AnalyticsValue.WEATHER_PUSH_1090012.value(), linkedHashMap);
    }

    private void q() {
        LogUtil.b("UIHLH_AchievementCardData", "register notifySendData report Bi broadcast");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.nitification_service_bi_change");
        BroadcastManagerUtil.c(this.i, this.s, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void w() {
        LogUtil.b("UIHLH_AchievementCardData", "unregister notify report Bi broadcast");
        try {
            if (this.mContext != null) {
                this.mContext.unregisterReceiver(this.s);
            }
        } catch (IllegalArgumentException e) {
            LogUtil.d("UIHLH_AchievementCardData", "unregisterNotifyBiBroadcast IllegalArgumentException", e.getMessage());
        }
    }

    static class b extends BaseHandler<AchievementCardData> {
        b(AchievementCardData achievementCardData) {
            super(achievementCardData);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AchievementCardData achievementCardData, Message message) {
            if (message == null) {
                LogUtil.e("UIHLH_AchievementCardData", "handleMessageWhenReferenceNotNull msg is null");
                return;
            }
            int i = message.what;
            if (i == 5) {
                if (!CommonUtil.af(achievementCardData.mContext) && niz.c() && (message.obj instanceof DeviceInfo)) {
                    AchievementCardData.b(achievementCardData, (DeviceInfo) message.obj);
                    return;
                }
                return;
            }
            if (i == 100) {
                boolean unused = AchievementCardData.f25153a = false;
                LogUtil.b("UIHLH_AchievementCardData", "MESSAGE_WEAR_DEVICE_CHECK_SUCCESS, sIsHandleCheckSuccess: ", Boolean.valueOf(AchievementCardData.f25153a));
                return;
            }
            if (i == 200) {
                boolean unused2 = AchievementCardData.f25154c = false;
                LogUtil.b("UIHLH_AchievementCardData", "MESSAGE_AW70_CHECK_SUCCESS, sIsHandleCheckSuccessAw70: ", Boolean.valueOf(AchievementCardData.f25154c));
                return;
            }
            if (i == 9) {
                achievementCardData.d();
                return;
            }
            if (i != 10) {
                LogUtil.e("UIHLH_AchievementCardData", "handleMessageWhenReferenceNotNull else");
                return;
            }
            DeviceInfo deviceInfo = message.obj instanceof DeviceInfo ? (DeviceInfo) message.obj : null;
            if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
                return;
            }
            achievementCardData.o();
            achievementCardData.e(deviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final AchievementCardData achievementCardData, DeviceInfo deviceInfo) {
        if (achievementCardData.g == null) {
            achievementCardData.g = Executors.newSingleThreadExecutor();
        }
        if (deviceInfo != null) {
            final String deviceIdentify = deviceInfo.getDeviceIdentify();
            mjh.d(BaseApplication.getContext(), deviceIdentify);
            final String softVersion = deviceInfo.getSoftVersion();
            final String strA = mjh.a(deviceInfo);
            achievementCardData.g.execute(new Runnable() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.15
                @Override // java.lang.Runnable
                public void run() {
                    if (mjh.g(deviceIdentify)) {
                        LogUtil.b("UIHLH_AchievementCardData", "start upload upg log.");
                        achievementCardData.c(softVersion, strA, deviceIdentify);
                        mjh.c(BaseApplication.getContext(), 2, deviceIdentify);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, String str3) {
        long jB = SharedPreferenceManager.b(this.mContext, "EXCE_OTA_APP_UPG_TRANS_START");
        long jB2 = SharedPreferenceManager.b(this.mContext, "EXCE_OTA_APP_UPG_TRANS_START");
        long jB3 = SharedPreferenceManager.b(this.mContext, "EXCE_OTA_APP_UPG_TRANS_STOP_TIME");
        boolean z = jB3 > 0 && jB3 - jB > 0;
        boolean z2 = jB2 > 0 || jB > 0;
        if (mjh.h(str3) && z2 && z) {
            mjh.e("0D0B01", "EXCE_OTA_APP_UPG_CONNECT_VERSION", str, str2);
        }
    }

    private void d(Intent intent) {
        LogUtil.b("UIHLH_AchievementCardData", "showScaleUpdateDialog ACTION_APP_AUTO_CHECK_NEW_VERSION_RESULT:AUTO_CHECK_SUCCESS BLE");
        String stringExtra = intent.getStringExtra("productId");
        if (CommonUtil.x(this.mContext)) {
            LogUtil.e("UIHLH_AchievementCardData", "dialog is background");
            return;
        }
        if (drw.e().b(stringExtra) == null) {
            LogUtil.e("UIHLH_AchievementCardData", "getBondedDevice is null");
            return;
        }
        try {
            Intent intent2 = new Intent();
            int intExtra = intent.getIntExtra("size", -1);
            String stringExtra2 = intent.getStringExtra("changelog");
            intent2.putExtra("name", intent.getStringExtra("name"));
            intent2.putExtra("size", intExtra);
            intent2.putExtra("message", stringExtra2);
            intent2.putExtra(ParamConstants.CallbackMethod.ON_SHOW, false);
            intent2.putExtra("isScale", true);
            intent2.putExtra("productId", stringExtra);
            intent2.putExtra("uniqueId", intent.getStringExtra("uniqueId"));
            intent2.setClass(this.mContext, BandUpdateDialogActivity.class);
            this.mContext.startActivity(intent2);
        } catch (ActivityNotFoundException e) {
            LogUtil.d("UIHLH_AchievementCardData", "showScaleUpdateDialog e ", ExceptionUtils.c(e));
        }
    }

    private void e(String str, int i, String str2, String str3, boolean z) {
        if (mio.c()) {
            LogUtil.e("UIHLH_AchievementCardData", "band is showing");
            return;
        }
        if (maq.b().f()) {
            LogUtil.e("UIHLH_AchievementCardData", "band is transfering");
            return;
        }
        LogUtil.b("UIHLH_AchievementCardData", "showBandAutoCheckDialog version: ", str, " size: ", Integer.valueOf(i), " changeLog: ", str2, " deviceName: ", str3, " isShowCheckbox: ", Boolean.valueOf(z));
        if (CommonUtil.x(this.mContext)) {
            this.q = str;
            this.r = i;
            this.k = str2;
            this.m = z;
            this.l = true;
            LogUtil.b("UIHLH_AchievementCardData", "showBandAutoCheckDialog isBackground");
            return;
        }
        if (nty.d()) {
            com.huawei.hwlogsmodel.LogUtil.a("UIHLH_AchievementCardData", "resume is Sporting");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("name", str);
            intent.putExtra("size", i);
            intent.putExtra("message", str2);
            intent.putExtra(ParamConstants.CallbackMethod.ON_SHOW, z);
            intent.putExtra("isAW70", this.o);
            intent.putExtra("mac", this.n);
            intent.setClass(this.mContext, WearDeviceUpdateDialogActivity.class);
            this.mContext.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.d("UIHLH_AchievementCardData", "showBandAutoCheckDialog e ", ExceptionUtils.c(e));
        }
    }

    public void e() {
        LogUtil.b("UIHLH_AchievementCardData", "registUpdateState()");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_band_auto_check_new_version_result");
        BroadcastManagerUtil.d(this.mContext, this.d, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void t() {
        LogUtil.b("UIHLH_AchievementCardData", "unregisterAppCheckBroadcast()");
        try {
            this.mContext.unregisterReceiver(this.d);
        } catch (IllegalArgumentException e) {
            LogUtil.d("UIHLH_AchievementCardData", "unregistUpdateState IllegalArgumentException: ", e.getMessage());
        } catch (RuntimeException e2) {
            LogUtil.d("UIHLH_AchievementCardData", "unregistUpdateState RuntimeException: ", e2.getMessage());
        } catch (Exception unused) {
            LogUtil.d("UIHLH_AchievementCardData", "unregistUpdateState Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str) {
        if (this.l) {
            LogUtil.b("UIHLH_AchievementCardData", "Enter checkIsNeedShowDialog mIsNeedShowDialog");
            mhs.a().getSwitchSetting("wlan_auto_update", new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.14
                /* JADX WARN: Code duplicated, block: B:12:0x002d  */
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    boolean z;
                    LogUtil.b("UIHLH_AchievementCardData", "checkIsNeedShowDialog errorCode = ", Integer.valueOf(i));
                    if (i != 0) {
                        z = false;
                    } else if (!(obj instanceof String)) {
                        LogUtil.e("UIHLH_AchievementCardData", "objectData is not String");
                        return;
                    } else if ("2".equals((String) obj)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean zA = mio.a();
                    LogUtil.b("UIHLH_AchievementCardData", "get auto ota checkbox status,isAutoUpdate isOpen: ", Boolean.valueOf(z), " isMobileTraffic ", Boolean.valueOf(zA));
                    if (z && !zA) {
                        AchievementCardData.this.l = false;
                        KeyValDbManager.d(AchievementCardData.this.mContext).b("is_need_show_dialog", String.valueOf(false));
                    } else {
                        if (HwVersionManager.b(BaseApplication.getContext()).o(str)) {
                            AchievementCardData.this.m();
                            return;
                        }
                        LogUtil.b("UIHLH_AchievementCardData", "checkIsNeedShowDialog have no new version");
                        AchievementCardData.this.l = false;
                        KeyValDbManager.d(AchievementCardData.this.mContext).b("is_need_show_dialog", String.valueOf(false));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (maq.b().f()) {
            LogUtil.b("UIHLH_AchievementCardData", "device is running ota update");
            this.l = false;
            KeyValDbManager.d(this.mContext).b("is_need_show_dialog", String.valueOf(false));
        } else if (mio.c()) {
            LogUtil.b("UIHLH_AchievementCardData", "device ota is showing");
            this.l = false;
            KeyValDbManager.d(this.mContext).b("is_need_show_dialog", String.valueOf(false));
        } else {
            s();
            this.l = false;
            KeyValDbManager.d(this.mContext).b("is_need_show_dialog", String.valueOf(false));
        }
    }

    private void s() {
        LogUtil.b("UIHLH_AchievementCardData", "can show dialog");
        if (!(this.mContext instanceof Activity)) {
            LogUtil.e("UIHLH_AchievementCardData", "mContext is null or mContext is not Activity");
        } else {
            ((Activity) this.mContext).runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.12
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Intent intent = new Intent();
                        intent.putExtra("name", AchievementCardData.this.q);
                        intent.putExtra("type", AchievementCardData.this.e);
                        intent.putExtra("size", AchievementCardData.this.r);
                        intent.putExtra("message", AchievementCardData.this.k);
                        intent.putExtra(ParamConstants.CallbackMethod.ON_SHOW, AchievementCardData.this.m);
                        intent.putExtra("show_device_name", AchievementCardData.this.f);
                        intent.putExtra("mac", AchievementCardData.this.n);
                        intent.setClass(AchievementCardData.this.mContext, WearDeviceUpdateDialogActivity.class);
                        AchievementCardData.this.mContext.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        LogUtil.d("UIHLH_AchievementCardData", "handleWlanNewVersionUpdate e ", ExceptionUtils.c(e));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        DeviceSettingsInteractors deviceSettingsInteractorsE = DeviceSettingsInteractors.e(BaseApplication.getContext());
        if (deviceSettingsInteractorsE == null || deviceSettingsInteractorsE.d() == null || !deviceSettingsInteractorsE.d().isSupportMusicControl()) {
            return;
        }
        lzl.a(BaseApplication.getContext());
        LogUtil.b("UIHLH_AchievementCardData", "initManager music");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo) {
        LogUtil.b("UIHLH_AchievementCardData", "enter notificationAlert");
        DeviceCapability deviceCapabilityD = DeviceSettingsInteractors.e(BaseApplication.getContext()).d();
        if (deviceCapabilityD == null) {
            return;
        }
        LogUtil.b("UIHLH_AchievementCardData", "enter notificationAlert isMessageAlert: ", Boolean.valueOf(deviceCapabilityD.isMessageAlert()));
        boolean zI = CommonUtil.i(this.mContext, "com.huawei.health.MainActivity");
        LogUtil.b("UIHLH_AchievementCardData", "is MainActivity on Top  ", Boolean.valueOf(zI));
        int productType = deviceInfo.getProductType();
        if (deviceCapabilityD.isMessageAlert() && zI && productType != 32) {
            boolean zD = lzi.a().d();
            boolean zL = l();
            boolean zC = c();
            LogUtil.b("UIHLH_AchievementCardData", "isClosed: ", Boolean.valueOf(zD), "isAchieve: ", Boolean.valueOf(zL), "isShownThreeTimes: ", Boolean.valueOf(zC));
            if (!zD && zL && !zC) {
                p();
                e(nvd.b(), this.mContext);
                e(this.mContext);
            } else {
                if (zD) {
                    CustomTextAlertDialog customTextAlertDialog = this.p;
                    if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
                        return;
                    }
                    this.p.dismiss();
                    LogUtil.b("UIHLH_AchievementCardData", "dismiss notification dialog");
                    return;
                }
                LogUtil.e("UIHLH_AchievementCardData", "handle dialog else");
            }
        }
    }

    private boolean l() {
        Date dateD;
        String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "sp_dialog_check_time");
        LogUtil.b("UIHLH_AchievementCardData", "isEnableDialog lastTime: ", strE);
        if (TextUtils.isEmpty(strE) || (dateD = nvd.d(strE)) == null) {
            return true;
        }
        return Math.abs(System.currentTimeMillis() - dateD.getTime()) > 86400000;
    }

    private boolean c() {
        String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "dialog_show_time");
        LogUtil.b("UIHLH_AchievementCardData", "countShowTimes number: ", strE);
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        try {
            return Integer.parseInt(strE) >= 2;
        } catch (NumberFormatException unused) {
        }
    }

    private void e(String str, Context context) {
        LogUtil.b("UIHLH_AchievementCardData", "setDialogCheckTime, time: ", str);
        SharedPreferenceManager.e(context, String.valueOf(10000), "sp_dialog_check_time", str, new StorageParams(0));
    }

    private void e(Context context) {
        StorageParams storageParams = new StorageParams(0);
        String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "dialog_show_time");
        LogUtil.b("UIHLH_AchievementCardData", "setDialogShowTime number: ", strE);
        if (TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(context, String.valueOf(10000), "dialog_show_time", "0", storageParams);
            return;
        }
        try {
            SharedPreferenceManager.e(context, String.valueOf(10000), "dialog_show_time", String.valueOf(Integer.parseInt(strE) + 1), storageParams);
        } catch (NumberFormatException unused) {
            LogUtil.d("UIHLH_AchievementCardData", "setDialogShowTime NumberFormatException");
        }
    }

    private void p() {
        boolean zIsSupportMusicControl;
        if (DeviceSettingsInteractors.e(BaseApplication.getContext()).d() != null) {
            zIsSupportMusicControl = DeviceSettingsInteractors.e(BaseApplication.getContext()).d().isSupportMusicControl();
            LogUtil.b("UIHLH_AchievementCardData", "showNotificationDialog, isSupportMusic: ", Boolean.valueOf(zIsSupportMusicControl));
        } else {
            zIsSupportMusicControl = false;
        }
        DeviceInfo deviceInfoC = mgg.c("UIHLH_AchievementCardData");
        if (deviceInfoC == null) {
            LogUtil.e("UIHLH_AchievementCardData", "refresh dialog Support deviceInfo is null, return");
            return;
        }
        String string = this.mContext.getResources().getString(R.string.IDS_add_device_smart_watch);
        if (lvi.f(deviceInfoC.getProductType())) {
            string = this.mContext.getResources().getString(R.string.IDS_add_device_smart_band);
        }
        String str = String.format(Locale.ENGLISH, this.mContext.getResources().getString(R.string.IDS_device_notification_switch_closed_remind_text), string);
        String str2 = String.format(Locale.ENGLISH, this.mContext.getResources().getString(R.string.IDS_device_notification_open_help_remind_text), string);
        if (CommonUtil.w(this.mContext) && !Utils.o()) {
            a(zIsSupportMusicControl, str, str2);
        } else {
            a(zIsSupportMusicControl, str2);
        }
    }

    private void a(boolean z, String str) {
        CustomTextAlertDialog.Builder builderE = new CustomTextAlertDialog.Builder(this.mContext).a(R.string.IDS_service_area_notice_title).a(R.string.IDS_yes, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AchievementCardData.this.i();
            }
        }).e(R.string.IDS_no, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AchievementCardData.this.f();
            }
        });
        if (z) {
            lzl.a(BaseApplication.getContext()).c(true, true);
        }
        builderE.a(str);
        CustomTextAlertDialog customTextAlertDialogB = builderE.b();
        this.p = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.p.isShowing()) {
            return;
        }
        this.p.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        DeviceInfo deviceInfoC = mgg.c("UIHLH_AchievementCardData");
        if (deviceInfoC != null) {
            int productType = deviceInfoC.getProductType();
            String deviceName = deviceInfoC.getDeviceName();
            HashMap map = new HashMap(16);
            map.put("click_status", "0");
            map.put("device_name", lvi.e(productType, deviceName, false));
            lmf.d().c(dxw.d(), AnalyticsValue.NOTIFIDIALOG_BUTTON_1090013.value(), map, 0);
            LogUtil.b("UIHLH_AchievementCardData", "handleElseSettingDialogNegative Bi: ", lvi.e(productType, deviceName, false));
        }
        LogUtil.b("UIHLH_AchievementCardData", "notification cancel click");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String strJ = j();
        if (!TextUtils.isEmpty(strJ)) {
            LogUtil.b("UIHLH_AchievementCardData", "handleElseSettingDialogPositive Bi: ", strJ);
        }
        try {
            ReleaseLogUtil.d("R_UIHLH_AchievementCardData", "else notification ok click");
            Intent intent = new Intent();
            intent.putExtra("isFromDialog", true);
            intent.setClass(this.mContext, NotificationSettingActivity.class);
            this.mContext.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.d("UIHLH_AchievementCardData", "handleElseSettingDialogPositive e ", ExceptionUtils.c(e));
        }
    }

    private void a(boolean z, String str, String str2) {
        CustomTextAlertDialog.Builder builderE = new CustomTextAlertDialog.Builder(this.mContext).e(str).a(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DeviceInfo deviceInfoC = mgg.c("UIHLH_AchievementCardData");
                if (deviceInfoC != null) {
                    int productType = deviceInfoC.getProductType();
                    String deviceName = deviceInfoC.getDeviceName();
                    HashMap map = new HashMap(16);
                    map.put("click_status", "1");
                    map.put("device_name", lvi.e(productType, deviceName, false));
                    lmf.d().c(dxw.d(), AnalyticsValue.NOTIFIDIALOG_BUTTON_1090013.value(), map, 0);
                    LogUtil.b("UIHLH_AchievementCardData", "handleChineseSettingDialog positive Bi: ", lvi.e(productType, deviceName, false));
                }
                try {
                    ReleaseLogUtil.d("R_UIHLH_AchievementCardData", "Chinese notification ok click");
                    Intent intent = new Intent();
                    intent.putExtra("isFromDialog", true);
                    intent.setClass(AchievementCardData.this.mContext, NotificationSettingActivity.class);
                    AchievementCardData.this.mContext.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    LogUtil.d("UIHLH_AchievementCardData", "handleChineseSettingDialog e ", ExceptionUtils.c(e));
                }
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("UIHLH_AchievementCardData", "notification cancel click");
                AchievementCardData.this.r();
            }
        });
        if (z) {
            lzl.a(BaseApplication.getContext()).c(true, true);
        }
        builderE.a(str2);
        CustomTextAlertDialog customTextAlertDialogB = builderE.b();
        this.p = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.p.isShowing()) {
            return;
        }
        this.p.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        boolean zIsSupportMusicControl;
        if (DeviceSettingsInteractors.e(BaseApplication.getContext()).d() != null) {
            zIsSupportMusicControl = DeviceSettingsInteractors.e(BaseApplication.getContext()).d().isSupportMusicControl();
            LogUtil.b("UIHLH_AchievementCardData", "showAnotherNotificationDialog, isSupportMusic: ", Boolean.valueOf(zIsSupportMusicControl));
        } else {
            zIsSupportMusicControl = false;
        }
        CustomTextAlertDialog.Builder builderE = new CustomTextAlertDialog.Builder(this.mContext).a(R.string.IDS_service_area_notice_title).e(R.string.IDS_open_later, android.R.color.holo_red_light, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AchievementCardData.this.g();
            }
        }).e(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.achievementcard.AchievementCardData.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AchievementCardData.this.h();
            }
        });
        if (zIsSupportMusicControl) {
            lzl.a(BaseApplication.getContext()).c(true, true);
        }
        builderE.a(this.mContext.getString(R.string.IDS_nottification_settings_remind_twice));
        CustomTextAlertDialog customTextAlertDialogB = builderE.b();
        customTextAlertDialogB.setCancelable(false);
        if (customTextAlertDialogB.isShowing()) {
            return;
        }
        customTextAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        String strJ = j();
        if (!TextUtils.isEmpty(strJ)) {
            LogUtil.b("UIHLH_AchievementCardData", "handleAnotherNotificationDialogNegative Bi: ", strJ);
        }
        ReleaseLogUtil.d("R_UIHLH_AchievementCardData", "another notification ok click");
        try {
            Intent intent = new Intent();
            intent.putExtra("isFromDialog", true);
            intent.setClass(this.mContext, NotificationSettingActivity.class);
            this.mContext.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.d("UIHLH_AchievementCardData", "handleAnotherNotificationDialogNegative e ", ExceptionUtils.c(e));
        }
    }

    private String j() {
        DeviceInfo deviceInfoC = mgg.c("UIHLH_AchievementCardData");
        if (deviceInfoC == null) {
            return "";
        }
        int productType = deviceInfoC.getProductType();
        String deviceName = deviceInfoC.getDeviceName();
        HashMap map = new HashMap(16);
        map.put("click_status", "1");
        map.put("device_name", lvi.e(productType, deviceName, false));
        lmf.d().c(dxw.d(), AnalyticsValue.NOTIFIDIALOG_BUTTON_1090013.value(), map, 0);
        return lvi.e(productType, deviceName, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        DeviceInfo deviceInfoC = mgg.c("UIHLH_AchievementCardData");
        if (deviceInfoC != null) {
            int productType = deviceInfoC.getProductType();
            String deviceName = deviceInfoC.getDeviceName();
            HashMap map = new HashMap(16);
            map.put("click_status", "0");
            map.put("device_name", lvi.e(productType, deviceName, false));
            lmf.d().c(dxw.d(), AnalyticsValue.NOTIFIDIALOG_BUTTON_1090013.value(), map, 0);
            LogUtil.b("UIHLH_AchievementCardData", "handleAnotherNotificationDialogPositive Bi: ", lvi.e(productType, deviceName, false));
        }
        LogUtil.b("UIHLH_AchievementCardData", "another notification cancel click");
    }
}
