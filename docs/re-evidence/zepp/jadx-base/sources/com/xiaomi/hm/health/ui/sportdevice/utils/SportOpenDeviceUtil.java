package com.xiaomi.hm.health.ui.sportdevice.utils;

import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class SportOpenDeviceUtil {
    private static ArrayList<HMDeviceSource> a = new ArrayList<>();
    private static List<HMDeviceSource> b = new ArrayList();
    private static List<HMDeviceSource> c = new ArrayList();
    private static List<HMDeviceSource> d = new ArrayList();
    private static List<HMDeviceSource> e = new ArrayList();
    private static List<HMDeviceSource> f = new ArrayList();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            a = iArr;
            try {
                iArr[HMDeviceSource.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceSource.MILI_1A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceSource.MILI_1S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceSource.MILI_PRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceSource.MILI_WUHAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceSource.MILI_CHONGQING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO_L.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[HMDeviceSource.MILI_ROCKY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[HMDeviceSource.MILI_DTH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[HMDeviceSource.MILI_DTH_W.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_O.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_L.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_OL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO_L.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO_WL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[HMDeviceSource.MILI_TEMPO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS_P.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS_W.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[HMDeviceSource.SHOES.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[HMDeviceSource.SHOES_CHILD.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[HMDeviceSource.SHOES_SPRANDI.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[HMDeviceSource.SHOES_LIGHT.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[HMDeviceSource.SHOES_MARS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[HMDeviceSource.MILI_PYH.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[HMDeviceSource.MILI_PYH_W.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_L.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_W.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_WL.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_DISNEY.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_L.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_W.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_WL.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_SWK.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_SWK_W.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL_L.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL_WL.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL_W.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                a[HMDeviceSource.MILI_VULTURE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                a[HMDeviceSource.MILI_ANETO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                a[HMDeviceSource.MILI_VENICE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                a[HMDeviceSource.MILI_VENICE_W.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                a[HMDeviceSource.OTHER_MOZART.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                a[HMDeviceSource.MILI_ONYX.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                a[HMDeviceSource.MILI_ONYX_W.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                a[HMDeviceSource.MILI_CORSICA.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                a[HMDeviceSource.MILI_CORSICA_W.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                a[HMDeviceSource.MILI_OSPREY.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                a[HMDeviceSource.MILI_OSPREY_C.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                a[HMDeviceSource.MILI_OSPREY_W.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                a[HMDeviceSource.MILI_LISBON.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                a[HMDeviceSource.MILI_LISBON_W.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                a[HMDeviceSource.MILI_LINCS.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                a[HMDeviceSource.MILI_LINCS_W.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                a[HMDeviceSource.MILI_NEWTON.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                a[HMDeviceSource.MILI_NEWTON_W.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                a[HMDeviceSource.MILI_PRAGUE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                a[HMDeviceSource.MILI_PRAGUE_W.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                a[HMDeviceSource.MILI_VOLGA.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                a[HMDeviceSource.MILI_VOLGA_W.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                a[HMDeviceSource.MILI_TOKYO.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                a[HMDeviceSource.MILI_COMO.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                a[HMDeviceSource.MILI_COMO_L.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                a[HMDeviceSource.MILI_COMO_W.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                a[HMDeviceSource.MILI_COMO_WL.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                a[HMDeviceSource.MILI_HAMBURG.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                a[HMDeviceSource.MILI_HAMBURG_W.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                a[HMDeviceSource.MILI_BONN.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                a[HMDeviceSource.MILI_BONN_W.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                a[HMDeviceSource.OTHER_HAYDN.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                a[HMDeviceSource.MILI_BLANC.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                a[HMDeviceSource.MILI_BLANC_W.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                a[HMDeviceSource.MILI_MADRID.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                a[HMDeviceSource.MILI_MADRID_W.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                a[HMDeviceSource.MILI_MADRID_HML.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                a[HMDeviceSource.OTHER_BM.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
        }
    }

    static {
        List listAsList = Arrays.asList(HMDeviceConfig.getHrRealtimeSource());
        List listAsList2 = Arrays.asList(HMDeviceConfig.getShoeSources());
        a.addAll(listAsList);
        a.addAll(listAsList2);
        b.addAll(listAsList);
        c.addAll(listAsList);
        d.addAll(listAsList);
        e.addAll(listAsList2);
        List<HMDeviceSource> list = e;
        HMDeviceSource hMDeviceSource = HMDeviceSource.OTHER_BM;
        list.add(hMDeviceSource);
        f.add(hMDeviceSource);
    }

    public static int getDeviceIconResourceId(HMDeviceSource deviceSource) {
        switch (a.a[deviceSource.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return R.drawable.icon_sport_open_device_miband_series_1;
            case 4:
                return R.drawable.icon_sport_open_device_miband_series_2;
            case 5:
            case 6:
                return R.drawable.icon_sport_open_device_miband_series_3;
            case 7:
            case 8:
                return R.drawable.icon_sport_open_device_miband_series_4;
            case 9:
                return R.drawable.icon_sport_open_device_amazfit_arc;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return R.drawable.icon_sport_open_device_chaohu_series;
            case 19:
                return R.drawable.icon_sport_open_device_amazfitband;
            case 20:
            case 21:
            case 22:
                return R.drawable.icon_sport_open_device_amazfitband_2;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return R.drawable.icon_sport_open_device_smart_chip;
            case 28:
            case 29:
                return R.drawable.icon_sport_open_device_pyh;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 59:
            case 60:
            case 63:
            case 64:
                return R.drawable.icon_sport_open_device_falcon;
            case 35:
            case 36:
            case 37:
            case 38:
                return R.drawable.icon_sport_open_device_hawk;
            case 39:
            case 40:
                return R.drawable.icon_sport_open_device_hawk_swk;
            case 41:
            case 42:
            case 43:
            case 44:
                return R.drawable.icon_sport_open_device_kestrel;
            case 45:
                return R.drawable.icon_sport_open_device_vulture;
            case 46:
                return R.drawable.icon_sport_open_device_aneto;
            case 47:
            case 48:
                return R.drawable.icon_sport_open_device_venice;
            case 49:
                return R.drawable.icon_sport_open_device_mozart;
            case 50:
            case 51:
                return R.drawable.onyx_icon_sport_open_device_onyx;
            case 52:
            case 53:
                return R.drawable.corsica_icon_sport_open_device_corsica;
            case 54:
            case 55:
            case 56:
                return R.drawable.icon_sport_open_device_osprey;
            case 57:
            case 58:
                return R.drawable.icon_sport_open_device_lisbon;
            case 61:
            case 62:
                return R.drawable.icon_sport_open_device_newton;
            case 65:
            case 66:
                return R.drawable.icon_sport_open_device_volga;
            case 67:
                return R.drawable.tokyo_icon_sport_open_device_tokyo;
            case 68:
            case 69:
            case 70:
            case 71:
                return R.drawable.icon_sport_open_device_como;
            case 72:
            case 73:
                return R.drawable.icon_sport_open_device_hamburg;
            case 74:
            case 75:
                return R.drawable.icon_sport_open_device_bonn;
            case 76:
                return R.drawable.icon_sport_open_device_haydn;
            case 77:
            case 78:
                return R.drawable.icon_sport_open_device_blanc;
            case 79:
            case 80:
            case 81:
                return R.drawable.icon_sport_open_device_madrid;
            default:
                return R.drawable.icon_sport_open_device_default_device;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    public static List<Integer> getDeviceSupportSpecifiedSportTypeAllAnalysisTypeCollection(HMDeviceSource deviceSource, int specifiedSportType) {
        ArrayList arrayList = new ArrayList();
        if (specifiedSportType == 1) {
            if (isDeviceSupportHeartRateAnalysis(deviceSource)) {
                arrayList.add(Integer.valueOf(R.string.heart_rate_analyze));
            }
            if (isDeviceSupportPoseAnalysis(deviceSource)) {
                arrayList.add(Integer.valueOf(R.string.pose_analyze));
            }
            if (isDeviceSupportEffectAnalysis(deviceSource)) {
                arrayList.add(Integer.valueOf(R.string.running_result_analyze));
            }
        } else if (specifiedSportType == 6) {
            if (d.contains(deviceSource)) {
                arrayList.add(Integer.valueOf(R.string.heart_rate_analyze));
            }
            if (f.contains(deviceSource)) {
                arrayList.add(Integer.valueOf(R.string.running_result_analyze));
            }
        } else if (specifiedSportType == 8) {
            if (isDeviceSupportHeartRateAnalysis(deviceSource)) {
                arrayList.add(Integer.valueOf(R.string.heart_rate_analyze));
            }
            if (isDeviceSupportPoseAnalysis(deviceSource)) {
                arrayList.add(Integer.valueOf(R.string.pose_analyze));
            }
            if (isDeviceSupportEffectAnalysis(deviceSource)) {
                arrayList.add(Integer.valueOf(R.string.running_result_analyze));
            }
        } else if (specifiedSportType == 9) {
            if (d.contains(deviceSource)) {
                arrayList.add(Integer.valueOf(R.string.heart_rate_analyze));
            }
            if (f.contains(deviceSource)) {
                arrayList.add(Integer.valueOf(R.string.running_result_analyze));
            }
        }
        return arrayList;
    }

    public static boolean isDeviceSupportCyclingAnalysis(HMDeviceSource deviceSource) {
        return deviceSource != null && b.contains(deviceSource);
    }

    public static boolean isDeviceSupportEffectAnalysis(HMDeviceSource deviceSource) {
        return f.contains(deviceSource);
    }

    public static boolean isDeviceSupportHeartRateAnalysis(HMDeviceSource deviceSource) {
        return d.contains(deviceSource);
    }

    public static boolean isDeviceSupportPoseAnalysis(HMDeviceSource deviceSource) {
        return e.contains(deviceSource);
    }

    public static boolean isDeviceSupportRunningAnalysis(HMDeviceSource deviceSource) {
        return deviceSource != null && a.contains(deviceSource);
    }

    public static boolean isDeviceSupportWalkingAnalysis(HMDeviceSource deviceSource) {
        return deviceSource != null && c.contains(deviceSource);
    }
}
