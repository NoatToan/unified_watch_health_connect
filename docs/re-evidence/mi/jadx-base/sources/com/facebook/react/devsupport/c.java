package com.facebook.react.devsupport;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.facebook.react.bridge.UiThreadUtil;
import com.mibi.sdk.component.params.SdkContants;
import defpackage.cm8;
import defpackage.e7h;
import defpackage.hxg;
import defpackage.ia1;
import defpackage.k06;
import defpackage.l1j;
import defpackage.mhh;
import defpackage.nok;
import defpackage.nrk;
import defpackage.ojj;
import defpackage.ql9;
import defpackage.sk1;
import defpackage.uok;
import defpackage.zpd;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Okio;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.facebook.react.devsupport.b f7301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OkHttpClient f7302b;
    public final Handler c;
    public final com.facebook.react.devsupport.a d;
    public final String e;
    public boolean f;
    public zpd g;
    public com.facebook.react.devsupport.d h;
    public OkHttpClient i;
    public k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.facebook.react.devsupport.d.c f7303k;

    public class a extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f7304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7305b;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.c$a$a, reason: collision with other inner class name */
        public class C0160a extends hxg {
            public C0160a() {
            }

            @Override // defpackage.nok
            public void b(Object obj) {
                a.this.f7304a.onPackagerReloadCommand();
            }
        }

        public class b extends hxg {
            public b() {
            }

            @Override // defpackage.nok
            public void b(Object obj) {
                a.this.f7304a.onPackagerDevMenuCommand();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.c$a$c, reason: collision with other inner class name */
        public class C0161c extends uok {
            public C0161c() {
            }

            @Override // defpackage.nok
            public void a(Object obj, nrk nrkVar) {
                a.this.f7304a.onCaptureHeapCommand(nrkVar);
            }
        }

        public class d implements ojj.b {
            public d() {
            }

            @Override // ojj.b
            public void onConnected() {
                a.this.f7304a.onPackagerConnected();
            }

            @Override // ojj.b
            public void onDisconnected() {
                a.this.f7304a.onPackagerDisconnected();
            }
        }

        public a(l lVar, String str) {
            this.f7304a = lVar;
            this.f7305b = str;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            HashMap map = new HashMap();
            map.put("reload", new C0160a());
            map.put("devMenu", new b());
            map.put("captureHeap", new C0161c());
            Map<String, nok> mapCustomCommandHandlers = this.f7304a.customCommandHandlers();
            if (mapCustomCommandHandlers != null) {
                map.putAll(mapCustomCommandHandlers);
            }
            map.putAll(new ql9().d());
            d dVar = new d();
            c.this.g = new zpd(this.f7305b, c.this.f7301a.c(), map, dVar);
            c.this.g.f();
            return null;
        }
    }

    public class b implements Callback {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.L(false);
            }
        }

        public b() {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            if (c.this.f) {
                cm8.d("ReactNative", "Error while requesting /onchange endpoint", iOException);
                c.this.c.postDelayed(new a(), 5000L);
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            c.this.L(response.code() == 205);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.c$c, reason: collision with other inner class name */
    public class C0162c implements Callback {
        public C0162c() {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
        }
    }

    public class d extends AsyncTask<Void, Void, Void> {
        public d() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (c.this.g != null) {
                c.this.g.e();
                c.this.g = null;
            }
            return null;
        }
    }

    public class e extends AsyncTask<Void, Void, Void> {
        public e() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            c cVar = c.this;
            cVar.h = new com.facebook.react.devsupport.d(cVar.F(), c.this.e, c.this.f7303k);
            c.this.h.g();
            return null;
        }
    }

    public class f extends AsyncTask<Void, Void, Void> {
        public f() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (c.this.h != null) {
                c.this.h.f();
                c.this.h = null;
            }
            return null;
        }
    }

    public class g extends AsyncTask<Void, String, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f7316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7317b;

        public g(Context context, String str) {
            this.f7316a = context;
            this.f7317b = str;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(b());
        }

        public boolean b() {
            try {
                new OkHttpClient().newCall(new Request.Builder().url(c.this.E(this.f7316a, this.f7317b)).build()).execute();
                return true;
            } catch (IOException e) {
                cm8.j("ReactNative", "Failed to send attach request to Inspector", e);
                return false;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            Toast.makeText(this.f7316a, this.f7316a.getString(l1j.i), 1).show();
        }
    }

    public class h implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mhh f7318a;

        public h(mhh mhhVar) {
            this.f7318a = mhhVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            cm8.C("ReactNative", "The packager does not seem to be running as we got an IOException requesting its status: " + iOException.getMessage());
            this.f7318a.a(false);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            if (!response.isSuccessful()) {
                cm8.i("ReactNative", "Got non-success http code from packager when requesting status: " + response.code());
                this.f7318a.a(false);
                return;
            }
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                cm8.i("ReactNative", "Got null body response from packager when requesting status");
                this.f7318a.a(false);
                return;
            }
            String strString = responseBodyBody.string();
            if ("packager-status:running".equals(strString)) {
                this.f7318a.a(true);
                return;
            }
            cm8.i("ReactNative", "Got unexpected response from packager when requesting status: " + strString);
            this.f7318a.a(false);
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.j != null) {
                c.this.j.a();
            }
        }
    }

    public enum j {
        BUNDLE(SdkContants.KEY_BUNDLE),
        DELTA("delta"),
        MAP("map");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7322a;

        j(String str) {
            this.f7322a = str;
        }

        public String a() {
            return this.f7322a;
        }
    }

    public interface k {
        void a();
    }

    public interface l {
        Map<String, nok> customCommandHandlers();

        void onCaptureHeapCommand(nrk nrkVar);

        void onPackagerConnected();

        void onPackagerDevMenuCommand();

        void onPackagerDisconnected();

        void onPackagerReloadCommand();
    }

    public c(com.facebook.react.devsupport.b bVar, String str, com.facebook.react.devsupport.d.c cVar) {
        this.f7301a = bVar;
        this.f7303k = cVar;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient okHttpClientBuild = builder.connectTimeout(5000L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
        this.f7302b = okHttpClientBuild;
        this.d = new com.facebook.react.devsupport.a(okHttpClientBuild);
        this.c = new Handler(Looper.getMainLooper());
        this.e = str;
    }

    public static String u(String str) {
        return String.format(Locale.US, "http://%s/status", str);
    }

    public static String v(String str, String str2) {
        return String.format(Locale.US, "http://%s/%s", str, str2);
    }

    public final BundleDeltaClient.ClientType A() {
        if (this.f7301a.d()) {
            return BundleDeltaClient.ClientType.NATIVE;
        }
        return this.f7301a.e() ? BundleDeltaClient.ClientType.DEV_SUPPORT : BundleDeltaClient.ClientType.NONE;
    }

    public final boolean B() {
        return this.f7301a.i();
    }

    public String C(String str) {
        return r(str, this.f7301a.e() ? j.DELTA : j.BUNDLE, this.f7301a.c().a());
    }

    public final String D() {
        String str = (String) sk1.c(this.f7301a.c().a());
        int iLastIndexOf = str.lastIndexOf(58);
        if (iLastIndexOf <= -1) {
            return "localhost";
        }
        return "localhost" + str.substring(iLastIndexOf);
    }

    public final String E(Context context, String str) {
        return String.format(Locale.US, "http://%s/nuclide/attach-debugger-nuclide?title=%s&app=%s&device=%s", ia1.h(context), str, this.e, ia1.d());
    }

    public final String F() {
        return String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s", this.f7301a.c().b(), ia1.d(), this.e);
    }

    public String G(String str) {
        return r(str, j.BUNDLE, D());
    }

    public final boolean H() {
        return this.f7301a.j();
    }

    public String I(String str) {
        return q(str, j.MAP);
    }

    public String J(String str) {
        return q(str, this.f7301a.e() ? j.DELTA : j.BUNDLE);
    }

    public String K() {
        return String.format(Locale.US, "ws://%s/debugger-proxy?role=client", this.f7301a.c().a());
    }

    public final void L(boolean z) {
        if (this.f) {
            if (z) {
                UiThreadUtil.runOnUiThread(new i());
            }
            z();
        }
    }

    public void M(mhh mhhVar) {
        this.f7302b.newCall(new Request.Builder().url(u(this.f7301a.c().a())).build()).enqueue(new h(mhhVar));
    }

    public void N() {
        this.f7302b.newCall(new Request.Builder().url(s()).build()).enqueue(new C0162c());
    }

    public void O() {
        if (this.h != null) {
            cm8.C("ReactNative", "Inspector connection already open, nooping.");
        } else {
            new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void P(String str, l lVar) {
        if (this.g != null) {
            cm8.C("ReactNative", "Packager connection already open, nooping.");
        } else {
            new a(lVar, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void Q() {
        this.f = false;
        this.c.removeCallbacksAndMessages(null);
        OkHttpClient okHttpClient = this.i;
        if (okHttpClient != null) {
            e7h.a(okHttpClient, this);
            this.i = null;
        }
        this.j = null;
    }

    public void n(Context context, String str) {
        new g(context, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void o() {
        new f().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void p() {
        new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final String q(String str, j jVar) {
        return r(str, jVar, this.f7301a.c().a());
    }

    public final String r(String str, j jVar, String str2) {
        return String.format(Locale.US, "http://%s/%s.%s?platform=android&dev=%s&minify=%s", str2, str, jVar.a(), Boolean.valueOf(B()), Boolean.valueOf(H()));
    }

    public final String s() {
        return String.format(Locale.US, "http://%s/launch-js-devtools", this.f7301a.c().a());
    }

    public void startPollingOnChangeEndpoint(k kVar) {
        if (this.f) {
            return;
        }
        this.f = true;
        this.j = kVar;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.i = builder.connectionPool(new ConnectionPool(1, 120000L, timeUnit)).connectTimeout(5000L, timeUnit).build();
        z();
    }

    public final String t() {
        return String.format(Locale.US, "http://%s/onchange", this.f7301a.c().a());
    }

    public void w() {
        com.facebook.react.devsupport.d dVar = this.h;
        if (dVar != null) {
            dVar.o("{ \"id\":1,\"method\":\"Debugger.disable\" }");
        }
    }

    public void x(k06 k06Var, File file, String str, com.facebook.react.devsupport.a.c cVar) {
        this.d.e(k06Var, file, str, cVar, A());
    }

    public File y(String str, File file) {
        Sink sink;
        try {
            Response responseExecute = this.f7302b.newCall(new Request.Builder().url(v(this.f7301a.c().a(), str)).build()).execute();
            try {
                if (!responseExecute.isSuccessful()) {
                    responseExecute.close();
                    return null;
                }
                try {
                    sink = Okio.sink(file);
                    try {
                        Okio.buffer(responseExecute.body().getSource()).readAll(sink);
                        if (sink != null) {
                            sink.close();
                        }
                        responseExecute.close();
                        return file;
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
            } catch (Throwable th3) {
                if (responseExecute != null) {
                    try {
                        responseExecute.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Exception e2) {
            cm8.k("ReactNative", "Failed to fetch resource synchronously - resourcePath: \"%s\", outputFile: \"%s\"", str, file.getAbsolutePath(), e2);
            return null;
        }
    }

    public final void z() {
        ((OkHttpClient) sk1.c(this.i)).newCall(new Request.Builder().url(t()).tag(this).build()).enqueue(new b());
    }
}
