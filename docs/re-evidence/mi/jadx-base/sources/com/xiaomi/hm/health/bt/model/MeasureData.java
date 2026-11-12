package com.xiaomi.hm.health.bt.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.zk;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001c\b\u0086\b\u0018\u0000 ?2\u00020\u0001:\u0001\u001eB[\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020$\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u00102\u001a\u00020\u001b\u0012\b\b\u0002\u00105\u001a\u00020\u0004\u0012\b\b\u0002\u0010:\u001a\u00020\u0011¢\u0006\u0004\b;\u0010<B\u0011\b\u0016\u0012\u0006\u0010=\u001a\u00020\u0007¢\u0006\u0004\b;\u0010>J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0014\u001a\u0004\b+\u0010\u0016R\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0014\u001a\u0004\b.\u0010\u0016R\u0017\u00102\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u0010\u001fR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0014\u001a\u0004\b4\u0010\u0016R\u0017\u0010:\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/MeasureData;", "Landroid/os/Parcelable;", "Lzk;", PluginDeviceInfo.FLOCALIZATIONS, "", PluginDeviceInfo.FBLUETOOTHPAIR, "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "", "toString", "hashCode", "", "other", "", "equals", DeviceTagInterface.CUSTOM_TAG_TYPE, "I", "getFlag", "()I", "flag", "u", PluginDeviceInfo.FICONON, "unit", "", "v", "J", PluginDeviceInfo.FDESC, "()J", "timestamp", Constants.DEVICE_TYPE_WEAR, PluginDeviceInfo.FMODEL, "impedance", "", "x", "F", PluginDeviceInfo.FICONOFF, "()F", "weight", "y", "getHeartRate", "heartRate", "z", "getPressure", "pressure", "A", "getFamilyId", "familyId", c.f13755a, "getSessionID", Constants.EXTRA_SESSION_ID, "C", "Z", PluginDeviceInfo.FICONOFFLINE, "()Z", "isOverLoad", "<init>", "(IIJIFIIJIZ)V", "source", "(Landroid/os/Parcel;)V", "D", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class MeasureData implements Parcelable {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    public final long familyId;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    public final int sessionID;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final boolean isOverLoad;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    public final int flag;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    public final int unit;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    public final long timestamp;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    public final int impedance;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
    public final float weight;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
    public final int heartRate;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
    public final int pressure;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<MeasureData> CREATOR = new a();

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/bt/model/MeasureData$a", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/hm/health/bt/model/MeasureData;", "Landroid/os/Parcel;", "source", PluginDeviceInfo.FMODEL, "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/hm/health/bt/model/MeasureData;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements Parcelable.Creator<MeasureData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MeasureData createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new MeasureData(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MeasureData[] newArray(int size) {
            return new MeasureData[size];
        }
    }

    public MeasureData(int i, int i2, long j, int i3, float f, int i4, int i5, long j2, int i6, boolean z) {
        this.flag = i;
        this.unit = i2;
        this.timestamp = j;
        this.impedance = i3;
        this.weight = f;
        this.heartRate = i4;
        this.pressure = i5;
        this.familyId = j2;
        this.sessionID = i6;
        this.isOverLoad = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getImpedance() {
        return this.impedance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsOverLoad() {
        return this.isOverLoad;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasureData)) {
            return false;
        }
        MeasureData measureData = (MeasureData) other;
        return this.flag == measureData.flag && this.unit == measureData.unit && this.timestamp == measureData.timestamp && this.impedance == measureData.impedance && Float.compare(this.weight, measureData.weight) == 0 && this.heartRate == measureData.heartRate && this.pressure == measureData.pressure && this.familyId == measureData.familyId && this.sessionID == measureData.sessionID && this.isOverLoad == measureData.isOverLoad;
    }

    public final int f() {
        return (this.flag & 1536) >> 9;
    }

    @NotNull
    public final zk g() {
        int i = this.flag;
        if ((32768 & i) > 0) {
            return zk.MEASURING_FINISHED;
        }
        if ((i & 64) > 0) {
            return zk.MEASURING_PRESSURE;
        }
        if ((i & 32) > 0) {
            return zk.MEASURING_HR;
        }
        if ((i & 16) > 0) {
            return zk.MEASURING_IMPEDANCE;
        }
        return (i & 8) > 0 ? zk.MEASURING_WEIGHT : zk.MEASURING_WEIGHT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((Integer.hashCode(this.flag) * 31) + Integer.hashCode(this.unit)) * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.impedance)) * 31) + Float.hashCode(this.weight)) * 31) + Integer.hashCode(this.heartRate)) * 31) + Integer.hashCode(this.pressure)) * 31) + Long.hashCode(this.familyId)) * 31) + Integer.hashCode(this.sessionID)) * 31;
        boolean z = this.isOverLoad;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "MeasureData(flag=" + this.flag + ", unit=" + this.unit + ", timestamp=" + this.timestamp + ", impedance=" + this.impedance + ", weight=" + this.weight + ", heartRate=" + this.heartRate + ", pressure=" + this.pressure + ", familyId=" + this.familyId + ", sessionID=" + this.sessionID + ", measureState=" + g() + ", measureResult=" + f() + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.flag);
        dest.writeInt(this.unit);
        dest.writeLong(this.timestamp);
        dest.writeInt(this.impedance);
        dest.writeFloat(this.weight);
        dest.writeInt(this.heartRate);
        dest.writeInt(this.pressure);
        dest.writeLong(this.familyId);
    }

    public /* synthetic */ MeasureData(int i, int i2, long j, int i3, float f, int i4, int i5, long j2, int i6, boolean z, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, i3, f, i4, i5, j2, (i7 & 256) != 0 ? 0 : i6, (i7 & 512) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MeasureData(@NotNull Parcel source) {
        this(source.readInt(), source.readInt(), source.readLong(), source.readInt(), source.readFloat(), source.readInt(), source.readInt(), source.readLong(), 0, false, 768, null);
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
