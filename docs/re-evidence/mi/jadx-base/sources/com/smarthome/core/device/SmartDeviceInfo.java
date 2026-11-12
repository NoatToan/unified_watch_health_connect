package com.smarthome.core.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.device.Device;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0084\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00105J\t\u00106\u001a\u00020\u0007HÖ\u0001J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0007HÖ\u0001J\u000e\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\u0019\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\f\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013¨\u0006D"}, d2 = {"Lcom/smarthome/core/device/SmartDeviceInfo;", "Landroid/os/Parcelable;", "did", "", "name", "model", "pid", "", "mac", "specUrn", "token", "desc", "isOnline", "", "extraJson", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getDid", "setDid", "getExtraJson", "setExtraJson", "()Ljava/lang/Boolean;", "setOnline", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMac", "setMac", "getModel", "setModel", "getName", "setName", "getPid", "()I", "setPid", "(I)V", "getSpecUrn", "setSpecUrn", "getToken", "setToken", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/smarthome/core/device/SmartDeviceInfo;", "describeContents", "equals", "other", "", "hashCode", "initFromDevice", "", "device", "Lcom/xiaomi/smarthome/device/Device;", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class SmartDeviceInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SmartDeviceInfo> CREATOR = new Creator();

    @Nullable
    private String desc;

    @Nullable
    private String did;

    @Nullable
    private String extraJson;

    @Nullable
    private Boolean isOnline;

    @Nullable
    private String mac;

    @Nullable
    private String model;

    @Nullable
    private String name;
    private int pid;

    @Nullable
    private String specUrn;

    @Nullable
    private String token;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SmartDeviceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SmartDeviceInfo createFromParcel(@NotNull Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SmartDeviceInfo(string, string2, string3, i, string4, string5, string6, string7, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SmartDeviceInfo[] newArray(int i) {
            return new SmartDeviceInfo[i];
        }
    }

    public SmartDeviceInfo() {
        this(null, null, null, 0, null, null, null, null, null, null, 1023, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getExtraJson() {
        return this.extraJson;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSpecUrn() {
        return this.specUrn;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsOnline() {
        return this.isOnline;
    }

    @NotNull
    public final SmartDeviceInfo copy(@Nullable String did, @Nullable String name, @Nullable String model, int pid, @Nullable String mac, @Nullable String specUrn, @Nullable String token, @Nullable String desc, @Nullable Boolean isOnline, @Nullable String extraJson) {
        return new SmartDeviceInfo(did, name, model, pid, mac, specUrn, token, desc, isOnline, extraJson);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartDeviceInfo)) {
            return false;
        }
        SmartDeviceInfo smartDeviceInfo = (SmartDeviceInfo) other;
        return Intrinsics.areEqual(this.did, smartDeviceInfo.did) && Intrinsics.areEqual(this.name, smartDeviceInfo.name) && Intrinsics.areEqual(this.model, smartDeviceInfo.model) && this.pid == smartDeviceInfo.pid && Intrinsics.areEqual(this.mac, smartDeviceInfo.mac) && Intrinsics.areEqual(this.specUrn, smartDeviceInfo.specUrn) && Intrinsics.areEqual(this.token, smartDeviceInfo.token) && Intrinsics.areEqual(this.desc, smartDeviceInfo.desc) && Intrinsics.areEqual(this.isOnline, smartDeviceInfo.isOnline) && Intrinsics.areEqual(this.extraJson, smartDeviceInfo.extraJson);
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getExtraJson() {
        return this.extraJson;
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
    public final String getName() {
        return this.name;
    }

    public final int getPid() {
        return this.pid;
    }

    @Nullable
    public final String getSpecUrn() {
        return this.specUrn;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.did;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.model;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.pid)) * 31;
        String str4 = this.mac;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.specUrn;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.token;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.desc;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isOnline;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.extraJson;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void initFromDevice(@NotNull Device device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.did = device.did;
        this.name = device.name;
        this.model = device.model;
        this.pid = device.pid;
        this.mac = device.mac;
        this.specUrn = device.specUrn;
        this.token = device.token;
        this.isOnline = Boolean.valueOf(device.isOnline);
        this.extraJson = device.getExtra().toString();
    }

    @Nullable
    public final Boolean isOnline() {
        return this.isOnline;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDid(@Nullable String str) {
        this.did = str;
    }

    public final void setExtraJson(@Nullable String str) {
        this.extraJson = str;
    }

    public final void setMac(@Nullable String str) {
        this.mac = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOnline(@Nullable Boolean bool) {
        this.isOnline = bool;
    }

    public final void setPid(int i) {
        this.pid = i;
    }

    public final void setSpecUrn(@Nullable String str) {
        this.specUrn = str;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    @NotNull
    public String toString() {
        return "SmartDeviceInfo(did=" + ((Object) this.did) + ", name=" + ((Object) this.name) + ", model=" + ((Object) this.model) + ", pid=" + this.pid + ", mac=" + ((Object) this.mac) + ", specUrn=" + ((Object) this.specUrn) + ", token=" + ((Object) this.token) + ", desc=" + ((Object) this.desc) + ", isOnline=" + this.isOnline + ", extraJson=" + ((Object) this.extraJson) + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.did);
        parcel.writeString(this.name);
        parcel.writeString(this.model);
        parcel.writeInt(this.pid);
        parcel.writeString(this.mac);
        parcel.writeString(this.specUrn);
        parcel.writeString(this.token);
        parcel.writeString(this.desc);
        Boolean bool = this.isOnline;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.extraJson);
    }

    public SmartDeviceInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable String str8) {
        this.did = str;
        this.name = str2;
        this.model = str3;
        this.pid = i;
        this.mac = str4;
        this.specUrn = str5;
        this.token = str6;
        this.desc = str7;
        this.isOnline = bool;
        this.extraJson = str8;
    }

    public /* synthetic */ SmartDeviceInfo(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, Boolean bool, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? Boolean.FALSE : bool, (i2 & 512) == 0 ? str8 : null);
    }
}
