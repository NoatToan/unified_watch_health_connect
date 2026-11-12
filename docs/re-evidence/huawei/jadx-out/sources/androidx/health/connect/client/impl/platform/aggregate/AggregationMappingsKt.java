package androidx.health.connect.client.impl.platform.aggregate;

import android.health.connect.datatypes.AggregationType;
import android.os.ext.SdkExtensions;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.records.ActiveCaloriesBurnedRecord;
import androidx.health.connect.client.records.BasalMetabolicRateRecord;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.records.CyclingPedalingCadenceRecord;
import androidx.health.connect.client.records.DistanceRecord;
import androidx.health.connect.client.records.ElevationGainedRecord;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.health.connect.client.records.FloorsClimbedRecord;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.HeightRecord;
import androidx.health.connect.client.records.HydrationRecord;
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.records.PowerRecord;
import androidx.health.connect.client.records.RestingHeartRateRecord;
import androidx.health.connect.client.records.SkinTemperatureRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.records.StepsRecord;
import androidx.health.connect.client.records.TotalCaloriesBurnedRecord;
import androidx.health.connect.client.records.WeightRecord;
import androidx.health.connect.client.records.WheelchairPushesRecord;
import androidx.health.connect.client.units.Energy;
import androidx.health.connect.client.units.Length;
import androidx.health.connect.client.units.Mass;
import androidx.health.connect.client.units.Power;
import androidx.health.connect.client.units.Pressure;
import androidx.health.connect.client.units.TemperatureDelta;
import androidx.health.connect.client.units.Velocity;
import androidx.health.connect.client.units.Volume;
import defpackage.yyu;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zct;
import java.time.Duration;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\";\u0010\u0000\u001a-\u0012)\u0012'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0017\u0012\u0015\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u00040\u0005¢\u0006\u0002\b\u00070\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\",\u0010\t\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\",\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\",\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f\",\u0010\u0015\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\f\",\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\f\",\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\f\")\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\f\",\u0010!\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00050\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\f\"0\u0010%\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u00060'j\u0002`(0\u00050\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\f\",\u0010*\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\n8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\f\"0\u0010-\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u00060/j\u0002`00\u00050\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\f\",\u00102\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u00050\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\f¨\u00066"}, d2 = {"DOUBLE_AGGREGATION_METRIC_TYPE_SDK_EXT_10_PAIRS", "", "Lkotlin/Pair;", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "", "Landroid/health/connect/datatypes/AggregationType;", "kotlin.jvm.PlatformType", "Lkotlin/jvm/internal/EnhancedNullability;", "[Lkotlin/Pair;", "DOUBLE_AGGREGATION_METRIC_TYPE_MAP", "", "getDOUBLE_AGGREGATION_METRIC_TYPE_MAP", "()Ljava/util/Map;", "DURATION_AGGREGATION_METRIC_TYPE_MAP", "Ljava/time/Duration;", "", "getDURATION_AGGREGATION_METRIC_TYPE_MAP", "ENERGY_AGGREGATION_METRIC_TYPE_MAP", "Landroidx/health/connect/client/units/Energy;", "Landroid/health/connect/datatypes/units/Energy;", "getENERGY_AGGREGATION_METRIC_TYPE_MAP", "LENGTH_AGGREGATION_METRIC_TYPE_MAP", "Landroidx/health/connect/client/units/Length;", "Landroid/health/connect/datatypes/units/Length;", "getLENGTH_AGGREGATION_METRIC_TYPE_MAP", "LONG_AGGREGATION_METRIC_TYPE_MAP", "getLONG_AGGREGATION_METRIC_TYPE_MAP", "GRAMS_AGGREGATION_METRIC_TYPE_MAP", "Landroidx/health/connect/client/units/Mass;", "Landroid/health/connect/datatypes/units/Mass;", "getGRAMS_AGGREGATION_METRIC_TYPE_MAP", "KILOGRAMS_AGGREGATION_METRIC_TYPE_MAP", "getKILOGRAMS_AGGREGATION_METRIC_TYPE_MAP", "POWER_AGGREGATION_METRIC_TYPE_MAP", "Landroidx/health/connect/client/units/Power;", "Landroid/health/connect/datatypes/units/Power;", "getPOWER_AGGREGATION_METRIC_TYPE_MAP", "PRESSURE_AGGREGATION_METRIC_TYPE_MAP", "Landroidx/health/connect/client/units/Pressure;", "Landroid/health/connect/datatypes/units/Pressure;", "Landroidx/health/connect/client/impl/platform/records/PlatformPressure;", "getPRESSURE_AGGREGATION_METRIC_TYPE_MAP", "TEMPERATURE_DELTA_METRIC_TYPE_MAP", "Landroidx/health/connect/client/units/TemperatureDelta;", "getTEMPERATURE_DELTA_METRIC_TYPE_MAP", "VELOCITY_AGGREGATION_METRIC_TYPE_MAP", "Landroidx/health/connect/client/units/Velocity;", "Landroid/health/connect/datatypes/units/Velocity;", "Landroidx/health/connect/client/impl/platform/records/PlatformVelocity;", "getVELOCITY_AGGREGATION_METRIC_TYPE_MAP", "VOLUME_AGGREGATION_METRIC_TYPE_MAP", "Landroidx/health/connect/client/units/Volume;", "Landroid/health/connect/datatypes/units/Volume;", "getVOLUME_AGGREGATION_METRIC_TYPE_MAP", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AggregationMappingsKt {
    private static final Map<AggregateMetric<Double>, AggregationType<Double>> DOUBLE_AGGREGATION_METRIC_TYPE_MAP;
    private static final yyu<AggregateMetric<Double>, AggregationType<Double>>[] DOUBLE_AGGREGATION_METRIC_TYPE_SDK_EXT_10_PAIRS;
    private static final Map<AggregateMetric<Duration>, AggregationType<Long>> DURATION_AGGREGATION_METRIC_TYPE_MAP;
    private static final Map<AggregateMetric<Energy>, AggregationType<android.health.connect.datatypes.units.Energy>> ENERGY_AGGREGATION_METRIC_TYPE_MAP;
    private static final Map<AggregateMetric<Mass>, AggregationType<android.health.connect.datatypes.units.Mass>> GRAMS_AGGREGATION_METRIC_TYPE_MAP;
    private static final Map<AggregateMetric<Mass>, AggregationType<android.health.connect.datatypes.units.Mass>> KILOGRAMS_AGGREGATION_METRIC_TYPE_MAP;
    private static final Map<AggregateMetric<Length>, AggregationType<android.health.connect.datatypes.units.Length>> LENGTH_AGGREGATION_METRIC_TYPE_MAP;
    private static final Map<AggregateMetric<Long>, AggregationType<Long>> LONG_AGGREGATION_METRIC_TYPE_MAP;
    private static final Map<AggregateMetric<Power>, AggregationType<android.health.connect.datatypes.units.Power>> POWER_AGGREGATION_METRIC_TYPE_MAP;
    private static final Map<AggregateMetric<Pressure>, AggregationType<android.health.connect.datatypes.units.Pressure>> PRESSURE_AGGREGATION_METRIC_TYPE_MAP;
    private static final Map<AggregateMetric<TemperatureDelta>, AggregationType<?>> TEMPERATURE_DELTA_METRIC_TYPE_MAP;
    private static final Map<AggregateMetric<Velocity>, AggregationType<android.health.connect.datatypes.units.Velocity>> VELOCITY_AGGREGATION_METRIC_TYPE_MAP;
    private static final Map<AggregateMetric<Volume>, AggregationType<android.health.connect.datatypes.units.Volume>> VOLUME_AGGREGATION_METRIC_TYPE_MAP;

    static {
        yyu<AggregateMetric<Double>, AggregationType<Double>>[] yyuVarArr = SdkExtensions.getExtensionVersion(34) >= 10 ? new yyu[]{yyz.c(CyclingPedalingCadenceRecord.RPM_AVG, android.health.connect.datatypes.CyclingPedalingCadenceRecord.RPM_AVG), yyz.c(CyclingPedalingCadenceRecord.RPM_MAX, android.health.connect.datatypes.CyclingPedalingCadenceRecord.RPM_MAX), yyz.c(CyclingPedalingCadenceRecord.RPM_MIN, android.health.connect.datatypes.CyclingPedalingCadenceRecord.RPM_MIN), yyz.c(StepsCadenceRecord.RATE_AVG, android.health.connect.datatypes.StepsCadenceRecord.STEPS_CADENCE_RATE_AVG), yyz.c(StepsCadenceRecord.RATE_MAX, android.health.connect.datatypes.StepsCadenceRecord.STEPS_CADENCE_RATE_MAX), yyz.c(StepsCadenceRecord.RATE_MIN, android.health.connect.datatypes.StepsCadenceRecord.STEPS_CADENCE_RATE_MIN)} : new yyu[0];
        DOUBLE_AGGREGATION_METRIC_TYPE_SDK_EXT_10_PAIRS = yyuVarArr;
        zct zctVar = new zct(2);
        zctVar.c(yyz.c(FloorsClimbedRecord.FLOORS_CLIMBED_TOTAL, android.health.connect.datatypes.FloorsClimbedRecord.FLOORS_CLIMBED_TOTAL));
        zctVar.a(yyuVarArr);
        DOUBLE_AGGREGATION_METRIC_TYPE_MAP = zae.e((yyu[]) zctVar.b(new yyu[zctVar.d()]));
        DURATION_AGGREGATION_METRIC_TYPE_MAP = zae.e(yyz.c(ExerciseSessionRecord.EXERCISE_DURATION_TOTAL, android.health.connect.datatypes.ExerciseSessionRecord.EXERCISE_DURATION_TOTAL), yyz.c(SleepSessionRecord.SLEEP_DURATION_TOTAL, android.health.connect.datatypes.SleepSessionRecord.SLEEP_DURATION_TOTAL));
        ENERGY_AGGREGATION_METRIC_TYPE_MAP = zae.e(yyz.c(ActiveCaloriesBurnedRecord.ACTIVE_CALORIES_TOTAL, android.health.connect.datatypes.ActiveCaloriesBurnedRecord.ACTIVE_CALORIES_TOTAL), yyz.c(BasalMetabolicRateRecord.BASAL_CALORIES_TOTAL, android.health.connect.datatypes.BasalMetabolicRateRecord.BASAL_CALORIES_TOTAL), yyz.c(NutritionRecord.ENERGY_TOTAL, android.health.connect.datatypes.NutritionRecord.ENERGY_TOTAL), yyz.c(NutritionRecord.ENERGY_FROM_FAT_TOTAL, android.health.connect.datatypes.NutritionRecord.ENERGY_FROM_FAT_TOTAL), yyz.c(TotalCaloriesBurnedRecord.ENERGY_TOTAL, android.health.connect.datatypes.TotalCaloriesBurnedRecord.ENERGY_TOTAL));
        LENGTH_AGGREGATION_METRIC_TYPE_MAP = zae.e(yyz.c(DistanceRecord.DISTANCE_TOTAL, android.health.connect.datatypes.DistanceRecord.DISTANCE_TOTAL), yyz.c(ElevationGainedRecord.ELEVATION_GAINED_TOTAL, android.health.connect.datatypes.ElevationGainedRecord.ELEVATION_GAINED_TOTAL), yyz.c(HeightRecord.HEIGHT_AVG, android.health.connect.datatypes.HeightRecord.HEIGHT_AVG), yyz.c(HeightRecord.HEIGHT_MIN, android.health.connect.datatypes.HeightRecord.HEIGHT_MIN), yyz.c(HeightRecord.HEIGHT_MAX, android.health.connect.datatypes.HeightRecord.HEIGHT_MAX));
        LONG_AGGREGATION_METRIC_TYPE_MAP = zae.e(yyz.c(HeartRateRecord.BPM_AVG, android.health.connect.datatypes.HeartRateRecord.BPM_AVG), yyz.c(HeartRateRecord.BPM_MIN, android.health.connect.datatypes.HeartRateRecord.BPM_MIN), yyz.c(HeartRateRecord.BPM_MAX, android.health.connect.datatypes.HeartRateRecord.BPM_MAX), yyz.c(HeartRateRecord.MEASUREMENTS_COUNT, android.health.connect.datatypes.HeartRateRecord.HEART_MEASUREMENTS_COUNT), yyz.c(RestingHeartRateRecord.BPM_AVG, android.health.connect.datatypes.RestingHeartRateRecord.BPM_AVG), yyz.c(RestingHeartRateRecord.BPM_MIN, android.health.connect.datatypes.RestingHeartRateRecord.BPM_MIN), yyz.c(RestingHeartRateRecord.BPM_MAX, android.health.connect.datatypes.RestingHeartRateRecord.BPM_MAX), yyz.c(StepsRecord.COUNT_TOTAL, android.health.connect.datatypes.StepsRecord.STEPS_COUNT_TOTAL), yyz.c(WheelchairPushesRecord.COUNT_TOTAL, android.health.connect.datatypes.WheelchairPushesRecord.WHEEL_CHAIR_PUSHES_COUNT_TOTAL));
        zct zctVar2 = new zct(40);
        zctVar2.c(yyz.c(NutritionRecord.BIOTIN_TOTAL, android.health.connect.datatypes.NutritionRecord.BIOTIN_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.CAFFEINE_TOTAL, android.health.connect.datatypes.NutritionRecord.CAFFEINE_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.CALCIUM_TOTAL, android.health.connect.datatypes.NutritionRecord.CALCIUM_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.CHLORIDE_TOTAL, android.health.connect.datatypes.NutritionRecord.CHLORIDE_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.CHOLESTEROL_TOTAL, android.health.connect.datatypes.NutritionRecord.CHOLESTEROL_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.CHROMIUM_TOTAL, android.health.connect.datatypes.NutritionRecord.CHROMIUM_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.COPPER_TOTAL, android.health.connect.datatypes.NutritionRecord.COPPER_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.DIETARY_FIBER_TOTAL, android.health.connect.datatypes.NutritionRecord.DIETARY_FIBER_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.FOLATE_TOTAL, android.health.connect.datatypes.NutritionRecord.FOLATE_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.FOLIC_ACID_TOTAL, android.health.connect.datatypes.NutritionRecord.FOLIC_ACID_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.IODINE_TOTAL, android.health.connect.datatypes.NutritionRecord.IODINE_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.IRON_TOTAL, android.health.connect.datatypes.NutritionRecord.IRON_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.MAGNESIUM_TOTAL, android.health.connect.datatypes.NutritionRecord.MAGNESIUM_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.MANGANESE_TOTAL, android.health.connect.datatypes.NutritionRecord.MANGANESE_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.MOLYBDENUM_TOTAL, android.health.connect.datatypes.NutritionRecord.MOLYBDENUM_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.MONOUNSATURATED_FAT_TOTAL, android.health.connect.datatypes.NutritionRecord.MONOUNSATURATED_FAT_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.NIACIN_TOTAL, android.health.connect.datatypes.NutritionRecord.NIACIN_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.PANTOTHENIC_ACID_TOTAL, android.health.connect.datatypes.NutritionRecord.PANTOTHENIC_ACID_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.PHOSPHORUS_TOTAL, android.health.connect.datatypes.NutritionRecord.PHOSPHORUS_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.POLYUNSATURATED_FAT_TOTAL, android.health.connect.datatypes.NutritionRecord.POLYUNSATURATED_FAT_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.POTASSIUM_TOTAL, android.health.connect.datatypes.NutritionRecord.POTASSIUM_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.PROTEIN_TOTAL, android.health.connect.datatypes.NutritionRecord.PROTEIN_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.RIBOFLAVIN_TOTAL, android.health.connect.datatypes.NutritionRecord.RIBOFLAVIN_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.SATURATED_FAT_TOTAL, android.health.connect.datatypes.NutritionRecord.SATURATED_FAT_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.SELENIUM_TOTAL, android.health.connect.datatypes.NutritionRecord.SELENIUM_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.SODIUM_TOTAL, android.health.connect.datatypes.NutritionRecord.SODIUM_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.SUGAR_TOTAL, android.health.connect.datatypes.NutritionRecord.SUGAR_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.THIAMIN_TOTAL, android.health.connect.datatypes.NutritionRecord.THIAMIN_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.TOTAL_CARBOHYDRATE_TOTAL, android.health.connect.datatypes.NutritionRecord.TOTAL_CARBOHYDRATE_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.TOTAL_FAT_TOTAL, android.health.connect.datatypes.NutritionRecord.TOTAL_FAT_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.UNSATURATED_FAT_TOTAL, android.health.connect.datatypes.NutritionRecord.UNSATURATED_FAT_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.VITAMIN_A_TOTAL, android.health.connect.datatypes.NutritionRecord.VITAMIN_A_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.VITAMIN_B12_TOTAL, android.health.connect.datatypes.NutritionRecord.VITAMIN_B12_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.VITAMIN_B6_TOTAL, android.health.connect.datatypes.NutritionRecord.VITAMIN_B6_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.VITAMIN_C_TOTAL, android.health.connect.datatypes.NutritionRecord.VITAMIN_C_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.VITAMIN_D_TOTAL, android.health.connect.datatypes.NutritionRecord.VITAMIN_D_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.VITAMIN_E_TOTAL, android.health.connect.datatypes.NutritionRecord.VITAMIN_E_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.VITAMIN_K_TOTAL, android.health.connect.datatypes.NutritionRecord.VITAMIN_K_TOTAL));
        zctVar2.c(yyz.c(NutritionRecord.ZINC_TOTAL, android.health.connect.datatypes.NutritionRecord.ZINC_TOTAL));
        zctVar2.a(SdkExtensions.getExtensionVersion(34) >= 10 ? new yyu[]{yyz.c(NutritionRecord.TRANS_FAT_TOTAL, android.health.connect.datatypes.NutritionRecord.TRANS_FAT_TOTAL)} : new yyu[0]);
        GRAMS_AGGREGATION_METRIC_TYPE_MAP = zae.e((yyu[]) zctVar2.b(new yyu[zctVar2.d()]));
        KILOGRAMS_AGGREGATION_METRIC_TYPE_MAP = zae.e(yyz.c(WeightRecord.WEIGHT_AVG, android.health.connect.datatypes.WeightRecord.WEIGHT_AVG), yyz.c(WeightRecord.WEIGHT_MIN, android.health.connect.datatypes.WeightRecord.WEIGHT_MIN), yyz.c(WeightRecord.WEIGHT_MAX, android.health.connect.datatypes.WeightRecord.WEIGHT_MAX));
        POWER_AGGREGATION_METRIC_TYPE_MAP = zae.e(yyz.c(PowerRecord.POWER_AVG, android.health.connect.datatypes.PowerRecord.POWER_AVG), yyz.c(PowerRecord.POWER_MAX, android.health.connect.datatypes.PowerRecord.POWER_MAX), yyz.c(PowerRecord.POWER_MIN, android.health.connect.datatypes.PowerRecord.POWER_MIN));
        PRESSURE_AGGREGATION_METRIC_TYPE_MAP = zae.c(SdkExtensions.getExtensionVersion(34) >= 10 ? new yyu[]{yyz.c(BloodPressureRecord.DIASTOLIC_AVG, android.health.connect.datatypes.BloodPressureRecord.DIASTOLIC_AVG), yyz.c(BloodPressureRecord.DIASTOLIC_MAX, android.health.connect.datatypes.BloodPressureRecord.DIASTOLIC_MAX), yyz.c(BloodPressureRecord.DIASTOLIC_MIN, android.health.connect.datatypes.BloodPressureRecord.DIASTOLIC_MIN), yyz.c(BloodPressureRecord.SYSTOLIC_AVG, android.health.connect.datatypes.BloodPressureRecord.SYSTOLIC_AVG), yyz.c(BloodPressureRecord.SYSTOLIC_MAX, android.health.connect.datatypes.BloodPressureRecord.SYSTOLIC_MAX), yyz.c(BloodPressureRecord.SYSTOLIC_MIN, android.health.connect.datatypes.BloodPressureRecord.SYSTOLIC_MIN)} : new yyu[0]);
        TEMPERATURE_DELTA_METRIC_TYPE_MAP = zae.c(SdkExtensions.getExtensionVersion(34) >= 13 ? new yyu[]{yyz.c(SkinTemperatureRecord.TEMPERATURE_DELTA_AVG, android.health.connect.datatypes.SkinTemperatureRecord.SKIN_TEMPERATURE_DELTA_AVG), yyz.c(SkinTemperatureRecord.TEMPERATURE_DELTA_MAX, android.health.connect.datatypes.SkinTemperatureRecord.SKIN_TEMPERATURE_DELTA_MAX), yyz.c(SkinTemperatureRecord.TEMPERATURE_DELTA_MIN, android.health.connect.datatypes.SkinTemperatureRecord.SKIN_TEMPERATURE_DELTA_MIN)} : new yyu[0]);
        VELOCITY_AGGREGATION_METRIC_TYPE_MAP = zae.c(SdkExtensions.getExtensionVersion(34) >= 10 ? new yyu[]{yyz.c(SpeedRecord.SPEED_AVG, android.health.connect.datatypes.SpeedRecord.SPEED_AVG), yyz.c(SpeedRecord.SPEED_MAX, android.health.connect.datatypes.SpeedRecord.SPEED_MAX), yyz.c(SpeedRecord.SPEED_MIN, android.health.connect.datatypes.SpeedRecord.SPEED_MIN)} : new yyu[0]);
        VOLUME_AGGREGATION_METRIC_TYPE_MAP = zae.a(yyz.c(HydrationRecord.VOLUME_TOTAL, android.health.connect.datatypes.HydrationRecord.VOLUME_TOTAL));
    }

    public static final Map<AggregateMetric<Double>, AggregationType<Double>> getDOUBLE_AGGREGATION_METRIC_TYPE_MAP() {
        return DOUBLE_AGGREGATION_METRIC_TYPE_MAP;
    }

    public static final Map<AggregateMetric<Duration>, AggregationType<Long>> getDURATION_AGGREGATION_METRIC_TYPE_MAP() {
        return DURATION_AGGREGATION_METRIC_TYPE_MAP;
    }

    public static final Map<AggregateMetric<Energy>, AggregationType<android.health.connect.datatypes.units.Energy>> getENERGY_AGGREGATION_METRIC_TYPE_MAP() {
        return ENERGY_AGGREGATION_METRIC_TYPE_MAP;
    }

    public static final Map<AggregateMetric<Length>, AggregationType<android.health.connect.datatypes.units.Length>> getLENGTH_AGGREGATION_METRIC_TYPE_MAP() {
        return LENGTH_AGGREGATION_METRIC_TYPE_MAP;
    }

    public static final Map<AggregateMetric<Long>, AggregationType<Long>> getLONG_AGGREGATION_METRIC_TYPE_MAP() {
        return LONG_AGGREGATION_METRIC_TYPE_MAP;
    }

    public static final Map<AggregateMetric<Mass>, AggregationType<android.health.connect.datatypes.units.Mass>> getGRAMS_AGGREGATION_METRIC_TYPE_MAP() {
        return GRAMS_AGGREGATION_METRIC_TYPE_MAP;
    }

    public static final Map<AggregateMetric<Mass>, AggregationType<android.health.connect.datatypes.units.Mass>> getKILOGRAMS_AGGREGATION_METRIC_TYPE_MAP() {
        return KILOGRAMS_AGGREGATION_METRIC_TYPE_MAP;
    }

    public static final Map<AggregateMetric<Power>, AggregationType<android.health.connect.datatypes.units.Power>> getPOWER_AGGREGATION_METRIC_TYPE_MAP() {
        return POWER_AGGREGATION_METRIC_TYPE_MAP;
    }

    public static final Map<AggregateMetric<Pressure>, AggregationType<android.health.connect.datatypes.units.Pressure>> getPRESSURE_AGGREGATION_METRIC_TYPE_MAP() {
        return PRESSURE_AGGREGATION_METRIC_TYPE_MAP;
    }

    public static final Map<AggregateMetric<TemperatureDelta>, AggregationType<?>> getTEMPERATURE_DELTA_METRIC_TYPE_MAP() {
        return TEMPERATURE_DELTA_METRIC_TYPE_MAP;
    }

    public static final Map<AggregateMetric<Velocity>, AggregationType<android.health.connect.datatypes.units.Velocity>> getVELOCITY_AGGREGATION_METRIC_TYPE_MAP() {
        return VELOCITY_AGGREGATION_METRIC_TYPE_MAP;
    }

    public static final Map<AggregateMetric<Volume>, AggregationType<android.health.connect.datatypes.units.Volume>> getVOLUME_AGGREGATION_METRIC_TYPE_MAP() {
        return VOLUME_AGGREGATION_METRIC_TYPE_MAP;
    }
}
