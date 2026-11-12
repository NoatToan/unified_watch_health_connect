package com.xiaomi.hm.health.device.watch_skin;

import android.text.TextUtils;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class WatchSkinUtils {
    private static final Lazy<DeviceManagerApi> a = KoinJavaComponent.inject(DeviceManagerApi.class);

    public static boolean a(int i) {
        return i == 4 || i == 5 || i == 6 || i == 2 || i == 8 || i == 7;
    }

    public static int getWatchfaceType(HMDeviceSource hMDeviceSource) {
        if (HMDeviceConfig.hasFeatureTempoWatchFace(hMDeviceSource)) {
            return 1;
        }
        if (HMDeviceConfig.hasFeaturePeytoWatchFace(hMDeviceSource)) {
            return 0;
        }
        if (ConfigHelperKt.hasFeature(Feature.CINCO_SERIES_S, hMDeviceSource)) {
            return 2;
        }
        if (HMDeviceSource.MILI_PEYTO_L == hMDeviceSource || HMDeviceSource.MILI_PEYTO_WL == hMDeviceSource) {
            return 3;
        }
        if (HMDeviceConfig.isPYHSeries(hMDeviceSource)) {
            return 4;
        }
        if (HMDeviceConfig.isFalconSeries(hMDeviceSource)) {
            return 5;
        }
        if (HMDeviceConfig.isHawkSeries(hMDeviceSource)) {
            return 6;
        }
        if (ConfigHelperKt.hasFeature(Feature.KESTREL_SERIES_S, hMDeviceSource)) {
            return 7;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_ATHENS) {
            return 8;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_VULTURE) {
            return 9;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_ONYX || hMDeviceSource == HMDeviceSource.MILI_ONYX_W) {
            return 10;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_CORSICA || hMDeviceSource == HMDeviceSource.MILI_CORSICA_W) {
            return 11;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_VENICE || hMDeviceSource == HMDeviceSource.MILI_VENICE_W || hMDeviceSource == HMDeviceSource.MILI_LONDON || hMDeviceSource == HMDeviceSource.MILI_LONDON_W) {
            return 17;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_ANETO) {
            return 12;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_NEWTON || hMDeviceSource == HMDeviceSource.MILI_NEWTON_W) {
            return 15;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_LINCS || hMDeviceSource == HMDeviceSource.MILI_LINCS_W) {
            return 14;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_PRAGUE || hMDeviceSource == HMDeviceSource.MILI_PRAGUE_W) {
            return 16;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_YORK) {
            return 18;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_VOLGA || hMDeviceSource == HMDeviceSource.MILI_VOLGA_W) {
            return 19;
        }
        return ConfigHelperKt.hasFeature(Feature.KONGMING_SERIES_S, hMDeviceSource) ? 20 : -1;
    }

    public static String getWatchfaceUrl(HMDeviceSource hMDeviceSource) {
        if (HMDeviceSource.MILI_TONLESAP == hMDeviceSource || HMDeviceSource.MILI_TONLESAP_L == hMDeviceSource || HMDeviceSource.MILI_TONLESAP_O == hMDeviceSource || HMDeviceSource.MILI_TONLESAP_OL == hMDeviceSource) {
            return HMServerDef.getUrl(WatchSkinConstant.URL_FOR_TONLESAP);
        }
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_DTH;
        if (hMDeviceSource2 == hMDeviceSource || HMDeviceSource.MILI_DTH_W == hMDeviceSource) {
            return hMDeviceSource2 == hMDeviceSource ? HMServerDef.getUrl(WatchSkinConstant.URL_FOR_DTH) : HMServerDef.getUrl(WatchSkinConstant.URL_FOR_DTH_W);
        }
        HMDeviceSource hMDeviceSource3 = HMDeviceSource.MILI_BEATS;
        if (hMDeviceSource3 == hMDeviceSource || HMDeviceSource.MILI_BEATS_P == hMDeviceSource || HMDeviceSource.MILI_BEATS_W == hMDeviceSource) {
            if (hMDeviceSource3 == hMDeviceSource) {
                return HMServerDef.getUrl(WatchSkinConstant.URL_FOR_BEATS);
            }
            return HMDeviceSource.MILI_BEATS_W == hMDeviceSource ? HMServerDef.getUrl(WatchSkinConstant.URL_FOR_BEATS_W) : HMServerDef.getUrl(WatchSkinConstant.URL_FOR_BEATS_P);
        }
        if (getWatchfaceType(hMDeviceSource) == 0) {
            return HMServerDef.getUrl(WatchSkinConstant.URL);
        }
        if (HMDeviceSource.MILI_CINCO == hMDeviceSource) {
            return HMServerDef.getUrl(WatchSkinConstant.URL_FOR_CINCO);
        }
        if (HMDeviceSource.MILI_CINCO_L == hMDeviceSource) {
            return HMServerDef.getUrl(WatchSkinConstant.URL_FOR_CINCO_L);
        }
        if (HMDeviceSource.MILI_PEYTO_L == hMDeviceSource) {
            return HMServerDef.getUrl(WatchSkinConstant.URL_FOR_CH_L);
        }
        return HMDeviceSource.MILI_PEYTO_WL == hMDeviceSource ? HMServerDef.getUrl(WatchSkinConstant.URL_FOR_CH_L) : HMServerDef.getUrl(WatchSkinConstant.URL_FOR_TEMPO);
    }

    public static boolean isFwSupport(HMDeviceSource hMDeviceSource, String str) {
        DeviceInfo deviceInfo;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        HMBaseDevice device = a.getValue().getDevice(hMDeviceSource.getType());
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return false;
        }
        int firmwareVersion = deviceInfo.getFirmwareVersion();
        int versionCodeFromVersionName = ProfileUtils.getVersionCodeFromVersionName(str);
        return versionCodeFromVersionName == -1 || firmwareVersion >= versionCodeFromVersionName;
    }
}
