package com.huami.watch.dataflow.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.sdk.m.n.a;
import com.google.gson.GsonBuilder;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import com.huami.watch.dataflow.model.sport.bean.SportSummary;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class SportDataParser {
    private static final String a = "DataFlow-SportDataParser";

    private static String a(@NonNull Map<String, String> map, String str) {
        return map.get(str);
    }

    private static boolean b(@NonNull Map<String, String> map, String str, boolean z) {
        try {
            return Boolean.valueOf(map.get(str)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    private static float c(@NonNull Map<String, String> map, String str) {
        return d(map, str, 0.0f);
    }

    private static float d(@NonNull Map<String, String> map, String str, float f) {
        try {
            return Float.valueOf(map.get(str)).floatValue();
        } catch (Exception e) {
            e.printStackTrace();
            return f;
        }
    }

    private static int e(@NonNull Map<String, String> map, String str) {
        return f(map, str, 0);
    }

    private static int f(@NonNull Map<String, String> map, String str, int i) {
        try {
            return Integer.valueOf(map.get(str)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    public static Map<String, String> formToNameValues(String str) {
        return formToNameValues(str, true);
    }

    private static long g(@NonNull Map<String, String> map, String str) {
        return h(map, str, 0L);
    }

    private static long h(@NonNull Map<String, String> map, String str, long j) {
        try {
            return Long.valueOf(map.get(str)).longValue();
        } catch (Exception e) {
            e.printStackTrace();
            return j;
        }
    }

    private static String i(@NonNull Map<String, String> map, String str) {
        return j(map, str, "");
    }

    private static String j(@NonNull Map<String, String> map, String str, String str2) {
        return map.get(str) == null ? str2 : map.get(str);
    }

    public static String toCloudData(@NonNull Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (z) {
                z = false;
            } else {
                sb.append(Typography.amp);
            }
            sb.append(key);
            sb.append(a.h);
            sb.append(value);
        }
        Log.d(a, "CloudData : " + sb.toString(), new Object[0]);
        return sb.toString();
    }

    @Nullable
    public static SportDetail toDetailItem(String str) {
        return toDetailItem(str, false);
    }

    @Nullable
    public static SportSummary toSummaryItem(String str) {
        return toSummaryItem(str, false);
    }

    public static Map<String, String> formToNameValues(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyMap();
        }
        String strDecode = null;
        try {
            strDecode = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(strDecode)) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        do {
            int iIndexOf = strDecode.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = strDecode.length();
            }
            int iIndexOf2 = strDecode.indexOf(61, i);
            if (iIndexOf2 > iIndexOf) {
                iIndexOf2 = -1;
            }
            if (iIndexOf2 == -1 || iIndexOf2 <= i) {
                i = iIndexOf + 1;
            } else {
                String strSubstring = strDecode.substring(i, iIndexOf2);
                int iIndexOf3 = strDecode.indexOf(38, iIndexOf2);
                if (iIndexOf3 == -1) {
                    iIndexOf3 = strDecode.length();
                }
                linkedHashMap.put(strSubstring, iIndexOf3 == iIndexOf2 ? "" : strDecode.substring(iIndexOf2 + 1, iIndexOf3));
                i = iIndexOf3 + 1;
            }
        } while (i < strDecode.length());
        Log.d(a, "To NameValues : " + linkedHashMap.toString(), new Object[0]);
        return z ? Collections.unmodifiableMap(linkedHashMap) : linkedHashMap;
    }

    @Nullable
    public static SportDetail toDetailItem(String str, boolean z) {
        if (z) {
            str = DataUtil.decodeAndUnzipRawData(str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        SportDetail sportDetail = new SportDetail();
        try {
            Map<String, String> mapFormToNameValues = formToNameValues(str);
            sportDetail.setTrackid(g(mapFormToNameValues, "trackid"));
            sportDetail.setBulkacc(i(mapFormToNameValues, "accuracy"));
            sportDetail.setBulkal(i(mapFormToNameValues, "altitude"));
            sportDetail.setBulkbarometerAltitude(i(mapFormToNameValues, "air_pressure_altitude"));
            sportDetail.setBulkdistance(i(mapFormToNameValues, "distance"));
            sportDetail.setBulkflag(i(mapFormToNameValues, "flag"));
            sportDetail.setBulkgait(i(mapFormToNameValues, "gait"));
            sportDetail.setBulkhr(i(mapFormToNameValues, "heart_rate"));
            sportDetail.setBulkll(i(mapFormToNameValues, "longitude_latitude"));
            sportDetail.setBulkpace(i(mapFormToNameValues, "pace"));
            sportDetail.setBulkpause(i(mapFormToNameValues, "pause"));
            sportDetail.setBulktime(i(mapFormToNameValues, "time"));
            sportDetail.setKilomarked(i(mapFormToNameValues, "kilo_pace"));
            sportDetail.setMilemarked(i(mapFormToNameValues, "mile_pace"));
            sportDetail.setSource(i(mapFormToNameValues, "source"));
            sportDetail.setV(Integer.valueOf(e(mapFormToNameValues, "version")));
            sportDetail.setDeltaTimeAltitude(i(mapFormToNameValues, "correct_altitude"));
            sportDetail.setStrokeSpeed(i(mapFormToNameValues, "stroke_speed"));
            sportDetail.setCadence(i(mapFormToNameValues, "cadence"));
            sportDetail.setPerformanceStatus(i(mapFormToNameValues, "daily_performance_info"));
            sportDetail.setLap(i(mapFormToNameValues, "lap"));
            sportDetail.setSpeed(i(mapFormToNameValues, "speed"));
            sportDetail.setWeather(i(mapFormToNameValues, "weather_info"));
            sportDetail.setProvider(i(mapFormToNameValues, "provider"));
            String strI = i(mapFormToNameValues, "rope_skipping_frequency");
            if (!TextUtils.isEmpty(strI)) {
                sportDetail.setBulkgait(strI);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(a, "To DetailItem Fail!!", e, new Object[0]);
            Analytics.exception(e);
        }
        Log.d(a, "DetailItem : " + sportDetail, new Object[0]);
        return sportDetail;
    }

    @Nullable
    public static SportSummary toSummaryItem(String str, boolean z) {
        if (z) {
            str = DataUtil.decodeAndUnzipRawData(str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        SportSummary sportSummary = new SportSummary();
        try {
            Map<String, String> mapFormToNameValues = formToNameValues(str);
            sportSummary.setAltitudeAscend(e(mapFormToNameValues, "altitude_ascend"));
            sportSummary.setAltitudeDescend(e(mapFormToNameValues, "altitude_descend"));
            sportSummary.setAvgCadence(e(mapFormToNameValues, "avg_cadence"));
            float fC = c(mapFormToNameValues, "avg_frequency");
            sportSummary.setAvgFrequency((int) fC);
            float fC2 = c(mapFormToNameValues, "avg_heart_rate");
            sportSummary.setAvgHr((int) fC2);
            sportSummary.setAvgPace(c(mapFormToNameValues, "avg_pace"));
            sportSummary.setAvgStrideLength(e(mapFormToNameValues, "avg_stride_length"));
            sportSummary.setBindDevice(a(mapFormToNameValues, "bind_device"));
            float fC3 = c(mapFormToNameValues, "calorie");
            sportSummary.setCal(Math.round(fC3));
            sportSummary.setCity(a(mapFormToNameValues, "city"));
            sportSummary.setClimbDisAscend(e(mapFormToNameValues, "distance_ascend"));
            sportSummary.setClimbDisAscendTime(e(mapFormToNameValues, "climb_dis_ascend_time"));
            sportSummary.setClimbDisDescend(e(mapFormToNameValues, "climb_dis_descend"));
            sportSummary.setClimbDisDescendTime(e(mapFormToNameValues, "climb_dis_descend_time"));
            long jG = g(mapFormToNameValues, "trackid");
            sportSummary.setDate(DateDay.from(1000 * jG).str());
            float fC4 = c(mapFormToNameValues, "dis");
            sportSummary.setDis((int) fC4);
            sportSummary.setEndtime(g(mapFormToNameValues, "end_time"));
            sportSummary.setFlightRatio(e(mapFormToNameValues, "flight_ratio"));
            sportSummary.setForefootRatio(e(mapFormToNameValues, "forefoot_ratio"));
            sportSummary.setLandingTime(e(mapFormToNameValues, "landing_time"));
            sportSummary.setLapDistance(e(mapFormToNameValues, "lap_distance"));
            sportSummary.setLocation(a(mapFormToNameValues, "location"));
            sportSummary.setMaxAltitude(e(mapFormToNameValues, "max_altitude"));
            sportSummary.setMaxCadence(e(mapFormToNameValues, "max_cadence"));
            sportSummary.setMaxFrequency(e(mapFormToNameValues, "max_frequency"));
            sportSummary.setMaxPace(c(mapFormToNameValues, "max_pace"));
            sportSummary.setMinAltitude(e(mapFormToNameValues, "min_altitude"));
            sportSummary.setMinPace(c(mapFormToNameValues, "min_pace"));
            sportSummary.setRuntime(e(mapFormToNameValues, "run_time"));
            sportSummary.setSource(a(mapFormToNameValues, "source"));
            sportSummary.setTotalStep(e(mapFormToNameValues, "total_step"));
            sportSummary.setTrackid(jG);
            sportSummary.setType(e(mapFormToNameValues, "type"));
            sportSummary.setVersion(e(mapFormToNameValues, "version"));
            sportSummary.setParentTrackId(h(mapFormToNameValues, "parent_trackid", -1L));
            sportSummary.setChildListData(a(mapFormToNameValues, "child_list"));
            sportSummary.setMaxHR(f(mapFormToNameValues, "max_heart_rate", -1));
            sportSummary.setMinHR(f(mapFormToNameValues, "min_heart_rate", -1));
            sportSummary.setTeValue(f(mapFormToNameValues, "te", -1));
            sportSummary.setSportMode(f(mapFormToNameValues, "sport_mode", 0));
            sportSummary.setUnit(f(mapFormToNameValues, "unit", 0));
            sportSummary.setExtra(i(mapFormToNameValues, "extra"));
            sportSummary.setSwimSWOLF(f(mapFormToNameValues, "swolf", -1));
            sportSummary.setSwimStrokes(f(mapFormToNameValues, "total_strokes", -1));
            sportSummary.setSwimTurns(f(mapFormToNameValues, "total_trips", -1));
            sportSummary.setSwimAvgStrokeSpeed(d(mapFormToNameValues, "avg_stroke_speed", -1.0f));
            sportSummary.setSwimMaxStrokeSpeed(d(mapFormToNameValues, "max_stroke_speed", -1.0f));
            sportSummary.setSwimDistancePerStroke(d(mapFormToNameValues, "avg_distance_per_stroke", -1.0f));
            sportSummary.setSwimPoolLength(f(mapFormToNameValues, "swim_pool_length", -1));
            sportSummary.setSwimStyle(f(mapFormToNameValues, "swim_style", -1));
            sportSummary.setDownhillNumber(f(mapFormToNameValues, "downhill_num", -1));
            sportSummary.setMaxDownhillFallMileage(f(mapFormToNameValues, "downhill_max_altitude_desend", -1));
            sportSummary.setTennisStrokes(f(mapFormToNameValues, "strokes", 0));
            sportSummary.setTennisForeHand(f(mapFormToNameValues, "fore_hand", 0));
            sportSummary.setTennisBackHand(f(mapFormToNameValues, "back_hand", 0));
            sportSummary.setTennisServe(f(mapFormToNameValues, "serve", 0));
            sportSummary.setHalfStartTime(f(mapFormToNameValues, "second_half_start_time", -1));
            sportSummary.setRopeSkippingCount(f(mapFormToNameValues, "rope_skipping_count", 0));
            sportSummary.setRopeSkippingAvgFrequency(f(mapFormToNameValues, "rope_skipping_avg_frequency", 0));
            sportSummary.setRopeSkippingMaxFrequency(f(mapFormToNameValues, "rope_skipping_max_frequency", 0));
            sportSummary.setRopeSkippingRestTime(h(mapFormToNameValues, "rope_skipping_rest_time", 0L));
            if (sportSummary.getType() == 21) {
                sportSummary.setTennisStrokes(sportSummary.getRopeSkippingCount());
            }
            sportSummary.setMarathon(i(mapFormToNameValues, "marathon"));
            sportSummary.setTotalGroup(e(mapFormToNameValues, "total_group"));
            sportSummary.setSourceCalorie(fC3);
            sportSummary.setSourceDistance(fC4);
            sportSummary.setSourceAvgHR(fC2);
            sportSummary.setSourceAvgFrequency(fC);
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.excludeFieldsWithModifiers(16, 128, 8);
            sportSummary.setSourceData(gsonBuilder.create().toJson(sportSummary));
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(a, "To SummaryItem Fail!!", e, new Object[0]);
            Analytics.exception(e);
        }
        Log.d(a, "SportSummaryItem : " + sportSummary + '\n' + sportSummary.getSourceData(), new Object[0]);
        return sportSummary;
    }
}
