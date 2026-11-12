package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwnetworkmodel.TrafficMonitoringService;
import com.huawei.hwnetworkmodel.WrappedHttpResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes11.dex */
public class nqh {
    private HttpClient e;

    public nqh(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.e = new DefaultHttpClient(clientConnectionManager, httpParams);
    }

    private long am_(HttpRequest httpRequest) {
        long length = httpRequest.getRequestLine().toString().length();
        for (Header header : httpRequest.getAllHeaders()) {
            length = length + ((long) header.getName().length()) + ((long) header.getValue().length()) + 1;
        }
        HttpParams params = httpRequest.getParams();
        for (Field field : params.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                if (field.get(params) instanceof HashMap) {
                    for (Map.Entry entry : ((HashMap) field.get(params)).entrySet()) {
                        length += (long) entry.getKey().toString().length();
                        length = length + ((long) entry.getValue().toString().length()) + 1;
                    }
                }
            } catch (IllegalAccessException unused) {
                LogUtil.e("LimitedHttpClient countRequest IllegalAccessException", new Object[0]);
            }
        }
        return httpRequest instanceof HttpPost ? length + ((HttpPost) httpRequest).getEntity().getContentLength() : length;
    }

    private long an_(HttpResponse httpResponse) {
        int length = (int) (((long) 0) + ((long) httpResponse.getStatusLine().toString().length()));
        for (Header header : httpResponse.getAllHeaders()) {
            length = length + header.getName().length() + header.getValue().length() + 1;
        }
        return length;
    }

    public HttpResponse ao_(HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        TrafficMonitoringService.e(am_(httpRequest));
        if (TrafficMonitoringService.e()) {
            throw new IOException("Mobile Over flow!");
        }
        HttpResponse httpResponseExecute = this.e.execute(httpHost, httpRequest);
        TrafficMonitoringService.c(an_(httpResponseExecute));
        return new WrappedHttpResponse(httpResponseExecute);
    }

    public ClientConnectionManager ap_() {
        return this.e.getConnectionManager();
    }

    public HttpParams a() {
        return this.e.getParams();
    }
}
