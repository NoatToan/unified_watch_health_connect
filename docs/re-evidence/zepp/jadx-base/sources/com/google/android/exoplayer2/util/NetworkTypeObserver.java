package com.google.android.exoplayer2.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkTypeObserver {

    @Nullable
    private static NetworkTypeObserver e;
    private final Handler a = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<WeakReference<Listener>> b = new CopyOnWriteArrayList<>();
    private final Object c = new Object();

    @GuardedBy("networkTypeLock")
    private int d = 0;

    public static final class Config {
        private static volatile boolean a;

        private Config() {
        }

        public static void disable5GNsaDisambiguation() {
            a = true;
        }
    }

    public interface Listener {
        void onNetworkTypeChanged(int networkType);
    }

    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iE = NetworkTypeObserver.e(context);
            int i = Util.SDK_INT;
            if (i >= 29 && !Config.a && iE == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) Assertions.checkNotNull((TelephonyManager) context.getSystemService("phone"));
                    c cVar = new c();
                    if (i < 31) {
                        telephonyManager.listen(cVar, 1);
                    } else {
                        telephonyManager.listen(cVar, 1048576);
                    }
                    telephonyManager.listen(cVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            NetworkTypeObserver.this.h(iE);
        }
    }

    public class c extends PhoneStateListener {
        private c() {
        }

        @Override // android.telephony.PhoneStateListener
        @RequiresApi(31)
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            NetworkTypeObserver.this.h(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(@Nullable ServiceState serviceState) {
            String string = serviceState == null ? "" : serviceState.toString();
            NetworkTypeObserver.this.h(string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    private NetworkTypeObserver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        context.registerReceiver(new b(), intentFilter);
    }

    private static int d(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return Util.SDK_INT >= 29 ? 9 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return d(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Listener listener) {
        listener.onNetworkTypeChanged(getNetworkType());
    }

    private void g() {
        for (WeakReference<Listener> weakReference : this.b) {
            if (weakReference.get() == null) {
                this.b.remove(weakReference);
            }
        }
    }

    public static synchronized NetworkTypeObserver getInstance(Context context) {
        if (e == null) {
            e = new NetworkTypeObserver(context);
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int networkType) {
        synchronized (this.c) {
            if (this.d == networkType) {
                return;
            }
            this.d = networkType;
            for (WeakReference<Listener> weakReference : this.b) {
                Listener listener = weakReference.get();
                if (listener != null) {
                    listener.onNetworkTypeChanged(networkType);
                } else {
                    this.b.remove(weakReference);
                }
            }
        }
    }

    @VisibleForTesting
    public static synchronized void resetForTests() {
        e = null;
    }

    public int getNetworkType() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public void register(final Listener listener) {
        g();
        this.b.add(new WeakReference<>(listener));
        this.a.post(new Runnable() { // from class: ae5
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f(listener);
            }
        });
    }
}
