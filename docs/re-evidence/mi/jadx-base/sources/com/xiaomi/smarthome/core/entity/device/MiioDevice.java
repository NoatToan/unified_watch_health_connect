package com.xiaomi.smarthome.core.entity.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.device.Device;

/* JADX INFO: loaded from: classes10.dex */
public class MiioDevice extends Device {
    public static final Parcelable.Creator<MiioDevice> CREATOR = new Parcelable.Creator<MiioDevice>() { // from class: com.xiaomi.smarthome.core.entity.device.MiioDevice.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiioDevice createFromParcel(Parcel parcel) {
            return new MiioDevice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiioDevice[] newArray(int i) {
            return new MiioDevice[i];
        }
    };
    private boolean mIsFactory;

    public MiioDevice(Parcel parcel) {
        super(parcel);
        this.mIsFactory = false;
        this.mIsFactory = parcel.readInt() == 1;
    }

    public synchronized boolean isFactory() {
        return this.mIsFactory;
    }

    public synchronized void toggleFactory(boolean z) {
        this.mIsFactory = z;
    }

    @Override // com.xiaomi.smarthome.device.Device, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.mIsFactory ? 1 : 0);
    }

    public MiioDevice() {
        this.mIsFactory = false;
    }

    public MiioDevice(String str, String str2) {
        super(str, str2);
        this.mIsFactory = false;
    }
}
