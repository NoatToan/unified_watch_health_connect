package com.xiaomi.hm.health.bodyfat.utils;

/* JADX INFO: loaded from: classes19.dex */
public class DetailInfoCompareHelper {
    public static final String ALL_COUNTRY = "中国";
    public static final String ALL_COUNTRY_PY = "zhongguo";
    public static final String TYPE_BODY_BMI = "body_bmi";

    public static int getAgeRegion(int i) {
        if (i <= 0) {
            return 100;
        }
        if (i <= 5) {
            return 1;
        }
        if (i <= 13) {
            return 2;
        }
        if (i <= 17) {
            return 3;
        }
        if (i <= 25) {
            return 4;
        }
        if (i <= 35) {
            return 5;
        }
        if (i <= 49) {
            return 6;
        }
        if (i <= 64) {
            return 7;
        }
        return i < 100 ? 8 : 100;
    }
}
