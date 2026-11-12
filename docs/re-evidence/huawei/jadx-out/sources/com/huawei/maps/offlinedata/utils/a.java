package com.huawei.maps.offlinedata.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.maps.offlinedata.handler.dto.device.DeviceInfoRequest;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f18021a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f18022b = "";

    public static void a(Context context) {
        if (context == null) {
            g.d(CommonUtil.TAG, "context is null");
        }
        if (f18021a == null || context != null) {
            f18021a = context;
        }
    }

    public static Context b() {
        return f18021a;
    }

    public static String c() {
        return f18022b;
    }

    public static void a(String str) {
        f18022b = str;
    }

    public static int a() {
        String deviceInfo = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().getDeviceInfo(c());
        if (TextUtils.isEmpty(deviceInfo)) {
            g.c(CommonUtil.TAG, "checkDeviceStatus deviceInfo is empty");
            return -1;
        }
        int i = ((DeviceInfoRequest) d.a(deviceInfo, DeviceInfoRequest.class)).getStatus() == 2 ? 1 : 0;
        g.c(CommonUtil.TAG, "checkDeviceStatus deviceInfo is connected, status is " + i);
        return i;
    }
}
