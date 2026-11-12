package androidx.health.connect.client.permission;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.ActiveCaloriesBurnedRecord;
import androidx.health.connect.client.records.BasalBodyTemperatureRecord;
import androidx.health.connect.client.records.BasalMetabolicRateRecord;
import androidx.health.connect.client.records.BloodGlucoseRecord;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.records.BodyFatRecord;
import androidx.health.connect.client.records.BodyTemperatureRecord;
import androidx.health.connect.client.records.BodyWaterMassRecord;
import androidx.health.connect.client.records.BoneMassRecord;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.health.connect.client.records.CyclingPedalingCadenceRecord;
import androidx.health.connect.client.records.DistanceRecord;
import androidx.health.connect.client.records.ElevationGainedRecord;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.health.connect.client.records.FloorsClimbedRecord;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.HeartRateVariabilityRmssdRecord;
import androidx.health.connect.client.records.HeightRecord;
import androidx.health.connect.client.records.HydrationRecord;
import androidx.health.connect.client.records.IntermenstrualBleedingRecord;
import androidx.health.connect.client.records.LeanBodyMassRecord;
import androidx.health.connect.client.records.MenstruationFlowRecord;
import androidx.health.connect.client.records.MenstruationPeriodRecord;
import androidx.health.connect.client.records.MindfulnessSessionRecord;
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.health.connect.client.records.OxygenSaturationRecord;
import androidx.health.connect.client.records.PlannedExerciseSessionRecord;
import androidx.health.connect.client.records.PowerRecord;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.RespiratoryRateRecord;
import androidx.health.connect.client.records.RestingHeartRateRecord;
import androidx.health.connect.client.records.SexualActivityRecord;
import androidx.health.connect.client.records.SkinTemperatureRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.records.StepsRecord;
import androidx.health.connect.client.records.TotalCaloriesBurnedRecord;
import androidx.health.connect.client.records.Vo2MaxRecord;
import androidx.health.connect.client.records.WeightRecord;
import androidx.health.connect.client.records.WheelchairPushesRecord;
import defpackage.yyz;
import defpackage.yzp;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zcv;
import defpackage.zes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/health/connect/client/permission/HealthPermission;", "", "<init>", "()V", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthPermission {
    public static final List<String> ALL_PERMISSIONS;
    public static final List<String> ALL_PERSONAL_HEALTH_RECORD_PERMISSIONS;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String PERMISSION_PREFIX = "android.permission.health.";
    public static final String PERMISSION_READ_HEALTH_DATA_HISTORY = "android.permission.health.READ_HEALTH_DATA_HISTORY";
    public static final String PERMISSION_READ_HEALTH_DATA_IN_BACKGROUND = "android.permission.health.READ_HEALTH_DATA_IN_BACKGROUND";
    public static final String PERMISSION_READ_MEDICAL_DATA_ALLERGIES_INTOLERANCES = "android.permission.health.READ_MEDICAL_DATA_ALLERGIES_INTOLERANCES";
    public static final String PERMISSION_READ_MEDICAL_DATA_CONDITIONS = "android.permission.health.READ_MEDICAL_DATA_CONDITIONS";
    public static final String PERMISSION_READ_MEDICAL_DATA_LABORATORY_RESULTS = "android.permission.health.READ_MEDICAL_DATA_LABORATORY_RESULTS";
    public static final String PERMISSION_READ_MEDICAL_DATA_MEDICATIONS = "android.permission.health.READ_MEDICAL_DATA_MEDICATIONS";
    public static final String PERMISSION_READ_MEDICAL_DATA_PERSONAL_DETAILS = "android.permission.health.READ_MEDICAL_DATA_PERSONAL_DETAILS";
    public static final String PERMISSION_READ_MEDICAL_DATA_PRACTITIONER_DETAILS = "android.permission.health.READ_MEDICAL_DATA_PRACTITIONER_DETAILS";
    public static final String PERMISSION_READ_MEDICAL_DATA_PREGNANCY = "android.permission.health.READ_MEDICAL_DATA_PREGNANCY";
    public static final String PERMISSION_READ_MEDICAL_DATA_PROCEDURES = "android.permission.health.READ_MEDICAL_DATA_PROCEDURES";
    public static final String PERMISSION_READ_MEDICAL_DATA_SOCIAL_HISTORY = "android.permission.health.READ_MEDICAL_DATA_SOCIAL_HISTORY";
    public static final String PERMISSION_READ_MEDICAL_DATA_VACCINES = "android.permission.health.READ_MEDICAL_DATA_VACCINES";
    public static final String PERMISSION_READ_MEDICAL_DATA_VISITS = "android.permission.health.READ_MEDICAL_DATA_VISITS";
    public static final String PERMISSION_READ_MEDICAL_DATA_VITAL_SIGNS = "android.permission.health.READ_MEDICAL_DATA_VITAL_SIGNS";
    public static final String PERMISSION_WRITE_EXERCISE_ROUTE = "android.permission.health.WRITE_EXERCISE_ROUTE";
    public static final String PERMISSION_WRITE_MEDICAL_DATA = "android.permission.health.WRITE_MEDICAL_DATA";
    public static final String READ_ACTIVE_CALORIES_BURNED = "android.permission.health.READ_ACTIVE_CALORIES_BURNED";
    public static final String READ_BASAL_BODY_TEMPERATURE = "android.permission.health.READ_BASAL_BODY_TEMPERATURE";
    public static final String READ_BASAL_METABOLIC_RATE = "android.permission.health.READ_BASAL_METABOLIC_RATE";
    public static final String READ_BLOOD_GLUCOSE = "android.permission.health.READ_BLOOD_GLUCOSE";
    public static final String READ_BLOOD_PRESSURE = "android.permission.health.READ_BLOOD_PRESSURE";
    public static final String READ_BODY_FAT = "android.permission.health.READ_BODY_FAT";
    public static final String READ_BODY_TEMPERATURE = "android.permission.health.READ_BODY_TEMPERATURE";
    public static final String READ_BODY_WATER_MASS = "android.permission.health.READ_BODY_WATER_MASS";
    public static final String READ_BONE_MASS = "android.permission.health.READ_BONE_MASS";
    public static final String READ_CERVICAL_MUCUS = "android.permission.health.READ_CERVICAL_MUCUS";
    public static final String READ_DISTANCE = "android.permission.health.READ_DISTANCE";
    public static final String READ_ELEVATION_GAINED = "android.permission.health.READ_ELEVATION_GAINED";
    public static final String READ_EXERCISE = "android.permission.health.READ_EXERCISE";
    public static final String READ_FLOORS_CLIMBED = "android.permission.health.READ_FLOORS_CLIMBED";
    public static final String READ_HEART_RATE = "android.permission.health.READ_HEART_RATE";
    public static final String READ_HEART_RATE_VARIABILITY = "android.permission.health.READ_HEART_RATE_VARIABILITY";
    public static final String READ_HEIGHT = "android.permission.health.READ_HEIGHT";
    public static final String READ_HYDRATION = "android.permission.health.READ_HYDRATION";
    public static final String READ_INTERMENSTRUAL_BLEEDING = "android.permission.health.READ_INTERMENSTRUAL_BLEEDING";
    public static final String READ_LEAN_BODY_MASS = "android.permission.health.READ_LEAN_BODY_MASS";
    public static final String READ_MENSTRUATION = "android.permission.health.READ_MENSTRUATION";
    public static final String READ_MINDFULNESS_SESSION = "android.permission.health.READ_MINDFULNESS";
    public static final String READ_NUTRITION = "android.permission.health.READ_NUTRITION";
    public static final String READ_OVULATION_TEST = "android.permission.health.READ_OVULATION_TEST";
    public static final String READ_OXYGEN_SATURATION = "android.permission.health.READ_OXYGEN_SATURATION";
    public static final String READ_PERMISSION_PREFIX = "android.permission.health.READ_";
    public static final String READ_PLANNED_EXERCISE = "android.permission.health.READ_PLANNED_EXERCISE";
    public static final String READ_POWER = "android.permission.health.READ_POWER";
    public static final String READ_RESPIRATORY_RATE = "android.permission.health.READ_RESPIRATORY_RATE";
    public static final String READ_RESTING_HEART_RATE = "android.permission.health.READ_RESTING_HEART_RATE";
    public static final String READ_SEXUAL_ACTIVITY = "android.permission.health.READ_SEXUAL_ACTIVITY";
    public static final String READ_SKIN_TEMPERATURE = "android.permission.health.READ_SKIN_TEMPERATURE";
    public static final String READ_SLEEP = "android.permission.health.READ_SLEEP";
    public static final String READ_SPEED = "android.permission.health.READ_SPEED";
    public static final String READ_STEPS = "android.permission.health.READ_STEPS";
    public static final String READ_TOTAL_CALORIES_BURNED = "android.permission.health.READ_TOTAL_CALORIES_BURNED";
    public static final String READ_VO2_MAX = "android.permission.health.READ_VO2_MAX";
    public static final String READ_WEIGHT = "android.permission.health.READ_WEIGHT";
    public static final String READ_WHEELCHAIR_PUSHES = "android.permission.health.READ_WHEELCHAIR_PUSHES";
    private static final Map<KClass<? extends Record>, String> RECORD_TYPE_TO_PERMISSION;
    public static final String WRITE_ACTIVE_CALORIES_BURNED = "android.permission.health.WRITE_ACTIVE_CALORIES_BURNED";
    public static final String WRITE_BASAL_BODY_TEMPERATURE = "android.permission.health.WRITE_BASAL_BODY_TEMPERATURE";
    public static final String WRITE_BASAL_METABOLIC_RATE = "android.permission.health.WRITE_BASAL_METABOLIC_RATE";
    public static final String WRITE_BLOOD_GLUCOSE = "android.permission.health.WRITE_BLOOD_GLUCOSE";
    public static final String WRITE_BLOOD_PRESSURE = "android.permission.health.WRITE_BLOOD_PRESSURE";
    public static final String WRITE_BODY_FAT = "android.permission.health.WRITE_BODY_FAT";
    public static final String WRITE_BODY_TEMPERATURE = "android.permission.health.WRITE_BODY_TEMPERATURE";
    public static final String WRITE_BODY_WATER_MASS = "android.permission.health.WRITE_BODY_WATER_MASS";
    public static final String WRITE_BONE_MASS = "android.permission.health.WRITE_BONE_MASS";
    public static final String WRITE_CERVICAL_MUCUS = "android.permission.health.WRITE_CERVICAL_MUCUS";
    public static final String WRITE_DISTANCE = "android.permission.health.WRITE_DISTANCE";
    public static final String WRITE_ELEVATION_GAINED = "android.permission.health.WRITE_ELEVATION_GAINED";
    public static final String WRITE_EXERCISE = "android.permission.health.WRITE_EXERCISE";
    public static final String WRITE_FLOORS_CLIMBED = "android.permission.health.WRITE_FLOORS_CLIMBED";
    public static final String WRITE_HEART_RATE = "android.permission.health.WRITE_HEART_RATE";
    public static final String WRITE_HEART_RATE_VARIABILITY = "android.permission.health.WRITE_HEART_RATE_VARIABILITY";
    public static final String WRITE_HEIGHT = "android.permission.health.WRITE_HEIGHT";
    public static final String WRITE_HYDRATION = "android.permission.health.WRITE_HYDRATION";
    public static final String WRITE_INTERMENSTRUAL_BLEEDING = "android.permission.health.WRITE_INTERMENSTRUAL_BLEEDING";
    public static final String WRITE_LEAN_BODY_MASS = "android.permission.health.WRITE_LEAN_BODY_MASS";
    public static final String WRITE_MENSTRUATION = "android.permission.health.WRITE_MENSTRUATION";
    public static final String WRITE_MINDFULNESS_SESSION = "android.permission.health.WRITE_MINDFULNESS";
    public static final String WRITE_NUTRITION = "android.permission.health.WRITE_NUTRITION";
    public static final String WRITE_OVULATION_TEST = "android.permission.health.WRITE_OVULATION_TEST";
    public static final String WRITE_OXYGEN_SATURATION = "android.permission.health.WRITE_OXYGEN_SATURATION";
    public static final String WRITE_PERMISSION_PREFIX = "android.permission.health.WRITE_";
    public static final String WRITE_PLANNED_EXERCISE = "android.permission.health.WRITE_PLANNED_EXERCISE";
    public static final String WRITE_POWER = "android.permission.health.WRITE_POWER";
    public static final String WRITE_RESPIRATORY_RATE = "android.permission.health.WRITE_RESPIRATORY_RATE";
    public static final String WRITE_RESTING_HEART_RATE = "android.permission.health.WRITE_RESTING_HEART_RATE";
    public static final String WRITE_SEXUAL_ACTIVITY = "android.permission.health.WRITE_SEXUAL_ACTIVITY";
    public static final String WRITE_SKIN_TEMPERATURE = "android.permission.health.WRITE_SKIN_TEMPERATURE";
    public static final String WRITE_SLEEP = "android.permission.health.WRITE_SLEEP";
    public static final String WRITE_SPEED = "android.permission.health.WRITE_SPEED";
    public static final String WRITE_STEPS = "android.permission.health.WRITE_STEPS";
    public static final String WRITE_TOTAL_CALORIES_BURNED = "android.permission.health.WRITE_TOTAL_CALORIES_BURNED";
    public static final String WRITE_VO2_MAX = "android.permission.health.WRITE_VO2_MAX";
    public static final String WRITE_WEIGHT = "android.permission.health.WRITE_WEIGHT";
    public static final String WRITE_WHEELCHAIR_PUSHES = "android.permission.health.WRITE_WHEELCHAIR_PUSHES";

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bp\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0007H\u0087\bJ\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\tH\u0007J\u0015\u0010\n\u001a\u00020\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0007H\u0087\bJ\u0018\u0010\n\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\tH\u0007R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0003R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0003R\u0016\u0010\u001b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0003R\u0016\u0010\u001d\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u0003R\u0016\u0010\u001f\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b \u0010\u0003R\u0016\u0010!\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\u0003R\u0016\u0010#\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b$\u0010\u0003R\u0016\u0010%\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b&\u0010\u0003R\u0016\u0010'\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b(\u0010\u0003R\u000e\u0010)\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0016\u0010A\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\bB\u0010\u0003R\u000e\u0010C\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0016\u0010j\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\bk\u0010\u0003R\u000e\u0010l\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R.\u0010y\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\t\u0012\u0004\u0012\u00020\u00050zX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b{\u0010\u0003\u001a\u0004\b|\u0010}R\u001d\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00050\u007f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u0012\u0005\b\u0080\u0001\u0010\u0003R\u0017\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u007f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0082\u0001"}, d2 = {"Landroidx/health/connect/client/permission/HealthPermission$Companion;", "", "<init>", "()V", "getReadPermission", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/Record;", "recordType", "Lkotlin/reflect/KClass;", "getWritePermission", "PERMISSION_PREFIX", "PERMISSION_WRITE_EXERCISE_ROUTE", "PERMISSION_READ_HEALTH_DATA_IN_BACKGROUND", "PERMISSION_READ_HEALTH_DATA_HISTORY", "PERMISSION_WRITE_MEDICAL_DATA", "getPERMISSION_WRITE_MEDICAL_DATA$annotations", "PERMISSION_READ_MEDICAL_DATA_ALLERGIES_INTOLERANCES", "getPERMISSION_READ_MEDICAL_DATA_ALLERGIES_INTOLERANCES$annotations", "PERMISSION_READ_MEDICAL_DATA_CONDITIONS", "getPERMISSION_READ_MEDICAL_DATA_CONDITIONS$annotations", "PERMISSION_READ_MEDICAL_DATA_LABORATORY_RESULTS", "getPERMISSION_READ_MEDICAL_DATA_LABORATORY_RESULTS$annotations", "PERMISSION_READ_MEDICAL_DATA_MEDICATIONS", "getPERMISSION_READ_MEDICAL_DATA_MEDICATIONS$annotations", "PERMISSION_READ_MEDICAL_DATA_PERSONAL_DETAILS", "getPERMISSION_READ_MEDICAL_DATA_PERSONAL_DETAILS$annotations", "PERMISSION_READ_MEDICAL_DATA_PRACTITIONER_DETAILS", "getPERMISSION_READ_MEDICAL_DATA_PRACTITIONER_DETAILS$annotations", "PERMISSION_READ_MEDICAL_DATA_PREGNANCY", "getPERMISSION_READ_MEDICAL_DATA_PREGNANCY$annotations", "PERMISSION_READ_MEDICAL_DATA_PROCEDURES", "getPERMISSION_READ_MEDICAL_DATA_PROCEDURES$annotations", "PERMISSION_READ_MEDICAL_DATA_SOCIAL_HISTORY", "getPERMISSION_READ_MEDICAL_DATA_SOCIAL_HISTORY$annotations", "PERMISSION_READ_MEDICAL_DATA_VACCINES", "getPERMISSION_READ_MEDICAL_DATA_VACCINES$annotations", "PERMISSION_READ_MEDICAL_DATA_VISITS", "getPERMISSION_READ_MEDICAL_DATA_VISITS$annotations", "PERMISSION_READ_MEDICAL_DATA_VITAL_SIGNS", "getPERMISSION_READ_MEDICAL_DATA_VITAL_SIGNS$annotations", "READ_ACTIVE_CALORIES_BURNED", "READ_DISTANCE", "READ_ELEVATION_GAINED", "READ_EXERCISE", "READ_FLOORS_CLIMBED", "READ_STEPS", "READ_TOTAL_CALORIES_BURNED", "READ_VO2_MAX", "READ_WHEELCHAIR_PUSHES", "READ_PLANNED_EXERCISE", "READ_POWER", "READ_SPEED", "READ_BASAL_METABOLIC_RATE", "READ_BODY_FAT", "READ_BODY_WATER_MASS", "READ_BONE_MASS", "READ_HEIGHT", "READ_LEAN_BODY_MASS", "READ_WEIGHT", "READ_CERVICAL_MUCUS", "READ_INTERMENSTRUAL_BLEEDING", "READ_MENSTRUATION", "READ_OVULATION_TEST", "READ_SEXUAL_ACTIVITY", "READ_MINDFULNESS_SESSION", "getREAD_MINDFULNESS_SESSION$connect_client_release$annotations", "READ_HYDRATION", "READ_NUTRITION", "READ_SLEEP", "READ_BASAL_BODY_TEMPERATURE", "READ_BLOOD_GLUCOSE", "READ_BLOOD_PRESSURE", "READ_BODY_TEMPERATURE", "READ_HEART_RATE", "READ_HEART_RATE_VARIABILITY", "READ_OXYGEN_SATURATION", "READ_RESPIRATORY_RATE", "READ_RESTING_HEART_RATE", "READ_SKIN_TEMPERATURE", "WRITE_ACTIVE_CALORIES_BURNED", "WRITE_DISTANCE", "WRITE_ELEVATION_GAINED", "WRITE_EXERCISE", "WRITE_FLOORS_CLIMBED", "WRITE_STEPS", "WRITE_TOTAL_CALORIES_BURNED", "WRITE_VO2_MAX", "WRITE_WHEELCHAIR_PUSHES", "WRITE_PLANNED_EXERCISE", "WRITE_POWER", "WRITE_SPEED", "WRITE_BASAL_METABOLIC_RATE", "WRITE_BODY_FAT", "WRITE_BODY_WATER_MASS", "WRITE_BONE_MASS", "WRITE_HEIGHT", "WRITE_LEAN_BODY_MASS", "WRITE_WEIGHT", "WRITE_CERVICAL_MUCUS", "WRITE_INTERMENSTRUAL_BLEEDING", "WRITE_MENSTRUATION", "WRITE_OVULATION_TEST", "WRITE_SEXUAL_ACTIVITY", "WRITE_HYDRATION", "WRITE_NUTRITION", "WRITE_MINDFULNESS_SESSION", "getWRITE_MINDFULNESS_SESSION$connect_client_release$annotations", "WRITE_SLEEP", "WRITE_BASAL_BODY_TEMPERATURE", "WRITE_BLOOD_GLUCOSE", "WRITE_BLOOD_PRESSURE", "WRITE_BODY_TEMPERATURE", "WRITE_HEART_RATE", "WRITE_HEART_RATE_VARIABILITY", "WRITE_OXYGEN_SATURATION", "WRITE_RESPIRATORY_RATE", "WRITE_RESTING_HEART_RATE", "WRITE_SKIN_TEMPERATURE", "READ_PERMISSION_PREFIX", "WRITE_PERMISSION_PREFIX", "RECORD_TYPE_TO_PERMISSION", "", "getRECORD_TYPE_TO_PERMISSION$connect_client_release$annotations", "getRECORD_TYPE_TO_PERMISSION$connect_client_release", "()Ljava/util/Map;", "ALL_PERSONAL_HEALTH_RECORD_PERMISSIONS", "", "getALL_PERSONAL_HEALTH_RECORD_PERMISSIONS$annotations", "ALL_PERMISSIONS", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getALL_PERSONAL_HEALTH_RECORD_PERMISSIONS$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_ALLERGIES_INTOLERANCES$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_CONDITIONS$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_LABORATORY_RESULTS$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_MEDICATIONS$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_PERSONAL_DETAILS$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_PRACTITIONER_DETAILS$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_PREGNANCY$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_PROCEDURES$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_SOCIAL_HISTORY$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_VACCINES$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_VISITS$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_READ_MEDICAL_DATA_VITAL_SIGNS$annotations() {
        }

        public static /* synthetic */ void getPERMISSION_WRITE_MEDICAL_DATA$annotations() {
        }

        public static /* synthetic */ void getREAD_MINDFULNESS_SESSION$connect_client_release$annotations() {
        }

        public static /* synthetic */ void getRECORD_TYPE_TO_PERMISSION$connect_client_release$annotations() {
        }

        public static /* synthetic */ void getWRITE_MINDFULNESS_SESSION$connect_client_release$annotations() {
        }

        private Companion() {
        }

        @JvmStatic
        public final /* synthetic */ <T extends Record> String getReadPermission() {
            zcp.b(4, ExifInterface.GPS_DIRECTION_TRUE);
            return getReadPermission(zcv.b(Record.class));
        }

        @JvmStatic
        public final String getReadPermission(KClass<? extends Record> recordType) {
            zcp.c(recordType, "");
            if (getRECORD_TYPE_TO_PERMISSION$connect_client_release().get(recordType) == null) {
                throw new IllegalArgumentException("Given recordType is not valid : " + recordType + ".simpleName");
            }
            return HealthPermission.READ_PERMISSION_PREFIX + getRECORD_TYPE_TO_PERMISSION$connect_client_release().get(recordType);
        }

        @JvmStatic
        public final /* synthetic */ <T extends Record> String getWritePermission() {
            zcp.b(4, ExifInterface.GPS_DIRECTION_TRUE);
            return getWritePermission(zcv.b(Record.class));
        }

        @JvmStatic
        public final String getWritePermission(KClass<? extends Record> recordType) {
            zcp.c(recordType, "");
            if (getRECORD_TYPE_TO_PERMISSION$connect_client_release().get(recordType) == null) {
                throw new IllegalArgumentException("Given recordType is not valid : " + recordType + ".simpleName");
            }
            return HealthPermission.WRITE_PERMISSION_PREFIX + getRECORD_TYPE_TO_PERMISSION$connect_client_release().getOrDefault(recordType, "");
        }

        public final Map<KClass<? extends Record>, String> getRECORD_TYPE_TO_PERMISSION$connect_client_release() {
            return HealthPermission.RECORD_TYPE_TO_PERMISSION;
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    static {
        Map<KClass<? extends Record>, String> mapE = zae.e(yyz.c(zcv.b(ActiveCaloriesBurnedRecord.class), zes.c(READ_ACTIVE_CALORIES_BURNED, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(BasalBodyTemperatureRecord.class), zes.c(READ_BASAL_BODY_TEMPERATURE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(BasalMetabolicRateRecord.class), zes.c(READ_BASAL_METABOLIC_RATE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(BloodGlucoseRecord.class), zes.c(READ_BLOOD_GLUCOSE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(BloodPressureRecord.class), zes.c(READ_BLOOD_PRESSURE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(BodyFatRecord.class), zes.c(READ_BODY_FAT, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(BodyTemperatureRecord.class), zes.c(READ_BODY_TEMPERATURE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(BodyWaterMassRecord.class), zes.c(READ_BODY_WATER_MASS, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(BoneMassRecord.class), zes.c(READ_BONE_MASS, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(CervicalMucusRecord.class), zes.c(READ_CERVICAL_MUCUS, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(CyclingPedalingCadenceRecord.class), zes.c(READ_EXERCISE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(DistanceRecord.class), zes.c(READ_DISTANCE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(ElevationGainedRecord.class), zes.c(READ_ELEVATION_GAINED, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(ExerciseSessionRecord.class), zes.c(READ_EXERCISE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(FloorsClimbedRecord.class), zes.c(READ_FLOORS_CLIMBED, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(HeartRateRecord.class), zes.c(READ_HEART_RATE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(HeartRateVariabilityRmssdRecord.class), zes.c(READ_HEART_RATE_VARIABILITY, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(HeightRecord.class), zes.c(READ_HEIGHT, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(HydrationRecord.class), zes.c(READ_HYDRATION, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(IntermenstrualBleedingRecord.class), zes.c(READ_INTERMENSTRUAL_BLEEDING, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(LeanBodyMassRecord.class), zes.c(READ_LEAN_BODY_MASS, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(MenstruationFlowRecord.class), zes.c(READ_MENSTRUATION, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(MenstruationPeriodRecord.class), zes.c(READ_MENSTRUATION, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(MindfulnessSessionRecord.class), zes.c(READ_MINDFULNESS_SESSION, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(NutritionRecord.class), zes.c(READ_NUTRITION, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(OvulationTestRecord.class), zes.c(READ_OVULATION_TEST, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(OxygenSaturationRecord.class), zes.c(READ_OXYGEN_SATURATION, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(PlannedExerciseSessionRecord.class), zes.c(READ_PLANNED_EXERCISE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(PowerRecord.class), zes.c(READ_POWER, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(RespiratoryRateRecord.class), zes.c(READ_RESPIRATORY_RATE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(RestingHeartRateRecord.class), zes.c(READ_RESTING_HEART_RATE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(SexualActivityRecord.class), zes.c(READ_SEXUAL_ACTIVITY, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(SleepSessionRecord.class), zes.c(READ_SLEEP, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(SpeedRecord.class), zes.c(READ_SPEED, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(SkinTemperatureRecord.class), zes.c(READ_SKIN_TEMPERATURE, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(StepsCadenceRecord.class), zes.c(READ_STEPS, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(StepsRecord.class), zes.c(READ_STEPS, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(TotalCaloriesBurnedRecord.class), zes.c(READ_TOTAL_CALORIES_BURNED, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(Vo2MaxRecord.class), zes.c(READ_VO2_MAX, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(WeightRecord.class), zes.c(READ_WEIGHT, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)), yyz.c(zcv.b(WheelchairPushesRecord.class), zes.c(READ_WHEELCHAIR_PUSHES, READ_PERMISSION_PREFIX, (String) null, 2, (Object) null)));
        RECORD_TYPE_TO_PERMISSION = mapE;
        List listC = yzp.c();
        listC.add(PERMISSION_WRITE_MEDICAL_DATA);
        listC.add(PERMISSION_READ_MEDICAL_DATA_ALLERGIES_INTOLERANCES);
        listC.add(PERMISSION_READ_MEDICAL_DATA_CONDITIONS);
        listC.add(PERMISSION_READ_MEDICAL_DATA_LABORATORY_RESULTS);
        listC.add(PERMISSION_READ_MEDICAL_DATA_MEDICATIONS);
        listC.add(PERMISSION_READ_MEDICAL_DATA_PERSONAL_DETAILS);
        listC.add(PERMISSION_READ_MEDICAL_DATA_PRACTITIONER_DETAILS);
        listC.add(PERMISSION_READ_MEDICAL_DATA_PREGNANCY);
        listC.add(PERMISSION_READ_MEDICAL_DATA_PROCEDURES);
        listC.add(PERMISSION_READ_MEDICAL_DATA_SOCIAL_HISTORY);
        listC.add(PERMISSION_READ_MEDICAL_DATA_VACCINES);
        listC.add(PERMISSION_READ_MEDICAL_DATA_VISITS);
        listC.add(PERMISSION_READ_MEDICAL_DATA_VITAL_SIGNS);
        ALL_PERSONAL_HEALTH_RECORD_PERMISSIONS = yzp.c(listC);
        List listC2 = yzp.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<KClass<? extends Record>, String> entry : mapE.entrySet()) {
            yzp.e((Collection) arrayList, (Iterable) yzp.c(WRITE_PERMISSION_PREFIX + entry.getValue(), READ_PERMISSION_PREFIX + entry.getValue()));
        }
        listC2.addAll(arrayList);
        listC2.addAll(ALL_PERSONAL_HEALTH_RECORD_PERMISSIONS);
        listC2.add(PERMISSION_WRITE_EXERCISE_ROUTE);
        listC2.add(PERMISSION_READ_HEALTH_DATA_IN_BACKGROUND);
        listC2.add(PERMISSION_READ_HEALTH_DATA_HISTORY);
        ALL_PERMISSIONS = yzp.c(listC2);
    }

    @JvmStatic
    public static final String getWritePermission(KClass<? extends Record> kClass) {
        return INSTANCE.getWritePermission(kClass);
    }

    @JvmStatic
    public static final String getReadPermission(KClass<? extends Record> kClass) {
        return INSTANCE.getReadPermission(kClass);
    }
}
