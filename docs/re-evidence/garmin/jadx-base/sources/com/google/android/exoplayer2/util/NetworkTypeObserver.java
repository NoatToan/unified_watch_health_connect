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
import cd0.f;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkTypeObserver {
    private static NetworkTypeObserver staticInstance;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<WeakReference<Listener>> listeners = new CopyOnWriteArrayList<>();
    private final Object networkTypeLock = new Object();
    private int networkType = 0;

    public static final class Config {
        private static volatile boolean disable5GNsaDisambiguation;

        private Config() {
        }

        public static void disable5GNsaDisambiguation() {
            disable5GNsaDisambiguation = true;
        }
    }

    public interface Listener {
        void onNetworkTypeChanged(int i14);
    }

    public final class Receiver extends BroadcastReceiver {
        private Receiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int networkTypeFromConnectivityManager = NetworkTypeObserver.getNetworkTypeFromConnectivityManager(context);
            int i14 = Util.SDK_INT;
            if (i14 >= 29 && !Config.disable5GNsaDisambiguation && networkTypeFromConnectivityManager == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) Assertions.checkNotNull((TelephonyManager) context.getSystemService("phone"));
                    TelephonyManagerListener telephonyManagerListener = new TelephonyManagerListener();
                    if (i14 < 31) {
                        telephonyManager.listen(telephonyManagerListener, 1);
                    } else {
                        telephonyManager.listen(telephonyManagerListener, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    }
                    telephonyManager.listen(telephonyManagerListener, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            NetworkTypeObserver.this.updateNetworkType(networkTypeFromConnectivityManager);
        }
    }

    public class TelephonyManagerListener extends PhoneStateListener {
        private TelephonyManagerListener() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            NetworkTypeObserver.this.updateNetworkType(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String string = serviceState == null ? "" : serviceState.toString();
            NetworkTypeObserver.this.updateNetworkType(string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    private NetworkTypeObserver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new Receiver(), intentFilter);
    }

    public static synchronized NetworkTypeObserver getInstance(Context context) {
        try {
            if (staticInstance == null) {
                staticInstance = new NetworkTypeObserver(context);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return staticInstance;
    }

    private static int getMobileNetworkType(NetworkInfo networkInfo) {
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
    public static int getNetworkTypeFromConnectivityManager(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i14 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i14 = 1;
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
                return getMobileNetworkType(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$register$0(Listener listener) {
        listener.onNetworkTypeChanged(getNetworkType());
    }

    private void removeClearedReferences() {
        for (WeakReference<Listener> weakReference : this.listeners) {
            if (weakReference.get() == null) {
                this.listeners.remove(weakReference);
            }
        }
    }

    public static synchronized void resetForTests() {
        staticInstance = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNetworkType(int i14) {
        synchronized (this.networkTypeLock) {
            try {
                if (this.networkType == i14) {
                    return;
                }
                this.networkType = i14;
                for (WeakReference<Listener> weakReference : this.listeners) {
                    Listener listener = weakReference.get();
                    if (listener != null) {
                        listener.onNetworkTypeChanged(i14);
                    } else {
                        this.listeners.remove(weakReference);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public int getNetworkType() {
        int i14;
        synchronized (this.networkTypeLock) {
            i14 = this.networkType;
        }
        return i14;
    }

    public void register(Listener listener) {
        removeClearedReferences();
        this.listeners.add(new WeakReference<>(listener));
        this.mainHandler.post(new f(11, this, listener));
    }
}
