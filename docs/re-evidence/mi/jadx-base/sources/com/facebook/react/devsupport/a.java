package com.facebook.react.devsupport;

import android.util.Pair;
import com.facebook.react.bridge.NativeDeltaClient;
import com.facebook.react.common.DebugServerException;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import defpackage.cm8;
import defpackage.k06;
import defpackage.sk1;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f7291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BundleDeltaClient f7292b;
    public Call c;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.a$a, reason: collision with other inner class name */
    public class C0159a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k06 f7293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f7294b;
        public final /* synthetic */ c c;
        public final /* synthetic */ BundleDeltaClient.ClientType d;

        public C0159a(k06 k06Var, File file, c cVar, BundleDeltaClient.ClientType clientType) {
            this.f7293a = k06Var;
            this.f7294b = file;
            this.c = cVar;
            this.d = clientType;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            if (a.this.c == null || a.this.c.getCanceled()) {
                a.this.c = null;
                return;
            }
            a.this.c = null;
            String url = call.request().url().getUrl();
            this.f7293a.onFailure(DebugServerException.makeGeneric(url, "Could not connect to development server.", "URL: " + url, iOException));
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            if (a.this.c == null || a.this.c.getCanceled()) {
                a.this.c = null;
                return;
            }
            a.this.c = null;
            String url = response.request().url().getUrl();
            Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(response.header("content-type"));
            try {
                if (matcher.find()) {
                    a.this.k(url, response, matcher.group(1), this.f7294b, this.c, this.d, this.f7293a);
                } else {
                    a.this.j(url, response.code(), response.headers(), Okio.buffer(response.body().getSource()), this.f7294b, this.c, this.d, this.f7293a);
                }
                response.close();
            } catch (Throwable th) {
                try {
                    response.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response f7295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7296b;
        public final /* synthetic */ File c;
        public final /* synthetic */ c d;
        public final /* synthetic */ BundleDeltaClient.ClientType e;
        public final /* synthetic */ k06 f;

        public b(Response response, String str, File file, c cVar, BundleDeltaClient.ClientType clientType, k06 k06Var) {
            this.f7295a = response;
            this.f7296b = str;
            this.c = file;
            this.d = cVar;
            this.e = clientType;
            this.f = k06Var;
        }

        @Override // com.facebook.react.devsupport.f.a
        public void a(Map<String, String> map, Buffer buffer, boolean z) throws Throwable {
            if (z) {
                int iCode = this.f7295a.code();
                if (map.containsKey("X-Http-Status")) {
                    iCode = Integer.parseInt(map.get("X-Http-Status"));
                }
                a.this.j(this.f7296b, iCode, Headers.of(map), buffer, this.c, this.d, this.e, this.f);
                return;
            }
            if (map.containsKey("Content-Type") && map.get("Content-Type").equals("application/json")) {
                try {
                    JSONObject jSONObject = new JSONObject(buffer.readUtf8());
                    this.f.b(jSONObject.has("status") ? jSONObject.getString("status") : null, jSONObject.has(HuamiUpgradeFragment.DONE_TAG) ? Integer.valueOf(jSONObject.getInt(HuamiUpgradeFragment.DONE_TAG)) : null, jSONObject.has(SportDataTypeKt.DIMEN_TOTAL) ? Integer.valueOf(jSONObject.getInt(SportDataTypeKt.DIMEN_TOTAL)) : null);
                } catch (JSONException e) {
                    cm8.i("ReactNative", "Error parsing progress JSON. " + e.toString());
                }
            }
        }

        @Override // com.facebook.react.devsupport.f.a
        public void b(Map<String, String> map, long j, long j2) throws IOException {
            if ("application/javascript".equals(map.get("Content-Type"))) {
                this.f.b("Downloading JavaScript bundle", Integer.valueOf((int) (j / 1024)), Integer.valueOf((int) (j2 / 1024)));
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7298b;
        public int c;

        public String d() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("deltaClient", this.f7297a);
                jSONObject.put("url", this.f7298b);
                jSONObject.put("filesChangedCount", this.c);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    public a(OkHttpClient okHttpClient) {
        this.f7291a = okHttpClient;
    }

    public static void i(String str, Headers headers, BundleDeltaClient.ClientType clientType, c cVar) {
        cVar.f7297a = clientType == BundleDeltaClient.ClientType.NONE ? null : clientType.name();
        cVar.f7298b = str;
        String str2 = headers.get("X-Metro-Files-Changed-Count");
        if (str2 != null) {
            try {
                cVar.c = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                cVar.c = -2;
            }
        }
    }

    public static boolean l(BufferedSource bufferedSource, File file) throws Throwable {
        Sink sink;
        try {
            sink = Okio.sink(file);
            try {
                bufferedSource.readAll(sink);
                if (sink == null) {
                    return true;
                }
                sink.close();
                return true;
            } catch (Throwable th) {
                th = th;
                if (sink != null) {
                    sink.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sink = null;
        }
    }

    public void e(k06 k06Var, File file, String str, c cVar, BundleDeltaClient.ClientType clientType) {
        f(k06Var, file, str, cVar, clientType, new Request.Builder());
    }

    public void f(k06 k06Var, File file, String str, c cVar, BundleDeltaClient.ClientType clientType, Request.Builder builder) {
        Call call = (Call) sk1.c(this.f7291a.newCall(builder.url(g(str, clientType)).build()));
        this.c = call;
        call.enqueue(new C0159a(k06Var, file, cVar, clientType));
    }

    public final String g(String str, BundleDeltaClient.ClientType clientType) {
        BundleDeltaClient bundleDeltaClient;
        return (BundleDeltaClient.d(str) && (bundleDeltaClient = this.f7292b) != null && bundleDeltaClient.a(clientType)) ? this.f7292b.c(str) : str;
    }

    public final BundleDeltaClient h(BundleDeltaClient.ClientType clientType) {
        BundleDeltaClient bundleDeltaClient = this.f7292b;
        if (bundleDeltaClient == null || !bundleDeltaClient.a(clientType)) {
            this.f7292b = BundleDeltaClient.b(clientType);
        }
        return this.f7292b;
    }

    public final void j(String str, int i, Headers headers, BufferedSource bufferedSource, File file, c cVar, BundleDeltaClient.ClientType clientType, k06 k06Var) throws Throwable {
        NativeDeltaClient nativeDeltaClient;
        boolean zL;
        if (i != 200) {
            String utf8 = bufferedSource.readUtf8();
            DebugServerException debugServerException = DebugServerException.parse(str, utf8);
            if (debugServerException != null) {
                k06Var.onFailure(debugServerException);
                return;
            }
            k06Var.onFailure(new DebugServerException("The development server returned response error code: " + i + "\n\nURL: " + str + "\n\nBody:\n" + utf8));
            return;
        }
        if (cVar != null) {
            i(str, headers, clientType, cVar);
        }
        File file2 = new File(file.getPath() + ".tmp");
        if (BundleDeltaClient.d(str)) {
            BundleDeltaClient bundleDeltaClientH = h(clientType);
            sk1.c(bundleDeltaClientH);
            Pair<Boolean, NativeDeltaClient> pairE = bundleDeltaClientH.e(headers, bufferedSource, file2);
            zL = ((Boolean) pairE.first).booleanValue();
            nativeDeltaClient = (NativeDeltaClient) pairE.second;
        } else {
            nativeDeltaClient = null;
            this.f7292b = null;
            zL = l(bufferedSource, file2);
        }
        if (!zL || file2.renameTo(file)) {
            k06Var.a(nativeDeltaClient);
            return;
        }
        throw new IOException("Couldn't rename " + file2 + " to " + file);
    }

    public final void k(String str, Response response, String str2, File file, c cVar, BundleDeltaClient.ClientType clientType, k06 k06Var) throws IOException {
        if (new f(response.body().getSource(), str2).d(new b(response, str, file, cVar, clientType, k06Var))) {
            return;
        }
        k06Var.onFailure(new DebugServerException("Error while reading multipart response.\n\nResponse code: " + response.code() + "\n\nURL: " + str.toString() + "\n\n"));
    }
}
