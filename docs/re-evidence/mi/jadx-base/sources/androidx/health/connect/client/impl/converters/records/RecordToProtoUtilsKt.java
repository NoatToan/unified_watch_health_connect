package androidx.health.connect.client.impl.converters.records;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.records.ExerciseLap;
import androidx.health.connect.client.records.ExerciseRoute;
import androidx.health.connect.client.records.ExerciseSegment;
import androidx.health.connect.client.records.InstantaneousRecord;
import androidx.health.connect.client.records.IntervalRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.metadata.Device;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import androidx.health.connect.client.units.Length;
import androidx.health.platform.client.proto.DataProto$Value;
import androidx.health.platform.client.proto.n;
import androidx.health.platform.client.proto.o;
import androidx.health.platform.client.proto.q;
import androidx.health.platform.client.proto.r;
import androidx.health.platform.client.proto.t;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0012\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0012\u0010\u0016\u001a\u0013\u0010\u0012\u001a\u00020\u0015*\u00020\u0017H\u0000¢\u0006\u0004\b\u0012\u0010\u0018\u001a\u0013\u0010\u0012\u001a\u00020\u0015*\u00020\u0019H\u0000¢\u0006\u0004\b\u0012\u0010\u001a\u001a\u0013\u0010\u0012\u001a\u00020\u0015*\u00020\u001bH\u0000¢\u0006\u0004\b\u0012\u0010\u001c¨\u0006\u001d"}, d2 = {"", "dataTypeName", "Landroidx/health/platform/client/proto/q;", "protoDataType", "(Ljava/lang/String;)Landroidx/health/platform/client/proto/q;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "Landroidx/health/platform/client/proto/o$a;", "instantaneousProto", "(Landroidx/health/connect/client/records/InstantaneousRecord;)Landroidx/health/platform/client/proto/o$a;", "Landroidx/health/connect/client/records/IntervalRecord;", "intervalProto", "(Landroidx/health/connect/client/records/IntervalRecord;)Landroidx/health/platform/client/proto/o$a;", "Landroidx/health/connect/client/records/metadata/Metadata;", "metadata", "setMetadata", "(Landroidx/health/platform/client/proto/o$a;Landroidx/health/connect/client/records/metadata/Metadata;)Landroidx/health/platform/client/proto/o$a;", "Landroidx/health/connect/client/records/metadata/Device;", "Landroidx/health/platform/client/proto/r;", "toProto", "(Landroidx/health/connect/client/records/metadata/Device;)Landroidx/health/platform/client/proto/r;", "Landroidx/health/connect/client/records/SleepSessionRecord$Stage;", "Landroidx/health/platform/client/proto/t;", "(Landroidx/health/connect/client/records/SleepSessionRecord$Stage;)Landroidx/health/platform/client/proto/t;", "Landroidx/health/connect/client/records/ExerciseSegment;", "(Landroidx/health/connect/client/records/ExerciseSegment;)Landroidx/health/platform/client/proto/t;", "Landroidx/health/connect/client/records/ExerciseLap;", "(Landroidx/health/connect/client/records/ExerciseLap;)Landroidx/health/platform/client/proto/t;", "Landroidx/health/connect/client/records/ExerciseRoute$Location;", "(Landroidx/health/connect/client/records/ExerciseRoute$Location;)Landroidx/health/platform/client/proto/t;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nRecordToProtoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordToProtoUtils.kt\nandroidx/health/connect/client/impl/converters/records/RecordToProtoUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class RecordToProtoUtilsKt {
    @NotNull
    public static final o.a instantaneousProto(@NotNull InstantaneousRecord instantaneousRecord) {
        Intrinsics.checkNotNullParameter(instantaneousRecord, "<this>");
        o.a aVarL0 = o.L0();
        Intrinsics.checkNotNullExpressionValue(aVarL0, "newBuilder()");
        o.a builder = setMetadata(aVarL0, instantaneousRecord.getMetadata()).J(instantaneousRecord.getTime().toEpochMilli());
        ZoneOffset zoneOffset = instantaneousRecord.getZoneOffset();
        if (zoneOffset != null) {
            builder.Q(zoneOffset.getTotalSeconds());
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    @NotNull
    public static final o.a intervalProto(@NotNull IntervalRecord intervalRecord) {
        Intrinsics.checkNotNullParameter(intervalRecord, "<this>");
        o.a aVarL0 = o.L0();
        Intrinsics.checkNotNullExpressionValue(aVarL0, "newBuilder()");
        o.a builder = setMetadata(aVarL0, intervalRecord.getMetadata()).L(intervalRecord.getStartTime().toEpochMilli()).H(intervalRecord.getEndTime().toEpochMilli());
        ZoneOffset startZoneOffset = intervalRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builder.M(startZoneOffset.getTotalSeconds());
        }
        ZoneOffset endZoneOffset = intervalRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builder.I(endZoneOffset.getTotalSeconds());
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    @NotNull
    public static final q protoDataType(@NotNull String dataTypeName) {
        Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
        q qVarBuild = q.S().y(dataTypeName).build();
        Intrinsics.checkNotNullExpressionValue(qVarBuild, "newBuilder().setName(dataTypeName).build()");
        return qVarBuild;
    }

    private static final o.a setMetadata(o.a aVar, androidx.health.connect.client.records.metadata.Metadata metadata) {
        if (!Intrinsics.areEqual(metadata.getId(), "")) {
            aVar.N(metadata.getId());
        }
        if (metadata.getDataOrigin().getPackageName().length() > 0) {
            aVar.D(n.S().y(metadata.getDataOrigin().getPackageName()).build());
        }
        if (metadata.getLastModifiedTime().isAfter(Instant.EPOCH)) {
            aVar.O(metadata.getLastModifiedTime().toEpochMilli());
        }
        String clientRecordId = metadata.getClientRecordId();
        if (clientRecordId != null) {
            aVar.B(clientRecordId);
        }
        if (metadata.getClientRecordVersion() > 0) {
            aVar.C(metadata.getClientRecordVersion());
        }
        Device device = metadata.getDevice();
        if (device != null) {
            aVar.G(toProto(device));
        }
        if (metadata.getRecordingMethod() > 0) {
            aVar.K(metadata.getRecordingMethod());
        }
        return aVar;
    }

    @NotNull
    public static final r toProto(@NotNull Device device) {
        Intrinsics.checkNotNullParameter(device, "<this>");
        r.a aVarY = r.Y();
        String manufacturer = device.getManufacturer();
        if (manufacturer != null) {
            aVarY.y(manufacturer);
        }
        String model = device.getModel();
        if (model != null) {
            aVarY.z(model);
        }
        aVarY.A(DeviceTypeConvertersKt.getDEVICE_TYPE_INT_TO_STRING_MAP().getOrDefault(Integer.valueOf(device.getType()), DeviceTypes.UNKNOWN));
        r rVarBuild = aVarY.build();
        Intrinsics.checkNotNullExpressionValue(rVarBuild, "newBuilder()\n        .ap…       }\n        .build()");
        return rVarBuild;
    }

    @NotNull
    public static final t toProto(@NotNull SleepSessionRecord.Stage stage) {
        Intrinsics.checkNotNullParameter(stage, "<this>");
        t.a aVarZ = t.X().A(stage.getStartTime().toEpochMilli()).z(stage.getEndTime().toEpochMilli());
        DataProto$Value dataProto$ValueEnumValFromInt = ValueExtKt.enumValFromInt(stage.getStage(), SleepSessionRecord.STAGE_TYPE_INT_TO_STRING_MAP);
        if (dataProto$ValueEnumValFromInt != null) {
            aVarZ.y(StepsInfo.KEY_STAGE, dataProto$ValueEnumValFromInt);
        }
        t tVarBuild = aVarZ.build();
        Intrinsics.checkNotNullExpressionValue(tVarBuild, "newBuilder()\n        .se…       }\n        .build()");
        return tVarBuild;
    }

    @NotNull
    public static final t toProto(@NotNull ExerciseSegment exerciseSegment) {
        Intrinsics.checkNotNullParameter(exerciseSegment, "<this>");
        t tVarBuild = t.X().A(exerciseSegment.getStartTime().toEpochMilli()).z(exerciseSegment.getEndTime().toEpochMilli()).y("type", ValueExtKt.longVal(exerciseSegment.getSegmentType())).y("reps", ValueExtKt.longVal(exerciseSegment.getRepetitions())).build();
        Intrinsics.checkNotNullExpressionValue(tVarBuild, "newBuilder()\n        .se…Long()))\n        .build()");
        return tVarBuild;
    }

    @NotNull
    public static final t toProto(@NotNull ExerciseLap exerciseLap) {
        Intrinsics.checkNotNullParameter(exerciseLap, "<this>");
        t.a aVarZ = t.X().A(exerciseLap.getStartTime().toEpochMilli()).z(exerciseLap.getEndTime().toEpochMilli());
        Length length = exerciseLap.getLength();
        if (length != null) {
            aVarZ.y("length", ValueExtKt.doubleVal(length.getMeters()));
        }
        t tVarBuild = aVarZ.build();
        Intrinsics.checkNotNullExpressionValue(tVarBuild, "newBuilder()\n        .se…rs)) } }\n        .build()");
        return tVarBuild;
    }

    @NotNull
    public static final t toProto(@NotNull ExerciseRoute.Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        t.a aVarY = t.X().A(location.getTime().toEpochMilli()).z(location.getTime().toEpochMilli()).y("latitude", ValueExtKt.doubleVal(location.getLatitude())).y("longitude", ValueExtKt.doubleVal(location.getLongitude()));
        Length horizontalAccuracy = location.getHorizontalAccuracy();
        if (horizontalAccuracy != null) {
            aVarY.y("horizontal_accuracy", ValueExtKt.doubleVal(horizontalAccuracy.getMeters()));
        }
        Length verticalAccuracy = location.getVerticalAccuracy();
        if (verticalAccuracy != null) {
            aVarY.y("vertical_accuracy", ValueExtKt.doubleVal(verticalAccuracy.getMeters()));
        }
        Length altitude = location.getAltitude();
        if (altitude != null) {
            aVarY.y("altitude", ValueExtKt.doubleVal(altitude.getMeters()));
        }
        t tVarBuild = aVarY.build();
        Intrinsics.checkNotNullExpressionValue(tVarBuild, "newBuilder()\n        .se…       }\n        .build()");
        return tVarBuild;
    }
}
