package com.xiaomi.fitness.device.manager.export.scan;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010,\u001a\u00020\u0018J\u0013\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0018HÖ\u0001J\t\u00101\u001a\u00020\bHÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u0014\u0010\"\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0014R\u0011\u0010$\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b$\u0010!R\u001c\u0010%\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/scan/ScannedDeviceInfo;", "Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", "Landroid/os/Parcelable;", "bleDevice", "Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "deviceinfo", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "to", "", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;Ljava/lang/String;)V", "getBleDevice", "()Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "setBleDevice", "(Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;)V", "getDeviceinfo", "()Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "setDeviceinfo", "(Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;)V", "getTo", "()Ljava/lang/String;", "setTo", "(Ljava/lang/String;)V", "productId", "", "getProductId", "()I", "model", "getModel", "bleName", "getBleName", "isHuami", "", "()Z", "bleMac", "getBleMac", "isWearOs", "oob", "getOob", "setOob", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ScannedDeviceInfo extends BindDeviceInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScannedDeviceInfo> CREATOR = new Creator();

    @NotNull
    private BleDevice bleDevice;

    @NotNull
    private DeviceInfo deviceinfo;

    @Nullable
    private String oob;

    @Nullable
    private String to;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScannedDeviceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScannedDeviceInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScannedDeviceInfo(BleDevice.CREATOR.createFromParcel(parcel), DeviceInfo.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScannedDeviceInfo[] newArray(int i) {
            return new ScannedDeviceInfo[i];
        }
    }

    public /* synthetic */ ScannedDeviceInfo(BleDevice bleDevice, DeviceInfo deviceInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bleDevice, deviceInfo, (i & 4) != 0 ? null : str);
    }

    public static /* synthetic */ ScannedDeviceInfo copy$default(ScannedDeviceInfo scannedDeviceInfo, BleDevice bleDevice, DeviceInfo deviceInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bleDevice = scannedDeviceInfo.bleDevice;
        }
        if ((i & 2) != 0) {
            deviceInfo = scannedDeviceInfo.deviceinfo;
        }
        if ((i & 4) != 0) {
            str = scannedDeviceInfo.to;
        }
        return scannedDeviceInfo.copy(bleDevice, deviceInfo, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BleDevice getBleDevice() {
        return this.bleDevice;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeviceInfo getDeviceinfo() {
        return this.deviceinfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @NotNull
    public final ScannedDeviceInfo copy(@NotNull BleDevice bleDevice, @NotNull DeviceInfo deviceinfo, @Nullable String to) {
        Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        Intrinsics.checkNotNullParameter(deviceinfo, "deviceinfo");
        return new ScannedDeviceInfo(bleDevice, deviceinfo, to);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScannedDeviceInfo)) {
            return false;
        }
        ScannedDeviceInfo scannedDeviceInfo = (ScannedDeviceInfo) other;
        return Intrinsics.areEqual(this.bleDevice, scannedDeviceInfo.bleDevice) && Intrinsics.areEqual(this.deviceinfo, scannedDeviceInfo.deviceinfo) && Intrinsics.areEqual(this.to, scannedDeviceInfo.to);
    }

    @NotNull
    public final BleDevice getBleDevice() {
        return this.bleDevice;
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @NotNull
    public String getBleMac() {
        return this.bleDevice.getAddress();
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @NotNull
    public String getBleName() {
        String name = this.bleDevice.getName();
        return name == null ? "" : name;
    }

    @NotNull
    public final DeviceInfo getDeviceinfo() {
        return this.deviceinfo;
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @NotNull
    public String getModel() {
        return this.bleDevice.getModel();
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @Nullable
    public String getOob() {
        return this.oob;
    }

    public final int getProductId() {
        return this.bleDevice.getProductId();
    }

    @Nullable
    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        int iHashCode = ((this.bleDevice.hashCode() * 31) + this.deviceinfo.hashCode()) * 31;
        String str = this.to;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isHuami() {
        return this.deviceinfo.isHuami();
    }

    public final boolean isWearOs() {
        return this.deviceinfo.isWearOs();
    }

    public final void setBleDevice(@NotNull BleDevice bleDevice) {
        Intrinsics.checkNotNullParameter(bleDevice, "<set-?>");
        this.bleDevice = bleDevice;
    }

    public final void setDeviceinfo(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "<set-?>");
        this.deviceinfo = deviceInfo;
    }

    public void setOob(@Nullable String str) {
        this.oob = str;
    }

    public final void setTo(@Nullable String str) {
        this.to = str;
    }

    @NotNull
    public String toString() {
        return "ScannedDeviceInfo(bleDevice=" + this.bleDevice + ", deviceinfo=" + this.deviceinfo + ", to=" + this.to + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.bleDevice.writeToParcel(dest, flags);
        this.deviceinfo.writeToParcel(dest, flags);
        dest.writeString(this.to);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannedDeviceInfo(@NotNull BleDevice bleDevice, @NotNull DeviceInfo deviceinfo, @Nullable String str) {
        super(deviceinfo);
        Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        Intrinsics.checkNotNullParameter(deviceinfo, "deviceinfo");
        this.bleDevice = bleDevice;
        this.deviceinfo = deviceinfo;
        this.to = str;
    }
}
