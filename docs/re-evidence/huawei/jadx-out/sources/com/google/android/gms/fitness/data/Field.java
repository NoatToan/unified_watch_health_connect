package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.common.base.Ascii;
import com.huawei.health.h5pro.utils.RequestCode;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseInfo;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public final class Field extends AbstractSafeParcelable {
    public static final int FORMAT_FLOAT = 2;
    public static final int FORMAT_INT32 = 1;
    public static final int FORMAT_MAP = 4;
    public static final int FORMAT_STRING = 3;
    public static final int MEAL_TYPE_BREAKFAST = 1;
    public static final int MEAL_TYPE_DINNER = 3;
    public static final int MEAL_TYPE_LUNCH = 2;
    public static final int MEAL_TYPE_SNACK = 4;
    public static final int MEAL_TYPE_UNKNOWN = 0;
    public static final String NUTRIENT_CALCIUM = "calcium";
    public static final String NUTRIENT_CALORIES = "calories";
    public static final String NUTRIENT_CHOLESTEROL = "cholesterol";
    public static final String NUTRIENT_DIETARY_FIBER = "dietary_fiber";
    public static final String NUTRIENT_IRON = "iron";
    public static final String NUTRIENT_MONOUNSATURATED_FAT = "fat.monounsaturated";
    public static final String NUTRIENT_POLYUNSATURATED_FAT = "fat.polyunsaturated";
    public static final String NUTRIENT_POTASSIUM = "potassium";
    public static final String NUTRIENT_PROTEIN = "protein";
    public static final String NUTRIENT_SATURATED_FAT = "fat.saturated";
    public static final String NUTRIENT_SODIUM = "sodium";
    public static final String NUTRIENT_SUGAR = "sugar";
    public static final String NUTRIENT_TOTAL_CARBS = "carbs.total";
    public static final String NUTRIENT_TOTAL_FAT = "fat.total";
    public static final String NUTRIENT_TRANS_FAT = "fat.trans";
    public static final String NUTRIENT_UNSATURATED_FAT = "fat.unsaturated";
    public static final String NUTRIENT_VITAMIN_A = "vitamin_a";
    public static final String NUTRIENT_VITAMIN_C = "vitamin_c";
    public static final int RESISTANCE_TYPE_BARBELL = 1;
    public static final int RESISTANCE_TYPE_BODY = 6;
    public static final int RESISTANCE_TYPE_CABLE = 2;
    public static final int RESISTANCE_TYPE_DUMBBELL = 3;
    public static final int RESISTANCE_TYPE_KETTLEBELL = 4;
    public static final int RESISTANCE_TYPE_MACHINE = 5;
    public static final int RESISTANCE_TYPE_UNKNOWN = 0;
    private final int format;
    private final String name;
    private final Boolean zzdd;
    public static final Field FIELD_ACTIVITY = zzd("activity");
    public static final Field FIELD_CONFIDENCE = zzf("confidence");
    public static final Field FIELD_ACTIVITY_CONFIDENCE = zzh("activity_confidence");
    public static final Field FIELD_STEPS = zzd(MedalConstants.EVENT_STEPS);
    public static final Field FIELD_STEP_LENGTH = zzf("step_length");
    public static final Field FIELD_DURATION = zzd("duration");
    private static final Field zzcg = zze("duration");
    private static final Field zzch = zzh("activity_duration");
    public static final Field zzci = zzh("activity_duration.ascending");
    public static final Field zzcj = zzh("activity_duration.descending");
    public static final Field FIELD_BPM = zzf("bpm");
    public static final Field FIELD_LATITUDE = zzf(JsbMapKeyNames.H5_LOC_LAT);
    public static final Field FIELD_LONGITUDE = zzf(JsbMapKeyNames.H5_LOC_LON);
    public static final Field FIELD_ACCURACY = zzf("accuracy");
    public static final Field FIELD_ALTITUDE = new Field("altitude", 2, true);
    public static final Field FIELD_DISTANCE = zzf("distance");
    public static final Field FIELD_HEIGHT = zzf("height");
    public static final Field FIELD_WEIGHT = zzf("weight");
    public static final Field FIELD_CIRCUMFERENCE = zzf("circumference");
    public static final Field FIELD_PERCENTAGE = zzf("percentage");
    public static final Field FIELD_SPEED = zzf("speed");
    public static final Field FIELD_RPM = zzf("rpm");
    public static final Field zzck = zzi("google.android.fitness.GoalV2");
    public static final Field zzcl = zzi("prescription_event");
    public static final Field zzcm = zzi("symptom");
    public static final Field zzcn = zzi("google.android.fitness.StrideModel");
    public static final Field zzco = zzi("google.android.fitness.Device");
    public static final Field FIELD_REVOLUTIONS = zzd("revolutions");
    public static final Field FIELD_CALORIES = zzf("calories");
    public static final Field FIELD_WATTS = zzf("watts");
    public static final Field FIELD_VOLUME = zzf("volume");
    public static final Field FIELD_MEAL_TYPE = zzd("meal_type");
    public static final Field FIELD_FOOD_ITEM = zzg("food_item");
    public static final Field FIELD_NUTRIENTS = zzh("nutrients");
    public static final Field zzcp = zzf("elevation.change");
    public static final Field zzcq = zzh("elevation.gain");
    public static final Field zzcr = zzh("elevation.loss");
    public static final Field zzcs = zzf("floors");
    public static final Field zzct = zzh("floor.gain");
    public static final Field zzcu = zzh("floor.loss");
    public static final Field FIELD_EXERCISE = zzg("exercise");
    public static final Field FIELD_REPETITIONS = zzd("repetitions");
    public static final Field FIELD_RESISTANCE = zzf("resistance");
    public static final Field FIELD_RESISTANCE_TYPE = zzd("resistance_type");
    public static final Field FIELD_NUM_SEGMENTS = zzd("num_segments");
    public static final Field FIELD_AVERAGE = zzf("average");
    public static final Field FIELD_MAX = zzf("max");
    public static final Field FIELD_MIN = zzf("min");
    public static final Field FIELD_LOW_LATITUDE = zzf("low_latitude");
    public static final Field FIELD_LOW_LONGITUDE = zzf("low_longitude");
    public static final Field FIELD_HIGH_LATITUDE = zzf("high_latitude");
    public static final Field FIELD_HIGH_LONGITUDE = zzf("high_longitude");
    public static final Field FIELD_OCCURRENCES = zzd("occurrences");
    public static final Field zzcv = zzd("sensor_type");
    public static final Field zzcw = zzd("sensor_types");
    public static final Field zzcx = new Field("timestamps", 5);
    public static final Field zzcy = zzd("sample_period");
    public static final Field zzcz = zzd("num_samples");
    public static final Field zzda = zzd("num_dimensions");
    public static final Field zzdb = new Field("sensor_values", 6);
    public static final Field FIELD_INTENSITY = zzf("intensity");
    public static final Field zzdc = zzf("probability");
    public static final Parcelable.Creator<Field> CREATOR = new zzq();

    public static final class zza {
        public static final Field zzde = Field.zzf("x");
        public static final Field zzdf = Field.zzf("y");
        public static final Field zzdg = Field.zzf("z");
        public static final Field zzdh = Field.zzj("debug_session");
        public static final Field zzdi = Field.zzj("google.android.fitness.SessionV2");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:405:0x059e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Field zza(String str, int i) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case -2131707655:
                if (!str.equals("accuracy")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -2083865430:
                if (!str.equals("debug_session")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -2006370880:
                if (!str.equals("body_temperature_measurement_location")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -1992012396:
                if (!str.equals("duration")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -1859447186:
                if (!str.equals("blood_glucose_level")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case -1743016407:
                if (!str.equals("symptom")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case -1655966961:
                if (!str.equals("activity")) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case -1595712862:
                if (!str.equals("cervical_dilation")) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case -1579612127:
                if (!str.equals("floor.gain")) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case -1579449403:
                if (!str.equals("floor.loss")) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case -1569430471:
                if (!str.equals("num_segments")) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case -1531570079:
                if (!str.equals("elevation.change")) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case -1440707631:
                if (!str.equals("oxygen_saturation")) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case -1439978388:
                if (!str.equals(JsbMapKeyNames.H5_LOC_LAT)) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case -1352492506:
                if (!str.equals("num_dimensions")) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case -1290561483:
                if (!str.equals("probability")) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case -1271636505:
                if (!str.equals("floors")) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case -1248595573:
                if (!str.equals("supplemental_oxygen_flow_rate_average")) {
                    b2 = -1;
                } else {
                    b2 = 17;
                }
                break;
            case -1221029593:
                if (!str.equals("height")) {
                    b2 = -1;
                } else {
                    b2 = 18;
                }
                break;
            case -1220952307:
                if (!str.equals("blood_pressure_measurement_location")) {
                    b2 = -1;
                } else {
                    b2 = 19;
                }
                break;
            case -1133736764:
                if (!str.equals("activity_duration")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.DC4;
                }
                break;
            case -1129337776:
                if (!str.equals("num_samples")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.NAK;
                }
                break;
            case -1110756780:
                if (!str.equals("food_item")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.SYN;
                }
                break;
            case -921832806:
                if (!str.equals("percentage")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.ETB;
                }
                break;
            case -918978307:
                if (!str.equals("cervical_position")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.CAN;
                }
                break;
            case -810883302:
                if (!str.equals("volume")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.EM;
                }
                break;
            case -803244749:
                if (!str.equals("blood_pressure_systolic")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.SUB;
                }
                break;
            case -791592328:
                if (!str.equals("weight")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.ESC;
                }
                break;
            case -631448035:
                if (!str.equals("average")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.FS;
                }
                break;
            case -626344110:
                if (!str.equals("high_longitude")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.GS;
                }
                break;
            case -619868540:
                if (!str.equals("low_longitude")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.RS;
                }
                break;
            case -511934137:
                if (!str.equals("sensor_values")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.US;
                }
                break;
            case -494782871:
                if (!str.equals("high_latitude")) {
                    b2 = -1;
                } else {
                    b2 = 32;
                }
                break;
            case -452643911:
                if (!str.equals("step_length")) {
                    b2 = -1;
                } else {
                    b2 = PublicSuffixDatabase.i;
                }
                break;
            case -437053898:
                if (!str.equals("meal_type")) {
                    b2 = -1;
                } else {
                    b2 = 34;
                }
                break;
            case -277306353:
                if (!str.equals("circumference")) {
                    b2 = -1;
                } else {
                    b2 = 35;
                }
                break;
            case -266093204:
                if (!str.equals("nutrients")) {
                    b2 = -1;
                } else {
                    b2 = 36;
                }
                break;
            case -228366862:
                if (!str.equals("oxygen_saturation_measurement_method")) {
                    b2 = -1;
                } else {
                    b2 = 37;
                }
                break;
            case -168965370:
                if (!str.equals("calories")) {
                    b2 = -1;
                } else {
                    b2 = 38;
                }
                break;
            case -126538880:
                if (!str.equals("resistance_type")) {
                    b2 = -1;
                } else {
                    b2 = 39;
                }
                break;
            case -28590302:
                if (!str.equals("ovulation_test_result")) {
                    b2 = -1;
                } else {
                    b2 = 40;
                }
                break;
            case 120:
                if (!str.equals("x")) {
                    b2 = -1;
                } else {
                    b2 = 41;
                }
                break;
            case 121:
                if (!str.equals("y")) {
                    b2 = -1;
                } else {
                    b2 = 42;
                }
                break;
            case 122:
                if (!str.equals("z")) {
                    b2 = -1;
                } else {
                    b2 = 43;
                }
                break;
            case 97759:
                if (!str.equals("bpm")) {
                    b2 = -1;
                } else {
                    b2 = 44;
                }
                break;
            case 107876:
                if (!str.equals("max")) {
                    b2 = -1;
                } else {
                    b2 = 45;
                }
                break;
            case 108114:
                if (!str.equals("min")) {
                    b2 = -1;
                } else {
                    b2 = 46;
                }
                break;
            case 113135:
                if (!str.equals("rpm")) {
                    b2 = -1;
                } else {
                    b2 = 47;
                }
                break;
            case 66639641:
                if (!str.equals("temporal_relation_to_sleep")) {
                    b2 = -1;
                } else {
                    b2 = 48;
                }
                break;
            case 109641799:
                if (!str.equals("speed")) {
                    b2 = -1;
                } else {
                    b2 = 49;
                }
                break;
            case 109761319:
                if (!str.equals(MedalConstants.EVENT_STEPS)) {
                    b2 = -1;
                } else {
                    b2 = 50;
                }
                break;
            case 112903913:
                if (!str.equals("watts")) {
                    b2 = -1;
                } else {
                    b2 = 51;
                }
                break;
            case 120904628:
                if (!str.equals("sensor_types")) {
                    b2 = -1;
                } else {
                    b2 = 52;
                }
                break;
            case 137365935:
                if (!str.equals(JsbMapKeyNames.H5_LOC_LON)) {
                    b2 = -1;
                } else {
                    b2 = 53;
                }
                break;
            case 198162679:
                if (!str.equals("low_latitude")) {
                    b2 = -1;
                } else {
                    b2 = 54;
                }
                break;
            case 220648413:
                if (!str.equals("blood_pressure_diastolic_average")) {
                    b2 = -1;
                } else {
                    b2 = 55;
                }
                break;
            case 248891292:
                if (!str.equals("blood_glucose_specimen_source")) {
                    b2 = -1;
                } else {
                    b2 = 56;
                }
                break;
            case 286612066:
                if (!str.equals("activity_duration.descending")) {
                    b2 = -1;
                } else {
                    b2 = 57;
                }
                break;
            case 288459765:
                if (!str.equals("distance")) {
                    b2 = -1;
                } else {
                    b2 = 58;
                }
                break;
            case 292126261:
                if (!str.equals("prescription_event")) {
                    b2 = -1;
                } else {
                    b2 = 59;
                }
                break;
            case 306600408:
                if (!str.equals("google.android.fitness.SessionV2")) {
                    b2 = -1;
                } else {
                    b2 = 60;
                }
                break;
            case 320627489:
                if (!str.equals("cervical_mucus_texture")) {
                    b2 = -1;
                } else {
                    b2 = 61;
                }
                break;
            case 419669488:
                if (!str.equals("google.android.fitness.Device")) {
                    b2 = -1;
                } else {
                    b2 = 62;
                }
                break;
            case 455965230:
                if (!str.equals("activity_duration.ascending")) {
                    b2 = -1;
                } else {
                    b2 = Utf8.REPLACEMENT_BYTE;
                }
                break;
            case 475560024:
                if (!str.equals("blood_pressure_systolic_max")) {
                    b2 = -1;
                } else {
                    b2 = 64;
                }
                break;
            case 475560262:
                if (!str.equals("blood_pressure_systolic_min")) {
                    b2 = -1;
                } else {
                    b2 = 65;
                }
                break;
            case 499324979:
                if (!str.equals("intensity")) {
                    b2 = -1;
                } else {
                    b2 = 66;
                }
                break;
            case 514168969:
                if (!str.equals("google.android.fitness.GoalV2")) {
                    b2 = -1;
                } else {
                    b2 = 67;
                }
                break;
            case 581888402:
                if (!str.equals("cervical_mucus_amount")) {
                    b2 = -1;
                } else {
                    b2 = 68;
                }
                break;
            case 623947695:
                if (!str.equals("oxygen_saturation_average")) {
                    b2 = -1;
                } else {
                    b2 = 69;
                }
                break;
            case 738210934:
                if (!str.equals("google.android.fitness.StrideModel")) {
                    b2 = -1;
                } else {
                    b2 = 70;
                }
                break;
            case 784486594:
                if (!str.equals("occurrences")) {
                    b2 = -1;
                } else {
                    b2 = 71;
                }
                break;
            case 811264586:
                if (!str.equals("revolutions")) {
                    b2 = -1;
                } else {
                    b2 = 72;
                }
                break;
            case 815736413:
                if (!str.equals("oxygen_saturation_system")) {
                    b2 = -1;
                } else {
                    b2 = 73;
                }
                break;
            case 829251210:
                if (!str.equals("confidence")) {
                    b2 = -1;
                } else {
                    b2 = 74;
                }
                break;
            case 833248065:
                if (!str.equals("temporal_relation_to_meal")) {
                    b2 = -1;
                } else {
                    b2 = 75;
                }
                break;
            case 883161687:
                if (!str.equals("body_temperature")) {
                    b2 = -1;
                } else {
                    b2 = 76;
                }
                break;
            case 984367650:
                if (!str.equals("repetitions")) {
                    b2 = -1;
                } else {
                    b2 = 77;
                }
                break;
            case 998412730:
                if (!str.equals("activity_confidence")) {
                    b2 = -1;
                } else {
                    b2 = 78;
                }
                break;
            case 1136011766:
                if (!str.equals("sample_period")) {
                    b2 = -1;
                } else {
                    b2 = 79;
                }
                break;
            case 1276952063:
                if (!str.equals("blood_pressure_diastolic")) {
                    b2 = -1;
                } else {
                    b2 = 80;
                }
                break;
            case 1284575222:
                if (!str.equals("oxygen_saturation_max")) {
                    b2 = -1;
                } else {
                    b2 = 81;
                }
                break;
            case 1284575460:
                if (!str.equals("oxygen_saturation_min")) {
                    b2 = -1;
                } else {
                    b2 = 82;
                }
                break;
            case 1403812644:
                if (!str.equals("blood_pressure_diastolic_max")) {
                    b2 = -1;
                } else {
                    b2 = 83;
                }
                break;
            case 1403812882:
                if (!str.equals("blood_pressure_diastolic_min")) {
                    b2 = -1;
                } else {
                    b2 = 84;
                }
                break;
            case 1527920799:
                if (!str.equals("sensor_type")) {
                    b2 = -1;
                } else {
                    b2 = 85;
                }
                break;
            case 1708915229:
                if (!str.equals("timestamps")) {
                    b2 = -1;
                } else {
                    b2 = 86;
                }
                break;
            case 1857734768:
                if (!str.equals("elevation.gain")) {
                    b2 = -1;
                } else {
                    b2 = 87;
                }
                break;
            case 1857897492:
                if (!str.equals("elevation.loss")) {
                    b2 = -1;
                } else {
                    b2 = 88;
                }
                break;
            case 1863800889:
                if (!str.equals("resistance")) {
                    b2 = -1;
                } else {
                    b2 = 89;
                }
                break;
            case 1880897007:
                if (!str.equals("oxygen_therapy_administration_mode")) {
                    b2 = -1;
                } else {
                    b2 = 90;
                }
                break;
            case 1892583496:
                if (!str.equals("menstrual_flow")) {
                    b2 = -1;
                } else {
                    b2 = 91;
                }
                break;
            case 1958191058:
                if (!str.equals("supplemental_oxygen_flow_rate_max")) {
                    b2 = -1;
                } else {
                    b2 = 92;
                }
                break;
            case 1958191296:
                if (!str.equals("supplemental_oxygen_flow_rate_min")) {
                    b2 = -1;
                } else {
                    b2 = 93;
                }
                break;
            case 1983072038:
                if (!str.equals("body_position")) {
                    b2 = -1;
                } else {
                    b2 = 94;
                }
                break;
            case 2020153105:
                if (!str.equals("blood_pressure_systolic_average")) {
                    b2 = -1;
                } else {
                    b2 = 95;
                }
                break;
            case 2036550306:
                if (!str.equals("altitude")) {
                    b2 = -1;
                } else {
                    b2 = 96;
                }
                break;
            case 2056323544:
                if (!str.equals("exercise")) {
                    b2 = -1;
                } else {
                    b2 = 97;
                }
                break;
            case 2072582505:
                if (!str.equals("cervical_firmness")) {
                    b2 = -1;
                } else {
                    b2 = 98;
                }
                break;
            case 2078370221:
                if (!str.equals("supplemental_oxygen_flow_rate")) {
                    b2 = -1;
                } else {
                    b2 = 99;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return FIELD_ACCURACY;
            case 1:
                return zza.zzdh;
            case 2:
                return HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION;
            case 3:
                return FIELD_DURATION;
            case 4:
                return HealthFields.FIELD_BLOOD_GLUCOSE_LEVEL;
            case 5:
                return zzcm;
            case 6:
                return FIELD_ACTIVITY;
            case 7:
                return HealthFields.FIELD_CERVICAL_DILATION;
            case 8:
                return zzct;
            case 9:
                return zzcu;
            case 10:
                return FIELD_NUM_SEGMENTS;
            case 11:
                return zzcp;
            case 12:
                return HealthFields.FIELD_OXYGEN_SATURATION;
            case 13:
                return FIELD_LATITUDE;
            case 14:
                return zzda;
            case 15:
                return zzdc;
            case 16:
                return zzcs;
            case 17:
                return HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_AVERAGE;
            case 18:
                return FIELD_HEIGHT;
            case 19:
                return HealthFields.FIELD_BLOOD_PRESSURE_MEASUREMENT_LOCATION;
            case 20:
                return zzch;
            case 21:
                return zzcz;
            case 22:
                return FIELD_FOOD_ITEM;
            case 23:
                return FIELD_PERCENTAGE;
            case 24:
                return HealthFields.FIELD_CERVICAL_POSITION;
            case 25:
                return FIELD_VOLUME;
            case 26:
                return HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC;
            case 27:
                return FIELD_WEIGHT;
            case 28:
                return FIELD_AVERAGE;
            case 29:
                return FIELD_HIGH_LONGITUDE;
            case 30:
                return FIELD_LOW_LONGITUDE;
            case 31:
                return zzdb;
            case 32:
                return FIELD_HIGH_LATITUDE;
            case 33:
                return FIELD_STEP_LENGTH;
            case 34:
                return FIELD_MEAL_TYPE;
            case 35:
                return FIELD_CIRCUMFERENCE;
            case 36:
                return FIELD_NUTRIENTS;
            case 37:
                return HealthFields.FIELD_OXYGEN_SATURATION_MEASUREMENT_METHOD;
            case 38:
                return FIELD_CALORIES;
            case 39:
                return FIELD_RESISTANCE_TYPE;
            case 40:
                return HealthFields.FIELD_OVULATION_TEST_RESULT;
            case 41:
                return zza.zzde;
            case 42:
                return zza.zzdf;
            case 43:
                return zza.zzdg;
            case 44:
                return FIELD_BPM;
            case 45:
                return FIELD_MAX;
            case 46:
                return FIELD_MIN;
            case 47:
                return FIELD_RPM;
            case 48:
                return HealthFields.FIELD_TEMPORAL_RELATION_TO_SLEEP;
            case 49:
                return FIELD_SPEED;
            case 50:
                return FIELD_STEPS;
            case 51:
                return FIELD_WATTS;
            case 52:
                return zzcw;
            case 53:
                return FIELD_LONGITUDE;
            case 54:
                return FIELD_LOW_LATITUDE;
            case 55:
                return HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_AVERAGE;
            case 56:
                return HealthFields.FIELD_BLOOD_GLUCOSE_SPECIMEN_SOURCE;
            case 57:
                return zzcj;
            case 58:
                return FIELD_DISTANCE;
            case 59:
                return zzcl;
            case 60:
                return zza.zzdi;
            case 61:
                return HealthFields.FIELD_CERVICAL_MUCUS_TEXTURE;
            case 62:
                return zzco;
            case 63:
                return zzci;
            case 64:
                return HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_MAX;
            case 65:
                return HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_MIN;
            case 66:
                return FIELD_INTENSITY;
            case 67:
                return zzck;
            case 68:
                return HealthFields.FIELD_CERVICAL_MUCUS_AMOUNT;
            case 69:
                return HealthFields.FIELD_OXYGEN_SATURATION_AVERAGE;
            case 70:
                return zzcn;
            case 71:
                return FIELD_OCCURRENCES;
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                return FIELD_REVOLUTIONS;
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                return HealthFields.FIELD_OXYGEN_SATURATION_SYSTEM;
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_POOL /* 74 */:
                return FIELD_CONFIDENCE;
            case ExerciseSessionRecord.EXERCISE_TYPE_TABLE_TENNIS /* 75 */:
                return HealthFields.FIELD_TEMPORAL_RELATION_TO_MEAL;
            case 76:
                return HealthFields.FIELD_BODY_TEMPERATURE;
            case 77:
                return FIELD_REPETITIONS;
            case ExerciseSessionRecord.EXERCISE_TYPE_VOLLEYBALL /* 78 */:
                return FIELD_ACTIVITY_CONFIDENCE;
            case ExerciseSessionRecord.EXERCISE_TYPE_WALKING /* 79 */:
                return zzcy;
            case 80:
                return HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC;
            case ExerciseSessionRecord.EXERCISE_TYPE_WEIGHTLIFTING /* 81 */:
                return HealthFields.FIELD_OXYGEN_SATURATION_MAX;
            case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
                return HealthFields.FIELD_OXYGEN_SATURATION_MIN;
            case ExerciseSessionRecord.EXERCISE_TYPE_YOGA /* 83 */:
                return HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_MAX;
            case 84:
                return HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_MIN;
            case Constants.MAX_PRO_BOTTOM_MARGIN /* 85 */:
                return zzcv;
            case RequestCode.SCANNER_PERMISSION_REQUEST_CODE /* 86 */:
                return zzcx;
            case 87:
                return zzcq;
            case 88:
                return zzcr;
            case 89:
                return FIELD_RESISTANCE;
            case 90:
                return HealthFields.FIELD_OXYGEN_THERAPY_ADMINISTRATION_MODE;
            case 91:
                return HealthFields.FIELD_MENSTRUAL_FLOW;
            case GolfCourseInfo.DATA_LENGTH /* 92 */:
                return HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MAX;
            case 93:
                return HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MIN;
            case 94:
                return HealthFields.FIELD_BODY_POSITION;
            case 95:
                return HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_AVERAGE;
            case 96:
                return FIELD_ALTITUDE;
            case 97:
                return FIELD_EXERCISE;
            case Constants.DEFAULT_PRO_BOT_MARGIN_PAD /* 98 */:
                return HealthFields.FIELD_CERVICAL_FIRMNESS;
            case 99:
                return HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE;
            default:
                return new Field(str, i, null);
        }
    }

    private static Field zzd(String str) {
        return new Field(str, 1);
    }

    static Field zze(String str) {
        return new Field(str, 1, true);
    }

    static Field zzf(String str) {
        return new Field(str, 2);
    }

    private static Field zzg(String str) {
        return new Field(str, 3);
    }

    private static Field zzh(String str) {
        return new Field(str, 4);
    }

    private static Field zzi(String str) {
        return new Field(str, 7);
    }

    static Field zzj(String str) {
        return new Field(str, 7, true);
    }

    private Field(String str, int i) {
        this(str, i, null);
    }

    Field(String str, int i, Boolean bool) {
        this.name = (String) Preconditions.checkNotNull(str);
        this.format = i;
        this.zzdd = bool;
    }

    public final String getName() {
        return this.name;
    }

    public final int getFormat() {
        return this.format;
    }

    public final Boolean isOptional() {
        return this.zzdd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Field)) {
            return false;
        }
        Field field = (Field) obj;
        return this.name.equals(field.name) && this.format == field.format;
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final String toString() {
        return String.format("%s(%s)", this.name, this.format == 1 ? CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT : "f");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, getFormat());
        SafeParcelWriter.writeBooleanObject(parcel, 3, isOptional(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
