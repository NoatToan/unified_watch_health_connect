package com.huami.watch.ota.cloud;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class RomInfoApi {
    private static final String f = "HmOta-CloudRomApi";
    private static final String g = "deviceVersion";
    private static final String h = "targetFirmwareVersion";
    private static final String i = "fileSize";
    private static final String j = "fileMD5";
    private static final String k = "fileUrl";
    private static final String l = "upgradeType";
    private static final String m = "changeLog";
    private static final String n = "sensorVersion";
    private static final String o = "firmwareVersion";
    private static final String p = "sensorType";
    private static final String q = "sn";
    private static final String r = "appName";
    private static final String s = "appVersion";
    private static final String t = "country";
    private static final String u = "lang";
    private static final String v = "userId";
    private Context a;
    private String b;
    private String c;
    private String d;
    private String e;

    public RomInfoApi(Context context) {
        this.a = context;
    }

    private static void a(@Nullable JSONObject jSONObject, RomInfo romInfo) {
        Log.i(f, "parseRomInfo ", new Object[0]);
        if (jSONObject == null || romInfo == null) {
            return;
        }
        romInfo.setProductVersion(jSONObject.optString(g));
        romInfo.setFileSize(jSONObject.optString(i));
        romInfo.setMd5Content(jSONObject.optString(j));
        romInfo.setFirmwareVersion(jSONObject.optString(h));
        romInfo.setFileUrl(jSONObject.optString(k));
        romInfo.setUpgradeType("" + jSONObject.optInt(l));
        romInfo.setChangeLog(jSONObject.optString(m));
        romInfo.setSensorVersion(jSONObject.optString(n));
    }

    public int getRomInfo(RomInfo romInfo) {
        int i2;
        Log.i(f, "check rom info", new Object[0]);
        Map<String, String> map = Cloud.SysParams.get(this.a);
        HashMap map2 = new HashMap();
        map2.put(o, this.b);
        map2.put(g, this.c);
        map2.put(n, this.d);
        map2.put("sensorType", SensorRecordsEnity.SensorType.SENSOR_ECG);
        map2.put("sn", this.e);
        map2.put("appName", "com.huami.watch");
        map2.put("appVersion", "1.0");
        map2.put("country", map.get("country"));
        map2.put("lang", map.get("lang"));
        map2.put("userId", Cloud.getUID());
        Request requestNewGet = CloudClient.newGet(Cloud.urlRomUpgradeAPI(), map2);
        int i3 = -1;
        try {
            Response responseDoRequest = CloudClient.doRequest(this.a, requestNewGet);
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                try {
                    if (TextUtils.isEmpty(strResponseBodyString)) {
                        Log.e(f, "RomInfo null !!", new Object[0]);
                        return 1;
                    }
                    a(new JSONObject(strResponseBodyString), romInfo);
                    if (romInfo.getFileUrl().equals("null")) {
                        Log.e(f, "RomInfo message is null !!", new Object[0]);
                        return 1;
                    }
                    i2 = 0;
                } catch (JSONException unused) {
                    Log.e(f, "JSONObject exception  body : [" + strResponseBodyString + "]", new Object[0]);
                    i2 = -1;
                }
            } else {
                Log.i(f, "response error : " + responseDoRequest.code(), new Object[0]);
                i2 = 1;
            }
            responseDoRequest.close();
            i3 = i2;
        } catch (Exception e) {
            Log.i(f, "Get RomInfo Exception!!", e);
            e.printStackTrace();
        }
        Log.i(f, "Result : " + i3, new Object[0]);
        return i3;
    }

    public void setAppTokens(String str) {
    }

    public void setCurrentSysInfo(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public void setCurrentUid(String str) {
    }

    public void setOverSeaUser(boolean z) {
    }

    public void setSerialNum(String str) {
        this.e = str;
    }
}
