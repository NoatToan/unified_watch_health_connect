package com.xiaomi.smarthome.plugin.update;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class InstallPluginResult implements Parcelable {
    public static final Parcelable.Creator<InstallPluginResult> CREATOR = new Parcelable.Creator<InstallPluginResult>() { // from class: com.xiaomi.smarthome.plugin.update.InstallPluginResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstallPluginResult createFromParcel(Parcel parcel) {
            return new InstallPluginResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstallPluginResult[] newArray(int i) {
            return new InstallPluginResult[i];
        }
    };
    public static final int SUCCESS_ON_CANCEL = 4;
    public static final int SUCCESS_ON_START = 1;
    public static final int SUCCESS_ON_SUCCESS = 2;
    public int flag;
    public String model;

    public InstallPluginResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.flag);
        parcel.writeString(this.model);
    }

    public InstallPluginResult(Parcel parcel) {
        this.flag = parcel.readInt();
        this.model = parcel.readString();
    }
}
