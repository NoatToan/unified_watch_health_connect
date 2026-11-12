package com.xiaomi.hm.health.bt.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;

/* JADX INFO: loaded from: classes19.dex */
public class HMDisplaySetting extends SortableAppItems {
    public static boolean SUPPORT_CINCO_PAI = false;
    public static boolean SUPPORT_PAI = true;
    public static boolean SUPPORT_PYH_PAI = false;
    public static final byte TYPE_ANETO = 41;
    public static final byte TYPE_ATHENS = 33;
    public static final byte TYPE_BEATS = 5;
    public static final byte TYPE_BEATS_P = 6;
    public static final byte TYPE_BEATS_W = 22;
    public static final byte TYPE_CHAOHU = 1;
    public static final byte TYPE_CHAOHU_L = 16;
    public static final byte TYPE_CHONGQING = 7;
    public static final byte TYPE_CINCO = 9;
    public static final byte TYPE_CINCO_L = 10;
    public static final byte TYPE_CORSICA = 39;
    public static final byte TYPE_CORSICA_W = 48;
    public static final byte TYPE_DTH = 4;
    public static final byte TYPE_FALCON = 19;
    public static final byte TYPE_FALCON_DISNEY = 36;
    public static final byte TYPE_FALCON_L = 27;
    public static final byte TYPE_FALCON_W = 20;
    public static final byte TYPE_FALCON_WL = 28;
    public static final byte TYPE_HAWK = 23;
    public static final byte TYPE_HAWK_L = 24;
    public static final byte TYPE_HAWK_SWK = 34;
    public static final byte TYPE_HAWK_SWK_W = 35;
    public static final byte TYPE_HAWK_W = 25;
    public static final byte TYPE_HAWK_WL = 26;
    public static final byte TYPE_KESTREL = 29;
    public static final byte TYPE_KESTREL_L = 31;
    public static final byte TYPE_KESTREL_W = 30;
    public static final byte TYPE_KESTREL_WL = 32;
    public static final byte TYPE_KONGMING = 42;
    public static final byte TYPE_KONGMING_L = 43;
    public static final byte TYPE_KONGMING_LITE = 55;
    public static final byte TYPE_KONGMING_PRO = 44;
    public static final byte TYPE_KONGMING_PRO_L = 54;
    public static final byte TYPE_LISBON = 47;
    public static final byte TYPE_LISBON_W = 46;
    public static final byte TYPE_MILI_PRO = 8;
    public static final byte TYPE_ONYX = 38;
    public static final byte TYPE_ONYX_W = 50;
    public static final byte TYPE_OSPREY = 40;
    public static final byte TYPE_OSPREY_W = 49;
    public static final byte TYPE_PANGU = 56;
    public static final byte TYPE_PANGU_L = 57;
    public static final byte TYPE_PEYTO_WL = 21;
    public static final byte TYPE_PYH = 17;
    public static final byte TYPE_PYHW = 18;
    public static final byte TYPE_RIO = 15;
    public static final byte TYPE_TEMPO = 2;
    public static final byte TYPE_TOKYO = 53;
    public static final byte TYPE_TONLESAP = 11;
    public static final byte TYPE_TONLESAP_L = 12;
    public static final byte TYPE_TONLESAP_O = 13;
    public static final byte TYPE_TONLESAP_OL = 14;
    public static final byte TYPE_VENICE = 51;
    public static final byte TYPE_VENICE_W = 52;
    public static final byte TYPE_VULTURE = 37;
    public static final byte TYPE_WUHAN = 3;
    public static final byte TYPE_YORK = 45;
    private int b;

    public enum AppType {
        DIAL,
        STATUS,
        SPORT,
        WEATHER,
        ALARM,
        TIMER,
        COMPASS,
        SETTING,
        ALIPAY;

        public int getValue() {
            return ordinal();
        }
    }

    public enum AppTypeBeats {
        DIAL,
        STATUS,
        NOTIFICATION,
        SPORT,
        WEATHER,
        ALARM,
        TIMER,
        SETTING,
        ALIPAY,
        MUSIC,
        NFC,
        PAI;

        public int getValue() {
            return ordinal();
        }
    }

    public enum AppTypeBeatsP {
        DIAL,
        STATUS,
        NOTIFICATION,
        SPORT,
        WEATHER,
        ALARM,
        TIMER,
        SETTING,
        ALIPAY,
        MUSIC,
        NFC;

        public int getValue() {
            return ordinal();
        }
    }

    public enum AppTypeBeatsW {
        DIAL,
        STATUS,
        NOTIFICATION,
        SPORT,
        WEATHER,
        ALARM,
        TIMER,
        SETTING,
        ALIPAY,
        MUSIC,
        PAI;

        public int getValue() {
            return ordinal();
        }
    }

    public enum AppTypeChaohuL {
        DIAL,
        STATUS,
        SPORT,
        WEATHER,
        ALARM,
        TIMER,
        COMPASS,
        SETTING,
        ALIPAY;

        public int getValue() {
            return ordinal();
        }
    }

    public enum AppTypeChongqing {
        DIAL,
        NOTIFICATION,
        WEATHER,
        SPORT,
        SETTING,
        STATUS,
        HR,
        NFC,
        TIMER;

        public int getValue() {
            return ordinal();
        }
    }

    public enum AppTypeDTH {
        DIAL,
        STATUS,
        SPORT,
        WEATHER,
        ALARM,
        TIMER,
        COMPASS,
        SETTING,
        ALIPAY,
        MUSIC,
        NFC;

        public int getValue() {
            return ordinal();
        }
    }

    public enum AppTypeMiliPro {
        TIME,
        STEP,
        MILEAGE,
        CALORIES,
        HEART_RATE,
        BATTERY;

        public int getValue() {
            return ordinal();
        }
    }

    public enum AppTypeRio {
        DIAL,
        STATUS,
        WEATHER,
        SPORT,
        NOTIFICATION,
        TIMER,
        SETTINGS;

        public int getValue() {
            return ordinal();
        }
    }

    public enum AppTypeTempo {
        DIAL,
        STATUS,
        NOTIFICATION,
        SPORT,
        WEATHER,
        ALARM,
        TIMER,
        SETTING,
        ALIPAY,
        MUSIC;

        public int getValue() {
            return ordinal();
        }
    }

    public enum AppTypeWuhan {
        DIAL,
        NOTIFICATION,
        WEATHER,
        SPORT,
        SETTING,
        STATUS,
        HR,
        TIMER;

        public static AppTypeWuhan fromValue(int value) {
            for (AppTypeWuhan appTypeWuhan : values()) {
                if (value == appTypeWuhan.getValue()) {
                    return appTypeWuhan;
                }
            }
            return null;
        }

        public int getValue() {
            return ordinal();
        }
    }

    public HMDisplaySetting() {
        this(1, false);
    }

    private void A(boolean isLow) {
        this.sparseArrayApps.put(1, new AppItem(255, 1, 0, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 1, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 2, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 3, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 4, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 5, true));
        this.sparseArrayApps.put(27, new AppItem(255, 27, 6, true));
        int i = 7;
        if (!isLow) {
            this.sparseArrayApps.put(22, new AppItem(255, 22, 7, true));
            i = 8;
        }
        int i2 = i + 1;
        this.sparseArrayApps.put(11, new AppItem(255, 11, i, true));
        this.sparseArrayApps.put(26, new AppItem(255, 26, i2, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, i2 + 1, true));
    }

