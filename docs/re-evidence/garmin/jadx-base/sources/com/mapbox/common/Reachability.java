package com.mapbox.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class Reachability implements ReachabilityInterface {
    private ConnectionChangeCallback callback;
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private final String hostname;
    private final ReachabilityOfflineSwitchObserver offlineObserver;
    public int peer;
    public final String TAG = "MapboxReachability";
    public int timeoutInMs = 200;
    private final Map<Long, ReachabilityChanged> listeners = new ConcurrentHashMap();
    private NetworkStatus currentStatus = NetworkStatus.NOT_REACHABLE;
    private boolean networkConnected = true;
    private boolean publish = false;

    public class ReachabilityOfflineSwitchObserver implements OfflineSwitchObserver {
        private ReachabilityOfflineSwitchObserver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$statusChanged$0(boolean z14) {
            Reachability.this.setNetworkConnected(z14);
            Reachability.this.onNetworkChanged();
        }

        @Override // com.mapbox.common.OfflineSwitchObserver
        public void statusChanged(boolean z14) {
            boolean z15 = Looper.myLooper() == Looper.getMainLooper();
            e eVar = new e(this, z14, 0);
            if (z15) {
                eVar.run();
            } else {
                new Handler(Looper.getMainLooper()).post(eVar);
            }
        }
    }

    public Reachability(String str) {
        Context context = MapboxSDKCommon.INSTANCE.getContext();
        this.context = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.connectivityManager = connectivityManager;
        this.callback = null;
        if (connectivityManager == null) {
            h.q("This Android platform doesn't have Connectivity Service");
            throw null;
        }
        this.hostname = str;
        if (a7.b.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addCapability(16).build();
            Log.info("Application permission for ACCESS_NETWORK_STATE granted", "MapboxReachability");
            ConnectionChangeCallback connectionChangeCallback = new ConnectionChangeCallback(this);
            try {
                connectivityManager.registerNetworkCallback(networkRequestBuild, connectionChangeCallback);
                this.callback = connectionChangeCallback;
            } catch (RuntimeException e4) {
                Log.error("Failed to subscribe to network connectivity changes: " + e4.getMessage(), "MapboxReachability");
            }
        } else {
            Log.warning("Couldn't get application permission for ACCESS_NETWORK_STATE", "MapboxReachability");
        }
        ReachabilityOfflineSwitchObserver reachabilityOfflineSwitchObserver = new ReachabilityOfflineSwitchObserver();
        this.offlineObserver = reachabilityOfflineSwitchObserver;
        OfflineSwitch.getInstance().registerObserver(reachabilityOfflineSwitchObserver);
        onNetworkChanged();
    }

    public static ReachabilityInterface createPlatformReachability(String str) {
        return new Reachability(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setNetworkConnected(boolean z14) {
        this.networkConnected = z14;
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized long addListener(ReachabilityChanged reachabilityChanged) {
        long newId;
        newId = IdGenerator.getNewId();
        this.listeners.put(Long.valueOf(newId), reachabilityChanged);
        reachabilityChanged.run(this.currentStatus);
        this.publish = true;
        return newId;
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized NetworkStatus currentNetworkStatus() {
        return this.currentStatus;
    }

    public void finalize() {
        OfflineSwitch.getInstance().unregisterObserver(this.offlineObserver);
        try {
            ConnectionChangeCallback connectionChangeCallback = this.callback;
            if (connectionChangeCallback != null) {
                this.connectivityManager.unregisterNetworkCallback(connectionChangeCallback);
            }
            super.finalize();
        } catch (Throwable th3) {
            Log.error(th3.toString(), "MapboxReachability");
        }
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized boolean isReachable() {
        boolean z14 = false;
        if (!this.networkConnected) {
            return false;
        }
        String str = this.hostname;
        if (str == null || str.isEmpty()) {
            if (a7.b.checkSelfPermission(this.context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                try {
                    ConnectivityManager connectivityManager = this.connectivityManager;
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                        z14 = true;
                    }
                    return z14;
                } catch (RuntimeException e4) {
                    Log.error("ConnectivityManager interaction failed with exception: " + e4.getMessage(), "MapboxReachability");
                }
            }
            return false;
        }
        try {
            return InetAddress.getByName(this.hostname).isReachable(this.timeoutInMs);
        } catch (IOException e14) {
            Log.warning("Network error. " + e14.getMessage(), "MapboxReachability");
            return false;
        } catch (IllegalArgumentException e15) {
            Log.warning("Bad timeout. " + e15.getMessage(), "MapboxReachability");
            return false;
        }
        throw th;
    }

    public synchronized void onNetworkChanged() {
        NetworkStatus networkStatus = this.currentStatus;
        this.currentStatus = NetworkStatus.NOT_REACHABLE;
        if (this.networkConnected) {
            if (a7.b.checkSelfPermission(this.context, "android.permission.ACCESS_NETWORK_STATE") == -1) {
                Log.warning("Unable to get application permission for ACCESS_NETWORK_STATE", "MapboxReachability");
                return;
            }
            try {
                ConnectivityManager connectivityManager = this.connectivityManager;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        this.currentStatus = NetworkStatus.REACHABLE_VIA_WI_FI;
                    } else if (networkCapabilities.hasTransport(0)) {
                        this.currentStatus = NetworkStatus.REACHABLE_VIA_WWAN;
                    } else if (networkCapabilities.hasTransport(3)) {
                        this.currentStatus = NetworkStatus.REACHABLE_VIA_ETHERNET;
                    }
                }
            } catch (RuntimeException e4) {
                Log.error("ConnectivityManager interaction failed with exception: " + e4.getMessage(), "MapboxReachability");
                return;
            }
        }
        if (this.publish && networkStatus != this.currentStatus) {
            Iterator<ReachabilityChanged> it = this.listeners.values().iterator();
            while (it.hasNext()) {
                it.next().run(this.currentStatus);
            }
        }
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized boolean removeListener(long j8) {
        try {
            this.listeners.remove(Long.valueOf(j8));
            if (this.listeners.isEmpty()) {
                this.publish = false;
            }
        } catch (Exception unused) {
            return false;
        }
        return true;
    }
}
