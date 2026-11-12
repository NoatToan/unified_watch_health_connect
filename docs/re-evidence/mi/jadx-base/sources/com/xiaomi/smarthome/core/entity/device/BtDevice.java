package com.xiaomi.smarthome.core.entity.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.DeviceType;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.common.util.ListUtils;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class BtDevice extends Device {
    public static final Parcelable.Creator<BtDevice> CREATOR = new Parcelable.Creator<BtDevice>() { // from class: com.xiaomi.smarthome.core.entity.device.BtDevice.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BtDevice createFromParcel(Parcel parcel) {
            return new BtDevice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BtDevice[] newArray(int i) {
            return new BtDevice[i];
        }
    };
    public static final int OFFLINE = 1;
    public static final int ONLINE = 2;
    public static final int UNKNOWN = 0;
    private int deviceType;
    protected MiotBleAdvPacket packet;
    private byte[] scanRecord;

    public BtDevice(String str) {
        setMac(str);
        setDid(str);
        setPid(6);
    }

    public void cloneFrom(BtDevice btDevice) {
        setName(btDevice.getName());
        setDid(btDevice.getDid());
        setRssi(btDevice.getRssi());
        setScanRecord(btDevice.getScanRecord());
        setDeviceType(btDevice.getDeviceType());
    }

    @Override // com.xiaomi.smarthome.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BtDevice) {
            return getMac().equals(((BtDevice) obj).getMac());
        }
        return false;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public MiotBleAdvPacket getPacket() {
        return this.packet;
    }

    @Override // com.xiaomi.smarthome.device.Device
    public int getPid() {
        return 6;
    }

    public byte[] getScanRecord() {
        return this.scanRecord;
    }

    @Override // com.xiaomi.smarthome.device.Device
    public int hashCode() {
        return getMac().hashCode();
    }

    public boolean isLocalBoundDevice() {
        return DeviceType.isLocalBoundDevice(getModel());
    }

    @Override // com.xiaomi.smarthome.device.Device
    public boolean isSameDevice(Device device) {
        return equals(device);
    }

    public void setBoundStatus(int i) {
        if (i == 0 || i == 1 || i == 2) {
            BluetoothCache.setPropBoundStatus(getMac(), i);
            return;
        }
        BluetoothLog.w("invalid boundStatus " + i);
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    public void setLocalBounded() {
        setBoundStatus(1);
    }

    public void setPacket(MiotBleAdvPacket miotBleAdvPacket) {
        this.packet = miotBleAdvPacket;
    }

    public void setScanRecord(byte[] bArr) {
        this.scanRecord = bArr;
    }

    public boolean shouldLocalRemoved() {
        return getMac().equals(getDid()) || BluetoothCache.getPropBoundStatus(getMac()) != 2;
    }

    @Override // com.xiaomi.smarthome.device.Device
    public String toString() {
        return "BtDevice{name=" + getName() + ", mac=" + getMac() + ", model=" + getModel() + ", did=" + getDid() + ", prop=" + getPropInfo() + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.xiaomi.smarthome.device.Device, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByteArray(this.scanRecord);
        parcel.writeInt(this.deviceType);
        parcel.writeParcelable(this.packet, 0);
    }

    public BtDevice(Device device) {
        setMac(device.getMac());
        setDid(device.getDid());
        setPid(6);
        setName(device.getName());
        setToken(device.getToken());
        setModel(device.getModel());
        setOwner(device.isOwner());
        setOwnerId(device.getOwnerId());
        setPermitLevel(device.getPermitLevel());
        setOwnerName(device.getOwnerName());
        setPropInfo(device.getPropInfo());
        setKeyId(device.getKeyId());
        setNewKeyId(device.getNewKeyId());
        setBleFwVersion(device.getBleFwVersion());
        setLockShareCreateTime(device.getLockShareCreateTime());
    }

    public static String toString(List<Device> list) {
        StringBuilder sb = new StringBuilder();
        if (!ListUtils.isEmpty(list)) {
            Iterator<Device> it = list.iterator();
            while (it.hasNext()) {
                sb.append(String.format("\n>>> %s", it.next().toString()));
            }
        }
        return sb.toString();
    }

    public BtDevice(BluetoothSearchResult bluetoothSearchResult) {
        setName(bluetoothSearchResult.getName());
        setMac(bluetoothSearchResult.getAddress());
        setDid(bluetoothSearchResult.getAddress());
        setRssi(bluetoothSearchResult.getRssi());
        setScanRecord(bluetoothSearchResult.getScanRecord());
        setPid(6);
        setDeviceType(bluetoothSearchResult.getDeviceType());
    }

    public BtDevice(Parcel parcel) {
        super(parcel);
        this.scanRecord = parcel.createByteArray();
        this.deviceType = parcel.readInt();
        this.packet = (MiotBleAdvPacket) parcel.readParcelable(MiotBleAdvPacket.class.getClassLoader());
    }
}
