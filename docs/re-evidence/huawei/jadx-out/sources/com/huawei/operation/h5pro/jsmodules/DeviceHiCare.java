package com.huawei.operation.h5pro.jsmodules;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.arkuidevice.DeviceBridgeApi;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.njy;
import health.compact.a.Base64;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class DeviceHiCare extends JsBaseModule {
    private static final int DEFAULT_QUALITY = 100;
    public static final String KEY_DEVICE_NAME = "displayName";
    public static final String KEY_DEVICE_PIC = "picUrl";
    public static final String KEY_MAC = "mac";
    public static final String KEY_MODEL = "model";
    public static final String KEY_SELECT_COUNTRY = "countryCode";
    public static final String KEY_SITE_CODE = "siteCode";
    public static final String KEY_SITE_LANG = "siteLang";
    private static final String TAG = "DeviceHiCare";
    private String mac;
    private String siteCode;
    private String siteLang;

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        if (h5ProBundle == null) {
            return;
        }
        this.siteCode = h5ProBundle.getString("siteCode");
        this.siteLang = h5ProBundle.getString(KEY_SITE_LANG);
        this.mac = h5ProBundle.getString("mac");
        LogUtil.a(TAG, "DeviceHiCare onCreate ", "siteCode:", this.siteCode, " siteLang:", this.siteLang);
    }

    @JavascriptInterface
    public String getDeviceCommonInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("siteCode", this.siteCode);
            jSONObject.put(KEY_SITE_LANG, this.siteLang);
            jSONObject.put("countryCode", SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country"));
            addDeviceInfo(jSONObject);
        } catch (JSONException e) {
            LogUtil.j(TAG, "getDeviceCommonInfo:", e.getMessage());
        }
        return jSONObject.toString();
    }

    private void addDeviceInfo(JSONObject jSONObject) throws JSONException {
        DeviceInfo deviceInfo;
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(this.mac);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, TAG);
        if (njy.e(deviceList) || (deviceInfo = deviceList.get(0)) == null) {
            return;
        }
        Bitmap wearDeviceBitmap = ((DeviceBridgeApi) Services.b("DeviceBridgeApiManager", DeviceBridgeApi.class)).getWearDeviceBitmap(deviceInfo);
        jSONObject.put("displayName", deviceInfo.getDeviceName());
        jSONObject.put(KEY_DEVICE_PIC, bitmapToBase64String(wearDeviceBitmap));
        jSONObject.put("model", TextUtils.isEmpty(deviceInfo.getCertModel()) ? deviceInfo.getDeviceModel() : deviceInfo.getCertModel());
        jSONObject.put("mac", this.mac);
        LogUtil.a(TAG, "addDeviceInfo:", deviceInfo.getDeviceName(), ",", jSONObject.opt("model"));
    }

    public static String bitmapToBase64String(Bitmap bitmap) {
        if (bitmap == null) {
            ReleaseLogUtil.d(TAG, "bitmapToBase64String bitmap is null");
            return "";
        }
        return Base64.b(bitmapToByteArray(bitmap, false));
    }

    public static byte[] bitmapToByteArray(Bitmap bitmap, boolean z) {
        if (bitmap == null || bitmap.isRecycled()) {
            LogUtil.j(TAG, "bitmapToByteArray sourceBitmap is null or recycled");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        if (z) {
            bitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            LogUtil.e(TAG, "bitmapToByteArray IOException");
            return byteArray;
        }
    }
}
