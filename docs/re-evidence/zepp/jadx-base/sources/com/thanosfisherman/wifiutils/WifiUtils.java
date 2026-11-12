package com.thanosfisherman.wifiutils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.thanosfisherman.elvis.Elvis;
import com.thanosfisherman.elvis.interfaces.Consumer;
import com.thanosfisherman.wifiutils.WifiUtils;
import com.thanosfisherman.wifiutils.utils.VersionUtils;
import com.thanosfisherman.wifiutils.wifiConnect.ConnectionErrorCode;
import com.thanosfisherman.wifiutils.wifiConnect.ConnectionScanResultsListener;
import com.thanosfisherman.wifiutils.wifiConnect.ConnectionSuccessListener;
import com.thanosfisherman.wifiutils.wifiConnect.DisconnectCallbackHolder;
import com.thanosfisherman.wifiutils.wifiConnect.TimeoutHandler;
import com.thanosfisherman.wifiutils.wifiConnect.WifiConnectionCallback;
import com.thanosfisherman.wifiutils.wifiConnect.WifiConnectionReceiver;
import com.thanosfisherman.wifiutils.wifiDisconnect.DisconnectionErrorCode;
import com.thanosfisherman.wifiutils.wifiDisconnect.DisconnectionSuccessListener;
import com.thanosfisherman.wifiutils.wifiRemove.RemoveErrorCode;
import com.thanosfisherman.wifiutils.wifiRemove.RemoveSuccessListener;
import com.thanosfisherman.wifiutils.wifiScan.ScanResultsListener;
import com.thanosfisherman.wifiutils.wifiScan.WifiScanCallback;
import com.thanosfisherman.wifiutils.wifiScan.WifiScanReceiver;
import com.thanosfisherman.wifiutils.wifiState.WifiStateCallback;
import com.thanosfisherman.wifiutils.wifiState.WifiStateListener;
import com.thanosfisherman.wifiutils.wifiState.WifiStateReceiver;
import com.thanosfisherman.wifiutils.wifiWps.ConnectionWpsListener;
import defpackage.mz0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"MissingPermission"})
public final class WifiUtils implements WifiConnectorBuilder, WifiConnectorBuilder.WifiUtilsBuilder, WifiConnectorBuilder.WifiSuccessListener, WifiConnectorBuilder.WifiWpsSuccessListener {
    private static final String w = "WifiUtils";
    private static boolean x;

    @Nullable
    private static Logger y;

    @Nullable
    private final WifiManager a;

    @Nullable
    private final ConnectivityManager b;

    @NonNull
    private final Context c;
    private long d = 30000;
    private long e = 30000;

    @NonNull
    private WeakHandler f;

    @NonNull
    private final WifiStateReceiver g;

    @NonNull
    private final WifiConnectionReceiver h;

    @NonNull
    private final TimeoutHandler i;

    @NonNull
    private final WifiScanReceiver j;

    @Nullable
    private String k;

    @Nullable
    private String l;

    @Nullable
    private String m;

    @Nullable
    private ScanResult n;

    @Nullable
    private ScanResultsListener o;

    @Nullable
    private ConnectionScanResultsListener p;

    @Nullable
    private ConnectionSuccessListener q;

    @Nullable
    private WifiStateListener r;

    @Nullable
    private ConnectionWpsListener s;

    @NonNull
    private final WifiStateCallback t;

    @NonNull
    private final WifiScanCallback u;

    @NonNull
    private final WifiConnectionCallback v;

    public class a implements WifiStateCallback {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(ScanResultsListener scanResultsListener) {
            scanResultsListener.onScanResults(new ArrayList());
        }

