package com.huami.watch.companion.account;

import android.content.Context;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.util.Log;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class AccountApi {
    private static final String a = "Cloud-AccountApi";

    public static String checkDisneyUserAge(Context context) {
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlGdprState(Account.getUID(context))));
            if (responseDoRequest.isSuccessful()) {
                return new JSONObject(CloudClient.responseBodyString(responseDoRequest)).optString("state", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(a, "检测迪士尼年龄限制失败", e, new Object[0]);
        }
        return "";
    }
}
