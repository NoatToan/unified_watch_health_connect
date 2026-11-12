package com.xiaomi.fitness.sport_xms.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0019HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/SensorData;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "timestamp", "", "x", "", "y", "z", "<init>", "(JFFF)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getX", "()F", "getY", "getZ", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SensorData implements Parcelable, Serializable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private long timestamp;
    private final float x;
    private final float y;
    private final float z;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_xms.data.SensorData$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/SensorData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/sport_xms/data/SensorData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/sport_xms/data/SensorData;", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SensorData> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SensorData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SensorData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SensorData[] newArray(int size) {
            return new SensorData[size];
        }
    }

    public SensorData(long j, float f, float f2, float f3) {
        this.timestamp = j;
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public static /* synthetic */ SensorData copy$default(SensorData sensorData, long j, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sensorData.timestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = sensorData.x;
        }
        float f4 = f;
        if ((i & 4) != 0) {
            f2 = sensorData.y;
        }
        float f5 = f2;
        if ((i & 8) != 0) {
            f3 = sensorData.z;
        }
        return sensorData.copy(j2, f4, f5, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getZ() {
        return this.z;
    }

    @NotNull
    public final SensorData copy(long timestamp, float x, float y, float z) {
        return new SensorData(timestamp, x, y, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorData)) {
            return false;
        }
        SensorData sensorData = (SensorData) other;
        return this.timestamp == sensorData.timestamp && Float.compare(this.x, sensorData.x) == 0 && Float.compare(this.y, sensorData.y) == 0 && Float.compare(this.z, sensorData.z) == 0;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final float getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.timestamp) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z);
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    @NotNull
    public String toString() {
        return "SensorData(timestamp=" + this.timestamp + ", x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.timestamp);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SensorData(@NotNull Parcel parcel) {
        this(parcel.readLong(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
