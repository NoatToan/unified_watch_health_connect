package wj2;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.HttpMethod;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final MediaType f185793j = MediaType.parse("text/plain");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URL f185794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f185797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f185798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OkHttpClient f185799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f185800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f185801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f185802i;

    public b(String str, String str2, Map<String, String> map, String str3, String str4, OkHttpClient okHttpClient) {
        this.f185794a = new URL(str);
        this.f185795b = str2.toUpperCase();
        this.f185797d = map;
        this.f185798e = str3;
        this.f185796c = str4;
        this.f185799f = okHttpClient;
    }

    public final void a() {
        String str;
        OkHttpClient.Builder builderNewBuilder = this.f185799f.newBuilder();
        Request.Builder builder = new Request.Builder();
        builder.url(this.f185794a);
        c(builder);
        HashMap map = null;
        String str2 = this.f185795b;
        String str3 = this.f185796c;
        RequestBody requestBodyCreate = (str3 == null || (str = this.f185798e) == null) ? HttpMethod.requiresRequestBody(str2) ? RequestBody.create(f185793j, "".getBytes()) : null : RequestBody.create(MediaType.parse(str3), str.getBytes("UTF-8"));
        str2.getClass();
        switch (str2) {
            case "GET":
                builder.get();
                break;
            case "PUT":
                builder.put(requestBodyCreate);
                break;
            case "POST":
                builder.post(requestBodyCreate);
                break;
            case "DELETE":
                builder.delete(requestBodyCreate);
                break;
        }
        builderNewBuilder.authenticator(new a(this, new AtomicBoolean(false)));
        Response responseExecute = builderNewBuilder.build().newCall(builder.build()).execute();
        int iCode = responseExecute.code();
        this.f185800g = iCode;
        if (iCode == 307 || iCode == 308) {
            String strHeader = responseExecute.header(HttpHeaders.LOCATION);
            if (!TextUtils.isEmpty(strHeader)) {
                this.f185794a = new URL(strHeader);
                a();
                return;
            }
        }
        Map<String, List<String>> multimap = responseExecute.headers().toMultimap();
        if (multimap != null) {
            map = new HashMap();
            for (Map.Entry<String, List<String>> entry : multimap.entrySet()) {
                StringBuilder sb3 = new StringBuilder();
                for (String str4 : entry.getValue()) {
                    if (sb3.length() > 0) {
                        sb3.append(",");
                    }
                    sb3.append(str4);
                }
                map.put(entry.getKey(), sb3.toString());
            }
        }
        this.f185801h = map;
        this.f185802i = responseExecute.body().string();
    }

    public final int b() {
        return this.f185800g;
    }

    public final void c(Request.Builder builder) {
        builder.header(HttpHeaders.USER_AGENT, "Mozilla/5.0 ( compatible ) ");
        builder.header(HttpHeaders.ACCEPT, "*/*");
        for (Map.Entry<String, String> entry : this.f185797d.entrySet()) {
            builder.header(entry.getKey(), entry.getValue());
        }
    }
}
