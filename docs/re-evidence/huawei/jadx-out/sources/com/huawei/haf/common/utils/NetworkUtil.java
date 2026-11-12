package com.huawei.haf.common.utils;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f5923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f5924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Boolean f5925c;
    private static final WeakHashMap<ConnectivityManager.NetworkCallback, Object> d = new WeakHashMap<>();
    private static ConnectivityManager e;
    private static volatile Boolean f;
    private static volatile Boolean g;
    private static volatile ConnectivityManager.NetworkCallback i;

    static {
        m();
    }

    private static ConnectivityManager o() {
        ConnectivityManager connectivityManager = e;
        if (connectivityManager != null) {
            return connectivityManager;
        }
        ConnectivityManager connectivityManagerN = CommonUtils.n();
        e = connectivityManagerN;
        return connectivityManagerN;
    }

    private NetworkUtil() {
    }

    public static void d(ConnectivityManager.NetworkCallback networkCallback) {
        if (networkCallback == null) {
            return;
        }
        WeakHashMap<ConnectivityManager.NetworkCallback, Object> weakHashMap = d;
        synchronized (weakHashMap) {
            RuntimeException runtimeExceptionM = m();
            if (runtimeExceptionM != null) {
                throw runtimeExceptionM;
            }
            weakHashMap.put(networkCallback, Boolean.TRUE);
            LogUtil.b("HAF_NetworkUtil", "registerNetworkCallback size=", Integer.valueOf(weakHashMap.size()));
        }
    }

    public static void e(ConnectivityManager.NetworkCallback networkCallback) {
        if (networkCallback == null) {
            return;
        }
        WeakHashMap<ConnectivityManager.NetworkCallback, Object> weakHashMap = d;
        synchronized (weakHashMap) {
            weakHashMap.remove(networkCallback);
        }
    }

    public static boolean i() {
        return f() || k() || j() || n();
    }

    public static boolean h() {
        return i();
    }

    public static boolean f() {
        if (f5924b != null) {
            return f5924b.booleanValue();
        }
        try {
            NetworkCapabilities networkCapabilities = o().getNetworkCapabilities(o().getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16) && networkCapabilities.hasTransport(0);
        } catch (SecurityException e2) {
            ReleaseLogUtil.b("HAF_NetworkUtil", "isMobileConnected getNetworkCapabilities fail: ", LogUtil.c(e2));
            NetworkInfo activeNetworkInfo = o().getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
        }
    }

    public static boolean k() {
        if (g != null) {
            return g.booleanValue();
        }
        try {
            NetworkCapabilities networkCapabilities = o().getNetworkCapabilities(o().getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16) && networkCapabilities.hasTransport(1);
        } catch (SecurityException e2) {
            ReleaseLogUtil.b("HAF_NetworkUtil", "isWifiConnected getNetworkCapabilities fail: ", LogUtil.c(e2));
            NetworkInfo activeNetworkInfo = o().getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
        }
    }

    public static boolean j() {
        if (f != null) {
            return f.booleanValue();
        }
        try {
            NetworkCapabilities networkCapabilities = o().getNetworkCapabilities(o().getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16) && networkCapabilities.hasTransport(4);
        } catch (SecurityException e2) {
            ReleaseLogUtil.b("HAF_NetworkUtil", "isVpnConnected getNetworkCapabilities fail: ", LogUtil.c(e2));
            NetworkInfo activeNetworkInfo = o().getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.getType() == 17;
        }
    }

    private static boolean n() {
        if (f5923a != null) {
            return f5923a.booleanValue();
        }
        try {
            NetworkCapabilities networkCapabilities = o().getNetworkCapabilities(o().getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16) && c(networkCapabilities);
        } catch (SecurityException e2) {
            ReleaseLogUtil.b("HAF_NetworkUtil", "isOtherConnected getNetworkCapabilities fail: ", LogUtil.c(e2));
            NetworkInfo activeNetworkInfo = o().getActiveNetworkInfo();
            return activeNetworkInfo != null && b(activeNetworkInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(NetworkCapabilities networkCapabilities) {
        boolean z = networkCapabilities.hasTransport(2) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(5);
        if (Build.VERSION.SDK_INT >= 27) {
            return z || networkCapabilities.hasTransport(6);
        }
        return z;
    }

    private static boolean b(NetworkInfo networkInfo) {
        int type = networkInfo.getType();
        return type == 6 || type == 7 || type == 9 || type == 8 || type == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<ConnectivityManager.NetworkCallback> l() {
        List<ConnectivityManager.NetworkCallback> arrayList = Collections.EMPTY_LIST;
        WeakHashMap<ConnectivityManager.NetworkCallback, Object> weakHashMap = d;
        synchronized (weakHashMap) {
            if (!weakHashMap.isEmpty()) {
                arrayList = new ArrayList<>(weakHashMap.keySet());
            }
        }
        return arrayList;
    }

    private static RuntimeException m() {
        if (i != null) {
            return null;
        }
        try {
            NetworkCallbackAdpter networkCallbackAdpter = new NetworkCallbackAdpter();
            o().registerDefaultNetworkCallback(networkCallbackAdpter);
            i = networkCallbackAdpter;
            ReleaseLogUtil.c("HAF_NetworkUtil", "registerDefaultNetworkCallback is success.");
            return null;
        } catch (Exception e2) {
            ReleaseLogUtil.c("HAF_NetworkUtil", "registerDefaultNetworkCallback fail, downgrade process, ex=", LogUtil.c(e2));
            if (e2 instanceof RuntimeException) {
                return (RuntimeException) e2;
            }
            return null;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class NetworkCallbackAdpter extends ConnectivityManager.NetworkCallback {
        private NetworkCallbackAdpter() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            Iterator it = NetworkUtil.l().iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            super.onLosing(network, i);
            Iterator it = NetworkUtil.l().iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onLosing(network, i);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            b(network);
            Iterator it = NetworkUtil.l().iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            Iterator it = NetworkUtil.l().iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            d(network, networkCapabilities);
            Iterator it = NetworkUtil.l().iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            super.onLinkPropertiesChanged(network, linkProperties);
            Iterator it = NetworkUtil.l().iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onLinkPropertiesChanged(network, linkProperties);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
            super.onBlockedStatusChanged(network, z);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = NetworkUtil.l().iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onBlockedStatusChanged(network, z);
                }
            }
        }

        private void d(Network network, NetworkCapabilities networkCapabilities) {
            Boolean bool = NetworkUtil.f5924b;
            Boolean unused = NetworkUtil.f5924b = Boolean.valueOf(networkCapabilities.hasTransport(0));
            boolean zEquals = NetworkUtil.f5924b.equals(bool);
            Boolean bool2 = NetworkUtil.g;
            Boolean unused2 = NetworkUtil.g = Boolean.valueOf(networkCapabilities.hasTransport(1));
            boolean z = (zEquals && NetworkUtil.g.equals(bool2)) ? false : true;
            Boolean bool3 = NetworkUtil.f;
            Boolean unused3 = NetworkUtil.f = Boolean.valueOf(networkCapabilities.hasTransport(4));
            boolean z2 = z || !NetworkUtil.f.equals(bool3);
            Boolean bool4 = NetworkUtil.f5923a;
            Boolean unused4 = NetworkUtil.f5923a = Boolean.valueOf(NetworkUtil.c(networkCapabilities));
            boolean z3 = z2 || !NetworkUtil.f5923a.equals(bool4);
            Boolean bool5 = NetworkUtil.f5925c;
            Boolean unused5 = NetworkUtil.f5925c = Boolean.valueOf(networkCapabilities.hasCapability(16));
            if (z3 || !NetworkUtil.f5925c.equals(bool5)) {
                ReleaseLogUtil.c("HAF_NetworkUtil", "network available: mobile=", NetworkUtil.f5924b, ", wifi=", NetworkUtil.g, ", vpn=", NetworkUtil.f, ", other=", NetworkUtil.f5923a, ", network=", network, ", internet=", Boolean.valueOf(networkCapabilities.hasCapability(12)), ", validated=", NetworkUtil.f5925c);
            }
        }

        private void b(Network network) {
            ReleaseLogUtil.c("HAF_NetworkUtil", "network lost: network=", network);
            Boolean unused = NetworkUtil.f5924b = false;
            Boolean unused2 = NetworkUtil.g = false;
            Boolean unused3 = NetworkUtil.f = false;
            Boolean unused4 = NetworkUtil.f5923a = false;
            Boolean unused5 = NetworkUtil.f5925c = false;
        }
    }
}
