package com.huami.watch.dataflow.cloud.api;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.dataflow.model.health.bean.HealthDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthHRDataItem;
import com.huami.watch.dataflow.util.DataUtil;
import com.huami.watch.dataflow.util.HealthDataParser;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import okhttp3.Response;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class HealthDataAPI {
    public static final int DEVICE_TYPE_WATCH = 4;
    public static final int HEARTRATE_LIMIT = 12;
    public static final int HEARTRATE_TYPE = 1;
    public static final String QUERY_TYPE_DETAIL = "detail";
    private static final String a = "Cloud-API-HealthData";
    private static final String b = "startDay";
    private static final String c = "endDay";
    private static final String d = "queryType";
    private static final String e = "deviceType";
    private static final String f = "type";
    private static final String g = "startTime";
    private static final String h = "endTime";
    private static final String i = "limit";
    private static final String j = "generatedTime";

    public static class HealthDataHRResult {
        public List<HealthHRDataItem> dataItems = new ArrayList();
        public boolean success;

        public String toString() {
            return "<IsSuccess : " + this.success + ", Items : " + this.dataItems.size() + SearchCriteria.GT;
        }
    }

    public static class HealthDataResult {
        public List<HealthDataItem> dataItems = new ArrayList();
        public boolean success;

        public String toString() {
            return "<IsSuccess : " + this.success + ", Items : " + this.dataItems.size() + SearchCriteria.GT;
        }
    }

    public static class HealthDataUpdateTimeResult {
        public int effectiveTime = -1;
        public int lastSyncTime = -1;
        public boolean success;

        public String toString() {
            return "<Success : " + this.success + ", LastSyncTime : " + TimeUtil.formatDateTime(this.lastSyncTime) + ", EffectiveTime : " + TimeUtil.formatDateTime(this.effectiveTime) + SearchCriteria.GT;
        }
    }

    private static HealthDataResult a(Context context, String str, String str2, String str3) {
        HealthDataResult healthDataResult = new HealthDataResult();
        HashMap map = new HashMap();
        map.put(b, str);
        map.put(c, str2);
        map.put(d, str3);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlHealthData(AccountManager.getDefault(context).getCurrentUid(), 4), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest, false);
            if (responseDoRequest.isSuccessful()) {
                healthDataResult.success = true;
                if (!TextUtils.isEmpty(strResponseBodyString)) {
                    try {
                        List<HealthDataItem> listC = c(new JSONObject(strResponseBodyString));
                        healthDataResult.dataItems = listC;
                        DataUtil.sort(listC);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        Log.e(a, "Get HealthData Failed!!", e2, new Object[0]);
                    }
                }
            } else {
                Log.w(a, "Body : " + strResponseBodyString, new Object[0]);
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            Log.e(a, "Get HealthData Failed!!", e3, new Object[0]);
        }
        Log.d(a, "Result : " + healthDataResult, new Object[0]);
        return healthDataResult;
    }

    private static int b(int i2) {
        long j2 = i2;
        return (int) (((j2 * 1000) - ((long) TimeZone.getDefault().getOffset(j2))) / 1000);
    }

    @NonNull
    private static List<HealthDataItem> c(@NonNull JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray != null && jSONArray.length() > 0) {
            arrayList = new ArrayList(jSONArray.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                HealthDataItem healthDataItem = new HealthDataItem();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                healthDataItem.setDeviceSource(jSONObject2.optInt("deviceSource"));
                healthDataItem.setDate(jSONObject2.optString("date"));
                healthDataItem.setSummary(jSONObject2.optString("summary"));
                healthDataItem.setData(HealthDataParser.toBytes(jSONObject2.optString("mergedRawData")));
                healthDataItem.setHeartRateData(HealthDataParser.toBytes(jSONObject2.optString(ParamKey.heartRateData)));
                arrayList.add(healthDataItem);
            }
        }
        return arrayList;
    }

    @NonNull
    private static List<HealthHRDataItem> d(@NonNull JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray != null && jSONArray.length() > 0) {
            arrayList = new ArrayList(jSONArray.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                HealthHRDataItem healthHRDataItem = new HealthHRDataItem();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                healthHRDataItem.setHeartRate(HealthDataParser.toHeartRate(jSONObject2.optString(ParamKey.heartRateData)));
                healthHRDataItem.setTimestamp(jSONObject2.optLong("generatedTime"));
                healthHRDataItem.setTimezone(jSONObject2.optInt("timeZone"));
                healthHRDataItem.setDId(jSONObject2.optString("deviceId"));
                healthHRDataItem.setDeviceSource(jSONObject2.optInt("deviceSource"));
                arrayList.add(healthHRDataItem);
            }
        }
        return arrayList;
    }

    public static boolean deleteHeartRate(Context context, long j2) {
        HashMap map = new HashMap();
        map.put("deviceType", String.valueOf(4));
        boolean z = true;
        map.put("type", String.valueOf(1));
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newDelete(Cloud.urlDelHeartRate(AccountManager.getDefault(context).getCurrentUid(), j2), null, map));
            CloudClient.responseBodyString(responseDoRequest, true);
            if (!responseDoRequest.isSuccessful() && responseDoRequest.code() != 404) {
                z = false;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.e(a, "Del HealthHRData Failed!!", e2, new Object[0]);
        }
        Log.d(a, "Success : " + z, new Object[0]);
        return z;
    }

    public static HealthDataResult getDetail(Context context, String str) {
        return a(context, str, str, "detail");
    }

    public static HealthDataHRResult getHeartRate(Context context, long j2, long j3) {
        return getHeartRate(context, j2, j3, 12);
    }

    @NonNull
    public static HealthDataUpdateTimeResult getLastSyncTime(Context context) {
        HealthDataUpdateTimeResult healthDataUpdateTimeResult = new HealthDataUpdateTimeResult();
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        if (TextUtils.isEmpty(currentUid)) {
            return healthDataUpdateTimeResult;
        }
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlHealthDataSyncTime(currentUid)));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                healthDataUpdateTimeResult.success = true;
                if (!TextUtils.isEmpty(strResponseBodyString)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strResponseBodyString);
                        healthDataUpdateTimeResult.effectiveTime = jSONObject.optInt("effectiveTime", -1);
                        healthDataUpdateTimeResult.lastSyncTime = jSONObject.optInt("lastSyncTime", -1);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            } else if (responseDoRequest.code() == 404) {
                healthDataUpdateTimeResult.success = true;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            Log.e(a, "Get HealthData UpdateTime Fail!!", e3, new Object[0]);
        }
        Log.d(a, "Result : " + healthDataUpdateTimeResult, new Object[0]);
        return healthDataUpdateTimeResult;
    }

    public static int getLastSyncTimeSecs(Context context) {
        HealthDataUpdateTimeResult lastSyncTime = getLastSyncTime(context);
        if (!lastSyncTime.success) {
            return -1;
        }
        int i2 = lastSyncTime.lastSyncTime;
        if (i2 > 0) {
            return i2;
        }
        int i3 = lastSyncTime.effectiveTime;
        if (i3 <= 0) {
            return 0;
        }
        int iB = b(i3);
        Log.d(a, "Get LastSyncTimeSecs(via EffectiveTime) : " + iB, new Object[0]);
        return iB;
    }

    @NonNull
    public static HealthDataResult getSummary(Context context, String str, String str2) {
        return a(context, str, str2, null);
    }

    public static boolean postData(Context context, @NonNull String str) {
        boolean zIsSuccessful;
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        if (TextUtils.isEmpty(currentUid)) {
            Log.w(a, "UID is Empty : " + currentUid + "!!", new Object[0]);
            return false;
        }
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlHealthData(currentUid, 4), str, "application/json"));
            CloudClient.responseBodyString(responseDoRequest);
            zIsSuccessful = responseDoRequest.isSuccessful();
        } catch (IOException e2) {
            Log.e(a, "PostHealthDataErr", e2, new Object[0]);
            zIsSuccessful = false;
        }
        Log.d(a, "Post HealthData, Success : " + zIsSuccessful, new Object[0]);
        return zIsSuccessful;
    }

    public static boolean postHeartRate(Context context, String str) {
        boolean zIsSuccessful;
        HashMap map = new HashMap();
        map.put("deviceType", String.valueOf(4));
        map.put("type", String.valueOf(1));
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlHeartRateData(AccountManager.getDefault(context).getCurrentUid()), (Map<String, String>) null, map, str));
            CloudClient.responseBodyString(responseDoRequest, true);
            zIsSuccessful = responseDoRequest.isSuccessful();
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.e(a, "PostHRDataFail", e2, new Object[0]);
            zIsSuccessful = false;
        }
        Log.d(a, "Post HRData Success : " + zIsSuccessful, new Object[0]);
        return zIsSuccessful;
    }

    public static boolean postPaiData(Context context, @NonNull String str) {
        boolean zIsSuccessful;
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        if (TextUtils.isEmpty(currentUid)) {
            Log.w(a, "UID is Empty : " + currentUid + "!!", new Object[0]);
            return false;
        }
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlPai(currentUid), str, "application/json"));
            CloudClient.responseBodyString(responseDoRequest);
            zIsSuccessful = responseDoRequest.isSuccessful();
        } catch (IOException e2) {
            Log.e(a, "postPaiData", e2, new Object[0]);
            zIsSuccessful = false;
        }
        Log.d(a, "Post PaiData, Success : " + zIsSuccessful, new Object[0]);
        return zIsSuccessful;
    }

    public static HealthDataResult getDetail(Context context, String str, String str2) {
        return a(context, str, str2, "detail");
    }

    public static HealthDataHRResult getHeartRate(Context context, long j2, long j3, int i2) {
        HealthDataHRResult healthDataHRResult = new HealthDataHRResult();
        HashMap map = new HashMap();
        map.put("deviceType", String.valueOf(4));
        map.put("type", String.valueOf(1));
        map.put("limit", String.valueOf(i2));
        map.put("startTime", String.valueOf(j2));
        map.put("endTime", String.valueOf(j3));
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlHeartRateData(AccountManager.getDefault(context).getCurrentUid()), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                healthDataHRResult.success = true;
                if (!TextUtils.isEmpty(strResponseBodyString)) {
                    try {
                        List<HealthHRDataItem> listD = d(new JSONObject(strResponseBodyString));
                        healthDataHRResult.dataItems = listD;
                        DataUtil.sortHRItems(listD);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        Log.e(a, "Get HealthHRData Failed!!", e2, new Object[0]);
                    }
                }
            } else {
                Log.w(a, "Body : " + strResponseBodyString, new Object[0]);
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            Log.e(a, "Get HealthHRData Failed!!", e3, new Object[0]);
        }
        Log.d(a, "HRData Result: " + healthDataHRResult, new Object[0]);
        return healthDataHRResult;
    }
}
