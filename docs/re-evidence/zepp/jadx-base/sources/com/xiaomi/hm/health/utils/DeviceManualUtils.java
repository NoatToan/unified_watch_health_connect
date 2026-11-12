package com.xiaomi.hm.health.utils;

import android.app.Activity;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.web.service.WebItem;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.HardwareInfo;
import com.xiaomi.hm.health.device.cincoentrance.CincoEntranceHelperKt;
import com.xiaomi.hm.health.discovery.WebHelper;

/* JADX INFO: loaded from: classes22.dex */
public class DeviceManualUtils {
    private static final String a = "t/mifit.play.watch.%1$s";

    public static String getDeviceManualFaqUrlByDeviceSource(HMDeviceSource hMDeviceSource) {
        return HMServerDef.getHost() + String.format(a, String.valueOf(hMDeviceSource.getValue()));
    }

    public static void showDeviceManual(Activity activity, HMDeviceSource hMDeviceSource) {
        if (hMDeviceSource == HMDeviceSource.MILI_CINCO && !HardwareInfo.isMiliCincoMainLand(CincoEntranceHelperKt.getHardwareVersion())) {
            hMDeviceSource = HMDeviceSource.MILI_CINCO_L;
        }
        WebItem webItem = new WebItem(getDeviceManualFaqUrlByDeviceSource(hMDeviceSource));
        webItem.isShowMore = false;
        WebHelper.launch(webItem);
    }
}
