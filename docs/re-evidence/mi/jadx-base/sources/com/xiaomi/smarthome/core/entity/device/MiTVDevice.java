package com.xiaomi.smarthome.core.entity.device;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class MiTVDevice extends MiioDevice {
    public static final Parcelable.Creator<MiTVDevice> CREATOR = new Parcelable.Creator<MiTVDevice>() { // from class: com.xiaomi.smarthome.core.entity.device.MiTVDevice.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiTVDevice createFromParcel(Parcel parcel) {
            return new MiTVDevice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiTVDevice[] newArray(int i) {
            return new MiTVDevice[i];
        }
    };

    public MiTVDevice(Parcel parcel) {
        super(parcel);
    }

    @Override // com.xiaomi.smarthome.device.Device
    public void setShared(boolean z) {
        if (z) {
            setPermitLevel(getPermitLevel() | 4);
        } else {
            setPermitLevel(getPermitLevel() & (-5));
        }
    }

    public MiTVDevice() {
    }
}
