package com.facebook.react.devsupport;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.Inspector;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import defpackage.cm8;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0163d f7323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Inspector.LocalConnection> f7324b = new HashMap();
    public final String c;
    public c d;

    public class a implements Inspector.RemoteConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7325a;

        public a(String str) {
            this.f7325a = str;
        }

        @Override // com.facebook.react.bridge.Inspector.RemoteConnection
        public void onDisconnect() {
            try {
                d.this.f7324b.remove(this.f7325a);
                d dVar = d.this;
                dVar.n("disconnect", dVar.m(this.f7325a));
            } catch (JSONException e) {
                cm8.D("InspectorPackagerConnection", "Couldn't send event to packager", e);
            }
        }

        @Override // com.facebook.react.bridge.Inspector.RemoteConnection
        public void onMessage(String str) {
            try {
                d.this.p(this.f7325a, str);
            } catch (JSONException e) {
                cm8.D("InspectorPackagerConnection", "Couldn't send event to packager", e);
            }
        }
    }

    public interface c {
        b a();
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.d$d, reason: collision with other inner class name */
    public class C0163d extends WebSocketListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public OkHttpClient f7330b;
        public WebSocket c;
        public final Handler d = new Handler(Looper.getMainLooper());
        public boolean e;
        public boolean f;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.d$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C0163d.this.e) {
                    return;
                }
                C0163d.this.e();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.d$d$b */
        public class b extends AsyncTask<WebSocket, Void, Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ JSONObject f7332a;

            public b(JSONObject jSONObject) {
                this.f7332a = jSONObject;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(WebSocket... webSocketArr) {
                if (webSocketArr != null && webSocketArr.length != 0) {
                    try {
                        webSocketArr[0].send(this.f7332a.toString());
                    } catch (Exception e) {
                        cm8.D("InspectorPackagerConnection", "Couldn't send event to packager", e);
                    }
                }
                return null;
            }
        }

        public C0163d(String str) {
            this.f7329a = str;
        }

        public final void a(String str, Throwable th) {
            cm8.j("InspectorPackagerConnection", "Error occurred, shutting down websocket connection: " + str, th);
            d.this.e();
            d();
        }

        public void c() {
            this.e = true;
            WebSocket webSocket = this.c;
            if (webSocket != null) {
                try {
                    webSocket.close(1000, "End of session");
                } catch (Exception unused) {
                }
                this.c = null;
            }
        }

        public final void d() {
            WebSocket webSocket = this.c;
            if (webSocket != null) {
                try {
                    webSocket.close(1000, "End of session");
                } catch (Exception unused) {
                }
                this.c = null;
            }
        }

        public void e() {
            if (this.e) {
                throw new IllegalStateException("Can't connect closed client");
            }
            if (this.f7330b == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.f7330b = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).build();
            }
            this.f7330b.newWebSocket(new Request.Builder().url(this.f7329a).build(), this);
        }

        public final void f() {
            if (this.e) {
                throw new IllegalStateException("Can't reconnect closed client");
            }
            if (!this.f) {
                cm8.C("InspectorPackagerConnection", "Couldn't connect to packager, will silently retry");
                this.f = true;
            }
            this.d.postDelayed(new a(), VibrateModeProgressBar.sLongToLong);
        }

        public void g(JSONObject jSONObject) {
            new b(jSONObject).execute(this.c);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i, String str) {
            this.c = null;
            d.this.e();
            if (this.e) {
                return;
            }
            f();
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            if (this.c != null) {
                a("Websocket exception", th);
            }
            if (this.e) {
                return;
            }
            f();
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            try {
                d.this.k(new JSONObject(str));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            this.c = webSocket;
        }
    }

    public d(String str, String str2, c cVar) {
        this.f7323a = new C0163d(str);
        this.c = str2;
        this.d = cVar;
    }

    public void e() {
        Iterator<Map.Entry<String, Inspector.LocalConnection>> it = this.f7324b.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().disconnect();
        }
        this.f7324b.clear();
    }

    public void f() {
        this.f7323a.c();
    }

    public void g() {
        this.f7323a.e();
    }

    public final JSONArray h() throws JSONException {
        List<Inspector.Page> pages = Inspector.getPages();
        JSONArray jSONArray = new JSONArray();
        b bVarA = this.d.a();
        for (Inspector.Page page : pages) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", String.valueOf(page.getId()));
            jSONObject.put("title", page.getTitle());
            jSONObject.put("app", this.c);
            jSONObject.put("vm", page.getVM());
            jSONObject.put("isLastBundleDownloadSuccess", bVarA.f7327a);
            jSONObject.put("bundleUpdateTimestamp", bVarA.f7328b);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public final void i(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("pageId");
        if (this.f7324b.remove(string) != null) {
            throw new IllegalStateException("Already connected: " + string);
        }
        try {
            this.f7324b.put(string, Inspector.connect(Integer.parseInt(string), new a(string)));
        } catch (Exception e) {
            cm8.D("InspectorPackagerConnection", "Failed to open page: " + string, e);
            n("disconnect", m(string));
        }
    }

    public final void j(JSONObject jSONObject) throws JSONException {
        Inspector.LocalConnection localConnectionRemove = this.f7324b.remove(jSONObject.getString("pageId"));
        if (localConnectionRemove == null) {
            return;
        }
        localConnectionRemove.disconnect();
    }

    public void k(JSONObject jSONObject) throws JSONException, IOException {
        String string = jSONObject.getString("event");
        string.hashCode();
        switch (string) {
            case "disconnect":
                j(jSONObject.getJSONObject(TSMAuthContants.PARAM_PAYLOAD));
                return;
            case "connect":
                i(jSONObject.getJSONObject(TSMAuthContants.PARAM_PAYLOAD));
                return;
            case "wrappedEvent":
                l(jSONObject.getJSONObject(TSMAuthContants.PARAM_PAYLOAD));
                return;
            case "getPages":
                n("getPages", h());
                return;
            default:
                throw new IllegalArgumentException("Unknown event: " + string);
        }
    }

    public final void l(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("pageId");
        String string2 = jSONObject.getString("wrappedEvent");
        Inspector.LocalConnection localConnection = this.f7324b.get(string);
        if (localConnection != null) {
            localConnection.sendMessage(string2);
            return;
        }
        throw new IllegalStateException("Not connected: " + string);
    }

    public final JSONObject m(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        return jSONObject;
    }

    public final void n(String str, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", str);
        jSONObject.put(TSMAuthContants.PARAM_PAYLOAD, obj);
        this.f7323a.g(jSONObject);
    }

    public void o(String str) {
        Iterator<Map.Entry<String, Inspector.LocalConnection>> it = this.f7324b.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().sendMessage(str);
        }
    }

    public final void p(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        jSONObject.put("wrappedEvent", str2);
        n("wrappedEvent", jSONObject);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Boolean f7327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f7328b;

        public b(Boolean bool, long j) {
            this.f7327a = bool;
            this.f7328b = j;
        }

        public b() {
            this(Boolean.FALSE, -1L);
        }
    }
}
