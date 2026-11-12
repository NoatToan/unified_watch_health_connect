package com.garmin.android.apps.connectmobile.developer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.method.ScrollingMovementMethod;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.developer.NetworkDebugActivity;
import g80.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/NetworkDebugActivity;", "Landroid/app/Activity;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NetworkDebugActivity extends Activity {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f33623q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f33624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f33626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f33627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f33628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f33629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ConnectivityManager f33630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WifiManager f33631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TelephonyManager f33632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f33633j = a.NONE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f33634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SparseIntArray f33635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SparseIntArray f33636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f33637n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f33638o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f33639p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/NetworkDebugActivity$a;", "", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        NONE,
        WIFI,
        MOBILE
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/developer/NetworkDebugActivity$c", "Landroid/telephony/PhoneStateListener;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends PhoneStateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f33644b = 0;

        public c() {
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            if (signalStrength != null) {
                a aVar = a.MOBILE;
                NetworkDebugActivity networkDebugActivity = NetworkDebugActivity.this;
                if (aVar == networkDebugActivity.f33633j) {
                    Handler handler = networkDebugActivity.f33628e;
                    if (handler != null) {
                        handler.post(new df.d(23, networkDebugActivity, signalStrength));
                    } else {
                        s.m("bgThreadHandler");
                        throw null;
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/developer/NetworkDebugActivity$d", "Landroid/net/ConnectivityManager$NetworkCallback;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends ConnectivityManager.NetworkCallback {
        public d() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            network.getClass();
            super.onAvailable(network);
            int i14 = NetworkDebugActivity.f33623q;
            NetworkDebugActivity.this.a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLosing(Network network, int i14) {
            network.getClass();
            super.onLosing(network, i14);
            int i15 = NetworkDebugActivity.f33623q;
            NetworkDebugActivity networkDebugActivity = NetworkDebugActivity.this;
            networkDebugActivity.b("losing data connection");
            networkDebugActivity.a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            network.getClass();
            super.onLost(network);
            int i14 = NetworkDebugActivity.f33623q;
            NetworkDebugActivity networkDebugActivity = NetworkDebugActivity.this;
            networkDebugActivity.b("lost data connection");
            networkDebugActivity.a();
        }
    }

    static {
        new b(null);
    }

    public NetworkDebugActivity() {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        sparseIntArray.put(0, R.drawable.data_connected_0);
        sparseIntArray.put(1, R.drawable.data_connected_1);
        sparseIntArray.put(2, R.drawable.data_connected_2);
        sparseIntArray.put(3, R.drawable.data_connected_3);
        sparseIntArray.put(4, R.drawable.data_connected_4);
        this.f33635l = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray(5);
        sparseIntArray2.put(0, R.drawable.wifi_connected_0);
        sparseIntArray2.put(1, R.drawable.wifi_connected_1);
        sparseIntArray2.put(2, R.drawable.wifi_connected_2);
        sparseIntArray2.put(3, R.drawable.wifi_connected_3);
        sparseIntArray2.put(4, R.drawable.wifi_connected_4);
        this.f33636m = sparseIntArray2;
        this.f33637n = new d();
        this.f33638o = new c();
        this.f33639p = new h(this, 1);
    }

    public final void a() {
        ConnectivityManager connectivityManager = this.f33630g;
        if (connectivityManager == null) {
            s.m("connMgr");
            throw null;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        h hVar = this.f33639p;
        if (activeNetworkInfo == null) {
            this.f33633j = a.NONE;
            Handler handler = this.f33628e;
            if (handler == null) {
                s.m("bgThreadHandler");
                throw null;
            }
            handler.removeCallbacks(hVar);
            Handler handler2 = this.f33629f;
            if (handler2 == null) {
                s.m("uiThreadHandler");
                throw null;
            }
            handler2.post(new h(this, 0));
            b(this.f33633j.name());
            return;
        }
        if (activeNetworkInfo.getType() != 1) {
            if (activeNetworkInfo.getType() == 0) {
                this.f33633j = a.MOBILE;
                Handler handler3 = this.f33628e;
                if (handler3 == null) {
                    s.m("bgThreadHandler");
                    throw null;
                }
                handler3.removeCallbacks(hVar);
                final int i14 = this.f33635l.get(this.f33634k, 0);
                Handler handler4 = this.f33629f;
                if (handler4 == null) {
                    s.m("uiThreadHandler");
                    throw null;
                }
                final int i15 = 2;
                handler4.post(new Runnable(this) { // from class: g80.i

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ NetworkDebugActivity f76257b;

                    {
                        this.f76257b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                NetworkDebugActivity networkDebugActivity = this.f76257b;
                                ImageView imageView = networkDebugActivity.f33626c;
                                if (imageView != null) {
                                    imageView.setBackground(a7.b.getDrawable(networkDebugActivity, i14));
                                    return;
                                } else {
                                    s.m("activeNetworkImg");
                                    throw null;
                                }
                            case 1:
                                NetworkDebugActivity networkDebugActivity2 = this.f76257b;
                                TextView textView = networkDebugActivity2.f33627d;
                                if (textView == null) {
                                    s.m("activeNetworkSignalStrength");
                                    throw null;
                                }
                                textView.setText(String.valueOf(i14));
                                TextView textView2 = networkDebugActivity2.f33627d;
                                if (textView2 != null) {
                                    textView2.setVisibility(0);
                                    return;
                                } else {
                                    s.m("activeNetworkSignalStrength");
                                    throw null;
                                }
                            default:
                                NetworkDebugActivity networkDebugActivity3 = this.f76257b;
                                ImageView imageView2 = networkDebugActivity3.f33626c;
                                if (imageView2 == null) {
                                    s.m("activeNetworkImg");
                                    throw null;
                                }
                                imageView2.setBackground(a7.b.getDrawable(networkDebugActivity3, i14));
                                TextView textView3 = networkDebugActivity3.f33627d;
                                if (textView3 == null) {
                                    s.m("activeNetworkSignalStrength");
                                    throw null;
                                }
                                textView3.setText("");
                                TextView textView4 = networkDebugActivity3.f33627d;
                                if (textView4 != null) {
                                    textView4.setVisibility(8);
                                    return;
                                } else {
                                    s.m("activeNetworkSignalStrength");
                                    throw null;
                                }
                        }
                    }
                });
                b(this.f33633j.name() + " -> " + activeNetworkInfo.getDetailedState().name());
                return;
            }
            return;
        }
        this.f33633j = a.WIFI;
        WifiManager wifiManager = this.f33631h;
        if (wifiManager == null) {
            s.m("wifiMgr");
            throw null;
        }
        final int rssi = wifiManager.getConnectionInfo().getRssi();
        final int i16 = this.f33636m.get(WifiManager.calculateSignalLevel(rssi, 5), 0);
        Handler handler5 = this.f33629f;
        if (handler5 == null) {
            s.m("uiThreadHandler");
            throw null;
        }
        final int i17 = 0;
        handler5.post(new Runnable(this) { // from class: g80.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NetworkDebugActivity f76257b;

            {
                this.f76257b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        NetworkDebugActivity networkDebugActivity = this.f76257b;
                        ImageView imageView = networkDebugActivity.f33626c;
                        if (imageView != null) {
                            imageView.setBackground(a7.b.getDrawable(networkDebugActivity, i16));
                            return;
                        } else {
                            s.m("activeNetworkImg");
                            throw null;
                        }
                    case 1:
                        NetworkDebugActivity networkDebugActivity2 = this.f76257b;
                        TextView textView = networkDebugActivity2.f33627d;
                        if (textView == null) {
                            s.m("activeNetworkSignalStrength");
                            throw null;
                        }
                        textView.setText(String.valueOf(i16));
                        TextView textView2 = networkDebugActivity2.f33627d;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            return;
                        } else {
                            s.m("activeNetworkSignalStrength");
                            throw null;
                        }
                    default:
                        NetworkDebugActivity networkDebugActivity3 = this.f76257b;
                        ImageView imageView2 = networkDebugActivity3.f33626c;
                        if (imageView2 == null) {
                            s.m("activeNetworkImg");
                            throw null;
                        }
                        imageView2.setBackground(a7.b.getDrawable(networkDebugActivity3, i16));
                        TextView textView3 = networkDebugActivity3.f33627d;
                        if (textView3 == null) {
                            s.m("activeNetworkSignalStrength");
                            throw null;
                        }
                        textView3.setText("");
                        TextView textView4 = networkDebugActivity3.f33627d;
                        if (textView4 != null) {
                            textView4.setVisibility(8);
                            return;
                        } else {
                            s.m("activeNetworkSignalStrength");
                            throw null;
                        }
                }
            }
        });
        Handler handler6 = this.f33629f;
        if (handler6 == null) {
            s.m("uiThreadHandler");
            throw null;
        }
        final int i18 = 1;
        handler6.post(new Runnable(this) { // from class: g80.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NetworkDebugActivity f76257b;

            {
                this.f76257b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        NetworkDebugActivity networkDebugActivity = this.f76257b;
                        ImageView imageView = networkDebugActivity.f33626c;
                        if (imageView != null) {
                            imageView.setBackground(a7.b.getDrawable(networkDebugActivity, rssi));
                            return;
                        } else {
                            s.m("activeNetworkImg");
                            throw null;
                        }
                    case 1:
                        NetworkDebugActivity networkDebugActivity2 = this.f76257b;
                        TextView textView = networkDebugActivity2.f33627d;
                        if (textView == null) {
                            s.m("activeNetworkSignalStrength");
                            throw null;
                        }
                        textView.setText(String.valueOf(rssi));
                        TextView textView2 = networkDebugActivity2.f33627d;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            return;
                        } else {
                            s.m("activeNetworkSignalStrength");
                            throw null;
                        }
                    default:
                        NetworkDebugActivity networkDebugActivity3 = this.f76257b;
                        ImageView imageView2 = networkDebugActivity3.f33626c;
                        if (imageView2 == null) {
                            s.m("activeNetworkImg");
                            throw null;
                        }
                        imageView2.setBackground(a7.b.getDrawable(networkDebugActivity3, rssi));
                        TextView textView3 = networkDebugActivity3.f33627d;
                        if (textView3 == null) {
                            s.m("activeNetworkSignalStrength");
                            throw null;
                        }
                        textView3.setText("");
                        TextView textView4 = networkDebugActivity3.f33627d;
                        if (textView4 != null) {
                            textView4.setVisibility(8);
                            return;
                        } else {
                            s.m("activeNetworkSignalStrength");
                            throw null;
                        }
                }
            }
        });
        b(this.f33633j.name() + " -> " + activeNetworkInfo.getDetailedState().name());
        Handler handler7 = this.f33628e;
        if (handler7 != null) {
            handler7.postDelayed(hVar, 2000L);
        } else {
            s.m("bgThreadHandler");
            throw null;
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void b(String str) {
        Handler handler = this.f33629f;
        if (handler != null) {
            handler.post(new df.d(22, this, str));
        } else {
            s.m("uiThreadHandler");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.network_debug_activity);
        View viewFindViewById = findViewById(R.id.active_network_img);
        viewFindViewById.getClass();
        ImageView imageView = (ImageView) viewFindViewById;
        this.f33626c = imageView;
        imageView.setBackground(a7.b.getDrawable(this, R.drawable.no_active_network));
        View viewFindViewById2 = findViewById(R.id.active_network_signal_strength);
        viewFindViewById2.getClass();
        this.f33627d = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.f28706tv);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f33624a = textView;
        textView.setMovementMethod(new ScrollingMovementMethod());
        this.f33629f = new Handler();
        HandlerThread handlerThread = new HandlerThread("NetworkDebugActivity");
        handlerThread.start();
        this.f33628e = new Handler(handlerThread.getLooper());
        Object systemService = getApplicationContext().getSystemService("connectivity");
        systemService.getClass();
        this.f33630g = (ConnectivityManager) systemService;
        Object systemService2 = getApplicationContext().getSystemService("wifi");
        systemService2.getClass();
        this.f33631h = (WifiManager) systemService2;
        Object systemService3 = getSystemService("phone");
        systemService3.getClass();
        this.f33632i = (TelephonyManager) systemService3;
        ConnectivityManager connectivityManager = this.f33630g;
        if (connectivityManager == null) {
            s.m("connMgr");
            throw null;
        }
        Handler handler = this.f33628e;
        if (handler == null) {
            s.m("bgThreadHandler");
            throw null;
        }
        connectivityManager.registerDefaultNetworkCallback(this.f33637n, handler);
        TelephonyManager telephonyManager = this.f33632i;
        if (telephonyManager != null) {
            telephonyManager.listen(this.f33638o, 256);
        } else {
            s.m("teleMgr");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ConnectivityManager connectivityManager = this.f33630g;
        if (connectivityManager == null) {
            s.m("connMgr");
            throw null;
        }
        connectivityManager.unregisterNetworkCallback(this.f33637n);
        Handler handler = this.f33628e;
        if (handler == null) {
            s.m("bgThreadHandler");
            throw null;
        }
        Looper looper = handler.getLooper();
        if (looper != null) {
            looper.quit();
        }
        Handler handler2 = this.f33629f;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        } else {
            s.m("uiThreadHandler");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/NetworkDebugActivity$b;", "", "<init>", "()V", "", "MAX_DEBUG_LINES", "I", "", "WIFI_SIGNAL_STRENGTH_POLL_MILLIS", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
