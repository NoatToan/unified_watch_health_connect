package com.huami.watch.dataflow.cloud.api;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.health.afppg.data.remote.AfPpgWebApi;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.dataflow.model.health.bean.AtrialFibrillationDataItem;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes16.dex */
public class AtrialFibrillationDataAPI {
    private static final String a = "AtrialFibrillationData-API";

    public static class EventsListResult {

        @SerializedName("items")
        public List<AtrialFibrillationDataItem> items;

        @SerializedName("next")
        public AtrialFibrillationDataItem next;
    }

    public class a {

        @SerializedName("fileName")
        public String a;

        @SerializedName("fileType")
        public String b;

        @SerializedName("getURI")
        public String c;

        @SerializedName("objectName")
        public String d;

        @SerializedName("putURI")
        public String e;

        @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
        public int f;

        public a() {
        }
    }

    private static a a(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("fileType", AfPpgWebApi.PARAM_FILE_TYPE_VALUE_RRPEAK);
        map.put("fileName", str2);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlPpgFileUri(str, Cloud.SysParams.APP_NAME), map));
            if (!responseDoRequest.isSuccessful()) {
                return null;
            }
            return (a) new Gson().fromJson(CloudClient.responseBodyString(responseDoRequest), a.class);
        } catch (Exception e) {
            Log.e(a, "获取PPG文件上传URI错误", e, new Object[0]);
            return null;
        }
    }

    private static boolean b(Context context, String str, @NonNull byte[] bArr) {
        boolean zIsSuccessful;
        try {
            zIsSuccessful = CloudClient.doRequest(context, CloudClient.OkHttp.newPut(str, RequestBody.create((MediaType) null, bArr))).isSuccessful();
        } catch (IOException e) {
            Log.e(a, "文件上传异常", e, new Object[0]);
            zIsSuccessful = false;
        }
        Log.d(a, "Ppg File Upload:" + zIsSuccessful, new Object[0]);
        return zIsSuccessful;
    }

    public static List<AtrialFibrillationDataItem> getEventsList(Context context, String str, String str2, long j, long j2, int i, boolean z) {
        HashMap map = new HashMap();
        map.put("eventType", str2);
        map.put("from", String.valueOf(j));
        map.put("to", String.valueOf(j2));
        map.put("limit", String.valueOf(i));
        map.put("reverse", String.valueOf(z));
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlEvents(str), map));
            if (!responseDoRequest.isSuccessful()) {
                return null;
            }
            EventsListResult eventsListResult = (EventsListResult) new Gson().fromJson(CloudClient.responseBodyString(responseDoRequest), EventsListResult.class);
            if (eventsListResult != null) {
                return eventsListResult.items;
            }
            return null;
        } catch (Exception e) {
            Log.e(a, "获取EVENTS列表失败", e, new Object[0]);
            return null;
        }
    }

    public static boolean postAfResults(Context context, String str, Map<String, Integer> map, int i, int i2, String str2, String str3, String str4) {
        HashMap map2 = new HashMap();
        map2.put("timeZone", Integer.valueOf(i));
        map2.put("resultMap", map);
        map2.put("deviceSource", Integer.valueOf(i2));
        HashMap map3 = new HashMap();
        map3.put("sn", str2);
        map3.put("deviceId", str3);
        map3.put("fwVer", str4);
        map2.put("extra", map3);
        try {
            boolean zIsSuccessful = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlAfResult(str), new Gson().toJson(map2), "application/json")).isSuccessful();
            Log.d(a, "upload afResult data result:" + zIsSuccessful, new Object[0]);
            return zIsSuccessful;
        } catch (Exception e) {
            Log.e(a, "post afResults error", e, new Object[0]);
            return false;
        }
    }

    public static boolean postEvents(Context context, String str, String str2, long j, int i, String str3, String str4, int i2) {
        HashMap map = new HashMap(8);
        map.put("eventType", str2);
        map.put("timestamp", Long.valueOf(j));
        map.put("userId", str);
        map.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Integer.valueOf(i));
        map.put("sn", str3);
        map.put("deviceId", str4);
        map.put("deviceSource", Integer.valueOf(i2));
        map.put("appName", Cloud.SysParams.APP_NAME);
        try {
            return CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlEvents(str), new Gson().toJson(Collections.singletonList(map)), "application/json")).isSuccessful();
        } catch (Exception e) {
            Log.e(a, "上传EVENTS失败", e, new Object[0]);
            return false;
        }
    }

    public static boolean uploadData(Context context, String str, long j, int i, Object obj, String str2, byte[] bArr) {
        a aVarA = a(context, str, str2);
        if (aVarA == null) {
            return false;
        }
        boolean zB = b(context, aVarA.e, bArr);
        if (!zB) {
            return zB;
        }
        HashMap map = new HashMap();
        map.put("objectName", aVarA.d);
        HashMap map2 = new HashMap();
        map2.put("generatedTime", Long.valueOf(j / 1000));
        map2.put("value", obj);
        map2.put("type", Integer.valueOf(i));
        map.put("metadata", map2);
        try {
            boolean z = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlRrPeak(str), new Gson().toJson(map), "application/json")).code() == 200;
            Log.d(a, "upload ppg file data, type:" + i + ", result:" + z, new Object[0]);
            return z;
        } catch (Exception e) {
            Log.e(a, "上传房颤信息失败", e, new Object[0]);
            return false;
        }
    }

    public static List<AtrialFibrillationDataItem> getEventsList(Context context, String str, String str2, long j, long j2, int i) {
        return getEventsList(context, str, str2, j, j2, i, false);
    }

    public static boolean postEvents(Context context, String str, List<AtrialFibrillationDataItem> list) {
        ArrayList arrayList = new ArrayList();
        for (AtrialFibrillationDataItem atrialFibrillationDataItem : list) {
            HashMap map = new HashMap(8);
            map.put("eventType", atrialFibrillationDataItem.eventType);
            map.put("timestamp", Long.valueOf(atrialFibrillationDataItem.timestamp));
            map.put("userId", str);
            map.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Integer.valueOf(atrialFibrillationDataItem.active));
            map.put("sn", atrialFibrillationDataItem.deviceSn);
            map.put("deviceId", atrialFibrillationDataItem.deviceId);
            map.put("deviceSource", Integer.valueOf(atrialFibrillationDataItem.deviceSource));
            map.put("appName", Cloud.SysParams.APP_NAME);
            arrayList.add(map);
        }
        try {
            return CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlEvents(str), new Gson().toJson(arrayList), "application/json")).isSuccessful();
        } catch (Exception e) {
            Log.e(a, "上传EVENTS失败", e, new Object[0]);
            return false;
        }
    }
}
