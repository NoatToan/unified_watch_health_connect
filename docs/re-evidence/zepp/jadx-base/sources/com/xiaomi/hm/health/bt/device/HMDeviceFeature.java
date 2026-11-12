package com.xiaomi.hm.health.bt.device;

import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.proxy.ProxyContainer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HMDeviceFeature {
    public static List<HMDeviceSource> MULTI_ACTIVITY_GOAL_DEVICE;
    public static List<HMDeviceSource> SET_LANGUAGE_S;
    public static List<HMDeviceSource> TIMEX_DEVICE;
    private static HMDeviceSource[] a;
    private static final HMDeviceSource[] b;
    private static final HMDeviceSource[] c;

    static {
        HMDeviceSource hMDeviceSource = HMDeviceSource.TIMEX_SIMPLY_GPS;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.TIMEX_CROSS_FIT_ENTRY;
        HMDeviceSource hMDeviceSource3 = HMDeviceSource.TIMEX_CROSS_FIT_GPS;
        HMDeviceSource hMDeviceSource4 = HMDeviceSource.TIMEX_HEARTFIT_ZONE;
        TIMEX_DEVICE = Arrays.asList(hMDeviceSource, hMDeviceSource2, hMDeviceSource3, hMDeviceSource4);
        HMDeviceSource hMDeviceSource5 = HMDeviceSource.MILI_ATHENS;
        HMDeviceSource hMDeviceSource6 = HMDeviceSource.TIMEX_FALCON;
        HMDeviceSource hMDeviceSource7 = HMDeviceSource.TIMEX_HAWK;
        HMDeviceSource hMDeviceSource8 = HMDeviceSource.TIMEX_KESTREL;
        MULTI_ACTIVITY_GOAL_DEVICE = Arrays.asList(hMDeviceSource, hMDeviceSource2, hMDeviceSource3, hMDeviceSource5, hMDeviceSource6, hMDeviceSource7, hMDeviceSource8, hMDeviceSource4);
        SET_LANGUAGE_S = Arrays.asList(hMDeviceSource, hMDeviceSource2, hMDeviceSource3, hMDeviceSource5, hMDeviceSource6, hMDeviceSource7, hMDeviceSource8, hMDeviceSource4);
        HMDeviceSource hMDeviceSource9 = HMDeviceSource.MILI_PEYTO;
        HMDeviceSource hMDeviceSource10 = HMDeviceSource.MILI_TEMPO;
        HMDeviceSource hMDeviceSource11 = HMDeviceSource.MILI_BEATS;
        HMDeviceSource hMDeviceSource12 = HMDeviceSource.MILI_BEATS_P;
        HMDeviceSource hMDeviceSource13 = HMDeviceSource.MILI_BEATS_W;
        HMDeviceSource hMDeviceSource14 = HMDeviceSource.MILI_PEYTO_L;
        HMDeviceSource hMDeviceSource15 = HMDeviceSource.MILI_PEYTO_WL;
        a = new HMDeviceSource[]{hMDeviceSource9, hMDeviceSource10, hMDeviceSource11, hMDeviceSource12, hMDeviceSource13, HMDeviceSource.MILI_DTH, HMDeviceSource.MILI_DTH_W, HMDeviceSource.MILI_CINCO, HMDeviceSource.MILI_CINCO_L, HMDeviceSource.MILI_TONLESAP, HMDeviceSource.MILI_TONLESAP_L, HMDeviceSource.MILI_TONLESAP_O, HMDeviceSource.MILI_TONLESAP_OL, hMDeviceSource14, hMDeviceSource15, HMDeviceSource.MILI_ANETO, HMDeviceSource.MILI_KONGMING, HMDeviceSource.MILI_KONGMING_L, HMDeviceSource.MILI_KONGMING_PRO_L, HMDeviceSource.MILI_KONGMING_PRO, HMDeviceSource.MILI_KONGMING_LITE};
        b = new HMDeviceSource[]{HMDeviceSource.MILI, HMDeviceSource.MILI_1A, HMDeviceSource.MILI_1S, HMDeviceSource.MILI_AMAZFIT, HMDeviceSource.WEIGHT, HMDeviceSource.WEIGHT_BFS, HMDeviceSource.WEIGHT_BODYFAT, HMDeviceSource.WEIGHT_SCALE2, hMDeviceSource11, hMDeviceSource12, hMDeviceSource13, HMDeviceSource.MILI_PRO, HMDeviceSource.MILI_PRO_I, HMDeviceSource.MILI_PRO_OLD, HMDeviceSource.MILI_CHONGQING, HMDeviceSource.MILI_WUHAN, HMDeviceSource.SHOES, HMDeviceSource.SHOES_CHILD, HMDeviceSource.SHOES_LIGHT, HMDeviceSource.SHOES_SPRANDI, HMDeviceSource.SHOES_MARS, HMDeviceSource.MILI_ROCKY, HMDeviceSource.MILI_NFC, HMDeviceSource.MILI_QINLING, hMDeviceSource9, hMDeviceSource10, HMDeviceSource.MILI_RIO, HMDeviceSource.OTHER_BM, hMDeviceSource14, hMDeviceSource15, hMDeviceSource, hMDeviceSource2, hMDeviceSource3, HMDeviceSource.SMART_WATCH_EVEREST_2, HMDeviceSource.SMART_WATCH_EVEREST_2_STAR_WAR, HMDeviceSource.SMART_WATCH_EVEREST_2S, HMDeviceSource.SMART_WATCH_EVEREST_2SW, HMDeviceSource.SMART_WATCH_EVEREST_2W, HMDeviceSource.MILI_QINLING_1S};
        c = new HMDeviceSource[]{HMDeviceSource.MILI_PYH, HMDeviceSource.MILI_PYH_W, HMDeviceSource.MILI_FALCON, HMDeviceSource.MILI_FALCON_DISNEY, HMDeviceSource.MILI_FALCON_W, HMDeviceSource.MILI_HAWK, HMDeviceSource.MILI_HAWK_W, HMDeviceSource.MILI_KESTREL, HMDeviceSource.MILI_KESTREL_W, HMDeviceSource.MILI_KESTREL_L, HMDeviceSource.MILI_KESTREL_WL, HMDeviceSource.MILI_FALCON_L, HMDeviceSource.MILI_FALCON_WL, HMDeviceSource.MILI_HAWK_L, HMDeviceSource.MILI_HAWK_WL, HMDeviceSource.MILI_HAWK_SWK, HMDeviceSource.MILI_HAWK_SWK_W, HMDeviceSource.MILI_VULTURE, HMDeviceSource.MILI_VENICE, HMDeviceSource.MILI_VENICE_W, hMDeviceSource6, hMDeviceSource7, hMDeviceSource8, HMDeviceSource.MILI_OSPREY, HMDeviceSource.MILI_OSPREY_W, HMDeviceSource.MILI_OSPREY_C, HMDeviceSource.MILI_CORSICA, HMDeviceSource.MILI_CORSICA_W, HMDeviceSource.MILI_LISBON, HMDeviceSource.MILI_LISBON_W, HMDeviceSource.MILI_LISBON_WL, HMDeviceSource.MILI_NEWTON_WL, HMDeviceSource.MILI_ONYX, HMDeviceSource.MILI_ONYX_W, HMDeviceSource.MILI_LINCS, HMDeviceSource.MILI_LINCS_W, HMDeviceSource.MILI_NEWTON, HMDeviceSource.MILI_NEWTON_W, HMDeviceSource.MILI_PRAGUE, HMDeviceSource.MILI_PRAGUE_W, HMDeviceSource.MILI_VOLGA, HMDeviceSource.MILI_VOLGA_W, HMDeviceSource.MILI_BLANC, HMDeviceSource.MILI_BLANC_W, HMDeviceSource.MILI_HAMBURG, HMDeviceSource.MILI_BONN, HMDeviceSource.MILI_LONDON, HMDeviceSource.MILI_HAMBURG_W, HMDeviceSource.MILI_BONN_W, HMDeviceSource.MILI_LONDON_W, HMDeviceSource.MILI_VIENNA, HMDeviceSource.MILI_VIENNA_W, HMDeviceSource.MILI_ANDES, HMDeviceSource.MILI_ANDES_W};
    }

    private static boolean a(HMDeviceSource inSource) {
        for (HMDeviceSource hMDeviceSource : b) {
            if (inSource == hMDeviceSource) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(HMDeviceSource inSource) {
        return !a(inSource);
    }

    public static boolean c(DeviceInfo deviceInfo) {
        FwDfuUtil fwDfuUtil = FwDfuUtil.INSTANCE;
        return fwDfuUtil.isNeedFwDfuJudge(deviceInfo.getDeviceSource()) ? fwDfuUtil.isFwSupportDFU(deviceInfo) : b(deviceInfo.getDeviceSource());
    }

    public static boolean hasFeatureAlarmSync(HMDeviceSource inSource) {
        for (HMDeviceSource hMDeviceSource : a) {
            if (inSource == hMDeviceSource) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasFeatureBaseResource(HMDeviceSource inSource) {
        for (HMDeviceSource hMDeviceSource : c) {
            if (inSource == hMDeviceSource) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasFeatureCollectData(DeviceInfo info) {
        if (info == null) {
            return false;
        }
        HMDeviceSource deviceSource = info.getDeviceSource();
        if (deviceSource == HMDeviceSource.MILI_QINLING) {
            return ProfileUtils.compareVersion(info.getFirmwareVersionStr(), "V2.0.2.78") >= 0;
        }
        return deviceSource != HMDeviceSource.MILI_QINLING_1S || ProfileUtils.compareVersion(info.getFirmwareVersionStr(), "V2.0.3.28") >= 0;
    }

    public static boolean hasFeatureGPS(HMDeviceSource inSource) {
        return ProxyContainer.getDeviceFeature().hasFeatureGPS(inSource);
    }

    public static boolean hasFeatureJHS(HMDeviceSource source) {
        return source == HMDeviceSource.MILI_JIUHUASHAN || source == HMDeviceSource.MILI_JIUHUASHAN_PRO || source == HMDeviceSource.MILI_JIUHUASHAN_ALIVECOR || source == HMDeviceSource.MILI_JIUHUASHAN_CE_MEDICAL || source == HMDeviceSource.MILI_JIUHUASHAN_CE_NORMAL || source == HMDeviceSource.MILI_JIUHUASHAN_FDA || source == HMDeviceSource.MILI_JIUHUASHAN_NMPA_BLE || source == HMDeviceSource.MILI_JIUHUASHAN_PRO_NMPA_BLE || source == HMDeviceSource.MILI_JIUHUASHAN_PRO_NMPA_BLE_NB || source == HMDeviceSource.MILI_JIUHUASHAN_NMPA_BLE_NB || source == HMDeviceSource.MILI_JIUHUASHAN_NOREX || source == HMDeviceSource.MILI_JIUHUASHAN_PRO_CE_MEDICAL || source == HMDeviceSource.MILI_JIUHUASHAN_PRO_FDA;
    }

    public static boolean hasFeatureOldCollectData(DeviceInfo info) {
        if (info == null) {
            return false;
        }
        HMDeviceSource deviceSource = info.getDeviceSource();
        if (deviceSource == HMDeviceSource.MILI_JIUHUASHAN || deviceSource == HMDeviceSource.MILI_JIUHUASHAN_PRO) {
            return ProfileUtils.compareVersion(info.getFirmwareVersionStr(), "V1.0.7.86") < 0;
        }
        return hasFeatureJHS(deviceSource);
    }

    public static boolean hasQinLingFuture(HMDeviceSource source) {
        return source == HMDeviceSource.MILI_QINLING || source == HMDeviceSource.MILI_QINLING_1S || source == HMDeviceSource.MILI_QINLING_S2;
    }
}
