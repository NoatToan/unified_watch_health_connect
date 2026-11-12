package com.huami.watch.companion.cloud.api;

import android.content.Context;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class AppSettingsAPI {
    private static final String a = "Cloud-API-AppSettings";

    public static String getAppSettings(Context context, String str) throws JSONException {
        Log.d(a, "Get App Settings : " + str, new Object[0]);
        HashMap map = new HashMap();
        map.put("settingName", str);
        map.put("mode", "SINGLE");
        String string = null;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlAppSettingsAPI(), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest, false);
            if (responseDoRequest.isSuccessful()) {
                try {
                    string = new JSONObject(strResponseBodyString).getString(str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            Log.w(a, "Get App Settings Failed!!", e2, new Object[0]);
            e2.printStackTrace();
        }
        return string;
    }

    public static Map<String, String> getAppSettingsRange(Context context, String str) {
        Log.d(a, "Get App Settings : " + str, new Object[0]);
        HashMap map = new HashMap();
        map.put("settingName", str);
        map.put("mode", "RANGE");
        Request requestNewGet = CloudClient.newGet(Cloud.urlAppSettingsAPI(), map);
        HashMap map2 = new HashMap();
        try {
            Response responseDoRequest = CloudClient.doRequest(context, requestNewGet);
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest, false);
            if (responseDoRequest.isSuccessful()) {
                try {
                    JSONObject jSONObject = new JSONObject(strResponseBodyString);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map2.put(next, jSONObject.getString(next));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            Log.w(a, "Get App Settings Failed!!", e2, new Object[0]);
            e2.printStackTrace();
        }
        return map2;
    }
}
