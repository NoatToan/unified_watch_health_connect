package com.smarthome.core.scan;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003JM\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020)H\u0016J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00065"}, d2 = {"Lcom/smarthome/core/scan/SDKBleDevice;", "Landroid/os/Parcelable;", "mPacket", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/recognizer/beacon/MiotBleAdvPacket;", "mac", "", "scanRecord", "", "model", "updateTime", "", "did", "(Lcom/xiaomi/smarthome/core/server/internal/bluetooth/recognizer/beacon/MiotBleAdvPacket;Ljava/lang/String;[BLjava/lang/String;JLjava/lang/String;)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getMPacket", "()Lcom/xiaomi/smarthome/core/server/internal/bluetooth/recognizer/beacon/MiotBleAdvPacket;", "setMPacket", "(Lcom/xiaomi/smarthome/core/server/internal/bluetooth/recognizer/beacon/MiotBleAdvPacket;)V", "getMac", "setMac", "getModel", "setModel", "getScanRecord", "()[B", "setScanRecord", "([B)V", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class SDKBleDevice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SDKBleDevice> CREATOR = new Creator();

    @NotNull
    private String did;

    @Nullable
    private MiotBleAdvPacket mPacket;

    @Nullable
    private String mac;

    @Nullable
    private String model;

    @Nullable
    private byte[] scanRecord;
    private long updateTime;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SDKBleDevice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SDKBleDevice createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SDKBleDevice((MiotBleAdvPacket) parcel.readParcelable(SDKBleDevice.class.getClassLoader()), parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SDKBleDevice[] newArray(int i) {
            return new SDKBleDevice[i];
        }
    }

    public SDKBleDevice(@Nullable MiotBleAdvPacket miotBleAdvPacket, @Nullable String str, @Nullable byte[] bArr, @Nullable String str2, long j, @NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.mPacket = miotBleAdvPacket;
        this.mac = str;
        this.scanRecord = bArr;
        this.model = str2;
        this.updateTime = j;
        this.did = did;
    }

    public static /* synthetic */ SDKBleDevice copy$default(SDKBleDevice sDKBleDevice, MiotBleAdvPacket miotBleAdvPacket, String str, byte[] bArr, String str2, long j, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            miotBleAdvPacket = sDKBleDevice.mPacket;
        }
        if ((i & 2) != 0) {
            str = sDKBleDevice.mac;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            bArr = sDKBleDevice.scanRecord;
        }
        byte[] bArr2 = bArr;
        if ((i & 8) != 0) {
            str2 = sDKBleDevice.model;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            j = sDKBleDevice.updateTime;
        }
        long j2 = j;
        if ((i & 32) != 0) {
            str3 = sDKBleDevice.did;
        }
        return sDKBleDevice.copy(miotBleAdvPacket, str4, bArr2, str5, j2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MiotBleAdvPacket getMPacket() {
        return this.mPacket;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getScanRecord() {
        return this.scanRecord;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final SDKBleDevice copy(@Nullable MiotBleAdvPacket mPacket, @Nullable String mac, @Nullable byte[] scanRecord, @Nullable String model, long updateTime, @NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return new SDKBleDevice(mPacket, mac, scanRecord, model, updateTime, did);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SDKBleDevice.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.smarthome.core.scan.SDKBleDevice");
        }
        SDKBleDevice sDKBleDevice = (SDKBleDevice) other;
        if (!Intrinsics.areEqual(this.mPacket, sDKBleDevice.mPacket) || !Intrinsics.areEqual(this.mac, sDKBleDevice.mac)) {
            return false;
        }
        byte[] bArr = this.scanRecord;
        if (bArr != null) {
            byte[] bArr2 = sDKBleDevice.scanRecord;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (sDKBleDevice.scanRecord != null) {
            return false;
        }
        return Intrinsics.areEqual(this.model, sDKBleDevice.model) && this.updateTime == sDKBleDevice.updateTime && Intrinsics.areEqual(this.did, sDKBleDevice.did);
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final MiotBleAdvPacket getMPacket() {
        return this.mPacket;
    }

    @Nullable
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final byte[] getScanRecord() {
        return this.scanRecord;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        MiotBleAdvPacket miotBleAdvPacket = this.mPacket;
        int iHashCode = (miotBleAdvPacket == null ? 0 : miotBleAdvPacket.hashCode()) * 31;
        String str = this.mac;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr = this.scanRecord;
        int iHashCode3 = (iHashCode2 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        String str2 = this.model;
        return ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.updateTime)) * 31) + this.did.hashCode();
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setMPacket(@Nullable MiotBleAdvPacket miotBleAdvPacket) {
        this.mPacket = miotBleAdvPacket;
    }

    public final void setMac(@Nullable String str) {
        this.mac = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setScanRecord(@Nullable byte[] bArr) {
        this.scanRecord = bArr;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @NotNull
    public String toString() {
        return "SDKBleDevice(mPacket=" + this.mPacket + ", mac=" + ((Object) this.mac) + ", scanRecord=" + Arrays.toString(this.scanRecord) + ", model=" + ((Object) this.model) + ", updateTime=" + this.updateTime + ", did=" + this.did + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.mPacket, flags);
        parcel.writeString(this.mac);
        parcel.writeByteArray(this.scanRecord);
        parcel.writeString(this.model);
        parcel.writeLong(this.updateTime);
        parcel.writeString(this.did);
    }
}
