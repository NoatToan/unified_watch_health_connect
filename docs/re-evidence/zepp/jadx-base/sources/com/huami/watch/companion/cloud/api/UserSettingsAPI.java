package com.huami.watch.companion.cloud.api;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.passport.Configs;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.Response;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class UserSettingsAPI {
    private static final String a = "Cloud-API-UserSettings";

    public static final class GetUserSettingsResult {
        public boolean isSuccess;
        public Map<String, String> settings;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("<IsSuccess : ");
            sb.append(this.isSuccess);
            sb.append(", Settings Count : ");
            Map<String, String> map = this.settings;
            sb.append(map == null ? null : Integer.valueOf(map.size()));
            sb.append(", Settings:");
            sb.append(this.settings);
            sb.append(SearchCriteria.GT);
            return sb.toString();
        }
    }

    @NonNull
    private static String a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(map != null ? Integer.valueOf(map.size()) : "NaN");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(", ");
        sb2.append(map != null ? map.keySet() : "Null");
        return sb2.toString();
    }

    public static GetUserSettingsResult getUserSettings(Context context, String str, boolean z) {
        Log.d(a, "Get Settings : " + str + ", ByScope : " + z, new Object[0]);
        GetUserSettingsResult getUserSettingsResult = new GetUserSettingsResult();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("propertyName", str);
        if (z) {
            map2.put("mode", "RANGE");
        } else {
            map2.put("mode", "SINGLE");
        }
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlUserSettingsAPI(Account.getUID(context)), map2));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                try {
                    JSONObject jSONObject = new JSONObject(strResponseBodyString);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject.getString(next));
                    }
                    getUserSettingsResult.isSuccess = true;
                } catch (JSONException e) {
                    Log.e(a, "Get Settings : " + str + ", ByScope : " + z + ", Failed!!", e, new Object[0]);
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            Log.e(a, "Get Settings : " + str + ", ByScope : " + z + ", Failed!!", e2, new Object[0]);
            e2.printStackTrace();
        }
        getUserSettingsResult.settings = map;
        Log.d(a, "Result : " + getUserSettingsResult, new Object[0]);
        return getUserSettingsResult;
    }

    public static boolean postUserSetting(Context context, String str, String str2) {
        Log.d(a, "Post Setting : <" + str + ", " + str2 + SearchCriteria.GT, new Object[0]);
        HashMap map = new HashMap();
        map.put(str, str2);
        return postUserSettings(context, map);
    }

    public static boolean postUserSettings(Context context, @NonNull Map<String, String> map) {
        boolean zIsSuccessful;
        Log.d(a, "Post Settings : " + a(map), new Object[0]);
        if (map.size() == 0) {
            return true;
        }
        Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            if (key != null && (key.startsWith(UserSettingsKeys.SCOPE_LOCAL_ONLY) || key.startsWith(UserSettingsKeys.SCOPE_LOCAL_ONLY_PHONE))) {
                it2.remove();
            }
        }
        Log.d(a, "Post Settings : " + a(map), new Object[0]);
        if (map.size() == 0) {
            return true;
        }
        String string = null;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                jSONObject2.put(entry.getKey(), value);
            }
            jSONObject.put(Configs.Params.PROPERTIES, jSONObject2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        HashMap map2 = new HashMap();
        map2.put("Content-Type", "application/json");
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlUserSettingsAPI(Account.getUID(context)), map2, string, "application/json"));
            CloudClient.responseBodyString(responseDoRequest);
            zIsSuccessful = responseDoRequest.isSuccessful();
        } catch (IOException e2) {
            Log.e(a, "Post Settings Failed!!", e2, new Object[0]);
            e2.printStackTrace();
            zIsSuccessful = false;
        }
        Log.d(a, "Post Settings Result : " + zIsSuccessful, new Object[0]);
        return zIsSuccessful;
    }
}
