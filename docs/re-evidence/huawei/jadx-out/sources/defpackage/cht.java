package defpackage;

import android.text.TextUtils;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public class cht extends Interceptor {
    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response<ResponseBody> intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain != null ? chain.request() : null;
        if (request == null) {
            return null;
        }
        cib.b("networkKit", "--> " + request.getMethod() + " " + request.getUrl());
        final Map<String, List<String>> headers = request.getHeaders();
        if (headers != null) {
            headers.keySet().forEach(new Consumer() { // from class: chr
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    String str = (String) obj;
                    cib.b("networkKit", str + ": " + headers.get(str));
                }
            });
        }
        RequestBody body = request.getBody();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = "";
        if (body != null) {
            body.writeTo(byteArrayOutputStream);
            cib.b("networkKit", "" + byteArrayOutputStream);
            cib.b("networkKit", "--> END " + request.getMethod());
        }
        Response<ResponseBody> responseProceed = chain.proceed(request);
        if (responseProceed != null) {
            String message = responseProceed.getMessage();
            if (!TextUtils.isEmpty(message)) {
                str = message + responseProceed.getUrl();
            }
            cib.b("networkKit", "<-- " + responseProceed.getCode() + " " + str);
            final Map<String, List<String>> headers2 = responseProceed.getHeaders();
            if (headers2 != null) {
                headers2.keySet().forEach(new Consumer() { // from class: chq
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        String str2 = (String) obj;
                        cib.b("networkKit", str2 + ": " + headers2.get(str2));
                    }
                });
            }
            return responseProceed;
        }
        cib.b("networkKit", "<-- ");
        return responseProceed;
    }
}
