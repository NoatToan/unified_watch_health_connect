package com.huami.watch.dataflow.cloud.api;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.dataflow.model.firstbeat.bean.SportLoadDataItem;
import com.huami.watch.dataflow.model.firstbeat.bean.VO2maxDataItem;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class FirstbeatDataAPI {
    private static final String a = "Cloud-API-Firstbeat";
    private static final String b = "startDay";
    private static final String c = "endDay";
    private static final String d = "VO2_MAX";
    private static final String e = "SPORT_LOAD";

    public static class SportLoadResult {
        public List<SportLoadDataItem> sportLoadItems = new ArrayList();
        public boolean success;

        public String toString() {
            return "SportsLoadResult{success=" + this.success + ", sportsLoadDayInfo=" + this.sportLoadItems + '}';
        }
    }

    public static class VO2maxResult {
        public boolean success;
        public List<VO2maxDataItem> vo2maxItems = new ArrayList();

        public String toString() {
            return "Vo2MaxResult{success=" + this.success + ", vo2MaxDayInfo=" + Arrays.toString(this.vo2maxItems.toArray()) + '}';
        }
    }

    public class a extends TypeToken<ArrayList<VO2maxDataItem>> {
    }

    public class b extends TypeToken<ArrayList<SportLoadDataItem>> {
    }

    private static boolean a(Context context, String str, @NonNull String str2) {
        boolean zIsSuccessful;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(str, str2, "application/json"));
            CloudClient.responseBodyString(responseDoRequest);
            zIsSuccessful = responseDoRequest.isSuccessful();
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.e(a, "PostFirstbeatDataErr!!", e2, new Object[0]);
            zIsSuccessful = false;
        }
        Log.d(a, "Post Firstbeat Result : " + zIsSuccessful, new Object[0]);
        return zIsSuccessful;
    }

    public static SportLoadResult getSportLoadHistory(Context context, String str, String str2) {
        SportLoadResult sportLoadResult = new SportLoadResult();
        HashMap map = new HashMap();
        map.put(b, str);
        map.put(c, str2);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlFirstbeat(AccountManager.getDefault(context).getCurrentUid(), e), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                sportLoadResult.success = true;
                if (!TextUtils.isEmpty(strResponseBodyString)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strResponseBodyString);
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gsonBuilder.excludeFieldsWithModifiers(16, 128, 8);
                        sportLoadResult.sportLoadItems = (List) gsonBuilder.create().fromJson(jSONObject.optString("items"), new b().getType());
                    } catch (Exception e2) {
                        try {
                            e2.printStackTrace();
                            Log.e(a, "GetSportsLoadHistory Failed!!", e2, new Object[0]);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            Log.e(a, "GetSportsLoadHistory Failed!!", e3, new Object[0]);
                        }
                    }
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
            Log.e(a, "GetSportsLoadHistory Failed!!", e4, new Object[0]);
            sportLoadResult.success = false;
        }
        Log.d(a, "SportsLoadHistory Result : " + sportLoadResult, new Object[0]);
        return sportLoadResult;
    }

    public static VO2maxResult getVO2maxHistory(Context context, String str, String str2) {
        VO2maxResult vO2maxResult = new VO2maxResult();
        HashMap map = new HashMap();
        map.put(b, str);
        map.put(c, str2);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlFirstbeat(AccountManager.getDefault(context).getCurrentUid(), d), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                vO2maxResult.success = true;
                if (!TextUtils.isEmpty(strResponseBodyString)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strResponseBodyString);
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gsonBuilder.excludeFieldsWithModifiers(16, 128, 8);
                        vO2maxResult.vo2maxItems = (List) gsonBuilder.create().fromJson(jSONObject.optString("items"), new a().getType());
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        Log.e(a, "GetVo2MaxHistory Failed!!", e2, new Object[0]);
                    }
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            Log.e(a, "GetVo2MaxHistory Failed!!", e3, new Object[0]);
            vO2maxResult.success = false;
        }
        Log.d(a, "Vo2MaxHistory Result : " + vO2maxResult, new Object[0]);
        return vO2maxResult;
    }

    public static boolean postConfig(Context context, @NonNull String str) {
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        if (TextUtils.isEmpty(currentUid)) {
            Log.w(a, "UID is Empty : " + currentUid + "!!", new Object[0]);
            return false;
        }
        boolean zA = a(context, Cloud.urlFirstbeatConfig(currentUid), str);
        Log.d(a, "Post Config Success: " + zA, new Object[0]);
        return zA;
    }

    public static boolean postSportLoad(Context context, @NonNull String str) {
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        if (TextUtils.isEmpty(currentUid)) {
            Log.w(a, "UID is Empty : " + currentUid + "!!", new Object[0]);
            return false;
        }
        boolean zA = a(context, Cloud.urlFirstbeat(currentUid, e), str);
        Log.d(a, "Post SportLoad Success: " + zA, new Object[0]);
        return zA;
    }

    public static boolean postVO2max(Context context, @NonNull String str) {
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        if (TextUtils.isEmpty(currentUid)) {
            Log.w(a, "UID is Empty : " + currentUid + "!!", new Object[0]);
            return false;
        }
        boolean zA = a(context, Cloud.urlFirstbeat(currentUid, d), str);
        Log.d(a, "Post VO2max Success: " + zA, new Object[0]);
        return zA;
    }
}
