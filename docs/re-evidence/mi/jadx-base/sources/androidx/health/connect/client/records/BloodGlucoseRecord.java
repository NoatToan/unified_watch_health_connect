package androidx.health.connect.client.records;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.units.BloodGlucose;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.wearable.hm.ChangeListenerImpl;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 +2\u00020\u0001:\u0003+,-BI\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u0007\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010*J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\tR\u001d\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\tR\u001d\u0010!\u001a\u00020\u00078\u0006¢\u0006\u0012\n\u0004\b!\u0010\u001a\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\tR\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006."}, d2 = {"Landroidx/health/connect/client/records/BloodGlucoseRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/time/Instant;", "time", "Ljava/time/Instant;", "getTime", "()Ljava/time/Instant;", "Ljava/time/ZoneOffset;", CloudContract.COL_ZONE_OFFSET, "Ljava/time/ZoneOffset;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "Landroidx/health/connect/client/units/BloodGlucose;", "level", "Landroidx/health/connect/client/units/BloodGlucose;", "getLevel", "()Landroidx/health/connect/client/units/BloodGlucose;", "specimenSource", "I", "getSpecimenSource", "getSpecimenSource$annotations", "()V", "mealType", "getMealType", "getMealType$annotations", "relationToMeal", "getRelationToMeal", "getRelationToMeal$annotations", "Landroidx/health/connect/client/records/metadata/Metadata;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/units/BloodGlucose;IIILandroidx/health/connect/client/records/metadata/Metadata;)V", "Companion", "RelationToMeal", "SpecimenSource", "connect-client_release"}, k = 1, mv = {1, 8, 0})
public final class BloodGlucoseRecord implements InstantaneousRecord {

    @NotNull
    private static final BloodGlucose MAX_BLOOD_GLUCOSE_LEVEL = BloodGlucose.INSTANCE.millimolesPerLiter(50.0d);
    public static final int RELATION_TO_MEAL_AFTER_MEAL = 4;
    public static final int RELATION_TO_MEAL_BEFORE_MEAL = 3;
    public static final int RELATION_TO_MEAL_FASTING = 2;
    public static final int RELATION_TO_MEAL_GENERAL = 1;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<Integer, String> RELATION_TO_MEAL_INT_TO_STRING_MAP;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<String, Integer> RELATION_TO_MEAL_STRING_TO_INT_MAP;
    public static final int RELATION_TO_MEAL_UNKNOWN = 0;
    public static final int SPECIMEN_SOURCE_CAPILLARY_BLOOD = 2;
    public static final int SPECIMEN_SOURCE_INTERSTITIAL_FLUID = 1;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<Integer, String> SPECIMEN_SOURCE_INT_TO_STRING_MAP;
    public static final int SPECIMEN_SOURCE_PLASMA = 3;
    public static final int SPECIMEN_SOURCE_SERUM = 4;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Map<String, Integer> SPECIMEN_SOURCE_STRING_TO_INT_MAP;
    public static final int SPECIMEN_SOURCE_TEARS = 5;
    public static final int SPECIMEN_SOURCE_UNKNOWN = 0;
    public static final int SPECIMEN_SOURCE_WHOLE_BLOOD = 6;

    @NotNull
    private final BloodGlucose level;
    private final int mealType;

    @NotNull
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final int relationToMeal;
    private final int specimenSource;

    @NotNull
    private final Instant time;

    @Nullable
    private final ZoneOffset zoneOffset;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/health/connect/client/records/BloodGlucoseRecord$RelationToMeal;", "", "()V", "AFTER_MEAL", "", "BEFORE_MEAL", "FASTING", ChangeListenerImpl.SETTING_GROUP_TYPE_GENERAL, "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RelationToMeal {

        @NotNull
        public static final String AFTER_MEAL = "after_meal";

        @NotNull
        public static final String BEFORE_MEAL = "before_meal";

        @NotNull
        public static final String FASTING = "fasting";

        @NotNull
        public static final String GENERAL = "general";

        @NotNull
        public static final RelationToMeal INSTANCE = new RelationToMeal();

        private RelationToMeal() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/health/connect/client/records/BloodGlucoseRecord$SpecimenSource;", "", "()V", "CAPILLARY_BLOOD", "", "INTERSTITIAL_FLUID", "PLASMA", "SERUM", "TEARS", "WHOLE_BLOOD", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SpecimenSource {

        @NotNull
        public static final String CAPILLARY_BLOOD = "capillary_blood";

        @NotNull
        public static final SpecimenSource INSTANCE = new SpecimenSource();

        @NotNull
        public static final String INTERSTITIAL_FLUID = "interstitial_fluid";

        @NotNull
        public static final String PLASMA = "plasma";

        @NotNull
        public static final String SERUM = "serum";

        @NotNull
        public static final String TEARS = "tears";

        @NotNull
        public static final String WHOLE_BLOOD = "whole_blood";

        private SpecimenSource() {
        }
    }

