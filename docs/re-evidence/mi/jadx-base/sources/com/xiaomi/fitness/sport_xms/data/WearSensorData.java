package com.xiaomi.fitness.sport_xms.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B+\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J-\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0018HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/WearSensorData;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "accel", "", "Lcom/xiaomi/fitness/sport_xms/data/SensorData;", "gyro", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAccel", "()Ljava/util/List;", "setAccel", "(Ljava/util/List;)V", "getGyro", "setGyro", "write", "", "output", "Ljava/io/ObjectOutputStream;", "writeToParcel", "flags", "", "describeContents", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WearSensorData implements Parcelable, Serializable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<SensorData> accel;

    @Nullable
    private List<SensorData> gyro;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_xms.data.WearSensorData$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/WearSensorData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/sport_xms/data/WearSensorData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/sport_xms/data/WearSensorData;", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<WearSensorData> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WearSensorData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WearSensorData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WearSensorData[] newArray(int size) {
            return new WearSensorData[size];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WearSensorData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WearSensorData copy$default(WearSensorData wearSensorData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wearSensorData.accel;
        }
        if ((i & 2) != 0) {
            list2 = wearSensorData.gyro;
        }
        return wearSensorData.copy(list, list2);
    }

    @Nullable
    public final List<SensorData> component1() {
        return this.accel;
    }

    @Nullable
    public final List<SensorData> component2() {
        return this.gyro;
    }

    @NotNull
    public final WearSensorData copy(@Nullable List<SensorData> accel, @Nullable List<SensorData> gyro) {
        return new WearSensorData(accel, gyro);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WearSensorData)) {
            return false;
        }
        WearSensorData wearSensorData = (WearSensorData) other;
        return Intrinsics.areEqual(this.accel, wearSensorData.accel) && Intrinsics.areEqual(this.gyro, wearSensorData.gyro);
    }

    @Nullable
    public final List<SensorData> getAccel() {
        return this.accel;
    }

    @Nullable
    public final List<SensorData> getGyro() {
        return this.gyro;
    }

    public int hashCode() {
        List<SensorData> list = this.accel;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SensorData> list2 = this.gyro;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setAccel(@Nullable List<SensorData> list) {
        this.accel = list;
    }

    public final void setGyro(@Nullable List<SensorData> list) {
        this.gyro = list;
    }

    @NotNull
    public String toString() {
        return "WearSensorData(accel=" + this.accel + ", gyro=" + this.gyro + ")";
    }

    public final void write(@NotNull ObjectOutputStream output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeObject(this.accel);
        output.writeObject(this.gyro);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(this.accel);
        parcel.writeTypedList(this.gyro);
    }

    public WearSensorData(@Nullable List<SensorData> list, @Nullable List<SensorData> list2) {
        this.accel = list;
        this.gyro = list2;
    }

    public /* synthetic */ WearSensorData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WearSensorData(@NotNull Parcel parcel) {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        SensorData.Companion companion = SensorData.INSTANCE;
        this.accel = parcel.createTypedArrayList(companion);
        this.gyro = parcel.createTypedArrayList(companion);
    }
}
