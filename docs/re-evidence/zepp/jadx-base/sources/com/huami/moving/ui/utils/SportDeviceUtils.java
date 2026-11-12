package com.huami.moving.ui.utils;

import android.text.TextUtils;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SportDeviceUtils {
    public static final int SOURCE_ANDES = 516;
    public static final int SOURCE_ANDES_W = 517;
    public static final int SOURCE_ANETO = 165;
    public static final int SOURCE_ATHENS = 149;
    public static final int SOURCE_BLANC = 183;
    public static final int SOURCE_BLANC_W = 300;
    public static final int SOURCE_CINCO = 124;
    public static final int SOURCE_CINCO_L = 125;
    public static final int SOURCE_COMO = 167;
    public static final int SOURCE_COMO_L = 168;
    public static final int SOURCE_COMO_W = 169;
    public static final int SOURCE_COMO_WL = 170;
    public static final int SOURCE_FALCON = 135;
    public static final int SOURCE_FALCON_L = 145;
    public static final int SOURCE_FALCON_W = 136;
    public static final int SOURCE_FALCON_WL = 146;
    public static final int SOURCE_FANYANGHU = 130;
    public static final int SOURCE_FANYANGHU_W = 134;
    public static final int SOURCE_HAWK = 137;
    public static final int SOURCE_HAWK_L = 143;
    public static final int SOURCE_HAWK_W = 138;
    public static final int SOURCE_HAWK_WL = 144;
    public static final int SOURCE_HAYDN = 801;
    public static final int SOURCE_KESTREL = 140;
    public static final int SOURCE_KESTREL_L = 147;
    public static final int SOURCE_KESTREL_W = 141;
    public static final int SOURCE_KESTREL_WL = 148;
    public static final int SOURCE_MADRID = 329;
    public static final int SOURCE_MADRID_HML = 6095206;
    public static final int SOURCE_MADRID_W = 330;
    public static final int SOURCE_PEYTO_L = 139;
    public static final int SOURCE_PEYTO_WL = 142;
    public static final int SOURCE_PROVENCE = 346;
    public static final int SOURCE_PROVENCE_W = 347;
    public static final int SOURCE_RIO = 131;
    public static final int SOURCE_SOFIA = 341;
    public static final int SOURCE_SOFIA_W = 342;
    public static final int SOURCE_TEIDE = 518;
    public static final int SOURCE_TEIDE_W = 519;
    public static final int SOURCE_TONLESAP = 126;
    public static final int SOURCE_TONLESAP_L = 127;
    public static final int SOURCE_TONLESAP_O = 128;
    public static final int SOURCE_TONLESAP_OL = 129;
    public static final int SOURCE_VENICE = 153;
    public static final int SOURCE_VENICE_W = 171;
    public static final int SOURCE_VERONA = 326;
    public static final int SOURCE_VERONA_W = 327;
    public static final int SOURCE_VIENNA = 514;
    public static final int SOURCE_VIENNA_W = 515;
    public static final int SOURCE_VULTRUE = 150;
    public static final int SOURCE_WATCH_EVEREST_2S = 510;
    public static final int SOURCE_WATCH_EVEREST_2SW = 512;
    public static final int SOURCE_WATCH_EVEREST_2W = 511;
    public static final int SOURCE_ZURICH = 324;
    public static final int SOURCE_ZURICH_W = 325;
    private static final String a = "3:LN";
    private static final String b = "3:LN:3";
    private static final String c = "3:LN:307";
    private static final String d = "3:LN:307:0";
    private static final String e = "3:LN:307:5";
    private static final String f = "3:LN:307:6";
    private static final String g = "3-LN";
    private static final String h = "0-MILI";
    private static final String i = "3-LN-3";
    private static final String j = "CADENCE";
    private static final String k = "cadence";
    private static final String l = "0:MILI";
    private static final String m = "5:BLUEMONKEY:500";
    private static final int n = 4;
    private static final int o = 3;
    private static Map<String, Integer> p = new HashMap();
    private static List<String> q;

    static {
        ArrayList arrayList = new ArrayList();
        q = arrayList;
        arrayList.add(m);
    }

    private static boolean a(String str) {
        return !TextUtils.isEmpty(str) && (str.contains(g) || str.contains(h));
    }

    public static int[] analysisSportDeviceStr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        int[] iArr = new int[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].split(":");
            if (strArrSplit2.length == 4) {
                iArr[i2] = Integer.parseInt(strArrSplit2[strArrSplit2.length - 2]);
            } else if (strArrSplit2.length == 3) {
                iArr[i2] = Integer.parseInt(strArrSplit2[strArrSplit2.length - 1]);
            }
        }
        return iArr;
    }

    public static boolean isAntelopeShoe(String str) {
        return !TextUtils.isEmpty(str) && str.contains(f);
    }

    public static boolean isCategoryForHaydn(int i2) {
        return i2 == 801;
    }

    public static boolean isKangnaiShoe(String str) {
        return !TextUtils.isEmpty(str) && str.contains(e);
    }

    public static boolean isMiJiaShoe(String str) {
        return (TextUtils.isEmpty(str) || str.contains(e) || str.contains(f) || (!str.contains(c) && !str.contains(d))) ? false : true;
    }

    public static boolean isRunningShoes(String str) {
        return (!TextUtils.isEmpty(str) && str.contains(a)) || str.contains(g);
    }

    public static boolean isSmartShoe(String str) {
        return !TextUtils.isEmpty(str) && str.contains(c);
    }

    public static boolean isSmartTShirt(String str) {
        return !TextUtils.isEmpty(str) && str.contains(m);
    }

    public static boolean isSupportCadence(String str) {
        return !TextUtils.isEmpty(str) && (str.contains(j) || str.contains("cadence"));
    }

    public static boolean isSupportFirstbeatAlgoDevice(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it2 = q.iterator();
        while (it2.hasNext()) {
            if (str.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSupportForeFeet(String str) {
        if (a(str)) {
            for (String str2 : str.split(":")) {
                if (i.equals(str2)) {
                    return true;
                }
            }
        } else {
            for (String str3 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                if (b.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSupportSTUpgradeCategory(int i2) {
        return i2 == 514 || i2 == 515 || i2 == 518 || i2 == 519 || i2 == 516 || i2 == 517;
    }

    public static boolean isSupportStrengthTrainingCategory(int i2) {
        return i2 == 183 || i2 == 300 || i2 == 329 || i2 == 330 || i2 == 6095206 || i2 == 324 || i2 == 325 || i2 == 326 || i2 == 327 || i2 == 341 || i2 == 342 || i2 == 346 || i2 == 347 || isSupportSTUpgradeCategory(i2);
    }

    public static boolean isWatchCategoryForVenice(int i2) {
        return i2 == 153 || i2 == 171;
    }

    public static boolean isWatchCategorySportSource(int i2) {
        return i2 == DataTypeSource.RunSource.RUN_SOURCE_WATCH.getValue() || i2 == DataTypeSource.RunSource.RUN_SOURCE_WATCH_2.getValue() || i2 == DataTypeSource.RunSource.RUN_SOURCE_WATCH_2S.getValue() || i2 == DataTypeSource.RunSource.RUN_SOURCE_CHAOHU.getValue() || i2 == DataTypeSource.RunSource.RUN_SOURCE_DONGTINGHU.getValue() || i2 == DataTypeSource.RunSource.RUN_SOURCE_WATCH_QOGIR.getValue() || i2 == DataTypeSource.RunSource.RUN_SOURCE_WATCH_XIHU.getValue() || i2 == DataTypeSource.RunSource.RUN_SOURCE_WATCH_XIHU_E.getValue() || i2 == DataTypeSource.RunSource.RUN_SOURCE_WATCH_XIHU_EA.getValue() || i2 == DataTypeSource.RunSource.RUN_SOURCE_WATCH_XIHU_MARVEL.getValue() || i2 == DataTypeSource.RunSource.RUN_SOURCE_WATCH_EVERREST_2.getValue() || i2 == 126 || i2 == 127 || i2 == 128 || i2 == 129 || i2 == 139 || i2 == 142 || i2 == 130 || i2 == 134 || i2 == 135 || i2 == 145 || i2 == 136 || i2 == 146 || i2 == 137 || i2 == 143 || i2 == 138 || i2 == 144 || i2 == 140 || i2 == 147 || i2 == 141 || i2 == 148 || i2 == 150 || i2 == 165 || i2 == 153 || i2 == 171 || i2 == 167 || i2 == 168 || i2 == 169 || i2 == 170;
    }

    public static boolean isWorkoutSportSource(int i2) {
        return i2 == 2 || i2 == 3 || i2 == 8 || i2 == 9 || i2 == 6;
    }
}
