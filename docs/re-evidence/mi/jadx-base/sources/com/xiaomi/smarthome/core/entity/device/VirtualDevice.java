package com.xiaomi.smarthome.core.entity.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.device.Device;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class VirtualDevice extends Device {
    public static final Parcelable.Creator<VirtualDevice> CREATOR = new Parcelable.Creator<VirtualDevice>() { // from class: com.xiaomi.smarthome.core.entity.device.VirtualDevice.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VirtualDevice createFromParcel(Parcel parcel) {
            return new VirtualDevice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VirtualDevice[] newArray(int i) {
            return new VirtualDevice[i];
        }
    };
    private int mState;
    private String mUrl;

    public VirtualDevice(Parcel parcel) {
        super(parcel);
        this.mState = parcel.readInt();
        this.mUrl = parcel.readString();
    }

    public synchronized int getState() {
        return this.mState;
    }

    public synchronized String getUrl() {
        return this.mUrl;
    }

    @Override // com.xiaomi.smarthome.device.Device
    public void parseFromJSONObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.parseFromJSONObject(jSONObject);
        this.mState = jSONObject.optInt("state");
        this.mUrl = jSONObject.optString("url");
        toggleCanUseNotBind(true);
        toggleOnline(true);
    }

    @Override // com.xiaomi.smarthome.device.Device, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.mState);
        parcel.writeString(this.mUrl);
    }

    private VirtualDevice() {
    }
}
