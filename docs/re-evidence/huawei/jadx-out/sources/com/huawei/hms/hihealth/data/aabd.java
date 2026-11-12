package com.huawei.hms.hihealth.data;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class aabd {
    static final Map<DataType, List<DataType>> aab;

    static {
        HashMap map = new HashMap();
        aab = map;
        map.put(DataType.DT_CONTINUOUS_CALORIES_BURNT, Collections.singletonList(DataType.DT_CONTINUOUS_CALORIES_BURNT_TOTAL));
        map.put(DataType.DT_CONTINUOUS_DISTANCE_DELTA, Collections.singletonList(DataType.DT_CONTINUOUS_DISTANCE_TOTAL));
        map.put(DataType.DT_INSTANTANEOUS_HEART_RATE, Collections.singletonList(DataType.POLYMERIZE_CONTINUOUS_HEART_RATE_STATISTICS));
        map.put(DataType.DT_CONTINUOUS_STEPS_DELTA, Collections.singletonList(DataType.DT_CONTINUOUS_STEPS_TOTAL));
        map.put(DataType.DT_INSTANTANEOUS_BODY_WEIGHT, Collections.singletonList(DataType.POLYMERIZE_CONTINUOUS_BODY_WEIGHT_STATISTICS));
        map.put(DataType.DT_CONTINUOUS_SLEEP, Collections.singletonList(DataType.DT_STATISTICS_SLEEP));
        map.put(DataType.DT_INSTANTANEOUS_STRESS, Collections.singletonList(DataType.DT_INSTANTANEOUS_STRESS_STATISTICS));
        map.put(DataType.DT_CONTINUOUS_EXERCISE_INTENSITY_V2, Collections.singletonList(DataType.DT_STATISTICS_EXERCISE_INTENSITY_V2));
        map.put(DataType.DT_INSTANTANEOUS_RESTING_HEART_RATE, Collections.singletonList(DataType.DT_RESTING_HEART_RATE_STATISTICS));
        map.put(DataType.DT_INSTANTANEOUS_EXERCISE_HEART_RATE, Collections.singletonList(DataType.DT_CONTINUOUS_EXERCISE_HEART_RATE_STATISTICS));
        map.put(DataType.DT_CONTINUOUS_JUMP, Collections.singletonList(DataType.DT_CONTINUOUS_JUMP_STATISTICS));
        map.put(HealthDataTypes.DT_INSTANTANEOUS_BODY_TEMPERATURE, Collections.singletonList(HealthDataTypes.POLYMERIZE_CONTINUOUS_BODY_TEMPERATURE_STATISTICS));
        map.put(HealthDataTypes.DT_INSTANTANEOUS_SKIN_TEMPERATURE, Collections.singletonList(HealthDataTypes.POLYMERIZE_CONTINUOUS_SKIN_TEMPERATURE_STATISTICS));
        map.put(DataType.DT_INSTANTANEOUS_ALTITUDE, Collections.singletonList(DataType.DT_CONTINUOUS_ALTITUDE_STATISTICS));
        map.put(DataType.DT_INSTANTANEOUS_SKIP_SPEED, Collections.singletonList(DataType.DT_CONTINUOUS_SKIP_SPEED_STATISTICS));
        map.put(DataType.DT_INSTANTANEOUS_FREEDIVING_ASCENT_SPEED, Collections.singletonList(DataType.DT_CONTINUOUS_FREEDIVING_ASCENT_SPEED_STATISTICS));
        map.put(DataType.DT_INSTANTANEOUS_FREEDIVING_DESCENT_SPEED, Collections.singletonList(DataType.DT_CONTINUOUS_FREEDIVING_DESCENT_SPEED_STATISTICS));
        map.put(HealthDataTypes.DT_INSTANTANEOUS_BLOOD_PRESSURE, Collections.singletonList(HealthDataTypes.POLYMERIZE_CONTINUOUS_BODY_BLOOD_PRESSURE_STATISTICS));
        map.put(DataType.DT_INSTANTANEOUS_STROKE_RATE, Collections.singletonList(DataType.DT_CONTINUOUS_STROKE_RATE_STATISTICS));
        map.put(DataType.DT_INSTANTANEOUS_PEDALING_RATE, Collections.singletonList(DataType.DT_CONTINUOUS_PEDALING_RATE_STATISTICS));
        map.put(DataType.DT_INSTANTANEOUS_HYDRATE, Collections.singletonList(DataType.DT_CONTINUOUS_HYDRATE_TOTAL));
        map.put(HealthDataTypes.DT_INSTANTANEOUS_SPO2, Collections.singletonList(HealthDataTypes.POLYMERIZE_CONTINUOUS_SPO2_STATISTICS));
        map.put(DataType.DT_INSTANTANEOUS_SWIMMING_STROKE_RATE, Collections.singletonList(DataType.DT_CONTINUOUS_SWIMMING_STROKE_RATE_STATISTICS));
        map.put(DataType.DT_INSTANTANEOUS_SWIMMING_SWOLF, Collections.singletonList(DataType.DT_CONTINUOUS_SWIMMING_SWOLF_STATISTICS));
        map.put(DataType.DT_VO2MAX, Collections.singletonList(DataType.DT_VO2MAX_STATISTICS));
        map.put(HealthDataTypes.DT_CGM_BLOOD_GLUCOSE, Collections.singletonList(HealthDataTypes.POLYMERIZE_CGM_BLOOD_GLUCOSE_STATISTICS));
    }
}
