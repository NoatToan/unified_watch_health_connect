package com.garmin.device.sharing.management.dtos;

import android.os.Parcel;
import android.os.Parcelable;
import i63.c;
import i63.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import l63.d;
import m63.e;
import m63.k1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010+\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001a¨\u00066"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/DeviceConnectionInfoDto;", "Landroid/os/Parcelable;", "", "deviceId", "", "Lcom/garmin/device/sharing/management/dtos/ConnectionInfoDto;", "bluetoothConnections", "<init>", "(JLjava/util/List;)V", "", "seen1", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/util/List;Lm63/u1;)V", "self", "Ll63/d;", "output", "Lk63/e;", "serialDesc", "", "write$Self$shared_device_management_release", "(Lcom/garmin/device/sharing/management/dtos/DeviceConnectionInfoDto;Ll63/d;Lk63/e;)V", "write$Self", "component1", "()J", "component2", "()Ljava/util/List;", "copy", "(JLjava/util/List;)Lcom/garmin/device/sharing/management/dtos/DeviceConnectionInfoDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getDeviceId", "getDeviceId$annotations", "()V", "Ljava/util/List;", "getBluetoothConnections", "getBluetoothConnections$annotations", "Companion", "$serializer", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h
public final /* data */ class DeviceConnectionInfoDto implements Parcelable {
    private final List<ConnectionInfoDto> bluetoothConnections;
    private final long deviceId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DeviceConnectionInfoDto> CREATOR = new Creator();
    private static final c<Object>[] $childSerializers = {null, new e(ConnectionInfoDto$$serializer.INSTANCE)};

    @o13.e
    public /* synthetic */ DeviceConnectionInfoDto(int i14, long j8, List list, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, DeviceConnectionInfoDto$$serializer.INSTANCE.getF94809a());
            throw null;
        }
        this.deviceId = j8;
        this.bluetoothConnections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceConnectionInfoDto copy$default(DeviceConnectionInfoDto deviceConnectionInfoDto, long j8, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = deviceConnectionInfoDto.deviceId;
        }
        if ((i14 & 2) != 0) {
            list = deviceConnectionInfoDto.bluetoothConnections;
        }
        return deviceConnectionInfoDto.copy(j8, list);
    }

    public static /* synthetic */ void getBluetoothConnections$annotations() {
    }

    public static /* synthetic */ void getDeviceId$annotations() {
    }

    public static final /* synthetic */ void write$Self$shared_device_management_release(DeviceConnectionInfoDto self, d output, k63.e serialDesc) {
        c<Object>[] cVarArr = $childSerializers;
        output.z(serialDesc, 0, self.deviceId);
        output.e(serialDesc, 1, cVarArr[1], self.bluetoothConnections);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDeviceId() {
        return this.deviceId;
    }

    public final List<ConnectionInfoDto> component2() {
        return this.bluetoothConnections;
    }

    public final DeviceConnectionInfoDto copy(long deviceId, List<ConnectionInfoDto> bluetoothConnections) {
        bluetoothConnections.getClass();
        return new DeviceConnectionInfoDto(deviceId, bluetoothConnections);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceConnectionInfoDto)) {
            return false;
        }
        DeviceConnectionInfoDto deviceConnectionInfoDto = (DeviceConnectionInfoDto) other;
        return this.deviceId == deviceConnectionInfoDto.deviceId && s.g(this.bluetoothConnections, deviceConnectionInfoDto.bluetoothConnections);
    }

    public final List<ConnectionInfoDto> getBluetoothConnections() {
        return this.bluetoothConnections;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return this.bluetoothConnections.hashCode() + (Long.hashCode(this.deviceId) * 31);
    }

    public String toString() {
        return "DeviceConnectionInfoDto(deviceId=" + this.deviceId + ", bluetoothConnections=" + this.bluetoothConnections + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeLong(this.deviceId);
        Iterator itE = f.e(this.bluetoothConnections, parcel);
        while (itE.hasNext()) {
            ((ConnectionInfoDto) itE.next()).writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/DeviceConnectionInfoDto$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/device/sharing/management/dtos/DeviceConnectionInfoDto;", "serializer", "()Li63/c;", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final c<DeviceConnectionInfoDto> serializer() {
            return DeviceConnectionInfoDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeviceConnectionInfoDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceConnectionInfoDto createFromParcel(Parcel parcel) {
            parcel.getClass();
            long j8 = parcel.readLong();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = f.a(ConnectionInfoDto.CREATOR, parcel, arrayList, iA, 1);
            }
            return new DeviceConnectionInfoDto(j8, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceConnectionInfoDto[] newArray(int i14) {
            return new DeviceConnectionInfoDto[i14];
        }
    }

    public DeviceConnectionInfoDto(long j8, List<ConnectionInfoDto> list) {
        list.getClass();
        this.deviceId = j8;
        this.bluetoothConnections = list;
    }
}
