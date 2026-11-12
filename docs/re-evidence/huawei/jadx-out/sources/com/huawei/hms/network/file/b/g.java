package com.huawei.hms.network.file.b;

import android.text.TextUtils;
import com.huawei.hms.network.file.api.GlobalRequestConfig;
import com.huawei.hms.network.file.core.FileManagerException;
import com.huawei.hms.network.file.core.task.k;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import com.huawei.hms.network.file.upload.api.BodyRequest;
import com.huawei.hms.network.file.upload.api.PostRequest;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HttpClient f15718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GlobalRequestConfig f15719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.huawei.hms.network.file.core.task.f f15720c;

    void a(Submit submit, k<BodyRequest> kVar) {
        if (submit != null) {
            try {
                if (submit.getRequestFinishedInfo() != null) {
                    kVar.b(submit.getRequestFinishedInfo());
                }
            } catch (RuntimeException unused) {
                FLogger.w("UploadUtils", "collectFinishedInfo RuntimeException", new Object[0]);
            } catch (Exception unused2) {
                FLogger.w("UploadUtils", "collectFinishedInfo exception", new Object[0]);
            }
        }
    }

    void a(k<BodyRequest> kVar) {
        kVar.a(0L);
    }

    public Response a(RequestBody requestBody, f fVar, com.huawei.hms.network.file.core.task.f fVar2) {
        this.f15720c = fVar2;
        IOException e = null;
        if (this.f15718a == null || TextUtils.isEmpty(fVar.v())) {
            return null;
        }
        int iB = b(fVar);
        String message = "IO exception";
        int iA = 0;
        int i = 0;
        while (i <= iB && !fVar.h()) {
            a(fVar);
            try {
                FLogger.i("UploadUtils", "before connect, task:" + fVar.p().getId() + ", taskFileTotalSize:" + fVar.a() + ",configRetryCount:" + iB + ",sliceRetryCount:" + i, new Object[0]);
                Response responseA = a(requestBody, fVar);
                fVar.f(System.currentTimeMillis() - fVar.y());
                StringBuilder sb = new StringBuilder();
                sb.append("upload responsecode:");
                sb.append(responseA.getCode());
                FLogger.i("UploadUtils", sb.toString(), new Object[0]);
                return responseA;
            } catch (IOException e2) {
                e = e2;
                if (!(e.getCause() instanceof FileManagerException)) {
                    if (!TextUtils.isEmpty(message)) {
                        message = e.getMessage();
                    }
                    iA = com.huawei.hms.network.file.core.util.b.a(e);
                    if (!com.huawei.hms.network.file.core.util.b.a((Throwable) e)) {
                        break;
                    }
                    i++;
                } else {
                    throw ((FileManagerException) Utils.cast(e.getCause()));
                }
            }
        }
        FLogger.w("UploadUtils", "doWithIOException failed, retrycount=" + i + ", code=" + iA, new Object[0]);
        fVar.a(i);
        throw new FileManagerException(iA, message, e);
    }

    private int b(k<BodyRequest> kVar) {
        if (((BodyRequest) kVar.p()).getConfig() == null || this.f15719b.getRetryTimes() == -100) {
            return 0;
        }
        return this.f15719b.getRetryTimes();
    }

    private Response a(RequestBody requestBody, f fVar) throws IOException {
        String str = fVar.p() instanceof PostRequest ? "POST" : ProfileRequestConstants.PUT_TYPE;
        FLogger.i("UploadUtils", "callUpload method:".concat(str), new Object[0]);
        Request.Builder builderUrl = this.f15718a.newRequest().url(fVar.v());
        builderUrl.options(Utils.convertToJsonString(this.f15719b));
        Set<Map.Entry<String, String>> setEntrySet = fVar.p().getHeaders().entrySet();
        if (setEntrySet.size() > 0) {
            for (Map.Entry<String, String> entry : setEntrySet) {
                builderUrl.addHeader(entry.getKey(), entry.getValue());
            }
        }
        HashMap map = new HashMap();
        if (!fVar.p().getReportInfos().isEmpty()) {
            map.putAll(fVar.p().getReportInfos());
        }
        if (!map.containsKey("trace_id")) {
            map.put("trace_id", String.valueOf(fVar.p().getId()));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (map.containsKey("trace_id")) {
                jSONObject.put("trace_id", map.get("trace_id"));
            }
            if (map.containsKey("device_id")) {
                jSONObject.put("device_id", map.get("device_id"));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("metrics_data", jSONObject);
            builderUrl.options(jSONObject2.toString());
        } catch (JSONException unused) {
            FLogger.e("UploadUtils", "callUpload requestBuilder.options exception");
        }
        builderUrl.method(str);
        builderUrl.requestBody(requestBody);
        Submit<ResponseBody> submitNewSubmit = this.f15718a.newSubmit(builderUrl.build());
        com.huawei.hms.network.file.core.task.f fVar2 = this.f15720c;
        if (fVar2 != null) {
            fVar2.a((Submit) submitNewSubmit);
        }
        fVar.b(System.currentTimeMillis());
        Response<ResponseBody> responseExecute = submitNewSubmit.execute();
        a(submitNewSubmit, fVar);
        return responseExecute;
    }

    public g(GlobalRequestConfig globalRequestConfig, HttpClient httpClient) {
        this.f15718a = httpClient;
        this.f15719b = globalRequestConfig;
    }
}
