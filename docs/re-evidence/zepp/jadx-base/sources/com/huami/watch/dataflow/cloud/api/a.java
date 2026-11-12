package com.huami.watch.dataflow.cloud.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import com.huami.watch.dataflow.model.sport.bean.SportStatistics;
import com.huami.watch.dataflow.model.sport.bean.SportSummary;
import com.huami.watch.util.DateDay;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
class a {
    @NonNull
    public static SportDetail a(JSONObject jSONObject) throws JSONException {
        SportDetail sportDetail = new SportDetail();
        sportDetail.setTrackid(jSONObject.getLong("trackid"));
        sportDetail.setSource(jSONObject.getString("source"));
        sportDetail.setV(Integer.valueOf(jSONObject.getInt("version")));
        sportDetail.setBulkll(jSONObject.optString("longitude_latitude"));
        sportDetail.setBulkal(jSONObject.optString("altitude"));
        sportDetail.setBulkacc(jSONObject.optString("accuracy"));
        sportDetail.setBulktime(jSONObject.optString("time"));
        sportDetail.setBulkgait(jSONObject.optString("gait"));
        sportDetail.setBulkpace(jSONObject.optString("pace"));
        sportDetail.setBulkpause(jSONObject.optString("pause"));
        sportDetail.setBulkflag(jSONObject.optString("flag"));
        sportDetail.setBulkhr(jSONObject.optString("heart_rate"));
        sportDetail.setKilomarked(jSONObject.optString("kilo_pace"));
        sportDetail.setMilemarked(jSONObject.optString("mile_pace"));
        sportDetail.setBulkdistance(jSONObject.optString("distance"));
        sportDetail.setBulkbarometerAltitude(jSONObject.optString("air_pressure_altitude"));
        sportDetail.setDeltaTimeAltitude(jSONObject.optString("correct_altitude"));
        sportDetail.setStrokeSpeed(jSONObject.optString("stroke_speed"));
        sportDetail.setCadence(jSONObject.optString("cadence"));
        sportDetail.setPerformanceStatus(jSONObject.optString("daily_performance_info"));
        sportDetail.setLap(jSONObject.optString("lap"));
        sportDetail.setSpeed(jSONObject.optString("speed"));
        sportDetail.setWeather(jSONObject.optString("weather_info"));
        sportDetail.setProvider(jSONObject.optString("provider"));
        String strOptString = jSONObject.optString("rope_skipping_frequency");
        if (!TextUtils.isEmpty(strOptString)) {
            sportDetail.setBulkgait(strOptString);
        }
        return sportDetail;
    }

    @NonNull
    public static List<SportSummary> b(@NonNull JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("summary");
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(d(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    @NonNull
    public static SportStatistics c(@NonNull JSONObject jSONObject) throws JSONException {
        SportStatistics sportStatistics = new SportStatistics();
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        if (jSONArray.length() != 0) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(0);
            sportStatistics.setDate(jSONObject2.getString("date"));
            sportStatistics.setCalorie(jSONObject2.getDouble("calorie"));
            sportStatistics.setCount(jSONObject2.getInt("count"));
            sportStatistics.setDis(jSONObject2.getDouble("dis"));
            sportStatistics.setRuntime(jSONObject2.getInt("run_time"));
        }
        return sportStatistics;
    }

    @NonNull
    public static SportSummary d(@NonNull JSONObject jSONObject) throws JSONException {
        SportSummary sportSummary = new SportSummary();
        sportSummary.setTrackid(jSONObject.getLong("trackid"));
        sportSummary.setSource(jSONObject.getString("source"));
        sportSummary.setVersion(jSONObject.getInt("version"));
        sportSummary.setDis(jSONObject.getInt("dis"));
        sportSummary.setCal((int) new BigDecimal(jSONObject.getDouble("calorie")).setScale(0, 4).doubleValue());
        sportSummary.setEndtime(jSONObject.getLong("end_time"));
        sportSummary.setRuntime(jSONObject.getInt("run_time"));
        sportSummary.setAvgPace((float) jSONObject.getDouble("avg_pace"));
        sportSummary.setAvgFrequency(jSONObject.optInt("avg_frequency", -1));
        sportSummary.setAvgHr(jSONObject.optInt("avg_heart_rate", -1));
        sportSummary.setType(jSONObject.getInt("type"));
        sportSummary.setLocation(jSONObject.getString("location"));
        sportSummary.setCity(jSONObject.getString("city"));
        sportSummary.setForefootRatio(jSONObject.optInt("forefoot_ratio", -1));
        sportSummary.setBindDevice(jSONObject.getString("bind_device"));
        sportSummary.setMaxPace((float) jSONObject.optDouble("max_pace", -1.0d));
        sportSummary.setMinPace((float) jSONObject.optDouble("min_pace", -1.0d));
        sportSummary.setDate(DateDay.from(sportSummary.getTrackid() * 1000).str());
        sportSummary.setAltitudeAscend(jSONObject.optInt("altitude_ascend", -1));
        sportSummary.setAltitudeDescend(jSONObject.optInt("altitude_descend", -1));
        sportSummary.setTotalStep(jSONObject.optInt("total_step", -1));
        sportSummary.setAvgStrideLength(jSONObject.optInt("avg_stride_length", -1));
        sportSummary.setLapDistance(jSONObject.optInt("lap_distance", -1));
        sportSummary.setMaxFrequency(jSONObject.optInt("max_frequency", -1));
        sportSummary.setMaxAltitude(jSONObject.optInt("max_altitude", -1));
        sportSummary.setMinAltitude(jSONObject.optInt("min_altitude", -1));
        sportSummary.setClimbDisAscend(jSONObject.optInt("distance_ascend", -1));
        sportSummary.setClimbDisDescend(jSONObject.optInt("climb_dis_descend", -1));
        sportSummary.setClimbDisAscendTime(jSONObject.optInt("climb_dis_ascend_time", -1));
        sportSummary.setClimbDisDescendTime(jSONObject.optInt("climb_dis_descend_time", -1));
        sportSummary.setAvgCadence(jSONObject.optInt("avg_cadence", -1));
        sportSummary.setMaxCadence(jSONObject.optInt("max_cadence", -1));
        sportSummary.setLandingTime(jSONObject.optInt("landing_time", -1));
        sportSummary.setFlightRatio(jSONObject.optInt("flight_ratio", -1));
        sportSummary.setParentTrackId(jSONObject.optLong("parent_trackid", -1L));
        sportSummary.setSportMode(jSONObject.optInt("sport_mode", 0));
        sportSummary.setTennisStrokes(jSONObject.optInt("strokes", 0));
        sportSummary.setRopeSkippingCount(jSONObject.optInt("rope_skipping_count"));
        sportSummary.setRopeSkippingMaxFrequency(jSONObject.optInt("rope_skipping_max_frequency"));
        sportSummary.setRopeSkippingAvgFrequency(jSONObject.optInt("rope_skipping_avg_frequency"));
        sportSummary.setRopeSkippingRestTime(jSONObject.optLong("rope_skipping_rest_time"));
        if (sportSummary.getType() == 21) {
            sportSummary.setTennisStrokes(sportSummary.getRopeSkippingCount());
        }
        sportSummary.setMarathon(jSONObject.optString("marathon"));
        sportSummary.setSourceData(jSONObject.toString());
        return sportSummary;
    }
}
