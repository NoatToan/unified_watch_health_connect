package com.huawei.hms.network;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.network.httpclient.internal.IHttpClientBuilder;
import com.huawei.hms.network.restclient.internal.IRestClientBuilder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class NetworkKitProvider extends BaseProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14451a = "NetworkKitProvider";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f14452b = "com.huawei.hms.network.httpclient.DefaultNetworkKitProvider";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f14453c = new Object();
    private static volatile NetworkKitProvider d;

    private static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public abstract IHttpClientBuilder createHttpClientBuilder();

    public abstract NetworkKit createNetworkKit();

    public abstract IRestClientBuilder createRestClientBuilder();

    static NetworkKitProvider loadLocalProvider() {
        NetworkKitProvider networkKitProvider;
        synchronized (f14453c) {
            if (d == null) {
                b(NetworkKit.getContext(), new ArrayList());
            }
            networkKitProvider = d;
        }
        return networkKitProvider;
    }

    static NetworkKitProvider getEnableProvider(boolean z) {
        NetworkKitProvider networkKitProvider;
        if (!z) {
            NetworkKit.getInstance();
        }
        synchronized (f14453c) {
            if (d == null) {
                List<NetworkKitProvider> listA = a(NetworkKit.getContext());
                int iA = a(Version.getVersion());
                for (int size = listA.size() - 1; size >= 0; size--) {
                    NetworkKitProvider networkKitProvider2 = listA.get(size);
                    new PLSharedPreferences(NetworkKit.getContext(), RemoteInitializer.b.i).putString("kit_version", networkKitProvider2.getVersion());
                    if (networkKitProvider2.getApiLevel() < Version.getApi() || a(a(networkKitProvider2.getVersion()), iA) <= 0) {
                        listA.remove(size);
                    }
                }
                b(NetworkKit.getContext(), listA);
            }
            networkKitProvider = d;
        }
        return networkKitProvider;
    }

    public static NetworkKitProvider getEnableProvider() {
        return getEnableProvider(false);
    }

    private static void b(Context context, List<NetworkKitProvider> list) {
        if (list.size() == 0) {
            Logger.d(f14451a, "start load local");
            Logger.i(f14451a, "load local result is: " + a(context, list));
        }
        if (list.size() <= 0) {
            throw new IllegalStateException("Unable to find NetworkKitProvider provider, context: " + context.getPackageName());
        }
        d = list.get(0);
        Logger.i(f14451a, "provider client version code: %s, api level: %s", d.getVersion(), Integer.valueOf(d.getApiLevel()));
        DynamicLoaderHelper.getInstance().setDynamicStatus(d.isDynamicProvider());
        Logger.i(f14451a, "NetworkKitProvider is dynamic provider result : %s", Boolean.valueOf(d.isDynamicProvider()));
    }

    private static boolean a(List<NetworkKitProvider> list) {
        Context remoteContext = NetworkKit.getRemoteInitializer().getRemoteContext();
        if (remoteContext != null) {
            return a(remoteContext, list);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(Context context, List<NetworkKitProvider> list) {
        try {
            list.add(context.getClassLoader().loadClass(f14452b).asSubclass(NetworkKitProvider.class).getConstructor(new Class[0]).newInstance(new Object[0]));
            return true;
        } catch (Exception e) {
            Logger.e(f14451a, context.getPackageName() + " DefaultNetworkKitProvider not found", e);
            return false;
        }
    }

    private static List<NetworkKitProvider> a(Context context) {
        ArrayList arrayList = new ArrayList();
        Logger.i(f14451a, "load hms result is: %s", Boolean.valueOf(a(arrayList)));
        return new ArrayList(arrayList);
    }

    private static int a(String str) {
        if (str == null) {
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 4) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            try {
                String str2 = strArrSplit[i];
                if (Integer.parseInt(str2) <= 9 && (i == 1 || i == 2)) {
                    sb.append("0");
                }
                sb.append(str2);
            } catch (NumberFormatException unused) {
                Logger.e(f14451a, "getVersionNumber error " + str);
                return 0;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
