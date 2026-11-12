package hd2;

import androidx.room.a0;
import ds.e0;
import e23.l;
import i3.e5;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhd2/a;", "Lokhttp3/EventListener;", "", "callId", "Lokhttp3/HttpUrl;", "url", "callStartMillis", "", "enableLogging", "Lkotlin/Function1;", "", "", "logger", "<init>", "(JLokhttp3/HttpUrl;JZLe23/l;)V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends EventListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f83436h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f83437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpUrl f83438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f83439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f83440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<String, Unit> f83441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StringBuilder f83442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f83443g;

    /* JADX WARN: Multi-variable type inference failed */
    public a(long j8, HttpUrl httpUrl, long j14, boolean z14, l<? super String, Unit> lVar) {
        httpUrl.getClass();
        lVar.getClass();
        this.f83437a = j8;
        this.f83438b = httpUrl;
        this.f83439c = j14;
        this.f83440d = z14;
        this.f83441e = lVar;
        this.f83442f = new StringBuilder();
        this.f83443g = j14;
    }

    public final void a(String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f83443g = jCurrentTimeMillis;
        if (this.f83440d) {
            long j8 = jCurrentTimeMillis - this.f83439c;
            x0 x0Var = x0.f105818a;
            Locale locale = Locale.ENGLISH;
            this.f83441e.invoke(String.format(locale, a0.f(this.f83437a, "#", " [%4d ms] %s"), Arrays.copyOf(new Object[]{Long.valueOf(j8), str2.length() > 0 ? e5.g(str, ": ", str2) : str}, 2)));
            this.f83442f.append(String.format(locale, "\n%5d ms - ".concat(str), Arrays.copyOf(new Object[]{Long.valueOf(j8)}, 1)));
        }
    }

    public final void b() {
        if (this.f83440d) {
            long j8 = this.f83443g - this.f83439c;
            StringBuilder sbK = e0.k(this.f83437a, "#", " elapsed time: ");
            sbK.append(j8);
            sbK.append(" ms - ");
            sbK.append(this.f83438b);
            sbK.append(StringUtils.SPACE);
            sbK.append((Object) this.f83442f);
            this.f83441e.invoke(sbK.toString());
        }
    }

    @Override // okhttp3.EventListener
    public final void cacheConditionalHit(Call call, Response response) {
        call.getClass();
        response.getClass();
        a("cacheConditionalHit", String.valueOf(response));
    }

    @Override // okhttp3.EventListener
    public final void cacheHit(Call call, Response response) {
        call.getClass();
        response.getClass();
        a("cacheHit", String.valueOf(response));
    }

    @Override // okhttp3.EventListener
    public final void cacheMiss(Call call) {
        call.getClass();
        a("cacheMiss", "");
    }

    @Override // okhttp3.EventListener
    public final void callEnd(Call call) {
        call.getClass();
        a("callEnd", "");
        b();
    }

    @Override // okhttp3.EventListener
    public final void callFailed(Call call, IOException iOException) {
        call.getClass();
        iOException.getClass();
        a("callFailed", String.valueOf(iOException));
        b();
    }

    @Override // okhttp3.EventListener
    public final void callStart(Call call) {
        call.getClass();
        a("callStart", String.valueOf(call.request()));
    }

    @Override // okhttp3.EventListener
    public final void canceled(Call call) {
        call.getClass();
        a("canceled", "");
    }

    @Override // okhttp3.EventListener
    public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        a("connectEnd", String.valueOf(protocol));
    }

    @Override // okhttp3.EventListener
    public final void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        iOException.getClass();
        a("connectFailed", protocol + StringUtils.SPACE + iOException);
    }

    @Override // okhttp3.EventListener
    public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        a("connectStart", inetSocketAddress + StringUtils.SPACE + proxy);
    }

    @Override // okhttp3.EventListener
    public final void connectionAcquired(Call call, Connection connection) {
        call.getClass();
        connection.getClass();
        a("connectionAcquired", String.valueOf(connection));
    }

    @Override // okhttp3.EventListener
    public final void connectionReleased(Call call, Connection connection) {
        call.getClass();
        connection.getClass();
        a("connectionReleased", "");
    }

    @Override // okhttp3.EventListener
    public final void dnsEnd(Call call, String str, List<? extends InetAddress> list) {
        call.getClass();
        str.getClass();
        list.getClass();
        a("dnsEnd", str + " -> " + h0.k0(list, null, null, null, new ha0.b(13), 31));
    }

    @Override // okhttp3.EventListener
    public final void dnsStart(Call call, String str) {
        call.getClass();
        str.getClass();
        a("dnsStart", str);
    }

    @Override // okhttp3.EventListener
    public final void proxySelectEnd(Call call, HttpUrl httpUrl, List<? extends Proxy> list) {
        call.getClass();
        httpUrl.getClass();
        list.getClass();
        a("proxySelectEnd", String.valueOf(list));
    }

    @Override // okhttp3.EventListener
    public final void proxySelectStart(Call call, HttpUrl httpUrl) {
        call.getClass();
        httpUrl.getClass();
        a("proxySelectStart", String.valueOf(httpUrl));
    }

    @Override // okhttp3.EventListener
    public final void requestBodyEnd(Call call, long j8) {
        call.getClass();
        a("requestBodyEnd", "byteCount=" + j8);
    }

    @Override // okhttp3.EventListener
    public final void requestBodyStart(Call call) {
        call.getClass();
        a("requestBodyStart", "");
    }

    @Override // okhttp3.EventListener
    public final void requestFailed(Call call, IOException iOException) {
        call.getClass();
        iOException.getClass();
        a("requestFailed", String.valueOf(iOException));
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersEnd(Call call, Request request) {
        call.getClass();
        request.getClass();
        a("requestHeadersEnd", "");
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersStart(Call call) {
        call.getClass();
        a("requestHeadersStart", "");
    }

    @Override // okhttp3.EventListener
    public final void responseBodyEnd(Call call, long j8) {
        call.getClass();
        a("responseBodyEnd", "byteCount=" + j8);
    }

    @Override // okhttp3.EventListener
    public final void responseBodyStart(Call call) {
        call.getClass();
        a("responseBodyStart", "");
    }

    @Override // okhttp3.EventListener
    public final void responseFailed(Call call, IOException iOException) {
        call.getClass();
        iOException.getClass();
        a("responseFailed", String.valueOf(iOException));
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersEnd(Call call, Response response) {
        call.getClass();
        response.getClass();
        a("responseHeadersEnd", String.valueOf(response));
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersStart(Call call) {
        call.getClass();
        a("responseHeadersStart", "");
    }

    @Override // okhttp3.EventListener
    public final void satisfactionFailure(Call call, Response response) {
        call.getClass();
        response.getClass();
        a("satisfactionFailure", String.valueOf(response));
    }

    @Override // okhttp3.EventListener
    public final void secureConnectEnd(Call call, Handshake handshake) {
        call.getClass();
        a("secureConnectEnd", String.valueOf(handshake));
    }

    @Override // okhttp3.EventListener
    public final void secureConnectStart(Call call) {
        call.getClass();
        a("secureConnectStart", "");
    }
}
