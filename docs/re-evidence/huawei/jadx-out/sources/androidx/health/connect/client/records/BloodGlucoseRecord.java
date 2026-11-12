package androidx.health.connect.client.records;

import androidx.health.connect.client.units.BloodGlucose;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0005'()*+BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u000bH\u0016J\b\u0010%\u001a\u00020&H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u000b¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\r\u001a\u00020\u000b¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006,"}, d2 = {"Landroidx/health/connect/client/records/BloodGlucoseRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "level", "Landroidx/health/connect/client/units/BloodGlucose;", "specimenSource", "", "mealType", "relationToMeal", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;Landroidx/health/connect/client/units/BloodGlucose;III)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getLevel", "()Landroidx/health/connect/client/units/BloodGlucose;", "getSpecimenSource$annotations", "()V", "getSpecimenSource", "()I", "getMealType$annotations", "getMealType", "getRelationToMeal$annotations", "getRelationToMeal", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "SpecimenSource", "RelationToMeal", "Companion", "SpecimenSources", "RelationToMeals", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodGlucoseRecord implements InstantaneousRecord {
    private static final BloodGlucose MAX_BLOOD_GLUCOSE_LEVEL = BloodGlucose.INSTANCE.millimolesPerLiter(50.0d);
    public static final int RELATION_TO_MEAL_AFTER_MEAL = 4;
    public static final int RELATION_TO_MEAL_BEFORE_MEAL = 3;
    public static final int RELATION_TO_MEAL_FASTING = 2;
    public static final int RELATION_TO_MEAL_GENERAL = 1;
    public static final Map<Integer, String> RELATION_TO_MEAL_INT_TO_STRING_MAP;
    public static final Map<String, Integer> RELATION_TO_MEAL_STRING_TO_INT_MAP;
    public static final int RELATION_TO_MEAL_UNKNOWN = 0;
    public static final int SPECIMEN_SOURCE_CAPILLARY_BLOOD = 2;
    public static final int SPECIMEN_SOURCE_INTERSTITIAL_FLUID = 1;
    public static final Map<Integer, String> SPECIMEN_SOURCE_INT_TO_STRING_MAP;
    public static final int SPECIMEN_SOURCE_PLASMA = 3;
    public static final int SPECIMEN_SOURCE_SERUM = 4;
    public static final Map<String, Integer> SPECIMEN_SOURCE_STRING_TO_INT_MAP;
    public static final int SPECIMEN_SOURCE_TEARS = 5;
    public static final int SPECIMEN_SOURCE_UNKNOWN = 0;
    public static final int SPECIMEN_SOURCE_WHOLE_BLOOD = 6;
    private final BloodGlucose level;
    private final int mealType;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final int relationToMeal;
    private final int specimenSource;
    private final Instant time;
    private final ZoneOffset zoneOffset;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/BloodGlucoseRecord$RelationToMeals;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface RelationToMeals {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/BloodGlucoseRecord$SpecimenSources;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface SpecimenSources {
    }

    public static /* synthetic */ void getMealType$annotations() {
    }

    public static /* synthetic */ void getRelationToMeal$annotations() {
    }

    public static /* synthetic */ void getSpecimenSource$annotations() {
    }

    public BloodGlucoseRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, BloodGlucose bloodGlucose, int i, int i2, int i3) {
        zcp.c(instant, "");
        zcp.c(metadata, "");
        zcp.c(bloodGlucose, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.metadata = metadata;
        this.level = bloodGlucose;
        this.specimenSource = i;
        this.mealType = i2;
        this.relationToMeal = i3;
        BloodGlucose bloodGlucose2 = bloodGlucose;
        UtilsKt.requireNotLess(bloodGlucose2, bloodGlucose.zero$connect_client_release(), "level");
        UtilsKt.requireNotMore(bloodGlucose2, MAX_BLOOD_GLUCOSE_LEVEL, "level");
    }

    public /* synthetic */ BloodGlucoseRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, BloodGlucose bloodGlucose, int i, int i2, int i3, int i4, zcm zcmVar) {
        this(instant, zoneOffset, metadata, bloodGlucose, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3);
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public Instant getTime() {
        return this.time;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public final BloodGlucose getLevel() {
        return this.level;
    }

    public final int getSpecimenSource() {
        return this.specimenSource;
    }

    public final int getMealType() {
        return this.mealType;
    }

    public final int getRelationToMeal() {
        return this.relationToMeal;
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/health/connect/client/records/BloodGlucoseRecord$SpecimenSource;", "", "<init>", "()V", "INTERSTITIAL_FLUID", "", "CAPILLARY_BLOOD", "PLASMA", "SERUM", "TEARS", "WHOLE_BLOOD", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SpecimenSource {
        public static final String CAPILLARY_BLOOD = "capillary_blood";
        public static final SpecimenSource INSTANCE = new SpecimenSource();
        public static final String INTERSTITIAL_FLUID = "interstitial_fluid";
        public static final String PLASMA = "plasma";
        public static final String SERUM = "serum";
        public static final String TEARS = "tears";
        public static final String WHOLE_BLOOD = "whole_blood";

        private SpecimenSource() {
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/health/connect/client/records/BloodGlucoseRecord$RelationToMeal;", "", "<init>", "()V", "GENERAL", "", "FASTING", "BEFORE_MEAL", "AFTER_MEAL", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RelationToMeal {
        public static final String AFTER_MEAL = "after_meal";
        public static final String BEFORE_MEAL = "before_meal";
        public static final String FASTING = "fasting";
        public static final String GENERAL = "general";
        public static final RelationToMeal INSTANCE = new RelationToMeal();

        private RelationToMeal() {
        }
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c(RelationToMeal.GENERAL, 1), yyz.c(RelationToMeal.AFTER_MEAL, 4), yyz.c(RelationToMeal.FASTING, 2), yyz.c(RelationToMeal.BEFORE_MEAL, 3));
        RELATION_TO_MEAL_STRING_TO_INT_MAP = mapE;
        RELATION_TO_MEAL_INT_TO_STRING_MAP = UtilsKt.reverse(mapE);
        Map<String, Integer> mapE2 = zae.e(yyz.c(SpecimenSource.INTERSTITIAL_FLUID, 1), yyz.c(SpecimenSource.CAPILLARY_BLOOD, 2), yyz.c(SpecimenSource.PLASMA, 3), yyz.c(SpecimenSource.TEARS, 5), yyz.c(SpecimenSource.WHOLE_BLOOD, 6), yyz.c(SpecimenSource.SERUM, 4));
        SPECIMEN_SOURCE_STRING_TO_INT_MAP = mapE2;
        SPECIMEN_SOURCE_INT_TO_STRING_MAP = UtilsKt.reverse(mapE2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        BloodGlucoseRecord bloodGlucoseRecord = (BloodGlucoseRecord) other;
        return zcp.b(getTime(), bloodGlucoseRecord.getTime()) && zcp.b(getZoneOffset(), bloodGlucoseRecord.getZoneOffset()) && zcp.b(this.level, bloodGlucoseRecord.level) && this.specimenSource == bloodGlucoseRecord.specimenSource && this.mealType == bloodGlucoseRecord.mealType && this.relationToMeal == bloodGlucoseRecord.relationToMeal && zcp.b(getMetadata(), bloodGlucoseRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        int iHashCode2 = zoneOffset != null ? zoneOffset.hashCode() : 0;
        int iHashCode3 = this.level.hashCode();
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + this.specimenSource) * 31) + this.mealType) * 31) + this.relationToMeal) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "BloodGlucoseRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", level=" + this.level + ", specimenSource=" + this.specimenSource + ", mealType=" + this.mealType + ", relationToMeal=" + this.relationToMeal + ", metadata=" + getMetadata() + g4.l;
    }
}
