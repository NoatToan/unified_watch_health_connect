package com.xiaomi.fitness.eco.device.manager.export.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.mijia.sdk.data.AdvPacket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B{\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\t\u00100\u001a\u00020\u0004HÆ\u0003J\t\u00101\u001a\u00020\u0004HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0085\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0006\u0010;\u001a\u00020<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020<HÖ\u0001J\t\u0010B\u001a\u00020\u0004HÖ\u0001J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020<R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001a\u0010\f\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoScannedDeviceInfo;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "Landroid/os/Parcelable;", "bleMac", "", "model", "bleName", "oob", "shareId", "shareUserId", "shareDid", "shareModel", "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;", "to", "packet", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;Ljava/lang/String;Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;)V", "getBleMac", "()Ljava/lang/String;", "setBleMac", "(Ljava/lang/String;)V", "getModel", "setModel", "getBleName", "setBleName", "getOob", "setOob", "getShareId", "setShareId", "getShareUserId", "setShareUserId", "getShareDid", "setShareDid", "getShareModel", "setShareModel", "getDeviceInfo", "()Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;", "setDeviceInfo", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;)V", "getTo", "setTo", "getPacket", "()Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "setPacket", "(Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcoScannedDeviceInfo extends EcoBindDeviceInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EcoScannedDeviceInfo> CREATOR = new Creator();

    @NotNull
    private String bleMac;

    @NotNull
    private String bleName;

    @NotNull
    private EcoAddDeviceInfo deviceInfo;

    @NotNull
    private String model;

    @Nullable
    private String oob;

    @Nullable
    private AdvPacket packet;

    @Nullable
    private String shareDid;

    @Nullable
    private String shareId;

    @Nullable
    private String shareModel;

    @Nullable
    private String shareUserId;

    @Nullable
    private String to;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EcoScannedDeviceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EcoScannedDeviceInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EcoScannedDeviceInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), EcoAddDeviceInfo.CREATOR.createFromParcel(parcel), parcel.readString(), (AdvPacket) parcel.readParcelable(EcoScannedDeviceInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EcoScannedDeviceInfo[] newArray(int i) {
            return new EcoScannedDeviceInfo[i];
        }
    }

    public /* synthetic */ EcoScannedDeviceInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, EcoAddDeviceInfo ecoAddDeviceInfo, String str9, AdvPacket advPacket, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, ecoAddDeviceInfo, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : advPacket);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBleMac() {
        return this.bleMac;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final AdvPacket getPacket() {
        return this.packet;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBleName() {
        return this.bleName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOob() {
        return this.oob;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getShareId() {
        return this.shareId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getShareUserId() {
        return this.shareUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getShareDid() {
        return this.shareDid;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getShareModel() {
        return this.shareModel;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final EcoAddDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final EcoScannedDeviceInfo copy(@NotNull String bleMac, @NotNull String model, @NotNull String bleName, @Nullable String oob, @Nullable String shareId, @Nullable String shareUserId, @Nullable String shareDid, @Nullable String shareModel, @NotNull EcoAddDeviceInfo deviceInfo, @Nullable String to, @Nullable AdvPacket packet) {
        Intrinsics.checkNotNullParameter(bleMac, "bleMac");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(bleName, "bleName");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return new EcoScannedDeviceInfo(bleMac, model, bleName, oob, shareId, shareUserId, shareDid, shareModel, deviceInfo, to, packet);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcoScannedDeviceInfo)) {
            return false;
        }
        EcoScannedDeviceInfo ecoScannedDeviceInfo = (EcoScannedDeviceInfo) other;
        return Intrinsics.areEqual(this.bleMac, ecoScannedDeviceInfo.bleMac) && Intrinsics.areEqual(this.model, ecoScannedDeviceInfo.model) && Intrinsics.areEqual(this.bleName, ecoScannedDeviceInfo.bleName) && Intrinsics.areEqual(this.oob, ecoScannedDeviceInfo.oob) && Intrinsics.areEqual(this.shareId, ecoScannedDeviceInfo.shareId) && Intrinsics.areEqual(this.shareUserId, ecoScannedDeviceInfo.shareUserId) && Intrinsics.areEqual(this.shareDid, ecoScannedDeviceInfo.shareDid) && Intrinsics.areEqual(this.shareModel, ecoScannedDeviceInfo.shareModel) && Intrinsics.areEqual(this.deviceInfo, ecoScannedDeviceInfo.deviceInfo) && Intrinsics.areEqual(this.to, ecoScannedDeviceInfo.to) && Intrinsics.areEqual(this.packet, ecoScannedDeviceInfo.packet);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    @NotNull
    public String getBleMac() {
        return this.bleMac;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    @NotNull
    public String getBleName() {
        return this.bleName;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    @NotNull
    public EcoAddDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    @NotNull
    public String getModel() {
        return this.model;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    @Nullable
    public String getOob() {
        return this.oob;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    @Nullable
    public AdvPacket getPacket() {
        return this.packet;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    @Nullable
    public String getShareDid() {
        return this.shareDid;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    @Nullable
    public String getShareId() {
        return this.shareId;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    @Nullable
    public String getShareModel() {
        return this.shareModel;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    @Nullable
    public String getShareUserId() {
        return this.shareUserId;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    @Nullable
    public String getTo() {
        return this.to;
    }

    public int hashCode() {
        int iHashCode = ((((this.bleMac.hashCode() * 31) + this.model.hashCode()) * 31) + this.bleName.hashCode()) * 31;
        String str = this.oob;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shareId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shareUserId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shareDid;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.shareModel;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.deviceInfo.hashCode()) * 31;
        String str6 = this.to;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AdvPacket advPacket = this.packet;
        return iHashCode7 + (advPacket != null ? advPacket.hashCode() : 0);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    public void setBleMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bleMac = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    public void setBleName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bleName = str;
    }

    public void setDeviceInfo(@NotNull EcoAddDeviceInfo ecoAddDeviceInfo) {
        Intrinsics.checkNotNullParameter(ecoAddDeviceInfo, "<set-?>");
        this.deviceInfo = ecoAddDeviceInfo;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    public void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    public void setOob(@Nullable String str) {
        this.oob = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    public void setPacket(@Nullable AdvPacket advPacket) {
        this.packet = advPacket;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    public void setShareDid(@Nullable String str) {
        this.shareDid = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    public void setShareId(@Nullable String str) {
        this.shareId = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    public void setShareModel(@Nullable String str) {
        this.shareModel = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    public void setShareUserId(@Nullable String str) {
        this.shareUserId = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo
    public void setTo(@Nullable String str) {
        this.to = str;
    }

    @NotNull
    public String toString() {
        return "EcoScannedDeviceInfo(bleMac=" + this.bleMac + ", model=" + this.model + ", bleName=" + this.bleName + ", oob=" + this.oob + ", shareId=" + this.shareId + ", shareUserId=" + this.shareUserId + ", shareDid=" + this.shareDid + ", shareModel=" + this.shareModel + ", deviceInfo=" + this.deviceInfo + ", to=" + this.to + ", packet=" + this.packet + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bleMac);
        dest.writeString(this.model);
        dest.writeString(this.bleName);
        dest.writeString(this.oob);
        dest.writeString(this.shareId);
        dest.writeString(this.shareUserId);
        dest.writeString(this.shareDid);
        dest.writeString(this.shareModel);
        this.deviceInfo.writeToParcel(dest, flags);
        dest.writeString(this.to);
        dest.writeParcelable(this.packet, flags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoScannedDeviceInfo(@NotNull String bleMac, @NotNull String model, @NotNull String bleName, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull EcoAddDeviceInfo deviceInfo, @Nullable String str6, @Nullable AdvPacket advPacket) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(bleMac, "bleMac");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(bleName, "bleName");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.bleMac = bleMac;
        this.model = model;
        this.bleName = bleName;
        this.oob = str;
        this.shareId = str2;
        this.shareUserId = str3;
        this.shareDid = str4;
        this.shareModel = str5;
        this.deviceInfo = deviceInfo;
        this.to = str6;
        this.packet = advPacket;
    }
}
