package com.huawei.hms.mlsdk.asr.o;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.huawei.hms.network.httpclient.websocket.WebSocketListener;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactory;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import com.huawei.secure.android.common.ssl.SecureX509TrustManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes10.dex */
public final class p {
    private static HandlerThread u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f14425b;
    private n d;
    private SSLSocketFactory i;
    private X509TrustManager j;
    private Map<String, String> k;
    private Handler l;
    private ReentrantLock n;
    private long q;
    private boolean r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14426c = 0;
    private WebSocket e = null;
    private volatile int h = -1;
    private volatile boolean m = false;
    private boolean o = true;
    private Runnable p = new a();
    private Runnable s = new b();
    private WebSocketListener t = new c();
    private HttpClient f = null;
    private Request g = null;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (p.this.d != null) {
                p.this.d.b();
            }
            p.b(p.this);
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (p.this.h == 1) {
                p.this.e.send("{\"command\":\"HEART\"}");
                Log.d("WebSocketManager", "mHeartMessage: {\"command\":\"HEART\"}");
                p.this.l.postDelayed(this, p.this.q);
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SSLSocketFactory f14431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private X509TrustManager f14432c;
        private Map<String, String> d;
        private boolean f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList f14430a = new ArrayList();
        private long e = 5000;

        public final d a() {
            return this;
        }

        public final d a(List<String> list) {
            this.f14430a.clear();
            this.f14430a.addAll(list);
            return this;
        }

        public final d a(SecureSSLSocketFactoryNew secureSSLSocketFactoryNew, SecureX509TrustManager secureX509TrustManager) {
            this.f14431b = secureSSLSocketFactoryNew;
            this.f14432c = secureX509TrustManager;
            return this;
        }

        public final d a(HashMap map) {
            this.d = map;
            return this;
        }

        public final d a(boolean z) {
            this.f = z;
            return this;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("dispatch Message");
        u = handlerThread;
        handlerThread.start();
    }

    public p(d dVar) {
        this.f14424a = "";
        this.f14425b = null;
        this.q = 5000L;
        this.f14424a = "";
        if (!dVar.f14430a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.f14425b = arrayList;
            arrayList.addAll(dVar.f14430a);
        }
        this.i = dVar.f14431b;
        this.j = dVar.f14432c;
        this.k = dVar.d;
        this.n = new ReentrantLock();
        this.l = new Handler(u.getLooper());
        this.q = dVar.e;
        this.r = dVar.f;
    }

    static void b(p pVar) {
        synchronized (pVar) {
            int iC = pVar.c();
            if (iC != 0 && iC != 1) {
                pVar.a(0);
                pVar.a();
            }
        }
    }

    static /* synthetic */ void h(p pVar) {
        pVar.f14426c++;
    }

    static void i(p pVar) {
        pVar.l.removeCallbacks(pVar.p);
    }

    static void m(p pVar) {
        pVar.l.removeCallbacks(pVar.s);
    }

    static void q(p pVar) {
        pVar.getClass();
        SmartLogger.i("WebSocketManager", "using other url to connect server");
        synchronized (pVar) {
            pVar.h = 2;
        }
        pVar.l.post(pVar.p);
    }

    public final int c() {
        int i;
        synchronized (this) {
            i = this.h;
        }
        return i;
    }

    public final boolean d() {
        return this.m;
    }

    public final boolean e() {
        return this.h == 1;
    }

    public final void f() {
        this.m = false;
        synchronized (this) {
            int iC = c();
            if (iC != 0 && iC != 1) {
                a(0);
                a();
            }
        }
    }

    public final void g() {
        this.m = true;
        b();
    }

    final class c extends WebSocketListener {
        c() {
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public final void onClosed(WebSocket webSocket, int i, String str) {
            p.m(p.this);
            Log.d("WebSocketManager", "onClosed: code: " + i + "reason: " + str);
            if (p.this.d != null) {
                p.this.d.a(i, str);
            }
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public final void onClosing(WebSocket webSocket, int i, String str) {
            p.this.a(3);
            SmartLogger.i("WebSocketManager", "onClosing: code: " + i + ", reason: " + str);
            p.m(p.this);
            if (p.this.d != null) {
                p.this.d.b(i, str);
            }
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public final void onFailure(WebSocket webSocket, Throwable th, Response response) {
            p.this.a(-1);
            SmartLogger.i("WebSocketManager", "onFailure: " + th.getMessage());
            if (p.this.r) {
                p.a(p.this, th, response);
                return;
            }
            if (!p.this.o || p.this.f14425b == null) {
                p.a(p.this, th, response);
                return;
            }
            p.h(p.this);
            if (p.this.f14426c >= p.this.f14425b.size()) {
                p.a(p.this, th, response);
                return;
            }
            p pVar = p.this;
            pVar.f14424a = (String) pVar.f14425b.get(p.this.f14426c);
            p.q(p.this);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public final void onMessage(WebSocket webSocket, String str) {
            SmartLogger.d("WebSocketManager", "onMessage: " + str);
            if (p.this.d != null) {
                p.this.d.a(str);
            }
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public final void onOpen(WebSocket webSocket, Response response) {
            p.this.a(1);
            SmartLogger.i("WebSocketManager", "onOpen()");
            p.this.o = false;
            p.this.f14426c = 0;
            p.this.e = webSocket;
            p.i(p.this);
            if (p.this.d != null) {
                p.this.d.a();
            }
            p.this.l.postDelayed(p.this.s, p.this.q);
            if (p.this.m) {
                p.this.b();
            }
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public final void onMessage(WebSocket webSocket, byte[] bArr) {
            if (p.this.d != null) {
                p.this.d.getClass();
            }
        }
    }

    public final void a(n nVar) {
        this.d = nVar;
    }

    public final void a(int i) {
        synchronized (this) {
            this.h = i;
        }
    }

    public final boolean a(String str) {
        boolean zSend = (this.e == null || this.h != 1) ? false : this.e.send(str);
        if (zSend) {
            return zSend;
        }
        synchronized (this) {
            this.h = 0;
        }
        a();
        return zSend;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        n nVar;
        synchronized (this) {
            if (this.h == -1) {
                Log.d("WebSocketManager", "webSocket is already disconnected");
                return;
            }
            this.l.removeCallbacks(this.p);
            this.l.removeCallbacks(this.s);
            WebSocket webSocket = this.e;
            if (webSocket != null) {
                webSocket.cancel();
            }
            WebSocket webSocket2 = this.e;
            if (webSocket2 != null) {
                boolean zClose = webSocket2.close(1000, "NORMAL CLOSE");
                Log.d("WebSocketManager", "disconnect(), isClosed is " + zClose);
                this.e = null;
                if (!zClose && (nVar = this.d) != null) {
                    nVar.a(1001, "ABNORMAL CLOSE");
                }
            }
            a(-1);
        }
    }

    public final boolean a(byte[] bArr) {
        if (this.e == null || this.h != 1) {
            return false;
        }
        return this.e.send(bArr);
    }

    private void a() {
        X509TrustManager x509TrustManager;
        if (this.f == null) {
            Log.d("WebSocketManager", "createWebSocket()");
            HttpClient.Builder builder = new HttpClient.Builder();
            SSLSocketFactory sSLSocketFactory = this.i;
            if (sSLSocketFactory != null && (x509TrustManager = this.j) != null) {
                builder.sslSocketFactory(sSLSocketFactory, x509TrustManager);
                builder.connectTimeout(20000).callTimeout(20000).readTimeout(20000).hostnameVerifier((HostnameVerifier) SecureSSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                NetworkKit.getInstance().initConnectionPool(5, 5L, TimeUnit.SECONDS);
                this.f = builder.build();
            } else {
                Log.d("WebSocketManager", "SslSocketFactory or TrustManger is null");
            }
        }
        if (this.f14425b == null && this.f14424a.isEmpty()) {
            Log.d("WebSocketManager", "not config url");
        } else {
            try {
                Map<String, String> map = this.k;
                Request.Builder builderNewRequest = this.f.newRequest();
                String str = this.f14424a.isEmpty() ? (String) this.f14425b.get(0) : this.f14424a;
                this.f14424a = str;
                Request.Builder builderUrl = builderNewRequest.url(str);
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        builderUrl.addHeader(entry.getKey(), entry.getValue());
                    }
                }
                this.g = builderUrl.build();
            } catch (IllegalArgumentException e) {
                Log.e("WebSocketManager", "createRequest(): IllegalArgumentException" + e.getMessage());
            } catch (Exception e2) {
                Log.e("WebSocketManager", "createRequest(): Exception: " + e2.getMessage());
            }
        }
        if (this.f == null || this.g == null) {
            return;
        }
        WebSocket webSocket = this.e;
        if (webSocket != null) {
            webSocket.cancel();
        }
        try {
            this.n.lockInterruptibly();
            try {
                this.f.newWebSocket(this.g, this.t);
            } finally {
                this.n.unlock();
            }
        } catch (InterruptedException unused) {
            Log.d("WebSocketManager", "createWebSocket() InterruptedException");
        }
    }

    static void a(p pVar, Throwable th, Response response) {
        n nVar = pVar.d;
        if (nVar != null) {
            nVar.a(th);
        }
    }
}
