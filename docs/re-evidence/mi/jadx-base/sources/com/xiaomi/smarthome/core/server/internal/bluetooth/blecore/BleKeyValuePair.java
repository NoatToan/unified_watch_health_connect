package com.xiaomi.smarthome.core.server.internal.bluetooth.blecore;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class BleKeyValuePair implements Parcelable {
    public static final Parcelable.Creator<BleKeyValuePair> CREATOR = new Parcelable.Creator<BleKeyValuePair>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleKeyValuePair.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleKeyValuePair createFromParcel(Parcel parcel) {
            return new BleKeyValuePair(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleKeyValuePair[] newArray(int i) {
            return new BleKeyValuePair[i];
        }
    };
    private final String key;
    private final String value;

    public BleKeyValuePair(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Key may not be null");
        }
        this.key = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return this.key + ":" + this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }

    public BleKeyValuePair(Parcel parcel) {
        this.key = parcel.readString();
        this.value = parcel.readString();
    }
}
