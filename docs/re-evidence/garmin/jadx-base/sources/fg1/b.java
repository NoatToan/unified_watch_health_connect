package fg1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lfg1/b;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "imageResName", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    BIKE_LIGHT_MAIN("BIKE_LIGHT_MAIN", R.string.sensor_name_type_bike_light_main, "icon_sensor_lights_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    BIKE_LIGHT_SHARED("BIKE_LIGHT_SHARED", R.string.sensor_name_type_bike_light_shared, "icon_sensor_lights_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    BIKE_SPEED_CADENCE("BIKE_SPEED_CADENCE", R.string.sensor_name_type_bike_speed_cadence, "icon_sensor_bike_cadence_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    BIKE_CADENCE("BIKE_CADENCE", R.string.sensor_name_type_bike_cadence, "icon_sensor_bike_cadence_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL("CONTROL", R.string.sensor_name_type_control, "icon_sensor_edge_remote_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    HEART_RATE("HEART_RATE", R.string.sensor_name_type_heart_rate, "icon_sensor_heart_rate_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_HUB("CONTROL_HUB", R.string.sensor_name_type_shifting, "icon_sensor_shifting_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    SHIFTING("SHIFTING", R.string.sensor_name_type_shifting, "icon_sensor_shifting_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    FOOTPOD("FOOTPOD", R.string.sensor_name_type_footpod, "icon_sensor_footpod_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    RUN("RUN", R.string.sensor_name_type_run, "icon_sensor_footpod_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    STRIDE_SPEED_DISTANCE("STRIDE_SPEED_DISTANCE", R.string.sensor_name_type_footpod, "icon_sensor_footpod_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    BIKE_RADAR("BIKE_RADAR", R.string.sensor_name_type_bike_radar, "icon_sensor_radar_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    FITNESS_EQUIPMENT("FITNESS_EQUIPMENT", R.string.sensor_name_type_fitness_equipment, "icon_sensor_smart_trainer_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    ENVIRONMENT_SENSOR_LEGACY("ENVIRONMENT_SENSOR_LEGACY", R.string.sensor_name_type_env_sensor, "icon_sensor_temperature_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    ENV_SENSOR("ENV_SENSOR", R.string.sensor_name_type_env_sensor, "icon_sensor_temperature_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    BIKE_POWER("EXD", R.string.sensor_name_type_exd, "icon_sensor_varia_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    BIKE_POWER("BIKE_POWER", R.string.sensor_name_type_bike_power, "icon_sensor_power_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    BIKE_SPEED("BIKE_SPEED", R.string.sensor_name_type_bike_speed, "icon_sensor_speed_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    ANTFS("ANTFS", R.string.sensor_name_type_antfs, "icon_sensor_other_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    MULTI_SPORT_SPEED_DISTANCE("MULTI_SPORT_SPEED_DISTANCE", R.string.sensor_name_type_multi_sport_speed_distance, "icon_sensor_other_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    BLOOD_PRESSURE("BLOOD_PRESSURE", R.string.sensor_name_type_blood_pressure, "icon_sensor_other_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    GEOCACHE_NODE("GEOCACHE_NODE", R.string.sensor_name_type_geocache_node, "icon_sensor_other_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHT_ELECTRIC_VEHICLE("LIGHT_ELECTRIC_VEHICLE", R.string.sensor_name_type_light_electric_vehicle, "icon_sensor_other_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVITY_MONITOR("ACTIVITY_MONITOR", R.string.sensor_name_type_activity_monitor, "icon_sensor_other_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    GLUCOSE_MONITOR("GLUCOSE_MONITOR", R.string.sensor_name_type_glucose_monitor, "icon_sensor_other_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    RACQUET("RACQUET", R.string.sensor_name_type_racquet, "icon_sensor_other_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    MUSCLE_OXYGEN("MUSCLE_OXYGEN", R.string.sensor_name_type_muscle_oxygen, "icon_sensor_other_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    BIKE_AERO("BIKE_AERO", R.string.sensor_name_type_bike_aero, "icon_sensor_other_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    WEIGHT_SCALE("WEIGHT_SCALE", R.string.sensor_name_type_weight_scale, "icon_sensor_other_dark"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID("INVALID", R.string.sensor_name_type_other, "icon_sensor_other_dark"),
    UNKNOWN("", R.string.sensor_name_type_other, "icon_sensor_other_dark");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f71392d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71397c;

    b(String str, int i14, String str2) {
        this.f71395a = str;
        this.f71396b = i14;
        this.f71397c = str2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfg1/b$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
