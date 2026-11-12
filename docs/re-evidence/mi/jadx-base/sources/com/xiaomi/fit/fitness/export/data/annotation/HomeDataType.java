package com.xiaomi.fit.fitness.export.data.annotation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 .2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001.B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007J\b\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020)H\u0016j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006/"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "parcel", "Landroid/os/Parcel;", "(Ljava/lang/String;ILandroid/os/Parcel;)V", DeviceTypes.UNKNOWN, "RAINBOW", "STEP", "CALORIE", "VALID_STAND", "MH_STRENGTH", "SLEEP", "HR", "SPO2", "STRESS", "ENERGY", "WOMEN_HEALTH", "HEARING_HEALTH", "PAI", "WEIGHT", "VITALITY", "V02_MAX", "BLOOD_PRESSURE", "BP_MEDICAL", "SPORT_REPORT", "TRAINING_LOAD", "TEMPERATURE", "PK", "RUNNING_INDICATOR", "ECG_MEDICAL", "BLOOD_SUGAR", "PHYSICAL_STATUS", "LACTATE_THRESHOLD", "EXTRA_DATA", "TEMPERATURE_TREND", "TEMPERATURE_CHARACTER", "TODAY_HEALTH", "describeContents", "", "writeToParcel", "", "dest", "flags", "CREATOR", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum HomeDataType implements Parcelable {
    UNKNOWN,
    RAINBOW,
    STEP,
    CALORIE,
    VALID_STAND,
    MH_STRENGTH,
    SLEEP,
    HR,
    SPO2,
    STRESS,
    ENERGY,
    WOMEN_HEALTH,
    HEARING_HEALTH,
    PAI,
    WEIGHT,
    VITALITY,
    V02_MAX,
    BLOOD_PRESSURE,
    BP_MEDICAL,
    SPORT_REPORT,
    TRAINING_LOAD,
    TEMPERATURE,
    PK,
    RUNNING_INDICATOR,
    ECG_MEDICAL,
    BLOOD_SUGAR,
    PHYSICAL_STATUS,
    LACTATE_THRESHOLD,
    EXTRA_DATA,
    TEMPERATURE_TREND,
    TEMPERATURE_CHARACTER,
    TODAY_HEALTH;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.export.data.annotation.HomeDataType$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<HomeDataType> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public HomeDataType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return HomeDataType.values()[parcel.readInt()];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public HomeDataType[] newArray(int size) {
            return new HomeDataType[size];
        }
    }

    @NotNull
    public static EnumEntries<HomeDataType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(ordinal());
    }

    HomeDataType(Parcel parcel) {
        this();
    }
}
