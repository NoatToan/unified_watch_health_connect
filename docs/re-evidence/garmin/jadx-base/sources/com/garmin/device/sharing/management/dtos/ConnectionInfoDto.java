package com.garmin.device.sharing.management.dtos;

import android.os.Parcel;
import android.os.Parcelable;
import fn2.a;
import i63.c;
import i63.h;
import l63.d;
import m63.k1;
import m63.u1;
import n63.b;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J<\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b.\u0010(J \u00102\u001a\u00020\u00152\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00104\u0012\u0004\b9\u00107\u001a\u0004\b8\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010:\u0012\u0004\b<\u00107\u001a\u0004\b;\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010=\u0012\u0004\b?\u00107\u001a\u0004\b>\u0010#¨\u0006B"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto;", "Landroid/os/Parcelable;", "", "macAddress", "capabilitiesBase64", "Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;", "bondingInfo", "Lcom/garmin/device/sharing/management/dtos/BluetoothConnectionType;", "connectionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;Lcom/garmin/device/sharing/management/dtos/BluetoothConnectionType;)V", "", "seen1", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;Lcom/garmin/device/sharing/management/dtos/BluetoothConnectionType;Lm63/u1;)V", "self", "Ll63/d;", "output", "Lk63/e;", "serialDesc", "", "write$Self$shared_device_management_release", "(Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto;Ll63/d;Lk63/e;)V", "write$Self", "", "getCapabilities", "()[B", "toJSON", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;", "component4", "()Lcom/garmin/device/sharing/management/dtos/BluetoothConnectionType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;Lcom/garmin/device/sharing/management/dtos/BluetoothConnectionType;)Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMacAddress", "getMacAddress$annotations", "()V", "getCapabilitiesBase64", "getCapabilitiesBase64$annotations", "Lcom/garmin/device/sharing/management/dtos/GarminBondingInfo;", "getBondingInfo", "getBondingInfo$annotations", "Lcom/garmin/device/sharing/management/dtos/BluetoothConnectionType;", "getConnectionType", "getConnectionType$annotations", "Companion", "$serializer", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h
public final /* data */ class ConnectionInfoDto implements Parcelable {
    private final GarminBondingInfo bondingInfo;
    private final String capabilitiesBase64;
    private final BluetoothConnectionType connectionType;
    private final String macAddress;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConnectionInfoDto> CREATOR = new Creator();
    private static final c<Object>[] $childSerializers = {null, null, null, BluetoothConnectionType.INSTANCE.serializer()};

    @e
    public /* synthetic */ ConnectionInfoDto(int i14, String str, String str2, GarminBondingInfo garminBondingInfo, BluetoothConnectionType bluetoothConnectionType, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, ConnectionInfoDto$$serializer.INSTANCE.getF158591b());
            throw null;
        }
        this.macAddress = str;
        this.capabilitiesBase64 = str2;
        this.bondingInfo = garminBondingInfo;
        if ((i14 & 8) == 0) {
            this.connectionType = null;
        } else {
            this.connectionType = bluetoothConnectionType;
        }
    }

    public static /* synthetic */ ConnectionInfoDto copy$default(ConnectionInfoDto connectionInfoDto, String str, String str2, GarminBondingInfo garminBondingInfo, BluetoothConnectionType bluetoothConnectionType, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = connectionInfoDto.macAddress;
        }
        if ((i14 & 2) != 0) {
            str2 = connectionInfoDto.capabilitiesBase64;
        }
        if ((i14 & 4) != 0) {
            garminBondingInfo = connectionInfoDto.bondingInfo;
        }
        if ((i14 & 8) != 0) {
            bluetoothConnectionType = connectionInfoDto.connectionType;
        }
        return connectionInfoDto.copy(str, str2, garminBondingInfo, bluetoothConnectionType);
    }

    public static /* synthetic */ void getBondingInfo$annotations() {
    }

    public static /* synthetic */ void getCapabilitiesBase64$annotations() {
    }

    public static /* synthetic */ void getConnectionType$annotations() {
    }

    public static /* synthetic */ void getMacAddress$annotations() {
    }

    public static final /* synthetic */ void write$Self$shared_device_management_release(ConnectionInfoDto self, d output, k63.e serialDesc) {
        c<Object>[] cVarArr = $childSerializers;
        output.k(serialDesc, 0, self.macAddress);
        output.k(serialDesc, 1, self.capabilitiesBase64);
        output.d(serialDesc, 2, GarminBondingInfo$$serializer.INSTANCE, self.bondingInfo);
        if (!output.C(serialDesc) && self.connectionType == null) {
            return;
        }
        output.d(serialDesc, 3, cVarArr[3], self.connectionType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCapabilitiesBase64() {
        return this.capabilitiesBase64;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GarminBondingInfo getBondingInfo() {
        return this.bondingInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BluetoothConnectionType getConnectionType() {
        return this.connectionType;
    }

    public final ConnectionInfoDto copy(String macAddress, String capabilitiesBase64, GarminBondingInfo bondingInfo, BluetoothConnectionType connectionType) {
        macAddress.getClass();
        capabilitiesBase64.getClass();
        return new ConnectionInfoDto(macAddress, capabilitiesBase64, bondingInfo, connectionType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionInfoDto)) {
            return false;
        }
        ConnectionInfoDto connectionInfoDto = (ConnectionInfoDto) other;
        return s.g(this.macAddress, connectionInfoDto.macAddress) && s.g(this.capabilitiesBase64, connectionInfoDto.capabilitiesBase64) && s.g(this.bondingInfo, connectionInfoDto.bondingInfo) && this.connectionType == connectionInfoDto.connectionType;
    }

    public final GarminBondingInfo getBondingInfo() {
        return this.bondingInfo;
    }

    public final byte[] getCapabilities() {
        a aVar = a.f72254a;
        String str = this.capabilitiesBase64;
        aVar.getClass();
        return a.a(str);
    }

    public final String getCapabilitiesBase64() {
        return this.capabilitiesBase64;
    }

    public final BluetoothConnectionType getConnectionType() {
        return this.connectionType;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public int hashCode() {
        int iJ = g.j(this.macAddress.hashCode() * 31, 31, this.capabilitiesBase64);
        GarminBondingInfo garminBondingInfo = this.bondingInfo;
        int iHashCode = (iJ + (garminBondingInfo == null ? 0 : garminBondingInfo.hashCode())) * 31;
        BluetoothConnectionType bluetoothConnectionType = this.connectionType;
        return iHashCode + (bluetoothConnectionType != null ? bluetoothConnectionType.hashCode() : 0);
    }

    public final String toJSON() {
        b.a aVar = b.f123892d;
        aVar.getClass();
        return aVar.b(INSTANCE.serializer(), this);
    }

    public String toString() {
        String str = this.macAddress;
        String str2 = this.capabilitiesBase64;
        GarminBondingInfo garminBondingInfo = this.bondingInfo;
        BluetoothConnectionType bluetoothConnectionType = this.connectionType;
        StringBuilder sbI = p6.b.i("ConnectionInfoDto(macAddress=", str, ", capabilitiesBase64=", str2, ", bondingInfo=");
        sbI.append(garminBondingInfo);
        sbI.append(", connectionType=");
        sbI.append(bluetoothConnectionType);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.macAddress);
        parcel.writeString(this.capabilitiesBase64);
        GarminBondingInfo garminBondingInfo = this.bondingInfo;
        if (garminBondingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            garminBondingInfo.writeToParcel(parcel, flags);
        }
        BluetoothConnectionType bluetoothConnectionType = this.connectionType;
        if (bluetoothConnectionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bluetoothConnectionType.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto;", "serializer", "()Li63/c;", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final c<ConnectionInfoDto> serializer() {
            return ConnectionInfoDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConnectionInfoDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectionInfoDto createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ConnectionInfoDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GarminBondingInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BluetoothConnectionType.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectionInfoDto[] newArray(int i14) {
            return new ConnectionInfoDto[i14];
        }
    }

    public ConnectionInfoDto(String str, String str2, GarminBondingInfo garminBondingInfo, BluetoothConnectionType bluetoothConnectionType) {
        str.getClass();
        str2.getClass();
        this.macAddress = str;
        this.capabilitiesBase64 = str2;
        this.bondingInfo = garminBondingInfo;
        this.connectionType = bluetoothConnectionType;
    }

    public /* synthetic */ ConnectionInfoDto(String str, String str2, GarminBondingInfo garminBondingInfo, BluetoothConnectionType bluetoothConnectionType, int i14, j jVar) {
        this(str, str2, garminBondingInfo, (i14 & 8) != 0 ? null : bluetoothConnectionType);
    }
}
