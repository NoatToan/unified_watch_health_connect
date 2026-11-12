package com.xiaomi.fitness.eco.device.manager.export.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoLocalInfo;", "Landroid/os/Parcelable;", "did", "", "model", "firmwareVersion", "serialNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDid", "()Ljava/lang/String;", "getModel", "getFirmwareVersion", "getSerialNumber", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcoLocalInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EcoLocalInfo> CREATOR = new Creator();

    @NotNull
    private final String did;

    @Nullable
    private final String firmwareVersion;

    @NotNull
    private final String model;

    @NotNull
    private final String serialNumber;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EcoLocalInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EcoLocalInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EcoLocalInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EcoLocalInfo[] newArray(int i) {
            return new EcoLocalInfo[i];
        }
    }

    public EcoLocalInfo(@NotNull String did, @NotNull String model, @Nullable String str, @NotNull String serialNumber) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        this.did = did;
        this.model = model;
        this.firmwareVersion = str;
        this.serialNumber = serialNumber;
    }

    public static /* synthetic */ EcoLocalInfo copy$default(EcoLocalInfo ecoLocalInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecoLocalInfo.did;
        }
        if ((i & 2) != 0) {
            str2 = ecoLocalInfo.model;
        }
        if ((i & 4) != 0) {
            str3 = ecoLocalInfo.firmwareVersion;
        }
        if ((i & 8) != 0) {
            str4 = ecoLocalInfo.serialNumber;
        }
        return ecoLocalInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @NotNull
    public final EcoLocalInfo copy(@NotNull String did, @NotNull String model, @Nullable String firmwareVersion, @NotNull String serialNumber) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        return new EcoLocalInfo(did, model, firmwareVersion, serialNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcoLocalInfo)) {
            return false;
        }
        EcoLocalInfo ecoLocalInfo = (EcoLocalInfo) other;
        return Intrinsics.areEqual(this.did, ecoLocalInfo.did) && Intrinsics.areEqual(this.model, ecoLocalInfo.model) && Intrinsics.areEqual(this.firmwareVersion, ecoLocalInfo.firmwareVersion) && Intrinsics.areEqual(this.serialNumber, ecoLocalInfo.serialNumber);
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public int hashCode() {
        int iHashCode = ((this.did.hashCode() * 31) + this.model.hashCode()) * 31;
        String str = this.firmwareVersion;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.serialNumber.hashCode();
    }

    @NotNull
    public String toString() {
        return "EcoLocalInfo(did=" + this.did + ", model=" + this.model + ", firmwareVersion=" + this.firmwareVersion + ", serialNumber=" + this.serialNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.did);
        dest.writeString(this.model);
        dest.writeString(this.firmwareVersion);
        dest.writeString(this.serialNumber);
    }
}
