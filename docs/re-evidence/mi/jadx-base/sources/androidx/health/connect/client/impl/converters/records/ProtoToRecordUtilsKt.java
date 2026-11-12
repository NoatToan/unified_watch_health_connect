package androidx.health.connect.client.impl.converters.records;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.records.ExerciseLap;
import androidx.health.connect.client.records.ExerciseRoute;
import androidx.health.connect.client.records.ExerciseSegment;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.records.metadata.Device;
import androidx.health.connect.client.units.Length;
import androidx.health.connect.client.units.LengthKt;
import androidx.health.platform.client.proto.DataProto$Value;
import androidx.health.platform.client.proto.o;
import androidx.health.platform.client.proto.p;
import androidx.health.platform.client.proto.r;
import androidx.health.platform.client.proto.t;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.vm5;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a7\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0014\u001a%\u0010\b\u001a\u00020\u0007*\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0015\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u0016\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001c*\u00020\u001bH\u0000¢\u0006\u0004\b!\u0010\u001f\u001a\u0019\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001c*\u00020\u001bH\u0000¢\u0006\u0004\b#\u0010\u001f\u001a\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001c*\u00020\u001bH\u0000¢\u0006\u0004\b%\u0010\u001f\"\u0018\u0010*\u001a\u00020'*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0018\u0010,\u001a\u00020'*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)\"\u0018\u0010.\u001a\u00020'*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)\"\u001a\u00102\u001a\u0004\u0018\u00010/*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\"\u001a\u00104\u001a\u0004\u0018\u00010/*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00101\"\u001a\u00106\u001a\u0004\u0018\u00010/*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00101\"\u0018\u0010:\u001a\u000207*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Landroidx/health/platform/client/proto/p;", "", "key", "", "defaultVal", "getLong", "(Landroidx/health/platform/client/proto/p;Ljava/lang/String;J)J", "", "getDouble", "(Landroidx/health/platform/client/proto/p;Ljava/lang/String;D)D", "getString", "(Landroidx/health/platform/client/proto/p;Ljava/lang/String;)Ljava/lang/String;", "getEnum", "", "", "stringToIntMap", "default", "mapEnum", "(Landroidx/health/platform/client/proto/p;Ljava/lang/String;Ljava/util/Map;I)I", "Lvm5;", "(Lvm5;Ljava/lang/String;J)J", "(Lvm5;Ljava/lang/String;D)D", "(Lvm5;Ljava/lang/String;)Ljava/lang/String;", "Landroidx/health/platform/client/proto/r;", "Landroidx/health/connect/client/records/metadata/Device;", "toDevice", "(Landroidx/health/platform/client/proto/r;)Landroidx/health/connect/client/records/metadata/Device;", "Landroidx/health/platform/client/proto/o$b;", "", "Landroidx/health/connect/client/records/SleepSessionRecord$Stage;", "toStageList", "(Landroidx/health/platform/client/proto/o$b;)Ljava/util/List;", "Landroidx/health/connect/client/records/ExerciseSegment;", "toSegmentList", "Landroidx/health/connect/client/records/ExerciseLap;", "toLapList", "Landroidx/health/connect/client/records/ExerciseRoute$Location;", "toLocationList", "Landroidx/health/platform/client/proto/o;", "Ljava/time/Instant;", "getStartTime", "(Landroidx/health/platform/client/proto/o;)Ljava/time/Instant;", "startTime", "getEndTime", "endTime", "getTime", "time", "Ljava/time/ZoneOffset;", "getStartZoneOffset", "(Landroidx/health/platform/client/proto/o;)Ljava/time/ZoneOffset;", "startZoneOffset", "getEndZoneOffset", "endZoneOffset", "getZoneOffset", CloudContract.COL_ZONE_OFFSET, "Landroidx/health/connect/client/records/metadata/Metadata;", "getMetadata", "(Landroidx/health/platform/client/proto/o;)Landroidx/health/connect/client/records/metadata/Metadata;", "metadata", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nProtoToRecordUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoToRecordUtils.kt\nandroidx/health/connect/client/impl/converters/records/ProtoToRecordUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n1549#2:161\n1620#2,3:162\n1549#2:165\n1620#2,3:166\n1549#2:169\n1620#2,3:170\n1549#2:173\n1620#2,3:174\n*S KotlinDebug\n*F\n+ 1 ProtoToRecordUtils.kt\nandroidx/health/connect/client/impl/converters/records/ProtoToRecordUtilsKt\n*L\n117#1:161\n117#1:162,3\n128#1:165\n128#1:166,3\n139#1:169\n139#1:170,3\n149#1:173\n149#1:174,3\n*E\n"})
public final class ProtoToRecordUtilsKt {
    public static final double getDouble(@NotNull vm5 vm5Var, @NotNull String key, double d) {
        Intrinsics.checkNotNullParameter(vm5Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        DataProto$Value dataProto$Value = vm5Var.a().get(key);
        return dataProto$Value != null ? dataProto$Value.W() : d;
    }

    public static /* synthetic */ double getDouble$default(vm5 vm5Var, String str, double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = 0.0d;
        }
        return getDouble(vm5Var, str, d);
    }

