package androidx.health.connect.client.records;

import androidx.annotation.RestrictTo;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/health/connect/client/records/MenstruationFlowRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/time/Instant;", "time", "Ljava/time/Instant;", "getTime", "()Ljava/time/Instant;", "Ljava/time/ZoneOffset;", CloudContract.COL_ZONE_OFFSET, "Ljava/time/ZoneOffset;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "flow", "I", "getFlow", "getFlow$annotations", "()V", "Landroidx/health/connect/client/records/metadata/Metadata;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;ILandroidx/health/connect/client/records/metadata/Metadata;)V", "Companion", "connect-client_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenstruationFlowRecord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenstruationFlowRecord.kt\nandroidx/health/connect/client/records/MenstruationFlowRecord\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1208#2,2:80\n1238#2,4:82\n*S KotlinDebug\n*F\n+ 1 MenstruationFlowRecord.kt\nandroidx/health/connect/client/records/MenstruationFlowRecord\n*L\n69#1:80,2\n69#1:82,4\n*E\n"})
public final class MenstruationFlowRecord implements InstantaneousRecord {
    public static final int FLOW_HEAVY = 3;
    public static final int FLOW_LIGHT = 1;
    public static final int FLOW_MEDIUM = 2;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<Integer, String> FLOW_TYPE_INT_TO_STRING_MAP;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<String, Integer> FLOW_TYPE_STRING_TO_INT_MAP;
    public static final int FLOW_UNKNOWN = 0;
    private final int flow;

    @NotNull
    private final androidx.health.connect.client.records.metadata.Metadata metadata;

    @NotNull
    private final Instant time;

    @Nullable
    private final ZoneOffset zoneOffset;

    static {
        Map<String, Integer> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("light", 1), TuplesKt.to(CervicalMucusRecord.Sensation.MEDIUM, 2), TuplesKt.to(CervicalMucusRecord.Sensation.HEAVY, 3));
        FLOW_TYPE_STRING_TO_INT_MAP = mapMapOf;
        Set<Map.Entry<String, Integer>> setEntrySet = mapMapOf.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        FLOW_TYPE_INT_TO_STRING_MAP = linkedHashMap;
    }

    public MenstruationFlowRecord(@NotNull Instant time, @Nullable ZoneOffset zoneOffset, int i, @NotNull androidx.health.connect.client.records.metadata.Metadata metadata) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.time = time;
        this.zoneOffset = zoneOffset;
        this.flow = i;
        this.metadata = metadata;
    }

    public static /* synthetic */ void getFlow$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationFlowRecord)) {
            return false;
        }
        MenstruationFlowRecord menstruationFlowRecord = (MenstruationFlowRecord) other;
        return this.flow == menstruationFlowRecord.flow && Intrinsics.areEqual(getTime(), menstruationFlowRecord.getTime()) && Intrinsics.areEqual(getZoneOffset(), menstruationFlowRecord.getZoneOffset()) && Intrinsics.areEqual(getMetadata(), menstruationFlowRecord.getMetadata());
    }

    public final int getFlow() {
        return this.flow;
    }

    @Override // androidx.health.connect.client.records.Record
    @NotNull
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    @NotNull
    public Instant getTime() {
        return this.time;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    @Nullable
    public ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        int iHashCode = ((this.flow * 31) + getTime().hashCode()) * 31;
        ZoneOffset zoneOffset = getZoneOffset();
        return ((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public /* synthetic */ MenstruationFlowRecord(Instant instant, ZoneOffset zoneOffset, int i, androidx.health.connect.client.records.metadata.Metadata metadata, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, zoneOffset, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? androidx.health.connect.client.records.metadata.Metadata.EMPTY : metadata);
    }
}
