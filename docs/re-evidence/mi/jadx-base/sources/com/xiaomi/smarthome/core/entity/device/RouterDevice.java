package com.xiaomi.smarthome.core.entity.device;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class RouterDevice extends MiioDevice {
    public static final Parcelable.Creator<RouterDevice> CREATOR = new Parcelable.Creator<RouterDevice>() { // from class: com.xiaomi.smarthome.core.entity.device.RouterDevice.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RouterDevice createFromParcel(Parcel parcel) {
            return new RouterDevice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RouterDevice[] newArray(int i) {
            return new RouterDevice[i];
        }
    };

    public RouterDevice(Parcel parcel) {
        super(parcel);
    }

    public RouterDevice() {
    }
}
