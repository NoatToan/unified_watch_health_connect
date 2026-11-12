package com.huami.watch.companion.cloud.api;

import android.content.Context;
import com.huami.account.UserLegalInfoManager;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.util.MobileUtil;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.Log;
import java.io.IOException;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class StatisticsAPI {
    private static final String a = "Cloud-API-Statistics";
    private static final String b = "3";

    private static String a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("v", "3");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("brand", MobileUtil.getInstance(context).getBrand());
            jSONObject3.put("model", MobileUtil.getInstance(context).getModel());
            jSONObject3.put("osversion", MobileUtil.getInstance(context).getAndroidVersion());
            jSONObject3.put("systemtype", MobileUtil.getInstance(context).getRomName());
            jSONObject3.put("country", I18nUtil.getLocaleCountry(context));
            jSONObject3.put(UserLegalInfoManager.KEY_LANGUAGE, I18nUtil.getLocaleStr(context));
            jSONObject3.put("network", MobileUtil.getInstance(context).getNetworkType());
            jSONObject3.put("resolution", MobileUtil.getInstance(context).getResolution());
            jSONObject2.put("phone", jSONObject3.toString());
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("appversion", AppUtil.getVersionName(context));
            jSONObject4.put("channel", AppUtil.getMetaDataChannel(context));
            jSONObject2.put("app", jSONObject4.toString());
            Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
            if (currentDevice != null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("romversion", DeviceUtil.getRomVersion(currentDevice));
                jSONObject2.put("watch", jSONObject5.toString());
            }
            jSONObject.put("details", jSONObject2.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static boolean postStatistics(Context context) {
        boolean zIsSuccessful;
        String strA = a(context);
        Log.d(a, "Post Statistics Body : " + strA, new Object[0]);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlStatistics(Account.getUID(context)), strA, "application/json"));
            CloudClient.responseBodyString(responseDoRequest);
            zIsSuccessful = responseDoRequest.isSuccessful();
        } catch (IOException e) {
            e.printStackTrace();
            Log.w(a, "PostStatisticsErr!!", e, new Object[0]);
            zIsSuccessful = false;
        }
        Log.d(a, "Post Statistics Success : " + zIsSuccessful, new Object[0]);
        return zIsSuccessful;
    }
}
