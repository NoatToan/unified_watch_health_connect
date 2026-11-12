package com.xiaomi.smarthome.core.server.internal.bluetooth.security;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;

/* JADX INFO: loaded from: classes10.dex */
public class SecureConnectOptions implements Parcelable {
    public static final Parcelable.Creator<SecureConnectOptions> CREATOR = new Parcelable.Creator<SecureConnectOptions>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.SecureConnectOptions.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SecureConnectOptions createFromParcel(Parcel parcel) {
            return new SecureConnectOptions(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SecureConnectOptions[] newArray(int i) {
            return new SecureConnectOptions[i];
        }
    };
    private BleConnectOptions connectOptions;

    public static class Builder {
        private BleConnectOptions connectOptions;

        public SecureConnectOptions build() {
            SecureConnectOptions secureConnectOptions = new SecureConnectOptions();
            secureConnectOptions.setConnectOptions(this.connectOptions);
            return secureConnectOptions;
        }

        public Builder setConnectOptions(BleConnectOptions bleConnectOptions) {
            this.connectOptions = bleConnectOptions;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectOptions(BleConnectOptions bleConnectOptions) {
        this.connectOptions = bleConnectOptions;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BleConnectOptions getConnectOptions() {
        return this.connectOptions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.connectOptions, i);
    }

    private SecureConnectOptions() {
    }

    public SecureConnectOptions(Parcel parcel) {
        this.connectOptions = (BleConnectOptions) parcel.readParcelable(BleConnectOptions.class.getClassLoader());
    }
}
