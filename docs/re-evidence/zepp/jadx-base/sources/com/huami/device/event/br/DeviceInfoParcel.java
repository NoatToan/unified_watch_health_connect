package com.huami.device.event.br;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001;BA\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b8\u0010:J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0012HÆ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001J\u0013\u0010 \u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0016\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0017\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u0019\u0010\u0018\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\u0019\u0010\u0019\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u001a\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u001a\u00107¨\u0006<"}, d2 = {"Lcom/huami/device/event/br/DeviceInfoParcel;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", DataCacher.j, "", "writeToParcel", "describeContents", "", "component1", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "component2", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "component3", "component4", "component5", "component6", "", "component7", "id", "type", "source", "mac", "sn", "status", "isMajorDevice", "copy", "toString", "hashCode", "", "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getType", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "c", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", GoogleApiAvailabilityLight.a, "getMac", "e", "getSn", "f", LogUtil.I, "getStatus", "()I", "g", "Z", "()Z", "<init>", "(Ljava/lang/String;Lcom/xiaomi/hm/health/bt/device/HMDeviceType;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Ljava/lang/String;Ljava/lang/String;IZ)V", "(Landroid/os/Parcel;)V", "CREATOR", "devicelifeevent_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class DeviceInfoParcel implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String mac;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String sn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int status;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean isMajorDevice;

    /* JADX INFO: renamed from: com.huami.device.event.br.DeviceInfoParcel$CREATOR, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/device/event/br/DeviceInfoParcel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/huami/device/event/br/DeviceInfoParcel;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/huami/device/event/br/DeviceInfoParcel;", "<init>", "()V", "devicelifeevent_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion implements Parcelable.Creator<DeviceInfoParcel> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DeviceInfoParcel createFromParcel(@NotNull Parcel parcel) {
            return new DeviceInfoParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DeviceInfoParcel[] newArray(int size) {
            return new DeviceInfoParcel[size];
        }
    }

    public DeviceInfoParcel(@Nullable String str, @NotNull HMDeviceType hMDeviceType, @NotNull HMDeviceSource hMDeviceSource, @NotNull String str2, @NotNull String str3, int i, boolean z) {
        this.id = str;
        this.type = hMDeviceType;
        this.source = hMDeviceSource;
        this.mac = str2;
        this.sn = str3;
        this.status = i;
        this.isMajorDevice = z;
    }

    public static /* synthetic */ DeviceInfoParcel copy$default(DeviceInfoParcel deviceInfoParcel, String str, HMDeviceType hMDeviceType, HMDeviceSource hMDeviceSource, String str2, String str3, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deviceInfoParcel.id;
        }
        if ((i2 & 2) != 0) {
            hMDeviceType = deviceInfoParcel.type;
        }
        HMDeviceType hMDeviceType2 = hMDeviceType;
        if ((i2 & 4) != 0) {
            hMDeviceSource = deviceInfoParcel.source;
        }
        HMDeviceSource hMDeviceSource2 = hMDeviceSource;
        if ((i2 & 8) != 0) {
            str2 = deviceInfoParcel.mac;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            str3 = deviceInfoParcel.sn;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            i = deviceInfoParcel.status;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            z = deviceInfoParcel.isMajorDevice;
        }
        return deviceInfoParcel.copy(str, hMDeviceType2, hMDeviceSource2, str4, str5, i3, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMDeviceType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMDeviceSource getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsMajorDevice() {
        return this.isMajorDevice;
    }

    @NotNull
    public final DeviceInfoParcel copy(@Nullable String id, @NotNull HMDeviceType type, @NotNull HMDeviceSource source, @NotNull String mac, @NotNull String sn, int status, boolean isMajorDevice) {
        return new DeviceInfoParcel(id, type, source, mac, sn, status, isMajorDevice);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfoParcel)) {
            return false;
        }
        DeviceInfoParcel deviceInfoParcel = (DeviceInfoParcel) other;
        return Intrinsics.areEqual(this.id, deviceInfoParcel.id) && Intrinsics.areEqual(this.type, deviceInfoParcel.type) && Intrinsics.areEqual(this.source, deviceInfoParcel.source) && Intrinsics.areEqual(this.mac, deviceInfoParcel.mac) && Intrinsics.areEqual(this.sn, deviceInfoParcel.sn) && this.status == deviceInfoParcel.status && this.isMajorDevice == deviceInfoParcel.isMajorDevice;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final HMDeviceSource getSource() {
        return this.source;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final HMDeviceType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        HMDeviceType hMDeviceType = this.type;
        int iHashCode2 = (iHashCode + (hMDeviceType != null ? hMDeviceType.hashCode() : 0)) * 31;
        HMDeviceSource hMDeviceSource = this.source;
        int iHashCode3 = (iHashCode2 + (hMDeviceSource != null ? hMDeviceSource.hashCode() : 0)) * 31;
        String str2 = this.mac;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.sn;
        int iHashCode5 = (((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.status) * 31;
        boolean z = this.isMajorDevice;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode5 + r1;
    }

    public final boolean isMajorDevice() {
        return this.isMajorDevice;
    }

    @NotNull
    public String toString() {
        return "DeviceInfoParcel(id=" + this.id + ", type=" + this.type + ", source=" + this.source + ", mac=" + this.mac + ", sn=" + this.sn + ", status=" + this.status + ", isMajorDevice=" + this.isMajorDevice + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.mac);
        parcel.writeString(this.sn);
        parcel.writeInt(this.status);
        parcel.writeByte(this.isMajorDevice ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceInfoParcel(@NotNull Parcel parcel) {
        String string = parcel.readString();
        HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(parcel.readInt());
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(parcel.readInt());
        String string2 = parcel.readString();
        String str = string2 != null ? string2 : "";
        String string3 = parcel.readString();
        this(string, hMDeviceTypeFromValue, hMDeviceSourceFromValue, str, string3 != null ? string3 : "", parcel.readInt(), parcel.readByte() != ((byte) 0));
    }
}
