package com.xiaomi.hm.health.bt;

import android.content.Context;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.debug.IFileLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.IDeviceFeature;
import com.xiaomi.hm.health.bt.device.mozart.MozartFirmwareUpdater;
import com.xiaomi.hm.health.bt.proxy.BTNameCallback;
import com.xiaomi.hm.health.bt.proxy.ProxyContainer;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class HMBleModule {
    private static ISBEListener a;
    private static Set<HMDeviceSource> b;
    private static HashMap<String, HMDeviceSource> c;

    public static void enableFileLogger(IFileLog fileLog) {
        Debug.enableOuterLog(fileLog);
    }

    public static HashMap<String, HMDeviceSource> getRegexMap() {
        return c;
    }

    public static synchronized ISBEListener getSBEListener() {
        return a;
    }

    public static Set<HMDeviceSource> getSupportBindDeviceSource() {
        return b;
    }

    public static void init(Context context, boolean log, String logDir, BTNameCallback callback) {
        BluetoothContext.setContext(context.getApplicationContext());
        BleScanCenter.init(context);
        MozartFirmwareUpdater.setPrintSdkLog(log);
        Debug.enable(log, true, logDir);
        ProxyContainer.setProxy(callback);
    }

    public static void setAppId(byte appId) {
        HMBleConfig.APP_ID = appId;
    }

    public static void setDeviceFeature(IDeviceFeature deviceFeature) {
        ProxyContainer.setDeviceFeature(deviceFeature);
    }

    public static void setRegexMap(HashMap<String, HMDeviceSource> regexMap) {
        c = regexMap;
    }

    public static synchronized void setSBEListener(ISBEListener listener) {
        a = listener;
    }

    public static void setServerSign(boolean enable) {
        HMBleConfig.SUPPORT_NEW_AUTH = enable;
    }

    public static void setSupportBindDeviceSource(Set<HMDeviceSource> supportBindDeviceSource) {
        b = supportBindDeviceSource;
    }

    public static void supportDfuConfig(boolean support) {
        HMBleConfig.SUPPORT_GET_DFU_CONFIG = support;
    }
}
