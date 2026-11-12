package com.xiaomi.eco.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u0001:\u0002:;Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010(\u001a\u00020\rJ\u0006\u0010)\u001a\u00020\rJ\u0006\u0010*\u001a\u00020\rJ\u0006\u0010+\u001a\u00020\rJ\u0006\u0010,\u001a\u00020\rJ\u0006\u0010-\u001a\u00020\rJ\u0006\u0010.\u001a\u00020\rJ\u0006\u0010/\u001a\u00020\rJ\u0006\u00100\u001a\u00020\rJ\u0006\u00101\u001a\u00020\rJ\u0006\u00102\u001a\u00020\rJ\u0006\u00103\u001a\u00020\rJ\u0006\u00104\u001a\u00020\u0006J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006<"}, d2 = {"Lcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo;", "Landroid/os/Parcelable;", "mac", "", "mode", "type", "", "did", "productName", "accessType", "privateUUID", "Lcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo$PrivateUUID;", "requestBond", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo$PrivateUUID;Z)V", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "getMode", "setMode", "getType", "()I", "setType", "(I)V", "getDid", "setDid", "getProductName", "setProductName", "getAccessType", "setAccessType", "getPrivateUUID", "()Lcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo$PrivateUUID;", "setPrivateUUID", "(Lcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo$PrivateUUID;)V", "getRequestBond", "()Z", "setRequestBond", "(Z)V", "isWearOs", "isDualWatch", "isDualBand", "isDual", "isBle", "isHuaMi", "isBleWatch", "isEcg", "isBleBand", "isBand", "isWatch", "isLocalBindMode", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PrivateUUID", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoConnectDeviceInfo implements Parcelable {
    public static final int TYPE_BLE_BAND = 3;
    public static final int TYPE_BLE_ECG = 4;
    public static final int TYPE_BLE_WATCH = 2;
    public static final int TYPE_DUAL_BAND = 7;
    public static final int TYPE_DUAL_WATCH = 6;
    public static final int TYPE_HUAMI = 5;
    public static final int TYPE_WEAROS = 1;
    private int accessType;

    @Nullable
    private String did;

    @Nullable
    private String mac;

    @Nullable
    private String mode;

    @Nullable
    private PrivateUUID privateUUID;

    @Nullable
    private String productName;
    private boolean requestBond;
    private int type;

    @NotNull
    public static final Parcelable.Creator<EcoConnectDeviceInfo> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EcoConnectDeviceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EcoConnectDeviceInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EcoConnectDeviceInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : PrivateUUID.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EcoConnectDeviceInfo[] newArray(int i) {
            return new EcoConnectDeviceInfo[i];
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006&"}, d2 = {"Lcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo$PrivateUUID;", "Landroid/os/Parcelable;", "service", "", "protoTX", "protoRX", "fitness", "voice", "mass", "otaTX", "otaRX", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getService", "()Ljava/lang/String;", "setService", "(Ljava/lang/String;)V", "getProtoTX", "setProtoTX", "getProtoRX", "setProtoRX", "getFitness", "setFitness", "getVoice", "setVoice", "getMass", "setMass", "getOtaTX", "setOtaTX", "getOtaRX", "setOtaRX", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PrivateUUID implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PrivateUUID> CREATOR = new Creator();

        @Nullable
        private String fitness;

        @Nullable
        private String mass;

        @Nullable
        private String otaRX;

        @Nullable
        private String otaTX;

        @Nullable
        private String protoRX;

        @Nullable
        private String protoTX;

        @Nullable
        private String service;

        @Nullable
        private String voice;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrivateUUID> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrivateUUID createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrivateUUID(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrivateUUID[] newArray(int i) {
                return new PrivateUUID[i];
            }
        }

        public PrivateUUID() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final String getFitness() {
            return this.fitness;
        }

        @Nullable
        public final String getMass() {
            return this.mass;
        }

        @Nullable
        public final String getOtaRX() {
            return this.otaRX;
        }

        @Nullable
        public final String getOtaTX() {
            return this.otaTX;
        }

        @Nullable
        public final String getProtoRX() {
            return this.protoRX;
        }

        @Nullable
        public final String getProtoTX() {
            return this.protoTX;
        }

        @Nullable
        public final String getService() {
            return this.service;
        }

        @Nullable
        public final String getVoice() {
            return this.voice;
        }

        public final void setFitness(@Nullable String str) {
            this.fitness = str;
        }

        public final void setMass(@Nullable String str) {
            this.mass = str;
        }

        public final void setOtaRX(@Nullable String str) {
            this.otaRX = str;
        }

        public final void setOtaTX(@Nullable String str) {
            this.otaTX = str;
        }

        public final void setProtoRX(@Nullable String str) {
            this.protoRX = str;
        }

        public final void setProtoTX(@Nullable String str) {
            this.protoTX = str;
        }

        public final void setService(@Nullable String str) {
            this.service = str;
        }

        public final void setVoice(@Nullable String str) {
            this.voice = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.service);
            dest.writeString(this.protoTX);
            dest.writeString(this.protoRX);
            dest.writeString(this.fitness);
            dest.writeString(this.voice);
            dest.writeString(this.mass);
            dest.writeString(this.otaTX);
            dest.writeString(this.otaRX);
        }

        public PrivateUUID(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
            this.service = str;
            this.protoTX = str2;
            this.protoRX = str3;
            this.fitness = str4;
            this.voice = str5;
            this.mass = str6;
            this.otaTX = str7;
            this.otaRX = str8;
        }

        public /* synthetic */ PrivateUUID(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
        }
    }

    public EcoConnectDeviceInfo() {
        this(null, null, 0, null, null, 0, null, false, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getAccessType() {
        return this.accessType;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    public final String getMode() {
        return this.mode;
    }

    @Nullable
    public final PrivateUUID getPrivateUUID() {
        return this.privateUUID;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    public final boolean getRequestBond() {
        return this.requestBond;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isBand() {
        return isBleBand() || isHuaMi() || isDualBand();
    }

    public final boolean isBle() {
        return isBleBand() || isBleWatch() || isEcg();
    }

    public final boolean isBleBand() {
        return this.type == 3;
    }

    public final boolean isBleWatch() {
        return this.type == 2;
    }

    public final boolean isDual() {
        int i = this.type;
        return i == 6 || i == 7;
    }

    public final boolean isDualBand() {
        return this.type == 7;
    }

    public final boolean isDualWatch() {
        return this.type == 6;
    }

    public final boolean isEcg() {
        return this.type == 4;
    }

    public final boolean isHuaMi() {
        return this.type == 5;
    }

    public final boolean isLocalBindMode() {
        return this.accessType == 1;
    }

    public final boolean isWatch() {
        return isBleWatch() || isWearOs() || isDualWatch();
    }

    public final boolean isWearOs() {
        return this.type == 1;
    }

    public final void setAccessType(int i) {
        this.accessType = i;
    }

    public final void setDid(@Nullable String str) {
        this.did = str;
    }

    public final void setMac(@Nullable String str) {
        this.mac = str;
    }

    public final void setMode(@Nullable String str) {
        this.mode = str;
    }

    public final void setPrivateUUID(@Nullable PrivateUUID privateUUID) {
        this.privateUUID = privateUUID;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setRequestBond(boolean z) {
        this.requestBond = z;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.mac);
        dest.writeString(this.mode);
        dest.writeInt(this.type);
        dest.writeString(this.did);
        dest.writeString(this.productName);
        dest.writeInt(this.accessType);
        PrivateUUID privateUUID = this.privateUUID;
        if (privateUUID == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            privateUUID.writeToParcel(dest, flags);
        }
        dest.writeInt(this.requestBond ? 1 : 0);
    }

    public EcoConnectDeviceInfo(@Nullable String str, @Nullable String str2, int i, @Nullable String str3, @Nullable String str4, int i2, @Nullable PrivateUUID privateUUID, boolean z) {
        this.mac = str;
        this.mode = str2;
        this.type = i;
        this.did = str3;
        this.productName = str4;
        this.accessType = i2;
        this.privateUUID = privateUUID;
        this.requestBond = z;
    }

    public /* synthetic */ EcoConnectDeviceInfo(String str, String str2, int i, String str3, String str4, int i2, PrivateUUID privateUUID, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) == 0 ? i2 : -1, (i3 & 64) == 0 ? privateUUID : null, (i3 & 128) != 0 ? false : z);
    }
}
