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
import androidx.health.connect.client.records.IntermenstrualBleedingRecord;
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
import androidx.health.connect.client.records.SexualActivityRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.records.StepsRecord;
import androidx.health.connect.client.records.TotalCaloriesBurnedRecord;
import androidx.health.connect.client.records.Vo2MaxRecord;
import androidx.health.connect.client.records.WeightRecord;
import androidx.health.connect.client.records.WheelchairPushesRecord;
import androidx.health.connect.client.units.BloodGlucose;
import androidx.health.connect.client.units.Energy;
import androidx.health.connect.client.units.EnergyKt;
import androidx.health.connect.client.units.Length;
import androidx.health.connect.client.units.LengthKt;
import androidx.health.connect.client.units.Mass;
import androidx.health.connect.client.units.MassKt;
import androidx.health.connect.client.units.PercentageKt;
import androidx.health.connect.client.units.PowerKt;
import androidx.health.connect.client.units.PressureKt;
import androidx.health.connect.client.units.TemperatureKt;
import androidx.health.connect.client.units.VelocityKt;
import androidx.health.connect.client.units.VolumeKt;
import androidx.health.platform.client.proto.DataProto$Value;
import androidx.health.platform.client.proto.o;
import androidx.health.platform.client.proto.s;
import androidx.health.platform.client.proto.t;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/health/platform/client/proto/o;", "proto", "Landroidx/health/connect/client/records/Record;", "toRecord", "(Landroidx/health/platform/client/proto/o;)Landroidx/health/connect/client/records/Record;", "Landroidx/health/platform/client/exerciseroute/ExerciseRoute;", "protoWrapper", "Landroidx/health/connect/client/records/ExerciseRoute;", "toExerciseRouteData", "(Landroidx/health/platform/client/exerciseroute/ExerciseRoute;)Landroidx/health/connect/client/records/ExerciseRoute;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nProtoToRecordConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoToRecordConverters.kt\nandroidx/health/connect/client/impl/converters/records/ProtoToRecordConvertersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,590:1\n1549#2:591\n1620#2,3:592\n1549#2:595\n1620#2,3:596\n1549#2:599\n1620#2,3:600\n1549#2:603\n1620#2,3:604\n1549#2:607\n1620#2,3:608\n1549#2:611\n1620#2,3:612\n*S KotlinDebug\n*F\n+ 1 ProtoToRecordConverters.kt\nandroidx/health/connect/client/impl/converters/records/ProtoToRecordConvertersKt\n*L\n211#1:591\n211#1:592,3\n226#1:595\n226#1:596,3\n314#1:599\n314#1:600,3\n355#1:603\n355#1:604,3\n370#1:607\n370#1:608,3\n578#1:611\n578#1:612,3\n*E\n"})
public final class ProtoToRecordConvertersKt {
    @NotNull
    public static final ExerciseRoute toExerciseRouteData(@NotNull androidx.health.platform.client.exerciseroute.ExerciseRoute protoWrapper) {
        Intrinsics.checkNotNullParameter(protoWrapper, "protoWrapper");
        List<t> listT = protoWrapper.getProto().T();
        Intrinsics.checkNotNullExpressionValue(listT, "protoWrapper.proto.valuesList");
        List<t> list = listT;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (t tVar : list) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(tVar.U());
            DataProto$Value dataProto$Value = tVar.a().get("latitude");
            Intrinsics.checkNotNull(dataProto$Value);
            double dW = dataProto$Value.W();
            DataProto$Value dataProto$Value2 = tVar.a().get("longitude");
            Intrinsics.checkNotNull(dataProto$Value2);
            double dW2 = dataProto$Value2.W();
            DataProto$Value dataProto$Value3 = tVar.a().get("altitude");
            Length meters = dataProto$Value3 != null ? LengthKt.getMeters(dataProto$Value3.W()) : null;
            DataProto$Value dataProto$Value4 = tVar.a().get("horizontal_accuracy");
            Length meters2 = dataProto$Value4 != null ? LengthKt.getMeters(dataProto$Value4.W()) : null;
            DataProto$Value dataProto$Value5 = tVar.a().get("vertical_accuracy");
            Length meters3 = dataProto$Value5 != null ? LengthKt.getMeters(dataProto$Value5.W()) : null;
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(value.startTimeMillis)");
            arrayList.add(new ExerciseRoute.Location(instantOfEpochMilli, dW, dW2, meters2, meters3, meters));
        }
        return new ExerciseRoute(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final Record toRecord(@NotNull o proto) {
        Record heightRecord;
        Record heartRateVariabilityRmssdRecord;
        List<ExerciseSegment> listEmptyList;
        List<ExerciseLap> listEmptyList2;
        ExerciseRouteResult noData;
        List<SleepSessionRecord.Stage> listEmptyList3;
        Intrinsics.checkNotNullParameter(proto, "proto");
        String strR = proto.l0().R();
        if (strR != null) {
            switch (strR.hashCode()) {
                case -2137162425:
                    if (strR.equals("Height")) {
                        heightRecord = new HeightRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), LengthKt.getMeters(ProtoToRecordUtilsKt.getDouble$default(proto, "height", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heightRecord;
                    }
                    break;
                case -1931142571:
                    if (strR.equals("BasalMetabolicRate")) {
                        heightRecord = new BasalMetabolicRateRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), PowerKt.getKilocaloriesPerDay(ProtoToRecordUtilsKt.getDouble$default(proto, "bmr", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heightRecord;
                    }
                    break;
                case -1878699588:
                    if (strR.equals("MenstruationPeriod")) {
                        return new MenstruationPeriodRecord(ProtoToRecordUtilsKt.getStartTime(proto), ProtoToRecordUtilsKt.getStartZoneOffset(proto), ProtoToRecordUtilsKt.getEndTime(proto), ProtoToRecordUtilsKt.getEndZoneOffset(proto), ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case -1739492291:
                    if (strR.equals("HeartRateSeries")) {
                        Instant startTime = ProtoToRecordUtilsKt.getStartTime(proto);
                        ZoneOffset startZoneOffset = ProtoToRecordUtilsKt.getStartZoneOffset(proto);
                        Instant endTime = ProtoToRecordUtilsKt.getEndTime(proto);
                        ZoneOffset endZoneOffset = ProtoToRecordUtilsKt.getEndZoneOffset(proto);
                        List<s> seriesValuesList = proto.u0();
                        Intrinsics.checkNotNullExpressionValue(seriesValuesList, "seriesValuesList");
                        List<s> list = seriesValuesList;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (s value : list) {
                            Instant instantOfEpochMilli = Instant.ofEpochMilli(value.R());
                            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(value.instantTimeMillis)");
                            Intrinsics.checkNotNullExpressionValue(value, "value");
                            arrayList.add(new HeartRateRecord.Sample(instantOfEpochMilli, ProtoToRecordUtilsKt.getLong$default(value, "bpm", 0L, 2, (Object) null)));
                        }
                        return new HeartRateRecord(startTime, startZoneOffset, endTime, endZoneOffset, arrayList, ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case -1728782805:
                    if (strR.equals("Vo2Max")) {
                        return new Vo2MaxRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), ProtoToRecordUtilsKt.getDouble$default(proto, "vo2", 0.0d, 2, (Object) null), ProtoToRecordUtilsKt.mapEnum(proto, "measurementMethod", Vo2MaxRecord.MEASUREMENT_METHOD_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case -1707725160:
                    if (strR.equals("Weight")) {
                        heightRecord = new WeightRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), MassKt.getKilograms(ProtoToRecordUtilsKt.getDouble$default(proto, "weight", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heightRecord;
                    }
                    break;
                case -1547814841:
                    if (strR.equals("HeartRateVariabilityRmssd")) {
                        double double$default = 1.0d;
                        if (ProtoToRecordUtilsKt.getDouble$default(proto, "heartRateVariability", 0.0d, 2, (Object) null) >= 1.0d) {
                            double$default = 200.0d;
                            if (ProtoToRecordUtilsKt.getDouble$default(proto, "heartRateVariability", 0.0d, 2, (Object) null) <= 200.0d) {
                                double$default = ProtoToRecordUtilsKt.getDouble$default(proto, "heartRateVariability", 0.0d, 2, (Object) null);
                            }
                        }
                        heartRateVariabilityRmssdRecord = new HeartRateVariabilityRmssdRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), double$default, ProtoToRecordUtilsKt.getMetadata(proto));
                        return heartRateVariabilityRmssdRecord;
                    }
                    break;
                case -1249467044:
                    if (strR.equals("LeanBodyMass")) {
                        heightRecord = new LeanBodyMassRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), MassKt.getKilograms(ProtoToRecordUtilsKt.getDouble$default(proto, "mass", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heightRecord;
                    }
                    break;
                case -1170329975:
                    if (strR.equals("SexualActivity")) {
                        heightRecord = new SexualActivityRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), ProtoToRecordUtilsKt.mapEnum(proto, "protectionUsed", SexualActivityRecord.PROTECTION_USED_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heightRecord;
                    }
                    break;
                case -1089246824:
                    if (strR.equals("TotalCaloriesBurned")) {
                        heartRateVariabilityRmssdRecord = new TotalCaloriesBurnedRecord(ProtoToRecordUtilsKt.getStartTime(proto), ProtoToRecordUtilsKt.getStartZoneOffset(proto), ProtoToRecordUtilsKt.getEndTime(proto), ProtoToRecordUtilsKt.getEndZoneOffset(proto), EnergyKt.getKilocalories(ProtoToRecordUtilsKt.getDouble$default(proto, "energy", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heartRateVariabilityRmssdRecord;
                    }
                    break;
                case -633416129:
                    if (strR.equals("BloodPressure")) {
                        return new BloodPressureRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), PressureKt.getMillimetersOfMercury(ProtoToRecordUtilsKt.getDouble$default(proto, DailyReportKey.systolic, 0.0d, 2, (Object) null)), PressureKt.getMillimetersOfMercury(ProtoToRecordUtilsKt.getDouble$default(proto, DailyReportKey.diastolic, 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.mapEnum(proto, "bodyPosition", BloodPressureRecord.BODY_POSITION_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.mapEnum(proto, "measurementLocation", BloodPressureRecord.MEASUREMENT_LOCATION_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case -562822786:
                    if (strR.equals("SpeedSeries")) {
                        Instant startTime2 = ProtoToRecordUtilsKt.getStartTime(proto);
                        ZoneOffset startZoneOffset2 = ProtoToRecordUtilsKt.getStartZoneOffset(proto);
                        Instant endTime2 = ProtoToRecordUtilsKt.getEndTime(proto);
                        ZoneOffset endZoneOffset2 = ProtoToRecordUtilsKt.getEndZoneOffset(proto);
                        List<s> seriesValuesList2 = proto.u0();
                        Intrinsics.checkNotNullExpressionValue(seriesValuesList2, "seriesValuesList");
                        List<s> list2 = seriesValuesList2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        for (s value2 : list2) {
                            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(value2.R());
                            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(value.instantTimeMillis)");
                            Intrinsics.checkNotNullExpressionValue(value2, "value");
                            arrayList2.add(new SpeedRecord.Sample(instantOfEpochMilli2, VelocityKt.getMetersPerSecond(ProtoToRecordUtilsKt.getDouble$default(value2, "speed", 0.0d, 2, (Object) null))));
                        }
                        return new SpeedRecord(startTime2, startZoneOffset2, endTime2, endZoneOffset2, arrayList2, ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case -561665783:
                    if (strR.equals("BodyWaterMass")) {
                        heightRecord = new BodyWaterMassRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), MassKt.getKilograms(ProtoToRecordUtilsKt.getDouble$default(proto, "mass", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heightRecord;
                    }
                    break;
                case -539421262:
                    if (strR.equals("OxygenSaturation")) {
                        heightRecord = new OxygenSaturationRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), PercentageKt.getPercent(ProtoToRecordUtilsKt.getDouble$default(proto, "percentage", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heightRecord;
                    }
                    break;
                case -136898551:
                    if (strR.equals("OvulationTest")) {
                        heightRecord = new OvulationTestRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), ProtoToRecordUtilsKt.mapEnum(proto, "result", OvulationTestRecord.RESULT_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heightRecord;
                    }
                    break;
                case 8847540:
                    if (strR.equals("BloodGlucose")) {
                        return new BloodGlucoseRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), BloodGlucose.INSTANCE.millimolesPerLiter(ProtoToRecordUtilsKt.getDouble$default(proto, "level", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.mapEnum(proto, "specimenSource", BloodGlucoseRecord.SPECIMEN_SOURCE_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.mapEnum(proto, "mealType", MealType.MEAL_TYPE_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.mapEnum(proto, "relationToMeal", BloodGlucoseRecord.RELATION_TO_MEAL_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case 80208647:
                    if (strR.equals("Steps")) {
                        return new StepsRecord(ProtoToRecordUtilsKt.getStartTime(proto), ProtoToRecordUtilsKt.getStartZoneOffset(proto), ProtoToRecordUtilsKt.getEndTime(proto), ProtoToRecordUtilsKt.getEndZoneOffset(proto), ProtoToRecordUtilsKt.getLong$default(proto, "count", 0L, 2, (Object) null), ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case 128630298:
                    if (strR.equals("ActiveCaloriesBurned")) {
                        heartRateVariabilityRmssdRecord = new ActiveCaloriesBurnedRecord(ProtoToRecordUtilsKt.getStartTime(proto), ProtoToRecordUtilsKt.getStartZoneOffset(proto), ProtoToRecordUtilsKt.getEndTime(proto), ProtoToRecordUtilsKt.getEndZoneOffset(proto), EnergyKt.getKilocalories(ProtoToRecordUtilsKt.getDouble$default(proto, "energy", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heartRateVariabilityRmssdRecord;
                    }
                    break;
                case 187665747:
                    if (strR.equals("BasalBodyTemperature")) {
                        heartRateVariabilityRmssdRecord = new BasalBodyTemperatureRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), TemperatureKt.getCelsius(ProtoToRecordUtilsKt.getDouble$default(proto, "temperature", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.mapEnum(proto, "measurementLocation", BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heartRateVariabilityRmssdRecord;
                    }
                    break;
                case 246984731:
                    if (strR.equals(AIApiConstants.Menstruation.NAME)) {
                        heightRecord = new MenstruationFlowRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), ProtoToRecordUtilsKt.mapEnum(proto, "flow", MenstruationFlowRecord.FLOW_TYPE_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heightRecord;
                    }
                    break;
                case 353103893:
                    if (strR.equals("Distance")) {
                        heartRateVariabilityRmssdRecord = new DistanceRecord(ProtoToRecordUtilsKt.getStartTime(proto), ProtoToRecordUtilsKt.getStartZoneOffset(proto), ProtoToRecordUtilsKt.getEndTime(proto), ProtoToRecordUtilsKt.getEndZoneOffset(proto), LengthKt.getMeters(ProtoToRecordUtilsKt.getDouble$default(proto, "distance", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heartRateVariabilityRmssdRecord;
                    }
                    break;
                case 557067342:
                    if (strR.equals("CervicalMucus")) {
                        heartRateVariabilityRmssdRecord = new CervicalMucusRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), ProtoToRecordUtilsKt.mapEnum(proto, "texture", CervicalMucusRecord.APPEARANCE_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.mapEnum(proto, "amount", CervicalMucusRecord.SENSATION_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heartRateVariabilityRmssdRecord;
                    }
                    break;
                case 761063032:
                    if (strR.equals("RestingHeartRate")) {
                        return new RestingHeartRateRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), ProtoToRecordUtilsKt.getLong$default(proto, "bpm", 0L, 2, (Object) null), ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case 955204109:
                    if (strR.equals("FloorsClimbed")) {
                        return new FloorsClimbedRecord(ProtoToRecordUtilsKt.getStartTime(proto), ProtoToRecordUtilsKt.getStartZoneOffset(proto), ProtoToRecordUtilsKt.getEndTime(proto), ProtoToRecordUtilsKt.getEndZoneOffset(proto), ProtoToRecordUtilsKt.getDouble$default(proto, "floors", 0.0d, 2, (Object) null), ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case 989918314:
                    if (strR.equals("RespiratoryRate")) {
                        return new RespiratoryRateRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), ProtoToRecordUtilsKt.getDouble$default(proto, "rate", 0.0d, 2, (Object) null), ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case 1051870422:
                    if (strR.equals("Hydration")) {
                        heartRateVariabilityRmssdRecord = new HydrationRecord(ProtoToRecordUtilsKt.getStartTime(proto), ProtoToRecordUtilsKt.getStartZoneOffset(proto), ProtoToRecordUtilsKt.getEndTime(proto), ProtoToRecordUtilsKt.getEndZoneOffset(proto), VolumeKt.getLiters(ProtoToRecordUtilsKt.getDouble$default(proto, "volume", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heartRateVariabilityRmssdRecord;
                    }
                    break;
                case 1108584865:
                    if (strR.equals("StepsCadenceSeries")) {
                        Instant startTime3 = ProtoToRecordUtilsKt.getStartTime(proto);
                        ZoneOffset startZoneOffset3 = ProtoToRecordUtilsKt.getStartZoneOffset(proto);
                        Instant endTime3 = ProtoToRecordUtilsKt.getEndTime(proto);
                        ZoneOffset endZoneOffset3 = ProtoToRecordUtilsKt.getEndZoneOffset(proto);
                        List<s> seriesValuesList3 = proto.u0();
                        Intrinsics.checkNotNullExpressionValue(seriesValuesList3, "seriesValuesList");
                        List<s> list3 = seriesValuesList3;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        for (s value3 : list3) {
                            Instant instantOfEpochMilli3 = Instant.ofEpochMilli(value3.R());
                            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli3, "ofEpochMilli(value.instantTimeMillis)");
                            Intrinsics.checkNotNullExpressionValue(value3, "value");
                            arrayList3.add(new StepsCadenceRecord.Sample(instantOfEpochMilli3, ProtoToRecordUtilsKt.getDouble$default(value3, "rate", 0.0d, 2, (Object) null)));
                        }
                        return new StepsCadenceRecord(startTime3, startZoneOffset3, endTime3, endZoneOffset3, arrayList3, ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case 1193457969:
                    if (strR.equals("IntermenstrualBleeding")) {
                        return new IntermenstrualBleedingRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case 1468615931:
                    if (strR.equals("ElevationGained")) {
                        heartRateVariabilityRmssdRecord = new ElevationGainedRecord(ProtoToRecordUtilsKt.getStartTime(proto), ProtoToRecordUtilsKt.getStartZoneOffset(proto), ProtoToRecordUtilsKt.getEndTime(proto), ProtoToRecordUtilsKt.getEndZoneOffset(proto), LengthKt.getMeters(ProtoToRecordUtilsKt.getDouble$default(proto, BizTypeConstants.ELEVATION, 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heartRateVariabilityRmssdRecord;
                    }
                    break;
                case 1478142546:
                    if (strR.equals("WheelchairPushes")) {
                        return new WheelchairPushesRecord(ProtoToRecordUtilsKt.getStartTime(proto), ProtoToRecordUtilsKt.getStartZoneOffset(proto), ProtoToRecordUtilsKt.getEndTime(proto), ProtoToRecordUtilsKt.getEndZoneOffset(proto), ProtoToRecordUtilsKt.getLong$default(proto, "count", 0L, 2, (Object) null), ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case 1498531293:
                    if (strR.equals("CyclingPedalingCadenceSeries")) {
                        Instant startTime4 = ProtoToRecordUtilsKt.getStartTime(proto);
                        ZoneOffset startZoneOffset4 = ProtoToRecordUtilsKt.getStartZoneOffset(proto);
                        Instant endTime4 = ProtoToRecordUtilsKt.getEndTime(proto);
                        ZoneOffset endZoneOffset4 = ProtoToRecordUtilsKt.getEndZoneOffset(proto);
                        List<s> seriesValuesList4 = proto.u0();
                        Intrinsics.checkNotNullExpressionValue(seriesValuesList4, "seriesValuesList");
                        List<s> list4 = seriesValuesList4;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                        for (s value4 : list4) {
                            Instant instantOfEpochMilli4 = Instant.ofEpochMilli(value4.R());
                            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli4, "ofEpochMilli(value.instantTimeMillis)");
                            Intrinsics.checkNotNullExpressionValue(value4, "value");
                            arrayList4.add(new CyclingPedalingCadenceRecord.Sample(instantOfEpochMilli4, ProtoToRecordUtilsKt.getDouble$default(value4, "rpm", 0.0d, 2, (Object) null)));
                        }
                        return new CyclingPedalingCadenceRecord(startTime4, startZoneOffset4, endTime4, endZoneOffset4, arrayList4, ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case 1513758823:
                    if (strR.equals("ActivitySession")) {
                        int iMapEnum = ProtoToRecordUtilsKt.mapEnum(proto, "activityType", ExerciseSessionRecord.EXERCISE_TYPE_STRING_TO_INT_MAP, 0);
                        String string = ProtoToRecordUtilsKt.getString(proto, "title");
                        String string2 = ProtoToRecordUtilsKt.getString(proto, "notes");
                        Instant startTime5 = ProtoToRecordUtilsKt.getStartTime(proto);
                        ZoneOffset startZoneOffset5 = ProtoToRecordUtilsKt.getStartZoneOffset(proto);
                        Instant endTime5 = ProtoToRecordUtilsKt.getEndTime(proto);
                        ZoneOffset endZoneOffset5 = ProtoToRecordUtilsKt.getEndZoneOffset(proto);
                        androidx.health.connect.client.records.metadata.Metadata metadata = ProtoToRecordUtilsKt.getMetadata(proto);
                        o.b bVar = proto.x0().get("segments");
                        if (bVar == null || (listEmptyList = ProtoToRecordUtilsKt.toSegmentList(bVar)) == null) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        List<ExerciseSegment> list5 = listEmptyList;
                        o.b bVar2 = proto.x0().get("laps");
                        if (bVar2 == null || (listEmptyList2 = ProtoToRecordUtilsKt.toLapList(bVar2)) == null) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        }
                        List<ExerciseLap> list6 = listEmptyList2;
                        o.b bVar3 = proto.x0().get("route");
                        if (bVar3 != null) {
                            noData = new ExerciseRouteResult.Data(new ExerciseRoute(ProtoToRecordUtilsKt.toLocationList(bVar3)));
                        } else {
                            DataProto$Value dataProto$Value = proto.a().get("hasRoute");
                            noData = (dataProto$Value == null || !dataProto$Value.U()) ? new ExerciseRouteResult.NoData() : new ExerciseRouteResult.ConsentRequired();
                        }
                        return new ExerciseSessionRecord(startTime5, startZoneOffset5, endTime5, endZoneOffset5, iMapEnum, string, string2, metadata, list5, list6, noData);
                    }
                    break;
                case 1584919122:
                    if (strR.equals("BodyTemperature")) {
                        heartRateVariabilityRmssdRecord = new BodyTemperatureRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), TemperatureKt.getCelsius(ProtoToRecordUtilsKt.getDouble$default(proto, "temperature", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.mapEnum(proto, "measurementLocation", BodyTemperatureMeasurementLocation.MEASUREMENT_LOCATION_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heartRateVariabilityRmssdRecord;
                    }
                    break;
                case 1719563767:
                    if (strR.equals("BodyFat")) {
                        heightRecord = new BodyFatRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), PercentageKt.getPercent(ProtoToRecordUtilsKt.getDouble$default(proto, "percentage", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heightRecord;
                    }
                    break;
                case 1738316664:
                    if (strR.equals("Nutrition")) {
                        DataProto$Value dataProto$Value2 = proto.a().get("biotin");
                        Mass grams = dataProto$Value2 != null ? MassKt.getGrams(dataProto$Value2.W()) : null;
                        DataProto$Value dataProto$Value3 = proto.a().get("caffeine");
                        Mass grams2 = dataProto$Value3 != null ? MassKt.getGrams(dataProto$Value3.W()) : null;
                        DataProto$Value dataProto$Value4 = proto.a().get("calcium");
                        Mass grams3 = dataProto$Value4 != null ? MassKt.getGrams(dataProto$Value4.W()) : null;
                        DataProto$Value dataProto$Value5 = proto.a().get("calories");
                        Energy kilocalories = dataProto$Value5 != null ? EnergyKt.getKilocalories(dataProto$Value5.W()) : null;
                        DataProto$Value dataProto$Value6 = proto.a().get("caloriesFromFat");
                        Energy kilocalories2 = dataProto$Value6 != null ? EnergyKt.getKilocalories(dataProto$Value6.W()) : null;
                        DataProto$Value dataProto$Value7 = proto.a().get("chloride");
                        Mass grams4 = dataProto$Value7 != null ? MassKt.getGrams(dataProto$Value7.W()) : null;
                        DataProto$Value dataProto$Value8 = proto.a().get("cholesterol");
                        Mass grams5 = dataProto$Value8 != null ? MassKt.getGrams(dataProto$Value8.W()) : null;
                        DataProto$Value dataProto$Value9 = proto.a().get("chromium");
                        Mass grams6 = dataProto$Value9 != null ? MassKt.getGrams(dataProto$Value9.W()) : null;
                        DataProto$Value dataProto$Value10 = proto.a().get("copper");
                        Mass grams7 = dataProto$Value10 != null ? MassKt.getGrams(dataProto$Value10.W()) : null;
                        DataProto$Value dataProto$Value11 = proto.a().get("dietaryFiber");
                        Mass grams8 = dataProto$Value11 != null ? MassKt.getGrams(dataProto$Value11.W()) : null;
                        DataProto$Value dataProto$Value12 = proto.a().get("folate");
                        Mass grams9 = dataProto$Value12 != null ? MassKt.getGrams(dataProto$Value12.W()) : null;
                        DataProto$Value dataProto$Value13 = proto.a().get("folicAcid");
                        Mass grams10 = dataProto$Value13 != null ? MassKt.getGrams(dataProto$Value13.W()) : null;
                        DataProto$Value dataProto$Value14 = proto.a().get("iodine");
                        Mass grams11 = dataProto$Value14 != null ? MassKt.getGrams(dataProto$Value14.W()) : null;
                        DataProto$Value dataProto$Value15 = proto.a().get("iron");
                        Mass grams12 = dataProto$Value15 != null ? MassKt.getGrams(dataProto$Value15.W()) : null;
                        DataProto$Value dataProto$Value16 = proto.a().get("magnesium");
                        Mass grams13 = dataProto$Value16 != null ? MassKt.getGrams(dataProto$Value16.W()) : null;
                        DataProto$Value dataProto$Value17 = proto.a().get("manganese");
                        Mass grams14 = dataProto$Value17 != null ? MassKt.getGrams(dataProto$Value17.W()) : null;
                        DataProto$Value dataProto$Value18 = proto.a().get("molybdenum");
                        Mass grams15 = dataProto$Value18 != null ? MassKt.getGrams(dataProto$Value18.W()) : null;
                        DataProto$Value dataProto$Value19 = proto.a().get("monounsaturatedFat");
                        Mass grams16 = dataProto$Value19 != null ? MassKt.getGrams(dataProto$Value19.W()) : null;
                        DataProto$Value dataProto$Value20 = proto.a().get("niacin");
                        Mass grams17 = dataProto$Value20 != null ? MassKt.getGrams(dataProto$Value20.W()) : null;
                        DataProto$Value dataProto$Value21 = proto.a().get("pantothenicAcid");
                        Mass grams18 = dataProto$Value21 != null ? MassKt.getGrams(dataProto$Value21.W()) : null;
                        DataProto$Value dataProto$Value22 = proto.a().get("phosphorus");
                        Mass grams19 = dataProto$Value22 != null ? MassKt.getGrams(dataProto$Value22.W()) : null;
                        DataProto$Value dataProto$Value23 = proto.a().get("polyunsaturatedFat");
                        Mass grams20 = dataProto$Value23 != null ? MassKt.getGrams(dataProto$Value23.W()) : null;
                        DataProto$Value dataProto$Value24 = proto.a().get("potassium");
                        Mass grams21 = dataProto$Value24 != null ? MassKt.getGrams(dataProto$Value24.W()) : null;
                        DataProto$Value dataProto$Value25 = proto.a().get(DailyReportKey.protein);
                        Mass grams22 = dataProto$Value25 != null ? MassKt.getGrams(dataProto$Value25.W()) : null;
                        DataProto$Value dataProto$Value26 = proto.a().get("riboflavin");
                        Mass grams23 = dataProto$Value26 != null ? MassKt.getGrams(dataProto$Value26.W()) : null;
                        DataProto$Value dataProto$Value27 = proto.a().get("saturatedFat");
                        Mass grams24 = dataProto$Value27 != null ? MassKt.getGrams(dataProto$Value27.W()) : null;
                        DataProto$Value dataProto$Value28 = proto.a().get("selenium");
                        Mass grams25 = dataProto$Value28 != null ? MassKt.getGrams(dataProto$Value28.W()) : null;
                        DataProto$Value dataProto$Value29 = proto.a().get("sodium");
                        Mass grams26 = dataProto$Value29 != null ? MassKt.getGrams(dataProto$Value29.W()) : null;
                        DataProto$Value dataProto$Value30 = proto.a().get("sugar");
                        Mass grams27 = dataProto$Value30 != null ? MassKt.getGrams(dataProto$Value30.W()) : null;
                        DataProto$Value dataProto$Value31 = proto.a().get("thiamin");
                        Mass grams28 = dataProto$Value31 != null ? MassKt.getGrams(dataProto$Value31.W()) : null;
                        DataProto$Value dataProto$Value32 = proto.a().get("totalCarbohydrate");
                        Mass grams29 = dataProto$Value32 != null ? MassKt.getGrams(dataProto$Value32.W()) : null;
                        DataProto$Value dataProto$Value33 = proto.a().get("totalFat");
                        Mass grams30 = dataProto$Value33 != null ? MassKt.getGrams(dataProto$Value33.W()) : null;
                        DataProto$Value dataProto$Value34 = proto.a().get("transFat");
                        Mass grams31 = dataProto$Value34 != null ? MassKt.getGrams(dataProto$Value34.W()) : null;
                        DataProto$Value dataProto$Value35 = proto.a().get("unsaturatedFat");
                        Mass grams32 = dataProto$Value35 != null ? MassKt.getGrams(dataProto$Value35.W()) : null;
                        DataProto$Value dataProto$Value36 = proto.a().get("vitaminA");
                        Mass grams33 = dataProto$Value36 != null ? MassKt.getGrams(dataProto$Value36.W()) : null;
                        DataProto$Value dataProto$Value37 = proto.a().get("vitaminB12");
                        Mass grams34 = dataProto$Value37 != null ? MassKt.getGrams(dataProto$Value37.W()) : null;
                        DataProto$Value dataProto$Value38 = proto.a().get("vitaminB6");
                        Mass grams35 = dataProto$Value38 != null ? MassKt.getGrams(dataProto$Value38.W()) : null;
                        DataProto$Value dataProto$Value39 = proto.a().get("vitaminC");
                        Mass grams36 = dataProto$Value39 != null ? MassKt.getGrams(dataProto$Value39.W()) : null;
                        DataProto$Value dataProto$Value40 = proto.a().get("vitaminD");
                        Mass grams37 = dataProto$Value40 != null ? MassKt.getGrams(dataProto$Value40.W()) : null;
                        DataProto$Value dataProto$Value41 = proto.a().get("vitaminE");
                        Mass grams38 = dataProto$Value41 != null ? MassKt.getGrams(dataProto$Value41.W()) : null;
                        DataProto$Value dataProto$Value42 = proto.a().get("vitaminK");
                        Mass grams39 = dataProto$Value42 != null ? MassKt.getGrams(dataProto$Value42.W()) : null;
                        DataProto$Value dataProto$Value43 = proto.a().get("zinc");
                        return new NutritionRecord(ProtoToRecordUtilsKt.getStartTime(proto), ProtoToRecordUtilsKt.getStartZoneOffset(proto), ProtoToRecordUtilsKt.getEndTime(proto), ProtoToRecordUtilsKt.getEndZoneOffset(proto), grams, grams2, grams3, kilocalories, kilocalories2, grams4, grams5, grams6, grams7, grams8, grams9, grams10, grams11, grams12, grams13, grams14, grams15, grams16, grams17, grams18, grams19, grams20, grams21, grams22, grams23, grams24, grams25, grams26, grams27, grams28, grams29, grams30, grams31, grams32, grams33, grams34, grams35, grams36, grams37, grams38, grams39, dataProto$Value43 != null ? MassKt.getGrams(dataProto$Value43.W()) : null, ProtoToRecordUtilsKt.getString(proto, "name"), ProtoToRecordUtilsKt.mapEnum(proto, "mealType", MealType.MEAL_TYPE_STRING_TO_INT_MAP, 0), ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
                case 2034898936:
                    if (strR.equals("BoneMass")) {
                        heightRecord = new BoneMassRecord(ProtoToRecordUtilsKt.getTime(proto), ProtoToRecordUtilsKt.getZoneOffset(proto), MassKt.getKilograms(ProtoToRecordUtilsKt.getDouble$default(proto, "mass", 0.0d, 2, (Object) null)), ProtoToRecordUtilsKt.getMetadata(proto));
                        return heightRecord;
                    }
                    break;
                case 2065313759:
                    if (strR.equals("SleepSession")) {
                        String string3 = ProtoToRecordUtilsKt.getString(proto, "title");
                        String string4 = ProtoToRecordUtilsKt.getString(proto, "notes");
                        Instant startTime6 = ProtoToRecordUtilsKt.getStartTime(proto);
                        ZoneOffset startZoneOffset6 = ProtoToRecordUtilsKt.getStartZoneOffset(proto);
                        Instant endTime6 = ProtoToRecordUtilsKt.getEndTime(proto);
                        ZoneOffset endZoneOffset6 = ProtoToRecordUtilsKt.getEndZoneOffset(proto);
                        o.b bVar4 = proto.x0().get("stages");
                        if (bVar4 == null || (listEmptyList3 = ProtoToRecordUtilsKt.toStageList(bVar4)) == null) {
                            listEmptyList3 = CollectionsKt__CollectionsKt.emptyList();
                        }
                        heartRateVariabilityRmssdRecord = new SleepSessionRecord(startTime6, startZoneOffset6, endTime6, endZoneOffset6, string3, string4, listEmptyList3, ProtoToRecordUtilsKt.getMetadata(proto));
                        return heartRateVariabilityRmssdRecord;
                    }
                    break;
                case 2095285180:
                    if (strR.equals("PowerSeries")) {
                        Instant startTime7 = ProtoToRecordUtilsKt.getStartTime(proto);
                        ZoneOffset startZoneOffset7 = ProtoToRecordUtilsKt.getStartZoneOffset(proto);
                        Instant endTime7 = ProtoToRecordUtilsKt.getEndTime(proto);
                        ZoneOffset endZoneOffset7 = ProtoToRecordUtilsKt.getEndZoneOffset(proto);
                        List<s> seriesValuesList5 = proto.u0();
                        Intrinsics.checkNotNullExpressionValue(seriesValuesList5, "seriesValuesList");
                        List<s> list7 = seriesValuesList5;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                        for (s value5 : list7) {
                            Instant instantOfEpochMilli5 = Instant.ofEpochMilli(value5.R());
                            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli5, "ofEpochMilli(value.instantTimeMillis)");
                            Intrinsics.checkNotNullExpressionValue(value5, "value");
                            arrayList5.add(new PowerRecord.Sample(instantOfEpochMilli5, PowerKt.getWatts(ProtoToRecordUtilsKt.getDouble$default(value5, "power", 0.0d, 2, (Object) null))));
                        }
                        return new PowerRecord(startTime7, startZoneOffset7, endTime7, endZoneOffset7, arrayList5, ProtoToRecordUtilsKt.getMetadata(proto));
                    }
                    break;
            }
        }
        throw new RuntimeException("Unknown data type " + proto.l0().R());
    }
}
