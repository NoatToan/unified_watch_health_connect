package androidx.health.connect.client.impl.converters.records;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.records.ActiveCaloriesBurnedRecord;
import androidx.health.connect.client.records.BasalBodyTemperatureRecord;
import androidx.health.connect.client.records.BasalMetabolicRateRecord;
import androidx.health.connect.client.records.BloodGlucoseRecord;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.records.BodyFatRecord;
import androidx.health.connect.client.records.BodyTemperatureMeasurementLocation;
import androidx.health.connect.client.records.BodyTemperatureRecord;
import androidx.health.connect.client.records.BodyWaterMassRecord;
import androidx.health.connect.client.records.BoneMassRecord;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.health.connect.client.records.CyclingPedalingCadenceRecord;
import androidx.health.connect.client.records.DistanceRecord;
import androidx.health.connect.client.records.ElevationGainedRecord;
import androidx.health.connect.client.records.ExerciseLap;
import androidx.health.connect.client.records.ExerciseRoute;
import androidx.health.connect.client.records.ExerciseRouteResult;
import androidx.health.connect.client.records.ExerciseSegment;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.health.connect.client.records.FloorsClimbedRecord;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.HeartRateVariabilityRmssdRecord;
import androidx.health.connect.client.records.HeightRecord;
import androidx.health.connect.client.records.HydrationRecord;
import androidx.health.connect.client.records.InstantaneousRecord;
import androidx.health.connect.client.records.IntermenstrualBleedingRecord;
import androidx.health.connect.client.records.IntervalRecord;
import androidx.health.connect.client.records.LeanBodyMassRecord;
import androidx.health.connect.client.records.MealType;
import androidx.health.connect.client.records.MenstruationFlowRecord;
import androidx.health.connect.client.records.MenstruationPeriodRecord;
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.health.connect.client.records.OxygenSaturationRecord;
import androidx.health.connect.client.records.PowerRecord;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.RespiratoryRateRecord;
import androidx.health.connect.client.records.RestingHeartRateRecord;
import androidx.health.connect.client.records.SeriesRecord;
import androidx.health.connect.client.records.SexualActivityRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.records.StepsRecord;
import androidx.health.connect.client.records.TotalCaloriesBurnedRecord;
import androidx.health.connect.client.records.Vo2MaxRecord;
import androidx.health.connect.client.records.WeightRecord;
import androidx.health.connect.client.records.WheelchairPushesRecord;
import androidx.health.platform.client.proto.DataProto$Value;
import androidx.health.platform.client.proto.o;
import androidx.health.platform.client.proto.s;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import com.xiaomi.onetrack.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aN\u0010\u0002\u001a\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00020\u00072!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tH\u0002¢\u0006\u0004\b\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/health/connect/client/records/Record;", "Landroidx/health/platform/client/proto/o;", "toProto", "(Landroidx/health/connect/client/records/Record;)Landroidx/health/platform/client/proto/o;", "", "T", "Landroidx/health/connect/client/records/SeriesRecord;", "", "dataTypeName", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", a.e, "Landroidx/health/platform/client/proto/s;", "getSeriesValue", "(Landroidx/health/connect/client/records/SeriesRecord;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/health/platform/client/proto/o;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nRecordToProtoConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordToProtoConverters.kt\nandroidx/health/connect/client/impl/converters/records/RecordToProtoConvertersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,530:1\n1#2:531\n1549#3:532\n1620#3,3:533\n1549#3:536\n1620#3,3:537\n1549#3:540\n1620#3,3:541\n1549#3:544\n1620#3,3:545\n*S KotlinDebug\n*F\n+ 1 RecordToProtoConverters.kt\nandroidx/health/connect/client/impl/converters/records/RecordToProtoConvertersKt\n*L\n304#1:532\n304#1:533,3\n312#1:536\n312#1:537,3\n321#1:540\n321#1:541,3\n492#1:544\n492#1:545,3\n*E\n"})
public final class RecordToProtoConvertersKt {
    @NotNull
    public static final o toProto(@NotNull Record record) {
        Intrinsics.checkNotNullParameter(record, "<this>");
        if (record instanceof BasalBodyTemperatureRecord) {
            o.a aVarF = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("BasalBodyTemperature"));
            BasalBodyTemperatureRecord basalBodyTemperatureRecord = (BasalBodyTemperatureRecord) record;
            aVarF.A("temperature", ValueExtKt.doubleVal(basalBodyTemperatureRecord.getTemperature().getCelsius()));
            DataProto$Value dataProto$ValueEnumValFromInt = ValueExtKt.enumValFromInt(basalBodyTemperatureRecord.getMeasurementLocation(), BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt != null) {
                aVarF.A("measurementLocation", dataProto$ValueEnumValFromInt);
                Unit unit = Unit.INSTANCE;
            }
            o oVarBuild = aVarF.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild;
        }
        if (record instanceof BasalMetabolicRateRecord) {
            o.a aVarF2 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("BasalMetabolicRate"));
            aVarF2.A("bmr", ValueExtKt.doubleVal(((BasalMetabolicRateRecord) record).getBasalMetabolicRate().getKilocaloriesPerDay()));
            o oVarBuild2 = aVarF2.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild2, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild2;
        }
        if (record instanceof BloodGlucoseRecord) {
            o.a aVarF3 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("BloodGlucose"));
            BloodGlucoseRecord bloodGlucoseRecord = (BloodGlucoseRecord) record;
            aVarF3.A("level", ValueExtKt.doubleVal(bloodGlucoseRecord.getLevel().getMillimolesPerLiter()));
            DataProto$Value dataProto$ValueEnumValFromInt2 = ValueExtKt.enumValFromInt(bloodGlucoseRecord.getSpecimenSource(), BloodGlucoseRecord.SPECIMEN_SOURCE_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt2 != null) {
                aVarF3.A("specimenSource", dataProto$ValueEnumValFromInt2);
            }
            DataProto$Value dataProto$ValueEnumValFromInt3 = ValueExtKt.enumValFromInt(bloodGlucoseRecord.getMealType(), MealType.MEAL_TYPE_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt3 != null) {
                aVarF3.A("mealType", dataProto$ValueEnumValFromInt3);
            }
            DataProto$Value dataProto$ValueEnumValFromInt4 = ValueExtKt.enumValFromInt(bloodGlucoseRecord.getRelationToMeal(), BloodGlucoseRecord.RELATION_TO_MEAL_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt4 != null) {
                aVarF3.A("relationToMeal", dataProto$ValueEnumValFromInt4);
                Unit unit2 = Unit.INSTANCE;
            }
            o oVarBuild3 = aVarF3.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild3, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild3;
        }
        if (record instanceof BloodPressureRecord) {
            o.a aVarF4 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("BloodPressure"));
            BloodPressureRecord bloodPressureRecord = (BloodPressureRecord) record;
            aVarF4.A(DailyReportKey.systolic, ValueExtKt.doubleVal(bloodPressureRecord.getSystolic().getValue()));
            aVarF4.A(DailyReportKey.diastolic, ValueExtKt.doubleVal(bloodPressureRecord.getDiastolic().getValue()));
            DataProto$Value dataProto$ValueEnumValFromInt5 = ValueExtKt.enumValFromInt(bloodPressureRecord.getBodyPosition(), BloodPressureRecord.BODY_POSITION_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt5 != null) {
                aVarF4.A("bodyPosition", dataProto$ValueEnumValFromInt5);
            }
            DataProto$Value dataProto$ValueEnumValFromInt6 = ValueExtKt.enumValFromInt(bloodPressureRecord.getMeasurementLocation(), BloodPressureRecord.MEASUREMENT_LOCATION_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt6 != null) {
                aVarF4.A("measurementLocation", dataProto$ValueEnumValFromInt6);
                Unit unit3 = Unit.INSTANCE;
            }
            o oVarBuild4 = aVarF4.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild4, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild4;
        }
        if (record instanceof BodyFatRecord) {
            o.a aVarF5 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("BodyFat"));
            aVarF5.A("percentage", ValueExtKt.doubleVal(((BodyFatRecord) record).getPercentage().getValue()));
            o oVarBuild5 = aVarF5.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild5, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild5;
        }
        if (record instanceof BodyTemperatureRecord) {
            o.a aVarF6 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("BodyTemperature"));
            BodyTemperatureRecord bodyTemperatureRecord = (BodyTemperatureRecord) record;
            aVarF6.A("temperature", ValueExtKt.doubleVal(bodyTemperatureRecord.getTemperature().getCelsius()));
            DataProto$Value dataProto$ValueEnumValFromInt7 = ValueExtKt.enumValFromInt(bodyTemperatureRecord.getMeasurementLocation(), BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt7 != null) {
                aVarF6.A("measurementLocation", dataProto$ValueEnumValFromInt7);
                Unit unit4 = Unit.INSTANCE;
            }
            o oVarBuild6 = aVarF6.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild6, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild6;
        }
        if (record instanceof BodyWaterMassRecord) {
            o.a aVarF7 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("BodyWaterMass"));
            aVarF7.A("mass", ValueExtKt.doubleVal(((BodyWaterMassRecord) record).getMass().getKilograms()));
            o oVarBuild7 = aVarF7.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild7, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild7;
        }
        if (record instanceof BoneMassRecord) {
            o.a aVarF8 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("BoneMass"));
            aVarF8.A("mass", ValueExtKt.doubleVal(((BoneMassRecord) record).getMass().getKilograms()));
            o oVarBuild8 = aVarF8.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild8, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild8;
        }
        if (record instanceof CervicalMucusRecord) {
            o.a aVarF9 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("CervicalMucus"));
            CervicalMucusRecord cervicalMucusRecord = (CervicalMucusRecord) record;
            DataProto$Value dataProto$ValueEnumValFromInt8 = ValueExtKt.enumValFromInt(cervicalMucusRecord.getAppearance(), CervicalMucusRecord.APPEARANCE_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt8 != null) {
                aVarF9.A("texture", dataProto$ValueEnumValFromInt8);
            }
            DataProto$Value dataProto$ValueEnumValFromInt9 = ValueExtKt.enumValFromInt(cervicalMucusRecord.getSensation(), CervicalMucusRecord.SENSATION_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt9 != null) {
                aVarF9.A("amount", dataProto$ValueEnumValFromInt9);
                Unit unit5 = Unit.INSTANCE;
            }
            o oVarBuild9 = aVarF9.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild9, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild9;
        }
        if (record instanceof CyclingPedalingCadenceRecord) {
            return toProto((SeriesRecord) record, "CyclingPedalingCadenceSeries", new Function1<CyclingPedalingCadenceRecord.Sample, s>() { // from class: androidx.health.connect.client.impl.converters.records.RecordToProtoConvertersKt.toProto.10
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final s invoke2(@NotNull CyclingPedalingCadenceRecord.Sample sample) {
                    Intrinsics.checkNotNullParameter(sample, "sample");
                    s sVarBuild = s.V().y("rpm", ValueExtKt.doubleVal(sample.getRevolutionsPerMinute())).z(sample.getTime().toEpochMilli()).build();
                    Intrinsics.checkNotNullExpressionValue(sVarBuild, "newBuilder()\n           …                 .build()");
                    return sVarBuild;
                }
            });
        }
        if (record instanceof HeartRateRecord) {
            return toProto((SeriesRecord) record, "HeartRateSeries", new Function1<HeartRateRecord.Sample, s>() { // from class: androidx.health.connect.client.impl.converters.records.RecordToProtoConvertersKt.toProto.11
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final s invoke2(@NotNull HeartRateRecord.Sample sample) {
                    Intrinsics.checkNotNullParameter(sample, "sample");
                    s sVarBuild = s.V().y("bpm", ValueExtKt.longVal(sample.getBeatsPerMinute())).z(sample.getTime().toEpochMilli()).build();
                    Intrinsics.checkNotNullExpressionValue(sVarBuild, "newBuilder()\n           …                 .build()");
                    return sVarBuild;
                }
            });
        }
        if (record instanceof HeightRecord) {
            o.a aVarF10 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("Height"));
            aVarF10.A("height", ValueExtKt.doubleVal(((HeightRecord) record).getHeight().getMeters()));
            o oVarBuild10 = aVarF10.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild10, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild10;
        }
        if (record instanceof HeartRateVariabilityRmssdRecord) {
            o.a aVarF11 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("HeartRateVariabilityRmssd"));
            aVarF11.A("heartRateVariability", ValueExtKt.doubleVal(((HeartRateVariabilityRmssdRecord) record).getHeartRateVariabilityMillis()));
            o oVarBuild11 = aVarF11.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild11, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild11;
        }
        if (record instanceof IntermenstrualBleedingRecord) {
            o oVarBuild12 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("IntermenstrualBleeding")).build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild12, "instantaneousProto().set…strualBleeding\")).build()");
            return oVarBuild12;
        }
        if (record instanceof LeanBodyMassRecord) {
            o.a aVarF12 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("LeanBodyMass"));
            aVarF12.A("mass", ValueExtKt.doubleVal(((LeanBodyMassRecord) record).getMass().getKilograms()));
            o oVarBuild13 = aVarF12.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild13, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild13;
        }
        if (record instanceof MenstruationFlowRecord) {
            o.a aVarF13 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType(AIApiConstants.Menstruation.NAME));
            DataProto$Value dataProto$ValueEnumValFromInt10 = ValueExtKt.enumValFromInt(((MenstruationFlowRecord) record).getFlow(), MenstruationFlowRecord.FLOW_TYPE_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt10 != null) {
                aVarF13.A("flow", dataProto$ValueEnumValFromInt10);
                Unit unit6 = Unit.INSTANCE;
            }
            o oVarBuild14 = aVarF13.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild14, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild14;
        }
        if (record instanceof MenstruationPeriodRecord) {
            o oVarBuild15 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("MenstruationPeriod")).build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild15, "intervalProto().setDataT…truationPeriod\")).build()");
            return oVarBuild15;
        }
        if (record instanceof OvulationTestRecord) {
            o.a aVarF14 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("OvulationTest"));
            DataProto$Value dataProto$ValueEnumValFromInt11 = ValueExtKt.enumValFromInt(((OvulationTestRecord) record).getResult(), OvulationTestRecord.RESULT_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt11 != null) {
                aVarF14.A("result", dataProto$ValueEnumValFromInt11);
                Unit unit7 = Unit.INSTANCE;
            }
            o oVarBuild16 = aVarF14.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild16, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild16;
        }
        if (record instanceof OxygenSaturationRecord) {
            o.a aVarF15 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("OxygenSaturation"));
            aVarF15.A("percentage", ValueExtKt.doubleVal(((OxygenSaturationRecord) record).getPercentage().getValue()));
            o oVarBuild17 = aVarF15.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild17, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild17;
        }
        if (record instanceof PowerRecord) {
            return toProto((SeriesRecord) record, "PowerSeries", new Function1<PowerRecord.Sample, s>() { // from class: androidx.health.connect.client.impl.converters.records.RecordToProtoConvertersKt.toProto.18
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final s invoke2(@NotNull PowerRecord.Sample sample) {
                    Intrinsics.checkNotNullParameter(sample, "sample");
                    s sVarBuild = s.V().y("power", ValueExtKt.doubleVal(sample.getPower().getWatts())).z(sample.getTime().toEpochMilli()).build();
                    Intrinsics.checkNotNullExpressionValue(sVarBuild, "newBuilder()\n           …                 .build()");
                    return sVarBuild;
                }
            });
        }
        if (record instanceof RespiratoryRateRecord) {
            o.a aVarF16 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("RespiratoryRate"));
            aVarF16.A("rate", ValueExtKt.doubleVal(((RespiratoryRateRecord) record).getRate()));
            o oVarBuild18 = aVarF16.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild18, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild18;
        }
        if (record instanceof RestingHeartRateRecord) {
            o.a aVarF17 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("RestingHeartRate"));
            aVarF17.A("bpm", ValueExtKt.longVal(((RestingHeartRateRecord) record).getBeatsPerMinute()));
            o oVarBuild19 = aVarF17.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild19, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild19;
        }
        if (record instanceof SexualActivityRecord) {
            o.a aVarF18 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("SexualActivity"));
            DataProto$Value dataProto$ValueEnumValFromInt12 = ValueExtKt.enumValFromInt(((SexualActivityRecord) record).getProtectionUsed(), SexualActivityRecord.PROTECTION_USED_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt12 != null) {
                aVarF18.A("protectionUsed", dataProto$ValueEnumValFromInt12);
                Unit unit8 = Unit.INSTANCE;
            }
            o oVarBuild20 = aVarF18.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild20, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild20;
        }
        if (record instanceof SpeedRecord) {
            return toProto((SeriesRecord) record, "SpeedSeries", new Function1<SpeedRecord.Sample, s>() { // from class: androidx.health.connect.client.impl.converters.records.RecordToProtoConvertersKt.toProto.22
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final s invoke2(@NotNull SpeedRecord.Sample sample) {
                    Intrinsics.checkNotNullParameter(sample, "sample");
                    s sVarBuild = s.V().y("speed", ValueExtKt.doubleVal(sample.getSpeed().getMetersPerSecond())).z(sample.getTime().toEpochMilli()).build();
                    Intrinsics.checkNotNullExpressionValue(sVarBuild, "newBuilder()\n           …                 .build()");
                    return sVarBuild;
                }
            });
        }
        if (record instanceof StepsCadenceRecord) {
            return toProto((SeriesRecord) record, "StepsCadenceSeries", new Function1<StepsCadenceRecord.Sample, s>() { // from class: androidx.health.connect.client.impl.converters.records.RecordToProtoConvertersKt.toProto.23
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final s invoke2(@NotNull StepsCadenceRecord.Sample sample) {
                    Intrinsics.checkNotNullParameter(sample, "sample");
                    s sVarBuild = s.V().y("rate", ValueExtKt.doubleVal(sample.getRate())).z(sample.getTime().toEpochMilli()).build();
                    Intrinsics.checkNotNullExpressionValue(sVarBuild, "newBuilder()\n           …                 .build()");
                    return sVarBuild;
                }
            });
        }
        if (record instanceof Vo2MaxRecord) {
            o.a aVarF19 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("Vo2Max"));
            Vo2MaxRecord vo2MaxRecord = (Vo2MaxRecord) record;
            aVarF19.A("vo2", ValueExtKt.doubleVal(vo2MaxRecord.getVo2MillilitersPerMinuteKilogram()));
            DataProto$Value dataProto$ValueEnumValFromInt13 = ValueExtKt.enumValFromInt(vo2MaxRecord.getMeasurementMethod(), Vo2MaxRecord.MEASUREMENT_METHOD_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt13 != null) {
                aVarF19.A("measurementMethod", dataProto$ValueEnumValFromInt13);
                Unit unit9 = Unit.INSTANCE;
            }
            o oVarBuild21 = aVarF19.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild21, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild21;
        }
        if (record instanceof WeightRecord) {
            o.a aVarF20 = RecordToProtoUtilsKt.instantaneousProto((InstantaneousRecord) record).F(RecordToProtoUtilsKt.protoDataType("Weight"));
            aVarF20.A("weight", ValueExtKt.doubleVal(((WeightRecord) record).getWeight().getKilograms()));
            o oVarBuild22 = aVarF20.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild22, "instantaneousProto()\n   …\n                .build()");
            return oVarBuild22;
        }
        if (record instanceof ActiveCaloriesBurnedRecord) {
            o.a aVarF21 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("ActiveCaloriesBurned"));
            aVarF21.A("energy", ValueExtKt.doubleVal(((ActiveCaloriesBurnedRecord) record).getEnergy().getKilocalories()));
            o oVarBuild23 = aVarF21.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild23, "intervalProto()\n        …\n                .build()");
            return oVarBuild23;
        }
        if (record instanceof ExerciseSessionRecord) {
            o.a aVarF22 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("ActivitySession"));
            ExerciseSessionRecord exerciseSessionRecord = (ExerciseSessionRecord) record;
            o.a aVarA = aVarF22.A("hasRoute", ValueExtKt.boolVal(!(exerciseSessionRecord.getExerciseRouteResult() instanceof ExerciseRouteResult.NoData)));
            DataProto$Value dataProto$ValueEnumValFromInt14 = ValueExtKt.enumValFromInt(exerciseSessionRecord.getExerciseType(), ExerciseSessionRecord.EXERCISE_TYPE_INT_TO_STRING_MAP);
            if (dataProto$ValueEnumValFromInt14 == null) {
                dataProto$ValueEnumValFromInt14 = ValueExtKt.enumVal("workout");
            }
            aVarA.A("activityType", dataProto$ValueEnumValFromInt14);
            String title = exerciseSessionRecord.getTitle();
            if (title != null) {
                aVarA.A("title", ValueExtKt.stringVal(title));
            }
            String notes = exerciseSessionRecord.getNotes();
            if (notes != null) {
                aVarA.A("notes", ValueExtKt.stringVal(notes));
            }
            if (!exerciseSessionRecord.getSegments().isEmpty()) {
                o.b.a aVarU = o.b.U();
                List<ExerciseSegment> segments = exerciseSessionRecord.getSegments();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(segments, 10));
                Iterator<T> it = segments.iterator();
                while (it.hasNext()) {
                    arrayList.add(RecordToProtoUtilsKt.toProto((ExerciseSegment) it.next()));
                }
                aVarA.z("segments", aVarU.y(arrayList).build());
            }
            if (!exerciseSessionRecord.getLaps().isEmpty()) {
                o.b.a aVarU2 = o.b.U();
                List<ExerciseLap> laps = exerciseSessionRecord.getLaps();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(laps, 10));
                Iterator<T> it2 = laps.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(RecordToProtoUtilsKt.toProto((ExerciseLap) it2.next()));
                }
                aVarA.z("laps", aVarU2.y(arrayList2).build());
            }
            if (exerciseSessionRecord.getExerciseRouteResult() instanceof ExerciseRouteResult.Data) {
                o.b.a aVarU3 = o.b.U();
                List<ExerciseRoute.Location> route = ((ExerciseRouteResult.Data) exerciseSessionRecord.getExerciseRouteResult()).getExerciseRoute().getRoute();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(route, 10));
                Iterator<T> it3 = route.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(RecordToProtoUtilsKt.toProto((ExerciseRoute.Location) it3.next()));
                }
                aVarA.z("route", aVarU3.y(arrayList3).build());
            }
            o oVarBuild24 = aVarA.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild24, "intervalProto()\n        …\n                .build()");
            return oVarBuild24;
        }
        if (record instanceof DistanceRecord) {
            o.a aVarF23 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("Distance"));
            aVarF23.A("distance", ValueExtKt.doubleVal(((DistanceRecord) record).getDistance().getMeters()));
            o oVarBuild25 = aVarF23.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild25, "intervalProto()\n        …\n                .build()");
            return oVarBuild25;
        }
        if (record instanceof ElevationGainedRecord) {
            o.a aVarF24 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("ElevationGained"));
            aVarF24.A(BizTypeConstants.ELEVATION, ValueExtKt.doubleVal(((ElevationGainedRecord) record).getElevation().getMeters()));
            o oVarBuild26 = aVarF24.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild26, "intervalProto()\n        …\n                .build()");
            return oVarBuild26;
        }
        if (record instanceof FloorsClimbedRecord) {
            o.a aVarF25 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("FloorsClimbed"));
            aVarF25.A("floors", ValueExtKt.doubleVal(((FloorsClimbedRecord) record).getFloors()));
            o oVarBuild27 = aVarF25.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild27, "intervalProto()\n        …\n                .build()");
            return oVarBuild27;
        }
        if (record instanceof HydrationRecord) {
            o.a aVarF26 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("Hydration"));
            aVarF26.A("volume", ValueExtKt.doubleVal(((HydrationRecord) record).getVolume().getLiters()));
            o oVarBuild28 = aVarF26.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild28, "intervalProto()\n        …\n                .build()");
            return oVarBuild28;
        }
        if (!(record instanceof NutritionRecord)) {
            if (!(record instanceof SleepSessionRecord)) {
                if (record instanceof StepsRecord) {
                    o.a aVarF27 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("Steps"));
                    aVarF27.A("count", ValueExtKt.longVal(((StepsRecord) record).getCount()));
                    o oVarBuild29 = aVarF27.build();
                    Intrinsics.checkNotNullExpressionValue(oVarBuild29, "intervalProto()\n        …\n                .build()");
                    return oVarBuild29;
                }
                if (record instanceof TotalCaloriesBurnedRecord) {
                    o.a aVarF28 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("TotalCaloriesBurned"));
                    aVarF28.A("energy", ValueExtKt.doubleVal(((TotalCaloriesBurnedRecord) record).getEnergy().getKilocalories()));
                    o oVarBuild30 = aVarF28.build();
                    Intrinsics.checkNotNullExpressionValue(oVarBuild30, "intervalProto()\n        …\n                .build()");
                    return oVarBuild30;
                }
                if (!(record instanceof WheelchairPushesRecord)) {
                    throw new RuntimeException("Unsupported yet!");
                }
                o.a aVarF29 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("WheelchairPushes"));
                aVarF29.A("count", ValueExtKt.longVal(((WheelchairPushesRecord) record).getCount()));
                o oVarBuild31 = aVarF29.build();
                Intrinsics.checkNotNullExpressionValue(oVarBuild31, "intervalProto()\n        …\n                .build()");
                return oVarBuild31;
            }
            o.a aVarF30 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("SleepSession"));
            SleepSessionRecord sleepSessionRecord = (SleepSessionRecord) record;
            if (!sleepSessionRecord.getStages().isEmpty()) {
                o.b.a aVarU4 = o.b.U();
                List<SleepSessionRecord.Stage> stages = sleepSessionRecord.getStages();
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stages, 10));
                Iterator<T> it4 = stages.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(RecordToProtoUtilsKt.toProto((SleepSessionRecord.Stage) it4.next()));
                }
                aVarF30.z("stages", aVarU4.y(arrayList4).build());
            }
            String title2 = sleepSessionRecord.getTitle();
            if (title2 != null) {
                aVarF30.A("title", ValueExtKt.stringVal(title2));
            }
            String notes2 = sleepSessionRecord.getNotes();
            if (notes2 != null) {
                aVarF30.A("notes", ValueExtKt.stringVal(notes2));
                Unit unit10 = Unit.INSTANCE;
            }
            o oVarBuild32 = aVarF30.build();
            Intrinsics.checkNotNullExpressionValue(oVarBuild32, "intervalProto()\n        …\n                .build()");
            return oVarBuild32;
        }
        o.a aVarF31 = RecordToProtoUtilsKt.intervalProto((IntervalRecord) record).F(RecordToProtoUtilsKt.protoDataType("Nutrition"));
        NutritionRecord nutritionRecord = (NutritionRecord) record;
        if (nutritionRecord.getBiotin() != null) {
            aVarF31.A("biotin", ValueExtKt.doubleVal(nutritionRecord.getBiotin().getGrams()));
        }
        if (nutritionRecord.getCaffeine() != null) {
            aVarF31.A("caffeine", ValueExtKt.doubleVal(nutritionRecord.getCaffeine().getGrams()));
        }
        if (nutritionRecord.getCalcium() != null) {
            aVarF31.A("calcium", ValueExtKt.doubleVal(nutritionRecord.getCalcium().getGrams()));
        }
        if (nutritionRecord.getEnergy() != null) {
            aVarF31.A("calories", ValueExtKt.doubleVal(nutritionRecord.getEnergy().getKilocalories()));
        }
        if (nutritionRecord.getEnergyFromFat() != null) {
            aVarF31.A("caloriesFromFat", ValueExtKt.doubleVal(nutritionRecord.getEnergyFromFat().getKilocalories()));
        }
        if (nutritionRecord.getChloride() != null) {
            aVarF31.A("chloride", ValueExtKt.doubleVal(nutritionRecord.getChloride().getGrams()));
        }
        if (nutritionRecord.getCholesterol() != null) {
            aVarF31.A("cholesterol", ValueExtKt.doubleVal(nutritionRecord.getCholesterol().getGrams()));
        }
        if (nutritionRecord.getChromium() != null) {
            aVarF31.A("chromium", ValueExtKt.doubleVal(nutritionRecord.getChromium().getGrams()));
        }
        if (nutritionRecord.getCopper() != null) {
            aVarF31.A("copper", ValueExtKt.doubleVal(nutritionRecord.getCopper().getGrams()));
        }
        if (nutritionRecord.getDietaryFiber() != null) {
            aVarF31.A("dietaryFiber", ValueExtKt.doubleVal(nutritionRecord.getDietaryFiber().getGrams()));
        }
        if (nutritionRecord.getFolate() != null) {
            aVarF31.A("folate", ValueExtKt.doubleVal(nutritionRecord.getFolate().getGrams()));
        }
        if (nutritionRecord.getFolicAcid() != null) {
            aVarF31.A("folicAcid", ValueExtKt.doubleVal(nutritionRecord.getFolicAcid().getGrams()));
        }
        if (nutritionRecord.getIodine() != null) {
            aVarF31.A("iodine", ValueExtKt.doubleVal(nutritionRecord.getIodine().getGrams()));
        }
        if (nutritionRecord.getIron() != null) {
            aVarF31.A("iron", ValueExtKt.doubleVal(nutritionRecord.getIron().getGrams()));
        }
        if (nutritionRecord.getMagnesium() != null) {
            aVarF31.A("magnesium", ValueExtKt.doubleVal(nutritionRecord.getMagnesium().getGrams()));
        }
        if (nutritionRecord.getManganese() != null) {
            aVarF31.A("manganese", ValueExtKt.doubleVal(nutritionRecord.getManganese().getGrams()));
        }
        if (nutritionRecord.getMolybdenum() != null) {
            aVarF31.A("molybdenum", ValueExtKt.doubleVal(nutritionRecord.getMolybdenum().getGrams()));
        }
        if (nutritionRecord.getMonounsaturatedFat() != null) {
            aVarF31.A("monounsaturatedFat", ValueExtKt.doubleVal(nutritionRecord.getMonounsaturatedFat().getGrams()));
        }
        if (nutritionRecord.getNiacin() != null) {
            aVarF31.A("niacin", ValueExtKt.doubleVal(nutritionRecord.getNiacin().getGrams()));
        }
        if (nutritionRecord.getPantothenicAcid() != null) {
            aVarF31.A("pantothenicAcid", ValueExtKt.doubleVal(nutritionRecord.getPantothenicAcid().getGrams()));
        }
        if (nutritionRecord.getPhosphorus() != null) {
            aVarF31.A("phosphorus", ValueExtKt.doubleVal(nutritionRecord.getPhosphorus().getGrams()));
        }
        if (nutritionRecord.getPolyunsaturatedFat() != null) {
            aVarF31.A("polyunsaturatedFat", ValueExtKt.doubleVal(nutritionRecord.getPolyunsaturatedFat().getGrams()));
        }
        if (nutritionRecord.getPotassium() != null) {
            aVarF31.A("potassium", ValueExtKt.doubleVal(nutritionRecord.getPotassium().getGrams()));
        }
        if (nutritionRecord.getProtein() != null) {
            aVarF31.A(DailyReportKey.protein, ValueExtKt.doubleVal(nutritionRecord.getProtein().getGrams()));
        }
        if (nutritionRecord.getRiboflavin() != null) {
            aVarF31.A("riboflavin", ValueExtKt.doubleVal(nutritionRecord.getRiboflavin().getGrams()));
        }
        if (nutritionRecord.getSaturatedFat() != null) {
            aVarF31.A("saturatedFat", ValueExtKt.doubleVal(nutritionRecord.getSaturatedFat().getGrams()));
        }
        if (nutritionRecord.getSelenium() != null) {
            aVarF31.A("selenium", ValueExtKt.doubleVal(nutritionRecord.getSelenium().getGrams()));
        }
        if (nutritionRecord.getSodium() != null) {
            aVarF31.A("sodium", ValueExtKt.doubleVal(nutritionRecord.getSodium().getGrams()));
        }
        if (nutritionRecord.getSugar() != null) {
            aVarF31.A("sugar", ValueExtKt.doubleVal(nutritionRecord.getSugar().getGrams()));
        }
        if (nutritionRecord.getThiamin() != null) {
            aVarF31.A("thiamin", ValueExtKt.doubleVal(nutritionRecord.getThiamin().getGrams()));
        }
        if (nutritionRecord.getTotalCarbohydrate() != null) {
            aVarF31.A("totalCarbohydrate", ValueExtKt.doubleVal(nutritionRecord.getTotalCarbohydrate().getGrams()));
        }
        if (nutritionRecord.getTotalFat() != null) {
            aVarF31.A("totalFat", ValueExtKt.doubleVal(nutritionRecord.getTotalFat().getGrams()));
        }
        if (nutritionRecord.getTransFat() != null) {
            aVarF31.A("transFat", ValueExtKt.doubleVal(nutritionRecord.getTransFat().getGrams()));
        }
        if (nutritionRecord.getUnsaturatedFat() != null) {
            aVarF31.A("unsaturatedFat", ValueExtKt.doubleVal(nutritionRecord.getUnsaturatedFat().getGrams()));
        }
        if (nutritionRecord.getVitaminA() != null) {
            aVarF31.A("vitaminA", ValueExtKt.doubleVal(nutritionRecord.getVitaminA().getGrams()));
        }
        if (nutritionRecord.getVitaminB12() != null) {
            aVarF31.A("vitaminB12", ValueExtKt.doubleVal(nutritionRecord.getVitaminB12().getGrams()));
        }
        if (nutritionRecord.getVitaminB6() != null) {
            aVarF31.A("vitaminB6", ValueExtKt.doubleVal(nutritionRecord.getVitaminB6().getGrams()));
        }
        if (nutritionRecord.getVitaminC() != null) {
            aVarF31.A("vitaminC", ValueExtKt.doubleVal(nutritionRecord.getVitaminC().getGrams()));
        }
        if (nutritionRecord.getVitaminD() != null) {
            aVarF31.A("vitaminD", ValueExtKt.doubleVal(nutritionRecord.getVitaminD().getGrams()));
        }
        if (nutritionRecord.getVitaminE() != null) {
            aVarF31.A("vitaminE", ValueExtKt.doubleVal(nutritionRecord.getVitaminE().getGrams()));
        }
        if (nutritionRecord.getVitaminK() != null) {
            aVarF31.A("vitaminK", ValueExtKt.doubleVal(nutritionRecord.getVitaminK().getGrams()));
        }
        if (nutritionRecord.getZinc() != null) {
            aVarF31.A("zinc", ValueExtKt.doubleVal(nutritionRecord.getZinc().getGrams()));
        }
        DataProto$Value dataProto$ValueEnumValFromInt15 = ValueExtKt.enumValFromInt(nutritionRecord.getMealType(), MealType.MEAL_TYPE_INT_TO_STRING_MAP);
        if (dataProto$ValueEnumValFromInt15 != null) {
            aVarF31.A("mealType", dataProto$ValueEnumValFromInt15);
        }
        String name = nutritionRecord.getName();
        if (name != null) {
            aVarF31.A("name", ValueExtKt.stringVal(name));
            Unit unit11 = Unit.INSTANCE;
        }
        o oVarBuild33 = aVarF31.build();
        Intrinsics.checkNotNullExpressionValue(oVarBuild33, "intervalProto()\n        …\n                .build()");
        return oVarBuild33;
    }

    private static final <T> o toProto(SeriesRecord<? extends T> seriesRecord, String str, Function1<? super T, s> function1) {
        o.a aVarF = RecordToProtoUtilsKt.intervalProto(seriesRecord).F(RecordToProtoUtilsKt.protoDataType(str));
        Iterator<? extends T> it = seriesRecord.getSamples().iterator();
        while (it.hasNext()) {
            aVarF.y(function1.invoke2(it.next()));
        }
        o oVarBuild = aVarF.build();
        Intrinsics.checkNotNullExpressionValue(oVarBuild, "intervalProto()\n        …       }\n        .build()");
        return oVarBuild;
    }
}
