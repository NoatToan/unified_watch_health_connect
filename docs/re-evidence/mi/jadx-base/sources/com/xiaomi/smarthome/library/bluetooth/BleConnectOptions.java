package com.xiaomi.smarthome.library.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWifiConfig;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class BleConnectOptions implements Parcelable {
    public static final Parcelable.Creator<BleConnectOptions> CREATOR = new Parcelable.Creator<BleConnectOptions>() { // from class: com.xiaomi.smarthome.library.bluetooth.BleConnectOptions.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleConnectOptions createFromParcel(Parcel parcel) {
            return new BleConnectOptions(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleConnectOptions[] newArray(int i) {
            return new BleConnectOptions[i];
        }
    };
    private BleComboWifiConfig bleComboWifiConfig;
    private int connectRetry;
    private int connectTimeout;
    private boolean noReportBleInfo;
    private String qrcodeOob;
    private int serviceDiscoverRetry;
    private int serviceDiscoverTimeout;

    public static class Builder {
        private static final int DEFAULT_CONNECT_RETRY = 0;
        private static final int DEFAULT_CONNECT_TIMEOUT = 30000;
        private static final int DEFAULT_SERVICE_DISCOVER_RETRY = 1;
        private static final int DEFAULT_SERVICE_DISCOVER_TIMEOUT = 30000;
        private int connectRetry = 0;
        private int serviceDiscoverRetry = 1;
        private int connectTimeout = 30000;
        private int serviceDiscoverTimeout = 30000;
        private boolean noReportBleInfo = false;

        public BleConnectOptions build() {
            return new BleConnectOptions(this);
        }

        public Builder setConnectRetry(int i) {
            this.connectRetry = i;
            return this;
        }

        public Builder setConnectTimeout(int i) {
            this.connectTimeout = i;
            return this;
        }

        public Builder setNoReportBleInfo(boolean z) {
            this.noReportBleInfo = z;
            return this;
        }

        public Builder setServiceDiscoverRetry(int i) {
            this.serviceDiscoverRetry = i;
            return this;
        }

        public Builder setServiceDiscoverTimeout(int i) {
            this.serviceDiscoverTimeout = i;
            return this;
        }
    }

    public BleConnectOptions(Builder builder) {
        this.qrcodeOob = "";
        this.connectRetry = builder.connectRetry;
        this.serviceDiscoverRetry = builder.serviceDiscoverRetry;
        this.connectTimeout = builder.connectTimeout;
        this.serviceDiscoverTimeout = builder.serviceDiscoverTimeout;
        this.noReportBleInfo = builder.noReportBleInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BleComboWifiConfig getBleComboWifiConfig() {
        return this.bleComboWifiConfig;
    }

    public int getConnectRetry() {
        return this.connectRetry;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public String getQrcodeOob() {
        return this.qrcodeOob;
    }

    public int getServiceDiscoverRetry() {
        return this.serviceDiscoverRetry;
    }

    public int getServiceDiscoverTimeout() {
        return this.serviceDiscoverTimeout;
    }

    public boolean isNoReportBleInfo() {
        return this.noReportBleInfo;
    }

    public void setBleComboWifiConfig(BleComboWifiConfig bleComboWifiConfig) {
        this.bleComboWifiConfig = bleComboWifiConfig;
    }

    public void setConnectRetry(int i) {
        this.connectRetry = i;
    }

    public void setConnectTimeout(int i) {
        this.connectTimeout = i;
    }

    public void setNoReportBleInfo(boolean z) {
        this.noReportBleInfo = z;
    }

    public void setQrcodeOob(String str) {
        if (str == null) {
            this.qrcodeOob = "";
        } else {
            this.qrcodeOob = str;
        }
    }

    public void setServiceDiscoverRetry(int i) {
        this.serviceDiscoverRetry = i;
    }

    public void setServiceDiscoverTimeout(int i) {
        this.serviceDiscoverTimeout = i;
    }

    public String toString() {
        return "BleConnectOptions{connectRetry=" + this.connectRetry + ", serviceDiscoverRetry=" + this.serviceDiscoverRetry + ", connectTimeout=" + this.connectTimeout + ", serviceDiscoverTimeout=" + this.serviceDiscoverTimeout + ", noReportBleInfo=" + this.noReportBleInfo + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.connectRetry);
        parcel.writeInt(this.serviceDiscoverRetry);
        parcel.writeInt(this.connectTimeout);
        parcel.writeInt(this.serviceDiscoverTimeout);
        parcel.writeString(this.qrcodeOob);
        parcel.writeParcelable(this.bleComboWifiConfig, i);
        parcel.writeInt(this.noReportBleInfo ? 1 : 0);
    }

    public BleConnectOptions(Parcel parcel) {
        this.qrcodeOob = "";
        this.connectRetry = parcel.readInt();
        this.serviceDiscoverRetry = parcel.readInt();
        this.connectTimeout = parcel.readInt();
        this.serviceDiscoverTimeout = parcel.readInt();
        this.qrcodeOob = parcel.readString();
        this.bleComboWifiConfig = (BleComboWifiConfig) parcel.readParcelable(BleConnectOptions.class.getClassLoader());
        this.noReportBleInfo = parcel.readInt() == 1;
    }
}
