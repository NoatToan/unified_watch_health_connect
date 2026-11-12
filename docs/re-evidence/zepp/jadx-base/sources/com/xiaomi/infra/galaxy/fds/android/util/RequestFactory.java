package com.xiaomi.infra.galaxy.fds.android.util;

import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.model.HttpMethod;
import java.util.Date;
import java.util.Map;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;

/* JADX INFO: loaded from: classes22.dex */
public class RequestFactory {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            a = iArr;
            try {
                iArr[HttpMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HttpMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HttpMethod.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HttpMethod.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HttpMethod.HEAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[LOOP:0: B:22:0x0053->B:24:0x0059, LOOP_END] */
    public static HttpUriRequest createRequest(String str, GalaxyFDSCredential galaxyFDSCredential, HttpMethod httpMethod, Map<String, String> map) throws GalaxyFDSClientException {
        HttpRequestBase httpGet;
        HttpRequestBase httpRequestBase;
        String strAddParam = galaxyFDSCredential.addParam(str);
        int i = a.a[httpMethod.ordinal()];
        if (i == 1) {
            httpGet = new HttpGet(strAddParam);
        } else if (i == 2) {
            httpGet = new HttpPut(strAddParam);
        } else if (i == 3) {
            httpGet = new HttpPost(strAddParam);
        } else {
            if (i != 4) {
                if (i != 5) {
                    httpRequestBase = null;
                } else {
                    httpGet = new HttpHead(strAddParam);
                }
                if (httpRequestBase != null) {
                    if (map != null) {
                        map.remove("Content-Length");
                        map.remove("Content-Length".toLowerCase());
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            httpRequestBase.addHeader(entry.getKey(), entry.getValue());
                        }
                    }
                    httpRequestBase.addHeader("Date", Util.formatDateString(new Date()));
                    galaxyFDSCredential.addHeader(httpRequestBase);
                }
                return httpRequestBase;
            }
            httpGet = new HttpDelete(strAddParam);
        }
        httpRequestBase = httpGet;
        if (httpRequestBase != null) {
            if (map != null) {
                map.remove("Content-Length");
                map.remove("Content-Length".toLowerCase());
                while (r3.hasNext()) {
                    httpRequestBase.addHeader(entry.getKey(), entry.getValue());
                }
            }
            httpRequestBase.addHeader("Date", Util.formatDateString(new Date()));
            galaxyFDSCredential.addHeader(httpRequestBase);
        }
        return httpRequestBase;
    }
}
