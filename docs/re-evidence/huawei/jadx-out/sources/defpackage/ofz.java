package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.hms.framework.network.restclient.hianalytics.RequestFinishedInfo;
import com.huawei.hms.framework.network.restclient.hwhttp.Request;
import com.huawei.hms.framework.network.restclient.hwhttp.Response;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import health.compact.a.BuildConfigProperties;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class ofz {
    public static void c(int i, Request request) {
        String str;
        HashMap map = new HashMap(5);
        map.put("request id", Integer.valueOf(i));
        map.put("request url", request.getUrl().getUrl());
        map.put("request method", request.getMethod());
        Headers headers = request.getHeaders();
        HashMap map2 = new HashMap(5);
        for (String str2 : headers.names()) {
            map2.put(str2, headers.values(str2));
        }
        map.put("headers", map2);
        if (d()) {
            if (request.getBody() == null) {
                str = Constants.NULL;
            } else {
                byte[] bArrBody = request.getBody().body();
                if (bArrBody != null) {
                    str = new String(bArrBody, StandardCharsets.UTF_8);
                } else {
                    str = "empty";
                }
            }
            map.put("request body", str);
        }
        LogUtil.c("R_NetworkClientUtils", map.toString());
    }

    public static Response b(int i, Response response) {
        String string;
        if (!response.isSuccessful()) {
            LogUtil.e("R_NetworkClientUtils", "response failed, url:" + c(String.valueOf(response.getUrl())) + ", response code:" + response.getCode() + ", message:" + response.getMessage());
        }
        HashMap map = new HashMap(5);
        map.put("request id", Integer.valueOf(i));
        map.put("status_code", Integer.valueOf(response.getCode()));
        Headers headers = response.getHeaders();
        HashMap map2 = new HashMap(5);
        for (String str : headers.names()) {
            map2.put(str, headers.values(str));
        }
        map.put("headers", map2);
        if (d()) {
            if (response.getHeaders().get("Content-Type") != null && response.getHeaders().get("Content-Type").contains("json")) {
                InputStream inputStream = response.getBody().getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    try {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i2);
                    } catch (IOException unused) {
                        string = TrackConstants$Events.EXCEPTION;
                    }
                }
                byteArrayOutputStream.flush();
                string = byteArrayOutputStream.toString("utf-8");
                response = response.newBuilder().body(response.getBody().newBuilder().inputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).build()).build();
            } else {
                string = "binary stream";
            }
        } else {
            string = "no print due to un-debug version";
        }
        map.put("response body", string);
        LogUtil.c("R_NetworkClientUtils", map.toString());
        return response;
    }

    private static boolean d() {
        return LogUtil.d() || BuildConfigProperties.a("IS_TEST_VERSION", false) || BuildConfigProperties.a("FORCE_ALL_LOG", false);
    }

    public static void a(Submit submit) {
        RequestFinishedInfo requestFinishedInfo;
        try {
            requestFinishedInfo = submit.request().getRequestFinishedInfo();
        } catch (IOException e) {
            ReleaseLogUtil.b("R_NetworkClientUtils", "get Request from submit fail", ExceptionUtils.c(e));
            requestFinishedInfo = null;
        }
        if (requestFinishedInfo == null) {
            ReleaseLogUtil.d("R_NetworkClientUtils", "RequestFinishedInfo is null");
            return;
        }
        RequestFinishedInfo.MetricsTime metricsRealTime = requestFinishedInfo.getMetricsRealTime();
        if (metricsRealTime == null) {
            ReleaseLogUtil.d("R_NetworkClientUtils", "metricsTime is null");
            return;
        }
        String str = "requestUrl:" + c(requestFinishedInfo.getUrl()) + ", totalTime:" + metricsRealTime.getTotalTime() + ", DnsTime:" + (metricsRealTime.getDnsEndTime() - metricsRealTime.getDnsStartTime()) + ", connectTime:" + (metricsRealTime.getConnectEndTime() - metricsRealTime.getConnectStartTime()) + ", sslTime:" + (metricsRealTime.getSecureConnectEndTime() - metricsRealTime.getSecureConnectStartTime()) + ", firstPackage:" + metricsRealTime.getTtfb();
        if (metricsRealTime.getTotalTime() > 300) {
            LogUtil.e("R_NetworkClientUtils", str);
        } else {
            LogUtil.c("R_NetworkClientUtils", str);
        }
    }

    private static String c(String str) {
        if (!LogUtil.c() || TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 != 0) {
                charArray[i] = '*';
            }
        }
        return new String(charArray);
    }
}
