package androidx.health.connect.client.impl.platform.records;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
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
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.health.connect.client.records.OxygenSaturationRecord;
import androidx.health.connect.client.records.PowerRecord;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.RespiratoryRateRecord;
import androidx.health.connect.client.records.RestingHeartRateRecord;
import androidx.health.connect.client.records.SexualActivityRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.records.StepsRecord;
import androidx.health.connect.client.records.TotalCaloriesBurnedRecord;
import androidx.health.connect.client.records.Vo2MaxRecord;
import androidx.health.connect.client.records.WeightRecord;
import androidx.health.connect.client.records.WheelchairPushesRecord;
import defpackage.a9k;
import defpackage.b9k;
import defpackage.c9k;
import defpackage.d9k;
import defpackage.e9k;
import defpackage.f9k;
import defpackage.g9k;
import defpackage.h9k;
import defpackage.i9k;
import defpackage.j9k;
import defpackage.k9k;
import defpackage.l9k;
import defpackage.m8k;
import defpackage.m9k;
import defpackage.n8k;
import defpackage.n9k;
import defpackage.o8k;
import defpackage.o9k;
import defpackage.p8k;
import defpackage.p9k;
import defpackage.q8k;
import defpackage.q9k;
import defpackage.r8k;
import defpackage.r9k;
import defpackage.s8k;
import defpackage.s9k;
import defpackage.t8k;
import defpackage.t9k;
import defpackage.u8k;
import defpackage.u9k;
import defpackage.v8k;
import defpackage.v9k;
import defpackage.w8k;
import defpackage.w9k;
import defpackage.x8k;
import defpackage.x9k;
import defpackage.y8k;
import defpackage.z8k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 34)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"4\u0010\u0000\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u00040\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"SDK_TO_PLATFORM_RECORD_CLASS", "", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "Ljava/lang/Class;", "Landroid/health/connect/datatypes/Record;", "Landroidx/health/connect/client/impl/platform/records/PlatformRecord;", "getSDK_TO_PLATFORM_RECORD_CLASS", "()Ljava/util/Map;", "connect-client_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class RecordMappingsKt {

    @NotNull
    private static final Map<KClass<? extends Record>, Class<? extends android.health.connect.datatypes.Record>> SDK_TO_PLATFORM_RECORD_CLASS = MapsKt__MapsKt.mapOf(TuplesKt.to(Reflection.getOrCreateKotlinClass(ActiveCaloriesBurnedRecord.class), m8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(BasalBodyTemperatureRecord.class), o8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(BasalMetabolicRateRecord.class), a9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(BloodGlucoseRecord.class), k9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(BloodPressureRecord.class), l9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(BodyFatRecord.class), m9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(BodyTemperatureRecord.class), n9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(BodyWaterMassRecord.class), o9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(BoneMassRecord.class), p9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(CervicalMucusRecord.class), q9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(CyclingPedalingCadenceRecord.class), x8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(DistanceRecord.class), i9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(ElevationGainedRecord.class), r9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(ExerciseSessionRecord.class), s9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(FloorsClimbedRecord.class), t9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(HeartRateRecord.class), u9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(HeartRateVariabilityRmssdRecord.class), v9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(HeightRecord.class), w9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(HydrationRecord.class), x9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(IntermenstrualBleedingRecord.class), n8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(LeanBodyMassRecord.class), p8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(MenstruationFlowRecord.class), q8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(MenstruationPeriodRecord.class), r8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(NutritionRecord.class), s8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(OvulationTestRecord.class), t8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(OxygenSaturationRecord.class), u8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(PowerRecord.class), v8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(RespiratoryRateRecord.class), w8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(RestingHeartRateRecord.class), y8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(SexualActivityRecord.class), z8k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(SleepSessionRecord.class), b9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(SpeedRecord.class), c9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(StepsCadenceRecord.class), d9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(StepsRecord.class), e9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(TotalCaloriesBurnedRecord.class), f9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(Vo2MaxRecord.class), g9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(WeightRecord.class), h9k.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(WheelchairPushesRecord.class), j9k.a()));

    @NotNull
    public static final Map<KClass<? extends Record>, Class<? extends android.health.connect.datatypes.Record>> getSDK_TO_PLATFORM_RECORD_CLASS() {
        return SDK_TO_PLATFORM_RECORD_CLASS;
    }
}
