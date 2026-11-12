package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.huami.nfc.web.Constant;
import com.huami.respiratoryrate.core.synctime.local.RespRateLocalSyncTime;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "FieldCreator")
@SafeParcelable.Reserved({1000})
public final class Field extends AbstractSafeParcelable {
    public static final int FORMAT_FLOAT = 2;
    public static final int FORMAT_INT32 = 1;
    public static final int FORMAT_MAP = 4;
    public static final int FORMAT_STRING = 3;
    public static final int MEAL_TYPE_BREAKFAST = 1;
    public static final int MEAL_TYPE_DINNER = 3;
    public static final int MEAL_TYPE_LUNCH = 2;
    public static final int MEAL_TYPE_SNACK = 4;
    public static final int MEAL_TYPE_UNKNOWN = 0;

    @RecentlyNonNull
    public static final String NUTRIENT_CALCIUM = "calcium";

    @RecentlyNonNull
    public static final String NUTRIENT_CHOLESTEROL = "cholesterol";

    @RecentlyNonNull
    public static final String NUTRIENT_DIETARY_FIBER = "dietary_fiber";

    @RecentlyNonNull
    public static final String NUTRIENT_IRON = "iron";

    @RecentlyNonNull
    public static final String NUTRIENT_MONOUNSATURATED_FAT = "fat.monounsaturated";

    @RecentlyNonNull
    public static final String NUTRIENT_POLYUNSATURATED_FAT = "fat.polyunsaturated";

    @RecentlyNonNull
    public static final String NUTRIENT_POTASSIUM = "potassium";

    @RecentlyNonNull
    public static final String NUTRIENT_PROTEIN = "protein";

    @RecentlyNonNull
    public static final String NUTRIENT_SATURATED_FAT = "fat.saturated";

    @RecentlyNonNull
    public static final String NUTRIENT_SODIUM = "sodium";

    @RecentlyNonNull
    public static final String NUTRIENT_SUGAR = "sugar";

    @RecentlyNonNull
    public static final String NUTRIENT_TOTAL_CARBS = "carbs.total";

    @RecentlyNonNull
    public static final String NUTRIENT_TOTAL_FAT = "fat.total";

    @RecentlyNonNull
    public static final String NUTRIENT_TRANS_FAT = "fat.trans";

    @RecentlyNonNull
    public static final String NUTRIENT_UNSATURATED_FAT = "fat.unsaturated";

    @RecentlyNonNull
    public static final String NUTRIENT_VITAMIN_A = "vitamin_a";

    @RecentlyNonNull
    public static final String NUTRIENT_VITAMIN_C = "vitamin_c";
    public static final int RESISTANCE_TYPE_BARBELL = 1;
    public static final int RESISTANCE_TYPE_BODY = 6;
    public static final int RESISTANCE_TYPE_CABLE = 2;
    public static final int RESISTANCE_TYPE_DUMBBELL = 3;
    public static final int RESISTANCE_TYPE_KETTLEBELL = 4;
    public static final int RESISTANCE_TYPE_MACHINE = 5;
    public static final int RESISTANCE_TYPE_UNKNOWN = 0;

    @SafeParcelable.Field(getter = "getName", id = 1)
    private final String a;

    @SafeParcelable.Field(getter = "getFormat", id = 2)
    private final int b;

    @Nullable
    @SafeParcelable.Field(getter = "isOptional", id = 3)
    private final Boolean c;

    @RecentlyNonNull
    public static final Parcelable.Creator<Field> CREATOR = new zzr();

    @RecentlyNonNull
    public static final Field FIELD_ACTIVITY = a("activity");

    @RecentlyNonNull
    public static final Field FIELD_SLEEP_SEGMENT_TYPE = a("sleep_segment_type");

    @RecentlyNonNull
    public static final Field FIELD_CONFIDENCE = zze("confidence");

    @RecentlyNonNull
    public static final Field FIELD_STEPS = a(GetWatermarkAPI.KEY_NAME_STEPS);

    @RecentlyNonNull
    @Deprecated
    public static final Field FIELD_STEP_LENGTH = zze("step_length");

    @RecentlyNonNull
    public static final Field FIELD_DURATION = a("duration");

    @RecentlyNonNull
    @ShowFirstParty
    public static final Field zzmz = zzd("duration");

    @ShowFirstParty
    private static final Field d = c("activity_duration.ascending");

    @ShowFirstParty
    private static final Field e = c("activity_duration.descending");

    @RecentlyNonNull
    public static final Field FIELD_BPM = zze("bpm");

    @RecentlyNonNull
    @ShowFirstParty
    public static final Field zznc = zze(RespRateLocalSyncTime.KV_NAME);

    @RecentlyNonNull
    public static final Field FIELD_LATITUDE = zze(Constant.KEY_LATITUDE);

    @RecentlyNonNull
    public static final Field FIELD_LONGITUDE = zze(Constant.KEY_LONGITUDE);

    @RecentlyNonNull
    public static final Field FIELD_ACCURACY = zze("accuracy");

    @RecentlyNonNull
    public static final Field FIELD_ALTITUDE = b("altitude");

    @RecentlyNonNull
    public static final Field FIELD_DISTANCE = zze("distance");

    @RecentlyNonNull
    public static final Field FIELD_HEIGHT = zze("height");

    @RecentlyNonNull
    public static final Field FIELD_WEIGHT = zze("weight");

