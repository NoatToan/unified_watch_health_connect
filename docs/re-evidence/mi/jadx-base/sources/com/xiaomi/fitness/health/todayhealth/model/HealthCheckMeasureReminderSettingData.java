package com.xiaomi.fitness.health.todayhealth.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckMeasureReminderSettingData;", "Landroid/os/Parcelable;", "repeat", "", "dayRemindCount", "remindTimes", "", "<init>", "(II[I)V", "getRepeat", "()I", "setRepeat", "(I)V", "getDayRemindCount", "setDayRemindCount", "getRemindTimes", "()[I", "setRemindTimes", "([I)V", "equals", "", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "", "hashCode", "component1", "component2", "component3", "copy", "describeContents", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HealthCheckMeasureReminderSettingData implements Parcelable {

    @SerializedName("dayRemindCount")
    private int dayRemindCount;

    @SerializedName("remindTimes")
    @NotNull
    private int[] remindTimes;

    @SerializedName("repeat")
    private int repeat;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<HealthCheckMeasureReminderSettingData> CREATOR = new Creator();

    @NotNull
    private static final HealthCheckMeasureReminderSettingData EMPTY = new HealthCheckMeasureReminderSettingData(0, 0, null, 7, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckMeasureReminderSettingData$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckMeasureReminderSettingData;", "empty", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HealthCheckMeasureReminderSettingData empty() {
            return HealthCheckMeasureReminderSettingData.EMPTY;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HealthCheckMeasureReminderSettingData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthCheckMeasureReminderSettingData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HealthCheckMeasureReminderSettingData(parcel.readInt(), parcel.readInt(), parcel.createIntArray());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthCheckMeasureReminderSettingData[] newArray(int i) {
            return new HealthCheckMeasureReminderSettingData[i];
        }
    }

    public HealthCheckMeasureReminderSettingData() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ HealthCheckMeasureReminderSettingData copy$default(HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData, int i, int i2, int[] iArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = healthCheckMeasureReminderSettingData.repeat;
        }
        if ((i3 & 2) != 0) {
            i2 = healthCheckMeasureReminderSettingData.dayRemindCount;
        }
        if ((i3 & 4) != 0) {
            iArr = healthCheckMeasureReminderSettingData.remindTimes;
        }
        return healthCheckMeasureReminderSettingData.copy(i, i2, iArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRepeat() {
        return this.repeat;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDayRemindCount() {
        return this.dayRemindCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int[] getRemindTimes() {
        return this.remindTimes;
    }

    @NotNull
    public final HealthCheckMeasureReminderSettingData copy(int repeat, int dayRemindCount, @NotNull int[] remindTimes) {
        Intrinsics.checkNotNullParameter(remindTimes, "remindTimes");
        return new HealthCheckMeasureReminderSettingData(repeat, dayRemindCount, remindTimes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !Intrinsics.areEqual(HealthCheckMeasureReminderSettingData.class, o.getClass())) {
            return false;
        }
        HealthCheckMeasureReminderSettingData healthCheckMeasureReminderSettingData = (HealthCheckMeasureReminderSettingData) o;
        return this.dayRemindCount == healthCheckMeasureReminderSettingData.dayRemindCount && this.repeat == healthCheckMeasureReminderSettingData.repeat && Arrays.equals(this.remindTimes, healthCheckMeasureReminderSettingData.remindTimes);
    }

    public final int getDayRemindCount() {
        return this.dayRemindCount;
    }

    @NotNull
    public final int[] getRemindTimes() {
        return this.remindTimes;
    }

    public final int getRepeat() {
        return this.repeat;
    }

    public int hashCode() {
        return (Objects.hash(Integer.valueOf(this.repeat), Integer.valueOf(this.dayRemindCount)) * 31) + Arrays.hashCode(this.remindTimes);
    }

    public final void setDayRemindCount(int i) {
        this.dayRemindCount = i;
    }

    public final void setRemindTimes(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.remindTimes = iArr;
    }

    public final void setRepeat(int i) {
        this.repeat = i;
    }

    @NotNull
    public String toString() {
        return "HealthCheckMeasureReminderSettingData(repeat=" + this.repeat + ", dayRemindCount=" + this.dayRemindCount + ", remindTimes=" + Arrays.toString(this.remindTimes) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.repeat);
        dest.writeInt(this.dayRemindCount);
        dest.writeIntArray(this.remindTimes);
    }

    public HealthCheckMeasureReminderSettingData(int i, int i2, @NotNull int[] remindTimes) {
        Intrinsics.checkNotNullParameter(remindTimes, "remindTimes");
        this.repeat = i;
        this.dayRemindCount = i2;
        this.remindTimes = remindTimes;
    }

    public /* synthetic */ HealthCheckMeasureReminderSettingData(int i, int i2, int[] iArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new int[0] : iArr);
    }
}
