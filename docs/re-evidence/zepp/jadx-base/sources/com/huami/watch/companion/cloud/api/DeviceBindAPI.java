package com.huami.watch.companion.cloud.api;

import android.content.Context;
import android.text.TextUtils;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceBindAPI {
    public static final int STATUS_HAS_BIND = 1;
    private static final String a = "Cloud-API-DeviceBind";

    private static int a(String str) {
        int i = 0;
        try {
            long j = Long.parseLong(str);
            byte[] bArr = {(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24)};
            int i2 = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                try {
                    i2 ^= bArr[i3] & 255;
                    for (int i4 = 0; i4 < 8; i4++) {
                        i2 = (i2 & 1) != 0 ? ((i2 >> 1) & 255) ^ 140 : (i2 >> 1) & 255;
                    }
                } catch (Exception e) {
                    e = e;
                    i = i2;
                    e.printStackTrace();
                    return i;
                }
            }
            return i2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static String b(Context context, String str, Device device) {
        if (device == null || TextUtils.isEmpty(device.getCpuId())) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceId", device.getCpuId());
            jSONObject.put("deviceType", 4);
            jSONObject.put("deviceSource", DeviceSource.getDeviceSource(device));
            jSONObject.put(TakePicSettingActivity.KEY_ADDRESS, device.address());
            jSONObject.put("firmwareVersion", device.info().buildNumber());
            jSONObject.put("softwareVersion", AppUtil.getVersionName(context));
            jSONObject.put("systemVersion", AppUtil.getSystemVersion());
            jSONObject.put("brand", AppUtil.getPhoneBrand());
            jSONObject.put("systemModel", AppUtil.getPhoneModel());
            jSONObject.put("applicationTime", String.valueOf(device.bindTimestamp() / 1000));
            jSONObject.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_UID_CRC, a(str));
            jSONObject.put("bindingStatus", "1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("SN", device.getSN());
            jSONObject2.put("overseaEdition", device.isOverseaEdition());
            jSONObject2.put("huamiModel", device.info().getHuamiModel());
            jSONObject2.put("huamiBuildNum", device.info().getHuamiBuildNum());
            jSONObject2.put("androidDeviceId", device.info().getAndroidDId());
            jSONObject2.put("modelNum", device.info().modelNumber());
            jSONObject2.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_AUTH_KEY, device.info().bleAuthKey);
            jSONObject.put("additionalInfo", jSONObject2.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static boolean deleteDeviceBindInfo(Context context, String str) {
        Log.d(a, "Delete DeviceBindInfo : " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("deviceType", String.valueOf(4));
        boolean z = true;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newDelete(Cloud.urlDeviceBindAPI(Account.getUID(context), str), null, map));
            CloudClient.responseBodyString(responseDoRequest);
            if (!responseDoRequest.isSuccessful() && responseDoRequest.code() != 409) {
                z = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.w(a, "Delete DeviceBindInfo Failed!!", e, new Object[0]);
        }
        Log.d(a, "Result Unbind : " + z, new Object[0]);
        return z;
    }

    public static boolean hasBoundDevice(Context context, String str) {
        Log.d(a, "Get DeviceBindInfo!!", new Object[0]);
        HashMap map = new HashMap();
        map.put("deviceType", String.valueOf(4));
        map.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_UID_CRC, String.valueOf(a(Account.getUID(context))));
        boolean zIsSuccessful = true;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlDeviceBindAPI(Account.getUID(context), str, "binding"), map));
            CloudClient.responseBodyString(responseDoRequest);
            zIsSuccessful = true ^ responseDoRequest.isSuccessful();
        } catch (IOException e) {
            e.printStackTrace();
            Log.w(a, "Get DeviceBindInfo Fail!!", e, new Object[0]);
        }
        Log.d(a, "Result Has Bind : " + zIsSuccessful, new Object[0]);
        return zIsSuccessful;
    }

    public static boolean postDeviceBindInfo(Context context, Device device) {
        boolean zIsSuccessful;
        String uid = Account.getUID(context);
        String strB = b(context, uid, device);
        Log.d(a, "Post DeviceBindInfo : " + device + ", " + strB, new Object[0]);
        if (TextUtils.isEmpty(strB)) {
            return false;
        }
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlDeviceBindAPI(uid, new String[0]), strB, "application/json"));
            CloudClient.responseBodyString(responseDoRequest);
            zIsSuccessful = responseDoRequest.isSuccessful();
        } catch (IOException e) {
            e.printStackTrace();
            Log.w(a, "Post DeviceBindInfo Failed!!", e, new Object[0]);
            zIsSuccessful = false;
        }
        Log.d(a, "Result Bind : " + zIsSuccessful, new Object[0]);
        return zIsSuccessful;
    }
}
