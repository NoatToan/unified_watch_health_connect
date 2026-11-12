package com.xiaomi.hm.health.discovery.jsbridge.function;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import cn.com.smartdevices.bracelet.rom.AliveUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.ad.AdRepository;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.JsBridgeApi;
import com.huami.discovery.bridge.jsbridge.api.callback.VerifiedCallback;
import com.huami.discovery.bridge.jsbridge.common.JsMessageCenter;
import com.huami.mifit.analytics.Analytics;
import com.huami.nps.api.EventCloseNps;
import com.huami.sleepassistant.lib.service.SleepServiceKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.health.device.AtrialManagerKt;
import com.xiaomi.hm.health.device.introduce.webintro.SwiperLastEvent;
import com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure.BloodPressureNoticeHandler;
import com.xiaomi.hm.health.discovery.jsbridge.function.content.NavigateContent;
import com.xiaomi.hm.health.discovery.jsbridge.function.phn.PHNSettingNoticeHandler;
import com.xiaomi.hm.health.discovery.jsbridge.function.sky.SkySurveyHandler;
import com.xiaomi.hm.health.discovery.jsbridge.function.theme.ThemeHandler;
import com.xiaomi.market.sdk.Constants;
import de.greenrobot.event.EventBus;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class JsBridgeApiImpl implements JsBridgeApi {
    private static final String b = "JsBridgeApiImpl";
    private static final int c = 1;
    private static final String d = "SET_PHN";
    private static final String e = "STARRY_SKY";
    private static final String f = "SLEEP_DIAL_NPS";
    private Context a;

    public JsBridgeApiImpl(Context context) {
        this.a = context;
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void checkAppInstall(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void exit(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void functionButtonsEvent(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public String getDevicesInfo() {
        AliveUtils aliveUtils = AliveUtils.getInstance();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.JSON_VERSION, 1);
            jSONObject.put("version", Build.VERSION.RELEASE);
            jSONObject.put(com.tencent.connect.common.Constants.PARAM_PLATFORM, aliveUtils.getCurrentROM().getRomName() + aliveUtils.getCurrentROM().getHelper().getVersionCode());
            jSONObject.put("brand", aliveUtils.getManufacturer().getPhoneBrand());
            jSONObject.put("model", aliveUtils.getManufacturer().getPhoneModel());
            jSONObject.put("imei", AdRepository.getInstance().getDeviceId());
            jSONObject.put("usid", Analytics.getHmStatAnonymousId(this.a));
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void getLocation(String data, JsCallBackFunction function) {
        new GetLocationHandler(this.a).handleData(data, function);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0100 A[Catch: JSONException -> 0x010d, TryCatch #0 {JSONException -> 0x010d, blocks: (B:64:0x00ea, B:66:0x0100, B:67:0x0105), top: B:72:0x00ea }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v0, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public String getSmartDevices(int[] iArr, int i) {
        HMMiLiProDevice hMMiLiProDevice;
        ?? IsBoundDeviceConnected;
        int deviceSource;
        String str;
        boolean zIsSupportAtrialFib;
        String strAddress;
        ?? IsShowAtrialFib;
        int deviceSource2;
        ?? jSONObject = new JSONObject();
        ?? jSONArray = new JSONArray();
        Device currentDevice = DeviceManager.getManager(this.a).getCurrentDevice();
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceType);
        if (!(device instanceof HMMiLiProDevice) && currentDevice == null) {
            return jSONArray.toString();
        }
        boolean z = device != null;
        boolean z2 = currentDevice != null;
        if (z) {
            hMMiLiProDevice = (HMMiLiProDevice) device;
            IsBoundDeviceConnected = hMMiLiProDevice.isConnected();
        } else if (z2) {
            hMMiLiProDevice = null;
            IsBoundDeviceConnected = DeviceManager.getManager(this.a).isBoundDeviceConnected();
        } else {
            hMMiLiProDevice = null;
            IsBoundDeviceConnected = 0;
        }
        if (i != IsBoundDeviceConnected && i != -1) {
            return jSONArray.toString();
        }
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(hMDeviceType);
        if (iArr != null && iArr.length > 0) {
            deviceSource = -1;
            for (int i2 : iArr) {
                if (z) {
                    if (boundDeviceSource.getValue() == i2) {
                        deviceSource = boundDeviceSource.getValue();
                    }
                } else if (z2 && (deviceSource2 = DeviceSource.getDeviceSource(currentDevice)) == i2) {
                    deviceSource = deviceSource2;
                }
            }
        } else if (z) {
            deviceSource = boundDeviceSource.getValue();
        } else {
            deviceSource = z2 ? DeviceSource.getDeviceSource(currentDevice) : -1;
        }
        if (deviceSource == -1) {
            return jSONArray.toString();
        }
        String strBuildNumber = "";
        try {
            if (!z) {
                if (z2) {
                    strAddress = currentDevice.address();
                    strBuildNumber = currentDevice.info() != null ? currentDevice.info().buildNumber() : "";
                    zIsSupportAtrialFib = AtrialManagerKt.isSupportAtrialFib(HMDeviceType.WATCH);
                } else {
                    str = "";
                    zIsSupportAtrialFib = false;
                }
                if (zIsSupportAtrialFib) {
                    IsShowAtrialFib = AtrialManagerKt.isShowAtrialFib();
                } else {
                    IsShowAtrialFib = 0;
                }
                jSONObject.put("device", deviceSource);
                jSONObject.put("mac", strBuildNumber);
                jSONObject.put("version", str);
                jSONObject.put("status", IsBoundDeviceConnected);
                if (zIsSupportAtrialFib) {
                    jSONObject.put("ppgStatus", IsShowAtrialFib);
                }
                jSONArray.put(jSONObject);
                return jSONArray.toString();
            }
            HMDeviceManager hMDeviceManager2 = HMDeviceManager.getInstance();
            HMDeviceType hMDeviceType2 = HMDeviceType.MILI;
            strAddress = hMDeviceManager2.getBoundDeviceAddress(hMDeviceType2);
            strBuildNumber = hMMiLiProDevice.getDeviceInfo() != null ? hMMiLiProDevice.getDeviceInfo().getFirmwareVersionStr() : "";
            zIsSupportAtrialFib = AtrialManagerKt.isSupportAtrialFib(hMDeviceType2);
            jSONObject.put("device", deviceSource);
            jSONObject.put("mac", strBuildNumber);
            jSONObject.put("version", str);
            jSONObject.put("status", IsBoundDeviceConnected);
            if (zIsSupportAtrialFib) {
                jSONObject.put("ppgStatus", IsShowAtrialFib);
            }
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
        String str2 = strAddress;
        str = strBuildNumber;
        strBuildNumber = str2;
        if (zIsSupportAtrialFib) {
            IsShowAtrialFib = AtrialManagerKt.isShowAtrialFib();
        } else {
            IsShowAtrialFib = 0;
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void getStatusBarHeight(String data, JsCallBackFunction function) {
        new GetStatusBarHandler(this.a).handleData(data, function);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void getUserToken(String data, JsCallBackFunction function) {
        new GetUserTokenHandler(this.a).handleData(data, function);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void getUsersInfo(String data, JsCallBackFunction function) {
        new GetUserInfoHandler().handleData(data, function);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public String navigateTo(Context context, String position) {
        return new NavigateToHandler().handleNavigateTo(context, position, null);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void openExternalApp(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void openInBrowser(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void pushBoltNotice(String data, JsCallBackFunction function) {
        new TreadmillNoticeHandler().handleData(data, function);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void pushDeviceCustomNotice(String data, JsCallBackFunction function) {
        new DeviceCustomNoticeHandler().handleData(data, function);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void pushDeviceNotice(String data, JsCallBackFunction function) {
        new DeviceNoticeHandler().handleData(data, function);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void pushNotice(String data, JsCallBackFunction function) {
        HMLog.d("pushNotice", data, new Object[0]);
        JsonObject asJsonObject = new JsonParser().parse(data).getAsJsonObject();
        if (asJsonObject.getAsJsonObject().get("type").isJsonObject()) {
            SleepServiceKt.getSleepService().pushNotice(data, function);
            return;
        }
        try {
            String asString = asJsonObject.getAsJsonObject().get("type").getAsString();
            if (asString.equals("LOGIN_MODAL")) {
                boolean zIsAnonymousUser = PolicyTipUtil.anonymousPolicyApi().isAnonymousUser();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("status", "success");
                jsonObject.addProperty("isAnonymous", Boolean.valueOf(zIsAnonymousUser));
                function.onCallBack(jsonObject.toString());
            } else if (asString.equals("TEMPLATE_SWIPER_LAST")) {
                EventBus.getDefault().post(new SwiperLastEvent());
            } else if (BloodPressureNoticeHandler.isBloodPressureNotice(asString)) {
                BloodPressureNoticeHandler.handle(asString, data, function);
            } else if (ThemeHandler.INSTANCE.intercept(asString)) {
                new ThemeHandler(this.a).handleData(data, function);
            } else if (d.equals(asString)) {
                new PHNSettingNoticeHandler(this.a).handleData(data, function);
            } else if (e.equals(asString)) {
                SkySurveyHandler.handler(function);
            } else if (f.equals(asString)) {
                EventBus.getDefault().post(new EventCloseNps());
            } else if (FreezeAccountHandler.NONAGE_SEND_EMAIL_DONE.equals(asString)) {
                new FreezeAccountHandler().handleData(data, function);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.w("pushNotice", "un handle push notice:" + e2.getMessage(), new Object[0]);
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void pushSystemNotice(String data, JsCallBackFunction function) {
        SystemNoticeHandler systemNoticeHandler = new SystemNoticeHandler();
        if (systemNoticeHandler.handleData(data)) {
            function.onCallBack(JsMessageCenter.get().getSuccess());
        } else {
            function.onCallBack(systemNoticeHandler.getFailedResult().toString());
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void requestToVerify(Map<String, String> params, JsCallBackFunction function, VerifiedCallback callback) {
        new VerifySignHandler().requestToVerify(params, function, callback);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void setCancelAuth(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void setFunctionButtons(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void setTitleBgColor(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void setTitleFgColor(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void setTitleVisibility(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void share(String data, JsCallBackFunction function) {
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void syncWatchSkin(String data, JsCallBackFunction function) {
        new SyncWatchSkinHandler(this.a).handleData(data, function);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void thirdMonitor(String adid, boolean onlyShow, String json) {
        AdRepository.getInstance().requestMonitor(json, adid, onlyShow);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public void weixinPay(String data, JsCallBackFunction function) {
        new WeixinPayHandler().handleData(data, function);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.JsBridgeApi
    public boolean navigateTo(Context context, String position, String data) {
        String strHandleNavigateTo = new NavigateToHandler().handleNavigateTo(context, position, data);
        if (NavigateContent.APP_GOTO_CLOCK_HOME.equals(position) && "sleepMusicH5".equals(data)) {
            SleepServiceKt.getSleepService().jumpToAlarm(data);
        }
        return TextUtils.isEmpty(strHandleNavigateTo);
    }
}
