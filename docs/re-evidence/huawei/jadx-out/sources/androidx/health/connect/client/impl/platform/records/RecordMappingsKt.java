package androidx.health.connect.client.impl.platform.records;

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
import androidx.health.connect.client.records.UtilsKt;
import androidx.health.connect.client.records.Vo2MaxRecord;
import androidx.health.connect.client.records.WeightRecord;
import androidx.health.connect.client.records.WheelchairPushesRecord;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcv;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\"6\u0010\u0000\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u00040\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"<\u0010\t\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u00040\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\b\"4\u0010\r\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u00040\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"SDK_TO_PLATFORM_RECORD_CLASS_EXT_13", "", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "Ljava/lang/Class;", "Landroid/health/connect/datatypes/Record;", "Landroidx/health/connect/client/impl/platform/records/PlatformRecord;", "getSDK_TO_PLATFORM_RECORD_CLASS_EXT_13", "()Ljava/util/Map;", "SDK_TO_PLATFORM_RECORD_CLASS_EXT_15", "getSDK_TO_PLATFORM_RECORD_CLASS_EXT_15$annotations", "()V", "getSDK_TO_PLATFORM_RECORD_CLASS_EXT_15", "SDK_TO_PLATFORM_RECORD_CLASS", "getSDK_TO_PLATFORM_RECORD_CLASS", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecordMappingsKt {
    private static final Map<KClass<? extends Record>, Class<? extends android.health.connect.datatypes.Record>> SDK_TO_PLATFORM_RECORD_CLASS;
    private static final Map<KClass<? extends Record>, Class<? extends android.health.connect.datatypes.Record>> SDK_TO_PLATFORM_RECORD_CLASS_EXT_13;
    private static final Map<KClass<? extends Record>, Class<? extends android.health.connect.datatypes.Record>> SDK_TO_PLATFORM_RECORD_CLASS_EXT_15;

    public static /* synthetic */ void getSDK_TO_PLATFORM_RECORD_CLASS_EXT_15$annotations() {
    }

    public static final Map<KClass<? extends Record>, Class<? extends android.health.connect.datatypes.Record>> getSDK_TO_PLATFORM_RECORD_CLASS_EXT_13() {
        return SDK_TO_PLATFORM_RECORD_CLASS_EXT_13;
    }

    static {
        SDK_TO_PLATFORM_RECORD_CLASS_EXT_13 = UtilsKt.isAtLeastSdkExtension13() ? zae.e(yyz.c(zcv.b(PlannedExerciseSessionRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m()), yyz.c(zcv.b(SkinTemperatureRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$22())) : zae.e();
        SDK_TO_PLATFORM_RECORD_CLASS_EXT_15 = UtilsKt.isAtLeastSdkExtension15() ? zae.a(yyz.c(zcv.b(MindfulnessSessionRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$5())) : zae.e();
        SDK_TO_PLATFORM_RECORD_CLASS = zae.e(yyz.c(zcv.b(ActiveCaloriesBurnedRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$18()), yyz.c(zcv.b(BasalBodyTemperatureRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$20()), yyz.c(zcv.b(BasalMetabolicRateRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$21()), yyz.c(zcv.b(BloodGlucoseRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$23()), yyz.c(zcv.b(BloodPressureRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$24()), yyz.c(zcv.b(BodyFatRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$25()), yyz.c(zcv.b(BodyTemperatureRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$27()), yyz.c(zcv.b(BodyWaterMassRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$2()), yyz.c(zcv.b(BoneMassRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$14()), yyz.c(zcv.b(CervicalMucusRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$26()), yyz.c(zcv.b(CyclingPedalingCadenceRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$28()), yyz.c(zcv.b(DistanceRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$29()), yyz.c(zcv.b(ElevationGainedRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$30()), yyz.c(zcv.b(ExerciseSessionRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$31()), yyz.c(zcv.b(FloorsClimbedRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$32()), yyz.c(zcv.b(HeartRateRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$34()), yyz.c(zcv.b(HeartRateVariabilityRmssdRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$11()), yyz.c(zcv.b(HeightRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$33()), yyz.c(zcv.b(HydrationRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$35()), yyz.c(zcv.b(IntermenstrualBleedingRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$36()), yyz.c(zcv.b(LeanBodyMassRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$37()), yyz.c(zcv.b(MenstruationFlowRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$38()), yyz.c(zcv.b(MenstruationPeriodRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$39()), yyz.c(zcv.b(NutritionRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$40()), yyz.c(zcv.b(OvulationTestRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$1()), yyz.c(zcv.b(OxygenSaturationRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$3()), yyz.c(zcv.b(PowerRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$4()), yyz.c(zcv.b(RespiratoryRateRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$6()), yyz.c(zcv.b(RestingHeartRateRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$7()), yyz.c(zcv.b(SexualActivityRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$8()), yyz.c(zcv.b(SleepSessionRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$9()), yyz.c(zcv.b(SpeedRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$10()), yyz.c(zcv.b(StepsCadenceRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$12()), yyz.c(zcv.b(StepsRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$13()), yyz.c(zcv.b(TotalCaloriesBurnedRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$15()), yyz.c(zcv.b(Vo2MaxRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$16()), yyz.c(zcv.b(WeightRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$17()), yyz.c(zcv.b(WheelchairPushesRecord.class), RecordMappingsKt$$ExternalSyntheticApiModelOutline0.m$19()));
    }

    public static final Map<KClass<? extends Record>, Class<? extends android.health.connect.datatypes.Record>> getSDK_TO_PLATFORM_RECORD_CLASS_EXT_15() {
        return SDK_TO_PLATFORM_RECORD_CLASS_EXT_15;
    }

    public static final Map<KClass<? extends Record>, Class<? extends android.health.connect.datatypes.Record>> getSDK_TO_PLATFORM_RECORD_CLASS() {
        return SDK_TO_PLATFORM_RECORD_CLASS;
    }
}
