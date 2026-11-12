package com.xiaomi.fitness.device.manager.export.scan;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.manager.export.scan.beacon.Beacon;
import com.xiaomi.fitness.device.manager.export.scan.beacon.BeaconItem;
import com.xiaomi.fitness.mijia.sdk.data.AdvPacket;
import com.xiaomi.smarthome.homeroom.model.Home;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u0010/\u001a\u00020\u0006H\u0016J\b\u00100\u001a\u00020\u0003H\u0016J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J_\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010:\u001a\u00020\u0006J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010$\"\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0011¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "Landroid/os/Parcelable;", "deviceAddress", "", "beaconAddress", "productId", "", "model", "packet", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "name", "rssi", "isPhoneSwitching", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;Ljava/lang/String;IZ)V", "getDeviceAddress", "()Ljava/lang/String;", "setDeviceAddress", "(Ljava/lang/String;)V", "getBeaconAddress", "setBeaconAddress", "getProductId", "()I", "setProductId", "(I)V", "getModel", "setModel", "getPacket", "()Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "setPacket", "(Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;)V", "getName", "setName", "getRssi", "setRssi", "()Z", "setPhoneSwitching", "(Z)V", Home.JSON_KEY_ADDRESS, "getAddress", "getBeaconName", "beacon", "Lcom/xiaomi/fitness/device/manager/export/scan/beacon/Beacon;", "equals", "other", "", "hashCode", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BleDevice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BleDevice> CREATOR = new Creator();

    @Nullable
    private String beaconAddress;

    @NotNull
    private String deviceAddress;
    private boolean isPhoneSwitching;

    @NotNull
    private String model;

    @Nullable
    private String name;

    @Nullable
    private AdvPacket packet;
    private int productId;
    private int rssi;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BleDevice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BleDevice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BleDevice(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), (AdvPacket) parcel.readParcelable(BleDevice.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BleDevice[] newArray(int i) {
            return new BleDevice[i];
        }
    }

    public BleDevice(@NotNull String deviceAddress, @Nullable String str, int i, @NotNull String model, @Nullable AdvPacket advPacket, @Nullable String str2, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        Intrinsics.checkNotNullParameter(model, "model");
        this.deviceAddress = deviceAddress;
        this.beaconAddress = str;
        this.productId = i;
        this.model = model;
        this.packet = advPacket;
        this.name = str2;
        this.rssi = i2;
        this.isPhoneSwitching = z;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceAddress() {
        return this.deviceAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBeaconAddress() {
        return this.beaconAddress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AdvPacket getPacket() {
        return this.packet;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getRssi() {
        return this.rssi;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsPhoneSwitching() {
        return this.isPhoneSwitching;
    }

    @NotNull
    public final BleDevice copy(@NotNull String deviceAddress, @Nullable String beaconAddress, int productId, @NotNull String model, @Nullable AdvPacket packet, @Nullable String name, int rssi, boolean isPhoneSwitching) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        Intrinsics.checkNotNullParameter(model, "model");
        return new BleDevice(deviceAddress, beaconAddress, productId, model, packet, name, rssi, isPhoneSwitching);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        return this == other || ((other instanceof BleDevice) && Intrinsics.areEqual(getAddress(), ((BleDevice) other).getAddress()));
    }

    @NotNull
    public final String getAddress() {
        String str = this.beaconAddress;
        return str == null ? this.deviceAddress : str;
    }

    @Nullable
    public final String getBeaconAddress() {
        return this.beaconAddress;
    }

    @NotNull
    public final String getBeaconName(@NotNull Beacon beacon) {
        Intrinsics.checkNotNullParameter(beacon, "beacon");
        for (BeaconItem beaconItem : beacon.getMItems()) {
            if (beaconItem.getType() == 9) {
                return !ByteUtil.isEmpty(beaconItem.getBytes()) ? new String(beaconItem.getBytes(), Charsets.UTF_8) : "";
            }
        }
        return "";
    }

    @NotNull
    public final String getDeviceAddress() {
        return this.deviceAddress;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final AdvPacket getPacket() {
        return this.packet;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public int hashCode() {
        return getAddress().hashCode();
    }

    public final boolean isPhoneSwitching() {
        return this.isPhoneSwitching;
    }

    public final void setBeaconAddress(@Nullable String str) {
        this.beaconAddress = str;
    }

    public final void setDeviceAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceAddress = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPacket(@Nullable AdvPacket advPacket) {
        this.packet = advPacket;
    }

    public final void setPhoneSwitching(boolean z) {
        this.isPhoneSwitching = z;
    }

    public final void setProductId(int i) {
        this.productId = i;
    }

    public final void setRssi(int i) {
        this.rssi = i;
    }

    @NotNull
    public String toString() {
        return "name:" + this.name + " mac:" + getAddress() + " rssi:" + this.rssi + " model:" + this.model + " productId:" + this.productId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.deviceAddress);
        dest.writeString(this.beaconAddress);
        dest.writeInt(this.productId);
        dest.writeString(this.model);
        dest.writeParcelable(this.packet, flags);
        dest.writeString(this.name);
        dest.writeInt(this.rssi);
        dest.writeInt(this.isPhoneSwitching ? 1 : 0);
    }

    public /* synthetic */ BleDevice(String str, String str2, int i, String str3, AdvPacket advPacket, String str4, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? null : advPacket, (i3 & 32) == 0 ? str4 : null, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) == 0 ? z : false);
    }
}
