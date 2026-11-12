package com.xiaomi.smarthome.core.entity.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.device.Device;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceListResult implements Parcelable {
    public static final Parcelable.Creator<DeviceListResult> CREATOR = new Parcelable.Creator<DeviceListResult>() { // from class: com.xiaomi.smarthome.core.entity.device.DeviceListResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceListResult createFromParcel(Parcel parcel) {
            return new DeviceListResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceListResult[] newArray(int i) {
            return new DeviceListResult[i];
        }
    };
    private List<Device> mList;

    public DeviceListResult() {
        this.mList = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public synchronized List<Device> getDeviceList() {
        return this.mList;
    }

    public synchronized void setDeviceList(List<Device> list) {
        this.mList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mList);
    }

    public DeviceListResult(Parcel parcel) {
        this.mList = new ArrayList();
        this.mList = parcel.createTypedArrayList(Device.CREATOR);
    }
}
