package com.huawei.hms.network.base.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.huawei.hms.framework.common.ContextCompat;
import com.huawei.hms.framework.common.Logger;

/* JADX INFO: loaded from: classes34.dex */
public class RequestMobileNetwork {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14513a = "RequestMobileNetwork";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f14514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f14515c = new Object();
    private static ConnectivityManager.NetworkCallback d;

    public static void stopMobileNetwork(Context context) {
        synchronized (RequestMobileNetwork.class) {
            if (d != null) {
                ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback(d);
                d = null;
            }
        }
    }

    public static String requestMobileNiName(Context context, int i) {
        synchronized (RequestMobileNetwork.class) {
            if (!ContextCompat.checkSelfPermission(context, "android.permission.CHANGE_NETWORK_STATE")) {
                return null;
            }
            final ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
            f14514b = "";
            if (d == null) {
                d = new ConnectivityManager.NetworkCallback() { // from class: com.huawei.hms.network.base.util.RequestMobileNetwork.1
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onUnavailable() {
                        super.onUnavailable();
                        synchronized (RequestMobileNetwork.f14515c) {
                            RequestMobileNetwork.f14515c.notify();
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onAvailable(Network network) {
                        super.onAvailable(network);
                        String unused = RequestMobileNetwork.f14514b = connectivityManager.getLinkProperties(network).getInterfaceName();
                        synchronized (RequestMobileNetwork.f14515c) {
                            RequestMobileNetwork.f14515c.notify();
                        }
                    }
                };
            }
            connectivityManager.requestNetwork(networkRequestBuild, d);
            try {
                Object obj = f14515c;
                synchronized (obj) {
                    obj.wait(i);
                }
            } catch (InterruptedException e) {
                Logger.w(f14513a, e.getMessage());
            }
            return f14514b;
        }
    }
}
