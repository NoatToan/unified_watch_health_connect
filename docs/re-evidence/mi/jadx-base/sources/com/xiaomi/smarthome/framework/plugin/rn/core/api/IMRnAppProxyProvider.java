package com.xiaomi.smarthome.framework.plugin.rn.core.api;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.smarthome.homeroom.model.Room;

/* JADX INFO: loaded from: classes2.dex */
public interface IMRnAppProxyProvider {
    void activeABTestByPath(String str);

    void deleteDevice(String str, int i, Callback callback);

    String getABTestConfigByPath(String str);

    void getDeviceIcon(int i, Callback callback);

    Home getHomeByDid(String str);

    Room getRoomByDid(String str);

    void getServerName(ReactApplicationContext reactApplicationContext, Callback callback);

    void setGatewayScene(String str, DeviceStat deviceStat, int i, String str2, Callback callback);
}
