package com.xiaomi.ai.android.track;

import android.content.Context;
import android.util.Log;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes18.dex */
public class h {
    private OkHttpClient a;
    private Context b;
    private j c;
    private String d;
    private i e;

    public h(com.xiaomi.ai.android.core.d dVar, i iVar) {
        Context applicationContext = dVar.a().getApplicationContext();
        this.b = applicationContext;
        this.e = iVar;
        this.c = new j(applicationContext, dVar.b().getInt(AivsConfig.InternalLogUpload.MAX_DATA_TRACK_TIMES), "aivs_log_upload_info", "track_times");
        this.d = new com.xiaomi.ai.core.c(dVar.b()).j();
        this.a = new OkHttpClient.Builder().addInterceptor(new com.xiaomi.ai.transport.a()).connectTimeout(dVar.b().getInt(AivsConfig.Connection.CONNECT_TIMEOUT), TimeUnit.SECONDS).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JsonNode jsonNode) {
        this.e.a(jsonNode);
    }

    public void a() {
        this.c.a();
    }

    public boolean a(final JsonNode jsonNode) {
        if (NetworkUtils.b(this.b) == Network.NetworkType.DATA && this.c.c()) {
            Logger.a("LogUploadExecutor", "onSendTrackInfo: reach max track time in 4g");
            return false;
        }
        String strTextValue = jsonNode.get("uid") == null ? "unknown" : jsonNode.get("uid").textValue();
        String strTextValue2 = jsonNode.get("did") == null ? "unknown" : jsonNode.get("did").textValue();
        String strTextValue3 = jsonNode.get("appId") != null ? jsonNode.get("appId").textValue() : "unknown";
        String strTextValue4 = jsonNode.get("clientTime") == null ? "0" : jsonNode.get("clientTime").textValue();
        String strTextValue5 = jsonNode.get("startTime") == null ? "0" : jsonNode.get("startTime").textValue();
        String strTextValue6 = jsonNode.get("endTime") != null ? jsonNode.get("endTime").textValue() : "0";
        byte[] bArrBinaryValue = null;
        try {
            bArrBinaryValue = jsonNode.get("log").binaryValue();
        } catch (IOException e) {
            Logger.b("LogUploadExecutor", Logger.throwableToString(e), false);
        }
        byte[] bArr = bArrBinaryValue;
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        if (!NetworkUtils.a(this.b)) {
            Logger.c("LogUploadExecutor", "onEventTrack:network is not available", false);
            b(jsonNode);
            return true;
        }
        Logger.a("LogUploadExecutor", "onEventTrack:" + jsonNode);
        FirebasePerfOkHttpClient.enqueue(this.a.newCall(new Request.Builder().url(this.d).addHeader("uid", strTextValue).addHeader("did", strTextValue2).addHeader("appId", strTextValue3).addHeader("clientTime", strTextValue4).addHeader("startTime", strTextValue5).addHeader("endTime", strTextValue6).post(RequestBody.create(MediaType.parse("application/octet-stream"), bArr)).build()), new Callback() { // from class: com.xiaomi.ai.android.track.h.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                Logger.c("LogUploadExecutor", "onEventTrack: onFailure", false);
                if (iOException != null) {
                    Logger.c("LogUploadExecutor", Log.getStackTraceString(iOException), false);
                }
                h.this.b(jsonNode);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                if (response == null || !response.isSuccessful()) {
                    Logger.c("LogUploadExecutor", "onEventTrack: onResponse " + response + ", " + jsonNode, false);
                    h.this.b(jsonNode);
                } else {
                    Logger.a("LogUploadExecutor", "onEventTrack: success", false);
                    if (NetworkUtils.b(h.this.b) == Network.NetworkType.DATA) {
                        h.this.c.b();
                    } else {
                        Logger.a("LogUploadExecutor", "onEventTrack: not using 4g");
                    }
                    if (h.this.e.e) {
                        Logger.a("LogUploadExecutor", "post Fail data", false);
                        h.this.e.a();
                    }
                }
                if (response != null) {
                    try {
                        response.close();
                    } catch (Exception e2) {
                        Logger.c("LogUploadExecutor", Log.getStackTraceString(e2), false);
                    }
                }
            }
        });
        return true;
    }
}
