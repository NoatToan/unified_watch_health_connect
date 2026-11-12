package com.xiaomi.hm.health.device;

import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceConfig {
    private static final String COUNTRY_INDIA = "IN";

    @Deprecated
    private static final HMDeviceSource[] HR_REALTIME_SOURCE_S;
    private static final HMDeviceSource[] HR_SOURCE_S;
    private static final HMDeviceSource[] PRO_SOURCE_S;
    private static final HMDeviceSource[] SHOE_SOURCES;
    private static final String TAG = "HMDeviceConfig";
    private static final HMDeviceType[] TYPE_DEVICE_NEED_DESTROY_IN_BACKGROUND;
    private static final HMDeviceType[] WATCH_SKIN_TYPE_S;
    private static final List<HMDeviceSource> watchFaceMallDevices;

    static {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_1S;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_ROCKY;
        HMDeviceSource hMDeviceSource3 = HMDeviceSource.MILI_PRO;
        HMDeviceSource hMDeviceSource4 = HMDeviceSource.MILI_PEYTO;
        HMDeviceSource hMDeviceSource5 = HMDeviceSource.MILI_TEMPO;
        HMDeviceSource hMDeviceSource6 = HMDeviceSource.MILI_WUHAN;
        HMDeviceSource hMDeviceSource7 = HMDeviceSource.MILI_CHONGQING;
        HMDeviceSource hMDeviceSource8 = HMDeviceSource.MILI_BEATS;
        HMDeviceSource hMDeviceSource9 = HMDeviceSource.MILI_BEATS_P;
        HMDeviceSource hMDeviceSource10 = HMDeviceSource.MILI_BEATS_W;
        HMDeviceSource hMDeviceSource11 = HMDeviceSource.MILI_DTH;
        HMDeviceSource hMDeviceSource12 = HMDeviceSource.MILI_DTH_W;
        HMDeviceSource hMDeviceSource13 = HMDeviceSource.MILI_CINCO;
        HMDeviceSource hMDeviceSource14 = HMDeviceSource.MILI_TONLESAP;
        HMDeviceSource hMDeviceSource15 = HMDeviceSource.MILI_CINCO_L;
        HMDeviceSource hMDeviceSource16 = HMDeviceSource.MILI_TONLESAP_L;
        HMDeviceSource hMDeviceSource17 = HMDeviceSource.MILI_TONLESAP_O;
        HMDeviceSource hMDeviceSource18 = HMDeviceSource.MILI_TONLESAP_OL;
        HMDeviceSource hMDeviceSource19 = HMDeviceSource.MILI_PYH;
        HMDeviceSource hMDeviceSource20 = HMDeviceSource.MILI_PYH_W;
        HMDeviceSource hMDeviceSource21 = HMDeviceSource.MILI_FALCON;
        HMDeviceSource hMDeviceSource22 = HMDeviceSource.MILI_FALCON_W;
        HMDeviceSource hMDeviceSource23 = HMDeviceSource.MILI_HAWK;
        HMDeviceSource hMDeviceSource24 = HMDeviceSource.MILI_HAWK_W;
        HMDeviceSource hMDeviceSource25 = HMDeviceSource.MILI_PEYTO_L;
        HMDeviceSource hMDeviceSource26 = HMDeviceSource.MILI_PEYTO_WL;
        HMDeviceSource hMDeviceSource27 = HMDeviceSource.MILI_KESTREL;
        HMDeviceSource hMDeviceSource28 = HMDeviceSource.MILI_KESTREL_W;
        HMDeviceSource hMDeviceSource29 = HMDeviceSource.MILI_FALCON_L;
        HMDeviceSource hMDeviceSource30 = HMDeviceSource.MILI_FALCON_WL;
        HMDeviceSource hMDeviceSource31 = HMDeviceSource.MILI_HAWK_L;
        HMDeviceSource hMDeviceSource32 = HMDeviceSource.MILI_HAWK_WL;
        HMDeviceSource hMDeviceSource33 = HMDeviceSource.MILI_ATHENS;
        HMDeviceSource hMDeviceSource34 = HMDeviceSource.MILI_VULTURE;
        HMDeviceSource hMDeviceSource35 = HMDeviceSource.MILI_HAWK_SWK;
        HMDeviceSource hMDeviceSource36 = HMDeviceSource.MILI_HAWK_SWK_W;
        HMDeviceSource hMDeviceSource37 = HMDeviceSource.MILI_FALCON_DISNEY;
        HMDeviceSource hMDeviceSource38 = HMDeviceSource.MILI_VENICE;
        HMDeviceSource hMDeviceSource39 = HMDeviceSource.OTHER_MOZART;
        HMDeviceSource hMDeviceSource40 = HMDeviceSource.OTHER_HAYDN;
        HMDeviceSource hMDeviceSource41 = HMDeviceSource.OTHER_LULLABY;
        HMDeviceSource hMDeviceSource42 = HMDeviceSource.MILI_ONYX;
        HMDeviceSource hMDeviceSource43 = HMDeviceSource.MILI_CORSICA;
        HMDeviceSource hMDeviceSource44 = HMDeviceSource.MILI_ONYX_W;
        HMDeviceSource hMDeviceSource45 = HMDeviceSource.MILI_CORSICA_W;
        HMDeviceSource hMDeviceSource46 = HMDeviceSource.MILI_LISBON;
        HMDeviceSource hMDeviceSource47 = HMDeviceSource.MILI_LISBON_W;
        HMDeviceSource hMDeviceSource48 = HMDeviceSource.MILI_OSPREY;
        HMDeviceSource hMDeviceSource49 = HMDeviceSource.MILI_OSPREY_W;
        HMDeviceSource hMDeviceSource50 = HMDeviceSource.MILI_OSPREY_C;
        HMDeviceSource hMDeviceSource51 = HMDeviceSource.MILI_NEWTON;
        HMDeviceSource hMDeviceSource52 = HMDeviceSource.MILI_NEWTON_W;
        HMDeviceSource hMDeviceSource53 = HMDeviceSource.MILI_LISBON_WL;
        HMDeviceSource hMDeviceSource54 = HMDeviceSource.MILI_NEWTON_WL;
        HMDeviceSource hMDeviceSource55 = HMDeviceSource.MILI_LINCS;
        HMDeviceSource hMDeviceSource56 = HMDeviceSource.MILI_LINCS_W;
        HMDeviceSource hMDeviceSource57 = HMDeviceSource.MILI_PRAGUE;
        HMDeviceSource hMDeviceSource58 = HMDeviceSource.MILI_PRAGUE_W;
        HMDeviceSource hMDeviceSource59 = HMDeviceSource.MILI_VOLGA;
        HMDeviceSource hMDeviceSource60 = HMDeviceSource.MILI_VOLGA_W;
        HMDeviceSource hMDeviceSource61 = HMDeviceSource.MILI_COMO;
        HMDeviceSource hMDeviceSource62 = HMDeviceSource.MILI_COMO_L;
        HMDeviceSource hMDeviceSource63 = HMDeviceSource.MILI_COMO_W;
        HMDeviceSource hMDeviceSource64 = HMDeviceSource.MILI_COMO_WL;
        HMDeviceSource hMDeviceSource65 = HMDeviceSource.MILI_CRATER_W;
        HMDeviceSource hMDeviceSource66 = HMDeviceSource.MILI_CRATER_WL;
        HMDeviceSource hMDeviceSource67 = HMDeviceSource.MILI_NESS;
        HMDeviceSource hMDeviceSource68 = HMDeviceSource.MILI_NESS_W;
        HMDeviceSource hMDeviceSource69 = HMDeviceSource.MILI_KONGMING;
        HMDeviceSource hMDeviceSource70 = HMDeviceSource.MILI_KONGMING_L;
        HMDeviceSource hMDeviceSource71 = HMDeviceSource.MILI_KONGMING_PRO;
        HMDeviceSource hMDeviceSource72 = HMDeviceSource.MILI_YORK;
        HMDeviceSource hMDeviceSource73 = HMDeviceSource.MILI_VENICE_W;
        HMDeviceSource hMDeviceSource74 = HMDeviceSource.MILI_LONDON;
        HMDeviceSource hMDeviceSource75 = HMDeviceSource.MILI_LONDON_W;
        HMDeviceSource hMDeviceSource76 = HMDeviceSource.MILI_TOKYO;
        HMDeviceSource hMDeviceSource77 = HMDeviceSource.MILI_BLANC;
        HMDeviceSource hMDeviceSource78 = HMDeviceSource.MILI_BLANC_W;
        HMDeviceSource hMDeviceSource79 = HMDeviceSource.MILI_HAMBURG;
        HMDeviceSource hMDeviceSource80 = HMDeviceSource.MILI_BONN;
        HMDeviceSource hMDeviceSource81 = HMDeviceSource.MILI_HAMBURG_W;
        HMDeviceSource hMDeviceSource82 = HMDeviceSource.MILI_BONN_W;
        HMDeviceSource hMDeviceSource83 = HMDeviceSource.MILI_VIENNA;
        HMDeviceSource hMDeviceSource84 = HMDeviceSource.MILI_VIENNA_W;
        HMDeviceSource hMDeviceSource85 = HMDeviceSource.MILI_ANDES;
        HMDeviceSource hMDeviceSource86 = HMDeviceSource.MILI_ANDES_W;
        HMDeviceSource hMDeviceSource87 = HMDeviceSource.MILI_TEIDE;
        HMDeviceSource hMDeviceSource88 = HMDeviceSource.MILI_TEIDE_W;
        HMDeviceSource hMDeviceSource89 = HMDeviceSource.MILI_ANETO;
        HR_REALTIME_SOURCE_S = new HMDeviceSource[]{hMDeviceSource, hMDeviceSource2, hMDeviceSource3, HMDeviceSource.OTHER_BM, hMDeviceSource4, hMDeviceSource5, hMDeviceSource6, hMDeviceSource7, hMDeviceSource8, hMDeviceSource9, hMDeviceSource10, hMDeviceSource11, hMDeviceSource12, hMDeviceSource13, hMDeviceSource14, hMDeviceSource15, hMDeviceSource16, hMDeviceSource17, hMDeviceSource18, hMDeviceSource19, hMDeviceSource20, hMDeviceSource21, hMDeviceSource22, hMDeviceSource23, hMDeviceSource24, hMDeviceSource25, hMDeviceSource26, hMDeviceSource27, hMDeviceSource28, hMDeviceSource29, hMDeviceSource30, hMDeviceSource31, hMDeviceSource32, hMDeviceSource33, hMDeviceSource34, hMDeviceSource35, hMDeviceSource36, hMDeviceSource37, hMDeviceSource38, hMDeviceSource39, hMDeviceSource40, hMDeviceSource41, hMDeviceSource42, hMDeviceSource43, hMDeviceSource42, hMDeviceSource43, hMDeviceSource44, hMDeviceSource45, hMDeviceSource46, hMDeviceSource47, hMDeviceSource48, hMDeviceSource49, hMDeviceSource50, hMDeviceSource51, hMDeviceSource52, hMDeviceSource53, hMDeviceSource54, hMDeviceSource55, hMDeviceSource56, hMDeviceSource57, hMDeviceSource58, hMDeviceSource59, hMDeviceSource60, hMDeviceSource61, hMDeviceSource62, hMDeviceSource63, hMDeviceSource64, hMDeviceSource65, hMDeviceSource66, hMDeviceSource67, hMDeviceSource68, hMDeviceSource69, hMDeviceSource70, hMDeviceSource71, hMDeviceSource72, hMDeviceSource73, hMDeviceSource74, hMDeviceSource75, hMDeviceSource76, hMDeviceSource77, hMDeviceSource78, hMDeviceSource79, hMDeviceSource80, hMDeviceSource81, hMDeviceSource82, hMDeviceSource83, hMDeviceSource84, hMDeviceSource85, hMDeviceSource86, hMDeviceSource87, hMDeviceSource88, hMDeviceSource89};
        HMDeviceSource hMDeviceSource90 = HMDeviceSource.MILI_QINLING;
        HMDeviceSource hMDeviceSource91 = HMDeviceSource.MILI_DAX;
        HMDeviceSource hMDeviceSource92 = HMDeviceSource.MILI_KONGMING_PRO_L;
        HMDeviceSource hMDeviceSource93 = HMDeviceSource.MILI_KONGMING_LITE;
        HMDeviceSource hMDeviceSource94 = HMDeviceSource.MILI_PANGU;
        HMDeviceSource hMDeviceSource95 = HMDeviceSource.MILI_PANGU_L;
        HMDeviceSource hMDeviceSource96 = HMDeviceSource.MILI_L66;
        HMDeviceSource hMDeviceSource97 = HMDeviceSource.MILI_L66_AP;
        HMDeviceSource hMDeviceSource98 = HMDeviceSource.MILI_L66_I;
        HMDeviceSource hMDeviceSource99 = HMDeviceSource.MILI_L66_IN;
        HMDeviceSource hMDeviceSource100 = HMDeviceSource.MILI_L66_NFC;
        HMDeviceSource hMDeviceSource101 = HMDeviceSource.MILI_L66_NFC_I;
        HMDeviceSource hMDeviceSource102 = HMDeviceSource.MILI_L66_WE;
        HMDeviceSource hMDeviceSource103 = HMDeviceSource.MILI_BARI;
        HMDeviceSource hMDeviceSource104 = HMDeviceSource.MILI_BARI_NFC;
        HMDeviceSource hMDeviceSource105 = HMDeviceSource.MILI_BARI_W;
        HR_SOURCE_S = new HMDeviceSource[]{hMDeviceSource3, hMDeviceSource, HMDeviceSource.WATCH_AMAZFIT, HMDeviceSource.WATCH_AMAZFIT_QOG, hMDeviceSource2, hMDeviceSource90, hMDeviceSource4, hMDeviceSource5, hMDeviceSource6, HMDeviceSource.WATCH_EVEREST, HMDeviceSource.WATCH_EVEREST_2S, hMDeviceSource7, hMDeviceSource8, hMDeviceSource9, hMDeviceSource11, hMDeviceSource12, hMDeviceSource10, hMDeviceSource13, hMDeviceSource14, hMDeviceSource15, hMDeviceSource16, hMDeviceSource17, hMDeviceSource18, hMDeviceSource19, hMDeviceSource20, hMDeviceSource21, hMDeviceSource22, hMDeviceSource23, hMDeviceSource24, hMDeviceSource25, hMDeviceSource26, hMDeviceSource27, hMDeviceSource28, hMDeviceSource29, hMDeviceSource30, hMDeviceSource31, hMDeviceSource32, hMDeviceSource33, hMDeviceSource34, hMDeviceSource35, hMDeviceSource36, hMDeviceSource37, hMDeviceSource38, hMDeviceSource39, hMDeviceSource40, hMDeviceSource41, hMDeviceSource42, hMDeviceSource43, hMDeviceSource44, hMDeviceSource45, hMDeviceSource46, hMDeviceSource47, hMDeviceSource48, hMDeviceSource49, hMDeviceSource50, hMDeviceSource51, hMDeviceSource52, hMDeviceSource53, hMDeviceSource54, hMDeviceSource55, hMDeviceSource56, hMDeviceSource57, hMDeviceSource58, hMDeviceSource59, hMDeviceSource60, hMDeviceSource61, hMDeviceSource62, hMDeviceSource63, hMDeviceSource64, hMDeviceSource65, hMDeviceSource66, hMDeviceSource67, hMDeviceSource68, hMDeviceSource91, hMDeviceSource69, hMDeviceSource70, hMDeviceSource71, hMDeviceSource92, hMDeviceSource93, hMDeviceSource94, hMDeviceSource95, hMDeviceSource96, hMDeviceSource97, hMDeviceSource98, hMDeviceSource99, hMDeviceSource100, hMDeviceSource101, hMDeviceSource102, hMDeviceSource72, hMDeviceSource73, hMDeviceSource76, hMDeviceSource103, hMDeviceSource104, hMDeviceSource105, hMDeviceSource74, hMDeviceSource75, hMDeviceSource77, hMDeviceSource78, hMDeviceSource79, hMDeviceSource80, hMDeviceSource81, hMDeviceSource82, hMDeviceSource83, hMDeviceSource84, hMDeviceSource85, hMDeviceSource86, hMDeviceSource87, hMDeviceSource88};
        PRO_SOURCE_S = new HMDeviceSource[]{hMDeviceSource3, hMDeviceSource2, hMDeviceSource90, HMDeviceSource.MILI_NFC, hMDeviceSource4, hMDeviceSource5, HMDeviceSource.MILI_PRO_I, hMDeviceSource6, hMDeviceSource7, hMDeviceSource8, hMDeviceSource9, hMDeviceSource11, hMDeviceSource12, hMDeviceSource10, hMDeviceSource13, hMDeviceSource14, hMDeviceSource15, hMDeviceSource16, hMDeviceSource17, hMDeviceSource18, hMDeviceSource19, HMDeviceSource.MILI_RIO, hMDeviceSource20, hMDeviceSource21, hMDeviceSource22, hMDeviceSource23, hMDeviceSource24, hMDeviceSource25, hMDeviceSource26, hMDeviceSource27, HMDeviceSource.MILI_KESTREL_WL, HMDeviceSource.MILI_KESTREL_L, hMDeviceSource28, hMDeviceSource29, hMDeviceSource30, hMDeviceSource31, hMDeviceSource32, hMDeviceSource33, hMDeviceSource34, hMDeviceSource35, hMDeviceSource36, hMDeviceSource37, hMDeviceSource38, hMDeviceSource89, hMDeviceSource74, hMDeviceSource75, hMDeviceSource42, hMDeviceSource43, hMDeviceSource44, hMDeviceSource45, hMDeviceSource46, hMDeviceSource47, hMDeviceSource53, hMDeviceSource48, hMDeviceSource49, hMDeviceSource50, hMDeviceSource51, hMDeviceSource52, hMDeviceSource53, hMDeviceSource54, hMDeviceSource55, hMDeviceSource56, hMDeviceSource57, hMDeviceSource58, hMDeviceSource59, hMDeviceSource60, hMDeviceSource61, hMDeviceSource62, hMDeviceSource63, hMDeviceSource64, hMDeviceSource65, hMDeviceSource66, hMDeviceSource67, hMDeviceSource68, hMDeviceSource91, hMDeviceSource69, hMDeviceSource70, hMDeviceSource71, hMDeviceSource92, hMDeviceSource93, hMDeviceSource94, hMDeviceSource95, hMDeviceSource96, hMDeviceSource97, hMDeviceSource98, hMDeviceSource99, hMDeviceSource100, hMDeviceSource101, hMDeviceSource102, hMDeviceSource72, hMDeviceSource73, hMDeviceSource76, hMDeviceSource77, hMDeviceSource78, hMDeviceSource79, hMDeviceSource80, hMDeviceSource81, hMDeviceSource82, HMDeviceSource.MILI_MADRID, HMDeviceSource.MILI_MADRID_W, hMDeviceSource83, hMDeviceSource84, hMDeviceSource85, hMDeviceSource86, hMDeviceSource87, hMDeviceSource88, HMDeviceSource.MILI_ZURICH, HMDeviceSource.MILI_ZURICH_W, HMDeviceSource.MILI_VERONA, HMDeviceSource.MILI_VERONA_W, HMDeviceSource.MILI_OSAKA, HMDeviceSource.MILI_OSAKA_W, HMDeviceSource.MILI_BLED, HMDeviceSource.MILI_BLED_W, HMDeviceSource.MILI_BLED_PRO, HMDeviceSource.MILI_BLED_PRO_W, HMDeviceSource.MILI_CANNES, HMDeviceSource.MILI_CANNES_W, HMDeviceSource.MILI_PROVENCE, HMDeviceSource.MILI_PROVENCE_W, HMDeviceSource.MILI_PROVENCE_W_NFC, HMDeviceSource.MILI_MADRID_HML, hMDeviceSource103, hMDeviceSource104, hMDeviceSource105, HMDeviceSource.MILI_SOFIA, HMDeviceSource.MILI_SOFIA_W, HMDeviceSource.MILI_FLORENCE, HMDeviceSource.MILI_FLORENCE_W, HMDeviceSource.MILI_BERLIN, HMDeviceSource.MILI_BERLIN_W, HMDeviceSource.MILI_LILLE, HMDeviceSource.MILI_LILLE_W, HMDeviceSource.MILI_WAST, HMDeviceSource.MILI_WAST_W};
        SHOE_SOURCES = new HMDeviceSource[]{HMDeviceSource.SHOES, HMDeviceSource.SHOES_CHILD, HMDeviceSource.SHOES_LIGHT, HMDeviceSource.SHOES_MARS, HMDeviceSource.SHOES_SPRANDI};
        TYPE_DEVICE_NEED_DESTROY_IN_BACKGROUND = new HMDeviceType[]{HMDeviceType.WEIGHT, HMDeviceType.SHOES, HMDeviceType.OTHER, HMDeviceType.HEADSET};
        WATCH_SKIN_TYPE_S = new HMDeviceType[]{HMDeviceType.MILI, HMDeviceType.WATCH};
        watchFaceMallDevices = Arrays.asList(hMDeviceSource13, hMDeviceSource15, hMDeviceSource42, hMDeviceSource44, hMDeviceSource43, hMDeviceSource45);
    }

    public static boolean bindSource(HMDeviceSource[] hMDeviceSourceArr) {
        for (HMDeviceSource hMDeviceSource : hMDeviceSourceArr) {
            if (hasBound(hMDeviceSource)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSource(HMDeviceSource[] hMDeviceSourceArr, HMDeviceSource hMDeviceSource) {
        for (HMDeviceSource hMDeviceSource2 : hMDeviceSourceArr) {
            if (hMDeviceSource2 == hMDeviceSource) {
                return true;
            }
        }
        return false;
    }

    public static boolean deviceNameIsWatch(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.WATCH_SOURCE_S, hMDeviceSource) || isSmartWatch(hMDeviceSource);
    }

    public static Class<? extends HMBaseDevice> getDeviceClass(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.getDeviceClass(hMDeviceSource);
    }

    public static HMDeviceSource getFeatureHrDevice() {
        for (HMDeviceSource hMDeviceSource : HR_SOURCE_S) {
            if (hasBound(hMDeviceSource)) {
                return hMDeviceSource;
            }
        }
        return HMDeviceSource.VDEVICE;
    }

    public static HMDeviceSource getFeatureProDevice() {
        for (HMDeviceSource hMDeviceSource : PRO_SOURCE_S) {
            if (hasBound(hMDeviceSource)) {
                return hMDeviceSource;
            }
        }
        return HMDeviceSource.VDEVICE;
    }

    public static HMDeviceSource[] getHrRealtimeSource() {
        return HMDeviceSourceExtKt.getHrRealtimeSource();
    }

    public static List<HMDeviceSource> getProDevices() {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, PRO_SOURCE_S);
        return arrayList;
    }

    public static HMDeviceSource[] getShoeSources() {
        HMDeviceSource[] hMDeviceSourceArr = SHOE_SOURCES;
        return (HMDeviceSource[]) Arrays.copyOf(hMDeviceSourceArr, hMDeviceSourceArr.length);
    }

    public static HMDeviceSource getSupportWatchStoreDevice() {
        for (HMDeviceType hMDeviceType : WATCH_SKIN_TYPE_S) {
            if (hasBound(hMDeviceType)) {
                return ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(hMDeviceType);
            }
        }
        return HMDeviceSource.VDEVICE;
    }

    public static boolean hasBound(HMDeviceSource hMDeviceSource) {
        return ManagerFunctionsKt.getDeviceManagerApi().hasBound(hMDeviceSource);
    }

    public static boolean hasBoundBand3() {
        return ConfigHelperKt.hasFeature(Feature.BAND3_SOURCE_S);
    }

    public static boolean hasBoundBfs() {
        return ConfigHelperKt.hasFeature(Feature.BFS_SOURCE_S);
    }

    public static boolean hasBoundClassicWatch() {
        return ConfigHelperKt.hasFeature(Feature.CLASSIC_BT_SOURCE_S);
    }

    public static boolean hasBoundPai() {
        return ConfigHelperKt.hasFeature(Feature.PAI_SOURCE_S);
    }

    public static boolean hasBoundTempSeries() {
        return ConfigHelperKt.hasFeature(Feature.TEMP_SERIES_S);
    }

    public static boolean hasBoundWatch() {
        return ConfigHelperKt.hasFeature(Feature.WATCH_SOURCE_S);
    }

    public static boolean hasCall() {
        return HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(20);
    }

    public static boolean hasDeviceFeature(Feature feature) {
        return ConfigHelperKt.hasFeature(feature, ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(ManagerFunctionsKt.getDeviceManagerApi().getMajorDeviceType()));
    }

    public static boolean hasFeatureAuth(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.AUTH_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureAvoidSpiteBind() {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_AVOID_SPITE_BIND);
    }

    public static boolean hasFeatureBackLight(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.BACK_LIGHT_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureBandConfirmOnScreen(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.BAND_CONFIRM_ON_SCREEN, hMDeviceSource);
    }

    public static boolean hasFeatureCalendarAndStartDayOfWeek() {
        return ConfigHelperKt.hasFeature(Feature.CALENDAR_AND_START_DAY_OF_WEEK);
    }

    public static boolean hasFeatureClassicBt(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.CLASSIC_BT_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureClassicBtGPS(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.CLASSIC_BT_GPS_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureCompressRes(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.COMPRESS_RES_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureCustomVibrate(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.CUSTOM_VIBRATE, hMDeviceSource);
    }

    public static boolean hasFeatureDND(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.DND_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureDNDDevice() {
        return ConfigHelperKt.hasFeature(Feature.DND_SOURCE_S);
    }

    public static boolean hasFeatureDateFormat(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_DATE_FORMAT_S, hMDeviceSource);
    }

    public static boolean hasFeatureDefaultLazyAlarm(HMDeviceSource hMDeviceSource) {
        return hMDeviceSource.getType() == HMDeviceType.MILI && !ConfigHelperKt.hasFeature(Feature.NOT_SUPPORT_DEFAULT_LAZY_ALARM, hMDeviceSource);
    }

    public static boolean hasFeatureDeviceLanguage(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_DEVICE_LANGUAGE, hMDeviceSource);
    }

    public static boolean hasFeatureDeviceSport(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.DEVICE_SPORT_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureDisconnectRemind(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.DISCONNECT_REMIND_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureDisconnectRemindDevice() {
        return ConfigHelperKt.hasFeature(Feature.DISCONNECT_REMIND_SOURCE_S);
    }

    public static boolean hasFeatureFontRes(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.FONT_RES_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureFontResDevice() {
        return ConfigHelperKt.hasFeature(Feature.FONT_RES_SOURCE_S);
    }

    public static boolean hasFeatureFullHr(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.FULL_HR_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureG1(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.G1_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureG2(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.G2_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureG3(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.G3_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureG3Device() {
        return ConfigHelperKt.hasFeature(Feature.G3_SOURCE_S);
    }

    public static boolean hasFeatureGPSData(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.GPS_DATA_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureGT2(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.GT2_SOURCE, hMDeviceSource);
    }

    public static boolean hasFeatureHRAlert() {
        return ConfigHelperKt.hasFeature(Feature.HR_ALERT);
    }

    public static boolean hasFeatureHealthDetect(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_HEALTH_DETECT_TITLE, hMDeviceSource);
    }

    public static boolean hasFeatureHr(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.HR_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureHrDevice() {
        return ConfigHelperKt.hasFeature(Feature.HR_SOURCE_S);
    }

    public static boolean hasFeatureHumidityWind() {
        return ConfigHelperKt.hasFeature(Feature.HUMIDITY_WIND_S);
    }

    public static boolean hasFeatureKoreanDisableAutoLocate() {
        return ConfigHelperKt.hasFeature(Feature.KOREAN_DISABLE_AUTO_LOCATE_S);
    }

    public static boolean hasFeatureLatinFw(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.LATIN_FW_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureLazyAlarm(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.LAZY_ALARM_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureLazyAlarmDevice() {
        return ConfigHelperKt.hasFeature(Feature.LAZY_ALARM_SOURCE_S);
    }

    public static boolean hasFeatureLiftWristSensitivity(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.LIFT_WRIST_SENSITIVITY, hMDeviceSource);
    }

    public static boolean hasFeatureLinkageNotification() {
        return ConfigHelperKt.hasMiliFeature(Feature.LINKAGE_NOTIFICATION);
    }

    public static boolean hasFeatureLog(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.LOG_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureMusicVolume() {
        return ConfigHelperKt.hasFeature(Feature.MUSIC_VOLUME);
    }

    public static boolean hasFeatureMutePhoneDevice() {
        return ConfigHelperKt.hasFeature(Feature.MUTE_PHONE_SOURCE_S);
    }

    public static boolean hasFeatureNfcBusDevice() {
        return NfcDeviceConfigKt.hasFeatureNfcBusDevice();
    }

    public static boolean hasFeatureOffWistLock(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.OFF_WIST_LOCK_S, hMDeviceSource);
    }

    public static boolean hasFeatureOfflineHr(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.HR_OFFLINE_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeaturePAI(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.PAI_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeaturePeytoWatchFace(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.PEYTO_WATCH_FACE, hMDeviceSource);
    }

    public static boolean hasFeaturePro(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.PRO_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureProDevice() {
        return getFeatureProDevice() != HMDeviceSource.VDEVICE;
    }

    public static boolean hasFeatureProtoStatistics(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.PROTO_STATISTICS_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureReadWriteHrDevice(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.FULL_HR_READ_WRITE_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureReminder(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.REMINDER_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureReminderDevice() {
        return ConfigHelperKt.hasFeature(Feature.REMINDER_SOURCE_S);
    }

    public static boolean hasFeatureResetOnDevice(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.RESET_ON_DEVICE_S, hMDeviceSource);
    }

    public static boolean hasFeatureRtHr(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.HR_REALTIME_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureSecondaryScreen(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SECONDARY_SCREEN_S, hMDeviceSource);
    }

    public static boolean hasFeatureSpeech(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SPEECH_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureSport(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SPORT_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureSportHrBroadcast() {
        if (ConfigHelperKt.hasFeature(Feature.CINCO_SERIES_S)) {
            return true;
        }
        return ConfigHelperKt.hasFeature(Feature.SPORT_HR_BROADCAST);
    }

    public static boolean hasFeatureSportHrDetect() {
        return ConfigHelperKt.hasFeature(Feature.SPORT_HR_DETECT);
    }

    public static boolean hasFeatureSportOrTimer(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SPORT_TIME_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureStepDevice() {
        return hasBound(HMDeviceType.MILI) || hasBound(HMDeviceType.SENSORHUB) || hasBound(HMDeviceType.SHOES) || hasBound(HMDeviceType.WATCH);
    }

    public static boolean hasFeatureTemperature(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_GET_TEMPERATURE_S, hMDeviceSource);
    }

    public static boolean hasFeatureTempoWatchFace(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.TEMPO_WATCH_FACE, hMDeviceSource);
    }

    public static boolean hasFeatureWeather(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.WEATHER_SOURCE_S, hMDeviceSource);
    }

    public static boolean hasFeatureWeatherDevice() {
        return ConfigHelperKt.hasFeature(Feature.WEATHER_SOURCE_S);
    }

    public static boolean hasFeatureWeatherSunSetSunRise() {
        return ConfigHelperKt.hasFeature(Feature.WEATHER_SUNSET_SUNRISE);
    }

    public static boolean hasSurportProductVersionDevices(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.PRODUCT_VERSION_S, hMDeviceSource);
    }

    public static boolean isBand(HMDeviceSource hMDeviceSource) {
        return (hMDeviceSource == null || hMDeviceSource.getType() != HMDeviceType.MILI || isWatch(hMDeviceSource)) ? false : true;
    }

    public static boolean isBfs(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.BFS_SOURCE_S, hMDeviceSource);
    }

    public static boolean isChaohuSeries() {
        return ConfigHelperKt.hasFeature(Feature.CHAOHU_SERIES_S);
    }

    public static boolean isCincoSeries() {
        return ConfigHelperKt.hasFeature(Feature.CINCO_SERIES_S);
    }

    public static boolean isEverestDevice(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.EVEREST_SOURCE_S, hMDeviceSource);
    }

    public static boolean isFalconSeries() {
        return ConfigHelperKt.hasFeature(Feature.FALCON_SERIES_S);
    }

    public static boolean isGT(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(hMDeviceSource, Feature.KESTREL_SERIES_S) || ConfigHelperKt.hasFeature(hMDeviceSource, Feature.FALCON_SERIES_S) || ConfigHelperKt.hasFeature(hMDeviceSource, Feature.HAWK_SERIES_S);
    }

    public static boolean isGt2() {
        return hasFeatureGT2(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI));
    }

    public static boolean isHawkSeries() {
        return ConfigHelperKt.hasFeature(Feature.HAWK_SERIES_S);
    }

    private static boolean isIndia() {
        return Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage()) && Locale.getDefault().getCountry().equalsIgnoreCase("IN");
    }

    public static boolean isKestrelSeries() {
        return ConfigHelperKt.hasFeature(Feature.KESTREL_SERIES_S);
    }

    public static boolean isKongmingSeries() {
        return ConfigHelperKt.hasFeature(Feature.KONGMING_SERIES_S);
    }

    public static boolean isL66Series() {
        return ConfigHelperKt.hasFeature(Feature.L66_SERIES_S);
    }

    public static boolean isMiBand4() {
        return watchFaceMallDevices.contains(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI));
    }

    public static boolean isNeedDestroyInBackground(HMDeviceType hMDeviceType) {
        for (HMDeviceType hMDeviceType2 : TYPE_DEVICE_NEED_DESTROY_IN_BACKGROUND) {
            if (hMDeviceType2.getValue() == hMDeviceType.getValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPYHSeries() {
        return ConfigHelperKt.hasFeature(Feature.PYH_SERIES_S);
    }

    public static boolean isPanguSeries() {
        return ConfigHelperKt.hasFeature(Feature.PANGU_SERIES_S);
    }

    public static boolean isSchedule() {
        return ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME);
    }

    public static boolean isSensorHub(HMDeviceSource hMDeviceSource) {
        return hMDeviceSource != null && hMDeviceSource.getType() == HMDeviceType.SENSORHUB;
    }

    public static boolean isShoes(HMDeviceSource hMDeviceSource) {
        return hMDeviceSource != null && hMDeviceSource.getType() == HMDeviceType.SHOES;
    }

    public static boolean isSmartWatch(HMDeviceSource hMDeviceSource) {
        return hMDeviceSource != null && hMDeviceSource.getType() == HMDeviceType.WATCH;
    }

    public static boolean isSupportAnalyzeSwimmingData(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_ANALYZE_SWIMMING_DATA_SOURCE, hMDeviceSource);
    }

    public static boolean isSupportAutoConnect(HMDeviceSource hMDeviceSource) {
        return !ConfigHelperKt.hasFeature(Feature.NOT_SUPPORT_AUTO_CONNECT_SOURCES, hMDeviceSource);
    }

    public static boolean isSupportEcg(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_ECG, hMDeviceSource);
    }

    public static boolean isSupportHideAll(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.ENABLE_HIDEALL_S, hMDeviceSource);
    }

    public static boolean isSupportLFEvent(HMDeviceSource hMDeviceSource) {
        return !ConfigHelperKt.hasFeature(Feature.NOT_SUPPORT_LF_EVENT_SOURCES, hMDeviceSource);
    }

    public static boolean isSupportNewProtocal(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.PROTOCAL_NEW_S, hMDeviceSource);
    }

    public static boolean isSupportNewSpeech(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_NEW_SPEECH_SOURCES, hMDeviceSource);
    }

    public static boolean isSupportNewWatchStore() {
        return hasDeviceFeature(Feature.SUPPORT_WATCH_FACE_STORE);
    }

    public static boolean isSupportOldAuth(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_OLD_AUTH_SOURCES, hMDeviceSource);
    }

    public static boolean isSupportRtStep(HMDeviceSource hMDeviceSource) {
        return !ConfigHelperKt.hasFeature(Feature.NOT_SUPPORT_RT_STEP_SOURCES, hMDeviceSource);
    }

    public static boolean isSupportWatchStore() {
        return isSupportNewWatchStore();
    }

    public static boolean isSuppotVibrateNotify(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_VIBRATE_NOTIFY_SOURCES, hMDeviceSource);
    }

    public static boolean isSurpportNewCalories() {
        return false;
    }

    public static boolean isTempoSeries() {
        return ConfigHelperKt.hasFeature(Feature.TEMP_SERIES_S);
    }

    public static boolean isTokyo() {
        return ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI) == HMDeviceSource.MILI_TOKYO;
    }

    public static boolean isVirtual() {
        return ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE);
    }

    public static boolean isWatch(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.WATCH_SOURCE_S, hMDeviceSource);
    }

    public static Boolean isWatchName() {
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        if (boundDeviceSource != null && boundDeviceSource != HMDeviceSource.VDEVICE) {
            return Boolean.valueOf(ConfigHelperKt.hasFeature(Feature.WATCH_SOURCE_S, boundDeviceSource));
        }
        HMDeviceSource boundDeviceSource2 = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.WATCH);
        if (boundDeviceSource2 == null || boundDeviceSource2 == HMDeviceSource.VDEVICE) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static boolean isWeightDevice(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.WEIGHT_SOURCES, hMDeviceSource);
    }

    public static boolean isWuhanSeries() {
        return ConfigHelperKt.hasFeature(Feature.WUHAN_SERIES_S);
    }

    public static boolean isXiHuDevice(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.XI_HU_SOURCE_S, hMDeviceSource);
    }

    public static HMDeviceType[] needDestroyInBackground() {
        return TYPE_DEVICE_NEED_DESTROY_IN_BACKGROUND;
    }

    public static boolean showMiliSettingActivityOffWistLock() {
        return ConfigHelperKt.hasFeature(Feature.OFF_WIST_LOCK_S_ACCURATE);
    }

    public static boolean supportHRR() {
        return ConfigHelperKt.hasFeature(Feature.HEART_RATE_REGION_S);
    }

    public static boolean supportLaptopUnLock() {
        HMLog.i(TAG, "region: " + DeviceXFunctionsKt.getAppStateApi().getAreaBySave(), new Object[0]);
        HMLog.i(TAG, "locale: " + Locale.getDefault(), new Object[0]);
        if (!(!HMLoginManager.isUnknown() ? !(HMLoginManager.isInIN() || HMLoginManager.isInMainland()) : !(isIndia() || Language.isSimplifiedChinese()))) {
            HMLog.i(TAG, "region not match", new Object[0]);
            return false;
        }
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        if (boundDeviceSource == HMDeviceSource.MILI_CINCO || boundDeviceSource == HMDeviceSource.MILI_CINCO_L) {
            return true;
        }
        return ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_LAPTOP_UNLOCK);
    }

    public static boolean supportLibrary() {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_LIBRARY);
    }

    public static boolean supportMusicControl(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.MUSIC_CONTROL_SOURCE_S, hMDeviceSource);
    }

    public static boolean supportNap() {
        try {
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
            if (hMMiLiProDevice == null || hMMiLiProDevice.getDeviceInfo() == null) {
                return false;
            }
            return hMMiLiProDevice.getDeviceInfo().getDeviceFeature().hasSw(12);
        } catch (Exception e) {
            HMLog.e(TAG, "Exception :: ", e);
            return false;
        }
    }

    public static boolean supportNewHealthDetect() {
        return hasFeatureHealthDetect(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI));
    }

    public static boolean supportOfflineCmd(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_OFFLINE_VOICE, hMDeviceSource);
    }

    public static boolean supportRem() {
        com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature;
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        return (device == null || device.getDeviceInfo() == null || (deviceFeature = device.getDeviceInfo().getDeviceFeature()) == null || !deviceFeature.hasAlg(0) || deviceFeature.get(0) <= 4) ? false : true;
    }

    public static boolean supportTakePic() {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_TAKE_PIC) && !ConfigHelperKt.hasFeature(Feature.L66_SERIES_S);
    }

    private static boolean hasBound(HMDeviceType hMDeviceType) {
        return ManagerFunctionsKt.getDeviceManagerApi().hasBound(hMDeviceType);
    }

    public static boolean hasFeatureAvoidSpiteBind(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_AVOID_SPITE_BIND, hMDeviceSource);
    }

    public static boolean hasFeatureBackLight() {
        return ConfigHelperKt.hasFeature(Feature.BACK_LIGHT_SOURCE_S);
    }

    public static boolean hasFeatureOffWistLock() {
        return ConfigHelperKt.hasFeature(Feature.OFF_WIST_LOCK_S);
    }

    public static boolean isChaohuSeries(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.CHAOHU_SERIES_S, hMDeviceSource);
    }

    public static boolean isCincoSeries(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.CINCO_SERIES_S, hMDeviceSource);
    }

    public static boolean isFalconSeries(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.FALCON_SERIES_S, hMDeviceSource);
    }

    public static boolean isHawkSeries(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.HAWK_SERIES_S, hMDeviceSource);
    }

    public static boolean isKestrelSeries(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.KESTREL_SERIES_S, hMDeviceSource);
    }

    public static boolean isPYHSeries(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.PYH_SERIES_S, hMDeviceSource);
    }

    public static boolean isSupportNewWatchStore(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_WATCH_FACE_STORE, hMDeviceSource);
    }

    public static boolean isWatch() {
        return ConfigHelperKt.hasFeature(Feature.WATCH_SOURCE_S);
    }

    public static boolean supportMusicControl() {
        return ConfigHelperKt.hasFeature(Feature.MUSIC_CONTROL_SOURCE_S);
    }

    public static boolean isGT() {
        return ConfigHelperKt.hasFeature(Feature.KESTREL_SERIES_S) || ConfigHelperKt.hasFeature(Feature.FALCON_SERIES_S) || ConfigHelperKt.hasFeature(Feature.HAWK_SERIES_S);
    }
}
