package defpackage;

import com.huawei.pluginsocialshare.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes42.dex */
public class pnt {
    private static final HashMap<String, Integer> e;

    static {
        HashMap<String, Integer> map = new HashMap<>();
        e = map;
        map.put("h5_calorieConsumed", Integer.valueOf(R.mipmap.sport_total_calories_select));
        map.put("h5_sportTime", Integer.valueOf(R.mipmap.clock_fill_select));
        map.put("h5_totalScore", Integer.valueOf(R.mipmap.sport_total_score));
        map.put("h5_totalPutt", Integer.valueOf(R.mipmap.sport_total_putt));
        map.put("h5_fairwayHitRate", Integer.valueOf(R.mipmap.sport_fairway_hit_rate));
        map.put("h5_gir", Integer.valueOf(R.mipmap.sport_gir));
        map.put("h5_avgPutt", Integer.valueOf(R.mipmap.sport_avg_putt));
        map.put("h5_avgHandicap", Integer.valueOf(R.mipmap.sport_h5_avg_handicap));
        map.put("h5_maxDepth", Integer.valueOf(R.mipmap.sport_max_depth));
        map.put("h5_diveSportTime", Integer.valueOf(R.mipmap.sport_ic_time));
        map.put("h5_underwaterTime", Integer.valueOf(R.mipmap.sport_under_water_time));
        map.put("h5_waterType", Integer.valueOf(R.mipmap.sport_water_type));
        map.put("h5_diveNumber", Integer.valueOf(R.mipmap.sport_dive_number));
        map.put("h5_minWaterTemperature", Integer.valueOf(R.mipmap.sport_min_water_temperature));
        map.put("h5_maxSingleTime", Integer.valueOf(R.mipmap.clock_fill_select));
        map.put("h5_breakTime", Integer.valueOf(R.mipmap.clock_fill_select));
        map.put("h5_closedBreathTime", Integer.valueOf(R.mipmap.sport_closed_breath_time));
        map.put("h5_avgHeartRate", Integer.valueOf(R.mipmap.avg_heart_rate_select));
        map.put("h5_heartRateRange", Integer.valueOf(R.mipmap.sport_heart_rate_range));
        map.put("h5_diaphragm", Integer.valueOf(R.mipmap.sport_ic_time));
        map.put("h5_breathTime", Integer.valueOf(R.mipmap.sport_breath_time));
        map.put("h5_maxWaterTemperature", Integer.valueOf(R.mipmap.sport_max_water_temperature));
        map.put("h5_avgDepth", Integer.valueOf(R.mipmap.sport_avg_depth));
        map.put("h5_avgSwingTempo", Integer.valueOf(R.mipmap.golf_swing_tempo_select));
        map.put("h5_avgBackSwingTime", Integer.valueOf(R.mipmap.golf_swing_back_time_select));
        map.put("h5_avgDownSwingTime", Integer.valueOf(R.mipmap.golf_swing_down_time_select));
        map.put("h5_maxSwingSpeed", Integer.valueOf(R.mipmap.golf_swing_max_speed_select));
        map.put("h5_swingSpeed", Integer.valueOf(R.mipmap.golf_swing_average_speed_select));
    }

    public static Integer d(String str) {
        HashMap<String, Integer> map = e;
        if (!map.containsKey(str)) {
            return 0;
        }
        return map.get(str);
    }
}
