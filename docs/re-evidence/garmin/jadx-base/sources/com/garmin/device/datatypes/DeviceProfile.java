package com.garmin.device.datatypes;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gfdi.configuration.Configuration;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import rs2.c;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class DeviceProfile implements Parcelable, c {
    public static final Parcelable.Creator<DeviceProfile> CREATOR = new Parcelable.Creator<DeviceProfile>() { // from class: com.garmin.device.datatypes.DeviceProfile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceProfile createFromParcel(Parcel parcel) {
            return new DeviceProfile(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceProfile[] newArray(int i14) {
            return new DeviceProfile[i14];
        }
    };
    private int bluetoothLimitation;
    private final Set<Integer> configuration;
    private final int connectionType;
    private final String deviceName;
    private final String dualPairingMacAddress;
    private final String macAddress;
    private final int productNumber;
    private final int softwareVersion;
    private final boolean supportsMultiLink;
    private final long unitId;

    public DeviceProfile(Parcel parcel) {
        this.unitId = parcel.readLong();
        this.productNumber = parcel.readInt();
        this.deviceName = parcel.readString();
        this.softwareVersion = parcel.readInt();
        this.macAddress = parcel.readString();
        this.connectionType = parcel.readInt();
        this.dualPairingMacAddress = parcel.readString();
        this.supportsMultiLink = parcel.readByte() != 0;
        int i14 = parcel.readInt();
        int[] iArr = new int[i14];
        parcel.readIntArray(iArr);
        HashSet hashSet = new HashSet();
        for (int i15 = 0; i15 < i14; i15++) {
            hashSet.add(Integer.valueOf(iArr[i15]));
        }
        this.configuration = hashSet;
        this.bluetoothLimitation = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getBleMacAddress */
    public String getF172501i() {
        return getConnectionType() == 1 ? this.macAddress : this.dualPairingMacAddress;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getBluetoothLimitation */
    public int getF172499g() {
        return this.bluetoothLimitation;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getBtcMacAddress */
    public String getF172502j() {
        return getConnectionType() == 2 ? this.macAddress : this.dualPairingMacAddress;
    }

    @Deprecated
    public Configuration getConfiguration() {
        return new Configuration(this.configuration);
    }

    @Override // rs2.c
    public Set<Integer> getConfigurationFlags() {
        return Collections.unmodifiableSet(this.configuration);
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getConnectionId */
    public String getF172493a() {
        return getMacAddress();
    }

    public int getConnectionType() {
        return this.connectionType;
    }

    public String getDeviceFullName() {
        return getF172496d();
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getDeviceName */
    public String getF172496d() {
        return this.deviceName;
    }

    public String getDualPairingMacAddress() {
        return this.dualPairingMacAddress;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getProductNumber */
    public int getF172495c() {
        return this.productNumber;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getSoftwareVersion */
    public int getF172497e() {
        return this.softwareVersion;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getUnitId */
    public long getF172494b() {
        return this.unitId;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: isDualBluetoothConnection */
    public boolean getF172498f() {
        return this.dualPairingMacAddress != null;
    }

    public boolean isMultiLinkSupported() {
        return this.supportsMultiLink;
    }

    public String toString() {
        return "RemoteDeviceProfile:\n  unitId:" + getF172494b() + "\n  productNumber:" + getF172495c() + "\n  deviceName:" + getF172496d() + "\n  softwareVersion:" + getF172497e() + "\n  dualBluetoothConnection:" + getF172498f() + "\n";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(getF172494b());
        parcel.writeInt(getF172495c());
        parcel.writeString(getF172496d());
        parcel.writeInt(getF172497e());
        parcel.writeString(getMacAddress());
        parcel.writeInt(getConnectionType());
        parcel.writeString(getDualPairingMacAddress());
        parcel.writeByte(this.supportsMultiLink ? (byte) 1 : (byte) 0);
        int size = this.configuration.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = this.configuration.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            iArr[i15] = it.next().intValue();
            i15++;
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeInt(getF172499g());
    }

    public DeviceProfile(long j8, int i14, String str, int i15, String str2, int i16, Set<Integer> set, String str3, boolean z14, int i17) {
        if (str2 != null) {
            this.unitId = j8;
            this.productNumber = i14;
            this.deviceName = str;
            this.softwareVersion = i15;
            this.macAddress = str2;
            this.connectionType = i16;
            this.configuration = new HashSet(set);
            this.dualPairingMacAddress = str3;
            this.supportsMultiLink = z14;
            this.bluetoothLimitation = i17;
            return;
        }
        h.s("macAddress is null");
        throw null;
    }

    public DeviceProfile(DeviceProfile deviceProfile, Set<Integer> set) {
        this(deviceProfile.getF172494b(), deviceProfile.getF172495c(), deviceProfile.getF172496d(), deviceProfile.getF172497e(), deviceProfile.getMacAddress(), deviceProfile.getConnectionType(), set == null ? deviceProfile.getConfigurationFlags() : set, deviceProfile.getDualPairingMacAddress(), deviceProfile.isMultiLinkSupported(), deviceProfile.getF172499g());
    }
}