    static {
        Map<String, Integer> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("general", 1), TuplesKt.to(RelationToMeal.AFTER_MEAL, 4), TuplesKt.to(RelationToMeal.FASTING, 2), TuplesKt.to(RelationToMeal.BEFORE_MEAL, 3));
        RELATION_TO_MEAL_STRING_TO_INT_MAP = mapMapOf;
        RELATION_TO_MEAL_INT_TO_STRING_MAP = UtilsKt.reverse(mapMapOf);
        Map<String, Integer> mapMapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.to(SpecimenSource.INTERSTITIAL_FLUID, 1), TuplesKt.to(SpecimenSource.CAPILLARY_BLOOD, 2), TuplesKt.to(SpecimenSource.PLASMA, 3), TuplesKt.to(SpecimenSource.TEARS, 5), TuplesKt.to(SpecimenSource.WHOLE_BLOOD, 6), TuplesKt.to(SpecimenSource.SERUM, 4));
        SPECIMEN_SOURCE_STRING_TO_INT_MAP = mapMapOf2;
        SPECIMEN_SOURCE_INT_TO_STRING_MAP = UtilsKt.reverse(mapMapOf2);
    }

    public BloodGlucoseRecord(@NotNull Instant time, @Nullable ZoneOffset zoneOffset, @NotNull BloodGlucose level, int i, int i2, int i3, @NotNull androidx.health.connect.client.records.metadata.Metadata metadata) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.time = time;
        this.zoneOffset = zoneOffset;
        this.level = level;
        this.specimenSource = i;
        this.mealType = i2;
        this.relationToMeal = i3;
        this.metadata = metadata;
        UtilsKt.requireNotLess(level, level.zero$connect_client_release(), "level");
        UtilsKt.requireNotMore(level, MAX_BLOOD_GLUCOSE_LEVEL, "level");
    }

    public static /* synthetic */ void getMealType$annotations() {
    }

    public static /* synthetic */ void getRelationToMeal$annotations() {
    }

    public static /* synthetic */ void getSpecimenSource$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BloodGlucoseRecord.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.health.connect.client.records.BloodGlucoseRecord");
        BloodGlucoseRecord bloodGlucoseRecord = (BloodGlucoseRecord) other;
        return Intrinsics.areEqual(getTime(), bloodGlucoseRecord.getTime()) && Intrinsics.areEqual(getZoneOffset(), bloodGlucoseRecord.getZoneOffset()) && Intrinsics.areEqual(this.level, bloodGlucoseRecord.level) && this.specimenSource == bloodGlucoseRecord.specimenSource && this.mealType == bloodGlucoseRecord.mealType && this.relationToMeal == bloodGlucoseRecord.relationToMeal && Intrinsics.areEqual(getMetadata(), bloodGlucoseRecord.getMetadata());
    }

    @NotNull
    public final BloodGlucose getLevel() {
        return this.level;
    }

    public final int getMealType() {
        return this.mealType;
    }

    @Override // androidx.health.connect.client.records.Record
    @NotNull
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public final int getRelationToMeal() {
        return this.relationToMeal;
    }

    public final int getSpecimenSource() {
        return this.specimenSource;
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
        return ((((((((((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + this.level.hashCode()) * 31) + this.specimenSource) * 31) + this.mealType) * 31) + this.relationToMeal) * 31) + getMetadata().hashCode();
    }

    public /* synthetic */ BloodGlucoseRecord(Instant instant, ZoneOffset zoneOffset, BloodGlucose bloodGlucose, int i, int i2, int i3, androidx.health.connect.client.records.metadata.Metadata metadata, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, zoneOffset, bloodGlucose, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? androidx.health.connect.client.records.metadata.Metadata.EMPTY : metadata);
    }
}
