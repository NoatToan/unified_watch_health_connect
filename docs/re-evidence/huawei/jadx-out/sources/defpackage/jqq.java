package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jqq {
    public static boolean e(int i) {
        return i == 258 || i == 259 || i == 257 || i == 260 || i == 512 || i == 262 || i == 226 || i == 217;
    }

    public static String[] e(Context context, int i) {
        jry jryVarA = jry.a(context);
        LogUtil.a("Track_TrackHistoryUtil", "SportType= ", Integer.valueOf(i));
        if (i == 0) {
            return new String[]{"stat1", "stat2", "stat3", "stat4", "stat5", "stat6"};
        }
        HwSportTypeInfo hwSportTypeInfoB = jryVarA.b(i);
        if (hwSportTypeInfoB == null) {
            return new String[0];
        }
        ArrayList<String> trackRequestDataBase = hwSportTypeInfoB.getHistoryList().getTrackRequestDataBase(i);
        if (trackRequestDataBase == null || trackRequestDataBase.isEmpty()) {
            return new String[0];
        }
        return (String[]) trackRequestDataBase.toArray(new String[trackRequestDataBase.size()]);
    }

    public static int[] d(Context context, int i) {
        jry jryVarA = jry.a(context);
        LogUtil.a("Track_TrackHistoryUtil", "SportType= ", Integer.valueOf(i));
        if (i == 0) {
            return new int[]{1, 2, 3, 4, 5, 6};
        }
        HwSportTypeInfo hwSportTypeInfoB = jryVarA.b(i);
        if (hwSportTypeInfoB == null || hwSportTypeInfoB.getHistoryList() == null) {
            LogUtil.e("Track_TrackHistoryUtil", "hwSportTypeInfo is null");
            return new int[0];
        }
        List<Integer> allRequestId = hwSportTypeInfoB.getHistoryList().getAllRequestId();
        if (allRequestId == null || allRequestId.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[allRequestId.size()];
        for (int i2 = 0; i2 < allRequestId.size(); i2++) {
            iArr[i2] = allRequestId.get(i2).intValue();
        }
        return iArr;
    }

    public static boolean d(int i) {
        return Arrays.asList(281, 257, 264, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE), 258, 259, 262, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM), 260, 282, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER), Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE), Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_TREAD_MACHINE), Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE), 217, 218, 219, 229, 230, 231, 232, 233).contains(Integer.valueOf(i));
    }

    public static String a(Context context, int i) {
        if (i == 1) {
            return context.getString(R.string.IDS_grade_evaluation_Good);
        }
        if (i == 2) {
            return context.getString(R.string.IDS_grade_evaluation_Great);
        }
        if (i == 3) {
            return context.getString(R.string.IDS_grade_evaluation_Perfect);
        }
        if (i == 4) {
            return context.getString(R.string.IDS_grade_evaluation_Crazy);
        }
        if (i == 5) {
            return context.getString(R.string.IDS_grade_evaluation_Amazing);
        }
        return "--";
    }

    public static boolean c(int i) {
        return Arrays.asList(257, 258, 259, 262, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_BASKETBALL), 512, Integer.valueOf(HeartRateThresholdConfig.HEART_RATE_LIMIT), 217).contains(Integer.valueOf(i));
    }

    public static String e(Map<String, String> map) {
        String strE;
        if (map == null) {
            return jaa.d(BaseApplication.b(), 227);
        }
        if (map.containsKey("targetDistance") && "1".equals(map.get("competitionCategory"))) {
            double dA = CommonUtil.a(map.get("targetDistance"));
            if (Double.compare(dA, 42195.0d) == 0) {
                strE = qre.f(com.huawei.healthcloud.plugintrack.R.string.IDS_start_track_show_distance_marathon);
            } else if (Double.compare(dA, 21097.5d) == 0) {
                strE = qre.f(com.huawei.healthcloud.plugintrack.R.string.IDS_start_track_show_distance_half_marathon);
            } else {
                strE = qre.e(com.huawei.healthcloud.plugintrack.R.plurals.IDS_hwh_motiontrack_show_use_time_km, UnitUtil.b(dA, Locale.getDefault()), UnitUtil.e(dA / 1000.0d, 1, 0));
            }
            return qre.a(com.huawei.healthcloud.plugintrack.R.string.IDS_hwh_sport_type_marathon_test_race, strE);
        }
        return map.getOrDefault("alias", jaa.d(BaseApplication.b(), 227));
    }
}