    @RecentlyNonNull
    public static final Field FIELD_PERCENTAGE = zze("percentage");

    @RecentlyNonNull
    public static final Field FIELD_SPEED = zze("speed");

    @RecentlyNonNull
    public static final Field FIELD_RPM = zze("rpm");

    @RecentlyNonNull
    @ShowFirstParty
    public static final Field zznd = d("google.android.fitness.GoalV2");

    @RecentlyNonNull
    @ShowFirstParty
    public static final Field zzne = d("google.android.fitness.Device");

    @RecentlyNonNull
    public static final Field FIELD_REVOLUTIONS = a("revolutions");

    @RecentlyNonNull
    public static final String NUTRIENT_CALORIES = "calories";

    @RecentlyNonNull
    public static final Field FIELD_CALORIES = zze(NUTRIENT_CALORIES);

    @RecentlyNonNull
    public static final Field FIELD_WATTS = zze("watts");

    @RecentlyNonNull
    public static final Field FIELD_VOLUME = zze("volume");

    @RecentlyNonNull
    public static final Field FIELD_MEAL_TYPE = zzd("meal_type");

    @RecentlyNonNull
    public static final Field FIELD_FOOD_ITEM = new Field("food_item", 3, Boolean.TRUE);

    @RecentlyNonNull
    public static final Field FIELD_NUTRIENTS = c("nutrients");

    @RecentlyNonNull
    public static final Field FIELD_EXERCISE = new Field("exercise", 3);

    @RecentlyNonNull
    public static final Field FIELD_REPETITIONS = zzd("repetitions");

    @RecentlyNonNull
    public static final Field FIELD_RESISTANCE = b("resistance");

    @RecentlyNonNull
    public static final Field FIELD_RESISTANCE_TYPE = zzd("resistance_type");

    @RecentlyNonNull
    public static final Field FIELD_NUM_SEGMENTS = a("num_segments");

    @RecentlyNonNull
    public static final Field FIELD_AVERAGE = zze("average");

    @RecentlyNonNull
    public static final Field FIELD_MAX = zze("max");

    @RecentlyNonNull
    public static final Field FIELD_MIN = zze("min");

    @RecentlyNonNull
    public static final Field FIELD_LOW_LATITUDE = zze("low_latitude");

    @RecentlyNonNull
    public static final Field FIELD_LOW_LONGITUDE = zze("low_longitude");

    @RecentlyNonNull
    public static final Field FIELD_HIGH_LATITUDE = zze("high_latitude");

    @RecentlyNonNull
    public static final Field FIELD_HIGH_LONGITUDE = zze("high_longitude");

    @RecentlyNonNull
    public static final Field FIELD_OCCURRENCES = a("occurrences");

    @RecentlyNonNull
    @ShowFirstParty
    public static final Field zznf = a("sensor_type");

    @RecentlyNonNull
    @ShowFirstParty
    public static final Field zzng = new Field("timestamps", 5);

    @RecentlyNonNull
    @ShowFirstParty
    public static final Field zznh = new Field("sensor_values", 6);

    @RecentlyNonNull
    public static final Field FIELD_INTENSITY = zze("intensity");

    @RecentlyNonNull
    @ShowFirstParty
    public static final Field zzni = c("activity_confidence");

    @RecentlyNonNull
    @ShowFirstParty
    public static final Field zznj = zze("probability");

    @RecentlyNonNull
    @ShowFirstParty
    public static final Field zznk = d("google.android.fitness.SleepAttributes");

    @RecentlyNonNull
    @ShowFirstParty
    public static final Field zznl = d("google.android.fitness.SleepSchedule");

    @RecentlyNonNull
    @Deprecated
    public static final Field FIELD_CIRCUMFERENCE = zze("circumference");

    @ShowFirstParty
    public Field(@RecentlyNonNull String str, int i) {
        this(str, i, null);
    }

    @ShowFirstParty
    private static Field a(String str) {
        return new Field(str, 1);
    }

    @ShowFirstParty
    private static Field b(String str) {
        return new Field(str, 2, Boolean.TRUE);
    }

    @ShowFirstParty
    private static Field c(String str) {
        return new Field(str, 4);
    }

    @ShowFirstParty
    private static Field d(String str) {
        return new Field(str, 7);
    }

    @RecentlyNonNull
    @ShowFirstParty
    public static Field zzd(@RecentlyNonNull String str) {
        return new Field(str, 1, Boolean.TRUE);
    }

    @RecentlyNonNull
    @ShowFirstParty
    public static Field zze(@RecentlyNonNull String str) {
        return new Field(str, 2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Field)) {
            return false;
        }
        Field field = (Field) obj;
        return this.a.equals(field.a) && this.b == field.b;
    }

    public final int getFormat() {
        return this.b;
    }

    @RecentlyNonNull
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @RecentlyNullable
    public final Boolean isOptional() {
        return this.c;
    }

    @RecentlyNonNull
    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.a;
        objArr[1] = this.b == 1 ? "i" : "f";
        return String.format("%s(%s)", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, getFormat());
        SafeParcelWriter.writeBooleanObject(parcel, 3, isOptional(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public Field(@RecentlyNonNull @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @Nullable @SafeParcelable.Param(id = 3) Boolean bool) {
        this.a = (String) Preconditions.checkNotNull(str);
        this.b = i;
        this.c = bool;
    }
}
