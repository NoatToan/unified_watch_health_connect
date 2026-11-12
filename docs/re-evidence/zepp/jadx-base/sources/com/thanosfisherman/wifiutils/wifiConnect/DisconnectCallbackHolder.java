package com.thanosfisherman.wifiutils.wifiConnect;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.thanosfisherman.wifiutils.WifiUtils;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(29)
public class DisconnectCallbackHolder {

    @Nullable
    private static volatile DisconnectCallbackHolder e;

    @Nullable
    private ConnectivityManager.NetworkCallback a;

    @Nullable
    private ConnectivityManager b;
    private boolean c;
    private boolean d;

    private DisconnectCallbackHolder() {
    }

    public static DisconnectCallbackHolder getInstance() {
        if (e == null) {
            synchronized (DisconnectCallbackHolder.class) {
                if (e == null) {
                    e = new DisconnectCallbackHolder();
                }
            }
        }
        return e;
    }

    public void addNetworkCallback(@NonNull ConnectivityManager.NetworkCallback networkCallback, @NonNull ConnectivityManager connectivityManager) {
        this.a = networkCallback;
        this.b = connectivityManager;
        this.c = true;
    }

    public void bindProcessToNetwork(@NonNull Network network) {
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager == null) {
            WifiUtils.wifiLog("ConnectivityManager is null. Did you call addNetworkCallback method first?");
        } else {
            connectivityManager.bindProcessToNetwork(network);
            this.d = true;
        }
    }

    public void disconnect() {
        if (this.a == null || this.b == null) {
            return;
        }
        WifiUtils.wifiLog("Disconnecting on Android 10+");
        this.b.unregisterNetworkCallback(this.a);
        this.a = null;
        this.c = false;
    }

    public boolean isNetworkcallbackAdded() {
        return this.c;
    }

    public boolean isProcessBoundToNetwork() {
        return this.d;
    }

    public void requestNetwork(NetworkRequest networkRequest) {
        ConnectivityManager connectivityManager;
        ConnectivityManager.NetworkCallback networkCallback = this.a;
        if (networkCallback == null || (connectivityManager = this.b) == null) {
            WifiUtils.wifiLog("NetworkCallback has not been added yet. Please call addNetworkCallback method first");
        } else {
            connectivityManager.requestNetwork(networkRequest, networkCallback);
        }
    }

    public void unbindProcessFromNetwork() {
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager == null) {
            WifiUtils.wifiLog("ConnectivityManager is null. Did you call addNetworkCallback method first?");
        } else {
            connectivityManager.bindProcessToNetwork(null);
            this.d = false;
        }
    }
}
