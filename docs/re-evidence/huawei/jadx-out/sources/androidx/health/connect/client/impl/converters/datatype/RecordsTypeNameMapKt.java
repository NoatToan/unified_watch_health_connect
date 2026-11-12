package androidx.health.connect.client.impl.converters.datatype;

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
import defpackage.yyu;
import defpackage.yyz;
import defpackage.yzp;
import defpackage.zae;
import defpackage.zcv;
import defpackage.zdm;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"+\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"%\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"RECORDS_TYPE_NAME_MAP", "", "", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "getRECORDS_TYPE_NAME_MAP$annotations", "()V", "getRECORDS_TYPE_NAME_MAP", "()Ljava/util/Map;", "RECORDS_CLASS_NAME_MAP", "getRECORDS_CLASS_NAME_MAP", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecordsTypeNameMapKt {
    private static final Map<KClass<? extends Record>, String> RECORDS_CLASS_NAME_MAP;
    private static final Map<String, KClass<? extends Record>> RECORDS_TYPE_NAME_MAP;

    public static /* synthetic */ void getRECORDS_TYPE_NAME_MAP$annotations() {
    }

    public static final Map<String, KClass<? extends Record>> getRECORDS_TYPE_NAME_MAP() {
        return RECORDS_TYPE_NAME_MAP;
    }

    static {
        Map<String, KClass<? extends Record>> mapE = zae.e(yyz.c("ActiveCaloriesBurned", zcv.b(ActiveCaloriesBurnedRecord.class)), yyz.c("ActivitySession", zcv.b(ExerciseSessionRecord.class)), yyz.c("BasalBodyTemperature", zcv.b(BasalBodyTemperatureRecord.class)), yyz.c("BasalMetabolicRate", zcv.b(BasalMetabolicRateRecord.class)), yyz.c("BloodGlucose", zcv.b(BloodGlucoseRecord.class)), yyz.c("BloodPressure", zcv.b(BloodPressureRecord.class)), yyz.c("BodyFat", zcv.b(BodyFatRecord.class)), yyz.c("BodyTemperature", zcv.b(BodyTemperatureRecord.class)), yyz.c("BodyWaterMass", zcv.b(BodyWaterMassRecord.class)), yyz.c("BoneMass", zcv.b(BoneMassRecord.class)), yyz.c("CervicalMucus", zcv.b(CervicalMucusRecord.class)), yyz.c("CyclingPedalingCadenceSeries", zcv.b(CyclingPedalingCadenceRecord.class)), yyz.c("Distance", zcv.b(DistanceRecord.class)), yyz.c("ElevationGained", zcv.b(ElevationGainedRecord.class)), yyz.c("FloorsClimbed", zcv.b(FloorsClimbedRecord.class)), yyz.c("HeartRateSeries", zcv.b(HeartRateRecord.class)), yyz.c("HeartRateVariabilityRmssd", zcv.b(HeartRateVariabilityRmssdRecord.class)), yyz.c("Height", zcv.b(HeightRecord.class)), yyz.c("Hydration", zcv.b(HydrationRecord.class)), yyz.c("LeanBodyMass", zcv.b(LeanBodyMassRecord.class)), yyz.c("Menstruation", zcv.b(MenstruationFlowRecord.class)), yyz.c("MenstruationPeriod", zcv.b(MenstruationPeriodRecord.class)), yyz.c("MindfulnessSession", zcv.b(MindfulnessSessionRecord.class)), yyz.c("Nutrition", zcv.b(NutritionRecord.class)), yyz.c("OvulationTest", zcv.b(OvulationTestRecord.class)), yyz.c("OxygenSaturation", zcv.b(OxygenSaturationRecord.class)), yyz.c("PowerSeries", zcv.b(PowerRecord.class)), yyz.c("RespiratoryRate", zcv.b(RespiratoryRateRecord.class)), yyz.c("RestingHeartRate", zcv.b(RestingHeartRateRecord.class)), yyz.c("SexualActivity", zcv.b(SexualActivityRecord.class)), yyz.c("SkinTemperature", zcv.b(SkinTemperatureRecord.class)), yyz.c("SleepSession", zcv.b(SleepSessionRecord.class)), yyz.c("SpeedSeries", zcv.b(SpeedRecord.class)), yyz.c("IntermenstrualBleeding", zcv.b(IntermenstrualBleedingRecord.class)), yyz.c("Steps", zcv.b(StepsRecord.class)), yyz.c("StepsCadenceSeries", zcv.b(StepsCadenceRecord.class)), yyz.c("TotalCaloriesBurned", zcv.b(TotalCaloriesBurnedRecord.class)), yyz.c("Vo2Max", zcv.b(Vo2MaxRecord.class)), yyz.c("WheelchairPushes", zcv.b(WheelchairPushesRecord.class)), yyz.c("Weight", zcv.b(WeightRecord.class)));
        RECORDS_TYPE_NAME_MAP = mapE;
        Set<Map.Entry<String, KClass<? extends Record>>> setEntrySet = mapE.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(yzp.e(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            yyu yyuVarC = yyz.c(entry.getValue(), entry.getKey());
            linkedHashMap.put(yyuVarC.c(), yyuVarC.d());
        }
        RECORDS_CLASS_NAME_MAP = linkedHashMap;
    }

    public static final Map<KClass<? extends Record>, String> getRECORDS_CLASS_NAME_MAP() {
        return RECORDS_CLASS_NAME_MAP;
    }
}
