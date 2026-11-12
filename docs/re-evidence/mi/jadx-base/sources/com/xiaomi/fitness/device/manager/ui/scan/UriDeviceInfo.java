package com.xiaomi.fitness.device.manager.ui.scan;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo;
import com.xiaomi.smarthome.homeroom.model.Home;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\r¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/UriDeviceInfo;", "Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", "Landroid/os/Parcelable;", Home.JSON_KEY_ADDRESS, "", "bleName", "oob", "deviceinfo", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "to", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getBleName", "getOob", "getDeviceinfo", "()Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "getTo", "model", "getModel", "bleMac", "getBleMac", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UriDeviceInfo extends BindDeviceInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UriDeviceInfo> CREATOR = new Creator();

    @NotNull
    private final String address;

    @NotNull
    private final String bleName;

    @NotNull
    private final DeviceInfo deviceinfo;

    @Nullable
    private final String oob;

    @Nullable
    private final String to;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UriDeviceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UriDeviceInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UriDeviceInfo(parcel.readString(), parcel.readString(), parcel.readString(), (DeviceInfo) parcel.readParcelable(UriDeviceInfo.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UriDeviceInfo[] newArray(int i) {
            return new UriDeviceInfo[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriDeviceInfo(@NotNull String address, @NotNull String bleName, @Nullable String str, @NotNull DeviceInfo deviceinfo, @Nullable String str2) {
        super(deviceinfo);
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(bleName, "bleName");
        Intrinsics.checkNotNullParameter(deviceinfo, "deviceinfo");
        this.address = address;
        this.bleName = bleName;
        this.oob = str;
        this.deviceinfo = deviceinfo;
        this.to = str2;
    }

    public static /* synthetic */ UriDeviceInfo copy$default(UriDeviceInfo uriDeviceInfo, String str, String str2, String str3, DeviceInfo deviceInfo, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uriDeviceInfo.address;
        }
        if ((i & 2) != 0) {
            str2 = uriDeviceInfo.bleName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = uriDeviceInfo.oob;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            deviceInfo = uriDeviceInfo.deviceinfo;
        }
        DeviceInfo deviceInfo2 = deviceInfo;
        if ((i & 16) != 0) {
            str4 = uriDeviceInfo.to;
        }
        return uriDeviceInfo.copy(str, str5, str6, deviceInfo2, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBleName() {
        return this.bleName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOob() {
        return this.oob;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DeviceInfo getDeviceinfo() {
        return this.deviceinfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @NotNull
    public final UriDeviceInfo copy(@NotNull String address, @NotNull String bleName, @Nullable String oob, @NotNull DeviceInfo deviceinfo, @Nullable String to) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(bleName, "bleName");
        Intrinsics.checkNotNullParameter(deviceinfo, "deviceinfo");
        return new UriDeviceInfo(address, bleName, oob, deviceinfo, to);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UriDeviceInfo)) {
            return false;
        }
        UriDeviceInfo uriDeviceInfo = (UriDeviceInfo) other;
        return Intrinsics.areEqual(this.address, uriDeviceInfo.address) && Intrinsics.areEqual(this.bleName, uriDeviceInfo.bleName) && Intrinsics.areEqual(this.oob, uriDeviceInfo.oob) && Intrinsics.areEqual(this.deviceinfo, uriDeviceInfo.deviceinfo) && Intrinsics.areEqual(this.to, uriDeviceInfo.to);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @NotNull
    public String getBleMac() {
        return this.address;
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @NotNull
    public String getBleName() {
        return this.bleName;
    }

    @NotNull
    public final DeviceInfo getDeviceinfo() {
        return this.deviceinfo;
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @NotNull
    public String getModel() {
        String model = getDeviceInfo().getModel();
        return model == null ? "" : model;
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @Nullable
    public String getOob() {
        return this.oob;
    }

    @Nullable
    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        int iHashCode = ((this.address.hashCode() * 31) + this.bleName.hashCode()) * 31;
        String str = this.oob;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.deviceinfo.hashCode()) * 31;
        String str2 = this.to;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UriDeviceInfo(address=" + this.address + ", bleName=" + this.bleName + ", oob=" + this.oob + ", deviceinfo=" + this.deviceinfo + ", to=" + this.to + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.address);
        dest.writeString(this.bleName);
        dest.writeString(this.oob);
        dest.writeParcelable(this.deviceinfo, flags);
        dest.writeString(this.to);
    }
}
