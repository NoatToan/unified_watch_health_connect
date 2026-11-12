package androidx.health.connect.client.records;

import androidx.annotation.RestrictTo;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.AppearanceModule;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0003$#%B7\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\tR\u001d\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Landroidx/health/connect/client/records/CervicalMucusRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/time/Instant;", "time", "Ljava/time/Instant;", "getTime", "()Ljava/time/Instant;", "Ljava/time/ZoneOffset;", CloudContract.COL_ZONE_OFFSET, "Ljava/time/ZoneOffset;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "appearance", "I", "getAppearance", "getAppearance$annotations", "()V", "sensation", "getSensation", "getSensation$annotations", "Landroidx/health/connect/client/records/metadata/Metadata;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;IILandroidx/health/connect/client/records/metadata/Metadata;)V", "Companion", AppearanceModule.NAME, "Sensation", "connect-client_release"}, k = 1, mv = {1, 8, 0})
public final class CervicalMucusRecord implements InstantaneousRecord {
    public static final int APPEARANCE_CREAMY = 3;
    public static final int APPEARANCE_DRY = 1;
    public static final int APPEARANCE_EGG_WHITE = 5;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<Integer, String> APPEARANCE_INT_TO_STRING_MAP;
    public static final int APPEARANCE_STICKY = 2;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<String, Integer> APPEARANCE_STRING_TO_INT_MAP;
    public static final int APPEARANCE_UNKNOWN = 0;
    public static final int APPEARANCE_UNUSUAL = 6;
    public static final int APPEARANCE_WATERY = 4;
    public static final int SENSATION_HEAVY = 3;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<Integer, String> SENSATION_INT_TO_STRING_MAP;
    public static final int SENSATION_LIGHT = 1;
    public static final int SENSATION_MEDIUM = 2;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<String, Integer> SENSATION_STRING_TO_INT_MAP;
    public static final int SENSATION_UNKNOWN = 0;
    private final int appearance;

    @NotNull
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final int sensation;

    @NotNull
    private final Instant time;

    @Nullable
    private final ZoneOffset zoneOffset;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/health/connect/client/records/CervicalMucusRecord$Appearance;", "", "()V", "CLEAR", "", "CREAMY", "DRY", "STICKY", "UNUSUAL", "WATERY", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Appearance {

        @NotNull
        public static final String CLEAR = "clear";

        @NotNull
        public static final String CREAMY = "creamy";

        @NotNull
        public static final String DRY = "dry";

        @NotNull
        public static final Appearance INSTANCE = new Appearance();

        @NotNull
        public static final String STICKY = "sticky";

        @NotNull
        public static final String UNUSUAL = "unusual";

        @NotNull
        public static final String WATERY = "watery";

        private Appearance() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/health/connect/client/records/CervicalMucusRecord$Sensation;", "", "()V", "HEAVY", "", "LIGHT", "MEDIUM", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Sensation {

        @NotNull
        public static final String HEAVY = "heavy";

        @NotNull
        public static final Sensation INSTANCE = new Sensation();

        @NotNull
        public static final String LIGHT = "light";

        @NotNull
        public static final String MEDIUM = "medium";

        private Sensation() {
        }
    }

    static {
        Map<String, Integer> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(Appearance.CLEAR, 5), TuplesKt.to(Appearance.CREAMY, 3), TuplesKt.to(Appearance.DRY, 1), TuplesKt.to(Appearance.STICKY, 2), TuplesKt.to(Appearance.WATERY, 4), TuplesKt.to(Appearance.UNUSUAL, 6));
        APPEARANCE_STRING_TO_INT_MAP = mapMapOf;
        APPEARANCE_INT_TO_STRING_MAP = UtilsKt.reverse(mapMapOf);
        Map<String, Integer> mapMapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.to("light", 1), TuplesKt.to(Sensation.MEDIUM, 2), TuplesKt.to(Sensation.HEAVY, 3));
        SENSATION_STRING_TO_INT_MAP = mapMapOf2;
        SENSATION_INT_TO_STRING_MAP = UtilsKt.reverse(mapMapOf2);
    }

    public CervicalMucusRecord(@NotNull Instant time, @Nullable ZoneOffset zoneOffset, int i, int i2, @NotNull androidx.health.connect.client.records.metadata.Metadata metadata) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.time = time;
        this.zoneOffset = zoneOffset;
        this.appearance = i;
        this.sensation = i2;
        this.metadata = metadata;
    }

    public static /* synthetic */ void getAppearance$annotations() {
    }

    public static /* synthetic */ void getSensation$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(CervicalMucusRecord.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.health.connect.client.records.CervicalMucusRecord");
        CervicalMucusRecord cervicalMucusRecord = (CervicalMucusRecord) other;
        return Intrinsics.areEqual(getTime(), cervicalMucusRecord.getTime()) && Intrinsics.areEqual(getZoneOffset(), cervicalMucusRecord.getZoneOffset()) && this.appearance == cervicalMucusRecord.appearance && this.sensation == cervicalMucusRecord.sensation && Intrinsics.areEqual(getMetadata(), cervicalMucusRecord.getMetadata());
    }

    public final int getAppearance() {
        return this.appearance;
    }

    @Override // androidx.health.connect.client.records.Record
    @NotNull
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public final int getSensation() {
        return this.sensation;
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
        int iHashCode = getTime().hashCode() * 31;
        ZoneOffset zoneOffset = getZoneOffset();
        return ((((((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + this.appearance) * 31) + this.sensation) * 31) + getMetadata().hashCode();
    }

    public /* synthetic */ CervicalMucusRecord(Instant instant, ZoneOffset zoneOffset, int i, int i2, androidx.health.connect.client.records.metadata.Metadata metadata, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, zoneOffset, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? androidx.health.connect.client.records.metadata.Metadata.EMPTY : metadata);
    }
}
