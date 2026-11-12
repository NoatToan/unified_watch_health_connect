package androidx.health.connect.client.records;

import androidx.annotation.RestrictTo;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0002 !B-\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Landroidx/health/connect/client/records/SexualActivityRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/time/Instant;", "time", "Ljava/time/Instant;", "getTime", "()Ljava/time/Instant;", "Ljava/time/ZoneOffset;", CloudContract.COL_ZONE_OFFSET, "Ljava/time/ZoneOffset;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "protectionUsed", "I", "getProtectionUsed", "getProtectionUsed$annotations", "()V", "Landroidx/health/connect/client/records/metadata/Metadata;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;ILandroidx/health/connect/client/records/metadata/Metadata;)V", "Companion", "Protection", "connect-client_release"}, k = 1, mv = {1, 8, 0})
public final class SexualActivityRecord implements InstantaneousRecord {

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<Integer, String> PROTECTION_USED_INT_TO_STRING_MAP;
    public static final int PROTECTION_USED_PROTECTED = 1;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<String, Integer> PROTECTION_USED_STRING_TO_INT_MAP;
    public static final int PROTECTION_USED_UNKNOWN = 0;
    public static final int PROTECTION_USED_UNPROTECTED = 2;

    @NotNull
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final int protectionUsed;

    @NotNull
    private final Instant time;

    @Nullable
    private final ZoneOffset zoneOffset;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/health/connect/client/records/SexualActivityRecord$Protection;", "", "()V", "PROTECTED", "", "UNPROTECTED", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Protection {

        @NotNull
        public static final Protection INSTANCE = new Protection();

        @NotNull
        public static final String PROTECTED = "protected";

        @NotNull
        public static final String UNPROTECTED = "unprotected";

        private Protection() {
        }
    }

    static {
        Map<String, Integer> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(Protection.PROTECTED, 1), TuplesKt.to(Protection.UNPROTECTED, 2));
        PROTECTION_USED_STRING_TO_INT_MAP = mapMapOf;
        PROTECTION_USED_INT_TO_STRING_MAP = UtilsKt.reverse(mapMapOf);
    }

    public SexualActivityRecord(@NotNull Instant time, @Nullable ZoneOffset zoneOffset, int i, @NotNull androidx.health.connect.client.records.metadata.Metadata metadata) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.time = time;
        this.zoneOffset = zoneOffset;
        this.protectionUsed = i;
        this.metadata = metadata;
    }

    public static /* synthetic */ void getProtectionUsed$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SexualActivityRecord)) {
            return false;
        }
        SexualActivityRecord sexualActivityRecord = (SexualActivityRecord) other;
        return this.protectionUsed == sexualActivityRecord.protectionUsed && Intrinsics.areEqual(getTime(), sexualActivityRecord.getTime()) && Intrinsics.areEqual(getZoneOffset(), sexualActivityRecord.getZoneOffset()) && Intrinsics.areEqual(getMetadata(), sexualActivityRecord.getMetadata());
    }

    @Override // androidx.health.connect.client.records.Record
    @NotNull
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public final int getProtectionUsed() {
        return this.protectionUsed;
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
        int iHashCode = ((this.protectionUsed * 31) + getTime().hashCode()) * 31;
        ZoneOffset zoneOffset = getZoneOffset();
        return ((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public /* synthetic */ SexualActivityRecord(Instant instant, ZoneOffset zoneOffset, int i, androidx.health.connect.client.records.metadata.Metadata metadata, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, zoneOffset, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? androidx.health.connect.client.records.metadata.Metadata.EMPTY : metadata);
    }
}
