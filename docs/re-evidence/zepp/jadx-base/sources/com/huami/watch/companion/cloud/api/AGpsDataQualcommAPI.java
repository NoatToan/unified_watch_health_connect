package com.huami.watch.companion.cloud.api;

import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import java.io.IOException;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes16.dex */
public class AGpsDataQualcommAPI {
    private static final String a = "Cloud-API-AGpsDataQualcomm";

    public static byte[] getData() {
        Log.d(a, "Get AGps Data Qualcomm!!", new Object[0]);
        byte[] bArrBytes = null;
        try {
            Response responseDoRequest = CloudClient.OkHttp.doRequest(CloudClient.OkHttp.newGet(Cloud.urlAGpsDataQualcomm()));
            if (responseDoRequest.isSuccessful()) {
                ResponseBody responseBodyBody = responseDoRequest.body();
                if (responseBodyBody != null) {
                    bArrBytes = responseBodyBody.bytes();
                }
            } else {
                CloudClient.responseBodyString(responseDoRequest);
            }
        } catch (IOException e) {
            Log.w(a, "GetAGpsQualcommErr", e, new Object[0]);
        }
        Log.d(a, "Get AGps Data Qualcomm: " + ArraysUtil.toString(bArrBytes), new Object[0]);
        return bArrBytes;
    }
}
