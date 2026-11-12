package com.huawei.watchface;

import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.videoedit.sysc.Consumer;
import com.huawei.watchface.videoedit.sysc.Function;
import com.huawei.watchface.videoedit.sysc.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class f0 extends Interceptor {
    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request requestA = a(chain.request());
        final Response<ResponseBody> responseProceed = chain.proceed(requestA);
        Optional.ofNullable(chain.requestFinishedInfo()).flatMap(new Function() { // from class: com.huawei.watchface.f0$$ExternalSyntheticLambda0
            @Override // com.huawei.watchface.videoedit.sysc.Function
            public final Object apply(Object obj) {
                return Optional.ofNullable(((RequestFinishedInfo) obj).getMetrics());
            }
        }).ifPresent(new Consumer() { // from class: com.huawei.watchface.f0$$ExternalSyntheticLambda1
            @Override // com.huawei.watchface.videoedit.sysc.Consumer
            public final void accept(Object obj) {
                f0.a(responseProceed, (RequestFinishedInfo.Metrics) obj);
            }
        });
        if (requestA != null && requestA.getHeaders() != null) {
            FlavorConfig.safeHwLog("CommonParamsInterceptor", "url:" + requestA.getUrl());
            FlavorConfig.safeHwLog("CommonParamsInterceptor", "header:" + requestA.getHeaders().toString());
        }
        return responseProceed;
    }

    public static /* synthetic */ void a(Response response, RequestFinishedInfo.Metrics metrics) {
        String successIp = metrics.getSuccessIp();
        HwLog.i("CommonParamsInterceptor", "successIp ip type:" + x2.b(successIp));
        FlavorConfig.safeHwLog("CommonParamsInterceptor", "getSuccessIp ip =" + successIp);
        if (response == null || response.getHeaders() == null) {
            return;
        }
        response.getHeaders().put("server_ip", new ArrayList(Collections.singletonList(successIp)));
        response.getHeaders().put("request_engine", new ArrayList(Collections.singletonList("network_client")));
    }

    public final Request a(Request request) {
        long jContentLength;
        try {
            jContentLength = request.getBody().contentLength();
        } catch (Exception e) {
            HwLog.e("CommonParamsInterceptor", "addCommonParams request contentLength error: " + HwLog.printException(e));
            jContentLength = 0L;
        }
        Map<String, List<String>> headers = request.getHeaders();
        Request.Builder builderNewBuilder = request.newBuilder();
        if (!q2.a((Map) headers, (Object) "Content-Type")) {
            builderNewBuilder.addHeader("Content-Type", "application/json; charset=UTF-8");
        }
        if (jContentLength > 0) {
            HwLog.i("CommonParamsInterceptor", "requestLength =" + jContentLength);
            builderNewBuilder.addHeader("Content-Length", String.valueOf(jContentLength));
        }
        Map mapF = WatchFaceHttpUtil.f();
        if (!q2.isEmpty(mapF)) {
            for (Map.Entry entry : mapF.entrySet()) {
                builderNewBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }
}
