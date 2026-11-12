package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class ojj extends WebSocketListener {
    public static final String h = "ojj";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29222a;
    public boolean d;
    public WebSocket e;
    public c f;
    public b g;
    public boolean c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f29223b = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ojj.this.f();
        }
    }

    public interface b {
        void onConnected();

        void onDisconnected();
    }

    public interface c {
        void a(ByteString byteString);

        void onMessage(String str);
    }

    public ojj(String str, c cVar, b bVar) {
        this.f29222a = str;
        this.f = cVar;
        this.g = bVar;
    }

    private void a(String str, Throwable th) {
        cm8.j(h, "Error occurred, shutting down websocket connection: " + str, th);
        d();
    }

    private void d() {
        WebSocket webSocket = this.e;
        if (webSocket != null) {
            try {
                webSocket.close(1000, "End of session");
            } catch (Exception unused) {
            }
            this.e = null;
        }
    }

    private void g() {
        if (this.c) {
            throw new IllegalStateException("Can't reconnect closed client");
        }
        if (!this.d) {
            cm8.C(h, "Couldn't connect to \"" + this.f29222a + "\", will silently retry");
            this.d = true;
        }
        this.f29223b.postDelayed(new a(), VibrateModeProgressBar.sLongToLong);
    }

    public void c() {
        this.c = true;
        d();
        this.f = null;
        b bVar = this.g;
        if (bVar != null) {
            bVar.onDisconnected();
        }
    }

    public void e() {
        if (this.c) {
            throw new IllegalStateException("Can't connect closed client");
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).build().newWebSocket(new Request.Builder().url(this.f29222a).build(), this);
    }

    public final synchronized void f() {
        if (!this.c) {
            e();
        }
    }

    public synchronized void h(String str) throws IOException {
        WebSocket webSocket = this.e;
        if (webSocket == null) {
            throw new ClosedChannelException();
        }
        webSocket.send(str);
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onClosed(WebSocket webSocket, int i, String str) {
        try {
            this.e = null;
            if (!this.c) {
                b bVar = this.g;
                if (bVar != null) {
                    bVar.onDisconnected();
                }
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onFailure(WebSocket webSocket, Throwable th, Response response) {
        try {
            if (this.e != null) {
                a("Websocket exception", th);
            }
            if (!this.c) {
                b bVar = this.g;
                if (bVar != null) {
                    bVar.onDisconnected();
                }
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onMessage(WebSocket webSocket, String str) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.onMessage(str);
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onOpen(WebSocket webSocket, Response response) {
        this.e = webSocket;
        this.d = false;
        b bVar = this.g;
        if (bVar != null) {
            bVar.onConnected();
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onMessage(WebSocket webSocket, ByteString byteString) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.a(byteString);
        }
    }
}