    private void B() {
        this.sparseArrayApps.put(3, new AppItem(255, 3, 0, true));
        this.sparseArrayApps.put(33, new AppItem(255, 33, 1, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 2, true));
        this.sparseArrayApps.put(36, new AppItem(255, 36, 3, true));
        this.sparseArrayApps.put(28, new AppItem(255, 28, 4, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 5, true));
        this.sparseArrayApps.put(21, new AppItem(255, 21, 6, true));
        this.sparseArrayApps.put(16, new AppItem(255, 16, 7, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 8, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, 9, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, 10, true));
    }

    private void C() {
        this.sparseArrayApps.put(3, new AppItem(255, 3, 0, true));
        this.sparseArrayApps.put(33, new AppItem(255, 33, 1, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 2, true));
        this.sparseArrayApps.put(36, new AppItem(255, 36, 3, true));
        this.sparseArrayApps.put(28, new AppItem(255, 28, 4, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 5, true));
        this.sparseArrayApps.put(21, new AppItem(255, 21, 6, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 7, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, 8, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, 9, true));
    }

    private void D() {
        this.sparseArrayApps.put(1, new AppItem(255, 1, 0, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 1, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 2, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 3, true));
        this.sparseArrayApps.put(20, new AppItem(255, 20, 4, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 5, true));
        this.sparseArrayApps.put(11, new AppItem(255, 11, 6, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 7, true));
        this.sparseArrayApps.put(21, new AppItem(255, 21, 8, true));
        this.sparseArrayApps.put(17, new AppItem(255, 17, 9, true));
        this.sparseArrayApps.put(12, new AppItem(255, 12, 10, true));
        this.sparseArrayApps.put(13, new AppItem(255, 13, 11, true));
        this.sparseArrayApps.put(14, new AppItem(255, 14, 12, true));
        this.sparseArrayApps.put(22, new AppItem(255, 22, 13, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, 14, true));
    }

    private void E() {
        SparseArray<AppItem> sparseArray = this.sparseArrayApps;
        AppTypeWuhan appTypeWuhan = AppTypeWuhan.DIAL;
        sparseArray.put(appTypeWuhan.getValue(), new AppItem(appTypeWuhan.getValue(), 0, true));
        SparseArray<AppItem> sparseArray2 = this.sparseArrayApps;
        AppTypeWuhan appTypeWuhan2 = AppTypeWuhan.STATUS;
        sparseArray2.put(appTypeWuhan2.getValue(), new AppItem(appTypeWuhan2.getValue(), 1, true));
        SparseArray<AppItem> sparseArray3 = this.sparseArrayApps;
        AppTypeWuhan appTypeWuhan3 = AppTypeWuhan.HR;
        sparseArray3.put(appTypeWuhan3.getValue(), new AppItem(appTypeWuhan3.getValue(), 2, true));
        SparseArray<AppItem> sparseArray4 = this.sparseArrayApps;
        AppTypeWuhan appTypeWuhan4 = AppTypeWuhan.WEATHER;
        sparseArray4.put(appTypeWuhan4.getValue(), new AppItem(appTypeWuhan4.getValue(), 3, true));
        SparseArray<AppItem> sparseArray5 = this.sparseArrayApps;
        AppTypeWuhan appTypeWuhan5 = AppTypeWuhan.SPORT;
        sparseArray5.put(appTypeWuhan5.getValue(), new AppItem(appTypeWuhan5.getValue(), 4, true));
        SparseArray<AppItem> sparseArray6 = this.sparseArrayApps;
        AppTypeWuhan appTypeWuhan6 = AppTypeWuhan.NOTIFICATION;
        sparseArray6.put(appTypeWuhan6.getValue(), new AppItem(appTypeWuhan6.getValue(), 5, true));
        SparseArray<AppItem> sparseArray7 = this.sparseArrayApps;
        AppTypeWuhan appTypeWuhan7 = AppTypeWuhan.SETTING;
        sparseArray7.put(appTypeWuhan7.getValue(), new AppItem(appTypeWuhan7.getValue(), 6, true));
    }

    private void F() {
        this.sparseArrayApps.put(18, new AppItem(255, 18, 0, true));
        this.sparseArrayApps.put(1, new AppItem(255, 1, 1, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 2, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 3, true));
        this.sparseArrayApps.put(36, new AppItem(255, 36, 4, true));
        this.sparseArrayApps.put(6, new AppItem(255, 6, 5, true));
        this.sparseArrayApps.put(28, new AppItem(255, 28, 6, true));
        this.sparseArrayApps.put(51, new AppItem(255, 51, 7, true));
        this.sparseArrayApps.put(29, new AppItem(255, 29, 8, true));
        this.sparseArrayApps.put(21, new AppItem(255, 21, 9, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 10, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 11, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, 12, true));
    }

