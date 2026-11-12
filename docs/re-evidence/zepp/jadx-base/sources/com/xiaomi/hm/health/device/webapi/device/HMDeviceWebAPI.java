package com.xiaomi.hm.health.device.webapi.device;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.devicex.manager.DeviceManagerZeppApi;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpRequestData;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.properties.HMUserPropertiesAPI;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.network.hmnetwork.properties.PropertyItem;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.bind.BindUtil;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.usersettings.UserSettings;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMPeytoSettings;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.temperature.HMTemperatureInfo;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.bind.HMBindBaseLogic;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceMigrationApi;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class HMDeviceWebAPI {
    private static final String A = "brand";
    private static final String B = "systemModel";
    public static final boolean BIND_DEVICE_TO_SERVER = true;
    private static final String C = "info_version";
    private static final String D = "info";
    private static final String E = "hardware_version";
    private static final String F = "status";
    private static final String G = "random";
    private static final String H = "publickeyhash";
    private static final String I = "lastDevicePAIDataSyncTime";
    private static final String J = "lastDevicePAIDataSyncTimeZone";
    private static final String K = "huamiModel";
    private static final String L = "updateTime";
    private static final String M = "timeZone";
    private static final String P = "users/%s/events";
    public static final String PARAM_UPDATE_DEVICE_INFO_ACTIVE_STATUS = "activeStatus";
    public static final String PARAM_UPDATE_DEVICE_INFO_AUTH_KEY = "auth_key";
    public static final String PARAM_UPDATE_DEVICE_INFO_AUTH_KEY_NEW = "authKey";
    public static final String PARAM_UPDATE_DEVICE_INFO_BIND_TIME = "app_time";
    public static final String PARAM_UPDATE_DEVICE_INFO_BRAND_TYPE = "brandType";
    public static final String PARAM_UPDATE_DEVICE_INFO_DEVICE_ID = "deviceid";
    public static final String PARAM_UPDATE_DEVICE_INFO_DEVICE_TYPE_NEW = "deviceType";
    public static final String PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME = "displayName";
    public static final String PARAM_UPDATE_DEVICE_INFO_ENABLE_MULTI_DEVICE = "enableMultiDevice";
    public static final String PARAM_UPDATE_DEVICE_INFO_FW_VERSION = "fw_version";
    public static final String PARAM_UPDATE_DEVICE_INFO_FW_VERSION_NEW = "fwVersion";
    public static final String PARAM_UPDATE_DEVICE_INFO_HARDWARE_VERSION = "hardwareVersion";
    public static final String PARAM_UPDATE_DEVICE_INFO_HR_FW_VERSION = "fw_hr_version";
    public static final String PARAM_UPDATE_DEVICE_INFO_MAC_ADDRESS = "mac";
    public static final String PARAM_UPDATE_DEVICE_INFO_PHONE_BRAND = "brand";
    public static final String PARAM_UPDATE_DEVICE_INFO_PHONE_MODEL = "sys_model";
    public static final String PARAM_UPDATE_DEVICE_INFO_PHONE_SYSTEM = "sys_version";
    public static final String PARAM_UPDATE_DEVICE_INFO_PRODUCT_ID = "productId";
    public static final String PARAM_UPDATE_DEVICE_INFO_PRODUCT_VERSION = "productVersion";
    public static final String PARAM_UPDATE_DEVICE_INFO_SN = "sn";
    public static final String PARAM_UPDATE_DEVICE_INFO_SOFT_VERSION = "soft_version";
    public static final String PARAM_UPDATE_DEVICE_INFO_SOURCE = "device_source";
    public static final String PARAM_UPDATE_DEVICE_INFO_TIME_ZONE = "bind_timezone";
    public static final String PARAM_UPDATE_DEVICE_INFO_TIME_ZONE_NEW = "bindTimeZone";
    public static final String PARAM_UPDATE_DEVICE_INFO_TYPE = "device_type";
    public static final String PARAM_UPDATE_DEVICE_INFO_UID_CRC = "crcedUserId";
    public static final String PARAM_UPDATE_DEVICE_INFO_USER_ID_CODE = "code";
    public static final String WEB_API_DEVICE_LIST = "users/%s/devices";
    public static final String WEB_API_UPDATE_DEVICE = "users/%s/devices/%s";
    public static final String WEB_PATH_BIND_DEVICE_URL_SUFFIX = "v1/device/binds.json";
    private static final String a = "HMDeviceWebAPI";
    private static final String c = "v1/device/lists.json";
    private static final String d = "v1/device/stat.json";
    private static final String e = "binding_status";
    private static final String f = "SN";
    private static final String g = "last_sync_data_time";
    private static final String h = "hr_last_sync_time";
    private static final String i = "brand type";
    private static final String j = "deviceSource";
    private static final String k = "deviceId";
    private static final String l = "macAddress";
    private static final String m = "bindingStatus";
    private static final String n = "applicationTime";
    private static final String o = "lastDataSyncTime";
    private static final String p = "lastStatusUpdateTime";
    private static final String q = "additionalInfo";
    private static final String r = "lastBindingPlatform";
    private static final String s = "lastECGDataSyncTime";
    private static final String t = "lastHeartRateDataSyncTime";
    private static final String u = "lastRRDataSyncTime";
    private static final String v = "fwHrVersion";
    private static final String w = "virtualBindingStatus";
    private static final String x = "firmwareVersion";
    private static final String y = "softwareVersion";
    private static final String z = "systemVersion";
    private static final int b = HMBrandType.BRAND_DEFAULT.getValue();
    private static Lazy<DeviceRepositoryApi> N = KoinJavaComponent.inject(DeviceRepositoryApi.class);
    private static Lazy<DeviceMigrationApi> O = KoinJavaComponent.inject(DeviceMigrationApi.class);

    public class a extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ AtomicBoolean a;

        public a(AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.d(HMDeviceWebAPI.a, "unbindDevice onFailure:" + hMHttpResponseData, new Object[0]);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            HMLog.d(HMDeviceWebAPI.a, "unbindDevice onSuccess:" + hMHttpResponseData, new Object[0]);
            this.a.set(hMHttpResponseData.isSuccess());
        }
    }

    public class b extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ StringBuilder a;

        public b(StringBuilder sb) {
            this.a = sb;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.d(HMDeviceWebAPI.a, "onFailure:" + hMHttpResponseData, new Object[0]);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            try {
                JSONObject jSONObject = new JSONObject(webResponse.data);
                HMLog.d(HMDeviceWebAPI.a, "onSuccess:" + jSONObject.toString(), new Object[0]);
                String string = jSONObject.getString("signature");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                this.a.append(string);
            } catch (Exception e) {
                HMLog.d(HMDeviceWebAPI.a, e.toString(), new Object[0]);
            }
        }
    }

    public class c extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ AtomicBoolean a;

        public c(AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.d(HMDeviceWebAPI.a, "onFailure:" + hMHttpResponseData, new Object[0]);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            HMLog.d(HMDeviceWebAPI.a, "onSuccess:" + hMHttpResponseData, new Object[0]);
            this.a.set(true);
        }
    }

    public class d extends IHMHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData a;

        public d(HMHttpResponseData hMHttpResponseData) {
            this.a = hMHttpResponseData;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(HMDeviceWebAPI.a, "onCancel" + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(HMDeviceWebAPI.a, "onCompleted", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.d(HMDeviceWebAPI.a, "onError:" + th, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            HMLog.d(HMDeviceWebAPI.a, "item:" + hMHttpResponseData, new Object[0]);
            this.a.copy(hMHttpResponseData);
        }
    }

    public class e extends IHMHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData a;
        public final /* synthetic */ HashMap b;

        public e(HMHttpResponseData hMHttpResponseData, HashMap map) {
            this.a = hMHttpResponseData;
            this.b = map;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(HMDeviceWebAPI.a, "onCancel" + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(HMDeviceWebAPI.a, "onCompleted", new Object[0]);
            if (((DeviceMigrationApi) HMDeviceWebAPI.O.getValue()).findMigrateDevicesAll().isEmpty()) {
                HMLog.d(HMDeviceWebAPI.a, "setNeedPostOldDevicesInfo: 全部上传成功,无需再上传", new Object[0]);
            }
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.d(HMDeviceWebAPI.a, "onError:" + th, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            this.a.copy(hMHttpResponseData);
            if (this.a.isSuccess()) {
                try {
                    if (new JSONObject(new String(this.a.getResponseBody())).getInt("code") == 1) {
                        Device device = (Device) this.b.get(hMHttpResponseData.getTag());
                        Objects.requireNonNull(device);
                        device.setMigrate_device(0);
                        ((DeviceRepositoryApi) HMDeviceWebAPI.N.getValue()).update(device);
                        HMLog.i(HMDeviceWebAPI.a, "update device success:" + device.getDevice_id() + "," + device.getFirmware_version(), new Object[0]);
                    }
                } catch (Exception e) {
                    HMLog.d(HMDeviceWebAPI.a, "e:" + e.getMessage(), new Object[0]);
                }
            }
        }
    }

    public class f extends IHMSimpleHttpResponseHandler {
        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
        }
    }

    public class g extends IHMSimpleHttpResponseHandler {
        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
        }
    }

    public class h extends IHMSimpleHttpResponseHandler {
        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(HMDeviceWebAPI.a, "pai data upload fail" + hMHttpResponseData, new Object[0]);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            HMLog.i(HMDeviceWebAPI.a, "pai data upload success:" + hMHttpResponseData, new Object[0]);
        }
    }

    public static void bindDevice(HMWebBindInfo hMWebBindInfo, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, boolean z2) {
        HMLog.i(a, "bindInfo:" + hMWebBindInfo, new Object[0]);
        if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(hMWebBindInfo.getDeviceSource()))) {
            d(hMWebBindInfo, iHMBasicHttpResponseHandler, z2);
            return;
        }
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("brand", hMWebBindInfo.getPhoneBrand());
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_PHONE_MODEL, hMWebBindInfo.getPhoneModel());
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_PHONE_SYSTEM, hMWebBindInfo.getPhoneSystem());
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_SOFT_VERSION, hMWebBindInfo.getSoftVersion());
        systemParams.put("device_type", Integer.valueOf(hMWebBindInfo.getDeviceType()));
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_FW_VERSION, hMWebBindInfo.getFwVersion());
        systemParams.put("device_source", Integer.valueOf(hMWebBindInfo.getDeviceSource()));
        systemParams.put("mac", hMWebBindInfo.getMacAddress());
        systemParams.put("deviceid", hMWebBindInfo.getDeviceId());
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_BIND_TIME, Long.valueOf(hMWebBindInfo.getBindTime() / 1000));
        systemParams.put("code", Integer.valueOf(hMWebBindInfo.getUserIdCode()));
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_UID_CRC, Integer.valueOf(hMWebBindInfo.getUidCrc()));
        systemParams.put("sn", hMWebBindInfo.getSN());
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_BRAND_TYPE, Integer.valueOf(hMWebBindInfo.getBrandType()));
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_AUTH_KEY, hMWebBindInfo.getAuthKey());
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_HR_FW_VERSION, hMWebBindInfo.getHrFwVersion());
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_TIME_ZONE, Integer.valueOf(ProfileUtils.getTimezoneKey(Calendar.getInstance().getTimeZone())));
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_HARDWARE_VERSION, hMWebBindInfo.getHardwareVersion());
        systemParams.put("productId", Integer.valueOf(hMWebBindInfo.getProductId()));
        systemParams.put("productVersion", Integer.valueOf(hMWebBindInfo.getProductVersion()));
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_ACTIVE_STATUS, Integer.valueOf(hMWebBindInfo.getActiveStatus()));
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, hMWebBindInfo.getDisplayName());
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_ENABLE_MULTI_DEVICE, Boolean.valueOf(hMWebBindInfo.isEnableMultiDevice()));
        String url = HMServerDef.getUrl(WEB_PATH_BIND_DEVICE_URL_SUFFIX);
        int bindType = hMWebBindInfo.getBindType();
        Support.RequestSupport requestSupport = Support.RequestSupport.GET;
        if (bindType == 0) {
            requestSupport = Support.RequestSupport.POST;
        } else if (bindType == 1) {
            requestSupport = Support.RequestSupport.DELETE;
        }
        HMWebUtil.doRequest(url, systemParams, requestSupport, z2, iHMBasicHttpResponseHandler);
    }

    public static boolean bindDeviceToWeb(HMWebBindInfo hMWebBindInfo) {
        try {
            return new JSONObject(bindDeviceToWebWithResponse(hMWebBindInfo)).getInt("code") == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String bindDeviceToWebWithResponse(HMWebBindInfo hMWebBindInfo) {
        HMLog.d(a, "bindInfo:" + hMWebBindInfo, new Object[0]);
        HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        bindDevice(hMWebBindInfo, new d(hMHttpResponseData), true);
        return !hMHttpResponseData.isSuccess() ? "" : new String(hMHttpResponseData.getResponseBody());
    }

    private static void d(HMWebBindInfo hMWebBindInfo, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, boolean z2) {
        String restfulUrl;
        Support.RequestSupport requestSupport;
        int bindType = hMWebBindInfo.getBindType();
        if (bindType == 1) {
            j(hMWebBindInfo.getDeviceType(), hMWebBindInfo.getDeviceId(), z2, iHMBasicHttpResponseHandler);
            return;
        }
        try {
            Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
            JSONObject jSONObject = new JSONObject();
            String huamiId = HMLoginManager.getHuamiId();
            String restfulUrl2 = HMServerDef.getRestfulUrl(WEB_API_UPDATE_DEVICE, huamiId, hMWebBindInfo.getDeviceId());
            Support.RequestSupport requestSupport2 = Support.RequestSupport.GET;
            if (bindType == 0) {
                restfulUrl = HMServerDef.getRestfulUrl(WEB_API_DEVICE_LIST, huamiId);
                Support.RequestSupport requestSupport3 = Support.RequestSupport.POST;
                setupBindParams(huamiId, jSONObject, hMWebBindInfo);
                requestSupport = requestSupport3;
            } else {
                jSONObject.put("deviceType", hMWebBindInfo.getDeviceType());
                restfulUrl = restfulUrl2;
                requestSupport = requestSupport2;
            }
            HashSet hashSet = new HashSet();
            hashSet.add("application/json");
            hashSet.add(jSONObject.toString());
            HMLog.d(a, "entity:" + hashSet, new Object[0]);
            HMWebUtil.doSeparateRequest(restfulUrl, systemHeader, (Set<Object>) hashSet, requestSupport, true, z2, iHMBasicHttpResponseHandler, new HMHttpConfig[0]);
        } catch (Exception e2) {
            HMLog.i(a, "updateDevice error: " + e2, new Object[0]);
            iHMBasicHttpResponseHandler.onError(e2);
        }
    }

    private static ArrayList<Device> e(ArrayList<Device> arrayList) {
        ArrayList<Device> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<Device> arrayList4 = new ArrayList();
        for (Device device : arrayList) {
            int iIntValue = device.getDevice_type().intValue();
            if (iIntValue == HMDeviceType.MILI.getValue() && device.getActiveStatus().intValue() == 1) {
                arrayList3.add(device);
            } else if (iIntValue == HMDeviceType.WATCH.getValue() && device.getActiveStatus().intValue() == 1) {
                arrayList4.add(device);
            } else {
                arrayList2.add(device);
            }
        }
        int size = arrayList4.size();
        int size2 = arrayList3.size();
        HMLog.d(a, "activeWatchSize:" + size + ",activeMiliSize:" + size2, new Object[0]);
        Application context = DeviceXFunctionsKt.getContext();
        if (size2 > 0) {
            arrayList2.addAll(arrayList3);
            for (Device device2 : arrayList4) {
                device2.setActiveStatus(0);
                arrayList2.add(device2);
            }
        } else if (size > 0) {
            Device device3 = null;
            if (size > 1) {
                String str = UserSettings.get(context.getContentResolver(), "huami.watch.companion.phone.device.main");
                HMLog.d(a, "Active Last MainDevice : " + str, new Object[0]);
                for (Device device4 : arrayList4) {
                    if (TextUtils.isEmpty(str) || !str.equals(device4.getDevice_id())) {
                        device4.setActiveStatus(0);
                    } else {
                        device3 = device4;
                    }
                }
            }
            if (device3 == null) {
                device3 = (Device) arrayList4.get(0);
                ((Device) arrayList4.get(0)).setActiveStatus(1);
            }
            DeviceManagerApi deviceManagerApi = ManagerFunctionsKt.getDeviceManagerApi();
            if (deviceManagerApi instanceof DeviceManagerZeppApi) {
                com.huami.watch.companion.device.Device watchDevice = ((DeviceManagerZeppApi) deviceManagerApi).toWatchDevice(device3);
                if (DeviceManager.getManager(context).find(watchDevice.address()) == null) {
                    DeviceManager.getManager(context).save(watchDevice, true);
                    BindUtil.activeLastMainDevice(context);
                }
            }
            arrayList2.addAll(arrayList4);
        }
        return arrayList2;
    }

    private static int f(int i2, String str) {
        HMLog.i(a, "correctWatchSource source:" + i2 + ",model:" + str, new Object[0]);
        if (i2 != HMDeviceSource.WATCH_AMAZFIT.getValue() || TextUtils.isEmpty(str)) {
            HMLog.i(a, "No need to correct", new Object[0]);
            return i2;
        }
        if (DeviceSource.isModelXihuEA(str)) {
            i2 = HMDeviceSource.WATCH_AMAZFIT_XIHU_EA.getValue();
        } else if (DeviceSource.isModelXihuE(str)) {
            i2 = HMDeviceSource.WATCH_AMAZFIT_XIHU_E.getValue();
        } else if (DeviceSource.isModelXihu(str)) {
            i2 = HMDeviceSource.WATCH_AMAZFIT_XIHU.getValue();
        }
        HMLog.i(a, "correctWatchSource new source:" + i2, new Object[0]);
        return i2;
    }

    private static byte[] g(String str) {
        byte[] bArr = new byte[4];
        if (str == null) {
            return bArr;
        }
        try {
            long j2 = Long.parseLong(str);
            bArr[0] = (byte) j2;
            bArr[1] = (byte) (j2 >> 8);
            bArr[2] = (byte) (j2 >> 16);
            bArr[3] = (byte) (j2 >> 24);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return bArr;
    }

    public static void getDeviceListFromServerSync(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, boolean z2) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_ENABLE_MULTI_DEVICE, Boolean.valueOf(z2));
        HMWebUtil.doRequest(GlobalConfig.get().isBuildMidong() ? HMServerDef.getRestfulUrl(WEB_API_DEVICE_LIST, HMLoginManager.getHuamiId()) : HMServerDef.getUrl(c), systemParams, Support.RequestSupport.GET, true, iHMBasicHttpResponseHandler);
    }

    public static byte[] getSign(byte[] bArr, byte[] bArr2, int i2) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder();
        sb.append(i2 == 0 ? "SHA1:" : "UNKNOWN:");
        sb.append(GattUtils.bytesToHexStringNoSpace(bArr2));
        String string = sb.toString();
        systemParams.put("device_type", Integer.valueOf(HMDeviceType.MILI.getValue()));
        systemParams.put(G, strEncodeToString);
        systemParams.put(H, string);
        String url = HMServerDef.getUrl(WEB_PATH_BIND_DEVICE_URL_SUFFIX);
        Support.RequestSupport requestSupport = Support.RequestSupport.GET;
        StringBuilder sb2 = new StringBuilder();
        HMWebUtil.doRequest(url, systemParams, requestSupport, true, new b(sb2));
        byte[] bArrDecode = Base64.decode(strEncodeToString, 2);
        String string2 = sb2.toString();
        byte[] bArrDecode2 = Base64.decode(string2, 2);
        HMLog.d(a, "sha256:" + GattUtils.bytesToHexString(bArr) + ",base64:" + strEncodeToString + ",decode:" + GattUtils.bytesToHexString(bArrDecode), new Object[0]);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("server sign base64:");
        sb3.append(string2);
        sb3.append(",server sign:");
        sb3.append(GattUtils.bytesToHexString(bArrDecode2));
        sb3.append(",local sign:");
        HMLog.d(a, sb3.toString(), new Object[0]);
        return bArrDecode2;
    }

    public static boolean getUploadDeviceStatisticInfoResult(HMHttpResponseData hMHttpResponseData) {
        if (!hMHttpResponseData.isSuccess()) {
            return false;
        }
        try {
            return new JSONObject(new String(hMHttpResponseData.getResponseBody())).getInt("code") == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Exception exc) {
        return "parseDeviceListFromWeb exception:" + exc.getMessage();
    }

    private static ArrayList<Device> i(HMHttpResponseData hMHttpResponseData) {
        JSONArray jSONArray;
        String str;
        String str2;
        String str3 = f;
        String str4 = "sn";
        String str5 = PARAM_UPDATE_DEVICE_INFO_ACTIVE_STATUS;
        int i2 = 0;
        HMLog.d(a, "parseDeviceListFromWebNew:" + hMHttpResponseData, new Object[0]);
        try {
            JSONArray jSONArray2 = new JSONObject(new String(hMHttpResponseData.getResponseBody())).getJSONArray("items");
            int length = jSONArray2.length();
            HMLog.d(a, "list size == " + length, new Object[0]);
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long miIdIfExistsOrHuamiID = HMLoginManager.getMiIdIfExistsOrHuamiID();
            int i3 = 0;
            while (i3 < length) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i3);
                Device device = new Device();
                device.setDevice_id(jSONObject.optString("deviceId"));
                String strOptString = jSONObject.optString("macAddress");
                if (BluetoothAdapter.checkBluetoothAddress(strOptString)) {
                    device.setDevice_address(strOptString);
                    int iOptInt = jSONObject.optInt("deviceType");
                    device.setDevice_type(Integer.valueOf(iOptInt));
                    int iOptInt2 = jSONObject.optInt("deviceSource");
                    if (AmazfitUnsupportedSourceKt.isUnsupported(iOptInt2)) {
                        HMLog.i(a, "un support device source: " + iOptInt2, new Object[i2]);
                    } else {
                        if (iOptInt == HMDeviceType.MILI.getValue() && iOptInt2 == HMDeviceSource.MILI_PRO_OLD.getValue()) {
                            iOptInt2 = HMDeviceSource.MILI_PRO.getValue();
                        }
                        jSONArray = jSONArray2;
                        if (HMBindBaseLogic.UPLOAD_DEVICE_INFO_STATISTICS_ONLY.contains(HMDeviceSource.fromValue(iOptInt2))) {
                            str = str3;
                            str2 = str4;
                        } else {
                            device.setDevice_source(Integer.valueOf(iOptInt2));
                            if (iOptInt == HMDeviceType.VDevice.getValue() || iOptInt2 == HMDeviceSource.VDEVICE.getValue()) {
                                str = str3;
                                str2 = str4;
                                HMLog.i(a, "invalid type:" + iOptInt + ",source:" + iOptInt2, new Object[0]);
                            } else {
                                device.setDevice_bind_status(Integer.valueOf(jSONObject.optInt(m)));
                                long jOptLong = jSONObject.optLong(n) * 1000;
                                long jOptLong2 = jSONObject.optLong(o) * 1000;
                                long jOptLong3 = jSONObject.optLong(t) * 1000;
                                String str6 = str3;
                                String str7 = str4;
                                if (jOptLong2 == 0) {
                                    jOptLong2 = jOptLong;
                                }
                                if (jOptLong3 == 0) {
                                    jOptLong3 = jOptLong;
                                }
                                device.setDevice_bind_time(Long.valueOf(jOptLong));
                                device.setDevice_sync_data_time(Long.valueOf(jOptLong2));
                                device.setDevice_sync_data_time_hr(Long.valueOf(jOptLong3));
                                device.setUserId(String.valueOf(miIdIfExistsOrHuamiID));
                                device.setFirmware_version(jSONObject.optString(x));
                                device.setHr_firmware_version(jSONObject.optString(v));
                                device.setStatus(Integer.valueOf(jSONObject.optInt(w)));
                                if (jSONObject.has(str5)) {
                                    device.setActiveStatus(Integer.valueOf(jSONObject.getInt(str5)));
                                }
                                device.setDisplayName(jSONObject.optString(PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME));
                                device.setLastBindingPlatform(jSONObject.optString(r));
                                device.setEcgSyncTime(Long.valueOf(jSONObject.optLong(s, 0L)));
                                if (ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE, HMDeviceSource.fromValue(iOptInt2))) {
                                    arrayList.add(device);
                                } else {
                                    String strOptString2 = jSONObject.optString(q);
                                    if (strOptString2 == null) {
                                        HMLog.i(a, "parseDeviceListFromWebNew additionalInfo is null", new Object[0]);
                                    } else {
                                        device.setAdditionalInfo(strOptString2);
                                        JSONObject jSONObject2 = new JSONObject(strOptString2);
                                        str2 = str7;
                                        if (jSONObject2.has(str2)) {
                                            device.setSn(jSONObject2.getString(str2));
                                            str = str6;
                                        } else {
                                            str = str6;
                                            if (jSONObject2.has(str)) {
                                                device.setSn(jSONObject2.getString(str));
                                            } else {
                                                HMLog.i(a, "no sn value!!!", new Object[0]);
                                            }
                                        }
                                        device.setBrandType(Integer.valueOf(jSONObject2.optInt(i, b)));
                                        device.setAuthkey(jSONObject2.optString(PARAM_UPDATE_DEVICE_INFO_AUTH_KEY));
                                        device.setTime_zone(Integer.valueOf(jSONObject2.optInt(PARAM_UPDATE_DEVICE_INFO_TIME_ZONE)));
                                        device.setHardwareVersion(jSONObject2.optString(PARAM_UPDATE_DEVICE_INFO_HARDWARE_VERSION, ""));
                                        device.setProductId(Integer.valueOf(jSONObject2.optInt("productId", -1)));
                                        device.setProductVersion(Integer.valueOf(jSONObject2.optInt("productVersion", -1)));
                                        device.setPaiSyncTime(Long.valueOf(jSONObject2.optLong(I, 0L)));
                                        device.setPaiSyncTimeZone(Long.valueOf(jSONObject2.optInt(J, 0)));
                                        device.setDevice_source(Integer.valueOf(f(iOptInt2, jSONObject2.optString(K))));
                                        arrayList.add(device);
                                    }
                                }
                                str = str6;
                                str2 = str7;
                            }
                        }
                    }
                    i3++;
                    str4 = str2;
                    str3 = str;
                    str5 = str5;
                    i2 = 0;
                    jSONArray2 = jSONArray;
                } else {
                    HMLog.i(a, "invalid address:" + strOptString, new Object[i2]);
                }
                str = str3;
                jSONArray = jSONArray2;
                str2 = str4;
                i3++;
                str4 = str2;
                str3 = str;
                str5 = str5;
                i2 = 0;
                jSONArray2 = jSONArray;
            }
            HMLog.d(a, "device size : " + arrayList.size(), new Object[0]);
            return e(arrayList);
        } catch (Exception e2) {
            HMLog.error(a, "", e2, new Function0() { // from class: yt2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceWebAPI.h(e2);
                }
            });
            HMLog.i(a, "parseDeviceListFromWeb exception:" + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    private static void j(int i2, String str, boolean z2, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMLog.d(a, "unbindDevice type:" + i2 + ",deviceId:" + str, new Object[0]);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("deviceType", Integer.valueOf(i2));
        HMWebUtil.doRequest(HMServerDef.getRestfulUrl(WEB_API_UPDATE_DEVICE, HMLoginManager.getHuamiId(), str), systemParams, Support.RequestSupport.DELETE, z2, iHMBasicHttpResponseHandler);
    }

    public static ArrayList<Device> parseDeviceListFromWeb(HMHttpResponseData hMHttpResponseData) {
        String str;
        String str2 = a;
        HMLog.i(a, hMHttpResponseData.getResponseString(), new Object[0]);
        if (GlobalConfig.get().isBuildMidong()) {
            return i(hMHttpResponseData);
        }
        if (!hMHttpResponseData.isSuccess()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody()));
            HMLog.i(a, "parseDeviceListFromWeb:" + jSONObject, new Object[0]);
            String strOptString = jSONObject.optString("code");
            if (!"1".equals(strOptString)) {
                HMLog.d(a, "device sync invalid code : " + strOptString, new Object[0]);
                return null;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            int length = jSONArray.length();
            HMLog.d(a, "list size == " + length, new Object[0]);
            if (length == 0) {
                return null;
            }
            ArrayList<Device> arrayList = new ArrayList<>();
            long miIdIfExistsOrHuamiID = HMLoginManager.getMiIdIfExistsOrHuamiID();
            int i2 = 0;
            while (i2 < length) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String strOptString2 = jSONObject2.optString("mac");
                if (BluetoothAdapter.checkBluetoothAddress(strOptString2)) {
                    Device device = new Device();
                    device.setDevice_id(jSONObject2.optString("deviceid"));
                    device.setDevice_address(strOptString2);
                    int iOptInt = jSONObject2.optInt("device_type");
                    device.setDevice_type(Integer.valueOf(iOptInt));
                    int iOptInt2 = jSONObject2.optInt("device_source");
                    if (AmazfitUnsupportedSourceKt.isUnsupported(iOptInt2)) {
                        HMLog.i(str2, "un support device source: " + iOptInt2, new Object[0]);
                    } else {
                        if (iOptInt == HMDeviceType.MILI.getValue() && iOptInt2 == HMDeviceSource.MILI_PRO_OLD.getValue()) {
                            iOptInt2 = HMDeviceSource.MILI_PRO.getValue();
                        }
                        device.setDevice_source(Integer.valueOf(iOptInt2));
                        if (iOptInt != HMDeviceType.VDevice.getValue() && iOptInt2 != HMDeviceSource.VDEVICE.getValue() && !HMBindBaseLogic.UPLOAD_DEVICE_INFO_STATISTICS_ONLY.contains(HMDeviceSource.fromValue(iOptInt2))) {
                            device.setDevice_bind_status(Integer.valueOf(jSONObject2.optInt(e)));
                            long jOptLong = jSONObject2.optLong(PARAM_UPDATE_DEVICE_INFO_BIND_TIME) * 1000;
                            long jOptLong2 = jSONObject2.optLong(g) * 1000;
                            long jOptLong3 = jSONObject2.optLong(h) * 1000;
                            str = str2;
                            if (jOptLong2 == 0) {
                                jOptLong2 = jOptLong;
                            }
                            if (jOptLong3 == 0) {
                                jOptLong3 = jOptLong;
                            }
                            try {
                                device.setDevice_bind_time(Long.valueOf(jOptLong));
                                device.setDevice_sync_data_time(Long.valueOf(jOptLong2));
                                device.setDevice_sync_data_time_hr(Long.valueOf(jOptLong3));
                                device.setUserId(String.valueOf(miIdIfExistsOrHuamiID));
                                device.setSn(jSONObject2.optString("sn"));
                                device.setBrandType(Integer.valueOf(jSONObject2.optInt(PARAM_UPDATE_DEVICE_INFO_BRAND_TYPE, b)));
                                device.setAuthkey(jSONObject2.optString(PARAM_UPDATE_DEVICE_INFO_AUTH_KEY));
                                device.setTime_zone(Integer.valueOf(jSONObject2.optInt(PARAM_UPDATE_DEVICE_INFO_TIME_ZONE)));
                                device.setFirmware_version(jSONObject2.optString(PARAM_UPDATE_DEVICE_INFO_FW_VERSION));
                                device.setHr_firmware_version(jSONObject2.optString(PARAM_UPDATE_DEVICE_INFO_HR_FW_VERSION));
                                device.setStatus(Integer.valueOf(jSONObject2.optInt("status")));
                                device.setHardwareVersion(jSONObject2.optString(PARAM_UPDATE_DEVICE_INFO_HARDWARE_VERSION, ""));
                                device.setProductId(Integer.valueOf(jSONObject2.optInt("productId", -1)));
                                device.setProductVersion(Integer.valueOf(jSONObject2.optInt("productVersion", -1)));
                                if (jSONObject2.has(PARAM_UPDATE_DEVICE_INFO_ACTIVE_STATUS)) {
                                    device.setActiveStatus(Integer.valueOf(jSONObject2.getInt(PARAM_UPDATE_DEVICE_INFO_ACTIVE_STATUS)));
                                }
                                device.setDisplayName(jSONObject2.optString(PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME));
                                device.setPaiSyncTime(Long.valueOf(jSONObject2.optLong(I, 0L)));
                                device.setPaiSyncTimeZone(Long.valueOf(jSONObject2.optInt(J, 0)));
                                device.setEcgSyncTime(Long.valueOf(jSONObject2.optLong(s, 0L)));
                                arrayList.add(device);
                            } catch (Exception e2) {
                                e = e2;
                                HMLog.i(str, "parseDeviceListFromWeb exception:" + e.getMessage(), new Object[0]);
                                return null;
                            }
                        }
                        i2++;
                        str2 = str;
                    }
                } else {
                    HMLog.i(str2, "invalid address:" + strOptString2, new Object[0]);
                }
                str = str2;
                i2++;
                str2 = str;
            }
            return arrayList;
        } catch (Exception e3) {
            e = e3;
            str = a;
        }
    }

    public static void setupBindParams(String str, JSONObject jSONObject, HMWebBindInfo hMWebBindInfo) throws JSONException {
        jSONObject.put(PARAM_UPDATE_DEVICE_INFO_UID_CRC, GattUtils.crc8(g(str)));
        jSONObject.put("deviceId", hMWebBindInfo.getDeviceId());
        jSONObject.put("deviceType", hMWebBindInfo.getDeviceType());
        jSONObject.put("deviceSource", hMWebBindInfo.getDeviceSource());
        jSONObject.put("macAddress", hMWebBindInfo.getMacAddress());
        jSONObject.put(x, hMWebBindInfo.getFwVersion());
        jSONObject.put(PARAM_UPDATE_DEVICE_INFO_ACTIVE_STATUS, hMWebBindInfo.getActiveStatus());
        jSONObject.put(n, hMWebBindInfo.getBindTime() / 1000);
        jSONObject.put(y, hMWebBindInfo.getSoftVersion());
        jSONObject.put(z, hMWebBindInfo.getPhoneSystem());
        jSONObject.put("brand", hMWebBindInfo.getPhoneBrand());
        jSONObject.put(B, hMWebBindInfo.getPhoneModel());
        jSONObject.put(m, 1);
        if (hMWebBindInfo.additionalInfo == null) {
            hMWebBindInfo.additionalInfo = new JSONObject();
        }
        hMWebBindInfo.additionalInfo.put("sn", hMWebBindInfo.getSN());
        hMWebBindInfo.additionalInfo.put(i, hMWebBindInfo.getBrandType());
        if (!TextUtils.isEmpty(hMWebBindInfo.getAuthKey())) {
            hMWebBindInfo.additionalInfo.put(PARAM_UPDATE_DEVICE_INFO_AUTH_KEY, hMWebBindInfo.getAuthKey());
        }
        hMWebBindInfo.additionalInfo.put(PARAM_UPDATE_DEVICE_INFO_TIME_ZONE, ProfileUtils.getTimezoneKey(Calendar.getInstance().getTimeZone()));
        hMWebBindInfo.additionalInfo.put(PARAM_UPDATE_DEVICE_INFO_HARDWARE_VERSION, hMWebBindInfo.getHardwareVersion());
        hMWebBindInfo.additionalInfo.put("productId", hMWebBindInfo.getProductId());
        hMWebBindInfo.additionalInfo.put("productVersion", hMWebBindInfo.getProductVersion());
        hMWebBindInfo.additionalInfo.put(PARAM_UPDATE_DEVICE_INFO_HR_FW_VERSION, hMWebBindInfo.getHrFwVersion());
        jSONObject.put(q, hMWebBindInfo.additionalInfo.toString());
    }

    public static boolean unbindDevice(HMDeviceType hMDeviceType, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        j(hMDeviceType.getValue(), str, true, new a(atomicBoolean));
        return atomicBoolean.get();
    }

    public static void updateDeviceSettingToServer(HMDeviceSource hMDeviceSource, HMPeytoSettings hMPeytoSettings) {
        PropertyItem propertyItem;
        if (hMDeviceSource == HMDeviceSource.MILI_PEYTO) {
            propertyItem = new PropertyItem(Property.PROPERTY_CONFIG_CHAOHU, hMPeytoSettings.toString());
        } else if (hMDeviceSource != HMDeviceSource.MILI_TEMPO) {
            return;
        } else {
            propertyItem = new PropertyItem(Property.PROPERTY_CONFIG_TEMPO, hMPeytoSettings.toString());
        }
        HMUserPropertiesAPI.postProperty(propertyItem, false, (IHMBasicHttpResponseHandler) new g());
    }

    public static boolean updateDeviceToWeb(HMWebBindInfo hMWebBindInfo) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            String restfulUrl = HMServerDef.getRestfulUrl(WEB_API_UPDATE_DEVICE, HMLoginManager.getHuamiId(), hMWebBindInfo.getDeviceId());
            Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
            HashSet hashSet = new HashSet();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceType", hMWebBindInfo.getDeviceType());
            jSONObject.put(PARAM_UPDATE_DEVICE_INFO_ACTIVE_STATUS, hMWebBindInfo.getActiveStatus());
            jSONObject.put(PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, hMWebBindInfo.getDisplayName());
            jSONObject.put("deviceId", hMWebBindInfo.getDeviceId());
            if (hMWebBindInfo.getFwVersion() != null && !hMWebBindInfo.getFwVersion().isEmpty()) {
                jSONObject.put(x, hMWebBindInfo.getFwVersion());
            }
            hashSet.add("application/json");
            hashSet.add(jSONObject.toString());
            HMLog.d(a, "entity:" + hashSet, new Object[0]);
            HMWebUtil.doSeparateRequest(restfulUrl, systemHeader, (Set<Object>) hashSet, Support.RequestSupport.PUT, true, true, (IHMBasicHttpResponseHandler) new c(atomicBoolean), new HMHttpConfig[0]);
        } catch (Exception e2) {
            HMLog.i(a, "updateDevice error: " + e2, new Object[0]);
        }
        return atomicBoolean.get();
    }

    public static void updateGpsSyncTimeToServer(Calendar calendar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("updateTime", calendar.getTimeInMillis() / 1000);
            jSONObject.put("timeZone", ProfileUtils.getTimezoneKey(calendar.getTimeZone()));
            HMUserPropertiesAPI.postProperty(new PropertyItem(Property.PROPERTY_GPS_SYNC_TIME, jSONObject.toString()), false, (IHMBasicHttpResponseHandler) new f());
        } catch (Exception unused) {
        }
    }

    public static void uploadDeviceInfo(Device device) {
        HMLog.i(a, "Update device info to server:" + device.getDevice_address() + "," + device.getFirmware_version(), new Object[0]);
        ArrayList arrayList = new ArrayList();
        arrayList.add(device);
        uploadDeviceInfosList(arrayList);
    }

    public static void uploadDeviceInfosList(List<Device> list) {
        String str;
        int i2 = 0;
        HMLog.d("send sport url size", "" + list.size(), new Object[0]);
        ArrayList arrayList = new ArrayList();
        HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        HashMap map = new HashMap();
        try {
            str = DeviceXFunctionsKt.getContext().getPackageManager().getPackageInfo(DeviceXFunctionsKt.getContext().getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        int i3 = 0;
        while (i3 < list.size()) {
            Device device = list.get(i3);
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("brand", str2);
            systemParams.put(PARAM_UPDATE_DEVICE_INFO_PHONE_MODEL, str3);
            systemParams.put(PARAM_UPDATE_DEVICE_INFO_PHONE_SYSTEM, strValueOf);
            systemParams.put(PARAM_UPDATE_DEVICE_INFO_SOFT_VERSION, str);
            systemParams.put("device_type", device.getDevice_type());
            systemParams.put(PARAM_UPDATE_DEVICE_INFO_FW_VERSION, device.getFirmware_version());
            systemParams.put("device_source", device.getDevice_source());
            systemParams.put("mac", device.getDevice_address());
            systemParams.put("deviceid", device.getDevice_id());
            systemParams.put(PARAM_UPDATE_DEVICE_INFO_BRAND_TYPE, device.getBrandType());
            systemParams.put(PARAM_UPDATE_DEVICE_INFO_BIND_TIME, Long.valueOf(device.getDevice_bind_time().longValue() / 1000));
            systemParams.put("code", device.getUserId());
            systemParams.put("sn", device.getSn());
            systemParams.put(PARAM_UPDATE_DEVICE_INFO_AUTH_KEY, device.getAuthkey());
            systemParams.put(PARAM_UPDATE_DEVICE_INFO_HR_FW_VERSION, device.getHr_firmware_version());
            systemParams.put(PARAM_UPDATE_DEVICE_INFO_TIME_ZONE, device.getTime_zone());
            String url = HMServerDef.getUrl(WEB_PATH_BIND_DEVICE_URL_SUFFIX);
            HMLog.d(a, "" + systemParams.toString(), new Object[i2]);
            HMHttpRequestData hMHttpRequestData = new HMHttpRequestData(url, systemParams, Support.RequestSupport.POST);
            arrayList.add(hMHttpRequestData);
            map.put(hMHttpRequestData.getTag(), device);
            i3++;
            i2 = 0;
        }
        HMWebUtil.doRequestList(arrayList, true, true, new e(hMHttpResponseData, map));
    }

    public static void uploadDevicePaiToServer(String str) {
        HMLog.d(a, "uploadDevicePaiToServer:" + str, new Object[0]);
        String restfulUrl = HMServerDef.getRestfulUrl("users/%s/events", HMLoginManager.getHuamiId());
        try {
            Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
            HashSet hashSet = new HashSet();
            systemHeader.put("Content-Type", "application/json");
            hashSet.add(str);
            HMWebUtil.doSeparateRequest(restfulUrl, systemHeader, (Set<Object>) hashSet, Support.RequestSupport.POST, true, true, (IHMBasicHttpResponseHandler) new h(), new HMHttpConfig[0]);
        } catch (Exception unused) {
        }
    }

    public static void uploadDeviceStatisticInfo(DeviceInfo deviceInfo, BatteryInfo batteryInfo, HMStatisticInfo hMStatisticInfo, HMTemperatureInfo hMTemperatureInfo, IHMHttpResponseHandler iHMHttpResponseHandler) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("device_type", Integer.valueOf(deviceInfo.getDeviceSource().getType().getValue()));
        systemParams.put("device_source", Integer.valueOf(deviceInfo.getDeviceSource().getValue()));
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_FW_VERSION, deviceInfo.getFirmwareVersionStr());
        systemParams.put("deviceid", deviceInfo.getDeviceID());
        systemParams.put(E, deviceInfo.getHardwareVersionStr());
        systemParams.put(C, "2");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 2);
            jSONObject.put("statisticInfo", hMStatisticInfo.toJson());
            jSONObject.put("deviceInfo", deviceInfo.toJson());
            if (batteryInfo != null) {
                jSONObject.put("batteryInfo", batteryInfo.toJson());
            }
            if (hMTemperatureInfo != null) {
                jSONObject.put("temperatureInfo", hMTemperatureInfo.toJson());
            }
        } catch (Exception unused) {
        }
        systemParams.put("info", jSONObject.toString());
        String url = HMServerDef.getUrl(d);
        HMLog.i(a, "HMStatisticInfo:" + hMStatisticInfo, new Object[0]);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, iHMHttpResponseHandler);
    }

    public static void uploadDeviceStatisticInfoNew(StatisticInfo statisticInfo, IHMHttpResponseHandler iHMHttpResponseHandler) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        DeviceInfo deviceInfo = statisticInfo.getDeviceInfo();
        String batteryInfo = statisticInfo.getBatteryInfo();
        String statisticInfo2 = statisticInfo.getStatisticInfo();
        systemParams.put("device_type", Integer.valueOf(deviceInfo.getDeviceSource().getType().getValue()));
        systemParams.put("device_source", Integer.valueOf(deviceInfo.getDeviceSource().getValue()));
        systemParams.put(PARAM_UPDATE_DEVICE_INFO_FW_VERSION, deviceInfo.getFirmwareVersionStr());
        systemParams.put("deviceid", deviceInfo.getDeviceID());
        systemParams.put(E, deviceInfo.getHardwareVersionStr());
        systemParams.put(C, "3");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 3);
            jSONObject.put("deviceInfo", statisticInfo.getDeviceInfoJson());
            if (!TextUtils.isEmpty(batteryInfo)) {
                jSONObject.put("batteryInfo", batteryInfo);
            }
            if (!TextUtils.isEmpty(statisticInfo2)) {
                jSONObject.put("statisticInfo", statisticInfo2);
            }
        } catch (Exception unused) {
        }
        systemParams.put("info", jSONObject.toString());
        HMWebUtil.doRequest(HMServerDef.getUrl(d), systemParams, Support.RequestSupport.POST, iHMHttpResponseHandler);
    }

    public static void uploadFailedDeviceInfo(String[] strArr) {
        if (TextUtils.isEmpty(strArr[0])) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Device deviceFindDeviceById = N.getValue().findDeviceById(str);
            if (deviceFindDeviceById != null) {
                boolean zUpdateDeviceToWeb = updateDeviceToWeb(HMWebBindInfo.createUpdateInfo(deviceFindDeviceById.getDevice_type().intValue(), deviceFindDeviceById.getDevice_id(), deviceFindDeviceById.getActiveStatus().intValue(), deviceFindDeviceById.getDisplayName()));
                if (!zUpdateDeviceToWeb) {
                    arrayList.add(str);
                }
                HMLog.i(a, "failed id: " + str + ", ret: " + zUpdateDeviceToWeb, new Object[0]);
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append(",");
        }
        String string = sb.toString();
        HMLog.d(a, "keep: " + string, new Object[0]);
        ManagerFunctionsKt.getDeviceManagerApi().setUploadDeviceIds(string.substring(0, string.length() + (-1)));
    }
}
