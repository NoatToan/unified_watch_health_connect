package com.xiaomi.fitness.eco.device.manager.ui.scan;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoAddDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jy\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u00102\u001a\u000203J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000203HÖ\u0001J\t\u00109\u001a\u00020\u0004HÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000203R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/scan/EcoUriDeviceInfo;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "Landroid/os/Parcelable;", "bleMac", "", "model", "bleName", "oob", "shareId", "shareUserId", "shareDid", "shareModel", "deviceinfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;", "to", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;Ljava/lang/String;)V", "getBleMac", "()Ljava/lang/String;", "setBleMac", "(Ljava/lang/String;)V", "getModel", "setModel", "getBleName", "setBleName", "getOob", "setOob", "getShareId", "setShareId", "getShareUserId", "setShareUserId", "getShareDid", "setShareDid", "getShareModel", "setShareModel", "getDeviceinfo", "()Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;", "getTo", "setTo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcoUriDeviceInfo extends EcoBindDeviceInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EcoUriDeviceInfo> CREATOR = new Creator();

    @NotNull
    private String bleMac;

    @NotNull
    private String bleName;

    @NotNull
    private final EcoAddDeviceInfo deviceinfo;

    @NotNull
    private String model;

    @Nullable
    private String oob;

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
    public static final class Creator implements Parcelable.Creator<EcoUriDeviceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EcoUriDeviceInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EcoUriDeviceInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (EcoAddDeviceInfo) parcel.readParcelable(EcoUriDeviceInfo.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EcoUriDeviceInfo[] newArray(int i) {
            return new EcoUriDeviceInfo[i];
        }
    }

    public /* synthetic */ EcoUriDeviceInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, EcoAddDeviceInfo ecoAddDeviceInfo, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, ecoAddDeviceInfo, str9);
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
    public final EcoAddDeviceInfo getDeviceinfo() {
        return this.deviceinfo;
    }

    @NotNull
    public final EcoUriDeviceInfo copy(@NotNull String bleMac, @NotNull String model, @NotNull String bleName, @Nullable String oob, @Nullable String shareId, @Nullable String shareUserId, @Nullable String shareDid, @Nullable String shareModel, @NotNull EcoAddDeviceInfo deviceinfo, @Nullable String to) {
        Intrinsics.checkNotNullParameter(bleMac, "bleMac");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(bleName, "bleName");
        Intrinsics.checkNotNullParameter(deviceinfo, "deviceinfo");
        return new EcoUriDeviceInfo(bleMac, model, bleName, oob, shareId, shareUserId, shareDid, shareModel, deviceinfo, to);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcoUriDeviceInfo)) {
            return false;
        }
        EcoUriDeviceInfo ecoUriDeviceInfo = (EcoUriDeviceInfo) other;
        return Intrinsics.areEqual(this.bleMac, ecoUriDeviceInfo.bleMac) && Intrinsics.areEqual(this.model, ecoUriDeviceInfo.model) && Intrinsics.areEqual(this.bleName, ecoUriDeviceInfo.bleName) && Intrinsics.areEqual(this.oob, ecoUriDeviceInfo.oob) && Intrinsics.areEqual(this.shareId, ecoUriDeviceInfo.shareId) && Intrinsics.areEqual(this.shareUserId, ecoUriDeviceInfo.shareUserId) && Intrinsics.areEqual(this.shareDid, ecoUriDeviceInfo.shareDid) && Intrinsics.areEqual(this.shareModel, ecoUriDeviceInfo.shareModel) && Intrinsics.areEqual(this.deviceinfo, ecoUriDeviceInfo.deviceinfo) && Intrinsics.areEqual(this.to, ecoUriDeviceInfo.to);
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

    @NotNull
    public final EcoAddDeviceInfo getDeviceinfo() {
        return this.deviceinfo;
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
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.deviceinfo.hashCode()) * 31;
        String str6 = this.to;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
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
        return "EcoUriDeviceInfo(bleMac=" + this.bleMac + ", model=" + this.model + ", bleName=" + this.bleName + ", oob=" + this.oob + ", shareId=" + this.shareId + ", shareUserId=" + this.shareUserId + ", shareDid=" + this.shareDid + ", shareModel=" + this.shareModel + ", deviceinfo=" + this.deviceinfo + ", to=" + this.to + ")";
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
        dest.writeParcelable(this.deviceinfo, flags);
        dest.writeString(this.to);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoUriDeviceInfo(@NotNull String bleMac, @NotNull String model, @NotNull String bleName, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull EcoAddDeviceInfo deviceinfo, @Nullable String str6) {
        super(deviceinfo);
        Intrinsics.checkNotNullParameter(bleMac, "bleMac");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(bleName, "bleName");
        Intrinsics.checkNotNullParameter(deviceinfo, "deviceinfo");
        this.bleMac = bleMac;
        this.model = model;
        this.bleName = bleName;
        this.oob = str;
        this.shareId = str2;
        this.shareUserId = str3;
        this.shareDid = str4;
        this.shareModel = str5;
        this.deviceinfo = deviceinfo;
        this.to = str6;
    }
}
