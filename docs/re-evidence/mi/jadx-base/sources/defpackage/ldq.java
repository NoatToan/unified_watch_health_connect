package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.SystemClock;
import android.util.Pair;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.account.privacy_data.lib.PermissionChecker;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.phonenum.bean.HttpError;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class ldq extends vfc {
    public static CookieManager c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public euh f24946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f24947b;

    public class b implements pfc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public qfc f24948a;

        public class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ConnectivityManager f24950a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtomicReference f24951b;
            public final /* synthetic */ CountDownLatch c;

            public a(ConnectivityManager connectivityManager, AtomicReference atomicReference, CountDownLatch countDownLatch) {
                this.f24950a = connectivityManager;
                this.f24951b = atomicReference;
                this.c = countDownLatch;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                NetworkInfo networkInfo = this.f24950a.getNetworkInfo(network);
                if (networkInfo == null || networkInfo.getState() != NetworkInfo.State.CONNECTED) {
                    return;
                }
                this.f24951b.set(network);
                this.c.countDown();
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005e  */
        @Override // defpackage.pfc
        public ork a(ymk ymkVar) throws IOException {
            Pair<Network, ConnectivityManager.NetworkCallback> pairD;
            long jUptimeMillis = SystemClock.uptimeMillis();
            ConnectivityManager connectivityManager = (ConnectivityManager) ldq.this.f24947b.getApplicationContext().getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
            int i = this.f24948a.e;
            if (i < 0) {
                pairD = null;
            } else {
                if (!ldq.this.f24946a.b(i)) {
                    return HttpError.DATA_NOT_ENABLED.result();
                }
                if (ldq.this.f24946a.d()) {
                    pairD = null;
                } else {
                    if (!PermissionChecker.hasPermission(ldq.this.f24947b, "android.permission.CHANGE_NETWORK_STATE")) {
                        return HttpError.NO_CHANGE_NETWORK_STATE_PERMISSION.result();
                    }
                    pairD = d();
                    if (pairD == null) {
                        return HttpError.CELLULAR_NETWORK_NOT_AVAILABLE.result();
                    }
                }
            }
            ork.a aVarB = b(ymkVar, c(ymkVar.f40331a, pairD != null ? (Network) pairD.first : null));
            if (pairD != null) {
                connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) pairD.second);
            }
            return aVarB.g(SystemClock.uptimeMillis() - jUptimeMillis).b();
        }

        public final ork.a b(ymk ymkVar, HttpURLConnection httpURLConnection) throws IOException {
            BufferedReader bufferedReader;
            Throwable th;
            try {
                httpURLConnection.setConnectTimeout((int) this.f24948a.f31476a);
                httpURLConnection.setReadTimeout((int) this.f24948a.f31477b);
                if (ymkVar.d != null) {
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                } else {
                    httpURLConnection.setRequestMethod("GET");
                }
                httpURLConnection.setInstanceFollowRedirects(ymkVar.e);
                Map<String, String> map = ymkVar.c;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.connect();
                if (ymkVar.d != null) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                    bufferedWriter.write(w4f.c(ymkVar.d));
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                ork.a aVarD = new ork.a().c(responseCode).e(httpURLConnection.getHeaderField(SimpleRequest.LOCATION)).f(httpURLConnection.getHeaderField("Set-Cookie")).d(httpURLConnection.getHeaderFields());
                if (responseCode != 200) {
                    httpURLConnection.disconnect();
                    return aVarD;
                }
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()), 1024);
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                ork.a aVarA = aVarD.a(sb.toString());
                                bufferedReader.close();
                                httpURLConnection.disconnect();
                                return aVarA;
                            }
                            sb.append(line);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader == null) {
                            throw th;
                        }
                        bufferedReader.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                httpURLConnection.disconnect();
                throw th4;
            }
        }

        public final HttpURLConnection c(String str, Network network) throws IOException {
            return network != null ? (HttpURLConnection) network.openConnection(new URL(str)) : (HttpURLConnection) new URL(str).openConnection();
        }

        public final Pair<Network, ConnectivityManager.NetworkCallback> d() {
            try {
                return e(ldq.this.f24947b, this.f24948a.d);
            } catch (InterruptedException e) {
                AccountLogger.log("HttpUrlConnClient", "waitForCellular", e);
                return null;
            } catch (TimeoutException e2) {
                AccountLogger.log("HttpUrlConnClient", "waitForCellular Timeout " + this.f24948a.d, e2);
                return null;
            }
        }

        public final Pair<Network, ConnectivityManager.NetworkCallback> e(Context context, long j) throws InterruptedException, TimeoutException {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
            AtomicReference atomicReference = new AtomicReference(null);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
            a aVar = new a(connectivityManager, atomicReference, countDownLatch);
            connectivityManager.requestNetwork(networkRequestBuild, aVar);
            if (!countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                connectivityManager.unregisterNetworkCallback(aVar);
                throw new TimeoutException();
            }
            Network network = (Network) atomicReference.get();
            if (network != null) {
                return new Pair<>(network, aVar);
            }
            connectivityManager.unregisterNetworkCallback(aVar);
            return null;
        }

        public b(qfc qfcVar) {
            this.f24948a = qfcVar;
        }
    }

    static {
        CookieManager cookieManager = new CookieManager();
        c = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
    }

    public ldq(Context context) {
        this.f24947b = context;
        this.f24946a = pth.g(context);
        CookieHandler.setDefault(c);
    }

    @Override // defpackage.vfc
    public pfc c(qfc qfcVar) {
        return new b(qfcVar);
    }
}
