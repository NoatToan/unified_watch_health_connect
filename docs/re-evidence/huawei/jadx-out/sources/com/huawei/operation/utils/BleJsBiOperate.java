package com.huawei.operation.utils;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lmf;
import defpackage.nio;
import defpackage.qrk;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class BleJsBiOperate {
    private static final int DEFAULT_MAP_SIZE = 16;
    private static final String KEY_API_NAME = "apiName";
    private static final String KEY_BLE_CONNECT_STATE = "state";
    private static final String KEY_CALL_TIME = "callTime";
    private static final String KEY_COST_TIME = "costTime";
    private static final String KEY_COUNTRY = "country";
    private static final String KEY_DATA_SIZE = "data_size";
    private static final String KEY_DATA_TYPE = "dataType";
    private static final String KEY_DEVICE_NAME = "name";
    private static final String KEY_DEVICE_TYPE = "deviceType";
    private static final String KEY_KIND_NAME = "kind_name";
    private static final String KEY_PRODUCT_ID = "productId";
    private static final String KEY_RESULT = "result";
    private static final String KEY_TIME_LIST = "time_list";
    private static final String KEY_UNIQUE_ID = "uniqueId";
    private static final String MAC_ADDRESS = "macAddress";
    private static final String OTA_URL = "url";
    private static final String TAG = "BleJsBiOperate";
    private long mCallingEndTime;
    private long mCallingStartTime;

    public void init() {
        this.mCallingStartTime = System.currentTimeMillis();
    }

    public void biApiCalling(ContentValues contentValues, String str, String str2, int i, String str3) {
        LogUtil.d(TAG, "entry biApiCalling!");
        if (contentValues == null) {
            LogUtil.e(TAG, "biApiCalling: deviceInfo is null");
            return;
        }
        this.mCallingEndTime = System.currentTimeMillis();
        HashMap map = new HashMap(16);
        map.put("uniqueId", nio.e(contentValues.getAsString("uniqueId")));
        map.put("productId", str);
        map.put("name", getDeviceName(str));
        map.put("deviceType", contentValues.getAsString("deviceType"));
        map.put("apiName", str2);
        map.put(KEY_DATA_TYPE, Integer.valueOf(i));
        map.put("result", str3);
        map.put("country", Utils.getCountryCode());
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put("costTime", String.valueOf(this.mCallingEndTime - this.mCallingStartTime));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_BLUETOOTH_PRIVATE_PROTOCOL_H5_ACCESS_2040007.value(), map, 0);
    }

    public void tickBiBleConnect(ContentValues contentValues, int i, String str) {
        LogUtil.d(TAG, "entry tickBiBleConnect!");
        if (contentValues == null) {
            LogUtil.e(TAG, "tickBiBleConnect: deviceInfo is null");
            return;
        }
        HashMap map = new HashMap(16);
        map.put(KEY_KIND_NAME, contentValues.getAsString("deviceType"));
        map.put("uniqueId", nio.e(contentValues.getAsString("uniqueId")));
        map.put("productId", str);
        map.put("state", String.valueOf(i));
        map.put("name", getDeviceName(str));
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put("prodId", ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getProdId(str));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.THIRD_PARTY_EQUIPMENT_H5_BLUETOOTH_CONNECT_2060107.value(), map, 0);
    }

    public void tickBiDataSize(ContentValues contentValues, List<HiHealthData> list, String str, int i) {
        LogUtil.d(TAG, "entry tickBiDataSize!");
        if (contentValues == null) {
            LogUtil.e(TAG, "tickBiDataSize: deviceInfo is null");
            return;
        }
        String strE = nio.e(contentValues.getAsString("uniqueId"));
        HashMap map = new HashMap(16);
        map.put(KEY_KIND_NAME, contentValues.getAsString("deviceType"));
        map.put("uniqueId", strE);
        map.put("productId", str);
        map.put(KEY_DATA_SIZE, String.valueOf(list.size()));
        map.put("name", getDeviceName(str));
        map.put(KEY_DATA_TYPE, String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(qrk.a(it.next().getEndTime()));
        }
        map.put(KEY_TIME_LIST, arrayList);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.THIRD_PARTY_EQUIPMENT_H5_OFFLINE_DATA_2060108.value(), map, 0);
    }

    public void tickBiOtaDownloadComplete(String str, String str2, String str3) {
        LogUtil.d(TAG, "entry tickBiOtaDownloadComplete!");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a(TAG, "productId or uniqueId is empty");
            return;
        }
        String prodId = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getProdId(str);
        HashMap map = new HashMap(16);
        if (!TextUtils.isEmpty(prodId)) {
            map.put("prodId", prodId);
        }
        map.put(MAC_ADDRESS, nio.e(str2));
        map.put("url", str3);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.OTA_DOWNLOAD_COMPLETE_EVENT.value(), map, 0);
    }

    private String getDeviceName(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "productId is empty");
            return "";
        }
        String productInfo = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getProductInfo(str);
        if (!TextUtils.isEmpty(productInfo)) {
            try {
                return new JSONObject(productInfo).getString("deviceName");
            } catch (JSONException unused) {
                LogUtil.e(TAG, "getDeviceName jsonException");
            }
        }
        return "";
    }
}
