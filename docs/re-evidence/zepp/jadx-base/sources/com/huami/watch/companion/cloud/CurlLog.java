package com.huami.watch.companion.cloud;

import com.huami.watch.util.Log;
import com.loopj.android.http.AsyncHttpClient;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

/* JADX INFO: loaded from: classes16.dex */
public class CurlLog implements Interceptor {
    private static final String b = "CurlLog";
    private static final Charset c = Charset.forName("UTF-8");
    private String a;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        String str = (this.a != null ? "curl " + this.a : "curl") + " -X " + request.method();
        Headers headers = request.headers();
        int size = headers.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            String strName = headers.name(i);
            String strValue = headers.value(i);
            if ("Accept-Encoding".equalsIgnoreCase(strName) && AsyncHttpClient.ENCODING_GZIP.equalsIgnoreCase(strValue)) {
                z = true;
            }
            str = str + " -H \"" + strName + ": " + strValue + "\"";
        }
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            Buffer buffer = new Buffer();
            requestBodyBody.writeTo(buffer);
            Charset charset = c;
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                charset = mediaTypeContentType.charset(charset);
            }
            str = str + " --data $'" + buffer.readString(charset).replace("\n", "\\n") + "'";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z ? " --compressed " : " ");
        sb.append(request.url());
        Log.d(b, "url:" + request.url() + "\ncurl:" + sb.toString(), new Object[0]);
        return chain.proceed(request);
    }

    public void setCurlOptions(String str) {
        this.a = str;
    }
}