    @NotNull
    public static final Instant getEndTime(@NotNull o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(oVar.o0());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(endTimeMillis)");
        return instantOfEpochMilli;
    }

    @Nullable
    public static final ZoneOffset getEndZoneOffset(@NotNull o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar.D0()) {
            return ZoneOffset.ofTotalSeconds(oVar.p0());
        }
        return null;
    }

    @Nullable
    public static final String getEnum(@NotNull vm5 vm5Var, @NotNull String key) {
        Intrinsics.checkNotNullParameter(vm5Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        DataProto$Value dataProto$Value = vm5Var.a().get(key);
        if (dataProto$Value != null) {
            return dataProto$Value.X();
        }
        return null;
    }

    public static final long getLong(@NotNull vm5 vm5Var, @NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(vm5Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        DataProto$Value dataProto$Value = vm5Var.a().get(key);
        return dataProto$Value != null ? dataProto$Value.Y() : j;
    }

    public static /* synthetic */ long getLong$default(vm5 vm5Var, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return getLong(vm5Var, str, j);
    }

    @NotNull
    public static final androidx.health.connect.client.records.metadata.Metadata getMetadata(@NotNull o oVar) {
        Device device;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        String strY0 = oVar.F0() ? oVar.y0() : "";
        Intrinsics.checkNotNullExpressionValue(strY0, "if (hasUid()) uid else Metadata.EMPTY_ID");
        String strQ = oVar.k0().Q();
        Intrinsics.checkNotNullExpressionValue(strQ, "dataOrigin.applicationId");
        DataOrigin dataOrigin = new DataOrigin(strQ);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(oVar.z0());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(updateTimeMillis)");
        String strI0 = oVar.B0() ? oVar.i0() : null;
        long jJ0 = oVar.j0();
        if (oVar.C0()) {
            r device2 = oVar.n0();
            Intrinsics.checkNotNullExpressionValue(device2, "device");
            device = toDevice(device2);
        } else {
            device = null;
        }
        return new androidx.health.connect.client.records.metadata.Metadata(strY0, dataOrigin, instantOfEpochMilli, strI0, jJ0, device, oVar.t0());
    }

    @NotNull
    public static final Instant getStartTime(@NotNull o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(oVar.v0());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(startTimeMillis)");
        return instantOfEpochMilli;
    }

    @Nullable
    public static final ZoneOffset getStartZoneOffset(@NotNull o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar.E0()) {
            return ZoneOffset.ofTotalSeconds(oVar.w0());
        }
        return null;
    }

    @Nullable
    public static final String getString(@NotNull vm5 vm5Var, @NotNull String key) {
        Intrinsics.checkNotNullParameter(vm5Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        DataProto$Value dataProto$Value = vm5Var.a().get(key);
        if (dataProto$Value != null) {
            return dataProto$Value.Z();
        }
        return null;
    }

    @NotNull
    public static final Instant getTime(@NotNull o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(oVar.q0());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(instantTimeMillis)");
        return instantOfEpochMilli;
    }

    @Nullable
    public static final ZoneOffset getZoneOffset(@NotNull o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar.G0()) {
            return ZoneOffset.ofTotalSeconds(oVar.A0());
        }
        return null;
    }

    public static final int mapEnum(@NotNull p pVar, @NotNull String key, @NotNull Map<String, Integer> stringToIntMap, int i) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stringToIntMap, "stringToIntMap");
        String str = getEnum(pVar, key);
        return str == null ? i : stringToIntMap.getOrDefault(str, Integer.valueOf(i)).intValue();
    }

    @NotNull
    public static final Device toDevice(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        String strT = rVar.W() ? rVar.T() : null;
        String strU = rVar.X() ? rVar.U() : null;
        Map<String, Integer> device_type_string_to_int_map = DeviceTypeConvertersKt.getDEVICE_TYPE_STRING_TO_INT_MAP();
        String type = rVar.V();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return new Device(strT, strU, device_type_string_to_int_map.getOrDefault(type, 0).intValue());
    }

    @NotNull
    public static final List<ExerciseLap> toLapList(@NotNull o.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List<t> valuesList = bVar.T();
        Intrinsics.checkNotNullExpressionValue(valuesList, "valuesList");
        List<t> list = valuesList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (t tVar : list) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(tVar.U());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(it.startTimeMillis)");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(tVar.S());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(it.endTimeMillis)");
            DataProto$Value dataProto$Value = tVar.a().get("length");
            arrayList.add(new ExerciseLap(instantOfEpochMilli, instantOfEpochMilli2, dataProto$Value != null ? LengthKt.getMeters(dataProto$Value.W()) : null));
        }
        return arrayList;
    }

    @NotNull
    public static final List<ExerciseRoute.Location> toLocationList(@NotNull o.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List<t> valuesList = bVar.T();
        Intrinsics.checkNotNullExpressionValue(valuesList, "valuesList");
        List<t> list = valuesList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (t tVar : list) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(tVar.U());
            DataProto$Value dataProto$Value = tVar.a().get("latitude");
            double dW = dataProto$Value != null ? dataProto$Value.W() : 0.0d;
            DataProto$Value dataProto$Value2 = tVar.a().get("longitude");
            double dW2 = dataProto$Value2 != null ? dataProto$Value2.W() : 0.0d;
            DataProto$Value dataProto$Value3 = tVar.a().get("altitude");
            Length meters = dataProto$Value3 != null ? LengthKt.getMeters(dataProto$Value3.W()) : null;
            DataProto$Value dataProto$Value4 = tVar.a().get("horizontal_accuracy");
            Length meters2 = dataProto$Value4 != null ? LengthKt.getMeters(dataProto$Value4.W()) : null;
            DataProto$Value dataProto$Value5 = tVar.a().get("vertical_accuracy");
            Length meters3 = dataProto$Value5 != null ? LengthKt.getMeters(dataProto$Value5.W()) : null;
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(it.startTimeMillis)");
            arrayList.add(new ExerciseRoute.Location(instantOfEpochMilli, dW, dW2, meters2, meters3, meters));
        }
        return arrayList;
    }

    @NotNull
    public static final List<ExerciseSegment> toSegmentList(@NotNull o.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List<t> valuesList = bVar.T();
        Intrinsics.checkNotNullExpressionValue(valuesList, "valuesList");
        List<t> list = valuesList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (t tVar : list) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(tVar.U());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(it.startTimeMillis)");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(tVar.S());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(it.endTimeMillis)");
            DataProto$Value dataProto$Value = tVar.a().get("type");
            int iY = 0;
            int iIntValue = (dataProto$Value != null ? Long.valueOf(dataProto$Value.Y()) : 0).intValue();
            DataProto$Value dataProto$Value2 = tVar.a().get("reps");
            if (dataProto$Value2 != null) {
                iY = (int) dataProto$Value2.Y();
            }
            arrayList.add(new ExerciseSegment(instantOfEpochMilli, instantOfEpochMilli2, iIntValue, iY));
        }
        return arrayList;
    }

    @NotNull
    public static final List<SleepSessionRecord.Stage> toStageList(@NotNull o.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List<t> valuesList = bVar.T();
        Intrinsics.checkNotNullExpressionValue(valuesList, "valuesList");
        List<t> list = valuesList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (t tVar : list) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(tVar.U());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(it.startTimeMillis)");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(tVar.S());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(it.endTimeMillis)");
            Map<String, Integer> map = SleepSessionRecord.STAGE_TYPE_STRING_TO_INT_MAP;
            DataProto$Value dataProto$Value = tVar.a().get(StepsInfo.KEY_STAGE);
            Integer num = map.get(dataProto$Value != null ? dataProto$Value.X() : null);
            arrayList.add(new SleepSessionRecord.Stage(instantOfEpochMilli, instantOfEpochMilli2, num != null ? num.intValue() : 0));
        }
        return arrayList;
    }

    public static final double getDouble(@NotNull p pVar, @NotNull String key, double d) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        DataProto$Value dataProto$Value = pVar.a().get(key);
        return dataProto$Value != null ? dataProto$Value.W() : d;
    }

    public static /* synthetic */ double getDouble$default(p pVar, String str, double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = 0.0d;
        }
        return getDouble(pVar, str, d);
    }

    @Nullable
    public static final String getEnum(@NotNull p pVar, @NotNull String key) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        DataProto$Value dataProto$Value = pVar.a().get(key);
        if (dataProto$Value != null) {
            return dataProto$Value.X();
        }
        return null;
    }

    public static final long getLong(@NotNull p pVar, @NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        DataProto$Value dataProto$Value = pVar.a().get(key);
        return dataProto$Value != null ? dataProto$Value.Y() : j;
    }

    public static /* synthetic */ long getLong$default(p pVar, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return getLong(pVar, str, j);
    }

    @Nullable
    public static final String getString(@NotNull p pVar, @NotNull String key) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        DataProto$Value dataProto$Value = pVar.a().get(key);
        if (dataProto$Value != null) {
            return dataProto$Value.Z();
        }
        return null;
    }
}
