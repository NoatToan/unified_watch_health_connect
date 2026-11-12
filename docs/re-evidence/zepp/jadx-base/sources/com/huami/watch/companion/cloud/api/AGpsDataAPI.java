package com.huami.watch.companion.cloud.api;

import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes16.dex */
public class AGpsDataAPI {
    private static final String a = "Cloud-API-AGpsData";

    /* JADX INFO: Removed unreachable split cross block B:26:0x0092 */
    public static byte[] getData(Context context, String str) {
        Log.d(a, "Get AGps Data : " + str, new Object[0]);
        HashMap map = new HashMap();
        map.put("days", String.valueOf(7));
        Request requestNewGet = CloudClient.newGet(Cloud.urlAGPSDataAPI(str), map);
        byte[] bArrBytes = null;
        try {
            Response responseDoRequest = CloudClient.doRequest(context, requestNewGet);
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful() && !TextUtils.isEmpty(strResponseBodyString)) {
                try {
                    JSONArray jSONArray = new JSONArray(strResponseBodyString);
                    if (jSONArray.length() >= 1) {
                        String string = jSONArray.getJSONObject(0).getString("fileUrl");
                        if (!TextUtils.isEmpty(string)) {
                            Response responseDoRequest2 = CloudClient.OkHttp.doRequest(CloudClient.OkHttp.newGet(string));
                            if (responseDoRequest2.isSuccessful()) {
                                bArrBytes = responseDoRequest2.body().bytes();
                            } else {
                                CloudClient.responseBodyString(responseDoRequest2);
                            }
                        }
                    }
                } catch (JSONException e) {
                    Log.w(a, "Get AGps Data Failed!!", e, new Object[0]);
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            Log.w(a, "Get AGps Data Failed!!", e2, new Object[0]);
            e2.printStackTrace();
        }
        Log.d(a, "Get AGps Data : " + bArrBytes, new Object[0]);
        return bArrBytes;
    }
}
