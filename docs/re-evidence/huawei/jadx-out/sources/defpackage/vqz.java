package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class vqz {
    public static void c(List<HiHealthData> list, List<vqt> list2) {
        if (njy.b(list)) {
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData != null) {
                    vqt vqtVar = new vqt();
                    try {
                        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                        if (hiTrackMetaData == null) {
                            ReleaseLogUtil.e("Track_SportListParseUtils", "parseTrackSimplifyData trackMetaData is null");
                        } else {
                            a(hiHealthData, hiTrackMetaData, vqtVar);
                            list2.add(vqtVar);
                        }
                    } catch (JsonSyntaxException unused) {
                        ReleaseLogUtil.e("Track_SportListParseUtils", "parseTrackSimplifyData trackMetaData is jsonSyntaxException");
                    }
                }
            }
        }
    }

    private static void a(HiHealthData hiHealthData, HiTrackMetaData hiTrackMetaData, vqt vqtVar) {
        c(vqtVar, hiTrackMetaData);
        if ("AMAP".equals(hiTrackMetaData.getVendor())) {
            vqtVar.d(1);
        } else if ("GOOGLE".equals(hiTrackMetaData.getVendor())) {
            vqtVar.d(2);
        }
        e(vqtVar, hiTrackMetaData, hiHealthData);
        vqtVar.h(hiTrackMetaData.getTrackType());
        vqtVar.c(hiHealthData.getInt("trackdata_deviceType"));
        vqtVar.e(hiHealthData.getString("device_prodid"));
        vqtVar.c(hiHealthData.getString("device_subprodid"));
        vqtVar.a(hiTrackMetaData.getSportDataSource());
        vqtVar.f(hiTrackMetaData.getRuncourseId());
        vqtVar.b(hiTrackMetaData.getAbnormalTrack());
        vqtVar.e(hiTrackMetaData.getDuplicated());
        vqtVar.j(hiHealthData.getClientId());
        vqtVar.d(hiTrackMetaData.getFatherSportItem());
        vqtVar.a(hiTrackMetaData.getChildSportItems());
        vqtVar.c(hiTrackMetaData.getHasTrackPoint());
        String str = hiTrackMetaData.getExtendTrackMap().get("courseName");
        if (!StringUtils.j(str)) {
            str = "";
        }
        vqtVar.h(str);
        String str2 = hiTrackMetaData.getExtendTrackMap().get("golfCourseName");
        if (!StringUtils.j(str2)) {
            str2 = "";
        }
        vqtVar.b(str2);
        String str3 = hiTrackMetaData.getExtendTrackMap().get("totalHandicap");
        vqtVar.d(StringUtils.j(str3) ? str3 : "");
        String str4 = hiTrackMetaData.getExtendTrackMap().get("mWorkoutTypeOrigin");
        if (!StringUtils.j(str4)) {
            str4 = "0";
        }
        vqtVar.f(CommonUtils.j(str4));
        d(vqtVar, hiTrackMetaData);
        vqtVar.a(d(hiTrackMetaData.getSportType(), hiTrackMetaData.getExtendTrackMap()));
        vqtVar.g(b(hiTrackMetaData, "divingMode"));
        b(vqtVar, hiTrackMetaData.getExtendTrackMap());
    }

    private static void b(vqt vqtVar, Map<String, String> map) {
        String str = map.get("packageName");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        vqtVar.a("packageName", str);
    }

    private static String d(int i, Map<String, String> map) {
        if (map.containsKey("alias")) {
            return map.get("alias");
        }
        if (i == 227) {
            return jqq.e(map);
        }
        if (i == 222) {
            return jaa.b(map);
        }
        return "";
    }

    private static int b(HiTrackMetaData hiTrackMetaData, String str) {
        Map<String, String> extendTrackMap = hiTrackMetaData.getExtendTrackMap();
        if (!extendTrackMap.containsKey(str)) {
            return 0;
        }
        String str2 = extendTrackMap.get(str);
        if (!StringUtils.j(str2)) {
            str2 = "0";
        }
        return CommonUtils.j(str2);
    }

    private static void d(vqt vqtVar, HiTrackMetaData hiTrackMetaData) {
        String str = hiTrackMetaData.getExtendTrackMap().get(HwExerciseConstants.JSON_NAME_RECORD_FLAG);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        vqtVar.g(str);
    }

    private static void c(vqt vqtVar, HiTrackMetaData hiTrackMetaData) {
        int chiefSportDataType = hiTrackMetaData.getChiefSportDataType();
        if (chiefSportDataType == 2) {
            vqtVar.d(hiTrackMetaData.getTotalCalories(), chiefSportDataType);
            vqtVar.d(hiTrackMetaData.getAvgPace());
            return;
        }
        if (chiefSportDataType == 1) {
            vqtVar.d(hiTrackMetaData.getTotalCalories(), chiefSportDataType);
            if (hiTrackMetaData.getSportType() != 290) {
                vqtVar.d(hiTrackMetaData.getAvgHeartRate());
                return;
            }
            return;
        }
        if (chiefSportDataType == 5) {
            b(vqtVar, hiTrackMetaData, chiefSportDataType);
            return;
        }
        if (hiTrackMetaData.getChiefSportDataType() == 6) {
            c(vqtVar, hiTrackMetaData, chiefSportDataType);
            return;
        }
        int iJ = 0;
        if (chiefSportDataType == 7) {
            int iJ2 = hiTrackMetaData.getExtendTrackMap().get("skipNum") == null ? 0 : CommonUtil.j(hiTrackMetaData.getExtendTrackMap().get("skipNum"));
            iJ = hiTrackMetaData.getExtendTrackMap().get("skipSpeed") != null ? CommonUtil.j(hiTrackMetaData.getExtendTrackMap().get("skipSpeed")) : 0;
            vqtVar.d(iJ2, chiefSportDataType);
            vqtVar.d(iJ);
            return;
        }
        if (chiefSportDataType == 8) {
            vqtVar.d(hiTrackMetaData.getTotalDescent() / 10.0f, chiefSportDataType);
            try {
                iJ = Integer.parseInt(hiTrackMetaData.getExtendTrackMap().get("divingCount"));
            } catch (NumberFormatException unused) {
                LogUtil.e("Track_SportListParseUtils", "alterData is null");
            }
            vqtVar.e(hiTrackMetaData.getTotalTime());
            vqtVar.d(iJ);
            return;
        }
        if (chiefSportDataType == 9) {
            vqtVar.d(hiTrackMetaData.getTotalTime() / 60000.0f, chiefSportDataType);
            vqtVar.d(hiTrackMetaData.getAvgHeartRate());
            return;
        }
        if (chiefSportDataType == 10) {
            vqtVar.d(hiTrackMetaData.getTotalCalories(), chiefSportDataType);
            vqtVar.d(hiTrackMetaData.getTotalSteps());
            return;
        }
        if (chiefSportDataType == 11) {
            vqtVar.d(hiTrackMetaData.getTotalTime(), chiefSportDataType);
            vqtVar.d(hiTrackMetaData.getExtendTrackMap().get("wayPointDistance") == null ? 0.0f : CommonUtil.j(hiTrackMetaData.getExtendTrackMap().get("wayPointDistance")));
            return;
        }
        vqtVar.d(hiTrackMetaData.getTotalDistance(), chiefSportDataType);
        if (hiTrackMetaData.getSportType() == 260) {
            vqtVar.d(hiTrackMetaData.getCreepingWave() / 10.0f);
        } else if (nub.e(hiTrackMetaData.getSportType())) {
            e(vqtVar, hiTrackMetaData);
        } else {
            vqtVar.d(hiTrackMetaData.getAvgPace());
        }
    }

    private static void e(vqt vqtVar, HiTrackMetaData hiTrackMetaData, HiHealthData hiHealthData) {
        long totalTime;
        long startTime = hiHealthData.getStartTime();
        long endTime = hiHealthData.getEndTime();
        if (hiTrackMetaData.getChiefSportDataType() == 8) {
            try {
                totalTime = Long.parseLong(hiTrackMetaData.getExtendTrackMap().get("divingTime")) * 1000;
            } catch (NumberFormatException unused) {
                LogUtil.e("Track_SportListParseUtils", "saveSingleTrackData is null");
                totalTime = 0;
            }
        } else {
            totalTime = hiTrackMetaData.getTotalTime();
        }
        int totalCalories = hiTrackMetaData.getTotalCalories();
        int sportType = hiTrackMetaData.getSportType();
        vqtVar.c(startTime);
        vqtVar.b(endTime);
        vqtVar.d(totalTime);
        vqtVar.e(totalCalories);
        vqtVar.i(sportType);
    }

    private static void e(vqt vqtVar, HiTrackMetaData hiTrackMetaData) {
        int totalDistance = hiTrackMetaData.getTotalDistance();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(hiTrackMetaData.getTotalTime());
        vqtVar.d(seconds != 0 ? (totalDistance * 3.6f) / seconds : 0.0f);
    }

    private static void c(vqt vqtVar, HiTrackMetaData hiTrackMetaData, int i) {
        float f;
        Map<String, String> extendTrackMap = hiTrackMetaData.getExtendTrackMap();
        if (extendTrackMap != null) {
            try {
                if (extendTrackMap.get("golfSwingCount") == null) {
                    LogUtil.j("Track_SportListParseUtils", "extendTrackDataMap.get(TrackConstants.GOLF_SWING_COUNT) == null");
                    f = -1.0f;
                } else {
                    f = Float.parseFloat(extendTrackMap.get("golfSwingCount"));
                }
                vqtVar.d(f, i);
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("Track_SportListParseUtils", "saveGolfChiefValue NumberFormatException");
            }
        }
        vqtVar.d(hiTrackMetaData.getTotalCalories());
    }

    private static void b(vqt vqtVar, HiTrackMetaData hiTrackMetaData, int i) {
        Map<String, Integer> wearSportData = hiTrackMetaData.getWearSportData();
        if (wearSportData != null && wearSportData.containsKey("overall_score") && wearSportData.get("overall_score") != null) {
            vqtVar.d(wearSportData.get("overall_score").intValue(), i);
            LogUtil.d("Track_SportListParseUtils", "SPORT_DATA_KEY_OVERALL_SCORE", wearSportData.get("overall_score"));
        }
        if (wearSportData == null || !wearSportData.containsKey("jump_times") || wearSportData.get("jump_times") == null) {
            return;
        }
        vqtVar.d(wearSportData.get("jump_times").intValue());
    }
}