        @Override // com.thanosfisherman.wifiutils.wifiState.WifiStateCallback
        public void onWifiEnabled() {
            WifiUtils.wifiLog("WIFI ENABLED...");
            ConnectorUtils.C(WifiUtils.this.c, WifiUtils.this.g);
            Elvis.of(WifiUtils.this.r).ifPresent(new Consumer() { // from class: com.thanosfisherman.wifiutils.e
                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public final void accept(Object obj) {
                    ((WifiStateListener) obj).isSuccess(true);
                }

                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return mz0.a(this, consumer);
                }
            });
            if (WifiUtils.this.o == null && WifiUtils.this.m == null) {
                return;
            }
            WifiUtils.wifiLog("START SCANNING....");
            if (WifiUtils.this.a.startScan()) {
                ConnectorUtils.x(WifiUtils.this.c, WifiUtils.this.j, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
                return;
            }
            Elvis.of(WifiUtils.this.o).ifPresent(new Consumer() { // from class: com.thanosfisherman.wifiutils.d
                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public final void accept(Object obj) {
                    WifiUtils.a.e((ScanResultsListener) obj);
                }

                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return mz0.a(this, consumer);
                }
            });
            Elvis.of(WifiUtils.this.s).ifPresent(new Consumer() { // from class: com.thanosfisherman.wifiutils.f
                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public final void accept(Object obj) {
                    ((ConnectionWpsListener) obj).isSuccessful(false);
                }

                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return mz0.a(this, consumer);
                }
            });
            WifiUtils.this.v.errorConnect(ConnectionErrorCode.COULD_NOT_SCAN);
            WifiUtils.wifiLog("ERROR COULDN'T SCAN");
        }
    }

    public class b implements WifiScanCallback {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(List list, ConnectionScanResultsListener connectionScanResultsListener) {
            WifiUtils.this.n = connectionScanResultsListener.onConnectWithScanResult(list);
        }

        @Override // com.thanosfisherman.wifiutils.wifiScan.WifiScanCallback
        public void onScanResultsReady() {
            WifiUtils.wifiLog("GOT SCAN RESULTS");
            ConnectorUtils.C(WifiUtils.this.c, WifiUtils.this.j);
            final List<ScanResult> scanResults = WifiUtils.this.a.getScanResults();
            Elvis.of(WifiUtils.this.o).ifPresent(new Consumer() { // from class: com.thanosfisherman.wifiutils.h
                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public final void accept(Object obj) {
                    ((ScanResultsListener) obj).onScanResults(scanResults);
                }

                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return mz0.a(this, consumer);
                }
            });
            Elvis.of(WifiUtils.this.p).ifPresent(new Consumer() { // from class: com.thanosfisherman.wifiutils.g
                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public final void accept(Object obj) {
                    this.a.d(scanResults, (ConnectionScanResultsListener) obj);
                }

                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return mz0.a(this, consumer);
                }
            });
            if (WifiUtils.this.s != null && WifiUtils.this.l != null && WifiUtils.this.m != null) {
                WifiUtils wifiUtils = WifiUtils.this;
                wifiUtils.n = ConnectorUtils.u(wifiUtils.l, scanResults);
                if (WifiUtils.this.n != null && VersionUtils.isLollipopOrLater()) {
                    ConnectorUtils.k(WifiUtils.this.a, WifiUtils.this.f, WifiUtils.this.n, WifiUtils.this.m, WifiUtils.this.d, WifiUtils.this.s);
                    return;
                }
                if (WifiUtils.this.n == null) {
                    WifiUtils.wifiLog("Couldn't find network. Possibly out of range");
                }
                WifiUtils.this.s.isSuccessful(false);
                return;
            }
            if (WifiUtils.this.k != null) {
                if (WifiUtils.this.l != null) {
                    WifiUtils wifiUtils2 = WifiUtils.this;
                    wifiUtils2.n = ConnectorUtils.t(wifiUtils2.k, WifiUtils.this.l, scanResults);
                } else {
                    WifiUtils wifiUtils3 = WifiUtils.this;
                    wifiUtils3.n = ConnectorUtils.v(wifiUtils3.k, scanResults);
                }
            }
            if (WifiUtils.this.n == null || WifiUtils.this.m == null) {
                WifiUtils.this.v.errorConnect(ConnectionErrorCode.DID_NOT_FIND_NETWORK_BY_SCANNING);
            } else {
                if (!ConnectorUtils.j(WifiUtils.this.c, WifiUtils.this.a, WifiUtils.this.b, WifiUtils.this.f, WifiUtils.this.n, WifiUtils.this.m, WifiUtils.this.v)) {
                    WifiUtils.this.v.errorConnect(ConnectionErrorCode.COULD_NOT_CONNECT);
                    return;
                }
                ConnectorUtils.x(WifiUtils.this.c, WifiUtils.this.h.connectWith(WifiUtils.this.n, WifiUtils.this.m, WifiUtils.this.b), new IntentFilter("android.net.wifi.supplicant.STATE_CHANGE"));
                ConnectorUtils.x(WifiUtils.this.c, WifiUtils.this.h, new IntentFilter("android.net.wifi.STATE_CHANGE"));
                WifiUtils.this.i.startTimeout(WifiUtils.this.n, WifiUtils.this.e);
            }
        }
    }

    public class c implements WifiConnectionCallback {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(ConnectionErrorCode connectionErrorCode, ConnectionSuccessListener connectionSuccessListener) {
            connectionSuccessListener.failed(connectionErrorCode);
            WifiUtils.wifiLog("DIDN'T CONNECT TO WIFI " + connectionErrorCode);
        }

        @Override // com.thanosfisherman.wifiutils.wifiConnect.WifiConnectionCallback
        public void errorConnect(@NonNull final ConnectionErrorCode connectionErrorCode) {
            ConnectorUtils.C(WifiUtils.this.c, WifiUtils.this.h);
            WifiUtils.this.i.stopTimeout();
            if (VersionUtils.isAndroidQOrLater()) {
                DisconnectCallbackHolder.getInstance().disconnect();
            }
            ConnectorUtils.w(WifiUtils.this.a);
            Elvis.of(WifiUtils.this.q).ifPresent(new Consumer() { // from class: com.thanosfisherman.wifiutils.i
                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public final void accept(Object obj) {
                    WifiUtils.c.b(connectionErrorCode, (ConnectionSuccessListener) obj);
                }

                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return mz0.a(this, consumer);
                }
            });
        }

        @Override // com.thanosfisherman.wifiutils.wifiConnect.WifiConnectionCallback
        public void successfulConnect() {
            WifiUtils.wifiLog("CONNECTED SUCCESSFULLY");
            ConnectorUtils.C(WifiUtils.this.c, WifiUtils.this.h);
            WifiUtils.this.i.stopTimeout();
            Elvis.of(WifiUtils.this.q).ifPresent(new Consumer() { // from class: cw8
                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public final void accept(Object obj) {
                    ((ConnectionSuccessListener) obj).success();
                }

                @Override // com.thanosfisherman.elvis.interfaces.Consumer
                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return mz0.a(this, consumer);
                }
            });
        }
    }

    private WifiUtils(@NonNull Context context) {
        a aVar = new a();
        this.t = aVar;
        b bVar = new b();
        this.u = bVar;
        c cVar = new c();
        this.v = cVar;
        this.c = context;
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.a = wifiManager;
        if (wifiManager == null) {
            throw new RuntimeException("WifiManager is not supposed to be null");
        }
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.g = new WifiStateReceiver(aVar);
        this.j = new WifiScanReceiver(bVar);
        this.f = new WeakHandler();
        this.h = new WifiConnectionReceiver(cVar, wifiManager);
        this.i = new TimeoutHandler(wifiManager, this.f, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(ScanResult scanResult) {
        ConnectorUtils.e(this.a, scanResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(ScanResultsListener scanResultsListener) {
        scanResultsListener.onScanResults(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(int i, String str, String str2) {
        Log.println(i, w, str2);
    }

    public static void enableLog(boolean z) {
        x = z;
    }

    public static void forwardLog(Logger logger) {
        y = logger;
    }

    public static void wifiLog(String str) {
        if (x) {
            ((Logger) Elvis.of(y).orElse(new Logger() { // from class: bw8
                @Override // com.thanosfisherman.wifiutils.Logger
                public final void log(int i, String str2, String str3) {
                    WifiUtils.E(i, str2, str3);
                }
            })).log(2, w, str);
        }
    }

    public static WifiConnectorBuilder.WifiUtilsBuilder withContext(@NonNull Context context) {
        return new WifiUtils(context);
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    public void cancelAutoConnect() {
        ConnectorUtils.C(this.c, this.g);
        ConnectorUtils.C(this.c, this.j);
        ConnectorUtils.C(this.c, this.h);
        Elvis.of(this.n).ifPresent(new Consumer() { // from class: xv8
            @Override // com.thanosfisherman.elvis.interfaces.Consumer
            public final void accept(Object obj) {
                this.a.A((ScanResult) obj);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Consumer
            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return mz0.a(this, consumer);
            }
        });
        ConnectorUtils.w(this.a);
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    @NonNull
    public WifiConnectorBuilder.WifiSuccessListener connectWith(@NonNull String str, @NonNull String str2) {
        this.k = str;
        this.m = str2;
        return this;
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    @NonNull
    public WifiConnectorBuilder.WifiSuccessListener connectWithScanResult(@NonNull String str, @Nullable ConnectionScanResultsListener connectionScanResultsListener) {
        this.p = connectionScanResultsListener;
        this.m = str;
        return this;
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    @NonNull
    @RequiresApi(api = 21)
    public WifiConnectorBuilder.WifiWpsSuccessListener connectWithWps(@NonNull String str, @NonNull String str2) {
        this.l = str;
        this.m = str2;
        return this;
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    public void disableWifi() {
        if (this.a.isWifiEnabled()) {
            this.a.setWifiEnabled(false);
            ConnectorUtils.C(this.c, this.g);
            ConnectorUtils.C(this.c, this.j);
            ConnectorUtils.C(this.c, this.h);
        }
        wifiLog("WiFi Disabled");
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    public void disconnect(@NonNull DisconnectionSuccessListener disconnectionSuccessListener) {
        if (this.b == null) {
            disconnectionSuccessListener.failed(DisconnectionErrorCode.COULD_NOT_GET_CONNECTIVITY_MANAGER);
            return;
        }
        if (this.a == null) {
            disconnectionSuccessListener.failed(DisconnectionErrorCode.COULD_NOT_GET_WIFI_MANAGER);
            return;
        }
        if (VersionUtils.isAndroidQOrLater()) {
            DisconnectCallbackHolder.getInstance().disconnect();
            disconnectionSuccessListener.success();
        } else if (ConnectorUtils.n(this.a)) {
            disconnectionSuccessListener.success();
        } else {
            disconnectionSuccessListener.failed(DisconnectionErrorCode.COULD_NOT_DISCONNECT);
        }
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    @Deprecated
    public void disconnectFrom(@NonNull String str, @NonNull DisconnectionSuccessListener disconnectionSuccessListener) {
        disconnect(disconnectionSuccessListener);
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    public void enableWifi(@Nullable WifiStateListener wifiStateListener) {
        this.r = wifiStateListener;
        if (this.a.isWifiEnabled()) {
            this.t.onWifiEnabled();
            return;
        }
        if (this.a.setWifiEnabled(true)) {
            ConnectorUtils.x(this.c, this.g, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
            return;
        }
        Elvis.of(wifiStateListener).ifPresent(new Consumer() { // from class: zv8
            @Override // com.thanosfisherman.elvis.interfaces.Consumer
            public final void accept(Object obj) {
                ((WifiStateListener) obj).isSuccess(false);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Consumer
            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return mz0.a(this, consumer);
            }
        });
        Elvis.of(this.o).ifPresent(new Consumer() { // from class: yv8
            @Override // com.thanosfisherman.elvis.interfaces.Consumer
            public final void accept(Object obj) {
                WifiUtils.C((ScanResultsListener) obj);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Consumer
            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return mz0.a(this, consumer);
            }
        });
        Elvis.of(this.s).ifPresent(new Consumer() { // from class: aw8
            @Override // com.thanosfisherman.elvis.interfaces.Consumer
            public final void accept(Object obj) {
                ((ConnectionWpsListener) obj).isSuccessful(false);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Consumer
            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return mz0.a(this, consumer);
            }
        });
        this.v.errorConnect(ConnectionErrorCode.COULD_NOT_ENABLE_WIFI);
        wifiLog("COULDN'T ENABLE WIFI");
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    public boolean isWifiConnected(@NonNull String str) {
        return ConnectorUtils.isAlreadyConnected(this.a, this.b, str);
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiSuccessListener
    @NonNull
    public WifiConnectorBuilder onConnectionResult(@Nullable ConnectionSuccessListener connectionSuccessListener) {
        this.q = connectionSuccessListener;
        return this;
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiWpsSuccessListener
    @NonNull
    @RequiresApi(api = 21)
    public WifiConnectorBuilder onConnectionWpsResult(@Nullable ConnectionWpsListener connectionWpsListener) {
        this.s = connectionWpsListener;
        return this;
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    public void remove(@NonNull String str, @NonNull RemoveSuccessListener removeSuccessListener) {
        if (this.b == null) {
            removeSuccessListener.failed(RemoveErrorCode.COULD_NOT_GET_CONNECTIVITY_MANAGER);
            return;
        }
        if (this.a == null) {
            removeSuccessListener.failed(RemoveErrorCode.COULD_NOT_GET_WIFI_MANAGER);
            return;
        }
        if (VersionUtils.isAndroidQOrLater()) {
            DisconnectCallbackHolder.getInstance().disconnect();
            removeSuccessListener.success();
        } else if (ConnectorUtils.y(this.a, str)) {
            removeSuccessListener.success();
        } else {
            removeSuccessListener.failed(RemoveErrorCode.COULD_NOT_REMOVE);
        }
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    @NonNull
    public WifiConnectorBuilder scanWifi(ScanResultsListener scanResultsListener) {
        this.o = scanResultsListener;
        return this;
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiSuccessListener
    @NonNull
    public WifiConnectorBuilder.WifiSuccessListener setTimeout(long j) {
        this.e = j;
        return this;
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiWpsSuccessListener
    @NonNull
    public WifiConnectorBuilder.WifiWpsSuccessListener setWpsTimeout(long j) {
        this.d = j;
        return this;
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder
    public void start() {
        ConnectorUtils.C(this.c, this.g);
        ConnectorUtils.C(this.c, this.j);
        ConnectorUtils.C(this.c, this.h);
        enableWifi(null);
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    public boolean isWifiConnected() {
        return ConnectorUtils.isAlreadyConnected(this.b);
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    @NonNull
    public WifiConnectorBuilder.WifiSuccessListener connectWith(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.k = str;
        this.l = str2;
        this.m = str3;
        return this;
    }

    @Override // com.thanosfisherman.wifiutils.WifiConnectorBuilder.WifiUtilsBuilder
    public void enableWifi() {
        enableWifi(null);
    }
}