    private void a() {
        this.sparseArrayApps.put(1, new AppItem(255, 1, 0, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 1, true));
        this.sparseArrayApps.put(17, new AppItem(17, 2, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 3, false));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 4, false));
        this.sparseArrayApps.put(12, new AppItem(255, 12, 5, false));
        this.sparseArrayApps.put(13, new AppItem(255, 13, 6, false));
        this.sparseArrayApps.put(30, new AppItem(255, 30, 7, false));
        this.sparseArrayApps.put(11, new AppItem(255, 11, 8, false));
    }

    private void b() {
        SparseArray<AppItem> sparseArray = this.sparseArrayApps;
        AppType appType = AppType.DIAL;
        sparseArray.put(appType.getValue(), new AppItem(appType.getValue(), 0, true));
        SparseArray<AppItem> sparseArray2 = this.sparseArrayApps;
        AppType appType2 = AppType.STATUS;
        sparseArray2.put(appType2.getValue(), new AppItem(appType2.getValue(), 1, true));
        SparseArray<AppItem> sparseArray3 = this.sparseArrayApps;
        AppType appType3 = AppType.SPORT;
        sparseArray3.put(appType3.getValue(), new AppItem(appType3.getValue(), 2, true));
        SparseArray<AppItem> sparseArray4 = this.sparseArrayApps;
        AppType appType4 = AppType.WEATHER;
        sparseArray4.put(appType4.getValue(), new AppItem(appType4.getValue(), 3, true));
        SparseArray<AppItem> sparseArray5 = this.sparseArrayApps;
        AppType appType5 = AppType.ALIPAY;
        sparseArray5.put(appType5.getValue(), new AppItem(appType5.getValue(), 4, true));
        SparseArray<AppItem> sparseArray6 = this.sparseArrayApps;
        AppType appType6 = AppType.ALARM;
        sparseArray6.put(appType6.getValue(), new AppItem(appType6.getValue(), 5, true));
        SparseArray<AppItem> sparseArray7 = this.sparseArrayApps;
        AppType appType7 = AppType.TIMER;
        sparseArray7.put(appType7.getValue(), new AppItem(appType7.getValue(), 6, true));
        SparseArray<AppItem> sparseArray8 = this.sparseArrayApps;
        AppType appType8 = AppType.COMPASS;
        sparseArray8.put(appType8.getValue(), new AppItem(appType8.getValue(), 7, true));
        SparseArray<AppItem> sparseArray9 = this.sparseArrayApps;
        AppType appType9 = AppType.SETTING;
        sparseArray9.put(appType9.getValue(), new AppItem(appType9.getValue(), 8, true));
    }

    private void c() {
        this.sparseArrayApps.put(18, new AppItem(255, 18, 0, true));
        this.sparseArrayApps.put(1, new AppItem(255, 1, 1, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 2, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 3, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 4, true));
        this.sparseArrayApps.put(6, new AppItem(255, 6, 5, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, 6, true));
    }

    private void d() {
        int i;
        SparseArray<AppItem> sparseArray = this.sparseArrayApps;
        AppTypeBeats appTypeBeats = AppTypeBeats.DIAL;
        sparseArray.put(appTypeBeats.getValue(), new AppItem(appTypeBeats.getValue(), 0, true));
        if (SUPPORT_PAI) {
            i = 2;
            this.sparseArrayApps.put(AppTypeBeats.PAI.getValue(), new AppItem(appTypeBeats.getValue(), 1, true));
        } else {
            i = 1;
        }
        SparseArray<AppItem> sparseArray2 = this.sparseArrayApps;
        AppTypeBeats appTypeBeats2 = AppTypeBeats.STATUS;
        int i2 = i + 1;
        sparseArray2.put(appTypeBeats2.getValue(), new AppItem(appTypeBeats2.getValue(), i, true));
        SparseArray<AppItem> sparseArray3 = this.sparseArrayApps;
        AppTypeBeats appTypeBeats3 = AppTypeBeats.NOTIFICATION;
        int i3 = i2 + 1;
        sparseArray3.put(appTypeBeats3.getValue(), new AppItem(appTypeBeats3.getValue(), i2, true));
        SparseArray<AppItem> sparseArray4 = this.sparseArrayApps;
        AppTypeBeats appTypeBeats4 = AppTypeBeats.SPORT;
        int i4 = i3 + 1;
        sparseArray4.put(appTypeBeats4.getValue(), new AppItem(appTypeBeats4.getValue(), i3, true));
        SparseArray<AppItem> sparseArray5 = this.sparseArrayApps;
        AppTypeBeats appTypeBeats5 = AppTypeBeats.WEATHER;
        int i5 = i4 + 1;
        sparseArray5.put(appTypeBeats5.getValue(), new AppItem(appTypeBeats5.getValue(), i4, true));
        SparseArray<AppItem> sparseArray6 = this.sparseArrayApps;
        AppTypeBeats appTypeBeats6 = AppTypeBeats.ALIPAY;
        int i6 = i5 + 1;
        sparseArray6.put(appTypeBeats6.getValue(), new AppItem(appTypeBeats6.getValue(), i5, true));
        SparseArray<AppItem> sparseArray7 = this.sparseArrayApps;
        AppTypeBeats appTypeBeats7 = AppTypeBeats.ALARM;
        int i7 = i6 + 1;
        sparseArray7.put(appTypeBeats7.getValue(), new AppItem(appTypeBeats7.getValue(), i6, true));
        SparseArray<AppItem> sparseArray8 = this.sparseArrayApps;
        AppTypeBeats appTypeBeats8 = AppTypeBeats.TIMER;
        int i8 = i7 + 1;
        sparseArray8.put(appTypeBeats8.getValue(), new AppItem(appTypeBeats8.getValue(), i7, true));
        SparseArray<AppItem> sparseArray9 = this.sparseArrayApps;
        AppTypeBeats appTypeBeats9 = AppTypeBeats.MUSIC;
        int i9 = i8 + 1;
        sparseArray9.put(appTypeBeats9.getValue(), new AppItem(appTypeBeats9.getValue(), i8, true));
        SparseArray<AppItem> sparseArray10 = this.sparseArrayApps;
        AppTypeBeats appTypeBeats10 = AppTypeBeats.NFC;
        sparseArray10.put(appTypeBeats10.getValue(), new AppItem(appTypeBeats10.getValue(), i9, true));
        SparseArray<AppItem> sparseArray11 = this.sparseArrayApps;
        AppTypeBeats appTypeBeats11 = AppTypeBeats.SETTING;
        sparseArray11.put(appTypeBeats11.getValue(), new AppItem(appTypeBeats11.getValue(), i9 + 1, true));
    }

    private void e() {
        SparseArray<AppItem> sparseArray = this.sparseArrayApps;
        AppTypeBeatsP appTypeBeatsP = AppTypeBeatsP.DIAL;
        sparseArray.put(appTypeBeatsP.getValue(), new AppItem(appTypeBeatsP.getValue(), 0, true));
        SparseArray<AppItem> sparseArray2 = this.sparseArrayApps;
        AppTypeBeatsP appTypeBeatsP2 = AppTypeBeatsP.STATUS;
        sparseArray2.put(appTypeBeatsP2.getValue(), new AppItem(appTypeBeatsP2.getValue(), 1, true));
        SparseArray<AppItem> sparseArray3 = this.sparseArrayApps;
        AppTypeBeatsP appTypeBeatsP3 = AppTypeBeatsP.NOTIFICATION;
        sparseArray3.put(appTypeBeatsP3.getValue(), new AppItem(appTypeBeatsP3.getValue(), 2, true));
        SparseArray<AppItem> sparseArray4 = this.sparseArrayApps;
        AppTypeBeatsP appTypeBeatsP4 = AppTypeBeatsP.SPORT;
        sparseArray4.put(appTypeBeatsP4.getValue(), new AppItem(appTypeBeatsP4.getValue(), 3, true));
        SparseArray<AppItem> sparseArray5 = this.sparseArrayApps;
        AppTypeBeatsP appTypeBeatsP5 = AppTypeBeatsP.WEATHER;
        sparseArray5.put(appTypeBeatsP5.getValue(), new AppItem(appTypeBeatsP5.getValue(), 4, true));
        SparseArray<AppItem> sparseArray6 = this.sparseArrayApps;
        AppTypeBeatsP appTypeBeatsP6 = AppTypeBeatsP.ALIPAY;
        sparseArray6.put(appTypeBeatsP6.getValue(), new AppItem(appTypeBeatsP6.getValue(), 5, true));
        SparseArray<AppItem> sparseArray7 = this.sparseArrayApps;
        AppTypeBeatsP appTypeBeatsP7 = AppTypeBeatsP.ALARM;
        sparseArray7.put(appTypeBeatsP7.getValue(), new AppItem(appTypeBeatsP7.getValue(), 6, true));
        SparseArray<AppItem> sparseArray8 = this.sparseArrayApps;
        AppTypeBeatsP appTypeBeatsP8 = AppTypeBeatsP.TIMER;
        sparseArray8.put(appTypeBeatsP8.getValue(), new AppItem(appTypeBeatsP8.getValue(), 7, true));
        SparseArray<AppItem> sparseArray9 = this.sparseArrayApps;
        AppTypeBeatsP appTypeBeatsP9 = AppTypeBeatsP.MUSIC;
        sparseArray9.put(appTypeBeatsP9.getValue(), new AppItem(appTypeBeatsP9.getValue(), 8, true));
        SparseArray<AppItem> sparseArray10 = this.sparseArrayApps;
        AppTypeBeatsP appTypeBeatsP10 = AppTypeBeatsP.NFC;
        sparseArray10.put(appTypeBeatsP10.getValue(), new AppItem(appTypeBeatsP10.getValue(), 9, true));
        SparseArray<AppItem> sparseArray11 = this.sparseArrayApps;
        AppTypeBeatsP appTypeBeatsP11 = AppTypeBeatsP.SETTING;
        sparseArray11.put(appTypeBeatsP11.getValue(), new AppItem(appTypeBeatsP11.getValue(), 10, true));
    }

    private void f() {
        int i;
        SparseArray<AppItem> sparseArray = this.sparseArrayApps;
        AppTypeBeatsW appTypeBeatsW = AppTypeBeatsW.DIAL;
        sparseArray.put(appTypeBeatsW.getValue(), new AppItem(appTypeBeatsW.getValue(), 0, true));
        if (SUPPORT_PAI) {
            SparseArray<AppItem> sparseArray2 = this.sparseArrayApps;
            AppTypeBeatsW appTypeBeatsW2 = AppTypeBeatsW.PAI;
            i = 2;
            sparseArray2.put(appTypeBeatsW2.getValue(), new AppItem(appTypeBeatsW2.getValue(), 1, true));
        } else {
            i = 1;
        }
        SparseArray<AppItem> sparseArray3 = this.sparseArrayApps;
        AppTypeBeatsW appTypeBeatsW3 = AppTypeBeatsW.STATUS;
        int i2 = i + 1;
        sparseArray3.put(appTypeBeatsW3.getValue(), new AppItem(appTypeBeatsW3.getValue(), i, true));
        SparseArray<AppItem> sparseArray4 = this.sparseArrayApps;
        AppTypeBeatsW appTypeBeatsW4 = AppTypeBeatsW.NOTIFICATION;
        int i3 = i2 + 1;
        sparseArray4.put(appTypeBeatsW4.getValue(), new AppItem(appTypeBeatsW4.getValue(), i2, true));
        SparseArray<AppItem> sparseArray5 = this.sparseArrayApps;
        AppTypeBeatsW appTypeBeatsW5 = AppTypeBeatsW.SPORT;
        int i4 = i3 + 1;
        sparseArray5.put(appTypeBeatsW5.getValue(), new AppItem(appTypeBeatsW5.getValue(), i3, true));
        SparseArray<AppItem> sparseArray6 = this.sparseArrayApps;
        AppTypeBeatsW appTypeBeatsW6 = AppTypeBeatsW.WEATHER;
        int i5 = i4 + 1;
        sparseArray6.put(appTypeBeatsW6.getValue(), new AppItem(appTypeBeatsW6.getValue(), i4, true));
        SparseArray<AppItem> sparseArray7 = this.sparseArrayApps;
        AppTypeBeatsW appTypeBeatsW7 = AppTypeBeatsW.ALIPAY;
        int i6 = i5 + 1;
        sparseArray7.put(appTypeBeatsW7.getValue(), new AppItem(appTypeBeatsW7.getValue(), i5, true));
        SparseArray<AppItem> sparseArray8 = this.sparseArrayApps;
        AppTypeBeatsW appTypeBeatsW8 = AppTypeBeatsW.ALARM;
        int i7 = i6 + 1;
        sparseArray8.put(appTypeBeatsW8.getValue(), new AppItem(appTypeBeatsW8.getValue(), i6, true));
        SparseArray<AppItem> sparseArray9 = this.sparseArrayApps;
        AppTypeBeatsW appTypeBeatsW9 = AppTypeBeatsW.TIMER;
        int i8 = i7 + 1;
        sparseArray9.put(appTypeBeatsW9.getValue(), new AppItem(appTypeBeatsW9.getValue(), i7, true));
        SparseArray<AppItem> sparseArray10 = this.sparseArrayApps;
        AppTypeBeatsW appTypeBeatsW10 = AppTypeBeatsW.MUSIC;
        sparseArray10.put(appTypeBeatsW10.getValue(), new AppItem(appTypeBeatsW10.getValue(), i8, true));
        SparseArray<AppItem> sparseArray11 = this.sparseArrayApps;
        AppTypeBeatsW appTypeBeatsW11 = AppTypeBeatsW.SETTING;
        sparseArray11.put(appTypeBeatsW11.getValue(), new AppItem(appTypeBeatsW11.getValue(), i8 + 1, true));
    }

    private void g() {
        SparseArray<AppItem> sparseArray = this.sparseArrayApps;
        AppTypeChaohuL appTypeChaohuL = AppTypeChaohuL.DIAL;
        sparseArray.put(appTypeChaohuL.getValue(), new AppItem(appTypeChaohuL.getValue(), 0, true));
        SparseArray<AppItem> sparseArray2 = this.sparseArrayApps;
        AppTypeChaohuL appTypeChaohuL2 = AppTypeChaohuL.STATUS;
        sparseArray2.put(appTypeChaohuL2.getValue(), new AppItem(appTypeChaohuL2.getValue(), 1, true));
        SparseArray<AppItem> sparseArray3 = this.sparseArrayApps;
        AppTypeChaohuL appTypeChaohuL3 = AppTypeChaohuL.SPORT;
        sparseArray3.put(appTypeChaohuL3.getValue(), new AppItem(appTypeChaohuL3.getValue(), 2, true));
        SparseArray<AppItem> sparseArray4 = this.sparseArrayApps;
        AppTypeChaohuL appTypeChaohuL4 = AppTypeChaohuL.WEATHER;
        sparseArray4.put(appTypeChaohuL4.getValue(), new AppItem(appTypeChaohuL4.getValue(), 3, true));
        SparseArray<AppItem> sparseArray5 = this.sparseArrayApps;
        AppTypeChaohuL appTypeChaohuL5 = AppTypeChaohuL.ALIPAY;
        sparseArray5.put(appTypeChaohuL5.getValue(), new AppItem(appTypeChaohuL5.getValue(), 4, true));
        SparseArray<AppItem> sparseArray6 = this.sparseArrayApps;
        AppTypeChaohuL appTypeChaohuL6 = AppTypeChaohuL.ALARM;
        sparseArray6.put(appTypeChaohuL6.getValue(), new AppItem(appTypeChaohuL6.getValue(), 5, true));
        SparseArray<AppItem> sparseArray7 = this.sparseArrayApps;
        AppTypeChaohuL appTypeChaohuL7 = AppTypeChaohuL.TIMER;
        sparseArray7.put(appTypeChaohuL7.getValue(), new AppItem(appTypeChaohuL7.getValue(), 6, true));
        SparseArray<AppItem> sparseArray8 = this.sparseArrayApps;
        AppTypeChaohuL appTypeChaohuL8 = AppTypeChaohuL.COMPASS;
        sparseArray8.put(appTypeChaohuL8.getValue(), new AppItem(appTypeChaohuL8.getValue(), 7, true));
        SparseArray<AppItem> sparseArray9 = this.sparseArrayApps;
        AppTypeChaohuL appTypeChaohuL9 = AppTypeChaohuL.SETTING;
        sparseArray9.put(appTypeChaohuL9.getValue(), new AppItem(appTypeChaohuL9.getValue(), 8, true));
    }

    private void h() {
        SparseArray<AppItem> sparseArray = this.sparseArrayApps;
        AppTypeChongqing appTypeChongqing = AppTypeChongqing.DIAL;
        sparseArray.put(appTypeChongqing.getValue(), new AppItem(appTypeChongqing.getValue(), 0, true));
        SparseArray<AppItem> sparseArray2 = this.sparseArrayApps;
        AppTypeChongqing appTypeChongqing2 = AppTypeChongqing.STATUS;
        sparseArray2.put(appTypeChongqing2.getValue(), new AppItem(appTypeChongqing2.getValue(), 1, true));
        SparseArray<AppItem> sparseArray3 = this.sparseArrayApps;
        AppTypeChongqing appTypeChongqing3 = AppTypeChongqing.HR;
        sparseArray3.put(appTypeChongqing3.getValue(), new AppItem(appTypeChongqing3.getValue(), 2, true));
        SparseArray<AppItem> sparseArray4 = this.sparseArrayApps;
        AppTypeChongqing appTypeChongqing4 = AppTypeChongqing.WEATHER;
        sparseArray4.put(appTypeChongqing4.getValue(), new AppItem(appTypeChongqing4.getValue(), 3, true));
        SparseArray<AppItem> sparseArray5 = this.sparseArrayApps;
        AppTypeChongqing appTypeChongqing5 = AppTypeChongqing.SPORT;
        sparseArray5.put(appTypeChongqing5.getValue(), new AppItem(appTypeChongqing5.getValue(), 4, true));
        SparseArray<AppItem> sparseArray6 = this.sparseArrayApps;
        AppTypeChongqing appTypeChongqing6 = AppTypeChongqing.NOTIFICATION;
        sparseArray6.put(appTypeChongqing6.getValue(), new AppItem(appTypeChongqing6.getValue(), 5, true));
        SparseArray<AppItem> sparseArray7 = this.sparseArrayApps;
        AppTypeChongqing appTypeChongqing7 = AppTypeChongqing.SETTING;
        sparseArray7.put(appTypeChongqing7.getValue(), new AppItem(appTypeChongqing7.getValue(), 6, true));
        SparseArray<AppItem> sparseArray8 = this.sparseArrayApps;
        AppTypeChongqing appTypeChongqing8 = AppTypeChongqing.NFC;
        sparseArray8.put(appTypeChongqing8.getValue(), new AppItem(appTypeChongqing8.getValue(), 7, true));
    }

    private void i() {
        int i;
        this.sparseArrayApps.put(18, new AppItem(255, 18, 0, true));
        if (SUPPORT_CINCO_PAI) {
            this.sparseArrayApps.put(25, new AppItem(255, 25, 1, true));
            i = 2;
        } else {
            i = 1;
        }
        int i2 = i + 1;
        this.sparseArrayApps.put(1, new AppItem(255, 1, i, true));
        int i3 = i2 + 1;
        this.sparseArrayApps.put(2, new AppItem(255, 2, i2, true));
        int i4 = i3 + 1;
        this.sparseArrayApps.put(16, new AppItem(255, 16, i3, true));
        int i5 = i4 + 1;
        this.sparseArrayApps.put(3, new AppItem(255, 3, i4, true));
        int i6 = i5 + 1;
        this.sparseArrayApps.put(4, new AppItem(255, 4, i5, true));
        this.sparseArrayApps.put(6, new AppItem(255, 6, i6, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, i6 + 1, true));
    }

    private void j() {
        int i;
        this.sparseArrayApps.put(18, new AppItem(255, 18, 0, true));
        if (SUPPORT_CINCO_PAI) {
            this.sparseArrayApps.put(25, new AppItem(255, 25, 1, true));
            i = 2;
        } else {
            i = 1;
        }
        int i2 = i + 1;
        this.sparseArrayApps.put(1, new AppItem(255, 1, i, true));
        int i3 = i2 + 1;
        this.sparseArrayApps.put(2, new AppItem(255, 2, i2, true));
        int i4 = i3 + 1;
        this.sparseArrayApps.put(3, new AppItem(255, 3, i3, true));
        int i5 = i4 + 1;
        this.sparseArrayApps.put(4, new AppItem(255, 4, i4, true));
        this.sparseArrayApps.put(6, new AppItem(255, 6, i5, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, i5 + 1, true));
    }

    private void k(boolean oversea) {
        this.sparseArrayApps.put(33, new AppItem(255, 33, 0, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 1, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 2, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 3, true));
        this.sparseArrayApps.put(20, new AppItem(255, 20, 4, true));
        this.sparseArrayApps.put(35, new AppItem(255, 35, 5, true));
        this.sparseArrayApps.put(28, new AppItem(255, 28, 6, true));
        this.sparseArrayApps.put(36, new AppItem(255, 36, 7, true));
        this.sparseArrayApps.put(29, new AppItem(255, 29, 8, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 9, true));
        this.sparseArrayApps.put(11, new AppItem(255, 11, 10, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 11, true));
        this.sparseArrayApps.put(38, new AppItem(255, 38, 12, true));
        this.sparseArrayApps.put(39, new AppItem(255, 39, 13, true));
        int i = 14;
        if (!oversea) {
            this.sparseArrayApps.put(16, new AppItem(255, 16, 14, true));
            i = 15;
        }
        this.sparseArrayApps.put(40, new AppItem(255, 40, i, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, i + 1, true));
    }

    private void l() {
        this.sparseArrayApps.put(1, new AppItem(255, 1, 0, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 1, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 2, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 3, true));
        this.sparseArrayApps.put(17, new AppItem(255, 17, 4, true));
        this.sparseArrayApps.put(16, new AppItem(255, 16, 5, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 6, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 7, true));
        this.sparseArrayApps.put(27, new AppItem(255, 27, 8, true));
        this.sparseArrayApps.put(22, new AppItem(255, 22, 9, true));
        this.sparseArrayApps.put(11, new AppItem(255, 11, 10, true));
        this.sparseArrayApps.put(26, new AppItem(255, 26, 11, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, 12, true));
    }

    private void m(boolean supportPAI) {
        int i;
        this.sparseArrayApps.put(1, new AppItem(255, 1, 0, true));
        if (supportPAI) {
            this.sparseArrayApps.put(25, new AppItem(255, 25, 1, true));
            i = 2;
        } else {
            i = 1;
        }
        int i2 = i + 1;
        this.sparseArrayApps.put(2, new AppItem(255, 2, i, true));
        int i3 = i2 + 1;
        this.sparseArrayApps.put(3, new AppItem(255, 3, i2, true));
        int i4 = i3 + 1;
        this.sparseArrayApps.put(20, new AppItem(255, 20, i3, true));
        int i5 = i4 + 1;
        this.sparseArrayApps.put(4, new AppItem(255, 4, i4, true));
        int i6 = i5 + 1;
        this.sparseArrayApps.put(11, new AppItem(255, 11, i5, true));
        int i7 = i6 + 1;
        this.sparseArrayApps.put(6, new AppItem(255, 6, i6, true));
        int i8 = i7 + 1;
        this.sparseArrayApps.put(9, new AppItem(255, 9, i7, true));
        int i9 = i8 + 1;
        this.sparseArrayApps.put(21, new AppItem(255, 21, i8, true));
        int i10 = i9 + 1;
        this.sparseArrayApps.put(16, new AppItem(255, 16, i9, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, i10, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, i10 + 1, true));
    }

    private void n(boolean supportPAI) {
        int i;
        this.sparseArrayApps.put(1, new AppItem(255, 1, 0, true));
        if (supportPAI) {
            this.sparseArrayApps.put(25, new AppItem(255, 25, 1, true));
            i = 2;
        } else {
            i = 1;
        }
        int i2 = i + 1;
        this.sparseArrayApps.put(2, new AppItem(255, 2, i, true));
        int i3 = i2 + 1;
        this.sparseArrayApps.put(3, new AppItem(255, 3, i2, true));
        int i4 = i3 + 1;
        this.sparseArrayApps.put(20, new AppItem(255, 20, i3, true));
        int i5 = i4 + 1;
        this.sparseArrayApps.put(4, new AppItem(255, 4, i4, true));
        int i6 = i5 + 1;
        this.sparseArrayApps.put(11, new AppItem(255, 11, i5, true));
        int i7 = i6 + 1;
        this.sparseArrayApps.put(6, new AppItem(255, 6, i6, true));
        int i8 = i7 + 1;
        this.sparseArrayApps.put(9, new AppItem(255, 9, i7, true));
        int i9 = i8 + 1;
        this.sparseArrayApps.put(21, new AppItem(255, 21, i8, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, i9, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, i9 + 1, true));
    }

    private void o() {
        this.sparseArrayApps.put(18, new AppItem(255, 18, 0, true));
        this.sparseArrayApps.put(1, new AppItem(255, 1, 1, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 2, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 3, true));
        this.sparseArrayApps.put(6, new AppItem(255, 6, 4, true));
        this.sparseArrayApps.put(28, new AppItem(255, 28, 5, true));
        this.sparseArrayApps.put(51, new AppItem(255, 51, 6, true));
        this.sparseArrayApps.put(29, new AppItem(255, 29, 7, true));
        this.sparseArrayApps.put(21, new AppItem(255, 21, 8, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 9, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 10, true));
        this.sparseArrayApps.put(16, new AppItem(255, 16, 11, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, 12, true));
    }

    private void p() {
        this.sparseArrayApps.put(18, new AppItem(255, 18, 0, true));
        this.sparseArrayApps.put(1, new AppItem(255, 1, 1, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 2, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 3, true));
        this.sparseArrayApps.put(6, new AppItem(255, 6, 4, true));
        this.sparseArrayApps.put(28, new AppItem(255, 28, 5, true));
        this.sparseArrayApps.put(51, new AppItem(255, 51, 6, true));
        this.sparseArrayApps.put(29, new AppItem(255, 29, 7, true));
        this.sparseArrayApps.put(21, new AppItem(255, 21, 8, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 9, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 10, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, 11, true));
    }

    private void q(boolean isHigh) {
        this.sparseArrayApps.put(18, new AppItem(255, 18, 0, true));
        this.sparseArrayApps.put(1, new AppItem(255, 1, 1, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 2, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 3, true));
        this.sparseArrayApps.put(36, new AppItem(255, 36, 4, true));
        this.sparseArrayApps.put(6, new AppItem(255, 6, 5, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 6, true));
        this.sparseArrayApps.put(20, new AppItem(255, 20, 7, true));
        this.sparseArrayApps.put(30, new AppItem(255, 30, 8, true));
        this.sparseArrayApps.put(28, new AppItem(255, 28, 9, true));
        this.sparseArrayApps.put(51, new AppItem(255, 51, 10, true));
        this.sparseArrayApps.put(29, new AppItem(255, 29, 11, true));
        this.sparseArrayApps.put(21, new AppItem(255, 21, 12, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 13, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 14, true));
        this.sparseArrayApps.put(17, new AppItem(255, 17, 15, true));
        this.sparseArrayApps.put(11, new AppItem(255, 11, 16, true));
        this.sparseArrayApps.put(32, new AppItem(255, 32, 17, true));
        this.sparseArrayApps.put(26, new AppItem(255, 26, 18, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, 19, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, 20, true));
        this.sparseArrayApps.put(10, new AppItem(7, 10, 21, true));
        this.sparseArrayApps.put(12, new AppItem(7, 12, 22, true));
        this.sparseArrayApps.put(13, new AppItem(7, 13, 23, true));
        this.sparseArrayApps.put(14, new AppItem(7, 14, 24, true));
        this.sparseArrayApps.put(15, new AppItem(7, 15, 25, true));
        this.sparseArrayApps.put(31, new AppItem(7, 31, 26, true));
        if (isHigh) {
            this.sparseArrayApps.put(16, new AppItem(7, 16, 27, true));
        }
    }

    private void r(int type) {
        this.sparseArrayApps.put(33, new AppItem(255, 33, 0, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 1, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 2, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 3, true));
        this.sparseArrayApps.put(20, new AppItem(255, 20, 4, true));
        this.sparseArrayApps.put(35, new AppItem(255, 35, 5, true));
        this.sparseArrayApps.put(28, new AppItem(255, 28, 6, true));
        this.sparseArrayApps.put(51, new AppItem(255, 51, 7, true));
        this.sparseArrayApps.put(36, new AppItem(255, 36, 8, true));
        this.sparseArrayApps.put(29, new AppItem(255, 29, 9, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 10, true));
        this.sparseArrayApps.put(11, new AppItem(255, 11, 11, true));
        this.sparseArrayApps.put(37, new AppItem(255, 37, 12, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 13, true));
        this.sparseArrayApps.put(21, new AppItem(255, 21, 14, true));
        this.sparseArrayApps.put(39, new AppItem(255, 39, 15, true));
        int i = 16;
        if (type == 47) {
            this.sparseArrayApps.put(16, new AppItem(255, 16, 16, true));
            i = 17;
        }
        this.sparseArrayApps.put(40, new AppItem(255, 40, i, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, i + 1, true));
    }

    private void s(boolean oversea) {
        this.sparseArrayApps.put(33, new AppItem(255, 33, 0, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 1, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 2, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 3, true));
        this.sparseArrayApps.put(20, new AppItem(255, 20, 4, true));
        this.sparseArrayApps.put(36, new AppItem(255, 36, 5, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 6, true));
        int i = 11;
        this.sparseArrayApps.put(11, new AppItem(255, 11, 7, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 8, true));
        this.sparseArrayApps.put(38, new AppItem(255, 38, 9, true));
        if (oversea) {
            i = 10;
        } else {
            this.sparseArrayApps.put(16, new AppItem(255, 16, 10, true));
        }
        this.sparseArrayApps.put(40, new AppItem(255, 40, i, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, i + 1, true));
    }

    private void t(int type) {
        this.sparseArrayApps.put(33, new AppItem(255, 33, 0, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 1, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 2, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 3, true));
        this.sparseArrayApps.put(20, new AppItem(255, 20, 4, true));
        this.sparseArrayApps.put(34, new AppItem(255, 34, 5, true));
        this.sparseArrayApps.put(35, new AppItem(255, 35, 6, true));
        this.sparseArrayApps.put(28, new AppItem(255, 28, 7, true));
        this.sparseArrayApps.put(36, new AppItem(255, 36, 8, true));
        this.sparseArrayApps.put(29, new AppItem(255, 29, 9, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 10, true));
        this.sparseArrayApps.put(11, new AppItem(255, 11, 11, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 12, true));
        this.sparseArrayApps.put(38, new AppItem(255, 38, 13, true));
        this.sparseArrayApps.put(39, new AppItem(255, 39, 14, true));
        this.sparseArrayApps.put(16, new AppItem(255, 16, 15, true));
        this.sparseArrayApps.put(40, new AppItem(255, 40, 16, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, 17, true));
    }

    private void u(boolean oversea) {
        int i;
        this.sparseArrayApps.put(1, new AppItem(255, 1, 0, true));
        if (!SUPPORT_PYH_PAI || oversea) {
            i = 1;
        } else {
            this.sparseArrayApps.put(25, new AppItem(255, 25, 1, true));
            i = 2;
        }
        int i2 = i + 1;
        this.sparseArrayApps.put(2, new AppItem(255, 2, i, true));
        int i3 = i2 + 1;
        this.sparseArrayApps.put(3, new AppItem(255, 3, i2, true));
        int i4 = i3 + 1;
        this.sparseArrayApps.put(20, new AppItem(255, 20, i3, true));
        int i5 = i4 + 1;
        this.sparseArrayApps.put(4, new AppItem(255, 4, i4, true));
        int i6 = i5 + 1;
        this.sparseArrayApps.put(11, new AppItem(255, 11, i5, true));
        int i7 = i6 + 1;
        this.sparseArrayApps.put(6, new AppItem(255, 6, i6, true));
        int i8 = i7 + 1;
        this.sparseArrayApps.put(9, new AppItem(255, 9, i7, true));
        int i9 = i8 + 1;
        this.sparseArrayApps.put(21, new AppItem(255, 21, i8, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, i9, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, i9 + 1, true));
    }

    private void v(boolean isHigh) {
        this.sparseArrayApps.put(18, new AppItem(255, 18, 0, true));
        this.sparseArrayApps.put(1, new AppItem(255, 1, 1, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 2, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 3, true));
        this.sparseArrayApps.put(36, new AppItem(255, 36, 4, true));
        this.sparseArrayApps.put(35, new AppItem(255, 35, 5, true));
        this.sparseArrayApps.put(6, new AppItem(255, 6, 6, true));
        this.sparseArrayApps.put(3, new AppItem(255, 3, 7, true));
        this.sparseArrayApps.put(20, new AppItem(255, 20, 8, true));
        this.sparseArrayApps.put(28, new AppItem(255, 28, 9, true));
        this.sparseArrayApps.put(51, new AppItem(255, 51, 10, true));
        this.sparseArrayApps.put(29, new AppItem(255, 29, 11, true));
        this.sparseArrayApps.put(21, new AppItem(255, 21, 12, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 13, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 14, true));
        this.sparseArrayApps.put(17, new AppItem(255, 17, 15, true));
        this.sparseArrayApps.put(49, new AppItem(255, 49, 16, true));
        this.sparseArrayApps.put(11, new AppItem(255, 11, 17, true));
        this.sparseArrayApps.put(32, new AppItem(255, 32, 18, true));
        this.sparseArrayApps.put(26, new AppItem(255, 26, 19, true));
        this.sparseArrayApps.put(19, new AppItem(255, 19, 20, true));
        this.sparseArrayApps.put(7, new AppItem(255, 7, 21, true));
        this.sparseArrayApps.put(67, new AppItem(7, 67, 22, true));
        this.sparseArrayApps.put(56, new AppItem(7, 56, 23, true));
        this.sparseArrayApps.put(10, new AppItem(7, 10, 24, true));
        this.sparseArrayApps.put(12, new AppItem(7, 12, 25, true));
        this.sparseArrayApps.put(13, new AppItem(7, 13, 26, true));
        this.sparseArrayApps.put(14, new AppItem(7, 14, 27, true));
        this.sparseArrayApps.put(15, new AppItem(7, 15, 28, true));
        if (isHigh) {
            this.sparseArrayApps.put(31, new AppItem(7, 31, 29, true));
            this.sparseArrayApps.put(16, new AppItem(7, 16, 30, true));
        }
    }

    private void w() {
        SparseArray<AppItem> sparseArray = this.sparseArrayApps;
        AppTypeRio appTypeRio = AppTypeRio.DIAL;
        sparseArray.put(appTypeRio.getValue(), new AppItem(appTypeRio.getValue(), 0, true));
        SparseArray<AppItem> sparseArray2 = this.sparseArrayApps;
        AppTypeRio appTypeRio2 = AppTypeRio.STATUS;
        sparseArray2.put(appTypeRio2.getValue(), new AppItem(appTypeRio2.getValue(), 1, true));
        SparseArray<AppItem> sparseArray3 = this.sparseArrayApps;
        AppTypeRio appTypeRio3 = AppTypeRio.WEATHER;
        sparseArray3.put(appTypeRio3.getValue(), new AppItem(appTypeRio3.getValue(), 2, true));
        SparseArray<AppItem> sparseArray4 = this.sparseArrayApps;
        AppTypeRio appTypeRio4 = AppTypeRio.SPORT;
        sparseArray4.put(appTypeRio4.getValue(), new AppItem(appTypeRio4.getValue(), 3, true));
        SparseArray<AppItem> sparseArray5 = this.sparseArrayApps;
        AppTypeRio appTypeRio5 = AppTypeRio.NOTIFICATION;
        sparseArray5.put(appTypeRio5.getValue(), new AppItem(appTypeRio5.getValue(), 4, true));
        SparseArray<AppItem> sparseArray6 = this.sparseArrayApps;
        AppTypeRio appTypeRio6 = AppTypeRio.TIMER;
        sparseArray6.put(appTypeRio6.getValue(), new AppItem(appTypeRio6.getValue(), 5, true));
        SparseArray<AppItem> sparseArray7 = this.sparseArrayApps;
        AppTypeRio appTypeRio7 = AppTypeRio.SETTINGS;
        sparseArray7.put(appTypeRio7.getValue(), new AppItem(appTypeRio7.getValue(), 6, true));
    }

    private void x() {
        SparseArray<AppItem> sparseArray = this.sparseArrayApps;
        AppTypeTempo appTypeTempo = AppTypeTempo.DIAL;
        sparseArray.put(appTypeTempo.getValue(), new AppItem(appTypeTempo.getValue(), 0, true));
        SparseArray<AppItem> sparseArray2 = this.sparseArrayApps;
        AppTypeTempo appTypeTempo2 = AppTypeTempo.STATUS;
        sparseArray2.put(appTypeTempo2.getValue(), new AppItem(appTypeTempo2.getValue(), 1, true));
        SparseArray<AppItem> sparseArray3 = this.sparseArrayApps;
        AppTypeTempo appTypeTempo3 = AppTypeTempo.NOTIFICATION;
        sparseArray3.put(appTypeTempo3.getValue(), new AppItem(appTypeTempo3.getValue(), 2, true));
        SparseArray<AppItem> sparseArray4 = this.sparseArrayApps;
        AppTypeTempo appTypeTempo4 = AppTypeTempo.SPORT;
        sparseArray4.put(appTypeTempo4.getValue(), new AppItem(appTypeTempo4.getValue(), 3, true));
        SparseArray<AppItem> sparseArray5 = this.sparseArrayApps;
        AppTypeTempo appTypeTempo5 = AppTypeTempo.WEATHER;
        sparseArray5.put(appTypeTempo5.getValue(), new AppItem(appTypeTempo5.getValue(), 4, true));
        SparseArray<AppItem> sparseArray6 = this.sparseArrayApps;
        AppTypeTempo appTypeTempo6 = AppTypeTempo.ALIPAY;
        sparseArray6.put(appTypeTempo6.getValue(), new AppItem(appTypeTempo6.getValue(), 5, true));
        SparseArray<AppItem> sparseArray7 = this.sparseArrayApps;
        AppTypeTempo appTypeTempo7 = AppTypeTempo.ALARM;
        sparseArray7.put(appTypeTempo7.getValue(), new AppItem(appTypeTempo7.getValue(), 6, true));
        SparseArray<AppItem> sparseArray8 = this.sparseArrayApps;
        AppTypeTempo appTypeTempo8 = AppTypeTempo.TIMER;
        sparseArray8.put(appTypeTempo8.getValue(), new AppItem(appTypeTempo8.getValue(), 7, true));
        SparseArray<AppItem> sparseArray9 = this.sparseArrayApps;
        AppTypeTempo appTypeTempo9 = AppTypeTempo.MUSIC;
        sparseArray9.put(appTypeTempo9.getValue(), new AppItem(appTypeTempo9.getValue(), 8, true));
        SparseArray<AppItem> sparseArray10 = this.sparseArrayApps;
        AppTypeTempo appTypeTempo10 = AppTypeTempo.SETTING;
        sparseArray10.put(appTypeTempo10.getValue(), new AppItem(appTypeTempo10.getValue(), 9, true));
    }

    private void y() {
        this.sparseArrayApps.put(52, new AppItem(255, 52, 0, true));
        this.sparseArrayApps.put(53, new AppItem(255, 53, 1, true));
        this.sparseArrayApps.put(54, new AppItem(255, 54, 2, true));
        this.sparseArrayApps.put(4, new AppItem(255, 4, 3, true));
        this.sparseArrayApps.put(8, new AppItem(255, 8, 4, true));
        this.sparseArrayApps.put(12, new AppItem(255, 12, 5, true));
        this.sparseArrayApps.put(26, new AppItem(255, 26, 6, true));
        this.sparseArrayApps.put(9, new AppItem(255, 9, 7, true));
        this.sparseArrayApps.put(25, new AppItem(255, 25, 8, true));
        this.sparseArrayApps.put(2, new AppItem(255, 2, 9, true));
        this.sparseArrayApps.put(58, new AppItem(255, 58, 10, false));
    }

    private void z(boolean isLow, boolean isForeign) {
        SparseArray<AppItem> sparseArray = this.sparseArrayApps;
        AppTypeDTH appTypeDTH = AppTypeDTH.DIAL;
        sparseArray.put(appTypeDTH.getValue(), new AppItem(appTypeDTH.getValue(), 0, true));
        SparseArray<AppItem> sparseArray2 = this.sparseArrayApps;
        AppTypeDTH appTypeDTH2 = AppTypeDTH.STATUS;
        sparseArray2.put(appTypeDTH2.getValue(), new AppItem(appTypeDTH2.getValue(), 1, true));
        SparseArray<AppItem> sparseArray3 = this.sparseArrayApps;
        AppTypeDTH appTypeDTH3 = AppTypeDTH.SPORT;
        sparseArray3.put(appTypeDTH3.getValue(), new AppItem(appTypeDTH3.getValue(), 2, true));
        SparseArray<AppItem> sparseArray4 = this.sparseArrayApps;
        AppTypeDTH appTypeDTH4 = AppTypeDTH.WEATHER;
        sparseArray4.put(appTypeDTH4.getValue(), new AppItem(appTypeDTH4.getValue(), 3, true));
        SparseArray<AppItem> sparseArray5 = this.sparseArrayApps;
        AppTypeDTH appTypeDTH5 = AppTypeDTH.ALIPAY;
        sparseArray5.put(appTypeDTH5.getValue(), new AppItem(appTypeDTH5.getValue(), 4, true));
        SparseArray<AppItem> sparseArray6 = this.sparseArrayApps;
        AppTypeDTH appTypeDTH6 = AppTypeDTH.ALARM;
        sparseArray6.put(appTypeDTH6.getValue(), new AppItem(appTypeDTH6.getValue(), 5, true));
        SparseArray<AppItem> sparseArray7 = this.sparseArrayApps;
        AppTypeDTH appTypeDTH7 = AppTypeDTH.TIMER;
        sparseArray7.put(appTypeDTH7.getValue(), new AppItem(appTypeDTH7.getValue(), 6, true));
        int i = 7;
        if (!isLow) {
            SparseArray<AppItem> sparseArray8 = this.sparseArrayApps;
            AppTypeDTH appTypeDTH8 = AppTypeDTH.COMPASS;
            sparseArray8.put(appTypeDTH8.getValue(), new AppItem(appTypeDTH8.getValue(), 7, true));
            i = 8;
        }
        SparseArray<AppItem> sparseArray9 = this.sparseArrayApps;
        AppTypeDTH appTypeDTH9 = AppTypeDTH.MUSIC;
        int i2 = i + 1;
        sparseArray9.put(appTypeDTH9.getValue(), new AppItem(appTypeDTH9.getValue(), i, true));
        if (!isForeign) {
            SparseArray<AppItem> sparseArray10 = this.sparseArrayApps;
            AppTypeDTH appTypeDTH10 = AppTypeDTH.NFC;
            sparseArray10.put(appTypeDTH10.getValue(), new AppItem(appTypeDTH10.getValue(), i2, true));
            i2++;
        }
        SparseArray<AppItem> sparseArray11 = this.sparseArrayApps;
        AppTypeDTH appTypeDTH11 = AppTypeDTH.SETTING;
        sparseArray11.put(appTypeDTH11.getValue(), new AppItem(appTypeDTH11.getValue(), i2, true));
    }

    @Override // com.xiaomi.hm.health.bt.model.appsort.SortableAppItems
    public int getType() {
        return this.b;
    }

    @Override // com.xiaomi.hm.health.bt.model.appsort.SortableAppItems
    public void setType(int type) {
        this.b = type;
    }

    @Override // com.xiaomi.hm.health.bt.model.appsort.SortableAppItems, com.xiaomi.hm.health.bt.profile.milipro.DisplaySetting
    @NonNull
    public byte[] toBleBytes() {
        int length;
        int length2 = AppType.values().length;
        int i = this.b;
        if (i == 3) {
            length2 = AppTypeWuhan.values().length;
        } else if (i == 2) {
            length2 = AppTypeTempo.values().length;
        } else if (i == 4) {
            length2 = AppTypeDTH.values().length;
        } else if (i == 22) {
            if (SUPPORT_PAI) {
                length2 = AppTypeBeatsW.values().length;
            } else {
                length = AppTypeBeatsW.values().length;
                length2 = length - 1;
            }
        } else if (i == 5) {
            if (SUPPORT_PAI) {
                length2 = AppTypeBeats.values().length;
            } else {
                length = AppTypeBeats.values().length;
                length2 = length - 1;
            }
        } else if (i == 6) {
            length2 = AppTypeBeatsP.values().length;
        } else if (i == 7) {
            length2 = AppTypeChongqing.values().length;
        } else if (i == 14 || i == 13 || i == 12 || i == 11) {
            length2 = AppTypeDTH.values().length;
        } else if (i == 15) {
            length2 = AppTypeRio.values().length;
        } else if (i == 16 || i == 21) {
            length2 = AppTypeChaohuL.values().length;
        }
        byte[] bArr = new byte[length2 + 2];
        if (this.sparseArrayApps.size() <= length2) {
            length2 = this.sparseArrayApps.size();
        }
        short s = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            AppItem appItemValueAt = this.sparseArrayApps.valueAt(i2);
            int type = appItemValueAt.getType();
            if (appItemValueAt.isEnable()) {
                s = (short) (s | (1 << type));
            }
            bArr[type + 2] = (byte) appItemValueAt.getIndex();
        }
        bArr[0] = (byte) (s & 255);
        bArr[1] = (byte) (((s >> 8) & 255) | ((this.b << 4) & 240));
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.sparseArrayApps.size(); i++) {
            sb.append(this.sparseArrayApps.valueAt(i).toString());
        }
        return sb.toString();
    }

    public HMDisplaySetting(boolean useDefault) {
        this(1, useDefault);
    }

    @Deprecated
    public HMDisplaySetting(int type, boolean useDefault) {
        this.b = type;
        if (useDefault) {
            switch (type) {
                case 1:
                    b();
                    break;
                case 2:
                    x();
                    break;
                case 3:
                    E();
                    break;
                case 4:
                    l();
                    break;
                case 5:
                    d();
                    break;
                case 6:
                    e();
                    break;
                case 7:
                    h();
                    break;
                case 9:
                    i();
                    break;
                case 10:
                    j();
                    break;
                case 11:
                    z(false, false);
                    break;
                case 12:
                    z(true, false);
                    break;
                case 13:
                    A(false);
                    break;
                case 14:
                    A(true);
                    break;
                case 15:
                    w();
                    break;
                case 16:
                case 21:
                    g();
                    break;
                case 17:
                    u(false);
                    break;
                case 18:
                    u(true);
                    break;
                case 19:
                case 23:
                case 29:
                case 34:
                case 36:
                    m(true);
                    break;
                case 20:
                case 25:
                case 28:
                case 30:
                case 35:
                    n(true);
                    break;
                case 22:
                    f();
                    break;
                case 24:
                case 26:
                case 27:
                case 31:
                case 32:
                    n(false);
                    break;
                case 33:
                    c();
                    break;
                case 37:
                    D();
                    break;
                case 38:
                case 50:
                    s(type == 50);
                    break;
                case 39:
                case 48:
                    k(type == 48);
                    break;
                case 41:
                    a();
                    break;
                case 42:
                    o();
                    break;
                case 43:
                case 55:
                    p();
                    break;
                case 44:
                    q(true);
                    break;
                case 45:
                    F();
                    break;
                case 51:
                    B();
                    break;
                case 52:
                    C();
                    break;
                case 53:
                    y();
                    break;
                case 54:
                    q(false);
                    break;
                case 56:
                    v(true);
                    break;
                case 57:
                    v(false);
                    break;
            }
        }
    }
}
