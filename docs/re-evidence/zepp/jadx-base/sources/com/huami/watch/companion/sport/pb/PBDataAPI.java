package com.huami.watch.companion.sport.pb;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.util.Log;
import io.reactivex.annotations.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Response;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class PBDataAPI {
    private static final String KEY_LIMIT = "limit";
    private static final String KEY_NAME = "name";
    private static final String KEY_STATUS = "status";
    private static final String KEY_TIME_STAMP = "timeStamp";
    private static final String TAG = "Cloud-API-PBData";

    public static class PersonalBestResult {
        public List<PersonalBest> infoList;
        public boolean success;

        public String toString() {
            return "<Success : " + this.success + " PersonInfo : " + this.infoList + SearchCriteria.GT;
        }
    }

    public static PersonalBestResult deletePBData(Context context, String str, String str2) {
        PersonalBestResult personalBestResult = new PersonalBestResult();
        HashMap map = new HashMap();
        map.put("name", str);
        map.put("status", str2);
        Log.d(TAG, "Delete PBData : " + map.toString(), new Object[0]);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newDelete(Cloud.urlPersonalBest(AccountManager.getDefault(context).getCurrentUid()), null, map));
            CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                personalBestResult.success = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.e(TAG, "DeletePBData Failed!!", e, new Object[0]);
        }
        Log.d(TAG, "Delete PBDataResult : " + personalBestResult, new Object[0]);
        return personalBestResult;
    }

    public static PersonalBestResult deletePBDataByTimeStamp(Context context, String str, Long l) {
        PersonalBestResult personalBestResult = new PersonalBestResult();
        HashMap map = new HashMap();
        map.put("name", str);
        map.put(KEY_TIME_STAMP, l.toString());
        Log.d(TAG, "deletePBDataByTimeStamp : " + map.toString(), new Object[0]);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newDelete(Cloud.urlPersonalBest(AccountManager.getDefault(context).getCurrentUid()), null, map));
            CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                personalBestResult.success = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.e(TAG, "deletePBDataByTimeStamp Failed!!", e, new Object[0]);
        }
        Log.d(TAG, "deletePBDataByTimeStamp : " + personalBestResult, new Object[0]);
        return personalBestResult;
    }

    private static String getAllPBName() {
        StringBuilder sb = new StringBuilder();
        PBType[] pBTypeArrValues = PBType.values();
        for (int i = 0; i < pBTypeArrValues.length; i++) {
            sb.append(pBTypeArrValues[i].getName());
            if (i != pBTypeArrValues.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static PersonalBestResult getPBData(Context context, String str) {
        PersonalBestResult personalBestResult = new PersonalBestResult();
        HashMap map = new HashMap();
        map.put("name", getAllPBName());
        map.put("limit", String.valueOf(str.equals(PBConfig.KEY_UNCONFIRMED) ? 1 : 2));
        map.put("status", str);
        Log.d(TAG, "Get Cloud PBData : " + map.toString(), new Object[0]);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlPersonalBest(AccountManager.getDefault(context).getCurrentUid()), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                personalBestResult.success = true;
                if (!TextUtils.isEmpty(strResponseBodyString)) {
                    try {
                        personalBestResult.infoList = parseToList(strResponseBodyString);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e(TAG, "GetPBData Failed!!", e, new Object[0]);
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.e(TAG, "GetPBData Failed!!", e2, new Object[0]);
        }
        Log.d(TAG, "Cloud PBDataResult : " + personalBestResult, new Object[0]);
        return personalBestResult;
    }

    private static List<PersonalBest> parseToList(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("items");
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add((PersonalBest) new Gson().fromJson(jSONArray.getString(i), PersonalBest.class));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static PersonalBestResult updatePBData(Context context, @NonNull List<PersonalBest> list) {
        PersonalBestResult personalBestResult = new PersonalBestResult();
        Log.d(TAG, "Update PBData : " + new Gson().toJson(list), new Object[0]);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlPersonalBest(AccountManager.getDefault(context).getCurrentUid()), new Gson().toJson(list), "application/json"));
            CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                personalBestResult.success = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.e(TAG, "UpdatePBData Failed!!", e, new Object[0]);
        }
        Log.d(TAG, "Update PBDataResult : " + personalBestResult, new Object[0]);
        return personalBestResult;
    }
}
