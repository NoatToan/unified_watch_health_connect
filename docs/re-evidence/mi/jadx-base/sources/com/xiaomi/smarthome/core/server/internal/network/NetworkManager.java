package com.xiaomi.smarthome.core.server.internal.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.example.statistics.export.OneTrackConstant;
import com.smarthome.connect.utils.WifiUtils;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class NetworkManager {
    public static final int TYPE_NONE = -100;
    private static Object mLock = new Object();
    private static NetworkManager sInstance;
    Context mAppContext;
    List<NetworkListener> mNetworkListeners = new ArrayList();
    private NetworkBroadcastReceiver mNetworkReceiver;

    public class NetworkBroadcastReceiver extends BroadcastReceiver {
        private String lastSsid;
        private int lastType;
        private int thisType = -100;

        public NetworkBroadcastReceiver(Context context) {
            this.lastType = -100;
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                this.lastType = -100;
                return;
            }
            this.lastType = activeNetworkInfo.getType();
            if (activeNetworkInfo.getType() == 1) {
                WifiInfo connectionInfo = WifiUtils.getConnectionInfo((WifiManager) context.getSystemService("wifi"));
                this.lastSsid = connectionInfo == null ? null : connectionInfo.getSSID();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getLastType() {
            return this.lastType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getThisType() {
            return this.thisType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0(Context context) {
            int i;
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    this.thisType = -100;
                    if (this.lastType != -100) {
                        NetworkManager.this.onNetworkChanged();
                    }
                    this.lastType = -100;
                    return;
                }
                int type = activeNetworkInfo.getType();
                this.thisType = type;
                if (type != this.lastType) {
                    if (activeNetworkInfo.getType() == 1) {
                        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                        WifiInfo connectionInfo = wifiManager != null ? WifiUtils.getConnectionInfo(wifiManager) : null;
                        this.lastSsid = connectionInfo != null ? connectionInfo.getSSID() : null;
                    } else {
                        this.lastSsid = null;
                    }
                    if (this.thisType == 1 || (i = this.lastType) == 1 || i == -100) {
                        NetworkManager.this.onNetworkChanged();
                    }
                } else if (activeNetworkInfo.getType() == 1) {
                    WifiManager wifiManager2 = (WifiManager) context.getSystemService("wifi");
                    WifiInfo connectionInfo2 = wifiManager2 != null ? WifiUtils.getConnectionInfo(wifiManager2) : null;
                    String ssid = connectionInfo2 != null ? connectionInfo2.getSSID() : null;
                    String str = this.lastSsid;
                    if (str == null || ssid == null || !ssid.equals(str)) {
                        NetworkManager.this.onNetworkChanged();
                    }
                    this.lastSsid = ssid;
                } else {
                    this.lastSsid = null;
                }
                this.lastType = this.thisType;
            } catch (Exception unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            ThreadPoolManager.executeIoTask(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.network.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14276a.lambda$onReceive$0(context);
                }
            });
        }
    }

    public interface NetworkListener {
        void onNetworkChanged();
    }

    private NetworkManager(Context context) {
        this.mAppContext = context;
        onStart();
    }

    public static NetworkManager getInstance() {
        synchronized (mLock) {
            try {
                if (sInstance == null) {
                    sInstance = new NetworkManager(MiJiaEnvironment.getAppContext());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNetworkChanged() {
        int i = 0;
        while (i < this.mNetworkListeners.size()) {
            try {
                this.mNetworkListeners.get(i).onNetworkChanged();
            } catch (Exception unused) {
                this.mNetworkListeners.remove(i);
                i--;
            }
            i++;
        }
    }

    public int getLastNetworkType() {
        NetworkBroadcastReceiver networkBroadcastReceiver = this.mNetworkReceiver;
        if (networkBroadcastReceiver != null) {
            return networkBroadcastReceiver.getLastType();
        }
        return -100;
    }

    public int getThisNetworkType() {
        NetworkBroadcastReceiver networkBroadcastReceiver = this.mNetworkReceiver;
        if (networkBroadcastReceiver != null) {
            return networkBroadcastReceiver.getThisType();
        }
        return -100;
    }

    public boolean isNetActiveAndAvailable() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mAppContext.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isWifi() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mAppContext.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    public void onStart() {
        NetworkBroadcastReceiver networkBroadcastReceiver = new NetworkBroadcastReceiver(this.mAppContext);
        this.mNetworkReceiver = networkBroadcastReceiver;
        this.mAppContext.registerReceiver(networkBroadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void registerListener(NetworkListener networkListener) {
        NetworkListener networkListener2;
        if (networkListener == null) {
            return;
        }
        int size = this.mNetworkListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                networkListener2 = this.mNetworkListeners.get(i);
            } catch (Exception e) {
                MiJiaLog.writeLogOnAll(LogType.GENERAL, "NetworkManager", "registerListener:" + e.getMessage());
                networkListener2 = null;
            }
            if (networkListener2 != null && networkListener2.equals(networkListener)) {
                return;
            }
        }
        this.mNetworkListeners.add(networkListener);
    }

    public void setAppContext(Context context) {
        this.mAppContext = context;
    }

    public void unregisterListener(NetworkListener networkListener) {
        if (networkListener == null) {
            return;
        }
        this.mNetworkListeners.remove(networkListener);
    }

    public static NetworkManager getInstance(Context context) {
        synchronized (mLock) {
            try {
                if (sInstance == null) {
                    sInstance = new NetworkManager(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sInstance;
    }
}
