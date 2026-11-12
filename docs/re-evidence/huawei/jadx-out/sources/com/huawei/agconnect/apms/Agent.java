package com.huawei.agconnect.apms;

import android.content.Context;
import com.huawei.agconnect.apms.collect.model.basic.ApplicationInformation;
import com.huawei.agconnect.apms.collect.model.basic.DeviceInformation;
import com.huawei.agconnect.apms.collect.model.basic.PlatformInformation;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.basic.UserSettingsInformation;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class Agent {
    private static final Object IMPL_LOCK;
    public static final String NAME = "AndroidAgent";
    private static final ijk NOOP_AGENT_IMPL;
    public static final String OS_NAME = "Android";
    public static final String VERSION = "1.4.4.504";
    private static ExecutorService executor;
    private static ijk impl;

    static {
        n nVar = new n();
        NOOP_AGENT_IMPL = nVar;
        impl = nVar;
        IMPL_LOCK = new Object();
        executor = Executors.newSingleThreadExecutor(new m("ApmsAgent"));
    }

    public static void disableAppVersions(String str) {
        getImpl().abc(str);
    }

    public static void enableAnrMonitor(boolean z) {
        getImpl().fgh(z);
    }

    public static void enableCollection(boolean z) {
        getImpl().def(z);
    }

    public static void enableCollectionByUser(boolean z) {
        getImpl().cde(z);
    }

    public static void enableFpsDropTracer(boolean z) {
        getImpl().abc(z);
    }

    public static void enableNuwaTracer(boolean z) {
        getImpl().efg(z);
    }

    public static void enableWebViewMonitor(boolean z) {
        getImpl().bcd(z);
    }

    public static hij getAgentConfiguration() {
        return getImpl().nop();
    }

    public static ApplicationInformation getApplicationInformation() {
        return getImpl().opq();
    }

    public static Context getContext() {
        return getImpl().ijk();
    }

    public static long getCreateTime() {
        return getImpl().abc();
    }

    public static DeviceInformation getDeviceInformation() {
        return getImpl().def();
    }

    public static ExecutorService getExecutor() {
        return executor;
    }

    private static ijk getImpl() {
        ijk ijkVar;
        synchronized (IMPL_LOCK) {
            ijkVar = impl;
        }
        return ijkVar;
    }

    public static PlatformInformation getPlatformInformation() {
        return getImpl().ghi();
    }

    public static RuntimeEnvInformation getRuntimeEnvInformation() {
        return getImpl().cde();
    }

    public static String getUserIdentifier() {
        return getImpl().hij();
    }

    public static UserSettingsInformation getUserSettingsInformation() {
        return getImpl().lmn();
    }

    public static String getVersion() {
        return VERSION;
    }

    public static boolean isDisabled() {
        return getImpl().bcd();
    }

    public static boolean isNuwaTracerEnable() {
        return getImpl().fgh();
    }

    public static boolean isWebViewMonitorDisabled() {
        return getImpl().pqr();
    }

    public static void onEvent(String str, Map<String, String> map) {
        getImpl().abc(str, map);
    }

    public static void onReport() {
        getImpl().klm();
    }

    public static void setFpsDropCount(int i) {
        getImpl().abc(i);
    }

    public static void setImpl(ijk ijkVar) {
        synchronized (IMPL_LOCK) {
            try {
                if (ijkVar == null) {
                    impl = NOOP_AGENT_IMPL;
                } else {
                    impl = ijkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setUserIdentifier(String str) {
        getImpl().bcd(str);
    }

    public static void start() {
        getImpl().start();
    }

    public static void startCollectCpuAndMemoryData(int i) {
        getImpl().bcd(i);
    }

    public static String stopCollectCpuAndMemoryData() {
        return getImpl().efg();
    }
}
