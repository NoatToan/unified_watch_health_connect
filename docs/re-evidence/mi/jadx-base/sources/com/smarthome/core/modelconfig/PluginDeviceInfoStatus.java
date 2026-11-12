package com.smarthome.core.modelconfig;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public enum PluginDeviceInfoStatus implements Parcelable {
    INIT(0),
    WHITE_LIST(1),
    PREVIEW(2),
    RELEASE(3);

    public static final Parcelable.Creator<PluginDeviceInfoStatus> CREATOR = new Parcelable.Creator<PluginDeviceInfoStatus>() { // from class: com.smarthome.core.modelconfig.PluginDeviceInfoStatus.a
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PluginDeviceInfoStatus createFromParcel(Parcel parcel) {
            return PluginDeviceInfoStatus.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PluginDeviceInfoStatus[] newArray(int i) {
            return new PluginDeviceInfoStatus[i];
        }
    };
    private int mValue;

    PluginDeviceInfoStatus(int i) {
        this.mValue = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getValue() {
        return this.mValue;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }

    public static PluginDeviceInfoStatus valueOf(int i) {
        for (PluginDeviceInfoStatus pluginDeviceInfoStatus : values()) {
            if (i == pluginDeviceInfoStatus.getValue()) {
                return pluginDeviceInfoStatus;
            }
        }
        return INIT;
    }
}
