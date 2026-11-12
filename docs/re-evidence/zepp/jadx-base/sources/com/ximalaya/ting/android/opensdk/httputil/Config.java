package com.ximalaya.ting.android.opensdk.httputil;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class Config implements Parcelable {
    public static final Parcelable.Creator<Config> CREATOR = new Parcelable.Creator<Config>() { // from class: com.ximalaya.ting.android.opensdk.httputil.Config.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Config createFromParcel(Parcel parcel) {
            return new Config(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Config[] newArray(int i) {
            return new Config[i];
        }
    };
    public static final String METHOD_GET = "GET";
    public static final String METHOD_HEAD = "HEAD";
    public static final String METHOD_POST = "POST";
    public String authorization;
    public int httpsProxyPort;
    public String proxyHost;
    public int proxyPort;
    public boolean useProxy = false;
    public boolean useCache = true;
    public int connectionTimeOut = 10000;
    public int readTimeOut = 10000;
    public int writeTimeOut = 10000;
    public String method = "GET";
    public Map<String, String> property = new HashMap();
    public int proxyType = -1;

    public Config() {
    }

    public static Config getDownloadConfig(Config config) {
        if (config == null) {
            config = new Config();
        }
        config.connectionTimeOut = 30000;
        config.readTimeOut = 30000;
        return config;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.useProxy = parcel.readByte() != 0;
        this.useCache = parcel.readByte() != 0;
        this.proxyHost = parcel.readString();
        this.proxyPort = parcel.readInt();
        this.httpsProxyPort = parcel.readInt();
        this.authorization = parcel.readString();
        this.connectionTimeOut = parcel.readInt();
        this.readTimeOut = parcel.readInt();
        this.writeTimeOut = parcel.readInt();
        this.method = parcel.readString();
        int i = parcel.readInt();
        this.property = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.property.put(parcel.readString(), parcel.readString());
        }
        this.proxyType = parcel.readInt();
    }

    public String toString() {
        return "Config{useProxy=" + this.useProxy + ", useCache=" + this.useCache + ", proxyHost='" + this.proxyHost + "', proxyPort=" + this.proxyPort + ", httpsProxyPort=" + this.httpsProxyPort + ", authorization='" + this.authorization + "', connectionTimeOut=" + this.connectionTimeOut + ", readTimeOut=" + this.readTimeOut + ", writeTimeOut=" + this.writeTimeOut + ", method='" + this.method + "', property=" + this.property + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.useProxy ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useCache ? (byte) 1 : (byte) 0);
        parcel.writeString(this.proxyHost);
        parcel.writeInt(this.proxyPort);
        parcel.writeInt(this.httpsProxyPort);
        parcel.writeString(this.authorization);
        parcel.writeInt(this.connectionTimeOut);
        parcel.writeInt(this.readTimeOut);
        parcel.writeInt(this.writeTimeOut);
        parcel.writeString(this.method);
        parcel.writeInt(this.property.size());
        for (Map.Entry<String, String> entry : this.property.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeInt(this.proxyType);
    }

    public Config(Parcel parcel) {
        readFromParcel(parcel);
    }
}
