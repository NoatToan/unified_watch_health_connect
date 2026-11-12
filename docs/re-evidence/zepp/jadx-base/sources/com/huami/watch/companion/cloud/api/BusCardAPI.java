package com.huami.watch.companion.cloud.api;

import android.content.Context;
import android.text.TextUtils;
import com.huami.nfc.web.PayHeaderKt;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.util.Log;
import java.util.HashMap;
import okhttp3.Response;
import org.json.JSONException;

/* JADX INFO: loaded from: classes16.dex */
public class BusCardAPI {
    private static final String a = "BusCardAPI";

    private static String a(String str) throws JSONException {
        TextUtils.isEmpty(str);
        return "";
    }

    public static String getOpenedBusCardInfo(Context context, String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json");
        map.put(PayHeaderKt.HEADER_IMEI, str);
        map.put("deviceId", str2);
        map.put(PayHeaderKt.HEADER_CPLC, str3);
        map.put(PayHeaderKt.HEADER_MODEL, str4);
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlOpenedBusCardAPI(str2), map, null));
            return responseDoRequest.isSuccessful() ? a(CloudClient.responseBodyString(responseDoRequest)) : "";
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(a, "getOpenedBusCardInfo Failed!!", e, new Object[0]);
            return "";
        }
    }
}
