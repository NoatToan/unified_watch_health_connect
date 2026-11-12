package com.xiaomi.smarthome.core.entity.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.device.Device;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class WatchBandDevice extends Device {
    public static final Parcelable.Creator<WatchBandDevice> CREATOR = new Parcelable.Creator<WatchBandDevice>() { // from class: com.xiaomi.smarthome.core.entity.device.WatchBandDevice.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchBandDevice createFromParcel(Parcel parcel) {
            return new WatchBandDevice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchBandDevice[] newArray(int i) {
            return new WatchBandDevice[i];
        }
    };

    public WatchBandDevice(Parcel parcel) {
        super(parcel);
    }

    @Override // com.xiaomi.smarthome.device.Device, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    @Override // com.xiaomi.smarthome.device.Device
    public void parseFromJSONObject(JSONObject jSONObject) {
        super.parseFromJSONObject(jSONObject);
        toggleOnline(true);
        toggleCanUseNotBind(true);
        setPid(0);
        setOwner(true);
    }

    @Override // com.xiaomi.smarthome.device.Device, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public WatchBandDevice() {
    }
}
