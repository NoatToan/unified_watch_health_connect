package com.huawei.hms.network.embedded;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PackageManagerCompat;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes34.dex */
public final class m4 {
    public static final String e = "NetSerManager";
    public static final String f = "networkservice_";
    public static final String h = "networkservice_config";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PolicyNetworkService f15081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f15082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ConcurrentHashMap<String, NetworkService> f15083c = new ConcurrentHashMap<>(8);
    public n4 d;
    public static final m4 g = new m4();
    public static final List<String> i = Collections.unmodifiableList(Arrays.asList("core_switch_dns", "core_switch_config"));

    public void d(String str) {
        if (str == null || !this.f15083c.containsKey(str)) {
            return;
        }
        this.f15083c.remove(str);
    }

    public Boolean c(String str) {
        return Boolean.valueOf(this.d.b(str));
    }

    public void b() {
        this.f15083c.clear();
    }

    public NetworkService b(String str) {
        return this.f15083c.get(str);
    }

    public void a(PolicyNetworkService policyNetworkService) {
        synchronized (this) {
            if (this.f15082b == null) {
                return;
            }
            for (String str : NetworkService.Constants.NETWORK_SERVICES) {
                NetworkService networkServiceB = b(str);
                if (networkServiceB != null) {
                    Logger.i(e, str + "Service,setOptions:");
                    networkServiceB.serviceOptions(policyNetworkService.getValues("", (String[]) PolicyNetworkService.GlobalConstants.GLOBAL_CONSTANTS.toArray(new String[0])));
                }
            }
        }
    }

    public void a(Context context, String str, Bundle bundle) {
        synchronized (this) {
            this.f15082b = context;
            this.d = new n4(str);
            Map<String, String> mapA = a(context, bundle);
            this.d.a();
            if (!mapA.isEmpty()) {
                for (Map.Entry<String, String> entry : mapA.entrySet()) {
                    String key = entry.getKey();
                    String str2 = PolicyNetworkService.NETWORK_SWITCH_CONFIG_PRE + key;
                    if (i.contains(str2) || this.d.b(str2)) {
                        NetworkService networkServiceB = b(context, entry.getValue(), bundle);
                        if (networkServiceB != null) {
                            this.f15083c.put(key, networkServiceB);
                        }
                    }
                }
            }
            Logger.i(e, "networkServices map is: " + this.f15083c);
        }
    }

    public List<NetworkService> a() {
        return new ArrayList(this.f15083c.values());
    }

    public Boolean a(String str) {
        return this.d.a(str);
    }

    public static m4 c() {
        return g;
    }

    private NetworkService b(Context context, String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(e, "networkService classPath is null");
            return null;
        }
        try {
            ClassLoader classLoader = m4.class.getClassLoader();
            if (classLoader != null) {
                NetworkService networkService = (NetworkService) classLoader.loadClass(str).asSubclass(NetworkService.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                networkService.onCreate(context, bundle);
                return networkService;
            }
        } catch (Throwable unused) {
            Logger.w(e, "network service load failed");
        }
        return null;
    }

    private Map<String, String> a(Context context, Bundle bundle) {
        NetworkService networkServiceB = b(context, PackageManagerCompat.getMetaDataFromKitOrApp(context, h, ""), bundle);
        if (!(networkServiceB instanceof PolicyNetworkService)) {
            throw new IllegalStateException("configPolicyService is error");
        }
        this.f15081a = (PolicyNetworkService) networkServiceB;
        this.f15083c.put(NetworkService.Constants.CONFIG_SERVICE, this.f15081a);
        Map<String, String> metaDataMapFromKitOrApp = PackageManagerCompat.getMetaDataMapFromKitOrApp(context, f);
        if (!metaDataMapFromKitOrApp.isEmpty() && metaDataMapFromKitOrApp.containsKey(NetworkService.Constants.CONFIG_SERVICE)) {
            metaDataMapFromKitOrApp.remove(NetworkService.Constants.CONFIG_SERVICE);
        }
        return metaDataMapFromKitOrApp;
    }
}
