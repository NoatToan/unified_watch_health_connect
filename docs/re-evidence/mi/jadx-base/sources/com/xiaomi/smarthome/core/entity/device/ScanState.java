package com.xiaomi.smarthome.core.entity.device;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public enum ScanState implements Parcelable {
    START_SUCCESS,
    LOAD_CACHE_SUCCESS,
    SYNC_SERVER_SUCCESS,
    SYNC_SERVER_FAILED,
    SCAN_LOCAL_SUCCESS;

    public static final Parcelable.Creator<ScanState> CREATOR = new Parcelable.Creator<ScanState>() { // from class: com.xiaomi.smarthome.core.entity.device.ScanState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScanState createFromParcel(Parcel parcel) {
            return ScanState.values()[parcel.readInt()];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScanState[] newArray(int i) {
            return new ScanState[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
