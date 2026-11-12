package com.huawei.openalliance.ad.download;

import android.content.Context;
import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.net.http.HttpCallerFactory;
import com.huawei.openalliance.ad.net.http.HttpsConfig;
import com.huawei.openalliance.ad.utils.ag;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes12.dex */
public class j extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static OkHttpClient f18629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static OkHttpClient f18630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static com.huawei.openalliance.ad.net.http.i f18631c;
    private static final byte[] d = new byte[0];
    private Response e;
    private Request f;
    private ResponseBody g;
    private Context h;

    @Override // com.huawei.openalliance.ad.download.c
    public HttpConnection d() {
        com.huawei.openalliance.ad.net.http.i iVar = f18631c;
        return iVar != null ? iVar.a(this.f) : new HttpConnection();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Response response = this.e;
        if (response == null) {
            throw new IOException("close stream error");
        }
        response.close();
    }

    @Override // com.huawei.openalliance.ad.download.c
    public int c() {
        ResponseBody responseBody = this.g;
        if (responseBody == null) {
            return -1;
        }
        return (int) responseBody.getContentLength();
    }

    @Override // com.huawei.openalliance.ad.download.c
    public int b() throws IOException {
        Response response = this.e;
        if (response != null) {
            return response.code();
        }
        throw new IOException("get response code error");
    }

    @Override // com.huawei.openalliance.ad.download.c
    public String a(String str) {
        Response response = this.e;
        return response == null ? "" : response.header(str);
    }

    @Override // com.huawei.openalliance.ad.download.c
    public InputStream a() throws IOException {
        ResponseBody responseBody = this.g;
        if (responseBody != null) {
            return responseBody.byteStream();
        }
        throw new IOException("get input stream error");
    }

    private boolean a(Request request, boolean z) {
        boolean z2 = false;
        try {
            Response responseExecute = a(this.h, z).newCall(request).execute();
            this.e = responseExecute;
            z2 = 8 == ag.a(responseExecute.code());
            this.g = this.e.body();
            return z2;
        } catch (IOException e) {
            hw.c("OkHttpNetworkConnection", "http execute encounter IOException:" + e.getClass().getSimpleName());
            if (ag.a(e)) {
                return true;
            }
            return z2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x009a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:17:0x0093, B:19:0x0098, B:18:0x0096, B:10:0x000f, B:15:0x007c, B:14:0x0061, B:11:0x0056), top: B:26:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0096 A[Catch: all -> 0x009a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:17:0x0093, B:19:0x0098, B:18:0x0096, B:10:0x000f, B:15:0x007c, B:14:0x0061, B:11:0x0056), top: B:26:0x0003, inners: #0 }] */
    private static OkHttpClient a(Context context, boolean z) {
        OkHttpClient okHttpClient;
        synchronized (d) {
            if (f18629a == null || f18630b == null || f18631c == null) {
                OkHttpClient.Builder builderProtocols = new OkHttpClient.Builder().connectionPool(new ConnectionPool(8, 10L, TimeUnit.MINUTES)).readTimeout(10000L, TimeUnit.MILLISECONDS).connectTimeout(10000L, TimeUnit.MILLISECONDS).protocols(Collections.unmodifiableList(Arrays.asList(Protocol.HTTP_2, Protocol.HTTP_1_1)));
                com.huawei.openalliance.ad.net.http.i iVarA = HttpCallerFactory.a();
                f18631c = iVarA;
                iVarA.a(builderProtocols);
                HttpsConfig.a(builderProtocols, false, false);
                try {
                    builderProtocols.dispatcher(builderProtocols.createDispatcher(Protocol.HTTP_2));
                } catch (Throwable th) {
                    hw.c("OkHttpNetworkConnection", "create dispatcher error, " + th.getClass().getSimpleName());
                }
                f18629a = builderProtocols.build();
                f18630b = builderProtocols.dns(new com.huawei.openalliance.ad.net.http.l(context, true)).build();
                if (z) {
                    okHttpClient = f18630b;
                } else {
                    okHttpClient = f18629a;
                }
            } else if (z) {
                okHttpClient = f18630b;
            } else {
                okHttpClient = f18629a;
            }
            throw th;
        }
        return okHttpClient;
    }

    public j(Context context, String str, long j) {
        this.h = context;
        Request.Builder builderUrl = new Request.Builder().url(str);
        if (j > 0) {
            builderUrl.header("Range", "bytes=" + j + Constants.LINK);
        }
        builderUrl.header(j2.v, "identity");
        builderUrl.cacheControl(CacheControl.FORCE_NETWORK);
        Request requestBuild = builderUrl.build();
        this.f = requestBuild;
        if (a(requestBuild, false)) {
            a(requestBuild, true);
        }
    }
}
