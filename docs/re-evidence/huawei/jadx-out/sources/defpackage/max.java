package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.datatype.DataDeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.PowerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.ExecuteMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwotamanager.ICheckCallback;
import com.huawei.hwotamanager.IDeviceListCallback;
import com.huawei.hwotamanager.IUpgradeCallBack;
import com.huawei.hwotamanager.IUpgradeStatusCallBack;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class max {
    private static max d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f41302a = new HashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Integer> f41303b = new HashMap(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, ICheckCallback> f41304c = new HashMap(16);
    private Map<String, IUpgradeCallBack> j = new HashMap(16);
    private Map<String, IUpgradeStatusCallBack> f = new HashMap(16);

    private max() {
    }

    public static max c() {
        max maxVar;
        synchronized (e) {
            if (d == null) {
                d = new max();
            }
            maxVar = d;
        }
        return maxVar;
    }

    public int b(String str) {
        int iIntValue = this.f41302a.containsKey(str) ? this.f41302a.get(str).intValue() : 0;
        LogUtil.a("HwUpdateUtil", "getOtaDownloadProgress mac ", CommonUtil.n(str), " downloadProgress ", Integer.valueOf(iIntValue));
        return iIntValue;
    }

    public void d(String str, int i) {
        LogUtil.a("HwUpdateUtil", "setOtaDownloadProgress mac ", CommonUtil.n(str), " progress ", Integer.valueOf(i));
        this.f41302a.put(str, Integer.valueOf(i));
    }

    public int i(String str) {
        int iIntValue = this.f41303b.containsKey(str) ? this.f41303b.get(str).intValue() : 0;
        LogUtil.a("HwUpdateUtil", "getOtaTransferProgress mac ", CommonUtil.n(str), " transferProgress ", Integer.valueOf(iIntValue));
        return iIntValue;
    }

    public void e(String str, int i) {
        LogUtil.a("HwUpdateUtil", "setOtaTransferProgress mac ", CommonUtil.n(str), " progress ", Integer.valueOf(i));
        this.f41303b.put(str, Integer.valueOf(i));
    }

    private DeviceCapability l(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwUpdateUtil", "capabilityNegotiation mac is empty");
            return null;
        }
        LogUtil.a("HwUpdateUtil", "serviceCapabilityNegotiation(mac):", CommonUtil.n(str));
        if (eej.a(str) == null) {
            DeviceInfo deviceInfoB = mgg.b(str, "HwUpdateUtil");
            if (deviceInfoB != null && deviceInfoB.getDeviceConnectState() == 2) {
                Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "HwUpdateUtil");
                if (mapD != null && mapD.get(str) != null) {
                    eej.a(str, mapD.get(str));
                    return mapD.get(str);
                }
                LogUtil.j("HwUpdateUtil", "serviceCapabilityNegotiation(mac) cap is null");
                return null;
            }
            LogUtil.j("HwUpdateUtil", "serviceCapabilityNegotiation(mac) device is not connected");
            return null;
        }
        return eej.a(str);
    }

    public DeviceInfo g(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HwUpdateUtil", "getUuidDeviceInfo uuid is null");
            return null;
        }
        LogUtil.a("HwUpdateUtil", "getUuidDeviceInfo uuid ", CommonUtil.n(str));
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwUpdateUtil");
        if (deviceList != null && deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (TextUtils.equals(str, deviceInfo.getUuid()) || TextUtils.equals(str, deviceInfo.getDeviceUdid())) {
                    return deviceInfo;
                }
            }
        }
        return null;
    }

    public String d(String str) {
        LogUtil.a("HwUpdateUtil", "getCurrentDeviceUuid mac ", CommonUtil.n(str));
        DeviceInfo deviceInfoC = mgg.c(str, "HwUpdateUtil");
        if (deviceInfoC != null && str.equals(deviceInfoC.getDeviceIdentify())) {
            if (!TextUtils.isEmpty(deviceInfoC.getDeviceUdid())) {
                return deviceInfoC.getDeviceUdid();
            }
            if (!TextUtils.isEmpty(deviceInfoC.getUuid())) {
                return deviceInfoC.getUuid();
            }
            return "";
        }
        return "";
    }

    public void a(final IDeviceListCallback iDeviceListCallback) {
        if (iDeviceListCallback == null) {
            LogUtil.j("HwUpdateUtil", "getConnectedDevices deviceListCallback == null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: max.3
                @Override // java.lang.Runnable
                public void run() {
                    List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwUpdateUtil");
                    if (deviceList == null) {
                        LogUtil.a("HwUpdateUtil", "getConnectedDevices deviceInfoList == null");
                        ecu.d().executeDeviceRelatedLogic(ExecuteMode.FORCE_INIT_PHONE_SERVICE, null, "HwUpdateUtil");
                        try {
                            Thread.sleep(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                        } catch (InterruptedException e2) {
                            LogUtil.e("HwUpdateUtil", "getCurrentDeviceInfo InterruptedException ", ExceptionUtils.c(e2));
                        }
                        deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwUpdateUtil");
                    }
                    LogUtil.a("HwUpdateUtil", "getConnectedDevices deviceInfoList ", deviceList);
                    try {
                        iDeviceListCallback.onDeviceListObtain(max.this.c(deviceList).toString());
                    } catch (RemoteException e3) {
                        LogUtil.e("HwUpdateUtil", "getConnectedDevices RemoteException ", ExceptionUtils.c(e3));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject c(List<DeviceInfo> list) {
        JSONObject jSONObject = new JSONObject();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    LogUtil.a("HwUpdateUtil", "getConnectedDevices deviceList ", list.toString());
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put("status", 0);
                    for (DeviceInfo deviceInfo : list) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", deviceInfo.getDeviceName());
                        if (TextUtils.isEmpty(deviceInfo.getDeviceUdid())) {
                            jSONObject2.put("uuid", deviceInfo.getUuid());
                        } else {
                            jSONObject2.put("uuid", deviceInfo.getDeviceUdid());
                        }
                        jSONObject2.put("model", deviceInfo.getDeviceModel());
                        jSONObject2.put("productType", deviceInfo.getProductType());
                        jSONObject2.put(BleConstants.KEY_CONNECTSTATE, deviceInfo.getDeviceConnectState());
                        DeviceCapability deviceCapabilityL = l(deviceInfo.getDeviceIdentify());
                        if (deviceCapabilityL != null && deviceCapabilityL.isOtaUpdate()) {
                            jSONObject2.put("supportOTA", true);
                        } else {
                            jSONObject2.put("supportOTA", false);
                        }
                        jSONObject2.put("version", deviceInfo.getSoftVersion());
                        JSONObject jSONObject3 = new JSONObject();
                        e(deviceInfo, jSONObject2, jSONObject3);
                        jSONObject2.put(KnitFragment.KEY_EXTRA, jSONObject3);
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("deviceList", jSONArray);
                    return jSONObject;
                }
            } catch (JSONException e2) {
                LogUtil.e("HwUpdateUtil", "getConnectedDevices JSONException ", ExceptionUtils.c(e2));
                return jSONObject;
            }
        }
        jSONObject.put("status", 1);
        jSONObject.put("errorCode", 10);
        jSONObject.put("errorMsg", d(10));
        return jSONObject;
    }

    private void e(DeviceInfo deviceInfo, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (lvi.a(deviceInfo.getProductType()).b() == -1) {
            jSONObject2.put("deviceType", -1);
            lvi.i();
        } else if (lvi.f(deviceInfo.getProductType())) {
            jSONObject2.put("deviceType", 0);
        } else {
            jSONObject2.put("deviceType", 1);
        }
        jSONObject2.put(HealthEngineRequestManager.PARAMS_DEVICE_SN, deviceInfo.getSecurityDeviceId());
        if (HwOtaUpgradeManager.d().e(deviceInfo.getUuid())) {
            jSONObject.put("supportOTA", true);
            jSONObject2.put("otaType", 1);
        }
    }

    public void c(String str, ICheckCallback iCheckCallback) {
        if (iCheckCallback == null) {
            LogUtil.j("HwUpdateUtil", "setNewVersionStatus checkCallback == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 1);
            jSONObject.put("errorCode", 11);
            jSONObject.put("errorMsg", d(11));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status", 1);
            jSONObject2.put("newVersionInfoList", new JSONArray());
            jSONObject.put("newVersionInfo", jSONObject2);
            LogUtil.a("HwUpdateUtil", "setNewVersionStatus statusJsonObject.toString() ", jSONObject.toString());
            iCheckCallback.onCheckComplete(str, jSONObject.toString());
        } catch (RemoteException e2) {
            LogUtil.e("HwUpdateUtil", "setNewVersionStatus RemoteException ", ExceptionUtils.c(e2));
        } catch (JSONException e3) {
            LogUtil.e("HwUpdateUtil", "setNewVersionStatus JSONException ", ExceptionUtils.c(e3));
        }
    }

    public void b(String str, IUpgradeCallBack iUpgradeCallBack) {
        if (iUpgradeCallBack == null) {
            LogUtil.j("HwUpdateUtil", "setNewVersionStatus upgradeCallBack == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 1);
            jSONObject.put("errorCode", 11);
            jSONObject.put("errorMsg", d(11));
            iUpgradeCallBack.onUpgradeStatus(str, jSONObject.toString());
        } catch (RemoteException e2) {
            LogUtil.e("HwUpdateUtil", "setUpgradeStatus RemoteException ", ExceptionUtils.c(e2));
        } catch (JSONException e3) {
            LogUtil.e("HwUpdateUtil", "setUpgradeStatus JSONException ", ExceptionUtils.c(e3));
        }
    }

    public void b(String str, IUpgradeStatusCallBack iUpgradeStatusCallBack) {
        if (iUpgradeStatusCallBack == null) {
            LogUtil.j("HwUpdateUtil", "getUpgradeStatus upgradeStatusCallBack == null");
            return;
        }
        DeviceInfo deviceInfoG = g(str);
        try {
            JSONObject jSONObject = new JSONObject();
            if (deviceInfoG == null) {
                jSONObject.put("status", 5);
                jSONObject.put("errorCode", 11);
                jSONObject.put("errorMsg", d(11));
                iUpgradeStatusCallBack.onStatus(str, jSONObject.toString());
                return;
            }
            int iD = d(deviceInfoG);
            int i = 0;
            LogUtil.a("HwUpdateUtil", "getUpgradeStatus upgradeStatusCallBack status ", Integer.valueOf(iD));
            if (iD == -1) {
                jSONObject.put("status", -1);
                jSONObject.put("errorCode", 0);
                jSONObject.put("errorMsg", d(0));
                iUpgradeStatusCallBack.onStatus(str, jSONObject.toString());
                return;
            }
            b(iD, jSONObject, str, 0, iUpgradeStatusCallBack);
            if (iD == 1) {
                i = b(deviceInfoG.getDeviceIdentify());
            } else if (iD != 3) {
                LogUtil.j("HwUpdateUtil", "getUpgradeStatus progress");
            } else {
                i = i(deviceInfoG.getDeviceIdentify());
            }
            jSONObject.put("status", iD);
            jSONObject.put("progress", i);
            iUpgradeStatusCallBack.onStatus(str, jSONObject.toString());
        } catch (RemoteException e2) {
            LogUtil.e("HwUpdateUtil", "getUpgradeStatus RemoteException ", ExceptionUtils.c(e2));
        } catch (JSONException e3) {
            LogUtil.e("HwUpdateUtil", "getUpgradeStatus JSONException ", ExceptionUtils.c(e3));
        }
    }

    private void b(int i, JSONObject jSONObject, String str, int i2, IUpgradeStatusCallBack iUpgradeStatusCallBack) {
        if (i == 0) {
            try {
                jSONObject.put("status", 0);
                jSONObject.put("errorCode", 13);
                jSONObject.put("errorMsg", d(13));
                jSONObject.put("progress", i2);
                iUpgradeStatusCallBack.onStatus(str, jSONObject.toString());
            } catch (RemoteException e2) {
                LogUtil.e("HwUpdateUtil", "handleStatusInitial RemoteException ", ExceptionUtils.c(e2));
            } catch (JSONException e3) {
                LogUtil.e("HwUpdateUtil", "handleStatusInitial JSONException ", ExceptionUtils.c(e3));
            }
        }
    }

    public int d(DeviceInfo deviceInfo) {
        int i = -1;
        if (deviceInfo == null) {
            return -1;
        }
        String strI = nvd.i(BaseApplication.getContext(), deviceInfo.getDeviceIdentify());
        if (!TextUtils.isEmpty(strI) && !deviceInfo.getDeviceIdentify().equals(strI)) {
            i = 0;
        }
        int iC = maq.b().c(deviceInfo.getDeviceIdentify());
        if (iC == 3) {
            return 1;
        }
        if (iC == 4 || iC == 6) {
            return 3;
        }
        LogUtil.j("HwUpdateUtil", "getOtaUpgradeStatus upgradeStatus");
        return i;
    }

    public void d(String str, IUpgradeStatusCallBack iUpgradeStatusCallBack) {
        if (iUpgradeStatusCallBack == null) {
            LogUtil.j("HwUpdateUtil", "registerUpgradeListener upgradeStatusCallBack == null");
            return;
        }
        try {
            if (g(str) == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", 1);
                jSONObject.put("errorCode", 11);
                jSONObject.put("errorMsg", d(11));
                iUpgradeStatusCallBack.onStatus(str, jSONObject.toString());
                return;
            }
            e(str, iUpgradeStatusCallBack);
        } catch (RemoteException e2) {
            LogUtil.e("HwUpdateUtil", "getConnectedDevices RemoteException ", ExceptionUtils.c(e2));
        } catch (JSONException e3) {
            LogUtil.e("HwUpdateUtil", "getConnectedDevices JSONException ", ExceptionUtils.c(e3));
        }
    }

    public void d(String str, ICheckCallback iCheckCallback) {
        LogUtil.a("HwUpdateUtil", "setCheckCallback uuid ", CommonUtil.n(str), " checkCallback ", iCheckCallback);
        this.f41304c.put(str, iCheckCallback);
    }

    public ICheckCallback c(String str) {
        String strD = d(str);
        LogUtil.a("HwUpdateUtil", "getCheckCallback uuid ", CommonUtil.n(strD));
        if (this.f41304c.containsKey(strD)) {
            return this.f41304c.get(strD);
        }
        return null;
    }

    public void c(String str, int i) {
        ICheckCallback iCheckCallbackC = c(str);
        if (iCheckCallbackC != null) {
            String strD = d(str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", 1);
                jSONObject.put("errorCode", i);
                jSONObject.put("errorMsg", d(i));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("status", 1);
                jSONObject2.put("newVersionInfoList", new JSONArray());
                jSONObject.put("newVersionInfo", jSONObject2);
                LogUtil.a("HwUpdateUtil", "checkOtaStatus statusJsonObject.toString() ", jSONObject.toString());
                iCheckCallbackC.onCheckComplete(strD, jSONObject.toString());
            } catch (RemoteException e2) {
                LogUtil.e("HwUpdateUtil", "checkOtaStatus RemoteException ", ExceptionUtils.c(e2));
            } catch (JSONException e3) {
                LogUtil.e("HwUpdateUtil", "checkOtaStatus JSONException ", ExceptionUtils.c(e3));
            }
            d(strD, (ICheckCallback) null);
        }
    }

    public void e(String str) {
        String strE = HwVersionManager.b(BaseApplication.getContext()).e(str);
        String strJ = HwVersionManager.b(BaseApplication.getContext()).j(str);
        if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strJ) || strE.equals(strJ)) {
            c(str, 0);
            LogUtil.a("HwUpdateUtil", "checkOtaSuccess bandCurrentVersion or checkBandNewVersion is null || version is equal");
            return;
        }
        ICheckCallback iCheckCallbackC = c(str);
        if (iCheckCallbackC != null) {
            String strD = d(str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", 0);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("status", 0);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("currentVersion", strE);
                jSONObject3.put("targetVersion", strJ);
                jSONObject3.put("packageSize", nvd.e(BaseApplication.getContext(), str, strJ));
                jSONObject3.put("packageSizeUnit", "Byte");
                jSONObject3.put("changeLog", nvd.c(BaseApplication.getContext(), strJ, str));
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject3);
                jSONObject2.put("newVersionInfoList", jSONArray);
                jSONObject.put("newVersionInfo", jSONObject2);
                LogUtil.a("HwUpdateUtil", "checkOtaSuccess jsonObject.toString() ", jSONObject.toString());
                iCheckCallbackC.onCheckComplete(strD, jSONObject.toString());
            } catch (RemoteException e2) {
                LogUtil.e("HwUpdateUtil", "checkOtaSuccess RemoteException ", ExceptionUtils.c(e2));
            } catch (JSONException e3) {
                LogUtil.e("HwUpdateUtil", "checkOtaSuccess JSONException ", ExceptionUtils.c(e3));
            }
            d(strD, (ICheckCallback) null);
        }
    }

    public void c(String str, IUpgradeCallBack iUpgradeCallBack) {
        LogUtil.a("HwUpdateUtil", "setUpgradeCallBack uuid ", CommonUtil.n(str), " callback ", iUpgradeCallBack);
        this.j.put(str, iUpgradeCallBack);
    }

    public IUpgradeCallBack j(String str) {
        String strD = d(str);
        LogUtil.a("HwUpdateUtil", "getUpgradeCallBack uuid ", CommonUtil.n(strD));
        if (this.j.containsKey(strD)) {
            return this.j.get(strD);
        }
        return null;
    }

    public void e(String str, int i, int i2) {
        IUpgradeCallBack iUpgradeCallBackJ = j(str);
        if (iUpgradeCallBackJ != null) {
            String strD = d(str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", i);
                jSONObject.put("errorCode", i2);
                jSONObject.put("errorMsg", d(i2));
                LogUtil.a("HwUpdateUtil", "doUpgradeOtaStatus jsonObject.toString() ", jSONObject.toString());
                iUpgradeCallBackJ.onUpgradeStatus(strD, jSONObject.toString());
            } catch (RemoteException e2) {
                LogUtil.e("HwUpdateUtil", "doUpgradeOtaStatus RemoteException ", ExceptionUtils.c(e2));
            } catch (JSONException e3) {
                LogUtil.e("HwUpdateUtil", "doUpgradeOtaStatus JSONException ", ExceptionUtils.c(e3));
            }
            c(strD, (IUpgradeCallBack) null);
        }
    }

    public void a(String str) {
        IUpgradeCallBack iUpgradeCallBackJ = j(str);
        if (iUpgradeCallBackJ != null) {
            String strD = d(str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", 0);
                jSONObject.put("errorCode", 13);
                jSONObject.put("errorMsg", d(13));
                LogUtil.a("HwUpdateUtil", "doUpgradeSuccess jsonObject.toString() ", jSONObject.toString());
                iUpgradeCallBackJ.onUpgradeStatus(strD, jSONObject.toString());
            } catch (RemoteException e2) {
                LogUtil.e("HwUpdateUtil", "doUpgradeSuccess RemoteException ", ExceptionUtils.c(e2));
            } catch (JSONException e3) {
                LogUtil.e("HwUpdateUtil", "doUpgradeSuccess JSONException ", ExceptionUtils.c(e3));
            }
            c(strD, (IUpgradeCallBack) null);
        }
    }

    public void e(String str, IUpgradeStatusCallBack iUpgradeStatusCallBack) {
        LogUtil.a("HwUpdateUtil", "setUpgradeStatusCallBack uuid ", CommonUtil.n(str), " callback ", iUpgradeStatusCallBack);
        this.f.put(str, iUpgradeStatusCallBack);
    }

    public IUpgradeStatusCallBack f(String str) {
        String strD = d(str);
        LogUtil.a("HwUpdateUtil", "getUpgradeStatusCallBack uuid ", CommonUtil.n(strD));
        if (this.f.containsKey(strD)) {
            return this.f.get(strD);
        }
        return null;
    }

    public void b(int i, String str, int i2) {
        IUpgradeStatusCallBack iUpgradeStatusCallBackF = f(str);
        LogUtil.a("HwUpdateUtil", "onUpgradeStatus upgradeStatusCallBack ", iUpgradeStatusCallBackF);
        if (iUpgradeStatusCallBackF != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", i2);
                jSONObject.put("progress", i);
                iUpgradeStatusCallBackF.onStatus(d(str), jSONObject.toString());
                LogUtil.a("HwUpdateUtil", "onUpgradeStatus onStatus ", jSONObject.toString());
            } catch (RemoteException | IllegalStateException | JSONException e2) {
                LogUtil.e("HwUpdateUtil", "onUpgradeStatus onStatus Exception ", ExceptionUtils.c(e2));
            }
        }
    }

    public void d(int i, String str, int i2, String str2) {
        IUpgradeStatusCallBack iUpgradeStatusCallBackF = f(str);
        if (iUpgradeStatusCallBackF != null) {
            if (i2 == 1) {
                i2 = 5;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", i);
                jSONObject.put("errorCode", i2);
                if (TextUtils.isEmpty(str2)) {
                    str2 = d(i2);
                }
                jSONObject.put("errorMsg", str2);
                iUpgradeStatusCallBackF.onStatus(d(str), jSONObject.toString());
                LogUtil.a("R_OTA_HwUpdateUtil", "upgradeFailStatus onStatus ", jSONObject.toString());
            } catch (RemoteException e2) {
                LogUtil.e("HwUpdateUtil", "upgradeFailStatus onStatus RemoteException ", ExceptionUtils.c(e2));
            } catch (JSONException e3) {
                LogUtil.e("HwUpdateUtil", "upgradeFailStatus onStatus JSONException ", ExceptionUtils.c(e3));
            }
        }
    }

    public String d(int i) {
        if (i == 1 || i == 3) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_update_network_abnormal);
        }
        if (i == 5) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_update_download_check_failed);
        }
        if (i == 2) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_update_server_error);
        }
        if (i == 4) {
            return qrs.ah(BaseApplication.getContext()) ? BaseApplication.getContext().getString(R.string.IDS_pad_phone_low_battery, UnitUtil.e(10.0d, 2, 0)) : BaseApplication.getContext().getString(R.string.IDS_settings_firmware_upgrade_phone_low_battery);
        }
        if (i == 12) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_update_get_changelog_failed);
        }
        if (i == 0) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_me_settings_app_update);
        }
        if (i == 7) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_music_management_disconnection);
        }
        if (i == 10 || i == 11) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_equip_blutooth_disconnected);
        }
        if (i == 13) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_update_new_version_to_upgrade_app);
        }
        if (i == 14) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_update_low_memory);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_update_unknown_error);
    }

    public void e(DeviceInfo deviceInfo, nuf nufVar) {
        File[] fileArrListFiles;
        if (deviceInfo == null || nufVar == null) {
            return;
        }
        String str = BaseApplication.getContext().getFilesDir() + "changeLog" + File.separator + deviceInfo.getDeviceUdid();
        String str2 = deviceInfo.getSoftVersion() + "_changelog.xml";
        LogUtil.a("HwUpdateUtil", "deleteUnUseVersionChangeLog currentChangeLogFileName=", str2);
        String str3 = nufVar.g() + "_changelog.xml";
        LogUtil.a("HwUpdateUtil", "deleteUnUseVersionChangeLog newVersionChangeLogFileName=", str3);
        File file = new File(str);
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                LogUtil.d("HwUpdateUtil", "deleteUnUseVersionChangeLog fileName=", file2.getName());
                if (!file2.getName().equals(str2) && !file2.getName().equals(str3)) {
                    LogUtil.d("HwUpdateUtil", "deleteUnUseVersionChangeLog isDelete=", Boolean.valueOf(file2.delete()));
                }
            }
        }
    }

    public void o(String str) {
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA == null || !deviceCapabilityA.getIsSupportNotifyDeviceNewVersion()) {
            return;
        }
        int i = !CommonUtil.ab(BaseApplication.getContext()) ? 3 : 2;
        mbe mbeVar = new mbe();
        mbeVar.b(str);
        mbeVar.d("");
        mbeVar.c(0L);
        mbeVar.e(System.currentTimeMillis() / 1000);
        mbeVar.a(i);
        mbeVar.e(0);
        mbc.b().d(mbeVar);
    }

    public void e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(26), "electronicPrefix" + nio.c(deviceInfo.getUuid()));
        if (!TextUtils.isEmpty(strE)) {
            LogUtil.a("HwUpdateUtil", "is electronic card");
            HwVersionManager.b(BaseApplication.getContext()).e(true);
        } else {
            LogUtil.j("HwUpdateUtil", "is not electronic card");
            HwVersionManager.b(BaseApplication.getContext()).e(false);
        }
        nvd.a(deviceInfo.getDeviceIdentify(), "checkElectronic", String.valueOf(!TextUtils.isEmpty(strE)));
    }

    public void b(String str, String str2, nuf nufVar) {
        String str3;
        if (str == null || str2 == null || nufVar == null) {
            LogUtil.j("HwUpdateUtil", "saveChangelog deviceInfo is null");
            return;
        }
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            LogUtil.j("HwUpdateUtil", "saveChangelog deviceInfo is null");
            return;
        }
        num numVarE = nuw.e(deviceInfoE.getSecurityDeviceId());
        if (numVarE != null && numVarE.j() != null) {
            str3 = numVarE.j().split("full/")[0] + "full/changelog.xml";
        } else {
            str3 = "";
        }
        e(deviceInfoE, nufVar);
        String str4 = deviceInfoE.getDeviceUdid() + "_" + nvd.i(BaseApplication.getContext(), str);
        HwVersionManager.b(BaseApplication.getContext()).c(str4 + "_changeLogUri", str3);
        HwVersionManager.b(BaseApplication.getContext()).b(str4 + "_changelog.xml", str2);
        String strE = nuy.e(str2, nvd.g(), nvd.h());
        nvd.e(strE, BaseApplication.getContext(), nufVar.g(), str);
        LogUtil.a("HwUpdateUtil", "saveChangelog changelogFlag: ", str4, " features: ", strE);
    }

    public void d(String str, String str2, String str3, boolean z) {
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            LogUtil.j("HwUpdateUtil", "savePullChangeLog changLogFilePath: ", str3, " versionUrl: ", str2);
            return;
        }
        String str4 = deviceInfoE.getDeviceUdid() + "_" + deviceInfoE.getSoftVersion();
        HwVersionManager.b(BaseApplication.getContext()).c(str4 + "_changeLogUri", str2);
        HwVersionManager.b(BaseApplication.getContext()).b(str4 + "_changelog.xml", str3);
        String strA = nuy.a(str3, nvd.g(), nvd.h());
        String strE = nuy.e(str3, nvd.g(), nvd.h());
        nvd.e(strE, BaseApplication.getContext(), deviceInfoE.getSoftVersion(), deviceInfoE.getDeviceIdentify());
        if (z) {
            mav mavVar = new mav();
            String strE2 = HwVersionManager.b(BaseApplication.getContext()).e(str);
            mavVar.c(str2);
            mavVar.a(strE2);
            mavVar.c(1);
            mavVar.e(nvd.h());
            String strE3 = nvd.e(strA);
            LogUtil.a("HwUpdateUtil", "AppBandPullChangeLogHandler, deviceUpdateLog = ", strE3);
            mavVar.b(strE3);
            mbc.b().e(str, mavVar);
        }
        LogUtil.a("HwUpdateUtil", "AppBandPullChangeLogHandler pullChangeLogSuccess() features = ", strE);
    }

    public void a(String str, int i) {
        HashMap map = new HashMap(16);
        map.put("errorCode", Integer.valueOf(i));
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE != null) {
            map.put("deviceModel", deviceInfoE.getDeviceModel());
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.DOWNLOAD_OTA_FILE_2180013.value(), map, 0);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(AnalyticsValue.DOWNLOAD_OTA_FILE_2180013.value(), linkedHashMap);
    }

    public void b(String str, boolean z, boolean z2) {
        String securityDeviceId;
        LogUtil.a("HwUpdateUtil", "reportStatus isSuccess: ", Boolean.valueOf(z));
        nun nunVar = new nun();
        if (z2) {
            if (z) {
                nunVar.e(3000);
            } else {
                nunVar.e(3001);
            }
        } else if (z) {
            nunVar.e(3);
        } else {
            nunVar.e(4);
        }
        if (CommonUtil.bt()) {
            nunVar.d(CommonUtil.q());
        } else {
            nunVar.d(CommonUtil.al());
        }
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            securityDeviceId = "";
        } else {
            securityDeviceId = deviceInfoE.getSecurityDeviceId();
        }
        nunVar.e(nvd.l(BaseApplication.getContext(), securityDeviceId).w());
        nunVar.b(nuw.c(nuw.h(), BaseApplication.getContext()));
        nunVar.c("");
        ThreadPoolManager.c().execute(new nvt(nunVar, false, false));
    }

    public void d(String str, boolean z, boolean z2) {
        if (z2) {
            DataDeviceInfo dataDeviceInfo = new DataDeviceInfo();
            dataDeviceInfo.setDeviceBtMac(str);
            if (n(dataDeviceInfo.getDeviceBtMac())) {
                return;
            }
            LogUtil.a("HwUpdateUtil", "setActivateDevice Set to Inactive , mac = ", BTDeviceMgrUtil.c().e(dataDeviceInfo.getDeviceBtMac()));
            dataDeviceInfo.setDeviceEmmcId("false");
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(1017), dataDeviceInfo.getDeviceBtMac(), new Gson().toJson(dataDeviceInfo), new StorageParams());
            return;
        }
        if (n(str) || !z) {
            return;
        }
        nvd.r(BaseApplication.getContext(), str);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(1017), str);
        try {
            if (strE == null) {
                LogUtil.j("HwUpdateUtil", "setActivateDevicevalue == null");
                return;
            }
            DataDeviceInfo dataDeviceInfo2 = (DataDeviceInfo) new Gson().fromJson(strE, DataDeviceInfo.class);
            if (dataDeviceInfo2 == null) {
                LogUtil.j("HwUpdateUtil", "setActivateDevice device == null");
            } else {
                dataDeviceInfo2.setDeviceEmmcId("true");
                SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(1017), str, new Gson().toJson(dataDeviceInfo2), new StorageParams());
            }
        } catch (JsonSyntaxException e2) {
            LogUtil.e("HwUpdateUtil", "setActivateDevice exception :", ExceptionUtils.c(e2));
        }
    }

    private boolean n(String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(1017), str);
        if (strE == null || "".equals(strE.trim())) {
            LogUtil.a("HwUpdateUtil", "isDeviceActivated ,Not locally");
            return false;
        }
        try {
            return "true".equalsIgnoreCase(((DataDeviceInfo) new Gson().fromJson(strE, DataDeviceInfo.class)).getDeviceEmmcId());
        } catch (JsonSyntaxException e2) {
            LogUtil.e("HwUpdateUtil", "setActivateDevice exception : ", ExceptionUtils.c(e2));
            LogUtil.a("HwUpdateUtil", "isDeviceActivated Local Inactive");
            return false;
        }
    }

    public boolean h(String str) {
        if (mio.c()) {
            LogUtil.a("HwUpdateUtil", "isBandShowing return");
            return false;
        }
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null || deviceInfoE.getDeviceConnectState() != 2) {
            LogUtil.a("HwUpdateUtil", "startAutoTransfer band is not connect");
            maq.b().e(str, 0);
            maz.d().b();
            return false;
        }
        int iC = maq.b().c(str);
        if (iC != 3 && iC != 4 && iC != 6) {
            return true;
        }
        LogUtil.j("HwUpdateUtil", "band OTA is upgrading");
        return false;
    }

    public void k(String str) {
        Intent intent = new Intent("action_app_check_new_version_state");
        intent.addFlags(C.ENCODING_PCM_32BIT_BIG_ENDIAN);
        intent.putExtra("result", 0);
        intent.putExtra("state", 11);
        intent.putExtra("extra_band_imei", str);
        intent.setPackage(BaseApplication.getAppPackage());
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public void a(String str, boolean z) {
        LogUtil.a("HwUpdateUtil", "broadcastActivateResult: isActivated = ", Boolean.valueOf(z));
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (HwVersionManager.b(BaseApplication.getContext()).c(deviceInfoE)) {
            return;
        }
        d(str, z, false);
        lvj.c().c(deviceInfoE, z);
    }

    public boolean e() {
        int iA = PowerUtil.a(BaseApplication.getContext());
        if (iA >= 10 || iA == -1 || PowerUtil.c(BaseApplication.getContext())) {
            return false;
        }
        LogUtil.j("HwUpdateUtil", "MIN_PHONE_BATTERY_LEVEL not autoDownload");
        return true;
    }

    public void c(DeviceInfo deviceInfo, String str) {
        LogUtil.a("HwUpdateUtil", "Enter dealWithPrivacySwitchMessage");
        if (deviceInfo == null) {
            LogUtil.j("HwUpdateUtil", "deviceInfo is null");
        } else {
            lvb.e().b("privacySwitch", deviceInfo, 0, str);
        }
    }

    public void e(String str, nuf nufVar) {
        if (nufVar == null || TextUtils.isEmpty(str)) {
            LogUtil.j("HwUpdateUtil", "syncTimeAndBandInfo (versionInfo == null) || (TextUtils.isEmpty(deviceId)");
            return;
        }
        nvd.h(nufVar.b(), str, BaseApplication.getContext());
        nvd.a(nufVar.g(), str, BaseApplication.getContext());
        nvd.c(nufVar.h(), str, BaseApplication.getContext());
        long jA = nufVar.a();
        nvd.d(str, String.valueOf(jA), nufVar.g(), BaseApplication.getContext());
        try {
            long jA2 = nufVar.a();
            nvd.a(String.valueOf(jA2), BaseApplication.getContext(), nufVar.g(), str);
            nvd.j(qrs.a(BaseApplication.getContext(), nufVar.a()), BaseApplication.getContext(), nufVar.g(), str);
        } catch (MissingFormatArgumentException e2) {
            LogUtil.e("HwUpdateUtil", "syncTimeAndBandInfo NumberFormatException : ", ExceptionUtils.c(e2));
        }
    }

    public void d(boolean z, String str) {
        LogUtil.a("HwUpdateUtil", "saveUpgradeParameters enter");
        String strI = nvd.i(BaseApplication.getContext(), str);
        KeyValDbManager.d(BaseApplication.getContext()).b("new_band_version", strI);
        KeyValDbManager.d(BaseApplication.getContext()).b("new_band_version_type", nvd.j(BaseApplication.getContext(), str));
        KeyValDbManager.d(BaseApplication.getContext()).b("new_band_size", String.valueOf(nvd.e(BaseApplication.getContext(), str, strI)));
        KeyValDbManager.d(BaseApplication.getContext()).b("new_band_change_log", "");
        KeyValDbManager.d(BaseApplication.getContext()).b("is_new_checkbox", String.valueOf(z));
        KeyValDbManager.d(BaseApplication.getContext()).b("is_need_show_dialog", String.valueOf(true));
        KeyValDbManager.d(BaseApplication.getContext()).b("need_show_dialog_time", nvd.e());
        KeyValDbManager.d(BaseApplication.getContext()).b("need_show_dialog_mac", str);
        DeviceInfo deviceInfoE = maq.b().e(str);
        KeyValDbManager.d(BaseApplication.getContext()).b("need_show_dialog_device_name", deviceInfoE != null ? deviceInfoE.getDeviceName() : "");
    }

    public mbe a(String str, String str2) {
        LogUtil.a("HwUpdateUtil", "getUpdateMessageBean enter");
        mbe mbeVar = new mbe();
        mbeVar.b(str);
        String strI = nvd.i(BaseApplication.getContext(), str);
        mbeVar.d(strI);
        mbeVar.c(CommonUtil.i(nvd.e(BaseApplication.getContext(), str, strI)));
        mbeVar.e(System.currentTimeMillis() / 1000);
        mbeVar.a(1);
        mbeVar.e(2);
        if (!TextUtils.isEmpty(str2)) {
            mbeVar.d(lsk.a(str2, 10));
        }
        return mbeVar;
    }

    public void d(Context context, boolean z, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("HwUpdateUtil", "startUpdateActivity (context == null) || TextUtils.isEmpty(deviceId)");
            return;
        }
        try {
            Intent intent = new Intent();
            String strI = nvd.i(BaseApplication.getContext(), str);
            intent.putExtra("name", strI);
            intent.putExtra("type", nvd.j(BaseApplication.getContext(), str));
            intent.putExtra("size", CommonUtil.i(nvd.e(BaseApplication.getContext(), str, strI)));
            intent.putExtra("message", "");
            intent.putExtra(ParamConstants.CallbackMethod.ON_SHOW, z);
            intent.putExtra("isAW70", false);
            intent.addFlags(268435456);
            intent.putExtra("mac", str);
            intent.setClassName(context.getPackageName(), "com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity");
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("HwUpdateUtil", "startUpdateActivity e ", ExceptionUtils.c(e2));
        }
    }

    public void b(String str, int i) {
        DeviceInfo deviceInfoE = maq.b().e(str);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("otaType", String.valueOf(i));
        if (deviceInfoE != null) {
            linkedHashMap.put("otaDeviceModel", deviceInfoE.getDeviceModel());
        }
        LogUtil.j("HwUpdateUtil", "uploadOpAnalytics Status = ", Integer.valueOf(i));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.OTA_UPGRADE_PROCESS_80070007.value(), linkedHashMap);
    }

    public boolean c(String str, String str2, IUpgradeCallBack iUpgradeCallBack, DeviceInfo deviceInfo) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || iUpgradeCallBack == null || deviceInfo == null || d(str, str2) != 11) {
            return true;
        }
        c(str, iUpgradeCallBack);
        int iD = d(deviceInfo);
        if (iD == -1) {
            e(deviceInfo.getDeviceIdentify(), 0, 0);
            return true;
        }
        if (iD == 1 || iD == 3) {
            e(deviceInfo.getDeviceIdentify(), 0, 13);
            return true;
        }
        boolean zE = maq.b().e(lsk.a(nvd.e(BaseApplication.getContext(), deviceInfo.getDeviceIdentify(), nvd.i(BaseApplication.getContext(), deviceInfo.getDeviceIdentify())), 10));
        LogUtil.a("HwUpdateUtil", "doUpgrade: checkMemory = ", Boolean.valueOf(zE));
        if (zE) {
            return false;
        }
        e(deviceInfo.getDeviceIdentify(), 1, 14);
        return true;
    }

    private int d(String str, String str2) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            i = jSONObject.has(AwarenessRequest.Field.COMMAND) ? jSONObject.getInt(AwarenessRequest.Field.COMMAND) : -1;
        } catch (JSONException e2) {
            LogUtil.e("HwUpdateUtil", "doUpgrade JSONException ", ExceptionUtils.c(e2));
        }
        LogUtil.a("HwUpdateUtil", "doUpgrade uuid ", CommonUtil.n(str), " command ", str2, " updateCommand ", Integer.valueOf(i));
        return i;
    }
}
