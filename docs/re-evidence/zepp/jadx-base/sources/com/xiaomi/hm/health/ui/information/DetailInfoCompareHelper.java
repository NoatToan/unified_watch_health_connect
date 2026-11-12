package com.xiaomi.hm.health.ui.information;

import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.locweather.LocWeatherKeeper;
import com.xiaomi.hm.health.ui.smartplay.appnotify.CharacterParser;

/* JADX INFO: loaded from: classes22.dex */
public class DetailInfoCompareHelper {
    public static final String ALL_COUNTRY = "中国";
    public static final String ALL_COUNTRY_PY = "zhongguo";
    public static final String TYPE_ACTIVITY_STEP_TTL = "activity_step_ttl";
    public static final String TYPE_BODY_BMI = "body_bmi";
    public static final String TYPE_SLEEP_DEEP_DURATION = "sleep_deep_duration";
    public static final String TYPE_SLEEP_SCORE_V2 = "sleep_score_v2";
    public static final String TYPE_SLEEP_START = "sleep_start";

    public static int getAgeRegion(int age) {
        if (age <= 0) {
            return 100;
        }
        if (age <= 5) {
            return 1;
        }
        if (age <= 13) {
            return 2;
        }
        if (age <= 17) {
            return 3;
        }
        if (age <= 25) {
            return 4;
        }
        if (age <= 35) {
            return 5;
        }
        if (age <= 49) {
            return 6;
        }
        if (age <= 64) {
            return 7;
        }
        return age < 100 ? 8 : 100;
    }

    public static String getLoactionProvinceSpell() {
        String locationProvinceForCompareModel = getLocationProvinceForCompareModel();
        if (TextUtils.isEmpty(HMKeeper.getOfflineModelInjectResult())) {
            return "zhongguo";
        }
        return locationProvinceForCompareModel.equals("陕西") ? "shaanxi" : CharacterParser.getInstance().getSellingIgnoreCaseLow(getLocationProvinceForCompareModel());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    public static String getLocationProvinceForCompareModel() {
        String str;
        String lastLocationStr = LocWeatherKeeper.getLastLocationStr();
        HMLog.d("DetailInfoCompareHelper", "lastLoc:" + lastLocationStr, new Object[0]);
        if (TextUtils.isEmpty(lastLocationStr)) {
            str = "";
        } else {
            String[] strArrSplit = lastLocationStr.split(",");
            if (strArrSplit.length > 1) {
                str = strArrSplit[0];
            } else {
                str = "";
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "中国";
        }
        if (str.contains("省")) {
            return str.replaceAll("省", "");
        }
        return str.contains("市") ? str.replaceAll("市", "") : str;
    }
}
