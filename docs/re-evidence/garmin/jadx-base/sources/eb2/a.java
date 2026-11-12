package eb2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.garmin.android.framework.garminonline.query.ConnectionException;
import com.garmin.android.framework.garminonline.query.HttpResponseCodeException;
import com.garmin.android.framework.garminonline.query.InvalidRequestException;
import com.garmin.android.framework.garminonline.query.InvalidResponseException;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import org.apache.commons.lang3.BooleanUtils;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a<T> implements Callable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f63677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f63680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f63681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f63682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PowerManager.WakeLock f63683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f63684h;

    /* JADX INFO: renamed from: eb2.a$a, reason: collision with other inner class name */
    public static class C1345a {
        public C1345a(HttpURLConnection httpURLConnection) {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HttpURLConnection f63685a;

        public b(HttpURLConnection httpURLConnection) {
            this.f63685a = httpURLConnection;
        }

        public final void a(String str, String str2) {
            this.f63685a.setRequestProperty(str, str2);
        }
    }

    @Deprecated
    public a(Context context, d dVar) {
        this.f63678b = true;
        this.f63681e = -1;
        this.f63682f = -1;
        if (context == null) {
            h.s("context cannot be null");
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        this.f63677a = applicationContext;
        (dVar == null ? new eb2.b(applicationContext) : dVar).b();
        this.f63684h = c.a();
    }

    public final int a() {
        try {
            Context context = this.f63677a;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                return !activeNetworkInfo.isAvailable() ? 1004 : 1001;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null || telephonyManager.getSimState() != 1) {
                return 1002;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            return (wifiManager == null || !wifiManager.isWifiEnabled()) ? 1003 : 1002;
        } catch (SecurityException | Exception unused) {
            return 1001;
        }
    }

    public abstract Object b(InputStream inputStream);

    public boolean c() {
        return true;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return e();
    }

    public final HttpURLConnection d(String str) throws ConnectionException, InvalidRequestException {
        try {
            URL url = new URL(str);
            try {
                HttpURLConnection httpURLConnection = url.getProtocol().equalsIgnoreCase("https") ? (HttpURLConnection) url.openConnection(Proxy.NO_PROXY) : (HttpURLConnection) url.openConnection();
                mb2.a.f117759a.getClass();
                httpURLConnection.getClass();
                return httpURLConnection;
            } catch (IOException e4) {
                throw new ConnectionException("Unable to open HTTP connection", e4, a(), 0);
            }
        } catch (MalformedURLException unused) {
            throw new InvalidRequestException(fb1.c.n("Malformed URL: ", str), 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public T e() throws Throwable {
        InputStream gZIPInputStream;
        this.f63679c = true;
        System.setProperty("http.keepAlive", BooleanUtils.FALSE);
        String str = this.f63684h.f63690c;
        ?? r14 = 0;
        OutputStream outputStream = null;
        try {
            if (this.f63683g == null) {
                PowerManager powerManager = (PowerManager) this.f63677a.getSystemService("power");
                String str2 = this.f63680d;
                if (str2 == null) {
                    str2 = "AbstractQuery: No ID";
                }
                this.f63683g = powerManager.newWakeLock(1, str2);
            }
            this.f63683g.acquire();
            HttpURLConnection httpURLConnectionD = d(str);
            try {
                mb2.a.f117759a.getClass();
                g(new b(httpURLConnectionD), this.f63684h);
                if (this.f63684h.f63688a != null && c()) {
                    int i14 = this.f63684h.f63689b;
                }
                int i15 = this.f63682f;
                int i16 = 30000;
                if (i15 < 0) {
                    i15 = 30000;
                }
                int i17 = this.f63681e;
                if (i17 >= 0) {
                    i16 = i17;
                }
                httpURLConnectionD.setConnectTimeout(i15);
                httpURLConnectionD.setReadTimeout(i16);
                httpURLConnectionD.setRequestProperty("connection", "close");
                httpURLConnectionD.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                httpURLConnectionD.setRequestProperty(com.mapbox.common.HttpHeaders.CONTENT_TYPE, "application/x-protobuf");
                httpURLConnectionD.setDoInput(true);
                httpURLConnectionD.setUseCaches(false);
                if (httpURLConnectionD.getRequestMethod().equals(FirebasePerformance.HttpMethod.PUT) || httpURLConnectionD.getRequestMethod().equals(FirebasePerformance.HttpMethod.POST)) {
                    httpURLConnectionD.setDoOutput(true);
                    try {
                        try {
                            OutputStream outputStream2 = httpURLConnectionD.getOutputStream();
                            try {
                                f(outputStream2, this.f63684h);
                                if (outputStream2 != null) {
                                    try {
                                        outputStream2.flush();
                                        outputStream2.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (SocketTimeoutException e4) {
                                e = e4;
                                throw new ConnectionException("Timeout getting output stream", e, a(), 4);
                            } catch (IOException e14) {
                                e = e14;
                                throw new ConnectionException("Failed to get output stream.", e, a(), 3);
                            } catch (Throwable th3) {
                                th = th3;
                                outputStream = outputStream2;
                                if (outputStream != null) {
                                    try {
                                        outputStream.flush();
                                        outputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (SocketTimeoutException e15) {
                        e = e15;
                    } catch (IOException e16) {
                        e = e16;
                    }
                }
                try {
                    httpURLConnectionD.connect();
                    try {
                        int responseCode = httpURLConnectionD.getResponseCode();
                        if (responseCode != 200) {
                            throw new HttpResponseCodeException(responseCode);
                        }
                        try {
                            try {
                                try {
                                    String contentEncoding = httpURLConnectionD.getContentEncoding();
                                    InputStream inputStream = httpURLConnectionD.getInputStream();
                                    if (contentEncoding == null || contentEncoding.length() <= 0) {
                                        gZIPInputStream = inputStream;
                                    } else {
                                        if (!contentEncoding.equals("gzip")) {
                                            throw new InvalidResponseException("Invalid Encoding Type: ".concat(contentEncoding), 5);
                                        }
                                        try {
                                            gZIPInputStream = new GZIPInputStream(inputStream);
                                        } catch (IOException unused3) {
                                            throw new InvalidResponseException("Error in gzip stream.  Was the content really gzipd?", 5);
                                        }
                                    }
                                    new C1345a(httpURLConnectionD);
                                    T t7 = (T) b(gZIPInputStream);
                                    if (inputStream != null) {
                                        do {
                                        } while (inputStream.skip(4096L) == 4096);
                                        inputStream.close();
                                    }
                                    httpURLConnectionD.disconnect();
                                    PowerManager.WakeLock wakeLock = this.f63683g;
                                    if (wakeLock != null) {
                                        wakeLock.release();
                                    }
                                    return t7;
                                } catch (IOException e17) {
                                    throw new ConnectionException("Failed to get input stream.", e17, a(), 3);
                                }
                            } catch (Throwable th5) {
                                if (0 != 0) {
                                    do {
                                    } while (r14.skip(4096L) == 4096);
                                    r14.close();
                                }
                                throw th5;
                            }
                        } catch (SocketTimeoutException e18) {
                            throw new ConnectionException("Timeout getting input stream", e18, a(), 4);
                        }
                    } catch (SocketTimeoutException e19) {
                        throw new ConnectionException("Timeout getting response code", e19, a(), 4);
                    } catch (IOException e24) {
                        throw new ConnectionException("Unable to get response code", e24, a(), 0);
                    }
                } catch (IOException e25) {
                    throw new ConnectionException("Unable to establish HTTP connection", e25, a(), 0);
                }
            } catch (Throwable th6) {
                th = th6;
                r14 = httpURLConnectionD;
            }
            th = th6;
            r14 = httpURLConnectionD;
        } catch (Throwable th7) {
            th = th7;
        }
        if (r14 != 0) {
            r14.disconnect();
        }
        PowerManager.WakeLock wakeLock2 = this.f63683g;
        if (wakeLock2 != null) {
            wakeLock2.release();
        }
        throw th;
    }

    public abstract void f(OutputStream outputStream, e eVar);

    public void g(b bVar, e eVar) {
        if (eVar.f63688a != null && c()) {
            bVar.a("txnKey", eVar.f63688a);
            bVar.a("txnCount", Integer.toString(eVar.f63689b));
        }
        String str = eVar.f63691d;
        if (str != null) {
            bVar.a("clienttypeid", str);
        }
        bVar.a(RemoteConfigConstants.RequestFieldKey.APP_ID, "Garmin Mobile _Development_");
        bVar.a("capabilities", "00");
    }

    public a(Context context, d dVar, e eVar) {
        this(context, dVar);
        this.f63684h = eVar;
    }
}
