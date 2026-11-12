package com.xiaomi.fitness.eco.device.manager.export.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007J\b\u0010\u001a\u001a\u00020\fH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "isOwner", "", "()Z", "shareId", "", "getShareId", "()Ljava/lang/String;", "setShareId", "(Ljava/lang/String;)V", "shareUserId", "getShareUserId", "setShareUserId", "shareDid", "getShareDid", "setShareDid", "shareModel", "getShareModel", "setShareModel", "toString", "writeToParcel", "", "flags", "", "CREATOR", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceInfo extends DeviceInfo<EcoDevice> {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String shareDid;

    @Nullable
    private String shareId;

    @Nullable
    private String shareModel;

    @Nullable
    private String shareUserId;

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<EcoDeviceInfo> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EcoDeviceInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EcoDeviceInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EcoDeviceInfo[] newArray(int size) {
            return new EcoDeviceInfo[size];
        }
    }

    public EcoDeviceInfo() {
    }

    @Nullable
    public final String getShareDid() {
        return this.shareDid;
    }

    @Nullable
    public final String getShareId() {
        return this.shareId;
    }

    @Nullable
    public final String getShareModel() {
        return this.shareModel;
    }

    @Nullable
    public final String getShareUserId() {
        return this.shareUserId;
    }

    public final boolean isOwner() {
        EcoDevice ecoDevice = (EcoDevice) this.device;
        if (ecoDevice != null) {
            return ecoDevice.getIsOwner();
        }
        return true;
    }

    public final void setShareDid(@Nullable String str) {
        this.shareDid = str;
    }

    public final void setShareId(@Nullable String str) {
        this.shareId = str;
    }

    public final void setShareModel(@Nullable String str) {
        this.shareModel = str;
    }

    public final void setShareUserId(@Nullable String str) {
        this.shareUserId = str;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.DeviceInfo
    @NotNull
    public String toString() {
        return "EcoDeviceInfo(device=" + this.device + ", firmwareVersion=" + getFirmwareVersion() + ", product=" + getProduct() + ", bleName=" + getBleName() + ", batteryInfo=" + getBatteryInfo() + ", sn=" + getSn() + ", battery=" + getBattery() + ", mac=" + getMac() + ", did='" + getDid() + "', model='" + getModel() + "', name='" + getName() + "', nodeID=" + getNodeID() + ", huamiAuthKey=" + getHuamiAuthKey() + ", productId=" + getProductId() + ", privateUUID=" + getPrivateUUID() + ")";
    }

    @Override // com.xiaomi.fitness.device.manager.bean.DeviceInfo, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, flags);
        parcel.writeString(this.shareId);
        parcel.writeString(this.shareUserId);
        parcel.writeString(this.shareDid);
        parcel.writeString(this.shareModel);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcoDeviceInfo(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
        this.shareId = parcel.readString();
        this.shareUserId = parcel.readString();
        this.shareDid = parcel.readString();
        this.shareModel = parcel.readString();
    }
}
