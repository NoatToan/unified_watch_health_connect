package com.huawei.hwdevice.mainprocess.mgr.hwotamanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.ExecuteMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwdevice.mainprocess.mgr.smssend.HwDeviceReplyPhraseEngineManager;
import com.huawei.hwdevice.outofprocess.callback.HwLocationCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwotamanager.ICheckCallback;
import com.huawei.hwotamanager.IDeviceListCallback;
import com.huawei.hwotamanager.IUpgradeCallBack;
import com.huawei.hwotamanager.IUpgradeStatusCallBack;
import com.huawei.hwotamanager.IWearHwUpdateServiceAIDL;
import com.huawei.hwservicesmgr.ISilenceOTAAIDLCallback;
import com.huawei.hwversionmgr.info.EnterpriseResponseInfo;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.hwversionmgr.selfupdate.appupdate.UpdateBase;
import com.huawei.hwversionmgr.utils.callback.EnterpriseResultCallback;
import com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler;
import com.huawei.hwversionmgr.utils.handler.AppDownloadHandler;
import com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler;
import com.huawei.operation.OpAnalyticsUtil;
import defpackage.ecu;
import defpackage.eej;
import defpackage.lsf;
import defpackage.lvj;
import defpackage.maq;
import defpackage.mav;
import defpackage.max;
import defpackage.may;
import defpackage.maz;
import defpackage.mba;
import defpackage.mbc;
import defpackage.mbd;
import defpackage.mhs;
import defpackage.min;
import defpackage.mio;
import defpackage.miv;
import defpackage.miz;
import defpackage.nty;
import defpackage.nuf;
import defpackage.nui;
import defpackage.nuk;
import defpackage.num;
import defpackage.nuy;
import defpackage.nvd;
import defpackage.nvg;
import defpackage.nvj;
import defpackage.nvp;
import defpackage.nvt;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ohos.ace.plugin.taskmanagerplugin.EventType;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HwUpdateService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f17317c;
    private HwVersionManager f;
    private UpdateBase i;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f17315a = new Object();
    private final j d = new j();
    private Handler j = null;
    private HandlerThread g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f17316b = new ArrayList(16);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.d;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f17317c = getApplicationContext();
        LogUtil.a("HwUpdateService", "onCreate");
        this.i = new UpdateBase(this.f17317c);
        this.f = HwVersionManager.b(this.f17317c);
        a();
        maq.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        DeviceInfo deviceInfoE = maq.b().e(str);
        UpdateBase.a(deviceInfoE);
        UpdateBase.b(-1);
        nvp.b(deviceInfoE);
        nvt.d(deviceInfoE);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("HwUpdateService", "onDestroy");
        if (this.g != null) {
            Handler handler = this.j;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.g.getLooper().quit();
            this.g = null;
        }
        min.b().d();
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i2, final int i3) {
        super.onStartCommand(intent, i2, i3);
        LogUtil.a("HwUpdateService", "onStartCommand: intent = ", intent, " startId ", Integer.valueOf(i3));
        if (intent == null) {
            return 2;
        }
        String stringExtra = intent.getStringExtra("extra_band_imei");
        if (stringExtra == null) {
            stringExtra = "";
        }
        final String str = stringExtra;
        final String action = intent.getAction();
        LogUtil.a("R_OTA_HwUpdateService", "handleIntent: action = ", action);
        if (action == null) {
            return 2;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.5
            @Override // java.lang.Runnable
            public void run() {
                if (maq.b().e(str) == null && !TextUtils.isEmpty(str)) {
                    LogUtil.a("HwUpdateService", "onStartCommand deviceInfo == null");
                    ecu.d().executeDeviceRelatedLogic(ExecuteMode.FORCE_INIT_PHONE_SERVICE, null, "HwUpdateService");
                    HwUpdateService.this.e(str);
                }
                HwUpdateService.this.a(str);
                if (HwUpdateService.this.b(intent, action, i3, str)) {
                    return;
                }
                HwUpdateService.this.a(i3, "handleIntent");
            }
        });
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        LogUtil.a("HwUpdateService", "onTaskRemoved enter");
        maz.d().b();
        String stringExtra = intent.getStringExtra("extra_band_imei");
        if (!TextUtils.isEmpty(stringExtra)) {
            maq.b().e(stringExtra, 0);
        }
        super.onTaskRemoved(intent);
    }

    public void a(int i2, String str) {
        if (i2 != -1) {
            stopSelf(i2);
            LogUtil.a("HwUpdateService", "clearTaskService: tag = ", str, " startId ", Integer.valueOf(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        DeviceInfo deviceInfoE = null;
        int i2 = 200;
        for (int i3 = 0; i3 < 6; i3++) {
            if (deviceInfoE == null) {
                try {
                    LogUtil.a("R_OTA_HwUpdateService", "get device is null, waitTime: ", Integer.valueOf(i2));
                    Thread.sleep(i2);
                    i2 *= 2;
                    deviceInfoE = maq.b().e(str);
                } catch (InterruptedException unused) {
                    LogUtil.a("R_OTA_HwUpdateService", "singIn InterruptedException.");
                    return;
                }
            } else {
                LogUtil.a("R_OTA_HwUpdateService", "get device success.");
                return;
            }
            LogUtil.a("R_OTA_HwUpdateService", "singIn InterruptedException.");
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    public boolean b(Intent intent, String str, int i2, String str2) {
        str.hashCode();
        switch (str) {
            case "action_device_request_download_ota":
                return e(intent, i2, str2);
            case "action_cancel_download_all_ota":
                maq.b().c();
                return false;
            case "action_band_manual_update_new_version":
                return a(i2, str2, intent);
            case "action_band_auto_check_new_version":
                return k(i2, str2);
            case "action_band_manual_change_language":
                return c(i2);
            case "action_band_auto_download":
                return n(i2, str2);
            case "action_band_check_new_version_to_activate":
                return b(intent, i2);
            case "action_band_download_new_version":
                return e(i2, str2, false);
            default:
                LogUtil.a("HwUpdateService", "handleIntent, default branch");
                return false;
        }
    }

    private boolean e(Intent intent, int i2, String str) {
        if (intent.getBooleanExtra("key_is_user_agree_download", false)) {
            return o(i2, str);
        }
        if (mbc.b().b(str, intent.getIntExtra("key_auto_install_status", 255))) {
            return c(i2, str);
        }
        return false;
    }

    private boolean k(int i2, String str) {
        if (!ThermalCallback.getInstance().isTriggerOtaTask()) {
            LogUtil.j("startAutoCheckNewVersion does not have the conditions to trigger the task.", new Object[0]);
            return false;
        }
        synchronized (e) {
            this.f17316b.clear();
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwUpdateService");
            if (deviceList != null && deviceList.size() > 0) {
                Iterator<DeviceInfo> it = deviceList.iterator();
                while (it.hasNext()) {
                    this.f17316b.add(it.next().getDeviceIdentify());
                }
                LogUtil.a("HwUpdateService", "startAutoCheckNewVersion deviceInfoList.size ", Integer.valueOf(deviceList.size()));
            }
        }
        b(i2, str, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i2, String str, boolean z) {
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            d(i2, "initAutoBandCheckNewVersion deviceInfo is null");
            return;
        }
        if (nvd.d(deviceInfoE, 108) && !Utils.k()) {
            m(i2, str);
            HwOtaUpgradeManager.d().d(deviceInfoE, new HwOtaUpgradeManager.ClearServiceListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.7
                @Override // com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.ClearServiceListener
                public void clearTask() {
                    HwUpdateService.this.d(i2, "checkNewVersion return");
                }
            });
            return;
        }
        if ((nvd.d(deviceInfoE, 108) && Utils.k()) || nvd.d(deviceInfoE, 58)) {
            m(i2, str);
            HwOtaUpgradeManager.d().c(str, true, new HwOtaUpgradeManager.ClearServiceListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.15
                @Override // com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.ClearServiceListener
                public void clearTask() {
                    HwUpdateService.this.d(i2, "requestWearNewVersion return");
                }
            });
            return;
        }
        if (z) {
            maq.b().a(str, deviceInfoE.getDeviceEnterpriseVersion());
        } else {
            maq.b().a(str, deviceInfoE.getSoftVersion());
        }
        LogUtil.a("HwUpdateService", "initAutoBandCheckNewVersion deviceBtMac = ", BTDeviceMgrUtil.c().e(deviceInfoE.getSecurityDeviceId()));
        miv.c(30000L, "auto-deviceOta-checkFile");
        max.c().d("", false, true);
        b(i2, deviceInfoE, z);
        lvj.c().e(deviceInfoE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i2, String str) {
        if (this.f17316b.size() == 0) {
            a(i2, str);
        }
    }

    private void b(int i2, DeviceInfo deviceInfo, boolean z) {
        String softVersion;
        LogUtil.a("R_OTA_HwUpdateService", "autoBandCheckNewVersion enter");
        if (!z) {
            nvd.a(deviceInfo.getDeviceIdentify(), w9.o, "true");
        }
        if (!mio.d(deviceInfo.getProductType(), deviceInfo.getDeviceIdentify()) && !nvg.e(this.f17317c)) {
            if (z) {
                softVersion = deviceInfo.getDeviceEnterpriseVersion();
            } else {
                softVersion = deviceInfo.getSoftVersion();
            }
            String str = softVersion;
            if (TextUtils.isEmpty(str)) {
                e(i2, deviceInfo.getDeviceIdentify(), false, true, "autoBandCheckNewVersion");
                m(i2, deviceInfo.getDeviceIdentify());
                return;
            } else if (z) {
                b(i2, deviceInfo, true, str);
                return;
            } else {
                max.c().b(deviceInfo.getDeviceIdentify(), 19);
                e(i2, deviceInfo, true, false, str);
                return;
            }
        }
        if (!HwVersionManager.b(BaseApplication.getContext()).c(deviceInfo)) {
            nvd.c(deviceInfo.getDeviceIdentify(), "0", (Boolean) false);
        }
        m(i2, deviceInfo.getDeviceIdentify());
        j(i2, deviceInfo.getDeviceIdentify());
    }

    public void b(final int i2, final DeviceInfo deviceInfo, final boolean z, final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.14
            @Override // java.lang.Runnable
            public void run() {
                min.b().c(deviceInfo.getDeviceIdentify(), new HwLocationCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.14.4
                    @Override // com.huawei.hwdevice.outofprocess.callback.HwLocationCallback
                    public void onResult(String str2) {
                        LogUtil.a("HwUpdateService", "initLocation message = ", str2);
                        HwUpdateService.this.i.checkBandNewVersion(deviceInfo.getProductType(), str, deviceInfo.getSecurityDeviceId(), z, HwUpdateService.this.new b(i2, deviceInfo, Looper.getMainLooper(), z));
                    }
                });
            }
        });
    }

    private boolean a(int i2, String str, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("key_device_request_check_new_version", false);
        int intExtra = intent.getIntExtra("key_search_type", 0);
        if (booleanExtra && !mbc.b().d(str)) {
            return false;
        }
        synchronized (e) {
            this.f17316b.clear();
        }
        c(i2, str, booleanExtra, booleanExtra ? intExtra : 1, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i2, String str, boolean z, int i3, boolean z2) {
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            max.c().k(str);
            a(i2, "checkManualBandNewVersion deviceInfo is null");
        } else if (nvd.d(deviceInfoE, 58)) {
            HwOtaUpgradeManager.d().c(str, false, new HwOtaUpgradeManager.ClearServiceListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.11
                @Override // com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.ClearServiceListener
                public void clearTask() {
                    HwUpdateService.this.a(i2, "requestWearNewVersion return isAuto is false");
                }
            });
        } else {
            e(i2, deviceInfoE, z, i3, z2);
            lvj.c().e(deviceInfoE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, DeviceInfo deviceInfo, boolean z, int i3, boolean z2) {
        String softVersion;
        if (z2) {
            softVersion = deviceInfo.getDeviceEnterpriseVersion();
            maq.b().a(deviceInfo.getDeviceIdentify(), deviceInfo.getDeviceEnterpriseVersion());
        } else {
            softVersion = deviceInfo.getSoftVersion();
            maq.b().a(deviceInfo.getDeviceIdentify(), softVersion);
        }
        if (TextUtils.isEmpty(softVersion)) {
            e(i2, deviceInfo.getDeviceIdentify(), z, false, "checkManualDeviceVersion");
            return;
        }
        String str = softVersion;
        LogUtil.a("R_OTA_HwUpdateService", "checkManualDeviceVersion deviceType ", Integer.valueOf(deviceInfo.getProductType()), " isEnterprise ", Boolean.valueOf(z2), " isDeviceRequestCheck ", Boolean.valueOf(z), " searchType ", Integer.valueOf(i3), " deviceSoftVersion ", str, " deviceEnterpriseVersion ", deviceInfo.getDeviceEnterpriseVersion(), " deviceBtMac ", BTDeviceMgrUtil.c().e(deviceInfo.getSecurityDeviceId()), " startId ", Integer.valueOf(i2));
        HwVersionManager.b(BaseApplication.getContext()).b(i3 == 1);
        if (z2) {
            c(i2, deviceInfo, z, true, softVersion);
        } else {
            max.c().b(deviceInfo.getDeviceIdentify(), 20);
            e(i2, deviceInfo, false, z, softVersion);
        }
    }

    public void c(final int i2, final DeviceInfo deviceInfo, final boolean z, final boolean z2, final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.13
            @Override // java.lang.Runnable
            public void run() {
                min.b().c(deviceInfo.getDeviceIdentify(), new HwLocationCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.13.1
                    @Override // com.huawei.hwdevice.outofprocess.callback.HwLocationCallback
                    public void onResult(String str2) {
                        LogUtil.a("HwUpdateService", "initLocation message = ", str2);
                        may mayVar = new may();
                        mayVar.c(i2);
                        mayVar.a(deviceInfo.getDeviceIdentify());
                        mayVar.a(z2);
                        mayVar.b(z);
                        nvg.e(deviceInfo, str, HwUpdateService.this.i, z2, HwUpdateService.this.new i(mayVar, Looper.getMainLooper()));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, String str, boolean z, boolean z2, boolean z3) {
        LogUtil.a("R_OTA_HwUpdateService", "enter startId ", Integer.valueOf(i2), " = isAuto = ", Boolean.valueOf(z3));
        a(i2, str, z, z2, z3);
    }

    private void a(final int i2, final String str, final boolean z, final boolean z2, final boolean z3) {
        LogUtil.a("HwUpdateService", "checkManualQueryEnterpriseId isAuto ", Boolean.valueOf(z3));
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            max.c().k(str);
            e(i2, str, z, z3, "checkManualQueryEnterpriseId");
            a(i2, "checkManualBandNewVersion deviceInfo is null");
            return;
        }
        nvj.c().a(deviceInfoE, new EnterpriseResultCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.12
            @Override // com.huawei.hwversionmgr.utils.callback.EnterpriseResultCallback
            public void onSuccess(EnterpriseResponseInfo enterpriseResponseInfo) {
                LogUtil.j("HwUpdateService", "EnterpriseUpdateUtil,resp resultCode:", enterpriseResponseInfo.getEnterprise());
                if (!TextUtils.isEmpty(enterpriseResponseInfo.getEnterprise())) {
                    nvd.d(enterpriseResponseInfo.getEnterprise(), str, HwUpdateService.this.f17317c);
                    if (z3) {
                        HwUpdateService.this.b(i2, str, true);
                        return;
                    } else {
                        HwUpdateService.this.c(i2, str, z, z2 ? 1 : 0, true);
                        return;
                    }
                }
                HwUpdateService.this.e(i2, str, z, z3, "checkManualEnterpriseDeviceVersion onSuccess");
                nvd.b(nvd.e(), str, HwUpdateService.this.f17317c);
                LogUtil.j("HwUpdateService", "enterpriseResponse is null");
            }

            @Override // com.huawei.hwversionmgr.utils.callback.EnterpriseResultCallback
            public void onFailure(Throwable th) {
                HwUpdateService.this.e(i2, str, z, z3, "checkManualEnterpriseDeviceVersion onFailure");
                nvd.b(nvd.e(), str, HwUpdateService.this.f17317c);
                LogUtil.j("HwUpdateService", "EnterpriseUpdateUtil onFailure:", th.getMessage());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, String str, boolean z, boolean z2, String str2) {
        if (z2) {
            m(i2, str);
        }
        if (z) {
            max.c().o(str);
        }
        max.c().c(str, 0);
        c(i2, str, str2);
        if (z2) {
            return;
        }
        nvg.d(11, 0, "", "", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i2, String str) {
        synchronized (e) {
            if (this.f17316b.size() > 0 && this.f17316b.contains(str)) {
                this.f17316b.remove(str);
            }
            if (this.f17316b.size() > 0) {
                String str2 = this.f17316b.get(0);
                a(str2);
                b(i2, str2, false);
            }
            LogUtil.a("HwUpdateService", "removeDeviceId deviceIdList.size() = ", Integer.valueOf(this.f17316b.size()));
        }
    }

    private void e(final int i2, final DeviceInfo deviceInfo, final boolean z, final boolean z2, final String str) {
        if (!mbc.c(deviceInfo.getDeviceIdentify())) {
            if (z) {
                b(i2, deviceInfo, false, str);
                return;
            } else {
                c(i2, deviceInfo, z2, false, str);
                return;
            }
        }
        Message messageObtainMessage = this.j.obtainMessage();
        messageObtainMessage.what = 3;
        messageObtainMessage.arg1 = i2;
        Bundle bundle = new Bundle();
        bundle.putString("extra_band_imei", str);
        bundle.putBoolean("is_device_request_check", z2);
        bundle.putBoolean("is_auto", z);
        bundle.putParcelable("device_info", deviceInfo);
        messageObtainMessage.obj = bundle;
        this.j.sendMessageDelayed(messageObtainMessage, 5000L);
        mbc.b().c(deviceInfo.getDeviceIdentify(), new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.18
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                if (!(obj instanceof Integer)) {
                    LogUtil.j("HwUpdateService", "checkDevicePackageType error");
                    HwVersionManager.b(BaseApplication.getContext()).b(false);
                    return;
                }
                LogUtil.a("HwUpdateService", "checkDevicePackageType enter");
                if (HwUpdateService.this.j != null) {
                    HwUpdateService.this.j.removeMessages(3);
                }
                int iIntValue = ((Integer) obj).intValue();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("0x01", iIntValue);
                } catch (JSONException unused) {
                    LogUtil.e("HwUpdateService", "queryDevicePackageType response JSONException");
                }
                mio.c(deviceInfo, "050922", "0", "", jSONObject.toString());
                if (iIntValue == 2) {
                    OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("HwUpdateService", "trans updatePackageType 2 to 0");
                    iIntValue = 0;
                }
                UpdateBase.b(iIntValue);
                if (z) {
                    HwUpdateService.this.b(i2, deviceInfo, false, str);
                } else {
                    HwUpdateService.this.c(i2, deviceInfo, z2, false, str);
                }
            }
        });
    }

    private boolean o(int i2, String str) throws Throwable {
        LogUtil.a("HwUpdateService", "userAgreeDownloadOta startId ", Integer.valueOf(i2));
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            mbc.b().e(str, 3);
            return false;
        }
        if (TextUtils.isEmpty(nvd.i(this.f17317c, str))) {
            LogUtil.a("HwUpdateService", "userAgreeDownloadOta no new version");
            mbc.b().e(str, 255);
            return false;
        }
        int iC = maq.b().c(str);
        if (iC == 3) {
            mbc.b().e(str, 1);
            return false;
        }
        if (iC == 4 || iC == 6) {
            mbc.b().e(str, 2);
            return false;
        }
        if (max.c().e()) {
            LogUtil.j("HwUpdateService", "userAgreeDownloadOta low battery");
            mbc.b().e(str, 4);
            return false;
        }
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE != null && HwVersionManager.b(this.f17317c).d(str, deviceInfoE.getSecurityDeviceId())) {
            mbc.b().e(str, 2);
            miv.c(1800000L, "user-otaDownloadFile");
            miz.d(BaseApplication.getContext());
            maq.b().b(str, 0);
            return true;
        }
        LogUtil.a("HwUpdateService", "userAgreeDownloadOta start download");
        mbc.b().e(str, 0);
        d(i2, str, true);
        return true;
    }

    private boolean c(int i2, String str) throws Throwable {
        LogUtil.a("HwUpdateService", "deviceRequestDownloadOta enter startId ", Integer.valueOf(i2));
        boolean zA = maq.b().a(str);
        if (zA) {
            d(i2, str, true);
        }
        return zA;
    }

    private boolean c(int i2) {
        LogUtil.a("R_OTA_HwUpdateService", "changeLanguage enter startId ", Integer.valueOf(i2));
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwUpdateService");
        if (deviceList == null || deviceList.size() <= 0) {
            return true;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo == null) {
                a(i2, "changeLanguage enter deviceInfo == null");
            } else {
                d(deviceInfo.getDeviceIdentify());
                c(i2, deviceInfo.getDeviceIdentify(), "changeLanguage enter");
            }
        }
        HwDeviceReplyPhraseEngineManager.a().e();
        return true;
    }

    public boolean e(int i2, String str, boolean z) throws Throwable {
        LogUtil.a("R_OTA_HwUpdateService", "startDownloadNewVersion enter");
        a(i2, str, z);
        return true;
    }

    private boolean b(Intent intent, final int i2) {
        LogUtil.a("R_OTA_HwUpdateService", "startToActivate enter");
        final int intExtra = intent.getIntExtra("extra_band_type", -1);
        final String stringExtra = intent.getStringExtra("extra_band_version");
        final String stringExtra2 = intent.getStringExtra("extra_band_imei");
        if (intExtra == -1 || TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            LogUtil.j("R_OTA_HwUpdateService", "bandVersion or bandImei is invalid!");
            return false;
        }
        min.b().c(stringExtra2, new HwLocationCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.16
            @Override // com.huawei.hwdevice.outofprocess.callback.HwLocationCallback
            public void onResult(String str) {
                LogUtil.a("HwUpdateService", "initLocation message = ", str);
                HwUpdateService.this.e(intExtra, stringExtra, stringExtra2, i2);
            }
        });
        return true;
    }

    private void d(String str) {
        String strJ = this.f.j(str);
        long jI = CommonUtil.i(nvd.e(BaseApplication.getContext(), str, strJ));
        if (jI != 0) {
            String strA = qrs.a(BaseApplication.getContext(), jI);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            nvd.j(strA, BaseApplication.getContext(), strJ, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2, String str, String str2) {
        if (!mbc.e(str)) {
            d(i2, str2 + "not support query changelog");
            return;
        }
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            d(i2, str2 + "deviceInfo == null");
            return;
        }
        String strD = this.f.d(deviceInfoE.getDeviceUdid() + "_" + this.f.j(str) + "_changelog.xml");
        if (b(strD)) {
            nvd.e(nuy.e(strD, nvd.g(), nvd.h()), this.f17317c, this.f.j(str), deviceInfoE.getDeviceIdentify());
        }
        String strD2 = this.f.d(deviceInfoE.getDeviceUdid() + "_" + deviceInfoE.getSoftVersion() + "_changelog.xml");
        if (b(strD2)) {
            String strA = this.f.a(deviceInfoE.getDeviceUdid() + "_" + deviceInfoE.getSoftVersion() + "_changeLogUri");
            String strA2 = nuy.a(strD2, nvd.g(), nvd.h());
            nvd.e(nuy.e(strD2, nvd.g(), nvd.h()), this.f17317c, deviceInfoE.getSoftVersion(), deviceInfoE.getDeviceIdentify());
            String strE = nvd.e(strA2);
            if (mbc.e(str)) {
                d(deviceInfoE, strE, strA);
            }
            d(i2, str2 + "hasChangeLog is true");
            return;
        }
        f(i2, str);
    }

    private void a() {
        HandlerThread handlerThread = new HandlerThread("HwUpdateService");
        this.g = handlerThread;
        handlerThread.start();
        this.j = new mbd(this.g.getLooper(), this);
    }

    private boolean n(final int i2, final String str) {
        LogUtil.a("R_OTA_HwUpdateService", "startAutoDownload enter");
        if (!max.c().h(str)) {
            return false;
        }
        mhs.a().getSwitchSetting("wlan_auto_update", new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                LogUtil.a("HwUpdateService", "startAutoDownload errorCode = ", Integer.valueOf(i3));
                boolean z = (i3 == 0 && (obj instanceof String)) ? !"2".equals((String) obj) : false;
                LogUtil.a("R_OTA_HwUpdateService", "startAutoDownload wlan isOpen ", Boolean.valueOf(z));
                if (z) {
                    HwUpdateService.this.b(i2, str);
                } else {
                    max.c().b(str, 15);
                    HwUpdateService.this.a(i2, "WLAN auto update close, return");
                }
            }
        });
        return true;
    }

    private void i(int i2, String str, boolean z) throws Throwable {
        LogUtil.a("R_OTA_HwUpdateService", "enter startBatteryCheck startId ", Integer.valueOf(i2));
        if (max.c().e()) {
            c(i2, str, z, 4, "startBandBatteryCheck");
        } else {
            d(i2, str, z);
        }
    }

    private void d(int i2, String str, boolean z) throws Throwable {
        synchronized (f17315a) {
            try {
                try {
                    if (maq.b().c(str) == 3) {
                        return;
                    }
                    DeviceInfo deviceInfoE = maq.b().e(str);
                    if (deviceInfoE == null) {
                        c(i2, str, z, 3, "deviceInfo == null");
                        return;
                    }
                    num numVarI = HwVersionManager.b(BaseApplication.getContext()).i(deviceInfoE.getSecurityDeviceId());
                    if (numVarI == null) {
                        c(i2, str, z, 3, "bandInfo == null");
                        return;
                    }
                    miv.c(1800000L, "user-otaDownloadFile");
                    miz.d(BaseApplication.getContext());
                    nvg.e(19, 0, str);
                    max.c().b(str, 18);
                    max.c().a(str);
                    String strJ = numVarI.j();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f17317c.getFilesDir());
                    sb.append(File.separator);
                    sb.append(numVarI.t());
                    String string = sb.toString();
                    String strR = numVarI.r();
                    String strH = numVarI.h();
                    lsf.c(str, true);
                    lsf lsfVar = new lsf(new lsf.b(str, deviceInfoE.getSecurityDeviceId(), strJ, string, new c(i2, str, Looper.getMainLooper(), z)).d(3).e(strR).c(strH).a(true));
                    lsf.c(str, false);
                    ThreadPoolManager.c().execute(lsfVar);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    private void c(int i2, String str, boolean z, int i3, String str2) {
        if (!z) {
            nvg.e(22, i3, str);
        }
        max.c().e(str, 1, i3);
        a(i2, str2);
    }

    private void j(final int i2, final String str) {
        if (!max.c().h(str)) {
            d(i2, "isNeedTransfer OTA upgrade not allowed");
        } else {
            c(i2, str, "isNeedTransfer enter");
            mhs.a().getSwitchSetting("wlan_auto_update", new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    LogUtil.a("HwUpdateService", "isNeedTransfer errorCode = ", Integer.valueOf(i3));
                    boolean z = (i3 == 0 && (obj instanceof String)) ? !"2".equals((String) obj) : false;
                    LogUtil.a("HwUpdateService", "isNeedTransfer get auto ota checkbox status,isAutoupdate = ", Boolean.valueOf(z));
                    if (z) {
                        HwUpdateService.this.i(i2, str);
                    } else {
                        HwUpdateService.this.a(i2, "isNeedTransfer WLAN auto update close");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final int i2, final String str) {
        if (!max.c().h(str)) {
            a(i2, "handleAutoIsOpen isAllowedUpdate");
            return;
        }
        if (this.f == null) {
            this.f = HwVersionManager.b(this.f17317c);
        }
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            a(i2, "handleAutoIsOpen deviceInfo == null");
            return;
        }
        if (!this.f.d(str, deviceInfoE.getSecurityDeviceId())) {
            boolean zE = mio.e(str);
            LogUtil.a("HwUpdateService", "handleAutoIsOpen isAutoUpdateBand ", Boolean.valueOf(zE));
            if (zE && !mio.a()) {
                b(i2, str);
                return;
            } else {
                a(i2, "handleAutoIsOpen band new package is not exist");
                return;
            }
        }
        String strJ = this.f.j(str);
        if (TextUtils.equals(strJ, deviceInfoE.getSoftVersion())) {
            a(i2, "handleAutoIsOpen no new version");
        } else {
            LogUtil.a("HwUpdateService", "handleAutoIsOpen isNeedTransfer");
            mbc.b().a(str, strJ, new ISilenceOTAAIDLCallback.Stub() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.3
                @Override // com.huawei.hwservicesmgr.ISilenceOTAAIDLCallback
                public void onResponse(int i3, String str2) {
                    LogUtil.a("HwUpdateService", "errorcode = ", Integer.valueOf(i3));
                    if (i3 == 100000) {
                        if (!max.c().h(str)) {
                            HwUpdateService.this.a(i2, "handleAutoIsOpen isAllowedUpdate");
                            return;
                        } else {
                            if (max.c().e()) {
                                HwUpdateService.this.a(i2, "handleAutoIsOpen isAllowUpgrade");
                                return;
                            }
                            miv.c(1800000L, "auto-deviceOta-downloadFile");
                            miz.d(BaseApplication.getContext());
                            maq.b().b(str, 2);
                            return;
                        }
                    }
                    HwUpdateService.this.a(i2, "handleAutoIsOpen errorCode is not success");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, String str, String str2, int i3) {
        nvd.r(this.f17317c, str2);
        DeviceInfo deviceInfoE = maq.b().e(str2);
        if (deviceInfoE == null) {
            a(i3, "bandCheckNewVersionToActivate deviceInfo == null");
        } else {
            this.i.checkBandNewVersion(i2, str, deviceInfoE.getSecurityDeviceId(), false, new mba(str2, i3, Looper.getMainLooper(), this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, String str, nuf nufVar, String str2) {
        LogUtil.a("R_OTA_HwUpdateService", "autoFetchChangeLogForBand enter");
        this.i.saveChangeLog(new a(i2, str, nufVar, str2), null, str2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, String str, nuf nufVar, String str2, boolean z) {
        LogUtil.a("R_OTA_HwUpdateService", "manualFetchChangeLogForBand enter");
        if (!z) {
            nvg.e(30, -1, str);
        }
        may mayVar = new may();
        mayVar.c(i2);
        mayVar.a(str);
        mayVar.c(str2);
        mayVar.b(z);
        this.i.saveChangeLog(new f(mayVar, nufVar), null, str2, false);
    }

    private void d(int i2, String str, String str2, String str3, boolean z) {
        LogUtil.a("R_OTA_HwUpdateService", "appFetchChangeLogForBand enter");
        may mayVar = new may();
        mayVar.c(i2);
        mayVar.a(str);
        mayVar.e(z);
        mayVar.c(str3);
        mayVar.d(str2);
        this.i.saveChangeLog(new d(mayVar, Looper.getMainLooper()), str2, str3, false);
    }

    private void a(int i2, String str, boolean z) throws Throwable {
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE != null && HwVersionManager.b(this.f17317c).d(str, deviceInfoE.getSecurityDeviceId())) {
            LogUtil.a("R_OTA_HwUpdateService", "downloadFile isUpgradeFileValid true");
            if (max.c().e()) {
                c(i2, str, z, 4, "downloadFile");
                return;
            }
            if (max.c().j(str) != null) {
                max.c().a(str);
                miv.c(1800000L, "user-otaDownloadFile");
                miz.d(BaseApplication.getContext());
                maq.b().b(str, 0);
            }
            if (!z) {
                maq.b().e(str, 0);
                nvg.e(23, 0, str);
            }
            a(i2, "downloadFile false");
            return;
        }
        c(i2, str, z);
    }

    private void a(DeviceInfo deviceInfo, int i2) {
        if (max.c().e()) {
            max.c().b(deviceInfo.getDeviceIdentify(), 17);
            d(i2, "autoDownload isAllowUpgrade");
            return;
        }
        if (HwVersionManager.b(this.f17317c).d(deviceInfo.getDeviceIdentify(), deviceInfo.getSecurityDeviceId())) {
            miv.c(1800000L, "auto-deviceOta-downloadFile");
            miz.d(BaseApplication.getContext());
            maq.b().b(deviceInfo.getDeviceIdentify(), 2);
            d(i2, "autoDownload startOtaFileQueryTransfer");
            return;
        }
        if (maq.b().c(deviceInfo.getDeviceIdentify()) == 3) {
            return;
        }
        num numVarI = HwVersionManager.b(BaseApplication.getContext()).i(deviceInfo.getSecurityDeviceId());
        if (TextUtils.isEmpty(numVarI.j()) || deviceInfo.getSoftVersion().equals(numVarI.y())) {
            d(i2, "autoDownload downloadUrl is null or version is last");
            return;
        }
        miv.c(1800000L, "auto-deviceOta-downloadFile");
        miz.d(BaseApplication.getContext());
        max.c().b(deviceInfo.getDeviceIdentify(), 6);
        lsf.c(deviceInfo.getDeviceIdentify(), true);
        nvg.e(19, 0, deviceInfo.getDeviceIdentify());
        String strJ = numVarI.j();
        String str = this.f17317c.getFilesDir() + File.separator + numVarI.t();
        lsf lsfVar = new lsf(new lsf.b(deviceInfo.getDeviceIdentify(), deviceInfo.getSecurityDeviceId(), strJ, str, new e(i2, deviceInfo.getDeviceIdentify(), Looper.getMainLooper())).d(3).e(numVarI.r()).c(numVarI.h()).a(true));
        lsf.c(deviceInfo.getDeviceIdentify(), false);
        ThreadPoolManager.c().execute(lsfVar);
    }

    private void c(int i2, String str, boolean z) throws Throwable {
        if (!z) {
            nvg.e(20, -1, str);
        }
        i(i2, str, z);
    }

    class b extends AppCheckNewVersionHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17358b;
        private DeviceInfo d;
        private boolean e;

        b(int i, DeviceInfo deviceInfo, Looper looper, boolean z) {
            super(looper);
            this.f17358b = i;
            this.d = deviceInfo;
            this.e = z;
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler
        public void handleCheckFailed(int i) {
            LogUtil.a("R_OTA_HwUpdateService", "AutoBandVersionHandler handleCheckFailed");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("0x01", EventType.FAILED);
                jSONObject.put("0x03", 1);
            } catch (JSONException unused) {
                LogUtil.e("HwUpdateService", "AutoBandVersionHandler handleCheckFailed JSONException");
            }
            mio.c(this.d, "090001", "1", String.valueOf(i), jSONObject.toString());
            d(this.d.getDeviceIdentify(), i);
            miv.c("auto-deviceOta-checkFile");
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler
        public void handleCheckSuccess(nuf nufVar) {
            if (nufVar != null) {
                LogUtil.a("HwUpdateService", "AutoBandVersionHandler handleCheckSuccess: versionInfo = ", nufVar.toString());
                max.c().e(this.d.getDeviceIdentify(), nufVar);
                LogUtil.a("R_OTA_HwUpdateService", "AutoBandVersionHandler handleAutoCheck success");
                max.c().a(this.d.getDeviceIdentify(), true);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("0x01", "success");
                    jSONObject.put("0x02", nufVar.d());
                    jSONObject.put("0x03", 1);
                } catch (JSONException unused) {
                    LogUtil.e("HwUpdateService", "AutoBandVersionHandler handleCheckSuccess JSONException");
                }
                mio.c(this.d, "090001", "1", "", jSONObject.toString());
                HwUpdateService.this.b(this.f17358b, this.d.getDeviceIdentify(), nufVar, BaseApplication.getContext().getFilesDir() + File.separator + "changeLog" + File.separator + this.d.getDeviceUdid() + File.separator + (nufVar.g() + "_changelog.xml"));
                return;
            }
            HwUpdateService.this.a(this.f17358b, "AutoBandVersionHandler handleCheckSuccess");
        }

        private void d(String str, int i) {
            if (i != 0) {
                HwUpdateService.this.m(this.f17358b, this.d.getDeviceIdentify());
                HwUpdateService.this.c(this.f17358b, str, "onBandAutoCheckFail");
                LogUtil.e("R_OTA_HwUpdateService", "AutoBandVersionHandler handleAutoCheckFailed() reason = others");
                max.c().a(this.d.getDeviceIdentify(), false);
                return;
            }
            LogUtil.a("R_OTA_HwUpdateService", "AutoBandVersionHandler handleAutoCheckFailed FAILED_REASON_NOT_FOUND");
            e(str);
            max.c().a(this.d.getDeviceIdentify(), true);
            nvd.a(HwUpdateService.this.f17317c, str);
            max.c().d(this.d.getDeviceIdentify(), 0);
            nvd.h("", str, HwUpdateService.this.f17317c);
            nvd.a("", str, HwUpdateService.this.f17317c);
            nvd.c("", str, HwUpdateService.this.f17317c);
        }

        private void e(String str) {
            if (!nvd.a(this.d)) {
                nvd.b(nvd.e(), str, HwUpdateService.this.f17317c);
                HwUpdateService.this.m(this.f17358b, this.d.getDeviceIdentify());
                mio.a(str, false);
                HwUpdateService.this.c(this.f17358b, str, "checkQueryEnterpriseId");
                return;
            }
            if (this.e) {
                nvd.b(nvd.e(), str, HwUpdateService.this.f17317c);
                HwUpdateService.this.m(this.f17358b, this.d.getDeviceIdentify());
                mio.a(str, false);
                HwUpdateService.this.c(this.f17358b, str, "checkQueryEnterpriseId isEnterprise");
                return;
            }
            HwUpdateService.this.e(this.f17358b, str, true, false, true);
        }
    }

    class i extends AppCheckNewVersionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private may f17367a;

        i(may mayVar, Looper looper) {
            super(looper);
            this.f17367a = mayVar;
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler
        public void handleCheckFailed(int i) {
            LogUtil.a("R_OTA_HwUpdateService", "ManualBandVersionHandler handleCheckFailed", Boolean.valueOf(this.f17367a.i()));
            DeviceInfo deviceInfoE = maq.b().e(this.f17367a.c());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("0x01", EventType.FAILED);
                jSONObject.put("0x03", this.f17367a.e() ? 2 : 0);
            } catch (JSONException unused) {
                LogUtil.e("HwUpdateService", "ManualBandVersionHandler handleCheckFailed JSONException");
            }
            mio.c(deviceInfoE, "090001", "1", String.valueOf(i), jSONObject.toString());
            boolean zF = HwVersionManager.b(BaseApplication.getContext()).f();
            HwVersionManager.b(BaseApplication.getContext()).b(false);
            e(this.f17367a.c(), i, zF);
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler
        public void handleCheckSuccess(nuf nufVar) {
            LogUtil.a("R_OTA_HwUpdateService", "ManualBandVersionHandler handleCheckSuccess", Boolean.valueOf(this.f17367a.i()));
            HwVersionManager.b(BaseApplication.getContext()).b(false);
            if (nufVar != null) {
                LogUtil.a("HwUpdateService", "handleManualCheckSuccess: CheckNewVersionCode = ", nufVar.i(), " AppMinCode = ", Integer.valueOf(nufVar.c()));
                max.c().e(this.f17367a.c(), nufVar);
                max.c().a(this.f17367a.c(), true);
                nvg.d(12, (int) nufVar.a(), nufVar.g(), "1", this.f17367a.c());
                DeviceInfo deviceInfoE = maq.b().e(this.f17367a.c());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("0x01", "success");
                    jSONObject.put("0x02", nufVar.d());
                    jSONObject.put("0x03", this.f17367a.e() ? 2 : 0);
                } catch (JSONException unused) {
                    LogUtil.e("HwUpdateService", "ManualBandVersionHandler handleCheckSuccess JSONException");
                }
                mio.c(deviceInfoE, "090001", "1", "", jSONObject.toString());
                String str = nufVar.g() + "_changelog.xml";
                if (HwUpdateService.this.f17317c == null || deviceInfoE == null) {
                    HwUpdateService.this.a(this.f17367a.a(), "handleCheckSuccess (mContext == null) || (deviceInfo == null)");
                    return;
                }
                String str2 = HwUpdateService.this.f17317c.getFilesDir() + File.separator + "changeLog" + File.separator + deviceInfoE.getDeviceUdid() + File.separator + str;
                LogUtil.a("HwUpdateService", "ManualBandVersionHandler handleCheckSuccess changeLogFilePath=", str2);
                HwUpdateService.this.e(this.f17367a.a(), this.f17367a.c(), nufVar, str2, this.f17367a.e());
                return;
            }
            HwUpdateService.this.a(this.f17367a.a(), "ManualBandVersionHandler handleCheckSuccess else");
        }

        private void e(String str, int i, boolean z) {
            if (i == 0) {
                LogUtil.a("R_OTA_HwUpdateService", "onBandManualCheckFail FAILED_REASON_NOT_FOUND", Boolean.valueOf(this.f17367a.e()));
                d(str, i, z, maq.b().e(str));
                max.c().a(str, true);
            } else {
                if (!this.f17367a.e()) {
                    nvg.d(11, i, "", "", str);
                } else {
                    max.c().o(this.f17367a.c());
                }
                max.c().a(str, false);
                max.c().c(this.f17367a.c(), i);
                HwUpdateService.this.c(this.f17367a.a(), str, "onBandManualCheckFail");
            }
        }

        private void d(String str, int i, boolean z, DeviceInfo deviceInfo) {
            if (!nvd.a(deviceInfo)) {
                nvd.b(nvd.e(), str, HwUpdateService.this.f17317c);
                if (!this.f17367a.e()) {
                    nvg.d(11, i, "", "", str);
                } else {
                    max.c().o(this.f17367a.c());
                }
                mio.a(str, false);
                max.c().c(this.f17367a.c(), i);
                HwUpdateService.this.c(this.f17367a.a(), str, "checkManualEnterpriseId");
                return;
            }
            c(str, i, z);
        }

        private void c(String str, int i, boolean z) {
            if (this.f17367a.i()) {
                nvd.b(nvd.e(), str, HwUpdateService.this.f17317c);
                if (!this.f17367a.e()) {
                    nvg.d(11, i, "", "", str);
                } else {
                    max.c().o(this.f17367a.c());
                }
                mio.a(str, false);
                max.c().c(this.f17367a.c(), i);
                HwUpdateService.this.c(this.f17367a.a(), str, "checkSupportEnterpriseId");
                return;
            }
            HwUpdateService.this.e(this.f17367a.a(), str, this.f17367a.e(), z, false);
        }
    }

    private void f(final int i2, final String str) {
        mbc.b().a(str, HwVersionManager.b(BaseApplication.getContext()).e(str), nvd.h(), new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                LogUtil.a("HwUpdateService", "queryChangelogFromDevice errorCode = ", Integer.valueOf(i3));
                if (!(obj instanceof mav)) {
                    HwUpdateService.this.d(i2, "queryChangelogFromDevice invalid");
                    return;
                }
                mav mavVar = (mav) obj;
                int iC = mavVar.c();
                DeviceInfo deviceInfoE = maq.b().e(str);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("0x03", iC);
                } catch (JSONException unused) {
                    LogUtil.e("HwUpdateService", "queryChangelogFromDevice JSONException");
                }
                mio.c(deviceInfoE, "050921", "0", String.valueOf(i3), jSONObject.toString());
                String strI = mavVar.i();
                if (iC == 0) {
                    HwUpdateService.this.e(i2, str, strI);
                    return;
                }
                if (iC == 1) {
                    HwUpdateService.this.c(str);
                } else if (iC == 2) {
                    HwUpdateService.this.b(i2, str, strI);
                } else {
                    LogUtil.a("HwUpdateService", "queryChangelogFromDevice invalid deviceResult = ", Integer.valueOf(iC));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("HwUpdateService", "queryChangelogFromDevice error, versionUrl = ", str2);
            return;
        }
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            LogUtil.j("HwUpdateService", "sendChangeLog deviceInfo == null");
            return;
        }
        d(i2, str, str2, BaseApplication.getContext().getFilesDir() + File.separator + "changeLog" + File.separator + deviceInfoE.getDeviceUdid() + File.separator + (deviceInfoE.getSoftVersion() + "_changelog.xml"), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        LogUtil.a("HwUpdateService", "sendChangeLogToDevice, app no have changeLog");
        mav mavVar = new mav();
        mavVar.a(HwVersionManager.b(BaseApplication.getContext()).e(str));
        mavVar.c(0);
        mbc.b().e(str, mavVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, String str, String str2) {
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            LogUtil.j("HwUpdateService", "sendChangeLogToDevice deviceInfo == null");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.a("HwUpdateService", "queryChangelogFromDevice error, versionUrl = ", str2);
            return;
        }
        d(i2, str, str2, BaseApplication.getContext().getFilesDir() + File.separator + "changeLog" + File.separator + deviceInfoE.getDeviceUdid() + File.separator + (deviceInfoE.getSoftVersion() + "_changelog.xml"), false);
    }

    private boolean b(String str) {
        return FileUtils.getFile(str).exists();
    }

    private void d(DeviceInfo deviceInfo, String str, String str2) {
        if (mbc.e(deviceInfo.getDeviceIdentify())) {
            mav mavVar = new mav();
            String strE = HwVersionManager.b(BaseApplication.getContext()).e(deviceInfo.getDeviceIdentify());
            String strH = nvd.h();
            mavVar.c(str2);
            mavVar.a(strE);
            mavVar.c(1);
            mavVar.e(strH);
            mavVar.b(str);
            mbc.b().e(deviceInfo.getDeviceIdentify(), mavVar);
        }
    }

    class a extends AppPullChangeLogHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private nuf f17355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17356c;
        private String d;
        private String e;

        a(int i, String str, nuf nufVar, String str2) {
            this.f17356c = i;
            this.d = str;
            this.f17355b = nufVar;
            this.e = str2;
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler
        public void pullChangeLogFailed() {
            LogUtil.a("R_OTA_HwUpdateService", "AutoBandPullChangeLogHandler pullChangeLogFailed");
            mio.a(this.d, false);
            HwUpdateService.this.m(this.f17356c, this.d);
            miv.c("auto-deviceOta-checkFile");
            HwUpdateService.this.d(this.f17356c, "AutoBandPullChangeLogHandler pullChangeLogFailed");
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler
        public void pullChangeLogSuccess(List<nuk> list) {
            LogUtil.a("R_OTA_HwUpdateService", "AutoBandPullChangeLogHandler pullChangeLogSuccess");
            max.c().b(this.d, this.e, this.f17355b);
            LogUtil.a("HwUpdateService", "AutoBandPullChangeLogHandler BAND_AUTO_UPDATE");
            nvd.e(this.f17355b.j(), this.d, HwUpdateService.this.f17317c);
            HwUpdateService.this.m(this.f17356c, this.d);
            HwUpdateService.this.g(this.f17356c, this.d);
            mio.a(this.d, true);
            nvg.c();
            miv.c("auto-deviceOta-checkFile");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i2, String str) {
        nvd.b(nvd.e(), str, this.f17317c);
        a(i2, str, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str, boolean z, boolean z2) {
        String strE = HwVersionManager.b(BaseApplication.getContext()).e(str);
        String strJ = HwVersionManager.b(BaseApplication.getContext()).j(str);
        LogUtil.a("HwUpdateService", "bandCurrentVersion = ", strE, " bandNewVersion ", strJ);
        if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strJ)) {
            d(i2, "version is null");
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (strE.equals(strJ)) {
            if (z) {
                max.c().o(str);
            }
            d(i2, "pullChangeLogSuccess No new version");
            return;
        }
        c(i2, str, z, z2, deviceCapabilityA);
    }

    private void c(final int i2, String str, boolean z, boolean z2, DeviceCapability deviceCapability) {
        String strJ = nvd.j(this.f17317c, str);
        if (z || z2) {
            if (deviceCapability == null || !deviceCapability.getIsSupportNotifyDeviceNewVersion()) {
                return;
            }
            mbc.b().e(max.c().a(str, strJ), strJ, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    HwUpdateService.this.d(i2, "checkPackageAlreadyExists errorCode = " + i3);
                }
            });
            return;
        }
        if (deviceCapability != null && deviceCapability.getIsSupportNotifyDeviceNewVersion()) {
            e(1, i2, str);
            a(i2, str, strJ);
        } else {
            LogUtil.a("HwUpdateService", "sendDeviceNewVersionMessage not getIsSupportNotifyDeviceNewVersion()");
            e(i2, str);
        }
    }

    private void a(final int i2, final String str, String str2) {
        mbc.b().e(max.c().a(str, str2), str2, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                LogUtil.a("HwUpdateService", "sendDeviceNewVersionMessage errorCode = ", Integer.valueOf(i3));
                if (HwUpdateService.this.j != null) {
                    HwUpdateService.this.j.removeMessages(1);
                }
                if (i3 == 109023 || i3 == 109028) {
                    HwUpdateService.this.d(i2, "sendDeviceNewVersionMessage Not Upgraded");
                } else {
                    if (i3 == 109024) {
                        maq.b().a(str, 1);
                        maq.b().f(str);
                        HwUpdateService.this.b(i2, true, str);
                        return;
                    }
                    HwUpdateService.this.e(i2, str);
                }
            }
        });
    }

    public void e(int i2, String str) {
        c(HwVersionManager.b(BaseApplication.getContext()).j(str), i2, str);
        maq.b().a(str, 1);
        maq.b().f(str);
    }

    private void c(String str, final int i2, final String str2) {
        LogUtil.a("HwUpdateService", "isSupportSilence enter");
        mbc.b().a(str2, str, new ISilenceOTAAIDLCallback.Stub() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.9
            @Override // com.huawei.hwservicesmgr.ISilenceOTAAIDLCallback
            public void onResponse(int i3, String str3) {
                LogUtil.a("HwUpdateService", "isSupportSilence errorCode = ", Integer.valueOf(i3));
                if (i3 != 100000 && i3 != 109002) {
                    HwUpdateService.this.b(i2, false, str2);
                } else if (!max.c().h(str2)) {
                    HwUpdateService.this.d(i2, "isSupportSilence isAllowedUpdate");
                } else {
                    HwUpdateService.this.h(i2, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(final int i2, final String str) {
        mhs.a().getSwitchSetting("wlan_auto_update", new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                LogUtil.a("HwUpdateService", "handleBandSilenceOtaUpgrade errorCode = ", Integer.valueOf(i3));
                boolean z = (i3 == 0 && (obj instanceof String)) ? !"2".equals((String) obj) : false;
                LogUtil.a("HwUpdateService", "get auto ota checkbox status,isAutoupdate: ", Boolean.valueOf(z));
                if (!z) {
                    HwUpdateService.this.b(i2, true, str);
                } else if (!mio.a()) {
                    HwUpdateService.this.b(i2, str);
                } else {
                    HwUpdateService.this.b(i2, true, str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, String str) {
        if (!max.c().h(str)) {
            max.c().b(str, 16);
            d(i2, "checkAutoDownload isAllowedUpdate");
            return;
        }
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            d(i2, "startAutoDownload deviceInfo == null");
        } else if (nvd.q(this.f17317c, str)) {
            a(deviceInfoE, i2);
        } else {
            b(i2, true, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, boolean z, String str) {
        if (!max.c().h(str)) {
            d(i2, "showBandAutoCheckDialog isAllowedUpdate");
            return;
        }
        if (CommonUtil.x(this.f17317c) || mio.c()) {
            max.c().d(z, str);
            d(i2, "showBandAutoCheckDialog isBackground");
        } else if (nty.d()) {
            LogUtil.a("HwUpdateService", "HwUpdateService showBandAutoCheckDialog is Sporting");
        } else {
            max.c().d(this.f17317c, z, str);
            d(i2, "showBandAutoCheckDialog end");
        }
    }

    class f extends AppPullChangeLogHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private may f17365a;
        private nuf d;
        private boolean e;

        f(may mayVar, nuf nufVar) {
            this.d = nufVar;
            this.f17365a = mayVar;
            this.e = max.c().c(mayVar.c()) != null;
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler
        public void pullChangeLogFailed() {
            LogUtil.e("R_OTA_HwUpdateService", "ManualBandPullChangeLogHandler pullChangeLogFailed");
            mio.a(this.f17365a.c(), false);
            if (!this.f17365a.e() && !this.e) {
                nvg.e(31, -1, this.f17365a.c());
            }
            if (this.f17365a.e()) {
                max.c().o(this.f17365a.c());
            }
            max.c().c(this.f17365a.c(), 12);
            HwUpdateService.this.a(this.f17365a.a(), "ManualBandPullChangeLogHandler pullChangeLogFailed");
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler
        public void pullChangeLogSuccess(List<nuk> list) {
            LogUtil.a("R_OTA_HwUpdateService", "ManualBandPullChangeLogHandler pullChangeLogSuccess");
            max.c().b(this.f17365a.c(), this.f17365a.d(), this.d);
            nvd.e(this.d.j(), this.f17365a.c(), HwUpdateService.this.f17317c);
            nvd.b(nvd.e(), this.f17365a.c(), HwUpdateService.this.f17317c);
            if (this.f17365a.e() || this.e) {
                HwUpdateService.this.a(this.f17365a.a(), this.f17365a.c(), this.f17365a.e(), this.e);
            } else {
                nvg.d(32, 0, "", this.d.e(), this.f17365a.c());
                HwUpdateService.this.a(this.f17365a.a(), "pullChangeLogSuccess !isDeviceRequestCheck");
            }
            max.c().e(this.f17365a.c());
            mio.a(this.f17365a.c(), true);
            nvg.c();
        }
    }

    class e extends AppDownloadHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f17363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17364c;

        e(int i, String str, Looper looper) {
            super(looper);
            this.f17364c = i;
            this.f17363b = str;
            DeviceCapability deviceCapabilityA = eej.a(str);
            if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportDeviceRequestCheck()) {
                mbc.b().c(str, 0, 1, 0);
            }
            maq.b().e(str, 3);
            max.c().d(str, 0);
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doInDownloadProgress(nui nuiVar) {
            LogUtil.a("HwUpdateService", "AutoAppDownloadHandler doInDownloadProgress total=", Long.valueOf(nuiVar.d()), ",CurrentProgress=", Long.valueOf(nuiVar.c()), " startId ", Integer.valueOf(this.f17364c));
            this.f17362a = (int) nuiVar.c();
            if (maq.b().c(this.f17363b) != 3) {
                maq.b().e(this.f17363b, 3);
            }
            DeviceCapability deviceCapabilityA = eej.a(this.f17363b);
            if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportDeviceRequestCheck()) {
                mbc.b().c(this.f17363b, this.f17362a, 1, 1);
            }
            nvg.e(21, this.f17362a, this.f17363b);
            max.c().b(this.f17362a, this.f17363b, 1);
            max.c().d(this.f17363b, this.f17362a);
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doDownloadFailed(int i) {
            LogUtil.e("R_OTA_HwUpdateService", "AutoAppDownloadHandler: doDownloadFailed");
            max.c().b(this.f17363b, i);
            maq.b().e(this.f17363b, 2);
            max.c().d(5, this.f17363b, i, "");
            max.c().e(this.f17363b, (IUpgradeStatusCallBack) null);
            DeviceCapability deviceCapabilityA = eej.a(this.f17363b);
            max.c().d(this.f17363b, 0);
            if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportDeviceRequestCheck()) {
                mbc.b().c(this.f17363b, this.f17362a, 1, 2);
            }
            nvg.e(22, i, this.f17363b);
            miv.c("auto-deviceOta-downloadFile");
            miz.d();
            HwUpdateService.this.a(this.f17364c, "AutoAppDownloadHandler doDownloadFailed");
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doDownloadSuccess(nui nuiVar) {
            if (nuiVar == null) {
                max.c().d(5, this.f17363b, 3, "");
                HwUpdateService.this.a(this.f17364c, "AutoAppDownloadHandler doDownloadSuccess downloadInfo == null");
                return;
            }
            max.c().b(this.f17363b, 8);
            HwUpdateService.this.f.i(this.f17363b, nuiVar.a());
            LogUtil.a("R_OTA_HwUpdateService", "AutoAppDownloadHandler: doDownloadSuccess");
            max.c().b(100, this.f17363b, 2);
            max.c().d(this.f17363b, 100);
            maq.b().e(this.f17363b, 0);
            nvg.e(23, 0, this.f17363b);
            if (!nvd.o(HwUpdateService.this.f17317c)) {
                if (max.c().e()) {
                    HwUpdateService.this.a(this.f17364c, "AutoAppDownloadHandler doDownloadSuccess isAllowUpgrade is true");
                    return;
                }
                maq.b().b(this.f17363b, 2);
            }
            HwUpdateService.this.a(this.f17364c, "AutoAppDownloadHandler doDownloadSuccess");
        }
    }

    class c extends AppDownloadHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f17361c;
        private int d;

        c(int i, String str, Looper looper, boolean z) {
            super(looper);
            this.d = i;
            this.f17361c = str;
            this.f17359a = z;
            DeviceCapability deviceCapabilityA = eej.a(str);
            if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportDeviceRequestCheck()) {
                mbc.b().c(str, 0, 0, 0);
            }
            maq.b().e(str, 3);
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doDownloadFailed(int i) {
            max.c().a(this.f17361c, i);
            LogUtil.e("R_OTA_HwUpdateService", "ManualBandDownloadHandler: doDownloadFailed");
            nvg.e(22, i, this.f17361c);
            DeviceCapability deviceCapabilityA = eej.a(this.f17361c);
            if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportDeviceRequestCheck()) {
                mbc.b().c(this.f17361c, this.f17360b, 0, 2);
            }
            if (maq.b().c(this.f17361c) == 3) {
                maq.b().e(this.f17361c, 2);
            }
            max.c().d(5, this.f17361c, i, "");
            max.c().e(this.f17361c, (IUpgradeStatusCallBack) null);
            max.c().d(this.f17361c, 0);
            miv.c("user-otaDownloadFile");
            miz.d();
            HwUpdateService.this.a(this.d, "ManualBandDownloadHandler doDownloadFailed");
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doDownloadSuccess(nui nuiVar) {
            LogUtil.a("R_OTA_HwUpdateService", "ManualBandDownloadHandler: doDownloadSuccess");
            max.c().a(this.f17361c, 1);
            DeviceInfo deviceInfoE = maq.b().e(this.f17361c);
            if (!this.f17359a) {
                nvd.d(deviceInfoE, "1", "m2");
            }
            if (nuiVar == null) {
                HwUpdateService.this.a(this.d, "ManualBandDownloadHandler doDownloadSuccess appDownloadInfo == null");
                return;
            }
            HwUpdateService.this.f.i(this.f17361c, nuiVar.a());
            maq.b().e(this.f17361c, 0);
            nvg.e(23, 0, this.f17361c);
            if (!nvd.o(HwUpdateService.this.f17317c)) {
                IUpgradeStatusCallBack iUpgradeStatusCallBackF = max.c().f(this.f17361c);
                if (max.c().e()) {
                    if (iUpgradeStatusCallBackF != null) {
                        max.c().d(2, this.f17361c, 4, "");
                    } else if (this.f17359a) {
                        mbc.b().e(this.f17361c, 4);
                    } else {
                        LogUtil.a("HwUpdateService", "ManualBandDownloadHandler: doDownloadSuccess isAllowUpgrade is true");
                    }
                    HwUpdateService.this.a(this.d, "ManualBandDownloadHandler: doDownloadSuccess isAllowUpgrade");
                    return;
                }
                if (!this.f17359a) {
                    nvd.d(deviceInfoE, "1", "m3");
                }
                if (this.f17359a || iUpgradeStatusCallBackF != null) {
                    LogUtil.a("HwUpdateService", "ManualBandDownloadHandler: doDownloadSuccess upgradeStatusCallBack != null");
                    maq.b().b(this.f17361c, 0);
                } else {
                    maq.b().b(this.f17361c, 2);
                }
            }
            max.c().b(100, this.f17361c, 2);
            max.c().d(this.f17361c, 100);
            HwUpdateService.this.a(this.d, "ManualBandDownloadHandler doDownloadSuccess");
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doInDownloadProgress(nui nuiVar) {
            if (nuiVar == null) {
                return;
            }
            LogUtil.a("HwUpdateService", "ManualBandDownloadHandler doInDownloadProgress total=", Long.valueOf(nuiVar.d()), ",CurrentProgress=", Long.valueOf(nuiVar.c()), " startId ", Integer.valueOf(this.d));
            int iC = (int) nuiVar.c();
            this.f17360b = iC;
            nvg.e(21, iC, this.f17361c);
            if (maq.b().c(this.f17361c) != 3) {
                maq.b().e(this.f17361c, 3);
            }
            DeviceCapability deviceCapabilityA = eej.a(this.f17361c);
            if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportDeviceRequestCheck()) {
                mbc.b().c(this.f17361c, this.f17360b, 0, 1);
            }
            max.c().b(this.f17360b, this.f17361c, 1);
            max.c().d(this.f17361c, this.f17360b);
        }
    }

    class d extends AppPullChangeLogHandler {
        private may d;

        d(may mayVar, Looper looper) {
            super(looper);
            this.d = mayVar;
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler
        public void pullChangeLogFailed() {
            HwUpdateService.this.a(this.d.a(), "AppBandPullChangeLogHandler pullChangeLogFailed");
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler
        public void pullChangeLogSuccess(List<nuk> list) {
            max.c().d(this.d.c(), this.d.b(), this.d.d(), this.d.g());
            HwUpdateService.this.a(this.d.a(), "AppBandPullChangeLogHandler pullChangeLogSuccess");
        }
    }

    class j extends IWearHwUpdateServiceAIDL.Stub {
        private j() {
        }

        @Override // com.huawei.hwotamanager.IWearHwUpdateServiceAIDL
        public void getConnectedDevices(IDeviceListCallback iDeviceListCallback) throws RemoteException {
            LogUtil.a("HwUpdateService", "getConnectedDevices enter");
            max.c().a(iDeviceListCallback);
        }

        @Override // com.huawei.hwotamanager.IWearHwUpdateServiceAIDL
        public void getDeviceNewVersion(String str, ICheckCallback iCheckCallback) throws RemoteException {
            max.c().d(str, (ICheckCallback) null);
            LogUtil.a("HwUpdateService", "getDeviceNewVersion uuid", CommonUtil.n(str));
            DeviceInfo deviceInfoG = max.c().g(str);
            if (deviceInfoG == null) {
                max.c().c(str, iCheckCallback);
            } else if (HwOtaUpgradeManager.d().e(str)) {
                HwOtaUpgradeManager.d().d(str, deviceInfoG, iCheckCallback);
            } else {
                max.c().d(str, iCheckCallback);
                HwUpdateService.this.e(-1, deviceInfoG, false, 1, false);
            }
        }

        @Override // com.huawei.hwotamanager.IWearHwUpdateServiceAIDL
        public void doUpgrade(String str, String str2, IUpgradeCallBack iUpgradeCallBack) throws Throwable {
            final DeviceInfo deviceInfoG = max.c().g(str);
            if (deviceInfoG == null) {
                max.c().b(str, iUpgradeCallBack);
                return;
            }
            if (HwOtaUpgradeManager.d().e(str)) {
                HwOtaUpgradeManager.d().d(str, deviceInfoG, str2, iUpgradeCallBack);
                return;
            }
            if (max.c().c(str, str2, iUpgradeCallBack, deviceInfoG)) {
                return;
            }
            DeviceCapability deviceCapabilityA = eej.a(deviceInfoG.getDeviceIdentify());
            LogUtil.a("HwUpdateService", "doUpgrade: deviceCapability.getIsSupportNotifyDeviceNewVersion() = ", Boolean.valueOf(deviceCapabilityA.getIsSupportNotifyDeviceNewVersion()));
            if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportNotifyDeviceNewVersion()) {
                HwUpdateService.this.e(2, -1, deviceInfoG.getDeviceIdentify());
                String strJ = nvd.j(HwUpdateService.this.f17317c, deviceInfoG.getDeviceIdentify());
                mbc.b().e(max.c().a(deviceInfoG.getDeviceIdentify(), strJ), strJ, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService.j.3
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) throws Throwable {
                        j.this.c(i, deviceInfoG);
                    }
                });
                return;
            }
            c(deviceInfoG);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i, DeviceInfo deviceInfo) throws Throwable {
            LogUtil.a("HwUpdateService", "doUpgrade errorCode = ", Integer.valueOf(i));
            if (HwUpdateService.this.j != null) {
                HwUpdateService.this.j.removeMessages(2);
            }
            if (i == 109023) {
                max.c().e(deviceInfo.getDeviceIdentify(), 0, 0);
                return;
            }
            if (i == 109024) {
                if (max.c().j(deviceInfo.getDeviceIdentify()) != null) {
                    max.c().a(deviceInfo.getDeviceIdentify());
                }
                maq.b().c(deviceInfo.getDeviceIdentify(), HwVersionManager.b(BaseApplication.getContext()).j(deviceInfo.getDeviceIdentify()), "is_package_already_exists", null);
                return;
            }
            c(deviceInfo);
        }

        private void c(DeviceInfo deviceInfo) throws Throwable {
            maq.b().d(deviceInfo.getDeviceIdentify());
            maq.b().i();
            HwUpdateService.this.e(-1, deviceInfo.getDeviceIdentify(), true);
        }

        @Override // com.huawei.hwotamanager.IWearHwUpdateServiceAIDL
        public void getUpgradeStatus(String str, IUpgradeStatusCallBack iUpgradeStatusCallBack) throws RemoteException {
            LogUtil.a("HwUpdateService", "getUpgradeStatus uuid ", CommonUtil.n(str));
            if (HwOtaUpgradeManager.d().e(str)) {
                HwOtaUpgradeManager.d().c(str, iUpgradeStatusCallBack);
            } else {
                max.c().b(str, iUpgradeStatusCallBack);
            }
        }

        @Override // com.huawei.hwotamanager.IWearHwUpdateServiceAIDL
        public void registerUpgradeListener(String str, IUpgradeStatusCallBack iUpgradeStatusCallBack) throws RemoteException {
            LogUtil.a("HwUpdateService", "registerUpgradeListener uuid ", CommonUtil.n(str));
            if (HwOtaUpgradeManager.d().e(str)) {
                HwOtaUpgradeManager.d().d(str, iUpgradeStatusCallBack);
            } else {
                max.c().d(str, iUpgradeStatusCallBack);
            }
        }

        @Override // com.huawei.hwotamanager.IWearHwUpdateServiceAIDL
        public void unRegisterUpgradeListener(String str) throws RemoteException {
            LogUtil.a("HwUpdateService", "unRegisterUpgradeListener uuid ", CommonUtil.n(str));
            if (HwOtaUpgradeManager.d().e(str)) {
                HwOtaUpgradeManager.d().d(str);
                HwUpdateService.this.stopSelf();
            } else {
                max.c().e(str, (IUpgradeStatusCallBack) null);
                HwUpdateService.this.stopSelf();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, int i3, String str) {
        Handler handler = this.j;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = i2;
            messageObtainMessage.arg1 = i3;
            new Bundle().putString("extra_band_imei", str);
            this.j.sendMessageDelayed(messageObtainMessage, 5000L);
        }
    }
}
