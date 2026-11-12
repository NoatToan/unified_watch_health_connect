package com.huawei.hwdevice.mainprocess.mgr.hwotamanager;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback;
import com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.bean.NewVersionBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwotamanager.ICheckCallback;
import com.huawei.hwotamanager.IUpgradeCallBack;
import com.huawei.hwotamanager.IUpgradeStatusCallBack;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.dad;
import defpackage.eey;
import defpackage.lvb;
import defpackage.maq;
import defpackage.maw;
import defpackage.max;
import defpackage.mbc;
import defpackage.mbe;
import defpackage.mhp;
import defpackage.mhs;
import defpackage.mio;
import defpackage.nty;
import defpackage.nvd;
import defpackage.nvg;
import defpackage.nvi;
import defpackage.ohf;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HwOtaUpgradeManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HwOtaUpgradeManager f17264c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f17265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17266b = false;
    private Handler e = new Handler(Looper.getMainLooper()) { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                LogUtil.j("HwOtaUpgradeManager", "mHandle msg is null");
                return;
            }
            LogUtil.a("HwOtaUpgradeManager", "handleMessage what:", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 0) {
                HwOtaUpgradeManager.this.f17266b = false;
                return;
            }
            if (i == 1 || i == 2 || i == 3) {
                HwOtaUpgradeManager.this.c(message);
            } else if (i == 4) {
                HwOtaUpgradeManager.this.a(message);
            } else {
                LogUtil.j("HwOtaUpgradeManager", "handleMessage what:", Integer.valueOf(message.what));
            }
        }
    };

    public interface ClearServiceListener {
        void clearTask();
    }

    public interface RefreshLittleRedListener {
        void refreshLittleRed();
    }

    private HwOtaUpgradeManager(Context context) {
        this.f17265a = context;
    }

    public static HwOtaUpgradeManager d() {
        HwOtaUpgradeManager hwOtaUpgradeManager;
        synchronized (d) {
            if (f17264c == null) {
                f17264c = new HwOtaUpgradeManager(BaseApplication.getContext());
            }
            hwOtaUpgradeManager = f17264c;
        }
        return hwOtaUpgradeManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        String strOptString;
        int i = message.what;
        ClearServiceListener clearServiceListener = null;
        if (message.obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) message.obj;
            strOptString = jSONObject.optString("mac");
            if (jSONObject.opt("listener") instanceof ClearServiceListener) {
                clearServiceListener = (ClearServiceListener) jSONObject.opt("listener");
            }
        } else {
            strOptString = "";
        }
        b(clearServiceListener);
        int i2 = message.arg1;
        if (i == 1) {
            b(strOptString);
        }
        if (i == 3 && i2 == 1) {
            nvg.d(11, 12, "", "", strOptString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (dad.c().isPluginAvaiable()) {
            LogUtil.j("HwOtaUpgradeManager", "processPluginLoadTimeout PluginWearOtaProxy isPluginAvaiable");
            return;
        }
        if (message == null || !(message.obj instanceof String)) {
            LogUtil.j("HwOtaUpgradeManager", "processPluginLoadTimeout msg is null");
            return;
        }
        String str = (String) message.obj;
        ohf.e().c("PluginWearAbility");
        nvd.b(nvd.e(), str, BaseApplication.getContext());
    }

    public void c(final String str, final InitCallback initCallback) {
        if (ohf.e().d("PluginWearAbility")) {
            LogUtil.j("HwOtaUpgradeManager", "initDueSdk PluginWearOtaProxy is no download");
        } else {
            mhs.a().getSwitchSetting("wlan_auto_update", new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.11
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    boolean z = (i == 0 && (obj instanceof String)) ? !"2".equals((String) obj) : false;
                    LogUtil.a("HwOtaUpgradeManager", "initDueSdk getSwitchSetting Code：", Integer.valueOf(i), ", isOpen:", Boolean.valueOf(z));
                    dad.c().initDueSdk(str, String.valueOf(z), initCallback);
                }
            });
        }
    }

    public void e(final DeviceInfo deviceInfo, final RefreshLittleRedListener refreshLittleRedListener) {
        dad.c().getNewVersion(deviceInfo.getDeviceUdid(), new CompleteCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.13
            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback
            public void complete(int i, String str) {
                HwOtaUpgradeManager.this.e(i, str, deviceInfo);
                nvi.e();
                RefreshLittleRedListener refreshLittleRedListener2 = refreshLittleRedListener;
                if (refreshLittleRedListener2 != null) {
                    refreshLittleRedListener2.refreshLittleRed();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public maw e(int i, String str, DeviceInfo deviceInfo) {
        nvd.a("", deviceInfo.getDeviceIdentify(), this.f17265a);
        maw mawVar = null;
        if (i != 0 || TextUtils.isEmpty(str)) {
            LogUtil.j("HwOtaUpgradeManager", "checkNewVersion newVersionInfo isEmpty or code is ", Integer.valueOf(i));
            return null;
        }
        try {
            maw mawVar2 = new maw();
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i2 = jSONObject.getInt("status");
                mawVar2.c(i2);
                int i3 = 0;
                if (i2 != 0) {
                    LogUtil.j("HwOtaUpgradeManager", "processVersionInfo not has new version, status:", Integer.valueOf(i2));
                    return mawVar2;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("checkResults");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(0);
                    String string = jSONObject2.getString("displayVerName");
                    nvd.a(string, deviceInfo.getDeviceIdentify(), this.f17265a);
                    mawVar2.d(string);
                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("upgradePackageList");
                    if (jSONArrayOptJSONArray2 != null) {
                        int iOptLong = 0;
                        while (i3 < jSONArrayOptJSONArray2.length()) {
                            iOptLong = (int) (((long) iOptLong) + jSONArrayOptJSONArray2.optJSONObject(i3).optLong("size"));
                            i3++;
                        }
                        i3 = iOptLong;
                    }
                    mawVar2.a(i3);
                }
                return mawVar2;
            } catch (JSONException unused) {
                mawVar = mawVar2;
                LogUtil.e("HwOtaUpgradeManager", "processVersionInfo JSONException");
                return mawVar;
            }
        } catch (JSONException unused2) {
        }
    }

    public void c(String str, String str2) {
        if (!dad.c().isPluginAvaiable()) {
            LogUtil.a("HwOtaUpgradeManager", "setSettingSwitch setValue plugin is not available, wifiSwitch:", str2);
        }
        dad.c().setSettingSwitch(str, str2);
    }

    public void d(final DeviceInfo deviceInfo, final ClearServiceListener clearServiceListener) {
        if (this.f17266b) {
            this.e.removeMessages(0);
            this.e.sendEmptyMessageDelayed(0, 30000L);
            LogUtil.j("HwOtaUpgradeManager", "silentUpgrade mIsChecking is true");
            b(clearServiceListener);
            return;
        }
        final boolean zA = mio.a(deviceInfo.getDeviceUdid());
        final boolean zD = nvd.d(nvd.b(this.f17265a, deviceInfo.getDeviceIdentify()), deviceInfo.getProductType());
        LogUtil.a("HwOtaUpgradeManager", "silentUpgrade isAlreadyCheck ", Boolean.valueOf(zD), " isHasNewVersion ", Boolean.valueOf(zA));
        if (zD && !zA) {
            b(clearServiceListener);
        } else {
            ThreadPoolManager.c().a("HwOtaUpgradeManager", new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.12
                @Override // java.lang.Runnable
                public void run() {
                    HwOtaUpgradeManager.this.e.removeMessages(4);
                    Message messageObtainMessage = HwOtaUpgradeManager.this.e.obtainMessage();
                    messageObtainMessage.what = 4;
                    messageObtainMessage.obj = deviceInfo.getDeviceIdentify();
                    HwOtaUpgradeManager.this.e.sendMessageDelayed(messageObtainMessage, 20000L);
                    dad.c().loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.12.5
                        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                        public boolean call(Context context, Intent intent) {
                            HwOtaUpgradeManager.this.e.removeMessages(4);
                            HwOtaUpgradeManager.this.e(deviceInfo, clearServiceListener, zA, zD);
                            return false;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final DeviceInfo deviceInfo, final ClearServiceListener clearServiceListener, final boolean z, final boolean z2) {
        c(deviceInfo.getDeviceUdid(), new InitCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.14
            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback
            public void onInitComplete(int i) {
                if (i == 0) {
                    HwOtaUpgradeManager.this.f17266b = true;
                    HwOtaUpgradeManager.this.e.sendEmptyMessageDelayed(0, 30000L);
                    if (!z) {
                        HwOtaUpgradeManager.this.e(deviceInfo, clearServiceListener);
                        return;
                    } else {
                        dad.c().getSettingSwitch(deviceInfo.getDeviceUdid(), new CompleteCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.14.5
                            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback
                            public void complete(int i2, String str) {
                                String str2;
                                HwOtaUpgradeManager.this.e.removeMessages(0);
                                LogUtil.a("HwOtaUpgradeManager", "requestNewVersion code:", Integer.valueOf(i2), ", wifiSwitch:", str);
                                mhs mhsVarA = mhs.a();
                                if ("1".equals(str)) {
                                    str2 = "1";
                                } else {
                                    str2 = "2";
                                }
                                mhsVarA.setSwitchSetting("wlan_auto_update", str2, null);
                                if (!z2 || ("1".equals(str) && !mio.a())) {
                                    HwOtaUpgradeManager.this.e.sendEmptyMessageDelayed(0, 30000L);
                                    HwOtaUpgradeManager.this.e(deviceInfo, clearServiceListener);
                                } else {
                                    LogUtil.j("HwOtaUpgradeManager", "requestNewVersion isHasNewVersion return");
                                }
                            }
                        });
                        return;
                    }
                }
                LogUtil.j("HwOtaUpgradeManager", "silentUpgrade onInitComplete code:", Integer.valueOf(i));
                HwOtaUpgradeManager.this.b(clearServiceListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final DeviceInfo deviceInfo, final ClearServiceListener clearServiceListener) {
        dad.c().silentUpgrade(deviceInfo.getDeviceUdid(), new CompleteCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.19
            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback
            public void complete(int i, String str) {
                HwOtaUpgradeManager.this.e.removeMessages(0);
                maw mawVarE = HwOtaUpgradeManager.this.e(i, str, deviceInfo);
                HwOtaUpgradeManager.this.f17266b = false;
                nvd.b(nvd.e(), deviceInfo.getDeviceIdentify(), HwOtaUpgradeManager.this.f17265a);
                if (mawVarE != null) {
                    HwOtaUpgradeManager.this.d(deviceInfo, mawVarE);
                }
                HwOtaUpgradeManager.this.b(clearServiceListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ClearServiceListener clearServiceListener) {
        if (clearServiceListener != null) {
            clearServiceListener.clearTask();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final DeviceInfo deviceInfo, final maw mawVar) {
        boolean zO = HwVersionManager.b(this.f17265a).o(deviceInfo.getDeviceIdentify());
        if (mawVar.d() != 0 || !zO) {
            LogUtil.j("HwOtaUpgradeManager", "handleBandSilenceOtaUpgrade not has new version");
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        maq.b().a(deviceIdentify, 1);
        maq.b().f(deviceIdentify);
        dad.c().getSettingSwitch(deviceInfo.getDeviceUdid(), new CompleteCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.16
            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback
            public void complete(int i, String str) {
                String str2;
                LogUtil.a("HwOtaUpgradeManager", "getSettingSwitch onVersionInfoObtain code:", Integer.valueOf(i), ", wifiSwitch:", str);
                mhs mhsVarA = mhs.a();
                if ("1".equals(str)) {
                    str2 = "1";
                } else {
                    str2 = "2";
                }
                mhsVarA.setSwitchSetting("wlan_auto_update", str2, null);
                if (!"1".equals(str) || mio.a()) {
                    HwOtaUpgradeManager.this.e(deviceInfo.getDeviceIdentify(), mawVar);
                } else {
                    LogUtil.j("HwOtaUpgradeManager", "handleBandSilenceOtaUpgrade sdk start ota");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, maw mawVar) {
        String deviceName;
        LogUtil.a("HwOtaUpgradeManager", "enter showBandAutoCheckDialog");
        String strC = mawVar.c();
        int iE = mawVar.e();
        String strA = mawVar.a();
        if (CommonUtil.x(this.f17265a) || mio.g()) {
            LogUtil.a("HwOtaUpgradeManager", "showBandAutoCheckDialog isBackground or isBandShowing");
            KeyValDbManager.d(this.f17265a).b("new_band_version", strC);
            KeyValDbManager.d(this.f17265a).b("new_band_size", String.valueOf(iE));
            KeyValDbManager.d(this.f17265a).b("new_band_change_log", strA);
            KeyValDbManager.d(this.f17265a).b("is_new_checkbox", String.valueOf(true));
            KeyValDbManager.d(this.f17265a).b("is_need_show_dialog", String.valueOf(true));
            KeyValDbManager.d(this.f17265a).b("need_show_dialog_time", nvd.e());
            KeyValDbManager.d(this.f17265a).b("need_show_dialog_mac", str);
            DeviceInfo deviceInfoE = maq.b().e(str);
            if (deviceInfoE == null) {
                deviceName = "";
            } else {
                deviceName = deviceInfoE.getDeviceName();
            }
            KeyValDbManager.d(this.f17265a).b("need_show_dialog_device_name", deviceName);
            return;
        }
        if (nty.d()) {
            LogUtil.a("HwOtaUpgradeManager", "HwOtaUpgradeManager showBandAutoCheckDialog is Sporting");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("name", strC);
            intent.putExtra("size", iE);
            intent.putExtra("message", strA);
            intent.putExtra(ParamConstants.CallbackMethod.ON_SHOW, true);
            intent.putExtra("isAW70", false);
            intent.addFlags(268435456);
            intent.putExtra("mac", str);
            intent.setClassName(this.f17265a.getPackageName(), "com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity");
            this.f17265a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("HwOtaUpgradeManager", "showBandAutoCheckDialog ActivityNotFoundException");
        }
    }

    public void c(final String str, final boolean z, final ClearServiceListener clearServiceListener) {
        final DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            LogUtil.j("HwOtaUpgradeManager", "checkNewVersion deviceInfo is null");
            return;
        }
        boolean zD = nvd.d(nvd.b(this.f17265a, str), deviceInfoE.getProductType());
        if (z && zD) {
            b(clearServiceListener);
            LogUtil.j("HwOtaUpgradeManager", "requestNewVersion isAuto is true and isAlreadyCheck");
            return;
        }
        Message messageObtain = Message.obtain();
        final int i = z ? 2 : 1;
        messageObtain.what = i;
        messageObtain.obj = d(str, clearServiceListener);
        this.e.sendMessageDelayed(messageObtain, 30000L);
        lvb.e().e(c(), new ITransferSleepAndDFXFileCallback.Stub() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.18
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i2, String str2) throws RemoteException {
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i2, String str2, String str3) throws RemoteException {
                if (HwOtaUpgradeManager.this.e != null) {
                    HwOtaUpgradeManager.this.e.removeMessages(i);
                }
                LogUtil.a("HwOtaUpgradeManager", "autoRequestOtaFile() onSuccess successCode ", Integer.valueOf(i2), " transferDataContent ", str2, " transferStateContent ", str3);
                HwOtaUpgradeManager.this.a(str2, z, deviceInfoE, clearServiceListener);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i2, String str2) throws RemoteException {
                if (HwOtaUpgradeManager.this.e != null) {
                    HwOtaUpgradeManager.this.e.removeMessages(i);
                }
                HwOtaUpgradeManager.this.b(clearServiceListener);
                if (z) {
                    return;
                }
                nvg.d(11, 0, "", "", str);
            }
        });
    }

    private mhp c() {
        mhp mhpVar = new mhp();
        mhpVar.a("ota_request");
        mhpVar.c(21);
        mhpVar.e(false);
        mhpVar.c((int[]) null);
        mhpVar.d(null);
        return mhpVar;
    }

    private JSONObject d(String str, ClearServiceListener clearServiceListener) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mac", str);
            jSONObject.put("listener", clearServiceListener);
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("HwOtaUpgradeManager", "JSONException");
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final boolean z, DeviceInfo deviceInfo, final ClearServiceListener clearServiceListener) {
        LogUtil.a("HwOtaUpgradeManager", "requestOtaDetection enter isAuto ", Boolean.valueOf(z));
        final String deviceIdentify = deviceInfo.getDeviceIdentify();
        final String strC = c(str);
        if (TextUtils.isEmpty(strC)) {
            if (!z) {
                nvg.d(11, 12, "", "", deviceIdentify);
            }
            b(clearServiceListener);
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.arg1 = !z ? 1 : 0;
        messageObtain.obj = d(deviceIdentify, clearServiceListener);
        this.e.removeMessages(3);
        this.e.sendMessageDelayed(messageObtain, 30000L);
        ThreadPoolManager.c().a("HwOtaUpgradeManager", new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.20
            @Override // java.lang.Runnable
            public void run() {
                Message messageObtainMessage = HwOtaUpgradeManager.this.e.obtainMessage();
                messageObtainMessage.what = 4;
                messageObtainMessage.obj = deviceIdentify;
                HwOtaUpgradeManager.this.e.sendMessageDelayed(messageObtainMessage, 20000L);
                dad.c().loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.20.1
                    @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                    public boolean call(Context context, Intent intent) {
                        HwOtaUpgradeManager.this.e.removeMessages(4);
                        HwOtaUpgradeManager.this.a(strC, z, deviceIdentify, clearServiceListener);
                        return false;
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final boolean z, final String str2, final ClearServiceListener clearServiceListener) {
        dad.c().checkNewVersion(a(str), new CompleteCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.1
            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback
            public void complete(int i, String str3) {
                LogUtil.a("HwOtaUpgradeManager", "requestOtaDetection status ", Integer.valueOf(i));
                HwOtaUpgradeManager.this.e.removeMessages(3);
                if (i == 0) {
                    HwOtaUpgradeManager.this.b(str3, z, str2, clearServiceListener);
                    return;
                }
                if (!z) {
                    nvg.d(11, 12, "", "", str2);
                }
                HwOtaUpgradeManager.this.b(clearServiceListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, boolean z, String str2, ClearServiceListener clearServiceListener) {
        nvd.b(nvd.e(), str2, BaseApplication.getContext());
        if (!TextUtils.isEmpty(str)) {
            LogUtil.a("HwOtaUpgradeManager", "requestOtaDetection versionList ", str);
            String strD = d(str2, str);
            if (!TextUtils.isEmpty(strD)) {
                nvg.c();
                if (z) {
                    mbe mbeVar = new mbe();
                    mbeVar.b(str2);
                    mbeVar.d(nvd.i(BaseApplication.getContext(), str2));
                    mbeVar.c(CommonUtil.i(nvd.e(BaseApplication.getContext(), str2, strD)));
                    mbeVar.e(System.currentTimeMillis() / 1000);
                    mbeVar.a(1);
                    mbeVar.e(2);
                    mbc.b().d(mbeVar);
                } else {
                    nvg.d(32, 13, "", "", str2);
                }
            } else if (!z) {
                nvg.d(11, 0, "", "", str2);
            }
        } else if (!z) {
            nvg.d(11, 12, "", "", str2);
        }
        b(clearServiceListener);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0097  */
    private String d(String str, String str2) {
        String patchDisplayVersion;
        long patchByteSize;
        String str3;
        String patchChangeLogContent;
        NewVersionBean newVersionBean = (NewVersionBean) new Gson().fromJson(str2, NewVersionBean.class);
        LogUtil.a("HwOtaUpgradeManager", "saveDeviceData versionInfo ", newVersionBean.toString());
        if (!TextUtils.isEmpty(newVersionBean.getHotaDisplayVersion())) {
            patchDisplayVersion = newVersionBean.getHotaDisplayVersion();
            patchChangeLogContent = newVersionBean.getHotaChangeLogContent();
            patchByteSize = newVersionBean.getHotaByteSize();
            if (!TextUtils.isEmpty(newVersionBean.getPatchDisplayVersion())) {
                StringBuilder sb = new StringBuilder(16);
                sb.append(newVersionBean.getHotaChangeLogContent());
                sb.append(System.lineSeparator());
                sb.append(newVersionBean.getPatchChangeLogContent());
                patchChangeLogContent = sb.toString();
                patchByteSize = newVersionBean.getHotaByteSize() + newVersionBean.getPatchByteSize();
            }
        } else {
            if (!TextUtils.isEmpty(newVersionBean.getPatchDisplayVersion())) {
                patchDisplayVersion = newVersionBean.getPatchDisplayVersion();
                patchChangeLogContent = newVersionBean.getPatchChangeLogContent();
                patchByteSize = newVersionBean.getPatchByteSize();
            } else {
                LogUtil.j("HwOtaUpgradeManager", "saveDeviceData default");
                patchDisplayVersion = "";
                patchByteSize = 0;
                str3 = "";
            }
            long j = patchByteSize;
            if (patchDisplayVersion.contains(" ")) {
                patchDisplayVersion = patchDisplayVersion.substring(patchDisplayVersion.indexOf(" ")).trim();
            }
            LogUtil.a("HwOtaUpgradeManager", "saveDeviceData newVersion ", patchDisplayVersion, " newChangeLog ", str3, " newByteSize ", Long.valueOf(j));
            nvd.a(patchDisplayVersion, str, BaseApplication.getContext());
            nvd.b(str3.trim(), this.f17265a, patchDisplayVersion, str);
            nvd.d(str, String.valueOf(j), patchDisplayVersion, this.f17265a);
            nvd.d(String.valueOf(j), BaseApplication.getContext(), patchDisplayVersion, str);
            nvd.c(qrs.a(this.f17265a, j), BaseApplication.getContext(), patchDisplayVersion, str);
            return patchDisplayVersion;
        }
        str3 = patchChangeLogContent;
        long j2 = patchByteSize;
        if (patchDisplayVersion.contains(" ")) {
            patchDisplayVersion = patchDisplayVersion.substring(patchDisplayVersion.indexOf(" ")).trim();
        }
        LogUtil.a("HwOtaUpgradeManager", "saveDeviceData newVersion ", patchDisplayVersion, " newChangeLog ", str3, " newByteSize ", Long.valueOf(j2));
        nvd.a(patchDisplayVersion, str, BaseApplication.getContext());
        nvd.b(str3.trim(), this.f17265a, patchDisplayVersion, str);
        nvd.d(str, String.valueOf(j2), patchDisplayVersion, this.f17265a);
        nvd.d(String.valueOf(j2), BaseApplication.getContext(), patchDisplayVersion, str);
        nvd.c(qrs.a(this.f17265a, j2), BaseApplication.getContext(), patchDisplayVersion, str);
        return patchDisplayVersion;
    }

    private String c(String str) {
        String str2 = "";
        FileInputStream fileInputStreamOpenInputStream = null;
        try {
            try {
                File file = FileUtils.getFile(str);
                fileInputStreamOpenInputStream = FileUtils.openInputStream(file);
                long length = file.length();
                LogUtil.a("HwOtaUpgradeManager", "getRequestDateString fileLength ", Long.valueOf(length));
                byte[] bArr = new byte[(int) length];
                int i = fileInputStreamOpenInputStream.read(bArr);
                if (i == length) {
                    LogUtil.a("HwOtaUpgradeManager", "read inputStream success.");
                }
                if (i > 0) {
                    str2 = new String(bArr, "UTF-8");
                }
            } catch (IOException unused) {
                LogUtil.e("HwOtaUpgradeManager", "getRequestDateString getFileByte : IOException");
            }
            IoUtils.c(fileInputStreamOpenInputStream);
            LogUtil.a("HwOtaUpgradeManager", "getRequestDateString data ", CommonUtil.n(str2));
            return str2;
        } catch (Throwable th) {
            IoUtils.c(fileInputStreamOpenInputStream);
            throw th;
        }
    }

    private String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageName", BaseApplication.getContext().getPackageName());
            jSONObject.put("devUpgradeInfoJson", str);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            String strG = nvd.g();
            LogUtil.a("HwOtaUpgradeManager", "buildCheckInfo language ", strG);
            jSONObject3.put("language", strG);
            jSONObject2.put("dynamicInfo", jSONObject3.toString());
            jSONObject.put("upgradeInfoJson", jSONObject2.toString());
            if (CommonUtil.ap() && TextUtils.equals(nvd.i(BaseApplication.getContext()), "test_mode")) {
                jSONObject.put("isGrsSwitch", false);
                jSONObject.put("defaultDomain", "");
            } else {
                jSONObject.put("isGrsSwitch", true);
            }
        } catch (JSONException e) {
            LogUtil.e("HwOtaUpgradeManager", "buildCheckInfo JSONException:", e.toString());
        }
        return jSONObject.toString();
    }

    private void b(String str) {
        Intent intent = new Intent("action_app_check_new_version_state");
        intent.addFlags(C.ENCODING_PCM_32BIT_BIG_ENDIAN);
        intent.putExtra("result", 0);
        intent.putExtra("state", 11);
        intent.putExtra("extra_band_imei", str);
        intent.setPackage(BaseApplication.getAppPackage());
        this.f17265a.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public boolean e(String str) {
        return eey.d(max.c().g(str), 108) && !Utils.k();
    }

    public void d(final String str, final DeviceInfo deviceInfo, final ICheckCallback iCheckCallback) {
        LogUtil.a("HwOtaUpgradeManager", "enter getDeviceNewVersion");
        dad.c().loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.4
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public boolean call(Context context, Intent intent) {
                HwOtaUpgradeManager.this.b(deviceInfo, iCheckCallback, str);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final DeviceInfo deviceInfo, final ICheckCallback iCheckCallback, final String str) {
        c(deviceInfo.getDeviceUdid(), new InitCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.2
            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback
            public void onInitComplete(int i) {
                LogUtil.a("HwOtaUpgradeManager", "initGetDeviceNewVersion onInitComplete code:", Integer.valueOf(i));
                dad.c().getDeviceNewVersion(deviceInfo.getDeviceUdid(), new CompleteCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.2.4
                    @Override // com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback
                    public void complete(int i2, String str2) {
                        try {
                            if (iCheckCallback != null) {
                                iCheckCallback.onCheckComplete(str, str2);
                            }
                        } catch (RemoteException unused) {
                            LogUtil.e("HwOtaUpgradeManager", "getDeviceNewVersion RemoteException");
                        }
                    }
                });
            }
        });
    }

    public void d(final String str, final DeviceInfo deviceInfo, final String str2, final IUpgradeCallBack iUpgradeCallBack) {
        LogUtil.a("HwOtaUpgradeManager", "enter doUpgrade");
        dad.c().loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.5
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public boolean call(Context context, Intent intent) {
                HwOtaUpgradeManager.this.c(deviceInfo, str2, iUpgradeCallBack, str);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final DeviceInfo deviceInfo, final String str, final IUpgradeCallBack iUpgradeCallBack, final String str2) {
        c(deviceInfo.getDeviceUdid(), new InitCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.6
            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback
            public void onInitComplete(int i) {
                LogUtil.a("HwOtaUpgradeManager", "initDoUpgrade onInitComplete code:", Integer.valueOf(i));
                dad.c().doUpgrade(deviceInfo.getDeviceUdid(), str, new CompleteCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.6.4
                    @Override // com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback
                    public void complete(int i2, String str3) {
                        try {
                            if (iUpgradeCallBack != null) {
                                iUpgradeCallBack.onUpgradeStatus(str2, str3);
                            }
                        } catch (RemoteException unused) {
                            LogUtil.e("HwOtaUpgradeManager", "doUpgrade RemoteException");
                        }
                    }
                });
            }
        });
    }

    public void c(final String str, final IUpgradeStatusCallBack iUpgradeStatusCallBack) {
        LogUtil.a("HwOtaUpgradeManager", "enter getUpgradeStatus");
        final DeviceInfo deviceInfoG = max.c().g(str);
        if (deviceInfoG == null) {
            LogUtil.j("HwOtaUpgradeManager", "getUpgradeStatus deviceInfo is null");
            b(str, iUpgradeStatusCallBack);
        } else {
            dad.c().loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.10
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context, Intent intent) {
                    HwOtaUpgradeManager.this.b(deviceInfoG, iUpgradeStatusCallBack, str);
                    return false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final DeviceInfo deviceInfo, final IUpgradeStatusCallBack iUpgradeStatusCallBack, final String str) {
        c(deviceInfo.getDeviceUdid(), new InitCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.7
            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback
            public void onInitComplete(int i) {
                LogUtil.a("HwOtaUpgradeManager", "initGetUpgradeStatus onInitComplete code:", Integer.valueOf(i));
                dad.c().getUpgradeStatus(deviceInfo.getDeviceUdid(), new CompleteCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.7.1
                    @Override // com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback
                    public void complete(int i2, String str2) {
                        try {
                            if (iUpgradeStatusCallBack != null) {
                                iUpgradeStatusCallBack.onStatus(str, str2);
                            }
                        } catch (RemoteException unused) {
                            LogUtil.e("HwOtaUpgradeManager", "getUpgradeStatus RemoteException");
                        }
                    }
                });
            }
        });
    }

    private void b(String str, IUpgradeStatusCallBack iUpgradeStatusCallBack) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 5);
            jSONObject.put("errorCode", 11);
            jSONObject.put("errorMsg", max.c().d(11));
            iUpgradeStatusCallBack.onStatus(str, jSONObject.toString());
        } catch (RemoteException unused) {
            LogUtil.e("HwOtaUpgradeManager", "onError RemoteException");
        } catch (JSONException unused2) {
            LogUtil.e("HwOtaUpgradeManager", "onError JSONException");
        }
    }

    public void d(final String str, final IUpgradeStatusCallBack iUpgradeStatusCallBack) {
        LogUtil.a("HwOtaUpgradeManager", "enter registerUpgradeListener");
        final DeviceInfo deviceInfoG = max.c().g(str);
        if (deviceInfoG == null) {
            LogUtil.j("HwOtaUpgradeManager", "registerUpgradeListener deviceInfo is null");
            b(str, iUpgradeStatusCallBack);
        } else {
            dad.c().loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.8
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context, Intent intent) {
                    HwOtaUpgradeManager.this.a(deviceInfoG, iUpgradeStatusCallBack, str);
                    return false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final DeviceInfo deviceInfo, final IUpgradeStatusCallBack iUpgradeStatusCallBack, final String str) {
        c(deviceInfo.getDeviceUdid(), new InitCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.9
            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback
            public void onInitComplete(int i) {
                LogUtil.a("HwOtaUpgradeManager", "initRegisterUpgradeListener onInitComplete code:", Integer.valueOf(i));
                dad.c().registerUpgradeListener(deviceInfo.getDeviceUdid(), new CompleteCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.9.5
                    @Override // com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback
                    public void complete(int i2, String str2) {
                        try {
                            if (iUpgradeStatusCallBack != null) {
                                iUpgradeStatusCallBack.onStatus(str, str2);
                            }
                        } catch (RemoteException | IllegalStateException e) {
                            LogUtil.e("HwOtaUpgradeManager", "registerUpgradeListener RemoteException | IllegalStateException ", ExceptionUtils.c(e));
                        }
                    }
                });
            }
        });
    }

    public void d(String str) {
        LogUtil.a("HwOtaUpgradeManager", "enter unRegisterUpgradeListener");
        final DeviceInfo deviceInfoG = max.c().g(str);
        if (deviceInfoG == null) {
            LogUtil.j("HwOtaUpgradeManager", "unRegisterUpgradeListener deviceInfo is null");
        } else {
            dad.c().loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.15
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context, Intent intent) {
                    HwOtaUpgradeManager.this.c(deviceInfoG.getDeviceUdid(), new InitCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.15.3
                        @Override // com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback
                        public void onInitComplete(int i) {
                            LogUtil.a("HwOtaUpgradeManager", "unRegisterUpgradeListener onInitComplete code:", Integer.valueOf(i));
                            dad.c().unRegisterUpgradeListener(deviceInfoG.getDeviceUdid());
                        }
                    });
                    return false;
                }
            });
        }
    }
}
