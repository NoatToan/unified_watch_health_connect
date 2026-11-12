package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public interface IMIOTPackage {
    void apiReport(ReadableMap readableMap);

    void entry(Callback callback);

    void exit(boolean z, Callback callback);

    WritableMap getPluginAppConfigValueForKey(String str);

    void installModule(String str, Callback callback);

    void notifyCation(String str, String str2, String str3);

    void onDeventJs(int i, ReadableMap readableMap);

    void onPackageLifecycle(String str, String str2);

    void setExitInfo(String str, Dynamic dynamic);
}
